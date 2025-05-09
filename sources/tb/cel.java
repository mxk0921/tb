package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend3.gateway.prefetch.tschedule.TSRecmdReqPrefetch;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class cel implements phd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809720);
        t2o.a(729809717);
    }

    @Override // tb.phd
    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11a11256", new Object[]{this, str, jSONObject});
            return;
        }
        String c = c(str);
        if (TextUtils.isEmpty(c)) {
            uqa.b("recmdPrefetch", "OrderListRecmdPrefetch", "tab为空，无法识别是什么场景");
            return;
        }
        JSONObject b = b(jSONObject);
        if (b == null || b.isEmpty()) {
            uqa.b("recmdPrefetch", "OrderListRecmdPrefetch", "预请求参数为空");
            return;
        }
        z4a d = d(c);
        int b2 = n7l.b();
        uqa.b("recmdPrefetch", "OrderListRecmdPrefetch", "预请求准备发起了");
        hon.f(b, d, b2);
        arm.f("tschedule");
        arm.e(arm.OPTIMIZE_TYPE_ORDER_LIST_T_SCHEDULE);
    }

    public final JSONObject b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("45234c06", new Object[]{this, jSONObject});
        }
        if (jSONObject.isEmpty()) {
            uqa.b("recmdPrefetch", "OrderListRecmdPrefetch", "预加载任务参数为空");
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(TSRecmdReqPrefetch.PREFETCH_PARAMS, (Object) jSONObject);
        JSONObject jSONObject3 = jSONObject.getJSONObject("apiParams");
        if (jSONObject3 != null && !jSONObject3.isEmpty()) {
            jSONObject2.putAll(jSONObject3);
        }
        return jSONObject2;
    }

    public final String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("86c8b29d", new Object[]{this, str});
        }
        Uri e = e(str);
        if (e != null) {
            return vls.c(e);
        }
        uqa.b("recmdPrefetch", "OrderListRecmdPrefetch", "uri为null");
        return null;
    }

    public final z4a d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z4a) ipChange.ipc$dispatch("2ae940b8", new Object[]{this, str});
        }
        if (vls.d(str) > 0) {
            return z4a.REC_ORDER_LIST_CATAPULT;
        }
        return z4a.REC_ORDER_LIST;
    }

    public final Uri e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("cb53df7e", new Object[]{this, str});
        }
        try {
            return Uri.parse(str);
        } catch (Exception unused) {
            uqa.b("recmdPrefetch", "OrderListRecmdPrefetch", "uri解析失败");
            return null;
        }
    }
}
