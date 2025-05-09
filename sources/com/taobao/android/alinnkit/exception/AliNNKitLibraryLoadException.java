package com.taobao.android.alinnkit.exception;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AliNNKitLibraryLoadException extends AliNNKitBaseException {
    static {
        t2o.a(367001626);
    }

    public AliNNKitLibraryLoadException() {
        super("alinnkit library load error or current device not support neon!");
    }
}
