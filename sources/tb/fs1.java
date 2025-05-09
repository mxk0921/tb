package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.swn;
import tb.w3o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class fs1<OUT, NEXT_OUT extends swn, CONTEXT extends w3o> extends oh3<OUT, NEXT_OUT, CONTEXT> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final duo h;
    public final na7<OUT, NEXT_OUT, CONTEXT> i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends buo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(int i, kk4 kk4Var, yto ytoVar, boolean z) {
            super(i, kk4Var, ytoVar, z);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/rxm/produce/BaseChainProducer$1");
        }

        @Override // tb.buo
        public void t(kk4 kk4Var, yto ytoVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c143d0b4", new Object[]{this, kk4Var, ytoVar});
            } else {
                fs1.H(fs1.this, kk4Var, ytoVar, this);
            }
        }
    }

    public fs1(int i, int i2) {
        this(null, i, i2);
    }

    public static /* synthetic */ void H(fs1 fs1Var, kk4 kk4Var, yto ytoVar, buo buoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("623d66cb", new Object[]{fs1Var, kk4Var, ytoVar, buoVar});
        } else {
            fs1Var.M(kk4Var, ytoVar, buoVar);
        }
    }

    public static /* synthetic */ Object ipc$super(fs1 fs1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/rxm/produce/BaseChainProducer");
    }

    @Override // tb.oh3
    public void B(huo huoVar, kk4<OUT, CONTEXT> kk4Var, yto<NEXT_OUT> ytoVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53091e68", new Object[]{this, huoVar, kk4Var, ytoVar, new Boolean(z)});
        } else if (huoVar == null || (z && huoVar.f() && jjo.b())) {
            M(kk4Var, ytoVar, null);
        } else {
            buo a2 = this.h.a();
            if (a2 == null) {
                a2 = new a(kk4Var.getContext().h(), kk4Var, ytoVar, z);
                a2.w(this.h);
            } else {
                a2.s(kk4Var.getContext().h(), kk4Var, ytoVar, z);
            }
            huoVar.a(a2);
        }
    }

    public void I(kk4<OUT, CONTEXT> kk4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce179037", new Object[]{this, kk4Var});
        }
    }

    public void J(kk4<OUT, CONTEXT> kk4Var, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a6a662d", new Object[]{this, kk4Var, th});
        }
    }

    public void K(kk4<OUT, CONTEXT> kk4Var, boolean z, NEXT_OUT next_out) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef5213ed", new Object[]{this, kk4Var, new Boolean(z), next_out});
        }
    }

    public void L(kk4<OUT, CONTEXT> kk4Var, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ff1797c", new Object[]{this, kk4Var, new Float(f)});
        }
    }

    public final void M(kk4<OUT, CONTEXT> kk4Var, yto<NEXT_OUT> ytoVar, buo buoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca7196aa", new Object[]{this, kk4Var, ytoVar, buoVar});
        } else if (ytoVar != null) {
            int i = ytoVar.f32345a;
            if (i == 1) {
                K(kk4Var, ytoVar.b, ytoVar.c);
            } else if (i == 4) {
                L(kk4Var, ytoVar.d);
            } else if (i == 8) {
                I(kk4Var);
            } else if (i == 16) {
                J(kk4Var, ytoVar.e);
            }
        } else if (kk4Var.getContext().i()) {
            xv8.f("RxSysLog", "[ChainProducer] ID=%d cancelled before conducting result, producer=%s type=%s", Integer.valueOf(kk4Var.getContext().d()), k(), kzm.a(p()));
            kk4Var.b();
        } else if (!d(kk4Var, buoVar) && p() == 1) {
            O(kk4Var);
        }
    }

    public final kh3<OUT, NEXT_OUT, CONTEXT> N(kk4<OUT, CONTEXT> kk4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kh3) ipChange.ipc$dispatch("3dd6c48f", new Object[]{this, kk4Var});
        }
        kh3<OUT, NEXT_OUT, CONTEXT> a2 = j().a();
        if (a2 != null) {
            return a2.h(kk4Var, this);
        }
        return new kh3<>(kk4Var, this);
    }

    public final void O(kk4<OUT, CONTEXT> kk4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ceeb53a", new Object[]{this, kk4Var});
        } else if (m() != null) {
            m().a(N(kk4Var).d(g()));
        } else {
            throw new RuntimeException(k() + " can't conduct result while no next producer");
        }
    }

    @Override // tb.lzm
    public void a(kk4<OUT, CONTEXT> kk4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86e0eec0", new Object[]{this, kk4Var});
        } else if (kk4Var.getContext().i()) {
            xv8.f("RxSysLog", "[ChainProducer] ID=%d cancelled before leading to produce result, producer=%s type=%s", Integer.valueOf(kk4Var.getContext().d()), k(), kzm.a(p()));
            kk4Var.b();
        } else if (p() != 0) {
            A(o(), kk4Var, null);
        } else {
            O(kk4Var);
        }
    }

    @Override // tb.oh3
    public na7<OUT, NEXT_OUT, CONTEXT> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (na7) ipChange.ipc$dispatch("42c98fa0", new Object[]{this});
        }
        return this.i;
    }

    public fs1(String str, int i, int i2) {
        super(str, i, i2);
        this.h = new duo();
        this.i = new na7<>();
    }
}
