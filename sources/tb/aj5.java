package tb;

import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class aj5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_CARTISNEWCART2021 = 99778369222156528L;

    static {
        t2o.a(478150720);
    }

    public static /* synthetic */ Object ipc$super(aj5 aj5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/dx/dataParse/DXDataParserCartIsNewCart2021");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (dXRuntimeContext == null || dXRuntimeContext.q() == null || !(dXRuntimeContext.q() instanceof Map)) {
            return null;
        }
        Object obj = ((Map) dXRuntimeContext.q()).get("ViewEngine");
        if (!(obj instanceof ViewEngine)) {
            return null;
        }
        kmb kmbVar = (kmb) ((ViewEngine) obj).a0(kmb.class);
        if (kmbVar == null || !sca.B(kmbVar.d())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
