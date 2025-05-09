package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class om5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HVIEWPROP = -8153571820491057491L;

    static {
        t2o.a(486539383);
    }

    public static /* synthetic */ Object ipc$super(om5 om5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/parser/DXDataParserHViewProp");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        DXWidgetNode queryWTByUserId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        String str = null;
        if (objArr != null && objArr.length >= 2) {
            String valueOf = String.valueOf(objArr[0]);
            String valueOf2 = String.valueOf(objArr[1]);
            if (!TextUtils.isEmpty(valueOf) && !TextUtils.isEmpty(valueOf2)) {
                if (dXRuntimeContext.W().queryWTByUserId(valueOf) == null) {
                    return null;
                }
                float f = dXRuntimeContext.h().getResources().getDisplayMetrics().density;
                if (valueOf2.equals("height")) {
                    str = (queryWTByUserId.getMeasuredHeight() / f) + "np";
                } else if (valueOf2.equals("width")) {
                    str = (queryWTByUserId.getMeasuredWidth() / f) + "np";
                }
                fve.e("home.HViewProp", "viewId=" + valueOf + ", attr=" + valueOf2 + ", result=" + str);
            }
        }
        return str;
    }
}
