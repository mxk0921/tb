package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class mm5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HSTRTOJSON = -6150397287027100920L;

    static {
        t2o.a(729809046);
    }

    public static /* synthetic */ Object ipc$super(mm5 mm5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/dinamic3/parser/DXDataParserHStrToJson");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (!(objArr == null || objArr.length == 0)) {
            Object obj2 = objArr[0];
            if (objArr.length >= 2) {
                obj = objArr[1];
            } else {
                obj = null;
            }
            if (!(obj2 instanceof String)) {
                return null;
            }
            String str = (String) obj2;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                if ("array".equals(obj)) {
                    return JSON.parseArray(str);
                }
                return JSON.parseObject(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
