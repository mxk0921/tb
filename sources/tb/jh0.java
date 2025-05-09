package tb;

import android.net.Uri;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend3.gateway.prefetch.tschedule.TSRecmdReqPrefetch;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class jh0 implements phd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809719);
        t2o.a(729809717);
    }

    @Override // tb.phd
    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11a11256", new Object[]{this, str, jSONObject});
            return;
        }
        z4a d = z4a.d(jSONObject.getString("channel"));
        if (!f(d, jSONObject)) {
            uqa.b("recmdPrefetch", "AfterBuyCommonPrefetch", "不符合预请求条件");
            return;
        }
        Uri c = c(str);
        if (c == null) {
            uqa.b("recmdPrefetch", "AfterBuyCommonPrefetch", "uri为空");
            return;
        }
        d11 d2 = d(jSONObject);
        JSONObject b = b(c, jSONObject);
        fnn e = fnn.e(d);
        if (e == null) {
            uqa.b("recmdPrefetch", "AfterBuyCommonPrefetch", "container == null");
            return;
        }
        e.t(d2, b);
        arm.e(arm.OPTIMIZE_TYPE_T_SCHEDULE);
        arm.f("tschedule");
        uqa.b("recmdPrefetch", "AfterBuyCommonPrefetch", "预请求准备发起了");
    }

    public final JSONObject b(Uri uri, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5e1cfc74", new Object[]{this, uri, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(TSRecmdReqPrefetch.PREFETCH_PARAMS, (Object) jSONObject);
        JSONObject jSONObject3 = jSONObject.getJSONObject("apiParams");
        if (jSONObject3 != null && !jSONObject3.isEmpty()) {
            jSONObject2.putAll(jSONObject3);
        }
        JSONObject e = e(uri);
        if (e != null && !e.isEmpty()) {
            jSONObject2.putAll(e);
        }
        return jSONObject2;
    }

    public final Uri c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("97688646", new Object[]{this, str});
        }
        try {
            return Uri.parse(str);
        } catch (Exception e) {
            uqa.b("recmdPrefetch", "AfterBuyCommonPrefetch", "解析链接出现异常: " + e);
            return null;
        }
    }

    public final d11 d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d11) ipChange.ipc$dispatch("f307ef41", new Object[]{this, jSONObject});
        }
        String string = jSONObject.getString("api");
        String string2 = jSONObject.getString("version");
        uqa.b("recmdPrefetch", "AfterBuyCommonPrefetch", "api：" + string + "api version: " + string2);
        return new d11(string, string2);
    }

    public final JSONObject e(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a5f694dd", new Object[]{this, uri});
        }
        try {
            return JSON.parseObject(uri.getQueryParameter("bizParams"));
        } catch (Exception e) {
            uqa.b("recmdPrefetch", "AfterBuyCommonPrefetch", "解析上行参数出现异常: " + e);
            return null;
        }
    }

    public final boolean f(z4a z4aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b922dd1d", new Object[]{this, z4aVar, jSONObject})).booleanValue();
        }
        if (!f4b.b("tScheduleEnable", true)) {
            uqa.b("recmdPrefetch", "AfterBuyCommonPrefetch", "orange开关是关的");
            return false;
        } else if (z4aVar == null) {
            uqa.b("recmdPrefetch", "AfterBuyCommonPrefetch", "gatewayContainerType == null");
            return false;
        } else if (!"tschedule".equals(dqm.a(z4aVar.b()))) {
            uqa.b("recmdPrefetch", "AfterBuyCommonPrefetch", "服务端开关没下发");
            return false;
        } else if (!jSONObject.isEmpty()) {
            return true;
        } else {
            uqa.b("recmdPrefetch", "AfterBuyCommonPrefetch", "预请求参数为空");
            return false;
        }
    }
}
