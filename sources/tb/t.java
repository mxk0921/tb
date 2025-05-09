package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.speed.TBSpeed;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class t {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45fe5adc", new Object[]{context, str})).booleanValue();
        }
        if (q1r.c("/.biz_opt_switch/." + str)) {
            return true;
        }
        if (q1r.c("/.biz_opt_switch/." + str + ".off")) {
            return false;
        }
        return TBSpeed.isSpeedEdition(context, str);
    }
}
