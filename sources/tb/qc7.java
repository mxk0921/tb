package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class qc7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262329);
    }

    public static void a(Context context, List<ux1> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc45157", new Object[]{context, list});
            return;
        }
        for (ux1 ux1Var : list) {
            if ((ux1Var instanceof rc7) && "user_track".equals(((rc7) ux1Var).m1123b())) {
                q84.f(context, ux1Var);
            }
        }
    }
}
