package com.ys.post.application.port.in;

import com.ys.post.application.fixture.SupportedPostFixture;
import com.ys.post.domain.Contents;
import com.ys.post.domain.Title;
import com.ys.refs.category.domain.CategoryId;
import com.ys.refs.user.domain.UserId;
import org.junit.jupiter.api.Test;

import javax.validation.ConstraintViolationException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class RegisterPostCommandTest extends SupportedPostFixture {

    @Test
    void 커맨드_생성() {
        RegisterPostCommand actual = RegisterPostCommand.of(
                ANY_CATEGORY_ID, ANY_USER_ID, ANY_TITLE, ANY_CONTENTS);
        assertThat(actual).isNotNull();
    }

    @Test
    void 커맨드_생성_실패() {
        assertAll(
                () -> assertThatThrownBy(() -> RegisterPostCommand.of(null, ANY_USER_ID, ANY_TITLE, ANY_CONTENTS))
                        .isInstanceOf(ConstraintViolationException.class),
                () -> assertThatThrownBy(() -> RegisterPostCommand.of(CategoryId.of(null), ANY_USER_ID, ANY_TITLE, ANY_CONTENTS))
                        .isInstanceOf(ConstraintViolationException.class),
                () -> assertThatThrownBy(() -> RegisterPostCommand.of(ANY_CATEGORY_ID, null, ANY_TITLE, ANY_CONTENTS))
                        .isInstanceOf(ConstraintViolationException.class),
                () -> assertThatThrownBy(() -> RegisterPostCommand.of(ANY_CATEGORY_ID, UserId.of(null), ANY_TITLE, ANY_CONTENTS))
                        .isInstanceOf(ConstraintViolationException.class),
                () -> assertThatThrownBy(() -> RegisterPostCommand.of(ANY_CATEGORY_ID, ANY_USER_ID, null, ANY_CONTENTS))
                        .isInstanceOf(ConstraintViolationException.class),
                () -> assertThatThrownBy(() -> RegisterPostCommand.of(ANY_CATEGORY_ID, ANY_USER_ID, Title.of(null), ANY_CONTENTS))
                        .isInstanceOf(ConstraintViolationException.class),
                () -> assertThatThrownBy(() -> RegisterPostCommand.of(ANY_CATEGORY_ID, ANY_USER_ID, ANY_TITLE, null))
                        .isInstanceOf(ConstraintViolationException.class),
                () -> assertThatThrownBy(() -> RegisterPostCommand.of(ANY_CATEGORY_ID, ANY_USER_ID, ANY_TITLE, Contents.of(null)))
                        .isInstanceOf(ConstraintViolationException.class)
        );
    }
}