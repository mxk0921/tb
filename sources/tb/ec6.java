package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.infoflow.protocol.subservice.biz.IContainerFlagService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ec6 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_SETCONTAINERLEVELFLAG = 1408474377627218806L;

    static {
        t2o.a(491782322);
    }

    public static /* synthetic */ Object ipc$super(ec6 ec6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/containerflagservice/dx/DXSetContainerLevelFlagEventHandler");
    }

    public final String a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dd0e6360", new Object[]{this, obj});
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr.length < 3) {
            fve.e("DXSetContainerLevelFlagEventHandler", "参数不合法");
        } else {
            String a2 = a(objArr[0]);
            String a3 = a(objArr[1]);
            boolean parseBoolean = Boolean.parseBoolean(a(objArr[2]));
            cfc c = j18.c(dXRuntimeContext);
            if (c == null) {
                fve.e("DXSetContainerLevelFlagEventHandler", "infoFlowContext 获取失败");
                return;
            }
            IContainerFlagService iContainerFlagService = (IContainerFlagService) c.a(IContainerFlagService.class);
            if (iContainerFlagService == null) {
                fve.e("DXSetContainerLevelFlagEventHandler", "服务查找失败");
            } else {
                iContainerFlagService.recordFlag(a2, a3, parseBoolean);
            }
        }
    }
}
