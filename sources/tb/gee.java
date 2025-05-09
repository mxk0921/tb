package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t4c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface gee extends t4c {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909581);
        }

        public static void a(gee geeVar, bbs bbsVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6d40034", new Object[]{geeVar, bbsVar});
                return;
            }
            ckf.g(geeVar, "this");
            ckf.g(bbsVar, "instance");
            t4c.a.a(geeVar, bbsVar);
        }

        public static void b(gee geeVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e2016111", new Object[]{geeVar});
                return;
            }
            ckf.g(geeVar, "this");
            t4c.a.b(geeVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void a(int i, int i2);
    }

    void J(b bVar);

    void i(b bVar);
}
