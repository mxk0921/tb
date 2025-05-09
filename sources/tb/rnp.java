package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class rnp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f27488a;
    public final boolean b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(766509094);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final rnp a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (rnp) ipChange.ipc$dispatch("206d9d99", new Object[]{this});
            }
            return new rnp(true, false, 2, null);
        }

        public final rnp b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (rnp) ipChange.ipc$dispatch("d3f194c2", new Object[]{this});
            }
            return new rnp(true, true);
        }

        public final rnp c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (rnp) ipChange.ipc$dispatch("f9b0724c", new Object[]{this});
            }
            return new rnp(false, false, 2, null);
        }

        public a() {
        }
    }

    static {
        t2o.a(766509093);
    }

    public rnp() {
        this(false, false, 3, null);
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b90c73ed", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23f4651a", new Object[]{this})).booleanValue();
        }
        return this.f27488a;
    }

    public rnp(boolean z, boolean z2) {
        this.f27488a = z;
        this.b = z2;
    }

    public /* synthetic */ rnp(boolean z, boolean z2, int i, a07 a07Var) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
