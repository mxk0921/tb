package com.taobao.tao.flexbox.layoutmanager.core;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent;
import com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.tao.flexbox.layoutmanager.core.f;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.flexbox.layoutmanager.view.FlatViewGroup;
import java.util.Map;
import tb.akt;
import tb.anl;
import tb.eq8;
import tb.gl4;
import tb.hk8;
import tb.lgs;
import tb.nwv;
import tb.od0;
import tb.t2o;
import tb.tfs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class m implements j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements PopLayerComponent.h.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FlatViewGroup f12234a;
        public final /* synthetic */ View b;

        public a(FlatViewGroup flatViewGroup, View view) {
            this.f12234a = flatViewGroup;
            this.b = view;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent.h.c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("beddf223", new Object[]{this});
            } else {
                this.f12234a.removeView(this.b);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
            } else {
                this.f12234a.removeView(this.b);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n f12235a;
        public final /* synthetic */ n b;
        public final /* synthetic */ String c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ Map e;

        public b(n nVar, n nVar2, String str, boolean z, Map map) {
            this.f12235a = nVar;
            this.b = nVar2;
            this.c = str;
            this.d = z;
            this.e = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                m.a(m.this, this.f12235a, this.b, this.c, this.d, this.e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements TNodeView.l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12236a;
        public final /* synthetic */ n b;
        public final /* synthetic */ n c;
        public final /* synthetic */ n d;
        public final /* synthetic */ Map e;

        public c(String str, n nVar, n nVar2, n nVar3, Map map) {
            this.f12236a = str;
            this.b = nVar;
            this.c = nVar2;
            this.d = nVar3;
            this.e = map;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.l
        public void onLayoutCompleted(n nVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e800489", new Object[]{this, nVar});
            } else if (nVar.K() instanceof PopLayerComponent) {
                ((PopLayerComponent) nVar.K()).setSrc(this.f12236a);
                if (nVar.w0().getParent() != null) {
                    ((TNodeView) nVar.w0().getParent()).removeAllViews();
                }
                if (this.b.w0() instanceof FlatViewGroup) {
                    ((PopLayerComponent) nVar.K()).showInTargetView((FlatViewGroup) this.b.w0());
                } else {
                    tfs.f("poplayer targetNode view must be FlatViewGroup");
                }
            } else {
                m.b(m.this, this.c, this.d, this.f12236a, true, this.e, this.b);
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.l
        public void onLayoutError() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("834776a6", new Object[]{this});
            } else {
                m.b(m.this, this.c, this.d, this.f12236a, true, this.e, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements o.w {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n f12237a;
        public final /* synthetic */ String b;
        public final /* synthetic */ n c;

        public d(m mVar, n nVar, String str, n nVar2) {
            this.f12237a = nVar;
            this.b = str;
            this.c = nVar2;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.o.w
        public void b(n nVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d402dbd", new Object[]{this, nVar});
                return;
            }
            Context N = this.f12237a.N();
            if ((!(N instanceof Activity) || !((Activity) N).isFinishing()) && (nVar.K() instanceof PopLayerComponent)) {
                ((PopLayerComponent) nVar.K()).setSrc(this.b);
                n nVar2 = this.c;
                if (nVar2 == null || nVar2.w0() == null) {
                    if (this.f12237a.w0() != null) {
                        ((PopLayerComponent) nVar.K()).show(this.f12237a.w0(), true);
                    }
                } else if (this.c.w0() instanceof FlatViewGroup) {
                    ((PopLayerComponent) nVar.K()).showInTargetView((FlatViewGroup) this.c.w0());
                } else {
                    tfs.f("poplayer targetNode view must be FlatViewGroup");
                }
            }
        }
    }

    static {
        t2o.a(503317111);
        t2o.a(503317092);
    }

    public static /* synthetic */ void a(m mVar, n nVar, n nVar2, String str, boolean z, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddd2fd22", new Object[]{mVar, nVar, nVar2, str, new Boolean(z), map});
        } else {
            mVar.h(nVar, nVar2, str, z, map);
        }
    }

    public static /* synthetic */ void b(m mVar, n nVar, n nVar2, String str, boolean z, Map map, n nVar3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8592d90f", new Object[]{mVar, nVar, nVar2, str, new Boolean(z), map, nVar3});
        } else {
            mVar.i(nVar, nVar2, str, z, map, nVar3);
        }
    }

    public final void c(n nVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d213ecd2", new Object[]{this, nVar, map, new Boolean(z)});
            return;
        }
        String I = nwv.I(map.get("src"), null);
        if (I != null) {
            n L = nVar.L();
            if (((f.h) L.c.g.get(I)) == null) {
                return;
            }
            if (EditTextComponent.isInputMethodShown()) {
                nwv.O(L.N());
                nwv.A0(new b(nVar, L, I, z, map), 500L);
                return;
            }
            h(nVar, L, I, z, map);
        }
    }

    public final void d(n nVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9d6f9a1", new Object[]{this, nVar, str, new Boolean(z)});
        } else if (nVar != null && (nVar.w0() instanceof FlatViewGroup)) {
            FlatViewGroup flatViewGroup = (FlatViewGroup) nVar.w0();
            for (int i = 0; i < flatViewGroup.getChildCount(); i++) {
                View childAt = flatViewGroup.getChildAt(i);
                if (childAt instanceof PopLayerComponent.PopLayerContainerView) {
                    PopLayerComponent.PopLayerContainerView popLayerContainerView = (PopLayerComponent.PopLayerContainerView) childAt;
                    if (TextUtils.equals(str, popLayerContainerView.getSrc())) {
                        if (!z) {
                            flatViewGroup.removeView(childAt);
                        } else {
                            if (!(childAt instanceof PopLayerComponent.PopLayerContainerView)) {
                                flatViewGroup.removeView(childAt);
                            }
                            PopLayerComponent popLayerComponent = (PopLayerComponent) popLayerContainerView.getComponent();
                            if (popLayerComponent == null || popLayerComponent.getPopAnimation() == null) {
                                flatViewGroup.removeView(childAt);
                            } else {
                                popLayerComponent.getPopAnimation().c(childAt, new a(flatViewGroup, childAt));
                            }
                        }
                    }
                }
            }
        }
    }

    public final void i(n nVar, n nVar2, String str, boolean z, Map map, n nVar3) {
        int i;
        Activity k;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ae92b33", new Object[]{this, nVar, nVar2, str, new Boolean(z), map, nVar3});
            return;
        }
        o.y.a aVar = new o.y.a(nVar2.N());
        if (!nwv.o(map.get("fullScreen"), false) || (k = nwv.k(nVar2.N())) == null) {
            i = 0;
        } else {
            i2 = k.getWindow().getDecorView().getHeight();
            aVar.k(i2);
            i = k.getWindow().getDecorView().getWidth();
            aVar.l(i);
        }
        if (i2 <= 0 || i <= 0) {
            int height = nVar2.P().d0().w0().getHeight();
            if (!(nVar2.P().W() instanceof anl)) {
                height = od0.D().f().O(nVar2.N(), height);
            }
            if (nVar3 != null) {
                height = nVar3.S().b;
                i = nVar3.S().f27261a;
                aVar.l(i);
            }
            if (i <= 0 && akt.p2("fixPopLayerWidth", true)) {
                aVar.l(nVar2.P().d0().w0().getWidth());
            }
            aVar.k(height);
        }
        aVar.p(str);
        if (z) {
            if (!(map instanceof JSONObject)) {
                map = JSON.parseObject(JSON.toJSONString(map));
            }
            aVar.n(map);
        } else {
            aVar.n((Map) nVar.H("data"));
        }
        aVar.s(nVar2.W());
        aVar.u(nVar2.f12238a.d);
        aVar.o(nVar2.f12238a.e);
        o.y d2 = aVar.d();
        d2.m = nVar2.P();
        nVar2.P().i1(d2, nVar2.c.g, new d(this, nVar, str, nVar3));
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.j
    public boolean onHandleMessage(n.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e782cf4", new Object[]{this, gVar})).booleanValue();
        }
        return onHandleTNodeMessage(gVar.b, gVar.c, gVar.d, null, gVar.e, gVar.g);
    }

    public final void e(n nVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf565c", new Object[]{this, nVar, map});
        } else {
            d(nVar.P().a0(nwv.t(map.get("target"), 0)), nwv.I(map.get("src"), null), nwv.o(map.get("animated"), false));
        }
    }

    public final void f(n nVar, String str, Map map, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99d13a0c", new Object[]{this, nVar, str, map, new Integer(i)});
        } else if (nwv.o(map.get("singleton"), false)) {
            String I = nwv.I(map.get("url"), "");
            boolean o = nwv.o(map.get("animated"), false);
            String str2 = I + str;
            int b0 = nVar.P().b0(str2);
            if (b0 != 0) {
                d(nVar.P().a0(b0), str, o);
            }
            nVar.P().X0(str2, Integer.valueOf(i));
        }
    }

    public final void h(n nVar, n nVar2, String str, boolean z, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c051dbee", new Object[]{this, nVar, nVar2, str, new Boolean(z), map});
            return;
        }
        int t = nwv.t(map.get("target"), 0);
        f(nVar2, str, map, t);
        n a0 = nVar2.P().a0(t);
        if (a0 != null) {
            g(nVar, nVar2, str, map, a0);
        } else {
            i(nVar, nVar2, str, z, map, null);
        }
    }

    public final void g(n nVar, n nVar2, String str, Map map, n nVar3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c110f896", new Object[]{this, nVar, nVar2, str, map, nVar3});
            return;
        }
        String I = nwv.I(map.get("url"), "");
        if (!TextUtils.isEmpty(I)) {
            o.y.a aVar = new o.y.a(nVar2.N());
            lgs.b f = lgs.f(I);
            if (f == null || !f.g) {
                tfs.d("invalid poplayer url:" + I);
                return;
            }
            Uri uri = f.b;
            String uri2 = uri.toString();
            if (uri2.startsWith("./")) {
                aVar.o(uri2);
            } else {
                String queryParameter = uri.getQueryParameter(gl4.CONFIG_LOCAL_PATH);
                aVar.u(uri2);
                if (!TextUtils.isEmpty(queryParameter)) {
                    aVar.o(queryParameter);
                }
            }
            int i = nVar3.S().b;
            int i2 = nVar3.S().f27261a;
            aVar.p(str);
            aVar.n(!(map instanceof JSONObject) ? JSON.parseObject(JSON.toJSONString(map)) : map);
            aVar.s(nVar2.W());
            TNodeView.create(aVar, nVar2.P(), new c(str, nVar3, nVar, nVar2, map)).prelayout(i2, i);
            return;
        }
        i(nVar, nVar2, str, true, map, nVar3);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.j
    public boolean onHandleTNodeMessage(n nVar, n nVar2, String str, String str2, Map map, hk8 hk8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abab8f80", new Object[]{this, nVar, nVar2, str, str2, map, hk8Var})).booleanValue();
        }
        if (str2 != null && str2.startsWith("$://")) {
            String substring = str2.substring(4);
            int indexOf = substring.indexOf("?");
            if ((indexOf != -1 ? substring.substring(0, indexOf) : substring).equals("poplayer")) {
                JSONObject jSONObject = null;
                if (indexOf != -1) {
                    try {
                        jSONObject = JSON.parseObject((String) eq8.e(null, substring.substring(indexOf + 1), nVar2.c));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                c(nVar2, jSONObject, false);
                return true;
            }
        } else if ("poplayer".equals(str)) {
            c(nVar2, map, true);
            return true;
        } else if ("hidepoplayer".equals(str)) {
            e(nVar2.L(), map);
            return true;
        } else if ("onclose".equals(str)) {
            n g0 = nVar.g0();
            if ("poplayer".equals(g0.r0()) && (g0.K() instanceof PopLayerComponent)) {
                ((PopLayerComponent) g0.K()).dismiss();
                return true;
            }
        }
        return false;
    }
}
