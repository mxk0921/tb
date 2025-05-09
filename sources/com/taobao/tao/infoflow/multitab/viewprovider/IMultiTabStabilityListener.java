package com.taobao.tao.infoflow.multitab.viewprovider;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface IMultiTabStabilityListener {
    public static final String ON_RENDER = "onRender";

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public @interface OnErrorType {
    }

    void a(String str, String str2, String str3);
}
