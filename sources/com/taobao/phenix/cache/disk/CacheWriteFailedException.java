package com.taobao.phenix.cache.disk;

import tb.t2o;
import tb.zp7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class CacheWriteFailedException extends Exception {
    static {
        t2o.a(620757035);
    }

    public CacheWriteFailedException(zp7 zp7Var, String str) {
        super("disk cache=" + zp7Var + " write failed, url=" + str);
    }
}
