package tb;

import android.app.Activity;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.alibaba.android.ultron.vfw.instance.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class uda {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295698966);
    }

    public static void a(DinamicXEngine dinamicXEngine, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1323c7c2", new Object[]{dinamicXEngine, activity});
        } else if (dinamicXEngine != null && activity != null && vc.a()) {
            if (vc.i(activity)) {
                dinamicXEngine.d().b(true, true);
            }
            if (vc.d(activity) && vc.f(activity)) {
                dinamicXEngine.d().a(true);
            }
        }
    }

    public static void b(Activity activity, xea xeaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2177fd92", new Object[]{activity, xeaVar});
            return;
        }
        if (!(xeaVar == null || xeaVar.D() == null)) {
            d(xeaVar.D(), activity);
        }
        if (!(xeaVar == null || xeaVar.I() == null)) {
            c(xeaVar.I().h, activity);
        }
        DinamicXEngine e = ikr.f().e();
        if (e != null) {
            a(e, activity);
            if (xeaVar != null) {
                xeaVar.l.Q(e, activity);
            }
        }
    }

    public static void c(feg fegVar, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e99ecc9", new Object[]{fegVar, activity});
        } else if (fegVar != null && activity != null) {
            a(fegVar.f(), activity);
        }
    }

    public static void d(a aVar, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6a37d2", new Object[]{aVar, activity});
        } else if (aVar != null) {
            ViewEngine G = aVar.G();
            if (G == null) {
                hha.b("GoodAPadAdapterUtils", "viewEngine is null.");
                return;
            }
            jo7 Q = G.Q();
            if (Q == null) {
                hha.b("GoodAPadAdapterUtils", "dinamicXEngineManager is null.");
            } else if (Q.b().k() == null) {
                hha.b("GoodAPadAdapterUtils", "getEngine is null.");
            } else {
                a(Q.b().k(), activity);
            }
        }
    }
}
