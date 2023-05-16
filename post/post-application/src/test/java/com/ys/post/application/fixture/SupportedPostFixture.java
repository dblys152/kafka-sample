package com.ys.post.application.fixture;

import com.ys.post.domain.Contents;
import com.ys.post.domain.Title;
import com.ys.refs.category.domain.CategoryId;
import com.ys.refs.user.domain.UserId;

public class SupportedPostFixture {

    protected static final CategoryId ANY_CATEGORY_ID = CategoryId.of("ANY_CATEGORY_ID");
    protected static final UserId ANY_USER_ID = UserId.of("ANY_USER_ID");
    protected static final Title ANY_TITLE = Title.of("ANY_TITLE");
    protected static final Contents ANY_CONTENTS = Contents.of("ANY_CONTENTS");
}
