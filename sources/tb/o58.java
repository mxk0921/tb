package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class o58 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final JSONArray f25148a;
    public final String b;
    public String c;
    public String d;
    public String e;
    public String f;

    static {
        t2o.a(83886095);
    }

    public o58() {
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        if (("DynamicTemplate [type=" + this.f25148a) != null) {
            return this.f25148a.toJSONString();
        }
        return "null, containerType=" + this.b + ", name=" + this.c + ", url=" + this.d + ", version=" + this.e + "]";
    }

    public o58(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f25148a = jSONObject.getJSONArray("type");
            this.b = jSONObject.getString("containerType");
            this.c = jSONObject.getString("name");
            this.d = jSONObject.getString("url");
            this.e = jSONObject.getString("version");
            this.f = jSONObject.getString("md5");
        }
    }
}
