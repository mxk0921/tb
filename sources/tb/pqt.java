package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.VThread;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class pqt implements yct {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final j1r f26244a;
    public final yiw b;

    static {
        t2o.a(970981410);
        t2o.a(970981409);
    }

    public pqt(j1r j1rVar, yiw yiwVar) {
        this.f26244a = j1rVar;
        this.b = yiwVar;
    }

    @Override // tb.yct
    public void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
            return;
        }
        boolean c = this.f26244a.c("useThreadLocal", this.b.a());
        VThread.sSupportThreadLocal = c;
        ghh.a("ThreadLocalTask", Boolean.valueOf(c));
    }
}
