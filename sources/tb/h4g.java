package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.StringTokenizer;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class h4g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DELIMITER = " .[]";
    public static final h4g INSTANCE = new h4g();

    @JvmStatic
    public static final Object a(StringTokenizer stringTokenizer, Object obj, boolean z, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("fe685a6a", new Object[]{stringTokenizer, obj, new Boolean(z), obj2});
        }
        ckf.g(stringTokenizer, "tokens");
        if (obj == null || !stringTokenizer.hasMoreTokens()) {
            return obj;
        }
        do {
            String nextToken = stringTokenizer.nextToken();
            if (!(obj instanceof JSONObject)) {
                boolean z2 = obj instanceof JSONArray;
                obj = null;
                if (z2) {
                    ckf.f(nextToken, "token");
                    Integer m = ssq.m(nextToken);
                    if (m != null) {
                        JSONArray jSONArray = (JSONArray) obj;
                        if (jSONArray.size() > m.intValue()) {
                            if (!z || stringTokenizer.hasMoreTokens()) {
                                obj = jSONArray.get(m.intValue());
                            } else {
                                jSONArray.set(m.intValue(), obj2);
                                return Boolean.TRUE;
                            }
                        }
                    }
                }
            } else if (!z || stringTokenizer.hasMoreTokens()) {
                obj = ((JSONObject) obj).get(nextToken);
            } else {
                ((Map) obj).put(nextToken, obj2);
                return Boolean.TRUE;
            }
            if (obj == null) {
                break;
            }
        } while (stringTokenizer.hasMoreTokens());
        return z ? Boolean.FALSE : obj;
    }

    @JvmStatic
    public static final Object b(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("98045b4a", new Object[]{str, obj});
        }
        ckf.g(str, "keyPath");
        return a(new StringTokenizer(str, " .[]", false), obj, false, null);
    }

    @JvmStatic
    public static final boolean c(String str, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f99903c", new Object[]{str, obj, obj2})).booleanValue();
        }
        ckf.g(str, "keyPath");
        return ckf.b(a(new StringTokenizer(str, " .[]", false), obj, true, obj2), Boolean.TRUE);
    }
}
