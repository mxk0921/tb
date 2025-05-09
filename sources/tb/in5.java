package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class in5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_ISSHOWCALCULATEBTN = -1361341155730694591L;

    static {
        t2o.a(479199355);
    }

    public static /* synthetic */ Object ipc$super(in5 in5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/dinamicX/parser/DXDataParserIsShowCalculateBtn");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        kmb kmbVar = (kmb) ((Map) dXRuntimeContext.q()).get(kz1.DINAMIC_CONTEXT_KEY_PRESENTER);
        DMComponent dMComponent = (DMComponent) ((Map) dXRuntimeContext.q()).get(xo7.TAG_DINAMICX_VIEW_COMPONENT);
        try {
            JSONObject jSONObject = (JSONObject) cb4.x(dMComponent, JSONObject.class, "pay");
            if (dMComponent.getFields() == null || !dMComponent.getFields().getBooleanValue("isHideCalculateBtn")) {
                z = false;
            }
            String str = null;
            String string = jSONObject != null ? jSONObject.getString("detailInfoText") : null;
            JSONObject otherParams = kmbVar.d().w().getFeature().getOtherParams();
            if (otherParams != null) {
                str = otherParams.getString("calculatorTips");
            }
            Long l = (Long) cb4.x(dMComponent, Long.class, "quantity");
            if ((!TextUtils.isEmpty(str) || !TextUtils.isEmpty(string)) && l.longValue() > 0 && !z) {
                return Boolean.TRUE;
            }
        } catch (Exception unused) {
        }
        return Boolean.FALSE;
    }
}
