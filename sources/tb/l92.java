package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class l92 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long ACCURACY = 10000;

    static {
        t2o.a(912262744);
    }

    public static boolean a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80312037", new Object[]{new Long(j)})).booleanValue();
        }
        if (j <= 0) {
            return false;
        }
        if (j >= 10000) {
            return true;
        }
        if (Math.abs(Long.parseLong(hjh.b())) % 10000 <= j) {
            return true;
        }
        return false;
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f21cac3f", new Object[]{str})).booleanValue();
        }
        try {
            return a(Long.parseLong(str));
        } catch (Throwable unused) {
            return false;
        }
    }
}
