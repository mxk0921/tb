package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class fs5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TBLIVE_GETSERVERTIME = 8895170634865228607L;

    static {
        t2o.a(295698934);
    }

    public static /* synthetic */ Object ipc$super(fs5 fs5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/dx/DXDataParserTblive_getServerTime");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (v2s.o().C() != null) {
            currentTimeMillis = v2s.o().C().getServerTime();
        }
        if (objArr == null || objArr.length == 0) {
            return Long.valueOf(currentTimeMillis);
        }
        return Long.valueOf(currentTimeMillis);
    }
}
