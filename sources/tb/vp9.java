package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vp9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f30158a = true;
    public static final boolean b;

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
        } else if (!f30158a) {
        } else {
            if (b) {
                Log.e(str, str2);
            } else {
                TLog.logd("linkManager", str, str2);
            }
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
        } else if (!f30158a) {
        } else {
            if (b) {
                Log.e(str, str2);
            } else {
                TLog.loge("linkManager", str, str2);
            }
        }
    }

    public static void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7ecb12e", new Object[]{new Boolean(z)});
        } else {
            f30158a = z;
        }
    }

    static {
        t2o.a(467664980);
        try {
            b = new File(ey1.SWITCH_FILE_DIR, "tao_link_log_open").exists();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
