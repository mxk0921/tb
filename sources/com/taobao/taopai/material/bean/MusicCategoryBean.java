package com.taobao.taopai.material.bean;

import java.io.Serializable;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MusicCategoryBean implements Serializable, IMTOPDataObject {
    public int id;
    public String logoUrl;
    public String name;
    public SubCategoryInfo subCategories;
    public String type;
    public int useCount;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class SubCategoryInfo implements Serializable, IMTOPDataObject {
        public int relatedCollectionId;
        public int vendorCategoryId;

        static {
            t2o.a(782237741);
            t2o.a(589299906);
        }
    }

    static {
        t2o.a(782237740);
        t2o.a(589299906);
    }
}
