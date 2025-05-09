package tb;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class mt5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_ULTRONLOCALDATA = 1578205113308587288L;

    static {
        t2o.a(614465680);
    }

    public static /* synthetic */ Object ipc$super(mt5 mt5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/dinamicX/parser/DXDataParserUltronLocalData");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Context x;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (!(objArr == null || objArr.length == 0 || (x = DinamicXEngine.x()) == null)) {
            Object obj = objArr[0];
            if (obj instanceof String) {
                if (upx.APDIDTOKEN.equals(obj)) {
                    try {
                        return APSecuritySdk.getInstance(x).getTokenResult().apdidToken;
                    } catch (Exception unused) {
                        return null;
                    }
                } else if ("websiteLanguage".equals(objArr[0])) {
                    try {
                        return x.getResources().getConfiguration().locale.toString();
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        return null;
    }
}
