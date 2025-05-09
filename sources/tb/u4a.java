package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.datastructure.GatewayActionInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class u4a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final b5a f29132a;
    public final JSONObject b;
    public GatewayActionInfo c;

    static {
        t2o.a(475004949);
    }

    public u4a(b5a b5aVar, JSONObject jSONObject) {
        this.f29132a = b5aVar;
        this.b = jSONObject;
    }

    public final x4a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x4a) ipChange.ipc$dispatch("30e62ab8", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return this.f29132a.e();
        }
        return x4a.e(str);
    }

    public GatewayActionInfo b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GatewayActionInfo) ipChange.ipc$dispatch("86efbfe1", new Object[]{this});
        }
        GatewayActionInfo gatewayActionInfo = this.c;
        if (gatewayActionInfo != null) {
            return gatewayActionInfo;
        }
        JSONObject jSONObject = this.b;
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("actionName");
        x4a a2 = a(this.b.getString("targetComponent"));
        JSONObject jSONObject2 = new JSONObject();
        if (this.f29132a.a() != null) {
            jSONObject2.putAll(this.f29132a.a());
        }
        if (this.b.get("actionParam") != null) {
            JSONObject parseObject = JSON.parseObject(this.b.getString("actionParam"));
            if (parseObject.containsKey("bizParam") && jSONObject2.containsKey("bizParam")) {
                if (parseObject.getJSONObject("bizParam") != null) {
                    jSONObject2.getJSONObject("bizParam").putAll(parseObject.getJSONObject("bizParam"));
                }
                parseObject.remove("bizParam");
            }
            jSONObject2.putAll(parseObject);
        }
        GatewayActionInfo gatewayActionInfo2 = new GatewayActionInfo(string, a2, this.f29132a, jSONObject2, this.b.getJSONObject("callback"));
        this.c = gatewayActionInfo2;
        return gatewayActionInfo2;
    }
}
