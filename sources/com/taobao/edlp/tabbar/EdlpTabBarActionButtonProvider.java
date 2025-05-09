package com.taobao.edlp.tabbar;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.external.UCPManager;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.tbelder.TBElder;
import com.taobao.edlp.mtop.MtopTaobaoNavigationtabGetTab3ConfigRequest;
import com.taobao.edlp.tabbar.IEdlpTabBarActionButtonProvider;
import com.taobao.edlp.windvane.TBEdlpWVPlugin;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastReceiver;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.a68;
import tb.a81;
import tb.a98;
import tb.arp;
import tb.b98;
import tb.drs;
import tb.emp;
import tb.es0;
import tb.f98;
import tb.fbl;
import tb.fs0;
import tb.hvd;
import tb.iu2;
import tb.m1m;
import tb.obk;
import tb.pp6;
import tb.rvu;
import tb.t2o;
import tb.tqs;
import tb.uto;
import tb.vk8;
import tb.ysr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class EdlpTabBarActionButtonProvider implements IEdlpTabBarActionButtonProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public hvd f10402a;
    public long b = 60;
    public final List<String> c = new ArrayList();
    public fs0 d = new fs0();
    public boolean e = false;
    public boolean f = false;
    public View g = null;
    public View h = null;
    public int i = 0;
    public int j = 0;
    public boolean k = false;
    public long l = System.currentTimeMillis();
    public final Application.ActivityLifecycleCallbacks m = new j();
    public final BroadcastReceiver n = new LoginBroadcastReceiver() { // from class: com.taobao.edlp.tabbar.EdlpTabBarActionButtonProvider.7
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass7 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/edlp/tabbar/EdlpTabBarActionButtonProvider$7");
        }

        @Override // com.taobao.login4android.broadcast.LoginBroadcastReceiver, android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (!a98.a()) {
                TLog.loge("EdlpTabBarActionButtonProvider", "切换账号 不是新人");
            } else {
                EdlpTabBarActionButtonProvider.this.X(b98.a(), IEdlpTabBarActionButtonProvider.OperTypeEnum.DELETEINCON);
                if (EdlpTabBarActionButtonProvider.w(EdlpTabBarActionButtonProvider.this)) {
                    EdlpTabBarActionButtonProvider.A(EdlpTabBarActionButtonProvider.this, es0.b(Login.getUserId()));
                    TLog.loge("EdlpTabBarActionButtonProvider", "切换账号，请求更新");
                    EdlpTabBarActionButtonProvider.this.e0(b98.a(), "5");
                }
            }
        }
    };
    public final BroadcastReceiver o = new BroadcastReceiver() { // from class: com.taobao.edlp.tabbar.EdlpTabBarActionButtonProvider.8
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass8 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/edlp/tabbar/EdlpTabBarActionButtonProvider$8");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            try {
                if (TextUtils.equals(intent.getStringExtra(FestivalMgr.EXTRA_FESTIVAL_CHANGE_REASON), FestivalMgr.SKIN_CHANGE_REASON_CONFIG_CHANGE)) {
                    if (FestivalMgr.i().x()) {
                        EdlpTabBarActionButtonProvider.this.X(b98.a(), IEdlpTabBarActionButtonProvider.OperTypeEnum.DELETEINCON);
                    } else if (EdlpTabBarActionButtonProvider.w(EdlpTabBarActionButtonProvider.this)) {
                        TLog.loge("EdlpTabBarActionButtonProvider", "皮肤态切换到非皮肤态，请求更新");
                        EdlpTabBarActionButtonProvider.this.e0(b98.a(), "5");
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    };
    public final BroadcastReceiver p = new BroadcastReceiver() { // from class: com.taobao.edlp.tabbar.EdlpTabBarActionButtonProvider.9
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass9 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/edlp/tabbar/EdlpTabBarActionButtonProvider$9");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            try {
                if (TBElder.b()) {
                    EdlpTabBarActionButtonProvider.this.X(b98.a(), IEdlpTabBarActionButtonProvider.OperTypeEnum.DELETEINCON);
                } else if (EdlpTabBarActionButtonProvider.w(EdlpTabBarActionButtonProvider.this)) {
                    TLog.loge("EdlpTabBarActionButtonProvider", "老年版切换正常版，请求更新");
                    EdlpTabBarActionButtonProvider.this.e0(b98.a(), "5");
                }
            } catch (Throwable unused) {
                TLog.loge("EdlpTabBarActionButtonProvider", "标准版老年版切换错误");
            }
        }
    };
    public boolean q = false;
    public String r;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements UCPManager.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ fs0 f10408a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if ("picNoScroll".equals(b.this.f10408a.b)) {
                    f98.c(b.this.f10408a.l, (TextView) EdlpTabBarActionButtonProvider.B(EdlpTabBarActionButtonProvider.this).findViewById(R.id.edlp_tab_badge));
                } else if ("gifAndScroll".equals(b.this.f10408a.b)) {
                    TabBarScrollerView tabBarScrollerView = (TabBarScrollerView) EdlpTabBarActionButtonProvider.h(EdlpTabBarActionButtonProvider.this).findViewById(R.id.iv_scroller_tab);
                    if (tabBarScrollerView != null) {
                        tabBarScrollerView.setShowPromotionCount(b.this.f10408a.l);
                    }
                } else {
                    TLog.loge("EdlpTabBarActionButtonProvider", "initViews alien logo mode is not PICNOSCROLL & GIFANDSCROLL");
                }
            }
        }

        public b(fs0 fs0Var) {
            this.f10408a = fs0Var;
        }

        @Override // com.taobao.android.external.UCPManager.d
        public void callback(boolean z, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f24299e8", new Object[]{this, new Boolean(z), jSONObject});
            } else if (!z) {
                a81.b("Page_Edlp", "alienInfoShowRedPoint", String.valueOf(this.f10408a.l), "-1", "ucp管控");
                TLog.loge("EdlpTabBarActionButtonProvider", "红点设置失败 checkFatigue false");
            } else {
                a81.c("Page_Edlp", "alienInfoShowRedPoint", String.valueOf(this.f10408a.l));
                rvu.b(new a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements pp6 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.pp6
        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
                return;
            }
            Map<String, Drawable> f = m1m.f();
            EdlpTabBarActionButtonProvider.p(EdlpTabBarActionButtonProvider.this, f);
            EdlpTabBarActionButtonProvider edlpTabBarActionButtonProvider = EdlpTabBarActionButtonProvider.this;
            edlpTabBarActionButtonProvider.K(EdlpTabBarActionButtonProvider.z(edlpTabBarActionButtonProvider));
            EdlpTabBarActionButtonProvider edlpTabBarActionButtonProvider2 = EdlpTabBarActionButtonProvider.this;
            EdlpTabBarActionButtonProvider.q(edlpTabBarActionButtonProvider2, EdlpTabBarActionButtonProvider.z(edlpTabBarActionButtonProvider2), f);
            a81.c("Page_Edlp", "phenixLoad", "");
        }

        @Override // tb.pp6
        public void onData(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7658760c", new Object[]{this, obj});
            }
        }

        @Override // tb.pp6
        public void onError(String str, String str2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b263e360", new Object[]{this, str, str2, obj});
                return;
            }
            TLog.loge("EdlpTabBarActionButtonProvider", "PhenixLoad error" + str2);
            EdlpTabBarActionButtonProvider.j(EdlpTabBarActionButtonProvider.this, b98.a(), IEdlpTabBarActionButtonProvider.OperTypeEnum.DELETEVIEWTOBAR, "4");
            a81.a("Page_Edlp", "phenixLoad", str, str2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String userId = Login.getUserId();
            Application a2 = b98.a();
            SharedPreferences.Editor edit = a2.getSharedPreferences(userId + "staticImg", 0).edit();
            edit.putString("staticImgUrl", EdlpTabBarActionButtonProvider.z(EdlpTabBarActionButtonProvider.this).f19495a);
            edit.apply();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class f implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                int parseInt;
                int d;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    String config = OrangeConfig.getInstance().getConfig("edlp_business_switch", "alienVersion", "0");
                    TLog.loge("EdlpTabBarActionButtonProvider", "orange alienVersion" + config);
                    if (!TextUtils.isEmpty(config) && (parseInt = Integer.parseInt(config)) > (d = emp.d("tab3_alienVersion", 0))) {
                        TLog.loge("EdlpTabBarActionButtonProvider", " orange -> FORCE_REMOTE " + d + "|" + parseInt);
                        EdlpTabBarActionButtonProvider.this.e0(b98.a(), "5");
                        emp.a("tab3_alienVersion", parseInt);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }

        public f() {
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else {
                uto.a().execute(new a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class g implements hvd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // tb.hvd
        public void onTabChanged(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91f35fc8", new Object[]{this, new Integer(i), str});
            } else if (a68.TAG.equals(str)) {
                EdlpTabBarActionButtonProvider.f(EdlpTabBarActionButtonProvider.this, true);
                EdlpTabBarActionButtonProvider.g(EdlpTabBarActionButtonProvider.this);
                if (EdlpTabBarActionButtonProvider.r(EdlpTabBarActionButtonProvider.this)) {
                    EdlpTabBarActionButtonProvider.u(EdlpTabBarActionButtonProvider.this);
                }
                if (EdlpTabBarActionButtonProvider.v(EdlpTabBarActionButtonProvider.this)) {
                    if (EdlpTabBarActionButtonProvider.w(EdlpTabBarActionButtonProvider.this)) {
                        TLog.loge("EdlpTabBarActionButtonProvider", "Tab3点击超出时间间隔，请求更新");
                        EdlpTabBarActionButtonProvider.this.I(b98.a());
                    }
                    EdlpTabBarActionButtonProvider.x(EdlpTabBarActionButtonProvider.this, System.currentTimeMillis());
                }
            } else {
                if (EdlpTabBarActionButtonProvider.e(EdlpTabBarActionButtonProvider.this)) {
                    EdlpTabBarActionButtonProvider.y(EdlpTabBarActionButtonProvider.this);
                }
                EdlpTabBarActionButtonProvider.f(EdlpTabBarActionButtonProvider.this, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if ("picNoScroll".equals(EdlpTabBarActionButtonProvider.z(EdlpTabBarActionButtonProvider.this).b)) {
                    if (EdlpTabBarActionButtonProvider.B(EdlpTabBarActionButtonProvider.this) != null) {
                        ((TextView) EdlpTabBarActionButtonProvider.B(EdlpTabBarActionButtonProvider.this).findViewById(R.id.edlp_tab_badge)).setVisibility(4);
                        ((TUrlImageView) EdlpTabBarActionButtonProvider.B(EdlpTabBarActionButtonProvider.this).findViewById(R.id.iv_btn_tab_select)).setVisibility(0);
                        ((TUrlImageView) EdlpTabBarActionButtonProvider.B(EdlpTabBarActionButtonProvider.this).findViewById(R.id.iv_btn_tab)).setVisibility(4);
                    } else {
                        TLog.loge("EdlpTabBarActionButtonProvider", "processClickTab3 mCustomView为空");
                    }
                } else if (!"gifAndScroll".equals(EdlpTabBarActionButtonProvider.z(EdlpTabBarActionButtonProvider.this).b)) {
                    TLog.loge("EdlpTabBarActionButtonProvider", "initViews alien logo mode is not PICNOSCROLL & GIFANDSCROLL");
                } else if (EdlpTabBarActionButtonProvider.h(EdlpTabBarActionButtonProvider.this) != null) {
                    ((TabBarScrollerView) EdlpTabBarActionButtonProvider.h(EdlpTabBarActionButtonProvider.this).findViewById(R.id.iv_scroller_tab)).onClicked();
                } else {
                    TLog.loge("EdlpTabBarActionButtonProvider", "processClickTab3 mCustomViewScroll为空");
                }
            } catch (Throwable unused) {
                TLog.loge("EdlpTabBarActionButtonProvider", "processClickTab3 展示异形时点击Tab3处理出现问题");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if ("picNoScroll".equals(EdlpTabBarActionButtonProvider.z(EdlpTabBarActionButtonProvider.this).b)) {
                    if (EdlpTabBarActionButtonProvider.B(EdlpTabBarActionButtonProvider.this) != null) {
                        ((TUrlImageView) EdlpTabBarActionButtonProvider.B(EdlpTabBarActionButtonProvider.this).findViewById(R.id.iv_btn_tab_select)).setVisibility(4);
                        ((TUrlImageView) EdlpTabBarActionButtonProvider.B(EdlpTabBarActionButtonProvider.this).findViewById(R.id.iv_btn_tab)).setVisibility(0);
                    } else {
                        TLog.loge("EdlpTabBarActionButtonProvider", "recoverFromClickTab33 mCustomView为空");
                    }
                } else if (!"gifAndScroll".equals(EdlpTabBarActionButtonProvider.z(EdlpTabBarActionButtonProvider.this).b)) {
                    TLog.loge("EdlpTabBarActionButtonProvider", "initViews alien logo mode is not PICNOSCROLL & GIFANDSCROLL");
                } else if (EdlpTabBarActionButtonProvider.h(EdlpTabBarActionButtonProvider.this) != null) {
                    ((TabBarScrollerView) EdlpTabBarActionButtonProvider.h(EdlpTabBarActionButtonProvider.this).findViewById(R.id.iv_scroller_tab)).recoverFromClick();
                } else {
                    TLog.loge("EdlpTabBarActionButtonProvider", "recoverFromClickTab33 mCustomView为空");
                }
            } catch (Throwable th) {
                TLog.loge("EdlpTabBarActionButtonProvider", "processClickTab3 展示异形时从Tab3切换到其他Tab处理出现问题 " + Log.getStackTraceString(th));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class j implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            TabBarScrollerView tabBarScrollerView;
            TabBarScrollerView tabBarScrollerView2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
                return;
            }
            try {
                if (TBMainHost.fromActivity(activity) != null) {
                    if (EdlpTabBarActionButtonProvider.r(EdlpTabBarActionButtonProvider.this) && EdlpTabBarActionButtonProvider.z(EdlpTabBarActionButtonProvider.this) != null && "gifAndScroll".equals(EdlpTabBarActionButtonProvider.z(EdlpTabBarActionButtonProvider.this).b) && !EdlpTabBarActionButtonProvider.e(EdlpTabBarActionButtonProvider.this) && (tabBarScrollerView2 = (TabBarScrollerView) EdlpTabBarActionButtonProvider.h(EdlpTabBarActionButtonProvider.this).findViewById(R.id.iv_scroller_tab)) != null) {
                        tabBarScrollerView2.startScroll();
                    }
                } else if (EdlpTabBarActionButtonProvider.r(EdlpTabBarActionButtonProvider.this) && EdlpTabBarActionButtonProvider.z(EdlpTabBarActionButtonProvider.this) != null && "gifAndScroll".equals(EdlpTabBarActionButtonProvider.z(EdlpTabBarActionButtonProvider.this).b) && (tabBarScrollerView = (TabBarScrollerView) EdlpTabBarActionButtonProvider.h(EdlpTabBarActionButtonProvider.this).findViewById(R.id.iv_scroller_tab)) != null) {
                    tabBarScrollerView.stopScroll();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            }
        }
    }

    static {
        t2o.a(1032847394);
        t2o.a(1032847414);
    }

    public EdlpTabBarActionButtonProvider() {
        System.currentTimeMillis();
        init();
    }

    public static /* synthetic */ fs0 A(EdlpTabBarActionButtonProvider edlpTabBarActionButtonProvider, fs0 fs0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fs0) ipChange.ipc$dispatch("f4145f28", new Object[]{edlpTabBarActionButtonProvider, fs0Var});
        }
        edlpTabBarActionButtonProvider.d = fs0Var;
        return fs0Var;
    }

    public static /* synthetic */ View B(EdlpTabBarActionButtonProvider edlpTabBarActionButtonProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4fc48a91", new Object[]{edlpTabBarActionButtonProvider});
        }
        return edlpTabBarActionButtonProvider.g;
    }

    public static /* synthetic */ View C(EdlpTabBarActionButtonProvider edlpTabBarActionButtonProvider, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a263dde7", new Object[]{edlpTabBarActionButtonProvider, view});
        }
        edlpTabBarActionButtonProvider.g = view;
        return view;
    }

    public static /* synthetic */ boolean e(EdlpTabBarActionButtonProvider edlpTabBarActionButtonProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b64b7c", new Object[]{edlpTabBarActionButtonProvider})).booleanValue();
        }
        return edlpTabBarActionButtonProvider.e;
    }

    public static /* synthetic */ boolean f(EdlpTabBarActionButtonProvider edlpTabBarActionButtonProvider, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82ff1762", new Object[]{edlpTabBarActionButtonProvider, new Boolean(z)})).booleanValue();
        }
        edlpTabBarActionButtonProvider.e = z;
        return z;
    }

    public static /* synthetic */ void g(EdlpTabBarActionButtonProvider edlpTabBarActionButtonProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cf4bb17", new Object[]{edlpTabBarActionButtonProvider});
        } else {
            edlpTabBarActionButtonProvider.Q();
        }
    }

    public static /* synthetic */ View h(EdlpTabBarActionButtonProvider edlpTabBarActionButtonProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("101656b", new Object[]{edlpTabBarActionButtonProvider});
        }
        return edlpTabBarActionButtonProvider.h;
    }

    public static /* synthetic */ View i(EdlpTabBarActionButtonProvider edlpTabBarActionButtonProvider, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a00550cd", new Object[]{edlpTabBarActionButtonProvider, view});
        }
        edlpTabBarActionButtonProvider.h = view;
        return view;
    }

    public static /* synthetic */ void j(EdlpTabBarActionButtonProvider edlpTabBarActionButtonProvider, Context context, IEdlpTabBarActionButtonProvider.OperTypeEnum operTypeEnum, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc57ae7", new Object[]{edlpTabBarActionButtonProvider, context, operTypeEnum, str});
        } else {
            edlpTabBarActionButtonProvider.D(context, operTypeEnum, str);
        }
    }

    public static /* synthetic */ int k(EdlpTabBarActionButtonProvider edlpTabBarActionButtonProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("adcdb3d8", new Object[]{edlpTabBarActionButtonProvider})).intValue();
        }
        return edlpTabBarActionButtonProvider.j;
    }

    public static /* synthetic */ int l(EdlpTabBarActionButtonProvider edlpTabBarActionButtonProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ddec0ed0", new Object[]{edlpTabBarActionButtonProvider})).intValue();
        }
        int i2 = edlpTabBarActionButtonProvider.j;
        edlpTabBarActionButtonProvider.j = 1 + i2;
        return i2;
    }

    public static /* synthetic */ void m(EdlpTabBarActionButtonProvider edlpTabBarActionButtonProvider, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30e2be49", new Object[]{edlpTabBarActionButtonProvider, mtopResponse});
        } else {
            edlpTabBarActionButtonProvider.O(mtopResponse);
        }
    }

    public static /* synthetic */ void n(EdlpTabBarActionButtonProvider edlpTabBarActionButtonProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d64a9323", new Object[]{edlpTabBarActionButtonProvider});
        } else {
            edlpTabBarActionButtonProvider.M();
        }
    }

    public static /* synthetic */ void o(EdlpTabBarActionButtonProvider edlpTabBarActionButtonProvider, fs0 fs0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7089b0b4", new Object[]{edlpTabBarActionButtonProvider, fs0Var});
        } else {
            edlpTabBarActionButtonProvider.c0(fs0Var);
        }
    }

    public static /* synthetic */ void p(EdlpTabBarActionButtonProvider edlpTabBarActionButtonProvider, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fbd3b04", new Object[]{edlpTabBarActionButtonProvider, map});
        } else {
            edlpTabBarActionButtonProvider.P(map);
        }
    }

    public static /* synthetic */ void q(EdlpTabBarActionButtonProvider edlpTabBarActionButtonProvider, fs0 fs0Var, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59168d3", new Object[]{edlpTabBarActionButtonProvider, fs0Var, map});
        } else {
            edlpTabBarActionButtonProvider.E(fs0Var, map);
        }
    }

    public static /* synthetic */ boolean r(EdlpTabBarActionButtonProvider edlpTabBarActionButtonProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("31332aba", new Object[]{edlpTabBarActionButtonProvider})).booleanValue();
        }
        return edlpTabBarActionButtonProvider.f;
    }

    public static /* synthetic */ void s(EdlpTabBarActionButtonProvider edlpTabBarActionButtonProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("506379aa", new Object[]{edlpTabBarActionButtonProvider});
        } else {
            edlpTabBarActionButtonProvider.N();
        }
    }

    public static /* synthetic */ boolean t(EdlpTabBarActionButtonProvider edlpTabBarActionButtonProvider, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a1e1fe4", new Object[]{edlpTabBarActionButtonProvider, new Boolean(z)})).booleanValue();
        }
        edlpTabBarActionButtonProvider.f = z;
        return z;
    }

    public static /* synthetic */ void u(EdlpTabBarActionButtonProvider edlpTabBarActionButtonProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5719a55", new Object[]{edlpTabBarActionButtonProvider});
        } else {
            edlpTabBarActionButtonProvider.Y();
        }
    }

    public static /* synthetic */ boolean v(EdlpTabBarActionButtonProvider edlpTabBarActionButtonProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59b009f8", new Object[]{edlpTabBarActionButtonProvider})).booleanValue();
        }
        return edlpTabBarActionButtonProvider.L();
    }

    public static /* synthetic */ boolean w(EdlpTabBarActionButtonProvider edlpTabBarActionButtonProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("edee7997", new Object[]{edlpTabBarActionButtonProvider})).booleanValue();
        }
        return edlpTabBarActionButtonProvider.J();
    }

    public static /* synthetic */ long x(EdlpTabBarActionButtonProvider edlpTabBarActionButtonProvider, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("385bf4c8", new Object[]{edlpTabBarActionButtonProvider, new Long(j2)})).longValue();
        }
        edlpTabBarActionButtonProvider.l = j2;
        return j2;
    }

    public static /* synthetic */ void y(EdlpTabBarActionButtonProvider edlpTabBarActionButtonProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("166b58d1", new Object[]{edlpTabBarActionButtonProvider});
        } else {
            edlpTabBarActionButtonProvider.R();
        }
    }

    public static /* synthetic */ fs0 z(EdlpTabBarActionButtonProvider edlpTabBarActionButtonProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fs0) ipChange.ipc$dispatch("13f692d8", new Object[]{edlpTabBarActionButtonProvider});
        }
        return edlpTabBarActionButtonProvider.d;
    }

    public final void D(Context context, IEdlpTabBarActionButtonProvider.OperTypeEnum operTypeEnum, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("493aae36", new Object[]{this, context, operTypeEnum, str});
        } else {
            rvu.b(new d(operTypeEnum, str));
        }
    }

    public final void E(fs0 fs0Var, Map<String, Drawable> map) {
        boolean z = true;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69e53858", new Object[]{this, fs0Var, map});
            return;
        }
        int i2 = fs0Var.l;
        boolean a2 = f98.a(fs0Var);
        if (this.e || !a2) {
            z = false;
        }
        TLog.loge("EdlpTabBarActionButtonProvider", "curShowPromotionCount is" + z);
        if (i2 != 0) {
            z2 = z;
        }
        b0(fs0Var, z2, map);
    }

    public final hvd F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hvd) ipChange.ipc$dispatch("637aa123", new Object[]{this});
        }
        return new g();
    }

    public final boolean G(fs0 fs0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("771bcbd1", new Object[]{this, fs0Var})).booleanValue();
        }
        if ("HAS_POP".equals(H())) {
            return true;
        }
        if (fs0Var == null) {
            return false;
        }
        return fs0Var.f.booleanValue();
    }

    public final String H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2ca24da5", new Object[]{this});
        }
        try {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                return "NOT_MAIN_THREAD";
            }
            ysr ysrVar = new ysr();
            if (!ysrVar.d()) {
                return "SDK_NOT_READY";
            }
            if (ysrVar.c()) {
                return "HAS_POP";
            }
            return "NO_REQUESTING_POP";
        } catch (Throwable unused) {
            return iu2.CALENDAR_ERROR_CATCH;
        }
    }

    public final boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("234968ae", new Object[]{this})).booleanValue();
        }
        return a98.a();
    }

    public final boolean L() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25dd6ef", new Object[]{this})).booleanValue();
        }
        if (System.currentTimeMillis() - this.l > this.b * 1000) {
            z = true;
        }
        TLog.loge("EdlpTabBarActionButtonProvider", "isTabClickTimeout|" + z);
        return z;
    }

    public final void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa6dbb39", new Object[]{this});
        } else if (TextUtils.equals(OrangeConfig.getInstance().getConfig("edlp_business_switch", "requestErrorLoadFromCache", "1"), "1")) {
            fs0 b2 = es0.b(Login.getUserId());
            this.d = b2;
            if (b2 != null) {
                TLog.loge("EdlpTabBarActionButtonProvider", "loadFromCache| " + Login.getUserId());
                D(b98.a(), IEdlpTabBarActionButtonProvider.OperTypeEnum.ADDVIEWTOBAR, "5");
            }
        }
    }

    public final void N() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9d24485", new Object[]{this});
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.d.f19495a);
            arrayList.add(this.d.h);
            fs0 fs0Var = this.d;
            if (!(fs0Var == null || (str = fs0Var.b) == null)) {
                if ("gifAndScroll".equals(str)) {
                    arrayList.add(this.d.i);
                }
                new m1m(arrayList, new c()).g();
            }
        } catch (Throwable th) {
            D(b98.a(), IEdlpTabBarActionButtonProvider.OperTypeEnum.DELETEVIEWTOBAR, "4");
            TLog.loge("EdlpTabBarActionButtonProvider", "loadImgs Wrong, Err message " + th);
        }
    }

    public final void O(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a737286f", new Object[]{this, mtopResponse});
            return;
        }
        try {
            if (!TextUtils.equals(mtopResponse.getRetCode(), "SUCCESS")) {
                TLog.loge("EdlpTabBarActionButtonProvider", "服务端mtop接口返回错误 " + mtopResponse.getRetMsg());
                return;
            }
            org.json.JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
            if (dataJsonObject == null) {
                TLog.loge("EdlpTabBarActionButtonProvider", "服务端数据错误");
                return;
            }
            fs0 a2 = es0.a(dataJsonObject);
            this.d = a2;
            if (a2 != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("data", this.d.n);
                a0(vk8.EVENT_TAB_PAGE_INFO_REFRESH, hashMap);
            }
        } catch (Throwable unused) {
            TLog.loge("EdlpTabBarActionButtonProvider", "服务端下发的data/desc数据错误或者解析错误");
        }
    }

    public final void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25a7483e", new Object[]{this});
        } else if (this.d != null && this.f) {
            rvu.b(new h());
        }
    }

    public final void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8576ddf", new Object[]{this});
        } else if (this.d != null && this.f) {
            rvu.b(new i());
        }
    }

    public void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("987fbae8", new Object[]{this});
        } else if (b98.a() != null) {
            b98.a().registerActivityLifecycleCallbacks(this.m);
        }
    }

    public void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87fdc82c", new Object[]{this});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(TBElder.ACTION_TBELDER_VALUE_CHANGED);
        LocalBroadcastManager.getInstance(b98.a()).registerReceiver(this.p, intentFilter);
    }

    public void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8572bd1", new Object[]{this});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(FestivalMgr.ACTION_FESTIVAL_CHANGE);
        LocalBroadcastManager.getInstance(b98.a()).registerReceiver(this.o, intentFilter);
    }

    public void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("811a189c", new Object[]{this});
            return;
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(LoginAction.NOTIFY_LOGIN_SUCCESS.name());
            b98.a().getApplicationContext().registerReceiver(this.n, intentFilter);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void X(Context context, IEdlpTabBarActionButtonProvider.OperTypeEnum operTypeEnum) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a15204a", new Object[]{this, context, operTypeEnum});
        } else {
            D(b98.a(), operTypeEnum, "4");
        }
    }

    public final void Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afffe823", new Object[]{this});
        } else if (!this.q) {
            f98.b(this.d);
            this.q = true;
        }
    }

    public final void Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96a1adde", new Object[]{this});
        } else {
            uto.a().execute(new e());
        }
    }

    @Override // com.taobao.edlp.tabbar.IEdlpTabBarActionButtonProvider
    public IEdlpTabBarActionButtonProvider.ExposeUtTypeEnum a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IEdlpTabBarActionButtonProvider.ExposeUtTypeEnum) ipChange.ipc$dispatch("5fbd1471", new Object[]{this});
        }
        if (this.f) {
            if (this.e) {
                return IEdlpTabBarActionButtonProvider.ExposeUtTypeEnum.SELECT_ICON;
            }
            if ("picNoScroll".equals(this.d.b)) {
                if (f98.a(this.d)) {
                    return IEdlpTabBarActionButtonProvider.ExposeUtTypeEnum.STATIC_ICON_WITH_RED;
                }
                return IEdlpTabBarActionButtonProvider.ExposeUtTypeEnum.STATIC_ICON;
            } else if ("gifAndScroll".equals(this.d.b)) {
                TabBarScrollerView tabBarScrollerView = (TabBarScrollerView) this.h.findViewById(R.id.iv_scroller_tab);
                if (tabBarScrollerView != null) {
                    return tabBarScrollerView.getCurTabBarStatus();
                }
            } else {
                TLog.loge("EdlpTabBarActionButtonProvider", "initViews alien logo mode is not PICNOSCROLL & GIFANDSCROLL");
            }
        }
        return IEdlpTabBarActionButtonProvider.ExposeUtTypeEnum.DEFAULT_ICON;
    }

    public void a0(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88045422", new Object[]{this, str, map});
        } else {
            vk8.b().d(str, map);
        }
    }

    @Override // com.taobao.edlp.tabbar.IEdlpTabBarActionButtonProvider
    public fs0 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fs0) ipChange.ipc$dispatch("baa50fa2", new Object[]{this});
        }
        return this.d;
    }

    public final void b0(fs0 fs0Var, boolean z, Map<String, Drawable> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcb63ca3", new Object[]{this, fs0Var, new Boolean(z), map});
            return;
        }
        rvu.b(new a(fs0Var, map));
        if (z) {
            JSONObject jSONObject = new JSONObject();
            if (b98.b() == 0) {
                jSONObject.put("schemeNumId", (Object) "500000676");
                jSONObject.put("schemeId", (Object) "Page_Home@home_tab");
                jSONObject.put("bizNumId", (Object) "20509");
                jSONObject.put(arp.MATERIAL_ID_KEY, (Object) "41912");
            } else {
                jSONObject.put("schemeNumId", (Object) "500000671");
                jSONObject.put("schemeId", (Object) "Page_Home@home_tab");
                jSONObject.put("bizNumId", (Object) "21275");
                jSONObject.put(arp.MATERIAL_ID_KEY, (Object) "41911");
            }
            UCPManager.g(jSONObject, new b(fs0Var));
        }
    }

    @Override // com.taobao.edlp.tabbar.IEdlpTabBarActionButtonProvider
    public org.json.JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (org.json.JSONObject) ipChange.ipc$dispatch("c912bb5d", new Object[]{this});
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("imageUrl", this.d.f19495a);
            jSONObject.put(TBEdlpWVPlugin.KEY_POP_EXT, this.d.m);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    @Override // com.taobao.edlp.tabbar.IEdlpTabBarActionButtonProvider
    public drs d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (drs) ipChange.ipc$dispatch("52942328", new Object[]{this});
        }
        fs0 fs0Var = this.d;
        if (fs0Var != null) {
            return fs0Var.n;
        }
        return null;
    }

    public final void d0(BroadcastReceiver broadcastReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfdcb6b5", new Object[]{this, broadcastReceiver});
        } else {
            LocalBroadcastManager.getInstance(b98.a()).unregisterReceiver(broadcastReceiver);
        }
    }

    public void e0(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fea7764", new Object[]{this, context, str});
        } else if (this.c.contains(str)) {
            TLog.loge("EdlpTabBarActionButtonProvider", "冷启动，请求更新" + str);
            I(context);
        } else if ("4".equals(str)) {
            fs0 fs0Var = this.d;
            if (fs0Var != null && fs0Var.b()) {
                D(context, IEdlpTabBarActionButtonProvider.OperTypeEnum.ADDVIEWTOBAR, str);
            }
        } else if ("5".equals(str)) {
            I(context);
        }
    }

    @Override // com.taobao.edlp.tabbar.IEdlpTabBarActionButtonProvider
    public synchronized void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (!this.k) {
            this.k = true;
            ((ArrayList) this.c).add("1");
            this.b = Long.parseLong(fbl.a());
            this.d = es0.b(Login.getUserId());
            if (fbl.b()) {
                hvd F = F();
                this.f10402a = F;
                com.taobao.tao.navigation.a.h(F);
                V();
                U();
                T();
                S();
                W();
                e0(b98.a(), "1");
            } else {
                TLog.loge("EdlpTabBarActionButtonProvider", "--tab3异形降级--");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ fs0 f10407a;
        public final /* synthetic */ Map b;

        public a(fs0 fs0Var, Map map) {
            this.f10407a = fs0Var;
            this.b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if ("picNoScroll".equals(this.f10407a.b)) {
                    TUrlImageView tUrlImageView = (TUrlImageView) EdlpTabBarActionButtonProvider.B(EdlpTabBarActionButtonProvider.this).findViewById(R.id.iv_btn_tab);
                    TUrlImageView tUrlImageView2 = (TUrlImageView) EdlpTabBarActionButtonProvider.B(EdlpTabBarActionButtonProvider.this).findViewById(R.id.iv_btn_tab_select);
                    if (this.f10407a.b()) {
                        if (this.b == null || !fbl.e()) {
                            tUrlImageView.setImageUrl(this.f10407a.f19495a);
                            tUrlImageView2.setImageUrl(this.f10407a.h);
                        } else {
                            Drawable drawable = (Drawable) this.b.get(this.f10407a.f19495a);
                            if (drawable != null) {
                                tUrlImageView.setImageDrawable(drawable);
                                tUrlImageView.setAutoRelease(false);
                            } else {
                                tUrlImageView.setImageUrl(this.f10407a.f19495a);
                            }
                            Drawable drawable2 = (Drawable) this.b.get(this.f10407a.h);
                            if (drawable2 != null) {
                                tUrlImageView2.setImageDrawable(drawable2);
                                tUrlImageView2.setAutoRelease(false);
                            } else {
                                tUrlImageView2.setImageUrl(this.f10407a.h);
                            }
                        }
                        tUrlImageView.setAdjustViewBounds(true);
                        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                        tUrlImageView.setScaleType(scaleType);
                        tUrlImageView2.setAdjustViewBounds(true);
                        tUrlImageView2.setScaleType(scaleType);
                        if (EdlpTabBarActionButtonProvider.e(EdlpTabBarActionButtonProvider.this)) {
                            tUrlImageView.setVisibility(4);
                            tUrlImageView2.setVisibility(0);
                        } else {
                            tUrlImageView.setVisibility(0);
                            tUrlImageView2.setVisibility(4);
                        }
                    }
                } else if (!"gifAndScroll".equals(this.f10407a.b)) {
                    TLog.loge("EdlpTabBarActionButtonProvider", "initViews alien logo mode is not PICNOSCROLL & GIFANDSCROLL");
                } else if (this.f10407a.b()) {
                    TabBarScrollerView tabBarScrollerView = (TabBarScrollerView) EdlpTabBarActionButtonProvider.h(EdlpTabBarActionButtonProvider.this).findViewById(R.id.iv_scroller_tab);
                    tabBarScrollerView.initScrollerView(tabBarScrollerView.getContext(), this.f10407a, EdlpTabBarActionButtonProvider.e(EdlpTabBarActionButtonProvider.this), this.b);
                    if (EdlpTabBarActionButtonProvider.e(EdlpTabBarActionButtonProvider.this)) {
                        tabBarScrollerView.onClicked();
                    }
                }
                EdlpTabBarActionButtonProvider.o(EdlpTabBarActionButtonProvider.this, this.f10407a);
            } catch (Throwable unused) {
                TLog.loge("EdlpTabBarActionButtonProvider", "setButtonBackgroundImage的基础视图出现错误");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IEdlpTabBarActionButtonProvider.OperTypeEnum f10411a;
        public final /* synthetic */ String b;

        public d(IEdlpTabBarActionButtonProvider.OperTypeEnum operTypeEnum, String str) {
            this.f10411a = operTypeEnum;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                IEdlpTabBarActionButtonProvider.OperTypeEnum operTypeEnum = this.f10411a;
                if (operTypeEnum == IEdlpTabBarActionButtonProvider.OperTypeEnum.ADDVIEWTOBAR) {
                    if (EdlpTabBarActionButtonProvider.z(EdlpTabBarActionButtonProvider.this) != null && EdlpTabBarActionButtonProvider.z(EdlpTabBarActionButtonProvider.this).b()) {
                        if (!"3".equals(this.b)) {
                            EdlpTabBarActionButtonProvider.s(EdlpTabBarActionButtonProvider.this);
                        } else if ("gifAndScroll".equals(EdlpTabBarActionButtonProvider.z(EdlpTabBarActionButtonProvider.this).b)) {
                            if (EdlpTabBarActionButtonProvider.h(EdlpTabBarActionButtonProvider.this) == null) {
                                EdlpTabBarActionButtonProvider.s(EdlpTabBarActionButtonProvider.this);
                            } else if (!EdlpTabBarActionButtonProvider.r(EdlpTabBarActionButtonProvider.this)) {
                                EdlpTabBarActionButtonProvider edlpTabBarActionButtonProvider = EdlpTabBarActionButtonProvider.this;
                                EdlpTabBarActionButtonProvider.o(edlpTabBarActionButtonProvider, EdlpTabBarActionButtonProvider.z(edlpTabBarActionButtonProvider));
                            }
                        } else if (!"picNoScroll".equals(EdlpTabBarActionButtonProvider.z(EdlpTabBarActionButtonProvider.this).b)) {
                            TLog.loge("EdlpTabBarActionButtonProvider", "initViews alien logo mode is not PICNOSCROLL & GIFANDSCROLL");
                        } else if (EdlpTabBarActionButtonProvider.B(EdlpTabBarActionButtonProvider.this) == null) {
                            EdlpTabBarActionButtonProvider.s(EdlpTabBarActionButtonProvider.this);
                        } else if (!EdlpTabBarActionButtonProvider.r(EdlpTabBarActionButtonProvider.this)) {
                            EdlpTabBarActionButtonProvider edlpTabBarActionButtonProvider2 = EdlpTabBarActionButtonProvider.this;
                            EdlpTabBarActionButtonProvider.o(edlpTabBarActionButtonProvider2, EdlpTabBarActionButtonProvider.z(edlpTabBarActionButtonProvider2));
                        }
                    }
                } else if (operTypeEnum == IEdlpTabBarActionButtonProvider.OperTypeEnum.DELETEVIEWTOBAR || operTypeEnum == IEdlpTabBarActionButtonProvider.OperTypeEnum.DELETEINCON) {
                    if (EdlpTabBarActionButtonProvider.z(EdlpTabBarActionButtonProvider.this) != null) {
                        if (EdlpTabBarActionButtonProvider.z(EdlpTabBarActionButtonProvider.this).b == null) {
                            TLog.loge("EdlpTabBarActionButtonProvider", "alienLogo.mode is null");
                            return;
                        }
                        if ("picNoScroll".equals(EdlpTabBarActionButtonProvider.z(EdlpTabBarActionButtonProvider.this).b)) {
                            EdlpTabBarActionButtonProvider.C(EdlpTabBarActionButtonProvider.this, null);
                        } else if ("gifAndScroll".equals(EdlpTabBarActionButtonProvider.z(EdlpTabBarActionButtonProvider.this).b)) {
                            ((TabBarScrollerView) EdlpTabBarActionButtonProvider.h(EdlpTabBarActionButtonProvider.this).findViewById(R.id.iv_scroller_tab)).stopScroll();
                            EdlpTabBarActionButtonProvider.i(EdlpTabBarActionButtonProvider.this, null);
                        }
                        if (EdlpTabBarActionButtonProvider.r(EdlpTabBarActionButtonProvider.this)) {
                            if ("picNoScroll".equals(EdlpTabBarActionButtonProvider.z(EdlpTabBarActionButtonProvider.this).b)) {
                                i = com.taobao.tao.navigation.a.e0(a68.TAG, "static", null, 4);
                            } else if ("gifAndScroll".equals(EdlpTabBarActionButtonProvider.z(EdlpTabBarActionButtonProvider.this).b)) {
                                i = com.taobao.tao.navigation.a.e0(a68.TAG, "activity", null, 4);
                                if (1 != i) {
                                    i = com.taobao.tao.navigation.a.e0(a68.TAG, "static", null, 4);
                                }
                            } else {
                                i = -1;
                            }
                            if (i == 1) {
                                TLog.loge("EdlpTabBarActionButtonProvider", "成功移除view");
                                EdlpTabBarActionButtonProvider.t(EdlpTabBarActionButtonProvider.this, false);
                            }
                        }
                    }
                    if (this.f10411a == IEdlpTabBarActionButtonProvider.OperTypeEnum.DELETEINCON) {
                        if (EdlpTabBarActionButtonProvider.z(EdlpTabBarActionButtonProvider.this) != null) {
                            EdlpTabBarActionButtonProvider.z(EdlpTabBarActionButtonProvider.this).a();
                        }
                        TLog.loge("EdlpTabBarActionButtonProvider", "恢复Edlp Tab3删除资源");
                        return;
                    }
                    TLog.loge("EdlpTabBarActionButtonProvider", "恢复Edlp Tab3不删除资源");
                }
            } catch (Throwable th) {
                TLog.loge("EdlpTabBarActionButtonProvider", "changeTabBar Wrong! " + th);
            }
        }
    }

    public void I(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a7ef576", new Object[]{this, context});
        } else if (!J()) {
            TLog.loge("EdlpTabBarActionButtonProvider", "fetchRemoteResourceUpdateCache  is not edlp");
        } else if (FestivalMgr.i().x()) {
            TLog.loge("EdlpTabBarActionButtonProvider", "fetchRemoteResourceUpdateCache  is 皮肤态");
        } else {
            this.i++;
            TLog.loge("EdlpTabBarActionButtonProvider", "请求次数 + " + this.i);
            MtopBusiness build = MtopBusiness.build(Mtop.instance((Context) null, b98.c()), new MtopTaobaoNavigationtabGetTab3ConfigRequest(), b98.c());
            build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.edlp.tabbar.EdlpTabBarActionButtonProvider.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* compiled from: Taobao */
                /* renamed from: com.taobao.edlp.tabbar.EdlpTabBarActionButtonProvider$10$a */
                /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
                public class a implements Runnable {
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* renamed from: a  reason: collision with root package name */
                    public final /* synthetic */ MtopResponse f10403a;

                    public a(MtopResponse mtopResponse) {
                        this.f10403a = mtopResponse;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            EdlpTabBarActionButtonProvider.l(EdlpTabBarActionButtonProvider.this);
                            TLog.loge("EdlpTabBarActionButtonProvider", "回应次数 + " + EdlpTabBarActionButtonProvider.k(EdlpTabBarActionButtonProvider.this));
                            EdlpTabBarActionButtonProvider.m(EdlpTabBarActionButtonProvider.this, this.f10403a);
                            if (EdlpTabBarActionButtonProvider.z(EdlpTabBarActionButtonProvider.this) == null || !EdlpTabBarActionButtonProvider.z(EdlpTabBarActionButtonProvider.this).b()) {
                                TLog.loge("EdlpTabBarActionButtonProvider", "resource data error ");
                                EdlpTabBarActionButtonProvider.n(EdlpTabBarActionButtonProvider.this);
                            } else {
                                es0.c(Login.getUserId(), this.f10403a.getDataJsonObject().toString());
                                AnonymousClass10 r2 = AnonymousClass10.this;
                                EdlpTabBarActionButtonProvider.j(EdlpTabBarActionButtonProvider.this, context, IEdlpTabBarActionButtonProvider.OperTypeEnum.ADDVIEWTOBAR, "5");
                            }
                            a81.c("Page_Edlp", "tab3Config", "");
                        } catch (Throwable th) {
                            EdlpTabBarActionButtonProvider.j(EdlpTabBarActionButtonProvider.this, b98.a(), IEdlpTabBarActionButtonProvider.OperTypeEnum.DELETEINCON, "5");
                            TLog.loge("EdlpTabBarActionButtonProvider", "resourceFailed " + Log.getStackTraceString(th));
                        }
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i2, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i2), mtopResponse, obj});
                        return;
                    }
                    EdlpTabBarActionButtonProvider.n(EdlpTabBarActionButtonProvider.this);
                    if (mtopResponse != null) {
                        TLog.loge("EdlpTabBarActionButtonProvider", "异形接口onError " + mtopResponse.getRetMsg() + " " + mtopResponse.getRetCode());
                        a81.a("Page_Edlp", "tab3Config", mtopResponse.getRetCode(), mtopResponse.getRetMsg());
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i2, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i2), mtopResponse, baseOutDo, obj});
                    } else {
                        uto.a().execute(new a(mtopResponse));
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i2, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i2), mtopResponse, obj});
                        return;
                    }
                    EdlpTabBarActionButtonProvider.n(EdlpTabBarActionButtonProvider.this);
                    if (mtopResponse != null) {
                        a81.a("Page_Edlp", "tab3Config", mtopResponse.getRetCode(), mtopResponse.getRetMsg());
                        TLog.loge("EdlpTabBarActionButtonProvider", "异形接口onSystemError " + mtopResponse.getRetMsg() + " " + mtopResponse.getRetCode());
                    }
                }
            });
            build.startRequest();
        }
    }

    public void K(fs0 fs0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5030054e", new Object[]{this, fs0Var});
        } else if (fs0Var != null) {
            if ("picNoScroll".equals(fs0Var.b)) {
                if (this.g != null) {
                    this.g = null;
                }
                View inflate = LayoutInflater.from(b98.a()).inflate(R.layout.edlp_tab_button_notext, (ViewGroup) null);
                this.g = inflate;
                inflate.setClickable(false);
            } else if ("gifAndScroll".equals(fs0Var.b)) {
                View view = this.h;
                if (view != null) {
                    ((TabBarScrollerView) view.findViewById(R.id.iv_scroller_tab)).stopScroll();
                    this.h = null;
                }
                if (!G(fs0Var) || !"gifAndScroll".equals(fs0Var.b)) {
                    this.h = LayoutInflater.from(b98.a()).inflate(R.layout.edlp_tab_button_scroller, (ViewGroup) null);
                } else {
                    this.h = LayoutInflater.from(b98.a()).inflate(R.layout.edlp_tab_button_scroller_degrade, (ViewGroup) null);
                }
                this.h.setClickable(false);
            } else {
                TLog.loge("EdlpTabBarActionButtonProvider", "initViews alien logo mode is not PICNOSCROLL & GIFANDSCROLL");
            }
        }
    }

    public final void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c111c8c", new Object[]{this});
            return;
        }
        String config = OrangeConfig.getInstance().getConfig("edlp_business_switch", "alienVersion", "0");
        TLog.loge("tab3edlp", " registerOrangeListener " + config);
        OrangeConfig.getInstance().registerListener(new String[]{"edlp_business_switch"}, new f(), true);
    }

    @Override // com.taobao.edlp.tabbar.IEdlpTabBarActionButtonProvider
    public synchronized void unInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ec0ab50", new Object[]{this});
            return;
        }
        TLog.loge("EdlpTabBarActionButtonProvider", "unInit");
        hvd hvdVar = this.f10402a;
        if (hvdVar != null) {
            com.taobao.tao.navigation.a.K(hvdVar);
        }
        b98.a().unregisterActivityLifecycleCallbacks(this.m);
        d0(this.p);
        d0(this.o);
        this.k = false;
    }

    public final void P(Map<String, Drawable> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9815ef8", new Object[]{this, map});
        } else if (this.d == null) {
            TLog.loge("EdlpTabBarActionButtonProvider", "当前无异形数据");
        } else {
            String userId = Login.getUserId();
            Application a2 = b98.a();
            String string = a2.getSharedPreferences(userId + "staticImg", 0).getString("staticImgUrl", "");
            String str = this.d.f19495a;
            if (str == null || !str.equals(string) || !TextUtils.equals(this.r, string)) {
                Drawable drawable = map.get(this.d.f19495a);
                Drawable drawable2 = map.get(this.d.h);
                if (!TextUtils.isEmpty(this.d.f19495a)) {
                    int t0 = com.taobao.tao.navigation.a.t0(a68.TAG, new tqs.b().b(1).c(4).g("领福利").f(drawable2).h(drawable).d(a68.TAG).e(1).a());
                    TLog.loge("EdlpTabBarActionButtonProvider", "缓存结果：" + t0 + " " + this.d.f19495a + "｜" + this.d.h + "|" + t0);
                    if (t0 == 1) {
                        this.r = this.d.f19495a;
                        Z();
                    }
                }
            }
        }
    }

    public final void c0(fs0 fs0Var) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("139e1bdc", new Object[]{this, fs0Var});
        } else if (!FestivalMgr.i().x() && !TBElder.b() && !b98.d(b98.a()) && com.taobao.tao.navigation.a.y()) {
            int i2 = -1;
            if (!"3".equals(fs0Var.b) || !this.f) {
                if ("gifAndScroll".equals(fs0Var.b)) {
                    i2 = com.taobao.tao.navigation.a.e0(a68.TAG, "activity", this.h, 4);
                    if (i2 == 2) {
                        TLog.loge("EdlpTabBarActionButtonProvider", "UCP管控，动图设置失败，降级处理");
                    }
                } else if ("picNoScroll".equals(fs0Var.b)) {
                    i2 = com.taobao.tao.navigation.a.e0(a68.TAG, "static", this.g, 4);
                } else {
                    TLog.loge("EdlpTabBarActionButtonProvider", "initViews alien logo mode is not PICNOSCROLL & GIFANDSCROLL");
                }
                z = false;
            } else {
                TLog.loge("EdlpTabBarActionButtonProvider", "checkFatigue  消息tab点击，已经有异性了 不重新设置:");
                z = true;
            }
            TLog.loge("EdlpTabBarActionButtonProvider", "checkFatigue true:设置消息tarBar异形:" + i2);
            if (i2 == 1) {
                this.f = true;
                a81.c("Page_Edlp", "alienInfoShow", fs0Var.b);
                return;
            }
            int e0 = com.taobao.tao.navigation.a.e0(a68.TAG, "static", null, 4);
            TLog.loge("EdlpTabBarActionButtonProvider", "移除异行结果" + e0);
            this.f = false;
            a81.b("Page_Edlp", "alienInfoShow", fs0Var.b, String.valueOf(e0), "UCP管控");
            if (!z) {
                TLog.loge("EdlpTabBarActionButtonProvider", "blockByUcp");
            }
        }
    }
}
