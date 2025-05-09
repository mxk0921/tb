package com.taobao.favorites.favoritesdk.category.mtoprequest;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ComTaobaoMercuryDeleteCategoryRequest implements IMTOPDataObject {
    public String API_NAME = "com.taobao.mercury.deleteCategories";
    public String VERSION = "2.0";
    public boolean NEED_ECODE = true;
    public boolean NEED_SESSION = true;
    public String appName = "mclaren";
    public String categories = null;
    public long type = 1;
    public boolean isDeleteFav = false;

    static {
        t2o.a(707788838);
        t2o.a(589299906);
    }
}
