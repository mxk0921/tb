package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.StringTokenizer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class dq8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(83886246);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5 */
    public static Object a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f669ebca", new Object[]{obj, str});
        }
        if (obj != null && str != 0) {
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
                        str = obj;
                    }
                }
                if (z) {
                    str = g2w.a(str, nextToken);
                }
            }
        }
        return str;
    }
}
