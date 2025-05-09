package tb;

import android.app.Application;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vve {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cfc f30277a;
        public final /* synthetic */ om1 b;
        public final /* synthetic */ BaseSectionModel c;
        public final /* synthetic */ JSONObject d;
        public final /* synthetic */ JSONObject e;

        public a(cfc cfcVar, om1 om1Var, BaseSectionModel baseSectionModel, JSONObject jSONObject, JSONObject jSONObject2) {
            this.f30277a = cfcVar;
            this.b = om1Var;
            this.c = baseSectionModel;
            this.d = jSONObject;
            this.e = jSONObject2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                vve.a(this.f30277a, this.b, this.c, this.d, this.e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f30278a;
        public final /* synthetic */ JSONObject b;

        public b(JSONObject jSONObject, JSONObject jSONObject2) {
            this.f30278a = jSONObject;
            this.b = jSONObject2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                vve.b(null, this.f30278a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class c extends TypeReference<HashMap<String, String>> {
    }

    static {
        t2o.a(486539768);
    }

    public static /* synthetic */ void a(cfc cfcVar, om1 om1Var, BaseSectionModel baseSectionModel, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f9375d7", new Object[]{cfcVar, om1Var, baseSectionModel, jSONObject, jSONObject2});
        } else {
            v(cfcVar, om1Var, baseSectionModel, jSONObject, jSONObject2);
        }
    }

    public static /* synthetic */ void b(BaseSectionModel baseSectionModel, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca7a00", new Object[]{baseSectionModel, jSONObject, jSONObject2});
        } else {
            n(baseSectionModel, jSONObject, jSONObject2);
        }
    }

    public static void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b694c7cd", new Object[]{jSONObject});
        } else if (jSONObject != null) {
            String d = mve.d(xmo.SP_KEY_ORANGE_CONFIG_VERSION, "0");
            if (TextUtils.equals(d, "0")) {
                fve.e("UserTrackUtils", "Orange版本获取失败");
            }
            jSONObject.put(xmo.SP_KEY_ORANGE_CONFIG_VERSION, (Object) d);
        }
    }

    public static void d(BaseSectionModel<?> baseSectionModel, JSONObject jSONObject, String str) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94c3a77e", new Object[]{baseSectionModel, jSONObject, str});
            return;
        }
        JSONObject args = baseSectionModel.getArgs();
        if (args != null && TextUtils.equals("1", args.getString(jtv.S_ARGS_IS_CLIENT_CACHE)) && (jSONObject2 = jSONObject.getJSONObject(str)) != null && (jSONObject3 = jSONObject2.getJSONObject("args")) != null) {
            jSONObject3.put(jtv.S_ARGS_IS_CLIENT_CACHE, "1");
        }
    }

    public static void e(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0ae25ed", new Object[]{baseSectionModel, baseSubItemModel});
        } else {
            d(baseSectionModel, baseSubItemModel, "clickParam");
        }
    }

    public static void f(BaseSectionModel<?> baseSectionModel, BaseSectionModel<?> baseSectionModel2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26246e3d", new Object[]{baseSectionModel, baseSectionModel2});
        } else {
            d(baseSectionModel, baseSectionModel2, i2b.TRACK_EXPOSURE_PARAM);
        }
    }

    public static void g(BaseSectionModel<?> baseSectionModel, JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee96714c", new Object[]{baseSectionModel, jSONObject});
            return;
        }
        String t = t(jSONObject);
        String s = s(baseSectionModel);
        if (TextUtils.isEmpty(t) || s == null) {
            fve.e("UserTrackUtils", "realIndex: is null");
            return;
        }
        try {
            jSONObject2 = JSON.parseObject(URLDecoder.decode(t, "UTF-8"));
        } catch (Throwable th) {
            fve.c("UserTrackUtils", "addRecIndexToUtLogMap error: " + th.getMessage(), th);
            jSONObject2 = null;
        }
        if (jSONObject2 != null) {
            jSONObject2.put("recIndex", (Object) s);
            String jSONString = jSONObject2.toJSONString();
            try {
                jSONString = URLEncoder.encode(jSONString, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            jSONObject.put("utLogMap", (Object) jSONString);
        }
    }

    public static void h(JSONObject jSONObject, om1 om1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af1fca09", new Object[]{jSONObject, om1Var});
        } else if (jSONObject != null) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.putAll(u6a.v(om1Var));
                if (!jSONObject2.isEmpty()) {
                    jSONObject.put("slideGesture", (Object) URLEncoder.encode(jSONObject2.toJSONString(), "UTF-8"));
                }
            } catch (Throwable th) {
                fve.c("UserTrackUtils", "BX提供的手势获取函数异常，", th);
            }
        }
    }

    public static void i(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2bec91a", new Object[]{str, jSONObject});
            return;
        }
        HashMap hashMap = new HashMap(16);
        hashMap.put("Page_Home_Show-guessitem-1001", "utLogMapEdge");
        hashMap.put(svv.ARG1_CLICK, "utLogMapEdge");
        try {
            if (hashMap.containsKey(str)) {
                jSONObject.remove(hashMap.get(str));
            }
        } catch (Exception e) {
            fve.c("UserTrackUtils", "cleanUTArgs.", e);
        }
    }

    public static void j(BaseSectionModel<?> baseSectionModel, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31da0a23", new Object[]{baseSectionModel, jSONObject, jSONObject2});
        } else if (baseSectionModel == null) {
            fve.m("UserTrackUtils", "commitClickAd card == null");
        } else if (jSONObject == null) {
            fve.m("UserTrackUtils", "commitClickAd clickParamArgs == null");
        } else {
            JSONObject q = q(jSONObject, jSONObject2, "args");
            if (q == null) {
                fve.m("UserTrackUtils", "commitClickAd args == null");
            } else if (TextUtils.equals(q.getString("brandAd"), "1")) {
                String string = q.getString("clkArr");
                String string2 = q.getString(MspDBHelper.BizEntry.COLUMN_NAME_PID);
                String string3 = baseSectionModel.getString("adNamespace");
                String r = r(jSONObject, null, "page");
                if (TextUtils.isEmpty(string)) {
                    fve.e("UserTrackUtils", "commitExposureAd 广告入参不合法 clkArr ： " + string);
                    return;
                }
                fve.e("UserTrackUtils", "commitExposureAd clkArr");
                due.d(string, string2, string3, null);
                uve.a("Page_Extend", 19999, "info_flow_commit_ifs_clkArr", "microservice", r, "1");
            }
        }
    }

    public static void k(BaseSectionModel<?> baseSectionModel, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f51abd8", new Object[]{baseSectionModel, jSONObject, jSONObject2});
        } else {
            l(null, null, baseSectionModel, jSONObject, jSONObject2);
        }
    }

    public static void l(cfc cfcVar, View view, BaseSectionModel<?> baseSectionModel, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("280958ea", new Object[]{cfcVar, view, baseSectionModel, jSONObject, jSONObject2});
        } else {
            get.a().i(new a(cfcVar, hue.g(view), baseSectionModel, jSONObject, jSONObject2));
        }
    }

    public static void m(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1e14a2a", new Object[]{jSONObject, jSONObject2});
        } else {
            get.a().i(new b(jSONObject, jSONObject2));
        }
    }

    public static void n(BaseSectionModel<?> baseSectionModel, JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3066adb", new Object[]{baseSectionModel, jSONObject, jSONObject2});
        } else if (jSONObject == null || jSONObject.isEmpty()) {
            fve.m("UserTrackUtils", "commitEvent trackParams == null || trackParams.isEmpty()");
        } else if (!jSONObject.containsKey("page") || !jSONObject.containsKey("eventId")) {
            fve.m("UserTrackUtils", "commitEvent 缺少埋点必要参数");
        } else {
            String r = r(jSONObject, jSONObject2, "page");
            String r2 = r(jSONObject, jSONObject2, "eventId");
            String r3 = r(jSONObject, jSONObject2, "arg1");
            String r4 = r(jSONObject, jSONObject2, "arg2");
            String r5 = r(jSONObject, jSONObject2, "arg3");
            JSONObject q = q(jSONObject, jSONObject2, "args");
            i(r3, q);
            g(baseSectionModel, q);
            c(q);
            if (q != null) {
                q.put("client_ts", (Object) Long.valueOf(System.currentTimeMillis()));
            }
            uve.a(r, Integer.parseInt(r2), r3, r4, r5, x(r, q));
            if (q == null) {
                str = "";
            } else {
                str = q.getString("ifs");
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject("args");
            if (jSONObject3 == null || !TextUtils.equals(jSONObject3.getString("brandAd"), "1")) {
                Application a2 = eue.a();
                if (!TextUtils.isEmpty(str) && a2 != null) {
                    due.a(a2, str, null, null, null);
                    uve.a("Page_Extend", 19999, "info_flow_commit_ifs", "microservice", r, "2");
                }
            }
        }
    }

    public static void o(BaseSectionModel<?> baseSectionModel, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d7af80", new Object[]{baseSectionModel, jSONObject});
        } else if (jSONObject == null) {
            fve.m("UserTrackUtils", "commitExposureAd exposureParamArgs == null");
        } else if (TextUtils.equals(jSONObject.getString("brandAd"), "1")) {
            Application a2 = eue.a();
            String string = jSONObject.getString("ifs");
            String string2 = jSONObject.getString("ifsArr");
            String string3 = jSONObject.getString(MspDBHelper.BizEntry.COLUMN_NAME_PID);
            String string4 = baseSectionModel.getString("adNamespace");
            String page = baseSectionModel.getExposureParam() != null ? baseSectionModel.getExposureParam().getPage() : null;
            if (a2 != null && !TextUtils.isEmpty(string)) {
                fve.e("UserTrackUtils", "commitExposureAd ifsUrl");
                due.a(a2, string, string3, string4, null);
                uve.a("Page_Extend", 19999, "info_flow_commit_ifs", "microservice", page, "1");
            } else if (!TextUtils.isEmpty(string2)) {
                fve.e("UserTrackUtils", "commitExposureAd ifsArr");
                due.e(string2, string3, string4, null);
                uve.a("Page_Extend", 19999, "info_flow_commit_ifs_ifsArr", "microservice", page, "1");
            } else {
                fve.e("UserTrackUtils", "commitExposureAd error");
            }
        }
    }

    public static void p(BaseSectionModel<?> baseSectionModel, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd61f825", new Object[]{baseSectionModel, jSONObject});
        } else {
            w(baseSectionModel, jSONObject);
        }
    }

    public static JSONObject q(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("152d470d", new Object[]{jSONObject, jSONObject2, str});
        }
        if (jSONObject2 == null) {
            jSONObject3 = null;
        } else {
            jSONObject3 = jSONObject2.getJSONObject(str);
        }
        if (jSONObject3 == null || jSONObject3.isEmpty()) {
            return jSONObject.getJSONObject(str);
        }
        return jSONObject3;
    }

    public static String r(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7a57bad2", new Object[]{jSONObject, jSONObject2, str});
        }
        if (jSONObject2 == null) {
            str2 = null;
        } else {
            str2 = jSONObject2.getString(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        return jSONObject.getString(str);
    }

    public static String s(BaseSectionModel<?> baseSectionModel) {
        JSONObject args;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("19368783", new Object[]{baseSectionModel});
        }
        if (baseSectionModel == null || (args = baseSectionModel.getArgs()) == null) {
            return null;
        }
        return args.getString("recIndex");
    }

    public static String t(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc695bfb", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getString("utLogMap");
    }

    public static JSONObject u(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ba9c6d45", new Object[]{jSONObject, jSONObject2});
        }
        if (!(jSONObject2 == null || jSONObject2.isEmpty() || jSONObject == null)) {
            try {
                JSONObject jSONObject3 = jSONObject.getJSONObject("args");
                if (jSONObject3 == null) {
                    jSONObject.put("args", (Object) jSONObject2);
                } else {
                    boolean equals = "1".equals(jSONObject2.getString("argsType"));
                    for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                        if (!equals) {
                            jSONObject3.put(entry.getKey(), entry.getValue());
                        } else if (!jSONObject3.containsKey(entry.getKey())) {
                            jSONObject3.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
            } catch (Throwable th) {
                fve.c("UserTrackUtils", "AutoExposureUtils", th);
            }
        }
        return jSONObject;
    }

    public static void v(cfc cfcVar, om1 om1Var, BaseSectionModel<?> baseSectionModel, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea65dff", new Object[]{cfcVar, om1Var, baseSectionModel, jSONObject, jSONObject2});
        } else if (jSONObject != null) {
            y(cfcVar, baseSectionModel, jSONObject);
            JSONObject jSONObject4 = jSONObject.getJSONObject("clickParam");
            if (baseSectionModel == null) {
                jSONObject3 = null;
            } else {
                jSONObject3 = baseSectionModel.getJSONObject("args");
            }
            u(jSONObject4, jSONObject3);
            if (jSONObject4 != null) {
                h(jSONObject4.getJSONObject("args"), om1Var);
            }
            j(baseSectionModel, jSONObject4, jSONObject2);
            n(baseSectionModel, jSONObject4, jSONObject2);
        }
    }

    public static void w(BaseSectionModel<?> baseSectionModel, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1ad4a34", new Object[]{baseSectionModel, jSONObject});
        } else if (baseSectionModel != null) {
            if (bve.r()) {
                fve.e("UserTrackUtils", "the utLogMap has been stored");
                z73.f(baseSectionModel);
            }
            JSONObject u = u(baseSectionModel.getExposureParam(), baseSectionModel.getArgs());
            if (u != null) {
                JSONObject jSONObject2 = u.getJSONObject("args");
                jtv.b(jSONObject2);
                o(baseSectionModel, jSONObject2);
                if ((jSONObject != null && jSONObject.getBooleanValue("skipCheck")) || !baseSectionModel.getBooleanValue("isTracked")) {
                    baseSectionModel.put("isTracked", (Object) Boolean.TRUE);
                    n(baseSectionModel, u, jSONObject);
                    if (bve.h()) {
                        z73.h(baseSectionModel);
                    }
                    if (bve.h()) {
                        z73.g(baseSectionModel);
                    }
                }
            }
        }
    }

    public static String x(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eeb5dac2", new Object[]{str, jSONObject});
        }
        if (!(jSONObject == null || jSONObject.size() == 0)) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.putAll(jSONObject);
                StringBuilder sb = new StringBuilder(600);
                for (String str2 : jSONObject2.keySet()) {
                    String string = jSONObject2.getString(str2);
                    if (!TextUtils.isEmpty(string)) {
                        if (string.length() > 2048) {
                            fve.e("UserTrackUtils", "toTrackString super_long_args value.length() > 2048 : " + string.length());
                        }
                        sb.append(str2);
                        sb.append("=");
                        sb.append(string);
                        sb.append(",");
                    }
                }
                if (sb.length() <= 0) {
                    return "";
                }
                sb.deleteCharAt(sb.length() - 1);
                return sb.toString();
            } catch (Throwable th) {
                fve.c("UserTrackUtils", "toTrackString error", th);
            }
        }
        return "";
    }

    public static void y(cfc cfcVar, BaseSectionModel<?> baseSectionModel, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da48125d", new Object[]{cfcVar, baseSectionModel, jSONObject});
        } else if (baseSectionModel != null && baseSectionModel.getJSONObject("args") != null) {
            JSONObject jSONObject2 = baseSectionModel.getJSONObject("args");
            String string = jSONObject2.getString("utLogMap");
            if (!TextUtils.isEmpty(string)) {
                try {
                    HashMap hashMap = (HashMap) JSON.parseObject(URLDecoder.decode(string, "UTF-8"), new c(), new Feature[0]);
                    ki9.a(hashMap, baseSectionModel.getExt());
                    HashMap hashMap2 = new HashMap(hashMap);
                    String string2 = jSONObject2.getString("realExposeIndex");
                    if (!TextUtils.isEmpty(string2)) {
                        hashMap2.put("realExposeIndex", string2);
                    }
                    uve.e(hashMap2);
                    String string3 = jSONObject2.getString("recIndex");
                    if (!TextUtils.isEmpty(string3)) {
                        hashMap.put("recIndex", string3);
                    }
                    qqj.a(cfcVar, baseSectionModel, jSONObject, hashMap);
                    uve.f(JSON.toJSONString(hashMap));
                } catch (Throwable th) {
                    fve.c("UserTrackUtils", "RecommendUTUtils", th);
                }
            }
        }
    }
}
