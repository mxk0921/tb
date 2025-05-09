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
public class f96 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_RTAP = 37581716043L;
    public static final String TAG = "rTap";

    /* renamed from: a  reason: collision with root package name */
    public v12 f19113a;

    static {
        t2o.a(486539370);
    }

    public static /* synthetic */ Object ipc$super(f96 f96Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/eventhandler/DXRTapEvent");
    }

    public final v12 a(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v12) ipChange.ipc$dispatch("ab852b3", new Object[]{this, cfcVar});
        }
        if (this.f19113a == null) {
            this.f19113a = new wbn(cfcVar);
        }
        return this.f19113a;
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        cfc c = j18.c(dXRuntimeContext);
        if (c == null) {
            fve.e("rTap", "infoFlowContext == null");
            return;
        }
        BaseSectionModel<?> e = j18.e(dXRuntimeContext);
        if (e == null) {
            fve.e("rTap", "sectionModel == null");
            return;
        }
        Object obj2 = objArr[0];
        BaseSubItemModel createBaseSubItemModel = e.createBaseSubItemModel(obj2 instanceof JSONObject ? (JSONObject) obj2 : null);
        if (objArr.length > 1 && (obj = objArr[1]) != null && (obj instanceof JSONObject)) {
            BaseSectionModel<?> createBaseSectionModel = e.createBaseSectionModel((JSONObject) obj);
            if (createBaseSectionModel.getSectionBizCode() == null) {
                createBaseSectionModel.put("sectionBizCode", (Object) e.getSectionBizCode());
            }
            e = createBaseSectionModel;
        }
        if (createBaseSubItemModel == null) {
            fve.e("rTap", "subItemModel == null");
            return;
        }
        vve.e(e, createBaseSubItemModel);
        a(c).d(e, createBaseSubItemModel, dXRuntimeContext.L());
    }
}
