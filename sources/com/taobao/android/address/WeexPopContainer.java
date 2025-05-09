package com.taobao.android.address;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.aliweex.bundle.WeexPageFragment;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.themis.ThemisConfig;
import com.taobao.android.nav.Nav;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.themis.external.embed.TMSEmbed;
import com.taobao.themis.external.embed.TMSEmbedSolutionType;
import com.taobao.themis.external.embed.Weex2StartParams;
import com.taobao.themis.kernel.extension.page.rum.TMSEmbedPresentModeType;
import com.taobao.tlog.adapter.AdapterForTLog;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.uikit.extend.component.error.Error;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.WXErrorCode;
import com.taobao.weex.d;
import com.taobao.weex.utils.TBWXConfigManger;
import com.taobao.weex.utils.WXLogUtils;
import java.io.Serializable;
import java.util.HashMap;
import tb.acq;
import tb.k7z;
import tb.kf0;
import tb.mtv;
import tb.psw;
import tb.qj4;
import tb.qsw;
import tb.rf0;
import tb.sxl;
import tb.utw;
import tb.wmc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class WeexPopContainer extends AppCompatActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_DEGRADE_TO_WINDVANE = "degradeToWindVane";
    public static final String BROWSER_ONLY_CATEGORY = "com.taobao.intent.category.HYBRID_UI";
    public static final String DEGRADE_MSG = "degrade_msg";
    public static final String DEGRADE_TYPE = "degrade_type";
    public static final String DEGRADE_TYPE_JS_ERROR = "DEGRADE_TYPE_JS_ERROR";
    public static final String PARAMS_IS_ADDRESS_USER_WEEX2 = "is_address_user_weex2";
    public static final String PARAMS_IS_TRANSPARENT = "PARAMS_IS_TRANSPARENT";
    public static final String PARAMS_SCENE = "params_scene";
    public static final String PARAMS_SHOW_LOADING = "show_loading";
    public static final String WX_APPBAR = "_wx_appbar";

    /* renamed from: a  reason: collision with root package name */
    public WeexPageFragment f6291a;
    public utw b;
    public TMSEmbed c;
    public View d;
    public String e;
    public FragmentManager f;
    public boolean g = false;
    public View h;
    public View i;
    public View j;
    public RelativeLayout k;
    public ProgressBar l;
    public String m;
    public boolean n;
    public boolean o;
    public long p;
    public long q;
    public long r;

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
                WeexPopContainer.this.m3();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                WeexPopContainer.this.m3();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c extends TMSEmbed.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public long f6294a = 0;
        public long b = 0;
        public long c = 0;
        public final /* synthetic */ long d;

        public c(long j) {
            this.d = j;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -1799497502:
                    super.c((String) objArr[0], (String) objArr[1]);
                    return null;
                case -936190188:
                    super.m();
                    return null;
                case -799572052:
                    super.d();
                    return null;
                case -302283915:
                    super.n();
                    return null;
                case 396799279:
                    return new Boolean(super.b(((Boolean) objArr[0]).booleanValue(), (String) objArr[1], (String) objArr[2]));
                case 940156793:
                    super.f();
                    return null;
                case 1131744663:
                    super.e();
                    return null;
                case 2123836685:
                    super.l((String) objArr[0], (String) objArr[1]);
                    return null;
                default:
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/address/WeexPopContainer$3");
            }
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public boolean b(boolean z, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("17a6ad2f", new Object[]{this, new Boolean(z), str, str2})).booleanValue();
            }
            IpChange ipChange2 = WeexPopContainer.$ipChange;
            AdapterForTLog.loge("addressMap", "onDowngrade canAutoDowngrade:" + z + " errorCode:" + str + " errorMsg:" + str2);
            return super.b(z, str, str2);
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void c(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94bdd8e2", new Object[]{this, str, str2});
                return;
            }
            super.c(str, str2);
            IpChange ipChange2 = WeexPopContainer.$ipChange;
            AdapterForTLog.loge("addressMap", "onJSException errorCode:" + str + " errorMsg:" + str2);
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0577fac", new Object[]{this});
                return;
            }
            super.d();
            IpChange ipChange2 = WeexPopContainer.$ipChange;
            AdapterForTLog.loge("addressMap", sxl.LAUNCHER_FINISH_TIME);
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43750d97", new Object[]{this});
                return;
            }
            super.e();
            IpChange ipChange2 = WeexPopContainer.$ipChange;
            AdapterForTLog.loge("addressMap", sxl.LAUNCHER_START_TIME);
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3809a779", new Object[]{this});
                return;
            }
            super.f();
            IpChange ipChange2 = WeexPopContainer.$ipChange;
            AdapterForTLog.loge("addressMap", "onPop");
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void l(String str, String str2) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e972d0d", new Object[]{this, str, str2});
                return;
            }
            super.l(str, str2);
            try {
                WeexPopContainer.this.l.setVisibility(8);
                IpChange ipChange2 = WeexPopContainer.$ipChange;
                StringBuilder sb = new StringBuilder("onRenderFailed errorCode:");
                sb.append(str);
                sb.append(" errorMsg:");
                sb.append(str2);
                sb.append("intent is null?");
                if (WeexPopContainer.this.getIntent() != null) {
                    z = false;
                }
                sb.append(z);
                sb.append(",mWeexUrl=");
                sb.append(WeexPopContainer.this.m);
                AdapterForTLog.loge("addressMap", sb.toString());
                this.c = System.currentTimeMillis();
                mtv.c("fail_weex_render", "" + this.c, String.valueOf(this.c - this.f6294a), null);
            } catch (Throwable th) {
                IpChange ipChange3 = WeexPopContainer.$ipChange;
                AdapterForTLog.loge("addressMap", "handle  onRenderFailed excetion", th);
            }
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c832df14", new Object[]{this});
                return;
            }
            super.m();
            IpChange ipChange2 = WeexPopContainer.$ipChange;
            AdapterForTLog.loge("addressMap", sxl.RENDER_START_TIME);
            this.f6294a = System.currentTimeMillis();
            mtv.c("start_weex_render", "" + this.f6294a, String.valueOf(this.f6294a - this.d), null);
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edfb8375", new Object[]{this});
                return;
            }
            super.n();
            IpChange ipChange2 = WeexPopContainer.$ipChange;
            AdapterForTLog.loge("addressMap", sxl.RENDER_SUCCESS_TIME);
            this.b = System.currentTimeMillis();
            mtv.c("finish_weex_render", "" + this.b, String.valueOf(this.b - this.f6294a), null);
            mtv.c("success_weex_render", "" + this.b, String.valueOf(this.b - WeexPopContainer.this.r), null);
            WeexPopContainer.this.l.setVisibility(8);
        }
    }

    public static /* synthetic */ Object ipc$super(WeexPopContainer weexPopContainer, String str, Object... objArr) {
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
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/address/WeexPopContainer");
        }
    }

    public String assemblePageName(String str) {
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

    public void degradeToWindVane(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("794732bf", new Object[]{this, intent});
        } else {
            Nav.from(this).withExtras(intent.getExtras()).withCategory("com.taobao.intent.category.HYBRID_UI").skipPreprocess().disableTransition().disallowLoopback().toUri(kf0.a(this, intent.getStringExtra(qj4.e)));
        }
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        overridePendingTransition(0, 0);
        this.q = System.currentTimeMillis();
        mtv.c("finishWeex2Act" + this.n, "" + this.q, String.valueOf(this.q - this.p), null);
        AdapterForTLog.loge("addressMap", "activity : " + this);
    }

    public WeexPageFragment.b getWXRenderListenerAdapter(utw utwVar, WeexPageFragment weexPageFragment, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexPageFragment.b) ipChange.ipc$dispatch("e83b33d1", new Object[]{this, utwVar, weexPageFragment, str, str2});
        }
        return new d(utwVar, weexPageFragment, str, str2);
    }

    public void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        this.k = (RelativeLayout) findViewById(R.id.address_common_container);
        this.h = findViewById(R.id.cash_transparent_click);
        this.i = findViewById(R.id.aliaddress_nav);
        this.j = findViewById(R.id.weex_multiple_container);
        this.l = (ProgressBar) findViewById(R.id.address_progress);
        if (this.g) {
            r3();
            return;
        }
        this.h.setVisibility(0);
        this.i.setVisibility(0);
        this.j.setBackgroundResource(R.color.ali_address_color);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        TUrlImageView tUrlImageView = (TUrlImageView) findViewById(R.id.aliuser_dialog_title_cancel_tv);
        tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN01NmOQEc1UCnz10fJJN_!!6000000002482-2-tps-48-49.png");
        tUrlImageView.setOnClickListener(new a());
        ViewProxy.setOnClickListener(this.h, new b());
        try {
            ((TextView) findViewById(R.id.aliuser_address_title)).setTypeface(Typeface.createFromAsset(getAssets(), k7z.ALIBABA_FONT_MIDDLE));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public boolean isEnvironmentReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43817025", new Object[]{this})).booleanValue();
        }
        boolean isDegrade = TBWXConfigManger.getInstance().isDegrade();
        boolean isHardwareSupport = WXEnvironment.isHardwareSupport();
        boolean isInitialized = WXSDKEngine.isInitialized();
        WXLogUtils.d("addressMap", "degrade:" + isDegrade + " support:" + isHardwareSupport + " init:" + isInitialized);
        if (isDegrade || !isHardwareSupport || !isInitialized) {
            return false;
        }
        return true;
    }

    public void l3(String str, String str2, String str3, String str4, Serializable serializable, Class<? extends WeexPageFragment> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80b1c769", new Object[]{this, str, str2, str3, str4, serializable, cls});
            return;
        }
        Fragment findFragmentByTag = this.f.findFragmentByTag(str4);
        if (findFragmentByTag != null) {
            this.f.beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss();
        }
        WeexPageFragment weexPageFragment = (WeexPageFragment) q3(this, cls, str, str2, R.id.weex_multiple_container, str4, serializable);
        this.f6291a = weexPageFragment;
        weexPageFragment.setRenderListener(getWXRenderListenerAdapter(this.b, weexPageFragment, str2, str3));
        this.f6291a.setDynamicUrlEnable(true);
    }

    public void m3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a58e0b5", new Object[]{this});
            return;
        }
        setResult(0);
        finish();
    }

    public void n3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("297b9b93", new Object[]{this});
            return;
        }
        AdapterForTLog.loge("addressMap", "address weex1.0");
        utw utwVar = new utw(this);
        this.b = utwVar;
        utwVar.a();
        qsw a2 = psw.a();
        if (a2 != null) {
            this.m = a2.dealUrlScheme(this.m);
        }
        l3(this.e, this.m, assemblePageName(this.m), WeexPageFragment.FRAGMENT_TAG, getIntent() != null ? getIntent().getSerializableExtra("wx_options") : null, MainFragment.class);
    }

    public void o3() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec32ebc", new Object[]{this});
            return;
        }
        AdapterForTLog.loge("addressMap", "address weex2.0 url:" + this.m);
        if (TextUtils.isEmpty(this.m)) {
            finish();
            return;
        }
        ProgressBar progressBar = this.l;
        if (!this.o || !rf0.j("address_show_common_loading")) {
            i = 8;
        }
        progressBar.setVisibility(i);
        r3();
        Weex2StartParams weex2StartParams = new Weex2StartParams();
        weex2StartParams.setUrl(this.m);
        weex2StartParams.setEmbedType(TMSEmbedPresentModeType.POP);
        weex2StartParams.setBgTransparent(Boolean.TRUE);
        this.r = System.currentTimeMillis();
        mtv.c("createWeex2", "" + this.r, String.valueOf(this.r - this.p), null);
        TMSEmbed tMSEmbed = new TMSEmbed(this, TMSEmbedSolutionType.WEEX);
        this.c = tMSEmbed;
        tMSEmbed.i(weex2StartParams);
        long currentTimeMillis = System.currentTimeMillis();
        mtv.c("initWeex2", "" + currentTimeMillis, String.valueOf(currentTimeMillis - this.r), null);
        this.d = this.c.h();
        this.k.addView(this.d, new RelativeLayout.LayoutParams(-1, -1));
        this.c.r(new c(currentTimeMillis));
        this.c.u();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        WeexPageFragment weexPageFragment = this.f6291a;
        if (weexPageFragment != null) {
            weexPageFragment.onActivityResult(i, i2, intent);
        }
        TMSEmbed tMSEmbed = this.c;
        if (tMSEmbed != null) {
            tMSEmbed.l(i, i2, intent);
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
        this.f = getSupportFragmentManager();
        Intent intent = getIntent();
        initData(intent);
        this.p = System.currentTimeMillis();
        mtv.c("createWeex2Act" + this.n, "" + this.p, "", null);
        if (this.n || isEnvironmentReady()) {
            getWindow().setSoftInputMode(32);
            setContentView(R.layout.aliuser_weex_pop_container);
            initView();
            if (this.n) {
                try {
                    o3();
                } catch (Exception e) {
                    AdapterForTLog.loge("addressMap", "address weex2.0 error,", e);
                }
            } else {
                n3();
            }
        } else {
            degradeToWindVane(intent);
            finish();
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
        TMSEmbed tMSEmbed = this.c;
        if (tMSEmbed != null) {
            tMSEmbed.d();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        TMSEmbed tMSEmbed = this.c;
        if (tMSEmbed != null) {
            tMSEmbed.k();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        TMSEmbed tMSEmbed = this.c;
        if (tMSEmbed != null) {
            tMSEmbed.m();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        TMSEmbed tMSEmbed = this.c;
        if (tMSEmbed != null) {
            tMSEmbed.n();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        TMSEmbed tMSEmbed = this.c;
        if (tMSEmbed != null) {
            tMSEmbed.o();
        }
    }

    public Fragment p3(FragmentActivity fragmentActivity, Class<? extends WeexPageFragment> cls, String str, String str2, String str3, HashMap<String, Object> hashMap, String str4, int i, String str5, Serializable serializable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("c77543ca", new Object[]{this, fragmentActivity, cls, str, str2, str3, hashMap, str4, new Integer(i), str5, serializable});
        }
        Fragment findFragmentByTag = this.f.findFragmentByTag(str5);
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
        FragmentTransaction beginTransaction = this.f.beginTransaction();
        beginTransaction.setCustomAnimations(R.anim.address_pop_enter_anim, R.anim.address_pop_exit_anim);
        if (TextUtils.isEmpty(str5)) {
            str5 = WeexPageFragment.FRAGMENT_TAG;
        }
        beginTransaction.add(i, instantiate, str5);
        beginTransaction.commitAllowingStateLoss();
        return instantiate;
    }

    public Fragment q3(FragmentActivity fragmentActivity, Class<? extends WeexPageFragment> cls, String str, String str2, int i, String str3, Serializable serializable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("f6e2d3a", new Object[]{this, fragmentActivity, cls, str, str2, new Integer(i), str3, serializable});
        }
        return p3(fragmentActivity, cls, null, str, str2, null, null, i, str3, serializable);
    }

    public void r3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e5d5708", new Object[]{this});
            return;
        }
        rf0.y(this);
        this.h.setVisibility(8);
        this.i.setVisibility(8);
        this.j.setBackgroundResource(R.color.transparent);
    }

    public void initData(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("361efd1e", new Object[]{this, intent});
        } else if (intent != null) {
            this.g = intent.getBooleanExtra(PARAMS_IS_TRANSPARENT, false);
            this.o = intent.getBooleanExtra(PARAMS_SHOW_LOADING, false);
            String stringExtra = intent.getStringExtra(PARAMS_SCENE);
            this.n = intent.getBooleanExtra(PARAMS_IS_ADDRESS_USER_WEEX2, ThemisConfig.e(stringExtra));
            intent.getIntExtra("height", 880);
            intent.getStringExtra("type");
            intent.getIntExtra("fullPage", 0);
            this.e = intent.getStringExtra(qj4.e);
            this.m = intent.getStringExtra(qj4.c);
            AdapterForTLog.loge("addressMap", "initData isUserWeex2:" + this.n + " scene:" + stringExtra + " bundleUrl:" + this.m + " mWeexUrl:" + this.e);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class d extends WeexPageFragment.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final utw f6295a;
        public final WeexPageFragment b;
        public final String c;
        public final String d;

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
                    return;
                }
                WeexPageFragment weexPageFragment = d.this.b;
                if (weexPageFragment != null && !TextUtils.isEmpty(weexPageFragment.getOriginalRenderUrl()) && !TextUtils.isEmpty(d.this.b.getOriginalUrl())) {
                    WeexPageFragment weexPageFragment2 = d.this.b;
                    weexPageFragment2.replace(weexPageFragment2.getOriginalUrl(), d.this.b.getOriginalRenderUrl());
                }
            }
        }

        public d(utw utwVar, WeexPageFragment weexPageFragment, String str, String str2) {
            this.f6295a = utwVar;
            this.b = weexPageFragment;
            this.c = str;
            this.d = str2;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            if (str.hashCode() == 578309873) {
                super.onException((WXSDKInstance) objArr[0], ((Boolean) objArr[1]).booleanValue(), (String) objArr[2], (String) objArr[3]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/address/WeexPopContainer$WXRenderListenerImp");
        }

        public String a() {
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
            utw utwVar = this.f6295a;
            if (utwVar != null) {
                view2 = utwVar.j(wXSDKInstance, view);
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
            IpChange ipChange2 = WeexPopContainer.$ipChange;
            WXLogUtils.d("addressMap", "into--[onRenderSuccess]");
            utw utwVar = this.f6295a;
            if (utwVar != null) {
                utwVar.i(wXSDKInstance);
            }
        }

        @Override // com.alibaba.aliweex.bundle.WeexPageFragment.b, tb.gbe
        public void onViewCreated(WXSDKInstance wXSDKInstance, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view});
                return;
            }
            IpChange ipChange2 = WeexPopContainer.$ipChange;
            WXLogUtils.d("addressMap", "into--[onViewCreated]");
            wXSDKInstance.L0(new d.b(this.c, wXSDKInstance.getContext()));
        }

        @Override // com.alibaba.aliweex.bundle.WeexPageFragment.b
        public void onException(WXSDKInstance wXSDKInstance, boolean z, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("22784ef1", new Object[]{this, wXSDKInstance, new Boolean(z), str, str2});
                return;
            }
            super.onException(wXSDKInstance, z, str, str2);
            utw utwVar = this.f6295a;
            if (utwVar != null) {
                utwVar.c(wXSDKInstance, str, str2);
            }
            if (z) {
                WeexPageFragment weexPageFragment = this.b;
                if (weexPageFragment != null) {
                    weexPageFragment.destroyWeex();
                }
                Intent intent = new Intent(WeexPopContainer.ACTION_DEGRADE_TO_WINDVANE);
                intent.putExtra(qj4.c, wXSDKInstance.getBundleUrl());
                intent.putExtra(WeexPopContainer.DEGRADE_TYPE, WeexPopContainer.DEGRADE_TYPE_JS_ERROR);
                intent.putExtra(WeexPopContainer.DEGRADE_MSG, "降级到h5 Instance创建失败或者网络错误ErrorCode= " + str + "详细错误信息\n" + str2);
                LocalBroadcastManager.getInstance(wXSDKInstance.getContext()).sendBroadcast(intent);
                AppMonitor.Alarm.commitFail("weex", "renderResult", a(), "99301", str2);
            }
            if (TextUtils.equals(str, WXErrorCode.WX_DEGRAD_ERR_NETWORK_BUNDLE_DOWNLOAD_FAILED.getErrorCode())) {
                try {
                    TBErrorView tBErrorView = new TBErrorView(wXSDKInstance.getContext());
                    Error newError = Error.Factory.newError("ANDROID_SYS_NETWORK_ERROR", "网络错误,请稍后再试");
                    newError.url = wXSDKInstance.getBundleUrl();
                    tBErrorView.setError(newError);
                    tBErrorView.setBackgroundColor(this.b.getResources().getColor(R.color.ali_address_color));
                    tBErrorView.setButton(TBErrorView.ButtonType.BUTTON_LEFT, wmc.REFRESH, new a());
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
