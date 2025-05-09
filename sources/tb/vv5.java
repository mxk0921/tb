package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.f;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class vv5 extends fw5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596699);
    }

    public static /* synthetic */ Object ipc$super(vv5 vv5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/DXEventNode");
    }

    @Override // tb.fw5
    public Object b(DXEvent dXEvent, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1f85463f", new Object[]{this, dXEvent, dXRuntimeContext});
        }
        if (dXRuntimeContext != null) {
            try {
            } catch (Exception e) {
                xv5.b(e);
                f fVar = new f(dXRuntimeContext.c());
                f.a aVar = new f.a("ASTNode", "ASTNode_EventHandler", 100004);
                fVar.b = dXRuntimeContext.p();
                if (dXEvent != null) {
                    aVar.e = "eventId: " + dXEvent.getEventId() + " isPrepareBind: " + dXEvent.isPrepareBind() + "  stack： " + xv5.a(e);
                }
                fVar.c.add(aVar);
                ic5.p(fVar);
            }
            if (dXRuntimeContext.W() != null) {
                mvb w = dXRuntimeContext.w(this.b);
                if (w == null) {
                    if (dXEvent != null && !dXEvent.isPrepareBind()) {
                        f fVar2 = new f(dXRuntimeContext.c());
                        if (dXRuntimeContext.p() != null) {
                            fVar2.b = dXRuntimeContext.p();
                        }
                        f.a aVar2 = new f.a("ASTNode", "ASTNode_EventHandler", 100003);
                        aVar2.e = "找不到用户注册的eventHandle  hashcode 为: " + this.b;
                        fVar2.c.add(aVar2);
                        ic5.p(fVar2);
                    }
                    return null;
                }
                List<fw5> list = this.f19569a;
                int size = list != null ? ((ArrayList) list).size() : 0;
                Object[] objArr = new Object[size];
                for (int i = 0; i < size; i++) {
                    objArr[i] = ((fw5) ((ArrayList) this.f19569a).get(i)).b(dXEvent, dXRuntimeContext);
                }
                if (dXEvent == null || !dXEvent.isPrepareBind()) {
                    w.handleEvent(dXEvent, objArr, dXRuntimeContext.W().getDXRuntimeContext());
                } else {
                    w.prepareBindEventWithArgs(objArr, dXRuntimeContext.W().getDXRuntimeContext());
                }
                if (dXRuntimeContext.a0()) {
                    return new Object();
                }
            }
        }
        return null;
    }
}
