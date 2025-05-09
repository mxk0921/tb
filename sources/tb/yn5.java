package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class yn5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_FORMAT = "yyyy-MM-dd";
    public static final long DX_EVENT_ID;
    public static final long DX_PARSER_LOCALDATE;

    static {
        t2o.a(912261753);
        long a2 = k06.a("localDate");
        DX_EVENT_ID = a2;
        DX_PARSER_LOCALDATE = a2;
    }

    public static /* synthetic */ Object ipc$super(yn5 yn5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/dinamicx/event/DXDataParserLocalDate");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null) {
            return null;
        }
        if (objArr.length == 0) {
            str = "yyyy-MM-dd";
        } else {
            str = (String) objArr[0];
        }
        return rut.a(System.currentTimeMillis(), str);
    }
}
