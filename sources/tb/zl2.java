package tb;

import android.content.Intent;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class zl2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(817889357);
    }

    public static void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("590de89e", new Object[]{str, jSONObject});
        } else if (!TextUtils.isEmpty(str)) {
            Intent intent = new Intent(str);
            if (jSONObject != null) {
                for (String str2 : jSONObject.keySet()) {
                    intent.putExtra(str2, jSONObject.getString(str2));
                }
            }
            LocalBroadcastManager.getInstance(Globals.getApplication()).sendBroadcast(intent);
        }
    }
}
