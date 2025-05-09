package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface phc extends zrb<phc> {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1002438800);
        }

        public static /* synthetic */ g0g a(phc phcVar, String str, String str2, g1a g1aVar, g1a g1aVar2, d1a d1aVar, g1a g1aVar3, h0g h0gVar, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g0g) ipChange.ipc$dispatch("cced3199", new Object[]{phcVar, str, str2, g1aVar, g1aVar2, d1aVar, g1aVar3, h0gVar, new Integer(i), obj});
            }
            if (obj == null) {
                return phcVar.w(str, str2, (4 & i) != 0 ? null : g1aVar, (8 & i) != 0 ? null : g1aVar2, (i & 16) != 0 ? null : d1aVar, (i & 32) != 0 ? null : g1aVar3, (i & 64) != 0 ? null : h0gVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: download");
        }
    }

    g0g w(String str, String str2, g1a<? super f0g, xhv> g1aVar, g1a<? super i0g, xhv> g1aVar2, d1a<xhv> d1aVar, g1a<? super n0g, xhv> g1aVar3, h0g h0gVar);
}
