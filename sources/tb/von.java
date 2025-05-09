package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.android.jarviswe.Jarvis;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.infoflow.commonsubservice.windvaneservice.HomeWindVaneServiceImpl;
import com.taobao.tao.recommend.common.FixedSizeList;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class von {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, List<String>> f30143a = new ConcurrentHashMap(8);
    public static final Map<String, FixedSizeList<String>> b = new ConcurrentHashMap(8);
    public static final Map<String, String> c = new ConcurrentHashMap(8);
    public static final Map<String, String> d = new ConcurrentHashMap(8);
    public static final Map<String, JSONObject> e = new ConcurrentHashMap(8);
    public static final Map<String, List<String>> f = new ConcurrentHashMap(8);
    public static final Map<String, JSONObject> g = new ConcurrentHashMap(8);
    public static JSONObject h = new JSONObject();
    public static JSONObject i = new JSONObject();
    public static long j = 0;
    public static Integer k = null;
    public static boolean l = false;
    public static int m = 0;
    public static boolean n = false;
    public static boolean o = false;
    public static boolean p = false;
    public static final String q = "hTaoHomePage";
    public static final String r = i2b.HOMEPAGE_HTAO;
    public static final String s = "cunHomePage";
    public static final String t = i2b.HOMEPAGE_CTAO;
    public static final String u = "oldHomePage";
    public static final String v = "old";
    public static final String w = "main";
    public static final Object x = new Object();

    static {
        t2o.a(729809902);
    }

    public static void B(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89d82e40", new Object[]{str});
        } else {
            h = JSON.parseObject(str);
        }
    }

    public static void C(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a7a0de2", new Object[]{new Boolean(z)});
        } else {
            p = z;
        }
    }

    public static void D(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c42c59e", new Object[]{new Boolean(z), new Boolean(z2)});
            return;
        }
        n = z;
        o = z2;
        fve.e("RecommendUtils", "productShouldRequestWindVane shouldRequest:" + z + "|enableWindTapOptimize:" + o + "|shouldRequestWindVane:" + n);
    }

    public static void E(String str, String str2) {
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

    public static void F(String str, String str2) {
        boolean b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23319081", new Object[]{str, str2});
            return;
        }
        try {
            if (k == null) {
                k = Integer.valueOf(f4b.c());
            }
            if (!TextUtils.isEmpty(str2) && k.intValue() > 0) {
                Map<String, FixedSizeList<String>> map = b;
                FixedSizeList fixedSizeList = (FixedSizeList) ((ConcurrentHashMap) map).get(str);
                if (fixedSizeList == null) {
                    fixedSizeList = new FixedSizeList(k.intValue());
                    ((ConcurrentHashMap) map).put(str, fixedSizeList);
                }
                fixedSizeList.add(str2);
            }
        } finally {
            if (!b2) {
            }
        }
    }

    public static boolean G(String str, List<SectionModel> list) {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69929b4f", new Object[]{str, list})).booleanValue();
        }
        synchronized (x) {
            try {
                AwesomeGetContainerData u2 = zza.d(str).u(str);
                if (!(u2 == null || (awesomeGetContainerInnerData = u2.base) == null)) {
                    awesomeGetContainerInnerData.sections = list;
                    List<SectionModel> n2 = kmn.n(str, u2, u2);
                    if (!(n2 == null || n2.size() == 0)) {
                        u2.totalSectionList = n2;
                    }
                    return false;
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void H(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d93a7d5", new Object[]{str, str2});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f30143a;
            List list = (List) concurrentHashMap.get(str);
            if (list == null) {
                list = new ArrayList();
                concurrentHashMap.put(str, list);
            }
            list.add(str2);
            F(str, str2);
        }
    }

    public static void I(String str, String str2, String str3, JSONObject jSONObject) {
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

    public static void J(String str, String str2, JSONObject jSONObject) {
        JSONObject jSONObject2;
        List<String> u2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17d54b75", new Object[]{str, str2, jSONObject});
        } else if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("ext")) != null && TextUtils.equals(jSONObject2.getString(nex.KEY_SECTION_TYPE), nex.TYPE_WIND_VANE_CARD) && (u2 = u(str)) != null) {
            j = System.currentTimeMillis();
            u2.add(str2);
        }
    }

    public static void K(boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b07f8fb8", new Object[]{new Boolean(z), new Integer(i2)});
            return;
        }
        l = z;
        m = i2;
    }

    public static boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7a2f132", new Object[0])).booleanValue();
        }
        if (HomeWindVaneServiceImpl.secondPageDurationLimit <= 0) {
            return true;
        }
        if (HomeWindVaneServiceImpl.clickInfoFlowTimeMills <= 0 || SystemClock.uptimeMillis() - HomeWindVaneServiceImpl.clickInfoFlowTimeMills <= HomeWindVaneServiceImpl.secondPageDurationLimit) {
            return false;
        }
        return true;
    }

    public static void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd5af8", new Object[]{jSONObject});
        } else {
            i = jSONObject;
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e3354bf", new Object[0]);
        } else {
            p = false;
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("377a86cb", new Object[0]);
            return;
        }
        n = false;
        o = false;
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fb446b29", new Object[]{str});
        }
        if (TextUtils.equals(str, q)) {
            return r;
        }
        if (TextUtils.equals(str, s)) {
            return t;
        }
        if (TextUtils.equals(str, u)) {
            return v;
        }
        return w;
    }

    public static List<SectionModel> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1f0dd08e", new Object[0]);
        }
        String k2 = kmn.k(o());
        return zza.d(k2).H(k2);
    }

    public static String f(String str) {
        List list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("351769bd", new Object[]{str});
        }
        try {
            if (k == null) {
                k = Integer.valueOf(f4b.c());
            }
            if (k.intValue() > 0 && (list = (List) ((ConcurrentHashMap) b).get(str)) != null && !list.isEmpty()) {
                StringBuilder sb = new StringBuilder((String) list.get(0));
                int size = list.size();
                for (int i2 = 1; i2 < size; i2++) {
                    sb.append(",");
                    sb.append((String) list.get(i2));
                }
                return sb.toString();
            }
            return "";
        } catch (Throwable th) {
            bqa.d("RecommendUtils", th.getMessage());
            if (!cw6.b()) {
                return "";
            }
            throw th;
        }
    }

    public static String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66e9c271", new Object[0]);
        }
        PositionInfo c2 = kbq.c(m0b.c());
        HashMap hashMap = new HashMap();
        hashMap.put("countryId", c2.countryCode);
        hashMap.put("cityId", c2.cityId);
        hashMap.put("countryNumCode", c2.countryNumCode);
        hashMap.put("actualLanguageCode", c2.actualLanguageCode);
        hashMap.put("currencyCode", c2.currencyCode);
        return JSON.toJSONString(hashMap);
    }

    @Deprecated
    public static JSONObject h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a08ab512", new Object[0]);
        }
        String k2 = kmn.k(o());
        if (k2 == null || zza.d(k2).u(k2) == null) {
            return null;
        }
        return zza.d(k2).u(k2).getExt();
    }

    @Deprecated
    public static List<SectionModel> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("859a0cc0", new Object[0]);
        }
        return k(e());
    }

    public static List<SectionModel> j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c848976", new Object[]{str});
        }
        if (zza.d(str) != null) {
            return k(zza.d(str).H(str));
        }
        return null;
    }

    public static List<SectionModel> k(List<SectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f529cdaf", new Object[]{list});
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            SectionModel sectionModel = list.get(size);
            if (sectionModel.getBooleanValue(zjn.IS_USER_ACTION_TRACKED)) {
                break;
            }
            arrayList.add(0, sectionModel);
        }
        return arrayList;
    }

    public static JSONObject l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("23ac02c7", new Object[]{str});
        }
        return null;
    }

    public static JSONObject m(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c6ba2275", new Object[]{new Integer(i2)});
        }
        return null;
    }

    public static int n(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3187647e", new Object[]{jSONObject})).intValue();
        }
        return -1;
    }

    public static JSONObject o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ca4c68b9", new Object[0]);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("containerId", (Object) yyj.e().k());
        return jSONObject;
    }

    public static String p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4ad9900", new Object[]{str});
        }
        return gon.c(q(d(str)), null);
    }

    public static String q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3b61a69f", new Object[]{str});
        }
        return "lastResultVersion_" + str;
    }

    public static long r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f5ee55b3", new Object[0])).longValue();
        }
        return j;
    }

    public static View s(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("12f06cf0", new Object[]{view});
        }
        while (view != null && !(view.getParent() instanceof RecyclerView)) {
            view = (View) view.getParent();
        }
        return view;
    }

    public static String t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c4a174c", new Object[]{str});
        }
        return (String) ((ConcurrentHashMap) c).get(str);
    }

    public static List<String> u(String str) {
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

    public static JSONObject v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5cfe25f7", new Object[]{str});
        }
        return (JSONObject) ((ConcurrentHashMap) e).get(str);
    }

    public static JSONObject w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("721e55a6", new Object[]{str});
        }
        return (JSONObject) ((ConcurrentHashMap) g).get(str);
    }

    public static String x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8877db94", new Object[]{str});
        }
        return (String) ((ConcurrentHashMap) d).get(str);
    }

    public static boolean y(AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25ad7baa", new Object[]{awesomeGetContainerData})).booleanValue();
        }
        return true;
    }

    public static void z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30bbd008", new Object[]{str});
        } else {
            A(str, zza.d(str).H(str));
        }
    }

    public static void A(String str, List<SectionModel> list) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f594cf9", new Object[]{str, list});
        } else if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (SectionModel sectionModel : list) {
                if (sectionModel != null) {
                    arrayList.add(sectionModel.getString("sectionBizCode"));
                }
            }
            String t2 = t(str);
            z = new cix(new eix(str, "windvane_request", t2, x(str), u(str), arrayList, list, 0, 0)).l(l, m);
            if (TextUtils.equals(yyj.l().f32522a, str)) {
                z = z && p;
            }
            if (o) {
                if (!z || !n) {
                    z = false;
                }
            }
            fve.e("RecommendUtils", "prepareWindvaneParams shouldRequest:" + z + "|enableWindTapOptimize:" + o + "|shouldRequestWindVane:" + n);
            if (z) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("behavioralData", (Object) Jarvis.readKKVCache("gul_detail_action", t2));
                } catch (Throwable unused) {
                }
                jSONObject.put("sectionBizCode", (Object) x(str));
                jSONObject.put("itemId", (Object) t2);
                JSONObject jSONObject2 = i;
                if (jSONObject2 != null) {
                    jSONObject.putAll(jSONObject2);
                }
                JSONObject v2 = v(str);
                if (v2 != null) {
                    jSONObject.putAll(v2);
                }
                if (o) {
                    jSONObject.putAll(h);
                }
                ((ConcurrentHashMap) g).put(str, jSONObject);
            } else {
                ((ConcurrentHashMap) g).remove(str);
            }
            c();
            b();
        }
    }
}
