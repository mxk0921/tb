package com.etao.feimagesearch.nn;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class NetConfig {
    public static final String ALINN_BIZ_NAME = "pltImageSearch";
    public static String AUTH_CODE = "iWTZJud96F/KmWgt7lxWuPPsBKTIWG5EWrHIr+elF8zJEKls/LfkklUneGWsvyhOTZXRkuLYBCMmrTE+2aGON8+NkxOAlBfwqsKvDI+t1hs=";
    public String alinnModelId;
    public String alinnUrl;
    public String name;
    public String type;

    public NetConfig() {
    }

    public NetConfig(String str, String str2, String str3, String str4) {
        this.name = str;
        this.type = str2;
        this.alinnUrl = str3;
        this.alinnModelId = str4;
    }

    static {
        t2o.a(481297305);
    }
}
