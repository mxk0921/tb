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
public class p56 extends wv5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f25884a;
    public final int b;

    static {
        t2o.a(444597971);
    }

    public p56(int i, int i2) {
        this.f25884a = i;
        this.b = i2;
        this.eventType = (byte) 3;
    }

    public static /* synthetic */ Object ipc$super(p56 p56Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dxv4common/model/node/event/DXNativeEventExprProperty");
    }

    @Override // tb.nvb
    public boolean executeEvent(DXEvent dXEvent, DXRuntimeContext dXRuntimeContext) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2a1a4e3", new Object[]{this, dXEvent, dXRuntimeContext})).booleanValue();
        }
        if (!(dXRuntimeContext == null || dXRuntimeContext.W() == null)) {
            HashMap hashMap = new HashMap();
            hashMap.put(xwb.EXTRA_PARAMS_EVENT, dXEvent);
            qvb.a exeExprWithIndex = exeExprWithIndex(dXRuntimeContext.W(), this.f25884a, hashMap);
            if (exeExprWithIndex != null && exeExprWithIndex.f26952a) {
                if (exeExprWithIndex.c.M()) {
                    j = k06.a(exeExprWithIndex.c.j());
                } else {
                    j = exeExprWithIndex.c.u();
                }
                mvb w = dXRuntimeContext.w(j);
                if (w == null) {
                    return false;
                }
                if (this.b >= 0) {
                    qvb.a exeExprWithIndex2 = exeExprWithIndex(dXRuntimeContext.W(), this.b, hashMap);
                    if (exeExprWithIndex2 == null || !exeExprWithIndex2.f26952a) {
                        throw new DXEventException("执行事件失败: " + j);
                    }
                    if (exeExprWithIndex2.c.A()) {
                        w.handleEvent(dXEvent, exeExprWithIndex2.c.n().toArray(), dXRuntimeContext);
                    } else {
                        w.handleEvent(dXEvent, null, dXRuntimeContext);
                    }
                    return true;
                }
                w.handleEvent(dXEvent, null, dXRuntimeContext);
                return true;
            }
        }
        return false;
    }
}
