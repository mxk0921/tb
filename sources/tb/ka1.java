package tb;

import com.ali.user.mobile.ui.WebConstant;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tlog.protocol.model.reply.base.UploadTokenInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ka1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f22507a;
    public UploadTokenInfo[] b;

    static {
        t2o.a(856686608);
    }

    public void a(JSON json, z24 z24Var) throws Exception {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a399adc", new Object[]{this, json, z24Var});
            return;
        }
        JSONObject jSONObject = (JSONObject) json;
        if (jSONObject.containsKey("uploadId")) {
            jSONObject.getString("uploadId");
        }
        if (jSONObject.containsKey(WebConstant.WEB_LOGIN_TOKEN_TYPE)) {
            this.f22507a = jSONObject.getString(WebConstant.WEB_LOGIN_TOKEN_TYPE);
        }
        if (jSONObject.containsKey("tokenInfos") && (jSONArray = jSONObject.getJSONArray("tokenInfos")) != null && jSONArray.size() > 0) {
            this.b = erl.a(jSONArray);
        }
    }
}
