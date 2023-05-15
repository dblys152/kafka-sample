package com.ys.post.domain;

import lombok.Value;

@Value(staticConstructor = "of")
public class PostId {

    String id;
}
