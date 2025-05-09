package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class v1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81eb2132", new Object[0])).booleanValue();
        }
        return false;
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1175515f", new Object[]{str, str2});
            return;
        }
        try {
            TLog.loge("InformationFlowTBAD", str, str2);
            if (a()) {
                Log.e(str, str2);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void c(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29cf83f6", new Object[]{str, str2, th});
            return;
        }
        try {
            TLog.loge("InformationFlowTBAD", str, str2 + ", error:", th);
            if (a()) {
                Log.e(str, str2 + ", error:", th);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }
}
