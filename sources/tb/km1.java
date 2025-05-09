package tb;

import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.Utils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class km1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION = "com.taobao.android.behavir.notify";
    public static final String ACTION_V2 = "BHRNotificationName";

    static {
        t2o.a(404750390);
    }

    public static void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("919108c5", new Object[]{intent});
            return;
        }
        LocalBroadcastManager instance = LocalBroadcastManager.getInstance(f82.d());
        if (Utils.c()) {
            instance.sendBroadcastSync(intent);
        } else {
            instance.sendBroadcast(intent);
        }
    }

    public static void b(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8f9465f", new Object[]{map});
            return;
        }
        Intent intent = new Intent(ACTION);
        JSONObject jSONObject = new JSONObject(map);
        intent.putExtra("data", jSONObject);
        a(intent);
        Intent intent2 = new Intent(ACTION_V2);
        intent2.putExtra("data", jSONObject);
        a(intent2);
    }

    public static void c(Map<String, Object> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38733669", new Object[]{map, str});
            return;
        }
        Intent intent = new Intent(str);
        intent.putExtra("data", new JSONObject(map));
        a(intent);
    }
}
