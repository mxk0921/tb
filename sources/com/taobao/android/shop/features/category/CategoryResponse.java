package com.taobao.android.shop.features.category;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class CategoryResponse extends BaseOutDo {
    private CategoryData data;

    static {
        t2o.a(764411972);
    }

    public void setData(CategoryData categoryData) {
        this.data = categoryData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public CategoryData getData() {
        return this.data;
    }
}
