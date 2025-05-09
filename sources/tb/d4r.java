package tb;

import android.content.Context;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class d4r implements xbe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WebView f17573a;

    public d4r(WebView webView) {
        this.f17573a = webView;
    }

    @Override // tb.xbe
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1bebe7d", new Object[]{this, str, valueCallback});
        } else {
            this.f17573a.evaluateJavascript(str, valueCallback);
        }
    }

    @Override // tb.xbe
    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.f17573a.getContext();
    }

    @Override // tb.xbe
    public boolean post(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd609e29", new Object[]{this, runnable})).booleanValue();
        }
        return this.f17573a.post(runnable);
    }

    @Override // tb.xbe
    public void addJavascriptInterface(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b95c0098", new Object[]{this, obj, str});
            return;
        }
        this.f17573a.addJavascriptInterface(obj, str);
        thh.e(null, "mWebview" + this.f17573a);
    }
}
