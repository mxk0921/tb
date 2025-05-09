package tb;

import android.app.ActivityManager;
import android.app.Application;
import android.os.Process;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class n4f extends mss {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public n4f(String str) {
        super(str);
        i(true);
    }

    public static /* synthetic */ Object ipc$super(n4f n4fVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/InitProcessInfos");
    }

    @Override // tb.mss
    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c246ea2", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.mss
    public void p(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ea6706", new Object[]{this, application, hashMap});
            return;
        }
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) application.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid) {
                    String str = runningAppProcessInfo.processName;
                    if (!str.equals(application.getPackageName() + ":safemode")) {
                        String str2 = runningAppProcessInfo.processName;
                        if (!str2.equals(application.getPackageName() + ":watchdog")) {
                            return;
                        }
                    }
                }
                if (runningAppProcessInfo.uid == myUid && runningAppProcessInfo.pid != myPid) {
                    String str3 = runningAppProcessInfo.processName;
                    if (str3.equals(application.getPackageName() + ":safemode")) {
                        Process.killProcess(myPid);
                    }
                }
            }
        }
    }
}
