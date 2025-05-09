package tb;

import com.ali.alihadeviceevaluator.network.RemoteDeviceManager;
import com.android.alibaba.ip.runtime.IpChange;
import tb.rp0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class rl0 implements RemoteDeviceManager.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String K_IMMUTABLE = "immutable";
    public static final String K_LAST_TIMESTAMP = "lasttimestamp";
    public static final String K_SCORE = "score";
    public static final String K_SWITCH = "switch";
    public static final String K_VALID_PERIOD = "validperiod";

    /* renamed from: a  reason: collision with root package name */
    public volatile float f27451a = -1.0f;
    public volatile float b = -1.0f;
    public volatile Float c = null;
    public volatile float d = -1.0f;
    public volatile boolean e = false;
    public rp0.a f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                rl0.a(rl0.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
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
                rl0.a(rl0.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f27454a;

        public c(float f) {
            this.f27454a = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            float f = this.f27454a;
            if (f > 0.0f && f <= 100.0f) {
                rl0 rl0Var = rl0.this;
                rl0.c(rl0Var, rl0.d(rl0Var, f));
                rl0 rl0Var2 = rl0.this;
                rl0.e(rl0Var2, rl0.b(rl0Var2));
                m1g.a().putLong(rl0.K_LAST_TIMESTAMP, System.currentTimeMillis());
                m1g.a().putFloat("score", this.f27454a);
                m1g.a().commit();
            }
        }
    }

    public static /* synthetic */ void a(rl0 rl0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55ee9946", new Object[]{rl0Var});
        } else {
            rl0Var.f();
        }
    }

    public static /* synthetic */ float b(rl0 rl0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9979b6f7", new Object[]{rl0Var})).floatValue();
        }
        return rl0Var.d;
    }

    public static /* synthetic */ float c(rl0 rl0Var, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7910ddc7", new Object[]{rl0Var, new Float(f)})).floatValue();
        }
        rl0Var.d = f;
        return f;
    }

    public static /* synthetic */ float d(rl0 rl0Var, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6e97826", new Object[]{rl0Var, new Float(f)})).floatValue();
        }
        rl0Var.f27451a = f;
        return f;
    }

    public static /* synthetic */ void e(rl0 rl0Var, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f16ec657", new Object[]{rl0Var, new Float(f)});
        } else {
            rl0Var.m(f);
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("547c1249", new Object[]{this});
        } else if (!j() && !this.e) {
            new RemoteDeviceManager(this).fetchData(h());
            this.e = true;
        }
    }

    public float h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e89be1d", new Object[]{this})).floatValue();
        }
        float f = -1.0f;
        if (this.d != -1.0f) {
            f = this.d;
        } else if (this.b != -1.0f) {
            f = this.b;
        }
        if (f < 0.0f) {
            f = 80.0f;
        }
        if (!z9a.c) {
            return 10.0f;
        }
        return f;
    }

    public float i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66cd505c", new Object[]{this})).floatValue();
        }
        float f = -1.0f;
        if (this.c == null) {
            synchronized (this) {
                try {
                    if (this.c == null) {
                        if (this.f27451a != -1.0f) {
                            this.c = Float.valueOf(this.f27451a);
                        } else if (this.b != -1.0f) {
                            this.c = Float.valueOf(this.b);
                        } else {
                            this.c = Float.valueOf(-1.0f);
                        }
                        new StringBuilder("load ai score from immutable score = ").append(this.c);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (this.c != null) {
            f = this.c.floatValue();
        }
        if (f < 0.0f) {
            f = 80.0f;
        }
        if (!z9a.c) {
            return 10.0f;
        }
        return f;
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9abbaa01", new Object[]{this});
        } else {
            l();
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8b3ddb2", new Object[]{this});
            return;
        }
        if (m1g.b() != null && m1g.b().contains("score")) {
            this.b = m1g.b().getFloat("score", 100.0f);
        }
        new StringBuilder("load ai score from local. score = ").append(this.b);
    }

    public final void m(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c04f71c", new Object[]{this, new Float(f)});
            return;
        }
        if (qp0.b != null && qp0.b.booleanValue()) {
            f = i();
        }
        rp0.a aVar = this.f;
        if (aVar != null) {
            aVar.a(g(f), (int) f);
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8bb1183", new Object[]{this});
            return;
        }
        if (this.b != -1.0f) {
            m(this.b);
        } else {
            m(100.0f);
        }
        this.e = false;
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83511829", new Object[]{this});
        } else if (!j()) {
            z9a.b.postDelayed(new b(), 5000L);
        }
    }

    public void p(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("446ee295", new Object[]{this, new Float(f)});
            return;
        }
        new StringBuilder("load ai score from remote. score = ").append(f);
        this.e = false;
        z9a.b.post(new c(f));
    }

    public void q(rp0.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0938e7e", new Object[]{this, aVar});
        } else {
            this.f = aVar;
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        l();
        if (j()) {
            this.d = this.b;
            m(this.d);
            return;
        }
        z9a.b.postDelayed(new a(), 5000L);
    }

    public static int g(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("609e5974", new Object[]{new Float(f)})).intValue();
        }
        if (m1g.b() != null && !m1g.b().getBoolean("switch", true)) {
            return -3;
        }
        if (f >= 80.0f) {
            return 0;
        }
        if (f >= 20.0f) {
            return 1;
        }
        return f >= 0.0f ? 2 : -2;
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c66c76d6", new Object[]{this})).booleanValue();
        }
        if (!m1g.b().contains("score") || !m1g.b().contains(K_LAST_TIMESTAMP)) {
            return false;
        }
        return System.currentTimeMillis() < m1g.b().getLong(K_LAST_TIMESTAMP, 0L) + z9a.a(!m1g.b().contains(K_VALID_PERIOD) ? 24L : m1g.b().getLong(K_VALID_PERIOD, 0L));
    }
}
