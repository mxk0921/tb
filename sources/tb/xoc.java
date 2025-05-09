package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.t4c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface xoc extends t4c {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(848298016);
        }

        public static void a(xoc xocVar, bbs bbsVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f09e1a1", new Object[]{xocVar, bbsVar});
                return;
            }
            ckf.g(xocVar, "this");
            ckf.g(bbsVar, "instance");
            t4c.a.a(xocVar, bbsVar);
        }

        public static void b(xoc xocVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70042a6c", new Object[]{xocVar});
                return;
            }
            ckf.g(xocVar, "this");
            t4c.a.b(xocVar);
        }
    }

    void v(ITMSPage iTMSPage);
}
