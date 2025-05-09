package com.taobao.android.address;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.text.TextUtils;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.tlog.adapter.AdapterForTLog;
import com.uc.webview.export.WebView;
import tb.acq;
import tb.mtv;
import tb.qj4;
import tb.rf0;
import tb.u58;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class H5PopActivity extends AppCompatActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGE_NAME = "Page_AddressH5";
    public static final String TAG = "addressH5";
    public static boolean f;

    /* renamed from: a  reason: collision with root package name */
    public ProgressBar f6289a;
    public WVUCWebView b;
    public long c;
    public long d;
    public long e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends WVUCWebViewClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public long b = 0;
        public long c = 0;

        public a(Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -332805219) {
                super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                return null;
            } else if (hashCode == 534767588) {
                super.onPageStarted((WebView) objArr[0], (String) objArr[1], (Bitmap) objArr[2]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/address/H5PopActivity$1");
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
            this.c = System.currentTimeMillis();
            mtv.c("finish_h5_page", "" + this.c, String.valueOf(this.c - this.b), null);
            mtv.c("success_h5_page", "" + this.c, String.valueOf(this.c - H5PopActivity.m3(H5PopActivity.this)), null);
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1fdfe7e4", new Object[]{this, webView, str, bitmap});
                return;
            }
            super.onPageStarted(webView, str, bitmap);
            H5PopActivity.this.f6289a.setVisibility(8);
            this.b = System.currentTimeMillis();
            mtv.c("start_h5_render", "" + this.b, String.valueOf(this.b - H5PopActivity.l3(H5PopActivity.this)), null);
        }
    }

    public static /* synthetic */ Object ipc$super(H5PopActivity h5PopActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 143326307:
                super.onBackPressed();
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/address/H5PopActivity");
        }
    }

    public static /* synthetic */ long l3(H5PopActivity h5PopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dca61cf5", new Object[]{h5PopActivity})).longValue();
        }
        return h5PopActivity.e;
    }

    public static /* synthetic */ long m3(H5PopActivity h5PopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dc2fb6f6", new Object[]{h5PopActivity})).longValue();
        }
        return h5PopActivity.c;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        this.d = System.currentTimeMillis();
        mtv.c("finishH5Act", "" + this.d, String.valueOf(this.d - this.c), null);
    }

    public void initViews() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        rf0.y(this);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.address_progress);
        this.f6289a = progressBar;
        if (rf0.j("address_show_h5_loading")) {
            i = 0;
        } else {
            i = 8;
        }
        progressBar.setVisibility(i);
        this.e = System.currentTimeMillis();
        mtv.c("create_h5", "" + this.e, String.valueOf(this.e - this.c), null);
        WVUCWebView wVUCWebView = (WVUCWebView) findViewById(R.id.address_h5_webview);
        this.b = wVUCWebView;
        wVUCWebView.setBackgroundColor(0);
        this.b.getSettings().setJavaScriptEnabled(rf0.j("h5_containter_use_js"));
        this.b.setWebViewClient(new a(this));
        n3();
    }

    public void n3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7389eb0", new Object[]{this});
            return;
        }
        String stringExtra = getIntent().getStringExtra(qj4.e);
        AdapterForTLog.logd(TAG, "load url=" + stringExtra);
        if (!TextUtils.isEmpty(stringExtra)) {
            this.b.loadUrl(stringExtra);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        WVUCWebView wVUCWebView = this.b;
        if (wVUCWebView != null) {
            wVUCWebView.onActivityResult(i, i2, intent);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
        } else if (f) {
            WVStandardEventCenter.postNotificationToJS(this.b, "address_h5_web_back", "");
        } else {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        this.c = System.currentTimeMillis();
        mtv.c("createH5Act", "" + this.c, "", null);
        setContentView(R.layout.aliuser_h5_pop_container);
        initViews();
        u58.c(0);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.b.destroy();
        f = false;
        WVStandardEventCenter.postNotificationToJS(this.b, "address_h5_web_destory", "");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        n3();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        this.b.onPause();
        WVStandardEventCenter.postNotificationToJS(this.b, "address_h5_web_pause", "");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        this.b.onResume();
        WVStandardEventCenter.postNotificationToJS(this.b, "address_h5_web_resume", "");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        WVStandardEventCenter.postNotificationToJS(this.b, "address_h5_web_stop", "");
    }
}
