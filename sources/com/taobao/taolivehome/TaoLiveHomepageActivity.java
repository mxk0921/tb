package com.taobao.taolivehome;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.ali.user.mobile.info.AppInfo;
import com.alibaba.security.realidentity.g4;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.live.home.h5container.TBLiveHomePlugin;
import com.taobao.live.timemove.weex.TBLivePlatformView;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.taobaocompat.lifecycle.IUtActivityNotTrack;
import com.taobao.taolive.room.launch.TaoLiveLaunchInitializer;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTControlHitBuilder;
import java.util.HashMap;
import tb.acq;
import tb.b8e;
import tb.bl9;
import tb.bqg;
import tb.cus;
import tb.d7r;
import tb.d9m;
import tb.e2h;
import tb.fsw;
import tb.kir;
import tb.qvs;
import tb.rbu;
import tb.rvs;
import tb.sj7;
import tb.sj9;
import tb.sjr;
import tb.t2o;
import tb.t6f;
import tb.tbc;
import tb.tbt;
import tb.tvs;
import tb.uyg;
import tb.v2s;
import tb.v6t;
import tb.vx9;
import tb.vxm;
import tb.wca;
import tb.wqg;
import tb.yvs;
import tb.z9u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TaoLiveHomepageActivity extends CustomBaseActivity implements wqg, b8e, tbc, IUtActivityNotTrack, v6t.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARAM_LIVE_SOURCE = "livesource";
    public static final String n = TaoLiveHomepageActivity.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public long f13361a;
    public boolean f;
    public long g;
    public String h;
    public Uri i;
    public boolean j;
    public Object k;
    public boolean m;
    public boolean b = false;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public final BroadcastReceiver l = new BroadcastReceiver() { // from class: com.taobao.taolivehome.TaoLiveHomepageActivity.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolivehome/TaoLiveHomepageActivity$3");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null && !TextUtils.isEmpty(intent.getAction())) {
                String action = intent.getAction();
                if (TextUtils.equals(action, LoginAction.NOTIFY_LOGIN_SUCCESS.name())) {
                    TaoLiveHomepageActivity taoLiveHomepageActivity = TaoLiveHomepageActivity.this;
                    if (TaoLiveHomepageActivity.p3(taoLiveHomepageActivity, TaoLiveHomepageActivity.o3(taoLiveHomepageActivity))) {
                        TaoLiveHomepageActivity.q3(TaoLiveHomepageActivity.this, true);
                    }
                    TaoLiveHomepageActivity taoLiveHomepageActivity2 = TaoLiveHomepageActivity.this;
                    TaoLiveHomepageActivity.r3(taoLiveHomepageActivity2, taoLiveHomepageActivity2);
                    TLog.loge("TBLive", TaoLiveHomepageActivity.l3() + "_APM", "onCreate checkSessionValid NOTIFY_LOGIN_SUCCESS");
                    TaoLiveHomepageActivity.n3(TaoLiveHomepageActivity.this, true);
                } else if (TextUtils.equals(action, LoginAction.NOTIFY_LOGIN_CANCEL.name())) {
                    TaoLiveHomepageActivity taoLiveHomepageActivity3 = TaoLiveHomepageActivity.this;
                    TaoLiveHomepageActivity.r3(taoLiveHomepageActivity3, taoLiveHomepageActivity3);
                    TLog.loge("TBLive", TaoLiveHomepageActivity.l3() + "_APM", "onCreate checkSessionValid NOTIFY_LOGIN_CANCEL");
                    TaoLiveHomepageActivity.this.finish();
                }
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (v2s.o().f() != null) {
                tbt.c().h(v2s.o().f().getApplication());
            }
            FlexaLiveX.o().z(FlexaLiveX.ATYPE, false, TaoLiveHomepageActivity.this);
            FlexaLiveX.o().z(FlexaLiveX.BTYPE, false, TaoLiveHomepageActivity.this);
            bl9.g().c();
            yvs.c();
            yvs.b(TaoLiveHomepageActivity.this.getApplication());
        }
    }

    static {
        t2o.a(776994821);
        t2o.a(806355487);
        t2o.a(775946454);
        t2o.a(806355504);
        fsw.h("TBLiveHomePlugin", TBLiveHomePlugin.class);
        fsw.k("TBLiveBaseCommonPlugin", d9m.M().createWVPluginClass());
    }

    public static /* synthetic */ Object ipc$super(TaoLiveHomepageActivity taoLiveHomepageActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -349229044:
                super.onConfigurationChanged((Configuration) objArr[0]);
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
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolivehome/TaoLiveHomepageActivity");
        }
    }

    public static /* synthetic */ String l3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return n;
    }

    public static /* synthetic */ void m3(TaoLiveHomepageActivity taoLiveHomepageActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56bf5891", new Object[]{taoLiveHomepageActivity});
        } else {
            taoLiveHomepageActivity.s3();
        }
    }

    public static /* synthetic */ void n3(TaoLiveHomepageActivity taoLiveHomepageActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8262bf42", new Object[]{taoLiveHomepageActivity, new Boolean(z)});
        } else {
            taoLiveHomepageActivity.w3(z);
        }
    }

    public static /* synthetic */ Uri o3(TaoLiveHomepageActivity taoLiveHomepageActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("89df464a", new Object[]{taoLiveHomepageActivity});
        }
        return taoLiveHomepageActivity.i;
    }

    public static /* synthetic */ boolean p3(TaoLiveHomepageActivity taoLiveHomepageActivity, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d426f77", new Object[]{taoLiveHomepageActivity, uri})).booleanValue();
        }
        return taoLiveHomepageActivity.x3(uri);
    }

    public static /* synthetic */ void q3(TaoLiveHomepageActivity taoLiveHomepageActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8605b7df", new Object[]{taoLiveHomepageActivity, new Boolean(z)});
        } else {
            taoLiveHomepageActivity.D3(z);
        }
    }

    public static /* synthetic */ void r3(TaoLiveHomepageActivity taoLiveHomepageActivity, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d9e15a8", new Object[]{taoLiveHomepageActivity, activity});
        } else {
            taoLiveHomepageActivity.B3(activity);
        }
    }

    public final void A3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ca88d13", new Object[]{this});
            return;
        }
        LocalBroadcastManager.getInstance(this).registerReceiver(new BroadcastReceiver() { // from class: com.taobao.taolivehome.TaoLiveHomepageActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolivehome/TaoLiveHomepageActivity$2");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                LocalBroadcastManager.getInstance(context).unregisterReceiver(this);
                if (AppInfo.INITED_ACTION.equals(intent.getAction())) {
                    TLog.loge("TBLive", TaoLiveHomepageActivity.l3() + "_APM", "onCreate registerLoginInitAction onReceive INITED_ACTION");
                    if (!t6f.d() || !Login.checkSessionValid()) {
                        TaoLiveHomepageActivity.m3(TaoLiveHomepageActivity.this);
                    } else {
                        TaoLiveHomepageActivity.n3(TaoLiveHomepageActivity.this, false);
                    }
                }
            }
        }, new IntentFilter(AppInfo.INITED_ACTION));
        HashMap hashMap = new HashMap();
        hashMap.put("isAfcColdContext", String.valueOf(this.b));
        hashMap.put("isAfcContextCallback", String.valueOf(this.c));
        rbu.K(vx9.d(), "IsAfcColdContext_checkLoginInit", hashMap);
        TLog.loge("TBLive", n + "_APM", "onCreate registerLoginInitAction");
    }

    public final void B3(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc5293fc", new Object[]{this, activity});
        } else {
            LoginBroadcastHelper.unregisterLoginReceiver(activity, this.l);
        }
    }

    public final void C3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a78329e", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("isAfcColdContextTrackHomePageBugfix", "true");
        hashMap.put("enableHomePageDX0828", "false");
        e2h.y(hashMap);
    }

    public final void D3(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ecc3fd0", new Object[]{this, new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        Uri data = getIntent().getData();
        if (data != null) {
            this.h = data.getQueryParameter("livesource");
            String queryParameter = data.getQueryParameter("tabSpm");
            if (!TextUtils.isEmpty(this.h) && this.h.startsWith("taolivejulang") && !TextUtils.isEmpty(queryParameter) && rvs.a()) {
                if (!"jingxuan,singleLiveTab".equals(data.getQueryParameter("channelType")) || !z) {
                    UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(this, "PageTaoLive");
                    UTAnalytics.getInstance().getDefaultTracker().updatePageName(this, "PageTaoLive");
                    queryParameter = "";
                } else {
                    this.k = new Object();
                    UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(this.k, "Page_TaobaoLiveWatch");
                    UTAnalytics.getInstance().getDefaultTracker().updatePageName(this.k, "Page_TaobaoLiveWatch");
                    queryParameter = "a2141.28646552";
                }
                if (TextUtils.isEmpty(queryParameter)) {
                }
                hashMap.put("spm-cnt", queryParameter);
                if (!TextUtils.isEmpty(this.h)) {
                    hashMap.put("livesource", this.h);
                    hashMap.put("entryLiveSource", this.h);
                }
                String queryParameter2 = data.getQueryParameter("spm");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    hashMap.put("entrySpm", queryParameter2);
                }
                String queryParameter3 = data.getQueryParameter("userId");
                if (!TextUtils.isEmpty(queryParameter3)) {
                    hashMap.put(z9u.KEY_ACCOUNT_ID, queryParameter3);
                }
                String queryParameter4 = data.getQueryParameter("id");
                if (!TextUtils.isEmpty(queryParameter4)) {
                    hashMap.put("feed_id", queryParameter4);
                }
                hashMap.put("isAfcColdContext", String.valueOf(this.b));
            }
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this, hashMap);
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

    @Override // tb.tbc
    public DinamicXEngine f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("350fca7f", new Object[]{this});
        }
        cus cusVar = wca.b;
        if (cusVar != null) {
            return cusVar.e();
        }
        return null;
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        sjr.g().d(uyg.EVENT_MEDIAPLATFORM_DISABLE_SMALLWINDOW);
    }

    @Override // com.taobao.tao.BaseActivity, com.taobao.uikit.immersive.ITBImmersive
    public boolean isImmersiveStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bc6b0e", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.tao.BaseActivity
    public boolean needActionBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4205b12", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.BaseActivity
    public boolean needPublicMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24050629", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        cus cusVar = wca.b;
        if (cusVar != null) {
            cusVar.f(i, i2, intent);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
        } else {
            super.onConfigurationChanged(configuration);
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        UTHitBuilders$UTControlHitBuilder uTHitBuilders$UTControlHitBuilder = new UTHitBuilders$UTControlHitBuilder("Page_TaobaoLive", "LivePage_StayTime");
        uTHitBuilders$UTControlHitBuilder.setProperty(g4.b.i, String.valueOf(this.f13361a));
        uTHitBuilders$UTControlHitBuilder.setProperty("stayTime", String.valueOf(SystemClock.uptimeMillis() - this.f13361a));
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTControlHitBuilder.build());
        v6t.a().d();
        bl9.g().c();
        v3();
    }

    @Override // com.taobao.tao.BaseActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        cus cusVar = wca.b;
        if (cusVar == null || !cusVar.i(i, keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        if (!tvs.a() || !this.b) {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this);
        } else if (this.d && this.e) {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this);
            this.e = false;
        }
        cus cusVar = wca.b;
        if (cusVar != null) {
            cusVar.k();
        }
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e50f98c0", new Object[]{this, bundle});
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        cus cusVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (!this.j && (cusVar = wca.b) != null) {
            cusVar.d(this, false);
            this.j = true;
        }
        this.e = true;
        cus cusVar2 = wca.b;
        if (cusVar2 != null) {
            cusVar2.l();
        }
        if (qvs.z()) {
            View findViewById = findViewById(R.id.live_fragment_vp);
            if (Build.VERSION.SDK_INT >= 29 && (findViewById instanceof ViewGroup)) {
                ((ViewGroup) findViewById).suppressLayout(false);
            }
        }
    }

    @Override // tb.wqg
    public void onSetActivityTheme() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e714bbe", new Object[]{this});
        } else {
            setTheme(R.style.Theme_NoBackgroundAndOverLayingActionBar_LiveHome);
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
        cus cusVar = wca.b;
        if (cusVar != null) {
            cusVar.n();
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        if (tvs.a() && this.b && this.e) {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this);
            this.e = false;
        }
        cus cusVar = wca.b;
        if (cusVar != null) {
            cusVar.o();
        }
        if (isFinishing()) {
            v3();
        }
    }

    public final boolean t3(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("729428e3", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        return false;
    }

    public final boolean u3(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dcc12090", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (z) {
            return true;
        }
        if (!this.b || !t6f.a() || Login.checkInit()) {
            s3();
        } else {
            A3();
        }
        return false;
    }

    public final void v3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("156c6523", new Object[]{this});
        } else if (!this.m) {
            B3(this);
            wca.d("");
            wca.e("");
            wca.c("");
            kir.c().b();
            cus cusVar = wca.b;
            if (cusVar != null) {
                cusVar.h();
            }
            wca.b = null;
            this.m = true;
        }
    }

    public final void w3(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edcf041d", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f13361a = SystemClock.uptimeMillis();
        if (wca.b == null) {
            wca.b = d9m.H().createTaoLiveHomePage(this, this.b, this.k, getIntent());
        }
        wca.b.g(this.b, z);
    }

    public void y3(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("647c2a98", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f = z;
        if (wca.b == null) {
            return;
        }
        if (sj7.s(getApplicationContext()) || sj7.w(getApplicationContext())) {
            wca.b.m(this.f);
        }
    }

    public final void z3(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a203df5", new Object[]{this, activity});
        } else {
            LoginBroadcastHelper.registerLoginReceiver(activity, this.l);
        }
    }

    @Override // com.taobao.tao.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        this.d = bqg.b(intent);
        boolean c = bqg.c(intent);
        StringBuilder sb = new StringBuilder();
        String str = n;
        sb.append(str);
        sb.append("_APM");
        String sb2 = sb.toString();
        TLog.loge("TBLive", sb2, "onNewIntent isAfcColdContext " + this.d + " isAfcContextCallback " + c);
        if (this.b) {
            HashMap hashMap = new HashMap();
            hashMap.put("isAfcColdContext", String.valueOf(this.b));
            hashMap.put("isAfcContextCallback", String.valueOf(this.c));
            hashMap.put("isNewIntentAfcColdContext", String.valueOf(this.d));
            hashMap.put("isAfcContextCallbackNewIntent", String.valueOf(c));
            rbu.K(vx9.d(), "IsAfcColdContext_newIntent2", hashMap);
        }
        if (!this.b || !this.d || !c) {
            cus cusVar = wca.b;
            if (cusVar != null) {
                cusVar.j(intent);
                return;
            }
            return;
        }
        TLog.loge("TBLive", str + "_APM", "onNewIntent return");
        if (!this.c && t6f.b()) {
            t3(intent.getDataString(), true);
        }
    }

    public final void s3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("175806b2", new Object[]{this});
            return;
        }
        z3(this);
        Login.login(true);
        HashMap hashMap = new HashMap();
        hashMap.put("isAfcColdContext", String.valueOf(this.b));
        hashMap.put("isAfcContextCallback", String.valueOf(this.c));
        rbu.K(vx9.d(), "IsAfcColdContext_checkSessionValid", hashMap);
        TLog.loge("TBLive", n + "_APM", "onCreate checkSessionValidFalse " + this.b);
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        FlexaLiveX.o().z(FlexaLiveX.TAOLIVE_HOMEPAGE, true, this);
        TaoLiveLaunchInitializer.init();
        super.onCreate(null);
        UTAnalytics.getInstance().getDefaultTracker().skipPage(this);
        if (sj7.w(getApplicationContext()) || sj7.s(getApplicationContext())) {
            v6t.a().c(this);
            d7r.a(this);
        }
        SystemClock.uptimeMillis();
        IpChange ipChange2 = wca.$ipChange;
        C3();
        Intent intent = getIntent();
        this.i = intent.getData();
        this.b = bqg.b(intent);
        this.c = bqg.c(intent);
        wca.d(wca.a(this));
        TLog.loge("TBLive", n + "_APM", "onCreate isAfcColdContext " + this.b + " isAfcContextCallback " + this.c);
        if (this.b) {
            String dataString = intent.getDataString();
            HashMap hashMap = new HashMap();
            hashMap.put("isAfcColdContext", String.valueOf(this.b));
            hashMap.put("isAfcContextCallback", String.valueOf(this.c));
            hashMap.put("isAfcColdContext_rul", dataString);
            rbu.K(vx9.d(), "IsAfcColdContext_create2", hashMap);
            if (this.c && t6f.b() && t3(dataString, false)) {
                return;
            }
        }
        this.g = System.currentTimeMillis();
        if (x3(this.i)) {
            Uri data = getIntent().getData();
            if (data != null) {
                str = data.getQueryParameter("livesource");
            } else {
                str = "";
            }
            sj9.h(this.g, this.b, str);
            vxm vxmVar = vxm.b;
            vxmVar.e().a("taolive_session_id", sj9.k());
            vxmVar.e().a("taolive_create_time", Long.valueOf(SystemClock.uptimeMillis()));
            vxmVar.e().a("taolive_create_isAfcColdContext", Boolean.valueOf(this.b));
        }
        MUSEngine.registerPlatformView("tblivevideox", TBLivePlatformView.class);
        if (x3(this.i)) {
            boolean checkSessionValid = Login.checkSessionValid();
            String userId = Login.getUserId();
            String nick = Login.getNick();
            vxm.b.e().a("taolive_check_login_session_valid", Boolean.valueOf(checkSessionValid));
            if (!this.b || !t6f.c()) {
                if (!u3(checkSessionValid)) {
                    D3(false);
                    return;
                }
            } else if (!checkSessionValid && ((TextUtils.isEmpty(userId) || TextUtils.isEmpty(nick)) && !u3(checkSessionValid))) {
                D3(false);
                return;
            }
            D3(true);
        }
        w3(false);
        if (!sj7.a()) {
            new Handler().postDelayed(new a(), 3000L);
        }
    }

    public final boolean x3(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e44a186", new Object[]{this, uri})).booleanValue();
        }
        if (uri == null) {
            return false;
        }
        String queryParameter = uri.getQueryParameter("channelType");
        String queryParameter2 = uri.getQueryParameter("liveHomePageType");
        return "jingxuan,singleLiveTab".equals(queryParameter) && ("mixLiveAndTab".equals(queryParameter2) || "mixLive".equals(queryParameter2));
    }
}
