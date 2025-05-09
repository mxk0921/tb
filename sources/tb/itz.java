package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.itz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface itz<Derived extends itz<Derived>> extends jkz {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598737506);
        }

        public static <Derived extends itz<Derived>> zsz a(itz<Derived> itzVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (zsz) ipChange.ipc$dispatch("4369cdb5", new Object[]{itzVar});
            }
            ckf.g(itzVar, "this");
            if (itzVar.e() == null) {
                itzVar.d(itzVar.c());
            }
            zsz e = itzVar.e();
            ckf.d(e);
            return e;
        }

        public static <Derived extends itz<Derived>> void c(itz<Derived> itzVar, int i, double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb0b55c9", new Object[]{itzVar, new Integer(i), new Double(d)});
            } else {
                ckf.g(itzVar, "this");
            }
        }

        public static <Derived extends itz<Derived>> void d(itz<Derived> itzVar, int i, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb0b5d4b", new Object[]{itzVar, new Integer(i), new Float(f)});
            } else {
                ckf.g(itzVar, "this");
            }
        }

        public static <Derived extends itz<Derived>> void e(itz<Derived> itzVar, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb0b688e", new Object[]{itzVar, new Integer(i), new Integer(i2)});
            } else {
                ckf.g(itzVar, "this");
            }
        }

        public static <Derived extends itz<Derived>> void f(itz<Derived> itzVar, int i, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb0b6c4f", new Object[]{itzVar, new Integer(i), new Long(j)});
            } else {
                ckf.g(itzVar, "this");
            }
        }

        public static <Derived extends itz<Derived>> void g(itz<Derived> itzVar, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f81761b1", new Object[]{itzVar, new Integer(i), obj});
                return;
            }
            ckf.g(itzVar, "this");
            ckf.g(obj, "value");
        }

        public static <Derived extends itz<Derived>> void h(itz<Derived> itzVar, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("45989b9f", new Object[]{itzVar, new Integer(i), str});
                return;
            }
            ckf.g(itzVar, "this");
            ckf.g(str, "value");
        }

        public static <Derived extends itz<Derived>> void i(itz<Derived> itzVar, int i, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb0ba85f", new Object[]{itzVar, new Integer(i), new Boolean(z)});
            } else {
                ckf.g(itzVar, "this");
            }
        }

        public static <Derived extends itz<Derived>> boolean b(itz<Derived> itzVar, Derived derived) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c37b320c", new Object[]{itzVar, derived})).booleanValue();
            }
            ckf.g(itzVar, "this");
            ckf.g(derived, "other");
            return true;
        }
    }

    zsz c();

    void d(zsz zszVar);

    zsz e();
}
