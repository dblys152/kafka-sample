package com.ys.post.application.port.in;

import com.ys.post.domain.Post;

public interface RegisterPostUseCase {
    Post register(RegisterPostCommand command);
}
