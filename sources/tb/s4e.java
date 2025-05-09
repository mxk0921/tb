package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t4c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface s4e extends t4c {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909579);
        }

        public static void a(s4e s4eVar, bbs bbsVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe97caef", new Object[]{s4eVar, bbsVar});
                return;
            }
            ckf.g(s4eVar, "this");
            ckf.g(bbsVar, "instance");
            t4c.a.a(s4eVar, bbsVar);
        }

        public static void b(s4e s4eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("763f734c", new Object[]{s4eVar});
                return;
            }
            ckf.g(s4eVar, "this");
            t4c.a.b(s4eVar);
        }
    }
}
