package tb;

import android.content.Context;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.uc.webview.export.WebView;
import kotlin.Deprecated;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class mcj extends WVUCWebViewClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792803);
    }

    public mcj(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(mcj mcjVar, String str, Object... objArr) {
        if (str.hashCode() == -623958539) {
            return new Boolean(super.shouldOverrideUrlLoading((WebView) objArr[0], (String) objArr[1]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/web/MusWebViewClient");
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    @Deprecated(message = "Deprecated in Java")
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dacf25f5", new Object[]{this, webView, str})).booleanValue();
        }
        ckf.g(webView, "view");
        if (TextUtils.isEmpty(str)) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        Nav.from(webView.getContext()).toUri(str);
        return true;
    }
}
