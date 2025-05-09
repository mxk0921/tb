package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.datastructure.GatewayActionInfo;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a5a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(475004934);
    }

    public static List<GatewayActionInfo> a(b5a b5aVar, i5a i5aVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ac0e026d", new Object[]{b5aVar, i5aVar});
        }
        if (b5aVar != null) {
            str = b5aVar.b();
        } else {
            str = "";
        }
        TLog.logd("gateway2-gateway.triggerEvents", str);
        List<u4a> d = i5aVar.b().d(b5aVar);
        ArrayList arrayList = new ArrayList();
        if (d != null && d.size() > 0) {
            for (u4a u4aVar : d) {
                arrayList.add(u4aVar.b());
            }
        }
        return arrayList;
    }
}
