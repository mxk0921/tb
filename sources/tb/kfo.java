package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class kfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(83886230);
    }

    public static void a(Map<String, List<gsb>> map) {
        List<gsb> value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("215e3d6b", new Object[]{map});
        } else if (map != null) {
            for (Map.Entry<String, List<gsb>> entry : map.entrySet()) {
                if (!(entry == null || (value = entry.getValue()) == null)) {
                    for (gsb gsbVar : value) {
                        if (gsbVar != null) {
                            gsbVar.record();
                        }
                    }
                }
            }
        }
    }

    public static void b(Map<String, List<gsb>> map) {
        List<gsb> value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("409ba6f8", new Object[]{map});
        } else if (map != null) {
            for (Map.Entry<String, List<gsb>> entry : map.entrySet()) {
                if (!(entry == null || (value = entry.getValue()) == null)) {
                    for (gsb gsbVar : value) {
                        if (gsbVar != null) {
                            gsbVar.rollBack();
                        }
                    }
                }
            }
        }
    }
}
