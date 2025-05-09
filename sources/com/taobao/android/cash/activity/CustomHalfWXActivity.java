package com.taobao.android.cash.activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.ali.user.open.ucc.data.ApiConstants;
import com.alibaba.aliweex.bundle.WeexPageFragment;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cash.MainFragment;
import com.taobao.android.cash.activity.a;
import com.taobao.android.nav.Nav;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.uikit.extend.component.error.Error;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.WXErrorCode;
import com.taobao.weex.utils.TBWXConfigManger;
import com.taobao.weex.utils.WXLogUtils;
import com.ut.mini.UTAnalytics;
import java.io.Serializable;
import java.util.HashMap;
import tb.a8s;
import tb.acq;
import tb.pl2;
import tb.psw;
import tb.qj4;
import tb.qsw;
import tb.t2o;
import tb.vtw;
import tb.wmc;
import tb.x4x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class CustomHalfWXActivity extends AppCompatActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String i = "cashdesk.CustomHalfWXActivity";
    public static String j;

    /* renamed from: a  reason: collision with root package name */
    public WeexPageFragment f6509a;
    public vtw b;
    public BroadcastReceiver c;
    public Activity d;
    public int e = 880;
    public boolean f = true;
    public int g = 0;
    public FragmentManager h;

    static {
        t2o.a(416284689);
    }

    public CustomHalfWXActivity() {
        String str = x4x.f31148a;
    }

    public static /* synthetic */ Object ipc$super(CustomHalfWXActivity customHalfWXActivity, String str, Object... objArr) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/cash/activity/CustomHalfWXActivity");
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

    public final void l3(String str, String str2, String str3, String str4, Serializable serializable, Class<? extends WeexPageFragment> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80b1c769", new Object[]{this, str, str2, str3, str4, serializable, cls});
            return;
        }
        Fragment findFragmentByTag = this.h.findFragmentByTag(str4);
        if (findFragmentByTag != null) {
            this.h.beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss();
        }
        WeexPageFragment weexPageFragment = (WeexPageFragment) u3(this, cls, str, str2, R.id.weex_multiple_container, str4, serializable);
        this.f6509a = weexPageFragment;
        weexPageFragment.setRenderListener(q3(this.b, weexPageFragment, str2, str3));
        this.f6509a.setDynamicUrlEnable(true);
    }

    public final String m3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d39fa303", new Object[]{this, str});
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                return Uri.parse(str).buildUpon().clearQuery().build().toString();
            }
            return str;
        } catch (Exception unused) {
            return str;
        }
    }

    public final void o3() {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98532c97", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.weex_multiple_container);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i3 = displayMetrics.widthPixels;
        int i4 = displayMetrics.heightPixels;
        if (this.g == 0 && (i2 = (this.e * i3) / 750) > 0 && i2 < i4) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams.height = i2;
            layoutParams.addRule(12);
            frameLayout.setLayoutParams(layoutParams);
            try {
                GradientDrawable gradientDrawable = new GradientDrawable();
                float f = (i3 * 24.0f) / 750.0f;
                gradientDrawable.setCornerRadii(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
                gradientDrawable.setShape(0);
                gradientDrawable.setColor(-1);
                frameLayout.setBackground(gradientDrawable);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i2), new Integer(i3), intent});
            return;
        }
        super.onActivityResult(i2, i3, intent);
        WeexPageFragment weexPageFragment = this.f6509a;
        if (weexPageFragment != null) {
            weexPageFragment.onActivityResult(i2, i3, intent);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        super.onBackPressed();
        v3(new Intent("com.ali.user.cash.close.all"));
    }

    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == R.id.cash_transparent_click) {
            pl2.a(this, new Intent("com.ali.user.cash.close.all"));
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        w3();
        if (this.c != null) {
            LocalBroadcastManager.getInstance(getApplicationContext()).unregisterReceiver(this.c);
        }
    }

    public final void p3(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("794732bf", new Object[]{this, intent});
            return;
        }
        String stringExtra = intent.getStringExtra(qj4.e);
        Nav.from(this).withExtras(intent.getExtras()).withCategory("com.taobao.intent.category.HYBRID_UI").skipPreprocess().disableTransition().disallowLoopback().toUri(stringExtra);
        a8s.b("Page_OverseaOldCashier", 2101, "Page_OverseaOldCashier_oversea_pay_error", "weex_error_url=" + stringExtra);
    }

    public WeexPageFragment.b q3(vtw vtwVar, WeexPageFragment weexPageFragment, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexPageFragment.b) ipChange.ipc$dispatch("33450a05", new Object[]{this, vtwVar, weexPageFragment, str, str2});
        }
        return new a(vtwVar, weexPageFragment, str, str2);
    }

    public void r3(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22872f3d", new Object[]{this, intent});
            return;
        }
        String str = i;
        TLog.logd(str, "onReceived: action = " + intent.getAction() + "activity:" + this.d);
        if ("com.ali.user.cash.close.all".equals(intent.getAction()) || "com.ali.user.cash.close.all.weex".equals(intent.getAction())) {
            this.d.setResult(0);
            finish();
            if (this.f) {
                overridePendingTransition(R.anim.push_up_in, R.anim.push_down_out);
            } else {
                overridePendingTransition(0, 0);
            }
        } else if ("com.ali.user.cash.close.weex".equals(intent.getAction())) {
            this.d.setResult(0);
            finish();
            overridePendingTransition(0, 0);
        }
    }

    public Fragment s3(FragmentActivity fragmentActivity, Class<? extends WeexPageFragment> cls, String str, String str2, String str3, HashMap<String, Object> hashMap, String str4, int i2, String str5, Serializable serializable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("c77543ca", new Object[]{this, fragmentActivity, cls, str, str2, str3, hashMap, str4, new Integer(i2), str5, serializable});
        }
        Fragment findFragmentByTag = this.h.findFragmentByTag(str5);
        if (findFragmentByTag != null) {
            return findFragmentByTag;
        }
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(str)) {
            bundle.putString(WeexPageFragment.FRAGMENT_ARG_TEMPLATE, str);
        }
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString(WeexPageFragment.FRAGMENT_ARG_BUNDLE_URL, str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            bundle.putString(WeexPageFragment.FRAGMENT_ARG_RENDER_URL, str3);
        }
        if (hashMap != null) {
            bundle.putSerializable(WeexPageFragment.FRAGMENT_ARG_CUSTOM_OPT, hashMap);
        }
        if (!TextUtils.isEmpty(str4)) {
            bundle.putString(WeexPageFragment.FRAGMENT_ARG_INIT_DATA, str4);
        }
        if (serializable != null) {
            bundle.putSerializable(WeexPageFragment.FRAGMENT_ARG_FROM_ACTIVITY, serializable);
        }
        Fragment instantiate = Fragment.instantiate(fragmentActivity, cls.getName(), bundle);
        FragmentTransaction beginTransaction = this.h.beginTransaction();
        if (TextUtils.isEmpty(str5)) {
            str5 = WeexPageFragment.FRAGMENT_TAG;
        }
        beginTransaction.add(i2, instantiate, str5);
        beginTransaction.commitAllowingStateLoss();
        return instantiate;
    }

    public final boolean t3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43817025", new Object[]{this})).booleanValue();
        }
        boolean isDegrade = TBWXConfigManger.getInstance().isDegrade();
        boolean isHardwareSupport = WXEnvironment.isHardwareSupport();
        boolean isInitialized = WXSDKEngine.isInitialized();
        String str = i;
        WXLogUtils.d(str, "degrade:" + isDegrade + " support:" + isHardwareSupport + " init:" + isInitialized);
        if (isDegrade || !isHardwareSupport || !isInitialized) {
            return false;
        }
        return true;
    }

    public Fragment u3(FragmentActivity fragmentActivity, Class<? extends WeexPageFragment> cls, String str, String str2, int i2, String str3, Serializable serializable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("f6e2d3a", new Object[]{this, fragmentActivity, cls, str, str2, new Integer(i2), str3, serializable});
        }
        return s3(fragmentActivity, cls, null, str, str2, null, null, i2, str3, serializable);
    }

    public boolean v3(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b9ca1a6", new Object[]{this, intent})).booleanValue();
        }
        boolean sendBroadcast = LocalBroadcastManager.getInstance(getApplicationContext()).sendBroadcast(intent);
        TLog.logd("", intent.getAction() + "; sendResult=" + sendBroadcast);
        return sendBroadcast;
    }

    public final void w3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58e84e79", new Object[]{this});
        } else {
            WVStandardEventCenter.postNotificationToJS("ALBBCashierCloseNotification", j);
        }
    }

    public final void n3(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91525a50", new Object[]{this, intent});
        } else if (intent != null) {
            String stringExtra = intent.getStringExtra(qj4.e);
            this.e = intent.getIntExtra("height", 880);
            intent.getStringExtra("type");
            this.g = intent.getIntExtra("fullPage", 0);
            String stringExtra2 = intent.getStringExtra(qj4.c);
            qsw a2 = psw.a();
            if (a2 != null) {
                stringExtra2 = a2.dealUrlScheme(stringExtra2);
            }
            String m3 = m3(stringExtra2);
            Serializable serializableExtra = getIntent() != null ? getIntent().getSerializableExtra("wx_options") : null;
            o3();
            l3(stringExtra, stringExtra2, m3, WeexPageFragment.FRAGMENT_TAG, serializableExtra, MainFragment.class);
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
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ApiConstants.ApiField.USER_ACTION, (Object) "1");
        j = JSON.toJSONString(jSONObject);
        this.d = this;
        this.h = getSupportFragmentManager();
        this.c = new BroadcastReceiver() { // from class: com.taobao.android.cash.activity.CustomHalfWXActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/cash/activity/CustomHalfWXActivity$1");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else {
                    CustomHalfWXActivity.this.r3(intent);
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.ali.user.cash.close.all");
        intentFilter.addAction("com.ali.user.cash.close.all.weex");
        intentFilter.addAction("com.ali.user.cash.close.weex");
        LocalBroadcastManager.getInstance(getApplicationContext()).registerReceiver(this.c, intentFilter);
        if (!t3()) {
            if (WXEnvironment.isApkDebugable()) {
                Toast.makeText(this, "WEEX_SDK 初始化失败!", 0).show();
            }
            p3(getIntent());
            finish();
            return;
        }
        setContentView(R.layout.ali_weex_half_container);
        vtw vtwVar = new vtw(this);
        this.b = vtwVar;
        vtwVar.a();
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        n3(getIntent());
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        this.f = false;
        HashMap hashMap = new HashMap();
        hashMap.put("spm-url", "a2141.b12194043.0.0");
        UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(hashMap);
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        this.f = true;
        HashMap hashMap = new HashMap();
        hashMap.put("spm-cnt", "a2141.b12194043.0.0");
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(this, "Page_OverseaOldCashier");
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this, hashMap);
        UTAnalytics.getInstance().getDefaultTracker().pageAppear(this, "Page_OverseaOldCashier");
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a extends WeexPageFragment.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final vtw f6511a;
        public final WeexPageFragment b;
        public final String c;
        public final String d;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.cash.activity.CustomHalfWXActivity$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class View$OnClickListenerC0341a implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public View$OnClickListenerC0341a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                WeexPageFragment weexPageFragment = a.this.b;
                if (weexPageFragment != null && !TextUtils.isEmpty(weexPageFragment.getOriginalRenderUrl()) && !TextUtils.isEmpty(a.this.b.getOriginalUrl())) {
                    WeexPageFragment weexPageFragment2 = a.this.b;
                    weexPageFragment2.replace(weexPageFragment2.getOriginalUrl(), a.this.b.getOriginalRenderUrl());
                }
            }
        }

        static {
            t2o.a(416284691);
        }

        public a(vtw vtwVar, WeexPageFragment weexPageFragment, String str, String str2) {
            this.f6511a = vtwVar;
            this.b = weexPageFragment;
            this.c = str;
            this.d = str2;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 578309873) {
                super.onException((WXSDKInstance) objArr[0], ((Boolean) objArr[1]).booleanValue(), (String) objArr[2], (String) objArr[3]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/cash/activity/CustomHalfWXActivity$WXRenderListenerImp");
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("dc42468e", new Object[]{this});
            }
            HashMap hashMap = new HashMap();
            hashMap.put("url", this.c);
            hashMap.put("pageName", this.d);
            return JSON.toJSONString(hashMap);
        }

        @Override // com.alibaba.aliweex.bundle.WeexPageFragment.b
        public View onCreateView(WXSDKInstance wXSDKInstance, View view) {
            View view2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("31af356d", new Object[]{this, wXSDKInstance, view});
            }
            vtw vtwVar = this.f6511a;
            if (vtwVar != null) {
                view2 = vtwVar.d(wXSDKInstance, view);
            } else {
                view2 = null;
            }
            if (view2 == null) {
                return view;
            }
            return view2;
        }

        @Override // com.alibaba.aliweex.bundle.WeexPageFragment.b, tb.gbe
        public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
                return;
            }
            WXLogUtils.d(CustomHalfWXActivity.i, "into--[onRenderSuccess]");
            vtw vtwVar = this.f6511a;
            if (vtwVar != null) {
                vtwVar.c(wXSDKInstance);
            }
        }

        @Override // com.alibaba.aliweex.bundle.WeexPageFragment.b, tb.gbe
        public void onViewCreated(WXSDKInstance wXSDKInstance, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view});
                return;
            }
            WXLogUtils.d(CustomHalfWXActivity.i, "into--[onViewCreated]");
            wXSDKInstance.L0(new a.C0342a(this.c, wXSDKInstance.getContext()));
        }

        @Override // com.alibaba.aliweex.bundle.WeexPageFragment.b
        public void onException(WXSDKInstance wXSDKInstance, boolean z, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("22784ef1", new Object[]{this, wXSDKInstance, new Boolean(z), str, str2});
                return;
            }
            super.onException(wXSDKInstance, z, str, str2);
            vtw vtwVar = this.f6511a;
            if (vtwVar != null) {
                vtwVar.b(wXSDKInstance, str, str2);
            }
            if (z) {
                Context context = wXSDKInstance.getContext();
                String bundleUrl = wXSDKInstance.getBundleUrl();
                Intent intent = new Intent(context, CustomBrowserActivity.class);
                intent.putExtra("url", bundleUrl);
                intent.putExtra("hasNavBar", bundleUrl.contains("hasNavBar=1") ? 1 : 0);
                context.startActivity(intent);
                WeexPageFragment weexPageFragment = this.b;
                if (weexPageFragment != null) {
                    weexPageFragment.destroyWeex();
                }
                AppMonitor.Alarm.commitFail("weex", "renderResult", a(), "99301", str2);
                LocalBroadcastManager.getInstance(wXSDKInstance.getContext()).sendBroadcast(new Intent("com.ali.user.cash.close.weex"));
            }
            if (TextUtils.equals(str, WXErrorCode.WX_DEGRAD_ERR_NETWORK_BUNDLE_DOWNLOAD_FAILED.getErrorCode())) {
                try {
                    TBErrorView tBErrorView = new TBErrorView(wXSDKInstance.getContext());
                    Error newError = Error.Factory.newError("ANDROID_SYS_NETWORK_ERROR", "网络错误,请稍后再试");
                    newError.url = wXSDKInstance.getBundleUrl();
                    tBErrorView.setError(newError);
                    tBErrorView.setBackgroundColor(-1);
                    tBErrorView.setButton(TBErrorView.ButtonType.BUTTON_LEFT, wmc.REFRESH, new View$OnClickListenerC0341a());
                    tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_RIGHT, 8);
                    if (this.b.getView() != null && (this.b.getView() instanceof ViewGroup)) {
                        ((ViewGroup) this.b.getView()).addView(tBErrorView);
                    }
                    if (this.b.getView() != null) {
                        View findViewById = this.b.getView().findViewById(R.id.wa_content_error_root);
                        if (findViewById != null) {
                            findViewById.setVisibility(4);
                        } else if ((this.b.getView() instanceof FrameLayout) && ((FrameLayout) this.b.getView()).getChildCount() > 0) {
                            for (int i = 0; i < ((FrameLayout) this.b.getView()).getChildCount(); i++) {
                                if (((FrameLayout) this.b.getView()).getChildAt(i) instanceof RelativeLayout) {
                                    ((FrameLayout) this.b.getView()).getChildAt(i).setVisibility(4);
                                    return;
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    WXLogUtils.e("error in render network failure view of TBErrorView", th);
                }
            }
        }
    }
}
