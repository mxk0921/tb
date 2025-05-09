package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface swd {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909872);
        }

        public static /* synthetic */ boolean a(swd swdVar, boolean z, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e236e603", new Object[]{swdVar, new Boolean(z), new Integer(i), obj})).booleanValue();
            }
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                return swdVar.f(z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popPage");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void a();
    }

    boolean a(ITMSPage iTMSPage);

    boolean b(int i);

    int c(ITMSPage iTMSPage);

    boolean d(ITMSPage iTMSPage);

    void destroy();

    void e();

    boolean f(boolean z);

    boolean g(ITMSPage iTMSPage);

    int getAlivePageCount();

    ITMSPage getPageByIndex(int i);

    ITMSPage getTopPage();
}
