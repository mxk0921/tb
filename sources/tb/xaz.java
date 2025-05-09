package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.viewhandler.NCComponentViewHandler;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class xaz extends viz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a extends nfz {
        static {
            t2o.a(598737384);
        }

        public a() {
            i(0);
        }
    }

    static {
        t2o.a(598737383);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xaz(waz wazVar) {
        super(wazVar);
        ckf.g(wazVar, "layoutNode");
        J(new a());
    }

    public static /* synthetic */ Object ipc$super(xaz xazVar, String str, Object... objArr) {
        if (str.hashCode() == 2060280850) {
            super.p(((Number) objArr[0]).longValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/runtime/node/LayoutNodeCoordinator");
    }

    @Override // tb.ldz
    public qjz d(long j) {
        odz odzVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qjz) ipChange.ipc$dispatch("606f543b", new Object[]{this, new Long(j)});
        }
        NCComponentViewHandler v = y().v();
        if (v == null) {
            odzVar = null;
        } else {
            odzVar = v.m322measureW2SWlxA(j);
        }
        I(odzVar);
        return this;
    }

    @Override // tb.viz, tb.qjz
    public void p(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7acd6412", new Object[]{this, new Long(j)});
            return;
        }
        viz C = C();
        if (C != null) {
            long v = C.v();
            j = faz.a(eaz.d(j) + eaz.d(v), eaz.e(j) + eaz.e(v));
        }
        H(eaz.Companion.a());
        super.p(j);
        NCComponentViewHandler v2 = y().v();
        if (v2 != null) {
            v2.m323placeAtF3EFqNI(j);
        }
    }
}
