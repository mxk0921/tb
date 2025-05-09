package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface t4c {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909558);
        }

        public static void a(t4c t4cVar, bbs bbsVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2ea9e4d0", new Object[]{t4cVar, bbsVar});
                return;
            }
            ckf.g(t4cVar, "this");
            ckf.g(bbsVar, "instance");
        }

        public static void b(t4c t4cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("28f8482d", new Object[]{t4cVar});
            } else {
                ckf.g(t4cVar, "this");
            }
        }
    }

    void N(bbs bbsVar);

    void c();
}
