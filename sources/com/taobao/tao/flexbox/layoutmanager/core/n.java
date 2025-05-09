package com.taobao.tao.flexbox.layoutmanager.core;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.IPage;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.component.RichTextContainerComponent;
import com.taobao.tao.flexbox.layoutmanager.core.d;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.weex.common.Constants;
import com.taobao.weex.ui.component.WXBasicComponentType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import tb.a5k;
import tb.akt;
import tb.fj8;
import tb.hfs;
import tb.hk8;
import tb.hqq;
import tb.igs;
import tb.iqs;
import tb.nwv;
import tb.ol4;
import tb.piw;
import tb.qy0;
import tb.rbi;
import tb.skg;
import tb.t2o;
import tb.tfs;
import tb.w7l;
import tb.wwd;
import tb.wy0;
import tb.xml;
import tb.yx9;
import tb.zr7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class n {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int LAYOUT_STEP_FINISH = 2;
    public static final int LAYOUT_STEP_INIT = 0;
    public static final int LAYOUT_STEP_ON_LAYOUT = 1;
    public static final int TAG_ANIMATION_BACKGROUND = 9;
    public static final int TAG_ANIMATION_BOTTOM = 16;
    public static final int TAG_ANIMATION_CORNERS = 24;
    public static final int TAG_ANIMATION_HEIGHT = 12;
    public static final int TAG_ANIMATION_LEFT = 13;
    public static final int TAG_ANIMATION_OPACITY = 10;
    public static final int TAG_ANIMATION_PADDING_LEFT = 26;
    public static final int TAG_ANIMATION_PIVOT = 25;
    public static final int TAG_ANIMATION_RIGHT = 14;
    public static final int TAG_ANIMATION_ROTATION = 17;
    public static final int TAG_ANIMATION_ROTATION_X = 18;
    public static final int TAG_ANIMATION_ROTATION_Y = 19;
    public static final int TAG_ANIMATION_SCALE_X = 20;
    public static final int TAG_ANIMATION_SCALE_Y = 21;
    public static final int TAG_ANIMATION_TOP = 15;
    public static final int TAG_ANIMATION_TRANSLATION_X = 22;
    public static final int TAG_ANIMATION_TRANSLATION_Y = 23;
    public static final int TAG_ANIMATION_WIDTH = 11;
    public static final int TAG_CONTAINER_MESSAGE_HANDLER = 202;
    public static final int TAG_CURRENT_EXPOSURE_NUM = 0;
    public static final int TAG_DRAGGABLE_LISTENER = 2;
    public static final int TAG_IN_FULL_LAYOUT = 200;
    public static final int TAG_IS_PAGE_APPEAR = 7;
    public static final int TAG_LAYOUT_STRATEGY = 100;
    public static final int TAG_PAGE_APPEAR = 3;
    public static final int TAG_PAGE_APPEAR_NUM = 5;
    public static final int TAG_PAGE_APPEAR_TIME = 6;
    public static final int TAG_PAGE_COMPANION = 101;
    public static final int TAG_PAGE_NAME = 1;
    public static final int TAG_PAGE_PROPERTY = 4;
    public static final int TAG_PENDING_FULL_LAYOUT_INFO = 201;
    public static final int TAG_TAB2_APM_FIRSTFRAME_FLAG = 203;
    public static final int TAG_TAB2_APM_FIRSTFRAME_TIME = 204;
    public static final int TAG_VIEW_APPEAR = 8;

    /* renamed from: a  reason: collision with root package name */
    public final o.y f12238a;
    public final n b;
    public final r c;
    public final List<n> d;
    public HashMap<String, Object> e;
    public Component f;
    public int g;
    public final String h;
    public Object i;
    public SparseArray<Object> j;
    public Map k;
    public HashMap<String, Object> l;
    public String o;
    public IPage p;
    public List<fj8> q;
    public f r;
    public i t;
    public final o.t u;
    public TNodeView v;
    public HashMap<String, hk8> y;
    public static final boolean z = akt.p0();
    public static final AtomicInteger A = new AtomicInteger(0);
    public boolean m = false;
    public boolean n = false;
    public boolean s = true;
    public volatile int w = 0;
    public int x = 6;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements d.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e9f00b2a", new Object[]{this});
            } else {
                igs.c();
            }
        }

        public void b(Component component) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("12c88046", new Object[]{this, component});
                return;
            }
            n nVar = n.this;
            nVar.f = component;
            if (component != null) {
                component.onCreate(nVar);
            }
            n.a(n.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f12240a;

        public b(Context context) {
            this.f12240a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            igs.a("onPrepareComponent");
            n.this.f.onPrepareComponent(this.f12240a);
            igs.c();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n f12241a;

        public c(n nVar) {
            this.f12241a = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (n.this.K().sendViewAppearForAdd(this.f12241a)) {
                this.f12241a.e1();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public String f12242a;
        public String b;
        public String c;

        static {
            t2o.a(503317123);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface e<T> {
        boolean a(T t);

        boolean b(T t);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class f {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int DEFAULT_DURATION = 300;

        /* renamed from: a  reason: collision with root package name */
        public final d.j f12243a;
        public d.k b;
        public boolean c;
        public final boolean d;
        public final boolean e;
        public final int f;
        public final String g;
        public final String h;
        public AnimatorSet i;
        public List<Animator> j;
        public ValueAnimator k;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements hfs.c {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // tb.hfs.c
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("be8bae45", new Object[]{this});
                } else {
                    f.a(f.this);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    f.a(f.this);
                }
            }
        }

        static {
            t2o.a(503317125);
        }

        public f(boolean z) {
            this.e = z;
            this.f = z ? 300 : 0;
            this.g = null;
            this.h = Constants.TimeFunction.EASE;
            this.d = true;
        }

        public static /* synthetic */ void a(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("febc0166", new Object[]{fVar});
            } else {
                fVar.c();
            }
        }

        public void b(AnimatorSet animatorSet) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f43d1a7", new Object[]{this, animatorSet});
            } else if (this.d || this.c) {
                animatorSet.start();
            } else if (animatorSet != null && !animatorSet.getChildAnimations().isEmpty()) {
                if (this.j == null) {
                    this.j = new ArrayList();
                }
                this.j.add(animatorSet);
            }
        }

        public final void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e77d7140", new Object[]{this});
                return;
            }
            d.k kVar = this.b;
            if (kVar != null) {
                kVar.a(this.f12243a, new JSONObject());
                this.b = null;
            }
        }

        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("579958c9", new Object[]{this});
            } else if (!this.c) {
                this.c = true;
                List<Animator> list = this.j;
                if (list == null || ((ArrayList) list).isEmpty()) {
                    nwv.A0(new b(), this.f);
                    return;
                }
                AnimatorSet animatorSet = new AnimatorSet();
                this.i = animatorSet;
                animatorSet.playTogether(this.j);
                new hfs.d(new a()).a(this.i, 0);
                this.i.start();
            }
        }

        public qy0 f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qy0) ipChange.ipc$dispatch("11b0f79b", new Object[]{this});
            }
            qy0 qy0Var = new qy0();
            qy0Var.f26995a = this.f;
            qy0Var.e = w7l.a(this.h);
            qy0Var.g = new wy0();
            return qy0Var;
        }

        public ValueAnimator d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ValueAnimator) ipChange.ipc$dispatch("6d97b4ad", new Object[]{this});
            }
            if (!TextUtils.equals("shareAnimator", this.g)) {
                return ValueAnimator.ofFloat(0.0f, 1.0f);
            }
            if (this.k == null) {
                this.k = ValueAnimator.ofFloat(0.0f, 1.0f);
            }
            return this.k;
        }

        public f(d.j jVar, Map map) {
            int i = 0;
            if (map != null) {
                boolean o = nwv.o(map.get("animated"), false);
                this.e = o;
                this.f = o ? nwv.t(map.get("duration"), 300) : i;
                this.g = nwv.I(map.get("mode"), null);
                this.h = nwv.I(map.get("type"), Constants.TimeFunction.EASE);
            } else {
                this.e = false;
                this.f = 0;
                this.g = null;
                this.h = Constants.TimeFunction.EASE;
            }
            this.f12243a = jVar;
            if (jVar != null) {
                this.b = jVar.c;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class g {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static g h;
        public static int i = 0;

        /* renamed from: a  reason: collision with root package name */
        public g f12246a;
        public n b;
        public n c;
        public String d;
        public Map e;
        public a f;
        public hk8 g;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public static class a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public int f12247a;

            static {
                t2o.a(503317129);
            }

            public a(int i) {
                this.f12247a = i;
            }

            public static /* synthetic */ boolean a(a aVar, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("41bf7254", new Object[]{aVar, new Integer(i)})).booleanValue();
                }
                return aVar.e(i);
            }

            public static /* synthetic */ void b(a aVar, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7070dc6f", new Object[]{aVar, new Integer(i)});
                } else {
                    aVar.d(i);
                }
            }

            public static /* synthetic */ void c(a aVar, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9f22468e", new Object[]{aVar, new Integer(i)});
                } else {
                    aVar.f(i);
                }
            }

            public final void d(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9ba60fcf", new Object[]{this, new Integer(i)});
                } else {
                    this.f12247a = i | this.f12247a;
                }
            }

            public final boolean e(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("63211dfa", new Object[]{this, new Integer(i)})).booleanValue();
                }
                if ((i & this.f12247a) != 0) {
                    return true;
                }
                return false;
            }

            public final void f(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("21babf4c", new Object[]{this, new Integer(i)});
                } else {
                    this.f12247a = (~i) & this.f12247a;
                }
            }
        }

        static {
            t2o.a(503317128);
        }

        public static g c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g) ipChange.ipc$dispatch("6e37fc73", new Object[0]);
            }
            g gVar = h;
            if (gVar == null) {
                return new g();
            }
            h = gVar.f12246a;
            gVar.f12246a = null;
            i--;
            return gVar;
        }

        public static g d(g gVar, n nVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g) ipChange.ipc$dispatch("d8aba402", new Object[]{gVar, nVar});
            }
            g c = c();
            c.b = gVar.b;
            c.c = nVar;
            c.d = gVar.d;
            c.e = gVar.e;
            c.f = gVar.f;
            c.g = gVar.g;
            return c;
        }

        public static g e(n nVar, n nVar2, String str, Map map, int i2, hk8 hk8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g) ipChange.ipc$dispatch("47c9a585", new Object[]{nVar, nVar2, str, map, new Integer(i2), hk8Var});
            }
            g c = c();
            c.b = nVar;
            c.c = nVar2;
            c.d = str;
            if (map == null) {
                map = new HashMap();
            }
            c.e = map;
            c.f = new a(i2);
            c.g = hk8Var;
            return c;
        }

        public void a(int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ba60fcf", new Object[]{this, new Integer(i2)});
            } else {
                a.b(this.f, i2);
            }
        }

        public boolean b(int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("63211dfa", new Object[]{this, new Integer(i2)})).booleanValue();
            }
            return a.a(this.f, i2);
        }

        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51af759a", new Object[]{this});
                return;
            }
            this.b = null;
            this.c = null;
            this.f = null;
            this.e = null;
            this.d = null;
            this.g = null;
            int i2 = i;
            if (i2 < 5) {
                this.f12246a = h;
                h = this;
                i = i2 + 1;
            }
        }

        public void g(int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("21babf4c", new Object[]{this, new Integer(i2)});
            } else {
                a.c(this.f, i2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface h {
        boolean a();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class i {

        /* renamed from: a  reason: collision with root package name */
        public final String f12248a;
        public final boolean b;

        static {
            t2o.a(503317131);
        }

        public i(String str, boolean z) {
            this.f12248a = str;
            this.b = z;
        }
    }

    static {
        t2o.a(503317118);
        t2o.a(503317182);
    }

    public n(o.y yVar, r rVar, n nVar) {
        int incrementAndGet = A.incrementAndGet();
        this.g = incrementAndGet;
        yVar.m.P0(incrementAndGet, this);
        this.f12238a = yVar;
        this.c = rVar;
        this.b = nVar;
        if (rVar != null) {
            n nVar2 = rVar.f;
            if (nVar2 == null || nVar2 != this) {
                rVar.f = this;
            }
            o oVar = rVar.f12286a;
            if (oVar == null || oVar != yVar.m) {
                rVar.f12286a = yVar.m;
            }
        }
        this.d = new ArrayList();
        this.e = new HashMap<>();
        if (z) {
            if (nVar == null) {
                this.h = String.valueOf(this.g);
            } else if (rVar.h == nVar.c.h) {
                this.h = nVar.h;
            } else {
                this.h = nVar.h + "." + this.g;
            }
        }
        if (nVar == null && akt.i2()) {
            this.u = new k();
        }
    }

    public static /* synthetic */ void a(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a9739a", new Object[]{nVar});
        } else {
            nVar.i();
        }
    }

    public static void e(Set<Pair<n, f>> set, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b9e7cfe", new Object[]{set, fVar});
            return;
        }
        List<Pair<n, f>> i2 = q.i(set);
        if (i2 != null && !i2.isEmpty()) {
            for (Pair<n, f> pair : i2) {
                ((n) pair.first).K0();
                n nVar = (n) pair.first;
                nVar.d1(nVar.N(), (f) pair.second);
            }
        } else if (fVar != null) {
            fVar.e();
        }
    }

    public void A(String str, List<n> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cd1926c", new Object[]{this, str, list});
        } else {
            B(str, 2, list, true, false);
        }
    }

    public boolean A0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5660cb05", new Object[]{this})).booleanValue();
        }
        if (w0() != null) {
            return true;
        }
        return false;
    }

    public void B(Object obj, int i2, List<n> list, boolean z2, boolean z3) {
        n nVar;
        List<n> list2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9874890a", new Object[]{this, obj, new Integer(i2), list, new Boolean(z2), new Boolean(z3)});
        } else if (list.size() <= 0 || !z3) {
            if ((i2 & 64) != 0) {
                i2 &= -65;
            } else if (z2) {
                if (obj.equals(H("id"))) {
                    list.add(this);
                }
            } else if (obj.equals(r0())) {
                list.add(this);
            }
            if ((i2 & 2) != 0) {
                if (K() instanceof a5k) {
                    ((a5k) K()).k(obj, i2, list, z2, z3);
                } else if ((!r0().equals(WXBasicComponentType.CELL) || this.w == 2) && (list2 = this.d) != null) {
                    Iterator it = ((ArrayList) list2).iterator();
                    while (it.hasNext()) {
                        ((n) it.next()).B(obj, i2, list, z2, z3);
                    }
                }
            } else if ((i2 & 16) != 0) {
                int i3 = i2 & (-17);
                n nVar2 = this.b;
                if (nVar2 != null) {
                    Iterator it2 = ((ArrayList) nVar2.d).iterator();
                    while (it2.hasNext()) {
                        n nVar3 = (n) it2.next();
                        if (nVar3 != this) {
                            nVar3.B(obj, i3, list, z2, z3);
                        }
                    }
                }
            } else if ((1 & i2) != 0 && (nVar = this.b) != null) {
                nVar.B(obj, i2, list, z2, z3);
            }
        }
    }

    public boolean B0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8eaeebe9", new Object[]{this})).booleanValue();
        }
        if ((this.x & 64) != 0) {
            return true;
        }
        return false;
    }

    public void C(e eVar, List<n> list, int i2) {
        n nVar;
        List<n> list2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ff9bf77", new Object[]{this, eVar, list, new Integer(i2)});
            return;
        }
        if ((i2 & 64) == 0) {
            if (eVar.a(this) && list != null) {
                list.add(this);
            }
            if (eVar.b(this)) {
                return;
            }
        } else {
            i2 &= -65;
        }
        if ((i2 & 2) != 0) {
            if (K() instanceof a5k) {
                ((a5k) K()).l(eVar, list, i2);
            } else if ((!r0().equals(WXBasicComponentType.CELL) || this.w == 2) && (list2 = this.d) != null) {
                Iterator it = ((ArrayList) list2).iterator();
                while (it.hasNext()) {
                    ((n) it.next()).C(eVar, list, i2);
                }
            }
        } else if ((i2 & 16) != 0) {
            int i3 = i2 & (-17);
            n nVar2 = this.b;
            if (nVar2 != null) {
                Iterator it2 = ((ArrayList) nVar2.d).iterator();
                while (it2.hasNext()) {
                    n nVar3 = (n) it2.next();
                    if (nVar3 != this) {
                        nVar3.C(eVar, list, i3);
                    }
                }
            }
        } else if ((1 & i2) != 0 && (nVar = this.b) != null) {
            nVar.C(eVar, list, i2);
        }
    }

    public boolean C0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85903ad", new Object[]{this})).booleanValue();
        }
        if ((this.x & 8) != 0) {
            return true;
        }
        return false;
    }

    public void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12ff4eb4", new Object[]{this});
            return;
        }
        E();
        List<n> list = this.d;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ((n) it.next()).D();
            }
        }
    }

    public boolean D0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b3283b5", new Object[]{this})).booleanValue();
        }
        int i2 = this.x;
        if ((i2 & 2) == 0 && (i2 & 8) == 0) {
            return false;
        }
        return true;
    }

    public void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64b5305f", new Object[]{this});
            return;
        }
        this.x |= 8;
        this.w = 0;
    }

    public boolean E0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91b96429", new Object[]{this})).booleanValue();
        }
        return this.m;
    }

    public String F(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dcc72078", new Object[]{this, str});
        }
        String str2 = "$://" + str;
        Map map = this.c.i.b;
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue().equals(str2)) {
                return (String) entry.getKey();
            }
        }
        return null;
    }

    public boolean F0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4dbbeae5", new Object[]{this})).booleanValue();
        }
        if ((this.x & 4) != 0) {
            return true;
        }
        return false;
    }

    public String G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55185d65", new Object[]{this});
        }
        try {
            return (String) ((Map) ((Map) this.c.g.get(".")).get("ac")).get("name");
        } catch (Exception unused) {
            return "";
        }
    }

    public final boolean G0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fde9f59", new Object[]{this})).booleanValue();
        }
        Object m0 = m0(7);
        if (m0 instanceof h) {
            return ((h) m0).a();
        }
        return true;
    }

    public Object H(String str) {
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1be0987a", new Object[]{this, str});
        }
        HashMap<String, Object> hashMap = this.e;
        if (hashMap != null) {
            Object obj = hashMap.get("attrs");
            if (obj instanceof Map) {
                Map map2 = (Map) obj;
                if (map2.containsKey(str)) {
                    return map2.get(str);
                }
            }
            if (this.e.containsKey(str)) {
                return this.e.get(str);
            }
        }
        r rVar = this.c;
        if (rVar == null || (map = rVar.i.b) == null) {
            return null;
        }
        return map.get(str);
    }

    public final boolean H0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa441b86", new Object[]{this})).booleanValue();
        }
        n nVar = this.b;
        if (nVar == null || (nVar.K() instanceof xml)) {
            return true;
        }
        return false;
    }

    public HashMap I() {
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("29521816", new Object[]{this});
        }
        igs.a("TNode getAttrs");
        HashMap hashMap = new HashMap();
        r rVar = this.c;
        if (!(rVar == null || (map = rVar.i.b) == null)) {
            hashMap.putAll(map);
        }
        HashMap<String, Object> hashMap2 = this.e;
        if (hashMap2 != null) {
            hashMap.putAll(hashMap2);
        }
        igs.c();
        return hashMap;
    }

    public boolean I0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c74089e3", new Object[]{this})).booleanValue();
        }
        if ((this.x & 128) != 0) {
            return true;
        }
        return false;
    }

    public Map J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("33bc906b", new Object[]{this});
        }
        return this.e;
    }

    public boolean J0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc5192d7", new Object[]{this, str})).booleanValue();
        }
        HashMap<String, Object> hashMap = this.l;
        if (hashMap != null) {
            return hashMap.containsKey(str);
        }
        return false;
    }

    public Component K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Component) ipChange.ipc$dispatch("c95b6449", new Object[]{this});
        }
        return this.f;
    }

    public void K0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("144adab1", new Object[]{this});
        } else {
            M0(Float.NaN, Float.NaN);
        }
    }

    public n L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("1c2bced4", new Object[]{this});
        }
        n nVar = this;
        while (nVar.Y() != null && !nVar.Y().r0().equals("TabBarController") && !nVar.Y().r0().equals("drawer") && !nVar.Y().r0().equals("viewpager") && !nVar.Y().r0().equals("mediaBrowser") && !nVar.Y().r0().equals("browserex") && !nVar.Y().r0().equals(WXBasicComponentType.CELL) && !nVar.Y().r0().equals("header")) {
            nVar = nVar.Y();
        }
        return nVar;
    }

    public void L0(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7510e32f", new Object[]{this, new Float(f2)});
        } else {
            M0(Float.NaN, f2);
        }
    }

    public TNodeView M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TNodeView) ipChange.ipc$dispatch("d8dc4274", new Object[]{this});
        }
        return h0().v;
    }

    public void M0(float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d0bea71", new Object[]{this, new Float(f2), new Float(f3)});
        } else if (!com.taobao.tao.flexbox.layoutmanager.component.b.e(this)) {
            N0(f2, f3);
        }
    }

    public Context N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.f12238a.m.p;
    }

    public void N0(float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f32e718e", new Object[]{this, new Float(f2), new Float(f3)});
            return;
        }
        igs.a("layoutInternal");
        if (!((f2 <= 0.0f && f3 <= 0.0f) || S() == null || (S().f27261a == ((int) f2) && S().b == ((int) f3)))) {
            r1();
        }
        V0(f2, f3);
        if (this.f != null && D0()) {
            igs.a("calculateLayout");
            this.f.calculateLayout(f2, f3);
            igs.c();
        }
        if (D0()) {
            W0();
        }
        igs.c();
    }

    public qy0 O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qy0) ipChange.ipc$dispatch("a557b887", new Object[]{this});
        }
        Object H = H("oncreateanimation");
        if (H != null && !(H instanceof JSONObject)) {
            try {
                H = JSON.parseObject(H.toString());
            } catch (Exception e2) {
                tfs.d("getCreateAnimation:" + e2.getMessage());
            }
        }
        if (H instanceof JSONObject) {
            return w7l.e(P(), N(), this.g, (JSONObject) H);
        }
        return null;
    }

    public void O0(int i2, int i3, boolean z2) {
        boolean z3 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("413dac1c", new Object[]{this, new Integer(i2), new Integer(i3), new Boolean(z2)});
        } else if (i2 >= 0 && i2 < ((ArrayList) this.d).size()) {
            n nVar = (n) ((ArrayList) this.d).remove(i2);
            if (i2 > i3) {
                if (i3 >= 0 && i3 <= ((ArrayList) this.d).size()) {
                    ((ArrayList) this.d).add(i3, nVar);
                    z3 = true;
                }
                s1(z2);
                n L = L();
                L.q1(z2);
                if (K() != null && z3) {
                    K().handleChildMoved(L, i2, i3, nVar);
                    if (akt.d0()) {
                        p1(true);
                        return;
                    }
                    return;
                }
            }
            int i4 = i3 - 1;
            if (i4 >= 0 && i4 <= ((ArrayList) this.d).size()) {
                ((ArrayList) this.d).add(i4, nVar);
                i3 = i4;
                z3 = true;
            }
            s1(z2);
            n L2 = L();
            L2.q1(z2);
            if (K() != null) {
            }
        }
    }

    public o P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o) ipChange.ipc$dispatch("49f66b1f", new Object[]{this});
        }
        return this.f12238a.m;
    }

    public final boolean P0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fe0726e", new Object[]{this})).booleanValue();
        }
        if (r0().equals(WXBasicComponentType.CELL) || r0().equals("header") || (K() instanceof iqs)) {
            return true;
        }
        return false;
    }

    public int Q(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c0140a09", new Object[]{this, nVar})).intValue();
        }
        return ((ArrayList) this.d).indexOf(nVar);
    }

    public void Q0(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("359f27d2", new Object[]{this, gVar});
        } else if (H0() && TextUtils.equals(gVar.d, "onpageappear")) {
            g e2 = g.e(gVar.b, gVar.c, "onwillappear", gVar.e, 130, gVar.g);
            t(e2);
            e2.f();
        }
    }

    public String R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("37b484cb", new Object[]{this});
        }
        return this.c.t();
    }

    public void R0(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("972af2b1", new Object[]{this, gVar});
        } else if (H0() && TextUtils.equals(gVar.d, "onpagedisappear")) {
            g e2 = g.e(gVar.b, gVar.c, "onwilldisappear", gVar.e, Component.MSG_FLAG_DISAPPEAR, gVar.g);
            t(e2);
            e2.f();
        }
    }

    public rbi S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rbi) ipChange.ipc$dispatch("696e1489", new Object[]{this});
        }
        Component component = this.f;
        if (component != null) {
            return component.measureResult;
        }
        return null;
    }

    public void S0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c5666b1", new Object[]{this});
        }
    }

    public o.t T() {
        o.t tVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o.t) ipChange.ipc$dispatch("86dd94eb", new Object[]{this});
        }
        if (akt.i2()) {
            tVar = g0().u;
        } else {
            tVar = P().Y();
        }
        if (tVar == null) {
            return new k();
        }
        return tVar;
    }

    public int U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("246ed4ad", new Object[]{this})).intValue();
        }
        return this.g;
    }

    public Object V(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a3fd2f6", new Object[]{this, str});
        }
        Map W = W();
        if (W != null) {
            return W.get(str);
        }
        return null;
    }

    public void V0(float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a24e75f0", new Object[]{this, new Float(f2), new Float(f3)});
            return;
        }
        igs.a("init Layout");
        if (this.f == null) {
            com.taobao.tao.flexbox.layoutmanager.core.d.f(this.c.m, new a());
        } else {
            i();
        }
    }

    public Map W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("426496e4", new Object[]{this});
        }
        return this.f12238a.j;
    }

    public void W0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2801c9", new Object[]{this});
            return;
        }
        this.x &= -3;
        Component component = this.f;
        if (component != null) {
            if (!(component instanceof ol4) && !(component instanceof piw) && this.d != null) {
                for (int i2 = 0; i2 < ((ArrayList) this.d).size(); i2++) {
                    ((n) ((ArrayList) this.d).get(i2)).W0();
                }
            }
            Component component2 = this.f;
            if (!(component2 instanceof piw)) {
                component2.onLayoutComplete();
            }
        }
    }

    public d X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("d8e50739", new Object[]{this});
        }
        d dVar = new d();
        dVar.f12242a = this.f12238a.d;
        String str = (String) V("pageName");
        dVar.b = (String) V("url");
        dVar.c = this.f12238a.q;
        return dVar;
    }

    public n Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("2ae86c29", new Object[]{this});
        }
        return this.b;
    }

    public void Y0(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c056c94c", new Object[]{this, new Integer(i2), new Integer(i3)});
        } else {
            P().Q0(this, i2, i3);
        }
    }

    public String Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5f33b528", new Object[]{this});
        }
        return this.o;
    }

    public Map a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("55594da", new Object[]{this});
        }
        return this.k;
    }

    public hk8 a1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hk8) ipChange.ipc$dispatch("5fa9918a", new Object[]{this, str});
        }
        HashMap<String, hk8> hashMap = this.y;
        if (hashMap != null) {
            return hashMap.remove(str);
        }
        return null;
    }

    public void b(fj8 fj8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc1ad9bd", new Object[]{this, fj8Var});
            return;
        }
        if (this.q == null) {
            this.q = new ArrayList();
        }
        if (!this.q.contains(fj8Var)) {
            this.q.add(fj8Var);
        }
    }

    public Map b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("107053b6", new Object[]{this});
        }
        return this.c.o;
    }

    public void b1(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19054b4b", new Object[]{this, context});
            return;
        }
        try {
            c1(context);
        } catch (Throwable th) {
            tfs.d("render " + th.getMessage());
        }
    }

    public void c(d.j jVar, String str, long j, Object obj, Object obj2, boolean z2) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f9aa200", new Object[]{this, jVar, str, new Long(j), obj, obj2, new Boolean(z2)});
            return;
        }
        if (X() != null) {
            str2 = X().f12242a;
        } else {
            str2 = "";
        }
        this.f12238a.m.z(jVar, str, j, this, str2, obj, obj2, z2);
    }

    public o.y c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o.y) ipChange.ipc$dispatch("6a2889c5", new Object[]{this});
        }
        return this.f12238a;
    }

    public void d(Object obj, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4c34763", new Object[]{this, obj, new Boolean(z2)});
        } else {
            c(null, null, 0L, obj, null, z2);
        }
    }

    public f d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("c0a07c9d", new Object[]{this});
        }
        return this.r;
    }

    public void d1(Context context, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5b7bdf", new Object[]{this, context, fVar});
            return;
        }
        try {
            this.r = fVar;
            c1(context);
            this.r = null;
            if (fVar != null) {
                fVar.e();
            }
        } catch (Throwable th) {
            tfs.d("renderWithOption " + th.getMessage());
        }
    }

    public String e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d5da34c9", new Object[]{this});
        }
        HashMap I = I();
        if (this.f == null) {
            Component d2 = com.taobao.tao.flexbox.layoutmanager.core.d.d(this.c.m);
            this.f = d2;
            if (d2 != null) {
                d2.onCreate(this);
            }
        }
        Component component = this.f;
        if (component == null) {
            return null;
        }
        component.parseViewParams(I);
        String e2 = this.f.getViewParams().e();
        if (!(this.f instanceof zr7) || e2 != null || !((ArrayList) this.d).isEmpty()) {
            return e2;
        }
        return " ";
    }

    public void e1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9adf8381", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("type", "add");
        P().o1(130, this, "onwillappear", null, hashMap, null);
    }

    @Deprecated
    public void f(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb4f958a", new Object[]{this, oVar});
            return;
        }
        o.y yVar = this.f12238a;
        o oVar2 = yVar.m;
        if (oVar2 != oVar) {
            yVar.m = oVar;
            int incrementAndGet = A.incrementAndGet();
            this.g = incrementAndGet;
            this.f12238a.m.P0(incrementAndGet, this);
            if (oVar != null) {
                this.f12238a.m.r1(oVar2.I());
            }
            r rVar = this.c;
            if (rVar != null) {
                rVar.f12286a = oVar;
            }
            if (this.d != null) {
                for (int i2 = 0; i2 < ((ArrayList) this.d).size(); i2++) {
                    ((n) ((ArrayList) this.d).get(i2)).f(oVar);
                }
            }
        }
    }

    public int f0() {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("568c34b0", new Object[]{this})).intValue();
        }
        Component component = this.f;
        if ((component instanceof skg) && !(component instanceof RichTextContainerComponent)) {
            return component.getViewParams().f();
        }
        if ((component instanceof zr7) && ((ArrayList) this.d).isEmpty()) {
            i2 = 1;
        }
        Iterator it = ((ArrayList) this.d).iterator();
        while (it.hasNext()) {
            i2 += ((n) it.next()).f0();
        }
        return i2;
    }

    public void f1(IPage iPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("431ff9cd", new Object[]{this, iPage});
        } else {
            this.p = iPage;
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0f2fac1", new Object[]{this});
            return;
        }
        SparseArray<Object> sparseArray = this.j;
        if (sparseArray != null && sparseArray.size() > 0) {
            for (int i2 = 0; i2 < this.j.size(); i2++) {
                Object valueAt = this.j.valueAt(i2);
                if (valueAt instanceof wwd) {
                    wwd wwdVar = (wwd) valueAt;
                    if (wwdVar.a() != null) {
                        wwdVar.a().cancel();
                        this.j.setValueAt(i2, null);
                    }
                } else if (valueAt instanceof Animator) {
                    ((Animator) valueAt).cancel();
                    this.j.setValueAt(i2, null);
                }
            }
        }
    }

    public n g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("d6e63de1", new Object[]{this});
        }
        n nVar = this;
        while (true) {
            n nVar2 = nVar.b;
            if (nVar2 == null) {
                return nVar;
            }
            nVar = nVar2;
        }
    }

    public boolean g1(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ec462a4", new Object[]{this, str, obj})).booleanValue();
        }
        return h1(str, obj, akt.L0());
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6007f53", new Object[]{this});
            return;
        }
        HashMap<String, Object> hashMap = this.l;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public n h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("59438703", new Object[]{this});
        }
        return u0().b.f;
    }

    public boolean h1(String str, Object obj, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39c8a438", new Object[]{this, str, obj, new Boolean(z2)})).booleanValue();
        }
        Object i1 = i1(str, obj);
        if (z2 && i1 != null && i1.equals(obj)) {
            return false;
        }
        if (this.l == null) {
            this.l = new HashMap<>();
        }
        this.l.put(str, obj);
        x0(str, obj);
        r(str, i1, obj);
        return true;
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a7d7b8e", new Object[]{this});
            return;
        }
        Component component = this.f;
        if (component == null) {
            igs.c();
            return;
        }
        component.onLayout();
        Component component2 = this.f;
        if (!(component2 instanceof ol4) && !(component2 instanceof piw) && this.d != null) {
            for (int i2 = 0; i2 < ((ArrayList) this.d).size(); i2++) {
                ((n) ((ArrayList) this.d).get(i2)).V0(Float.NaN, Float.NaN);
            }
        }
        this.f.onLayoutTreeBuilt();
        igs.c();
    }

    public n i0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("a42cb53f", new Object[]{this, new Integer(i2)});
        }
        if (i2 < 0 || i2 >= ((ArrayList) this.d).size()) {
            return null;
        }
        return (n) ((ArrayList) this.d).get(i2);
    }

    public Object i1(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("e1c8576a", new Object[]{this, str, obj});
        }
        if (this.e == null) {
            this.e = new HashMap<>();
        }
        return this.e.put(str, obj);
    }

    public boolean j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f2b39ba", new Object[]{this, str})).booleanValue();
        }
        HashMap<String, Object> hashMap = this.e;
        if (hashMap != null) {
            Object obj = hashMap.get("attrs");
            if (((obj instanceof Map) && ((Map) obj).containsKey(str)) || this.e.containsKey(str)) {
                return true;
            }
        }
        Map map = this.c.i.b;
        if (map != null) {
            return map.containsKey(str);
        }
        return false;
    }

    public List<n> j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("dd3649b9", new Object[]{this});
        }
        return this.d;
    }

    public boolean j1(String str, Object obj, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6f0131", new Object[]{this, str, obj, new Boolean(z2)})).booleanValue();
        }
        if (!z2) {
            if (this.e == null) {
                this.e = new HashMap<>();
            }
            Object put = this.e.put(str, obj);
            Component component = this.f;
            if (component != null) {
                component.parseViewParams(I());
            }
            return !nwv.i(put, obj);
        }
        boolean g1 = g1(str, obj);
        if (g1 && this.f != null) {
            n L = L();
            this.f.handleChildChanged(L, this);
            L.K0();
            L.b1(L.N());
        }
        return g1;
    }

    public boolean k(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45ff1679", new Object[]{this, nVar})).booleanValue();
        }
        if (this == nVar) {
            return true;
        }
        List<n> list = this.d;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                if (((n) it.next()).k(nVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8e1e5c02", new Object[]{this})).intValue();
        }
        List<n> list = this.d;
        if (list != null) {
            return ((ArrayList) list).size();
        }
        return 0;
    }

    public n k1(Map<String, Object> map, f fVar, boolean z2) {
        boolean z3 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("86d8cdc2", new Object[]{this, map, fVar, new Boolean(z2)});
        }
        if (map != null) {
            n L = L();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                z3 |= h1(entry.getKey(), entry.getValue(), z2);
            }
            if (z3 && this.f != null) {
                if (!D0() && F0()) {
                    this.f.parseViewParams(I());
                }
                this.f.handleChildChanged(L, this);
                return L;
            }
        }
        return null;
    }

    public final n l(r rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("87428f65", new Object[]{this, rVar});
        }
        return new n(this.f12238a, rVar, this);
    }

    public Object l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("61e2c7a7", new Object[]{this});
        }
        return this.i;
    }

    public n l1(Map<String, Object> map, f fVar, boolean z2) {
        com.taobao.tao.flexbox.layoutmanager.core.b attributeHandler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("9b2eb262", new Object[]{this, map, fVar, new Boolean(z2)});
        }
        if (map == null) {
            return null;
        }
        if (akt.w1()) {
            Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, Object> next = it.next();
                String key = next.getKey();
                Object value = next.getValue();
                Object i1 = i1(key, value);
                if (!z2 || i1 == null || !i1.equals(value)) {
                    Component component = this.f;
                    if (!(component == null || (attributeHandler = component.getAttributeHandler(key)) == null || !attributeHandler.i())) {
                        attributeHandler.j(this, this.f.viewParams, key, value);
                        Component component2 = this.f;
                        if (!(component2 instanceof com.taobao.tao.flexbox.layoutmanager.core.c) || !((com.taobao.tao.flexbox.layoutmanager.core.c) component2).isDrawable()) {
                            Component component3 = this.f;
                            attributeHandler.c(component3, component3.getView(), this.f.viewParams, fVar);
                        } else {
                            Component component4 = this.f;
                            attributeHandler.d(component4, ((com.taobao.tao.flexbox.layoutmanager.core.c) component4).getDrawable(), this.f.viewParams, fVar);
                        }
                        r(key, i1, value);
                        it.remove();
                    }
                } else {
                    it.remove();
                }
            }
        }
        if (!map.isEmpty()) {
            return k1(map, fVar, false);
        }
        return null;
    }

    public void m(int i2, int i3, boolean z2) {
        n nVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3255b076", new Object[]{this, new Integer(i2), new Integer(i3), new Boolean(z2)});
            return;
        }
        s1(z2);
        n L = L();
        L.q1(z2);
        for (int i4 = i3 - 1; i4 >= 0; i4--) {
            int i5 = i2 + i4;
            if (i5 < 0 || i5 >= ((ArrayList) this.d).size()) {
                nVar = null;
            } else {
                nVar = (n) ((ArrayList) this.d).remove(i5);
            }
            if (!(nVar == null || K() == null)) {
                K().handleChildDeleted(L, i2, nVar);
                nVar.n(true);
            }
            if (nVar != null) {
                P().c1(nVar.g);
            }
        }
    }

    public Object m0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("efd71630", new Object[]{this, new Integer(i2)});
        }
        SparseArray<Object> sparseArray = this.j;
        if (sparseArray != null) {
            return sparseArray.get(i2);
        }
        return null;
    }

    public void m1(TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92b13242", new Object[]{this, tNodeView});
        } else {
            this.v = tNodeView;
        }
    }

    public void n(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec06b7a", new Object[]{this, new Boolean(z2)});
        } else if (akt.Q()) {
            o(z2);
            q(z2);
        } else {
            q(z2);
            o(z2);
        }
    }

    public String n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("23dd0b9a", new Object[]{this});
        }
        if (z) {
            return this.h;
        }
        LinkedList linkedList = new LinkedList();
        n nVar = this;
        while (nVar != null) {
            r rVar = nVar.c;
            while (true) {
                r rVar2 = rVar.c;
                if (rVar2 == null || rVar.h != rVar2.h) {
                    break;
                }
                rVar = rVar2;
            }
            if (!akt.o0() || rVar.i == rVar.h) {
                linkedList.add(0, String.valueOf(rVar.f.g));
            }
            nVar = rVar.f.b;
        }
        hqq.b a2 = hqq.a();
        for (int i2 = 0; i2 < linkedList.size(); i2++) {
            a2.b((String) linkedList.get(i2));
            if (i2 < linkedList.size() - 1) {
                a2.b(".");
            }
        }
        return a2.toString();
    }

    public void n1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52f609ad", new Object[]{this});
            return;
        }
        this.x |= 64;
        n nVar = this.b;
        if (nVar != null && (nVar.x & 64) == 0) {
            nVar.n1();
        }
    }

    public final void o(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("840e7384", new Object[]{this, new Boolean(z2)});
        } else if (this.d != null && !(this.f instanceof ol4)) {
            for (int i2 = 0; i2 < ((ArrayList) this.d).size(); i2++) {
                ((n) ((ArrayList) this.d).get(i2)).n(z2);
            }
        }
    }

    public String o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8afad3e", new Object[]{this});
        }
        return this.c.h.e;
    }

    public void o1(String str, hk8 hk8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cd361e0", new Object[]{this, str, hk8Var});
            return;
        }
        if (this.y == null) {
            this.y = new HashMap<>();
        }
        this.y.put(str, hk8Var);
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("989c7634", new Object[]{this});
            return;
        }
        Component component = this.f;
        if (component != null && component.isAttached()) {
            this.f.detach(true);
        }
    }

    public i p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("d09de537", new Object[]{this});
        }
        if (this.t == null) {
            A1();
        }
        return this.t;
    }

    public void p1(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("746a9f17", new Object[]{this, new Boolean(z2)});
        } else {
            this.m = z2;
        }
    }

    public final void q(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15fd7d0e", new Object[]{this, new Boolean(z2)});
            return;
        }
        Component component = this.f;
        if (component != null) {
            component.detach(z2);
        }
    }

    public String q0(Map map) {
        Map map2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd835931", new Object[]{this, map});
        }
        String str = map != null ? (String) map.get("page") : null;
        if (str == null && (map2 = this.c.d) != null) {
            str = (String) map2.get("pageName");
        }
        if (str != null) {
            return str;
        }
        Object V = V("query");
        return V instanceof Map ? (String) ((Map) V).get("utPageName") : str;
    }

    public void q1(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d12f9db", new Object[]{this, new Boolean(z2)});
            return;
        }
        this.x |= 4;
        n nVar = this.b;
        if (nVar == null) {
            return;
        }
        if (!nVar.P0() || z2) {
            this.b.q1(z2);
        }
    }

    public final void r(String str, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fd20ada", new Object[]{this, str, obj, obj2});
        } else if (this.q != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("oldValue", obj);
            hashMap.put("value", obj2);
            hashMap.put("key", H("key"));
            s(str, hashMap);
        }
    }

    public String r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return this.c.u();
    }

    public void r1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cefcc6c", new Object[]{this});
        } else {
            s1(false);
        }
    }

    public void s(String str, Map map) {
        n c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53117a94", new Object[]{this, str, map});
        } else if (this.q != null) {
            HashSet hashSet = new HashSet();
            Iterator it = ((ArrayList) this.q).iterator();
            while (it.hasNext()) {
                fj8 fj8Var = (fj8) it.next();
                if (str.equals(fj8Var.a()) && (c2 = fj8Var.c(this, map)) != null) {
                    hashSet.add(new Pair(c2, fj8Var.b()));
                }
            }
            e(hashSet, null);
        }
    }

    public HashMap<String, Object> s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("fdafc587", new Object[]{this});
        }
        return this.l;
    }

    public void s1(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("410a73e8", new Object[]{this, new Boolean(z2)});
            return;
        }
        this.x |= 6;
        n nVar = this.b;
        if (nVar == null) {
            return;
        }
        if (!nVar.P0() || z2) {
            this.b.s1(z2);
        }
    }

    public boolean t(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("639c1ac1", new Object[]{this, gVar})).booleanValue();
        }
        if (!U0(gVar)) {
            return T0(gVar);
        }
        return false;
    }

    public Object t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3d9e7f1e", new Object[]{this});
        }
        return this.c.q;
    }

    public void t1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3857e4e", new Object[]{this, str});
        } else {
            this.o = str;
        }
    }

    public final void u(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48b82577", new Object[]{this, gVar});
            return;
        }
        k kVar = (k) T();
        if (kVar != null && !gVar.b(1024)) {
            kVar.onHandleMessage(gVar);
            gVar.a(1024);
        }
    }

    public r u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r) ipChange.ipc$dispatch("947e52a9", new Object[]{this});
        }
        return this.c;
    }

    public void u1(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("833b7d8c", new Object[]{this, map});
        } else {
            this.k = map;
        }
    }

    public <T extends Component> T v(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((Component) ipChange.ipc$dispatch("4758ad9c", new Object[]{this, cls}));
        }
        n x = x(cls);
        if (x != null) {
            return (T) x.K();
        }
        return null;
    }

    public Map v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5c3e9a5c", new Object[]{this});
        }
        return this.c.n;
    }

    public void v1(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e11aa67b", new Object[]{this, obj});
        } else {
            this.i = obj;
        }
    }

    public n w(String str, boolean z2) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("15ea67f8", new Object[]{this, str, new Boolean(z2)});
        }
        ArrayList arrayList = new ArrayList();
        if (z2) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        B(str, i2, arrayList, true, true);
        if (arrayList.isEmpty()) {
            return null;
        }
        return (n) arrayList.get(0);
    }

    public View w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        Component component = this.f;
        if (component != null) {
            return component.getView();
        }
        return null;
    }

    public n x(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("44142bac", new Object[]{this, cls});
        }
        return z(cls, null, false);
    }

    public final void x0(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51938168", new Object[]{this, str, obj});
        } else if (str.equals("theme-name") || str.equals("theme-enabled")) {
            A1();
            D();
        } else {
            Component component = this.f;
            if (component != null) {
                component.updateNeedLayoutOrRender(str);
            }
        }
    }

    public void x1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc05a606", new Object[]{this});
        } else if (!this.n || !akt.p2("fixSortComponent", true)) {
            this.n = true;
            Component component = this.f;
            if (component != null) {
                component.sortChildren();
            }
            this.n = false;
        }
    }

    public n y(String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("5f8407a8", new Object[]{this, str, new Integer(i2)});
        }
        ArrayList arrayList = new ArrayList();
        B(str, i2, arrayList, false, true);
        if (arrayList.isEmpty()) {
            return null;
        }
        return (n) arrayList.get(0);
    }

    public void y0(int i2, r rVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("318db697", new Object[]{this, new Integer(i2), rVar, new Boolean(z2)});
            return;
        }
        n l = l(rVar);
        if (i2 >= 0 && i2 <= ((ArrayList) this.d).size()) {
            n L = L();
            ((ArrayList) this.d).add(i2, l);
            s1(z2);
            L.q1(z2);
            if (K() != null) {
                K().handleChildAdded(L, i2, l);
                p1(true);
                if (z0()) {
                    nwv.y0(new c(l));
                }
            } else if (r0().equals("cells")) {
                com.taobao.tao.flexbox.layoutmanager.component.b.j(Y().Y()).p(l, i2, false);
            }
        }
    }

    public final boolean y1(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1f04adf", new Object[]{this, gVar})).booleanValue();
        }
        if (gVar.b(2)) {
            List<n> list = this.d;
            if (list != null) {
                Iterator it = ((ArrayList) list).iterator();
                while (it.hasNext()) {
                    n nVar = (n) it.next();
                    g d2 = g.d(gVar, nVar);
                    boolean t = nVar.t(d2);
                    d2.f();
                    if (t && !gVar.b(128)) {
                        return true;
                    }
                }
            }
        } else if (gVar.b(16)) {
            gVar.g(16);
            n nVar2 = this.b;
            if (nVar2 != null) {
                Iterator it2 = ((ArrayList) nVar2.d).iterator();
                while (it2.hasNext()) {
                    n nVar3 = (n) it2.next();
                    if (nVar3 != this) {
                        g d3 = g.d(gVar, nVar3);
                        boolean t2 = nVar3.t(d3);
                        d3.f();
                        if (t2 && !gVar.b(128)) {
                            return true;
                        }
                    }
                }
            }
        } else if (gVar.b(1)) {
            n nVar4 = this.b;
            if (nVar4 == null) {
                Object obj = this.i;
                if (obj instanceof a5k) {
                    nVar4 = ((a5k) obj).getNode();
                }
            }
            if (nVar4 != null) {
                g d4 = g.d(gVar, nVar4);
                boolean t3 = nVar4.t(d4);
                d4.f();
                if (t3 && !gVar.b(128)) {
                    return true;
                }
            }
        }
        return false;
    }

    public n z(Class cls, e eVar, boolean z2) {
        List<n> list;
        n z3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("46aec184", new Object[]{this, cls, eVar, new Boolean(z2)});
        }
        Component component = this.f;
        if (component != null && ((component.getClass() == cls || cls.isAssignableFrom(this.f.getClass())) && (eVar == null || eVar.a(this)))) {
            return this;
        }
        if (eVar != null && eVar.b(this)) {
            return null;
        }
        Component component2 = this.f;
        if ((component2 instanceof a5k) && !z2) {
            n j = ((a5k) component2).j(cls, eVar, z2);
            if (j != null) {
                return j;
            }
        } else if (z2) {
            n nVar = this.b;
            if (nVar != null && (z3 = nVar.z(cls, eVar, z2)) != null) {
                return z3;
            }
        } else if ((!r0().equals(WXBasicComponentType.CELL) || this.w == 2) && (list = this.d) != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                n z4 = ((n) it.next()).z(cls, eVar, z2);
                if (z4 != null) {
                    return z4;
                }
            }
        }
        return null;
    }

    public boolean z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec6a7c6a", new Object[]{this})).booleanValue();
        }
        if ((this.x & 16) != 0) {
            return true;
        }
        return false;
    }

    public void z1(String str, Object obj, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fba2d0e", new Object[]{this, str, obj, new Boolean(z2)});
            return;
        }
        g1(str, obj);
        q1(z2);
        if (K() != null) {
            K().handleChildChanged(L(), this);
        }
    }

    public final void A1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df51d5d1", new Object[]{this});
        } else {
            this.t = new i(nwv.I(H("theme-name"), null), nwv.o(H("theme-enabled"), true));
        }
    }

    public void B1(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32918994", new Object[]{this, map});
            return;
        }
        n y = this.c.b.y();
        if (y.t == null && map != null && map.containsKey("theme-name")) {
            y.t = new i(nwv.I(map.get("theme-name"), null), nwv.o(map.get("theme-enabled"), true));
        }
    }

    public void w1(int i2, Object obj) {
        IPage iPage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a0ccdaa", new Object[]{this, new Integer(i2), obj});
            return;
        }
        if (this.j == null) {
            this.j = new SparseArray<>();
        }
        if (1 == i2 && (iPage = this.p) != null) {
            iPage.d().a("pageNameTmp", obj);
        }
        this.j.put(i2, obj);
    }

    public void X0(Context context) {
        yx9 V;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eda217a", new Object[]{this, context});
        } else if (!B0() && S() != null) {
            igs.a("prepare");
            if ((context instanceof Activity) && (V = P().V((Activity) context)) != null) {
                if (this.f != null) {
                    V.e(new b(context));
                }
                if (this.d != null) {
                    Component component = this.f;
                    if (!(component instanceof ol4) && !(component instanceof piw)) {
                        for (int i2 = 0; i2 < ((ArrayList) this.d).size(); i2++) {
                            ((n) ((ArrayList) this.d).get(i2)).X0(context);
                        }
                    }
                }
            }
            igs.c();
        }
    }

    public void Z0(int i2, int i3) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db82ac84", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        rbi S = S();
        if (S == null) {
            return;
        }
        if (S.f27261a != i2 || S.b != i3) {
            tfs.f("relayout old:" + S + " newWidth:" + i2 + " newHeight:" + i3);
            if (S.f27261a == i2) {
                z2 = false;
            }
            s1(z2);
            c0().s(i2, i3);
            M0(i2, i3);
            b1(N());
        }
    }

    public final void c1(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810fbf8e", new Object[]{this, context});
            return;
        }
        igs.a("renderInternal");
        Component component = this.f;
        if (component != null) {
            component.onRender(context);
        }
        n1();
        if (this.d != null) {
            Component component2 = this.f;
            if (!(component2 instanceof ol4) && !(component2 instanceof piw)) {
                for (int i2 = 0; i2 < ((ArrayList) this.d).size(); i2++) {
                    n nVar = (n) ((ArrayList) this.d).get(i2);
                    nVar.r = this.r;
                    nVar.b1(context);
                    nVar.r = null;
                }
            }
        }
        h();
        this.x &= -13;
        if (this.f != null && this.m) {
            igs.a("sortComponent");
            x1();
            igs.c();
        }
        Component component3 = this.f;
        if (component3 != null) {
            component3.onRenderCompleted();
        }
        this.m = false;
        igs.c();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
        if (r6.equals("onpageappear") == false) goto L_0x0029;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean U0(com.taobao.tao.flexbox.layoutmanager.core.n.g r6) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.core.n.U0(com.taobao.tao.flexbox.layoutmanager.core.n$g):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x013a A[LOOP:1: B:73:0x0134->B:75:0x013a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean T0(com.taobao.tao.flexbox.layoutmanager.core.n.g r18) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.core.n.T0(com.taobao.tao.flexbox.layoutmanager.core.n$g):boolean");
    }
}
