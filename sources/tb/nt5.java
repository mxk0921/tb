package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.ultron.common.model.IDMComponent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class nt5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_ULTRONPARENTDXDATA = 7011726503363934038L;

    static {
        t2o.a(350224432);
    }

    public static /* synthetic */ Object ipc$super(nt5 nt5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/adam/ultronExt/parser/DXDataParserUltronParentDxData");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IDMComponent b;
        IDMComponent a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0 || objArr.length != 2) {
            return null;
        }
        Object obj = objArr[0];
        if (!(obj instanceof String) || !(objArr[1] instanceof String) || TextUtils.isEmpty((String) obj) || (b = ur6.b(dXRuntimeContext)) == null || (a2 = ur6.a((String) objArr[0], b)) == null) {
            return null;
        }
        return ur6.e((String) objArr[1], a2.getData());
    }
}
