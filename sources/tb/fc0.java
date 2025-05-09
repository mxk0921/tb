package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface fc0 {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(786432115);
        }

        public static void a(fc0 fc0Var, gc0 gc0Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d33a9e07", new Object[]{fc0Var, gc0Var});
                return;
            }
            ckf.g(gc0Var, DataReceiveMonitor.CB_LISTENER);
            fc0Var.b1().add(gc0Var);
        }

        public static void b(fc0 fc0Var, gc0 gc0Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4d5237aa", new Object[]{fc0Var, gc0Var});
                return;
            }
            ckf.g(gc0Var, DataReceiveMonitor.CB_LISTENER);
            fc0Var.b1().remove(gc0Var);
        }
    }

    void M(gc0 gc0Var);

    void M1(gc0 gc0Var);

    List<gc0> b1();
}
