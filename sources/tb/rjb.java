package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.navigation.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface rjb extends a.g, vpj, hvd, ujb {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static abstract class a implements rjb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(916455434);
            t2o.a(916455433);
        }

        @Override // tb.vpj
        public void M() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2918e2c9", new Object[]{this});
            }
        }

        @Override // tb.hvd
        public void onTabChanged(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91f35fc8", new Object[]{this, new Integer(i), str});
            }
        }

        @Override // com.taobao.tao.navigation.a.g
        public void reset() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("788e6256", new Object[]{this});
            }
        }
    }
}
