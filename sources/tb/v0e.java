package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.t4c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface v0e extends t4c {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(844103683);
        }

        public static void a(v0e v0eVar, bbs bbsVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c470bc5", new Object[]{v0eVar, bbsVar});
                return;
            }
            ckf.g(v0eVar, "this");
            ckf.g(bbsVar, "instance");
            t4c.a.a(v0eVar, bbsVar);
        }

        public static void b(v0e v0eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f8347250", new Object[]{v0eVar});
                return;
            }
            ckf.g(v0eVar, "this");
            t4c.a.b(v0eVar);
        }
    }

    boolean a0();

    void p(ITMSPage iTMSPage);
}
