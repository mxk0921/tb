package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.ftm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class piz implements ftm.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321819);
    }

    @Override // tb.ftm.e
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e09d434d", new Object[]{this, str})).booleanValue();
        }
        byj.d0();
        if (!byj.s0() || !byj.o0()) {
            return true;
        }
        return false;
    }
}
