package tb;

import android.os.RemoteException;
import com.alibaba.analytics.AnalyticsMgr;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ou0 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f25653a;

    public ou0(long j) {
        this.f25653a = j;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            nhh.f("AnalyticsMgr", "startMainProcess");
            AnalyticsMgr.b.startMainProcess(this.f25653a);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
