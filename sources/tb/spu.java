package tb;

import android.app.Application;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.TurboEngine;
import com.taobao.android.turbo.TurboEngineConfig;
import com.taobao.tao.Globals;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class spu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static TurboEngine f28211a;
    public static Context b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(919601160);
        }

        public a() {
        }

        @JvmStatic
        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f73bbeb", new Object[]{this});
                return;
            }
            TurboEngine b = spu.b();
            if (b != null) {
                b.onPageDestroy();
                spu.d(null);
            }
        }

        @JvmStatic
        public final TurboEngine b(TurboEngineConfig turboEngineConfig) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TurboEngine) ipChange.ipc$dispatch("6bcf6cfe", new Object[]{this, turboEngineConfig});
            }
            ckf.g(turboEngineConfig, "config");
            a();
            TurboEngine c = c(turboEngineConfig);
            spu.d(c);
            return c;
        }

        @JvmStatic
        public final TurboEngine c(TurboEngineConfig turboEngineConfig) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TurboEngine) ipChange.ipc$dispatch("d3ab888d", new Object[]{this, turboEngineConfig});
            }
            ckf.g(turboEngineConfig, "config");
            f(turboEngineConfig);
            return new TurboEngine(turboEngineConfig);
        }

        @JvmStatic
        public final Context d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("d3bbff99", new Object[]{this});
            }
            Context a2 = spu.a();
            if (a2 != null) {
                return a2;
            }
            Application application = Globals.getApplication();
            ckf.f(application, "Globals.getApplication()");
            return application;
        }

        @JvmStatic
        public final TurboEngine e(TurboEngineConfig turboEngineConfig) {
            Context context;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TurboEngine) ipChange.ipc$dispatch("87ea35a5", new Object[]{this, turboEngineConfig});
            }
            ckf.g(turboEngineConfig, "config");
            TurboEngine b = spu.b();
            if (b != null) {
                TurboEngineConfig turboEngineConfig2 = b.getTurboEngineConfig();
                if (turboEngineConfig2 != null) {
                    context = turboEngineConfig2.d();
                } else {
                    context = null;
                }
                if (!ckf.b(context, turboEngineConfig.d())) {
                    b.onPageDestroy();
                    spu.d(null);
                }
            }
            TurboEngine b2 = spu.b();
            if (b2 == null) {
                b2 = c(turboEngineConfig);
            } else {
                b2.updateTurboEngineConfig(turboEngineConfig);
            }
            spu.d(null);
            return b2;
        }

        public final void f(TurboEngineConfig turboEngineConfig) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c309b387", new Object[]{this, turboEngineConfig});
            } else if (spu.a() == null) {
                spu.c(turboEngineConfig.d().getApplicationContext());
            }
        }

        @JvmStatic
        public final TurboEngine g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TurboEngine) ipChange.ipc$dispatch("b1171bb0", new Object[]{this});
            }
            return spu.b();
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(919601159);
    }

    public static final /* synthetic */ Context a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("1e40ceb7", new Object[0]);
        }
        return b;
    }

    public static final /* synthetic */ TurboEngine b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TurboEngine) ipChange.ipc$dispatch("c0e443c5", new Object[0]);
        }
        return f28211a;
    }

    public static final /* synthetic */ void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63c6915d", new Object[]{context});
        } else {
            b = context;
        }
    }

    public static final /* synthetic */ void d(TurboEngine turboEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6d7e43", new Object[]{turboEngine});
        } else {
            f28211a = turboEngine;
        }
    }

    @JvmStatic
    public static final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f73bbeb", new Object[0]);
        } else {
            Companion.a();
        }
    }

    @JvmStatic
    public static final TurboEngine f(TurboEngineConfig turboEngineConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TurboEngine) ipChange.ipc$dispatch("6bcf6cfe", new Object[]{turboEngineConfig});
        }
        return Companion.b(turboEngineConfig);
    }

    @JvmStatic
    public static final Context g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("d3bbff99", new Object[0]);
        }
        return Companion.d();
    }

    @JvmStatic
    public static final TurboEngine h(TurboEngineConfig turboEngineConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TurboEngine) ipChange.ipc$dispatch("87ea35a5", new Object[]{turboEngineConfig});
        }
        return Companion.e(turboEngineConfig);
    }
}
