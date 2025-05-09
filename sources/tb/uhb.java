package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.z5d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface uhb extends z5d {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(843055143);
        }

        public static void a(uhb uhbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5684d87", new Object[]{uhbVar});
                return;
            }
            ckf.g(uhbVar, "this");
            z5d.a.a(uhbVar);
        }

        public static void b(uhb uhbVar, ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("27e82643", new Object[]{uhbVar, iTMSPage});
                return;
            }
            ckf.g(uhbVar, "this");
            ckf.g(iTMSPage, "page");
            z5d.a.b(uhbVar, iTMSPage);
        }

        public static void c(uhb uhbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("41d7063f", new Object[]{uhbVar});
                return;
            }
            ckf.g(uhbVar, "this");
            z5d.a.c(uhbVar);
        }
    }

    iwd U0(String str);
}
