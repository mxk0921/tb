package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class vaz extends viz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final uaz m;

    static {
        t2o.a(598737381);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vaz(waz wazVar, uaz uazVar) {
        super(wazVar);
        ckf.g(wazVar, "layoutNode");
        ckf.g(uazVar, "layoutModifierNode");
        this.m = uazVar;
        J(uazVar);
    }

    public static /* synthetic */ Object ipc$super(vaz vazVar, String str, Object... objArr) {
        if (str.hashCode() == 2060280850) {
            super.p(((Number) objArr[0]).longValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/runtime/node/LayoutModifierNodeCoordinator");
    }

    @Override // tb.ldz
    public qjz d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qjz) ipChange.ipc$dispatch("606f543b", new Object[]{this, new Long(j)});
        }
        if (B() != null) {
            u(j);
            uaz uazVar = this.m;
            viz B = B();
            ckf.d(B);
            I(uazVar.n(this, B, j));
            return this;
        }
        throw new IllegalStateException("Wrapped coordinator cannot be null");
    }

    @Override // tb.viz, tb.qjz
    public void p(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7acd6412", new Object[]{this, new Long(j)});
            return;
        }
        super.p(j);
        H(j);
        viz C = C();
        if (C != null) {
            long v = v();
            long v2 = C.v();
            H(faz.a(eaz.d(v) + eaz.d(v2), eaz.e(v) + eaz.e(v2)));
        }
        odz z = z();
        if (z != null) {
            z.a();
        }
    }
}
