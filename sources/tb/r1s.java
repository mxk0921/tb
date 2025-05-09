package tb;

import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class r1s extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARSER_TAG = "cartManageState";

    static {
        t2o.a(478150727);
    }

    public static /* synthetic */ Object ipc$super(r1s r1sVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/dx/dataParse/TDCartManageStateParser");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (dXRuntimeContext == null || dXRuntimeContext.q() == null || !(dXRuntimeContext.q() instanceof Map) || (obj = ((Map) dXRuntimeContext.q()).get("ViewEngine")) == null || !(obj instanceof ViewEngine)) {
            return Boolean.FALSE;
        }
        zxb zxbVar = (zxb) ((ViewEngine) obj).a0(zxb.class);
        if (zxbVar == null || !zxbVar.K()) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
}
