package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.TMSBackPressedType;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.w5d;
import tb.z5d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface kab extends z5d, w5d.c {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909610);
        }

        public static void a(kab kabVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7115de48", new Object[]{kabVar});
                return;
            }
            ckf.g(kabVar, "this");
            z5d.a.a(kabVar);
        }

        public static void b(kab kabVar, ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ffa6e802", new Object[]{kabVar, iTMSPage});
                return;
            }
            ckf.g(kabVar, "this");
            ckf.g(iTMSPage, "page");
            z5d.a.b(kabVar, iTMSPage);
        }

        public static void c(kab kabVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a27e3c90", new Object[]{kabVar});
                return;
            }
            ckf.g(kabVar, "this");
            z5d.a.c(kabVar);
        }
    }

    void H();

    void Y0(TMSBackPressedType tMSBackPressedType, rqb rqbVar);
}
