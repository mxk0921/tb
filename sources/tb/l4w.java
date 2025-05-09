package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class l4w {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ViberateHelper";

    static {
        t2o.a(468714377);
    }

    public static void b(hmi hmiVar, Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6e762fe", new Object[]{hmiVar, context, new Boolean(z)});
            return;
        }
        ggs.e("viberate_state", Boolean.valueOf(z));
        ir9.b(TAG, context + "setViberateState--" + z);
        if (hmiVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("enable", String.valueOf(z));
            hmiVar.f(new vrp("VSMSG_onVibrateSettingChange", "-1", hashMap));
        }
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acf775c5", new Object[]{context})).booleanValue();
        }
        boolean o = nwv.o(ggs.a("viberate_state"), false);
        ir9.b(TAG, context + "isViberate--" + o);
        return o;
    }
}
