package tb;

import android.animation.ValueAnimator;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class vz0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(503316634);
    }

    public static ValueAnimator a(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueAnimator) ipChange.ipc$dispatch("f4251cb3", new Object[]{nVar});
        }
        if (nVar == null || nVar.d0() == null) {
            return ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        return nVar.d0().d();
    }
}
