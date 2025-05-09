package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t4c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface t8c extends t4c {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(834666531);
        }

        public static void a(t8c t8cVar, bbs bbsVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b907883f", new Object[]{t8cVar, bbsVar});
                return;
            }
            ckf.g(t8cVar, "this");
            ckf.g(bbsVar, "instance");
            t4c.a.a(t8cVar, bbsVar);
        }

        public static void b(t8c t8cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("112e0c4a", new Object[]{t8cVar});
                return;
            }
            ckf.g(t8cVar, "this");
            t4c.a.b(t8cVar);
        }
    }

    void hideLoading();

    void showLoading();
}
