package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class lm5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HSTRTOJSON = -6150397287027100920L;

    static {
        t2o.a(486539382);
    }

    public static /* synthetic */ Object ipc$super(lm5 lm5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/parser/DXDataParserHStrToJson");
    }

    public final boolean a(Object[] objArr) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("523f0b27", new Object[]{this, objArr})).booleanValue();
        }
        if (objArr.length >= 2) {
            obj = objArr[1];
        } else {
            obj = null;
        }
        return "array".equals(obj);
    }

    public final String b(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2eb00f51", new Object[]{this, objArr});
        }
        Object obj = objArr[0];
        if (!(obj instanceof String)) {
            return null;
        }
        return (String) obj;
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (!(objArr == null || objArr.length == 0)) {
            String b = b(objArr);
            if (TextUtils.isEmpty(b)) {
                return null;
            }
            try {
                if (a(objArr)) {
                    return JSON.parseArray(b);
                }
                return JSON.parseObject(b);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
