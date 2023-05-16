package com.ys.post.application.service;

import com.ys.post.application.port.in.RegisterPostCommand;
import com.ys.post.application.port.in.RegisterPostUseCase;
import com.ys.post.application.port.out.RecordPostPort;
import com.ys.post.domain.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegisterPostService implements RegisterPostUseCase {

    private final RecordPostPort recordPostPort;

    @Override
    public Post register(RegisterPostCommand command) {
        Post post = Post.create(
                command.getCategoryId(), command.getUserId(), command.getTitle(), command.getContents());

        recordPostPort.save(post);

        return post;
    }
}
