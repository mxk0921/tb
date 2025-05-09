package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.z5d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface u8c extends z5d {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(834666567);
        }

        public static void a(u8c u8cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("54c233f9", new Object[]{u8cVar});
                return;
            }
            ckf.g(u8cVar, "this");
            z5d.a.a(u8cVar);
        }

        public static void b(u8c u8cVar, ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3057f8b3", new Object[]{u8cVar, iTMSPage});
                return;
            }
            ckf.g(u8cVar, "this");
            ckf.g(iTMSPage, "page");
            z5d.a.b(u8cVar, iTMSPage);
        }

        public static void c(u8c u8cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("862a9241", new Object[]{u8cVar});
                return;
            }
            ckf.g(u8cVar, "this");
            z5d.a.c(u8cVar);
        }
    }
}
