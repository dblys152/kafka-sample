package com.ys.post.domain;

import lombok.Value;

@Value(staticConstructor = "of")
public class Title {

    String value;
}