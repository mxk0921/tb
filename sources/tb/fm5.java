package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class fm5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HIFCANACTIVE = -866028105002175375L;

    static {
        t2o.a(486539381);
    }

    public static /* synthetic */ Object ipc$super(fm5 fm5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/parser/DXDataParserHIFCanActive");
    }

    public final boolean a(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48eb74b", new Object[]{this, str, str2, jSONObject, jSONObject2})).booleanValue();
        }
        int parseInt = Integer.parseInt(str2);
        for (String str3 : jSONObject.keySet()) {
            if (Integer.parseInt(jSONObject.getString(str3)) < parseInt && b(str3, jSONObject2)) {
                z = false;
            }
        }
        if (z) {
            return b(str, jSONObject2);
        }
        return false;
    }

    public final boolean b(String str, JSONObject jSONObject) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90d27ddc", new Object[]{this, str, jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            fve.e("DXDataParserHIFCanActive", "fatigueCount == null");
            return true;
        }
        String b = tlp.b(str, "");
        if (b == null) {
            return true;
        }
        String[] split = b.split("_");
        if (c(split)) {
            return true;
        }
        if (split.length > 1) {
            i = Integer.parseInt(split[1]);
            fve.e("DXDataParserHIFCanActive", "currentShowCount: " + i);
        } else {
            i = 0;
        }
        int intValue = jSONObject.getIntValue(str);
        if (intValue != 0 && i >= intValue) {
            return false;
        }
        return true;
    }

    public final JSONObject d(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ba109c83", new Object[]{this, obj});
        }
        if (obj instanceof String) {
            return JSON.parseObject((String) obj);
        }
        fve.e("DXDataParserHIFCanActive", "value不是string" + obj);
        return null;
    }

    public final boolean c(String[] strArr) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c16b4ee1", new Object[]{this, strArr})).booleanValue();
        }
        if (strArr.length > 1) {
            str = strArr[0];
            fve.e("DXDataParserHIFCanActive", "uptimeMillis: " + str);
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            fve.e("DXDataParserHIFCanActive", "lastTimeMillis == null");
            return true;
        } else if (!mfo.e(Long.parseLong(str))) {
            return false;
        } else {
            fve.e("DXDataParserHIFCanActive", "是新的一天了");
            return true;
        }
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0) {
            fve.e("DXDataParserHIFCanActive", "operationList == null");
            return Boolean.FALSE;
        }
        String str = (String) objArr[0];
        JSONObject jSONObject = null;
        JSONObject d = objArr.length >= 2 ? d(objArr[1]) : null;
        if (objArr.length >= 3) {
            jSONObject = d(objArr[2]);
        }
        if (jSONObject == null || d == null) {
            fve.e("DXDataParserHIFCanActive", "motionPriority == null");
            return Boolean.TRUE;
        }
        String string = jSONObject.getString(str);
        if (!TextUtils.isEmpty(string)) {
            return Boolean.valueOf(a(str, string, jSONObject, d));
        }
        fve.e("DXDataParserHIFCanActive", "userId：" + str + ",priority == null");
        return Boolean.FALSE;
    }
}
