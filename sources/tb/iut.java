package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class iut {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092550);
    }

    public static HashMap<String, String> a(JSONObject jSONObject) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("f2cfb472", new Object[]{jSONObject});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (jSONObject != null) {
            try {
                if (jSONObject.getBoolean("isLiving").booleanValue()) {
                    i = 1;
                } else if (jSONObject.getJSONObject("highlightLastPreLiveInfo") != null && !TextUtils.isEmpty(jSONObject.getJSONObject("highlightLastPreLiveInfo").getString("latestPreLiveStartTimeDesc"))) {
                    i = 2;
                }
                hashMap.put("button_status", String.valueOf(i));
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }
}
