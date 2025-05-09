package com.taobao.phenix.loader.network;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class IncompleteResponseException extends NetworkResponseException {
    static {
        t2o.a(620757118);
    }

    public IncompleteResponseException() {
        super(200, "Incomplete Response");
    }
}
