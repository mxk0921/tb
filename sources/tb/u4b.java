package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseUtModel;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class u4b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BaseSubItemModel f29133a;

        public a(BaseSubItemModel baseSubItemModel) {
            this.f29133a = baseSubItemModel;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                u4b.a(this.f29133a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b extends TypeReference<HashMap<String, String>> {
    }

    static {
        t2o.a(486539765);
    }

    public static /* synthetic */ void a(BaseSubItemModel baseSubItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805fd1cd", new Object[]{baseSubItemModel});
        } else {
            f(baseSubItemModel);
        }
    }

    public static void b(BaseSubItemModel baseSubItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0128466", new Object[]{baseSubItemModel});
        } else {
            get.a().i(new a(baseSubItemModel));
        }
    }

    public static void c(JSONObject jSONObject) {
        JSONObject d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b528b986", new Object[]{jSONObject});
        } else if (jSONObject != null && (d = d(jSONObject)) != null && d.containsKey("page") && d.containsKey("eventId")) {
            String string = d.getString("page");
            String string2 = d.getString("eventId");
            String string3 = d.getString("arg1");
            String string4 = d.getString("arg2");
            String string5 = d.getString("arg3");
            JSONObject jSONObject2 = d.getJSONObject("args");
            uve.a(string, Integer.parseInt(string2), string3, string4, string5, vve.x(string, jSONObject2));
            try {
                if (TextUtils.equals("2101", string2)) {
                    hue.a(string, string3 + "_BehaviX_UT", null, jSONObject2);
                }
            } catch (Exception e) {
                fve.c("homepage_track", "commitEvent error", e);
            }
        }
    }

    public static JSONObject d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fba5b971", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("trackParam");
        if (jSONObject2 == null || jSONObject2.isEmpty() || jSONObject2.getJSONObject("clickParam") == null || jSONObject2.getJSONObject("clickParam").isEmpty()) {
            return jSONObject.getJSONObject("clickParam");
        }
        return e(jSONObject2.getJSONObject("clickParam"), jSONObject2.getJSONObject("args"));
    }

    public static JSONObject e(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ba9c6d45", new Object[]{jSONObject, jSONObject2});
        }
        if (!(jSONObject2 == null || jSONObject2.isEmpty() || jSONObject == null)) {
            try {
                JSONObject jSONObject3 = jSONObject.getJSONObject("args");
                if (jSONObject3 == null) {
                    jSONObject3 = new JSONObject();
                    jSONObject.put("args", (Object) jSONObject3);
                }
                for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                    jSONObject3.put(entry.getKey(), entry.getValue());
                }
            } catch (Throwable th) {
                fve.d("AutoExposureUtils", th, new String[0]);
            }
        }
        return jSONObject;
    }

    public static void f(BaseSubItemModel baseSubItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6b131f5", new Object[]{baseSubItemModel});
        } else if (baseSubItemModel != null) {
            j(baseSubItemModel);
            c(baseSubItemModel);
        }
    }

    public static void g(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80b8d4a9", new Object[]{str, str2, str3});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("action", (Object) str3);
        hve.c(str, str2, vve.x(str, jSONObject), 1.0d);
        if (eue.b()) {
            fve.b("HomeUserTrackUtils", "fieldName=" + str2 + "-point=" + str3);
        }
    }

    public static void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7629fc07", new Object[0]);
        } else {
            g("Page_Home", "track_center_action", "main_model_spm_null_count");
        }
    }

    public static void h(BaseSubItemModel baseSubItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c75b21f", new Object[]{baseSubItemModel});
        } else if (baseSubItemModel != null) {
            BaseUtModel clickParam = baseSubItemModel.getClickParam();
            if (clickParam == null) {
                i();
                return;
            }
            JSONObject args = clickParam.getArgs();
            if (args == null) {
                i();
                return;
            }
            String string = args.getString("spm");
            if (string == null || !string.startsWith("a2141")) {
                i();
            } else if (string.lastIndexOf(".") <= 0) {
                i();
            } else {
                String substring = string.substring(0, string.lastIndexOf("."));
                g("Page_Home", "track_center_action", "main_model_tap_" + substring);
            }
        } else {
            i();
        }
    }

    public static void j(BaseSubItemModel baseSubItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3208dcb", new Object[]{baseSubItemModel});
            return;
        }
        JSONObject jSONObject = baseSubItemModel.getJSONObject("passOnTrack");
        if (jSONObject != null && jSONObject.size() > 0) {
            uve.e((Map) JSON.parseObject(jSONObject.toJSONString(), new b(), new Feature[0]));
        }
        JSONObject jSONObject2 = baseSubItemModel.getJSONObject("nextPageUtParam");
        if (jSONObject2 != null && jSONObject2.size() > 0) {
            uve.f(JSON.toJSONString(jSONObject2));
        }
    }
}
