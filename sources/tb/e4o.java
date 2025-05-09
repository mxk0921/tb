package tb;

import com.alibaba.ut.abtest.pipeline.RequestMethod;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.device.UTDevice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.c3o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class e4o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(961544427);
    }

    public static c3o a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c3o) ipChange.ipc$dispatch("836aa8d8", new Object[0]);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("platform", "android");
        hashMap.put("utdid", UTDevice.getUtdid(n.j().b()));
        hashMap.put("appKey", wu3.c().a());
        hashMap.put("configVersion", String.valueOf(n.j().e().n()));
        hashMap.put("userId", n.j().o());
        hashMap.put("userNick", n.j().p());
        hashMap.put("appVersion", d3r.c().a());
        hashMap.put("channel", d3r.c().b());
        return new c3o.a("/v4.0/api/experiment/allocate").c(RequestMethod.POST).d(g5o.b(hashMap)).e(lo8.class).a();
    }

    public static c3o b(List<m2o> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c3o) ipChange.ipc$dispatch("c70e9301", new Object[]{list, str});
        }
        ArrayList arrayList = new ArrayList();
        for (m2o m2oVar : list) {
            HashMap hashMap = new HashMap();
            hashMap.put(m09.TASK_TYPE_LEVEL, m2oVar.b());
            hashMap.put("content", m2oVar.a());
            hashMap.put("platform", "android");
            hashMap.put("source", "ab");
            hashMap.put("type", m2oVar.d());
            hashMap.put("createTime", String.valueOf(m2oVar.c()));
            arrayList.add(hashMap);
        }
        g5o a2 = g5o.a(arrayList);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("ab-debug-key", str);
        return new c3o.a("/v2.0/api/experiment/uploadDebugLogs").c(RequestMethod.POST).d(a2).b(hashMap2).a();
    }
}
