package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface x5d {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909512);
        }

        public static void a(x5d x5dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("237de5e7", new Object[]{x5dVar});
            } else {
                ckf.g(x5dVar, "this");
            }
        }

        public static void b(x5d x5dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("272aa746", new Object[]{x5dVar});
            } else {
                ckf.g(x5dVar, "this");
            }
        }

        public static void c(x5d x5dVar, eas easVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6570d68b", new Object[]{x5dVar, easVar});
                return;
            }
            ckf.g(x5dVar, "this");
            ckf.g(easVar, "error");
        }

        public static void d(x5d x5dVar, eas easVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("269fee0c", new Object[]{x5dVar, easVar});
                return;
            }
            ckf.g(x5dVar, "this");
            ckf.g(easVar, "error");
        }
    }

    void a();

    void attachPage(ITMSPage iTMSPage);

    void b(eas easVar);

    void c(boolean z);

    void d(View view);

    void e(eas easVar);

    y0e getTitleBar();

    View getView();

    void hideErrorView();

    void setBgColor(String str);
}
