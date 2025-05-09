package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.base.Versions;
import com.taobao.login4android.api.Login;
import com.taobao.mytaobao.base.MtbGlobalEnv;
import com.taobao.statistic.TBS;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class mh8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(745537722);
    }

    public final String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cadd466", new Object[]{this, str});
        }
        if (str == null || str.length() == 0 || ckf.b("null", str)) {
            return null;
        }
        return str;
    }

    public final String e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d1ed943a", new Object[]{this, jSONObject});
        }
        String d = d(jSONObject.getString(ko5.KEY_INTEGER));
        String str = "";
        if (d == null) {
            return str;
        }
        String d2 = d(jSONObject.getString(ko5.KEY_DECIMAL));
        StringBuilder sb = new StringBuilder();
        sb.append(d);
        if (d2 != null) {
            str = d2;
        }
        sb.append((Object) str);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<String, JSONObject> f(JSONObject jSONObject) {
        List list;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        JSONObject jSONObject6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c170e0a3", new Object[]{this, jSONObject});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (jSONObject == null || (jSONObject5 = jSONObject.getJSONObject("fields")) == null || (jSONObject6 = jSONObject5.getJSONObject("benefit")) == null || (list = jSONObject6.getJSONArray("benefitList")) == null) {
            list = yz3.i();
        }
        Iterator it = list.iterator();
        while (true) {
            jSONObject2 = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next instanceof JSONObject) {
                jSONObject2 = next;
            }
            JSONObject jSONObject7 = jSONObject2;
            if (jSONObject7 != null) {
                linkedHashMap.put(jSONObject7.getString("bizCode"), jSONObject7);
            }
        }
        if (!(jSONObject == null || (jSONObject3 = jSONObject.getJSONObject("fields")) == null || (jSONObject4 = jSONObject3.getJSONObject("benefit")) == null)) {
            jSONObject2 = jSONObject4.getJSONObject("taoBaoTotalSaving");
        }
        if (jSONObject2 != null) {
            linkedHashMap.put("totalSaving", jSONObject2);
        }
        return linkedHashMap;
    }

    public final JSONObject g(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        JSONObject jSONObject6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a0bbb05c", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject7 = null;
        if (jSONObject == null || (jSONObject5 = jSONObject.getJSONObject("data")) == null || (jSONObject6 = jSONObject5.getJSONObject("data")) == null) {
            jSONObject2 = null;
        } else {
            jSONObject2 = jSONObject6.getJSONObject("benefitModule2024V2_1");
        }
        if (jSONObject2 != null) {
            return jSONObject2;
        }
        if (!(jSONObject == null || (jSONObject3 = jSONObject.getJSONObject("data")) == null || (jSONObject4 = jSONObject3.getJSONObject("data")) == null)) {
            jSONObject7 = jSONObject4.getJSONObject("headerModule_11");
        }
        return jSONObject7;
    }

    public final List<String> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("930181a1", new Object[]{this});
        }
        String f = ih4.f("equityNumSlideBizPriority", "redEnvelope,coinGame,coupon,totalSaving,tmallPoint");
        if (f != null) {
            return wsq.z0(f, new String[]{","}, false, 0, 6, null);
        }
        return yz3.i();
    }

    public final int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("714b6574", new Object[]{this})).intValue();
        }
        return ih4.d("equityChangeNumSlideFreq", 3);
    }

    public final String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45708206", new Object[]{this});
        }
        return Login.getUserId() + "_numSlideShowTimeList";
    }

    public final boolean l(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48ff38ce", new Object[]{this, jSONObject, jSONObject2})).booleanValue();
        }
        String string = jSONObject.getString("bizCode");
        String string2 = jSONObject2.getString("bizCode");
        if (string == null || string.length() == 0 || !ckf.b(string, string2)) {
            return false;
        }
        return true;
    }

    public final boolean m(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d64c8212", new Object[]{this, str, str2})).booleanValue();
        }
        if (wsq.X(str, '.', 0, false, 6, null) * wsq.X(str2, '.', 0, false, 6, null) > 0) {
            return true;
        }
        return false;
    }

    public final void n() {
        List arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a89869e2", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String c = yjp.c("equityAnimation", j(), "");
        if (c != null) {
            arrayList = i04.E0(wsq.z0(c, new String[]{","}, false, 0, 6, null));
        } else {
            arrayList = new ArrayList();
        }
        if (arrayList.size() >= i()) {
            arrayList.remove(0);
        }
        arrayList.add(String.valueOf(currentTimeMillis));
        yjp.e("equityAnimation", j(), i04.j0(arrayList, ",", null, null, 0, null, null, 62, null));
    }

    public final void o(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2224f8a", new Object[]{this, jSONObject});
            return;
        }
        TBS.Ext.commitEvent(u3j.b, 2201, "/mytaobao.benefit.dingkeng_flip", null, null, "spm=" + jSONObject.get("spm"), z9u.ARG_SCM + jSONObject.get("scm"));
    }

    public final JSONObject p(JSONObject jSONObject, JSONObject jSONObject2, boolean z, boolean z2) {
        JSONObject g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fb8b2813", new Object[]{this, jSONObject, jSONObject2, new Boolean(z), new Boolean(z2)});
        }
        ckf.h(jSONObject, "data");
        JSONObject g2 = g(jSONObject);
        if (!(g2 == null || (g = g(jSONObject2)) == null)) {
            q(g2, g, z, z2);
        }
        return jSONObject;
    }

    public final void q(JSONObject jSONObject, JSONObject jSONObject2, boolean z, boolean z2) {
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8c6185e", new Object[]{this, jSONObject, jSONObject2, new Boolean(z), new Boolean(z2)});
            return;
        }
        ckf.h(jSONObject, "newModuleData");
        ckf.h(jSONObject2, "oldModuleData");
        if (c(z, z2)) {
            Map<String, JSONObject> f = f(jSONObject2);
            Map<String, JSONObject> f2 = f(jSONObject);
            if (!f.isEmpty() && !f2.isEmpty()) {
                List<String> h = h();
                JSONObject jSONObject4 = null;
                if (h.isEmpty()) {
                    h = null;
                }
                if (h != null) {
                    Iterator<String> it = h.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            jSONObject3 = null;
                            break;
                        }
                        String next = it.next();
                        JSONObject jSONObject5 = f2.get(next);
                        if (jSONObject5 != null && (jSONObject3 = f.get(next)) != null && jSONObject5.getBooleanValue("enableAssetsScroll") && k(jSONObject5, jSONObject3) && l(jSONObject5, jSONObject3)) {
                            jSONObject4 = jSONObject5;
                            break;
                        }
                    }
                    if (jSONObject4 == null || jSONObject3 == null) {
                        TLog.loge("EquityNumSlideTransform", "没有找到需要滚动的数据");
                        return;
                    }
                    try {
                        JSONObject a2 = a(jSONObject4, jSONObject3);
                        if (a2 != null) {
                            jSONObject4.put((JSONObject) "amountChanges", (String) a2);
                        } else {
                            jSONObject4.remove("amountChanges");
                        }
                        n();
                        o(jSONObject4);
                        TLog.loge("EquityNumSlideTransform", jSONObject4.get("bizCode") + "执行数字滚动");
                    } catch (Exception e) {
                        if (!Versions.isDebug()) {
                            TLog.loge("EquityNumSlideTransform", "buildAmountChanges error", e);
                            return;
                        }
                        throw e;
                    }
                }
            }
        }
    }

    public final boolean b() {
        List list;
        Long o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79f87ca8", new Object[]{this})).booleanValue();
        }
        String c = yjp.c("equityAnimation", j(), "");
        if (c != null) {
            list = i04.E0(wsq.z0(c, new String[]{","}, false, 0, 6, null));
        } else {
            list = new ArrayList();
        }
        int i = i();
        if (list.size() < i) {
            return true;
        }
        String str = (String) i04.d0(list, list.size() - i);
        long longValue = (str == null || (o = ssq.o(str)) == null) ? 0L : o.longValue();
        TLog.loge("EquityNumSlideTransform", "最近" + i + "次最早滚动时间是" + longValue);
        return System.currentTimeMillis() - longValue > 86400000;
    }

    public final boolean c(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be6b8b39", new Object[]{this, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        if (MtbGlobalEnv.v()) {
            TLog.loge("EquityNumSlideTransform", "不开启权益数字滚动");
            return false;
        } else if (z2 && z) {
            TLog.loge("EquityNumSlideTransform", "本地兜底快照数据，不进行数字滚动");
            return false;
        } else if (b()) {
            return true;
        } else {
            TLog.loge("EquityNumSlideTransform", "疲劳度校验失败");
            return false;
        }
    }

    public final boolean k(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("580a8313", new Object[]{this, jSONObject, jSONObject2})).booleanValue();
        }
        String e = e(jSONObject);
        String str = null;
        if (e.length() <= 0) {
            e = null;
        }
        if (e != null) {
            String e2 = e(jSONObject2);
            if (e2.length() > 0) {
                str = e2;
            }
            if (str != null) {
                try {
                    return Float.parseFloat(e) > Float.parseFloat(str);
                } catch (Exception e3) {
                    TLog.loge("EquityNumSlideTransform", "数字类型错误", e3);
                }
            }
        }
        return false;
    }

    public final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4088a9a4", new Object[]{this, jSONObject, jSONObject2});
        }
        String e = e(jSONObject);
        String e2 = e(jSONObject2);
        if (!m(e, e2)) {
            TLog.loge("EquityNumSlideTransform", "数字类型不一致，不进行滚动");
            return null;
        }
        int X = wsq.X(e, '.', 0, false, 6, null);
        int X2 = wsq.X(e2, '.', 0, false, 6, null);
        if (X == -1 && X2 == -1) {
            if (e.length() > e2.length()) {
                e2 = tsq.A("0", e.length() - e2.length()) + e2;
            }
        } else if (X > X2) {
            e2 = tsq.A("0", X - X2) + e2;
        }
        if (wsq.X(e, '.', 0, false, 6, null) != wsq.X(e2, '.', 0, false, 6, null)) {
            TLog.loge("EquityNumSlideTransform", "整数位对齐错误，不进行滚动");
            return null;
        }
        JSONObject jSONObject3 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONObject3.put((JSONObject) "integerChanges", (String) jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        jSONObject3.put((JSONObject) "decimalChanges", (String) jSONArray2);
        int length = e.length();
        boolean z = false;
        while (i < length) {
            char charAt = e.charAt(i);
            char charAt2 = (i < 0 || i > wsq.S(e2)) ? '0' : e2.charAt(i);
            JSONArray jSONArray3 = new JSONArray();
            if ('0' <= charAt && '9' >= charAt) {
                if (charAt > charAt2) {
                    gj3 gj3Var = new gj3(charAt2, charAt);
                    ArrayList arrayList = new ArrayList(zz3.q(gj3Var, 10));
                    Iterator<Character> it = gj3Var.iterator();
                    while (((fj3) it).hasNext()) {
                        arrayList.add(String.valueOf(((dj3) it).a()));
                    }
                    jSONArray3.addAll(arrayList);
                } else if (charAt < charAt2) {
                    gj3 gj3Var2 = new gj3(charAt2, '9');
                    ArrayList arrayList2 = new ArrayList(zz3.q(gj3Var2, 10));
                    Iterator<Character> it2 = gj3Var2.iterator();
                    while (((fj3) it2).hasNext()) {
                        arrayList2.add(String.valueOf(((dj3) it2).a()));
                    }
                    jSONArray3.addAll(arrayList2);
                    gj3 gj3Var3 = new gj3('0', charAt);
                    ArrayList arrayList3 = new ArrayList(zz3.q(gj3Var3, 10));
                    Iterator<Character> it3 = gj3Var3.iterator();
                    while (((fj3) it3).hasNext()) {
                        arrayList3.add(String.valueOf(((dj3) it3).a()));
                    }
                    jSONArray3.addAll(arrayList3);
                } else {
                    jSONArray3.add(String.valueOf(charAt));
                }
            } else if (charAt == '.') {
                jSONArray3.add(".");
                z = true;
            }
            if (z) {
                jSONArray2.add(jSONArray3);
            } else {
                jSONArray.add(jSONArray3);
            }
            i++;
        }
        return jSONObject3;
    }
}
