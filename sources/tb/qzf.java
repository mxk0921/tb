package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface qzf {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1029701657);
        }

        public static /* synthetic */ void a(qzf qzfVar, d1a d1aVar, boolean z, long j, int i, pzf pzfVar, int i2, Object obj) {
            pzf pzfVar2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2f3bf19", new Object[]{qzfVar, d1aVar, new Boolean(z), new Long(j), new Integer(i), pzfVar, new Integer(i2), obj});
                return;
            }
            boolean z2 = z;
            long j2 = j;
            int i3 = i;
            if (obj == null) {
                if ((2 & i2) != 0) {
                    z2 = true;
                }
                if ((4 & i2) != 0) {
                    j2 = 1000;
                }
                if ((i2 & 8) != 0) {
                    i3 = -1;
                }
                if ((i2 & 16) != 0) {
                    pzfVar2 = null;
                } else {
                    pzfVar2 = pzfVar;
                }
                qzfVar.a(d1aVar, z2, j2, i3, pzfVar2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startTimerTask");
        }
    }

    void a(d1a<xhv> d1aVar, boolean z, long j, int i, pzf pzfVar);

    void b();

    void destroy();

    void resume();
}
