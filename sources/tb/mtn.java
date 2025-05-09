package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.adapter.handler.HandlerThreadFactory32;
import com.taobao.android.virtual_thread.adapter.task.TBHandlerThreadFactory;
import com.taobao.android.virtual_thread.stub.config.StubConfig;
import java.util.HashMap;
import tb.wsa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class mtn implements yct {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final j1r f24298a;
    public final yiw b;

    static {
        t2o.a(970981399);
        t2o.a(970981409);
    }

    public mtn(j1r j1rVar, HashMap hashMap) {
        this.f24298a = j1rVar;
        this.b = a(j1rVar, hashMap == null ? new HashMap() : hashMap);
    }

    public static yiw a(j1r j1rVar, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yiw) ipChange.ipc$dispatch("1369eff0", new Object[]{j1rVar, hashMap});
        }
        if (hashMap == null) {
            hashMap = new HashMap();
        }
        j1r j1rVar2 = new j1r(hashMap);
        if (j1rVar2.c("isDebuggable", false)) {
            return new pja(j1rVar);
        }
        String b = j1rVar2.b("appVersion", "1.0.0");
        ghh.a("TBExecutorTask", b);
        if (b.split("\\.").length > 3) {
            return new pja(j1rVar);
        }
        return new yiw(j1rVar);
    }

    @Override // tb.yct
    public void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
        } else if (this.f24298a.c("mergeTbExecutor", this.b.a())) {
            wsa.a aVar = wsa.f30890a;
            if (aVar instanceof TBHandlerThreadFactory) {
                ((TBHandlerThreadFactory) aVar).setSwitcher(this.f24298a);
                return;
            }
            TBHandlerThreadFactory tBHandlerThreadFactory = new TBHandlerThreadFactory(this.f24298a, this.b);
            ghh.b("TBExecutorTask", "succ");
            if (this.f24298a.c("supportRedexVt32", this.b.a())) {
                HandlerThreadFactory32.setFactory(tBHandlerThreadFactory);
                StubConfig.setSupportRedexVt32(true);
            }
            wsa.f30890a = tBHandlerThreadFactory;
        }
    }
}
