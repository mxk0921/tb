package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ro4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, qo4> f27495a = new HashMap();

    static {
        t2o.a(629145606);
    }

    public static void a(String str, qo4 qo4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9407825b", new Object[]{str, qo4Var});
            return;
        }
        odg.c("ContentDataManager", "add data, key is " + str);
        ((HashMap) f27495a).put(str, qo4Var);
    }

    public static qo4 b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qo4) ipChange.ipc$dispatch("4b868624", new Object[]{str});
        }
        return (qo4) ((HashMap) f27495a).get(str);
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e33e65f", new Object[]{str});
            return;
        }
        odg.c("ContentDataManager", "remove data, key is " + str);
        ((HashMap) f27495a).remove(str);
    }
}
