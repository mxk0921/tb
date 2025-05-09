package tb;

import android.taobao.windvane.extra.uc.WVUCWebChromeClient;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import com.uc.webview.export.WebView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class mes extends WVUCWebChromeClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ITMSPage f23999a;

    static {
        t2o.a(850395167);
    }

    public mes(ITMSPage iTMSPage) {
        ckf.g(iTMSPage, "page");
        this.f23999a = iTMSPage;
    }

    public static /* synthetic */ Object ipc$super(mes mesVar, String str, Object... objArr) {
        if (str.hashCode() == -2015964955) {
            super.onReceivedTitle((WebView) objArr[0], (String) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/web/runtime/TMSWebChromeClient");
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebChromeClient, com.uc.webview.export.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        tll pageContext;
        y0e titleBar;
        cc8 U;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87d6d0e5", new Object[]{this, webView, str});
            return;
        }
        super.onReceivedTitle(webView, str);
        rbe rbeVar = (rbe) this.f23999a.getExtension(rbe.class);
        if (!(rbeVar == null || (U = rbeVar.U()) == null)) {
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            U.a(str2);
        }
        if (q9s.J0()) {
            if ((str == null || (!tsq.I(str, h1p.HTTPS_PREFIX, false, 2, null) && !tsq.I(str, h1p.HTTP_PREFIX, false, 2, null))) && qml.d(this.f23999a) && (pageContext = this.f23999a.getPageContext()) != null && (titleBar = pageContext.getTitleBar()) != null) {
                titleBar.setTitle(str, "");
            }
        }
    }
}
