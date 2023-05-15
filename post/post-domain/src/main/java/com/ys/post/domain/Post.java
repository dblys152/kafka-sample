package com.ys.post.domain;

import com.fasterxml.uuid.Generators;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Post {

    PostId id;
    CategoryId categoryId;
    UserId userId;
    Title title;
    Contents contents;

    public static Post of(PostId id, CategoryId categoryId, UserId userId, Title title, Contents contents) {
        return new Post(id, categoryId, userId, title, contents);
    }

    public static Post create(CategoryId categoryId, UserId userId, Title title, Contents contents) {
        PostId id = PostId.of(Generators.timeBasedEpochGenerator().generate().toString());
        return new Post(id, categoryId, userId, title, contents);
    }
}
