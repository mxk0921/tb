package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class tvs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(776994829);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4cbe604e", new Object[0])).booleanValue();
        }
        return arq.c(e2h.t("isAfcColdContextTrackHomePageBugfix", "true"));
    }
}
