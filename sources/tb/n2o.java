package tb;

import android.content.Context;
import com.alibaba.ha.bizerrorreporter.module.AggregationType;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class n2o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806355054);
    }

    public static void a(Context context, String str, Exception exc) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5355eb6", new Object[]{context, str, exc});
            return;
        }
        ud2 ud2Var = new ud2();
        ud2Var.f29301a = "LAUNCHER_ERROR";
        ud2Var.b = AggregationType.CONTENT;
        ud2Var.c = str;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":");
        if (exc != null) {
            str2 = exc.getMessage() + "," + exc.getCause();
        } else {
            str2 = "nothing";
        }
        sb.append(str2);
        ud2Var.d = sb.toString();
        ud2Var.k = exc;
        ud2Var.l = Thread.currentThread();
        ud2Var.e = sd2._VERSION;
        ud2Var.f = str;
        vd2.a().c(context, ud2Var);
    }
}
