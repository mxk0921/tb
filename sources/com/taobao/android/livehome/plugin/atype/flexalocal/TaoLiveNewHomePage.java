package com.taobao.android.livehome.plugin.atype.flexalocal;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.viewpager.widget.ViewPager;
import anet.channel.status.NetworkStatusHelper;
import anetwork.channel.http.NetworkSdkSetting;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.g4;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import com.android.tools.bundleInfo.DynamicFeatureInfo;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import com.taobao.android.livehome.plugin.atype.flexalocal.dxengine.DinamicSdkManager2;
import com.taobao.android.livehome.plugin.atype.flexalocal.dxengine.LiveHomeController2;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.TabManager;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.dinamic.DinamicRegister;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBottomH5Fragment;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeMainBaseFragment;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeNormalFragment;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeSelectedContainerFragment;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.HomeMainFragment;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.view.LiveNewTabView;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.view.TBLHomeNativeSearchInputView;
import com.taobao.android.nav.Nav;
import com.taobao.live.home.h5container.TBLiveHomePlugin;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.tao.Globals;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import tb.b0h;
import tb.bjr;
import tb.cus;
import tb.d9m;
import tb.e2h;
import tb.e5h;
import tb.e6t;
import tb.fqw;
import tb.g6t;
import tb.ixf;
import tb.iza;
import tb.j5h;
import tb.kz0;
import tb.kza;
import tb.lrq;
import tb.lws;
import tb.mbu;
import tb.nlc;
import tb.nvs;
import tb.owg;
import tb.p0;
import tb.p9m;
import tb.pb6;
import tb.pg1;
import tb.qw0;
import tb.qyg;
import tb.r0h;
import tb.r4p;
import tb.sj7;
import tb.t2o;
import tb.u6d;
import tb.v2s;
import tb.w49;
import tb.wca;
import tb.xkq;
import tb.yj4;
import tb.yjb;
import tb.zzg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TaoLiveNewHomePage extends cus implements nlc, LiveNewTabView.c, yjb, u6d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARAM_LIVE_SOURCE = "livesource";
    public static final int R = 31;
    public static final String S = "taolivehome";
    public NetworkStatusHelper.INetworkStatusChangeListener F;
    public NetworkStatusHelper.NetworkStatus G;
    public volatile TabManager.JSONTabNew H;
    public volatile FrameLayout I;
    public volatile boolean N;
    public boolean O;
    public int P;
    public int Q;

    /* renamed from: a  reason: collision with root package name */
    public ViewPager f8777a;
    public HomeViewPagerAdapter b;
    public LiveNewTabView c;
    public View d;
    public TUrlImageView e;
    public String g;
    public String h;
    public String i;
    public String j;
    public JSONObject k;
    public JSONObject l;
    public String m;
    public int n;
    public Context o;
    public volatile AppCompatActivity p;
    public final Intent q;
    public String r;
    public volatile JSONObject s;
    public long t;
    public boolean u;
    public String w;
    public String x;
    public final b0h z;
    public String f = "jingxuan";
    public boolean v = true;
    public final Handler y = new Handler(Looper.getMainLooper());
    public BroadcastReceiver A = new BroadcastReceiver(this) { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.TaoLiveNewHomePage.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/TaoLiveNewHomePage$1");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null && !lrq.a(intent.getAction())) {
                try {
                    LoginAction valueOf = LoginAction.valueOf(intent.getAction());
                    if (valueOf == LoginAction.NOTIFY_LOGIN_SUCCESS) {
                        qyg.c().h("com.taobao.taolive.login.success");
                    } else if (valueOf == LoginAction.NOTIFY_LOGOUT) {
                        qyg.c().h("com.taobao.taolive.login.out");
                    }
                } catch (Exception e) {
                    r0h.c("TaoLiveNewHomePage", "login receive exp. Action: " + intent.getAction(), e);
                }
            }
        }
    };
    public volatile boolean B = false;
    public volatile boolean C = false;
    public volatile boolean D = false;
    public volatile boolean E = false;
    public boolean J = false;
    public boolean K = true;
    public TabManager.TabMarketing L = null;
    public boolean M = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class HomeViewPagerAdapter extends FragmentStatePagerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final List<TabManager.TabBottom> f8778a = new ArrayList();
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public String g;
        public final b0h h;

        static {
            t2o.a(310378510);
        }

        public HomeViewPagerAdapter(Context context, FragmentManager fragmentManager, List<TabManager.TabBottom> list, String str, String str2, String str3, String str4, String str5, b0h b0hVar) {
            super(fragmentManager);
            i(list);
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.h = b0hVar;
        }

        public static /* synthetic */ Object ipc$super(HomeViewPagerAdapter homeViewPagerAdapter, String str, Object... objArr) {
            if (str.hashCode() == 50642664) {
                return new Integer(super.getItemPosition(objArr[0]));
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/TaoLiveNewHomePage$HomeViewPagerAdapter");
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
            }
            return ((ArrayList) this.f8778a).size();
        }

        @Override // androidx.fragment.app.FragmentStatePagerAdapter
        public Fragment getItem(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Fragment) ipChange.ipc$dispatch("c2fe4a3b", new Object[]{this, new Integer(i)});
            }
            if (i < 0 || i >= ((ArrayList) this.f8778a).size()) {
                return HomeNormalFragment.g3(new Bundle(), this.h);
            }
            Bundle bundle = new Bundle();
            if (((ArrayList) this.f8778a).get(i) != null) {
                String str = ((TabManager.TabBottom) ((ArrayList) this.f8778a).get(i)).channelType;
                bundle.putSerializable("tab_bottom", (Serializable) ((ArrayList) this.f8778a).get(i));
                bundle.putString("business_type", str);
                bundle.putInt(NotificationCompat.TvExtender.EXTRA_CHANNEL_ID, ((TabManager.TabBottom) ((ArrayList) this.f8778a).get(i)).channelId);
                bundle.putString("entryLiveSource", this.g);
                bundle.putInt("page_position", i);
                bundle.putString("jump_url", ((TabManager.TabBottom) ((ArrayList) this.f8778a).get(i)).jumpUrl);
                bundle.putString("tab_title_name", ((TabManager.TabBottom) ((ArrayList) this.f8778a).get(i)).name);
                bundle.putString("andorid_normal_icon", ((TabManager.TabBottom) ((ArrayList) this.f8778a).get(i)).androidNormalIcon);
                bundle.putString("android_pressed_icon", ((TabManager.TabBottom) ((ArrayList) this.f8778a).get(i)).androidPressedIcon);
                if (j5h.a(this.b, str)) {
                    bundle.putString("START_CONTENT_ID", this.d);
                    bundle.putString("START_SUB_CONTENT_ID", this.e);
                    bundle.putString("query_params", this.f);
                }
            }
            TabManager.TabBottom tabBottom = (TabManager.TabBottom) ((ArrayList) this.f8778a).get(i);
            List<TabManager.TabUp> list = tabBottom.topTab;
            if (list != null && list.size() > 0) {
                bundle.putString("START_CHANNEL_TYPE", this.c);
                if (p0.g(this.h.t())) {
                    return HomeMainFragment.Q3(bundle, this.h);
                }
                return HomeSelectedContainerFragment.K3(bundle, this.h);
            } else if (lrq.a(tabBottom.pageType) || !tabBottom.pageType.equals("h5")) {
                return HomeNormalFragment.g3(bundle, this.h);
            } else {
                return HomeBottomH5Fragment.j3(bundle, this.h);
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("304bee8", new Object[]{this, obj})).intValue();
            }
            if (obj instanceof HomeBaseFragment2) {
                HomeBaseFragment2 homeBaseFragment2 = (HomeBaseFragment2) obj;
                if (((TabManager.TabBottom) ((ArrayList) this.f8778a).get(homeBaseFragment2.M2())).isSelected) {
                    return super.getItemPosition(obj);
                }
                String str = ((TabManager.TabBottom) ((ArrayList) this.f8778a).get(homeBaseFragment2.M2())).jumpUrl;
                String str2 = ((TabManager.TabBottom) ((ArrayList) this.f8778a).get(homeBaseFragment2.M2())).name;
                String str3 = ((TabManager.TabBottom) ((ArrayList) this.f8778a).get(homeBaseFragment2.M2())).androidNormalIcon;
                String str4 = ((TabManager.TabBottom) ((ArrayList) this.f8778a).get(homeBaseFragment2.M2())).androidPressedIcon;
                if (!TextUtils.isEmpty(str) && !str.equals(homeBaseFragment2.K2())) {
                    return -2;
                }
                if (!TextUtils.isEmpty(str2) && !str2.equals(homeBaseFragment2.O2())) {
                    return -2;
                }
                if (!TextUtils.isEmpty(str3) && !str3.equals(homeBaseFragment2.E2())) {
                    return -2;
                }
                if (!TextUtils.isEmpty(str4) && !str4.equals(homeBaseFragment2.J2())) {
                    return -2;
                }
            }
            return super.getItemPosition(obj);
        }

        public void h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8af44c8", new Object[]{this, str});
            } else {
                this.g = str;
            }
        }

        public void i(List<TabManager.TabBottom> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56510678", new Object[]{this, list});
                return;
            }
            this.f8778a.clear();
            if (list != null) {
                this.f8778a.addAll(list);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements NetworkStatusHelper.INetworkStatusChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
        public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
            Map<Integer, String> downLoadFailImageMap;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4275ba3b", new Object[]{this, networkStatus});
                return;
            }
            r0h.b("TaoLiveNewHomePage", "onNetworkStatusChanged:" + networkStatus);
            if (!(!(TaoLiveNewHomePage.p(TaoLiveNewHomePage.this) == NetworkStatusHelper.NetworkStatus.NO || TaoLiveNewHomePage.p(TaoLiveNewHomePage.this) == NetworkStatusHelper.NetworkStatus.NONE) || TaoLiveNewHomePage.p(TaoLiveNewHomePage.this) == networkStatus || TaoLiveNewHomePage.r(TaoLiveNewHomePage.this) == null || (downLoadFailImageMap = TaoLiveNewHomePage.r(TaoLiveNewHomePage.this).getDownLoadFailImageMap()) == null || downLoadFailImageMap.size() <= 0)) {
                for (Integer num : downLoadFailImageMap.keySet()) {
                    TaoLiveNewHomePage.r(TaoLiveNewHomePage.this).refreshTabIcon(num.intValue(), TaoLiveNewHomePage.r(TaoLiveNewHomePage.this).getTab(num.intValue()));
                }
                TaoLiveNewHomePage.r(TaoLiveNewHomePage.this).clearDownLoadFailImageMap();
            }
            TaoLiveNewHomePage.q(TaoLiveNewHomePage.this, networkStatus);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!TaoLiveNewHomePage.z(TaoLiveNewHomePage.this)) {
                TaoLiveNewHomePage taoLiveNewHomePage = TaoLiveNewHomePage.this;
                taoLiveNewHomePage.d(TaoLiveNewHomePage.A(taoLiveNewHomePage), TaoLiveNewHomePage.B(TaoLiveNewHomePage.this).c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c extends AsyncTask {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == -1325021319) {
                super.onPostExecute(objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/TaoLiveNewHomePage$6");
        }

        /* renamed from: a */
        public TabManager.JSONTabNew doInBackground(Object[] objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TabManager.JSONTabNew) ipChange.ipc$dispatch("351c6875", new Object[]{this, objArr});
            }
            try {
                r0h.b("TaoLiveNewHomePage", "tabMenu localCache read start");
                String str = (String) owg.b("live_home_tabs");
                if (lrq.a(str)) {
                    r0h.b("TaoLiveNewHomePage", "tabMenu localDefault read start");
                    str = owg.a(Globals.getApplication(), "live_flexalocal/tabmenu_cache.json");
                }
                TabManager.JSONDataNew jSONDataNew = (TabManager.JSONDataNew) JSON.parseObject(str, TabManager.JSONDataNew.class);
                if (jSONDataNew != null) {
                    return jSONDataNew.data;
                }
                return null;
            } catch (Exception e) {
                r0h.c("TaoLiveNewHomePage", "tabMenu local data read exp", e);
                return new TabManager.JSONTabNew();
            }
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, obj});
                return;
            }
            super.onPostExecute(obj);
            if (obj instanceof TabManager.JSONTabNew) {
                TabManager.JSONTabNew jSONTabNew = (TabManager.JSONTabNew) obj;
                TabManager.q().s(jSONTabNew.bottomTab);
                TabManager.q().t(jSONTabNew.hideBottomNavigation);
            }
            if (TabManager.q().m()) {
                TaoLiveNewHomePage.B(TaoLiveNewHomePage.this).l = 0;
            } else {
                TaoLiveNewHomePage.B(TaoLiveNewHomePage.this).l = TaoLiveNewHomePage.G(TaoLiveNewHomePage.this).getResources().getDimensionPixelOffset(R.dimen.homepage2024_bottom_tab_height);
            }
            if (TaoLiveNewHomePage.H(TaoLiveNewHomePage.this) != null) {
                TaoLiveNewHomePage.H(TaoLiveNewHomePage.this).put("bottomBarHeight", (Object) Float.valueOf(pb6.C(TaoLiveNewHomePage.G(TaoLiveNewHomePage.this), TaoLiveNewHomePage.B(TaoLiveNewHomePage.this).l)));
            }
            TaoLiveNewHomePage.s(TaoLiveNewHomePage.this, TabManager.q().m());
            TaoLiveNewHomePage.t(TaoLiveNewHomePage.this, TabManager.q().i());
            TaoLiveNewHomePage.u(TaoLiveNewHomePage.this, TabManager.q().n());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (TaoLiveNewHomePage.v(TaoLiveNewHomePage.this) != null && TaoLiveNewHomePage.w(TaoLiveNewHomePage.this) != null && TaoLiveNewHomePage.x(TaoLiveNewHomePage.this) != null && TaoLiveNewHomePage.x(TaoLiveNewHomePage.this).jumpOut && !TextUtils.isEmpty(TaoLiveNewHomePage.x(TaoLiveNewHomePage.this).jumpUrl)) {
                Nav.from(Globals.getApplication()).toUri(TaoLiveNewHomePage.x(TaoLiveNewHomePage.this).jumpUrl);
                if (TaoLiveNewHomePage.x(TaoLiveNewHomePage.this).tabUT != null) {
                    String string = TaoLiveNewHomePage.x(TaoLiveNewHomePage.this).tabUT.getString(pg1.ATOM_EXT_button);
                    TaoLiveNewHomePage taoLiveNewHomePage = TaoLiveNewHomePage.this;
                    p9m.c(string, TaoLiveNewHomePage.y(taoLiveNewHomePage, TaoLiveNewHomePage.x(taoLiveNewHomePage).tabUT.getString("spm"), TaoLiveNewHomePage.B(TaoLiveNewHomePage.this).x.tabUT.toJSONString()));
                }
            }
        }
    }

    public TaoLiveNewHomePage(Context context, boolean z, Object obj, Intent intent) {
        boolean z2 = true;
        b0h b0hVar = new b0h();
        this.z = b0hVar;
        k0(context, FlexaLiveX.TAOLIVE_HOMEPAGE, "com.taobao.android.livehome.plugin.atype.flexaremote");
        String f = p0.f();
        b0hVar.T(f);
        boolean g = p0.g(f);
        b0hVar.D(g);
        if (g) {
            p9m.e("live_home_newChannel");
            if (p0.j(f)) {
                p9m.e("live_home_newChannel_single");
            } else {
                p9m.e("live_home_newChannel_double");
            }
        }
        b0hVar.C(nvs.l0());
        r0h.b("LiveHome", "dynamic test!!!");
        p9m.d("tbLiveChannelTabs_NewHomePage", null);
        this.o = context;
        this.q = intent;
        b0hVar.b = obj;
        if (intent != null) {
            Uri data = intent.getData();
            b0hVar.d = data;
            if (data != null) {
                b0hVar.f = data.getQueryParameter("livesource");
                b0hVar.g = b0hVar.d.getQueryParameter("spm");
                b0hVar.i = b0hVar.d.getQueryParameter("tabSpm");
                b0hVar.h = b0hVar.d.getQueryParameter("entityId");
                b0hVar.e = "false";
                if (TextUtils.isEmpty(b0hVar.i)) {
                    b0hVar.i = "a2141.28646552";
                }
            }
        }
        b0hVar.H(this);
        b0hVar.K(this);
        if (!sj7.w(context) && !sj7.s(context)) {
            z2 = false;
        }
        b0hVar.N(z2);
    }

    public static /* synthetic */ AppCompatActivity A(TaoLiveNewHomePage taoLiveNewHomePage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppCompatActivity) ipChange.ipc$dispatch("2ce1c8f7", new Object[]{taoLiveNewHomePage});
        }
        return taoLiveNewHomePage.p;
    }

    public static /* synthetic */ b0h B(TaoLiveNewHomePage taoLiveNewHomePage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b0h) ipChange.ipc$dispatch("b54654a2", new Object[]{taoLiveNewHomePage});
        }
        return taoLiveNewHomePage.z;
    }

    public static /* synthetic */ Handler C(TaoLiveNewHomePage taoLiveNewHomePage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("c4285208", new Object[]{taoLiveNewHomePage});
        }
        return taoLiveNewHomePage.y;
    }

    public static /* synthetic */ boolean D(TaoLiveNewHomePage taoLiveNewHomePage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1529243", new Object[]{taoLiveNewHomePage})).booleanValue();
        }
        return taoLiveNewHomePage.J;
    }

    public static /* synthetic */ boolean E(TaoLiveNewHomePage taoLiveNewHomePage, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b030bb7", new Object[]{taoLiveNewHomePage, new Boolean(z)})).booleanValue();
        }
        taoLiveNewHomePage.J = z;
        return z;
    }

    public static /* synthetic */ void F(TaoLiveNewHomePage taoLiveNewHomePage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d87b7480", new Object[]{taoLiveNewHomePage});
        } else {
            taoLiveNewHomePage.Q();
        }
    }

    public static /* synthetic */ Context G(TaoLiveNewHomePage taoLiveNewHomePage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("f5f8c2b9", new Object[]{taoLiveNewHomePage});
        }
        return taoLiveNewHomePage.o;
    }

    public static /* synthetic */ JSONObject H(TaoLiveNewHomePage taoLiveNewHomePage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6f975c22", new Object[]{taoLiveNewHomePage});
        }
        return taoLiveNewHomePage.s;
    }

    public static /* synthetic */ Object ipc$super(TaoLiveNewHomePage taoLiveNewHomePage, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 188604040) {
            super.o();
            return null;
        } else if (hashCode == 1264052993) {
            super.j((Intent) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/livehome/plugin/atype/flexalocal/TaoLiveNewHomePage");
        }
    }

    public static /* synthetic */ NetworkStatusHelper.NetworkStatus p(TaoLiveNewHomePage taoLiveNewHomePage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkStatusHelper.NetworkStatus) ipChange.ipc$dispatch("f15b877e", new Object[]{taoLiveNewHomePage});
        }
        return taoLiveNewHomePage.G;
    }

    public static /* synthetic */ NetworkStatusHelper.NetworkStatus q(TaoLiveNewHomePage taoLiveNewHomePage, NetworkStatusHelper.NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkStatusHelper.NetworkStatus) ipChange.ipc$dispatch("8d289dbf", new Object[]{taoLiveNewHomePage, networkStatus});
        }
        taoLiveNewHomePage.G = networkStatus;
        return networkStatus;
    }

    public static /* synthetic */ LiveNewTabView r(TaoLiveNewHomePage taoLiveNewHomePage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveNewTabView) ipChange.ipc$dispatch("a1d87ed3", new Object[]{taoLiveNewHomePage});
        }
        return taoLiveNewHomePage.c;
    }

    public static /* synthetic */ void s(TaoLiveNewHomePage taoLiveNewHomePage, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a41774ec", new Object[]{taoLiveNewHomePage, new Boolean(z)});
        } else {
            taoLiveNewHomePage.f0(z);
        }
    }

    public static /* synthetic */ void t(TaoLiveNewHomePage taoLiveNewHomePage, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("702e981a", new Object[]{taoLiveNewHomePage, list});
        } else {
            taoLiveNewHomePage.h0(list);
        }
    }

    public static /* synthetic */ void u(TaoLiveNewHomePage taoLiveNewHomePage, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9874d85b", new Object[]{taoLiveNewHomePage, list});
        } else {
            taoLiveNewHomePage.g0(list);
        }
    }

    public static /* synthetic */ ViewPager v(TaoLiveNewHomePage taoLiveNewHomePage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager) ipChange.ipc$dispatch("7e35d512", new Object[]{taoLiveNewHomePage});
        }
        return taoLiveNewHomePage.f8777a;
    }

    public static /* synthetic */ HomeViewPagerAdapter w(TaoLiveNewHomePage taoLiveNewHomePage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HomeViewPagerAdapter) ipChange.ipc$dispatch("436c8596", new Object[]{taoLiveNewHomePage});
        }
        return taoLiveNewHomePage.b;
    }

    public static /* synthetic */ TabManager.TabMarketing x(TaoLiveNewHomePage taoLiveNewHomePage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabManager.TabMarketing) ipChange.ipc$dispatch("97f4eab6", new Object[]{taoLiveNewHomePage});
        }
        return taoLiveNewHomePage.L;
    }

    public static /* synthetic */ Map y(TaoLiveNewHomePage taoLiveNewHomePage, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ffe78537", new Object[]{taoLiveNewHomePage, str, str2});
        }
        return taoLiveNewHomePage.R(str, str2);
    }

    public static /* synthetic */ boolean z(TaoLiveNewHomePage taoLiveNewHomePage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4af093f", new Object[]{taoLiveNewHomePage})).booleanValue();
        }
        return taoLiveNewHomePage.E;
    }

    public boolean K() {
        ISmartLandingProxy.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c1b8dd8", new Object[]{this})).booleanValue();
        }
        ViewPager viewPager = this.f8777a;
        if (viewPager == null || viewPager.getCurrentItem() == 0) {
            b0h b0hVar = this.z;
            if (b0hVar == null || (bVar = b0hVar.N) == null || !bVar.g("leave", null)) {
                return false;
            }
            return true;
        }
        LiveNewTabView liveNewTabView = this.c;
        if (liveNewTabView != null) {
            liveNewTabView.setCurrentItem(0);
        }
        return true;
    }

    public final JSONObject O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1e7b2c5d", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pageName", (Object) "Page_TaobaoLive");
        jSONObject.put("followCardTemplateName", (Object) "taolive_live_card");
        jSONObject.put("addWhiteRoundCard", (Object) "true");
        if (!TextUtils.isEmpty(wca.b())) {
            jSONObject.put("sessionId", (Object) wca.b());
        } else {
            jSONObject.put("sessionId", (Object) wca.a(this.o));
        }
        jSONObject.put("spmPre", (Object) this.z.g);
        jSONObject.put("livesourcePre", (Object) this.z.f);
        TBLocationDTO d2 = TBLocationClient.d();
        if (d2 != null) {
            jSONObject.put(r4p.KEY_CITY_CODE, (Object) d2.cityCode);
            jSONObject.put(r4p.KEY_CITY_NAME, (Object) d2.cityName);
        } else {
            mbu.l("Page_TaobaoLive", "getCacheLocationNull", new HashMap());
        }
        return jSONObject;
    }

    public final Map<String, String> R(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4987fe3c", new Object[]{this, str, str2});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("spm-cnt", str);
        hashMap.putAll(ixf.a(str2));
        b0h b0hVar = this.z;
        if (b0hVar != null) {
            hashMap.put("entryLiveSource", b0hVar.f);
            hashMap.put("entrySpm", this.z.g);
        }
        return hashMap;
    }

    public final JSONObject S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c40cf4ae", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("tlHomePageOptimize", (Object) "true");
        jSONObject2.put("loadImgImprove", (Object) "true");
        jSONObject2.put("liveBackInsertCard", (Object) String.valueOf(nvs.G()));
        if (!lrq.a(this.w)) {
            jSONObject2.put("launcherType", (Object) this.w);
        }
        if (!lrq.a(this.x)) {
            jSONObject2.put("entityId", (Object) this.x);
        }
        jSONObject2.put("enablePad", (Object) Boolean.valueOf(sj7.w(this.o)));
        jSONObject2.put("appVersion", (Object) TaoLiveHomePageX.getAppVersion(this.z.o));
        jSONObject2.put("pad", (Object) Boolean.valueOf(sj7.w(this.o)));
        jSONObject2.put("aPad", (Object) Boolean.valueOf(sj7.w(this.o)));
        jSONObject2.put("foldDevice", (Object) Boolean.valueOf(sj7.s(this.o)));
        jSONObject2.put("flipDevice", (Object) Boolean.valueOf(TBDeviceUtils.m(this.o)));
        if (Login.checkSessionValid()) {
            jSONObject2.put("isLogin", (Object) "true");
        } else {
            jSONObject2.put("isLogin", (Object) "false");
        }
        Context context = this.o;
        if (context != null) {
            jSONObject2.put("width", (Object) Float.valueOf(qw0.s(context, TBAutoSizeConfig.x().H(this.o))));
            Context context2 = this.o;
            jSONObject2.put("statusBarHeight", (Object) Float.valueOf(qw0.s(context2, qw0.m(context2))));
        }
        jSONObject2.put("isAllDX", (Object) "true");
        jSONObject2.put("channel_isAllDX", (Object) Boolean.TRUE);
        jSONObject2.put("AB2025", (Object) this.z.t());
        JSONObject jSONObject3 = new JSONObject();
        if (nvs.v0()) {
            jSONObject3.put("enableNewSmartCard", (Object) "true");
            jSONObject3.put("newSmartUser", (Object) "true");
        }
        jSONObject2.put("clientParam", (Object) jSONObject3);
        if (!nvs.e()) {
            wca.d(wca.a(this.o));
        }
        JSONObject O = O();
        jSONObject2.put("extendParamsRefresh", (Object) O.toJSONString());
        I(O);
        jSONObject2.put("extendParams", (Object) O.toJSONString());
        jSONObject2.put("extendParamsInfo", (Object) O);
        jSONObject2.put("hasReadCache", (Object) "0");
        jSONObject.putAll(jSONObject2);
        jSONObject.put("queryData", (Object) jSONObject2);
        jSONObject.put("transParam", this.l);
        jSONObject.put("originalQuery", this.k);
        Intent intent = this.q;
        if (!(intent == null || intent.getData() == null)) {
            jSONObject.put("entryUrl", this.q.getData().toString());
        }
        jSONObject.put("sessionId", wca.b());
        jSONObject.put("spmPre", this.z.g);
        jSONObject.put("livesourcePre", this.z.f);
        return jSONObject;
    }

    public final LiveHomeController2 T(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveHomeController2) ipChange.ipc$dispatch("afd47a8f", new Object[]{this, str});
        }
        LiveHomeController2 liveHomeController2 = new LiveHomeController2(this.z);
        liveHomeController2.setTemplateCardListOwner(new e5h(str));
        liveHomeController2.loadTemplate(1);
        DinamicSdkManager2 dinamicSdkManager2 = new DinamicSdkManager2(d9m.H().getDXBizType(), R, S);
        dinamicSdkManager2.setIDinamicRegister(new DinamicRegister());
        dinamicSdkManager2.enableBusinessEnableDesignScale(this.o);
        liveHomeController2.setDinamicSdkManager(dinamicSdkManager2);
        dinamicSdkManager2.setLiveHomeController2(liveHomeController2);
        return liveHomeController2;
    }

    public final synchronized void U(List<TabManager.TabBottom> list) {
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("10622722", new Object[]{this, list});
                return;
            }
            if (!(this.N || list == null || this.c == null)) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    TabManager.TabBottom tabBottom = list.get(i);
                    LiveNewTabView.d dVar = new LiveNewTabView.d();
                    dVar.i(tabBottom.name);
                    if (TextUtils.isEmpty(tabBottom.androidNormalColor)) {
                        tabBottom.androidNormalColor = "#000000";
                    }
                    try {
                        dVar.c(Color.parseColor(tabBottom.androidNormalColor));
                    } catch (Exception unused) {
                        dVar.c(Color.parseColor("#000000"));
                    }
                    dVar.d(tabBottom.androidNormalIcon);
                    if (TextUtils.isEmpty(tabBottom.androidPressedColor)) {
                        tabBottom.androidPressedColor = "#FF3344";
                    }
                    try {
                        dVar.f(Color.parseColor(tabBottom.androidPressedColor));
                    } catch (Exception unused2) {
                        dVar.f(Color.parseColor("#FF3344"));
                    }
                    dVar.g(tabBottom.androidPressedIcon);
                    if (!lrq.a(tabBottom.androidTopReturnButton)) {
                        dVar.j(tabBottom.androidTopReturnButton);
                    }
                    if (!lrq.a(tabBottom.androidTopReturnText)) {
                        dVar.k(tabBottom.androidTopReturnText);
                    }
                    this.c.addTab(dVar);
                }
                this.N = true;
            }
        }
    }

    public final void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        this.f8777a = (ViewPager) this.p.findViewById(R.id.live_fragment_vp);
        this.c = (LiveNewTabView) this.p.findViewById(R.id.live_tab);
        this.d = this.p.findViewById(R.id.live_home_bottom_line);
        this.e = (TUrlImageView) this.p.findViewById(R.id.live_marking_tab);
        LiveNewTabView liveNewTabView = this.c;
        if (liveNewTabView != null) {
            liveNewTabView.setVisibility(4);
            this.c.setOnTabClickListener(this);
        }
        TUrlImageView tUrlImageView = this.e;
        if (tUrlImageView != null) {
            tUrlImageView.setSkipAutoSize(true);
            this.e.setVisibility(8);
        }
    }

    public void X(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("662da9da", new Object[]{this, view, new Integer(i)});
        }
    }

    @Override // tb.yjb
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("508c744d", new Object[]{this});
            return;
        }
        LiveNewTabView liveNewTabView = this.c;
        if (liveNewTabView != null) {
            liveNewTabView.setVisibility(8);
            this.d.setVisibility(8);
        }
        if (this.M) {
            this.e.setVisibility(8);
        }
    }

    public final void a0(TabManager.JSONTabNew jSONTabNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7602f21", new Object[]{this, jSONTabNew});
            return;
        }
        this.H = jSONTabNew;
        List<TabManager.TabBottom> i = TabManager.q().i();
        if (this.H.bottomTab == null || this.H.bottomTab.size() != i.size()) {
            M();
            return;
        }
        if (this.H.openRankTabPersonalization) {
            TabManager.q().o(this.m, this.q.getData(), this.z);
        }
        for (int i2 = 0; i2 < i.size(); i2++) {
            if (i.get(i2).isSelected) {
                this.H.bottomTab.set(i2, i.get(i2));
            }
        }
        for (int i3 = 0; i3 < this.H.bottomTab.size(); i3++) {
            TabManager.TabBottom tabBottom = this.H.bottomTab.get(i3);
            if (tabBottom != null && !tabBottom.isSelected) {
                LiveNewTabView.d dVar = new LiveNewTabView.d();
                dVar.i(tabBottom.name);
                if (TextUtils.isEmpty(tabBottom.androidNormalColor)) {
                    tabBottom.androidNormalColor = "#000000";
                }
                try {
                    dVar.c(Color.parseColor(tabBottom.androidNormalColor));
                } catch (Exception unused) {
                    dVar.c(Color.parseColor("#000000"));
                }
                dVar.d(tabBottom.androidNormalIcon);
                if (TextUtils.isEmpty(tabBottom.androidPressedColor)) {
                    tabBottom.androidPressedColor = "#FF3344";
                }
                try {
                    dVar.f(Color.parseColor(tabBottom.androidPressedColor));
                } catch (Exception unused2) {
                    dVar.f(Color.parseColor("#FF3344"));
                }
                dVar.g(tabBottom.androidPressedIcon);
                if (!lrq.a(tabBottom.androidTopReturnButton)) {
                    dVar.j(tabBottom.androidTopReturnButton);
                }
                if (!lrq.a(tabBottom.androidTopReturnText)) {
                    dVar.k(tabBottom.androidTopReturnText);
                }
                if (!lrq.a(tabBottom.sjsdIcon)) {
                    dVar.h(tabBottom.sjsdIcon);
                    dVar.b(true);
                }
                this.c.updateTab(i3, dVar);
            }
        }
        TabManager.q().s(this.H.bottomTab);
        this.b.i(this.H.bottomTab);
        this.b.notifyDataSetChanged();
        M();
    }

    @Override // tb.u6d
    public void b() {
        ISmartLandingProxy.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f622f449", new Object[]{this});
            return;
        }
        b0h b0hVar = this.z;
        if (b0hVar == null || (bVar = b0hVar.N) == null) {
            Context context = this.o;
            if (context instanceof Activity) {
                ((Activity) context).finish();
            }
        } else if (!bVar.g("leave", null)) {
            Context context2 = this.o;
            if (context2 instanceof Activity) {
                ((Activity) context2).finish();
            }
        }
    }

    public final void b0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7285b220", new Object[]{this, str});
            return;
        }
        mbu.b("page_updateBottomTabs", this.z);
        a0(((TabManager.JSONDataNew) JSON.parseObject(str, TabManager.JSONDataNew.class)).data);
    }

    @Override // tb.yjb
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a44cde72", new Object[]{this});
        } else if (!this.K) {
            LiveNewTabView liveNewTabView = this.c;
            if (liveNewTabView != null) {
                liveNewTabView.setVisibility(0);
                this.d.setVisibility(0);
            }
            if (this.M) {
                this.e.setVisibility(0);
            }
        }
    }

    public boolean d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("739ab62a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.cus
    public DinamicXEngine e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("350fca7f", new Object[]{this});
        }
        b0h b0hVar = this.z;
        if (b0hVar == null || b0hVar.q() == null || this.z.q().getDinamicSdkManager() == null) {
            return null;
        }
        return this.z.q().getDinamicSdkManager().getDinamicEngine();
    }

    public final void e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf2200e6", new Object[]{this});
            return;
        }
        NetworkSdkSetting.init(this.o);
        NetworkStatusHelper.startListener(v2s.o().f().getApplication());
        NetworkStatusHelper.NetworkStatus status = NetworkStatusHelper.getStatus();
        this.G = status;
        r0h.b("TaoLiveNewHomePage", "status:" + status);
        boolean isConnected = NetworkStatusHelper.isConnected();
        r0h.b("TaoLiveNewHomePage", "connected:" + isConnected);
        a aVar = new a();
        this.F = aVar;
        NetworkStatusHelper.addStatusChangeListener(aVar);
        r0h.b("TaoLiveNewHomePage", "registerListener");
    }

    @Override // tb.cus
    public void f(int i, int i2, Intent intent) {
        ViewPager viewPager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else if (nvs.G() && i == 240 && (viewPager = this.f8777a) != null && this.b != null) {
            Fragment fragment = (Fragment) this.b.instantiateItem((ViewGroup) this.f8777a, viewPager.getCurrentItem());
            if (!(fragment instanceof HomeMainBaseFragment)) {
                return;
            }
            if (fragment instanceof HomeSelectedContainerFragment) {
                ((HomeSelectedContainerFragment) fragment).onActivityResult(i, i2, intent);
            } else {
                ((HomeMainFragment) fragment).onActivityResult(i, i2, intent);
            }
        }
    }

    public final void f0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b91201dd", new Object[]{this, new Boolean(z)});
            return;
        }
        this.K = z;
        LiveNewTabView liveNewTabView = this.c;
        if (liveNewTabView == null) {
            return;
        }
        if (z) {
            liveNewTabView.setVisibility(8);
            this.d.setVisibility(8);
            return;
        }
        liveNewTabView.setVisibility(0);
        this.d.setVisibility(0);
    }

    public final void h0(List<TabManager.TabBottom> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dd1a393", new Object[]{this, list});
        } else if (list != null && this.c != null && this.f8777a != null) {
            if (list.size() > 0) {
                this.z.x = list.get(0);
            }
            this.g = "";
            if (!lrq.a(this.m)) {
                String[] split = this.m.split(",");
                if (split.length > 0 && !lrq.a(split[0])) {
                    this.f = split[0];
                }
                if (split.length > 1 && !lrq.a(split[1])) {
                    this.g = split[1];
                }
            }
            U(list);
            this.f8777a.setOffscreenPageLimit(list.size());
            if (!lrq.a(this.f) && this.f.equals("jingxuan") && lrq.a(this.g)) {
                this.g = "jingxuan";
            }
            this.b = new HomeViewPagerAdapter(this.p, this.p.getSupportFragmentManager(), list, this.f, this.g, this.h, this.i, this.j, this.z);
            if (nvs.g() && !lrq.a(this.r)) {
                this.b.h(this.r);
            }
            this.f8777a.setAdapter(this.b);
            this.c.reLayout();
            this.c.setCurrentItem(0);
            if (!nvs.O()) {
                M();
            }
        }
    }

    @Override // tb.cus
    public boolean i(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i == 4) {
            return K();
        }
        return false;
    }

    public final void i0(TabManager.TabMarketing tabMarketing) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c82576f1", new Object[]{this, tabMarketing});
        } else if (this.M && (jSONObject = tabMarketing.tabUT) != null) {
            p9m.g(jSONObject.getString("show"), R(tabMarketing.tabUT.getString("spm"), this.z.x.tabUT.toJSONString()));
        }
    }

    @Override // tb.cus
    public void j(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.j(intent);
        qyg.c().e("com.taobao.live.home.on.new.intent", intent);
    }

    public final String j0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d7dd11", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || !str.contains("_")) {
            return str;
        }
        String[] split = str.split("_");
        if (split.length > 1) {
            return split[0];
        }
        return str;
    }

    @Override // tb.cus
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        }
    }

    public void k0(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dd1f850", new Object[]{this, context, str, str2});
        } else if (context != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            HashMap hashMap = new HashMap();
            hashMap.put("remoteSDK", str);
            hashMap.put("timeStamp", String.valueOf(System.currentTimeMillis()));
            hashMap.put("appVersion", sj7.j());
            String str3 = "false";
            try {
                if (TaoLiveNewHomePage.class.getPackage() != null) {
                    String name = TaoLiveNewHomePage.class.getPackage().getName();
                    if (!TextUtils.isEmpty(name) && name.equals(str2)) {
                        r0h.b("TaoLiveNewHomePage", "packageName equal");
                        DynamicFeatureInfo dynamicFeatureInfo = BundleInfoManager.instance().getDynamicFeatureInfo(str);
                        if (dynamicFeatureInfo != null) {
                            str3 = "true";
                            if (!TextUtils.isEmpty(dynamicFeatureInfo.version)) {
                                hashMap.put("remoteSDKVersion", j0(dynamicFeatureInfo.version));
                            }
                            if (w49.c(dynamicFeatureInfo.appVersion, str)) {
                                String a2 = w49.a(dynamicFeatureInfo.appVersion, str);
                                if (!TextUtils.isEmpty(a2)) {
                                    hashMap.put("remoteSDKVersion", j0(a2));
                                }
                                hashMap.put("remoteVersion", w49.b(dynamicFeatureInfo.appVersion, str));
                            }
                        } else {
                            r0h.b("TaoLiveNewHomePage", "featureInfo is null");
                        }
                    }
                }
            } catch (Exception e) {
                r0h.b("TaoLiveNewHomePage", "trackTintTrack exp：" + e.getMessage());
            }
            hashMap.put("isRemote", str3);
            b0h b0hVar = this.z;
            if (b0hVar != null) {
                b0hVar.G(hashMap);
            }
            if (v2s.o().s() != null) {
                v2s.o().s().a("tblive_remote_ratio", "Page_TaobaoLive", hashMap);
            }
        }
    }

    @Override // tb.cus
    public void l() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        i0(this.L);
        HashMap hashMap = new HashMap();
        if (this.v) {
            str = g4.b.i;
        } else {
            str = "back";
        }
        hashMap.put("actionType", str);
        mbu.f("ACTIVITY", this.z, hashMap);
        this.u = true;
        this.v = false;
    }

    public final void l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f349e310", new Object[]{this});
            return;
        }
        qyg.c().j(this);
        TabManager.q().g();
        e2h.x();
        qyg.a();
    }

    @Override // tb.cus
    public void m(boolean z) {
        ViewPager viewPager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("647c2a98", new Object[]{this, new Boolean(z)});
            return;
        }
        qw0.c();
        b0h b0hVar = this.z;
        if (b0hVar != null) {
            b0hVar.O(z);
        }
        try {
            if (this.p.getWindow().getDecorView().getVisibility() == 0) {
                c0(z);
            }
            LiveNewTabView liveNewTabView = this.c;
            if (liveNewTabView != null) {
                liveNewTabView.reLayout();
                TabManager.TabMarketing tabMarketing = this.L;
                if (tabMarketing != null && !TextUtils.isEmpty(tabMarketing.androidBackGroundPic)) {
                    this.c.reLayoutAdaptiveMarketing();
                }
            }
            HomeViewPagerAdapter homeViewPagerAdapter = this.b;
            if (homeViewPagerAdapter != null && (viewPager = this.f8777a) != null) {
                Fragment fragment = (Fragment) homeViewPagerAdapter.instantiateItem((ViewGroup) viewPager, this.n);
                if (fragment instanceof HomeBaseFragment2) {
                    ((HomeBaseFragment2) fragment).S2(z);
                }
            }
        } catch (Exception e) {
            r0h.b("TaoLiveNewHomePage", "onScreenOrientationChange is error," + e.getMessage());
        }
    }

    public final void n0(boolean z, LiveNewTabView.d dVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64d80236", new Object[]{this, new Boolean(z), dVar, new Boolean(z2)});
        } else if (dVar != null) {
            this.c.updateTab(0, z, dVar, z2);
        }
    }

    @Override // tb.cus
    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.o();
        mbu.e("BACK_GROUND", this.z);
        this.u = false;
    }

    public final void N() {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c547228d", new Object[]{this});
            return;
        }
        r0h.b("TaoLiveHomepage", "TaoLiveNewHomePage checkDisplayCutout");
        this.z.getClass();
        this.z.j = SystemBarDecorator.getStatusBarHeight(this.o);
        this.z.k = this.o.getResources().getDimensionPixelOffset(R.dimen.homepage2024_top_bar_height);
        b0h b0hVar = this.z;
        b0hVar.m = (int) qw0.s(this.o, Math.max(b0hVar.j, 0));
        if (this.s != null) {
            b0h b0hVar2 = this.z;
            int s = (int) (b0hVar2.m + qw0.s(this.o, b0hVar2.k));
            this.s.put("marginTop", (Object) Integer.valueOf(s));
            this.s.put("stautsNavHeight", (Object) Integer.valueOf(s));
            if (nvs.T()) {
                Context context = this.o;
                f = pb6.C(context, qw0.i((Activity) context) - sj7.c);
            } else {
                Context context2 = this.o;
                f = pb6.C(context2, qw0.i((Activity) context2));
            }
            this.s.put("height", (Object) Float.valueOf(f));
            this.z.n = f;
        }
        if (qw0.r()) {
            this.I.post(new g6t(this));
        } else if (sj7.t()) {
            Q();
        } else if (qw0.b() && nvs.z()) {
            Q();
        } else if (!qw0.a() || !nvs.A()) {
            this.I.post(new e6t(this));
        } else {
            Q();
        }
    }

    public final void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ec6bf93", new Object[]{this});
            return;
        }
        r0h.b("TaoLiveHomepage", "TaoLiveNewHomePage getTabsNew");
        mbu.b("page_getBottomTabs", this.z);
        if (this.H != null) {
            p9m.d("tbLiveChannelTabs_sync", null);
            TabManager.JSONTabNew jSONTabNew = this.H;
            TabManager.q().s(jSONTabNew.bottomTab);
            TabManager.q().t(jSONTabNew.hideBottomNavigation);
            f0(TabManager.q().m());
            h0(TabManager.q().i());
            g0(TabManager.q().n());
            return;
        }
        new c().execute(new Object[0]);
        p9m.d("tbLiveChannelTabs_async", null);
    }

    public final void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b110817", new Object[]{this});
            return;
        }
        TBLiveHomePlugin.entryPageUrl = "";
        Intent intent = this.q;
        Uri data = intent != null ? intent.getData() : null;
        if (data != null) {
            String queryParameter = data.getQueryParameter("launcherType");
            this.w = queryParameter;
            this.z.P(queryParameter);
            this.x = data.getQueryParameter("entityId");
        }
        TabManager.q().v(this.m, data, this.z);
        e2h.v();
        qyg.c().f(this);
        fqw.g("tbl_home_native_search_input_view", TBLHomeNativeSearchInputView.class, false);
    }

    @Override // tb.cus
    public void d(AppCompatActivity appCompatActivity, boolean z) {
        b0h b0hVar;
        ISmartLandingProxy.b bVar;
        b0h b0hVar2;
        ISmartLandingProxy.b bVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("689d3cce", new Object[]{this, appCompatActivity, new Boolean(z)});
            return;
        }
        mbu.b("page_createContentView", this.z);
        this.z.y(appCompatActivity);
        if (nvs.J()) {
            e0();
        }
        if (nvs.r()) {
            if (!this.D) {
                this.D = true;
                r0h.b("TaoLiveHomepage", "TaoLiveNewHomePage createContentView");
                this.p = appCompatActivity;
                this.z.c = z;
                this.o = appCompatActivity;
                if (this.I == null) {
                    this.p.setContentView(R.layout.activity_tao_live_home_page2_flexalocal);
                    this.I = (FrameLayout) this.p.findViewById(R.id.taolive_home_root);
                }
            }
            if (this.C && this.B) {
                if (this.s == null) {
                    this.s = S();
                    if (this.s != null) {
                        this.z.z(this.s);
                    }
                }
                V();
                N();
                if (!(!nvs.S() || (b0hVar2 = this.z) == null || (bVar2 = b0hVar2.N) == null)) {
                    bVar2.f("channelType", this.f);
                    this.z.N.g(g4.b.i, null);
                }
                xkq.e(this.p);
                try {
                    LoginBroadcastHelper.registerLoginReceiver(this.o, this.A);
                } catch (Exception e) {
                    r0h.c("TaoLiveNewHomePage", "register local broadcast exp.", e);
                }
                this.E = true;
                return;
            }
            return;
        }
        this.p = appCompatActivity;
        this.z.c = z;
        this.o = appCompatActivity;
        if (this.s == null) {
            this.s = S();
            if (this.s != null) {
                this.z.z(this.s);
            }
        }
        if (this.I == null) {
            this.p.setContentView(R.layout.activity_tao_live_home_page2_flexalocal);
            this.I = (FrameLayout) this.p.findViewById(R.id.taolive_home_root);
            V();
            N();
            if (!(!nvs.S() || (b0hVar = this.z) == null || (bVar = b0hVar.N) == null)) {
                bVar.f("channelType", this.f);
                this.z.N.g(g4.b.i, null);
            }
        }
        xkq.e(this.p);
        try {
            LoginBroadcastHelper.registerLoginReceiver(this.o, this.A);
        } catch (Exception e2) {
            r0h.c("TaoLiveNewHomePage", "register local broadcast exp.", e2);
        }
    }

    @Override // tb.cus
    public synchronized void g(boolean z, boolean z2) {
        String uri;
        Uri data;
        String uri2;
        Uri data2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d6f58c2", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        mbu.b("page_create", this.z);
        if (nvs.r()) {
            if (!this.C) {
                this.C = true;
                if (!this.B) {
                    r0h.b("TaoLiveHomepage", "TaoLiveNewHomePage onCreate");
                    P();
                    Intent intent = this.q;
                    if (!(intent == null || (data2 = intent.getData()) == null)) {
                        try {
                            if (qw0.p()) {
                                this.z.o = data2.getQueryParameter("dxAppVersion");
                            }
                            TBLiveHomePlugin.entryPageUrl = data2.toString();
                        } catch (Exception e) {
                            r0h.c("TaoLiveNewHomePage", "get livehomesource exp.", e);
                        }
                    }
                    b0h b0hVar = this.z;
                    b0hVar.Q(T(b0hVar.o));
                    W();
                    this.s = S();
                    if (this.s != null) {
                        this.z.z(this.s);
                    }
                    b0h b0hVar2 = this.z;
                    ISmartLandingProxy E = d9m.E();
                    Context context = this.o;
                    b0h b0hVar3 = this.z;
                    String str = b0hVar3.f;
                    Uri uri3 = b0hVar3.d;
                    if (uri3 == null) {
                        uri2 = "";
                    } else {
                        uri2 = uri3.toString();
                    }
                    b0hVar2.N = E.createSmartLanding(context, "liveHomePage", str, uri2, null);
                    this.z.w = J();
                    L();
                    this.B = true;
                    this.O = sj7.u(this.o);
                    this.P = TBAutoSizeConfig.x().H(this.o);
                    this.Q = TBAutoSizeConfig.x().B(this.o);
                    if (this.D && !this.E) {
                        this.p.runOnUiThread(new b());
                    }
                }
            }
        }
        if (!this.B) {
            r0h.b("TaoLiveHomepage", "TaoLiveNewHomePage onCreate");
            P();
            Intent intent2 = this.q;
            if (!(intent2 == null || (data = intent2.getData()) == null)) {
                try {
                    if (qw0.p()) {
                        this.z.o = data.getQueryParameter("dxAppVersion");
                    }
                    TBLiveHomePlugin.entryPageUrl = data.toString();
                } catch (Exception e2) {
                    r0h.c("TaoLiveNewHomePage", "get livehomesource exp.", e2);
                }
            }
            b0h b0hVar4 = this.z;
            b0hVar4.Q(T(b0hVar4.o));
            W();
            this.s = S();
            if (this.s != null) {
                this.z.z(this.s);
            }
            b0h b0hVar5 = this.z;
            ISmartLandingProxy E2 = d9m.E();
            Context context2 = this.o;
            b0h b0hVar6 = this.z;
            String str2 = b0hVar6.f;
            Uri uri4 = b0hVar6.d;
            if (uri4 == null) {
                uri = "";
            } else {
                uri = uri4.toString();
            }
            b0hVar5.N = E2.createSmartLanding(context2, "liveHomePage", str2, uri, null);
            this.z.w = J();
            L();
            this.B = true;
            this.O = sj7.u(this.o);
            this.P = TBAutoSizeConfig.x().H(this.o);
            this.Q = TBAutoSizeConfig.x().B(this.o);
        }
    }

    @Override // tb.cus
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        BroadcastReceiver broadcastReceiver = this.A;
        if (broadcastReceiver != null) {
            LoginBroadcastHelper.unregisterLoginReceiver(this.o, broadcastReceiver);
            LocalBroadcastManager.getInstance(this.o).unregisterReceiver(this.A);
        }
        this.A = null;
        l0();
        ISmartLandingProxy.b bVar = this.z.N;
        if (bVar != null) {
            bVar.destroy();
            this.z.N = null;
        }
        bjr.d().c(zzg.PLAY_PAGEID, false);
        b0h b0hVar = this.z;
        if (!(b0hVar == null || b0hVar.q() == null)) {
            this.z.q().destroy();
        }
        Handler handler = this.y;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        NetworkStatusHelper.INetworkStatusChangeListener iNetworkStatusChangeListener = this.F;
        if (iNetworkStatusChangeListener != null) {
            NetworkStatusHelper.removeStatusChangeListener(iNetworkStatusChangeListener);
            this.F = null;
        }
    }

    public final boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a67b77d", new Object[]{this})).booleanValue();
        }
        if (Looper.getMainLooper().getThread().getId() != Thread.currentThread().getId()) {
            mbu.b("dxTemplatePreLoad_start", this.z);
            p9m.d("tbLiveChannelTabs_asyncProc", null);
            try {
                r0h.d("TaoLiveNewHomePage", "tabMenu localCache read start");
                String str = (String) owg.b("live_home_tabs");
                if (lrq.a(str)) {
                    str = owg.a(Globals.getApplication(), "live_flexalocal/tabmenu_cache.json");
                }
                String str2 = (String) owg.b("live_home_tabs_event");
                if (str2 != null) {
                    this.z.b(JSON.parseObject(str2));
                }
                TabManager.JSONDataNew jSONDataNew = (TabManager.JSONDataNew) JSON.parseObject(str, TabManager.JSONDataNew.class);
                if (jSONDataNew != null) {
                    this.H = jSONDataNew.data;
                }
                if (this.H.hideBottomNavigation) {
                    this.z.l = 0;
                } else {
                    this.z.l = this.o.getResources().getDimensionPixelOffset(R.dimen.homepage2024_bottom_tab_height);
                }
                this.s.put("bottomBarHeight", (Object) Float.valueOf(pb6.C(this.o, this.z.l)));
                ArrayList arrayList = new ArrayList();
                if (!p0.g(this.z.t())) {
                    arrayList.add("taolive_discover_tab_container_2024");
                    arrayList.add("taolive_discovery_live_banner_v2");
                    arrayList.add("taolive_discovery_feed_goods_card_v2");
                    arrayList.add("taolive_discovery_livemove_good_v2");
                    arrayList.add("taolive_discovery_flow_banner_v2");
                } else {
                    arrayList.add("taolive_discovery_feed_2025");
                }
                arrayList.add("taolive_discovery_feed_live_v2");
                arrayList.add("taolive_discovery_head_card_2024");
                this.z.q().getDinamicSdkManager().preLoad(this.o, arrayList);
                mbu.b("dxTemplatePreLoad_end", this.z);
                return true;
            } catch (Exception e) {
                r0h.c("TaoLiveNewHomePage", "tabMenu local data read exp", e);
            }
        }
        p9m.d("tbLiveChannelTabs_asyncProc", null);
        return false;
    }

    public final void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92ab7738", new Object[]{this});
        } else if (Looper.getMainLooper().getThread().getId() != Thread.currentThread().getId()) {
            synchronized (iza.class) {
                iza.c();
            }
            if (nvs.s()) {
                p9m.e("tbLiveNewChannel_batchPreFetch");
                try {
                    if (p0.g(this.z.t())) {
                        if (p0.j(this.z.t())) {
                            if (kza.d != null) {
                                iza.b(this.z, this.o, kza.d, true);
                            }
                        } else if (kza.e != null) {
                            iza.b(this.z, this.o, kza.e, false);
                        }
                    }
                } catch (Exception e) {
                    r0h.c("TaoLiveNewHomePage", "tabMenu local data read exp", e);
                }
            }
        }
    }

    public final void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aefda9ed", new Object[]{this});
            return;
        }
        List<TabManager.TabBottom> i = TabManager.q().i();
        if (!(i == null || TabManager.q().m())) {
            int size = i.size();
            for (int i2 = 0; i2 < size; i2++) {
                TabManager.TabBottom tabBottom = i.get(i2);
                JSONObject jSONObject = tabBottom.tabUT;
                if (jSONObject != null) {
                    Map<String, String> R2 = R(jSONObject.getString("spm"), this.z.x.tabUT.toJSONString());
                    if (tabBottom.subscriptInfo != null) {
                        String format = new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance(Locale.CHINA).getTime());
                        String string = tabBottom.subscriptInfo.getString("id");
                        if (!TextUtils.isEmpty(lws.a(string))) {
                            String[] split = lws.a(string).split("_");
                            String str = split[0];
                            int parseInt = Integer.parseInt(split[1]);
                            if (!format.equals(str) || parseInt < tabBottom.subscriptInfo.getInteger("exposeTimes").intValue()) {
                                R2.put("isCorner", "1");
                            } else {
                                R2.put("isCorner", "2");
                            }
                        }
                    } else {
                        R2.put("isCorner", "2");
                    }
                    p9m.g(tabBottom.tabUT.getString("show"), R2);
                }
            }
        }
    }

    public final void P() {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3d0303", new Object[]{this});
            return;
        }
        Intent intent = this.q;
        if (intent != null && (data = intent.getData()) != null) {
            try {
                this.r = data.getQueryParameter("livesource");
                this.h = data.getQueryParameter("contentId");
                this.i = data.getQueryParameter(yj4.PARAM_SUB_CONTENT_ID);
                this.m = data.getQueryParameter("channelType");
                if ("true".equals(this.z.e)) {
                    this.m = "jingxuan";
                }
                if ("jingxuan,singleLiveTab".equals(this.m)) {
                    this.m = "jingxuan";
                }
                String queryParameter = data.getQueryParameter(yj4.PARAM_EXTEND);
                String queryParameter2 = data.getQueryParameter("rightInfo");
                String queryParameter3 = data.getQueryParameter("channelId");
                String queryParameter4 = data.getQueryParameter("channelType");
                String queryParameter5 = data.getQueryParameter("contentId");
                String queryParameter6 = data.getQueryParameter("scm");
                String queryParameter7 = data.getQueryParameter("spm");
                String queryParameter8 = data.getQueryParameter("pvidUrl");
                String queryParameter9 = data.getQueryParameter("commonTransparentData");
                JSONObject jSONObject = new JSONObject();
                this.l = jSONObject;
                jSONObject.put(yj4.PARAM_EXTEND, (Object) queryParameter);
                this.l.put("rightInfo", (Object) queryParameter2);
                this.l.put("channelId", (Object) queryParameter3);
                this.l.put("channelType", (Object) queryParameter4);
                this.l.put("contentId", (Object) queryParameter5);
                this.l.put("scm", (Object) queryParameter6);
                this.l.put("spm", (Object) queryParameter7);
                this.l.put("pvidUrl", (Object) queryParameter8);
                this.l.put("commonTransparentData", (Object) queryParameter9);
                this.j = data.getQuery();
            } catch (Exception e) {
                r0h.c("TaoLiveNewHomePage", "get uri params exp.", e);
            }
        }
    }

    public void Y(View view, int i) {
        LiveNewTabView liveNewTabView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80300b1c", new Object[]{this, view, new Integer(i)});
            return;
        }
        ViewPager viewPager = this.f8777a;
        if (viewPager != null && this.b != null) {
            int currentItem = viewPager.getCurrentItem();
            Fragment fragment = (Fragment) this.b.instantiateItem((ViewGroup) this.f8777a, currentItem);
            if (fragment instanceof HomeSelectedContainerFragment) {
                LiveNewTabView liveNewTabView2 = this.c;
                if (liveNewTabView2 != null && liveNewTabView2.getTab(0) != null) {
                    LiveNewTabView.d tab = this.c.getTab(0);
                    if (nvs.C() && tab.a()) {
                        ((HomeSelectedContainerFragment) fragment).P3();
                        n0(false, tab, true);
                    } else if (nvs.D() && this.c != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (((float) (currentTimeMillis - this.t)) >= nvs.c() * 1000.0f) {
                            this.t = currentTimeMillis;
                            View tabView = this.c.getTabView(currentItem);
                            if (tabView != null) {
                                kz0.a(tabView);
                                ((HomeSelectedContainerFragment) fragment).d3();
                                List<TabManager.TabBottom> i2 = TabManager.q().i();
                                if (i2 != null && i >= 0 && i < i2.size()) {
                                    this.z.x = i2.get(i);
                                    JSONObject jSONObject = this.z.x.tabUT;
                                    if (jSONObject != null) {
                                        p9m.c("Bottom_HomePageTab_Refresh", R(jSONObject.getString("spm"), this.z.x.tabUT.toJSONString()));
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (fragment instanceof HomeNormalFragment) {
                ((HomeNormalFragment) fragment).d3();
            } else if ((fragment instanceof HomeMainFragment) && (liveNewTabView = this.c) != null && liveNewTabView.getTab(0) != null) {
                LiveNewTabView.d tab2 = this.c.getTab(0);
                if (nvs.C() && tab2.a()) {
                    ((HomeMainFragment) fragment).T3();
                    n0(false, tab2, true);
                } else if (nvs.D() && this.c != null) {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (((float) (currentTimeMillis2 - this.t)) >= nvs.c() * 1000.0f) {
                        this.t = currentTimeMillis2;
                        View tabView2 = this.c.getTabView(currentItem);
                        if (tabView2 != null) {
                            kz0.a(tabView2);
                            ((HomeMainFragment) fragment).d3();
                            List<TabManager.TabBottom> i3 = TabManager.q().i();
                            if (i3 != null && i >= 0 && i < i3.size()) {
                                this.z.x = i3.get(i);
                                JSONObject jSONObject2 = this.z.x.tabUT;
                                if (jSONObject2 != null) {
                                    p9m.c("Bottom_HomePageTab_Refresh", R(jSONObject2.getString("spm"), this.z.x.tabUT.toJSONString()));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void Z(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6a18669", new Object[]{this, view, new Integer(i)});
            return;
        }
        ViewPager viewPager = this.f8777a;
        if (viewPager != null) {
            viewPager.setCurrentItem(i, false);
        }
        this.n = i;
        List<TabManager.TabBottom> i2 = TabManager.q().i();
        if (i2 != null && i >= 0 && i < i2.size()) {
            this.z.x = i2.get(i);
            i2.get(i).isSelected = true;
            this.c.setTabCornerMark(i, this.z.x);
            JSONObject jSONObject = this.z.x.tabUT;
            if (jSONObject != null) {
                Map<String, String> R2 = R(jSONObject.getString("spm"), this.z.x.tabUT.toJSONString());
                JSONObject jSONObject2 = this.z.x.subscriptInfo;
                if (jSONObject2 != null) {
                    String string = jSONObject2.getString("id");
                    if (!TextUtils.isEmpty(lws.a(string))) {
                        if (Integer.parseInt(lws.a(string).split("_")[1]) > this.z.x.subscriptInfo.getInteger("exposeTimes").intValue()) {
                            R2.put("isCorner", "2");
                        } else {
                            R2.put("isCorner", "1");
                        }
                    }
                } else {
                    R2.put("isCorner", "2");
                }
                p9m.c(this.z.x.tabUT.getString(pg1.ATOM_EXT_button), R2);
            }
            mbu.e("CHANGE_TAB", this.z);
        }
    }

    public final void c0(boolean z) {
        b0h b0hVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99039cb", new Object[]{this, new Boolean(z)});
        } else if (this.f8777a != null && this.b != null && this.I != null && (b0hVar = this.z) != null && b0hVar.q() != null && this.z.q().getDinamicSdkManager() != null) {
            r0h.b("TaoLiveHomepage", "refreshRootView 0");
            if (sj7.s(this.o)) {
                if (z == this.O && this.P == TBAutoSizeConfig.x().H(this.o)) {
                    r0h.b("TaoLiveHomepage", "refreshRootView 1");
                    return;
                }
            } else if (sj7.w(this.o) && this.P == TBAutoSizeConfig.x().H(this.o) && this.Q == TBAutoSizeConfig.x().B(this.o)) {
                r0h.b("TaoLiveHomepage", "refreshRootView 1");
                return;
            }
            r0h.b("TaoLiveHomepage", "refreshRootView 2");
            ViewPager viewPager = this.f8777a;
            if (!(viewPager == null || this.b == null)) {
                int childCount = viewPager.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    Fragment fragment = (Fragment) this.b.instantiateItem((ViewGroup) this.f8777a, i);
                    if (fragment instanceof HomeBaseFragment2) {
                        ((HomeBaseFragment2) fragment).e3();
                    }
                }
                this.P = TBAutoSizeConfig.x().H(this.o);
                this.Q = TBAutoSizeConfig.x().B(this.o);
                this.O = z;
            }
        }
    }

    public final void g0(List<TabManager.TabMarketing> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1aea9da", new Object[]{this, list});
        } else if (list != null && list.size() > 0 && this.e != null && !TabManager.q().m() && nvs.H()) {
            TabManager.TabMarketing tabMarketing = list.get(0);
            this.L = tabMarketing;
            if (tabMarketing != null) {
                if (!lrq.a(tabMarketing.endTime)) {
                    try {
                        if (Calendar.getInstance(Locale.CHINA).getTime().getTime() > new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(this.L.endTime).getTime()) {
                            return;
                        }
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
                if (!TextUtils.isEmpty(this.L.androidBackGroundPic)) {
                    this.M = true;
                    if ("singleLiveTab".equals(this.g)) {
                        this.e.setVisibility(8);
                    } else {
                        this.e.setVisibility(0);
                    }
                    this.e.setImageUrl(this.L.androidBackGroundPic);
                    this.c.reLayoutAdaptiveMarketing();
                    i0(this.L);
                }
                this.e.setOnClickListener(new d());
            }
        }
    }

    static {
        t2o.a(310378501);
        t2o.a(806355483);
        t2o.a(310378865);
        t2o.a(310378669);
        t2o.a(310378671);
    }

    public final void I(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("950a2adb", new Object[]{this, jSONObject});
        } else if (jSONObject != null && !lrq.a(this.j)) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                for (String str : this.j.split("&")) {
                    String[] split = str.split("=");
                    if (split.length >= 2) {
                        jSONObject2.put(split[0], (Object) split[1]);
                    }
                }
                jSONObject.put("queryParams", (Object) jSONObject2);
                this.k = jSONObject2;
            } catch (Exception e) {
                r0h.c("TaoLiveNewHomePage", "addQueryParamsOnce exp..", e);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b2, code lost:
        if (r12.equals("com.taobao.taolive.faxian.scrollInnerOffsetYChange") == false) goto L_0x0030;
     */
    @Override // tb.nlc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLiveEvent(java.lang.String r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.livehome.plugin.atype.flexalocal.TaoLiveNewHomePage.onLiveEvent(java.lang.String, java.lang.Object):void");
    }

    public final void m0(String str) {
        int parseInt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfcf70bc", new Object[]{this, str});
        } else if (this.c != null) {
            TabManager.JSONDataNew jSONDataNew = (TabManager.JSONDataNew) JSON.parseObject(str, TabManager.JSONDataNew.class);
            if (jSONDataNew != null) {
                this.H = jSONDataNew.data;
            }
            List<TabManager.TabBottom> list = this.H.bottomTab;
            for (int i = 0; i < list.size(); i++) {
                TabManager.TabBottom tabBottom = list.get(i);
                if (tabBottom != null && tabBottom.subscriptInfo != null) {
                    String format = new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance(Locale.CHINA).getTime());
                    int intValue = tabBottom.subscriptInfo.getInteger("exposeTimes").intValue();
                    String string = tabBottom.subscriptInfo.getString("id");
                    if (!TextUtils.isEmpty(lws.a("tabCornerIdList"))) {
                        String[] split = lws.a("tabCornerIdList").split(",");
                        int i2 = 0;
                        while (true) {
                            if (i2 >= split.length) {
                                lws.c("tabCornerIdList", lws.a("tabCornerIdList") + "," + string);
                                StringBuilder sb = new StringBuilder();
                                sb.append(format);
                                sb.append("_1");
                                lws.c(string, sb.toString());
                                this.c.setTabCornerMark(i, tabBottom);
                                break;
                            }
                            String str2 = split[i2];
                            if (string.equals(str2)) {
                                String[] split2 = lws.a(str2).split("_");
                                if (split2.length == 2) {
                                    if (format.equals(split2[0]) || intValue <= 0) {
                                        if (Integer.parseInt(split2[1]) < intValue) {
                                            this.c.setTabCornerMark(i, tabBottom);
                                        }
                                        lws.c(str2, format + "_" + (parseInt + 1));
                                    } else {
                                        for (String str3 : split) {
                                            lws.b(str3);
                                        }
                                        lws.c("tabCornerIdList", str2);
                                        lws.c(str2, format.concat("_1"));
                                        this.c.setTabCornerMark(i, tabBottom);
                                    }
                                }
                            } else {
                                i2++;
                            }
                        }
                    } else if (intValue > 0) {
                        lws.c("tabCornerIdList", string);
                        lws.c(string, format + "_1");
                        this.c.setTabCornerMark(i, tabBottom);
                    }
                }
            }
        }
    }
}
