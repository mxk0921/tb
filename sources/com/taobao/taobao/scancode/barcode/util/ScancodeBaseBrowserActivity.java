package com.taobao.taobao.scancode.barcode.util;

import android.os.Build;
import android.os.Bundle;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.TaoInit;
import com.taobao.browser.BrowserHybridWebView;
import com.taobao.tao.BaseActivity;
import com.taobao.taobao.R;
import tb.et8;
import tb.fsw;
import tb.gso;
import tb.jzu;
import tb.nmd;
import tb.nso;
import tb.rso;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class ScancodeBaseBrowserActivity extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ACTIVITY_FINSH = 1102;
    public static final int GET_TITLE = 1104;
    public static final int PROGRESS_PAGE_FINSH = 1103;

    /* renamed from: a  reason: collision with root package name */
    public WVUCWebView f12910a;
    public ImageView b;
    public String c;
    public View e;
    public ViewGroup g;
    public boolean d = false;
    public final nmd f = et8.a("a2141.27835509");

    static {
        t2o.a(760217637);
    }

    public static /* synthetic */ Object ipc$super(ScancodeBaseBrowserActivity scancodeBaseBrowserActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2012646654:
                super.onWindowFocusChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1281559479:
                super.onRestart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/scancode/barcode/util/ScancodeBaseBrowserActivity");
        }
    }

    public static /* synthetic */ View l3(ScancodeBaseBrowserActivity scancodeBaseBrowserActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8030a1f7", new Object[]{scancodeBaseBrowserActivity});
        }
        return scancodeBaseBrowserActivity.e;
    }

    public static /* synthetic */ nmd m3(ScancodeBaseBrowserActivity scancodeBaseBrowserActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nmd) ipChange.ipc$dispatch("a7b3251a", new Object[]{scancodeBaseBrowserActivity});
        }
        return scancodeBaseBrowserActivity.f;
    }

    public static void v3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[0]);
        } else {
            fsw.l("SaveScancodeHistory", "com.taobao.taobao.scancode.history.services.SaveScancodeHistory");
        }
    }

    public abstract int n3();

    public String o3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d1e2c891", new Object[]{this});
        }
        return getIntent().getStringExtra("target_url");
    }

    @Override // com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        TaoInit.init();
        jzu.r(this, "Page_BarCodeDetail");
        jzu.t(getActivity(), "spm-cnt", "a2141.27835509");
        r3();
        u3();
        s3();
        t3();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        if (this.f12910a != null) {
            ViewGroup viewGroup = this.g;
            if (viewGroup != null) {
                viewGroup.removeAllViews();
            }
            this.f12910a.removeAllViews();
            this.f12910a.clearCache(true);
            this.f12910a.destroy();
            this.f12910a = null;
        }
        super.onDestroy();
    }

    @Override // com.taobao.tao.BaseActivity
    public boolean onPanelKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f42cd860", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i == 4) {
            if (this.e.isShown()) {
                this.e.setVisibility(4);
                this.f12910a.stopLoading();
                return true;
            } else if (this.f12910a.canGoBack()) {
                this.f12910a.goBack();
                return true;
            }
        }
        return false;
    }

    @Override // com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            super.onPause();
        }
    }

    @Override // android.app.Activity
    public void onRestart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c630bb7", new Object[]{this});
        } else {
            super.onRestart();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            super.onStop();
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
            return;
        }
        super.onWindowFocusChanged(z);
        String str = Build.MANUFACTURER;
        if (str != null && str.equalsIgnoreCase("Xiaomi") && !this.d) {
            supportInvalidateOptionsMenu();
            this.d = true;
        }
    }

    public void p3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b643df1f", new Object[]{this});
        } else {
            overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
        }
    }

    public final void q3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47f92b3e", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getLayoutInflater().inflate(n3(), (ViewGroup) null);
        this.g = viewGroup;
        setContentView(viewGroup);
        this.g.addView(getLayoutInflater().inflate(R.layout.scancode_base_browser, (ViewGroup) null), 0);
    }

    public void s3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7facea9c", new Object[]{this});
        } else {
            this.f12910a.loadUrl(this.c);
        }
    }

    public abstract void t3();

    public abstract void u3();

    public void w3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eda583fc", new Object[]{this});
        } else {
            fsw.m("SaveScancodeHistory", "com.taobao.taobao.scancode.history.services.SaveScancodeHistory", getClassLoader());
        }
    }

    public final void r3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        q3();
        p3();
        this.b = (ImageView) findViewById(R.id.scancode_browser_bg);
        this.e = findViewById(R.id.scancode_browser_progress);
        if (rso.g()) {
            this.f12910a = (WVUCWebView) findViewById(R.id.scancode_browser_webview);
            BrowserHybridWebView browserHybridWebView = (BrowserHybridWebView) findViewById(R.id.scancode_browser_hybrid_webview);
            if (browserHybridWebView != null) {
                browserHybridWebView.setVisibility(8);
            }
        } else {
            this.f12910a = (BrowserHybridWebView) findViewById(R.id.scancode_browser_hybrid_webview);
            WVUCWebView wVUCWebView = (WVUCWebView) findViewById(R.id.scancode_browser_webview);
            if (wVUCWebView != null) {
                wVUCWebView.setVisibility(8);
            }
        }
        this.f12910a.setVisibility(0);
        this.f12910a.setWebViewClient(new nso(this, this));
        this.c = o3();
        getSupportActionBar().setTitle(Localization.q(R.string.taobao_app_1007_1_18633));
        try {
            if (!TextUtils.isEmpty(this.c) && this.c.contains("setActionBarHide")) {
                getSupportActionBar().hide();
                gso.c("ScanBrowserActivity hide actionBar.url:" + this.c, new Object[0]);
            }
        } catch (Throwable unused) {
        }
        w3();
    }
}
