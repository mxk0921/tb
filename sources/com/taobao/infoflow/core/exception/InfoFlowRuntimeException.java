package com.taobao.infoflow.core.exception;

import tb.fve;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class InfoFlowRuntimeException extends RuntimeException {
    private static final String TAG = "InfoFlowRuntimeException";

    static {
        t2o.a(486539327);
    }

    public InfoFlowRuntimeException(String str) {
        super(str);
        fve.e(TAG, "InfoFlowRuntimeException : " + str);
    }
}
