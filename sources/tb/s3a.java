package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class s3a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GLOG_TAG = "home.gateway";

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f27777a = f();

    static {
        t2o.a(475005029);
    }

    public static void a(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7b71c54", new Object[]{strArr});
        } else if (f27777a) {
            TLog.logd(GLOG_TAG, strArr);
        } else if (e()) {
            g(strArr);
        }
    }

    public static void b(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c9407f", new Object[]{str, th});
        } else if (f27777a) {
            TLog.loge(GLOG_TAG, str, th);
        } else if (e()) {
            Log.e(GLOG_TAG, str, th);
        }
    }

    public static void c(Throwable th, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe1b8976", new Object[]{th, strArr});
        } else if (f27777a) {
            TLog.loge(GLOG_TAG, g(strArr), th);
        } else if (e()) {
            Log.e(GLOG_TAG, g(strArr), th);
        }
    }

    public static void d(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3b8ab33", new Object[]{strArr});
        } else if (f27777a) {
            TLog.loge(GLOG_TAG, strArr);
        } else if (e()) {
            Log.e(GLOG_TAG, g(strArr));
        }
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4500e523", new Object[0])).booleanValue();
        }
        return cw6.b();
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44b7b128", new Object[0])).booleanValue();
        }
        return l5a.a(q4a.b, "enable_gateway_tlog", false);
    }

    public static String g(String... strArr) {
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

    public static void h(Throwable th, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd693688", new Object[]{th, strArr});
        } else if (f27777a) {
            TLog.logw(GLOG_TAG, g(strArr), th);
        } else if (e()) {
            g(strArr);
        }
    }
}
