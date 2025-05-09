package com.unionpay;

import tb.xux;
import tb.zux;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ xux f14528a;
    final /* synthetic */ String b;
    final /* synthetic */ zux c;
    final /* synthetic */ WebViewJavascriptBridge d;

    public a(WebViewJavascriptBridge webViewJavascriptBridge, xux xuxVar, String str, zux zuxVar) {
        this.d = webViewJavascriptBridge;
        this.f14528a = xuxVar;
        this.b = str;
        this.c = zuxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xux xuxVar = this.f14528a;
        if (xuxVar != null) {
            xuxVar.a(this.b, this.c);
        }
    }
}
