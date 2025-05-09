package com.taobao.favorites.favoritesdk.category.mtoprequest;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ComTaobaoMercuryQueryCategoryListRequest implements IMTOPDataObject {
    public String page;
    public String API_NAME = "com.taobao.mercury.queryCategoryList";
    public String VERSION = "2.0";
    public boolean NEED_ECODE = true;
    public boolean NEED_SESSION = true;
    public long pageSize = 15;
    public boolean isDetail = true;
    public long type = 1;
    public String appName = "mclaren";

    static {
        t2o.a(707788841);
        t2o.a(589299906);
    }
}
