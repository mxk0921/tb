package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.stub.config.StubConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class qiw implements yct {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final j1r f26775a;
    public final yiw b;

    static {
        t2o.a(970981412);
        t2o.a(970981409);
    }

    public qiw(j1r j1rVar, yiw yiwVar) {
        this.f26775a = j1rVar;
        this.b = yiwVar;
    }

    @Override // tb.yct
    public void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
            return;
        }
        StubConfig.setWorkThreadPoolConfig(gqq.a(this.f26775a.b("work_thread_pool", this.b.b())));
        StubConfig.setStubToken(this.f26775a.a("virtual_thread_exp", this.b.a() ? 1 : 0));
        ghh.a("VirtualThreadConfigTask", "virtual_thread_exp", Integer.valueOf(StubConfig.stubToken));
    }
}
