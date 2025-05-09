package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.list.render.RecyclerViewHolder;
import tb.wlb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class nfj extends wlb.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final prp f24703a;

    static {
        t2o.a(468714068);
    }

    public nfj(prp prpVar) {
        this.f24703a = prpVar;
        l();
    }

    public static /* synthetic */ Object ipc$super(nfj nfjVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/video/manager/mute/MuteManager");
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9344b335", new Object[]{this});
        } else {
            this.f24703a.N().addCardLifecycleListener((wlb.a) this);
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea4faf1a", new Object[]{this});
        } else {
            mfj.x(this.f24703a.U(), this.f24703a);
        }
    }

    @Override // tb.wlb.a, tb.wlb
    public void onCreateView(uq9 uq9Var, RecyclerViewHolder recyclerViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b05e008", new Object[]{this, uq9Var, recyclerViewHolder});
        } else {
            m();
        }
    }
}
