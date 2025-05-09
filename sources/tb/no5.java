package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class no5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_MTBICONFONTSUPPORT = -8931733717821205646L;

    static {
        t2o.a(745538092);
    }

    public static /* synthetic */ Object ipc$super(no5 no5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/ultron/dinamicX/dataParser/DXDataParserMtbIconFontSupport");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length < 2) {
            return Boolean.FALSE;
        }
        if (objArr[1] == null) {
            return Boolean.FALSE;
        }
        Object obj = objArr[0];
        if (obj instanceof Integer) {
            if (3 < ((Integer) obj).intValue()) {
                z = false;
            }
            return Boolean.valueOf(z);
        } else if (!(obj instanceof String)) {
            return Boolean.FALSE;
        } else {
            try {
                if (3 < Integer.parseInt((String) obj)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            } catch (Throwable unused) {
                return Boolean.FALSE;
            }
        }
    }
}
