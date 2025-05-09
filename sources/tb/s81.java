package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class s81 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468714538);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
        r2 = r2.get(0).topActivity;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(android.content.Context r4) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.s81.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "509d6eac"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r4
            java.lang.Object r4 = r2.ipc$dispatch(r3, r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L_0x0019:
            java.lang.String r2 = "activity"
            java.lang.Object r2 = r4.getSystemService(r2)
            android.app.ActivityManager r2 = (android.app.ActivityManager) r2
            java.util.List r2 = r2.getRunningTasks(r1)
            if (r2 == 0) goto L_0x0048
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x0048
            java.lang.Object r2 = r2.get(r0)
            android.app.ActivityManager$RunningTaskInfo r2 = (android.app.ActivityManager.RunningTaskInfo) r2
            android.content.ComponentName r2 = tb.fl4.a(r2)
            if (r2 == 0) goto L_0x0048
            java.lang.String r2 = r2.getPackageName()
            java.lang.String r4 = r4.getPackageName()
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L_0x0048
            r0 = 1
        L_0x0048:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.s81.a(android.content.Context):boolean");
    }
}
