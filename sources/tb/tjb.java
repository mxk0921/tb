package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface tjb extends sod, sjb {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(916455437);
        }

        public static /* synthetic */ void a(tjb tjbVar, boolean z, boolean z2, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aa068d0f", new Object[]{tjbVar, new Boolean(z), new Boolean(z2), new Integer(i), obj});
            } else if (obj == null) {
                if ((i & 2) != 0) {
                    z2 = true;
                }
                tjbVar.i1(z, z2);
            } else {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTabBarVisible");
            }
        }
    }

    boolean B0();

    void e0(int i);

    void i1(boolean z, boolean z2);

    void m1(int i, String str, String str2, String str3);

    boolean p0();

    void u0(int i);
}
