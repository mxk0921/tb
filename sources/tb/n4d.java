package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t4c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface n4d extends t4c {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909571);
        }

        public static void a(n4d n4dVar, bbs bbsVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("680295b5", new Object[]{n4dVar, bbsVar});
                return;
            }
            ckf.g(n4dVar, "this");
            ckf.g(bbsVar, "instance");
            t4c.a.a(n4dVar, bbsVar);
        }

        public static void b(n4d n4dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd8e480", new Object[]{n4dVar});
                return;
            }
            ckf.g(n4dVar, "this");
            t4c.a.b(n4dVar);
        }
    }

    void H();

    void K();
}
