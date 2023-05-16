package com.ys.post.application.port.in;

import com.ys.post.application.common.SelfValidating;
import com.ys.post.domain.Contents;
import com.ys.post.domain.Title;
import com.ys.refs.category.domain.CategoryId;
import com.ys.refs.user.domain.UserId;
import lombok.Value;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Value(staticConstructor = "of")
public class RegisterPostCommand extends SelfValidating<RegisterPostCommand> {

    @Valid @NotNull
    CategoryId categoryId;
    @Valid @NotNull
    UserId userId;
    @Valid @NotNull
    Title title;
    @Valid @NotNull
    Contents contents;

    private RegisterPostCommand(CategoryId categoryId, UserId userId, Title title, Contents contents) {
        this.categoryId = categoryId;
        this.userId = userId;
        this.title = title;
        this.contents = contents;
        validateSelf();
    }
}
