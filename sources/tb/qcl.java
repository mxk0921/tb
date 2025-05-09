package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class qcl extends z46 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean d = true;

    static {
        t2o.a(614465604);
    }

    public static /* synthetic */ Object ipc$super(qcl qclVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -515530409) {
            super.a((String) objArr[0], (rv5) objArr[1], (iv5) objArr[2]);
            return null;
        } else if (hashCode == -103056537) {
            super.handleEvent((DXEvent) objArr[0], (Object[]) objArr[1], (DXRuntimeContext) objArr[2]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/ultron/vfw/event/OrderDXMultiRunModeEventChainHandler");
        }
    }

    @Override // tb.mv5
    public void a(String str, rv5 rv5Var, iv5 iv5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e145a157", new Object[]{this, str, rv5Var, iv5Var});
            return;
        }
        if (iv5Var != null && !this.d) {
            jbv.c(str, iv5Var.l());
        }
        super.a(str, rv5Var, iv5Var);
    }

    @Override // tb.z46, tb.mv5, tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (!this.d || !uel.l("enableRemoveCacheRenderEvent", true)) {
            super.handleEvent(dXEvent, objArr, dXRuntimeContext);
        } else if (objArr != null && objArr.length > 0) {
            Object obj = objArr[0];
            if ((obj instanceof String) && "imageLoadComplete".equals(obj)) {
                super.handleEvent(dXEvent, objArr, dXRuntimeContext);
            }
        }
    }

    public void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9ddf4d4", new Object[]{this, new Boolean(z)});
        } else if (uel.l("delayEventChainOnstage", true)) {
            this.d = z;
        } else {
            this.d = false;
        }
    }
}
