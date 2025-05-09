package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class dht {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final dht INSTANCE = new dht();

    static {
        t2o.a(786432005);
    }

    @JvmStatic
    public static final void a(String str, DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1aca12c8", new Object[]{str, dinamicXEngine});
            return;
        }
        ckf.g(dinamicXEngine, gbv.PARAM_KEY_DX_ENGINE);
        if (str != null) {
            Iterator<T> it = c28.INSTANCE.c(str).iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                ob5 ob5Var = (ob5) pair.component2();
                Long o = ssq.o((String) pair.component1());
                if (o != null) {
                    dinamicXEngine.W0(o.longValue(), ob5Var);
                }
            }
            Iterator<T> it2 = d48.INSTANCE.c(str).iterator();
            while (it2.hasNext()) {
                Pair pair2 = (Pair) it2.next();
                qub qubVar = (qub) pair2.component2();
                Long o2 = ssq.o((String) pair2.component1());
                if (o2 != null) {
                    dinamicXEngine.e1(o2.longValue(), qubVar);
                }
            }
            Iterator<T> it3 = y28.INSTANCE.c(str).iterator();
            while (it3.hasNext()) {
                Pair pair3 = (Pair) it3.next();
                nb5 nb5Var = (nb5) pair3.component2();
                Long o3 = ssq.o((String) pair3.component1());
                if (o3 != null) {
                    dinamicXEngine.V0(o3.longValue(), nb5Var);
                }
            }
        }
    }
}
