package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.z5d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface dee extends z5d {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909659);
        }

        public static void a(dee deeVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b05ab2", new Object[]{deeVar});
                return;
            }
            ckf.g(deeVar, "this");
            z5d.a.a(deeVar);
        }
    }

    boolean S0();

    void a1();
}
