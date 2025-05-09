package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface rgz {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598737285);
        }

        public static void a(rgz rgzVar, int i, sgz sgzVar, byte b, byte b2, byte b3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1ee07457", new Object[]{rgzVar, new Integer(i), sgzVar, new Byte(b), new Byte(b2), new Byte(b3)});
                return;
            }
            ckf.g(rgzVar, "this");
            ckf.g(sgzVar, "eventPayload");
            whz whzVar = (whz) rgzVar;
            qgz c = whzVar.c();
            if (c != null) {
                c.a(new phz(i, sgzVar, b, b2, new WeakReference(whzVar.d()), b3, null));
            }
        }
    }
}
