package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ye1 implements yct {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final j1r f32010a;

    static {
        t2o.a(970981395);
        t2o.a(970981409);
    }

    public ye1(j1r j1rVar, yiw yiwVar) {
        this.f32010a = j1rVar;
    }

    @Override // tb.yct
    public void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
        } else if (this.f32010a.c("useVtAsyncTaskThread", false)) {
            we1.a();
            ghh.b("AsyncTaskTask", "succ");
        } else {
            ghh.a("AsyncTaskTask", "failed");
        }
    }
}
