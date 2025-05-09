package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface z5d {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909635);
        }

        public static void a(z5d z5dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1d827c0e", new Object[]{z5dVar});
            } else {
                ckf.g(z5dVar, "this");
            }
        }

        public static void b(z5d z5dVar, ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be7be88", new Object[]{z5dVar, iTMSPage});
                return;
            }
            ckf.g(z5dVar, "this");
            ckf.g(iTMSPage, "page");
        }

        public static void c(z5d z5dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("96d69456", new Object[]{z5dVar});
            } else {
                ckf.g(z5dVar, "this");
            }
        }
    }

    void G(ITMSPage iTMSPage);

    void c();

    void w0();
}
