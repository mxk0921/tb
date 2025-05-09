package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.ultron.fatigue.DeliverFatigueManager;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class sb7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, DeliverFatigueManager> f27926a = new HashMap();

    static {
        t2o.a(745538138);
    }

    public static DeliverFatigueManager a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeliverFatigueManager) ipChange.ipc$dispatch("1de45489", new Object[0]);
        }
        Map<String, DeliverFatigueManager> map = f27926a;
        if (((HashMap) map).size() > 0) {
            return (DeliverFatigueManager) ((HashMap) map).values().iterator().next();
        }
        return null;
    }

    public static DeliverFatigueManager b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeliverFatigueManager) ipChange.ipc$dispatch("5b395a7f", new Object[]{str});
        }
        HashMap hashMap = (HashMap) f27926a;
        DeliverFatigueManager deliverFatigueManager = (DeliverFatigueManager) hashMap.get(str);
        if (deliverFatigueManager != null) {
            return deliverFatigueManager;
        }
        DeliverFatigueManager deliverFatigueManager2 = new DeliverFatigueManager();
        hashMap.put(str, deliverFatigueManager2);
        return deliverFatigueManager2;
    }
}
