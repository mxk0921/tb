package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class k7r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f22454a;

    static {
        t2o.a(619708660);
        f22454a = false;
        try {
            f22454a = new File(ey1.SWITCH_FILE_DIR, ".tbbrowser_log_open").exists();
        } catch (Throwable unused) {
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
        } else if (f22454a) {
            Log.e(str, str2);
        } else {
            TLog.loge(str, str2);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e38e584", new Object[]{str, str2});
        } else if (f22454a) {
            Log.e(str, str2);
        } else {
            TLog.loge(str, str2);
        }
    }
}
