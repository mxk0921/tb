package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface ovc {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(144703562);
        }

        public static /* synthetic */ void a(ovc ovcVar, String str, String str2, Set set, Set set2, boolean z, int i, Object obj) {
            boolean z2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0957710", new Object[]{ovcVar, str, str2, set, set2, new Boolean(z), new Integer(i), obj});
            } else if (obj == null) {
                if ((i & 16) != 0) {
                    z2 = false;
                } else {
                    z2 = z;
                }
                ovcVar.a(str, str2, set, set2, z2);
            } else {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
            }
        }
    }

    void a(String str, String str2, Set<String> set, Set<String> set2, boolean z);

    void commitFail(String str, String str2, String str3, String str4, String str5);

    void commitStat(String str, String str2, Map<String, String> map, Map<String, Double> map2);

    void commitSuccess(String str, String str2, String str3);
}
