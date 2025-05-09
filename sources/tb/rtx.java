package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.uploader.export.IUploaderLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class rtx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile IUploaderLog f27610a;

    public static final int a(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("81145722", new Object[]{new Integer(i), str, str2})).intValue();
        }
        return b(i, str, str2, null);
    }

    public static final int b(int i, String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ecdd4019", new Object[]{new Integer(i), str, str2, th})).intValue();
        }
        if (str != null) {
            str = "<aus>".concat(str);
        }
        IUploaderLog iUploaderLog = f27610a;
        if (iUploaderLog != null) {
            return iUploaderLog.a(i, str, str2, th);
        }
        if ((31 & i) == 0) {
            return 0;
        }
        if (i == 1) {
            if (th != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            return Log.println(2, str, str2);
        } else if (i == 2) {
            if (th != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            return Log.println(3, str, str2);
        } else if (i == 4) {
            if (th != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            return Log.println(4, str, str2);
        } else if (i == 8) {
            if (th != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            return Log.println(5, str, str2);
        } else if (i != 16) {
            return 0;
        } else {
            if (th != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            return Log.println(6, str, str2);
        }
    }

    public static final void c(IUploaderLog iUploaderLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89a58622", new Object[]{iUploaderLog});
        } else {
            f27610a = iUploaderLog;
        }
    }

    public static final boolean d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{new Integer(i)})).booleanValue();
        }
        IUploaderLog iUploaderLog = f27610a;
        if (iUploaderLog != null) {
            return iUploaderLog.isEnabled(i);
        }
        if ((i & 31) != 0) {
            return true;
        }
        return false;
    }
}
