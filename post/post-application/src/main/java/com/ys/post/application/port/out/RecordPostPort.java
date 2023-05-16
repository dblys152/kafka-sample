package com.ys.post.application.port.out;

import com.ys.post.domain.Post;

public interface RecordPostPort {
    void save(Post post);
}
