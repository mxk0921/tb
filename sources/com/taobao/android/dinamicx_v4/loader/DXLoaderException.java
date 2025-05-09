package com.taobao.android.dinamicx_v4.loader;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXLoaderException extends RuntimeException {
    static {
        t2o.a(444597870);
    }

    public DXLoaderException(String str) {
        super("LoaderException: " + str);
    }

    public DXLoaderException(String str, Throwable th) {
        super("LoaderException: " + str, th);
    }
}
