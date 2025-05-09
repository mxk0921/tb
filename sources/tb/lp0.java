package tb;

import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class lp0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONFIG_CPUTRACKTICK = "cpuTrackTick";
    public static final int DEVICE_IS_FATAL = 3;
    public static final int DEVICE_IS_GOOD = 0;
    public static final int DEVICE_IS_NORMAL = 1;
    public static final int DEVICE_IS_RISKY = 2;
    public static final int HIGH_END_DEVICE = 0;
    public static final int LOW_END_DEVICE = 2;
    public static final int MEDIUM_DEVICE = 1;

    /* renamed from: a  reason: collision with root package name */
    public volatile c f23475a;
    public volatile b b;
    public volatile jp0 c;
    public volatile d d;
    public volatile np0 e;
    public volatile e f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public int f23476a = 0;
        public float b = 0.0f;
        public float c = -1.0f;
        public float d = -1.0f;
        public int e = -1;
        public int f = -1;

        public b(lp0 lp0Var) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        public float f23477a = 0.0f;
        public int b = 0;
        public int c = 0;
        public String d = "0";
        public int e = -1;

        public c(lp0 lp0Var) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        public long f23478a;
        public long b;
        public long c;
        public long d;
        public long e;
        public long f;
        public long g;
        public long h;
        public long i;
        public int j = -1;
        public int k = -1;

        public d(lp0 lp0Var) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int b;

        /* renamed from: a  reason: collision with root package name */
        public int f23479a = -1;
        public int c = -1;

        public e(lp0 lp0Var) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final lp0 f23480a = new lp0();

        public static /* synthetic */ lp0 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (lp0) ipChange.ipc$dispatch("33b9bf3c", new Object[0]);
            }
            return f23480a;
        }
    }

    public static lp0 d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lp0) ipChange.ipc$dispatch("538f4a2", new Object[0]);
        }
        return f.a();
    }

    public final int a(int i, int... iArr) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f1b292", new Object[]{this, new Integer(i), iArr})).intValue();
        }
        if (-1 == i) {
            return -1;
        }
        while (true) {
            if (i2 >= iArr.length) {
                i2 = -1;
                break;
            } else if (i >= iArr[i2]) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1 || i < 0) {
            return i2;
        }
        return iArr.length;
    }

    public b b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("9514225b", new Object[]{this});
        }
        if (z9a.f32627a == null) {
            return new b(this);
        }
        if (this.b == null) {
            ip0 ip0Var = new ip0();
            ip0Var.a();
            if (this.c == null) {
                this.c = new jp0(Process.myPid(), z9a.b);
            }
            this.b = new b(this);
            this.b.f23476a = ip0Var.f21488a;
            this.b.b = ip0Var.c;
            this.b.getClass();
            this.b.e = a(ip0Var.e, 8, 5);
        }
        this.b.c = this.c.d();
        this.b.d = this.c.c();
        this.b.f = a((int) (100.0f - this.b.d), 90, 60, 20);
        return this.b;
    }

    public c c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("c9408f27", new Object[]{this});
        }
        if (z9a.f32627a == null) {
            return new c(this);
        }
        if (this.f23475a == null) {
            kp0 a2 = kp0.a(z9a.f32627a);
            this.f23475a = new c(this);
            this.f23475a.f23477a = a2.f22819a;
            this.f23475a.c = a2.c;
            this.f23475a.b = a2.b;
            pp0 pp0Var = new pp0();
            pp0Var.a(z9a.f32627a);
            this.f23475a.d = String.valueOf(pp0Var.f26220a);
            this.f23475a.e = a(pp0Var.b, 8, 6);
        }
        return this.f23475a;
    }

    public d e() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("1e5d31fb", new Object[]{this});
        }
        if (z9a.f32627a == null) {
            return new d(this);
        }
        if (this.d == null) {
            this.d = new d(this);
            this.e = new np0();
        }
        try {
            long[] a2 = this.e.a();
            this.d.f23478a = a2[0];
            this.d.b = a2[1];
            long[] b2 = this.e.b();
            this.d.c = b2[0];
            d dVar = this.d;
            long j = b2[1];
            dVar.d = j;
            long j2 = b2[0];
            int i2 = -1;
            if (j2 != 0) {
                i = (int) ((j * 100.0d) / j2);
            } else {
                i = -1;
            }
            long[] c2 = this.e.c();
            this.d.e = c2[0];
            d dVar2 = this.d;
            long j3 = c2[1];
            dVar2.f = j3;
            long j4 = c2[0];
            if (j4 != 0) {
                i2 = (int) ((j3 * 100.0d) / j4);
            }
            long[] f2 = this.e.f(z9a.f32627a, Process.myPid());
            this.d.g = f2[0];
            this.d.h = f2[1];
            this.d.i = f2[2];
            this.d.j = a((int) this.d.f23478a, 5242880, 2621440);
            this.d.k = Math.round((a(100 - i, 70, 50, 30) + a(100 - i2, 60, 40, 20)) / 2.0f);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return this.d;
    }

    @Deprecated
    public e f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("d5347027", new Object[]{this});
        }
        if (z9a.f32627a == null) {
            return new e(this);
        }
        if (this.f == null) {
            this.f = new e(this);
            if (this.d == null) {
                e();
            }
            if (this.b == null) {
                b();
            }
            if (this.f23475a == null) {
                c();
            }
            this.f.b = Math.round((((this.d.j * 0.9f) + (this.b.e * 1.5f)) + (this.f23475a.e * 0.6f)) / 3.0f);
            this.f.c = Math.round((this.d.k + this.b.f) / 2.0f);
        } else {
            if (this.d == null) {
                e();
            }
            if (this.b == null) {
                b();
            }
            if (this.f23475a == null) {
                c();
            }
            this.f.c = Math.round(((this.d.k * 0.8f) + (this.b.f * 1.2f)) / 2.0f);
        }
        return this.f;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae9cb337", new Object[]{this});
        } else if (this.c != null) {
            this.c.e(0L);
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("374ab4cc", new Object[]{this});
        } else if (this.c != null) {
            this.c.e(this.c.s);
        }
    }

    public lp0() {
        this.c = new jp0(Process.myPid(), z9a.b);
    }

    public void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56ab0f82", new Object[]{this, new Integer(i)});
            return;
        }
        new StringBuilder("om setDeviceScore to outline score =").append(i);
        if (i > 0) {
            if (this.f == null) {
                f();
            }
            if (this.f != null) {
                this.f.getClass();
                if (i >= 90) {
                    this.f.f23479a = 0;
                } else if (i >= 70) {
                    this.f.f23479a = 1;
                } else {
                    this.f.f23479a = 2;
                }
            }
        }
    }
}
