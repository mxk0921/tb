package com.taobao.phenix.cache.disk;

import tb.t2o;
import tb.zp7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class CacheUnavailableException extends Exception {
    static {
        t2o.a(620757034);
    }

    public CacheUnavailableException(zp7 zp7Var, String str) {
        super("disk cache=" + zp7Var + " open failed, url=" + str);
    }
}
