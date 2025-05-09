package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class avn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_REFRESH_TRANS_STATE = "transState";

    /* renamed from: a  reason: collision with root package name */
    public final String f16027a;
    public final String b;
    public final String c;
    public final JSONObject d;

    static {
        t2o.a(352321790);
    }

    public avn(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f16027a = jSONObject.getString("newParams");
            this.b = jSONObject.getString("isSjjsd");
            this.c = jSONObject.getString("tabIndex");
            try {
                this.d = jSONObject.getJSONObject(KEY_REFRESH_TRANS_STATE);
            } catch (Exception e) {
                txj.e("RefreshParam", "get transState fail:" + e);
            }
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ffb5e2d3", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = this.d;
        if (jSONObject == null || jSONObject.isEmpty()) {
            return false;
        }
        return true;
    }

    public Map<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("345d3fa0", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("newParams", this.f16027a);
        hashMap.put("isSjjsd", this.b);
        hashMap.put("tabIndex", this.c);
        return hashMap;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (this.f16027a == null || this.b == null) {
            return false;
        }
        return true;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb652a7", new Object[]{this})).booleanValue();
        }
        return true ^ "N".equals(this.b);
    }
}
