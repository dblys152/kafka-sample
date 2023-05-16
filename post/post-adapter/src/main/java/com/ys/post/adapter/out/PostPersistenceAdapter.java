package com.ys.post.adapter.out;

import com.ys.post.application.port.out.RecordPostPort;
import com.ys.post.domain.Post;

public class PostPersistenceAdapter implements RecordPostPort {

    @Override
    public void save(Post post) {
        // DB 저장
    }
}
