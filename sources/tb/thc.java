package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.kernel.serviceinterface.KSMTOPRequestMethod;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface thc extends zrb<thc> {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1002438809);
        }

        public static /* synthetic */ void a(thc thcVar, String str, String str2, Map map, Map map2, Map map3, g1a g1aVar, g1a g1aVar2, u1a u1aVar, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e9e04e97", new Object[]{thcVar, str, str2, map, map2, map3, g1aVar, g1aVar2, u1aVar, new Integer(i), obj});
            } else if (obj == null) {
                thcVar.g(str, str2, (4 & i) != 0 ? null : map, (8 & i) != 0 ? null : map2, (i & 16) != 0 ? null : map3, (i & 32) != 0 ? null : g1aVar, (i & 64) != 0 ? null : g1aVar2, (i & 128) != 0 ? null : u1aVar);
            } else {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: performGetRequest");
            }
        }

        public static /* synthetic */ void b(thc thcVar, String str, String str2, Map map, Map map2, Map map3, g1a g1aVar, g1a g1aVar2, u1a u1aVar, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("197bd503", new Object[]{thcVar, str, str2, map, map2, map3, g1aVar, g1aVar2, u1aVar, new Integer(i), obj});
            } else if (obj == null) {
                thcVar.i(str, str2, (4 & i) != 0 ? null : map, (8 & i) != 0 ? null : map2, (i & 16) != 0 ? null : map3, (i & 32) != 0 ? null : g1aVar, (i & 64) != 0 ? null : g1aVar2, (i & 128) != 0 ? null : u1aVar);
            } else {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: performPostRequest");
            }
        }

        public static /* synthetic */ void c(thc thcVar, String str, String str2, Map map, Map map2, Map map3, KSMTOPRequestMethod kSMTOPRequestMethod, g1a g1aVar, g1a g1aVar2, u1a u1aVar, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c688ddc7", new Object[]{thcVar, str, str2, map, map2, map3, kSMTOPRequestMethod, g1aVar, g1aVar2, u1aVar, new Integer(i), obj});
            } else if (obj == null) {
                thcVar.d(str, str2, (4 & i) != 0 ? null : map, (8 & i) != 0 ? null : map2, (i & 16) != 0 ? null : map3, (i & 32) != 0 ? KSMTOPRequestMethod.GET : kSMTOPRequestMethod, (i & 64) != 0 ? null : g1aVar, (i & 128) != 0 ? null : g1aVar2, (i & 256) != 0 ? null : u1aVar);
            } else {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: performRequest");
            }
        }
    }

    void d(String str, String str2, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3, KSMTOPRequestMethod kSMTOPRequestMethod, g1a<? super l0g, xhv> g1aVar, g1a<? super l0g, xhv> g1aVar2, u1a<? super l0g, ? super Boolean, xhv> u1aVar);

    boolean f(l0g l0gVar);

    void g(String str, String str2, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3, g1a<? super l0g, xhv> g1aVar, g1a<? super l0g, xhv> g1aVar2, u1a<? super l0g, ? super Boolean, xhv> u1aVar);

    void i(String str, String str2, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3, g1a<? super l0g, xhv> g1aVar, g1a<? super l0g, xhv> g1aVar2, u1a<? super l0g, ? super Boolean, xhv> u1aVar);
}
