package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.z5d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface f0d extends z5d {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909569);
        }

        public static void a(f0d f0dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4199412f", new Object[]{f0dVar});
                return;
            }
            ckf.g(f0dVar, "this");
            z5d.a.a(f0dVar);
        }

        public static void b(f0d f0dVar, ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("41387869", new Object[]{f0dVar, iTMSPage});
                return;
            }
            ckf.g(f0dVar, "this");
            ckf.g(iTMSPage, "page");
            z5d.a.b(f0dVar, iTMSPage);
        }

        public static void c(f0d f0dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af993b77", new Object[]{f0dVar});
                return;
            }
            ckf.g(f0dVar, "this");
            z5d.a.c(f0dVar);
        }
    }

    e0d x();
}
