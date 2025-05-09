package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.bizcode.model.FixedSizeList;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class dwe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, List<String>> f18110a = new ConcurrentHashMap(8);
    public static final Map<String, FixedSizeList<String>> b = new ConcurrentHashMap(8);
    public static final Map<String, String> c = new ConcurrentHashMap(8);
    public static final Map<String, String> d = new ConcurrentHashMap(8);
    public static final Map<String, JSONObject> e = new ConcurrentHashMap(8);
    public static final Map<String, List<String>> f = new ConcurrentHashMap(8);
    public static final Map<String, JSONObject> g = new ConcurrentHashMap(8);
    public static final Map<String, Long> h = new ConcurrentHashMap(8);
    public static boolean i = false;
    public static int j = 0;
    public static final Integer k = 100;
    public static long l = -1;
    public static long m = 0;

    static {
        t2o.a(487587972);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c4a174c", new Object[]{str});
        }
        return (String) ((ConcurrentHashMap) c).get(str);
    }

    public static List<String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("26f2fe4f", new Object[]{str});
        }
        Map<String, List<String>> map = f;
        List<String> list = (List) ((ConcurrentHashMap) map).get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        ((ConcurrentHashMap) map).put(str, arrayList);
        return arrayList;
    }

    public static JSONObject c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5cfe25f7", new Object[]{str});
        }
        return (JSONObject) ((ConcurrentHashMap) e).get(str);
    }

    public static JSONObject d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("721e55a6", new Object[]{str});
        }
        return (JSONObject) ((ConcurrentHashMap) g).get(str);
    }

    public static String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8877db94", new Object[]{str});
        }
        return (String) ((ConcurrentHashMap) d).get(str);
    }

    public static void f(String str, List<SectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f594cf9", new Object[]{str, list});
        } else if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (SectionModel sectionModel : list) {
                arrayList.add(sectionModel.getString("sectionBizCode"));
            }
            String a2 = a(str);
            if (new dix(new fix(str, "windvane_request", a2, e(str), b(str), arrayList, list, 0, 0)).j(i, j)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("sectionBizCode", (Object) e(str));
                jSONObject.put("itemId", (Object) a2);
                jSONObject.put("clickId", (Object) a2);
                JSONObject c2 = c(str);
                if (c2 != null) {
                    jSONObject.putAll(c2);
                }
                ((ConcurrentHashMap) g).put(str, jSONObject);
                return;
            }
            ((ConcurrentHashMap) g).remove(str);
        }
    }

    public static void g(at6 at6Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc9ce949", new Object[]{at6Var, str});
        } else {
            f(str, at6Var.p(str));
        }
    }

    public static void h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c111980a", new Object[]{str, str2});
        } else if (!TextUtils.isEmpty(str2)) {
            Map<String, String> map = c;
            if (TextUtils.equals((CharSequence) ((ConcurrentHashMap) map).get(str), str2)) {
                ((ConcurrentHashMap) map).remove(str);
                ((ConcurrentHashMap) d).remove(str);
                ((ConcurrentHashMap) e).remove(str);
            }
        }
    }

    public static void i(String str, String str2) {
        boolean b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23319081", new Object[]{str, str2});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str2)) {
                Integer num = k;
                if (num.intValue() > 0) {
                    Map<String, FixedSizeList<String>> map = b;
                    FixedSizeList fixedSizeList = (FixedSizeList) ((ConcurrentHashMap) map).get(str);
                    if (fixedSizeList == null) {
                        fixedSizeList = new FixedSizeList(num.intValue());
                        ((ConcurrentHashMap) map).put(str, fixedSizeList);
                    }
                    fixedSizeList.add(str2);
                }
            }
        } finally {
            if (!b2) {
            }
        }
    }

    public static void j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d93a7d5", new Object[]{str, str2});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f18110a;
            List list = (List) concurrentHashMap.get(str);
            if (list == null) {
                list = new ArrayList();
                concurrentHashMap.put(str, list);
            }
            list.add(str2);
            i(str, str2);
        }
    }

    public static void k(String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51cf2b96", new Object[]{str, str2, str3, jSONObject});
        } else if (!TextUtils.isEmpty(str)) {
            Map<String, String> map = c;
            if (str2 == null) {
                str2 = "";
            }
            ((ConcurrentHashMap) map).put(str, str2);
            Map<String, String> map2 = d;
            if (str3 == null) {
                str3 = "";
            }
            ((ConcurrentHashMap) map2).put(str, str3);
            if (jSONObject != null) {
                ((ConcurrentHashMap) e).put(str, (JSONObject) jSONObject.clone());
            }
        }
    }

    public static void l(String str, String str2, JSONObject jSONObject) {
        JSONObject jSONObject2;
        List<String> b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17d54b75", new Object[]{str, str2, jSONObject});
        } else if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("ext")) != null && TextUtils.equals(jSONObject2.getString(nex.KEY_SECTION_TYPE), nex.TYPE_WIND_VANE_CARD) && (b2 = b(str)) != null) {
            ((ConcurrentHashMap) h).put(str, Long.valueOf(System.currentTimeMillis()));
            b2.add(str2);
        }
    }

    public static void m(boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b07f8fb8", new Object[]{new Boolean(z), new Integer(i2)});
            return;
        }
        i = z;
        j = i2;
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7a2f132", new Object[0])).booleanValue();
        }
        if (m <= 0) {
            return true;
        }
        if (l <= 0 || SystemClock.uptimeMillis() - l <= m) {
            return false;
        }
        return true;
    }

    public static void o(long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb6c7ced", new Object[]{new Long(j2), new Long(j3)});
            return;
        }
        l = j3;
        m = j2;
    }
}
