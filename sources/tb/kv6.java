package tb;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class kv6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FILTER_KEY = "scanBizParams";

    static {
        t2o.a(729808973);
    }

    public static void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a7bbab", new Object[]{intent});
            return;
        }
        Uri data = intent.getData();
        if (data != null) {
            String queryParameter = data.getQueryParameter(FILTER_KEY);
            fve.e("DebugScanChannel", "requestParams: " + queryParameter);
            if (!TextUtils.isEmpty(queryParameter)) {
                JSONObject jSONObject = new JSONObject();
                HashMap hashMap = new HashMap(2);
                hashMap.put(FILTER_KEY, queryParameter);
                jSONObject.put("bizParam", (Object) hashMap);
                yyj.e().y(jSONObject);
            }
        }
    }
}
