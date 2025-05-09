package tb;

import android.content.Context;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class asr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(822083599);
    }

    public static boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d890f3b", new Object[]{new Integer(i)})).booleanValue();
        }
        if (i == 0) {
            return true;
        }
        return false;
    }

    public static String b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16652dd8", new Object[]{new Integer(i)});
        }
        if (i == 805372417) {
            return "FULL_121";
        }
        if (i != 1879114240) {
            return String.valueOf(i);
        }
        return "LIMIT";
    }

    public static String c(Throwable th) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("26a905b9", new Object[]{th});
        }
        if (th.getCause() != null) {
            str = th.getCause().getClass().getName();
        } else {
            str = TLogTracker.SCENE_EXCEPTION;
        }
        String message = th.getMessage();
        return str + ": " + message;
    }

    public static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e5a578d", new Object[]{context})).booleanValue();
        }
        if ((context.getApplicationInfo().flags & 2) > 0) {
            return true;
        }
        return false;
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97f17ee0", new Object[0])).booleanValue();
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || i > 34) {
            return false;
        }
        return true;
    }

    public static boolean f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d26ddf9", new Object[]{context})).booleanValue();
        }
        String absolutePath = context.getFilesDir().getAbsolutePath();
        urr.d("", "The file path is %s", absolutePath);
        if (absolutePath.contains("/dkplugin") || absolutePath.matches("^/data/user/.+/data/user/.+")) {
            return true;
        }
        return false;
    }
}
