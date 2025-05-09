package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class nr5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TAOBAO_THEME_GET_CURRENT = -8116936510285409279L;

    static {
        t2o.a(464519273);
    }

    public static /* synthetic */ Object ipc$super(nr5 nr5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbtheme/kit/dx/DXDataParserTaobaoGetTheme");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        String str2 = null;
        if (objArr == null || objArr.length == 0 || objArr.length <= 1) {
            return null;
        }
        Object obj = objArr[0];
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        Object obj2 = objArr[1];
        if (obj2 instanceof String) {
            str2 = (String) obj2;
        }
        return cpt.c().f(str, str2);
    }
}
