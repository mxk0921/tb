package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t4c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface yjy extends t4c {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909564);
        }

        public static void a(yjy yjyVar, bbs bbsVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("986125c1", new Object[]{yjyVar, bbsVar});
                return;
            }
            ckf.g(yjyVar, "this");
            ckf.g(bbsVar, "instance");
            t4c.a.a(yjyVar, bbsVar);
        }

        public static void b(yjy yjyVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c8cccde", new Object[]{yjyVar});
                return;
            }
            ckf.g(yjyVar, "this");
            t4c.a.b(yjyVar);
        }
    }

    boolean a();
}
