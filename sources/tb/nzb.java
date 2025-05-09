package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.model.PageInfo;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class nzb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
    }

    static {
        t2o.a(615514113);
    }

    public static nzb b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nzb) ipChange.ipc$dispatch("bca6e7fe", new Object[0]);
        }
        return uk7.i().h();
    }

    public abstract PageInfo a();

    public abstract void c(String str, tx8 tx8Var);

    public abstract void d(String str, Map<String, String> map);
}
