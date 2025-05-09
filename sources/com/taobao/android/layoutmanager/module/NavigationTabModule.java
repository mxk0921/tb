package com.taobao.android.layoutmanager.module;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.android.revisionswitch.utils.LocationHelper;
import com.taobao.android.turbo.service.redpoint.tabicon.LTVTabIconManager;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.orange.OrangeConfig;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IFestival;
import com.taobao.tao.flexbox.layoutmanager.module.NotifyModule;
import com.taobao.tao.flexbox.layoutmanager.module.Priority;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.akt;
import tb.bud;
import tb.e0e;
import tb.ecr;
import tb.em7;
import tb.fhb;
import tb.nwv;
import tb.od0;
import tb.ppj;
import tb.s0m;
import tb.s6o;
import tb.s8d;
import tb.t2o;
import tb.tfs;
import tb.vaj;
import tb.vfs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class NavigationTabModule implements ppj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "NavigationTabModule";
    private static String currentIconData;
    private static boolean getIconInfoCalled;
    private static boolean inResetTab;
    private static JSON lastTabBarColor;
    private static int sBeforeHideNavigationBarColor;
    private static Integer DEFAULT_NAVIGATION_COLOR = null;
    private static List<d> sShowHideStatusListeners = null;
    private static d.j context = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ImageView f8210a;

        public a(ImageView imageView) {
            this.f8210a = imageView;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            BitmapDrawable drawable = succPhenixEvent.getDrawable();
            if (drawable != null) {
                this.f8210a.setImageDrawable(drawable);
                com.taobao.tao.navigation.a.Q(1, this.f8210a);
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements OnScreenChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
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
                tfs.e(NavigationTabModule.TAG, "--发生了横竖屏切换" + NavigationTabModule.access$000());
                if (NavigationTabModule.access$000() != null) {
                    NavigationTabModule.setCustomIcon(NavigationTabModule.access$000());
                }
            }
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public void onActivityChanged(Activity activity, int i, Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("994f466c", new Object[]{this, activity, new Integer(i), configuration});
            }
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public void onScreenChanged(int i, Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
            } else {
                nwv.A0(new a(), 100L);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (od0.D().f().z() != 1) {
                    com.taobao.tao.navigation.a.v(false);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface d {
        void F(boolean z);
    }

    static {
        t2o.a(502268117);
        t2o.a(503316559);
        initDefaultNavigationColor();
        registerPadScreenChanged();
    }

    public static /* synthetic */ d.j access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d.j) ipChange.ipc$dispatch("51f8511a", new Object[0]);
        }
        return context;
    }

    private static boolean checkTabbarFestival() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2f100a9", new Object[0])).booleanValue();
        }
        return OrangeConfig.getInstance().getConfig("weitao_switch", "enable_check_tabbar_festival", "true").equals("true");
    }

    public static void clearTabbarItemCache(d.j jVar) {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb5821a8", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof Map) {
            i = nwv.t(((Map) json).get("index"), 1);
        }
        fhb f = od0.D().f();
        if (f != null) {
            f.N(i);
        }
    }

    public static void closeLargeIconPop(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70cb64b7", new Object[]{jVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", (Object) Boolean.TRUE);
        jVar.c.a(jVar, jSONObject);
    }

    public static void currentTbVersionInfo(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4575500d", new Object[]{jVar});
        } else if (jVar.b instanceof Map) {
            e0e A = od0.D().A();
            if (jVar.c != null && A != null) {
                jVar.c.a(jVar, A.v());
            }
        }
    }

    private static boolean enableChangeNavigationColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e63810a7", new Object[0])).booleanValue();
        }
        return vfs.g().e("weitao_switch", "enableChangeNavigationColor", "false").equals("true");
    }

    private static boolean enableChangeTabColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9dd2690c", new Object[0])).booleanValue();
        }
        return OrangeConfig.getInstance().getConfig("weitao_switch", "enable_change_tab_color", "true").equals("true");
    }

    private static boolean enableHideNavigation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b34c5964", new Object[0])).booleanValue();
        }
        return vfs.g().e("weitao_switch", "enableHideNavigation", "true").equals("true");
    }

    private static boolean enableQuickSetTabColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3aecc451", new Object[0])).booleanValue();
        }
        return OrangeConfig.getInstance().getConfig("weitao_switch", "enable_quick_set_tab_color", "false").equals("true");
    }

    public static int getDefaultNavigationColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c98e229e", new Object[0])).intValue();
        }
        Integer num = DEFAULT_NAVIGATION_COLOR;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public static void getIconInfo(d.j jVar) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa63f8ef", new Object[]{jVar});
            return;
        }
        getIconInfoCalled = true;
        if (jVar.c != null) {
            String str = currentIconData;
            if (str != null) {
                try {
                    parseObject = JSON.parseObject(str);
                } catch (Throwable unused) {
                    tfs.e(TAG, "getIconInfo, iconstream invalid: " + currentIconData);
                }
                jVar.c.a(jVar, parseObject);
            }
            parseObject = null;
            jVar.c.a(jVar, parseObject);
        }
    }

    private static String getNavigationStatusDesc(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94228451", new Object[]{new Integer(i)});
        }
        if (i == 14) {
            return "appear";
        }
        if (i == 15) {
            return "disappear";
        }
        if (i == 13) {
            return "click";
        }
        return "unknown";
    }

    private static boolean hasForbiddenFestival() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f536c622", new Object[0])).booleanValue();
        }
        if (checkTabbarFestival()) {
            return hasTabFestival();
        }
        if (ecr.e() != 0) {
            return true;
        }
        return false;
    }

    private static boolean hasTabFestival() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d2e7c3e", new Object[0])).booleanValue();
        }
        return ecr.h();
    }

    private static void initDefaultNavigationColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4d3e3e5", new Object[0]);
            return;
        }
        fhb f = od0.D().f();
        if (DEFAULT_NAVIGATION_COLOR == null && f != null && f.a() != null) {
            DEFAULT_NAVIGATION_COLOR = Integer.valueOf(s6o.r(f.a()));
        }
    }

    public static void isInHomeLiveTab(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21fbcf31", new Object[]{jVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("inLiveTab", (Object) Boolean.FALSE);
        jVar.c.a(jVar, jSONObject);
    }

    public static void onReset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76b89f37", new Object[0]);
            return;
        }
        fhb f = od0.D().f();
        if (f != null && f.F(1) && lastTabBarColor != null) {
            changeTabBarColor(new d.j(null, lastTabBarColor, null));
        }
    }

    public static void onTabChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62d6597e", new Object[]{new Integer(i)});
        } else if (i == 1) {
            if (lastTabBarColor != null && enableQuickSetTabColor()) {
                changeTabBarColor(new d.j(null, lastTabBarColor, null));
            }
        } else if (enableHideNavigation()) {
            fhb f = od0.D().f();
            if (f != null) {
                f.G(false, false);
            }
            if (akt.p2("fixNavigationBarHide", true)) {
                nwv.A0(new c(), 300L);
            }
        }
    }

    public static void queryLargeIconStatus(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("324770ce", new Object[]{jVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        Boolean bool = Boolean.FALSE;
        jSONObject.put("largeIconMode", (Object) bool);
        jSONObject.put("largeIconPopIsShowing", (Object) bool);
        Boolean bool2 = Boolean.TRUE;
        jSONObject.put("homeLiveTabStatus", (Object) bool2);
        jSONObject.put("poplayerStatus", (Object) bool2);
        fhb f = od0.D().f();
        if (f != null) {
            jSONObject.put("mainTabStatus", (Object) Integer.valueOf(f.z()));
        }
        jSONObject.put("festivalStatus", (Object) bool);
        jVar.c.a(jVar, jSONObject);
    }

    public static void queryPop(d.j jVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9beac443", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof Map) {
            String str = (String) ((Map) json).get("layerType");
            JSONObject jSONObject2 = new JSONObject();
            if (PopLayer.isSetup()) {
                JSONObject queryNowPopCount = PopLayer.queryNowPopCount();
                if (queryNowPopCount.containsKey("completeLayerType") && (jSONObject = queryNowPopCount.getJSONObject("completeLayerType")) != null && jSONObject.containsKey(str)) {
                    jSONObject2.put("completeCount", (Object) Integer.valueOf(queryNowPopCount.getJSONObject("completeLayerType").getIntValue(str)));
                }
            }
            jSONObject2.put("largeIconPopIsShowing", (Object) Boolean.FALSE);
            jVar.c.a(jVar, jSONObject2);
        }
    }

    public static void registerNavigationShowHideStatusListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9946b1e", new Object[]{dVar});
            return;
        }
        if (sShowHideStatusListeners == null) {
            sShowHideStatusListeners = new ArrayList();
        }
        if (dVar != null && !sShowHideStatusListeners.contains(dVar)) {
            sShowHideStatusListeners.add(dVar);
        }
    }

    private static void registerPadScreenChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5726341f", new Object[0]);
        } else if (s6o.E(3)) {
            TBAutoSizeConfig.x().d0(new b());
        }
    }

    public static void resetTab(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55c5786", new Object[]{jVar});
            return;
        }
        context = null;
        inResetTab = false;
    }

    public static void setCustomIcon(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e58f4480", new Object[]{jVar});
        } else {
            context = jVar;
        }
    }

    public static void setTabAnimationIcon(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecd38ec2", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof Map) {
            setTabAnimationIcon((String) ((Map) json).get("icon"));
        }
    }

    public static void setTabbarHidden(d.j jVar) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fa092a2", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof Map) {
            boolean o = nwv.o(((Map) json).get("hidden"), false);
            boolean o2 = nwv.o(((Map) jVar.b).get("animate"), true);
            fhb f = od0.D().f();
            if (enableHideNavigation() && f != null && f.J(jVar.c())) {
                if (o && f.F(1)) {
                    z = true;
                }
                f.G(z, o2);
                if (enableChangeNavigationColor() && f.a() != null) {
                    Activity a2 = f.a();
                    if (z) {
                        sBeforeHideNavigationBarColor = s6o.r(a2);
                        s6o.L(a2, -16777216);
                        return;
                    }
                    s6o.L(a2, sBeforeHideNavigationBarColor);
                }
            }
        }
    }

    public static void unregisterNavigationShowHideStatusListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c3b3e77", new Object[]{dVar});
            return;
        }
        List<d> list = sShowHideStatusListeners;
        if (list != null && dVar != null) {
            list.remove(dVar);
        }
    }

    public String getTabBiz() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6e9d345", new Object[]{this});
        }
        return "tab2";
    }

    @Override // tb.ppj
    public void onIntroductoryStateChanged(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("539cca12", new Object[]{this, str, new Integer(i), str2});
            return;
        }
        tfs.e(TAG, "onIntroductoryStateChanged, materialType: " + str + " status: " + i + " data:" + str2);
        LTVTabIconManager.Companion.b(str, i, str2);
    }

    public static void isInTab(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cc47e26", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof Map) {
            int t = nwv.t(((Map) json).get("index"), 1);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", (Object) Boolean.valueOf(od0.D().f().F(t)));
            jVar.c.a(jVar, jSONObject);
        }
    }

    public static void notifyNavigationShowHideStatus(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5971ad9f", new Object[]{new Boolean(z)});
            return;
        }
        try {
            List<d> list = sShowHideStatusListeners;
            if (list != null) {
                for (d dVar : list) {
                    if (dVar != null) {
                        dVar.F(z);
                    }
                }
            }
        } catch (Throwable th) {
            tfs.e("notifyNavigationShowHideStatus", th.getMessage());
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", (Object) "GuangguangBottomTabbarHiddenChanged");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("hidden", (Object) Boolean.valueOf(z));
        jSONObject2.put("realHidden", (Object) Boolean.valueOf(!com.taobao.tao.navigation.a.y()));
        jSONObject.put("args", (Object) jSONObject2);
        NotifyModule.postNotify(new d.j(null, jSONObject, null));
    }

    public static void setTabbarItem(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42cf5559", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof Map) {
            int t = nwv.t(((Map) json).get("index"), 1);
            String I = nwv.I(((Map) jVar.b).get("selectedImage"), "");
            String I2 = nwv.I(((Map) jVar.b).get("unselectedImage"), "");
            String I3 = nwv.I(((Map) jVar.b).get("title"), "");
            fhb f = od0.D().f();
            if (f != null) {
                f.M(t, I, I2, I3);
            }
        }
    }

    @Priority(name = "high")
    public static void changeTabBarColor(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e630a37", new Object[]{jVar});
        } else if ((jVar.b instanceof Map) && !hasForbiddenFestival() && enableChangeTabColor()) {
            Object obj = ((Map) jVar.b).get(vaj.KEY_BG_COLOR);
            Object obj2 = ((Map) jVar.b).get("iconColor");
            boolean o = nwv.o(((Map) jVar.b).get(DMComponent.RESET), false);
            initDefaultNavigationColor();
            fhb f = od0.D().f();
            if (f != null && f.F(1)) {
                f.I(obj2, obj, o, DEFAULT_NAVIGATION_COLOR);
                lastTabBarColor = jVar.b;
            }
        }
    }

    public static void envForTabIcon(d.j jVar) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2f15f5a", new Object[]{jVar});
        } else if (jVar.b instanceof Map) {
            JSONObject jSONObject = new JSONObject();
            boolean d2 = LocationHelper.d(jVar.c());
            boolean d3 = TBRevisionSwitchManager.c().d(bud.KEY_NEW_DISCOVERY_ENABLE);
            IFestival.FestivalInfo t = od0.D().k().t();
            jSONObject.put("isFestivalOn", (Object) Boolean.valueOf(t.isFestivalOn));
            jSONObject.put("hasTabbarFestival", (Object) Boolean.valueOf(t.hasTabbarFestival));
            jSONObject.put("isTabbarTitleSplit", (Object) Boolean.valueOf(t.isTabbarTitleSplit));
            if (d2 && d3) {
                z = true;
            }
            jSONObject.put("isForeignSelected", (Object) Boolean.valueOf(z));
            jSONObject.put(em7.IS_ELDER, (Object) Boolean.valueOf(od0.D().A().a()));
            jVar.c.a(jVar, jSONObject);
        }
    }

    public static void isForeignSelected(d.j jVar) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54d62327", new Object[]{jVar});
        } else if (jVar.b instanceof Map) {
            JSONObject jSONObject = new JSONObject();
            boolean d2 = LocationHelper.d(jVar.c());
            boolean d3 = TBRevisionSwitchManager.c().d(bud.KEY_NEW_DISCOVERY_ENABLE);
            if (d2 && d3) {
                z = true;
            }
            jSONObject.put("result", (Object) Boolean.valueOf(z));
            jVar.c.a(jVar, jSONObject);
        }
    }

    public static void isTabbarHidden(d.j jVar) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db60deda", new Object[]{jVar});
        } else if (jVar.b instanceof Map) {
            fhb f = od0.D().f();
            if (f != null && f.C()) {
                z = true;
            }
            if (jVar.c != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("result", Boolean.valueOf(!z));
                jVar.c.a(jVar, hashMap);
            }
        }
    }

    public static void setTabAnimationIcon(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55fc081b", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            s0m.B().T(str).succListener(new a(new ImageView(com.taobao.tao.navigation.a.o().getContext()))).fetch();
        }
    }
}
