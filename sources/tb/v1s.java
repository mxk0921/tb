package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class v1s extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_ID = 8239620625987298144L;
    public static final String PARSER_TAG = "tdStepLabelsAppendInValues";

    static {
        t2o.a(614465690);
    }

    public static /* synthetic */ Object ipc$super(v1s v1sVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/dinamicX/parser/TDStepLabelsAppendInValues");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        kor.a("TDStepLabelsAppendInVal", "evalWithArgs", "----");
        try {
            return a(objArr, dXRuntimeContext);
        } catch (Exception unused) {
            ldv.g(dXRuntimeContext.h(), "TDStepLabelsAppendInVal", PARSER_TAG, "解析异常", null);
            return null;
        }
    }

    public final Object a(Object[] objArr, DXRuntimeContext dXRuntimeContext) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3364cdfb", new Object[]{this, objArr, dXRuntimeContext});
        }
        String a2 = gsl.a(objArr, 1, new Class[]{JSONArray.class});
        if (TextUtils.isEmpty(a2)) {
            JSONArray jSONArray = (JSONArray) objArr[0];
            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null && !TextUtils.isEmpty(jSONObject.getString("value"))) {
                    if (!TextUtils.isEmpty(jSONObject.getString("name"))) {
                        sb.append(jSONObject.getString("name"));
                        sb.append(": ");
                    }
                    sb.append(jSONObject.getString("value"));
                    sb.append("\n");
                }
            }
            return sb.toString().trim();
        }
        throw new RuntimeException(a2);
    }
}
