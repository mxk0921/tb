package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class e3t {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final e3t INSTANCE = new e3t();

    /* renamed from: a  reason: collision with root package name */
    public static final njg f18247a;
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
        t2o.a(1010827300);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f18247a = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.i2t
            @Override // tb.d1a
            public final Object invoke() {
                boolean q;
                q = e3t.q();
                return Boolean.valueOf(q);
            }
        });
        b = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.s2t
            @Override // tb.d1a
            public final Object invoke() {
                List l2;
                l2 = e3t.l();
                return l2;
            }
        });
        c = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.u2t
            @Override // tb.d1a
            public final Object invoke() {
                String m2;
                m2 = e3t.m();
                return m2;
            }
        });
        d = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.w2t
            @Override // tb.d1a
            public final Object invoke() {
                String E;
                E = e3t.E();
                return E;
            }
        });
        e = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.y2t
            @Override // tb.d1a
            public final Object invoke() {
                boolean p;
                p = e3t.p();
                return Boolean.valueOf(p);
            }
        });
        f = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.a3t
            @Override // tb.d1a
            public final Object invoke() {
                boolean n;
                n = e3t.n();
                return Boolean.valueOf(n);
            }
        });
        g = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.c3t
            @Override // tb.d1a
            public final Object invoke() {
                int D;
                D = e3t.D();
                return Integer.valueOf(D);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.NONE;
        h = a.a(lazyThreadSafetyMode2, new d1a() { // from class: tb.k2t
            @Override // tb.d1a
            public final Object invoke() {
                int G;
                G = e3t.G();
                return Integer.valueOf(G);
            }
        });
        m = a.a(lazyThreadSafetyMode2, new d1a() { // from class: tb.zwy
            @Override // tb.d1a
            public final Object invoke() {
                int M;
                M = e3t.M();
                return Integer.valueOf(M);
            }
        });
        i = a.a(lazyThreadSafetyMode2, new d1a() { // from class: tb.gqz
            @Override // tb.d1a
            public final Object invoke() {
                int L;
                L = e3t.L();
                return Integer.valueOf(L);
            }
        });
        j = a.a(lazyThreadSafetyMode2, new d1a() { // from class: tb.m2t
            @Override // tb.d1a
            public final Object invoke() {
                int K;
                K = e3t.K();
                return Integer.valueOf(K);
            }
        });
        k = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.o2t
            @Override // tb.d1a
            public final Object invoke() {
                boolean F;
                F = e3t.F();
                return Boolean.valueOf(F);
            }
        });
        l = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.q2t
            @Override // tb.d1a
            public final Object invoke() {
                boolean H;
                H = e3t.H();
                return Boolean.valueOf(H);
            }
        });
    }

    public static final int D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af9508a4", new Object[0])).intValue();
        }
        return avs.INSTANCE.f("personalityNoticeMaxCount", 1);
    }

    public static final String E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd540d83", new Object[0]);
        }
        return avs.INSTANCE.h("personalityNoticeRegStrV2", yhs.DEFAULT_PLAN_B_PASSWORD_REGEX);
    }

    public static final boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("441effbf", new Object[0])).booleanValue();
        }
        return avs.INSTANCE.d("enableAccountNameWhiteUserData", true);
    }

    public static final int G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("80f89df2", new Object[0])).intValue();
        }
        return avs.INSTANCE.f("triggerSubscribeDelayTime", 40);
    }

    public static final boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("473795b", new Object[0])).booleanValue();
        }
        return avs.INSTANCE.d("enableHighLightComment", false);
    }

    public static final int K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68f55b6", new Object[0])).intValue();
        }
        return avs.INSTANCE.f("longNoticeRepeatCount", 3);
    }

    public static final int L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("91fb30fe", new Object[0])).intValue();
        }
        return avs.INSTANCE.f("shortNoticeDuration", 8);
    }

    public static final int M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9257b664", new Object[0])).intValue();
        }
        return avs.INSTANCE.f("showWidgetDelayTime", 60);
    }

    public static final List l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9955c9cd", new Object[0]);
        }
        List i2 = yz3.i();
        String j2 = avs.j(avs.INSTANCE, "interceptMessageCode", null, 2, null);
        if (!tvr.c(j2)) {
            return wsq.z0(j2, new String[]{","}, false, 0, 6, null);
        }
        return i2;
    }

    public static final String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e32ad3e0", new Object[0]);
        }
        return avs.j(avs.INSTANCE, "avatarMixComment", null, 2, null);
    }

    public static final boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f02365d1", new Object[0])).booleanValue();
        }
        return avs.INSTANCE.d("enableAIPersonalizedGreet", true);
    }

    public static final boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5ba18c5", new Object[0])).booleanValue();
        }
        return avs.INSTANCE.d("enablePersonalityNoticeV2", true);
    }

    public static final boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("feab3cb2", new Object[0])).booleanValue();
        }
        return avs.INSTANCE.d("enableSaysClusterAddOne", true);
    }

    public final int A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9038506c", new Object[]{this})).intValue();
        }
        return ((Number) i.getValue()).intValue();
    }

    public final int B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d2439e62", new Object[]{this})).intValue();
        }
        return ((Number) h.getValue()).intValue();
    }

    public final int I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e2832913", new Object[]{this})).intValue();
        }
        return ((Number) m.getValue()).intValue();
    }

    public final boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d419d84f", new Object[]{this})).booleanValue();
        }
        return ((Boolean) l.getValue()).booleanValue();
    }

    public final List<String> r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8fd0bfab", new Object[]{this});
        }
        return (List) b.getValue();
    }

    public final String s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("17c05c0b", new Object[]{this});
        }
        return (String) c.getValue();
    }

    public final boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4c9a943", new Object[]{this})).booleanValue();
        }
        return ((Boolean) f.getValue()).booleanValue();
    }

    public final boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1840c8a", new Object[]{this})).booleanValue();
        }
        return ((Boolean) k.getValue()).booleanValue();
    }

    public final boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b0a2178", new Object[]{this})).booleanValue();
        }
        return ((Boolean) e.getValue()).booleanValue();
    }

    public final boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c71eda9", new Object[]{this})).booleanValue();
        }
        return ((Boolean) f18247a.getValue()).booleanValue();
    }

    public final int x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4dd1a8e4", new Object[]{this})).intValue();
        }
        return ((Number) j.getValue()).intValue();
    }

    public final int y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d3315755", new Object[]{this})).intValue();
        }
        return ((Number) g.getValue()).intValue();
    }

    public final String z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f9c8540f", new Object[]{this});
        }
        return (String) d.getValue();
    }
}
