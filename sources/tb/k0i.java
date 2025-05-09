package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.BootstrapMode;
import tb.fuk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class k0i extends ihj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final boolean c;
    public hf1 d;
    public hf1 e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements fuk.a<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(k0i k0iVar) {
        }

        @Override // tb.fuk.a
        public void a(v35<String> v35Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f0335d16", new Object[]{this, v35Var});
            } else {
                v35Var.c("InitHomeMDataRefreshLauncher");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements fuk.a<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f22321a;
        public final /* synthetic */ boolean b;

        public b(boolean z, boolean z2) {
            this.f22321a = z;
            this.b = z2;
        }

        @Override // tb.fuk.a
        public void a(v35<String> v35Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f0335d16", new Object[]{this, v35Var});
                return;
            }
            if (this.f22321a && !k0i.i(k0i.this)) {
                v35Var.c("InitBehaviX");
                v35Var.c("InitPopMin");
            }
            if (this.b && !k0i.i(k0i.this)) {
                v35Var.c("InitBootImage");
            }
            if (!k0i.i(k0i.this)) {
                v35Var.g("InitAPMMin");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements fuk.a<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(k0i k0iVar) {
        }

        @Override // tb.fuk.a
        public void a(v35<String> v35Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f0335d16", new Object[]{this, v35Var});
            } else {
                v35Var.c("InitPopConfigLoadTask");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ fuk f22322a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements fuk.a<String> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a(d dVar) {
            }

            @Override // tb.fuk.a
            public void a(v35<String> v35Var) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f0335d16", new Object[]{this, v35Var});
                    return;
                }
                v35Var.d("InitDXMin", "InitHomeCache");
                v35Var.d("InitDeviceScore", "InitHomeCache");
                v35Var.d("InitHomeMinOpt", "InitHomeCache");
                v35Var.d("InitPhenixMin", "InitHomeCache");
                v35Var.d("InitHomeMinOpt", "InitHomePreRequestLauncher");
                v35Var.c("InitHomePreloadCache");
            }
        }

        public d(fuk fukVar) {
            this.f22322a = fukVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f22322a.e("minKernelWithNetwork", new a(this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ fuk f22323a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements fuk.a<String> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // tb.fuk.a
            public void a(v35<String> v35Var) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f0335d16", new Object[]{this, v35Var});
                    return;
                }
                if (e.this.b) {
                    v35Var.c("InitBehaviX");
                    v35Var.c("InitPopMin");
                }
                if (e.this.c) {
                    v35Var.c("InitBootImage");
                }
                if (k0i.i(k0i.this)) {
                    v35Var.c("InitAPMMin");
                }
            }
        }

        public e(fuk fukVar, boolean z, boolean z2) {
            this.f22323a = fukVar;
            this.b = z;
            this.c = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f22323a.e("minKernelForExtra", new a());
            }
        }
    }

    public k0i(Context context, sgg sggVar, int i) {
        super(context, sggVar, i);
        this.c = !BootstrapMode.e(i, 1024) && t.a(context, "ngConcurrencyEnable");
    }

    public static /* synthetic */ boolean i(k0i k0iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a76d4eb3", new Object[]{k0iVar})).booleanValue();
        }
        return k0iVar.c;
    }

    public static /* synthetic */ Object ipc$super(k0i k0iVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/bootstrap/tao/perf/schedulers/MainNGNextScheduler");
    }

    @Override // tb.hhj
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e7617c0", new Object[]{this});
            return;
        }
        iqk iqkVar = this.f21312a;
        if (iqkVar instanceof fuk) {
            ((fuk) iqkVar).t("m-boot-image-extra", new c(this));
        }
    }

    @Override // tb.ihj, tb.hhj
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("910a4c02", new Object[]{this});
            return;
        }
        w35.a("awaitLoaded");
        hf1 hf1Var = this.d;
        if (hf1Var != null) {
            hf1Var.d();
        }
        w35.c();
    }

    @Override // tb.hhj
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c762be7e", new Object[]{this});
        } else if (this.f21312a instanceof fuk) {
            ((fuk) this.f21312a).t("APM", new b(BootstrapMode.e(this.b, 64), BootstrapMode.e(this.b, 32)));
        }
    }

    @Override // tb.hhj
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4532f39e", new Object[]{this});
            return;
        }
        iqk iqkVar = this.f21312a;
        if (iqkVar instanceof fuk) {
            k((fuk) iqkVar);
        }
    }

    @Override // tb.hhj
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("404e3750", new Object[]{this});
            return;
        }
        iqk iqkVar = this.f21312a;
        if (iqkVar instanceof fuk) {
            ((fuk) iqkVar).e("minKernelLaunched", new a(this));
        }
    }

    @Override // tb.ihj, tb.hhj
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0786e06", new Object[]{this});
            return;
        }
        w35.a("awaitExtraLoaded");
        hf1 hf1Var = this.e;
        if (hf1Var != null) {
            hf1Var.d();
        }
        w35.c();
    }

    public final void j(fuk<String> fukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1db3c9e0", new Object[]{this, fukVar});
        } else {
            this.e = hf1.f("minKernelForExtra", new e(fukVar, BootstrapMode.e(this.b, 64), BootstrapMode.e(this.b, 32))).c();
        }
    }

    public final void k(fuk<String> fukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d41936d", new Object[]{this, fukVar});
            return;
        }
        if (this.c) {
            j(fukVar);
        }
        this.d = hf1.f("minKernelWithNetwork", new d(fukVar)).c();
    }
}
