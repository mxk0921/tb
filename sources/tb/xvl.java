package tb;

import android.net.Uri;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend3.gateway.prefetch.tschedule.TSRecmdReqPrefetch;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xvl implements phd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809721);
        t2o.a(729809717);
    }

    @Override // tb.phd
    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11a11256", new Object[]{this, str, jSONObject});
            return;
        }
        Uri b = b(str);
        if (!e(b, jSONObject)) {
            uqa.b("recmdPrefetch", "PaySuccessRecmdPrefetch", "不符合预请求条件");
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(TSRecmdReqPrefetch.PREFETCH_PARAMS, (Object) jSONObject);
        JSONObject jSONObject3 = jSONObject.getJSONObject("apiParams");
        if (jSONObject3 != null && !jSONObject3.isEmpty()) {
            jSONObject2.putAll(jSONObject3);
        }
        JSONObject d = d(b);
        if (d != null && !d.isEmpty()) {
            jSONObject2.putAll(d);
        }
        fnn.e(z4a.REC_PAY_SUCCESS).t(c(jSONObject), jSONObject2);
        arm.e(arm.OPTIMIZE_TYPE_PS_T_SCHEDULE);
        arm.f("tschedule");
        uqa.b("recmdPrefetch", "PaySuccessRecmdPrefetch", "预请求准备发起了");
    }

    public final Uri b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("97688646", new Object[]{this, str});
        }
        try {
            return Uri.parse(str);
        } catch (Exception e) {
            uqa.b("recmdPrefetch", "PaySuccessRecmdPrefetch", "解析链接出现异常: " + e);
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
        uqa.b("recmdPrefetch", "PaySuccessRecmdPrefetch", "api：" + string + "api version: " + string2);
        return new d11(string, string2);
    }

    public final JSONObject d(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a5f694dd", new Object[]{this, uri});
        }
        String queryParameter = uri.getQueryParameter("bizParams");
        JSONObject jSONObject = new JSONObject();
        try {
            return JSON.parseObject(queryParameter);
        } catch (Exception e) {
            uqa.b("recmdPrefetch", "PaySuccessRecmdPrefetch", "解析上行参数出现异常: " + e);
            return jSONObject;
        }
    }

    public final boolean e(Uri uri, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7a069c0", new Object[]{this, uri, jSONObject})).booleanValue();
        }
        if (uri == null) {
            uqa.b("recmdPrefetch", "PaySuccessRecmdPrefetch", "链接为空");
            return false;
        } else if (!jSONObject.isEmpty()) {
            return uri.getBooleanQueryParameter("isPreRequestEnable", false);
        } else {
            uqa.b("recmdPrefetch", "PaySuccessRecmdPrefetch", "预加载任务参数为空");
            return false;
        }
    }
}
