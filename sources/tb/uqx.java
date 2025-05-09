package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class uqx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ZolozBaseH5Handler";
    public static final String ZIM_IDENTIFY_GET_META_INFO = "getMetaInfo";

    static {
        t2o.a(245366858);
    }

    public void a(JSONObject jSONObject, Context context, ubc ubcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdf39731", new Object[]{this, jSONObject, context, ubcVar});
        } else if (jSONObject != null && context != null) {
            BioLog.i(TAG, " jsapi" + jSONObject.toJSONString());
            String string = jSONObject.getString("action");
            if (!StringUtil.isNullorEmpty(string) && ubcVar != null && ZIM_IDENTIFY_GET_META_INFO.equals(string)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("metaInfo", (Object) pu1.b(context.getApplicationContext()));
                ubcVar.a(jSONObject2);
            }
        }
    }
}
