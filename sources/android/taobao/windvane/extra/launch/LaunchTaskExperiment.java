package android.taobao.windvane.extra.launch;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.riverlogger.RVLLevel;
import tb.lcn;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class LaunchTaskExperiment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile Boolean sValue = null;

    static {
        t2o.a(989855972);
    }

    public static boolean enablePrioritizeInitAndDelayPreCreate(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aff2f384", new Object[]{context})).booleanValue();
        }
        if (sValue != null) {
            return sValue.booleanValue();
        }
        synchronized (LaunchTaskExperiment.class) {
            if (sValue != null) {
                return sValue.booleanValue();
            }
            try {
                sValue = Boolean.valueOf(ABGlobal.isFeatureOpened(context, "wvPrioritizeInitAndDelayPreCreate"));
            } catch (Exception e) {
                RVLLevel rVLLevel = RVLLevel.Error;
                lcn.f(rVLLevel, "WindVane/Launch", "enablePrioritizeInitAndDelayPreCreate error" + e.getMessage());
            }
            return sValue.booleanValue();
        }
    }
}
