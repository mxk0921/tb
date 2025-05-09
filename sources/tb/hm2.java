package tb;

import android.content.Context;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tlog.adapter.AdapterForTLog;
import com.uc.webview.export.WebView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class hm2 extends WVUCWebViewClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public WVUCWebView b = null;
    public ejh c = null;

    static {
        t2o.a(619708669);
    }

    public hm2(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(hm2 hm2Var, String str, Object... objArr) {
        if (str.hashCode() == -623958539) {
            return new Boolean(super.shouldOverrideUrlLoading((WebView) objArr[0], (String) objArr[1]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/webview/BrowserCommonUCWebViewClient");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0047 A[Catch: Exception -> 0x003a, TRY_LEAVE, TryCatch #0 {Exception -> 0x003a, blocks: (B:6:0x001c, B:8:0x0021, B:10:0x0027, B:12:0x0033, B:15:0x003d, B:17:0x0041, B:20:0x0047), top: B:41:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.hm2.a(java.lang.String):boolean");
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dacf25f5", new Object[]{this, webView, str})).booleanValue();
        }
        this.b = (WVUCWebView) webView;
        if (!a(str)) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        AdapterForTLog.loge("BrowserCommonWebViewClient", "login check success, redirect url = [" + str + "]");
        return true;
    }
}
