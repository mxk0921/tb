package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class al5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_GETIMAGEBIZINFO = -7208833668935909149L;

    static {
        t2o.a(614465664);
    }

    public static /* synthetic */ Object ipc$super(al5 al5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/dinamicX/parser/DXDataParserGetImageBizInfo");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Object x2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (!(objArr == null || objArr.length == 0)) {
            Context h = dXRuntimeContext.h();
            if ((h instanceof h4d) && (x2 = ((h4d) h).x2("isOLFirstScreen")) != null && ((Boolean) x2).booleanValue()) {
                try {
                    String str = (String) objArr[0];
                    if ("bizId".equals(str)) {
                        return "66001";
                    }
                    if ("bizType".equals(str)) {
                        return "orderlist_001";
                    }
                } catch (Exception unused) {
                }
            }
        }
        return "0";
    }
}
