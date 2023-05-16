package com.ys.post.domain;

import lombok.Value;

import javax.validation.constraints.NotNull;

@Value(staticConstructor = "of")
public class PostId {

    @NotNull
    String id;
}
