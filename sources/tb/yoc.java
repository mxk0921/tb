package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.z5d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface yoc extends z5d {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(848298029);
        }

        public static void a(yoc yocVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("258f235d", new Object[]{yocVar});
                return;
            }
            ckf.g(yocVar, "this");
            z5d.a.a(yocVar);
        }

        public static void b(yoc yocVar, ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d205c99", new Object[]{yocVar, iTMSPage});
                return;
            }
            ckf.g(yocVar, "this");
            ckf.g(iTMSPage, "page");
            z5d.a.b(yocVar, iTMSPage);
        }

        public static void c(yoc yocVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e7d68815", new Object[]{yocVar});
                return;
            }
            ckf.g(yocVar, "this");
            z5d.a.c(yocVar);
        }
    }
}
