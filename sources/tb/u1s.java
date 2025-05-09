package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class u1s extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARSER_TAG = "isWhiteNav";

    static {
        t2o.a(479199356);
    }

    public static /* synthetic */ Object ipc$super(u1s u1sVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/dinamicX/parser/TDSkinParser");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (dXRuntimeContext != null) {
            try {
                if ((dXRuntimeContext.q() instanceof Map) && (((Map) dXRuntimeContext.q()).get(kz1.DINAMIC_CONTEXT_KEY_PRESENTER) instanceof kmb)) {
                    return Boolean.valueOf(!cpt.l());
                }
            } catch (Throwable unused) {
            }
        }
        if (eiv.a().d()) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
