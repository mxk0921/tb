package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.Set;
import tb.z5d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface mab extends z5d {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909612);
        }

        public static void a(mab mabVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("924be320", new Object[]{mabVar});
                return;
            }
            ckf.g(mabVar, "this");
            z5d.a.a(mabVar);
        }
    }

    Map<String, Object> g1(Set<String> set);

    void k0();

    mdd m1();
}
