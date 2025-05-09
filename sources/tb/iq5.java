package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class iq5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_SPLITSTRING = -6526178989024258130L;

    static {
        t2o.a(614465676);
    }

    public static /* synthetic */ Object ipc$super(iq5 iq5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/dinamicX/parser/DXDataParserSplitString");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length < 3) {
            return null;
        }
        Object obj = objArr[0];
        if (!(obj instanceof String)) {
            return null;
        }
        Object obj2 = objArr[1];
        if (!(obj2 instanceof String)) {
            return null;
        }
        String str = (String) objArr[2];
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = ((String) obj).split((String) obj2);
        if (Integer.parseInt(str) >= split.length) {
            return null;
        }
        return split[Integer.parseInt(str)];
    }
}
