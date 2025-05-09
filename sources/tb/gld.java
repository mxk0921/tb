package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t4c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface gld extends t4c {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909840);
        }

        public static void a(gld gldVar, bbs bbsVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1fd71d8", new Object[]{gldVar, bbsVar});
                return;
            }
            ckf.g(gldVar, "this");
            ckf.g(bbsVar, "instance");
            t4c.a.a(gldVar, bbsVar);
        }

        public static void b(gld gldVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9adb6563", new Object[]{gldVar});
                return;
            }
            ckf.g(gldVar, "this");
            t4c.a.b(gldVar);
        }
    }

    void C(String str);

    void D(String str, String str2);

    String Q(String str);

    boolean R(String str);

    void a(u1a<? super String, ? super Long, xhv> u1aVar);

    void d(u1a<? super String, Object, xhv> u1aVar);

    void f(String str, long j);

    long g(String str);

    boolean w(String str);
}
