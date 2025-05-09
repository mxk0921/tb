package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class rra {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final double HIGH_SCREEN_RATIO = 0.53d;
    public static final double SHORT_SCREEN_RATIO = 0.54d;

    static {
        t2o.a(352322035);
    }

    public static float a(cxj cxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c13a0d15", new Object[]{cxjVar})).floatValue();
        }
        return cxjVar.j().K().c() - e(cxjVar);
    }

    public static float b(cxj cxjVar, int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5af9acf2", new Object[]{cxjVar, new Integer(i), new Float(f)})).floatValue();
        }
        return i - f(cxjVar, f);
    }

    public static float c(cxj cxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1f5e5bc6", new Object[]{cxjVar})).floatValue();
        }
        return (cxjVar.j().K().c() - e(cxjVar)) - d(cxjVar.i());
    }

    public static int d(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("df06b1f6", new Object[]{activity})).intValue();
        }
        if (activity == null) {
            return 0;
        }
        return (int) activity.getResources().getDimension(R.dimen.new_detail_half_screen_bottom_divider_height);
    }

    public static float e(cxj cxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be68bad5", new Object[]{cxjVar})).floatValue();
        }
        return f(cxjVar, cxjVar.j().K().d());
    }

    public static float f(cxj cxjVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eaf096b", new Object[]{cxjVar, new Float(f)})).floatValue();
        }
        Activity i = cxjVar.i();
        if (i == null) {
            return 0.0f;
        }
        double d = f;
        if (d <= 0.53d) {
            if (cxjVar.j().R().v) {
                return i.getResources().getDimension(R.dimen.new_detail_half_screen_high_screen_guide_height) + 30.0f;
            }
            return i.getResources().getDimension(R.dimen.new_detail_half_screen_high_screen_guide_height);
        } else if (d > 0.53d && d <= 0.54d) {
            return i.getResources().getDimension(R.dimen.new_detail_half_screen_medium_screen_guide_height);
        } else {
            if (d > 0.54d) {
                return i.getResources().getDimension(R.dimen.new_detail_half_screen_short_screen_guide_height);
            }
            return 0.0f;
        }
    }

    public static int g(cxj cxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b9315cb", new Object[]{cxjVar})).intValue();
        }
        return R.drawable.half_screen_second_card_medium;
    }
}
