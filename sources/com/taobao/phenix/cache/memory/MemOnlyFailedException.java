package com.taobao.phenix.cache.memory;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MemOnlyFailedException extends Exception {
    static {
        t2o.a(620757057);
    }

    public MemOnlyFailedException() {
        super("no memory cache , MemCache cannot conduct final result at memOnly=true");
    }
}
