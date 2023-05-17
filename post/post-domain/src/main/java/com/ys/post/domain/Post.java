package com.ys.post.domain;

import com.fasterxml.uuid.Generators;
import com.ys.post.common.SelfValidating;
import com.ys.refs.category.domain.CategoryId;
import com.ys.refs.user.domain.UserId;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@EqualsAndHashCode(callSuper = true)
@Getter
public class Post extends SelfValidating<Post> {

    @Valid @NotNull
    private PostId id;
    @Valid @NotNull
    private CategoryId categoryId;
    @Valid @NotNull
    private UserId userId;
    @Valid @NotNull
    private Title title;
    @Valid @NotNull
    private Contents contents;

    private Post(PostId id, CategoryId categoryId, UserId userId, Title title, Contents contents) {
        this.id = id;
        this.categoryId = categoryId;
        this.userId = userId;
        this.title = title;
        this.contents = contents;
        validateSelf();
    }

    public static Post of(PostId id, CategoryId categoryId, UserId userId, Title title, Contents contents) {
        return new Post(id, categoryId, userId, title, contents);
    }

    public static Post create(CategoryId categoryId, UserId userId, Title title, Contents contents) {
        PostId id = PostId.of(Generators.timeBasedEpochGenerator().generate().toString());
        return new Post(id, categoryId, userId, title, contents);
    }
}
