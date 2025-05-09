package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class c5t {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final c5t INSTANCE = new c5t();

    /* renamed from: a  reason: collision with root package name */
    public static final njg f16880a;
    public static final njg b;
    public static final njg c;
    public static final njg d;
    public static final njg e;
    public static final njg f;
    public static final njg g;
    public static final njg h;
    public static final njg i;
    public static final njg j;
    public static final njg k;
    public static final njg l;
    public static final njg m;

    static {
        t2o.a(1010827405);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f16880a = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.e4t
            @Override // tb.d1a
            public final Object invoke() {
                int n;
                n = c5t.n();
                return Integer.valueOf(n);
            }
        });
        b = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.q4t
            @Override // tb.d1a
            public final Object invoke() {
                boolean u;
                u = c5t.u();
                return Boolean.valueOf(u);
            }
        });
        c = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.s4t
            @Override // tb.d1a
            public final Object invoke() {
                int J;
                J = c5t.J();
                return Integer.valueOf(J);
            }
        });
        d = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.u4t
            @Override // tb.d1a
            public final Object invoke() {
                boolean q;
                q = c5t.q();
                return Boolean.valueOf(q);
            }
        });
        e = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.w4t
            @Override // tb.d1a
            public final Object invoke() {
                boolean t;
                t = c5t.t();
                return Boolean.valueOf(t);
            }
        });
        f = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.y4t
            @Override // tb.d1a
            public final Object invoke() {
                boolean o;
                o = c5t.o();
                return Boolean.valueOf(o);
            }
        });
        g = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.a5t
            @Override // tb.d1a
            public final Object invoke() {
                int m2;
                m2 = c5t.m();
                return Integer.valueOf(m2);
            }
        });
        h = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.g4t
            @Override // tb.d1a
            public final Object invoke() {
                boolean w;
                w = c5t.w();
                return Boolean.valueOf(w);
            }
        });
        i = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.i4t
            @Override // tb.d1a
            public final Object invoke() {
                boolean p;
                p = c5t.p();
                return Boolean.valueOf(p);
            }
        });
        j = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.kqz
            @Override // tb.d1a
            public final Object invoke() {
                boolean r;
                r = c5t.r();
                return Boolean.valueOf(r);
            }
        });
        k = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.k4t
            @Override // tb.d1a
            public final Object invoke() {
                boolean s;
                s = c5t.s();
                return Boolean.valueOf(s);
            }
        });
        l = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.m4t
            @Override // tb.d1a
            public final Object invoke() {
                boolean v;
                v = c5t.v();
                return Boolean.valueOf(v);
            }
        });
        m = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.o4t
            @Override // tb.d1a
            public final Object invoke() {
                boolean L;
                L = c5t.L();
                return Boolean.valueOf(L);
            }
        });
    }

    public static final int J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("897af050", new Object[0])).intValue();
        }
        return avs.INSTANCE.f("UpDownRequestIntervalKMP", 2);
    }

    public static final boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afdd6bea", new Object[0])).booleanValue();
        }
        return avs.INSTANCE.d("enableUpDownRankStrategyKMP", false);
    }

    public static final int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("51368016", new Object[0])).intValue();
        }
        return avs.INSTANCE.f("UpDownSwitchADCheckIntervalKMP", 180);
    }

    public static final int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a0975d2", new Object[0])).intValue();
        }
        return avs.INSTANCE.f("NewSwitchRequestPageSizeKMP", 5);
    }

    public static final boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8b4846d", new Object[0])).booleanValue();
        }
        return avs.INSTANCE.d("enableAutoRecommendKMP", true);
    }

    public static final boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a78eb39", new Object[0])).booleanValue();
        }
        return avs.INSTANCE.d("enableFirstModelTimeMoveParamKMP", false);
    }

    public static final boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dbf8911b", new Object[0])).booleanValue();
        }
        return avs.INSTANCE.d("enableOpenRemoveDupCheck", false);
    }

    public static final boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9098ef47", new Object[0])).booleanValue();
        }
        return avs.INSTANCE.d("enableQueryTimeMovingKMP", false);
    }

    public static final boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("627adeac", new Object[0])).booleanValue();
        }
        return avs.INSTANCE.d("enableTimeMoveKeyPointIdCheck", true);
    }

    public static final boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c891e233", new Object[0])).booleanValue();
        }
        return avs.INSTANCE.d("enableUpDownSwitchADCheckKMP", true);
    }

    public static final boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ccbd330", new Object[0])).booleanValue();
        }
        return avs.INSTANCE.d("enableUpDownSwitchTimerKMP", false);
    }

    public static final boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3705763e", new Object[0])).booleanValue();
        }
        return avs.INSTANCE.d("enableUpDownTailInsertBugFixKMP", true);
    }

    public static final boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c2e0617", new Object[0])).booleanValue();
        }
        return avs.INSTANCE.d("enableUpDownTimeMoveTppKMP", false);
    }

    public final boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5f1268", new Object[]{this})).booleanValue();
        }
        return ((Boolean) i.getValue()).booleanValue();
    }

    public final boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("235a3cbb", new Object[]{this})).booleanValue();
        }
        return ((Boolean) d.getValue()).booleanValue();
    }

    public final boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47b4e235", new Object[]{this})).booleanValue();
        }
        return ((Boolean) j.getValue()).booleanValue();
    }

    public final boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6273e30", new Object[]{this})).booleanValue();
        }
        return ((Boolean) k.getValue()).booleanValue();
    }

    public final boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc537fe6", new Object[]{this})).booleanValue();
        }
        return ((Boolean) e.getValue()).booleanValue();
    }

    public final boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("689021e6", new Object[]{this})).booleanValue();
        }
        return ((Boolean) b.getValue()).booleanValue();
    }

    public final boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b18525eb", new Object[]{this})).booleanValue();
        }
        return ((Boolean) l.getValue()).booleanValue();
    }

    public final boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc7576b3", new Object[]{this})).booleanValue();
        }
        return ((Boolean) h.getValue()).booleanValue();
    }

    public final int I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("87737c31", new Object[]{this})).intValue();
        }
        return ((Number) c.getValue()).intValue();
    }

    public final boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c5d24a0", new Object[]{this})).booleanValue();
        }
        return ((Boolean) m.getValue()).booleanValue();
    }

    public final int x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1149b1c7", new Object[]{this})).intValue();
        }
        return ((Number) g.getValue()).intValue();
    }

    public final int y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a242dfb5", new Object[]{this})).intValue();
        }
        return ((Number) f16880a.getValue()).intValue();
    }

    public final boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb3ef65f", new Object[]{this})).booleanValue();
        }
        return ((Boolean) f.getValue()).booleanValue();
    }
}
