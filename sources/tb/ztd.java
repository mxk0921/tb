package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.lae;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface ztd extends lae {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909685);
        }

        public static void a(ztd ztdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9dcdf7d5", new Object[]{ztdVar});
                return;
            }
            ckf.g(ztdVar, "this");
            lae.b.a(ztdVar);
        }

        public static void b(ztd ztdVar, ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("71a97a11", new Object[]{ztdVar, iTMSPage});
                return;
            }
            ckf.g(ztdVar, "this");
            ckf.g(iTMSPage, "page");
            lae.b.b(ztdVar, iTMSPage);
        }
    }

    int X();

    boolean a0(String str, double d);

    boolean b0(int i);

    x5d getPageContainer();

    void k1(boolean z);

    void l0(aud audVar);

    boolean v(int i, String str);

    boolean x0(int i);

    boolean y0();
}
