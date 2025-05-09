package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class jhy extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_WIDGETNOTFOUND = 7609789237922348223L;

    static {
        t2o.a(444596800);
    }

    public static /* synthetic */ Object ipc$super(jhy jhyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/ExepressionEvaluation/DXDataParserWidgetNotFound");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0) {
            return Boolean.TRUE;
        }
        try {
            if (dXRuntimeContext.X().get(Long.parseLong((String) objArr[0])) != null) {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (Exception unused) {
            return Boolean.TRUE;
        }
    }
}
