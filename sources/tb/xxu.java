package tb;

import com.alibaba.android.umbrella.link.export.UMDimKey;
import com.alibaba.android.umbrella.link.export.UMTagKey;
import com.alibaba.android.umbrella.link.export.UmTypeKey;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class xxu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile mrg f31670a;

    public static void a(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d68fbbcd", new Object[]{str, str2, str3, str4, str5, map, str6, str7});
        } else if (!e().c().g(str4, str)) {
            e().f(str, str2, str3, str4, str5, map, str6, str7);
        }
    }

    public static void b(String str, String str2, UmTypeKey umTypeKey, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691659dd", new Object[]{str, str2, umTypeKey, str3, str4});
        } else if (!e().c().g(str, umTypeKey.getKey())) {
            e().g(str, str2, umTypeKey, str3, str4);
        }
    }

    public static void c(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec5cd960", new Object[]{str, str2, str3, str4, str5, map});
        } else if (!e().c().g(str4, str)) {
            e().h(str, str2, str3, str4, str5, map);
        }
    }

    public static void d(Map<UMDimKey, Object> map, Map<UMTagKey, String> map2) {
        UMTagKey key;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31cefc6d", new Object[]{map, map2});
        } else if (map != null && map2 != null && !map2.isEmpty()) {
            for (Map.Entry<UMTagKey, String> entry : map2.entrySet()) {
                if (!(entry == null || (key = entry.getKey()) == null)) {
                    if (entry.getValue() == null) {
                        map.put(key.getDimKey(), "empty value");
                    } else {
                        map.put(key.getDimKey(), entry.getValue());
                    }
                }
            }
        }
    }

    public static mrg e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mrg) ipChange.ipc$dispatch("9965df37", new Object[0]);
        }
        if (f31670a == null) {
            synchronized (xxu.class) {
                try {
                    if (f31670a == null) {
                        f31670a = new mrg();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f31670a;
    }

    public static ayu f(String str, String str2, String str3, ayu ayuVar, Map<UMDimKey, Object> map, cyu cyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ayu) ipChange.ipc$dispatch("e8be90d", new Object[]{str, str2, str3, ayuVar, map, cyuVar});
        }
        if (e().c().g(str, str3)) {
            return null;
        }
        return e().a(str, str2, str3, ayuVar, 1, null, null, map, lrg.a(cyuVar));
    }

    public static ayu g(String str, String str2, String str3, ayu ayuVar, String str4, String str5, Map<UMDimKey, Object> map, cyu cyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ayu) ipChange.ipc$dispatch("9c647787", new Object[]{str, str2, str3, ayuVar, str4, str5, map, cyuVar});
        }
        if (e().c().g(str, str3)) {
            return null;
        }
        return e().a(str, str2, str3, ayuVar, 2, str4, str5, map, lrg.a(cyuVar));
    }

    public static ayu h(String str, String str2, String str3, ayu ayuVar, String str4, String str5, Map<UMDimKey, Object> map, cyu cyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ayu) ipChange.ipc$dispatch("ec962afa", new Object[]{str, str2, str3, ayuVar, str4, str5, map, cyuVar});
        }
        if (e().c().g(str, str3)) {
            return null;
        }
        return e().a(str, str2, str3, ayuVar, 0, str4, str5, map, lrg.a(cyuVar));
    }

    public static ayu i(String str, String str2, String str3, ayu ayuVar, Map<UMDimKey, Object> map, cyu cyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ayu) ipChange.ipc$dispatch("52d995e0", new Object[]{str, str2, str3, ayuVar, map, cyuVar});
        }
        if (e().c().g(str, str3)) {
            return null;
        }
        return e().a(str, str2, str3, ayuVar, 0, null, null, map, lrg.a(cyuVar));
    }

    public static ayu l(String str, String str2, ayu ayuVar, String str3, String str4, String str5, String str6, Map<UMTagKey, String> map, cyu cyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ayu) ipChange.ipc$dispatch("418c23bd", new Object[]{str, str2, ayuVar, str3, str4, str5, str6, map, cyuVar});
        }
        if (e().c().g(str, "Page")) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(UMDimKey.DIM_1, str3);
        hashMap.put(UMDimKey.DIM_2, str4);
        d(hashMap, map);
        return e().a(str, str2, "Page", ayuVar, 0, str5, str6, hashMap, lrg.a(cyuVar));
    }

    public static ayu m(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ayu) ipChange.ipc$dispatch("f325c6b3", new Object[]{str, str2, str3, str4});
        }
        if (e().c().g(str, str3)) {
            return null;
        }
        return e().a(str, str2, str3, null, 0, null, null, null, lrg.a(cyu.c(str4)));
    }

    public static ayu n(String str, String str2, ayu ayuVar, String str3, String str4, String str5, String str6, String str7, Map<UMTagKey, String> map, cyu cyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ayu) ipChange.ipc$dispatch("33d06c46", new Object[]{str, str2, ayuVar, str3, str4, str5, str6, str7, map, cyuVar});
        }
        if (e().c().g(str, "UIEvent")) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(UMDimKey.DIM_1, str3);
        hashMap.put(UMDimKey.DIM_2, str4);
        hashMap.put(UMDimKey.DIM_3, str5);
        hashMap.put(UMDimKey.DIM_4, str6);
        d(hashMap, map);
        return e().a(str, str2, "UIEvent", ayuVar, 0, null, null, hashMap, lrg.a(cyuVar).d("args", str7));
    }

    public static ayu k(String str, String str2, ayu ayuVar, MtopResponse mtopResponse, String str3, Map<UMTagKey, String> map, cyu cyuVar) {
        String str4;
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ayu) ipChange.ipc$dispatch("d035bba0", new Object[]{str, str2, ayuVar, mtopResponse, str3, map, cyuVar});
        }
        if (e().c().g(str, "Mtop") || mtopResponse == null) {
            return null;
        }
        String g = zxu.g(mtopResponse);
        HashMap hashMap = new HashMap();
        hashMap.put(UMDimKey.DIM_1, mtopResponse.getApi());
        hashMap.put(UMDimKey.DIM_2, mtopResponse.getV());
        hashMap.put(UMDimKey.DIM_3, zxu.a(g));
        hashMap.put(UMDimKey.DIM_4, mtopResponse.getRetCode());
        hashMap.put(UMDimKey.DIM_5, Integer.valueOf(mtopResponse.getResponseCode()));
        d(hashMap, map);
        String str6 = "";
        if (!mtopResponse.isApiSuccess()) {
            str5 = mtopResponse.getRetCode();
            str4 = mtopResponse.getRetMsg();
        } else {
            str5 = str6;
            str4 = str5;
        }
        JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
        if (dataJsonObject != null) {
            str6 = dataJsonObject.toString();
        }
        return e().a(str, str2, "Mtop", ayuVar, 2, str5, str4, hashMap, lrg.a(cyuVar).d(lrg.EXT_DATA_MTOP_RESPONSE_STR, str6).d(lrg.EXT_DATA_MTOP_RESPONSE_HEADERS, mtopResponse.getHeaderFields()).d("requestParams", str3));
    }

    public static ayu j(String str, String str2, ayu ayuVar, String str3, String str4, String str5, Map<UMTagKey, String> map, cyu cyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ayu) ipChange.ipc$dispatch("8116b40c", new Object[]{str, str2, ayuVar, str3, str4, str5, map, cyuVar});
        }
        if (e().c().g(str, "Mtop")) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(UMDimKey.DIM_1, str3);
        hashMap.put(UMDimKey.DIM_2, str4);
        d(hashMap, map);
        return e().a(str, str2, "Mtop", ayuVar, 1, null, null, hashMap, lrg.a(cyuVar).d("requestParams", str5));
    }
}
