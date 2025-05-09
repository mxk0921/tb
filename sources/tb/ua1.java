package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ua1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093263);
    }

    public static void a(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73f35409", new Object[]{ux9Var});
        } else {
            rbu.L(ux9Var, "appointment-close", new String[0]);
        }
    }

    public static void b(ux9 ux9Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("680ef5c8", new Object[]{ux9Var, str});
        } else {
            rbu.L(ux9Var, str, new String[0]);
        }
    }

    public static void c(ux9 ux9Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e7ee5c", new Object[]{ux9Var, str});
        } else {
            rbu.c0(ux9Var, str, new HashMap());
        }
    }
}
