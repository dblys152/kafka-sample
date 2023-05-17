package com.ys.post.application.service;

import com.ys.post.application.fixture.SupportedPostFixture;
import com.ys.post.application.port.in.RegisterPostCommand;
import com.ys.post.application.port.out.RecordPostPort;
import com.ys.post.domain.Post;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class RegisterPostServiceTest extends SupportedPostFixture {

    @InjectMocks
    private RegisterPostService sut;
    @Mock
    private RecordPostPort recordPostPort;

    @Test
    void 게시글_등록() {
        RegisterPostCommand command = RegisterPostCommand.of(
                ANY_CATEGORY_ID, ANY_USER_ID, ANY_TITLE, ANY_CONTENTS);
        Post actual = sut.register(command);
        verify(recordPostPort).save(actual);
    }
}