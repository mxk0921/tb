package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.zoloz.zhub.common.factor.model.FactorNextRequest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class pho {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public FactorNextRequest f26105a = new FactorNextRequest();
    public String b = "";
    public boolean c = false;

    static {
        t2o.a(245366872);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "RpcRequest{factorNextRequest = " + this.f26105a.toString() + ", currentTaskName = " + this.b + ", showLoading = " + this.c + '}';
    }
}
