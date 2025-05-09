package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t4c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface i8c extends t4c {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(843055247);
        }

        public static void a(i8c i8cVar, bbs bbsVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4900589", new Object[]{i8cVar, bbsVar});
                return;
            }
            ckf.g(i8cVar, "this");
            ckf.g(bbsVar, "instance");
            t4c.a.a(i8cVar, bbsVar);
        }

        public static void b(i8c i8cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("59ec15e6", new Object[]{i8cVar});
                return;
            }
            ckf.g(i8cVar, "this");
            t4c.a.b(i8cVar);
        }
    }

    String F();
}
