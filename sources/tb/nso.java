package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobao.scancode.barcode.util.ScancodeBaseBrowserActivity;
import com.uc.webview.export.WebView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class nso extends WVUCWebViewClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ScancodeBaseBrowserActivity b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                nso.this.b.finish();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nso(ScancodeBaseBrowserActivity scancodeBaseBrowserActivity, Context context) {
        super(context);
        this.b = scancodeBaseBrowserActivity;
    }

    public static /* synthetic */ Object ipc$super(nso nsoVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -332805219) {
            super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
            return null;
        } else if (hashCode == 534767588) {
            super.onPageStarted((WebView) objArr[0], (String) objArr[1], (Bitmap) objArr[2]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/taobao/scancode/barcode/util/ScancodeBaseBrowserActivity$1");
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
        if (this.b.b.isShown()) {
            this.b.b.setVisibility(8);
        }
        if (ScancodeBaseBrowserActivity.l3(this.b).isShown()) {
            ScancodeBaseBrowserActivity.l3(this.b).setVisibility(4);
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fdfe7e4", new Object[]{this, webView, str, bitmap});
            return;
        }
        super.onPageStarted(webView, str, bitmap);
        if (!ScancodeBaseBrowserActivity.l3(this.b).isShown()) {
            ScancodeBaseBrowserActivity.l3(this.b).setVisibility(0);
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dacf25f5", new Object[]{this, webView, str})).booleanValue();
        }
        try {
            if (TextUtils.equals(OrangeConfig.getInstance().getConfig("image_search", "disableProductCodeRedirect", "false"), "true")) {
                return yoj.b(this.b.getApplicationContext(), ScancodeBaseBrowserActivity.m3(this.b)).a().d(str);
            }
            if (str == null || !str.startsWith("http")) {
                return yoj.b(this.b.getApplicationContext(), ScancodeBaseBrowserActivity.m3(this.b)).a().d(str);
            }
            if (!yoj.b(this.b.getApplicationContext(), ScancodeBaseBrowserActivity.m3(this.b)).d(str)) {
                return false;
            }
            this.b.runOnUiThread(new a());
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
