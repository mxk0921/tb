package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t4c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface vnb extends t4c {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909554);
        }

        public static void a(vnb vnbVar, bbs bbsVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca4cd5f9", new Object[]{vnbVar, bbsVar});
                return;
            }
            ckf.g(vnbVar, "this");
            ckf.g(bbsVar, "instance");
            t4c.a.a(vnbVar, bbsVar);
        }

        public static void b(vnb vnbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25b84c44", new Object[]{vnbVar});
                return;
            }
            ckf.g(vnbVar, "this");
            t4c.a.b(vnbVar);
        }
    }

    Float b0();

    Float q0();
}
