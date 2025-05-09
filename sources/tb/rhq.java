package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.data.BootImageInfo;
import tb.rib;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class rhq extends du {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int h = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements acc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f27390a;
        public final /* synthetic */ int b;

        public a(int i, int i2) {
            this.f27390a = i;
            this.b = i2;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("80148842", new Object[]{this});
                return;
            }
            tm1.a("2ARCH_StartState", "handleNext:");
            rhq.h(rhq.this);
            rhq.i(rhq.this, this.f27390a, this.b);
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d44d5bc2", new Object[]{this});
                return;
            }
            tm1.a("2ARCH_StartState", "success: " + rhq.g(rhq.this));
            rhq.j(rhq.this, this.f27390a, this.b);
        }
    }

    static {
        t2o.a(736100410);
    }

    public rhq(qh2 qh2Var, lh2 lh2Var, a29 a29Var, xiq xiqVar, rib.a aVar) {
        super(qh2Var, lh2Var, a29Var, xiqVar, aVar);
    }

    public static /* synthetic */ int g(rhq rhqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("95d3f6d5", new Object[]{rhqVar})).intValue();
        }
        return rhqVar.h;
    }

    public static /* synthetic */ int h(rhq rhqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88dc15cd", new Object[]{rhqVar})).intValue();
        }
        int i = rhqVar.h;
        rhqVar.h = 1 + i;
        return i;
    }

    public static /* synthetic */ void i(rhq rhqVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2e2321", new Object[]{rhqVar, new Integer(i), new Integer(i2)});
        } else {
            rhqVar.k(i, i2);
        }
    }

    public static /* synthetic */ Object ipc$super(rhq rhqVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 74734057) {
            super.f();
            return null;
        } else if (hashCode == 299283317) {
            super.d((BootImageInfo) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
            return null;
        } else if (hashCode == 1875251023) {
            super.e(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/bootimage/arch/flow/state/lifestate/StartState");
        }
    }

    public static /* synthetic */ void j(rhq rhqVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13cba79f", new Object[]{rhqVar, new Integer(i), new Integer(i2)});
        } else {
            super.e(i, i2);
        }
    }

    @Override // tb.jsd
    public int getState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("830709d5", new Object[]{this})).intValue();
        }
        return 100;
    }

    public final void k(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9397477e", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (l()) {
            tm1.a("2ARCH_StartState", "handleNext: 尝试超限");
            this.d.c(104, this.e);
        } else {
            tm1.a("2ARCH_StartState", "handleStartState:" + this.h);
            this.b.f(this.c, i2, new a(i, i2), this.h);
        }
    }

    @Override // tb.du
    public void e(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fc60f4f", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        tm1.a("2ARCH_StartState", "handle --> index " + this.h);
        this.e = i2;
        this.h = 0;
        tm1.a("2ARCH_StartState", "闪屏流程流程：通知onStart");
        lh2 lh2Var = this.c;
        if (lh2Var != null) {
            lh2Var.m();
        }
        a29 a29Var = this.f;
        if (a29Var != null) {
            a29Var.o();
        }
        k(i, i2);
    }

    @Override // tb.du
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47459e9", new Object[]{this});
        } else if (l()) {
            tm1.a("2ARCH_StartState", "handleNext: 尝试超限");
            this.d.c(104, this.e);
        } else {
            super.f();
            tm1.a("2ARCH_StartState", "onTimeOut index: " + this.h);
            int i = this.h + 1;
            this.h = i;
            this.b.f(this.c, this.e, null, i);
        }
    }

    @Override // tb.du, tb.lsd
    public void d(BootImageInfo bootImageInfo, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d6b375", new Object[]{this, bootImageInfo, new Integer(i), new Integer(i2)});
            return;
        }
        super.d(bootImageInfo, i, i2);
        if (i2 == 2001) {
            this.h = 0;
            lh2 lh2Var = this.c;
            if (lh2Var != null) {
                lh2Var.q(bootImageInfo);
            }
            tm1.a("2ARCH_StartState", "notifyOnStart success: ");
            this.d.c(101, i);
            return;
        }
        tm1.a("2ARCH_StartState", "notifyOnStart fail index: " + this.h);
        this.h = this.h + 1;
        k(100, i);
    }

    public final boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("854dae38", new Object[]{this})).booleanValue();
        }
        if (this.h <= 1) {
            return false;
        }
        tm1.a("2ARCH_StartState", "isReachedAttemptsLimit: 尝试达到上限");
        this.h = 0;
        return true;
    }
}
