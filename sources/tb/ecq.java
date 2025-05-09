package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.HashSet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ecq implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final acq f18478a;
    private Collection<String> b;

    static {
        t2o.a(677380229);
    }

    public ecq(acq acqVar) {
        this(acqVar, new HashSet());
    }

    @Override // java.lang.Runnable
    public final void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            this.f18478a.e().a();
        } catch (Exception e) {
            Log.e("SplitCompat", "Failed to cleanup splitcompat storage", e);
        }
    }

    public ecq(acq acqVar, Collection<String> collection) {
        this.f18478a = acqVar;
        this.b = collection;
    }
}
