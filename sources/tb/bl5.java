package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class bl5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_GETINDEXBYID = -6566810280767110228L;

    static {
        t2o.a(614465665);
    }

    public static /* synthetic */ Object ipc$super(bl5 bl5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/dinamicX/parser/DXDataParserGetIndexById");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length <= 2) {
            return -1;
        }
        String valueOf = String.valueOf(objArr[0]);
        String valueOf2 = String.valueOf(objArr[1]);
        Object obj = objArr[2];
        if (!(obj instanceof JSONArray)) {
            return -1;
        }
        JSONArray jSONArray = (JSONArray) obj;
        if (TextUtils.isEmpty(valueOf) || TextUtils.isEmpty(valueOf2)) {
            return -1;
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            Object obj2 = jSONArray.get(i);
            if ((obj2 instanceof JSONObject) && valueOf2.equals(((JSONObject) obj2).get(valueOf))) {
                return Integer.valueOf(i);
            }
        }
        return -1;
    }
}
