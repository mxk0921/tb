package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class lz5 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HREFRESHWIDGETNODE = 7786040754302208819L;

    static {
        t2o.a(491782401);
    }

    public static /* synthetic */ Object ipc$super(lz5 lz5Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/iconoverlayservice/impl/DXHRefreshWidgetNodeEventHandler");
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
        fve.m("DXHRefreshWidgetNodeEventHandler", "handleEvent");
        if (objArr == null || objArr.length < 2) {
            fve.e("DXHRefreshWidgetNodeEventHandler", "illegal args!");
            return;
        }
        BaseSectionModel<?> e = j18.e(dXRuntimeContext);
        if (e == null || !TextUtils.equals(String.valueOf(objArr[0]), e.getSectionBizCode())) {
            fve.e("DXHRefreshWidgetNodeEventHandler", "not current widget!");
            return;
        }
        DXRootView L = dXRuntimeContext.L();
        String valueOf = String.valueOf(objArr[1]);
        if (L == null || TextUtils.isEmpty(valueOf)) {
            fve.e("DXHRefreshWidgetNodeEventHandler", "rootView not found!");
            return;
        }
        DXWidgetNode queryWidgetNodeByUserId = L.getExpandWidgetNode().queryWidgetNodeByUserId(valueOf);
        if (queryWidgetNodeByUserId == null) {
            fve.e("DXHRefreshWidgetNodeEventHandler", "item not found!");
        } else {
            queryWidgetNodeByUserId.setNeedParse(new DXWidgetRefreshOption.a().d(true).g(true).a());
        }
    }
}
