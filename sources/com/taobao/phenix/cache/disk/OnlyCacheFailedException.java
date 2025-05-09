package com.taobao.phenix.cache.disk;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class OnlyCacheFailedException extends Exception {
    static {
        t2o.a(620757047);
    }

    public OnlyCacheFailedException(String str) {
        super("No disk cache , " + str + " cannot conduct final result at OnlyCache()");
    }
}
