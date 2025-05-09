package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.StringTokenizer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class cq8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262339);
    }

    public static Object a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f669ebca", new Object[]{obj, str});
        }
        Object obj2 = null;
        if (obj != null && str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, " ${.[]}", true);
            boolean z = false;
            while (stringTokenizer.hasMoreTokens()) {
                String nextToken = stringTokenizer.nextToken();
                if (nextToken.length() == 1) {
                    char charAt = nextToken.charAt(0);
                    if ('$' != charAt) {
                        if (!(' ' == charAt || '[' == charAt || ']' == charAt || '{' == charAt || '.' == charAt)) {
                            if ('}' == charAt) {
                                break;
                            }
                        }
                    } else {
                        z = true;
                        obj2 = obj;
                    }
                }
                if (z) {
                    obj2 = e2w.a(obj2, nextToken);
                }
            }
        }
        return obj2;
    }
}
