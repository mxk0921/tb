package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.section.BasePopSectionModel;
import com.taobao.statistic.TBS;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vhm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BasePopSectionModel f30018a;
        public final /* synthetic */ JSONObject b;

        public a(BasePopSectionModel basePopSectionModel, JSONObject jSONObject) {
            this.f30018a = basePopSectionModel;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                vhm.a(this.f30018a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BasePopSectionModel f30019a;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ JSONObject c;

        public b(BasePopSectionModel basePopSectionModel, JSONObject jSONObject, JSONObject jSONObject2) {
            this.f30019a = basePopSectionModel;
            this.b = jSONObject;
            this.c = jSONObject2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                vhm.b(this.f30019a, this.b, this.c);
            }
        }
    }

    public static /* synthetic */ void a(BasePopSectionModel basePopSectionModel, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf7aa73", new Object[]{basePopSectionModel, jSONObject});
        } else {
            l(basePopSectionModel, jSONObject);
        }
    }

    public static /* synthetic */ void b(BasePopSectionModel basePopSectionModel, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8672e15e", new Object[]{basePopSectionModel, jSONObject, jSONObject2});
        } else {
            k(basePopSectionModel, jSONObject, jSONObject2);
        }
    }

    public static void c(String str, JSONObject jSONObject) {
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
            vfm.d("cleanUTArgs.", e);
        }
    }

    public static void d(BasePopSectionModel<?> basePopSectionModel, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4fa1336", new Object[]{basePopSectionModel, jSONObject, jSONObject2});
        } else {
            fet.a().h(new b(basePopSectionModel, jSONObject, jSONObject2));
        }
    }

    public static void e(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2680c113", new Object[]{jSONObject, jSONObject2});
        } else if (jSONObject == null || jSONObject.isEmpty()) {
            vfm.f("UserTrackUtils", "commitEvent trackParams == null || trackParams.isEmpty()");
        } else if (!jSONObject.containsKey("page") || !jSONObject.containsKey("eventId")) {
            vfm.f("UserTrackUtils", "commitEvent 缺少埋点必要参数");
        } else {
            String i = i(jSONObject, jSONObject2, "page");
            String i2 = i(jSONObject, jSONObject2, "eventId");
            String i3 = i(jSONObject, jSONObject2, "arg1");
            String i4 = i(jSONObject, jSONObject2, "arg2");
            String i5 = i(jSONObject, jSONObject2, "arg3");
            JSONObject h = h(jSONObject, jSONObject2, "args");
            c(i3, h);
            TBS.Ext.commitEvent(i, Integer.parseInt(i2), i3, i4, i5, m(i, h));
        }
    }

    public static void f(BasePopSectionModel basePopSectionModel, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3afc3507", new Object[]{basePopSectionModel, jSONObject});
        } else {
            fet.a().h(new a(basePopSectionModel, jSONObject));
        }
    }

    public static void g(String str, String str2, boolean z, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("528fae4f", new Object[]{str, str2, new Boolean(z), str3});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("ucpSignal", Boolean.valueOf(z));
            if (TextUtils.isEmpty(str3)) {
                str3 = "";
            }
            hashMap.put("businessId", str3);
            TBS.Ext.commitEvent("Page_Home", 19999, "ucpPopLink", str, str2, m("Page_Home", new JSONObject(hashMap)));
        } catch (Throwable th) {
            vfm.d("commitUcpPopEvent", th);
        }
    }

    public static JSONObject h(JSONObject jSONObject, JSONObject jSONObject2, String str) {
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

    public static String i(JSONObject jSONObject, JSONObject jSONObject2, String str) {
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

    public static JSONObject j(JSONObject jSONObject, JSONObject jSONObject2) {
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
                vfm.d("AutoExposureUtils", th);
            }
        }
        return jSONObject;
    }

    public static void k(BasePopSectionModel<?> basePopSectionModel, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dcda105", new Object[]{basePopSectionModel, jSONObject, jSONObject2});
        } else if (jSONObject != null) {
            JSONObject jSONObject4 = jSONObject.getJSONObject("clickParam");
            if (basePopSectionModel == null) {
                jSONObject3 = null;
            } else {
                jSONObject3 = basePopSectionModel.getJSONObject("args");
            }
            j(jSONObject4, jSONObject3);
            e(jSONObject4, jSONObject2);
        }
    }

    public static void l(BasePopSectionModel<?> basePopSectionModel, JSONObject jSONObject) {
        JSONObject j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f478716", new Object[]{basePopSectionModel, jSONObject});
        } else if (basePopSectionModel != null && (j = j(basePopSectionModel.getExposureParam(), basePopSectionModel.getArgs())) != null) {
            j.getJSONObject("args");
            if ((jSONObject != null && jSONObject.getBooleanValue("skipCheck")) || !basePopSectionModel.getBooleanValue("isTracked")) {
                basePopSectionModel.put("isTracked", (Object) Boolean.TRUE);
                e(j, jSONObject);
            }
        }
    }

    public static String m(String str, JSONObject jSONObject) {
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
                    String string = jSONObject.getString(str2);
                    if (!TextUtils.isEmpty(string)) {
                        if (string.length() > 2048) {
                            vfm.f("UserTrackUtils", "toTrackString super_long_args value.length() > 2048 : " + string.length());
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
}
