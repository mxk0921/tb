package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidService;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import java.util.Objects;
import tb.o6d;
import tb.wlb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class irv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f21535a;
    public String c;
    public final a d = new a();
    public final c e = new c();
    public final x3c b = uru.Companion.a().d();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public long f21536a;
        public long b;

        static {
            t2o.a(468713558);
        }

        public a() {
        }

        public final int a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("64e6a832", new Object[]{this, new Integer(i)})).intValue();
            }
            if (i == 0) {
                return 0;
            }
            if (i == 1) {
                return 1;
            }
            if (i == 2) {
                return 2;
            }
            if (i != 3) {
                return 3;
            }
            return 1;
        }

        public void b(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b6fc56c", new Object[]{this, uq9Var});
                return;
            }
            this.f21536a = SystemClock.elapsedRealtime();
            this.b = System.currentTimeMillis();
        }

        public void c(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e9c725bc", new Object[]{this, uq9Var});
                return;
            }
            g83 g83Var = new g83(irv.a(irv.this), this.b, (int) (SystemClock.elapsedRealtime() - this.f21536a), uq9Var.M(), uq9Var.P(), a(uq9Var.J()), null);
            x3c b = irv.b(irv.this);
            Objects.requireNonNull(b);
            b.a(g83Var);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b extends wlb.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(468713559);
        }

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1249298707) {
                super.onDisActive((uq9) objArr[0]);
                return null;
            } else if (hashCode == -147728739) {
                super.onActive((uq9) objArr[0]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/fluid/business/usercontext/UserEventMonitor$CardOriginLifeCycle");
            }
        }

        @Override // tb.wlb.a, tb.wlb
        public void onActive(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f731d69d", new Object[]{this, uq9Var});
                return;
            }
            super.onActive(uq9Var);
            irv.c(irv.this).b(uq9Var);
        }

        @Override // tb.wlb.a, tb.wlb
        public void onDisActive(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b58936ed", new Object[]{this, uq9Var});
                return;
            }
            super.onDisActive(uq9Var);
            irv.c(irv.this).c(uq9Var);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public long f21538a;

        static {
            t2o.a(468713560);
        }

        public c() {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("321cdedb", new Object[]{this});
                return;
            }
            this.f21538a = SystemClock.elapsedRealtime();
            eml emlVar = new eml(irv.a(irv.this), System.currentTimeMillis(), null);
            x3c b = irv.b(irv.this);
            Objects.requireNonNull(b);
            b.a(emlVar);
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4aa7eb2b", new Object[]{this});
                return;
            }
            fnl fnlVar = new fnl(irv.a(irv.this), System.currentTimeMillis(), (int) (SystemClock.elapsedRealtime() - this.f21538a), null);
            x3c b = irv.b(irv.this);
            Objects.requireNonNull(b);
            b.a(fnlVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d extends o6d.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(468713561);
        }

        public d() {
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == 188604040) {
                super.onStop();
                return null;
            } else if (hashCode == 2133689546) {
                super.onStart();
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/fluid/business/usercontext/UserEventMonitor$PageOriginLifecycle");
            }
        }

        @Override // tb.o6d.a, tb.o6d
        public void onStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
                return;
            }
            super.onStart();
            FluidService service = irv.d(irv.this).getService(ICardService.class);
            Objects.requireNonNull(service);
            uq9 activeCard = ((ICardService) service).getActiveCard();
            if (activeCard != null) {
                irv.c(irv.this).b(activeCard);
            }
            irv.e(irv.this).a();
        }

        @Override // tb.o6d.a, tb.o6d
        public void onStop() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3dde88", new Object[]{this});
                return;
            }
            super.onStop();
            FluidService service = irv.d(irv.this).getService(ICardService.class);
            Objects.requireNonNull(service);
            uq9 activeCard = ((ICardService) service).getActiveCard();
            if (activeCard != null) {
                irv.c(irv.this).c(activeCard);
            }
            irv.e(irv.this).b();
        }
    }

    static {
        t2o.a(468713557);
    }

    public irv(FluidContext fluidContext) {
        this.f21535a = fluidContext;
    }

    public static /* synthetic */ String a(irv irvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("21259987", new Object[]{irvVar});
        }
        return irvVar.f();
    }

    public static /* synthetic */ x3c b(irv irvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3c) ipChange.ipc$dispatch("f73214ff", new Object[]{irvVar});
        }
        return irvVar.b;
    }

    public static /* synthetic */ a c(irv irvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("9d9b5825", new Object[]{irvVar});
        }
        return irvVar.d;
    }

    public static /* synthetic */ FluidContext d(irv irvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("a044c2cc", new Object[]{irvVar});
        }
        return irvVar.f21535a;
    }

    public static /* synthetic */ c e(irv irvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("11e4e988", new Object[]{irvVar});
        }
        return irvVar.e;
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
        }
        if (this.c == null) {
            FluidService service = this.f21535a.getService(ISceneConfigService.class);
            Objects.requireNonNull(service);
            pep sessionParams = ((ISceneConfigService) service).getSessionParams();
            this.c = "GGFullScreen";
            if (sessionParams != null) {
                this.c += "_" + sessionParams.b;
            }
        }
        return this.c;
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed079c74", new Object[]{this})).booleanValue();
        }
        if (this.b != null) {
            return true;
        }
        return false;
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else if (g()) {
            FluidService service = this.f21535a.getService(ILifecycleService.class);
            Objects.requireNonNull(service);
            ((ILifecycleService) service).addPageLifecycleListener((o6d.a) new d());
            FluidService service2 = this.f21535a.getService(ICardService.class);
            Objects.requireNonNull(service2);
            ((ICardService) service2).addCardLifecycleListener((wlb.a) new b());
        }
    }
}
