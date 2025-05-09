package tb;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.utl.ALog;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class bzv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile String f16744a;
    public static volatile String b;

    static {
        t2o.a(343932997);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d997d830", new Object[0]);
        }
        if (f16744a != null) {
            return f16744a;
        }
        try {
            ComponentName componentName = new ComponentName(re.r(), "com.taobao.accs.AccsIPCProvider");
            PackageManager packageManager = re.r().getPackageManager();
            if (packageManager != null) {
                f16744a = packageManager.getProviderInfo(componentName, 0).processName;
            }
        } catch (Exception e) {
            ALog.e("Utils", "getCoreProviderProcess", e, new Object[0]);
        }
        return f16744a;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fbba16cd", new Object[0]);
        }
        if (b != null) {
            return b;
        }
        b = h5d.f();
        return b;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ca293d1", new Object[0])).booleanValue();
        }
        return b().endsWith(":channel");
    }

    public static boolean d() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad903fdd", new Object[0])).booleanValue();
        }
        String a2 = a();
        if (TextUtils.isEmpty(a2) || (runningAppProcesses = GlobalClientInfo.getInstance(re.r()).getActivityManager().getRunningAppProcesses()) == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.processName.equals(a2)) {
                return true;
            }
        }
        return false;
    }
}
