package com.taobao.tao.flexbox.layoutmanager.component;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.MessageQueue;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSONObject;
import com.alipay.birdnest.util.UiUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.IPage;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.component.e;
import com.taobao.tao.flexbox.layoutmanager.component.f;
import com.taobao.tao.flexbox.layoutmanager.component.g;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.b;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.flexbox.layoutmanager.view.NestViewPager;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.SymbolExpUtil;
import tb.akt;
import tb.bae;
import tb.cll;
import tb.dgw;
import tb.dol;
import tb.e0o;
import tb.f21;
import tb.hk8;
import tb.iqs;
import tb.ir2;
import tb.jfw;
import tb.nuo;
import tb.nwv;
import tb.od0;
import tb.ol4;
import tb.rbi;
import tb.syo;
import tb.t2o;
import tb.tfs;
import tb.uml;
import tb.x5r;
import tb.xbu;
import tb.xml;
import tb.yzn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TabBarControllerComponent extends Component<ViewPager, j> implements ViewPager.OnPageChangeListener, com.taobao.tao.flexbox.layoutmanager.core.j, ol4, iqs, g.e, bae, xml {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SELECTED_INDEX_STATE_NAME = "TabBarController:selectedIndex";
    public static boolean u = false;

    /* renamed from: a  reason: collision with root package name */
    public TabBarControllerPageAdapter f12125a;
    public com.taobao.tao.flexbox.layoutmanager.component.g g;
    public int j;
    public MessageQueue.IdleHandler b = null;
    public int c = 0;
    public int d = 0;
    public boolean e = false;
    public boolean f = false;
    public int h = 0;
    public int i = 0;
    public boolean k = false;
    public final Map<n, IPage> l = new HashMap();
    public int m = 0;
    public final dol n = new dol();
    public final syo o = new syo();
    public int p = -1;
    public float q = 0.0f;
    public boolean r = true;
    public final b.b0 s = new e();
    public final b.b0 t = new f();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class TabBarControllerPageAdapter extends PagerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public n f12126a;
        public List<FrameLayout> b;
        public List<Integer> c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements yzn {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // tb.yzn
            public void a(n nVar, Component component) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1061619e", new Object[]{this, nVar, component});
                    return;
                }
                try {
                    TabBarControllerComponent.n(TabBarControllerComponent.this, nVar);
                } catch (Throwable th) {
                    tfs.e("dynamicPageCallBack", th.toString());
                }
            }
        }

        static {
            t2o.a(503316863);
        }

        public TabBarControllerPageAdapter() {
        }

        public static /* synthetic */ void h(TabBarControllerPageAdapter tabBarControllerPageAdapter, ViewGroup viewGroup, ViewGroup viewGroup2, n nVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9af1afc", new Object[]{tabBarControllerPageAdapter, viewGroup, viewGroup2, nVar, new Boolean(z)});
            } else {
                tabBarControllerPageAdapter.l(viewGroup, viewGroup2, nVar, z);
            }
        }

        public static /* synthetic */ List i(TabBarControllerPageAdapter tabBarControllerPageAdapter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("2a0c835a", new Object[]{tabBarControllerPageAdapter});
            }
            return tabBarControllerPageAdapter.c;
        }

        public static /* synthetic */ Object ipc$super(TabBarControllerPageAdapter tabBarControllerPageAdapter, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/TabBarControllerComponent$TabBarControllerPageAdapter");
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
            }
            return ((ArrayList) TabBarControllerComponent.F(TabBarControllerComponent.this).d).size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(Object obj) {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("304bee8", new Object[]{this, obj})).intValue();
            }
            View view = (View) obj;
            Object tag = view.getTag();
            int intValue = ((Integer) view.getTag(R.id.layout_manager_tabbar_position_id)).intValue();
            if (tag == TabBarControllerComponent.this.S(intValue)) {
                i = -1;
            } else {
                i = -2;
            }
            if (i == -1 && ((FrameLayout) ((ArrayList) this.b).get(intValue)) == null) {
                ((ArrayList) this.b).set(intValue, (FrameLayout) view);
            }
            return i;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
            }
            FrameLayout k = k(viewGroup, i);
            if (i == ((ViewPager) TabBarControllerComponent.p(TabBarControllerComponent.this)).getCurrentItem()) {
                n S = TabBarControllerComponent.this.S(i);
                if (S != null) {
                    l(viewGroup, k, S, false);
                }
            } else {
                if (this.c == null) {
                    this.c = new ArrayList();
                }
                if (!((ArrayList) this.c).contains(Integer.valueOf(i))) {
                    ((ArrayList) this.c).add(Integer.valueOf(i));
                }
            }
            return k;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue();
            }
            if (view == obj) {
                return true;
            }
            return false;
        }

        public View j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("5c8ae667", new Object[]{this});
            }
            n nVar = this.f12126a;
            if (nVar != null) {
                return nVar.w0();
            }
            return null;
        }

        public FrameLayout k(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FrameLayout) ipChange.ipc$dispatch("c4403d9", new Object[]{this, viewGroup, new Integer(i)});
            }
            FrameLayout frameLayout = (FrameLayout) ((ArrayList) this.b).get(i);
            if (frameLayout == null) {
                frameLayout = new FrameLayout(viewGroup.getContext());
                ((ArrayList) this.b).set(i, frameLayout);
            }
            if (frameLayout.getParent() != viewGroup) {
                if (frameLayout.getParent() != null) {
                    ((ViewGroup) frameLayout.getParent()).removeView(frameLayout);
                }
                viewGroup.addView(frameLayout);
            }
            frameLayout.setTag(((ArrayList) TabBarControllerComponent.o(TabBarControllerComponent.this).d).get(i));
            frameLayout.setTag(R.id.layout_manager_tabbar_position_id, Integer.valueOf(i));
            return frameLayout;
        }

        public void m(List<n> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba1ea0f6", new Object[]{this, list});
            } else if (list != null) {
                int size = list.size();
                if (this.b == null) {
                    this.b = new ArrayList(5);
                }
                if (((ArrayList) this.b).size() != size) {
                    ((ArrayList) this.b).clear();
                    for (int i = 0; i < size; i++) {
                        ((ArrayList) this.b).add(null);
                    }
                }
                if (list.size() != ((ArrayList) TabBarControllerComponent.u(TabBarControllerComponent.this).d).size() || TabBarControllerComponent.v(TabBarControllerComponent.this)) {
                    TabBarControllerComponent.w(TabBarControllerComponent.this, false);
                    notifyDataSetChanged();
                }
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8338fbc6", new Object[]{this, viewGroup, new Integer(i), obj});
                return;
            }
            n S = TabBarControllerComponent.this.S(i);
            if (S != null && S != this.f12126a) {
                l(viewGroup, k(viewGroup, i), S, true);
                this.f12126a = S;
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
                return;
            }
            View view = (View) obj;
            viewGroup.removeView(view);
            Object tag = view.getTag();
            if (tag instanceof n) {
                n nVar = (n) tag;
                String I = nwv.I(TabBarControllerComponent.q(TabBarControllerComponent.this, nVar), "");
                String I2 = nwv.I(nVar.H("id"), "");
                tfs.g("TabBarController", "destroyItem, pageName:" + I + " id:" + I2);
                if (akt.p2("enableFixDestroyItemDisappear", true)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("type", "tab");
                    TabBarControllerComponent.r(TabBarControllerComponent.this, nVar, hashMap);
                    TabBarControllerComponent.t(TabBarControllerComponent.this, nVar, hashMap);
                }
            }
        }

        public final void l(ViewGroup viewGroup, ViewGroup viewGroup2, n nVar, boolean z) {
            HashMap hashMap;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c5edbd2d", new Object[]{this, viewGroup, viewGroup2, nVar, new Boolean(z)});
                return;
            }
            TabBarControllerComponent.G(TabBarControllerComponent.this, nVar);
            if (TabBarControllerComponent.i(TabBarControllerComponent.this) || z) {
                TabBarControllerComponent.j(TabBarControllerComponent.this, nVar);
            }
            ViewGroup viewGroup3 = (ViewGroup) nVar.w0().getParent();
            if (viewGroup2 != viewGroup3) {
                viewGroup2.removeAllViews();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(nVar.w0());
                }
                viewGroup2.addView(nVar.w0());
            }
            if (nVar.a0() != null || z) {
                if (nVar.a0() != null) {
                    hashMap = nVar.a0();
                } else {
                    HashMap hashMap2 = new HashMap();
                    if (TabBarControllerComponent.u) {
                        hashMap2.put("source", 1);
                        hashMap = hashMap2;
                    } else {
                        hashMap2.put("source", 2);
                        hashMap = hashMap2;
                    }
                }
                if (TabBarControllerComponent.k(TabBarControllerComponent.this)) {
                    hashMap.put("sourcePage", "tab");
                    hashMap.put("type", "tab");
                } else if (!hashMap.containsKey("sourcePage")) {
                    hashMap.put("sourcePage", "page");
                    hashMap.put("type", "page");
                }
                if (!TabBarControllerComponent.k(TabBarControllerComponent.this)) {
                    TabBarControllerComponent.l(TabBarControllerComponent.this, nVar, hashMap);
                    TabBarControllerComponent.m(TabBarControllerComponent.this, nVar, hashMap);
                }
            }
            if (nwv.o(nVar.H("dynamicPage"), false) && nVar.K() != null) {
                nVar.K().registerRenderCompleteListener("tabChild", new a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f12128a;

        public a(int i) {
            this.f12128a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TabBarControllerComponent.h(TabBarControllerComponent.this, this.f12128a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f12129a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ String c;

        public b(Object obj, boolean z, String str) {
            this.f12129a = obj;
            this.b = z;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Object obj = this.f12129a;
            if (obj instanceof Map) {
                String I = nwv.I(((Map) obj).get("type"), null);
                String I2 = nwv.I(((Map) this.f12129a).get("id"), null);
                StringBuilder sb = new StringBuilder();
                if (this.b) {
                    str = "pageAppear:";
                } else {
                    str = "pageDisAppear:";
                }
                sb.append(str);
                sb.append(this.c);
                sb.append(" id:");
                sb.append(I2);
                sb.append("  type:");
                sb.append(I);
                tfs.g("TabBarController", sb.toString());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements n.e<n> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(TabBarControllerComponent tabBarControllerComponent) {
        }

        /* renamed from: c */
        public boolean a(n nVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e13bdd0a", new Object[]{this, nVar})).booleanValue();
            }
            if (((xbu) nVar.K()).o()) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public boolean b(n nVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("429eb190", new Object[]{this, nVar})).booleanValue();
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f12130a;

        public d(Context context) {
            this.f12130a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            n s = TabBarControllerComponent.s(TabBarControllerComponent.this);
            if (s != null) {
                s.X0(this.f12130a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e extends b.b0<NestViewPager, j> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/TabBarControllerComponent$5");
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.b
        public boolean i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("805570d3", new Object[]{this})).booleanValue();
            }
            return true;
        }

        /* renamed from: m */
        public void c(com.taobao.tao.flexbox.layoutmanager.core.e eVar, NestViewPager nestViewPager, j jVar, n.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("18e27d88", new Object[]{this, eVar, nestViewPager, jVar, fVar});
                return;
            }
            TabBarControllerComponent tabBarControllerComponent = TabBarControllerComponent.this;
            TabBarControllerComponent.D(tabBarControllerComponent, ((j) TabBarControllerComponent.C(tabBarControllerComponent)).z0);
        }

        /* renamed from: n */
        public void j(n nVar, j jVar, String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2404aa29", new Object[]{this, nVar, jVar, str, obj});
            } else if (jVar != null && TextUtils.equals(str, "scroll")) {
                jVar.z0 = nwv.o(obj, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f extends b.b0<NestViewPager, j> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/TabBarControllerComponent$6");
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.b
        public boolean i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("805570d3", new Object[]{this})).booleanValue();
            }
            return true;
        }

        /* renamed from: m */
        public void c(com.taobao.tao.flexbox.layoutmanager.core.e eVar, NestViewPager nestViewPager, j jVar, n.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("18e27d88", new Object[]{this, eVar, nestViewPager, jVar, fVar});
            } else {
                nestViewPager.setEdgePan(((j) TabBarControllerComponent.E(TabBarControllerComponent.this)).E0);
            }
        }

        /* renamed from: n */
        public void j(n nVar, j jVar, String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2404aa29", new Object[]{this, nVar, jVar, str, obj});
            } else if (jVar != null && TextUtils.equals(str, "edgepan")) {
                j.I(jVar, obj);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g implements MessageQueue.IdleHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f12131a;

        public g(int i) {
            this.f12131a = i;
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
            }
            n S = TabBarControllerComponent.this.S(this.f12131a);
            if (TabBarControllerComponent.x(TabBarControllerComponent.this) && TabBarControllerComponent.y(TabBarControllerComponent.this) != null && S != null && !S.A0()) {
                if (!TabBarControllerComponent.z(TabBarControllerComponent.this)) {
                    return true;
                }
                TabBarControllerPageAdapter.h(TabBarControllerComponent.y(TabBarControllerComponent.this), (ViewGroup) TabBarControllerComponent.A(TabBarControllerComponent.this), TabBarControllerComponent.y(TabBarControllerComponent.this).k((ViewGroup) TabBarControllerComponent.B(TabBarControllerComponent.this), this.f12131a), S, false);
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        public final String f12132a;
        public final String b;
        public final Map c;

        static {
            t2o.a(503316862);
        }

        public h(String str, String str2, Map map) {
            this.f12132a = str;
            this.b = str2;
            this.c = map;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f12133a;
        public String b;
        public Map c;

        static {
            t2o.a(503316865);
        }

        public i() {
        }

        public void a(String str, String str2, String str3, String str4, Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("788f2347", new Object[]{this, str, str2, str3, str4, map});
                return;
            }
            this.f12133a = str;
            this.b = str2;
            this.c = map;
        }

        public /* synthetic */ i(a aVar) {
            this();
        }
    }

    static {
        t2o.a(503316854);
        t2o.a(503317092);
        t2o.a(503317030);
        t2o.a(503317201);
        t2o.a(503316875);
        t2o.a(503316934);
        t2o.a(503317097);
    }

    public static /* synthetic */ View A(TabBarControllerComponent tabBarControllerComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a37198b5", new Object[]{tabBarControllerComponent});
        }
        return tabBarControllerComponent.view;
    }

    public static /* synthetic */ View B(TabBarControllerComponent tabBarControllerComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c22bd076", new Object[]{tabBarControllerComponent});
        }
        return tabBarControllerComponent.view;
    }

    public static /* synthetic */ jfw C(TabBarControllerComponent tabBarControllerComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("641f0111", new Object[]{tabBarControllerComponent});
        }
        return tabBarControllerComponent.viewParams;
    }

    public static /* synthetic */ void D(TabBarControllerComponent tabBarControllerComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65f75c91", new Object[]{tabBarControllerComponent, new Boolean(z)});
        } else {
            tabBarControllerComponent.M(z);
        }
    }

    public static /* synthetic */ jfw E(TabBarControllerComponent tabBarControllerComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("4c75b42e", new Object[]{tabBarControllerComponent});
        }
        return tabBarControllerComponent.viewParams;
    }

    public static /* synthetic */ n F(TabBarControllerComponent tabBarControllerComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("28959ea8", new Object[]{tabBarControllerComponent});
        }
        return tabBarControllerComponent.node;
    }

    public static /* synthetic */ boolean G(TabBarControllerComponent tabBarControllerComponent, n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26d5ab8f", new Object[]{tabBarControllerComponent, nVar})).booleanValue();
        }
        return tabBarControllerComponent.m0(nVar);
    }

    public static /* synthetic */ void h(TabBarControllerComponent tabBarControllerComponent, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab317444", new Object[]{tabBarControllerComponent, new Integer(i2)});
        } else {
            tabBarControllerComponent.k0(i2);
        }
    }

    public static /* synthetic */ boolean i(TabBarControllerComponent tabBarControllerComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e228311", new Object[]{tabBarControllerComponent})).booleanValue();
        }
        return tabBarControllerComponent.r;
    }

    public static /* synthetic */ Object ipc$super(TabBarControllerComponent tabBarControllerComponent, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1926757943:
                super.onLayoutComplete();
                return null;
            case -1619485803:
                return new Boolean(super.invoke((d.j) objArr[0], (String) objArr[1], (JSONObject) objArr[2], (d.k) objArr[3]));
            case -1346446914:
                super.onSaveInstanceState((Map) objArr[0]);
                return null;
            case -767938565:
                return super.getAttributeHandler((String) objArr[0]);
            case -703216504:
                super.applyAttrForView((View) objArr[0], (jfw) objArr[1], (Map) objArr[2], ((Boolean) objArr[3]).booleanValue());
                return null;
            case -425614859:
                return new Boolean(super.sendViewAppearForAdd((n) objArr[0]));
            case -97641899:
                super.handleChildDeleted((n) objArr[0], ((Number) objArr[1]).intValue(), (n) objArr[2]);
                return null;
            case 1015965122:
                super.onLayoutChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Boolean) objArr[4]).booleanValue());
                return null;
            case 1123088784:
                return new Boolean(super.onPrepareComponent((Context) objArr[0]));
            case 1964402429:
                super.onRenderCompleted();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/TabBarControllerComponent");
        }
    }

    public static /* synthetic */ void j(TabBarControllerComponent tabBarControllerComponent, n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20fe6c04", new Object[]{tabBarControllerComponent, nVar});
        } else {
            tabBarControllerComponent.e0(nVar);
        }
    }

    public static /* synthetic */ boolean k(TabBarControllerComponent tabBarControllerComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f152f13", new Object[]{tabBarControllerComponent})).booleanValue();
        }
        return tabBarControllerComponent.e;
    }

    public static /* synthetic */ void l(TabBarControllerComponent tabBarControllerComponent, n nVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc870303", new Object[]{tabBarControllerComponent, nVar, map});
        } else {
            tabBarControllerComponent.u0(nVar, map);
        }
    }

    public static /* synthetic */ void m(TabBarControllerComponent tabBarControllerComponent, n nVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f50fd104", new Object[]{tabBarControllerComponent, nVar, map});
        } else {
            tabBarControllerComponent.r0(nVar, map);
        }
    }

    public static /* synthetic */ void n(TabBarControllerComponent tabBarControllerComponent, n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("717aac80", new Object[]{tabBarControllerComponent, nVar});
        } else {
            tabBarControllerComponent.I(nVar);
        }
    }

    public static /* synthetic */ n o(TabBarControllerComponent tabBarControllerComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("3000b15", new Object[]{tabBarControllerComponent});
        }
        return tabBarControllerComponent.node;
    }

    public static /* synthetic */ View p(TabBarControllerComponent tabBarControllerComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("eae4d856", new Object[]{tabBarControllerComponent});
        }
        return tabBarControllerComponent.view;
    }

    public static /* synthetic */ String q(TabBarControllerComponent tabBarControllerComponent, n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b485cd63", new Object[]{tabBarControllerComponent, nVar});
        }
        return tabBarControllerComponent.T(nVar);
    }

    public static /* synthetic */ void r(TabBarControllerComponent tabBarControllerComponent, n nVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbbd709", new Object[]{tabBarControllerComponent, nVar, map});
        } else {
            tabBarControllerComponent.s0(nVar, map);
        }
    }

    public static /* synthetic */ n s(TabBarControllerComponent tabBarControllerComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("d21bfea2", new Object[]{tabBarControllerComponent});
        }
        return tabBarControllerComponent.O();
    }

    public static /* synthetic */ void t(TabBarControllerComponent tabBarControllerComponent, n nVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb7d8b1f", new Object[]{tabBarControllerComponent, nVar, map});
        } else {
            tabBarControllerComponent.v0(nVar, map);
        }
    }

    public static /* synthetic */ n u(TabBarControllerComponent tabBarControllerComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("24646b2f", new Object[]{tabBarControllerComponent});
        }
        return tabBarControllerComponent.node;
    }

    public static /* synthetic */ boolean v(TabBarControllerComponent tabBarControllerComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dc69932", new Object[]{tabBarControllerComponent})).booleanValue();
        }
        return tabBarControllerComponent.k;
    }

    public static /* synthetic */ boolean w(TabBarControllerComponent tabBarControllerComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36f40b28", new Object[]{tabBarControllerComponent, new Boolean(z)})).booleanValue();
        }
        tabBarControllerComponent.k = z;
        return z;
    }

    public static /* synthetic */ boolean x(TabBarControllerComponent tabBarControllerComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("feb94534", new Object[]{tabBarControllerComponent})).booleanValue();
        }
        return tabBarControllerComponent.attached;
    }

    public static /* synthetic */ TabBarControllerPageAdapter y(TabBarControllerComponent tabBarControllerComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabBarControllerPageAdapter) ipChange.ipc$dispatch("f5b6cb8a", new Object[]{tabBarControllerComponent});
        }
        return tabBarControllerComponent.f12125a;
    }

    public static /* synthetic */ boolean z(TabBarControllerComponent tabBarControllerComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bfabf136", new Object[]{tabBarControllerComponent})).booleanValue();
        }
        return tabBarControllerComponent.X();
    }

    public final void B0(n nVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4bd0443", new Object[]{this, nVar, map});
            return;
        }
        boolean o = nwv.o(map.get("ignorePageTrack"), false);
        if (L(nVar) && !o) {
            od0.D().d().pageDisAppear(nVar);
            xbu N = N(nVar);
            if (N != null) {
                N.x();
            }
        }
    }

    public final void C0(n nVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5efd20b6", new Object[]{this, nVar, map, new Boolean(z)});
            return;
        }
        int t = nwv.t(nVar.m0(5), 0);
        if (z) {
            int i2 = t + 1;
            nVar.w1(5, Integer.valueOf(i2));
            nVar.w1(6, Long.valueOf(System.currentTimeMillis()));
            map.put(UiUtil.INPUT_TYPE_VALUE_NUM, Integer.valueOf(i2));
        } else {
            long y = nwv.y(nVar.m0(6), 0L);
            map.put(UiUtil.INPUT_TYPE_VALUE_NUM, Integer.valueOf(t));
            map.put("duration", Long.valueOf(System.currentTimeMillis() - y));
        }
        map.put("index", Integer.valueOf(this.node.Q(nVar)));
    }

    /* renamed from: H */
    public void applyAttrForView(ViewPager viewPager, j jVar, Map map, boolean z) {
        int i2;
        List<n> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4329add3", new Object[]{this, viewPager, jVar, map, new Boolean(z)});
            return;
        }
        super.applyAttrForView(viewPager, jVar, map, z);
        NestViewPager nestViewPager = (NestViewPager) viewPager;
        nestViewPager.setEnableSwipe(((j) this.viewParams).z0);
        nestViewPager.setEdgePan(((j) this.viewParams).E0);
        if (this.f12125a == null) {
            this.f12125a = new TabBarControllerPageAdapter();
        }
        this.f12125a.m(this.node.d);
        if (((ViewPager) this.view).getAdapter() == null) {
            ((ViewPager) this.view).setAdapter(this.f12125a);
            com.taobao.tao.flexbox.layoutmanager.component.e d2 = com.taobao.tao.flexbox.layoutmanager.component.h.d(this.node, ((j) this.viewParams).y0);
            if (d2 != null) {
                e.h viewParams = d2.getViewParams();
                int max = Math.max(d2.K(), viewParams.D0);
                if (max > 0) {
                    this.f = true;
                }
                this.c = max;
                ((ViewPager) this.view).setCurrentItem(max);
                this.f = false;
                this.d = max;
                this.j = viewParams.H0;
                n nVar = this.node;
                if (nVar != null && (list = nVar.d) != null && max >= 0 && max < ((ArrayList) list).size()) {
                    this.f12125a.instantiateItem((ViewGroup) this.view, max);
                    return;
                }
                return;
            }
            return;
        }
        int currentItem = ((ViewPager) this.view).getCurrentItem();
        m0(S(currentItem));
        if (this.q > 1.0f && (i2 = this.p) > -1) {
            if (currentItem > i2) {
                m0(S(currentItem - 1));
            } else if (currentItem == i2) {
                m0(S(currentItem + 1));
            }
        }
    }

    public final void I(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7419825", new Object[]{this, nVar});
        } else if (nVar.m0(101) == null) {
            i iVar = new i(null);
            iVar.f12133a = nwv.I(nVar.H(Component.KEY_PAGE_NAME), null);
            iVar.b = nwv.I(nVar.H("spm"), null);
            nwv.I(nVar.H("spm-url"), null);
            nwv.I(nVar.H("spm-cnt"), null);
            HashMap hashMap = new HashMap();
            Object m0 = nVar.m0(4);
            if (m0 instanceof Map) {
                hashMap.putAll((Map) m0);
            }
            iVar.c = hashMap;
            nVar.w1(101, iVar);
        } else {
            i iVar2 = (i) nVar.m0(101);
            String I = nwv.I(nVar.H(Component.KEY_PAGE_NAME), null);
            String I2 = nwv.I(nVar.H("spm"), null);
            if (I == null) {
                return;
            }
            if (!TextUtils.equals(iVar2.f12133a, I) || !TextUtils.equals(iVar2.b, I2)) {
                z0(nVar, iVar2);
            }
        }
    }

    public final void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa9a1998", new Object[]{this});
            return;
        }
        V v = this.view;
        if (v != 0) {
            int currentItem = ((ViewPager) v).getCurrentItem();
            if (((j) this.viewParams).x0 < Integer.MAX_VALUE) {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < this.node.k0(); i2++) {
                    if (i2 == currentItem) {
                        arrayList.add(Integer.valueOf(i2));
                    } else {
                        n i0 = this.node.i0(i2);
                        if (i0 != null && i0.A0()) {
                            arrayList.add(Integer.valueOf(i2));
                        }
                    }
                }
                if (arrayList.size() > ((j) this.viewParams).x0) {
                    int size = arrayList.size() - 1;
                    int i3 = 0;
                    for (int size2 = arrayList.size() - ((j) this.viewParams).x0; size2 > 0; size2--) {
                        int intValue = ((Integer) arrayList.get(i3)).intValue();
                        int intValue2 = ((Integer) arrayList.get(size)).intValue();
                        if (Math.abs(intValue - currentItem) >= Math.abs(intValue2 - currentItem)) {
                            this.node.i0(intValue).n(false);
                            i3++;
                        } else {
                            this.node.i0(intValue2).n(false);
                            size--;
                        }
                    }
                }
            }
        }
    }

    public final boolean K(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afd45f67", new Object[]{this, nVar})).booleanValue();
        }
        return nwv.o(nVar.H("disabled-page-track"), false);
    }

    public final boolean L(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41477283", new Object[]{this, nVar})).booleanValue();
        }
        boolean K = K(nVar);
        boolean p2 = akt.p2("enableChildPageTrack", true);
        if (!K || p2) {
            return true;
        }
        return false;
    }

    public final void M(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ccc2f37", new Object[]{this, new Boolean(z)});
            return;
        }
        V v = this.view;
        if (v != 0) {
            ((NestViewPager) v).setEnableSwipe(z);
        }
    }

    public final xbu N(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xbu) ipChange.ipc$dispatch("873791c5", new Object[]{this, nVar});
        }
        n z = nVar.z(xbu.class, new c(this), false);
        if (z != null) {
            return (xbu) z.K();
        }
        return null;
    }

    public final n O() {
        int max;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("412ba243", new Object[]{this});
        }
        com.taobao.tao.flexbox.layoutmanager.component.e d2 = com.taobao.tao.flexbox.layoutmanager.component.h.d(this.node, ((j) this.viewParams).y0);
        if (d2 == null || (max = Math.max(d2.K(), d2.getViewParams().D0)) >= ((ArrayList) this.node.d).size()) {
            return null;
        }
        return (n) ((ArrayList) this.node.d).get(max);
    }

    public final RecyclerView P(ViewGroup viewGroup) {
        RecyclerView P;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("a319e88a", new Object[]{this, viewGroup});
        }
        if (viewGroup instanceof RecyclerView) {
            return (RecyclerView) viewGroup;
        }
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof RecyclerView) {
                return (RecyclerView) childAt;
            }
            if ((childAt instanceof ViewGroup) && (P = P((ViewGroup) childAt)) != null) {
                return P;
            }
        }
        return null;
    }

    public final RecyclerView Q() {
        n S;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("d77e8b53", new Object[]{this});
        }
        V v = this.view;
        if (v == 0 || (S = S(((ViewPager) v).getCurrentItem())) == null) {
            return null;
        }
        View w0 = S.w0();
        if (w0 instanceof ViewGroup) {
            return P((ViewGroup) w0);
        }
        return null;
    }

    /* renamed from: R */
    public j generateViewParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("c33ff23c", new Object[]{this});
        }
        return new j();
    }

    public n S(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("a95dfcc5", new Object[]{this, new Integer(i2)});
        }
        return this.node.i0(i2);
    }

    public n U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("b726c3a2", new Object[]{this});
        }
        V v = this.view;
        if (v != 0) {
            return S(((ViewPager) v).getCurrentItem());
        }
        return null;
    }

    public int V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8c892e97", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public int W(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32be3e8b", new Object[]{this, nVar})).intValue();
        }
        while (nVar.Y() != null && !(nVar.Y().K() instanceof TabBarControllerComponent)) {
            nVar = nVar.Y();
        }
        for (int i2 = 0; i2 < ((ArrayList) this.node.d).size(); i2++) {
            if (((ArrayList) this.node.d).get(i2) == nVar) {
                return i2;
            }
        }
        return -1;
    }

    public final void Y(o oVar, IPage iPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67c372ef", new Object[]{this, oVar, iPage});
        } else if (akt.e()) {
            try {
                new x5r(oVar, (cll) iPage);
            } catch (Exception e2) {
                tfs.e("TabBarController", "APM_INIT error, " + e2.getMessage());
            }
        }
    }

    public final boolean Z() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47348aab", new Object[]{this})).booleanValue();
        }
        if (!akt.V0() || this.node.P().L() == null) {
            z = true;
        } else {
            z = this.node.P().L().isContainerResumed();
        }
        if (!nwv.Z(this.view) || !z) {
            return false;
        }
        return true;
    }

    public final void a0(n nVar, boolean z, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48806752", new Object[]{this, nVar, new Boolean(z), str});
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            str2 = "pageAppear:";
        } else {
            str2 = "pageDisAppear:";
        }
        sb.append(str2);
        sb.append(str);
        tfs.g("TabBarController", sb.toString());
        nVar.P().l1(new b(nVar.t0(), z, str));
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.g.e
    public void b(int i2, int i3, int i4, boolean z) {
        V v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdc6e4f7", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
        } else if (!b0() && (v = this.view) != 0) {
            int i5 = -i2;
            int i6 = i2 - ((this.j * i5) / i3);
            ((ViewPager) v).setTranslationY(i6);
            if (!z) {
                setHeight(this.i - i6);
            } else if (this.g.i() == 1) {
                setHeight(this.i + i3 + this.j);
            } else if (this.g.i() == 0 && this.g.h() == 2) {
                setHeight(this.i);
            }
            if (!((j) this.viewParams).C0) {
                return;
            }
            if (i5 <= 0) {
                ((NestViewPager) this.view).setEnableSwipe(true);
            } else if (i5 >= i3) {
                ((NestViewPager) this.view).setEnableSwipe(false);
            }
        }
    }

    public boolean b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("975df12f", new Object[]{this})).booleanValue();
        }
        if (getViewParams() == null || !getViewParams().w0) {
            return false;
        }
        return true;
    }

    public final MessageQueue.IdleHandler c0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MessageQueue.IdleHandler) ipChange.ipc$dispatch("a9ac60f5", new Object[]{this, new Integer(i2)});
        }
        MessageQueue.IdleHandler idleHandler = this.b;
        if (idleHandler != null) {
            return idleHandler;
        }
        g gVar = new g(i2);
        this.b = gVar;
        return gVar;
    }

    public final boolean childNeedLayout(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6aea993", new Object[]{this, nVar})).booleanValue();
        }
        boolean D0 = nVar.D0();
        if (D0) {
            return D0;
        }
        rbi S = nVar.S();
        if (S != null && S.f27261a == this.node.S().f27261a && S.b == this.h) {
            return false;
        }
        return true;
    }

    public final void d0(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd515768", new Object[]{this, nVar});
        } else if (!((j) this.viewParams).B0) {
            IPage iPage = (IPage) ((HashMap) this.l).get(nVar);
            if (iPage == null) {
                e0(nVar);
                iPage = (IPage) ((HashMap) this.l).get(nVar);
            }
            if (iPage != null) {
                iPage.e().onPageAppear();
                tfs.g("TabBarController", "onAPMPageAppear, node:" + nVar);
            }
        }
    }

    public final void e0(n nVar) {
        IPage iPage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("243e5661", new Object[]{this, nVar});
        } else if (!((j) this.viewParams).B0 && ((IPage) ((HashMap) this.l).get(nVar)) == null) {
            String str = nVar.c0().r().f23329a;
            HashMap hashMap = new HashMap();
            boolean z = this.r;
            Object W = nVar.P().W();
            if (!z || !(W instanceof Fragment)) {
                iPage = uml.c().a(nVar.w0(), true);
                Y(nVar.P(), iPage);
                iPage.e().a(f21.e(nVar), str, hashMap);
            } else {
                iPage = uml.c().b((Fragment) W, f21.e(nVar), str, nVar.w0(), true);
                Y(nVar.P(), iPage);
            }
            if (z) {
                iPage.d().a("isTNodeFirstPage", Boolean.TRUE);
            }
            if (W instanceof Fragment) {
                iPage.d().a("isTNodeFragmentMode", Boolean.TRUE);
                iPage.d().a("isTNodeRecovery", Boolean.valueOf(((Fragment) W).getArguments().getBoolean("isTNodeRecovery", false)));
            }
            this.r = false;
            nVar.f1(iPage);
            ((HashMap) this.l).put(nVar, iPage);
            try {
                nVar.w0().setTag(dgw.APM_PAGE_ROOT_VIEW, Boolean.TRUE);
            } catch (Exception unused) {
            }
            tfs.g("TabBarController", "onAPMPageCreate, node:" + nVar + " firstRender:" + z);
        }
    }

    @Override // tb.bae
    public syo f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (syo) ipChange.ipc$dispatch("d820478c", new Object[]{this});
        }
        return this.o;
    }

    public final void f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bf82fb3", new Object[]{this});
        } else if (!((j) this.viewParams).B0 && ((HashMap) this.l).values() != null) {
            for (IPage iPage : ((HashMap) this.l).values()) {
                iPage.e().onPageDestroy();
            }
            ((HashMap) this.l).clear();
            tfs.g("TabBarController", "onAPMPageDestroy");
        }
    }

    public final void g0(n nVar) {
        IPage iPage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6080476", new Object[]{this, nVar});
        } else if (!((j) this.viewParams).B0 && (iPage = (IPage) ((HashMap) this.l).get(nVar)) != null) {
            iPage.e().onPageDisappear();
            tfs.g("TabBarController", "onAPMPageDisappear, node:" + nVar);
        }
    }

    @Override // tb.bae
    public int getScrollState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("199fa08", new Object[]{this})).intValue();
        }
        return this.m;
    }

    /* renamed from: h0 */
    public ViewPager onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager) ipChange.ipc$dispatch("b0c03c88", new Object[]{this, context});
        }
        NestViewPager nestViewPager = new NestViewPager(context, this.node);
        nestViewPager.addOnPageChangeListener(this);
        nestViewPager.setId(nwv.A());
        return nestViewPager;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void handleChildAdded(n nVar, int i2, n nVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c190288e", new Object[]{this, nVar, new Integer(i2), nVar2});
        } else {
            this.k = true;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void handleChildDeleted(n nVar, int i2, n nVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa2e1a55", new Object[]{this, nVar, new Integer(i2), nVar2});
            return;
        }
        if (akt.n0()) {
            super.handleChildDeleted(nVar, i2, nVar2);
        }
        this.k = true;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void handleChildMoved(n nVar, int i2, int i3, n nVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49d053a6", new Object[]{this, nVar, new Integer(i2), new Integer(i3), nVar2});
        } else {
            this.k = true;
        }
    }

    public void i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        f0();
        if (this.b != null) {
            Looper.myQueue().removeIdleHandler(this.b);
            this.b = null;
        }
    }

    public void j0() {
        com.taobao.tao.flexbox.layoutmanager.component.g gVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb40e92a", new Object[]{this});
        } else if (this.view != 0 && (gVar = this.g) != null && gVar.i() == 0) {
            float f2 = -((ViewPager) this.view).getTranslationY();
            if (f2 >= this.g.g() / 2 && f2 < this.g.g() + this.j) {
                HashMap hashMap = new HashMap();
                hashMap.put("foldTab", Boolean.TRUE);
                hashMap.put("group", ((j) this.viewParams).y0);
                sendMessage(getNode(), "foldtab", null, hashMap, null);
            } else if (f2 < this.g.g() / 2 && f2 > 0.0f) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("foldTab", Boolean.FALSE);
                hashMap2.put("group", ((j) this.viewParams).y0);
                sendMessage(getNode(), "foldtab", null, hashMap2, null);
            }
        }
    }

    public final void l0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84f3ac96", new Object[]{this, new Integer(i2)});
        } else {
            Looper.myQueue().addIdleHandler(c0(i2));
        }
    }

    public final boolean m0(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af1dfff7", new Object[]{this, nVar})).booleanValue();
        }
        if (nVar != null) {
            boolean childNeedLayout = childNeedLayout(nVar);
            if (childNeedLayout) {
                nVar.r1();
                nVar.M0(nVar.Y().S().f27261a, this.h);
            }
            boolean A0 = nVar.A0();
            if (!A0 || childNeedLayout || nVar.F0()) {
                if (!A0) {
                    w0(nVar);
                }
                nVar.d1(((ViewPager) this.view).getContext(), this.node.d0());
                return true;
            }
        }
        return false;
    }

    public final boolean n0(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f86d3a89", new Object[]{this, map})).booleanValue();
        }
        if (!ir2.b(nwv.J(map.get("group"), null), ((j) this.viewParams).y0)) {
            return false;
        }
        int intValue = ((Integer) map.get("newIndex")).intValue();
        V v = this.view;
        if (!(v == 0 || intValue == ((ViewPager) v).getCurrentItem())) {
            this.e = true;
            ((ViewPager) this.view).setCurrentItem(intValue, !((j) this.viewParams).A0);
            this.e = false;
        }
        return true;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onLayoutChanged(int i2, int i3, int i4, int i5, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c8e65c2", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Boolean(z)});
            return;
        }
        super.onLayoutChanged(i2, i3, i4, i5, z);
        if (i2 != i4 && !z) {
            this.h = this.i;
            V v = this.view;
            if (v != 0) {
                ((ViewPager) v).setTranslationY(0.0f);
            }
            com.taobao.tao.flexbox.layoutmanager.component.g gVar = this.g;
            if (gVar != null) {
                gVar.p();
            }
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onLayoutComplete() {
        n O;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2801c9", new Object[]{this});
            return;
        }
        super.onLayoutComplete();
        int i3 = this.i;
        int i4 = this.measureResult.b;
        if (i3 != i4 && i4 > 0) {
            if (i3 > 0) {
                i2 = i4 - i3;
            } else {
                i2 = 0;
            }
            this.i = i4;
            if (this.h <= 0) {
                this.h = i4;
            }
            if (i2 != 0) {
                this.h += i2;
                com.taobao.tao.flexbox.layoutmanager.component.g gVar = this.g;
                if (gVar != null) {
                    gVar.r();
                }
            }
        }
        int i5 = this.h;
        if (i5 > 0) {
            this.measureResult.b = i5;
        }
        if (akt.X0() && (O = O()) != null && !O.A0() && childNeedLayout(O)) {
            O.r1();
            O.M0(this.node.S().f27261a, this.node.S().b);
            O.q1(false);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i2) {
        V v;
        n S;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i2)});
            return;
        }
        this.m = i2;
        this.o.b(this, i2);
        HashMap hashMap = new HashMap();
        hashMap.put("state", Integer.valueOf(i2));
        sendMessage(this.node, "onscrollstatechanged", null, hashMap, null);
        if (akt.d2() && (v = this.view) != 0 && (S = S(((ViewPager) v).getCurrentItem())) != null) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("state", Integer.valueOf(i2));
            t0(S, hashMap2);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onPatchCompleted() {
        TabBarControllerPageAdapter tabBarControllerPageAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf2dd229", new Object[]{this});
        } else if (this.k && this.view != 0 && (tabBarControllerPageAdapter = this.f12125a) != null) {
            tabBarControllerPageAdapter.m(this.node.d);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public boolean onPrepareComponent(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42f0f990", new Object[]{this, context})).booleanValue();
        }
        boolean onPrepareComponent = super.onPrepareComponent(context);
        if (onPrepareComponent) {
            nwv.y0(new d(context));
        }
        return onPrepareComponent;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onRenderCompleted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("751666fd", new Object[]{this});
        } else {
            super.onRenderCompleted();
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onSaveInstanceState(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afbed9be", new Object[]{this, map});
            return;
        }
        super.onSaveInstanceState(map);
        V v = this.view;
        if (v != 0) {
            int currentItem = ((ViewPager) v).getCurrentItem();
            if (getNode().i0(currentItem) != null) {
                map.put(SELECTED_INDEX_STATE_NAME, Integer.valueOf(currentItem));
            }
        }
    }

    public final void p0(Map map) {
        n i0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b546102f", new Object[]{this, map});
            return;
        }
        V v = this.view;
        if (v != 0) {
            int currentItem = ((ViewPager) v).getCurrentItem();
            if (this.f12125a != null && (i0 = this.node.i0(currentItem)) != null) {
                HashMap hashMap = new HashMap();
                if (map != null) {
                    hashMap.putAll(map);
                }
                s0(i0, hashMap);
            }
        }
    }

    public final void q0() {
        n S;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89b94bb4", new Object[]{this});
            return;
        }
        int i2 = this.c;
        if (i2 != -1 && (S = S(i2)) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("sourcePage", "tab");
            hashMap.put("type", "tab");
            s0(S, hashMap);
            v0(S, hashMap);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component, tb.w91
    public boolean sendViewAppearForAdd(n nVar) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6a1a1f5", new Object[]{this, nVar})).booleanValue();
        }
        if (!akt.r0()) {
            return super.sendViewAppearForAdd(nVar);
        }
        n nVar2 = this.node;
        V v = this.view;
        if (v != 0) {
            i2 = ((ViewPager) v).getCurrentItem();
        } else {
            i2 = 0;
        }
        if (nVar == nVar2.i0(i2)) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void setHeight(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fde48d3", new Object[]{this, new Integer(i2)});
        } else if (this.h != i2) {
            this.h = i2;
            rbi rbiVar = this.measureResult;
            if (rbiVar.b != i2) {
                rbiVar.b = i2;
                this.node.b1(((ViewPager) this.view).getContext());
                x0(i2);
            }
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void setWidth(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf60358", new Object[]{this, new Integer(i2)});
            return;
        }
        rbi rbiVar = this.measureResult;
        if (rbiVar.f27261a != i2) {
            rbiVar.f27261a = i2;
            this.node.b1(((ViewPager) this.view).getContext());
            y0(i2);
        }
    }

    public final void t0(n nVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3fa21cd", new Object[]{this, nVar, map});
        } else if (nVar.K() != null) {
            nVar.K().sendMessage(2, nVar, "onpagescrollstatechanged", null, map, null);
        }
    }

    public final void u0(n nVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1d665f9", new Object[]{this, nVar, map});
        } else if (nVar != null) {
            tfs.g("TabBarController", "sendChildPageStart, node:" + nVar);
            nVar.K().sendMessage(130, nVar, "onstart", null, new HashMap(map), null);
        }
    }

    public final void v0(n nVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f1211bf", new Object[]{this, nVar, map});
        } else if (nVar != null) {
            tfs.g("TabBarController", "sendChildPageStop, node:" + nVar);
            HashMap hashMap = new HashMap(map);
            if (nVar.K() != null) {
                nVar.K().sendMessage(130, nVar, "onstop", null, hashMap, null);
            }
        }
    }

    public final void w0(n nVar) {
        xbu N;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4a0a76e", new Object[]{this, nVar});
        } else if (L(nVar) && !((j) this.viewParams).B0 && (N = N(nVar)) != null) {
            N.v(true);
        }
    }

    public final void x0(int i2) {
        n S;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee8b74b0", new Object[]{this, new Integer(i2)});
            return;
        }
        V v = this.view;
        if (v != 0) {
            int currentItem = ((ViewPager) v).getCurrentItem();
            if (this.f12125a != null && (S = S(currentItem)) != null && S.K() != null && S.S() != null) {
                if (S.S().b != i2 || (S.w0() != null && S.w0().getHeight() > 0 && S.w0().getHeight() != i2)) {
                    S.S().b = i2;
                    S.r1();
                    S.L0(i2);
                    S.b1(((ViewPager) this.view).getContext());
                }
            }
        }
    }

    public final void y0(int i2) {
        n S;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("243567db", new Object[]{this, new Integer(i2)});
            return;
        }
        V v = this.view;
        if (v != 0) {
            int currentItem = ((ViewPager) v).getCurrentItem();
            if (this.f12125a != null && (S = S(currentItem)) != null && S.K() != null && S.S() != null) {
                if (S.S().f27261a != i2 || (S.w0() != null && S.w0().getWidth() != i2)) {
                    S.S().f27261a = i2;
                    S.r1();
                    S.M0(i2, S.S().b);
                    S.b1(((ViewPager) this.view).getContext());
                }
            }
        }
    }

    public final void z0(n nVar, i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("541a1ac9", new Object[]{this, nVar, iVar});
            return;
        }
        try {
            D0(nVar, nwv.I(nVar.H(Component.KEY_PAGE_NAME), null), nwv.z(nVar.m0(4), null), iVar.f12133a, iVar.c);
        } catch (Throwable unused) {
            tfs.e("TabBarController", "syncPageCompo Error");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class j extends jfw {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String MODE_FAST = "fast";
        public static final String MODE_IDLE = "idle";
        public static final String MODE_NONE = "none";
        public static final String MODE_PRELOAD = "preload";
        public String[] y0;
        public boolean w0 = false;
        public int x0 = Integer.MAX_VALUE;
        public boolean z0 = true;
        public boolean A0 = true;
        public boolean B0 = false;
        public boolean C0 = false;
        public String D0 = "none";
        public int E0 = 0;

        static {
            t2o.a(503316866);
        }

        public static /* synthetic */ void I(j jVar, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("18ee2ae4", new Object[]{jVar, obj});
            } else {
                jVar.J(obj);
            }
        }

        public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/TabBarControllerComponent$TabBarControllerParams");
        }

        public final void J(Object obj) {
            String[] split;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("efb63450", new Object[]{this, obj});
                return;
            }
            this.E0 = 0;
            String I = nwv.I(obj, null);
            if (I != null) {
                for (String str : I.split(SymbolExpUtil.SYMBOL_VERTICALBAR)) {
                    if (str.equals("left")) {
                        this.E0 |= 1;
                    } else if (str.equals("right")) {
                        this.E0 |= 16;
                    }
                }
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
            if (r9.equals("scroll") == false) goto L_0x0026;
         */
        @Override // tb.jfw
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void v(android.content.Context r8, java.lang.String r9, java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 296
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.TabBarControllerComponent.j.v(android.content.Context, java.lang.String, java.lang.Object):void");
        }
    }

    public final h A0(n nVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("5f43f56e", new Object[]{this, nVar, map});
        }
        String T = T(nVar);
        String I = nwv.I(nVar.H("spm"), null);
        String I2 = nwv.I(nVar.H("spm-url"), null);
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(I)) {
            hashMap.put("spm-cnt", I);
        }
        if (!TextUtils.isEmpty(I2)) {
            hashMap.put("spm-url", I2);
        }
        if (akt.b2()) {
            Object m0 = nVar.m0(4);
            if (m0 instanceof Map) {
                hashMap.putAll((Map) m0);
            }
        }
        boolean K = K(nVar);
        boolean o = nwv.o(map.get("ignorePageTrack"), false);
        if (L(nVar) && !o) {
            od0.D().d().h(nVar, T);
            if (!TextUtils.isEmpty(T)) {
                od0.D().d().updatePageName(this.node, T);
            }
            if (hashMap.size() > 0 && !K) {
                od0.D().d().updatePageProperties(nVar, hashMap);
            }
            xbu N = N(nVar);
            if (N != null) {
                N.w();
            }
        }
        return new h(T, I, hashMap);
    }

    public final String T(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c743595", new Object[]{this, nVar});
        }
        String I = nwv.I(nVar.H(Component.KEY_PAGE_NAME), null);
        return TextUtils.isEmpty(I) ? (String) nVar.m0(1) : I;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public com.taobao.tao.flexbox.layoutmanager.core.b getAttributeHandler(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.b) ipChange.ipc$dispatch("d23a2ffb", new Object[]{this, str});
        }
        if (akt.p2("optTabbarControllerAttr", true)) {
            if (TextUtils.equals(str, "scroll")) {
                return this.s;
            }
            if (TextUtils.equals(str, "edgepan")) {
                return this.t;
            }
        }
        return super.getAttributeHandler(str);
    }

    public final void k0(int i2) {
        n S;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a32df35", new Object[]{this, new Integer(i2)});
            return;
        }
        if (b0()) {
            int currentItem = ((ViewPager) this.view).getCurrentItem();
            if (!(this.f12125a == null || (S = S(currentItem)) == null || S.K() == null || S.S() == null)) {
                S.K0();
                S.b1(S.N());
            }
        } else {
            x0(this.h);
        }
        n S2 = S(i2);
        if (S2 != null) {
            this.c = i2;
            HashMap hashMap = new HashMap();
            hashMap.put("source", 2);
            hashMap.put("sourcePage", "tab");
            hashMap.put("type", "tab");
            if (S2.w0() == null) {
                S2.u1(hashMap);
            } else {
                u0(S2, hashMap);
                r0(S2, hashMap);
            }
            this.node.P().e0().n(this);
            this.n.a(this, i2);
            J();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i2)});
        } else if (!this.f) {
            if (!((j) this.viewParams).B0) {
                f21.i(f21.TASK_TAB_SELECT);
            }
            tfs.g("TabBarController", "onPageSelected, oldIndex: " + this.c + " newIndex:" + i2 + " group:" + ((j) this.viewParams).y0);
            q0();
            u = false;
            HashMap hashMap = new HashMap();
            hashMap.put("oldIndex", Integer.valueOf(this.c));
            hashMap.put("newIndex", Integer.valueOf(i2));
            hashMap.put("group", ((j) this.viewParams).y0);
            if (!this.e) {
                sendMessage(getNode(), "onpageselected", null, hashMap, null);
            } else {
                com.taobao.tao.flexbox.layoutmanager.component.e d2 = com.taobao.tao.flexbox.layoutmanager.component.h.d(this.node, ((j) this.viewParams).y0);
                if (d2 != null) {
                    sendMessage(d2.getNode(), "ontabselected", null, hashMap, null);
                }
            }
            if (this.e) {
                nwv.y0(new a(i2));
            } else {
                k0(i2);
            }
            if (!((j) this.viewParams).B0) {
                f21.o(f21.TASK_TAB_SELECT, new JSONObject(hashMap));
            }
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onViewCreated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad6b63ab", new Object[]{this});
            return;
        }
        com.taobao.tao.flexbox.layoutmanager.component.f c2 = com.taobao.tao.flexbox.layoutmanager.component.h.c(this.node, ((j) this.viewParams).y0, false);
        o.t T = this.node.T();
        if (T != null) {
            T.b(nuo.MSG_SELECT_TAB, this);
            T.b("weexfoldtab", this);
            T.b("foldtab", this);
            T.b("onpagemsg", this);
            if (c2 != null && ((f.b) c2.getViewParams()).x0) {
                T.b("onscroll", this);
                T.b("canscrollvertical", this);
            }
            T.b("onnestscroll", this);
        }
        com.taobao.tao.flexbox.layoutmanager.component.g d2 = com.taobao.tao.flexbox.layoutmanager.component.g.d(this.node.P(), this, ((j) this.viewParams).y0);
        this.g = d2;
        d2.e(this);
        int g2 = this.g.g();
        ((NestViewPager) this.view).setNestScrollDistance(g2);
        if (g2 > 0 && c2 != null && ((f.b) c2.getViewParams()).y0) {
            ((NestViewPager) this.view).fullNestScroll();
        }
    }

    public final boolean X() {
        boolean z = false;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee9c36a4", new Object[]{this})).booleanValue();
        }
        if (akt.a2()) {
            z2 = Build.VERSION.SDK_INT >= 23 ? Looper.myQueue().isIdle() : true;
            if (z2) {
                z2 = !((NestViewPager) this.view).isTouchOnView();
                RecyclerView Q = Q();
                if (Q != null) {
                    tfs.g("TabBarController", "recyclerView:" + Q + " scrollState:" + Q.getScrollState());
                    if (Q.getScrollState() == 0) {
                        z = true;
                    }
                    z2 &= z;
                }
            }
        }
        tfs.g("TabBarController", "inIdle:" + z2);
        return z2;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void detach(boolean z) {
        n S;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec06b7a", new Object[]{this, new Boolean(z)});
            return;
        }
        TabBarControllerPageAdapter tabBarControllerPageAdapter = this.f12125a;
        if (tabBarControllerPageAdapter != null) {
            tabBarControllerPageAdapter.m(null);
        }
        V v = this.view;
        if (!(v == 0 || ((ViewPager) v).getParent() == null)) {
            ((ViewGroup) ((ViewPager) this.view).getParent()).removeView(this.view);
        }
        this.view = null;
        this.attached = false;
        com.taobao.tao.flexbox.layoutmanager.component.g gVar = this.g;
        if (gVar != null) {
            gVar.o(this);
        }
        o.t T = this.node.T();
        if (T != null) {
            T.a(nuo.MSG_SELECT_TAB, this);
            T.a("weexfoldtab", this);
            T.a("foldtab", this);
            T.a("onpagemsg", this);
            T.a("onnestscroll", this);
            T.a("onscroll", this);
            T.a("canscrollvertical", this);
        }
        int i2 = this.c;
        if (!(i2 == -1 || (S = S(i2)) == null)) {
            HashMap hashMap = new HashMap();
            hashMap.put("type", "page");
            s0(S, hashMap);
            v0(S, hashMap);
        }
        if (this.node.d != null) {
            for (int i3 = 0; i3 < ((ArrayList) this.node.d).size(); i3++) {
                ((n) ((ArrayList) this.node.d).get(i3)).n(z);
            }
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public boolean interceptVNodeDiff(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7f54970", new Object[]{this, str})).booleanValue();
        }
        return "onunfold".equals(str) || "onfold".equals(str);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public boolean invoke(d.j jVar, String str, JSONObject jSONObject, d.k kVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f789b95", new Object[]{this, jVar, str, jSONObject, kVar})).booleanValue();
        }
        str.hashCode();
        if (!str.equals("preload")) {
            z = false;
        } else {
            Integer integer = jSONObject != null ? jSONObject.getInteger("index") : null;
            if (integer != null) {
                l0(integer.intValue());
            } else {
                List<Integer> i2 = TabBarControllerPageAdapter.i(this.f12125a);
                if (i2 != null) {
                    for (Integer num : i2) {
                        l0(num.intValue());
                    }
                }
            }
        }
        return !z ? super.invoke(jVar, str, jSONObject, kVar) : z;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.j
    public boolean onHandleMessage(n.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e782cf4", new Object[]{this, gVar})).booleanValue();
        }
        if (gVar.d.equals(nuo.MSG_SELECT_TAB)) {
            n0(gVar.e);
        } else if (gVar.d.equals("onwillappear")) {
            o0(gVar.e);
        } else if (gVar.d.equals("onwilldisappear")) {
            p0(gVar.e);
        } else if (gVar.d.equals("onstart")) {
            u0(U(), gVar.e);
            return true;
        } else if (!gVar.d.equals("onstop")) {
            return onHandleTNodeMessage(gVar.b, gVar.c, gVar.d, null, gVar.e, gVar.g);
        } else {
            v0(U(), gVar.e);
            return true;
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.j
    public boolean onHandleTNodeMessage(n nVar, n nVar2, String str, String str2, Map map, hk8 hk8Var) {
        n S;
        n i0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abab8f80", new Object[]{this, nVar, nVar2, str, str2, map, hk8Var})).booleanValue();
        }
        if (str.equals("ontabselected")) {
            return n0(map);
        }
        if (str.equals("onnestscroll")) {
            int t = nwv.t(map.get("nestY"), 0);
            int t2 = nwv.t(map.get("maxNestY"), 0);
            if (ir2.b(((j) this.viewParams).y0, nwv.J(map.get("group"), null))) {
                this.g.s(t, t2, false);
            }
        } else if (str.equals("onforcerefresh")) {
            V v = this.view;
            if (!(v == 0 || this.g == null)) {
                int currentItem = ((ViewPager) v).getCurrentItem();
                if (this.f12125a != null) {
                    n S2 = S(currentItem);
                    if (S2 != null) {
                        sendMessage(2, S2, str, null, null, null);
                    }
                    this.g.k();
                }
            }
            return true;
        } else if (str.equals("onpageappear")) {
            o0(map);
            return true;
        } else if (str.equals("onpagedisappear")) {
            p0(map);
            return true;
        } else if (str.equals("onpagescrollstatechanged")) {
            V v2 = this.view;
            if (v2 != 0) {
                int currentItem2 = ((ViewPager) v2).getCurrentItem();
                if (!(this.f12125a == null || (i0 = nVar2.i0(currentItem2)) == null)) {
                    t0(i0, map);
                }
            }
            return true;
        } else if (str.equals("onpagemsg")) {
            V v3 = this.view;
            if (v3 != 0) {
                int currentItem3 = ((ViewPager) v3).getCurrentItem();
                if (!(this.f12125a == null || (S = S(currentItem3)) == null)) {
                    if (str2 == null) {
                        str2 = (String) S.H(str);
                    }
                    sendMessage(34, S, str, str2, null, null);
                }
            }
            return true;
        } else {
            com.taobao.tao.flexbox.layoutmanager.component.h.f(str, map, this, ((j) this.viewParams).y0, this.g);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i2, float f2, int i3) {
        V v;
        n nVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i2), new Float(f2), new Integer(i3)});
            return;
        }
        this.p = i2;
        this.q = i3;
        if (!this.e) {
            HashMap hashMap = new HashMap();
            hashMap.put("index", Integer.valueOf(i2));
            hashMap.put("positionOffset", Float.valueOf(f2));
            hashMap.put("positionOffsetPixels", Integer.valueOf(i3));
            hashMap.put("group", ((j) this.viewParams).y0);
            hashMap.put("width", Integer.valueOf(this.measureResult.f27261a));
            hashMap.put("height", Integer.valueOf(this.measureResult.b));
            hashMap.put("offsetx", Integer.valueOf(i3));
            sendMessage(getNode(), "onpagescroll", null, hashMap, null);
            if (!TextUtils.equals(((j) this.viewParams).D0, "none") && this.f12125a != null && (v = this.view) != 0 && i3 > 1) {
                int currentItem = ((ViewPager) v).getCurrentItem();
                if (i2 == currentItem - 1) {
                    nVar = S(i2);
                } else if (i2 == currentItem) {
                    i2++;
                    nVar = S(i2);
                } else {
                    nVar = null;
                }
                if (nVar != null && !nVar.A0()) {
                    TabBarControllerPageAdapter tabBarControllerPageAdapter = this.f12125a;
                    V v2 = this.view;
                    TabBarControllerPageAdapter.h(tabBarControllerPageAdapter, (ViewGroup) v2, tabBarControllerPageAdapter.k((ViewGroup) v2, i2), nVar, false);
                }
            }
        }
    }

    public final void s0(n nVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f486a3a", new Object[]{this, nVar, map});
        } else if (nwv.o(nVar.m0(3), false)) {
            C0(nVar, map, false);
            String I = nwv.I(map.get("type"), null);
            if (!TextUtils.equals(I, "tab") && !TextUtils.equals(I, "page")) {
                I = "page";
            }
            map.put("type", I);
            nVar.K().sendMessage(130, nVar, "onpagedisappear", null, map, null);
            if (!((j) this.viewParams).B0) {
                B0(nVar, map);
                a0(nVar, false, T(nVar));
                g0(nVar);
            }
            nVar.w1(3, Boolean.FALSE);
        }
    }

    public final void o0(Map map) {
        n S;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48e35055", new Object[]{this, map});
            return;
        }
        V v = this.view;
        if (v != 0) {
            int currentItem = ((ViewPager) v).getCurrentItem();
            if (this.f12125a != null && (S = S(currentItem)) != null) {
                HashMap hashMap = new HashMap();
                if (u) {
                    hashMap.put("source", 1);
                } else {
                    hashMap.put("source", 2);
                }
                String str = "page";
                hashMap.put("sourcePage", map.get("sourcePage") != null ? map.get("sourcePage") : str);
                String I = nwv.I(map.get("type"), null);
                if (!TextUtils.equals(I, "tab") && !TextUtils.equals(I, str)) {
                    z = false;
                }
                if (z) {
                    str = I;
                }
                hashMap.put("type", str);
                if (S.w0() == null) {
                    S.u1(hashMap);
                } else {
                    r0(S, hashMap);
                }
            }
        }
    }

    public final void r0(n nVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97fcb912", new Object[]{this, nVar, map});
        } else if (!nwv.o(nVar.m0(3), false) && Z()) {
            C0(nVar, map, true);
            nVar.K().sendMessage(130, nVar, "onpageappear", null, map, null);
            if (!((j) this.viewParams).B0) {
                h A0 = A0(nVar, map);
                e0o renderIntercept = getRenderIntercept();
                if (renderIntercept != null) {
                    renderIntercept.m(((ViewPager) this.view).getContext(), nVar, A0.f12132a, A0.b, A0.c);
                }
                a0(nVar, true, A0.f12132a);
                d0(nVar);
            }
            nVar.w1(3, Boolean.TRUE);
            nVar.u1(null);
        }
    }

    public void D0(n nVar, String str, Map map, String str2, Map map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("286e6aff", new Object[]{this, nVar, str, map, str2, map2});
            return;
        }
        String I = str2 != null ? str2 : nwv.I(nVar.H(Component.KEY_PAGE_NAME), null);
        Map map3 = map2 != null ? map2 : (Map) nVar.m0(4);
        if (TextUtils.isEmpty(I)) {
            I = (String) nVar.m0(1);
        }
        Object m0 = nVar.m0(101);
        if (m0 instanceof i) {
            i iVar = (i) m0;
            if (nwv.o(nVar.m0(3), false)) {
                if (!TextUtils.equals(str, I) && !TextUtils.isEmpty(str)) {
                    if (!TextUtils.isEmpty(str)) {
                        od0.D().d().updatePageName(this.node, I);
                    }
                    if (map3 != null && map3.size() > 0) {
                        od0.D().d().updatePageProperties(nVar, map3);
                    }
                    od0.D().d().pageDisAppear(this.node);
                    g0(nVar);
                    nVar.w1(3, Boolean.FALSE);
                    if (!TextUtils.isEmpty(str)) {
                        od0.D().d().updatePageName(this.node, str);
                    }
                    if (map != null && map.size() > 0) {
                        String I2 = nwv.I(map.get("spm"), null);
                        String I3 = nwv.I(map.get("spm-url"), null);
                        String I4 = nwv.I(map.get("spm-cnt"), null);
                        od0.D().d().updatePageProperties(nVar, map);
                        if (iVar != null) {
                            iVar.a(str, I2, I3, I4, map);
                            nVar.w1(101, iVar);
                        }
                    }
                    d0(nVar);
                    od0.D().d().h(nVar, str);
                    nVar.w1(3, Boolean.TRUE);
                }
                nVar.u1(null);
            }
        }
    }
}
