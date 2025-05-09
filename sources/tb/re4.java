package tb;

import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class re4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1029701637);
    }

    public final pzf a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pzf) ipChange.ipc$dispatch("36379775", new Object[]{this});
        }
        return new aet().l();
    }

    public final qzf b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qzf) ipChange.ipc$dispatch("dc4f01b1", new Object[]{this});
        }
        return new yvt().e();
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83ffd3f8", new Object[]{this})).booleanValue();
        }
        return ckf.b(Looper.myLooper(), Looper.getMainLooper());
    }
}
