package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.Map;
import tb.oc5;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class ij6 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final long DX_EVENT_CTRACKCLICK = 465348923619458121L;
    public static final String TAG = "DXTrackClickEventHandler";

    /* renamed from: a  reason: collision with root package name */
    public final qpu f21341a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        static {
            t2o.a(918552741);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(918552740);
    }

    public ij6(qpu qpuVar) {
        ckf.g(qpuVar, "context");
        this.f21341a = qpuVar;
    }

    public static /* synthetic */ Object ipc$super(ij6 ij6Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/service/dx/DXTrackClickEventHandler");
    }

    @Override // tb.ob5, tb.mvb
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
            return;
        }
        ckf.g(objArr, "args");
        ckf.g(dXRuntimeContext, "runtimeContext");
        super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Boolean bool;
        Integer num;
        Map<String, Object> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        ckf.g(dXEvent, "event");
        ckf.g(objArr, "args");
        ckf.g(dXRuntimeContext, "runtimeContext");
        Object obj = !(objArr.length == 0) ? objArr[0] : null;
        Object obj2 = objArr.length >= 2 ? objArr[1] : null;
        Object obj3 = objArr.length >= 3 ? objArr[2] : null;
        Object obj4 = objArr.length >= 4 ? objArr[3] : null;
        oc5.a aVar = oc5.Companion;
        String d = aVar.d(obj);
        if (d == null) {
            tpu.a.b(tpu.Companion, lj6.TAG, "DressUtMsg:Click:Error:点击埋点失败。无有eventName。", null, 4, null);
            return;
        }
        String d2 = obj2 != null ? aVar.d(obj2) : null;
        Map<String, Object> c2 = obj3 != null ? aVar.c(obj3) : null;
        if (obj4 == null || (c = aVar.c(obj4)) == null) {
            num = null;
            bool = null;
        } else {
            xz7 xz7Var = xz7.INSTANCE;
            Integer b = xz7Var.b(c.get("eventId"));
            bool = xz7Var.a(c.get("notAppendPageName"));
            num = b;
        }
        tpu.a.b(tpu.Companion, TAG, "DressUtMsg:Click:Start:eventName:" + d + ":spmCd:" + d2 + ":utParams:" + c2 + ":eventId:" + num + ":notAppendPageName:" + bool, null, 4, null);
        ((d2e) this.f21341a.getService(d2e.class)).X(d, c2, num, bool, d2);
    }
}
