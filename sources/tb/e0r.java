package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.sku.utils.SkuLogUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class e0r extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARSER_TAG = "xskuSwtich";
    public static final long DX_PARSER_ID = k06.a(PARSER_TAG);

    public static /* synthetic */ Object ipc$super(e0r e0rVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/sku/dinamicx/parser/SwitchCase");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (cjz.a()) {
            SkuLogUtils.x("SwitchCase.evalWithArgs");
        }
        if (objArr == null || objArr.length <= 2) {
            return null;
        }
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        if (obj == null || obj2 == null) {
            return objArr[2];
        }
        String obj3 = obj.toString();
        if (obj2 instanceof JSONObject) {
            jSONObject = (JSONObject) obj2;
        } else {
            jSONObject = JSON.parseObject(obj2.toString());
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return objArr[2];
        }
        Object obj4 = jSONObject.get(obj3);
        if (obj4 == null) {
            return objArr[2];
        }
        return obj4;
    }

    static {
        t2o.a(442499174);
    }
}
