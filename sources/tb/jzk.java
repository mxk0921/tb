package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class jzk extends s2g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String c;
    public static final a Companion = new a(null);
    public static final jzk d = new jzk("LifeCycleIntent_WhenWatchComponentCreate");
    public static final jzk e = new jzk("LifeCycleIntent_WhenSingleComponentCreate");
    public static final jzk f = new jzk("LifeCycleIntent_WhenWatchComponentDidAppear");
    public static final jzk g = new jzk("LifeCycleIntent_WhenSingleComponentDidAppear");
    public static final jzk h = new jzk("LifeCycleIntent_WhenWatchComponentDidDisappear");
    public static final jzk i = new jzk("LifeCycleIntent_WhenSingleComponentDidDisappear");
    public static final jzk j = new jzk("LifeCycleIntent_WhenWatchComponentDestroy");
    public static final jzk k = new jzk("LifeCycleIntent_WhenSingleComponentDestroy");
    public static final jzk l = new jzk("LifeCycleIntent_WhenWatchComponentWillAppear");
    public static final jzk m = new jzk("LifeCycleIntent_WhenSingleComponentWillAppear");
    public static final jzk n = new jzk("LifeCycleIntent_WhenWatchComponentWillDisappear");
    public static final jzk o = new jzk("LifeCycleIntent_WhenSingleComponentWillDisappear");
    public static final jzk p = new jzk("LifeCycleIntent_WhenWatchComponentStartTransition");
    public static final jzk q = new jzk("LifeCycleIntent_WhenSingleComponentStartTransition");
    public static final jzk r = new jzk("LifeCycleIntent_WhenWatchComponentSwipeAnimationEnd");
    public static final jzk s = new jzk("LifeCycleIntent_WhenSingleComponentSwipeAnimationEnd");
    public static final jzk t = new jzk("LifeCycleIntent_WhenWatchComponentSwipeAnimationStart");
    public static final jzk u = new jzk("LifeCycleIntent_WhenSingleComponentSwipeAnimationStart");
    public static final jzk v = new jzk("LifeCycleIntent_WhenWatchComponentCreate");
    public static final jzk w = new jzk("LifeCycleIntent_WhenSingleComponentContainerWillAppear");
    public static final jzk x = new jzk("LifeCycleIntent_WhenSingleComponentContainerDidAppear");
    public static final jzk y = new jzk("LifeCycleIntent_WhenSingleComponentContainerWillDisappear");
    public static final jzk z = new jzk("LifeCycleIntent_WhenSingleComponentContainerDidDisappear");
    public static final jzk A = new jzk("LifeCycleIntent_WhenSingleComponentContainerDestroy");
    public static final jzk B = new jzk("LifeCycleIntent_WhenWatchComponentBack");
    public static final jzk C = new jzk("LifeCycleIntent_WhenSingleComponentBack");
    public static final jzk D = new jzk("DataServiceIntent_WhenLiveDetailResponseCallback");
    public static final jzk E = new jzk("DataServiceIntent_WhenLiveBizComponentDidAppear");
    public static final jzk F = new jzk("DataServiceIntent_PowerMsgReceiveMessage");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1004536525);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final jzk A() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jzk) ipChange.ipc$dispatch("d4bc24ff", new Object[]{this});
            }
            return jzk.C();
        }

        public final jzk B() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jzk) ipChange.ipc$dispatch("a2b1f822", new Object[]{this});
            }
            return jzk.D();
        }

        public final jzk C() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jzk) ipChange.ipc$dispatch("458a1146", new Object[]{this});
            }
            return jzk.E();
        }

        public final jzk a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jzk) ipChange.ipc$dispatch("b334cb12", new Object[]{this});
            }
            return jzk.c();
        }

        public final jzk b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jzk) ipChange.ipc$dispatch("cf8a60ea", new Object[]{this});
            }
            return jzk.d();
        }

        public final jzk c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jzk) ipChange.ipc$dispatch("270b1075", new Object[]{this});
            }
            return jzk.e();
        }

        public final jzk d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jzk) ipChange.ipc$dispatch("ad4df5ad", new Object[]{this});
            }
            return jzk.f();
        }

        public final jzk e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jzk) ipChange.ipc$dispatch("af5e848f", new Object[]{this});
            }
            return jzk.g();
        }

        public final jzk f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jzk) ipChange.ipc$dispatch("60db341b", new Object[]{this});
            }
            return jzk.h();
        }

        public final jzk g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jzk) ipChange.ipc$dispatch("9c7fb2a1", new Object[]{this});
            }
            return jzk.i();
        }

        public final jzk h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jzk) ipChange.ipc$dispatch("3163d267", new Object[]{this});
            }
            return jzk.j();
        }

        public final jzk i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jzk) ipChange.ipc$dispatch("ce9689a4", new Object[]{this});
            }
            return jzk.k();
        }

        public final jzk j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jzk) ipChange.ipc$dispatch("214af884", new Object[]{this});
            }
            return jzk.l();
        }

        public final jzk k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jzk) ipChange.ipc$dispatch("679182f8", new Object[]{this});
            }
            return jzk.m();
        }

        public final jzk l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jzk) ipChange.ipc$dispatch("af0802d2", new Object[]{this});
            }
            return jzk.n();
        }

        public final jzk m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jzk) ipChange.ipc$dispatch("12b3af98", new Object[]{this});
            }
            return jzk.o();
        }

        public final jzk n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jzk) ipChange.ipc$dispatch("9d4e9e10", new Object[]{this});
            }
            return jzk.p();
        }

        public final jzk o() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jzk) ipChange.ipc$dispatch("e8530d5", new Object[]{this});
            }
            return jzk.q();
        }

        public final jzk p() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jzk) ipChange.ipc$dispatch("dbcde0db", new Object[]{this});
            }
            return jzk.r();
        }

        public final jzk q() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jzk) ipChange.ipc$dispatch("cac799f4", new Object[]{this});
            }
            return jzk.s();
        }

        public final jzk r() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jzk) ipChange.ipc$dispatch("1ee22b8d", new Object[]{this});
            }
            return jzk.t();
        }

        public final jzk s() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jzk) ipChange.ipc$dispatch("32b9a1fb", new Object[]{this});
            }
            return jzk.u();
        }

        public final jzk t() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jzk) ipChange.ipc$dispatch("89c41602", new Object[]{this});
            }
            return jzk.v();
        }

        public final jzk u() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jzk) ipChange.ipc$dispatch("ff00e20d", new Object[]{this});
            }
            return jzk.w();
        }

        public final jzk v() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jzk) ipChange.ipc$dispatch("584865d", new Object[]{this});
            }
            return jzk.x();
        }

        public final jzk w() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jzk) ipChange.ipc$dispatch("bc1d7c63", new Object[]{this});
            }
            return jzk.y();
        }

        public final jzk x() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jzk) ipChange.ipc$dispatch("6c5d9965", new Object[]{this});
            }
            return jzk.z();
        }

        public final jzk y() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jzk) ipChange.ipc$dispatch("aef6f960", new Object[]{this});
            }
            return jzk.A();
        }

        public final jzk z() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jzk) ipChange.ipc$dispatch("26efb2a6", new Object[]{this});
            }
            return jzk.B();
        }

        public a() {
        }
    }

    static {
        t2o.a(1004536524);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jzk(String str) {
        super(str);
        ckf.g(str, "code");
        this.c = str;
    }

    public static final /* synthetic */ jzk A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzk) ipChange.ipc$dispatch("2f33a2f", new Object[0]);
        }
        return p;
    }

    public static final /* synthetic */ jzk B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzk) ipChange.ipc$dispatch("ff5ee329", new Object[0]);
        }
        return r;
    }

    public static final /* synthetic */ jzk C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzk) ipChange.ipc$dispatch("c72cd630", new Object[0]);
        }
        return t;
    }

    public static final /* synthetic */ jzk D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzk) ipChange.ipc$dispatch("b17895ad", new Object[0]);
        }
        return l;
    }

    public static final /* synthetic */ jzk E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzk) ipChange.ipc$dispatch("96262089", new Object[0]);
        }
        return n;
    }

    public static final /* synthetic */ jzk c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzk) ipChange.ipc$dispatch("110ffcbd", new Object[0]);
        }
        return F;
    }

    public static final /* synthetic */ jzk d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzk) ipChange.ipc$dispatch("f059fe65", new Object[0]);
        }
        return E;
    }

    public static final /* synthetic */ jzk e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzk) ipChange.ipc$dispatch("9847d87a", new Object[0]);
        }
        return D;
    }

    public static final /* synthetic */ jzk f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzk) ipChange.ipc$dispatch("6401cec2", new Object[0]);
        }
        return C;
    }

    public static final /* synthetic */ jzk g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzk) ipChange.ipc$dispatch("928a8620", new Object[0]);
        }
        return v;
    }

    public static final /* synthetic */ jzk h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzk) ipChange.ipc$dispatch("346cf194", new Object[0]);
        }
        return A;
    }

    public static final /* synthetic */ jzk i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzk) ipChange.ipc$dispatch("84ebcd4e", new Object[0]);
        }
        return x;
    }

    public static /* synthetic */ Object ipc$super(jzk jzkVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/intent/OpenArchIntentIdentifier");
    }

    public static final /* synthetic */ jzk j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzk) ipChange.ipc$dispatch("431cb948", new Object[0]);
        }
        return z;
    }

    public static final /* synthetic */ jzk k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzk) ipChange.ipc$dispatch("2ba38ceb", new Object[0]);
        }
        return w;
    }

    public static final /* synthetic */ jzk l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzk) ipChange.ipc$dispatch("641ff88b", new Object[0]);
        }
        return y;
    }

    public static final /* synthetic */ jzk m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzk) ipChange.ipc$dispatch("95806997", new Object[0]);
        }
        return e;
    }

    public static final /* synthetic */ jzk n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzk) ipChange.ipc$dispatch("90337cfd", new Object[0]);
        }
        return k;
    }

    public static final /* synthetic */ jzk o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzk) ipChange.ipc$dispatch("93d2277", new Object[0]);
        }
        return g;
    }

    public static final /* synthetic */ jzk p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzk) ipChange.ipc$dispatch("37e1e77f", new Object[0]);
        }
        return i;
    }

    public static final /* synthetic */ jzk q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzk) ipChange.ipc$dispatch("67f42c1a", new Object[0]);
        }
        return q;
    }

    public static final /* synthetic */ jzk r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzk) ipChange.ipc$dispatch("27eb0654", new Object[0]);
        }
        return s;
    }

    public static final /* synthetic */ jzk s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzk) ipChange.ipc$dispatch("fd3cda9b", new Object[0]);
        }
        return u;
    }

    public static final /* synthetic */ jzk t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzk) ipChange.ipc$dispatch("317cdce2", new Object[0]);
        }
        return m;
    }

    public static final /* synthetic */ jzk u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzk) ipChange.ipc$dispatch("8009134", new Object[0]);
        }
        return o;
    }

    public static final /* synthetic */ jzk v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzk) ipChange.ipc$dispatch("163ebbcd", new Object[0]);
        }
        return B;
    }

    public static final /* synthetic */ jzk w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzk) ipChange.ipc$dispatch("ac363fe2", new Object[0]);
        }
        return d;
    }

    public static final /* synthetic */ jzk x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzk) ipChange.ipc$dispatch("50387012", new Object[0]);
        }
        return j;
    }

    public static final /* synthetic */ jzk y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzk) ipChange.ipc$dispatch("dbd1a44c", new Object[0]);
        }
        return f;
    }

    public static final /* synthetic */ jzk z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzk) ipChange.ipc$dispatch("a7d2998a", new Object[0]);
        }
        return h;
    }

    @Override // tb.s2g
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa4e0476", new Object[]{this});
        }
        return this.c;
    }
}
