package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t4c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface j0c extends t4c {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909556);
        }

        public static void a(j0c j0cVar, bbs bbsVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("221f3014", new Object[]{j0cVar, bbsVar});
                return;
            }
            ckf.g(j0cVar, "this");
            ckf.g(bbsVar, "instance");
            t4c.a.a(j0cVar, bbsVar);
        }

        public static void b(j0c j0cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4ae41eb1", new Object[]{j0cVar});
                return;
            }
            ckf.g(j0cVar, "this");
            t4c.a.b(j0cVar);
        }
    }

    boolean j0();
}
