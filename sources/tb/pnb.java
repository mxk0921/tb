package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.z5d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface pnb extends z5d {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909614);
        }

        public static void a(pnb pnbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fa1e3937", new Object[]{pnbVar});
                return;
            }
            ckf.g(pnbVar, "this");
            z5d.a.a(pnbVar);
        }

        public static void b(pnb pnbVar, ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3f651fb1", new Object[]{pnbVar, iTMSPage});
                return;
            }
            ckf.g(pnbVar, "this");
            ckf.g(iTMSPage, "page");
            z5d.a.b(pnbVar, iTMSPage);
        }

        public static void c(pnb pnbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd19897f", new Object[]{pnbVar});
                return;
            }
            ckf.g(pnbVar, "this");
            z5d.a.c(pnbVar);
        }
    }

    void Y();
}
