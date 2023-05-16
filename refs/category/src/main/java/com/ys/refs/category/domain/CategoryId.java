package com.ys.refs.category.domain;

import lombok.Value;

import javax.validation.constraints.NotNull;

@Value(staticConstructor = "of")
public class CategoryId {

    @NotNull
    String id;
}
