package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.z5d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface cqc extends z5d {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909618);
        }

        public static void a(cqc cqcVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84885f3", new Object[]{cqcVar});
                return;
            }
            ckf.g(cqcVar, "this");
            z5d.a.a(cqcVar);
        }

        public static /* synthetic */ void b(cqc cqcVar, String str, String str2, String str3, Boolean bool, d dVar, Boolean bool2, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4624e3fe", new Object[]{cqcVar, str, str2, str3, bool, dVar, bool2, new Integer(i), obj});
            } else if (obj == null) {
                if ((i & 1) != 0) {
                    str = null;
                }
                if ((i & 2) != 0) {
                    str2 = null;
                }
                if ((i & 4) != 0) {
                    str3 = null;
                }
                if ((i & 8) != 0) {
                    bool = null;
                }
                if ((i & 16) != 0) {
                    dVar = null;
                }
                if ((i & 32) != 0) {
                    bool2 = null;
                }
                cqcVar.e1(str, str2, str3, bool, dVar, bool2);
            } else {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: request");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void a(int i, Map<String, List<String>> map);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface c {
        void a(ygv ygvVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface d {
        void a(ygv ygvVar);

        void b(int i, Map<String, List<String>> map);

        void onError(int i, String str);
    }

    boolean A0();

    void Q(c cVar);

    void e1(String str, String str2, String str3, Boolean bool, d dVar, Boolean bool2);

    void invalid();
}
