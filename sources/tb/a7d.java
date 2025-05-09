package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.z5d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface a7d extends z5d {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909637);
        }

        public static void a(a7d a7dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("810c72d1", new Object[]{a7dVar});
                return;
            }
            ckf.g(a7dVar, "this");
            z5d.a.a(a7dVar);
        }

        public static void b(a7d a7dVar, ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c307f8b", new Object[]{a7dVar, iTMSPage});
                return;
            }
            ckf.g(a7dVar, "this");
            ckf.g(iTMSPage, "page");
            z5d.a.b(a7dVar, iTMSPage);
        }

        public static void c(a7d a7dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b274d119", new Object[]{a7dVar});
                return;
            }
            ckf.g(a7dVar, "this");
            z5d.a.c(a7dVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void a(int i, int i2);
    }

    void Z0(b bVar);

    void r0(b bVar);
}
