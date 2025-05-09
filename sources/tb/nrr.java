package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.ability.localization.Localization;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.constants.TabType;
import com.taobao.android.order.constants.OrderBizCode;
import com.taobao.android.protodb.Config;
import com.taobao.login4android.api.Login;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import tb.idl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class nrr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SCENE_FIRSTSCREEN = "firstScreen";
    public static final String SCENE_RELOADCONTAINER = "reloadContainer";
    public static final String TAG = "OrderListCache";
    public static JSONObject b;
    public static String c;
    public static m9v f;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f24909a = true;
    public static final List<String> d = Arrays.asList(TabType.ALL.getValue(), TabType.WAIT_PAY.getValue(), TabType.WAIT_SEND.getValue(), TabType.WAIT_CONFIRM.getValue());
    public static final n8v e = new n8v("order_list");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f24910a;
        public final /* synthetic */ String b;
        public final /* synthetic */ org.json.JSONObject c;
        public final /* synthetic */ String d;

        public a(Context context, String str, org.json.JSONObject jSONObject, String str2) {
            this.f24910a = context;
            this.b = str;
            this.c = jSONObject;
            this.d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                nrr.a(this.f24910a, this.b);
                org.json.JSONObject optJSONObject = this.c.optJSONObject("global");
                if (optJSONObject != null) {
                    optJSONObject.put("isLoadFromCache", "true");
                }
                nrr.b(this.c);
                String jSONObject = this.c.toString();
                m9v c = nrr.c();
                if (!c.s(this.b + this.d, jSONObject)) {
                    hav.d(nrr.TAG, "LSDB save failed");
                    n8v d = nrr.d();
                    Context context = this.f24910a;
                    d.l(context, this.b + this.d, jSONObject.getBytes());
                }
                hav.d(nrr.TAG, this.d + " cache saved");
            } catch (Exception e) {
                hav.d(nrr.TAG, this.d + " cache save failed: " + e.getMessage());
            }
        }
    }

    public static /* synthetic */ void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1253e7bb", new Object[]{context, str});
        } else {
            r(context, str);
        }
    }

    public static /* synthetic */ void b(org.json.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31625206", new Object[]{jSONObject});
        } else {
            f(jSONObject);
        }
    }

    public static /* synthetic */ m9v c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m9v) ipChange.ipc$dispatch("fcbf51c7", new Object[0]);
        }
        return l();
    }

    public static /* synthetic */ n8v d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n8v) ipChange.ipc$dispatch("f23e961f", new Object[0]);
        }
        return e;
    }

    public static void e(Context context, String str, org.json.JSONObject jSONObject, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9afebc48", new Object[]{context, str, jSONObject, str2, new Boolean(z)});
        } else if (uel.l("enableOrderListCache", true) && !TabType.WAIT_RATE.getValue().equals(str) && z) {
            String userId = Login.getUserId();
            if (TextUtils.isEmpty(userId)) {
                hav.d(TAG, "cache save failed: userId is null");
                return;
            }
            pav.k(new a(context, userId, jSONObject, str));
            if (!TextUtils.isEmpty(str2)) {
                m9v l = l();
                l.s(userId + str + "_orderIds", str2);
            }
        }
    }

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd038b", new Object[0]);
        } else {
            b = null;
        }
    }

    public static void i(org.json.JSONObject jSONObject, JSONArray jSONArray, org.json.JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6ff7b76", new Object[]{jSONObject, jSONArray, jSONObject2});
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            String optString = jSONArray.optString(i);
            JSONArray optJSONArray = jSONObject.optJSONArray(optString);
            if (optJSONArray == null) {
                jSONObject2.remove(optString);
            } else {
                i(jSONObject, optJSONArray, jSONObject2);
            }
            jSONObject2.remove(optString);
            jSONObject.remove(optString);
        }
    }

    public static Pair<JSONObject, JSONObject> k() {
        JSONObject parseObject;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        com.alibaba.fastjson.JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("29e66c20", new Object[0]);
        }
        if (!uel.l("enableOrderListCache", true)) {
            return null;
        }
        String userId = Login.getUserId();
        if (TextUtils.isEmpty(userId)) {
            return null;
        }
        Iterator<String> it = d.iterator();
        String str = null;
        while (it.hasNext()) {
            str = l().l(userId + it.next());
            if (!TextUtils.isEmpty(str)) {
                break;
            }
        }
        if (TextUtils.isEmpty(str) || (jSONObject = (parseObject = JSON.parseObject(str)).getJSONObject("data")) == null || (jSONObject2 = jSONObject.getJSONObject("query3")) == null) {
            return null;
        }
        String string = jSONObject2.getString("type");
        if (TextUtils.isEmpty(string) || (jSONObject3 = parseObject.getJSONObject("container")) == null) {
            return null;
        }
        Iterator<Object> it2 = jSONObject3.getJSONArray("data").iterator();
        JSONObject jSONObject5 = null;
        while (it2.hasNext()) {
            Object next = it2.next();
            if ((next instanceof JSONObject) && (jSONArray = (jSONObject4 = (JSONObject) next).getJSONArray("type")) != null && !jSONArray.isEmpty() && string.equals(jSONArray.get(0))) {
                jSONObject5 = jSONObject4;
            }
        }
        if (jSONObject5 == null) {
            return null;
        }
        return new Pair<>(jSONObject2, jSONObject5);
    }

    public static m9v l() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m9v) ipChange.ipc$dispatch("b07d407e", new Object[0]);
        }
        m9v m9vVar = f;
        if (m9vVar != null) {
            return m9vVar;
        }
        if (Localization.o()) {
            str = "order_list_" + Localization.h().getLanguage();
        } else {
            str = "order_list";
        }
        Config config = new Config();
        config.walSize = 524288;
        m9v e2 = m9v.e(str, config);
        f = e2;
        return e2;
    }

    public static JSONObject m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6075d494", new Object[0]);
        }
        f24909a = false;
        return b;
    }

    public static String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b130c9f5", new Object[0]);
        }
        return c;
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cece5e46", new Object[0])).booleanValue();
        }
        return f24909a;
    }

    public static void p(String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50863a88", new Object[]{str, new Boolean(z), str2});
        } else if ("firstScreen".equals(str)) {
            idl.c(idl.a.a(OrderBizCode.orderList, TAG).sampling(z ? 5.0E-4f : 0.001f).message(str2).success(z));
        }
    }

    public static void q(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e37e8401", new Object[]{str, list});
        } else if (list.isEmpty()) {
            hav.d(TAG, str + " save imgs failed: cachedImgList is empty");
        } else {
            String userId = Login.getUserId();
            if (TextUtils.isEmpty(userId)) {
                hav.d(TAG, str + " save imgs failed: userId is null");
                return;
            }
            try {
                String jSONString = JSON.toJSONString(list);
                m9v l = l();
                if (l.s(userId + str + "_img", jSONString)) {
                    hav.d(TAG, str + " imgs saved");
                    return;
                }
                hav.d(TAG, str + " imgs save failed");
            } catch (Throwable th) {
                hav.d(TAG, "save imgs failed: lsdb is error" + th.toString());
            }
        }
    }

    public static void h(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4887ecc8", new Object[]{context, str});
        } else if (uel.l("enableOrderListCache", true)) {
            for (String str2 : d) {
                m9v l = l();
                l.b(str + str2);
                context.deleteFile("order_list" + str + str2);
            }
            hav.d(TAG, "cache cleared: " + str);
        }
    }

    public static void f(org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b299cef", new Object[]{jSONObject});
            return;
        }
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("hierarchy");
        org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("data");
        if (optJSONObject2 != null && optJSONObject3 != null && (optJSONObject = optJSONObject2.optJSONObject("structure")) != null) {
            JSONArray optJSONArray = optJSONObject.optJSONArray("boughtlist");
            if (optJSONArray == null) {
                optJSONArray = optJSONObject.optJSONArray("boughtlist4");
            }
            if (optJSONArray != null) {
                int g = uel.g("cacheReserveGroupCount", 5);
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                    String optString = optJSONArray.optString(i3);
                    if (!TextUtils.isEmpty(optString) && optString.startsWith("MainGroup")) {
                        i2++;
                        if (i2 > g) {
                            JSONArray optJSONArray2 = optJSONObject.optJSONArray(optString);
                            if (optJSONArray2 != null) {
                                i(optJSONObject, optJSONArray2, optJSONObject3);
                            }
                            optJSONObject3.remove(optString);
                            optJSONObject.remove(optString);
                        }
                        i = i3;
                    }
                }
                while (i2 > g) {
                    i--;
                    optJSONArray.remove(i);
                    i2--;
                }
                org.json.JSONObject optJSONObject4 = jSONObject.optJSONObject("global");
                if (optJSONObject4 != null) {
                    try {
                        optJSONObject4.put("orderCount", String.valueOf(i2));
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    public static Pair<JSONObject, String> j(Context context, String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("4cd13f8f", new Object[]{context, str, str2});
        }
        b = null;
        if (TabType.REFUND.getValue().equals(str) || !uel.l("enableOrderListCache", true)) {
            return null;
        }
        String userId = Login.getUserId();
        if (TextUtils.isEmpty(userId)) {
            p(str2, false, "session 过期");
            return null;
        }
        m9v l = l();
        String l2 = l.l(userId + str);
        if (!v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_MY_TAOBAO, "enablePreRequestOrderList", true) || !TextUtils.isEmpty(l2)) {
            str3 = "LSDB 命中";
        } else {
            bbv g = qbv.j().g();
            l2 = g.a(userId + str, dbv.BIZ_ORDER_LIST);
            str3 = "TradeCache 命中";
        }
        if (!TextUtils.isEmpty(l2)) {
            try {
                JSONObject parseObject = JSON.parseObject(l2);
                hav.d(TAG, str + " use LSDBCache: " + str2);
                p(str2, true, str3);
                b = parseObject;
                c = l2;
                return new Pair<>(b, c);
            } catch (Exception e2) {
                p(str2, false, "未命中：LSDBCache parser error" + e2.getMessage());
                return null;
            }
        } else {
            hav.d(TAG, "LSDB is null");
            n8v n8vVar = e;
            byte[] k = n8vVar.k(context, userId + str);
            if (k == null) {
                p(str2, false, "未命中：" + str + " cache is null");
                return null;
            }
            try {
                String str4 = new String(k);
                JSONObject parseObject2 = JSON.parseObject(str4);
                p(str2, true, "FileCache 命中, isMainThread: " + pav.b());
                hav.d(TAG, str + " use FileCache: " + str2);
                b = parseObject2;
                c = str4;
                return new Pair<>(b, c);
            } catch (Exception e3) {
                p(str2, false, "未命中：fileCache parser error " + e3.getMessage());
                return null;
            }
        }
    }

    public static void r(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e59b828", new Object[]{context, str});
        } else if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("order_list_userIds", 0);
            com.alibaba.fastjson.JSONArray jSONArray = null;
            String string = sharedPreferences.getString("userId", null);
            hav.d(TAG, "oldUserIds: " + string);
            try {
                jSONArray = JSON.parseArray(string);
            } catch (Exception e2) {
                hav.d(TAG, "no userIds: " + e2.getMessage());
            }
            if (jSONArray == null) {
                jSONArray = new com.alibaba.fastjson.JSONArray();
            } else if (jSONArray.contains(str)) {
                jSONArray.remove(str);
            } else if (jSONArray.size() >= uel.g("maxAccountSize", 2)) {
                h(context, jSONArray.getString(0));
                jSONArray.remove(0);
            }
            jSONArray.add(str);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            String json = jSONArray.toString();
            edit.putString("userId", json);
            edit.commit();
            hav.d(TAG, "newUserIds: " + json);
        }
    }

    static {
        t2o.a(713031744);
    }
}
