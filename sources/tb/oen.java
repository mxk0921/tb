package tb;

import android.app.Application;
import android.text.TextUtils;
import com.alibaba.poplayer.config.model.keep.KeepModel;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.search.rainbow.BucketDO;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class oen {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String b;
    public static String c;
    public static Application d;
    public static ren e;
    public static a5m f;
    public static volatile Map<String, BucketDO> g;
    public static c i;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String> f25331a = new HashMap();
    public static boolean h = false;
    public static boolean j = false;
    public static final BigInteger k = new BigInteger("100");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3aec6678", new Object[]{this});
            }
            return OrangeConfig.getInstance().getConfig("search_abtest", "content", "");
        }

        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("738fbf79", new Object[]{this});
            }
            return OrangeConfig.getInstance().getConfig("search_abtest", "version", "");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface c {
    }

    public static final void A(String str, BucketDO bucketDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83bc4436", new Object[]{str, bucketDO});
            return;
        }
        if (g == null) {
            g = new HashMap();
        }
        g.put(str, bucketDO);
    }

    public static Map<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("afd0c551", new Object[0]);
        }
        Map<String, String> map = f25331a;
        ((HashMap) map).clear();
        return map;
    }

    public static final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("798f3338", new Object[0]);
        } else if (i == null) {
            i = new b();
        }
    }

    public static final BucketDO c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BucketDO) ipChange.ipc$dispatch("72111bbd", new Object[]{str});
        }
        String e2 = e(str);
        if (g == null) {
            g = new HashMap();
        }
        BucketDO bucketDO = g.get(e2);
        if (bucketDO != null) {
            return bucketDO;
        }
        BucketDO g2 = qen.g(e2);
        if (g2 == null) {
            return null;
        }
        g.put(e2, g2);
        return g2;
    }

    public static JSONObject d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cb76a50c", new Object[]{jSONObject});
        }
        if (jSONObject == null || jSONObject.length() == 0) {
            return new JSONObject();
        }
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                jSONObject2.put(e(next), jSONObject.optJSONObject(next));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return jSONObject2;
    }

    public static final String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c1e999c2", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (!str.startsWith("tbAndroid")) {
            str = "tbAndroid".concat(str);
        }
        if (!h) {
            return str;
        }
        return str + "_beta";
    }

    public static Map<String, String> f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8c0d1fb8", new Object[]{str, str2});
        }
        Map<String, String> map = f25331a;
        ((HashMap) map).put(str, str2);
        return map;
    }

    public static void g(String str) {
        JSONObject jSONObject;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("502af139", new Object[]{str});
            return;
        }
        qen.e();
        if (g != null) {
            g.clear();
        }
        if (TextUtils.isEmpty(str)) {
            j = false;
            return;
        }
        JSONObject jSONObject2 = null;
        try {
            jSONObject = d(new JSONObject(str));
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject != null && jSONObject.length() != 0) {
            j = true;
            b();
            try {
                jSONObject2 = new JSONObject(((b) i).a());
            } catch (JSONException unused2) {
            }
            if (jSONObject2 != null && jSONObject2.length() != 0) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject optJSONObject = jSONObject2.optJSONObject(next);
                    if (!(optJSONObject == null || optJSONObject.length() == 0)) {
                        if (TextUtils.isEmpty(c)) {
                            str2 = "";
                        } else {
                            str2 = c.trim();
                        }
                        BucketDO w = w(optJSONObject, next, t(str2 + next));
                        JSONObject optJSONObject2 = jSONObject.optJSONObject(next);
                        if (optJSONObject2 != null && optJSONObject2.length() > 0) {
                            w = h(optJSONObject, next, optJSONObject2);
                        }
                        if (g == null) {
                            g = new HashMap();
                        }
                        g.put(next, w);
                        qen.c(next, w);
                    }
                }
            }
        }
    }

    public static Application i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[0]);
        }
        return d;
    }

    public static String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("879477d9", new Object[0]);
        }
        return k(null);
    }

    public static String k(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4936b6b1", new Object[]{list});
        }
        if (g == null) {
            g = new HashMap();
        }
        Map<String, BucketDO> h2 = qen.h();
        StringBuilder sb = new StringBuilder();
        String str = "";
        for (Map.Entry<String, BucketDO> entry : h2.entrySet()) {
            String key = entry.getKey();
            BucketDO value = entry.getValue();
            if (!TextUtils.isEmpty(key) && value != null && (list == null || !list.contains(key))) {
                ((HashMap) g).put(key, value);
                if (value.shouldStat) {
                    sb.append(str);
                    sb.append(value.id);
                    str = ",";
                }
            }
        }
        return sb.toString();
    }

    public static Map<String, String> l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f2f1315a", new Object[0]);
        }
        return f25331a;
    }

    public static String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d48c0c0", new Object[0]);
        }
        a5m a5mVar = f;
        if (a5mVar == null) {
            return "";
        }
        return a5mVar.getNick();
    }

    public static String n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("52be4504", new Object[]{str});
        }
        String e2 = e(str);
        if (g == null) {
            g = new HashMap();
        }
        BucketDO bucketDO = g.get(e2);
        if (bucketDO == null) {
            BucketDO g2 = qen.g(e2);
            if (g2 == null || !g2.shouldStat) {
                return "";
            }
            g.put(e2, g2);
            return g2.id;
        } else if (bucketDO.shouldStat) {
            return bucketDO.id;
        } else {
            return "";
        }
    }

    public static String o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4ab6eca0", new Object[]{str});
        }
        BucketDO c2 = c(str);
        if (c2 == null) {
            return "";
        }
        return c2.name;
    }

    public static void p(String str, String str2, Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa51614", new Object[]{str, str2, application});
            return;
        }
        b = str;
        c = str2;
        d = application;
        h = q(str);
    }

    public static final boolean q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("769f8a3d", new Object[]{str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && str.split("\\.").length > 3) {
            return true;
        }
        return false;
    }

    public static String r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1612d06a", new Object[]{str});
        }
        String s = s(str);
        ren renVar = e;
        if (renVar != null) {
            renVar.a(str, s);
        }
        return s;
    }

    public static String s(String str) {
        JSONObject jSONObject;
        String str2;
        JSONObject d2;
        JSONObject optJSONObject;
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67e529de", new Object[]{str});
        }
        if (TextUtils.isEmpty(c)) {
            return "";
        }
        b();
        String e2 = e(str);
        String b2 = ((b) i).b();
        String i2 = qen.i();
        ren renVar = e;
        if (renVar != null) {
            if (!TextUtils.isEmpty(b2)) {
                str4 = b2;
            } else {
                str4 = i2;
            }
            renVar.b(str4);
        }
        String str5 = (String) ((HashMap) f25331a).get(e2);
        if (!TextUtils.isEmpty(str5)) {
            return str5;
        }
        if (TextUtils.isEmpty(b2) || !TextUtils.equals(b2, i2)) {
            if (g != null) {
                ((HashMap) g).clear();
            }
        } else if (g != null && ((HashMap) g).containsKey(e2)) {
            BucketDO bucketDO = (BucketDO) ((HashMap) g).get(e2);
            if (bucketDO == null) {
                str3 = "";
            } else {
                str3 = bucketDO.name;
            }
            if (!TextUtils.isEmpty(str3)) {
                return str3;
            }
        }
        String a2 = ((b) i).a();
        if (TextUtils.isEmpty(a2)) {
            return o(str);
        }
        try {
            jSONObject = new JSONObject(a2);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null || jSONObject.length() == 0) {
            return o(str);
        }
        String f2 = qen.f();
        if (!TextUtils.isEmpty(f2) && !TextUtils.equals(f2, b)) {
            qen.e();
            if (g != null) {
                ((HashMap) g).clear();
            }
        }
        qen.b(b);
        qen.d(b2);
        JSONObject optJSONObject2 = jSONObject.optJSONObject(e2);
        if (optJSONObject2 == null || optJSONObject2.length() == 0) {
            return o(str);
        }
        if (TextUtils.isEmpty(c)) {
            str2 = "";
        } else {
            str2 = c.trim();
        }
        BucketDO w = w(optJSONObject2, e2, t(str2 + e2));
        if (j && (d2 = d(qen.j())) != null && !d2.isNull(e2) && (optJSONObject = d2.optJSONObject(e2)) != null) {
            w = h(optJSONObject2, e2, optJSONObject);
        }
        if (w == null) {
            return "";
        }
        A(e2, w);
        qen.c(e2, w);
        return w.name;
    }

    public static final int t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a92aff24", new Object[]{str})).intValue();
        }
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            byte[] bArr = new byte[8];
            for (int i2 = 0; i2 < 8; i2++) {
                bArr[i2] = digest[i2];
            }
            return new BigInteger(1, bArr).mod(k).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    public static void u(JSONObject jSONObject, BucketDO bucketDO) {
        JSONObject optJSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34d05c67", new Object[]{jSONObject, bucketDO});
            return;
        }
        bucketDO.name = jSONObject.optString("name");
        bucketDO.id = jSONObject.optString("id");
        if (!jSONObject.isNull("this_group_config") && (optJSONObject = jSONObject.optJSONObject("this_group_config")) != null && !optJSONObject.isNull(pg1.ATOM_values)) {
            bucketDO.config = v(optJSONObject.optJSONObject(pg1.ATOM_values));
        }
    }

    public static Map<String, String> v(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8c6fa48d", new Object[]{jSONObject});
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!jSONObject.isNull(next)) {
                hashMap.put(next, jSONObject.optString(next));
            }
        }
        return hashMap;
    }

    public static void x(a5m a5mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cc751f8", new Object[]{a5mVar});
        } else {
            f = a5mVar;
        }
    }

    public static void y(ren renVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3873d41d", new Object[]{renVar});
        } else {
            e = renVar;
        }
    }

    public static void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4fa0472", new Object[0]);
            return;
        }
        OrangeConfig.getInstance().getConfig("search_abtest", "content", "");
        OrangeConfig.getInstance().getConfig("search_abtest", "version", "");
    }

    public static BucketDO h(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BucketDO) ipChange.ipc$dispatch("71f7d075", new Object[]{jSONObject, str, jSONObject2});
        }
        String optString = jSONObject2.optString("name");
        String optString2 = jSONObject2.optString("id");
        BucketDO bucketDO = new BucketDO();
        bucketDO.testname = str;
        bucketDO.shouldStat = !TextUtils.equals("true", jSONObject.optString("disableStat"));
        JSONArray optJSONArray = jSONObject.optJSONArray("buckets");
        while (true) {
            if (i2 >= optJSONArray.length()) {
                break;
            }
            JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
            if (TextUtils.equals(optJSONObject.optString("name"), optString) && TextUtils.equals(optJSONObject.optString("id"), optString2)) {
                u(optJSONObject, bucketDO);
                break;
            }
            i2++;
        }
        return bucketDO;
    }

    public static BucketDO w(JSONObject jSONObject, String str, int i2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BucketDO) ipChange.ipc$dispatch("1e9afefb", new Object[]{jSONObject, str, new Integer(i2)});
        }
        BucketDO bucketDO = new BucketDO();
        bucketDO.testname = str;
        bucketDO.shouldStat = !TextUtils.equals("true", jSONObject.optString("disableStat"));
        JSONArray optJSONArray = jSONObject.optJSONArray("buckets");
        int i3 = 0;
        boolean z2 = false;
        while (true) {
            if (i3 >= optJSONArray.length()) {
                z = z2;
                break;
            }
            JSONObject optJSONObject = optJSONArray.optJSONObject(i3);
            int optInt = optJSONObject.optInt("start", -1);
            int optInt2 = optJSONObject.optInt("end", -1);
            HashSet hashSet = new HashSet(Arrays.asList(optJSONObject.optString(KeepModel.STRATEGY_WHITE_LIST).split(",")));
            if (optInt <= 0 && optInt2 >= 99) {
                bucketDO.shouldStat = false;
            }
            boolean contains = hashSet.contains(m());
            if (contains || (i2 >= optInt && i2 <= optInt2)) {
                u(optJSONObject, bucketDO);
                if (contains) {
                    break;
                }
                z2 = true;
            }
            i3++;
        }
        if (!z) {
            return null;
        }
        return bucketDO;
    }
}
