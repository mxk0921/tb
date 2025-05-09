package com.taobao.android.shop.features.category;

import java.io.Serializable;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class CategoryData implements IMTOPDataObject, Serializable {
    private static final long serialVersionUID = 1;
    public CategoryDataItem[] cats;
    public String type;
    public String url;

    static {
        t2o.a(764411968);
        t2o.a(589299906);
    }
}
