package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class xwm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(157286496);
    }

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2fe5bea", new Object[]{new Integer(i)});
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("--");
        }
        return sb.toString();
    }

    public static String c(JSONObject jSONObject, JSONArray jSONArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44904677", new Object[]{jSONObject, jSONArray, new Integer(i)});
        }
        StringBuilder sb = new StringBuilder();
        if (jSONArray == null) {
            return sb.toString();
        }
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof String) {
                sb.append(a(i));
                sb.append(next);
                sb.append("\n");
                if (jSONObject.containsKey(next)) {
                    sb.append(c(jSONObject, jSONObject.getJSONArray((String) next), i + 1));
                }
            }
        }
        return sb.toString();
    }

    public static String b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a2c7909", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        try {
            String string = jSONObject.getJSONObject("hierarchy").getString("root");
            if (string != null || jSONObject.getJSONObject("hierarchy").getJSONArray("delta") == null) {
                sb.append(string);
                sb.append("\n");
                JSONObject jSONObject2 = jSONObject.getJSONObject("hierarchy").getJSONObject("structure");
                sb.append(c(jSONObject2, jSONObject2.getJSONArray(string), 1));
            } else {
                sb.append(jSONObject.toJSONString());
            }
        } catch (Throwable th) {
            UnifyLog.e("PrintInfoUtils", "getProtocolRenderInfo exception: " + th.getMessage());
        }
        return sb.toString();
    }
}
