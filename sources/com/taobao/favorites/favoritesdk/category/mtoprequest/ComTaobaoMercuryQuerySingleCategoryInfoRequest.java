package com.taobao.favorites.favoritesdk.category.mtoprequest;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ComTaobaoMercuryQuerySingleCategoryInfoRequest implements IMTOPDataObject {
    public String categoryId;
    public String page;
    public String API_NAME = "com.taobao.mercury.querySingleCategoryInfo";
    public String VERSION = "2.0";
    public boolean NEED_ECODE = true;
    public boolean NEED_SESSION = true;
    public String categoryName = null;
    public long source = 2;
    public long pageSize = 15;
    public long type = 1;
    public String appName = "mclaren";

    static {
        t2o.a(707788843);
        t2o.a(589299906);
    }
}
