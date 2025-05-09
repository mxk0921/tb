package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.StringTokenizer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class rwf implements bsl<JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(156237889);
        t2o.a(156237892);
    }

    public static Object b(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f669ebca", new Object[]{obj, str});
        }
        if (!(obj == null || str == null)) {
            if (obj instanceof JSONObject) {
                return ((JSONObject) obj).get(str);
            }
            if (obj instanceof JSONArray) {
                try {
                    return ((JSONArray) obj).get(Integer.parseInt(str));
                } catch (Exception e) {
                    tj8.b("DataParser", "getValue", "EVENT_CHAIN_TRY_EXCEPTION_ERROR", tj8.c(e));
                }
            }
        }
        return null;
    }

    public static boolean c(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42ff03f2", new Object[]{charSequence})).booleanValue();
        }
        if (charSequence == null || charSequence.length() == 0) {
            return true;
        }
        return false;
    }

    public static Object d(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2e634508", new Object[]{str, jSONObject});
        }
        if (c(str)) {
            return jSONObject;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, " .[]", false);
        Object obj = jSONObject;
        while (stringTokenizer.hasMoreTokens()) {
            obj = b(obj, stringTokenizer.nextToken());
        }
        if (obj == null) {
            return null;
        }
        return String.valueOf(obj);
    }

    /* renamed from: e */
    public Object a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("366ce3b2", new Object[]{this, str, jSONObject});
        }
        return d(str, jSONObject);
    }
}
