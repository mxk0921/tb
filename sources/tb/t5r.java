package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.ProcedureGlobal;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class t5r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Object> f28504a = new HashMap();
    public static boolean b = true;

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa33697", new Object[]{str});
        } else {
            ProcedureGlobal.f().h(str);
        }
    }

    public static synchronized void b(String str, Object obj) {
        synchronized (t5r.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1991a501", new Object[]{str, obj});
                return;
            }
            if (b) {
                ((HashMap) f28504a).put(str, obj);
            } else {
                vxm.b.e().a(str, obj);
            }
        }
    }

    public static synchronized void c() {
        synchronized (t5r.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2e7cbf49", new Object[0]);
                return;
            }
            if (b) {
                b = false;
                for (Map.Entry entry : ((HashMap) f28504a).entrySet()) {
                    vxm.b.e().a((String) entry.getKey(), entry.getValue());
                }
                ((HashMap) f28504a).clear();
            }
        }
    }
}
