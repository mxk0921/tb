package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.z5d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface xce extends z5d, nce {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(851443733);
        }

        public static void a(xce xceVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd0e65c2", new Object[]{xceVar});
                return;
            }
            ckf.g(xceVar, "this");
            z5d.a.a(xceVar);
        }

        public static void b(xce xceVar, ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("efcbd7fe", new Object[]{xceVar, iTMSPage});
                return;
            }
            ckf.g(xceVar, "this");
            ckf.g(iTMSPage, "page");
            z5d.a.b(xceVar, iTMSPage);
        }

        public static void c(xce xceVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("87663a7a", new Object[]{xceVar});
                return;
            }
            ckf.g(xceVar, "this");
            z5d.a.c(xceVar);
        }
    }
}
