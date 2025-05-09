package tb;

import android.net.Uri;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend3.gateway.prefetch.tschedule.TSRecmdReqPrefetch;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xqm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809716);
    }

    public final Uri b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("97688646", new Object[]{this, str});
        }
        try {
            return Uri.parse(str);
        } catch (Exception e) {
            uqa.b("recmdPrefetch", "PrefetchReceiver", "解析链接出现异常: " + e);
            return null;
        }
    }

    public final d11 c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d11) ipChange.ipc$dispatch("f307ef41", new Object[]{this, jSONObject});
        }
        String string = jSONObject.getString("api");
        String string2 = jSONObject.getString("version");
        uqa.b("recmdPrefetch", "PrefetchReceiver", "api: " + string + "apiVersion:" + string2);
        return new d11(string, string2);
    }

    public final JSONObject d(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a5f694dd", new Object[]{this, uri});
        }
        if (uri == null) {
            uqa.b("recmdPrefetch", "PrefetchReceiver", "uri == null");
            return null;
        }
        String queryParameter = uri.getQueryParameter("bizParams");
        JSONObject jSONObject = new JSONObject();
        try {
            return JSON.parseObject(queryParameter);
        } catch (Exception e) {
            uqa.b("recmdPrefetch", "PrefetchReceiver", "解析上行参数出现异常: " + e);
            return jSONObject;
        }
    }

    public final JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a46c01eb", new Object[]{this});
        }
        try {
            return JSON.parseObject(f4b.h("preRequestParams", "{\"api\":\"mtop.taobao.wireless.home.awesome.trade.recommend\",\"version\":\"1.0\",\"timeout\":\"90000\",\"ignores\":[\"clientReqTime\",\"abtest\",\"commonBizParams\", \"globalLbs\"],\"apiParams\":{\"appid\":\"8219\"}}"));
        } catch (Exception e) {
            uqa.b("recmdPrefetch", "PrefetchReceiver", "获取预请求配置出现异常：" + e);
            return null;
        }
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb3b1395", new Object[]{this, str});
        } else if (!f(str)) {
            uqa.b("recmdPrefetch", "PrefetchReceiver", "服务端开关、orange等检测没通过");
        } else {
            Uri b = b(str);
            JSONObject e = e();
            if (!a(b, e)) {
                uqa.b("recmdPrefetch", "PrefetchReceiver", "url检测没通过");
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TSRecmdReqPrefetch.PREFETCH_PARAMS, (Object) e);
            JSONObject jSONObject2 = e.getJSONObject("apiParams");
            if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                jSONObject.putAll(jSONObject2);
            }
            JSONObject d = d(b);
            if (d != null && !d.isEmpty()) {
                jSONObject.putAll(d);
            }
            arm.e(arm.OPTIMIZE_TYPE_PS_ORDER);
            fnn.e(z4a.REC_PAY_SUCCESS).t(c(e), jSONObject);
            uqa.b("recmdPrefetch", "PrefetchReceiver", "预请求准备发起了");
        }
    }

    public final boolean a(Uri uri, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("489f6eea", new Object[]{this, uri, jSONObject})).booleanValue();
        }
        if (uri == null) {
            uqa.b("recmdPrefetch", "PrefetchReceiver", "链接为空");
            return false;
        } else if (jSONObject != null && !jSONObject.isEmpty()) {
            return uri.getBooleanQueryParameter("isPreRequestEnable", false);
        } else {
            uqa.b("recmdPrefetch", "PrefetchReceiver", "预加载任务参数为空");
            return false;
        }
    }

    public final boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5af87501", new Object[]{this, str})).booleanValue();
        }
        if (str == null) {
            uqa.b("recmdPrefetch", "PrefetchReceiver", "intent == null");
            return false;
        } else if (f4b.b("paySuccessOrderEnable", true)) {
            return true;
        } else {
            uqa.b("recmdPrefetch", "PrefetchReceiver", "orange开关是关的");
            return false;
        }
    }
}
