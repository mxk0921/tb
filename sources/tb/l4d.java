package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.z5d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface l4d extends z5d {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909629);
        }

        public static void a(l4d l4dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7b9d94d2", new Object[]{l4dVar});
                return;
            }
            ckf.g(l4dVar, "this");
            z5d.a.a(l4dVar);
        }

        public static void b(l4d l4dVar, ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("480fc64e", new Object[]{l4dVar, iTMSPage});
                return;
            }
            ckf.g(l4dVar, "this");
            ckf.g(iTMSPage, "page");
            z5d.a.b(l4dVar, iTMSPage);
        }

        public static void c(l4d l4dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7740ff8a", new Object[]{l4dVar});
                return;
            }
            ckf.g(l4dVar, "this");
            z5d.a.c(l4dVar);
        }
    }

    void J0(Window.Orientation orientation);
}
