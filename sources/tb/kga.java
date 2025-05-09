package tb;

import android.content.Context;
import android.net.http.SslError;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.common.view.DWPenetrateFrameLayout;
import com.taobao.android.fluid.framework.card.ICardService;
import com.uc.webview.export.SslErrorHandler;
import com.uc.webview.export.WebView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class kga extends WVUCWebViewClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ String b;
    public final /* synthetic */ DWPenetrateFrameLayout c;
    public final /* synthetic */ lga d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kga(lga lgaVar, Context context, String str, DWPenetrateFrameLayout dWPenetrateFrameLayout) {
        super(context);
        this.d = lgaVar;
        this.b = str;
        this.c = dWPenetrateFrameLayout;
    }

    public static /* synthetic */ Object ipc$super(kga kgaVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1262473342) {
            super.onReceivedSslError((WebView) objArr[0], (SslErrorHandler) objArr[1], (SslError) objArr[2]);
            return null;
        } else if (hashCode == -332805219) {
            super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
            return null;
        } else if (hashCode == 1373550412) {
            super.onReceivedError((WebView) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], (String) objArr[3]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/fluid/framework/card/cards/base/layer/interactive/eventhandler/GoodsH5MessageHandler$1");
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
            return;
        }
        super.onPageFinished(webView, str);
        lga.u(this.d, (int) (System.currentTimeMillis() - lga.v(this.d)));
        lga.w(this.d, true);
        lga.x(this.d);
        lga.z(this.d);
        soa.b(lga.B(this.d), ((ICardService) lga.B(this.d).getService(ICardService.class)).getActiveCard(), lga.t(this.d), "3", this.b);
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51deb74c", new Object[]{this, webView, new Integer(i), str, str2});
            return;
        }
        super.onReceivedError(webView, i, str, str2);
        this.d.e = 3;
        ir9.b("GoodsH5MessageHandler", "webview error:" + i + "  " + str);
        this.c.setVisibility(8);
        soa.a(lga.B(this.d), ((ICardService) lga.B(this.d).getService(ICardService.class)).getActiveCard(), i, str, "3", this.b);
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4c02f82", new Object[]{this, webView, sslErrorHandler, sslError});
            return;
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        this.d.e = 3;
        ir9.b("GoodsH5MessageHandler", "webview ssl error");
        this.c.setVisibility(8);
    }
}
