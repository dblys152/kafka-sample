package com.ys.post.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PostTest {

    private static final CategoryId ANY_CATEGORY_ID = CategoryId.of("ANY_CATEGORY_ID");
    private static final UserId ANY_USER_ID = UserId.of("ANY_USER_ID");
    private static final Title ANY_TITLE = Title.of("ANY_TITLE");
    private static final Contents ANY_CONTENTS = Contents.of("ANY_CONTENTS");

    @Test
    void 게시글_생성() {
        Post actual = Post.create(ANY_CATEGORY_ID, ANY_USER_ID, ANY_TITLE, ANY_CONTENTS);
        assertAll(
                () -> assertThat(actual).isNotNull(),
                () -> assertThat(actual.getId()).isNotNull()
        );
    }
}