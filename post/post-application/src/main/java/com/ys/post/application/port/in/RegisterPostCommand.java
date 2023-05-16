package com.ys.post.application.port.in;

import com.ys.post.application.common.SelfValidating;
import com.ys.post.domain.CategoryId;
import com.ys.post.domain.Contents;
import com.ys.post.domain.Title;
import lombok.Value;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Value(staticConstructor = "of")
public class RegisterPostCommand extends SelfValidating<RegisterPostCommand> {

    @NotBlank
    CategoryId categoryId;
    @NotBlank
    UserId userId;
    @NotNull
    Title title;
    @NotNull
    Contents contents;

    private RegisterPostCommand(CategoryId categoryId, UserId userId, Title title, Contents contents) {
        this.categoryId = categoryId;
        this.userId = userId;
        this.title = title;
        this.contents = contents;
        validateSelf();
    }
}
