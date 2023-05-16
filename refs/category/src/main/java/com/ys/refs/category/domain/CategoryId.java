package com.ys.refs.category.domain;

import lombok.Value;

import javax.validation.constraints.NotBlank;

@Value(staticConstructor = "of")
public class CategoryId {

    @NotBlank
    String id;
}
