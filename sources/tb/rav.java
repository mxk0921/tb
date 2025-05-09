package tb;

import android.os.MessageQueue;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class rav implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MessageQueue f27239a;
    public final /* synthetic */ MessageQueue.IdleHandler b;

    public rav(MessageQueue messageQueue, MessageQueue.IdleHandler idleHandler) {
        this.f27239a = messageQueue;
        this.b = idleHandler;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            this.f27239a.addIdleHandler(this.b);
        } catch (Exception e) {
            iav.b("Ultron#delayRunOnIdleOfHandler", e.getMessage());
        }
    }
}
