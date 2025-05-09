package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.z5d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface lae extends z5d {
    public static final a Companion = a.$$INSTANCE;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909656);
        }

        public final ITMSPage a(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITMSPage) ipChange.ipc$dispatch("a30ce16c", new Object[]{this, iTMSPage});
            }
            ckf.g(iTMSPage, "page");
            while (true) {
                if ((iTMSPage == null ? null : (lae) iTMSPage.getExtension(lae.class)) == null) {
                    return iTMSPage;
                }
                lae laeVar = (lae) iTMSPage.getExtension(lae.class);
                iTMSPage = laeVar == null ? null : laeVar.B();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909657);
        }

        public static void a(lae laeVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6ddbd0d", new Object[]{laeVar});
                return;
            }
            ckf.g(laeVar, "this");
            z5d.a.a(laeVar);
        }

        public static void b(lae laeVar, ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20136809", new Object[]{laeVar, iTMSPage});
                return;
            }
            ckf.g(laeVar, "this");
            ckf.g(iTMSPage, "page");
            z5d.a.b(laeVar, iTMSPage);
        }
    }

    ITMSPage B();
}
