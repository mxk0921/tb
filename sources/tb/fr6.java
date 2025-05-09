package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class fr6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, m8e> f19477a = new HashMap<>();

    static {
        t2o.a(352321888);
    }

    public x3w a(String str, cxj cxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("7b636374", new Object[]{this, str, cxjVar});
        }
        m8e m8eVar = this.f19477a.get(str);
        if (m8eVar == null) {
            return null;
        }
        try {
            return m8eVar.a(cxjVar);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void b(String str, m8e m8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb100a6f", new Object[]{this, str, m8eVar});
        } else {
            this.f19477a.put(str, m8eVar);
        }
    }
}
