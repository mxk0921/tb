package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.bhxbridge.BHXCXXInnerBridge;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class zia {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static JSONObject f32789a = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final zia f32790a = new zia();

        static {
            t2o.a(404750610);
        }

        public static /* synthetic */ zia a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (zia) ipChange.ipc$dispatch("897418fa", new Object[0]);
            }
            return f32790a;
        }
    }

    static {
        t2o.a(404750608);
    }

    public static final zia c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zia) ipChange.ipc$dispatch("660be4a4", new Object[0]);
        }
        return b.a();
    }

    public final void a(JSONArray jSONArray, JSONObject jSONObject) {
        JSONArray jSONArray2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48168760", new Object[]{this, jSONArray, jSONObject});
        } else if (jSONObject != null && (jSONArray2 = jSONObject.getJSONArray("eventMatchResult")) != null && jSONArray2.size() > 0) {
            for (int i = 0; i < jSONArray2.size(); i++) {
                jSONArray.add(jSONArray2.getString(i));
            }
        }
    }

    public synchronized JSONArray b(String str, String str2, String str3) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("7bcf1eb7", new Object[]{this, str, str2, str3});
        }
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject5 = f32789a;
        if (jSONObject5 == null || jSONObject5.isEmpty()) {
            f32789a = BHXCXXInnerBridge.getMatchConditionConfig();
        }
        JSONObject jSONObject6 = f32789a;
        JSONObject jSONObject7 = null;
        if (jSONObject6 == null || jSONObject6.isEmpty()) {
            return null;
        }
        try {
            jSONObject = f32789a.getJSONObject("node").getJSONObject(str2);
        } catch (Throwable unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return jSONArray;
        }
        try {
            jSONObject2 = jSONObject.getJSONObject(str).getJSONObject(str3);
        } catch (Throwable unused2) {
            jSONObject2 = null;
        }
        if (jSONObject2 != null) {
            a(jSONArray, jSONObject2);
        }
        try {
            jSONObject3 = jSONObject.getJSONObject(str).getJSONObject("*");
        } catch (Throwable unused3) {
            jSONObject3 = null;
        }
        if (jSONObject3 != null) {
            a(jSONArray, jSONObject3);
        }
        try {
            jSONObject4 = jSONObject.getJSONObject("*").getJSONObject(str3);
        } catch (Throwable unused4) {
            jSONObject4 = null;
        }
        if (jSONObject4 != null) {
            a(jSONArray, jSONObject4);
        }
        try {
            jSONObject7 = jSONObject.getJSONObject("*").getJSONObject("*");
        } catch (Throwable unused5) {
        }
        if (jSONObject7 != null) {
            a(jSONArray, jSONObject7);
        }
        return jSONArray;
    }

    public boolean d(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cac12157", new Object[]{this, str, str2, str3})).booleanValue();
        }
        JSONArray b2 = b(str, str2, str3);
        if (b2 == null || !pz3.a(b2)) {
            return true;
        }
        return false;
    }

    public zia() {
    }
}
