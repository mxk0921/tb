package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.TMSBackPressedType;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.z5d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface w5d extends z5d {
    public static final a Companion = a.$$INSTANCE;
    public static final int PAGE_CLOSE_INTERCEPTOR_PRIORITY_DEFAULT = 1;
    public static final int PAGE_CLOSE_INTERCEPTOR_PRIORITY_LEGACY_API = 8;
    public static final int PAGE_CLOSE_INTERCEPTOR_PRIORITY_PUB = 2;
    public static final int PAGE_CLOSE_INTERCEPTOR_PRIORITY_SINGLE_WEB = 9;
    public static final int PAGE_CLOSE_INTERCEPTOR_PRIORITY_SINGLE_WEEX = 9;
    public static final int PAGE_CLOSE_INTERCEPTOR_PRIORITY_UNI_API = 10;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static final int PAGE_CLOSE_INTERCEPTOR_PRIORITY_DEFAULT = 1;
        public static final int PAGE_CLOSE_INTERCEPTOR_PRIORITY_LEGACY_API = 8;
        public static final int PAGE_CLOSE_INTERCEPTOR_PRIORITY_PUB = 2;
        public static final int PAGE_CLOSE_INTERCEPTOR_PRIORITY_SINGLE_WEB = 9;
        public static final int PAGE_CLOSE_INTERCEPTOR_PRIORITY_SINGLE_WEEX = 9;
        public static final int PAGE_CLOSE_INTERCEPTOR_PRIORITY_UNI_API = 10;

        static {
            t2o.a(839909631);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909632);
        }

        public static void a(w5d w5dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3be5342b", new Object[]{w5dVar});
                return;
            }
            ckf.g(w5dVar, "this");
            z5d.a.a(w5dVar);
        }

        public static void b(w5d w5dVar, ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4fa298e7", new Object[]{w5dVar, iTMSPage});
                return;
            }
            ckf.g(w5dVar, "this");
            ckf.g(iTMSPage, "page");
            z5d.a.b(w5dVar, iTMSPage);
        }

        public static void c(w5d w5dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9853ece3", new Object[]{w5dVar});
                return;
            }
            ckf.g(w5dVar, "this");
            z5d.a.c(w5dVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface c {
        boolean a(ITMSPage iTMSPage, TMSBackPressedType tMSBackPressedType);

        int getPriority();
    }

    void A(c cVar);

    boolean C0(TMSBackPressedType tMSBackPressedType);

    void c0(c cVar);
}
