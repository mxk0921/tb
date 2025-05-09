package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xh6 implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f31396a;
    public Map<String, String> b;

    static {
        t2o.a(444597007);
    }

    /* renamed from: a */
    public xh6 clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xh6) ipChange.ipc$dispatch("3dc85ff4", new Object[]{this});
        }
        xh6 xh6Var = new xh6();
        xh6Var.f31396a = this.f31396a;
        xh6Var.b = this.b;
        return xh6Var;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66dab34e", new Object[]{this});
        } else if (zg5.D3()) {
            this.b = new ConcurrentHashMap();
        } else {
            this.b = new HashMap();
        }
    }
}
