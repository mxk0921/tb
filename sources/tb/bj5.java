package tb;

import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class bj5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_CARTISPOPLAYERFILTERING = -2795590046795583635L;

    static {
        t2o.a(479199348);
    }

    public static /* synthetic */ Object ipc$super(bj5 bj5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/dinamicX/parser/DXDataParserCartIsPoplayerFiltering");
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
        if (kmbVar == null || !kmbVar.d().L()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
