package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.pos;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class qos implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f26861a;
    public final /* synthetic */ pos.b b;

    public qos(Runnable runnable, pos.b bVar) {
        this.f26861a = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        Runnable runnable = this.f26861a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
