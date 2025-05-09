package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class y29 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final y29 INSTANCE = new y29();

    static {
        t2o.a(1007681559);
        t2o.a(1007681567);
    }

    public String a(xoh xohVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dc4206f0", new Object[]{this, xohVar});
        }
        ckf.g(xohVar, "requestParams");
        return rdp.INSTANCE.a().c(xohVar);
    }

    public String b(voh vohVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2f625e67", new Object[]{this, vohVar});
        }
        ckf.g(vohVar, "requestParams");
        return rdp.INSTANCE.a().d(vohVar);
    }
}
