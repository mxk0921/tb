package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.adam.common.Util;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class lt5 extends rw5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_ULTRONGLOBALDATA = -7841073309044055681L;

    static {
        t2o.a(350224431);
    }

    public static /* synthetic */ Object ipc$super(lt5 lt5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/adam/ultronExt/parser/DXDataParserUltronGlobalData");
    }

    @Override // tb.rw5
    public Object a(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8dd225a", new Object[]{this, dXRuntimeContext});
        }
        u55 e = Util.e(dXRuntimeContext);
        if (e != null) {
            return e.i();
        }
        return null;
    }
}
