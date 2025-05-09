package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class oi5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long DX_EVENT_ID;
    public static final long DX_PARSER_BYTELENGTH;

    static {
        t2o.a(912262657);
        long a2 = k06.a(pg1.ATOM_EXT_byteLength);
        DX_EVENT_ID = a2;
        DX_PARSER_BYTELENGTH = a2;
    }

    public static /* synthetic */ Object ipc$super(oi5 oi5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/transfer/handler/DXDataParserByteLength");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length < 1) {
            return 0;
        }
        Object obj = objArr[0];
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = "";
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                int i = 0;
                for (int i2 = 0; i2 < str.length(); i2++) {
                    if (String.valueOf(str.charAt(i2)).getBytes().length == 1) {
                        i++;
                    } else {
                        i += 2;
                    }
                }
                return Integer.valueOf(i);
            }
        } catch (Exception unused) {
        }
        return 0;
    }
}
