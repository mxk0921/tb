package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zp4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f32925a;
    public final String b;
    public String c;
    public String d;
    public final String e;
    public JSONObject f;

    static {
        t2o.a(629145619);
    }

    public zp4(String str, String str2, String str3) {
        this.f32925a = str;
        this.b = str2;
        this.e = str3;
        if (str == null || str2 == null) {
            odg.c("ContentRequestParams", "create ContentRequestParams error");
        }
        this.c = "all";
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94c4f72d", new Object[]{this, jSONObject});
        } else {
            this.f = jSONObject;
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19e8d7b8", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bba3e224", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public HashMap<String, String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("1c79404b", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("id", this.f32925a);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sceneName", (Object) this.e);
        jSONObject.put("tab", (Object) this.c);
        jSONObject.put("pvUuid", (Object) this.b);
        String str = this.d;
        if (str == null) {
            str = "";
        }
        jSONObject.put("seeIds", (Object) str);
        JSONObject jSONObject2 = this.f;
        if (jSONObject2 != null) {
            jSONObject.put(pl4.KEY_PAGINATION, (Object) jSONObject2);
        }
        hashMap.put("exParams", JSON.toJSONString(jSONObject));
        return hashMap;
    }
}
