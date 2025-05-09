package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.rolling.RollingNumberView;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vz5 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HSTARTROLLINGNUMBERANIMATION = -5754577398270507918L;

    static {
        t2o.a(486539360);
    }

    public static /* synthetic */ void c(View view, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9bb3d43", new Object[]{view, obj});
            return;
        }
        ((RollingNumberView) view).startAnimation((String) obj);
        fve.e("DXHStartRollingNumberAnimationEventHandler", "开始数字滚动动画");
    }

    public static /* synthetic */ Object ipc$super(vz5 vz5Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/eventhandler/DXHStartRollingNumberAnimationEventHandler");
    }

    public final boolean b(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c10147ca", new Object[]{this, dXRuntimeContext})).booleanValue();
        }
        cfc c = j18.c(dXRuntimeContext);
        if (c == null) {
            fve.e("DXHStartRollingNumberAnimationEventHandler", "infoFlowContext is null");
            return false;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) c.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            fve.e("DXHStartRollingNumberAnimationEventHandler", "containerDataService is null");
            return false;
        }
        IContainerDataModel containerData = iContainerDataService.getContainerData();
        if (containerData == null) {
            fve.e("DXHStartRollingNumberAnimationEventHandler", "containerDataModel is null");
            return false;
        }
        IContainerInnerDataModel base = containerData.getBase();
        if (base != null) {
            return base.isRemote();
        }
        fve.e("DXHStartRollingNumberAnimationEventHandler", "containerInnerDataModel is null");
        return false;
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

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        final View D = dXRuntimeContext.D();
        final Object obj = objArr[0];
        if (!(obj instanceof String)) {
            fve.e("DXHStartRollingNumberAnimationEventHandler", "当前传入的不是string");
        } else if (!b(dXRuntimeContext)) {
            fve.e("DXHStartRollingNumberAnimationEventHandler", "不是网络数据");
        } else if (D instanceof RollingNumberView) {
            get.a().f(new Runnable() { // from class: tb.uz5
                @Override // java.lang.Runnable
                public final void run() {
                    vz5.c(D, obj);
                }
            }, 0L);
        }
    }
}
