package tb;

import android.content.Context;
import android.os.Build;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class i1x {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final i1x INSTANCE = new i1x();

    static {
        t2o.a(507510828);
    }

    public final boolean c() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("937e4904", new Object[]{this})).booleanValue();
        }
        String str2 = Build.MODEL;
        if (str2 != null) {
            ckf.f(str2, "Build.MODEL");
            if (wsq.O(str2, "GT-I95", false, 2, null) && (str = Build.MANUFACTURER) != null) {
                ckf.b(str, "samsung");
            }
        }
        return false;
    }

    @JvmStatic
    public static final void b(Context context, WebView webView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("112d1b9a", new Object[]{context, webView});
            return;
        }
        ckf.g(webView, "webView");
        webView.setVerticalScrollBarEnabled(false);
        webView.requestFocus();
        CookieManager.getInstance().setAcceptCookie(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
        i1x i1xVar = INSTANCE;
        i1xVar.a(context);
        wsw.a();
        if (i1xVar.c()) {
            try {
                webView.setLayerType(1, null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final void a(Context context) {
    }
}
