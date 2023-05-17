package com.ys.post.domain;

import com.ys.refs.category.domain.CategoryId;
import com.ys.refs.user.domain.UserId;
import org.junit.jupiter.api.Test;

import javax.validation.ConstraintViolationException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
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

    @Test
    void 게시글_생성_실패() {
        assertAll(
                () -> assertThatThrownBy(() -> Post.create(null, ANY_USER_ID, ANY_TITLE, ANY_CONTENTS)).isInstanceOf(ConstraintViolationException.class),
                () -> assertThatThrownBy(() -> Post.create(ANY_CATEGORY_ID, null, ANY_TITLE, ANY_CONTENTS)).isInstanceOf(ConstraintViolationException.class),
                () -> assertThatThrownBy(() -> Post.create(ANY_CATEGORY_ID, ANY_USER_ID, null, ANY_CONTENTS)).isInstanceOf(ConstraintViolationException.class),
                () -> assertThatThrownBy(() -> Post.create(ANY_CATEGORY_ID, ANY_USER_ID, ANY_TITLE, null)).isInstanceOf(ConstraintViolationException.class)
        );
    }
}