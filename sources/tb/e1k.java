package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class e1k implements gdc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NEW_BAR_VERSION = "newBarVersion";

    static {
        t2o.a(729810142);
        t2o.a(729810140);
    }

    @Override // tb.gdc
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aae89d90", new Object[]{this, jSONObject});
            return;
        }
        String c = c(jSONObject);
        String d = d();
        bqa.d("EdlpAbInfoIntercept", "correctABInfo -> isNewUserVersion:" + c + ",isNewUserSearchBar:" + d);
        if (!TextUtils.equals(c, d)) {
            b(c, d);
            e(jSONObject, String.valueOf(d));
        }
    }

    public final void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad4ba724", new Object[]{this, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("newUserVersionFromGlobal", str);
        hashMap.put("newUserVersionFromSearchBar", str2);
        tve.c("Page_Home", "", "1.0", "PAGE_HOME_EDLP", "EDLP_INFO_ERROR", hashMap);
    }

    public final String c(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c65e1fa", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("publicClientABTest")) == null) {
            return null;
        }
        return jSONObject2.getString(NEW_BAR_VERSION);
    }

    public final String d() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("190133ef", new Object[]{this});
        }
        JSONObject d = e0p.d();
        if (d == null || (jSONObject = d.getJSONObject("ext")) == null) {
            return null;
        }
        return jSONObject.getString(NEW_BAR_VERSION);
    }

    public final void e(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fad17a1d", new Object[]{this, jSONObject, str});
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("publicClientABTest");
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        if (str == null) {
            str = "";
        }
        jSONObject2.put(NEW_BAR_VERSION, (Object) str);
        jSONObject.put("publicClientABTest", (Object) jSONObject2);
    }
}
