package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t4c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface yad extends t4c {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909573);
        }

        public static void a(yad yadVar, bbs bbsVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2e487a", new Object[]{yadVar, bbsVar});
                return;
            }
            ckf.g(yadVar, "this");
            ckf.g(bbsVar, "instance");
            t4c.a.a(yadVar, bbsVar);
        }

        public static void b(yad yadVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c6b0c45", new Object[]{yadVar});
                return;
            }
            ckf.g(yadVar, "this");
            t4c.a.b(yadVar);
        }
    }

    void E();
}
