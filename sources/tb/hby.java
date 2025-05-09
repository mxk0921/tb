package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class hby {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static nby a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nby) ipChange.ipc$dispatch("7f08a513", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        String a2 = fdy.a(context, "device_feature_prefs_name", "device_feature_prefs_key");
        if (vux.c(a2)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(a2);
            nby nbyVar = new nby();
            nbyVar.f24625a = jSONObject.getString("imei");
            nbyVar.b = jSONObject.getString("imsi");
            nbyVar.c = jSONObject.getString("mac");
            nbyVar.d = jSONObject.getString("bluetoothmac");
            nbyVar.e = jSONObject.getString("gsi");
            return nbyVar;
        } catch (Exception e) {
            q4y.c(e);
            return null;
        }
    }
}
