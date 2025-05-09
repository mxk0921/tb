package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class y9y {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static oay a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oay) ipChange.ipc$dispatch("1b916f69", new Object[]{str});
        }
        try {
            if (vux.c(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            return new oay(jSONObject.optString("apdid"), jSONObject.optString("deviceInfoHash"), jSONObject.optString("timestamp"));
        } catch (Exception e) {
            q4y.c(e);
            return null;
        }
    }

    public static synchronized void b(Context context) {
        synchronized (y9y.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            } else {
                fdy.b(context, "vkeyid_profiles_v3", "deviceid", "");
            }
        }
    }

    public static synchronized void c(Context context, oay oayVar) {
        synchronized (y9y.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1785a67", new Object[]{context, oayVar});
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("apdid", oayVar.f25271a);
                jSONObject.put("deviceInfoHash", oayVar.b);
                jSONObject.put("timestamp", oayVar.c);
                fdy.b(context, "vkeyid_profiles_v3", "deviceid", jSONObject.toString());
            } catch (Exception e) {
                q4y.c(e);
            }
        }
    }

    public static synchronized oay d(Context context) {
        synchronized (y9y.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (oay) ipChange.ipc$dispatch("70b24ab6", new Object[]{context});
            }
            return a(fdy.a(context, "vkeyid_profiles_v3", "deviceid"));
        }
    }

    public static synchronized oay e(Context context) {
        synchronized (y9y.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (oay) ipChange.ipc$dispatch("625bf0d5", new Object[]{context});
            }
            String a2 = fdy.a(context, "vkeyid_profiles_v3", "deviceid");
            if (vux.c(a2)) {
                return null;
            }
            return a(a2);
        }
    }
}
