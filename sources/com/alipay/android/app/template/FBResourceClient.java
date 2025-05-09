package com.alipay.android.app.template;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface FBResourceClient {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum Type {
        STRING,
        DRAWABLE,
        MAIN_FRAME,
        INNER_FRAME
    }

    Object shouldInterceptResource(String str, Type type);
}
