package com.taobao.avplayer.core.model;

import com.taobao.avplayer.core.IDWObject;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DWRequest implements IDWObject {
    private static final long serialVersionUID = 3052085037769716049L;
    public String apiName;
    public String apiVersion;
    public boolean needLogin;
    public Map<String, String> paramMap;
    public Class<?> responseClass;
    public boolean useWua;

    static {
        t2o.a(452985066);
        t2o.a(452985056);
    }
}
