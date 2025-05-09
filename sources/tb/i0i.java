package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class i0i implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h0i f21013a;

    public i0i(h0i h0iVar) {
        this.f21013a = h0iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        h0i.h(this.f21013a).c();
        urr.b("MainLooperTaskManager", "Stop Main Looper Monitor", new Object[0]);
        if (h0i.b(this.f21013a).isAnrTraceDumpEnable && h0i.i(this.f21013a) != null) {
            h0i.i(this.f21013a).d();
        }
    }
}
