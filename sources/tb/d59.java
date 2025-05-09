package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.wlb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class d59 extends wlb.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final prp f17589a;
    public zmh b;

    static {
        t2o.a(468714049);
    }

    public d59(prp prpVar) {
        this.f17589a = prpVar;
        l();
    }

    public static /* synthetic */ Object ipc$super(d59 d59Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/video/manager/feedback/FeedBackManager");
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9344b335", new Object[]{this});
        } else {
            this.f17589a.N().addCardLifecycleListener((wlb.a) this);
        }
    }

    @Override // tb.wlb.a, tb.wlb
    public void onAppear(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6fc56c", new Object[]{this, uq9Var});
        } else {
            e59.d(this.f17589a.U(), this, this.f17589a.Z());
        }
    }

    @Override // tb.wlb.a, tb.wlb
    public void onDisAppear(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9c725bc", new Object[]{this, uq9Var});
        } else {
            e59.e(this, this.f17589a.C1(), this.f17589a.Z());
        }
    }
}
