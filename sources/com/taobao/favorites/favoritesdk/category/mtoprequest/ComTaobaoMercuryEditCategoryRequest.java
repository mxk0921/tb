package com.taobao.favorites.favoritesdk.category.mtoprequest;

import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ComTaobaoMercuryEditCategoryRequest implements IMTOPDataObject {
    public List<String> addList;
    public String categoryId;
    public List<String> deleteList;
    public String API_NAME = "com.taobao.mercury.editCategory";
    public String VERSION = "2.0";
    public boolean NEED_ECODE = true;
    public boolean NEED_SESSION = true;
    public String appName = "mclaren";
    public long type = 1;
    public String newCategoryName = null;
    public String oldCategoryName = null;
    public boolean isSync = false;
    public String categoryDesc = null;
    public long categoryType = 1;
    public long source = 2;

    static {
        t2o.a(707788839);
        t2o.a(589299906);
    }
}
