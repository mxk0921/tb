package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class dvv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile String f18102a;
    public static volatile Long b = null;

    static {
        t2o.a(404750761);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        try {
            return o1v.b(f82.d()).get(oeh.UTDID);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b49c3d8c", new Object[0])).longValue();
        }
        if (TextUtils.isEmpty(f18102a)) {
            f18102a = a();
        }
        if (TextUtils.isEmpty(f18102a)) {
            return 0L;
        }
        if (b == null) {
            b = Long.valueOf(c("UCP_" + f18102a));
        }
        return b.longValue();
    }

    public static long c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64b9d13", new Object[]{str})).longValue();
        }
        long j = 0;
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        int length = str.length();
        char[] charArray = str.toCharArray();
        for (int i = 0; i < length; i++) {
            j = (j * 31) + charArray[i];
        }
        return Long.MAX_VALUE & j;
    }
}
