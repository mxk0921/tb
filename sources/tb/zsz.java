package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface zsz extends jkz {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598737504);
        }

        public static jkz a(zsz zszVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jkz) ipChange.ipc$dispatch("9bc90a29", new Object[]{zszVar});
            }
            ckf.g(zszVar, "this");
            return zszVar.a();
        }

        public static void b(zsz zszVar, int i, double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c055557", new Object[]{zszVar, new Integer(i), new Double(d)});
            } else {
                ckf.g(zszVar, "this");
            }
        }

        public static void c(zsz zszVar, int i, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c055cd9", new Object[]{zszVar, new Integer(i), new Float(f)});
            } else {
                ckf.g(zszVar, "this");
            }
        }

        public static void d(zsz zszVar, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c05681c", new Object[]{zszVar, new Integer(i), new Integer(i2)});
            } else {
                ckf.g(zszVar, "this");
            }
        }

        public static void e(zsz zszVar, int i, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c056bdd", new Object[]{zszVar, new Integer(i), new Long(j)});
            } else {
                ckf.g(zszVar, "this");
            }
        }

        public static void f(zsz zszVar, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f166afe3", new Object[]{zszVar, new Integer(i), obj});
                return;
            }
            ckf.g(zszVar, "this");
            ckf.g(obj, "value");
        }

        public static void g(zsz zszVar, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3ee7e9d1", new Object[]{zszVar, new Integer(i), str});
                return;
            }
            ckf.g(zszVar, "this");
            ckf.g(str, "value");
        }

        public static void h(zsz zszVar, int i, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c05a7ed", new Object[]{zszVar, new Integer(i), new Boolean(z)});
            } else {
                ckf.g(zszVar, "this");
            }
        }
    }

    zsz a();

    boolean f(zsz zszVar);
}
