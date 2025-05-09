package tb;

import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class nxf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093537);
    }

    public static JSONObject a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a169e7c", new Object[]{intent});
        }
        return m3s.a(intent);
    }

    public static HashMap<String, String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("4b0efd8d", new Object[]{str});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject parseObject = JSON.parseObject(str);
                if (parseObject.keySet().size() > 0) {
                    for (String str2 : parseObject.keySet()) {
                        String valueOf = String.valueOf(str2);
                        hashMap.put(valueOf, String.valueOf(parseObject.get(valueOf)));
                    }
                }
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }
}
