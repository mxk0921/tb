package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ir9 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ADAPTER_NAME = "ILoggerAdapter";
    public static final int DEBUG = 1;
    public static final int ERROR = 4;
    public static final int INFO = 2;
    public static final String MODULE = "Fluid";
    public static final int WARN = 3;

    static {
        t2o.a(469762064);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
        } else {
            e(1, str, str2);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
        } else {
            c(str, str2, null);
        }
    }

    public static void c(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152aaa75", new Object[]{str, str2, th});
        } else {
            f(4, str, str2, th);
        }
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e38e584", new Object[]{str, str2});
        } else {
            e(2, str, str2);
        }
    }

    public static void e(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81b0661", new Object[]{new Integer(i), str, str2});
        } else {
            f(i, str, str2, null);
        }
    }

    public static void f(int i, String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6486434", new Object[]{new Integer(i), str, str2, th});
        } else if (i == 2) {
            TLog.logi(MODULE, str, str2);
        } else if (i == 3) {
            TLog.logw(MODULE, str, str2);
        } else if (i != 4) {
            TLog.logd(MODULE, str, str2);
        } else if (th == null) {
            TLog.loge(MODULE, str, str2);
        } else {
            TLog.loge(MODULE, str, str2, th);
        }
    }
}
