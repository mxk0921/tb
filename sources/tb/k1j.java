package tb;

import android.content.Context;
import com.alibaba.ha.bizerrorreporter.module.AggregationType;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class k1j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Context context, String str, Throwable th) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ada5417d", new Object[]{context, str, th});
            return;
        }
        ud2 ud2Var = new ud2();
        ud2Var.f29301a = "LAUNCHER_ERROR";
        ud2Var.b = AggregationType.CONTENT;
        ud2Var.c = String.valueOf(str);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("：");
        if (th != null) {
            str2 = th.getMessage() + "，" + th.getCause();
        } else {
            str2 = "nothing";
        }
        sb.append(str2);
        ud2Var.d = sb.toString();
        ud2Var.j = "https://launcher.taobao.com/exception/" + str;
        ud2Var.k = th;
        ud2Var.l = Thread.currentThread();
        ud2Var.e = sd2._VERSION;
        HashMap hashMap = new HashMap(2);
        hashMap.put("name", str);
        hashMap.put("launch", "next launch");
        ud2Var.i = hashMap;
        vd2.a().c(context, ud2Var);
    }
}
