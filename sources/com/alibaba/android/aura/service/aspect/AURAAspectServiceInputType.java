package com.alibaba.android.aura.service.aspect;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
@Retention(RetentionPolicy.SOURCE)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public @interface AURAAspectServiceInputType {
    public static final int afterFlowExecute = 1;
    public static final int afterServiceExecute = 3;
    public static final int beforeFlowExecute = 0;
    public static final int beforeServiceExecute = 2;
    public static final int error = 4;
}
