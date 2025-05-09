package com.taobao.analysis.v3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface FalcoExceptionReporter {
    public static final int SIGNAL_UNIFIED_ERROR_PAGE = 1;
    public static final int SIGNAL_UNKNOWN = 0;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public @interface Definition {
    }

    void a();

    FalcoExceptionReporter b(String str);

    FalcoExceptionReporter c(int i);

    FalcoExceptionReporter d(String str);

    FalcoExceptionReporter e(String str);
}
