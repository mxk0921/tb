package com.taobao.phenix.loader.file;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class UnSupportedSchemeException extends Exception {
    static {
        t2o.a(620757113);
    }

    public UnSupportedSchemeException(int i) {
        super("SchemeType(" + i + ") cannot be supported now");
    }
}
