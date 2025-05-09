package tb;

import android.content.Context;
import android.webkit.ValueCallback;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.WebView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class tsu implements xbe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WebView f28941a;

    public tsu(WebView webView) {
        this.f28941a = webView;
    }

    @Override // tb.xbe
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1bebe7d", new Object[]{this, str, valueCallback});
        } else {
            this.f28941a.evaluateJavascript(str, valueCallback);
        }
    }

    @Override // tb.xbe
    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.f28941a.getContext();
    }

    @Override // tb.xbe
    public boolean post(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd609e29", new Object[]{this, runnable})).booleanValue();
        }
        return this.f28941a.post(runnable);
    }

    @Override // tb.xbe
    public void addJavascriptInterface(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b95c0098", new Object[]{this, obj, str});
            return;
        }
        this.f28941a.addJavascriptInterface(obj, str);
        thh.e(null, "mWebview" + this.f28941a);
    }
}
