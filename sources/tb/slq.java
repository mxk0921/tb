package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class slq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356418);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c5d3cd1", new Object[0])).booleanValue();
        }
        return hjr.E("enableInterruptShowPopWithFlag", true);
    }

    public static void b(ux9 ux9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8f69093", new Object[]{ux9Var, new Boolean(z)});
        } else if (a()) {
            o3s.b("StdPopUtils", "setCanShowPopFlag, postEvent canShow = " + z);
            sjr.g().c(uyg.EVENT_CAN_SHOW_POP_LAYER, Boolean.valueOf(z), ux9Var != null ? ux9Var.C() : null);
        }
    }
}
