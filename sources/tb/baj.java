package tb;

import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.container.app.TMSMultiPageManager;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import tb.bbs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class baj extends q8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final FragmentActivity o;

    static {
        t2o.a(835715077);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public baj(FragmentActivity fragmentActivity, ViewGroup viewGroup) {
        super(fragmentActivity, viewGroup);
        ckf.g(fragmentActivity, "activity");
        ckf.g(viewGroup, "splashViewContainer");
        this.o = fragmentActivity;
    }

    public static /* synthetic */ Object ipc$super(baj bajVar, String str, Object... objArr) {
        if (str.hashCode() == 1678850145) {
            super.a((TMSSolutionType) objArr[0], (bbs.d) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/container/app/MultiPageContainerHelper");
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
        return new TMSMultiPageManager(this.o, bbsVar, w());
    }
}
