package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class w18 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HGETFROMCURRENTMODEL = 8491394548880287236L;

    static {
        t2o.a(473956370);
    }

    public static /* synthetic */ Object ipc$super(w18 w18Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/home/component/parser/DxDataParserHGetFromCurrentModel");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        Object obj = null;
        if (objArr == null || objArr.length < 1) {
            bqa.d("getFromCurrentModel", "operationList == null");
            return null;
        }
        if (objArr.length >= 2) {
            obj = objArr[1];
        }
        JSONObject i = dXRuntimeContext.i();
        if (i == null) {
            bqa.d("getFromCurrentModel", "sectionData == null");
            return obj;
        }
        String str = (String) objArr[0];
        if (TextUtils.isEmpty(str)) {
            bqa.d("getFromCurrentModel", "key == null");
            return obj;
        }
        JSONObject jSONObject = i.getJSONObject("ext");
        if (jSONObject == null) {
            return obj;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("clientCache");
        if (jSONObject2 == null) {
            bqa.d("getFromCurrentModel", "clientCache == null, key=" + str);
            return obj;
        }
        Object obj2 = jSONObject2.get(str);
        if (obj2 == null) {
            return obj == null ? "" : obj;
        }
        bqa.d("getFromCurrentModel", "get, key=" + str + ", value=" + obj2);
        return obj2;
    }
}
