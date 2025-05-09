package com.taobao.android.cash.activity;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.taobao.windvane.extra.uc.WVUCWebChromeClient;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.ali.user.open.ucc.data.ApiConstants;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.material.appbar.AppBarLayout;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.uc.webview.export.JsPromptResult;
import com.uc.webview.export.SslErrorHandler;
import com.uc.webview.export.WebSettings;
import com.uc.webview.export.WebView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import tb.acq;
import tb.t2o;
import tb.zz4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class CustomBrowserActivity extends AppCompatActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String l = "cash.h5";

    /* renamed from: a  reason: collision with root package name */
    public WVUCWebView f6503a;
    public String b;
    public int c;
    public final boolean d = true;
    public boolean e = true;
    public boolean f = true;
    public boolean g = false;
    public Toolbar h;
    public ViewGroup i;
    public ViewGroup j;
    public BroadcastReceiver k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                CustomBrowserActivity.this.onBackPressed();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b extends WVUCWebChromeClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<CustomBrowserActivity> f6506a;

        static {
            t2o.a(416284685);
        }

        public b(CustomBrowserActivity customBrowserActivity) {
            super(customBrowserActivity);
            this.f6506a = new WeakReference<>(customBrowserActivity);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -2015964955) {
                super.onReceivedTitle((WebView) objArr[0], (String) objArr[1]);
                return null;
            } else if (hashCode == 220271772) {
                return new Boolean(super.onJsPrompt((WebView) objArr[0], (String) objArr[1], (String) objArr[2], (String) objArr[3], (JsPromptResult) objArr[4]));
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/cash/activity/CustomBrowserActivity$LoginWebChromeClient");
            }
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebChromeClient, com.uc.webview.export.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d21149c", new Object[]{this, webView, str, str2, str3, jsPromptResult})).booleanValue();
            }
            return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebChromeClient, com.uc.webview.export.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("87d6d0e5", new Object[]{this, webView, str});
                return;
            }
            CustomBrowserActivity customBrowserActivity = this.f6506a.get();
            if (!(customBrowserActivity == null || !customBrowserActivity.d || customBrowserActivity.getSupportActionBar() == null)) {
                try {
                    customBrowserActivity.getSupportActionBar().setTitle(str);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            super.onReceivedTitle(webView, str);
        }
    }

    static {
        t2o.a(416284681);
    }

    public static /* synthetic */ Object ipc$super(CustomBrowserActivity customBrowserActivity, String str, Object... objArr) {
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
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/cash/activity/CustomBrowserActivity");
        }
    }

    public static /* synthetic */ void l3(CustomBrowserActivity customBrowserActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee40af97", new Object[]{customBrowserActivity});
        } else {
            customBrowserActivity.p3();
        }
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

    public void createWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1a95184", new Object[]{this});
            return;
        }
        try {
            this.f6503a = new WVUCWebView(this);
        } catch (Exception e) {
            e.printStackTrace();
            finish();
        }
        if (this.f6503a == null) {
            TLog.loge(l, "webview init failed, finish activity");
            finish();
        }
        this.f6503a.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        m3();
        this.j.addView(this.f6503a);
        q3(this.f6503a);
        setWebChromClient();
        setWebViewClient();
        s3(this.b);
    }

    public void initToolBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b52eb32", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getLayoutInflater().inflate(R.layout.cash_toolbar, this.i, false);
        this.h = (Toolbar) viewGroup.findViewById(R.id.aliuser_toolbar);
        if (!(this.i.getChildAt(0) instanceof AppBarLayout)) {
            this.i.addView(viewGroup, 0);
        }
        setSupportActionBar(this.h);
        if (isNavIconLeftBack()) {
            setNavigationBackIcon();
        }
        this.h.setNavigationOnClickListener(new a());
        this.h.setNavigationContentDescription(R.string.cash_title_back);
    }

    public void initViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        createWebView();
        init();
    }

    public boolean isNavIconLeftBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17467beb", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public final void n3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d392ab05", new Object[]{this});
            return;
        }
        this.k = new BroadcastReceiver() { // from class: com.taobao.android.cash.activity.CustomBrowserActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/cash/activity/CustomBrowserActivity$1");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if ("com.ali.user.cash.close.all".equals(intent.getAction())) {
                    CustomBrowserActivity.this.setResult(0);
                    CustomBrowserActivity.this.finish();
                    CustomBrowserActivity.this.overridePendingTransition(0, 0);
                } else if ("com.ali.user.cash.card.selected".equals(intent.getAction())) {
                    CustomBrowserActivity.l3(CustomBrowserActivity.this);
                    CustomBrowserActivity.this.o3(new Intent("com.ali.user.cash.close.all"));
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.ali.user.cash.close.all");
        intentFilter.addAction("com.ali.user.cash.card.selected");
        LocalBroadcastManager.getInstance(getApplicationContext()).registerReceiver(this.k, intentFilter);
    }

    public boolean o3(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b9ca1a6", new Object[]{this, intent})).booleanValue();
        }
        boolean sendBroadcast = LocalBroadcastManager.getInstance(getApplicationContext()).sendBroadcast(intent);
        TLog.logd("cash4android", "CustomBrowserActivity", intent.getAction() + "; sendResult=" + sendBroadcast);
        return sendBroadcast;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        if (i2 != -1) {
            WVUCWebView wVUCWebView = this.f6503a;
            if (wVUCWebView != null) {
                wVUCWebView.onActivityResult(i, i2, intent);
            }
        } else {
            WVUCWebView wVUCWebView2 = this.f6503a;
            if (wVUCWebView2 != null) {
                wVUCWebView2.onActivityResult(i, i2, intent);
            }
        }
        TLog.logd(l, "call onActivityResult");
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        super.onBackPressed();
        p3();
        o3(new Intent("com.ali.user.cash.close.all"));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        if (this.e) {
            try {
                this.j.removeView(this.f6503a);
                this.f6503a.removeAllViews();
                this.f6503a.setVisibility(8);
                this.f6503a.destroy();
            } finally {
                try {
                } finally {
                }
            }
        }
        super.onDestroy();
        if (this.k != null) {
            LocalBroadcastManager.getInstance(getApplicationContext()).unregisterReceiver(this.k);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        WVUCWebView wVUCWebView = this.f6503a;
        if (wVUCWebView != null) {
            wVUCWebView.onPause();
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        WVUCWebView wVUCWebView = this.f6503a;
        if (wVUCWebView != null) {
            wVUCWebView.onResume();
        }
        super.onResume();
    }

    public boolean overrideUrlLoading(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("adbdcb28", new Object[]{this, webView, str})).booleanValue();
        }
        return false;
    }

    public final void p3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58b5a39a", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ApiConstants.ApiField.USER_ACTION, (Object) "1");
        WVStandardEventCenter.postNotificationToJS("ALBBCashierCloseNotification", JSON.toJSONString(jSONObject));
    }

    public final void r3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("142219f8", new Object[]{this});
            return;
        }
        setContentView(R.layout.cash_container);
        this.i = (ViewGroup) findViewById(R.id.aliuser_main_content);
        this.j = (ViewGroup) findViewById(R.id.aliuser_content);
        this.i.setOnClickListener(new zz4(this));
    }

    public void s3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14e6fee1", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.f6503a.loadUrl(str);
        }
    }

    public void setNavigationBackIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21d761bd", new Object[]{this});
            return;
        }
        Toolbar toolbar = this.h;
        if (toolbar != null) {
            toolbar.setNavigationIcon(R.drawable.cash_actionbar_back);
        }
    }

    public void setWebChromClient() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27ef6a8b", new Object[]{this});
        } else {
            this.f6503a.setWebChromeClient(new b(this));
        }
    }

    public void setWebViewClient() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be662f89", new Object[]{this});
        } else {
            this.f6503a.setWebViewClient(new c(this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c extends WVUCWebViewClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final WeakReference<CustomBrowserActivity> b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements DialogInterface.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ SslErrorHandler f6507a;
            public final /* synthetic */ CustomBrowserActivity b;

            public a(c cVar, SslErrorHandler sslErrorHandler, CustomBrowserActivity customBrowserActivity) {
                this.f6507a = sslErrorHandler;
                this.b = customBrowserActivity;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    return;
                }
                this.f6507a.proceed();
                CustomBrowserActivity customBrowserActivity = this.b;
                if (customBrowserActivity != null) {
                    customBrowserActivity.g = true;
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class b implements DialogInterface.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ SslErrorHandler f6508a;
            public final /* synthetic */ CustomBrowserActivity b;

            public b(c cVar, SslErrorHandler sslErrorHandler, CustomBrowserActivity customBrowserActivity) {
                this.f6508a = sslErrorHandler;
                this.b = customBrowserActivity;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    return;
                }
                this.f6508a.cancel();
                CustomBrowserActivity customBrowserActivity = this.b;
                if (customBrowserActivity != null) {
                    customBrowserActivity.g = false;
                }
            }
        }

        static {
            t2o.a(416284686);
        }

        public c(CustomBrowserActivity customBrowserActivity) {
            super(customBrowserActivity);
            this.b = new WeakReference<>(customBrowserActivity);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1262473342) {
                super.onReceivedSslError((WebView) objArr[0], (SslErrorHandler) objArr[1], (SslError) objArr[2]);
                return null;
            } else if (hashCode == -623958539) {
                return new Boolean(super.shouldOverrideUrlLoading((WebView) objArr[0], (String) objArr[1]));
            } else {
                if (hashCode == -332805219) {
                    super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                    return null;
                }
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/cash/activity/CustomBrowserActivity$LoginWebViewClient");
            }
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
                return;
            }
            this.b.get();
            super.onPageFinished(webView, str);
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4c02f82", new Object[]{this, webView, sslErrorHandler, sslError});
                return;
            }
            TLog.loge(CustomBrowserActivity.l, "已忽略证书校验的错误！");
            CustomBrowserActivity customBrowserActivity = this.b.get();
            if (customBrowserActivity == null || customBrowserActivity.f) {
                AlertDialog.Builder builder = new AlertDialog.Builder(webView.getContext());
                String string = webView.getContext().getResources().getString(R.string.cash_ssl_error_info);
                builder.setPositiveButton(webView.getContext().getResources().getString(R.string.cash_confirm), new a(this, sslErrorHandler, customBrowserActivity));
                builder.setNeutralButton(webView.getContext().getResources().getString(R.string.cash_cancel), new b(this, sslErrorHandler, customBrowserActivity));
                try {
                    AlertDialog create = builder.create();
                    create.setTitle(webView.getContext().getResources().getString(R.string.cash_ssl_error_title));
                    create.setMessage(string);
                    create.show();
                    if (customBrowserActivity != null) {
                        customBrowserActivity.f = false;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (customBrowserActivity.g) {
                sslErrorHandler.proceed();
            } else {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("dacf25f5", new Object[]{this, webView, str})).booleanValue();
            }
            CustomBrowserActivity customBrowserActivity = this.b.get();
            if (customBrowserActivity != null) {
                try {
                    z = customBrowserActivity.overrideUrlLoading(webView, str);
                } catch (Exception e) {
                    String str2 = CustomBrowserActivity.l;
                    TLog.loge(str2, "webview内跳转地址有问题" + str, e);
                }
            }
            return z ? z : super.shouldOverrideUrlLoading(webView, str);
        }
    }

    public static void q3(WVUCWebView wVUCWebView) {
        wVUCWebView.setVerticalScrollbarOverlay(true);
        WebSettings settings = wVUCWebView.getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setDomStorageEnabled(true);
        settings.setAppCachePath(wVUCWebView.getCurrentContext().getApplicationContext().getDir("cache", 0).getPath());
        settings.setAllowFileAccess(true);
        settings.setAppCacheEnabled(true);
        settings.setCacheMode(-1);
        settings.setBuiltInZoomControls(false);
        new StringBuilder("user agent=").append(settings.getUserAgentString());
        try {
            Method method = wVUCWebView.getSettings().getClass().getMethod("setDomStorageEnabled", Boolean.TYPE);
            if (method != null) {
                method.invoke(wVUCWebView.getSettings(), Boolean.TRUE);
            }
        } catch (Exception e) {
            TLog.loge("", "2.2 setDomStorageEnabled Failed!", e);
        }
        try {
            wVUCWebView.removeJavascriptInterface("searchBoxJavaBridge_");
            wVUCWebView.removeJavascriptInterface("accessibility");
            wVUCWebView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        wVUCWebView.setBackgroundColor(0);
        wVUCWebView.getBackground().setAlpha(0);
    }

    public final void m3() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98532c97", new Object[]{this});
            return;
        }
        this.i.setBackgroundColor(0);
        Uri parse = Uri.parse(this.b);
        String queryParameter = parse.getQueryParameter("cashierHeight");
        String queryParameter2 = parse.getQueryParameter("fullPage");
        String queryParameter3 = parse.getQueryParameter("height");
        int i2 = 880;
        try {
            if (!TextUtils.isEmpty(queryParameter3)) {
                i2 = Integer.parseInt(queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter)) {
                i2 = Integer.parseInt(queryParameter);
            }
        } catch (Exception e) {
            e.printStackTrace();
            new StringBuilder("pa rseInt error:").append(e.getMessage());
        }
        if (!TextUtils.isEmpty(queryParameter2)) {
            i = Integer.parseInt(queryParameter2);
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            int i3 = displayMetrics.widthPixels;
            int i4 = displayMetrics.heightPixels;
            if (i == 0 || i2 <= 0) {
                this.j.setBackground(new ColorDrawable(0));
            }
            int i5 = (int) (i2 * (i3 / 750.0f));
            if (i5 <= i4) {
                i4 = i5;
            }
            if (i4 > 0) {
                ViewGroup.LayoutParams layoutParams = this.j.getLayoutParams();
                layoutParams.height = i4;
                this.j.setLayoutParams(layoutParams);
                this.j.setBackground(new ColorDrawable(-1));
                return;
            }
            return;
        }
        i = 0;
        DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
        int i32 = displayMetrics2.widthPixels;
        int i42 = displayMetrics2.heightPixels;
        if (i == 0) {
        }
        this.j.setBackground(new ColorDrawable(0));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Window window = getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            window.setAttributes(attributes);
        }
        try {
            Intent intent = getIntent();
            this.b = intent.getStringExtra("url");
            this.c = intent.getIntExtra("hasNavBar", 0);
            if ("false".equals(Uri.parse(this.b).getQueryParameter("dimEnabled"))) {
                getWindow().setDimAmount(0.0f);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.onCreate(bundle);
        r3();
        try {
            if (this.c == 1) {
                initToolBar();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        initViews();
        n3();
    }
}
