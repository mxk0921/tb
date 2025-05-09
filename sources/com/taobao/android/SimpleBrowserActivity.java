package com.taobao.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.taobao.windvane.extra.uc.WVUCWebViewFragment;
import android.taobao.windvane.fragment.WVWebViewFragment;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import androidx.core.view.MenuItemCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.BaseActivity;
import com.taobao.taobao.R;
import com.uc.webview.export.WebView;
import tb.acq;
import tb.t2o;
import tb.wmc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class SimpleBrowserActivity extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String b = "maliprod.alipay.com";

    /* renamed from: a  reason: collision with root package name */
    public WVUCWebViewFragment f6245a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements MenuItem.OnMenuItemClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f2df3d0b", new Object[]{this, menuItem})).booleanValue();
            }
            if (SimpleBrowserActivity.l3(SimpleBrowserActivity.this).getWebView() != null) {
                SimpleBrowserActivity.l3(SimpleBrowserActivity.this).getWebView().reload();
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b extends WVUCWebViewClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(775946286);
        }

        public b(Activity activity) {
            super(activity);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -1171743094) {
                super.onLoadResource((WebView) objArr[0], (String) objArr[1]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/SimpleBrowserActivity$LightWVUCWebViewClient");
        }

        @Override // com.uc.webview.export.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba289e8a", new Object[]{this, webView, str});
                return;
            }
            str.contains(SimpleBrowserActivity.m3());
            super.onLoadResource(webView, str);
        }
    }

    static {
        t2o.a(775946284);
    }

    public static /* synthetic */ Object ipc$super(SimpleBrowserActivity simpleBrowserActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1635453101:
                return new Boolean(super.onCreateOptionsMenu((Menu) objArr[0]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/SimpleBrowserActivity");
        }
    }

    public static /* synthetic */ WVUCWebViewFragment l3(SimpleBrowserActivity simpleBrowserActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVUCWebViewFragment) ipChange.ipc$dispatch("89c20253", new Object[]{simpleBrowserActivity});
        }
        return simpleBrowserActivity.f6245a;
    }

    public static /* synthetic */ String m3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]);
        }
        return b;
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

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        WVUCWebViewFragment wVUCWebViewFragment = this.f6245a;
        if (wVUCWebViewFragment != null) {
            wVUCWebViewFragment.onActivityResult(i, i2, intent);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        WVUCWebViewFragment wVUCWebViewFragment = this.f6245a;
        if (wVUCWebViewFragment != null && !wVUCWebViewFragment.onBackPressed()) {
            finish();
        }
    }

    @Override // com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        setTheme(R.style.Theme_NoBackgroundAndTitle);
        super.onCreate(bundle);
        setContentView(R.layout.wvfragementcontainer);
        Bundle bundle2 = new Bundle();
        Intent intent = getIntent();
        if (intent != null && !TextUtils.isEmpty(intent.getDataString())) {
            bundle2.putString(WVWebViewFragment.h, intent.getDataString());
        } else if (intent != null) {
            bundle2 = intent.getExtras();
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        WVUCWebViewFragment wVUCWebViewFragment = new WVUCWebViewFragment(this);
        this.f6245a = wVUCWebViewFragment;
        wVUCWebViewFragment.setWebViewClient(new b(this));
        this.f6245a.setArguments(bundle2);
        beginTransaction.add(R.id.browser_fragment_layout, this.f6245a);
        beginTransaction.commit();
        supportFragmentManager.executePendingTransactions();
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e84f753", new Object[]{this, menu})).booleanValue();
        }
        MenuItem icon = menu.add(wmc.REFRESH).setIcon(R.drawable.wv_icon_actionbar_refresh_48);
        MenuItemCompat.setShowAsAction(icon, 1);
        icon.setOnMenuItemClickListener(new a());
        return super.onCreateOptionsMenu(menu);
    }
}
