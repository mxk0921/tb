package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.z5d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface wde extends z5d, rde {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(852492349);
        }

        public static void a(wde wdeVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25f94f6d", new Object[]{wdeVar});
                return;
            }
            ckf.g(wdeVar, "this");
            z5d.a.a(wdeVar);
        }

        public static void b(wde wdeVar, ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d5deea7", new Object[]{wdeVar, iTMSPage});
                return;
            }
            ckf.g(wdeVar, "this");
            ckf.g(iTMSPage, "page");
            z5d.a.b(wdeVar, iTMSPage);
        }

        public static void c(wde wdeVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c86d9b5", new Object[]{wdeVar});
                return;
            }
            ckf.g(wdeVar, "this");
            z5d.a.c(wdeVar);
        }
    }

    void b(String str, String str2);
}
