package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class i4s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356524);
    }

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6cb35cd2", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return z;
        }
        try {
            return Boolean.parseBoolean(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            o3s.b("TLiveTypeUtils", "error while parsing: " + str);
            return z;
        }
    }

    public static int b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20b562c9", new Object[]{str, new Integer(i)})).intValue();
        }
        return c(str, i, 10);
    }

    public static int c(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f5f76ae0", new Object[]{str, new Integer(i), new Integer(i2)})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Integer.parseInt(str, i2);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            o3s.b("TLiveTypeUtils", "error while parsing: " + str);
            return i;
        }
    }

    public static long d(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66c9f198", new Object[]{str, new Long(j)})).longValue();
        }
        if (TextUtils.isEmpty(str)) {
            return j;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            o3s.b("TLiveTypeUtils", "error while parsing: " + str);
            return j;
        }
    }
}
