package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class fa8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f19139a;
    public final Map<String, String> b = new HashMap();
    public final Map<String, Object> c = new HashMap();
    public String d = "";

    static {
        t2o.a(245366816);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "EkycRequest{eKYCId=" + this.f19139a + ", eKYCConfig=" + this.b.toString() + ", clientCfg=" + this.d + ", bizConfig=" + this.c.toString() + '}';
    }
}
