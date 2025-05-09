package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class d06 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HTAP = 34696035233L;

    /* renamed from: a  reason: collision with root package name */
    public v12 f17485a;

    static {
        t2o.a(486539361);
    }

    public static /* synthetic */ Object ipc$super(d06 d06Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/eventhandler/DXHTapEvent");
    }

    public final v12 a(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v12) ipChange.ipc$dispatch("2288fcf8", new Object[]{this, cfcVar});
        }
        if (this.f17485a == null) {
            this.f17485a = new qqa(cfcVar);
        }
        return this.f17485a;
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        cfc c = j18.c(dXRuntimeContext);
        if (c == null) {
            fve.e("DXHTapEvent", "infoFlowContext == null");
            return;
        }
        BaseSectionModel<?> e = j18.e(dXRuntimeContext);
        if (e == null) {
            fve.e("DXHTapEvent", "sectionModel == null");
            return;
        }
        Object obj = objArr[0];
        BaseSubItemModel createBaseSubItemModel = e.createBaseSubItemModel(obj instanceof JSONObject ? (JSONObject) obj : null);
        if (createBaseSubItemModel == null) {
            fve.e("DXHTapEvent", "subItemModel == null");
            return;
        }
        vve.e(e, createBaseSubItemModel);
        a(c).d(e, createBaseSubItemModel, dXRuntimeContext.L());
    }
}
