package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class g73 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public long f19767a;
    public int b;
    public long c;
    public int d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(481297455);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(481297454);
    }

    public final long a() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("41e513ae", new Object[]{this})).longValue();
        }
        long j = this.c;
        if (j == 0 || (i = this.d) == 0) {
            return 0L;
        }
        return j / i;
    }

    public final long b() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7750ac1e", new Object[]{this})).longValue();
        }
        long j = this.f19767a;
        if (j == 0 || (i = this.b) == 0) {
            return 0L;
        }
        return j / i;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.f19767a = 0L;
        this.b = 0;
        this.c = 0L;
        this.d = 0;
    }

    public final void d(long j) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba3f75c7", new Object[]{this, new Long(j)});
        } else if (j > 0 && (i = this.d) <= 200) {
            this.c += j;
            this.d = i + 1;
        }
    }

    public final void e(long j) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("832863bd", new Object[]{this, new Long(j)});
        } else if (j > 0 && (i = this.b) <= 200) {
            this.f19767a += 1000 / j;
            this.b = i + 1;
        }
    }
}
