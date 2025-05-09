package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.extension.page.rum.TMSEmbedPresentModeType;
import com.taobao.themis.kernel.extension.page.rum.TMSRumTarget;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.z5d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface pgd extends z5d {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909681);
        }

        public static void a(pgd pgdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb4afc71", new Object[]{pgdVar});
                return;
            }
            ckf.g(pgdVar, "this");
            z5d.a.a(pgdVar);
        }

        public static void b(pgd pgdVar, ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eca6736d", new Object[]{pgdVar, iTMSPage});
                return;
            }
            ckf.g(pgdVar, "this");
            ckf.g(iTMSPage, "page");
            z5d.a.b(pgdVar, iTMSPage);
        }

        public static void c(pgd pgdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f008329", new Object[]{pgdVar});
                return;
            }
            ckf.g(pgdVar, "this");
            z5d.a.c(pgdVar);
        }
    }

    Object B0();

    void D(String str);

    void F(String str, Object obj, TMSRumTarget tMSRumTarget);

    void G0();

    String H0();

    void J(TMSEmbedPresentModeType tMSEmbedPresentModeType);

    void R0(String str, long j, TMSRumTarget tMSRumTarget);

    void a(String str, Long l);

    void i1(boolean z);

    void onViewAppear();

    void p1(boolean z);

    Object q0();

    void u0();

    void w(TMSEmbedPresentModeType tMSEmbedPresentModeType);
}
