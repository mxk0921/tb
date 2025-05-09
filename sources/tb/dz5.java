package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.HMultiSelectView;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class dz5 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HMODIFYCLICKPARAM = 2742664046862533560L;

    static {
        t2o.a(486539354);
    }

    public static /* synthetic */ Object ipc$super(dz5 dz5Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/eventhandler/DXHModifyClickParamEventHandler");
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
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr.length != 0) {
            BaseSectionModel<?> e = j18.e(dXRuntimeContext);
            Object obj = objArr[0];
            if ((obj instanceof JSONObject) && e != null && (jSONObject = ((JSONObject) obj).getJSONObject("clickParam")) != null && (jSONObject2 = jSONObject.getJSONObject("args")) != null) {
                String b = j18.b(e, "star");
                if (!TextUtils.isEmpty(b)) {
                    jSONObject2.put("star", (Object) b);
                }
                String b2 = j18.b(e, HMultiSelectView.KEY_MULTI_SELECT_TEXT);
                if (!TextUtils.isEmpty(b2) && (split = b2.split(",")) != null && split.length != 0) {
                    jSONObject2.put("reason", (Object) Arrays.asList(split).toString());
                }
            }
        }
    }
}
