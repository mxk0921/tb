package com.taobao.tao.navigation;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabWidget;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.alibaba.fastjson.JSONObject;
import com.alipay.birdnest.util.UiUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.navigationextern.a;
import com.taobao.android.task.Coordinator;
import com.taobao.message.util.MessageNavProcessorV2;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.Interface.TabHostStatusListener;
import com.taobao.tao.navigation.TBFragmentTabHost;
import com.taobao.tao.navigation.b;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.ege;
import tb.fge;
import tb.grs;
import tb.hvd;
import tb.jpj;
import tb.rpj;
import tb.rps;
import tb.rqs;
import tb.tpj;
import tb.tqs;
import tb.upj;
import tb.urs;
import tb.vpj;
import tb.w4v;
import tb.wpj;
import tb.xe2;
import tb.y9a;
import tb.ypj;
import tb.zpj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ArrayList<com.taobao.tao.navigation.b> b;
    public static HashMap<String, Integer> g;
    public static CopyOnWriteArrayList<FragmentManager.FragmentLifecycleCallbacks> h;
    public static CopyOnWriteArrayList<hvd> i;
    public static rqs q;
    public static d r;
    public static final Map<String, TabHostStatusListener> s;

    /* renamed from: a  reason: collision with root package name */
    public static final ArrayList<com.taobao.tao.navigation.b> f12555a = new ArrayList<>();
    public static boolean c = false;
    public static ArrayList<String> d = new ArrayList<>();
    public static boolean e = false;
    public static TBFragmentTabHost f = null;
    public static rps j = null;
    public static final Map<Integer, h> k = new HashMap();
    public static vpj l = null;
    public static final List<jpj> m = new CopyOnWriteArrayList();
    public static final List<grs> n = new CopyOnWriteArrayList();
    public static final List<g> o = new ArrayList();
    public static e p = null;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.tao.navigation.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class RunnableC0715a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                for (jpj jpjVar : a.a()) {
                    jpjVar.a();
                }
            } catch (Exception e) {
                String c = y9a.c();
                TLog.loge(c, "Navigation", "notifyNavigationExposured failed. " + e.toString());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b implements TBFragmentTabHost.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("69e786e6", new Object[]{this});
            } else {
                a.b();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface d {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface e {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class f implements rqs {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.rqs
        public int a(String str, String str2, View view, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a5b5aa1", new Object[]{this, str, str2, view, new Integer(i)})).intValue();
            }
            int a2 = xe2.a(str);
            if (a2 == -1) {
                String c = y9a.c();
                TLog.loge(c, "Navigation", "Update message count failed for index out of range!" + str);
                return 8;
            } else if (a.d(a2, view, i)) {
                return 1;
            } else {
                return -1;
            }
        }

        @Override // tb.rqs
        public boolean b(String str, NavigationTabMsgMode navigationTabMsgMode, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a548b394", new Object[]{this, str, navigationTabMsgMode, str2})).booleanValue();
            }
            return a.c(xe2.a(str), navigationTabMsgMode, str2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface g {
        void reset();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface h {
    }

    static {
        ArrayList<com.taobao.tao.navigation.b> arrayList = new ArrayList<>();
        b = arrayList;
        new HashMap();
        arrayList.clear();
        for (int i2 = 0; i2 < 5; i2++) {
            b.C0716b bVar = new b.C0716b();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            if (i2 == 0) {
                hashMap.put("spm-url", "a2141.1.tabbar.homepage");
                hashMap2.put("pageName", "Page_TabVC");
                hashMap2.put("controlName", "Button-Home");
                bVar.g(new Pair<>(Integer.valueOf(R.drawable.uik_nav_home_normal), Integer.valueOf(R.drawable.uik_nav_home_selected))).h(NavigationTabIconSourceType.DRAWABLE).o(false).q("首页").l("http://m.taobao.com/index.htm").j("0").k(NavigationTabMsgMode.NONE).d("com.taobao.tao.homepage.MainActivity3").f("com.taobao.tao.homepage.HomepageFragment").m(false).n(true).r(hashMap).e(hashMap2).i(false).p(0).b("homePage");
            } else if (i2 == 1) {
                hashMap.put("spm-url", "a2141.1.tabbar.guangguang");
                hashMap2.put("pageName", "Page_TabVC");
                hashMap2.put("controlName", "Button-guangguang");
                bVar.g(new Pair<>(Integer.valueOf(R.drawable.uik_nav_guangguang_normal), Integer.valueOf(R.drawable.uik_nav_guangguang_selected))).h(NavigationTabIconSourceType.DRAWABLE).o(false).q("逛逛").l("https://h5.m.taobao.com/guangguang/index.htm").j("0").k(NavigationTabMsgMode.RED_POINT_INDICATOR).d("com.taobao.wetao.home.WeTaoMainActivity").f("com.taobao.wetao.home.GuangGuangTnodeMainFragment").c("com.taobao.allspark").m(true).n(true).r(hashMap).e(hashMap2).i(false).p(1).b("tab2");
            } else if (i2 == 2) {
                hashMap.put("spm-url", "a2141.1.tabbar.ocean");
                hashMap2.put("pageName", "Page_TabVC");
                hashMap2.put("controlName", "Button-Message");
                bVar.g(new Pair<>(Integer.valueOf(R.drawable.uik_nav_message_normal), Integer.valueOf(R.drawable.uik_nav_message_selected))).h(NavigationTabIconSourceType.DRAWABLE).o(false).q("消息").l(MessageNavProcessorV2.ROUTE_URL_MESSAGETAB).j("0").k(NavigationTabMsgMode.RED_POINT_INDICATOR).d("com.taobao.message.category.MsgCenterCategoryTabActivity").f("com.taobao.message.conversation.MessageTabFragment").c("com.taobao.wangxin").m(true).n(true).r(hashMap).e(hashMap2).i(true).p(2).b("message");
            } else if (i2 == 3) {
                hashMap.put("spm-url", "a2141.1.tabbar.shoppingcart");
                hashMap2.put("pageName", "Page_TabVC");
                hashMap2.put("controlName", "Button-ShoppingCart");
                bVar.g(new Pair<>(Integer.valueOf(R.drawable.uik_nav_cart_normal), Integer.valueOf(R.drawable.uik_nav_cart_selected))).h(NavigationTabIconSourceType.DRAWABLE).o(false).q("购物车").l("http://h5.m.taobao.com/awp/base/newcart.htm").j("0").k(NavigationTabMsgMode.NONE).d("com.taobao.android.trade.cart.CartTabActivity").f("com.taobao.android.icart.UltronICartFragment").c("com.taobao.android.newtrade").m(true).n(true).r(hashMap).e(hashMap2).i(true).p(3).b("cart");
            } else if (i2 == 4) {
                hashMap.put("spm-url", "a2141.1.tabbar.mytaobao");
                hashMap2.put("pageName", "Page_TabVC");
                hashMap2.put("controlName", "Button-MyTaoBao");
                bVar.g(new Pair<>(Integer.valueOf(R.drawable.uik_nav_my_normal), Integer.valueOf(R.drawable.uik_nav_my_selected))).h(NavigationTabIconSourceType.DRAWABLE).o(false).q("我的淘宝").l("http://h5.m.taobao.com/awp/mtb/mtb.htm").j("0").k(NavigationTabMsgMode.NONE).d("com.taobao.tao.mytaobao.MyTaoBaoActivity").f("com.taobao.mytaobao.homepage.MyTaobaoFragment").c("com.taobao.mytaobao").m(true).n(true).r(hashMap).e(hashMap2).i(true).p(4).b("mytaobao");
            }
            if (bVar.a() != null) {
                b.add(bVar.a());
            }
        }
        s = new ConcurrentHashMap();
    }

    public static void A(String str, int i2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21566a0b", new Object[]{str, new Integer(i2), str2});
            return;
        }
        d dVar = r;
        if (dVar != null) {
            tpj tpjVar = new tpj();
            tpjVar.b = str;
            tpjVar.f28858a = i2;
            tpjVar.c = "commonMark";
            tpjVar.d = str2;
            ((upj) dVar).a(tpjVar);
        }
    }

    public static void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab258707", new Object[0]);
        } else {
            Coordinator.execute(new RunnableC0715a());
        }
    }

    public static void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b445833", new Object[0]);
            return;
        }
        vpj vpjVar = l;
        if (vpjVar != null) {
            vpjVar.M();
            TLog.loge(y9a.c(), "Navigation", "notify Style Update Called");
        }
    }

    public static void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4398335", new Object[0]);
            return;
        }
        e eVar = p;
        if (eVar != null) {
            ((a.c) eVar).c();
        }
    }

    public static void E(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c2aecc5", new Object[]{str});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) n).iterator();
        while (it.hasNext()) {
            grs grsVar = (grs) it.next();
            if (TextUtils.equals(grsVar.bizCode(), str)) {
                grsVar.a();
            }
        }
    }

    public static void F(TabHostStatusListener.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45bff8f3", new Object[]{aVar});
            return;
        }
        for (TabHostStatusListener tabHostStatusListener : ((ConcurrentHashMap) s).values()) {
            if (!(tabHostStatusListener == null || (tabHostStatusListener.listenEventType() & aVar.f12544a) == 0)) {
                tabHostStatusListener.onTabHostStatusChanged(aVar);
            }
        }
    }

    public static void G(FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80545830", new Object[]{fragmentLifecycleCallbacks});
            return;
        }
        if (h == null) {
            h = new CopyOnWriteArrayList<>();
        }
        h.add(fragmentLifecycleCallbacks);
        TBFragmentTabHost tBFragmentTabHost = f;
        if (tBFragmentTabHost != null && (tBFragmentTabHost.getContext() instanceof FragmentActivity)) {
            FragmentManager fragmentManager = f.getFragmentManager();
            if (fragmentManager == null) {
                ((FragmentActivity) f.getContext()).getSupportFragmentManager().registerFragmentLifecycleCallbacks(fragmentLifecycleCallbacks, false);
            } else {
                fragmentManager.registerFragmentLifecycleCallbacks(fragmentLifecycleCallbacks, false);
            }
        }
    }

    public static void H(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d0a5548", new Object[]{gVar});
        } else {
            ((ArrayList) o).add(gVar);
        }
    }

    public static void I(int i2, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("284013e5", new Object[]{new Integer(i2), hVar});
        } else {
            ((HashMap) k).put(Integer.valueOf(i2), hVar);
        }
    }

    public static void J(String str, TabHostStatusListener tabHostStatusListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34a8372e", new Object[]{str, tabHostStatusListener});
            return;
        }
        ((ConcurrentHashMap) s).put(str, tabHostStatusListener);
        String c2 = y9a.c();
        TLog.loge(c2, "Navigation", "registerTabHostStatusChangeListener success!" + str);
    }

    public static void K(hvd hvdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb53a86e", new Object[]{hvdVar});
            return;
        }
        CopyOnWriteArrayList<hvd> copyOnWriteArrayList = i;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(hvdVar);
        }
    }

    public static boolean L(grs grsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("777ec1ad", new Object[]{grsVar})).booleanValue();
        }
        return ((CopyOnWriteArrayList) n).remove(grsVar);
    }

    @Deprecated
    public static void M(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7580ffbc", new Object[]{new Integer(i2)});
            return;
        }
        e eVar = p;
        if (eVar == null) {
            TLog.loge(y9a.c(), "Navigation", "update Item And Cache failed; styleUpdateCalledListener is null;");
            return;
        }
        ((a.c) eVar).b(i2, null);
        TLog.loge(y9a.c(), "Navigation", "reset Item Cache");
    }

    public static synchronized void N() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList<com.taobao.tao.navigation.b> arrayList4;
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            int i2 = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e41c57ca", new Object[0]);
                return;
            }
            TLog.loge(y9a.c(), "Navigation", "resetNavigation");
            zpj.f32933a = new ColorDrawable(-1);
            zpj.b = "";
            zpj.c = Color.parseColor("#e4e4e4");
            c = false;
            e = false;
            ArrayList arrayList5 = null;
            d = null;
            ArrayList<com.taobao.tao.navigation.b> arrayList6 = f12555a;
            boolean z = (arrayList6 == null || (arrayList4 = b) == null || arrayList4.size() != arrayList6.size()) ? false : true;
            if (z) {
                arrayList5 = new ArrayList();
                arrayList3 = new ArrayList();
                arrayList2 = new ArrayList();
                arrayList = new ArrayList();
                Iterator<com.taobao.tao.navigation.b> it = arrayList6.iterator();
                while (it.hasNext()) {
                    com.taobao.tao.navigation.b next = it.next();
                    arrayList5.add(next.o());
                    arrayList3.add(next.n());
                    arrayList.add(next.z);
                    arrayList2.add(next.A);
                }
            } else {
                arrayList3 = null;
                arrayList2 = null;
                arrayList = null;
            }
            x();
            if (z) {
                while (true) {
                    ArrayList<com.taobao.tao.navigation.b> arrayList7 = f12555a;
                    if (i2 >= arrayList7.size()) {
                        break;
                    }
                    com.taobao.tao.navigation.b bVar = arrayList7.get(i2);
                    bVar.R((NavigationTabMsgMode) arrayList5.get(i2));
                    bVar.Q((String) arrayList3.get(i2));
                    bVar.z = (String) arrayList.get(i2);
                    bVar.A = (String) arrayList2.get(i2);
                    i2++;
                }
            }
            Iterator it2 = ((ArrayList) o).iterator();
            while (it2.hasNext()) {
                ((g) it2.next()).reset();
            }
            O();
        }
    }

    public static void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4648454e", new Object[0]);
            return;
        }
        TBFragmentTabHost tBFragmentTabHost = f;
        if (tBFragmentTabHost != null) {
            tBFragmentTabHost.updateTabWidgetStyle();
            u0();
        }
    }

    public static void P(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab022323", new Object[]{num});
            return;
        }
        if (g == null) {
            g = new HashMap<>(f12555a.size());
        }
        for (int i2 = 0; i2 < f12555a.size(); i2++) {
            g.put(String.valueOf(i2), num);
        }
    }

    @Deprecated
    public static void Q(int i2, ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a290242f", new Object[]{new Integer(i2), imageView});
        } else if (wpj.j()) {
            rpj.a("old_set_animation_view_called", xe2.b(i2));
        }
    }

    public static boolean R(int i2, View view, int i3) {
        NavigationTabIndicatorView tabViewAtIndex;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d7f9e65", new Object[]{new Integer(i2), view, new Integer(i3)})).booleanValue();
        }
        TBFragmentTabHost tBFragmentTabHost = f;
        if (tBFragmentTabHost == null || (tabViewAtIndex = tBFragmentTabHost.getTabViewAtIndex(i2)) == null) {
            return false;
        }
        tabViewAtIndex.setForegroundView(view, i3);
        return true;
    }

    @Deprecated
    public static void T(int i2, ypj ypjVar) {
        NavigationTabIndicatorView tabViewAtIndex;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d93c687e", new Object[]{new Integer(i2), ypjVar});
            return;
        }
        TBFragmentTabHost tBFragmentTabHost = f;
        if (tBFragmentTabHost != null && (tabViewAtIndex = tBFragmentTabHost.getTabViewAtIndex(i2)) != null) {
            tabViewAtIndex.setNavigationTabListener(ypjVar);
        }
    }

    public static void U(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b19a3d81", new Object[]{dVar});
        } else {
            r = dVar;
        }
    }

    public static void V(vpj vpjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e872bf75", new Object[]{vpjVar});
        } else {
            l = vpjVar;
        }
    }

    public static void W(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a96dbedd", new Object[]{eVar});
        } else {
            p = eVar;
        }
    }

    public static void X(rqs rqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21dd2f27", new Object[]{rqsVar});
        } else {
            q = rqsVar;
        }
    }

    public static void Z(Integer num, Integer num2, Integer num3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fc0be26", new Object[]{num, num2, num3});
            return;
        }
        TBFragmentTabHost tBFragmentTabHost = f;
        if (tBFragmentTabHost == null) {
            TLog.loge(y9a.c(), "Navigation", "setTabsColorFilter failed, sFragmentTabHost is null");
        } else {
            tBFragmentTabHost.setTabsColorFilter(num, num2, num3);
        }
    }

    public static /* synthetic */ List a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("54cf0df0", new Object[0]);
        }
        return m;
    }

    public static void a0(FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7af9df57", new Object[]{fragmentLifecycleCallbacks});
            return;
        }
        CopyOnWriteArrayList<FragmentManager.FragmentLifecycleCallbacks> copyOnWriteArrayList = h;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(fragmentLifecycleCallbacks);
            TBFragmentTabHost tBFragmentTabHost = f;
            if (tBFragmentTabHost != null && (tBFragmentTabHost.getContext() instanceof FragmentActivity)) {
                FragmentManager fragmentManager = f.getFragmentManager();
                if (fragmentManager == null) {
                    ((FragmentActivity) f.getContext()).getSupportFragmentManager().unregisterFragmentLifecycleCallbacks(fragmentLifecycleCallbacks);
                } else {
                    fragmentManager.unregisterFragmentLifecycleCallbacks(fragmentLifecycleCallbacks);
                }
            }
        }
    }

    public static /* synthetic */ void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bc42b8", new Object[0]);
        } else {
            B();
        }
    }

    public static void b0(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46aaeaf", new Object[]{gVar});
        } else {
            ((ArrayList) o).remove(gVar);
        }
    }

    public static /* synthetic */ boolean c(int i2, NavigationTabMsgMode navigationTabMsgMode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4dea14c9", new Object[]{new Integer(i2), navigationTabMsgMode, str})).booleanValue();
        }
        return l0(i2, navigationTabMsgMode, str);
    }

    public static void c0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7f66908", new Object[]{str});
            return;
        }
        ((ConcurrentHashMap) s).remove(str);
        String c2 = y9a.c();
        TLog.loge(c2, "Navigation", "unregisterTabHostStatusChangeListener success!" + str);
    }

    public static /* synthetic */ boolean d(int i2, View view, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1cdd6fe", new Object[]{new Integer(i2), view, new Integer(i3)})).booleanValue();
        }
        return R(i2, view, i3);
    }

    public static void d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8091a8b", new Object[0]);
            return;
        }
        TBFragmentTabHost tBFragmentTabHost = f;
        if (tBFragmentTabHost != null) {
            tBFragmentTabHost.unset();
            f.setExposureCallback(null);
            f = null;
            X(null);
        }
    }

    public static /* synthetic */ HashMap e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("1492211e", new Object[0]);
        }
        return g;
    }

    public static int e0(String str, String str2, View view, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d754c52e", new Object[]{str, str2, view, new Integer(i2)})).intValue();
        }
        rqs rqsVar = q;
        if (rqsVar != null) {
            return rqsVar.a(str, str2, view, i2);
        }
        String c2 = y9a.c();
        TLog.loge(c2, "Navigation", "onAlienEffectUpdated failed: tabHostStyleChangeListener is null" + str + " " + i2);
        return 4;
    }

    public static boolean f0(String str, String str2, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("303c86cc", new Object[]{str, str2, view})).booleanValue();
        }
        rqs rqsVar = q;
        if (rqsVar == null) {
            String c2 = y9a.c();
            TLog.loge(c2, "Navigation", "onAlienEffectUpdated failed: tabHostStyleChangeListener is null" + str);
            return false;
        } else if (rqsVar.a(str, str2, view, 2) == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void g(jpj jpjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c3f7a46", new Object[]{jpjVar});
        } else if (jpjVar != null) {
            ((CopyOnWriteArrayList) m).add(jpjVar);
        }
    }

    public static boolean g0(String str, String str2, View view, boolean z) {
        int i2 = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7550510", new Object[]{str, str2, view, new Boolean(z)})).booleanValue();
        }
        rqs rqsVar = q;
        if (rqsVar == null) {
            String c2 = y9a.c();
            TLog.loge(c2, "Navigation", "onAlienEffectUpdated failed: tabHostStyleChangeListener is null" + str + " " + z);
            return false;
        }
        if (!z) {
            i2 = 8;
        }
        if (rqsVar.a(str, str2, view, i2) == 1) {
            return true;
        }
        return false;
    }

    public static void h(hvd hvdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb960f1", new Object[]{hvdVar});
            return;
        }
        if (i == null) {
            i = new CopyOnWriteArrayList<>();
        }
        i.add(hvdVar);
    }

    public static boolean i(grs grsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8976e30a", new Object[]{grsVar})).booleanValue();
        }
        List<grs> list = n;
        if (!((CopyOnWriteArrayList) list).contains(grsVar)) {
            return ((CopyOnWriteArrayList) list).add(grsVar);
        }
        String c2 = y9a.c();
        TLog.loge(c2, "Navigation", "addTabPreloadCallback failed for callback is already in list!" + grsVar.bizCode());
        return false;
    }

    public static boolean i0(String str, NavigationTabMsgMode navigationTabMsgMode, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b0acf71", new Object[]{str, navigationTabMsgMode, str2})).booleanValue();
        }
        rqs rqsVar = q;
        if (rqsVar != null) {
            return rqsVar.b(str, navigationTabMsgMode, str2);
        }
        String c2 = y9a.c();
        TLog.loge(c2, "Navigation", "onCommonMarkUpdated failed: tabHostStyleChangeListener is null. " + str + " " + navigationTabMsgMode + " " + str2);
        return false;
    }

    public static boolean j(List<com.taobao.tao.navigation.b> list, List<com.taobao.tao.navigation.b> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a056c4ac", new Object[]{list, list2})).booleanValue();
        }
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!list.get(i2).d(list2.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public static synchronized void j0(int i2, com.taobao.tao.navigation.b bVar) {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3359b00b", new Object[]{new Integer(i2), bVar});
                return;
            }
            ArrayList<com.taobao.tao.navigation.b> arrayList = f12555a;
            if (arrayList == null || arrayList.size() <= 0) {
                x();
            }
            if (arrayList == null || arrayList.size() <= 0) {
                Log.e("Navigation", "Update message count failed for initialization error");
            }
            if (i2 >= 0 && i2 <= arrayList.size()) {
                if (!bVar.c()) {
                    Log.e("Navigation", "Update navigation tab failed!");
                    return;
                }
                arrayList.set(i2, bVar);
                d = null;
                r0();
                return;
            }
            Log.e("Navigation", "Update message count failed for index out of range!");
        }
    }

    public static void k(List<com.taobao.tao.navigation.b> list, List<com.taobao.tao.navigation.b> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34c99b70", new Object[]{list, list2});
        } else if (list != null && list.size() != 0 && list2 != null && !j(list, list2)) {
            list2.clear();
            for (com.taobao.tao.navigation.b bVar : list) {
                try {
                    list2.add((com.taobao.tao.navigation.b) bVar.clone());
                } catch (CloneNotSupportedException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    @Deprecated
    public static void k0(int i2, com.taobao.tao.navigation.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27189ee6", new Object[]{new Integer(i2), bVar});
            return;
        }
        e eVar = p;
        if (eVar == null) {
            TLog.loge(y9a.c(), "Navigation", "update Item And Cache failed; styleUpdateCalledListener is null;");
        } else if (bVar == null) {
            TLog.loge(y9a.c(), "Navigation", "update Item And Cache failed; tab is null;");
        } else {
            ((a.c) eVar).b(i2, bVar);
            String c2 = y9a.c();
            TLog.loge(c2, "Navigation", "update Item And Cache index: " + i2 + " title:" + bVar.v());
        }
    }

    public static void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a885b484", new Object[0]);
        } else {
            r0();
        }
    }

    public static boolean l0(int i2, NavigationTabMsgMode navigationTabMsgMode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87b1bfb6", new Object[]{new Integer(i2), navigationTabMsgMode, str})).booleanValue();
        }
        ArrayList<com.taobao.tao.navigation.b> arrayList = f12555a;
        if (arrayList == null) {
            x();
        }
        if (arrayList == null || arrayList.isEmpty()) {
            Log.e("Navigation", "Update message count failed for initialization error");
        }
        if (i2 < 0 || i2 > arrayList.size()) {
            Log.e("Navigation", "Update message count failed for index out of range!" + i2);
            return false;
        }
        if (navigationTabMsgMode == NavigationTabMsgMode.USE_LAST) {
            navigationTabMsgMode = arrayList.get(i2).o();
        }
        if (!arrayList.get(i2).b(navigationTabMsgMode, str)) {
            Log.e("Navigation", "Update message count failed for message format error!");
            return false;
        } else if (f != null) {
            return m0(i2, navigationTabMsgMode, str);
        } else {
            Log.e("Navigation", "Update message count failed for fragment tab host is null!");
            return false;
        }
    }

    public static com.taobao.tao.navigation.b m(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.navigation.b) ipChange.ipc$dispatch("4c66fecd", new Object[]{new Integer(i2)});
        }
        com.taobao.tao.navigation.b q2 = q(i2);
        if (q2 == null) {
            return null;
        }
        try {
            return (com.taobao.tao.navigation.b) q2.clone();
        } catch (Exception unused) {
            TLog.loge(y9a.c(), "Navigation", "generateNavigationTabInfo failed, can't clone");
            return null;
        }
    }

    public static boolean m0(int i2, NavigationTabMsgMode navigationTabMsgMode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6fc4f60", new Object[]{new Integer(i2), navigationTabMsgMode, str})).booleanValue();
        }
        return n0(i2, navigationTabMsgMode, str, null);
    }

    public static ArrayList<String> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("b037cc03", new Object[0]);
        }
        if (d == null) {
            d = new ArrayList<>();
        }
        if (d.size() <= 0 || d.size() != t().size()) {
            d.clear();
            Iterator<com.taobao.tao.navigation.b> it = t().iterator();
            while (it.hasNext()) {
                d.add(it.next().j());
            }
        }
        return d;
    }

    public static TBFragmentTabHost o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBFragmentTabHost) ipChange.ipc$dispatch("d6e2078b", new Object[0]);
        }
        return f;
    }

    public static synchronized void o0(int i2, com.taobao.tao.navigation.b bVar) {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2048909c", new Object[]{new Integer(i2), bVar});
                return;
            }
            ArrayList<com.taobao.tao.navigation.b> arrayList = f12555a;
            if (arrayList == null || arrayList.size() <= 0) {
                x();
            }
            if (arrayList == null || arrayList.size() <= 0) {
                Log.e("Navigation", "Update message count failed for initialization error");
            }
            if (i2 >= 0 && i2 <= arrayList.size()) {
                if (!bVar.c()) {
                    Log.e("Navigation", "Update navigation tab failed!");
                    return;
                }
                arrayList.set(i2, bVar);
                d = null;
                r0();
                return;
            }
            Log.e("Navigation", "Update message count failed for index out of range!");
        }
    }

    public static int p(String str) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("27d0496c", new Object[]{str})).intValue();
        }
        x();
        while (true) {
            ArrayList<com.taobao.tao.navigation.b> arrayList = f12555a;
            if (i2 >= arrayList.size()) {
                return -1;
            }
            if (arrayList.get(i2) != null) {
                String j2 = arrayList.get(i2).j();
                String g2 = b.get(i2).g();
                if ((!TextUtils.isEmpty(j2) && j2.equals(str)) || (!TextUtils.isEmpty(g2) && g2.equals(str))) {
                    break;
                }
            }
            i2++;
        }
        return i2;
    }

    public static synchronized void p0(ArrayList<com.taobao.tao.navigation.b> arrayList, Drawable drawable, int i2, boolean z) {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4a543b", new Object[]{arrayList, drawable, new Integer(i2), new Boolean(z)});
                return;
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (!arrayList.get(i3).c()) {
                    Log.e("Navigation", "Update navigation tab failed for some reason");
                    return;
                }
            }
            k(arrayList, f12555a);
            zpj.b = null;
            zpj.f32933a = drawable;
            zpj.c = i2;
            c = z;
            d = null;
            r0();
        }
    }

    @Deprecated
    public static com.taobao.tao.navigation.b q(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.navigation.b) ipChange.ipc$dispatch("6eab397c", new Object[]{new Integer(i2)});
        }
        ArrayList<com.taobao.tao.navigation.b> arrayList = f12555a;
        if (arrayList == null || arrayList.size() <= 0 || i2 < 0 || i2 >= arrayList.size()) {
            return null;
        }
        return arrayList.get(i2);
    }

    public static synchronized void q0(ArrayList<com.taobao.tao.navigation.b> arrayList, String str, int i2, boolean z) {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e32e16e1", new Object[]{arrayList, str, new Integer(i2), new Boolean(z)});
                return;
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (!arrayList.get(i3).c()) {
                    Log.e("Navigation", "Update navigation tab failed for some reason");
                    return;
                }
            }
            k(arrayList, f12555a);
            d = null;
            zpj.b = str;
            zpj.f32933a = null;
            zpj.c = i2;
            c = z;
            r0();
        }
    }

    public static com.taobao.tao.navigation.b r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.navigation.b) ipChange.ipc$dispatch("89b8ae7", new Object[]{str});
        }
        int a2 = xe2.a(str);
        if (a2 == -1) {
            return null;
        }
        return q(a2);
    }

    public static void r0() {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6f612c8", new Object[0]);
            return;
        }
        TBFragmentTabHost tBFragmentTabHost = f;
        if (tBFragmentTabHost != null) {
            tBFragmentTabHost.updateTabWidgetStyle();
            ArrayList<com.taobao.tao.navigation.b> arrayList = f12555a;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator<com.taobao.tao.navigation.b> it = arrayList.iterator();
            while (it.hasNext()) {
                com.taobao.tao.navigation.b next = it.next();
                try {
                    if (next.l() == NavigationTabIconSourceType.URL && next.k() != null && (next.k().first instanceof String) && (next.k().second instanceof String)) {
                        i2 += 2;
                        arrayList2.add((com.taobao.tao.navigation.b) next.clone());
                    } else if (!(next.l() != NavigationTabIconSourceType.DRAWABLE2 || next.t() == null || next.x() == null)) {
                        u0();
                    }
                } catch (CloneNotSupportedException e2) {
                    e2.printStackTrace();
                }
            }
            if (arrayList2.size() > 0) {
                rps rpsVar = j;
                if (rpsVar != null) {
                    rpsVar.cancel(true);
                }
                j = new rps(i2);
                com.taobao.tao.navigation.b[] bVarArr = new com.taobao.tao.navigation.b[arrayList2.size()];
                arrayList2.toArray(bVarArr);
                j.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, bVarArr);
            }
        }
    }

    public static com.taobao.tao.navigation.b s(String str) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.navigation.b) ipChange.ipc$dispatch("994f3e9d", new Object[]{str});
        }
        x();
        while (true) {
            ArrayList<com.taobao.tao.navigation.b> arrayList = f12555a;
            if (i2 >= arrayList.size()) {
                return null;
            }
            com.taobao.tao.navigation.b bVar = arrayList.get(i2);
            if (bVar != null) {
                String j2 = bVar.j();
                if (!TextUtils.isEmpty(j2) && j2.equals(str)) {
                    return bVar;
                }
            }
            i2++;
        }
    }

    public static synchronized void s0(int i2, com.taobao.tao.navigation.b bVar) {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("128ad4ab", new Object[]{new Integer(i2), bVar});
                return;
            }
            ArrayList<com.taobao.tao.navigation.b> arrayList = f12555a;
            if (arrayList == null || arrayList.size() <= 0) {
                x();
            }
            if (arrayList == null || arrayList.size() <= 0) {
                TLog.loge(y9a.c(), "Navigation", "Update message count failed for initialization error");
            }
            if (i2 >= 0 && i2 <= arrayList.size()) {
                if (!bVar.c()) {
                    TLog.loge(y9a.c(), "Navigation", "Update navigation tab failed!");
                    return;
                }
                arrayList.set(i2, bVar);
                d = null;
                h0(i2, bVar);
                return;
            }
            TLog.loge(y9a.c(), "Navigation", "Update message count failed for index out of range!");
        }
    }

    public static ArrayList<com.taobao.tao.navigation.b> t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("e880bb89", new Object[0]);
        }
        x();
        return f12555a;
    }

    public static int t0(String str, tqs tqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e4cc1307", new Object[]{str, tqsVar})).intValue();
        }
        if (wpj.d()) {
            return 16;
        }
        if (xe2.a(str) == -1) {
            TLog.loge(y9a.c(), "Navigation", "setTabListener failed, index is invalid");
            return 8;
        } else if (p == null) {
            TLog.loge(y9a.c(), "Navigation", "update Item And Cache failed; styleUpdateCalledListener is null;");
            return 4;
        } else if (tqsVar == null) {
            TLog.loge(y9a.c(), "Navigation", "update Item And Cache failed; tab is null;");
            return 4;
        } else {
            String c2 = y9a.c();
            TLog.loge(c2, "Navigation", "update Item And Cache index: " + str + " title:" + tqsVar);
            return ((a.c) p).a(str, tqsVar);
        }
    }

    public static urs u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (urs) ipChange.ipc$dispatch("d525fb2d", new Object[]{str});
        }
        if (f != null) {
            return urs.b.b().c(str).d(f.getDisplayHeight()).a();
        }
        TLog.loge(y9a.c(), "Navigation", "getTabViewInfo failed, sFragmentTabHost is null");
        return null;
    }

    public static void u0() {
        NavigationTabIndicatorView navigationTabIndicatorView;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8561e631", new Object[0]);
            return;
        }
        TBFragmentTabHost tBFragmentTabHost = f;
        if (tBFragmentTabHost == null) {
            rpj.a("update_error", "sFragmentTabHost is null");
            return;
        }
        TabWidget tabWidget = tBFragmentTabHost.getTabWidget();
        if (tabWidget != null) {
            D();
            while (true) {
                ArrayList<com.taobao.tao.navigation.b> arrayList = f12555a;
                if (i2 < arrayList.size()) {
                    if (!(tabWidget.getChildTabViewAt(i2) == null || (navigationTabIndicatorView = (NavigationTabIndicatorView) tabWidget.getChildTabViewAt(i2)) == null)) {
                        navigationTabIndicatorView.updateStyle(arrayList.get(i2), c, navigationTabIndicatorView.getSelected(), true);
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public static boolean v(boolean z) {
        TBFragmentTabHost o2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac744ffb", new Object[]{new Boolean(z)})).booleanValue();
        }
        if (wpj.g() && (o2 = o()) != null) {
            return o2.hideNavigation(z);
        }
        return false;
    }

    public static boolean w(boolean z) {
        TBFragmentTabHost o2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f94f5d06", new Object[]{new Boolean(z)})).booleanValue();
        }
        if (wpj.g() && (o2 = o()) != null) {
            return o2.hideNavigationAnimate(z);
        }
        return false;
    }

    public static synchronized void x() {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fede197", new Object[0]);
                return;
            }
            if (!e) {
                k(b, f12555a);
                e = true;
            }
        }
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ffc363f", new Object[0])).booleanValue();
        }
        TBFragmentTabHost o2 = o();
        if (o2 == null) {
            return false;
        }
        return o2.isNavigationVisible();
    }

    public static void z(String str, int i2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ec197f9", new Object[]{str, new Integer(i2), str2});
            return;
        }
        d dVar = r;
        if (dVar != null) {
            tpj tpjVar = new tpj();
            tpjVar.b = str;
            tpjVar.f28858a = i2;
            tpjVar.c = "alienEffect";
            tpjVar.d = str2;
            ((upj) dVar).a(tpjVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c implements rqs {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final fge f12556a;

        public c(fge fgeVar) {
            this.f12556a = fgeVar;
        }

        @Override // tb.rqs
        public boolean b(String str, NavigationTabMsgMode navigationTabMsgMode, String str2) {
            String str3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a548b394", new Object[]{this, str, navigationTabMsgMode, str2})).booleanValue();
            }
            if (a.f == null) {
                TLog.loge(y9a.c(), "Navigation", "update certain tab common mark failed, sFragmentTabHost is null" + str + " " + navigationTabMsgMode + " " + str2);
                return false;
            }
            ArrayList<com.taobao.tao.navigation.b> arrayList = a.f12555a;
            if (arrayList == null) {
                a.x();
            }
            if (arrayList == null) {
                TLog.loge(y9a.c(), "Navigation", "Update message count failed for sNavigationTabs is null. bizType: " + str);
                return false;
            }
            int a2 = xe2.a(str);
            if (a2 == -1 || a2 >= arrayList.size()) {
                TLog.loge(y9a.c(), "Navigation", "Update message count failed for index out of range! bizType: " + str);
                return false;
            }
            if (navigationTabMsgMode == NavigationTabMsgMode.USE_LAST) {
                navigationTabMsgMode = arrayList.get(a2).o();
            }
            Pair<JSONObject, JSONObject> b = ((ege) this.f12556a).b(str, navigationTabMsgMode, str2);
            if (b == null) {
                TLog.loge(y9a.c(), "Navigation", "Update message count failed for message format error!" + str + " " + navigationTabMsgMode + " " + str2);
                return false;
            }
            JSONObject jSONObject = (JSONObject) b.second;
            String str4 = null;
            if (jSONObject == null || jSONObject.isEmpty()) {
                jSONObject = null;
            }
            NavigationTabIndicatorView tabViewAtIndex = a.f.getTabViewAtIndex(a2);
            if (tabViewAtIndex == null) {
                TLog.loge(y9a.c(), "Navigation", "Update message count failed for tabView is null");
                return false;
            }
            if (a.e() != null && a.e().containsKey(String.valueOf(a2))) {
                tabViewAtIndex.updateMessageViewColor((Integer) a.e().get(String.valueOf(a2)));
            }
            tabViewAtIndex.updateMessage(navigationTabMsgMode, str2, jSONObject == null ? null : jSONObject.toJSONString());
            if (!(navigationTabMsgMode == NavigationTabMsgMode.NONE || str2 == null || "0".equals(str2))) {
                if (navigationTabMsgMode == NavigationTabMsgMode.DEFAULT || navigationTabMsgMode == NavigationTabMsgMode.GUARDIAN_NUM) {
                    str3 = UiUtil.INPUT_TYPE_VALUE_NUM;
                } else {
                    str3 = "text";
                }
                if (jSONObject != null) {
                    str4 = jSONObject.getString("augeTrackInfo");
                }
                w4v.b(str, "commonMark", str3, str4);
            }
            TLog.loge(y9a.c(), "Navigation", "Update message count success! bizType: " + str + " messageMode: " + navigationTabMsgMode + " msg: " + str2);
            return true;
        }

        @Override // tb.rqs
        public int a(String str, String str2, View view, int i) {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a5b5aa1", new Object[]{this, str, str2, view, new Integer(i)})).intValue();
            }
            TLog.loge(y9a.c(), "Navigation", "Update alien effect; bizType: " + str + " materialSubType: " + str2 + " displayMode: " + i);
            int a2 = xe2.a(str);
            if (a2 == -1) {
                TLog.loge(y9a.c(), "Navigation", "Update alien effect failed for index out of range!" + str);
                return 8;
            } else if (a.f == null) {
                TLog.loge(y9a.c(), "Navigation", "Update alien effect failed for sFragmentTabHost is null");
                return 4;
            } else {
                String str3 = null;
                if (view == null || "placeholder".equals(str2)) {
                    if ("placeholder".equals(str2)) {
                        TLog.loge(y9a.c(), "Navigation", "Update alien effect direct for alienEffect is placeholder!" + str);
                    }
                    jSONObject = null;
                } else {
                    Pair<JSONObject, JSONObject> a3 = ((ege) this.f12556a).a(str, "alienEffect", str2);
                    if (a3 == null) {
                        TLog.loge(y9a.c(), "Navigation", "Update alien effect failed for alienEffect is limited!" + str + " " + str2);
                        return 2;
                    }
                    jSONObject = (JSONObject) a3.second;
                    w4v.b(str, "alienEffect", str2, jSONObject.getString("augeTrackInfo"));
                }
                NavigationTabIndicatorView tabViewAtIndex = a.f.getTabViewAtIndex(a2);
                if (tabViewAtIndex == null) {
                    return -1;
                }
                if (jSONObject == null || jSONObject.isEmpty()) {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    str3 = jSONObject.toJSONString();
                }
                tabViewAtIndex.setForegroundView(view, i, str3);
                return 1;
            }
        }
    }

    public static void S(TBFragmentTabHost tBFragmentTabHost) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db68c7eb", new Object[]{tBFragmentTabHost});
        } else if (tBFragmentTabHost == null) {
            rpj.a("update_error", "host is null");
        } else {
            f = tBFragmentTabHost;
            tBFragmentTabHost.setExposureCallback(new b());
            if (!(f.getContext() instanceof FragmentActivity)) {
                TLog.loge(y9a.c(), "Navigation", "registerFragmentLifecycleCallbacks failed. context is not instanceof FragmentActivity");
                return;
            }
            FragmentManager fragmentManager = f.getFragmentManager();
            if (fragmentManager == null) {
                TLog.loge(y9a.c(), "Navigation", "registerFragmentLifecycleCallbacks failed. fragmentManager is null");
                return;
            }
            CopyOnWriteArrayList<FragmentManager.FragmentLifecycleCallbacks> copyOnWriteArrayList = h;
            if (copyOnWriteArrayList == null) {
                TLog.loge(y9a.c(), "Navigation", "registerFragmentLifecycleCallbacks failed. sFragmentLifecycleCallbacks is null");
                return;
            }
            Iterator<FragmentManager.FragmentLifecycleCallbacks> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                fragmentManager.registerFragmentLifecycleCallbacks(it.next(), false);
            }
        }
    }

    public static void h0(int i2, com.taobao.tao.navigation.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f8f1fdb", new Object[]{new Integer(i2), bVar});
            return;
        }
        TBFragmentTabHost tBFragmentTabHost = f;
        if (tBFragmentTabHost == null) {
            TLog.loge(y9a.c(), "Navigation", "update certain tab failed, sFragmentTabHost is null");
            return;
        }
        TabWidget tabWidget = tBFragmentTabHost.getTabWidget();
        if (tabWidget == null) {
            TLog.loge(y9a.c(), "Navigation", "update certain tab failed, tabWidget is null");
            return;
        }
        NavigationTabIndicatorView navigationTabIndicatorView = (NavigationTabIndicatorView) tabWidget.getChildTabViewAt(i2);
        if (navigationTabIndicatorView == null) {
            TLog.loge(y9a.c(), "Navigation", "update certain tab failed, indicatorView is null");
            return;
        }
        navigationTabIndicatorView.updateStyle(bVar, c, navigationTabIndicatorView.getSelected(), true);
        String c2 = y9a.c();
        TLog.loge(c2, "Navigation", "update Certain Tab, index:" + i2);
    }

    public static boolean Y(String str, ypj ypjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2ddb533", new Object[]{str, ypjVar})).booleanValue();
        }
        if (f == null) {
            TLog.loge(y9a.c(), "Navigation", "setTabListener failed, sFragmentTabHost is null");
            return false;
        }
        int a2 = xe2.a(str);
        if (a2 == -1) {
            TLog.loge(y9a.c(), "Navigation", "setTabListener failed, index is invalid");
            return false;
        }
        NavigationTabIndicatorView tabViewAtIndex = f.getTabViewAtIndex(a2);
        if (tabViewAtIndex == null) {
            TLog.loge(y9a.c(), "Navigation", "setTabListener failed, tabIndicatorView is null");
            return false;
        }
        tabViewAtIndex.setNavigationTabListener(ypjVar);
        return true;
    }

    public static boolean n0(int i2, NavigationTabMsgMode navigationTabMsgMode, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7026da2a", new Object[]{new Integer(i2), navigationTabMsgMode, str, str2})).booleanValue();
        }
        com.taobao.tao.navigation.b bVar = f12555a.get(i2);
        bVar.R(navigationTabMsgMode);
        bVar.Q(str);
        if (str2 != null) {
            bVar.A = str2;
        }
        HashMap<String, Integer> hashMap = g;
        if (hashMap != null && hashMap.containsKey(String.valueOf(i2))) {
            bVar.S(g.get(String.valueOf(i2)));
        }
        TabWidget tabWidget = f.getTabWidget();
        if (tabWidget == null) {
            TLog.loge(y9a.c(), "Navigation", "updateMessageView failed for tabWidget is null!");
            return false;
        }
        NavigationTabIndicatorView navigationTabIndicatorView = (NavigationTabIndicatorView) tabWidget.getChildTabViewAt(i2);
        if (navigationTabIndicatorView == null) {
            TLog.loge(y9a.c(), "Navigation", "updateMessageView failed for indicatorView is null!");
            return false;
        }
        navigationTabIndicatorView.updateStyle(bVar, c, navigationTabIndicatorView.getSelected(), true);
        return true;
    }
}
