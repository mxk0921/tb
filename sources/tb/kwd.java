package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.z5d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface kwd extends z5d {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909654);
        }

        public static void a(kwd kwdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5934c3e4", new Object[]{kwdVar});
                return;
            }
            ckf.g(kwdVar, "this");
            z5d.a.a(kwdVar);
        }

        public static void b(kwd kwdVar, ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("afe6b95e", new Object[]{kwdVar, iTMSPage});
                return;
            }
            ckf.g(kwdVar, "this");
            ckf.g(iTMSPage, "page");
            z5d.a.b(kwdVar, iTMSPage);
        }

        public static void c(kwd kwdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c30142c", new Object[]{kwdVar});
                return;
            }
            ckf.g(kwdVar, "this");
            z5d.a.c(kwdVar);
        }
    }

    void K0(boolean z);

    boolean isFirstPage();
}
