package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbabilitykit.BatchCompExposureAbility;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class lht extends m8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long TBTRADEJSTRACKERREPORT = -3157506913900501055L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(794820611);
            t2o.a(336592930);
        }

        /* renamed from: a */
        public lht build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (lht) ipChange.ipc$dispatch("1f75c5c9", new Object[]{this, obj});
            }
            return new lht();
        }
    }

    static {
        t2o.a(794820610);
    }

    public static /* synthetic */ Object ipc$super(lht lhtVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trade/common/kit/ability/TbTradeJSTrackerReportAbility");
    }

    @Override // tb.m8
    public c8 f(n8 n8Var, k8 k8Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("40f5a125", new Object[]{this, n8Var, k8Var, u8Var});
        }
        if (n8Var == null || n8Var.h() == null) {
            return new f8();
        }
        String i = n8Var.i("type");
        JSONObject g = n8Var.g("commonParams");
        if (g == null) {
            return new f8();
        }
        String string = g.getString(MspDBHelper.BizEntry.COLUMN_NAME_PID);
        String string2 = g.getString("pageName");
        String string3 = g.getString("collectionUrl");
        String string4 = g.getString("message");
        String string5 = g.getString("sampling");
        if (i == null || string == null || string2 == null || string3 == null) {
            return new f8();
        }
        if (string4 == null) {
            string4 = "";
        }
        j(i, string, string2, string3, string4, string5, g, n8Var);
        return new f8();
    }

    public Map<String, String> i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5551f7cc", new Object[]{this, jSONObject});
        }
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            if (!(entry == null || entry.getKey() == null || entry.getValue() == null)) {
                hashMap.put(entry.getKey(), entry.getValue().toString());
            }
        }
        return hashMap;
    }

    public final float k(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("246ce28c", new Object[]{this, str, new Float(f)})).floatValue();
        }
        try {
            return Float.parseFloat(str);
        } catch (Exception unused) {
            return f;
        }
    }

    public final int l(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b468191f", new Object[]{this, str, new Integer(i)})).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (Throwable unused) {
            return i;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void j(String str, String str2, String str3, String str4, String str5, String str6, JSONObject jSONObject, n8 n8Var) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f2c4aca", new Object[]{this, str, str2, str3, str4, str5, str6, jSONObject, n8Var});
            return;
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -427040198:
                if (str.equals("reportPV")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -270619340:
                if (str.equals("reportError")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 146281925:
                if (str.equals("reportCustom")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1931173148:
                if (str.equals("reportMtop")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1931248189:
                if (str.equals("reportPerf")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                akl aklVar = new akl(str3, str2, str4);
                aklVar.j(str5);
                if (!TextUtils.isEmpty(str6)) {
                    aklVar.k(k(str6, 0.001f));
                }
                tcu.r(aklVar);
                return;
            case 1:
                wh8 k = wh8.k(str3, str2, str4);
                JSONObject g = n8Var.g(BatchCompExposureAbility.ERROR_PARAM);
                if (g != null) {
                    String string = g.getString("errorCode");
                    String string2 = g.getString("fileName");
                    k.p(str5);
                    k.l(string);
                    k.m(string2);
                    tcu.p(k);
                    return;
                }
                return;
            case 2:
                JSONObject g2 = n8Var.g("customParams");
                if (!(g2 == null || g2.isEmpty())) {
                    String string3 = g2.getString("code");
                    Boolean bool = Boolean.FALSE;
                    boolean booleanValue = srf.c("success", g2, bool).booleanValue();
                    String h = srf.h(hxj.UNIQID, g2, "");
                    int e = srf.e("branch", g2, -1);
                    boolean booleanValue2 = srf.c("branchEntry", g2, bool).booleanValue();
                    g15 l = g15.l(str3, string3, str2, str4);
                    l.x(booleanValue);
                    l.v(str5);
                    l.i(h);
                    l.k(booleanValue2);
                    l.j(e);
                    if (!TextUtils.isEmpty(str6)) {
                        l.w(k(str6, 0.001f));
                    }
                    JSONObject jSONObject2 = g2.getJSONObject("dimensions");
                    if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                        for (String str7 : jSONObject2.keySet()) {
                            if (!TextUtils.isEmpty(str7)) {
                                l.m(str7, jSONObject2.getString(str7));
                            }
                        }
                    }
                    JSONObject jSONObject3 = g2.getJSONObject("indicators");
                    if (jSONObject3 != null && !jSONObject3.isEmpty()) {
                        for (String str8 : jSONObject3.keySet()) {
                            if (!TextUtils.isEmpty(str8)) {
                                l.s(str8, jSONObject3.getString(str8));
                            }
                        }
                    }
                    tcu.o(l);
                    return;
                }
                return;
            case 3:
                JSONObject g3 = n8Var.g("mtopParams");
                if (g3 != null) {
                    String string4 = g3.getString("api");
                    String h2 = srf.h("timing", g3, "0");
                    boolean booleanValue3 = srf.c("success", g3, Boolean.FALSE).booleanValue();
                    String h3 = srf.h("traceId", g3, "");
                    o5j o5jVar = new o5j(str3, str2, str4, string4, booleanValue3);
                    if (!TextUtils.isEmpty(str6)) {
                        o5jVar.r(k(str6, 0.001f));
                    }
                    o5jVar.p(str5);
                    o5jVar.s(l(h2, 0));
                    o5jVar.t(h3);
                    JSONObject jSONObject4 = g3.getJSONObject("params");
                    if (jSONObject4 != null && !jSONObject4.isEmpty()) {
                        o5jVar.q(i(jSONObject4));
                    }
                    tcu.q(o5jVar);
                    return;
                }
                return;
            case 4:
                qwl qwlVar = new qwl(str3, str2, str4);
                qwlVar.g(str5);
                if (!TextUtils.isEmpty(str6)) {
                    qwlVar.h(k(str6, 0.001f));
                }
                JSONObject g4 = n8Var.g("perfParams");
                if (g4 != null) {
                    String string5 = g4.getString("name");
                    if (string5 != null) {
                        qwlVar.o(string5);
                    }
                    qwlVar.i(g4.getString(hxj.UNIQID));
                    JSONObject jSONObject5 = g4.getJSONObject("dimensions");
                    if (jSONObject5 != null && !jSONObject5.isEmpty()) {
                        for (String str9 : jSONObject5.keySet()) {
                            if (!TextUtils.isEmpty(str9)) {
                                qwlVar.k(str9, jSONObject5.getString(str9));
                            }
                        }
                    }
                    JSONArray jSONArray = g4.getJSONArray("stages");
                    if (!TextUtils.isEmpty(string5) && jSONArray != null && !jSONArray.isEmpty()) {
                        for (int i = 0; i < jSONArray.size(); i++) {
                            JSONObject jSONObject6 = jSONArray.getJSONObject(i);
                            String string6 = jSONObject6.getString("stageCode");
                            Long l2 = jSONObject6.getLong("costTimeMills");
                            if (!(string6 == null || l2 == null)) {
                                qwlVar.j(string6, l2.longValue());
                            }
                        }
                    }
                }
                tcu.s(qwlVar);
                return;
            default:
                return;
        }
    }
}
