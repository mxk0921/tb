package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.wlb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class spn extends wlb.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final prp f28209a;

    static {
        t2o.a(468714042);
    }

    public spn(prp prpVar) {
        this.f28209a = prpVar;
        l();
    }

    public static /* synthetic */ Object ipc$super(spn spnVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/video/manager/RecordDisableManager");
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9344b335", new Object[]{this});
        } else {
            this.f28209a.N().addCardLifecycleListener((wlb.a) this);
        }
    }

    @Override // tb.wlb.a, tb.wlb
    public void onAppear(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6fc56c", new Object[]{this, uq9Var});
        }
    }
}
