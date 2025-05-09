package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.model.DXJSONObjectForVM;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class bu5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596855);
    }

    public static Object a(DXRuntimeContext dXRuntimeContext, Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("99f2a479", new Object[]{dXRuntimeContext, obj, str});
        }
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (obj instanceof DXJSONObjectForVM) {
            return a(dXRuntimeContext, ((DXJSONObjectForVM) obj).getData(), str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).get(str);
        }
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            try {
                int parseInt = Integer.parseInt(str);
                if (parseInt < jSONArray.size()) {
                    return jSONArray.get(parseInt);
                }
                return null;
            } catch (Exception unused) {
                h36.c("DXExpressionParser list index is not number" + str);
                return null;
            }
        } else {
            if (dXRuntimeContext != null && dXRuntimeContext.w0()) {
                return dXRuntimeContext.j().getValue(obj, str);
            }
            return null;
        }
    }

    public static boolean b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("749c0fb8", new Object[]{obj})).booleanValue();
        }
        if ((!(obj instanceof JSONObject) || (obj instanceof DXJSONObjectForVM)) && !(obj instanceof JSONArray)) {
            return true;
        }
        return false;
    }

    public static boolean c(DXRuntimeContext dXRuntimeContext, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a726f8a", new Object[]{dXRuntimeContext, obj})).booleanValue();
        }
        if (dXRuntimeContext == null || !dXRuntimeContext.w0() || (obj instanceof JSONArray) || !(obj instanceof List)) {
            return false;
        }
        return true;
    }
}
