package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uniinfra_kmp.common_utils.app.a;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJSONUtils_androidKt;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonArray;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class l1t {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final l1t INSTANCE = new l1t();

    static {
        t2o.a(1010827291);
    }

    public final void a(d1a<String> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47d3b0a", new Object[]{this, d1aVar});
            return;
        }
        ckf.g(d1aVar, "handler");
        if (a.g()) {
            System.out.println((Object) d1aVar.invoke());
        }
    }

    public final String b(List<? extends Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9b01e817", new Object[]{this, list});
        }
        if (list == null) {
            return null;
        }
        try {
            KMPJsonArray kMPJsonArray = new KMPJsonArray(null, 1, null);
            List<? extends Object> list2 = list;
            ArrayList arrayList = new ArrayList(zz3.q(list2, 10));
            for (Object obj : list2) {
                if (obj == null) {
                    obj = null;
                }
                arrayList.add(new KMPJsonObject(obj).nativePayload());
            }
            return xrf.d(kMPJsonArray, arrayList).toJsonString();
        } catch (Exception e) {
            pus.INSTANCE.f(String.valueOf(((ns3) dun.b(l1t.class)).getSimpleName()), "", "jsonStrFromList === " + e.getMessage() + ", data === " + list);
            return null;
        }
    }

    public final String c(Map<String, ? extends Object> map) {
        Map<String, ? extends Object> map2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ee8390ab", new Object[]{this, map});
        }
        if (map == null) {
            return null;
        }
        try {
            if (map instanceof Object) {
                map2 = map;
            } else {
                map2 = null;
            }
            return new KMPJsonObject(map2).toJsonString();
        } catch (Exception e) {
            pus.INSTANCE.f(String.valueOf(((ns3) dun.b(l1t.class)).getSimpleName()), "", "jsonStrFromMap === " + e.getMessage() + ", data === " + map);
            return null;
        }
    }

    public final List<Object> d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("aca2de95", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        try {
            Object a2 = KMPJSONUtils_androidKt.a(com.taobao.uniinfra_kmp.common_utils.serialization.a.Companion, str);
            KMPJsonArray kMPJsonArray = a2 instanceof KMPJsonArray ? (KMPJsonArray) a2 : null;
            if (kMPJsonArray != null) {
                return kMPJsonArray.toList();
            }
            return null;
        } catch (Exception e) {
            pus pusVar = pus.INSTANCE;
            String valueOf = String.valueOf(((ns3) dun.b(l1t.class)).getSimpleName());
            pusVar.f(valueOf, "", "listFromJsonStr === " + e.getMessage() + ", data === " + str);
            return null;
        }
    }

    public final Map<String, Object> e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("13d9f3a9", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        try {
            Object a2 = KMPJSONUtils_androidKt.a(com.taobao.uniinfra_kmp.common_utils.serialization.a.Companion, str);
            KMPJsonObject kMPJsonObject = a2 instanceof KMPJsonObject ? (KMPJsonObject) a2 : null;
            if (kMPJsonObject != null) {
                return kMPJsonObject.toMap();
            }
            return null;
        } catch (Exception e) {
            pus pusVar = pus.INSTANCE;
            String valueOf = String.valueOf(((ns3) dun.b(l1t.class)).getSimpleName());
            pusVar.f(valueOf, "", "mapFromJsonStr === " + e.getMessage() + ", data === " + str);
            return null;
        }
    }
}
