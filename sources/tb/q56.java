package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dxv4common.exception.DXEventException;
import java.util.HashMap;
import tb.qvb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class q56 extends wv5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final long f26513a;
    public final int b;

    static {
        t2o.a(444597972);
    }

    public q56(long j, int i) {
        this.f26513a = j;
        this.b = i;
        this.eventType = (byte) 2;
    }

    public static /* synthetic */ Object ipc$super(q56 q56Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dxv4common/model/node/event/DXNativeEventProperty");
    }

    @Override // tb.nvb
    public boolean executeEvent(DXEvent dXEvent, DXRuntimeContext dXRuntimeContext) {
        mvb w;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2a1a4e3", new Object[]{this, dXEvent, dXRuntimeContext})).booleanValue();
        }
        if (dXRuntimeContext == null || (w = dXRuntimeContext.w(this.f26513a)) == null) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(xwb.EXTRA_PARAMS_EVENT, dXEvent);
        if (this.b >= 0) {
            qvb.a exeExprWithIndex = exeExprWithIndex(dXRuntimeContext.W(), this.b, hashMap);
            if (exeExprWithIndex == null || !exeExprWithIndex.f26952a) {
                throw new DXEventException("执行事件失败: " + this.f26513a);
            }
            if (exeExprWithIndex.c.A()) {
                w.handleEvent(dXEvent, exeExprWithIndex.c.n().toArray(), dXRuntimeContext);
            } else {
                w.handleEvent(dXEvent, null, dXRuntimeContext);
            }
            return true;
        }
        w.handleEvent(dXEvent, null, dXRuntimeContext);
        return true;
    }
}
