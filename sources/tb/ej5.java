package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.Collections;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ej5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_CARTPRICESPLIT = 8125423360837218743L;

    static {
        t2o.a(479199351);
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("77b7eef3", new Object[]{str})).intValue();
        }
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                return i;
            }
        }
        return -1;
    }

    public static /* synthetic */ Object ipc$super(ej5 ej5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/dinamicX/parser/DXDataParserCartPriceSplit");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        String str = (String) objArr[0];
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyMap();
        }
        int a2 = a(str);
        if (a2 < 0) {
            return Collections.emptyMap();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(pg1.ATOM_symbol, (Object) str.substring(0, a2));
        int indexOf = str.indexOf(46);
        if (indexOf < 0) {
            jSONObject.put("integer", (Object) str.substring(a2));
            jSONObject.put("decimal", (Object) "");
        } else {
            jSONObject.put("integer", (Object) str.substring(a2, indexOf));
            jSONObject.put("decimal", (Object) str.substring(indexOf + 1));
        }
        return jSONObject;
    }
}
