package android.taobao.windvane.extra.uc.pool;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class CancelableTask implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mIsCanceled;

    static {
        t2o.a(989856162);
    }

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        } else {
            this.mIsCanceled = true;
        }
    }

    public abstract void doRun();

    public abstract void onCancel();

    @Override // java.lang.Runnable
    public final void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (this.mIsCanceled) {
            onCancel();
        } else {
            doRun();
        }
    }
}
