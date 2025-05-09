package mtopsdk.extra.antiattack;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.WebView;
import java.net.MalformedURLException;
import java.net.URL;
import tb.acq;
import tb.rfh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class CheckCodeValidateActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public WVUCWebView f15407a = null;
    public String b = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a extends WVUCWebViewClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -623958539) {
                return new Boolean(super.shouldOverrideUrlLoading((WebView) objArr[0], (String) objArr[1]));
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in mtopsdk/extra/antiattack/CheckCodeValidateActivity$1");
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("dacf25f5", new Object[]{this, webView, str})).booleanValue();
            }
            if (TextUtils.isEmpty(str) || !str.equalsIgnoreCase(CheckCodeValidateActivity.this.b)) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            CheckCodeValidateActivity.a(CheckCodeValidateActivity.this, "success");
            CheckCodeValidateActivity.this.finish();
            return true;
        }
    }

    public static /* synthetic */ void a(CheckCodeValidateActivity checkCodeValidateActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7bdeff", new Object[]{checkCodeValidateActivity, str});
        } else {
            checkCodeValidateActivity.c(str);
        }
    }

    public static /* synthetic */ Object ipc$super(CheckCodeValidateActivity checkCodeValidateActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 143326307:
                super.onBackPressed();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in mtopsdk/extra/antiattack/CheckCodeValidateActivity");
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    public final String b(String str) throws MalformedURLException {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("88d4b267", new Object[]{this, str});
        }
        String query = new URL(str).getQuery();
        StringBuilder sb = new StringBuilder(32);
        if (!TextUtils.isEmpty(query)) {
            String str2 = null;
            for (String str3 : query.split("&")) {
                if (str3.startsWith("http_referer=")) {
                    this.b = str3.substring(13);
                    str2 = str3;
                } else if (!str3.equalsIgnoreCase("native=1")) {
                    sb.append(str3);
                    sb.append("&");
                }
            }
            sb.append("tmd_nc=1");
            if (str2 != null) {
                sb.append("&");
                sb.append(str2);
            }
            return str.replace(query, sb.toString());
        }
        sb.append(str);
        if (!str.endsWith("?")) {
            sb.append("?");
        }
        sb.append("tmd_nc=1");
        return sb.toString();
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f8b2696", new Object[]{this, str});
            return;
        }
        rfh.a(16, "mtopsdk.CheckActivity", "sendResult: " + str, null);
        Intent intent = new Intent("mtopsdk.extra.antiattack.result.notify.action");
        intent.setPackage(getApplicationContext().getPackageName());
        intent.putExtra("Result", str);
        sendBroadcast(intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        super.onBackPressed();
        c("cancel");
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        try {
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            setContentView(linearLayout);
            WVUCWebView wVUCWebView = new WVUCWebView(this);
            this.f15407a = wVUCWebView;
            linearLayout.addView(wVUCWebView, new ViewGroup.LayoutParams(-1, -1));
            this.f15407a.setWebViewClient(new a(this));
            String stringExtra = getIntent().getStringExtra("Location");
            rfh.a(16, "mtopsdk.CheckActivity", "origin load url. " + stringExtra, null);
            String b = b(stringExtra);
            rfh.a(16, "mtopsdk.CheckActivity", "load url. " + b, null);
            this.f15407a.loadUrl(b);
        } catch (Exception e) {
            rfh.a(16, "mtopsdk.CheckActivity", "onCreate failed.", e);
            c("fail");
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        WVUCWebView wVUCWebView = this.f15407a;
        if (wVUCWebView != null) {
            try {
                wVUCWebView.setVisibility(8);
                this.f15407a.removeAllViews();
                this.f15407a.coreDestroy();
                this.f15407a = null;
            } catch (Exception e) {
                rfh.a(16, "mtopsdk.CheckActivity", "WVUCWebView onDestroy error.", e);
            }
        }
    }
}
