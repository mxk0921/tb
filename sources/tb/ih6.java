package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ih6 extends l10 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TBLIVE_GOODS_TOP_CARD = 4228114602560132033L;

    static {
        t2o.a(295698958);
    }

    public static /* synthetic */ Object ipc$super(ih6 ih6Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/dx/DXTblive_goods_top_cardEventHandler");
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

    @Override // tb.l10
    public void c(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext, xea xeaVar) {
        JSONObject jSONObject;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86174a8b", new Object[]{this, dXEvent, objArr, dXRuntimeContext, xeaVar});
        } else if (objArr != null && objArr.length > 0 && (objArr[0] instanceof JSONObject) && ijr.e() && (jSONObject = (JSONObject) objArr[0]) != null && jSONObject.containsKey("url")) {
            HashMap<String, String> hashMap = new HashMap<>();
            if (jSONObject.containsKey("type")) {
                str = "top_card_" + jSONObject.getString("type");
            } else {
                str = "";
            }
            hashMap.put("glOpenUrlRefer", str);
            if (kkr.i().o() != null) {
                kkr.i().o().c("SpecialSelectExplain", hashMap);
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("x", "0");
            hashMap2.put("y", String.valueOf(0));
            hashMap2.put("width", String.valueOf(-1));
            hashMap2.put("height", String.valueOf(-1));
            hashMap2.put("modal", "true");
            kkr.i().d().d(xeaVar == null ? null : xeaVar.q(), dXRuntimeContext.h(), hashMap2, jSONObject.getString("url"), jSONObject.getString("type"));
        }
    }
}
