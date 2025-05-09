package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.festival.GloblaNavUIConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class u69 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(713031923);
    }

    public static int a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("38776864", new Object[]{context, new Integer(i)})).intValue();
        }
        try {
            int h = FestivalMgr.i().h(GloblaNavUIConfig.KEY_GLOBAL_ACTIONBAR_TEXT_COLOR, i);
            lor.c("FestivalMgrUtils", "getActionBarTextColor", "actionBarTextColor = " + h);
            return h;
        } catch (Throwable unused) {
            return i;
        }
    }
}
