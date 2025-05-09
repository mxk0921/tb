package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class f1i {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_GUIDE_SEARCH_URL = "guideSearchUrl";
    public static final String KEY_NEW_SEARCH_URL = "newSearchUrl";

    static {
        t2o.a(815793400);
    }

    public static void a(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc99b7b7", new Object[]{jSONObject, str, str2});
        } else if (jSONObject != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            jSONObject.put(str, (Object) str2);
        }
    }
}
