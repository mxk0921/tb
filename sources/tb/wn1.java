package tb;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class wn1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(676331629);
    }

    public static boolean a(long j, long j2, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e71cad9c", new Object[]{new Long(j), new Long(j2), map})).booleanValue();
        }
        try {
            if (b(bcq.a().e().j())) {
                bcq.a().e().a();
                String a2 = ((t5c) bcq.a()).a();
                if (!TextUtils.isEmpty(a2)) {
                    new tdq(bcq.a(), a2).run();
                }
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47c0377e", new Object[]{context})).booleanValue();
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        String packageName = context.getPackageName();
        int myPid = Process.myPid();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid && packageName.equals(runningAppProcessInfo.processName)) {
                    return true;
                }
            }
        }
        return false;
    }
}
