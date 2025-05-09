package tb;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.ProcedureGlobal;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class yym {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f32422a;

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb57e867", new Object[0]);
        }
        Context a2 = ProcedureGlobal.f().a();
        if (TextUtils.isEmpty(f32422a)) {
            String c = c();
            if (TextUtils.isEmpty(c) && a2 != null) {
                c = b(a2);
            }
            f32422a = c;
        }
        return f32422a;
    }

    public static String b(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("590f51c6", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        String str = f32422a;
        if (str != null) {
            return str;
        }
        int myPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return null;
        }
        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
        while (true) {
            if (it.hasNext()) {
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next != null && next.pid == myPid) {
                    f32422a = next.processName;
                    break;
                }
            } else {
                break;
            }
        }
        return f32422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String c() {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.yym.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L_0x0012
            java.lang.String r1 = "3646280"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object r0 = r0.ipc$dispatch(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0012:
            int r0 = android.os.Process.myPid()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "/proc/"
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r0 = "/cmdline"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]
            r3 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: all -> 0x0042, Exception -> 0x0044
            r4.<init>(r0)     // Catch: all -> 0x0042, Exception -> 0x0044
            int r0 = r4.read(r1)     // Catch: all -> 0x003d, Exception -> 0x0040
            r4.close()     // Catch: Exception -> 0x003b
            goto L_0x0055
        L_0x003b:
            goto L_0x0055
        L_0x003d:
            r0 = move-exception
            r3 = r4
            goto L_0x0047
        L_0x0040:
            goto L_0x004d
        L_0x0042:
            r0 = move-exception
            goto L_0x0047
        L_0x0044:
            r4 = r3
            goto L_0x004d
        L_0x0047:
            if (r3 == 0) goto L_0x004c
            r3.close()     // Catch: Exception -> 0x004c
        L_0x004c:
            throw r0
        L_0x004d:
            if (r4 == 0) goto L_0x0054
            r4.close()     // Catch: Exception -> 0x0053
            goto L_0x0054
        L_0x0053:
        L_0x0054:
            r0 = 0
        L_0x0055:
            if (r0 <= 0) goto L_0x0060
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1, r2, r0)
            java.lang.String r3 = r3.trim()
        L_0x0060:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.yym.c():java.lang.String");
    }
}
