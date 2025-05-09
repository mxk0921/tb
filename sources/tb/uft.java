package tb;

import android.os.Handler;
import android.os.HandlerThread;
import com.alibaba.android.split.core.internal.TriggerStartFailureTask;
import com.alibaba.android.split.core.internal.TriggerStartSuccessTask;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class uft {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Handler f29348a;

    public static bdt a(Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bdt) ipChange.ipc$dispatch("1b8667fd", new Object[]{exc});
        }
        qft qftVar = new qft();
        f29348a.post(new TriggerStartFailureTask(qftVar, exc));
        return qftVar.a();
    }

    public static <TResult> bdt<TResult> b(TResult tresult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bdt) ipChange.ipc$dispatch("30d6b055", new Object[]{tresult});
        }
        qft qftVar = new qft();
        f29348a.post(new TriggerStartSuccessTask(qftVar, tresult));
        return qftVar.a();
    }

    static {
        t2o.a(677380283);
        f29348a = null;
        HandlerThread a2 = wsa.a("trigger-startinstall");
        a2.start();
        f29348a = new Handler(a2.getLooper());
    }
}
