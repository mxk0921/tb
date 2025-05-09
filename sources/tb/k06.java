package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class k06 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597042);
    }

    public static long a(String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64b9d13", new Object[]{str})).longValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        int length = str.length();
        long j = length;
        if (length > 96) {
            return b(str);
        }
        while (i < (length & (-4))) {
            j = (j * 67503105) + (str.charAt(i) * 769) + (str.charAt(i + 1) * 513) + (str.charAt(i + 2) * 257) + str.charAt(i + 3);
            i += 4;
        }
        while (i < length) {
            j = (j * 257) + str.charAt(i);
            i++;
        }
        return j + (j << (length & 31));
    }

    public static long b(String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("25e49f48", new Object[]{str})).longValue();
        }
        int length = str.length();
        if (length > 0) {
            int i2 = 0;
            while (i < length) {
                i2 = (i2 * 199) + str.charAt(i);
                i++;
            }
            i = i2;
        }
        return i;
    }
}
