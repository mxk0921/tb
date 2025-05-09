package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.kernel.serviceinterface.KSFileEncodingType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface qhc extends zrb<qhc> {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1002438803);
        }

        public static /* synthetic */ void a(qhc qhcVar, String str, KSFileEncodingType kSFileEncodingType, g1a g1aVar, g1a g1aVar2, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("438e68a9", new Object[]{qhcVar, str, kSFileEncodingType, g1aVar, g1aVar2, new Integer(i), obj});
            } else if (obj == null) {
                if ((i & 2) != 0) {
                    kSFileEncodingType = KSFileEncodingType.UTF8;
                }
                if ((i & 8) != 0) {
                    g1aVar2 = null;
                }
                qhcVar.e(str, kSFileEncodingType, g1aVar, g1aVar2);
            } else {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readAsString");
            }
        }
    }

    void G(String str, g1a<? super Boolean, xhv> g1aVar, g1a<? super n0g, xhv> g1aVar2);

    void e(String str, KSFileEncodingType kSFileEncodingType, g1a<? super String, xhv> g1aVar, g1a<? super n0g, xhv> g1aVar2);

    void k(String str, g1a<? super Boolean, xhv> g1aVar, g1a<? super n0g, xhv> g1aVar2);

    void m(String str, boolean z, g1a<? super Boolean, xhv> g1aVar, g1a<? super n0g, xhv> g1aVar2);

    void q(String str, String str2, g1a<? super String, xhv> g1aVar, g1a<? super n0g, xhv> g1aVar2);

    String s(String str);
}
