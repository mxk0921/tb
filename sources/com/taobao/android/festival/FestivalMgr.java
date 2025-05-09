package com.taobao.android.festival;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.taobao.TBActionBar;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.localization.constants.Language;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.ThemeInfoResult;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.android.festival.skin.SkinConfig;
import com.taobao.android.tbtheme.kit.ThemeData;
import com.taobao.android.tbtheme.kit.ThemeFrameLayout;
import com.taobao.tao.BaseActivity;
import com.taobao.tao.Globals;
import com.taobao.tao.util.StringUtil;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.cpt;
import tb.fpt;
import tb.fsw;
import tb.g1q;
import tb.s69;
import tb.slo;
import tb.t2o;
import tb.tot;
import tb.uk2;
import tb.var;
import tb.vot;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class FestivalMgr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_FESTIVAL_CHANGE = "com.taobao.android.action.FESTIVAL_CHANGE";
    public static final String ACTION_TABBAR_CHANGE_DONE = "com.taobao.android.action.FESTIVAL_TABBAR_CHANGE_DONE";
    public static final String COMMON_EXTRA_REASON = "extra-reason";
    public static final String EXTRA_FESTIVAL_CHANGE_REASON = "change-reason";
    public static final String FESTIVAL_CHANGE_REASON_CONFIG_CHANGE = "festival-config-change";
    public static final String KEY_GLOBAL_ACTIONBAR_BG = "actionBarBackgroundColor";
    @Deprecated
    public static final String KEY_GLOBAL_ACTIONBAR_BG_TYPE = "actionBarBackgroundType";
    public static final String KEY_GLOBAL_ACTIONBAR_IMG = "actionBarBackgroundImage";
    public static final String KEY_GLOBAL_ACTIONBAR_MOTION_IMG_POS = "actionbarMotionImagePos";
    public static final String KEY_GLOBAL_ACTIONBAR_UPINDICATOR = "actionBarUpIndicator";
    public static final String KEY_GLOBAL_MSGCENTER_BG = "messageBackgroundColor";
    public static final String KEY_GLOBAL_MSGCENTER_BORDER_COLOR = "messageBorderColor";
    public static final String KEY_GLOBAL_MSGCENTER_NUM_COLOR = "messageNumColor";
    public static final String MODUlE_GLOBAL = "global";
    public static final String SKIN_CHANGE_REASON_CONFIG_CHANGE = "skin-config-change";
    public static final String TAG = "festival";
    public static final int TIME_OUT_INTERVAL = 5000;
    public static final FestivalMgr h = new FestivalMgr();
    public GloblaNavUIConfig c;
    public boolean d;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final vot f = new vot();
    public final List<WeakReference<ThemeFrameLayout>> g = new CopyOnWriteArrayList();

    /* renamed from: a  reason: collision with root package name */
    public final s69 f7660a = s69.e();
    public final g1q b = g1q.h();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Localization.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.alibaba.ability.localization.Localization.a
        public void onChange(Language language, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c58b74d", new Object[]{this, language, str});
            } else {
                FestivalMgr.b(FestivalMgr.this).o();
            }
        }
    }

    static {
        t2o.a(464519170);
    }

    public FestivalMgr() {
        uk2.a(true, new BroadcastReceiver() { // from class: com.taobao.android.festival.FestivalMgr.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/festival/FestivalMgr$1");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if (intent != null && !TextUtils.isEmpty(intent.getAction())) {
                    FestivalMgr.a(FestivalMgr.this, null);
                    LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent(cpt.ACTION_THEME_CHANGE));
                }
            }
        }, ACTION_FESTIVAL_CHANGE);
    }

    public static /* synthetic */ void a(FestivalMgr festivalMgr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7d31b58", new Object[]{festivalMgr, str});
        } else {
            festivalMgr.K(str);
        }
    }

    public static /* synthetic */ g1q b(FestivalMgr festivalMgr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1q) ipChange.ipc$dispatch("cdb29476", new Object[]{festivalMgr});
        }
        return festivalMgr.b;
    }

    public static FestivalMgr i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FestivalMgr) ipChange.ipc$dispatch("6eef7a27", new Object[0]);
        }
        return h;
    }

    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf67b2c", new Object[]{this});
        } else {
            this.f7660a.k();
        }
    }

    public void B(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdc6d1b8", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.f.i(str);
            K(str);
        }
    }

    public void C(Context context, TBActionBar.ActionBarStyle actionBarStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d562694", new Object[]{this, context, actionBarStyle});
        } else {
            E(context, null, actionBarStyle);
        }
    }

    public void D(Context context, TBActionBar.ActionBarStyle actionBarStyle, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d6f5ec0", new Object[]{this, context, actionBarStyle, new Boolean(z)});
        } else {
            F(context, null, actionBarStyle, z);
        }
    }

    public void E(Context context, View view, TBActionBar.ActionBarStyle actionBarStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9381495b", new Object[]{this, context, view, actionBarStyle});
        } else if (context != null) {
            if (this.c == null) {
                this.c = new GloblaNavUIConfig(context);
            }
            if (context instanceof BaseActivity) {
                ((BaseActivity) context).setIgnoreFestival(false);
            }
            this.c.a(context, view, actionBarStyle);
        }
    }

    public void F(Context context, View view, TBActionBar.ActionBarStyle actionBarStyle, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dca894d9", new Object[]{this, context, view, actionBarStyle, new Boolean(z)});
        } else if (context != null) {
            if (this.c == null) {
                this.c = new GloblaNavUIConfig(context);
            }
            if (context instanceof BaseActivity) {
                ((BaseActivity) context).setIgnoreFestival(z);
            }
            this.c.b(context, view, actionBarStyle, z);
        }
    }

    public void G(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f15a3516", new Object[]{this, str, jSONObject});
        } else if (!TextUtils.isEmpty(str) && jSONObject != null) {
            H(str, fpt.a(jSONObject));
        }
    }

    public void H(String str, ThemeData themeData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daf6ec96", new Object[]{this, str, themeData});
        } else if (!TextUtils.isEmpty(str) && themeData != null) {
            this.f.j(str, themeData);
            K(str);
        }
    }

    public void I(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8b8923", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ccf4b305", new Object[]{this})).booleanValue();
        }
        return "0".equalsIgnoreCase(this.f.e(null).naviStyle);
    }

    public final void K(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("979857ac", new Object[]{this, str});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            ThemeFrameLayout themeFrameLayout = (ThemeFrameLayout) weakReference.get();
            if (themeFrameLayout == null) {
                ((CopyOnWriteArrayList) this.g).remove(weakReference);
            } else if (str == null || str.equals(themeFrameLayout.getBizName())) {
                themeFrameLayout.loadData(m(themeFrameLayout.getBizName()));
            }
        }
    }

    public void L(SkinConfig skinConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d452afc", new Object[]{this, skinConfig});
        } else {
            this.b.q(skinConfig);
        }
    }

    public SkinConfig M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SkinConfig) ipChange.ipc$dispatch("91c86d4d", new Object[]{this});
        }
        return this.b.r();
    }

    public ThemeFrameLayout c(Context context, tot totVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThemeFrameLayout) ipChange.ipc$dispatch("74f571d6", new Object[]{this, context, totVar});
        }
        if (totVar == null) {
            return null;
        }
        ThemeFrameLayout themeFrameLayout = new ThemeFrameLayout(context, totVar);
        themeFrameLayout.loadData(m(totVar.f28850a));
        ((CopyOnWriteArrayList) this.g).add(new WeakReference(themeFrameLayout));
        return themeFrameLayout;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    public int e(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dd35252e", new Object[]{this, str, str2, new Integer(i)})).intValue();
        }
        if (t()) {
            return this.f7660a.b(str, str2, i);
        }
        return this.b.d(str, str2, i);
    }

    public String f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6204afec", new Object[]{this, str, str2});
        }
        if (t()) {
            return this.f7660a.c(str, str2);
        }
        return this.b.f(str, str2);
    }

    public int h(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e6486fb", new Object[]{this, str, new Integer(i)})).intValue();
        }
        if (t()) {
            return this.f7660a.d(str, i);
        }
        return this.b.g(str, i);
    }

    public Map<String, String> j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fc22d04a", new Object[]{this, str});
        }
        if (t()) {
            return this.f7660a.f(str);
        }
        return this.b.i(str);
    }

    public String k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f88e7cb6", new Object[]{this, str});
        }
        if (t()) {
            return "";
        }
        return this.b.j(str);
    }

    public String l(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aaf277a2", new Object[]{this, str, str2});
        }
        if (t()) {
            return this.f7660a.g(str, str2);
        }
        return this.b.k(str, str2, true);
    }

    public ThemeData m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThemeData) ipChange.ipc$dispatch("657b58e4", new Object[]{this, str});
        }
        return this.f.e(str);
    }

    public ThemeInfoResult n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThemeInfoResult) ipChange.ipc$dispatch("619b8e26", new Object[]{this, str});
        }
        return this.f.f(str);
    }

    public String o(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2cd966d5", new Object[]{this, str, str2});
        }
        return this.f.g(str, str2);
    }

    public String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b87e372c", new Object[]{this});
        }
        if (s()) {
            return "DARKMODE";
        }
        if (x()) {
            return "SKIN";
        }
        if (t()) {
            return "FESTIVAL";
        }
        return "NONE";
    }

    public boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77b079f4", new Object[]{this})).booleanValue();
        }
        return var.c(Globals.getApplication());
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a85e2f0", new Object[]{this})).booleanValue();
        }
        if (this.b.b()) {
            return false;
        }
        return this.f7660a.a();
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2f2b90", new Object[]{this})).booleanValue();
        }
        if (this.f7660a.a() || this.b.b()) {
            return true;
        }
        return false;
    }

    public boolean v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f24a39f8", new Object[]{this, str})).booleanValue();
        }
        if (t()) {
            return this.f7660a.i(str);
        }
        return this.b.m(str);
    }

    public boolean w(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2cb84ec2", new Object[]{this, str, str2})).booleanValue();
        }
        if (t()) {
            return this.f7660a.j(str, str2);
        }
        return this.b.n(str, str2);
    }

    public boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7ca81b5", new Object[]{this})).booleanValue();
        }
        return this.b.b();
    }

    public boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9737200d", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    @Deprecated
    public Map<String, String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e683071f", new Object[]{this});
        }
        String str = "0";
        String str2 = (t() || x()) ? "1" : str;
        String l = l("global", slo.KEY_NAVI_STYLE);
        if (TextUtils.isEmpty(l)) {
            l = "-1";
        }
        try {
            int parseInt = Integer.parseInt(l);
            str = (parseInt + 1) + "";
        } catch (Exception unused) {
        }
        HashMap hashMap = new HashMap();
        hashMap.put("isFestivalOn", str2);
        hashMap.put("navStyle", str);
        return hashMap;
    }

    public boolean q() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c240fc1b", new Object[]{this})).booleanValue();
        }
        if (StringUtil.isEmpty(l("global", "tabbarImagesURL_home")) && StringUtil.isEmpty(l("global", "tabbarImagesURL_home_second_selected")) && StringUtil.isEmpty(l("global", "tabbarImagesURL_we")) && StringUtil.isEmpty(l("global", "tabbarImagesURL_we_selected")) && StringUtil.isEmpty(l("global", "tabbarImagesURL_community")) && StringUtil.isEmpty(l("global", "tabbarImagesURL_community_selected")) && StringUtil.isEmpty(l("global", "tabbarImagesURL_cart")) && StringUtil.isEmpty(l("global", "tabbarImagesURL_cart_selected")) && StringUtil.isEmpty(l("global", "tabbarImagesURL_my")) && StringUtil.isEmpty(l("global", "tabbarImagesURL_my_selected")) && StringUtil.isEmpty(l("global", "tabbarTextColorSel")) && StringUtil.isEmpty(l("global", "tabbarTextColorUnsel")) && StringUtil.isEmpty(l("global", "tabbarTextColorUnSel")) && StringUtil.isEmpty(l("global", "tabbarImagesURL_tabbar_bkg"))) {
            z = true;
        }
        return !z;
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (this.e.compareAndSet(false, true)) {
            this.f7660a.h();
            this.b.l();
            fsw.i("AliFestivalWVPlugin", AliFestivalWVPlugin.class, true);
            Localization.a(new a());
        }
    }

    public boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c4ad67c", new Object[]{this})).booleanValue();
        }
        if (t()) {
            return "true".equals(this.f7660a.g("global", "isTabbarTitleSeparated"));
        }
        String f = this.b.f("global", "isTabbarTitleSeparated");
        return !TextUtils.isEmpty(f) && "true".equals(f);
    }
}
