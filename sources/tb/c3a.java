package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class c3a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(502268064);
    }

    public static d3a a(bod bodVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d3a) ipChange.ipc$dispatch("d5140ec5", new Object[]{bodVar});
        }
        if (bodVar == null) {
            return null;
        }
        ye<?> findSecPageWrapper = bodVar.findSecPageWrapper();
        if (!(findSecPageWrapper instanceof d3a)) {
            return null;
        }
        return (d3a) findSecPageWrapper;
    }

    public static void b(Activity activity, Object obj, String str) {
        d3a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c769fdc0", new Object[]{activity, obj, str});
        } else if ((activity instanceof bod) && (a2 = a((bod) activity)) != null) {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(activity);
            a2.c().a(obj, str);
            a2.p();
        }
    }

    public static void c(anl anlVar, Object obj, String str) {
        d3a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8dea2a", new Object[]{anlVar, obj, str});
        } else if ((anlVar instanceof bod) && (a2 = a((bod) anlVar)) != null) {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(anlVar.getActivity());
            a2.c().a(obj, str);
            a2.p();
        }
    }
}
