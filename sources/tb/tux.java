package tb;

import com.unionpay.WebViewJavascriptBridge;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class tux implements zux {

    /* renamed from: a  reason: collision with root package name */
    public final String f28976a;
    public final /* synthetic */ WebViewJavascriptBridge b;

    public tux(WebViewJavascriptBridge webViewJavascriptBridge, String str) {
        this.b = webViewJavascriptBridge;
        this.f28976a = str;
    }

    @Override // tb.zux
    public final void a(String str) {
        this.b._callbackJs(this.f28976a, str);
    }
}
