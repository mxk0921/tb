package tb;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class eg5 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_CHANGEVISIBLEITEM = -279868442483546412L;

    static {
        t2o.a(486539345);
    }

    public static /* synthetic */ Object ipc$super(eg5 eg5Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/eventhandler/DXChangeVisibleItemEventHandler");
    }

    public final void a(DXRootView dXRootView, int i, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d62aebf", new Object[]{this, dXRootView, new Integer(i), new Boolean(z), str});
        } else if (dXRootView != null && i >= 0) {
            if (!z) {
                ViewGroup.LayoutParams layoutParams = dXRootView.getLayoutParams();
                layoutParams.height = i;
                dXRootView.setLayoutParams(layoutParams);
                return;
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(dXRootView.getHeight(), i);
            ofInt.addUpdateListener(new cg5(this, dXRootView, i, str));
            ofInt.setDuration(150L);
            ofInt.start();
        }
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        DXWidgetNode expandWidgetNode;
        DXWidgetNode queryWidgetNodeByUserId;
        int layoutHeight;
        DXRootView L;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr.length >= 5) {
            String str = (String) objArr[0];
            String str2 = (String) objArr[2];
            String str3 = (String) objArr[3];
            String str4 = (String) objArr[4];
            if (dXRuntimeContext != null && dXRuntimeContext.L() != null && (expandWidgetNode = dXRuntimeContext.L().getExpandWidgetNode()) != null && (queryWidgetNodeByUserId = expandWidgetNode.queryWidgetNodeByUserId(str2)) != null && (layoutHeight = queryWidgetNodeByUserId.getLayoutHeight()) > 0) {
                cfc c = j18.c(dXRuntimeContext);
                if (c == null) {
                    fve.e("DXChangeVisibleItemEventHandler", "infoFlowContext is null");
                } else if (((IMainFeedsViewService) c.a(IMainFeedsViewService.class)) != null && (L = dXRuntimeContext.L()) != null) {
                    a(L, layoutHeight, TextUtils.equals(str3, "0"), str4);
                }
            }
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
