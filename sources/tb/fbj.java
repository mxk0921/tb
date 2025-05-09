package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class fbj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UNDER_LINE = "_";

    static {
        t2o.a(729809481);
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7594df7", new Object[]{str})).intValue();
        }
        String[] split = str.split("_");
        if (split.length < 2) {
            return -1;
        }
        try {
            return Integer.parseInt(split[split.length - 1]);
        } catch (Throwable th) {
            d9j.d("MultiTabUtils", "parse index error", th);
            return -1;
        }
    }
}
