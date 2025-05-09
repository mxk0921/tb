package tb;

import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import tb.bbs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ozp extends q8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(835715078);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ozp(FragmentActivity fragmentActivity) {
        super(fragmentActivity, null, 2, null);
        ckf.g(fragmentActivity, "activity");
    }

    public static /* synthetic */ Object ipc$super(ozp ozpVar, String str, Object... objArr) {
        if (str.hashCode() == 1678850145) {
            super.a((TMSSolutionType) objArr[0], (bbs.d) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/container/app/SinglePageContainerHelper");
    }

    @Override // tb.q8s, tb.t9s, tb.mqb
    public void a(TMSSolutionType tMSSolutionType, bbs.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64113861", new Object[]{this, tMSSolutionType, dVar});
        } else {
            super.a(tMSSolutionType, dVar);
        }
    }

    @Override // tb.t9s
    public swd c(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (swd) ipChange.ipc$dispatch("c3bfb8ed", new Object[]{this, bbsVar});
        }
        ckf.g(bbsVar, "instance");
        return new bds(e(), bbsVar);
    }
}
