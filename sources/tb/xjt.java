package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.weex_framework.c;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.rpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class xjt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001920);
    }

    public static rpc.d b(c cVar, Map<String, TemplateBean> map, yko ykoVar, ConcurrentHashMap<String, rpc.c> concurrentHashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rpc.d) ipChange.ipc$dispatch("1c9cb49b", new Object[]{cVar, map, ykoVar, concurrentHashMap});
        }
        return a(cVar, map, ykoVar, concurrentHashMap, false);
    }

    public static rpc.d c(c cVar, Map<String, TemplateBean> map, yko ykoVar, ConcurrentHashMap<String, rpc.c> concurrentHashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rpc.d) ipChange.ipc$dispatch("445fd702", new Object[]{cVar, map, ykoVar, concurrentHashMap});
        }
        return a(cVar, map, ykoVar, concurrentHashMap, true);
    }

    public static rpc.d a(c cVar, Map<String, TemplateBean> map, yko ykoVar, ConcurrentHashMap<String, rpc.c> concurrentHashMap, boolean z) {
        rpc.d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rpc.d) ipChange.ipc$dispatch("ef388db2", new Object[]{cVar, map, ykoVar, concurrentHashMap, new Boolean(z)});
        }
        if (map == null || map.isEmpty()) {
            return new rpc.d();
        }
        ArrayList arrayList = new ArrayList();
        if (map.size() > 0) {
            for (Map.Entry<String, TemplateBean> entry : map.entrySet()) {
                String str = entry.getValue().url;
                if (str != null && (concurrentHashMap == null || !concurrentHashMap.containsKey(str))) {
                    arrayList.add(new rpc.b(entry.getValue().url, entry.getValue().templateName, entry.getValue().md5));
                }
            }
        }
        String str2 = "no_wait";
        c4p.D("[XS.request]", "[Request] Template download task start(%s), %d to download or load cache", z ? "wait" : str2, Integer.valueOf(arrayList.size()));
        if (z) {
            rpc o = gxh.o();
            ykoVar.f().j().getClass();
            dVar = o.f(arrayList, 10000, cVar);
        } else {
            rpc o2 = gxh.o();
            ykoVar.f().j().getClass();
            dVar = o2.a(arrayList, 10000, cVar);
        }
        if (concurrentHashMap != null) {
            concurrentHashMap.putAll(dVar.f27532a);
        }
        if (z) {
            str2 = "wait";
        }
        c4p.D("[XS.request]", "[Request] Template download task finished(%s), downloadSuccCount: %d, failedCount: %d", str2, Integer.valueOf(dVar.b), Integer.valueOf(dVar.b - dVar.c));
        return dVar;
    }
}
