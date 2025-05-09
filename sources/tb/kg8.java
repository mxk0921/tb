package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.dynamicfeature.utils.Constants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class kg8 implements czm<q49> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final gdh f22649a = fih.getLog(kg8.class, (gdh) null);

    static {
        t2o.a(951058444);
        t2o.a(947912754);
    }

    public void execute(q49 q49Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("211c1f10", new Object[]{this, q49Var});
            return;
        }
        q49Var.stage = t49.ARG_NETWORK_CHECK;
        if (nkv.getNetworkType() == 0) {
            this.f22649a.w("no network");
            q49Var.success = false;
            q49Var.errorCode = -1;
            q49Var.errorMsg = Constants.getMsg(-1);
            return;
        }
        this.f22649a.w("network avilable");
    }
}
