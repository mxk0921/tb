package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class i65 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f21117a;

    static {
        t2o.a(487587969);
        f21117a = true;
        try {
            IpChange ipChange = TLog.$ipChange;
        } catch (Throwable unused) {
            f21117a = false;
        }
    }

    public static void a(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e678f70a", new Object[]{str, strArr});
            return;
        }
        if (f21117a) {
            TLog.logd(str, strArr);
        }
        if (e()) {
            f(strArr);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152aaa75", new Object[]{str, str2, th});
            return;
        }
        if (f21117a) {
            TLog.loge(str, str2, th);
        }
        if (e()) {
            Log.e(str, f(str2), th);
        }
    }

    public static void c(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edde2c29", new Object[]{str, strArr});
            return;
        }
        if (f21117a) {
            TLog.loge(str, strArr);
        }
        if (e()) {
            Log.e(str, f(strArr));
        }
    }

    public static void d(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7300a5", new Object[]{str, strArr});
            return;
        }
        if (f21117a) {
            TLog.logi(str, strArr);
        }
        if (e()) {
            f(strArr);
        }
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4500e523", new Object[0])).booleanValue();
        }
        return rj7.b();
    }

    public static String f(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3193a943", new Object[]{strArr});
        }
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        if (strArr.length == 1) {
            return strArr[0];
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static void g(String str, Throwable th, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7efeaad2", new Object[]{str, th, strArr});
            return;
        }
        if (f21117a) {
            TLog.logw(str, f(strArr), th);
        }
        if (e()) {
            f(strArr);
        }
    }
}
