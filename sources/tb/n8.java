package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class n8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_PARAMS = "params";
    public static final String KEY_TYPE = "type";
    public static final String KEY_VERSION = "version";

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f24564a;
    public final JSONObject b;

    static {
        t2o.a(336592921);
    }

    public n8(String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject(2);
        jSONObject2.put("type", (Object) str);
        jSONObject2.put("params", (Object) jSONObject);
        this.b = jSONObject2;
        this.f24564a = jSONObject;
    }

    public Object a(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("352acab", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str) && (jSONObject = this.f24564a) != null) {
            try {
                if (jSONObject.containsKey(str)) {
                    return this.f24564a.get(str);
                }
                return null;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return null;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28e8f16b", new Object[]{this});
        }
        return this.b.getString("type");
    }

    public Boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("dd7977c0", new Object[]{this, str});
        }
        return Boolean.valueOf(vwf.b(this.f24564a, str, false));
    }

    public JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d42ac3", new Object[]{this});
        }
        return this.b;
    }

    public int e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c755427d", new Object[]{this, str})).intValue();
        }
        return vwf.d(this.f24564a, str, -1);
    }

    public JSONArray f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("d06aecb2", new Object[]{this, str});
        }
        return vwf.e(this.f24564a, str, null);
    }

    public JSONObject g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("47d8c0e", new Object[]{this, str});
        }
        return vwf.f(this.f24564a, str, null);
    }

    public JSONObject h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cf36e223", new Object[]{this});
        }
        return this.f24564a;
    }

    public String i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba42c148", new Object[]{this, str});
        }
        return vwf.g(this.f24564a, str, null);
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
        }
        return this.b.getString("version");
    }

    public n8(JSONObject jSONObject) {
        this.b = jSONObject;
        this.f24564a = jSONObject.getJSONObject("params");
    }
}
