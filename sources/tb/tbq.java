package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class tbq implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Set<String> f28619a;
    private final acq b;

    static {
        t2o.a(677380221);
    }

    public tbq(acq acqVar, Set set) {
        this.b = acqVar;
        this.f28619a = set;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            for (String str : this.f28619a) {
                this.b.e().g(str);
            }
        } catch (Exception e) {
            Log.e("SplitCompat", "Failed to remove from splitcompat storage split that is already installed", e);
        }
    }
}
