package tb;

import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.index.SoInfo2;
import com.taobao.android.remoteso.log.RSoLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class oan {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static int a(cgd cgdVar, z6o z6oVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7dbdd7d4", new Object[]{cgdVar, z6oVar})).intValue();
        }
        String b = z6oVar.b();
        Thread a2 = qbn.a();
        if (Looper.getMainLooper().getThread() == a2) {
            RSoLog.d("puller -> call sync on Main thread, lib=" + b);
            return 1;
        }
        String name = a2.getName();
        if (!trq.e(name) || !name.startsWith("launcher-") || name.split("-").length != 2) {
            long c = cgdVar.c("key_sync_timeout_" + b, 0L);
            if (c > 0) {
                return (int) c;
            }
            SoInfo2 k = z6oVar.k();
            return (k == null || (i = k.ext.syncTimeoutSeconds) == 5) ? (int) cgdVar.c("key_sync_timeout_all", 30L) : i;
        }
        RSoLog.d("puller -> call sync on launcher thread, lib=" + b);
        return 1;
    }

    public static boolean b(SoIndexData soIndexData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64854f57", new Object[]{soIndexData})).booleanValue();
        }
        String appVersion = soIndexData.getAppVersion();
        int[] c = c(appVersion);
        if (c == null || c.length < 3) {
            rbn.e("isUCVerAvailable,error", appVersion);
            return false;
        }
        int[] iArr = {10, 26, 30};
        for (int i = 0; i < 3; i++) {
            int i2 = c[i];
            int i3 = iArr[i];
            if (i2 > i3) {
                return true;
            }
            if (i2 < i3) {
                return false;
            }
        }
        return true;
    }

    public static int[] c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("b35151e9", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        try {
            String[] split = str.split("\\.");
            int[] iArr = new int[split.length];
            for (int i = 0; i < split.length; i++) {
                iArr[i] = Integer.parseInt(split[i]);
            }
            return iArr;
        } catch (Throwable unused) {
            rbn.e("parseSemanticVer", "version = ".concat(str));
            return null;
        }
    }
}
