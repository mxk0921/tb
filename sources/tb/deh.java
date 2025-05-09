package tb;

import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.mobile.ui.WebConstant;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tlog.protocol.model.reply.base.UploadTokenInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class deh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f17759a;
    public UploadTokenInfo b;

    static {
        t2o.a(856686611);
    }

    public String a(z24 z24Var, hfh hfhVar) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32d19142", new Object[]{this, z24Var, hfhVar});
        }
        if (hfhVar == null) {
            return null;
        }
        Map<String, String> a2 = sua.a(z24Var, hfhVar);
        JSONObject jSONObject = new JSONObject();
        String str = this.f17759a;
        if (str != null) {
            jSONObject.put(WebConstant.WEB_LOGIN_TOKEN_TYPE, (Object) str);
        }
        UploadTokenInfo uploadTokenInfo = this.b;
        if (uploadTokenInfo != null) {
            jSONObject.put(ApiConstants.ApiField.TOKEN_INFO, (Object) uploadTokenInfo);
        }
        JSONObject jSONObject2 = new JSONObject();
        if (z24Var.f != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("content", new String(z24Var.f, "utf-8"));
            jSONObject2.put("forward", (Object) linkedHashMap);
        }
        jSONObject2.put("version", (Object) uj4.version);
        jSONObject2.put("type", (Object) "REPLY");
        jSONObject2.put("headers", (Object) a2);
        jSONObject2.put("data", (Object) jSONObject);
        return xkv.a(jSONObject2.toString());
    }
}
