package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class g18 implements mvb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final mvb f19676a;

    static {
        t2o.a(486539374);
        t2o.a(444596616);
    }

    public g18(mvb mvbVar) {
        this.f19676a = mvbVar;
    }

    @Override // tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f19676a.handleEvent(dXEvent, objArr, dXRuntimeContext);
        if (eue.b()) {
            fve.k("Dx3EventHandlerWrapper", "Dx3 handleEvent ： " + this.f19676a.getClass().getSimpleName() + ", 耗时 ： " + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
        }
    }

    @Override // tb.mvb
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            this.f19676a.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }
}
