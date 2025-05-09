package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.zoloz.zhub.common.factor.model.FactorNextResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class sho {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public FactorNextResponse f28058a = new FactorNextResponse();
    public String b = "";

    static {
        t2o.a(245366873);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "RpcResponse{factorNextResponse = " + this.f28058a.toString() + ", exception = " + this.b + '}';
    }
}
