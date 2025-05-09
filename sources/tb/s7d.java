package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.z5d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface s7d extends z5d {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909640);
        }

        public static void a(s7d s7dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9d0e9458", new Object[]{s7dVar});
                return;
            }
            ckf.g(s7dVar, "this");
            z5d.a.a(s7dVar);
        }

        public static void b(s7d s7dVar, ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("245ead92", new Object[]{s7dVar, iTMSPage});
                return;
            }
            ckf.g(s7dVar, "this");
            ckf.g(iTMSPage, "page");
            z5d.a.b(s7dVar, iTMSPage);
        }

        public static void c(s7d s7dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3db156a0", new Object[]{s7dVar});
                return;
            }
            ckf.g(s7dVar, "this");
            z5d.a.c(s7dVar);
        }
    }

    ITMSPage L0();
}
