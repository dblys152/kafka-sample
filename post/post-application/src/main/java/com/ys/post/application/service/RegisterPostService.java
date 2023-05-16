package com.ys.post.application.service;

import com.ys.post.application.port.in.RegisterPostCommand;
import com.ys.post.application.port.in.RegisterPostUseCase;
import com.ys.post.domain.Post;
import org.springframework.stereotype.Service;

@Service
public class RegisterPostService implements RegisterPostUseCase {

    @Override
    public Post register(RegisterPostCommand command) {
        return null;
    }
}
