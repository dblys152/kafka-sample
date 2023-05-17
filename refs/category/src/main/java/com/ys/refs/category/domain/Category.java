package com.ys.refs.category.domain;

import lombok.Value;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Value(staticConstructor = "of")
public class Category {

    @Valid @NotNull
    CategoryId id;
}
