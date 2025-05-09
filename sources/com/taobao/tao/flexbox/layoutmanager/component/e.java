package com.taobao.tao.flexbox.layoutmanager.component;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.tao.flexbox.layoutmanager.component.g;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.b;
import com.taobao.tao.flexbox.layoutmanager.core.j;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.flexbox.layoutmanager.filter.Utils;
import com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener;
import com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import tb.akt;
import tb.axk;
import tb.ejg;
import tb.hk8;
import tb.ir2;
import tb.jfw;
import tb.mx7;
import tb.nuo;
import tb.nwv;
import tb.od0;
import tb.rbi;
import tb.s6o;
import tb.sxo;
import tb.t2o;
import tb.tfs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class e extends Component<CustomTabLayout, h> implements sxo, j, g.e, ejg {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public com.taobao.tao.flexbox.layoutmanager.component.g c;
    public i h;
    public boolean i;
    public boolean j;
    public HashMap<n, Boolean> o;

    /* renamed from: a  reason: collision with root package name */
    public int f12147a = 0;
    public int b = 0;
    public final List<n> d = new LinkedList();
    public boolean e = true;
    public boolean f = false;
    public boolean g = false;
    public final com.taobao.tao.flexbox.layoutmanager.core.b k = new a();
    public final com.taobao.tao.flexbox.layoutmanager.core.b l = new b(this);
    public final ScrollChangeListener m = new c();
    public final CustomTabLayout.c n = new f();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends b.b0<CustomTabLayout, h> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/TabBarComponent$1");
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
        public void c(com.taobao.tao.flexbox.layoutmanager.core.e eVar, CustomTabLayout customTabLayout, h hVar, n.f fVar) {
            Drawable b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37592cab", new Object[]{this, eVar, customTabLayout, hVar, fVar});
            } else if (hVar != null && customTabLayout != null) {
                int i = hVar.w0;
                if (i > 0) {
                    customTabLayout.setSelectedTabIndicatorHeight(i);
                }
                int i2 = hVar.x0;
                if (i2 > 0) {
                    customTabLayout.setSelectedTabIndicatorWidth(i2);
                }
                if (hVar.z0 != null) {
                    e.h(e.this, hVar);
                } else {
                    int i3 = hVar.y0;
                    if (i3 != 1) {
                        customTabLayout.setSelectedTabIndicatorColor(i3);
                    }
                }
                if (h.I(hVar) != null) {
                    Drawable c = mx7.c(h.I(hVar), hVar.A0);
                    if (c != null) {
                        customTabLayout.setSelectedTabIndicatorDrawable(c);
                    }
                } else {
                    int i4 = hVar.A0;
                    if (i4 > 0 && (b = mx7.b(hVar.y0, i4)) != null) {
                        customTabLayout.setSelectedTabIndicatorDrawable(b);
                    }
                }
                if (hVar.C0 > 0) {
                    customTabLayout.setPaddingRelative(customTabLayout.getPaddingLeft(), customTabLayout.getPaddingTop(), customTabLayout.getPaddingRight(), hVar.C0);
                }
            }
        }

        /* renamed from: n */
        public void j(n nVar, h hVar, String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82824461", new Object[]{this, nVar, hVar, str, obj});
            } else if (hVar != null) {
                hVar.v(nVar.N(), str, obj);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends b.b0<CustomTabLayout, h> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(e eVar) {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/TabBarComponent$2");
        }

        /* renamed from: m */
        public void c(com.taobao.tao.flexbox.layoutmanager.core.e eVar, CustomTabLayout customTabLayout, h hVar, n.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37592cab", new Object[]{this, eVar, customTabLayout, hVar, fVar});
            } else {
                customTabLayout.updateFixedOffset(hVar);
            }
        }

        /* renamed from: n */
        public void j(n nVar, h hVar, String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82824461", new Object[]{this, nVar, hVar, str, obj});
            } else if (hVar != null) {
                hVar.Y0 = nwv.o(obj, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements ScrollChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
        public void onNestScroll(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("10a7e84b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
        public void onScroll(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e9628353", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("totalX", Integer.valueOf(i));
            hashMap.put("totalY", Integer.valueOf(i2));
            hashMap.put("offsetX", Integer.valueOf(s6o.K(e.this.getNode(), ((CustomTabLayout) e.t(e.this)).getContext(), i)));
            hashMap.put("offsetY", Integer.valueOf(s6o.K(e.this.getNode(), ((CustomTabLayout) e.x(e.this)).getContext(), i2)));
            View childAt = ((CustomTabLayout) e.y(e.this)).getChildAt(0);
            hashMap.put("contentWidth", Integer.valueOf(s6o.K(e.this.getNode(), ((CustomTabLayout) e.z(e.this)).getContext(), childAt.getWidth())));
            hashMap.put("contentHeight", Integer.valueOf(s6o.K(e.this.getNode(), ((CustomTabLayout) e.A(e.this)).getContext(), childAt.getHeight())));
            hashMap.put("width", Integer.valueOf(s6o.K(e.this.getNode(), ((CustomTabLayout) e.B(e.this)).getContext(), ((CustomTabLayout) e.C(e.this)).getWidth())));
            hashMap.put("height", Integer.valueOf(s6o.K(e.this.getNode(), ((CustomTabLayout) e.D(e.this)).getContext(), ((CustomTabLayout) e.i(e.this)).getHeight())));
            e eVar = e.this;
            eVar.sendMessage(eVar.getNode(), "onscroll", null, hashMap, null);
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
        public void onScrollStateChanged(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("faf93876", new Object[]{this, new Integer(i), new Integer(i2)});
            } else if (i == 0) {
                HashMap hashMap = new HashMap();
                hashMap.put("type", "item");
                e.j(e.this, false, hashMap);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements ImageLoader.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.e
        public void onImageLoadFailed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3feabda6", new Object[]{this});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.e
        public void onImageLoaded(BitmapDrawable bitmapDrawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30484add", new Object[]{this, bitmapDrawable});
            } else if (e.k(e.this) != null) {
                ((CustomTabLayout) e.l(e.this)).setSelectedTabIndicatorDrawable(bitmapDrawable);
            }
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.tao.flexbox.layoutmanager.component.e$e  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class RunnableC0687e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public RunnableC0687e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                ((CustomTabLayout) e.n(e.this)).scrollToTab(((h) e.m(e.this)).D0);
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements CustomTabLayout.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout.c
        public void a(CustomTabLayout.e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("817bd371", new Object[]{this, eVar});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout.c
        public void b(CustomTabLayout.e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c623108b", new Object[]{this, eVar});
            } else if (((h) e.v(e.this)).X0) {
                HashMap hashMap = new HashMap();
                hashMap.put("oldIndex", Integer.valueOf(eVar.d()));
                hashMap.put("newIndex", Integer.valueOf(eVar.d()));
                hashMap.put("group", ((h) e.w(e.this)).I0);
                e eVar2 = e.this;
                eVar2.sendMessage(eVar2.getNode(), "ontabselected", null, hashMap, null);
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.view.tabbar.CustomTabLayout.c
        public void c(CustomTabLayout.e eVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c880c73c", new Object[]{this, eVar, new Boolean(z)});
                return;
            }
            if (eVar.d() != e.o(e.this) && !e.this.g) {
                tfs.g("TabBar", "onTabSelected, oldIndex:" + e.o(e.this) + " newIndex:" + eVar.d() + " group:" + ((h) e.q(e.this)).I0 + " userClick:" + z);
                HashMap hashMap = new HashMap();
                hashMap.put("oldIndex", Integer.valueOf(e.o(e.this)));
                hashMap.put("newIndex", Integer.valueOf(eVar.d()));
                hashMap.put("group", ((h) e.r(e.this)).I0);
                e eVar2 = e.this;
                eVar2.sendMessage(eVar2.getNode(), nuo.MSG_SELECT_TAB, null, hashMap, null);
            }
            if (eVar.d() != e.o(e.this)) {
                e.this.g = false;
            }
            e eVar3 = e.this;
            e.s(eVar3, e.o(eVar3));
            e.p(e.this, eVar.d());
            if (z) {
                ((h) e.u(e.this)).D0 = eVar.d();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n.g f12152a;

        public g(n.g gVar) {
            this.f12152a = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                e.j(e.this, false, this.f12152a.e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f12153a;
        public String b;

        static {
            t2o.a(503316853);
        }

        public static /* synthetic */ String a(i iVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2454f228", new Object[]{iVar});
            }
            return iVar.b;
        }

        public static /* synthetic */ int b(i iVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("619432ac", new Object[]{iVar})).intValue();
            }
            return iVar.f12153a;
        }

        public static i c(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (i) ipChange.ipc$dispatch("fd2fda89", new Object[]{jSONObject});
            }
            i iVar = new i();
            iVar.f12153a = nwv.t(jSONObject.get("tabIndex"), -1);
            jSONObject.getString("tabName");
            jSONObject.getString("tabbarId");
            iVar.b = jSONObject.getString("group");
            jSONObject.getJSONObject("extra");
            return iVar;
        }
    }

    static {
        t2o.a(503316844);
        t2o.a(503317117);
        t2o.a(503317092);
        t2o.a(503316875);
        t2o.a(503317088);
    }

    public static /* synthetic */ View A(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2863296a", new Object[]{eVar});
        }
        return eVar.view;
    }

    public static /* synthetic */ View B(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("116aee6b", new Object[]{eVar});
        }
        return eVar.view;
    }

    public static /* synthetic */ View C(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fa72b36c", new Object[]{eVar});
        }
        return eVar.view;
    }

    public static /* synthetic */ View D(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e37a786d", new Object[]{eVar});
        }
        return eVar.view;
    }

    public static /* synthetic */ void h(e eVar, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c587273b", new Object[]{eVar, hVar});
        } else {
            eVar.Q(hVar);
        }
    }

    public static /* synthetic */ View i(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("669d32d3", new Object[]{eVar});
        }
        return eVar.view;
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1619485803:
                return new Boolean(super.invoke((d.j) objArr[0], (String) objArr[1], (JSONObject) objArr[2], (d.k) objArr[3]));
            case -767938565:
                return super.getAttributeHandler((String) objArr[0]);
            case -703216504:
                super.applyAttrForView((View) objArr[0], (jfw) objArr[1], (Map) objArr[2], ((Boolean) objArr[3]).booleanValue());
                return null;
            case -97641899:
                super.handleChildDeleted((n) objArr[0], ((Number) objArr[1]).intValue(), (n) objArr[2]);
                return null;
            case 1015965122:
                super.onLayoutChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Boolean) objArr[4]).booleanValue());
                return null;
            case 1052797818:
                super.detach(((Boolean) objArr[0]).booleanValue());
                return null;
            case 1238389670:
                super.handleChildMoved((n) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), (n) objArr[3]);
                return null;
            case 1964402429:
                super.onRenderCompleted();
                return null;
            case 2043760425:
                super.onInitAttrs((com.taobao.tao.flexbox.layoutmanager.core.e) objArr[0], (View) objArr[1], (jfw) objArr[2], (n.f) objArr[3]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/TabBarComponent");
        }
    }

    public static /* synthetic */ void j(e eVar, boolean z, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35fc243", new Object[]{eVar, new Boolean(z), map});
        } else {
            eVar.G(z, map);
        }
    }

    public static /* synthetic */ View k(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("38acbcd5", new Object[]{eVar});
        }
        return eVar.view;
    }

    public static /* synthetic */ View l(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("21b481d6", new Object[]{eVar});
        }
        return eVar.view;
    }

    public static /* synthetic */ jfw m(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("bd44e2fe", new Object[]{eVar});
        }
        return eVar.viewParams;
    }

    public static /* synthetic */ View n(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f3c40bd8", new Object[]{eVar});
        }
        return eVar.view;
    }

    public static /* synthetic */ int o(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7ce6004a", new Object[]{eVar})).intValue();
        }
        return eVar.f12147a;
    }

    public static /* synthetic */ int p(e eVar, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("919b3ebd", new Object[]{eVar, new Integer(i2)})).intValue();
        }
        eVar.f12147a = i2;
        return i2;
    }

    public static /* synthetic */ jfw q(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("7e4e665b", new Object[]{eVar});
        }
        return eVar.viewParams;
    }

    public static /* synthetic */ jfw r(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("bea6e77a", new Object[]{eVar});
        }
        return eVar.viewParams;
    }

    public static /* synthetic */ int s(e eVar, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("187b5d5a", new Object[]{eVar, new Integer(i2)})).intValue();
        }
        eVar.b = i2;
        return i2;
    }

    public static /* synthetic */ View t(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("84441566", new Object[]{eVar});
        }
        return eVar.view;
    }

    public static /* synthetic */ jfw u(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("869a8143", new Object[]{eVar});
        }
        return eVar.viewParams;
    }

    public static /* synthetic */ jfw v(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("c6f30262", new Object[]{eVar});
        }
        return eVar.viewParams;
    }

    public static /* synthetic */ jfw w(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("74b8381", new Object[]{eVar});
        }
        return eVar.viewParams;
    }

    public static /* synthetic */ View x(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6d4bda67", new Object[]{eVar});
        }
        return eVar.view;
    }

    public static /* synthetic */ View y(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("56539f68", new Object[]{eVar});
        }
        return eVar.view;
    }

    public static /* synthetic */ View z(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3f5b6469", new Object[]{eVar});
        }
        return eVar.view;
    }

    /* renamed from: E */
    public void applyAttrForView(CustomTabLayout customTabLayout, h hVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15e66245", new Object[]{this, customTabLayout, hVar, map, new Boolean(z)});
            return;
        }
        super.applyAttrForView(customTabLayout, this.viewParams, map, z);
        if (hVar != null) {
            this.k.c(this, customTabLayout, hVar, null);
            customTabLayout.setSelectFontSize(hVar.L0, hVar.K0);
            customTabLayout.setUnselectFontSize(hVar.N0, hVar.M0);
            customTabLayout.setSelectFontColor(hVar.P0, hVar.O0);
            customTabLayout.setUnselectFontColor(hVar.R0, hVar.Q0);
            customTabLayout.setSelectFontStyle(hVar.T0, hVar.S0);
            customTabLayout.setUnselectFontStyle(hVar.V0, hVar.U0);
            customTabLayout.setDiffHeight(hVar.H0);
            if (this.e) {
                this.e = false;
                int max = Math.max(K(), ((h) this.viewParams).D0);
                P p = this.viewParams;
                if (((h) p).D0 != max) {
                    ((h) p).D0 = max;
                }
                if (max > 0) {
                    this.g = true;
                }
            }
        }
    }

    public final boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eef4bbfc", new Object[]{this})).booleanValue();
        }
        if (getViewParams() == null || getViewParams().E0 <= 0) {
            return true;
        }
        return false;
    }

    public final void H(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a8525c", new Object[]{this, nVar});
        } else if (nVar != null) {
            Object H = nVar.H("tab-scrollable");
            if (H == null || "false".equals(String.valueOf(H))) {
                Iterator it = ((ArrayList) nVar.d).iterator();
                while (it.hasNext()) {
                    H((n) it.next());
                }
                return;
            }
            ((LinkedList) this.d).add(nVar);
        }
    }

    public final void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83793ff2", new Object[]{this});
        } else if (this.c == null) {
            com.taobao.tao.flexbox.layoutmanager.component.g d2 = com.taobao.tao.flexbox.layoutmanager.component.g.d(this.node.P(), this, ((h) this.viewParams).I0);
            this.c = d2;
            d2.e(this);
        }
    }

    /* renamed from: J */
    public h generateViewParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("c07f574", new Object[]{this});
        }
        return new h();
    }

    public int K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e9c51d66", new Object[]{this})).intValue();
        }
        if (((h) this.viewParams).G0 != null) {
            for (int i2 = 0; i2 < ((ArrayList) this.node.d).size(); i2++) {
                if (Utils.isEqual(((h) this.viewParams).G0, ((n) ((ArrayList) this.node.d).get(i2)).H("key"))) {
                    return i2;
                }
            }
        }
        return ((h) this.viewParams).F0;
    }

    /* renamed from: L */
    public CustomTabLayout onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CustomTabLayout) ipChange.ipc$dispatch("796ea826", new Object[]{this, context});
        }
        CustomTabLayout customTabLayout = new CustomTabLayout(context);
        customTabLayout.setTabMode(0);
        if (!TextUtils.isEmpty(((h) this.viewParams).J0)) {
            customTabLayout.setTabAlign(((h) this.viewParams).J0);
        }
        customTabLayout.setOnTabSelectedListener(this.n);
        customTabLayout.settNode(getNode());
        customTabLayout.addScrollChangedListener(this.m);
        if (((h) this.viewParams).W0) {
            customTabLayout.enableEdgeEffect();
        }
        return customTabLayout;
    }

    /* renamed from: M */
    public void onInitAttrs(com.taobao.tao.flexbox.layoutmanager.core.e eVar, CustomTabLayout customTabLayout, h hVar, n.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0409326", new Object[]{this, eVar, customTabLayout, hVar, fVar});
            return;
        }
        super.onInitAttrs(eVar, customTabLayout, hVar, fVar);
        this.l.c(eVar, customTabLayout, hVar, fVar);
    }

    public void N(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffde1203", new Object[]{this, new Integer(i2)});
            return;
        }
        ((h) this.viewParams).D0 = i2;
        O();
    }

    public final void P(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe0915cf", new Object[]{this, new Boolean(z)});
        } else if (z) {
            String str = (String) this.node.H("onfold");
            if (str != null) {
                sendMessage(this.node, "onfold", str, null, null);
            }
        } else {
            String str2 = (String) this.node.H("onunfold");
            if (str2 != null) {
                sendMessage(this.node, "onunfold", str2, null, null);
            }
        }
    }

    public final void Q(h hVar) {
        String b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f745aa8", new Object[]{this, hVar});
            return;
        }
        String str = hVar.z0;
        boolean startsWith = str.startsWith("./");
        ImageLoader a2 = od0.D().a();
        if (startsWith) {
            b2 = nwv.w(this.node.N(), str, true);
        } else {
            b2 = a2.b(str, this.node.S().f27261a, this.node.S().b, ImageLoader.b.a());
        }
        if (!TextUtils.isEmpty(b2)) {
            a2.e(((CustomTabLayout) this.view).getContext(), b2, -1, -1, new d());
        }
    }

    public void R(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9afae54", new Object[]{this, iVar});
        } else {
            this.h = iVar;
        }
    }

    public final void S(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8997d88d", new Object[]{this, new Float(f2)});
            return;
        }
        for (n nVar : this.d) {
            nVar.w0().setAlpha(f2);
            nVar.K().getViewParams().T = f2;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void addOrUpdateView(boolean z, View view, rbi rbiVar, n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f569c", new Object[]{this, new Boolean(z), view, rbiVar, nVar});
        } else if (view.getParent() == null) {
            V v = this.view;
            ((CustomTabLayout) v).addTab(((CustomTabLayout) v).newTab().j(view).l(nVar));
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.g.e
    public void b(int i2, int i3, int i4, boolean z) {
        boolean z2;
        V v;
        boolean z3;
        V v2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdc6e4f7", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
        } else if (F()) {
            n x = this.node.g0().x(TabBarControllerComponent.class);
            if (x == null || !((TabBarControllerComponent) x.K()).b0()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!this.f) {
                if (!z2 && (v2 = this.view) != 0) {
                    ((CustomTabLayout) v2).setTranslationY(i2);
                }
                int i5 = -i2;
                S(1.0f - (i5 / i3));
                if (!this.d.isEmpty() && (v = this.view) != 0) {
                    CustomTabLayout customTabLayout = (CustomTabLayout) v;
                    if (i5 != i3) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    customTabLayout.setIndicatorWillNotDraw(z3);
                }
                if (i4 == this.c.h()) {
                    return;
                }
                if (this.c.h() == 1) {
                    P(true);
                } else if (this.c.h() == 2) {
                    P(false);
                }
            }
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public HashMap clickArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("16a46aef", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("oldIndex", Integer.valueOf(this.b));
        hashMap.put("newIndex", Integer.valueOf(this.f12147a));
        return hashMap;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void detach(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec06b7a", new Object[]{this, new Boolean(z)});
            return;
        }
        super.detach(z);
        com.taobao.tao.flexbox.layoutmanager.component.g gVar = this.c;
        if (gVar != null) {
            gVar.o(this);
        }
        o.t T = this.node.T();
        if (T != null) {
            T.a("onpageselected", this);
            T.a("onpagescroll", this);
            T.a("onpagewillappear", this);
        }
    }

    @Override // tb.ejg
    public void e(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86fbc9c", new Object[]{this, nVar});
        } else if (nVar.w0() != null && nVar.w0().getParent() != null) {
            ((ViewGroup) nVar.w0().getParent()).setZ(1.0f);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
        if (r6.equals("indicator-bottom") == false) goto L_0x0022;
     */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.tao.flexbox.layoutmanager.core.b getAttributeHandler(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.tao.flexbox.layoutmanager.component.e.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "d23a2ffb"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            r2[r0] = r6
            java.lang.Object r6 = r3.ipc$dispatch(r4, r2)
            com.taobao.tao.flexbox.layoutmanager.core.b r6 = (com.taobao.tao.flexbox.layoutmanager.core.b) r6
            return r6
        L_0x0018:
            if (r6 == 0) goto L_0x007f
            r3 = -1
            int r4 = r6.hashCode()
            switch(r4) {
                case -945332980: goto L_0x006a;
                case -887740503: goto L_0x0060;
                case -725541211: goto L_0x0054;
                case -443090416: goto L_0x0048;
                case 2050488869: goto L_0x003c;
                case 2055959581: goto L_0x0030;
                case 2068773000: goto L_0x0024;
                default: goto L_0x0022;
            }
        L_0x0022:
            r0 = -1
            goto L_0x0075
        L_0x0024:
            java.lang.String r0 = "indicator-width"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x002e
            goto L_0x0022
        L_0x002e:
            r0 = 6
            goto L_0x0075
        L_0x0030:
            java.lang.String r0 = "indicator-image"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x003a
            goto L_0x0022
        L_0x003a:
            r0 = 5
            goto L_0x0075
        L_0x003c:
            java.lang.String r0 = "indicator-color"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0046
            goto L_0x0022
        L_0x0046:
            r0 = 4
            goto L_0x0075
        L_0x0048:
            java.lang.String r0 = "indicator-radius"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0052
            goto L_0x0022
        L_0x0052:
            r0 = 3
            goto L_0x0075
        L_0x0054:
            java.lang.String r0 = "indicator-height"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x005e
            goto L_0x0022
        L_0x005e:
            r0 = 2
            goto L_0x0075
        L_0x0060:
            java.lang.String r1 = "indicator-bottom"
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L_0x0075
            goto L_0x0022
        L_0x006a:
            java.lang.String r0 = "fixed-offset"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0074
            goto L_0x0022
        L_0x0074:
            r0 = 0
        L_0x0075:
            switch(r0) {
                case 0: goto L_0x007c;
                case 1: goto L_0x0079;
                case 2: goto L_0x0079;
                case 3: goto L_0x0079;
                case 4: goto L_0x0079;
                case 5: goto L_0x0079;
                case 6: goto L_0x0079;
                default: goto L_0x0078;
            }
        L_0x0078:
            goto L_0x007f
        L_0x0079:
            com.taobao.tao.flexbox.layoutmanager.core.b r6 = r5.k
            return r6
        L_0x007c:
            com.taobao.tao.flexbox.layoutmanager.core.b r6 = r5.l
            return r6
        L_0x007f:
            com.taobao.tao.flexbox.layoutmanager.core.b r6 = super.getAttributeHandler(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.e.getAttributeHandler(java.lang.String):com.taobao.tao.flexbox.layoutmanager.core.b");
    }

    @Override // tb.sxo
    public int getScrollCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce801786", new Object[]{this})).intValue();
        }
        return this.node.k0();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void handleChildAdded(n nVar, int i2, n nVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c190288e", new Object[]{this, nVar, new Integer(i2), nVar2});
        } else {
            this.node.p1(true);
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
        this.node.p1(true);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void handleChildMoved(n nVar, int i2, int i3, n nVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49d053a6", new Object[]{this, nVar, new Integer(i2), new Integer(i3), nVar2});
            return;
        }
        this.i = true;
        super.handleChildMoved(nVar, i2, i3, nVar2);
        this.node.p1(true);
        this.i = false;
    }

    public final boolean isChildVisible(View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c3100b", new Object[]{this, view, view2})).booleanValue();
        }
        Rect rect = new Rect();
        view.getHitRect(rect);
        return view2.getLocalVisibleRect(rect);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onLayoutChanged(int i2, int i3, int i4, int i5, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c8e65c2", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Boolean(z)});
            return;
        }
        super.onLayoutChanged(i2, i3, i4, i5, z);
        V v = this.view;
        if (v != 0 && i2 != i4 && !z) {
            ((CustomTabLayout) v).setTranslationY(0.0f);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onRenderCompleted() {
        Object H;
        CustomTabLayout view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("751666fd", new Object[]{this});
            return;
        }
        super.onRenderCompleted();
        boolean O = O();
        if (!this.j && akt.p2("fixTabScrollIndex", true)) {
            this.j = true;
            if (O) {
                axk.a(this.view, new RunnableC0687e());
            }
        }
        n node = getNode();
        I();
        if (!this.c.j() && this.d.isEmpty()) {
            H(node);
        }
        if (node != null && (H = node.H("indicator-hidden")) != null && !"false".equals(String.valueOf(H)) && (view = getView()) != null) {
            view.setIndicatorWillNotDraw(true ^ this.c.j());
        }
    }

    @Override // tb.sxo
    public void scrollBy(int i2, int i3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f06fc09", new Object[]{this, new Integer(i2), new Integer(i3), new Boolean(z)});
            return;
        }
        V v = this.view;
        if (v == 0) {
            return;
        }
        if (z) {
            ((CustomTabLayout) v).smoothScrollBy(i2, i3);
        } else {
            ((CustomTabLayout) v).scrollBy(i2, i3);
        }
    }

    @Override // tb.sxo
    public void scrollTo(int i2, int i3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d0b0965", new Object[]{this, new Integer(i2), new Integer(i3), new Boolean(z)});
            return;
        }
        V v = this.view;
        if (v == 0) {
            return;
        }
        if (z) {
            ((CustomTabLayout) v).smoothScrollTo(i2, i3);
        } else {
            ((CustomTabLayout) v).scrollTo(i2, i3);
        }
    }

    @Override // tb.sxo
    public void scrollToPosition(int i2, boolean z, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d225a7a", new Object[]{this, new Integer(i2), new Boolean(z), new Integer(i3)});
        } else {
            scrollToPositionWithNumber(i2, z, i3, 0);
        }
    }

    @Override // tb.sxo
    public void scrollToPositionWithNumber(int i2, boolean z, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cb0b758", new Object[]{this, new Integer(i2), new Boolean(z), new Integer(i3), new Integer(i4)});
            return;
        }
        V v = this.view;
        if (v != 0) {
            ((CustomTabLayout) v).scrollToPosition(i2, z);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void sortChildren() {
        V v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72a97c4", new Object[]{this});
        } else if (!this.i) {
            int size = ((ArrayList) this.node.d).size();
            boolean E0 = this.node.E0();
            if (!E0 && size > 1 && (v = this.view) != 0) {
                if (size == ((CustomTabLayout) v).getTabCount()) {
                    for (int i2 = 0; i2 < size; i2++) {
                        if (((n) ((ArrayList) this.node.d).get(i2)).w0() == ((CustomTabLayout) this.view).getTabAt(i2).c()) {
                        }
                    }
                }
                E0 = true;
                break;
            }
            if (E0) {
                V v2 = this.view;
                if (v2 != 0) {
                    ((CustomTabLayout) v2).removeAllTabs();
                    for (int i3 = 0; i3 < size; i3++) {
                        CustomTabLayout customTabLayout = (CustomTabLayout) this.view;
                        customTabLayout.addTab(customTabLayout.newTab().j(((n) ((ArrayList) this.node.d).get(i3)).w0()).l((n) ((ArrayList) this.node.d).get(i3)), i3, false);
                    }
                }
                O();
            }
        }
    }

    public final void G(boolean z, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee4534f5", new Object[]{this, new Boolean(z), map});
            return;
        }
        if (this.o == null) {
            this.o = new HashMap<>();
        }
        if (!(this.view == 0 || this.node == null)) {
            for (int i2 = 0; i2 < ((ArrayList) this.node.d).size(); i2++) {
                n nVar = (n) ((ArrayList) this.node.d).get(i2);
                if (nVar.w0() != null) {
                    boolean z2 = !z && isChildVisible(this.view, nVar.w0());
                    Boolean bool = this.o.get(nVar);
                    if (z2 && (bool == null || !bool.booleanValue())) {
                        sendMessage(130, nVar, "onwillappear", null, map, null);
                    } else if (bool != null && bool.booleanValue() && !z2) {
                        sendMessage(Component.MSG_FLAG_DISAPPEAR, nVar, "onwilldisappear", null, map, null);
                    }
                    this.o.put(nVar, Boolean.valueOf(z2));
                }
            }
        }
    }

    public final boolean O() {
        V v;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28ee6c61", new Object[]{this})).booleanValue();
        }
        P p = this.viewParams;
        if (!(p == 0 || (v = this.view) == 0 || ((h) p).D0 >= ((CustomTabLayout) v).getTabCount())) {
            int selectedTabPosition = ((CustomTabLayout) this.view).getSelectedTabPosition();
            P p2 = this.viewParams;
            if (!(selectedTabPosition == ((h) p2).D0 || ((CustomTabLayout) this.view).getTabAt(((h) p2).D0) == null)) {
                tfs.g("TabBar", "selectTabInternal, oldIndex:" + ((CustomTabLayout) this.view).getSelectedTabPosition() + " newIndex:" + ((h) this.viewParams).D0);
                ((CustomTabLayout) this.view).getTabAt(((h) this.viewParams).D0).h();
                this.g = false;
                return z;
            }
        }
        z = false;
        this.g = false;
        return z;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public boolean invoke(d.j jVar, String str, JSONObject jSONObject, d.k kVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f789b95", new Object[]{this, jVar, str, jSONObject, kVar})).booleanValue();
        }
        str.hashCode();
        if (!str.equals("showIndex")) {
            z = false;
        } else {
            int intValue = jSONObject.getIntValue("index");
            boolean booleanValue = jSONObject.getBooleanValue("animated");
            V v = this.view;
            if (v != 0) {
                ((CustomTabLayout) v).setScrollPosition(intValue, 0.0f, false, false, booleanValue);
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
        if (gVar.d.equals("onwillappear")) {
            V v = this.view;
            if (v != 0) {
                ((CustomTabLayout) v).post(new g(gVar));
            }
        } else if (!gVar.d.equals("onwilldisappear")) {
            return onHandleTNodeMessage(gVar.b, gVar.c, gVar.d, null, gVar.e, gVar.g);
        } else {
            G(true, gVar.e);
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onViewCreated() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad6b63ab", new Object[]{this});
            return;
        }
        if (com.taobao.tao.flexbox.layoutmanager.component.h.c(this.node, ((h) this.viewParams).I0, true) != null) {
            z = true;
        }
        this.f = z;
        o.t T = this.node.T();
        if (T != null) {
            T.b("onpageselected", this);
            T.b("onpagescroll", this);
            T.b("onpagewillappear", this);
        }
        com.taobao.tao.flexbox.layoutmanager.component.g d2 = com.taobao.tao.flexbox.layoutmanager.component.g.d(this.node.P(), this, ((h) this.viewParams).I0);
        this.c = d2;
        d2.e(this);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class h extends jfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int A0;
        public int C0;
        public Object G0;
        public String[] I0;
        public String J0;
        public boolean Y0;
        public int w0 = 4;
        public int x0 = 4;
        public int y0 = 1;
        public String z0 = null;
        public jfw.b B0 = null;
        public int D0 = 0;
        public int E0 = -1;
        public int F0 = 0;
        public int H0 = 0;
        public int K0 = -1;
        public Object L0 = null;
        public int M0 = -1;
        public Object N0 = null;
        public int O0 = 1;
        public Object P0 = null;
        public int Q0 = 1;
        public Object R0 = null;
        public int S0 = -1;
        public Object T0 = null;
        public int U0 = -1;
        public Object V0 = null;
        public boolean W0 = false;
        public boolean X0 = false;

        static {
            t2o.a(503316852);
        }

        public static /* synthetic */ jfw.b I(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jfw.b) ipChange.ipc$dispatch("a4932ed0", new Object[]{hVar});
            }
            return hVar.B0;
        }

        public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/TabBarComponent$TabBarParams");
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x0137, code lost:
            if (r10.equals("indicator-height") == false) goto L_0x0026;
         */
        @Override // tb.jfw
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void v(android.content.Context r9, java.lang.String r10, java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 794
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.e.h.v(android.content.Context, java.lang.String, java.lang.Object):void");
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.j
    public boolean onHandleTNodeMessage(n nVar, n nVar2, String str, String str2, Map map, hk8 hk8Var) {
        i iVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abab8f80", new Object[]{this, nVar, nVar2, str, str2, map, hk8Var})).booleanValue();
        }
        if (str.equals("onpageselected")) {
            if (!ir2.b(nwv.J(map.get("group"), null), ((h) this.viewParams).I0)) {
                return false;
            }
            int intValue = ((Integer) map.get("newIndex")).intValue();
            V v = this.view;
            if (!(v == 0 || intValue == ((CustomTabLayout) v).getSelectedTabPosition() || ((CustomTabLayout) this.view).getTabAt(intValue) == null)) {
                this.g = true;
                ((h) this.viewParams).D0 = intValue;
                ((CustomTabLayout) this.view).getTabAt(intValue).h();
            }
            return true;
        } else if (!str.equals("onpagescroll")) {
            if (str.equals("onpagewillappear") && (iVar = this.h) != null && ir2.b(new String[]{i.a(iVar)}, ((h) this.viewParams).I0) && i.b(this.h) >= 0 && i.b(this.h) != ((h) this.viewParams).D0) {
                HashMap hashMap = new HashMap();
                hashMap.put("newIndex", Integer.valueOf(i.b(this.h)));
                hashMap.put("oldIndex", Integer.valueOf(((h) this.viewParams).D0));
                sendMessage(34, nVar2, "ontabredirect", null, hashMap, null);
                N(i.b(this.h));
                R(null);
            }
            return false;
        } else if (!ir2.b(nwv.J(map.get("group"), null), ((h) this.viewParams).I0) || !F()) {
            return false;
        } else {
            if (this.view != 0) {
                ((CustomTabLayout) this.view).setScrollPosition(((Integer) map.get("index")).intValue(), ((Float) map.get("positionOffset")).floatValue(), true);
            }
            return true;
        }
    }
}
