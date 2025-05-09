package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class bb6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597876);
    }

    public static boolean a(String str, Object obj, Object obj2, fvb fvbVar) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fd773fe", new Object[]{str, obj, obj2, fvbVar})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && obj != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".[]", false);
            while (stringTokenizer.hasMoreTokens()) {
                String nextToken = stringTokenizer.nextToken();
                if (!stringTokenizer.hasMoreTokens()) {
                    return c(nextToken, obj, obj2, fvbVar);
                }
                obj = b(obj, nextToken, fvbVar);
            }
        }
        return false;
    }

    public static Object b(Object obj, String str, fvb fvbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("e3c3ecd5", new Object[]{obj, str, fvbVar});
        }
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        if (obj instanceof List) {
            return ((List) obj).get(Integer.parseInt(str));
        }
        if (fvbVar != null) {
            return fvbVar.getValue(obj, str);
        }
        throw new RuntimeException("getValue 不支持的类型");
    }

    public static boolean c(String str, Object obj, Object obj2, fvb fvbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec7d1", new Object[]{str, obj, obj2, fvbVar})).booleanValue();
        }
        if (obj instanceof Map) {
            ((Map) obj).put(str, obj2);
            return true;
        } else if (obj instanceof List) {
            ((List) obj).add(Integer.parseInt(str), obj2);
            return true;
        } else if (fvbVar != null) {
            return fvbVar.setValue(obj, str, obj2);
        } else {
            throw new RuntimeException("setValue 不支持的类型");
        }
    }
}
