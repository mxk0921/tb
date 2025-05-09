package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uniinfra_kmp.common_utils.ContainerType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface pzf {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1029701655);
        }

        public static /* synthetic */ void a(pzf pzfVar, String str, ContainerType containerType, int i, int i2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("850c7256", new Object[]{pzfVar, str, containerType, new Integer(i), new Integer(i2), obj});
            } else if (obj == null) {
                if ((i2 & 2) != 0) {
                    containerType = ContainerType.KSerial;
                }
                if ((i2 & 4) != 0) {
                    i = 2;
                }
                pzfVar.c(str, containerType, i);
            } else {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createContainer");
            }
        }
    }

    void a(d1a<xhv> d1aVar);

    void b(double d, d1a<xhv> d1aVar);

    void c(String str, ContainerType containerType, int i);

    void d(d1a<xhv> d1aVar);

    void shutdown();
}
