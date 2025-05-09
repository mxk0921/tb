package com.alipay.android.app.template;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface OnTemplateClickListener {
    boolean onAsyncEvent(Object obj, String str, ITemplateClickCallback iTemplateClickCallback);

    boolean onEvent(Object obj, String str, boolean z);

    String onGetCustomAttr(Object obj, String str);
}
