package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.z5d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface jwd extends z5d {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909652);
        }

        public static void a(jwd jwdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7775bf1b", new Object[]{jwdVar});
                return;
            }
            ckf.g(jwdVar, "this");
            z5d.a.a(jwdVar);
        }

        public static void b(jwd jwdVar, ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("13bce317", new Object[]{jwdVar, iTMSPage});
                return;
            }
            ckf.g(jwdVar, "this");
            ckf.g(iTMSPage, "page");
            z5d.a.b(jwdVar, iTMSPage);
        }

        public static void c(jwd jwdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9750dd3", new Object[]{jwdVar});
                return;
            }
            ckf.g(jwdVar, "this");
            z5d.a.c(jwdVar);
        }
    }

    boolean isHitSnapshot();

    void setHitSnapshot(boolean z);
}
