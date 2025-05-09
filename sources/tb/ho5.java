package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ho5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_MM_ORANGE = 4698627066052461374L;

    static {
        t2o.a(573571183);
    }

    public static /* synthetic */ Object ipc$super(ho5 ho5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mmad/render/dx/dataparser/DXDataParserMmOrange");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null) {
            try {
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (objArr.length >= 2) {
                z = ino.a(String.valueOf(objArr[0]), String.valueOf(objArr[1])).equals("true");
                return Boolean.valueOf(z);
            }
        }
        return Boolean.FALSE;
    }
}
