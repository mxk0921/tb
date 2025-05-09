package com.taobao.android.shop.features.category;

import java.io.Serializable;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class CategoryDataItem implements IMTOPDataObject, Serializable {
    private static final long serialVersionUID = 1;
    public String id;
    public String imagePath;
    public String mcatImg;
    public String name;
    public String parID;
    public CategoryDataItem[] subCats;

    static {
        t2o.a(764411969);
        t2o.a(589299906);
    }
}
