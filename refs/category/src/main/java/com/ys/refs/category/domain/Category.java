package com.ys.refs.category.domain;

import lombok.Value;

@Value(staticConstructor = "of")
public class Category {

    CategoryId id;
}
