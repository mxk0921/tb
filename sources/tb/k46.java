package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractDXView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class k46 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_MMTAP = 18615516725124L;

    /* renamed from: a  reason: collision with root package name */
    public final uwb f22393a;

    static {
        t2o.a(573571105);
    }

    public k46(uwb uwbVar) {
        this.f22393a = uwbVar;
    }

    public static /* synthetic */ Object ipc$super(k46 k46Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mmad/biz/interact/controller/interact/handler/DXMmTapEventHandler");
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        tm1.a("DXMmTapEventHandler", "handleEvent :");
        uwb uwbVar = this.f22393a;
        if (uwbVar != null) {
            ((BootImageInteractDXView.a) uwbVar).a(dXEvent, objArr, dXRuntimeContext);
        }
    }

    @Override // tb.ob5, tb.mvb
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }
}
