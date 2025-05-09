package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class x45 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053 A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:12:0x002c, B:14:0x0034, B:19:0x003f, B:20:0x0045, B:22:0x0053, B:24:0x005c, B:26:0x0068, B:27:0x006b), top: B:30:0x002c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.app.Application r11, java.util.HashMap<java.lang.String, java.lang.Object> r12) {
        /*
            java.lang.String r0 = "DAUPreTrack"
            com.android.alibaba.ip.runtime.IpChange r1 = tb.x45.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0017
            java.lang.String r0 = "dddb138b"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r11
            r11 = 1
            r2[r11] = r12
            r1.ipc$dispatch(r0, r2)
            return
        L_0x0017:
            java.lang.String r11 = com.taobao.android.launcher.common.LauncherRuntime.c
            java.lang.String r1 = com.taobao.android.launcher.common.LauncherRuntime.b
            boolean r11 = android.text.TextUtils.equals(r11, r1)
            if (r11 != 0) goto L_0x0022
            return
        L_0x0022:
            r11 = 0
            java.lang.String r1 = "disable_ut_pre_track"
            boolean r11 = com.taobao.android.ab.api.ABGlobal.isFeatureOpened(r11, r1)
            if (r11 == 0) goto L_0x002c
            return
        L_0x002c:
            tb.zap r11 = tb.zap.b()     // Catch: Exception -> 0x003d
            android.content.Context r11 = r11.f32654a     // Catch: Exception -> 0x003d
            if (r11 == 0) goto L_0x003f
            tb.zap r11 = tb.zap.b()     // Catch: Exception -> 0x003d
            java.lang.String r11 = r11.c     // Catch: Exception -> 0x003d
            if (r11 != 0) goto L_0x0045
            goto L_0x003f
        L_0x003d:
            r11 = move-exception
            goto L_0x0084
        L_0x003f:
            java.lang.String r11 = "you need init rest send service"
            android.util.Log.e(r0, r11)     // Catch: Exception -> 0x003d
        L_0x0045:
            java.util.HashMap r10 = new java.util.HashMap     // Catch: Exception -> 0x003d
            r10.<init>()     // Catch: Exception -> 0x003d
            java.lang.String r11 = "_is_hl"
            java.lang.String r1 = "0"
            r10.put(r11, r1)     // Catch: Exception -> 0x003d
            if (r12 == 0) goto L_0x006b
            java.lang.String r11 = "launcherType"
            boolean r1 = r12.containsKey(r11)     // Catch: Exception -> 0x003d
            if (r1 == 0) goto L_0x0065
            java.lang.Object r12 = r12.get(r11)     // Catch: Exception -> 0x003d
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch: Exception -> 0x003d
            goto L_0x0068
        L_0x0065:
            java.lang.String r12 = "unknown"
        L_0x0068:
            r10.put(r11, r12)     // Catch: Exception -> 0x003d
        L_0x006b:
            tb.zap r1 = tb.zap.b()     // Catch: Exception -> 0x003d
            long r3 = java.lang.System.currentTimeMillis()     // Catch: Exception -> 0x003d
            java.lang.String r5 = "ut"
            java.lang.String r7 = "app_start"
            java.lang.String r8 = ""
            java.lang.String r9 = ""
            r2 = 0
            r6 = 61004(0xee4c, float:8.5485E-41)
            r1.e(r2, r3, r5, r6, r7, r8, r9, r10)     // Catch: Exception -> 0x003d
            goto L_0x0089
        L_0x0084:
            java.lang.String r12 = "adapter err"
            android.util.Log.e(r0, r12, r11)
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.x45.a(android.app.Application, java.util.HashMap):void");
    }
}
