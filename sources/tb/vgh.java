package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class vgh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f30003a = nwv.R(Globals.getApplication());

    static {
        t2o.a(689963199);
    }

    public static String a(Object obj, String str) {
        StackTraceElement stackTraceElement;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b97688d", new Object[]{obj, str});
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length <= 4) {
            return str;
        }
        if (stackTrace[4] == null) {
            return str;
        }
        return str + "\t@" + (stackTraceElement.getClassName() + "$" + stackTraceElement.getMethodName() + "$" + stackTraceElement.getLineNumber() + "$" + System.identityHashCode(obj) + "$");
    }

    public static void b(Object obj, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77c1c5b7", new Object[]{obj, str, str2});
        } else if (f30003a) {
            TLog.logd("Tab2Interact", str, a(obj, str2));
        }
    }

    public static void c(Object obj, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88779278", new Object[]{obj, str, str2});
        } else if (f30003a) {
            TLog.loge("Tab2Interact", str, a(obj, str2));
        } else {
            TLog.loge("Tab2Interact", str, str2);
        }
    }

    public static void d(Object obj, String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f7f1c7d", new Object[]{obj, str, str2, th});
        } else if (f30003a) {
            TLog.loge("Tab2Interact", str, a(obj, str2), th);
        } else {
            TLog.loge("Tab2Interact", str, str2, th);
        }
    }
}
