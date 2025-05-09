package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class pp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(374341765);
    }

    public static String a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d1ca7a35", new Object[]{new Long(j)});
        }
        if (j >= 0 && j < 1024) {
            return j + " B";
        } else if (j >= 1024 && j < 1048576) {
            return (j / 1024) + " KB";
        } else if (j >= 1048576 && j < 1073741824) {
            return (j / 1048576) + " MB";
        } else if (j >= 1073741824 && j < 1099511627776L) {
            return (j / 1073741824) + " GB";
        } else if (j >= 1099511627776L) {
            return (j / 1099511627776L) + " TB";
        } else {
            return j + " Bytes";
        }
    }

    public static String b(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("919371aa", new Object[]{objArr});
        }
        String str = "";
        for (int i = 0; i < objArr.length; i++) {
            str = str + objArr[i] + " ";
        }
        return str;
    }

    public static int c(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("98f7bd0f", new Object[]{str, objArr})).intValue();
        }
        return 0;
    }

    public static int d(String str, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("11662445", new Object[]{str, th, objArr})).intValue();
        }
        return Log.e(str, b(objArr), th);
    }

    public static int e(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a05cf22e", new Object[]{str, objArr})).intValue();
        }
        return Log.e(str, b(objArr));
    }

    public static int f(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("257aae5c", new Object[]{str, objArr})).intValue();
        }
        return Log.w(str, b(objArr));
    }
}
