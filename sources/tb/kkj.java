package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class kkj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static volatile int f22729a = -1;

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("379b994a", new Object[0])).booleanValue();
        }
        if (f22729a > 0) {
            return true;
        }
        return false;
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("16252ad8", new Object[0])).intValue();
        }
        if (f22729a > 0) {
            return f22729a;
        }
        try {
            System.loadLibrary("ProtoDB2");
            f22729a = 5;
        } catch (Throwable unused) {
        }
        return f22729a;
    }
}
