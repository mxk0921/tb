package tb;

import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class qt5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_ULTRON_SUBMIT_DATA = -4626671980340984670L;

    static {
        t2o.a(614465681);
    }

    public static /* synthetic */ Object ipc$super(qt5 qt5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/dinamicX/parser/DXDataParserUltronSubmitData");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        et6 N;
        u55 d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (dXRuntimeContext == null) {
            return null;
        }
        Object q = dXRuntimeContext.q();
        if (!(q instanceof HashMap)) {
            return null;
        }
        Object obj = ((HashMap) q).get("ViewEngine");
        if (!(obj instanceof ViewEngine) || (N = ((ViewEngine) obj).N()) == null || (d = N.d()) == null) {
            return null;
        }
        String t = d.v().t(d);
        if (TextUtils.isEmpty(t)) {
            return null;
        }
        return t;
    }
}
