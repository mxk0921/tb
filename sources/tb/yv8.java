package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class yv8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f32374a = true;

    static {
        t2o.a(435159100);
    }

    public static void a(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98f7bd1c", new Object[]{str, objArr});
            return;
        }
        try {
            if (f32374a && objArr.length != 0) {
                String.format(str, objArr);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void b(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10fef4e1", new Object[]{str, th});
            return;
        }
        try {
            if (f32374a) {
                Log.e("DesktopService", str + "\nstack:" + Log.getStackTraceString(th));
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{str});
            return;
        }
        try {
            if (f32374a) {
                Log.e("DesktopService", str);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821af06", new Object[]{new Boolean(z)});
        } else {
            f32374a = z;
        }
    }

    public static void e(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58dccd0", new Object[]{str, objArr});
            return;
        }
        try {
            if (objArr.length != 0) {
                str = String.format(str, objArr);
            }
            TLog.logi("DesktopService", str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
