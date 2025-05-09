package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class hyv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(628097068);
    }

    public static long a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f81b7e5e", new Object[]{str})).longValue();
        }
        long j = 0;
        if (str == null) {
            return 0L;
        }
        char[] charArray = str.toCharArray();
        if (charArray.length > 0) {
            for (char c : charArray) {
                j = (j * 31) + c;
            }
        }
        return j;
    }

    public static boolean b(int i, Map<String, Object> map, lkd lkdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37be59e4", new Object[]{new Integer(i), map, lkdVar})).booleanValue();
        }
        if (lkdVar == null) {
            return false;
        }
        lkdVar.onResult(i, map);
        return true;
    }
}
