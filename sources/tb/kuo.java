package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class kuo implements jn2<ouo> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_CORE_SIZE = 3;
    public static final int DEFAULT_KEEP_ALIVE = 8;
    public static final int DEFAULT_MAX_RUNNING = 6;
    public static final int DEFAULT_PATIENCE_CAPACITY = 1500;
    public static final int DEFAULT_QUEUE_CAPACITY = 5;
    public static final int INVALID_NETWORK_RUNNING_EXPIRED = -1;
    public static final int MAX_DECODE_RUNNING = 3;
    public static final int MAX_NETWORK_RUNNING_AT_FAST = 5;
    public static final int MAX_NETWORK_RUNNING_AT_SLOW = 2;
    public static final int MIN_PATIENCE_CAPACITY = 500;
    public static final int VALID_NETWORK_RUNNING_EXPIRED = 25000;

    /* renamed from: a  reason: collision with root package name */
    public boolean f22934a;
    public ouo k;
    public int b = 3;
    public int c = 5;
    public int d = 2;
    public int e = -1;
    public final int f = 3;
    public int g = 6;
    public int h = 8;
    public final int i = 5;
    public final int j = 1500;
    public final boolean l = true;
    public boolean m = true;

    static {
        t2o.a(620757023);
        t2o.a(620757013);
    }

    public synchronized ouo a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ouo) ipChange.ipc$dispatch("74cfca7c", new Object[]{this});
        }
        if (!this.f22934a && this.k == null) {
            f57 f57Var = new f57(null, this.f, this.g, this.h, this.i, this.j, this.b, this.c, this.d, this.e, this.l, this.m);
            this.k = f57Var;
            this.f22934a = true;
            return f57Var;
        }
        return this.k;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6baf3e7f", new Object[]{this})).booleanValue();
        }
        return this.f22934a;
    }

    public kuo c(int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kuo) ipChange.ipc$dispatch("2d0a1471", new Object[]{this, new Integer(i)});
        }
        fpm.e(!this.f22934a, "SchedulerSupplier has been built, not allow keepAlive() now");
        if (i <= 0) {
            z = false;
        }
        fpm.e(z, "keep alive time must be greater than zero");
        this.h = i;
        return this;
    }

    public kuo d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kuo) ipChange.ipc$dispatch("1bd26e80", new Object[]{this, new Boolean(z)});
        }
        this.m = z;
        return this;
    }

    public kuo e(int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kuo) ipChange.ipc$dispatch("45da8f16", new Object[]{this, new Integer(i)});
        }
        fpm.e(!this.f22934a, "SchedulerSupplier has been built, not allow maxDecodeRunning() now");
        if (i > this.g) {
            z = false;
        }
        fpm.e(z, "max decode running cannot be greater than max running");
        this.b = i;
        return this;
    }

    public kuo f(int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kuo) ipChange.ipc$dispatch("4163d1ed", new Object[]{this, new Integer(i)});
        }
        fpm.e(!this.f22934a, "SchedulerSupplier has been built, not allow maxNetworkRunningAtFast() now");
        if (i > this.g) {
            z = false;
        }
        fpm.e(z, "max network running at fast cannot be greater than max running");
        this.c = i;
        return this;
    }

    public kuo g(int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kuo) ipChange.ipc$dispatch("b4542592", new Object[]{this, new Integer(i)});
        }
        fpm.e(!this.f22934a, "SchedulerSupplier has been built, not allow maxNetworkRunningAtSlow() now");
        if (i > this.g) {
            z = false;
        }
        fpm.e(z, "max network running at slow cannot be greater than max running");
        this.d = i;
        return this;
    }

    public kuo h(int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kuo) ipChange.ipc$dispatch("df4c49e4", new Object[]{this, new Integer(i)});
        }
        fpm.e(!this.f22934a, "SchedulerSupplier has been built, not allow maxRunning() now");
        if (i < this.f) {
            z = false;
        }
        fpm.e(z, "max running cannot be lower than core size");
        this.g = i;
        return this;
    }

    public kuo i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kuo) ipChange.ipc$dispatch("6600e65d", new Object[]{this, new Integer(i)});
        }
        fpm.e(true ^ this.f22934a, "SchedulerSupplier has been built, not allow networkRunningExpired() now");
        this.e = i;
        return this;
    }
}
