package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ezw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468713618);
    }

    public static void a(dzw dzwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43caf8d1", new Object[]{dzwVar});
        } else if (dzwVar != null) {
            dzwVar.d();
            ir9.b("[webcomponent_trackerUtils]", "clearGameDuration");
        }
    }

    public static void b(dzw dzwVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("796c5ac0", new Object[]{dzwVar, str});
        } else {
            c(dzwVar, str, null);
        }
    }

    public static void c(dzw dzwVar, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aecca8c5", new Object[]{dzwVar, str, map});
        } else if (dzwVar != null) {
            dzwVar.e(str, map);
        }
    }

    public static long d(xyw xywVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fbff786b", new Object[]{xywVar})).longValue();
        }
        long j = 0;
        if (xywVar == null) {
            return 0L;
        }
        dzw U0 = xywVar.U0();
        if (U0 != null) {
            j = U0.b();
        }
        ir9.b("[webcomponent_trackerUtils]", "getGameDuration:" + j);
        return j;
    }
}
