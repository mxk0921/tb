package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class dw9 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long FORMAT_MTOPDATA_PARSER = -8937873586954609487L;

    static {
        t2o.a(614465684);
    }

    public static /* synthetic */ Object ipc$super(dw9 dw9Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/dinamicX/parser/FormatMtopDataParser");
    }

    public final Object a(Object obj) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("14ebb18e", new Object[]{this, obj});
        }
        if (obj instanceof JSONObject) {
            jSONObject = new JSONObject();
            for (Map.Entry<String, Object> entry : ((JSONObject) obj).entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    jSONObject.put(entry.getKey(), (Object) value.toString());
                }
            }
        } else {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return jSONObject;
        }
        return obj;
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
        return a(objArr[0]);
    }
}
