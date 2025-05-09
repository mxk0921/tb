package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class qan {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FROM_COMBINED_RESOLVE = "combined_resolve";
    public static final String FROM_EXIST = "exist";
    public static final String FROM_LAST_CACHE = "cache";
    public static final String FROM_RESOLVE = "resolve";
    public static final String FROM_RESTRICTIVE = "restrictive";

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2b1032c", new Object[]{str})).booleanValue();
        }
        return trq.d(str, FROM_EXIST) || trq.d(str, "cache") || trq.d(str, FROM_RESTRICTIVE);
    }
}
