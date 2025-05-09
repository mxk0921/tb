package tb;

import android.os.RemoteException;
import com.alibaba.analytics.AnalyticsMgr;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class mu0 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            AnalyticsMgr.b.dispatchLocalHits();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
