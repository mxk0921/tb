package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class rn5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_KV = 798575;

    static {
        t2o.a(444596752);
    }

    public static /* synthetic */ Object ipc$super(rn5 rn5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/ExepressionEvaluation/DXDataParserKv");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        JSONObject jSONObject = new JSONObject();
        if (objArr == null || objArr.length == 0 || objArr.length % 2 != 0) {
            h36.g("DXDataParserKv", "args 键值对数量不符合规范");
            return null;
        }
        for (int i = 0; i < objArr.length; i += 2) {
            Object obj = objArr[i];
            if (obj != null) {
                String obj2 = obj.toString();
                if (!TextUtils.isEmpty(obj2)) {
                    jSONObject.put(obj2, objArr[i + 1]);
                }
            }
        }
        return jSONObject;
    }

    @Override // tb.nb5, tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "kv";
    }
}
