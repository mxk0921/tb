package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.rib;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zjt extends du {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(736100412);
    }

    public zjt(qh2 qh2Var, lh2 lh2Var, a29 a29Var, xiq xiqVar, rib.a aVar) {
        super(qh2Var, lh2Var, a29Var, xiqVar, aVar);
    }

    public static /* synthetic */ Object ipc$super(zjt zjtVar, String str, Object... objArr) {
        if (str.hashCode() == 689505604) {
            super.b(((Number) objArr[0]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/bootimage/arch/flow/state/lifestate/TerminateState");
    }

    @Override // tb.du, tb.lsd
    public void b(int i) {
        xiq xiqVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29190544", new Object[]{this, new Integer(i)});
            return;
        }
        super.b(i);
        tm1.a("2ARCH_TerminateState", "notifyTerminate: ");
        ((kh2) this.f18066a).L();
        tm1.a("2ARCH_TerminateState", "闪屏流程流程：通知onTerminate");
        lh2 lh2Var = this.c;
        if (lh2Var != null) {
            lh2Var.n();
        }
        a29 a29Var = this.f;
        if (a29Var != null) {
            a29Var.p();
        }
        if (!nh2.g() && (xiqVar = this.d) != null) {
            xiqVar.e(null);
        }
    }

    @Override // tb.du
    public void e(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fc60f4f", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        rib.a aVar = this.f18066a;
        if (aVar != null) {
            if (i2 == 205) {
                ((kh2) aVar).L();
            }
            tm1.a("2ARCH_TerminateState", "handle close --> " + ((kh2) this.f18066a).B());
            this.b.g(i2, ((kh2) this.f18066a).B(), ((kh2) this.f18066a).G());
        }
    }

    @Override // tb.jsd
    public int getState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("830709d5", new Object[]{this})).intValue();
        }
        return 104;
    }
}
