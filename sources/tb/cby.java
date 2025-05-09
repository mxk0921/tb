package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class cby {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static zay a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zay) ipChange.ipc$dispatch("1b916f88", new Object[]{str});
        }
        try {
            if (vux.c(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            return new zay(jSONObject.optString("apdid"), jSONObject.optString("deviceInfoHash"), jSONObject.optString("timestamp"), jSONObject.optString("tid"), jSONObject.optString("utdid"));
        } catch (Exception e) {
            q4y.c(e);
            return null;
        }
    }

    public static synchronized void b(Context context) {
        synchronized (cby.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            } else {
                fdy.b(context, "vkeyid_profiles_v4", "key_deviceid_v4", "");
            }
        }
    }

    public static synchronized void c(Context context, zay zayVar) {
        synchronized (cby.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("178cec6", new Object[]{context, zayVar});
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("apdid", zayVar.f32658a);
                jSONObject.put("deviceInfoHash", zayVar.b);
                jSONObject.put("timestamp", zayVar.c);
                jSONObject.put("tid", zayVar.d);
                jSONObject.put("utdid", zayVar.e);
                fdy.b(context, "vkeyid_profiles_v4", "key_deviceid_v4", jSONObject.toString());
            } catch (Exception e) {
                q4y.c(e);
            }
        }
    }

    public static synchronized zay d(Context context) {
        synchronized (cby.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (zay) ipChange.ipc$dispatch("70b24ad5", new Object[]{context});
            }
            return a(fdy.a(context, "vkeyid_profiles_v4", "key_deviceid_v4"));
        }
    }

    public static synchronized zay e(Context context) {
        synchronized (cby.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (zay) ipChange.ipc$dispatch("625bf0f4", new Object[]{context});
            }
            String a2 = fdy.a(context, "vkeyid_profiles_v4", "key_deviceid_v4");
            if (vux.c(a2)) {
                return null;
            }
            return a(a2);
        }
    }
}
