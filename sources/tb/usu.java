package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class usu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(767557712);
    }

    public static void a(z24 z24Var, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bad7b957", new Object[]{z24Var, str, str2});
        } else {
            c(z24Var, str, str2);
        }
    }

    public static void b(z24 z24Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("570e393c", new Object[]{z24Var});
        } else {
            c(z24Var, "200", "");
        }
    }

    public static void c(z24 z24Var, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94022fc4", new Object[]{z24Var, str, str2});
            return;
        }
        hfh hfhVar = new hfh();
        hfhVar.b = j5s.j().f();
        hfhVar.c = j5s.j().d();
        hfhVar.f20602a = j5s.q();
        hfhVar.d = "RDWP_USER_DEFINED_UPLOAD_REPLY";
        hfhVar.e = str;
        hfhVar.f = str2;
        drv drvVar = new drv();
        try {
            p5o p5oVar = new p5o();
            p5oVar.f25893a = drvVar.a(z24Var, hfhVar);
            oap.a(j5s.j().h(), p5oVar);
        } catch (Exception e) {
            Log.e("UDFUploadReply", "user define log upload reply error", e);
            j5s.j().s().a(b6s.c, z24Var.c, e);
        }
    }
}
