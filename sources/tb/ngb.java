package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t4c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface ngb extends t4c {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909552);
        }

        public static void a(ngb ngbVar, bbs bbsVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("76883e59", new Object[]{ngbVar, bbsVar});
                return;
            }
            ckf.g(ngbVar, "this");
            ckf.g(bbsVar, "instance");
            t4c.a.a(ngbVar, bbsVar);
        }

        public static void b(ngb ngbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be3d32f6", new Object[]{ngbVar});
                return;
            }
            ckf.g(ngbVar, "this");
            t4c.a.b(ngbVar);
        }
    }

    void onPause();

    void onResume();

    void onStart();

    void onStop();
}
