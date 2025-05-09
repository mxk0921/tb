package com.taobao.tao.flexbox.layoutmanager.core;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import java.util.ArrayList;
import java.util.List;
import tb.ags;
import tb.akt;
import tb.bgs;
import tb.cgs;
import tb.dgs;
import tb.dgw;
import tb.egs;
import tb.gfs;
import tb.gpe;
import tb.hfs;
import tb.i5c;
import tb.ifs;
import tb.jfw;
import tb.jgs;
import tb.kgs;
import tb.mfs;
import tb.mgs;
import tb.mx7;
import tb.nwv;
import tb.ol4;
import tb.pfs;
import tb.pg1;
import tb.qy0;
import tb.rbi;
import tb.skg;
import tb.t2o;
import tb.w7l;
import tb.wfs;
import tb.wy0;
import tb.zdu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class b<V, D, P extends jfw> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final b f12204a = new k();
    public static final b b = new t();
    public static final b c = new u();
    public static final b d = new v();
    public static final b e = new w();
    public static final b f = new x();
    public static final b g = new y();
    public static final b h = new z();
    public static final b i = new a0();
    public static final b j = new a();
    public static final b k = new C0691b();
    public static final b l = new c();
    public static final b m = new d();
    public static final b n = new e();
    public static final b o = new f();
    public static final b p = new g();
    public static final b q = new h();
    public static final b r = new i();
    public static final b s = new j();
    public static final b t = new l();
    public static final b u = new m();
    public static final b v = new n();
    public static final b w = new o();
    public static final b x = new p();
    public static final b y = new q();
    public static final b z = new r();
    public static final b A = new s();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a extends b<View, Drawable, jfw> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/core/AttributeHandler$10");
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.b
        public boolean i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("805570d3", new Object[]{this})).booleanValue();
            }
            return true;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.b
        public void j(com.taobao.tao.flexbox.layoutmanager.core.n nVar, jfw jfwVar, String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d67596e5", new Object[]{this, nVar, jfwVar, str, obj});
            } else if (jfwVar != null && nVar != null) {
                jfwVar.C(nVar.N(), obj);
            }
        }

        /* renamed from: l */
        public void c(com.taobao.tao.flexbox.layoutmanager.core.e eVar, View view, jfw jfwVar, n.f fVar) {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7b53bae", new Object[]{this, eVar, view, jfwVar, fVar});
                return;
            }
            Boolean bool = jfwVar.V;
            if (bool != null) {
                if (!bool.booleanValue()) {
                    i = 8;
                }
                view.setVisibility(i);
                return;
            }
            if (!jfwVar.U) {
                i = 8;
            }
            view.setVisibility(i);
        }

        /* renamed from: m */
        public void d(com.taobao.tao.flexbox.layoutmanager.core.e eVar, Drawable[] drawableArr, jfw jfwVar, n.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b33f3ea", new Object[]{this, eVar, drawableArr, jfwVar, fVar});
            } else if (drawableArr != null) {
                for (Drawable drawable : drawableArr) {
                    if (drawable != null) {
                        drawable.setVisible(jfwVar.U, false);
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a0 extends b0<View, jfw> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(a0 a0Var, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/core/AttributeHandler$9");
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.b
        public boolean i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("805570d3", new Object[]{this})).booleanValue();
            }
            return true;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.b
        public void j(com.taobao.tao.flexbox.layoutmanager.core.n nVar, jfw jfwVar, String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d67596e5", new Object[]{this, nVar, jfwVar, str, obj});
            } else if (jfwVar != null && nVar != null) {
                jfwVar.m(nVar.N(), obj);
            }
        }

        /* renamed from: m */
        public void c(com.taobao.tao.flexbox.layoutmanager.core.e eVar, View view, jfw jfwVar, n.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7b53bae", new Object[]{this, eVar, view, jfwVar, fVar});
            } else if (jfwVar.S && jfwVar.W) {
                view.requestFocus();
            }
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.tao.flexbox.layoutmanager.core.b$b  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class C0691b extends b0<View, jfw> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(C0691b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/core/AttributeHandler$11");
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.b
        public boolean i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("805570d3", new Object[]{this})).booleanValue();
            }
            return true;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.b
        public void j(com.taobao.tao.flexbox.layoutmanager.core.n nVar, jfw jfwVar, String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d67596e5", new Object[]{this, nVar, jfwVar, str, obj});
            } else if (jfwVar != null && nVar != null) {
                jfwVar.u(nVar.N(), obj);
            }
        }

        /* renamed from: m */
        public void c(com.taobao.tao.flexbox.layoutmanager.core.e eVar, View view, jfw jfwVar, n.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7b53bae", new Object[]{this, eVar, view, jfwVar, fVar});
            } else {
                view.setEnabled(jfwVar.W);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static abstract class b0<V, P extends jfw> extends b<V, Drawable, P> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(503317009);
        }

        public static /* synthetic */ Object ipc$super(b0 b0Var, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/core/AttributeHandler$ViewAttributeHandler");
        }

        /* renamed from: m */
        public void d(com.taobao.tao.flexbox.layoutmanager.core.e eVar, Drawable[] drawableArr, P p, n.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b33f3ea", new Object[]{this, eVar, drawableArr, p, fVar});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c extends b0<View, jfw> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/core/AttributeHandler$12");
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.b
        public boolean i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("805570d3", new Object[]{this})).booleanValue();
            }
            return true;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.b
        public void j(com.taobao.tao.flexbox.layoutmanager.core.n nVar, jfw jfwVar, String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d67596e5", new Object[]{this, nVar, jfwVar, str, obj});
            } else if (jfwVar != null && nVar != null) {
                jfwVar.D(nVar.N(), obj);
            }
        }

        /* renamed from: m */
        public void c(com.taobao.tao.flexbox.layoutmanager.core.e eVar, View view, jfw jfwVar, n.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7b53bae", new Object[]{this, eVar, view, jfwVar, fVar});
                return;
            }
            int i = jfwVar.f0;
            if (i > 0) {
                view.setZ(i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class d extends b0<View, jfw> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/core/AttributeHandler$13");
        }

        /* renamed from: m */
        public void c(com.taobao.tao.flexbox.layoutmanager.core.e eVar, View view, jfw jfwVar, n.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7b53bae", new Object[]{this, eVar, view, jfwVar, fVar});
                return;
            }
            CharSequence contentDescription = ((Component) eVar).getContentDescription();
            view.setContentDescription(contentDescription);
            if (!TextUtils.isEmpty(contentDescription)) {
                view.setFocusable(true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class e extends b0<View, jfw> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/core/AttributeHandler$14");
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.b
        public boolean i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("805570d3", new Object[]{this})).booleanValue();
            }
            return true;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.b
        public void j(com.taobao.tao.flexbox.layoutmanager.core.n nVar, jfw jfwVar, String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d67596e5", new Object[]{this, nVar, jfwVar, str, obj});
            } else if (jfwVar != null && nVar != null) {
                jfwVar.t(nVar.N(), obj);
            }
        }

        /* renamed from: m */
        public void c(com.taobao.tao.flexbox.layoutmanager.core.e eVar, View view, jfw jfwVar, n.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7b53bae", new Object[]{this, eVar, view, jfwVar, fVar});
            } else if (view instanceof ViewGroup) {
                ((ViewGroup) view).setClipChildren(jfwVar.a0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class f extends b0<View, jfw> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/core/AttributeHandler$15");
        }

        /* renamed from: m */
        public void c(com.taobao.tao.flexbox.layoutmanager.core.e eVar, View view, jfw jfwVar, n.f fVar) {
            zdu f;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7b53bae", new Object[]{this, eVar, view, jfwVar, fVar});
            } else if (view != null && (f = w7l.f(eVar.getTNode(), view.getContext(), eVar.getTNode().H("transform"))) != null) {
                jfw.c a2 = jfw.c.a("transform", jfwVar.r0);
                if (a2 == null || !b.a((Component) eVar)) {
                    if (fVar == null) {
                        fVar = new n.f(false);
                    }
                    qy0 f2 = fVar.f();
                    f2.g.i = f;
                    fVar.b(hfs.d(eVar.getTNode().P(), eVar.getTNode().U(), f2));
                    return;
                }
                n.f b = b.b(fVar);
                qy0 c = a2.c();
                c.g.i = f;
                b.b(hfs.d(eVar.getTNode().P(), eVar.getTNode().U(), c));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class g extends b0<View, jfw> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/core/AttributeHandler$16");
        }

        /* renamed from: m */
        public void c(com.taobao.tao.flexbox.layoutmanager.core.e eVar, View view, jfw jfwVar, n.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7b53bae", new Object[]{this, eVar, view, jfwVar, fVar});
                return;
            }
            b.q.c(eVar, view, jfwVar, fVar);
            b.r.c(eVar, view, jfwVar, fVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class h extends b0<View, jfw> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/core/AttributeHandler$17");
        }

        /* renamed from: m */
        public void c(com.taobao.tao.flexbox.layoutmanager.core.e eVar, View view, jfw jfwVar, n.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7b53bae", new Object[]{this, eVar, view, jfwVar, fVar});
                return;
            }
            jfw.c a2 = jfw.c.a("translate", jfwVar.r0);
            if (a2 == null || !b.a((Component) eVar)) {
                jgs jgsVar = (jgs) eVar.getTNode().m0(22);
                if (jgsVar != null) {
                    if (jgsVar.h().floatValue() != jfwVar.k0) {
                        jgsVar.a().cancel();
                    } else {
                        return;
                    }
                }
                view.setTranslationX(jfwVar.k0);
                return;
            }
            n.f b = b.b(fVar);
            qy0 c = a2.c();
            zdu zduVar = new zdu();
            zduVar.e = new PointF(jfwVar.k0, -2.14748365E9f);
            c.g.i = zduVar;
            b.b(hfs.d(eVar.getTNode().P(), eVar.getTNode().U(), c));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class i extends b0<View, jfw> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/core/AttributeHandler$18");
        }

        /* renamed from: m */
        public void c(com.taobao.tao.flexbox.layoutmanager.core.e eVar, View view, jfw jfwVar, n.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7b53bae", new Object[]{this, eVar, view, jfwVar, fVar});
                return;
            }
            jfw.c a2 = jfw.c.a("translate", jfwVar.r0);
            if (a2 == null || !b.a((Component) eVar)) {
                kgs kgsVar = (kgs) eVar.getTNode().m0(23);
                if (kgsVar != null) {
                    if (kgsVar.h().floatValue() != jfwVar.l0) {
                        kgsVar.a().cancel();
                    } else {
                        return;
                    }
                }
                view.setTranslationY(jfwVar.l0);
                return;
            }
            n.f b = b.b(fVar);
            qy0 c = a2.c();
            zdu zduVar = new zdu();
            zduVar.e = new PointF(-2.14748365E9f, jfwVar.l0);
            c.g.i = zduVar;
            b.b(hfs.d(eVar.getTNode().P(), eVar.getTNode().U(), c));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class j extends b0<View, jfw> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/core/AttributeHandler$19");
        }

        /* renamed from: m */
        public void c(com.taobao.tao.flexbox.layoutmanager.core.e eVar, View view, jfw jfwVar, n.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7b53bae", new Object[]{this, eVar, view, jfwVar, fVar});
                return;
            }
            jfw.c a2 = jfw.c.a("rotate", jfwVar.r0);
            if (a2 == null || !b.a((Component) eVar)) {
                ags agsVar = (ags) eVar.getTNode().m0(17);
                if (agsVar != null) {
                    if (agsVar.h().floatValue() != jfwVar.m0) {
                        agsVar.a().cancel();
                    } else {
                        return;
                    }
                }
                view.setRotation(jfwVar.m0);
                return;
            }
            n.f b = b.b(fVar);
            qy0 c = a2.c();
            zdu zduVar = new zdu();
            zduVar.c = jfwVar.m0;
            c.g.i = zduVar;
            b.b(hfs.d(eVar.getTNode().P(), eVar.getTNode().U(), c));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class l extends b0<View, jfw> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(l lVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/core/AttributeHandler$20");
        }

        /* renamed from: m */
        public void c(com.taobao.tao.flexbox.layoutmanager.core.e eVar, View view, jfw jfwVar, n.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7b53bae", new Object[]{this, eVar, view, jfwVar, fVar});
                return;
            }
            jfw.c a2 = jfw.c.a("rotateX", jfwVar.r0);
            if (a2 == null || !b.a((Component) eVar)) {
                bgs bgsVar = (bgs) eVar.getTNode().m0(18);
                if (bgsVar != null) {
                    if (bgsVar.h().floatValue() != jfwVar.n0) {
                        bgsVar.a().cancel();
                    } else {
                        return;
                    }
                }
                view.setRotationX(jfwVar.n0);
                return;
            }
            n.f b = b.b(fVar);
            qy0 c = a2.c();
            zdu zduVar = new zdu();
            zduVar.f32699a = jfwVar.n0;
            c.g.i = zduVar;
            b.b(hfs.d(eVar.getTNode().P(), eVar.getTNode().U(), c));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class m extends b0<View, jfw> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(m mVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/core/AttributeHandler$21");
        }

        /* renamed from: m */
        public void c(com.taobao.tao.flexbox.layoutmanager.core.e eVar, View view, jfw jfwVar, n.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7b53bae", new Object[]{this, eVar, view, jfwVar, fVar});
                return;
            }
            jfw.c a2 = jfw.c.a("rotateY", jfwVar.r0);
            if (a2 == null || !b.a((Component) eVar)) {
                cgs cgsVar = (cgs) eVar.getTNode().m0(19);
                if (cgsVar != null) {
                    if (cgsVar.h().floatValue() != jfwVar.o0) {
                        cgsVar.a().cancel();
                    } else {
                        return;
                    }
                }
                view.setRotationY(jfwVar.o0);
                return;
            }
            n.f b = b.b(fVar);
            qy0 c = a2.c();
            zdu zduVar = new zdu();
            zduVar.b = jfwVar.o0;
            c.g.i = zduVar;
            b.b(hfs.d(eVar.getTNode().P(), eVar.getTNode().U(), c));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class n extends b0<View, jfw> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(n nVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/core/AttributeHandler$22");
        }

        /* renamed from: m */
        public void c(com.taobao.tao.flexbox.layoutmanager.core.e eVar, View view, jfw jfwVar, n.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7b53bae", new Object[]{this, eVar, view, jfwVar, fVar});
                return;
            }
            b.w.c(eVar, view, jfwVar, fVar);
            b.x.c(eVar, view, jfwVar, fVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class o extends b0<View, jfw> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(o oVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/core/AttributeHandler$23");
        }

        /* renamed from: m */
        public void c(com.taobao.tao.flexbox.layoutmanager.core.e eVar, View view, jfw jfwVar, n.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7b53bae", new Object[]{this, eVar, view, jfwVar, fVar});
                return;
            }
            jfw.c a2 = jfw.c.a("scale", jfwVar.r0);
            if (a2 == null || !b.a((Component) eVar)) {
                dgs dgsVar = (dgs) eVar.getTNode().m0(20);
                if (dgsVar != null) {
                    if (dgsVar.h().floatValue() != jfwVar.p0) {
                        dgsVar.a().cancel();
                    } else {
                        return;
                    }
                }
                view.setScaleX(jfwVar.p0);
                return;
            }
            n.f b = b.b(fVar);
            qy0 c = a2.c();
            zdu zduVar = new zdu();
            zduVar.d = new PointF(jfwVar.p0, -2.14748365E9f);
            c.g.i = zduVar;
            b.b(hfs.d(eVar.getTNode().P(), eVar.getTNode().U(), c));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class p extends b0<View, jfw> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(p pVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/core/AttributeHandler$24");
        }

        /* renamed from: m */
        public void c(com.taobao.tao.flexbox.layoutmanager.core.e eVar, View view, jfw jfwVar, n.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7b53bae", new Object[]{this, eVar, view, jfwVar, fVar});
                return;
            }
            jfw.c a2 = jfw.c.a("scale", jfwVar.r0);
            if (a2 == null || !b.a((Component) eVar)) {
                egs egsVar = (egs) eVar.getTNode().m0(21);
                if (egsVar != null) {
                    if (egsVar.h().floatValue() != jfwVar.q0) {
                        egsVar.a().cancel();
                    } else {
                        return;
                    }
                }
                view.setScaleY(jfwVar.q0);
                return;
            }
            n.f b = b.b(fVar);
            qy0 c = a2.c();
            zdu zduVar = new zdu();
            zduVar.d = new PointF(-2.14748365E9f, jfwVar.q0);
            c.g.i = zduVar;
            b.b(hfs.d(eVar.getTNode().P(), eVar.getTNode().U(), c));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class q extends b0<View, jfw> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(q qVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/core/AttributeHandler$25");
        }

        /* renamed from: m */
        public void c(com.taobao.tao.flexbox.layoutmanager.core.e eVar, View view, jfw jfwVar, n.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7b53bae", new Object[]{this, eVar, view, jfwVar, fVar});
            } else if (view != null && !jfwVar.t0) {
                view.setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_IGNORE);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class r extends b0<View, jfw> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(r rVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/core/AttributeHandler$26");
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.b
        public boolean i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("805570d3", new Object[]{this})).booleanValue();
            }
            return true;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.b
        public void j(com.taobao.tao.flexbox.layoutmanager.core.n nVar, jfw jfwVar, String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d67596e5", new Object[]{this, nVar, jfwVar, str, obj});
            } else if (TextUtils.equals(str, pg1.ATOM_EXT_UDL_box_shadow)) {
                jfwVar.s(nVar.N(), obj);
            }
        }

        /* renamed from: m */
        public void c(com.taobao.tao.flexbox.layoutmanager.core.e eVar, View view, jfw jfwVar, n.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7b53bae", new Object[]{this, eVar, view, jfwVar, fVar});
            } else if (view != null) {
                b.k(view, mx7.d(view.getBackground(), jfwVar));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class s extends b0<View, jfw> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(s sVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/core/AttributeHandler$27");
        }

        /* renamed from: m */
        public void c(com.taobao.tao.flexbox.layoutmanager.core.e eVar, View view, jfw jfwVar, n.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7b53bae", new Object[]{this, eVar, view, jfwVar, fVar});
                return;
            }
            int[] iArr = jfwVar.s0;
            if (iArr != null && (view instanceof i5c)) {
                ((i5c) view).setFading(iArr);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class t extends b<View, Drawable, jfw> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(t tVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/core/AttributeHandler$2");
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.b
        public boolean h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f3c97093", new Object[]{this})).booleanValue();
            }
            return true;
        }

        /* renamed from: l */
        public void c(com.taobao.tao.flexbox.layoutmanager.core.e eVar, View view, jfw jfwVar, n.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7b53bae", new Object[]{this, eVar, view, jfwVar, fVar});
                return;
            }
            rbi measureResult = eVar.getMeasureResult();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.MarginLayoutParams(measureResult.f27261a, measureResult.b);
            } else {
                layoutParams.width = measureResult.f27261a;
                layoutParams.height = measureResult.b;
            }
            view.setLayoutParams(layoutParams);
        }

        /* renamed from: m */
        public void d(com.taobao.tao.flexbox.layoutmanager.core.e eVar, Drawable[] drawableArr, jfw jfwVar, n.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b33f3ea", new Object[]{this, eVar, drawableArr, jfwVar, fVar});
                return;
            }
            rbi measureResult = eVar.getMeasureResult();
            if (drawableArr != null) {
                for (Drawable drawable : drawableArr) {
                    if (drawable != null) {
                        drawable.setBounds(0, 0, measureResult.f27261a, measureResult.b);
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class u extends b<View, Drawable, jfw> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(u uVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/core/AttributeHandler$3");
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.b
        public boolean h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f3c97093", new Object[]{this})).booleanValue();
            }
            return true;
        }

        /* renamed from: l */
        public void c(com.taobao.tao.flexbox.layoutmanager.core.e eVar, View view, jfw jfwVar, n.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7b53bae", new Object[]{this, eVar, view, jfwVar, fVar});
                return;
            }
            rbi measureResult = eVar.getMeasureResult();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.MarginLayoutParams(measureResult.f27261a, measureResult.b);
            } else {
                layoutParams.width = measureResult.f27261a;
                layoutParams.height = measureResult.b;
            }
            view.setLayoutParams(layoutParams);
        }

        /* renamed from: m */
        public void d(com.taobao.tao.flexbox.layoutmanager.core.e eVar, Drawable[] drawableArr, jfw jfwVar, n.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b33f3ea", new Object[]{this, eVar, drawableArr, jfwVar, fVar});
                return;
            }
            rbi measureResult = eVar.getMeasureResult();
            if (drawableArr != null) {
                for (Drawable drawable : drawableArr) {
                    if (drawable != null) {
                        drawable.setBounds(0, 0, measureResult.f27261a, measureResult.b);
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class v extends b0<View, jfw> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(v vVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/core/AttributeHandler$4");
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.b
        public boolean h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f3c97093", new Object[]{this})).booleanValue();
            }
            return true;
        }

        /* renamed from: m */
        public void c(com.taobao.tao.flexbox.layoutmanager.core.e eVar, View view, jfw jfwVar, n.f fVar) {
            qy0 qy0Var;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7b53bae", new Object[]{this, eVar, view, jfwVar, fVar});
            } else if ((eVar instanceof ol4) || (eVar instanceof skg)) {
                view.setPadding(jfwVar.g, jfwVar.i, jfwVar.h, jfwVar.j);
            } else if (eVar instanceof com.taobao.tao.flexbox.layoutmanager.component.e) {
                if (fVar == null) {
                    fVar = new n.f(false);
                }
                jfw.c a2 = b.a((Component) eVar) ? jfw.c.a(pg1.ATOM_EXT_UDL_padding_left, jfwVar.r0) : null;
                if (a2 != null || fVar.e) {
                    if (a2 != null) {
                        qy0Var = a2.c();
                    } else {
                        qy0Var = fVar.f();
                    }
                    wy0 wy0Var = qy0Var.g;
                    wy0Var.h = jfwVar.g;
                    wy0Var.getClass();
                    qy0Var.g.getClass();
                    qy0Var.g.getClass();
                    fVar.b(hfs.d(eVar.getTNode().P(), eVar.getTNode().U(), qy0Var));
                    return;
                }
                wfs wfsVar = (wfs) eVar.getTNode().m0(26);
                if (wfsVar != null) {
                    if (wfsVar.h().intValue() != jfwVar.g) {
                        wfsVar.a().cancel();
                    } else {
                        return;
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                if (viewGroup.getChildCount() > 0) {
                    viewGroup.getChildAt(0).setPadding(jfwVar.g, jfwVar.i, jfwVar.h, jfwVar.j);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class w extends b<View, Drawable, jfw> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements gpe.b {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f12205a;
            public final /* synthetic */ jfw b;

            public a(w wVar, View view, jfw jfwVar) {
                this.f12205a = view;
                this.b = jfwVar;
            }

            @Override // tb.gpe.b
            public void a(Object obj, Drawable drawable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("49f720e8", new Object[]{this, obj, drawable});
                } else {
                    b.k(this.f12205a, drawable);
                }
            }

            @Override // tb.gpe.b
            public void b(Object obj, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7545a341", new Object[]{this, obj, new Integer(i)});
                } else {
                    b.k(this.f12205a, mx7.d(this.f12205a.getBackground(), this.b));
                }
            }
        }

        public static /* synthetic */ Object ipc$super(w wVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/core/AttributeHandler$5");
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.b
        public boolean i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("805570d3", new Object[]{this})).booleanValue();
            }
            return true;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
            if (r9.equals(tb.pg1.ATOM_EXT_UDL_background_image) == false) goto L_0x0031;
         */
        @Override // com.taobao.tao.flexbox.layoutmanager.core.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void j(com.taobao.tao.flexbox.layoutmanager.core.n r7, tb.jfw r8, java.lang.String r9, java.lang.Object r10) {
            /*
                r6 = this;
                r0 = 2
                r1 = 1
                r2 = 0
                com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.tao.flexbox.layoutmanager.core.b.w.$ipChange
                boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r4 == 0) goto L_0x001e
                java.lang.String r4 = "d67596e5"
                r5 = 5
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r5[r2] = r6
                r5[r1] = r7
                r5[r0] = r8
                r7 = 3
                r5[r7] = r9
                r7 = 4
                r5[r7] = r10
                r3.ipc$dispatch(r4, r5)
                return
            L_0x001e:
                if (r10 == 0) goto L_0x0060
                if (r7 == 0) goto L_0x0060
                android.content.Context r7 = r7.N()
                r9.hashCode()
                r3 = -1
                int r4 = r9.hashCode()
                switch(r4) {
                    case -1332194002: goto L_0x0047;
                    case 605322756: goto L_0x003c;
                    case 610793468: goto L_0x0033;
                    default: goto L_0x0031;
                }
            L_0x0031:
                r0 = -1
                goto L_0x0051
            L_0x0033:
                java.lang.String r1 = "background-image"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x0051
                goto L_0x0031
            L_0x003c:
                java.lang.String r0 = "background-color"
                boolean r9 = r9.equals(r0)
                if (r9 != 0) goto L_0x0045
                goto L_0x0031
            L_0x0045:
                r0 = 1
                goto L_0x0051
            L_0x0047:
                java.lang.String r0 = "background"
                boolean r9 = r9.equals(r0)
                if (r9 != 0) goto L_0x0050
                goto L_0x0031
            L_0x0050:
                r0 = 0
            L_0x0051:
                switch(r0) {
                    case 0: goto L_0x005d;
                    case 1: goto L_0x0059;
                    case 2: goto L_0x0055;
                    default: goto L_0x0054;
                }
            L_0x0054:
                goto L_0x0060
            L_0x0055:
                r8.p(r7, r10)
                goto L_0x0060
            L_0x0059:
                r8.o(r7, r10)
                goto L_0x0060
            L_0x005d:
                r8.n(r7, r10)
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.core.b.w.j(com.taobao.tao.flexbox.layoutmanager.core.n, tb.jfw, java.lang.String, java.lang.Object):void");
        }

        /* renamed from: l */
        public void c(com.taobao.tao.flexbox.layoutmanager.core.e eVar, View view, jfw jfwVar, n.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7b53bae", new Object[]{this, eVar, view, jfwVar, fVar});
                return;
            }
            rbi measureResult = eVar.getMeasureResult();
            Object obj = jfwVar.I;
            if (obj != null) {
                ((Component) eVar).setBackgroundTask(gpe.f(null, eVar.getTNode().P(), jfwVar.I, measureResult.f27261a, measureResult.b, ImageLoader.b.e("background", eVar.getTNode()), jfwVar.g0, false, new a(this, view, jfwVar)));
            } else if (obj == null) {
                jfw.c a2 = jfw.c.a("background", jfwVar.r0);
                if (a2 == null || !b.a((Component) eVar)) {
                    ifs ifsVar = (ifs) eVar.getTNode().m0(9);
                    if (ifsVar != null) {
                        if (ifsVar.h().intValue() != jfwVar.E) {
                            ifsVar.a().cancel();
                        } else {
                            return;
                        }
                    }
                    b.k(view, mx7.d(view.getBackground(), jfwVar));
                    return;
                }
                n.f b = b.b(fVar);
                qy0 c = a2.c();
                c.g.f = jfwVar.E;
                b.b(hfs.d(eVar.getTNode().P(), eVar.getTNode().U(), c));
            }
        }

        /* renamed from: m */
        public void d(com.taobao.tao.flexbox.layoutmanager.core.e eVar, Drawable[] drawableArr, jfw jfwVar, n.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b33f3ea", new Object[]{this, eVar, drawableArr, jfwVar, fVar});
            } else if (akt.w1() && drawableArr != null && drawableArr.length > 0) {
                Drawable drawable = drawableArr[0];
                Drawable d = mx7.d(drawable, jfwVar);
                drawableArr[0] = d;
                if (drawable != d && (eVar instanceof com.taobao.tao.flexbox.layoutmanager.core.c)) {
                    ((com.taobao.tao.flexbox.layoutmanager.core.c) eVar).updateDrawable(true);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class x extends b<View, Drawable, jfw> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(x xVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/core/AttributeHandler$6");
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.b
        public boolean i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("805570d3", new Object[]{this})).booleanValue();
            }
            return true;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.b
        public void j(com.taobao.tao.flexbox.layoutmanager.core.n nVar, jfw jfwVar, String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d67596e5", new Object[]{this, nVar, jfwVar, str, obj});
            } else if (obj != null && nVar != null) {
                Context N = nVar.N();
                str.hashCode();
                if (str.equals("foreground-color")) {
                    jfwVar.w(N, obj);
                }
            }
        }

        /* renamed from: l */
        public void c(com.taobao.tao.flexbox.layoutmanager.core.e eVar, View view, jfw jfwVar, n.f fVar) {
            Drawable foreground;
            Drawable foreground2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7b53bae", new Object[]{this, eVar, view, jfwVar, fVar});
            } else if (Build.VERSION.SDK_INT >= 23 && !(eVar instanceof com.taobao.tao.flexbox.layoutmanager.component.a)) {
                foreground = view.getForeground();
                Drawable f = mx7.f(foreground, jfwVar);
                foreground2 = view.getForeground();
                if (f != foreground2) {
                    view.setForeground(f);
                }
            }
        }

        /* renamed from: m */
        public void d(com.taobao.tao.flexbox.layoutmanager.core.e eVar, Drawable[] drawableArr, jfw jfwVar, n.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b33f3ea", new Object[]{this, eVar, drawableArr, jfwVar, fVar});
            } else if (akt.w1() && drawableArr != null && drawableArr.length > 2) {
                Drawable drawable = drawableArr[2];
                Drawable f = mx7.f(drawable, jfwVar);
                drawableArr[2] = f;
                if (drawable != f && (eVar instanceof com.taobao.tao.flexbox.layoutmanager.core.c)) {
                    ((com.taobao.tao.flexbox.layoutmanager.core.c) eVar).updateDrawable(true);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class y extends b<View, Drawable, jfw> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(y yVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/core/AttributeHandler$7");
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.b
        public boolean i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("805570d3", new Object[]{this})).booleanValue();
            }
            return true;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.b
        public void j(com.taobao.tao.flexbox.layoutmanager.core.n nVar, jfw jfwVar, String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d67596e5", new Object[]{this, nVar, jfwVar, str, obj});
            } else if (obj != null && nVar != null) {
                jfwVar.q(nVar.N(), str, obj);
            }
        }

        /* renamed from: l */
        public void c(com.taobao.tao.flexbox.layoutmanager.core.e eVar, View view, jfw jfwVar, n.f fVar) {
            jfw.c cVar;
            qy0 qy0Var;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7b53bae", new Object[]{this, eVar, view, jfwVar, fVar});
                return;
            }
            if (fVar == null) {
                fVar = new n.f(false);
            }
            if (b.a((Component) eVar)) {
                cVar = jfw.c.a(pg1.ATOM_EXT_UDL_border_radius, jfwVar.r0);
            } else {
                cVar = null;
            }
            if (cVar != null || fVar.e) {
                if (cVar != null) {
                    qy0Var = cVar.c();
                } else {
                    qy0Var = fVar.f();
                }
                qy0Var.g.g = jfwVar.J;
                fVar.b(hfs.d(eVar.getTNode().P(), eVar.getTNode().U(), qy0Var));
                return;
            }
            mfs mfsVar = (mfs) eVar.getTNode().m0(24);
            if (mfsVar != null) {
                if (mfsVar.h().floatValue() != jfwVar.J) {
                    mfsVar.a().cancel();
                } else {
                    return;
                }
            }
            b.e.c(eVar, view, jfwVar, fVar);
            b.f.c(eVar, view, jfwVar, fVar);
        }

        /* renamed from: m */
        public void d(com.taobao.tao.flexbox.layoutmanager.core.e eVar, Drawable[] drawableArr, jfw jfwVar, n.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b33f3ea", new Object[]{this, eVar, drawableArr, jfwVar, fVar});
            } else if (akt.w1()) {
                b.e.d(eVar, drawableArr, jfwVar, fVar);
                b.f.d(eVar, drawableArr, jfwVar, fVar);
            }
        }
    }

    static {
        t2o.a(503316980);
    }

    public static /* synthetic */ boolean a(Component component) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a613d278", new Object[]{component})).booleanValue();
        }
        return e(component);
    }

    public static /* synthetic */ n.f b(n.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n.f) ipChange.ipc$dispatch("9064803e", new Object[]{fVar});
        }
        return f(fVar);
    }

    public static boolean e(Component component) {
        boolean z2;
        Component component2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a243354", new Object[]{component})).booleanValue();
        }
        View view = component.getView();
        if (view == null || view.getParent() == null) {
            z2 = false;
        } else {
            z2 = view.isAttachedToWindow();
        }
        Component.j peekHostViewComponent = component.peekHostViewComponent();
        if (!component.node.B0() || component.initRender || !z2 || peekHostViewComponent == null || (component2 = peekHostViewComponent.f12191a) == null || !component2.isTransitionChildComponent(component)) {
            return false;
        }
        return true;
    }

    public static n.f f(n.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n.f) ipChange.ipc$dispatch("b036a2e6", new Object[]{fVar});
        }
        if (fVar == null) {
            return new n.f(true);
        }
        return fVar;
    }

    public static void k(View view, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("641cade1", new Object[]{view, drawable});
        } else if (view == null) {
        } else {
            if (nwv.g0()) {
                view.setBackgroundDrawable(drawable);
            } else if (drawable != view.getBackground()) {
                view.setBackground(drawable);
            }
        }
    }

    public abstract void c(com.taobao.tao.flexbox.layoutmanager.core.e eVar, V v2, P p2, n.f fVar);

    public abstract void d(com.taobao.tao.flexbox.layoutmanager.core.e eVar, D[] dArr, P p2, n.f fVar);

    public String[] g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("55f1bbd6", new Object[]{this});
        }
        return null;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3c97093", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("805570d3", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void j(com.taobao.tao.flexbox.layoutmanager.core.n nVar, P p2, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d67596e5", new Object[]{this, nVar, p2, str, obj});
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class k extends b<View, Drawable, jfw> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/core/AttributeHandler$1");
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.b
        public boolean h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f3c97093", new Object[]{this})).booleanValue();
            }
            return true;
        }

        /* renamed from: l */
        public void c(com.taobao.tao.flexbox.layoutmanager.core.e eVar, View view, jfw jfwVar, n.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7b53bae", new Object[]{this, eVar, view, jfwVar, fVar});
                return;
            }
            Component component = (Component) eVar;
            n(component, view, jfwVar, fVar);
            o(component, view, jfwVar, fVar);
        }

        /* renamed from: m */
        public void d(com.taobao.tao.flexbox.layoutmanager.core.e eVar, Drawable[] drawableArr, jfw jfwVar, n.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b33f3ea", new Object[]{this, eVar, drawableArr, jfwVar, fVar});
                return;
            }
            rbi measureResult = eVar.getMeasureResult();
            if (drawableArr != null) {
                for (Drawable drawable : drawableArr) {
                    if (drawable != null) {
                        drawable.setBounds(0, 0, measureResult.f27261a, measureResult.b);
                    }
                }
            }
        }

        public final void n(Component component, View view, jfw jfwVar, n.f fVar) {
            boolean z = true;
            z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7df59340", new Object[]{this, component, view, jfwVar, fVar});
                return;
            }
            Component.j peekHostViewComponent = component.peekHostViewComponent();
            rbi rbiVar = peekHostViewComponent != null ? peekHostViewComponent.b : null;
            if (rbiVar != null) {
                if (jfwVar.r0 == null || !b.a(component)) {
                    z = false;
                } else {
                    jfw.c a2 = jfw.c.a("left", jfwVar.r0);
                    if (!(a2 == null || view.getLeft() == rbiVar.c)) {
                        component.setAnimationLeft(view.getLeft());
                        AnimatorSet f = hfs.f(component.getTNode().P(), component.getTNode().U(), a2.c(), hfs.f.a(rbiVar.c, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE));
                        fVar = b.b(fVar);
                        fVar.b(f);
                        z = true;
                    }
                    jfw.c a3 = jfw.c.a("right", jfwVar.r0);
                    if (!(a3 == null || view.getRight() == rbiVar.c + rbiVar.f27261a)) {
                        component.setAnimationRight(view.getRight());
                        AnimatorSet f2 = hfs.f(component.getTNode().P(), component.getTNode().U(), a3.c(), hfs.f.a(Integer.MIN_VALUE, Integer.MIN_VALUE, rbiVar.c + rbiVar.f27261a, Integer.MIN_VALUE));
                        fVar = b.b(fVar);
                        fVar.b(f2);
                        z = true;
                    }
                    jfw.c a4 = jfw.c.a("top", jfwVar.r0);
                    if (!(a4 == null || view.getTop() == rbiVar.d)) {
                        component.setAnimationTop(view.getTop());
                        AnimatorSet f3 = hfs.f(component.getTNode().P(), component.getTNode().U(), a4.c(), hfs.f.a(Integer.MIN_VALUE, rbiVar.d, Integer.MIN_VALUE, Integer.MIN_VALUE));
                        fVar = b.b(fVar);
                        fVar.b(f3);
                        z = true;
                    }
                    jfw.c a5 = jfw.c.a("bottom", jfwVar.r0);
                    if (a5 != null && view.getBottom() != rbiVar.d + rbiVar.b) {
                        component.setAnimationBottom(view.getBottom());
                        AnimatorSet f4 = hfs.f(component.getTNode().P(), component.getTNode().U(), a5.c(), hfs.f.a(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, rbiVar.d + rbiVar.b));
                        fVar = b.b(fVar);
                        fVar.b(f4);
                    }
                }
                if (!z && fVar != null && fVar.e && peekHostViewComponent.f12191a != null && view.getParent() == peekHostViewComponent.f12191a.getView()) {
                    if (view.getLeft() != rbiVar.c || view.getTop() != rbiVar.d) {
                        if (view.getLeft() != rbiVar.c) {
                            component.setAnimationLeft(view.getLeft());
                        }
                        if (view.getTop() != rbiVar.d) {
                            component.setAnimationTop(view.getTop());
                        }
                        fVar.b(hfs.f(component.getTNode().P(), component.getTNode().U(), fVar.f(), hfs.f.a(rbiVar.c, rbiVar.d, Integer.MIN_VALUE, Integer.MIN_VALUE)));
                    }
                }
            }
        }

        public final void o(Component component, View view, jfw jfwVar, n.f fVar) {
            boolean z = true;
            z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea15b698", new Object[]{this, component, view, jfwVar, fVar});
                return;
            }
            rbi measureResult = component.getMeasureResult();
            int i = measureResult.f27261a;
            int i2 = measureResult.b;
            boolean z2 = fVar != null && fVar.e;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.MarginLayoutParams(i, i2);
            } else {
                layoutParams.width = i;
                layoutParams.height = i2;
            }
            if (jfwVar.r0 != null && b.a(component)) {
                jfw.c a2 = jfw.c.a("width", jfwVar.r0);
                if (a2 != null) {
                    int width = view.getWidth();
                    layoutParams.width = width;
                    layoutParams.height = i2;
                    component.setAnimationWidth(width);
                    qy0 c = a2.c();
                    c.g.f31007a = i;
                    AnimatorSet d = hfs.d(component.getTNode().P(), component.getTNode().U(), c);
                    fVar = b.b(fVar);
                    fVar.b(d);
                    z = true;
                }
                jfw.c a3 = jfw.c.a("height", jfwVar.r0);
                if (a3 != null) {
                    layoutParams.width = a2 != null ? view.getWidth() : i;
                    int height = view.getHeight();
                    layoutParams.height = height;
                    component.setAnimationHeight(height);
                    qy0 c2 = a3.c();
                    c2.g.b = i2;
                    AnimatorSet d2 = hfs.d(component.getTNode().P(), component.getTNode().U(), c2);
                    fVar = b.b(fVar);
                    fVar.b(d2);
                    z = true;
                }
            }
            if (z2 && !z) {
                if (view.getWidth() != i) {
                    int width2 = view.getWidth();
                    layoutParams.width = width2;
                    component.setAnimationWidth(width2);
                    z = true;
                }
                if (view.getHeight() != i2) {
                    int height2 = view.getHeight();
                    layoutParams.height = height2;
                    component.setAnimationHeight(height2);
                }
                n.f b = b.b(fVar);
                qy0 f = b.f();
                wy0 wy0Var = f.g;
                wy0Var.f31007a = i;
                wy0Var.b = i2;
                b.b(hfs.d(component.getTNode().P(), component.getTNode().U(), f));
            }
            if (!z) {
                mgs mgsVar = (mgs) component.getTNode().m0(11);
                if (mgsVar != null) {
                    if (mgsVar.h().intValue() == i) {
                        layoutParams.width = view.getWidth();
                    } else {
                        mgsVar.a().cancel();
                    }
                }
                pfs pfsVar = (pfs) component.getTNode().m0(12);
                if (pfsVar != null) {
                    if (pfsVar.h().intValue() == i2) {
                        layoutParams.height = view.getHeight();
                    } else {
                        pfsVar.a().cancel();
                    }
                }
            }
            view.setLayoutParams(layoutParams);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class z extends b<View, Drawable, jfw> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(z zVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/core/AttributeHandler$8");
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.b
        public boolean i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("805570d3", new Object[]{this})).booleanValue();
            }
            return true;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.b
        public void j(com.taobao.tao.flexbox.layoutmanager.core.n nVar, jfw jfwVar, String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d67596e5", new Object[]{this, nVar, jfwVar, str, obj});
            } else if (jfwVar != null && nVar != null) {
                jfwVar.x(nVar.N(), obj);
            }
        }

        /* renamed from: m */
        public void d(com.taobao.tao.flexbox.layoutmanager.core.e eVar, Drawable[] drawableArr, jfw jfwVar, n.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b33f3ea", new Object[]{this, eVar, drawableArr, jfwVar, fVar});
            } else if (drawableArr != null) {
                int i = (int) (jfwVar.T * 255.0f);
                for (Drawable drawable : drawableArr) {
                    if (drawable != null) {
                        drawable.setAlpha(i);
                    }
                }
            }
        }

        /* renamed from: l */
        public void c(com.taobao.tao.flexbox.layoutmanager.core.e eVar, View view, jfw jfwVar, n.f fVar) {
            qy0 qy0Var;
            List<com.taobao.tao.flexbox.layoutmanager.core.n> b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7b53bae", new Object[]{this, eVar, view, jfwVar, fVar});
                return;
            }
            float f = jfwVar.T;
            jfw.c cVar = null;
            if (eVar instanceof Component) {
                Component component = (Component) eVar;
                View.OnClickListener componentClickListener = component.getComponentClickListener();
                View.OnTouchListener componentTouchListener = component.getComponentTouchListener();
                if (componentTouchListener != null) {
                    if (f == 0.0f) {
                        componentTouchListener = null;
                    }
                    ViewProxy.setOnTouchListener(view, componentTouchListener);
                } else if (componentClickListener != null) {
                    int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                    if (i == 0) {
                        componentClickListener = null;
                    }
                    ViewProxy.setOnClickListener(view, componentClickListener);
                    view.setClickable(i != 0);
                }
            }
            if (fVar == null) {
                fVar = new n.f(false);
            }
            if (b.a((Component) eVar)) {
                cVar = jfw.c.a("opacity", jfwVar.r0);
            }
            if (cVar != null || fVar.e) {
                if (cVar != null) {
                    qy0Var = cVar.c();
                } else {
                    qy0Var = fVar.f();
                }
                qy0Var.g.e = f;
                fVar.b(hfs.d(eVar.getTNode().P(), eVar.getTNode().U(), qy0Var));
                return;
            }
            gfs gfsVar = (gfs) eVar.getTNode().m0(10);
            if (gfsVar != null) {
                if (gfsVar.h().floatValue() != f) {
                    gfsVar.a().cancel();
                } else {
                    return;
                }
            }
            if (akt.g()) {
                List<com.taobao.tao.flexbox.layoutmanager.core.n> b2 = com.taobao.tao.flexbox.layoutmanager.core.q.b(eVar.getTNode(), f, true);
                if (b2 == null || b2.isEmpty()) {
                    Component component2 = (Component) eVar;
                    if (!(component2.getComponentAlpha() == 1.0f || (b = com.taobao.tao.flexbox.layoutmanager.core.q.b(eVar.getTNode(), f, false)) == null || b.isEmpty())) {
                        ArrayList arrayList = new ArrayList();
                        for (com.taobao.tao.flexbox.layoutmanager.core.n nVar : b) {
                            arrayList.addAll(com.taobao.tao.flexbox.layoutmanager.core.q.t(nVar, component2.getNode()));
                        }
                        component2.setComponentAlpha(true, 1.0f, arrayList);
                    }
                    view.setAlpha(f);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                for (com.taobao.tao.flexbox.layoutmanager.core.n nVar2 : b2) {
                    arrayList2.addAll(com.taobao.tao.flexbox.layoutmanager.core.q.t(nVar2, ((Component) eVar).getNode()));
                }
                ((Component) eVar).setComponentAlpha(true, f, arrayList2);
                return;
            }
            view.setAlpha(f);
        }
    }
}
