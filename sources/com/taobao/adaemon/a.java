package com.taobao.adaemon;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.LocalProcessMonitor;
import com.taobao.atools.StaticHook;
import com.xiaomi.mipush.sdk.Constants;
import java.util.List;
import mtopsdk.common.util.SymbolExpUtil;
import tb.p01;
import tb.r01;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(349175816);
    }

    public static String a(Context context, String str) {
        String description;
        String str2;
        long timestamp;
        int pid;
        int realUid;
        String processName;
        int reason;
        int importance;
        long pss;
        long rss;
        int status;
        int pid2;
        String description2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dfcf1ffd", new Object[]{context, str});
        }
        ApplicationExitInfo d = d(context, str);
        LocalProcessMonitor.k kVar = null;
        if (d == null) {
            return null;
        }
        description = d.getDescription();
        if (TextUtils.isEmpty(description)) {
            str2 = "";
        } else {
            description2 = d.getDescription();
            str2 = description2.replaceAll(SymbolExpUtil.SYMBOL_VERTICALBAR, Constants.WAVE_SEPARATOR);
        }
        if (g.Q(context)) {
            kVar = LocalProcessMonitor.h0().d0();
        }
        StringBuilder sb = new StringBuilder(1024);
        timestamp = d.getTimestamp();
        sb.append(timestamp);
        sb.append("|");
        pid = d.getPid();
        sb.append(pid);
        sb.append("|");
        realUid = d.getRealUid();
        sb.append(realUid);
        sb.append("|");
        processName = d.getProcessName();
        sb.append(processName);
        sb.append("|");
        reason = d.getReason();
        sb.append(reason);
        sb.append("|");
        sb.append(c(d));
        sb.append("|");
        importance = d.getImportance();
        sb.append(importance);
        sb.append("|");
        pss = d.getPss();
        sb.append(pss);
        sb.append("|");
        rss = d.getRss();
        sb.append(rss);
        sb.append("|");
        status = d.getStatus();
        sb.append(status);
        sb.append("|");
        sb.append(g.W(str2));
        if (kVar != null) {
            int i = kVar.f6125a;
            pid2 = d.getPid();
            if (i == pid2) {
                sb.append("|");
                sb.append(kVar.h);
                sb.append("|");
                sb.append(g.W(kVar.b));
                sb.append("|");
                sb.append(kVar.f);
                sb.append("|");
                sb.append(kVar.g);
                sb.append("|");
                sb.append(g.W(kVar.c));
                sb.append("|");
                sb.append(g.W(kVar.d));
                sb.append("|v1-");
                sb.append(g.W(kVar.e));
            }
        }
        return sb.toString();
    }

    public static int c(ApplicationExitInfo applicationExitInfo) {
        try {
            return ((Integer) StaticHook.g(r01.a(), "getSubReason", new Class[0]).invoke(applicationExitInfo, new Object[0])).intValue();
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static ApplicationExitInfo d(Context context, String str) {
        List<Object> historicalProcessExitReasons;
        String processName;
        long timestamp;
        long timestamp2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return p01.a(ipChange.ipc$dispatch("8dbec00e", new Object[]{context, str}));
        }
        historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(context.getPackageName(), 0, 16);
        ApplicationExitInfo applicationExitInfo = null;
        for (Object obj : historicalProcessExitReasons) {
            ApplicationExitInfo a2 = p01.a(obj);
            processName = a2.getProcessName();
            if (str.equals(processName)) {
                if (applicationExitInfo != null) {
                    timestamp = a2.getTimestamp();
                    timestamp2 = applicationExitInfo.getTimestamp();
                    if (timestamp > timestamp2) {
                    }
                }
                applicationExitInfo = a2;
            }
        }
        return applicationExitInfo;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:
        if (r8.equals("OPPO") == false) goto L_0x0059;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long b(android.content.Context r14, java.lang.String r15) {
        /*
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.adaemon.a.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001c
            java.lang.String r4 = "da393f9d"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r14
            r2[r0] = r15
            java.lang.Object r14 = r3.ipc$dispatch(r4, r2)
            java.lang.Number r14 = (java.lang.Number) r14
            long r14 = r14.longValue()
            return r14
        L_0x001c:
            android.app.ApplicationExitInfo r14 = d(r14, r15)
            r3 = 0
            if (r14 != 0) goto L_0x0025
            return r3
        L_0x0025:
            int r15 = tb.o01.a(r14)
            int r5 = c(r14)
            java.lang.String r6 = tb.s01.a(r14)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 == 0) goto L_0x0038
            return r3
        L_0x0038:
            java.lang.String r7 = "remove task"
            boolean r8 = r6.contains(r7)
            if (r8 == 0) goto L_0x0046
            long r14 = tb.t01.a(r14)
            return r14
        L_0x0046:
            java.lang.String r8 = android.os.Build.BRAND
            r8.hashCode()
            r9 = 21
            java.lang.String r10 = "iAwareF[SystemManager]"
            r11 = 10
            r12 = -1
            int r13 = r8.hashCode()
            switch(r13) {
                case -1675632421: goto L_0x0086;
                case 2432928: goto L_0x007d;
                case 3620012: goto L_0x0071;
                case 68924490: goto L_0x0066;
                case 2141820391: goto L_0x005b;
                default: goto L_0x0059;
            }
        L_0x0059:
            r0 = -1
            goto L_0x0090
        L_0x005b:
            java.lang.String r0 = "HUAWEI"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0064
            goto L_0x0059
        L_0x0064:
            r0 = 4
            goto L_0x0090
        L_0x0066:
            java.lang.String r0 = "HONOR"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x006f
            goto L_0x0059
        L_0x006f:
            r0 = 3
            goto L_0x0090
        L_0x0071:
            java.lang.String r0 = "vivo"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x007b
            goto L_0x0059
        L_0x007b:
            r0 = 2
            goto L_0x0090
        L_0x007d:
            java.lang.String r1 = "OPPO"
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto L_0x0090
            goto L_0x0059
        L_0x0086:
            java.lang.String r0 = "Xiaomi"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x008f
            goto L_0x0059
        L_0x008f:
            r0 = 0
        L_0x0090:
            switch(r0) {
                case 0: goto L_0x00c4;
                case 1: goto L_0x00b7;
                case 2: goto L_0x00aa;
                case 3: goto L_0x009f;
                case 4: goto L_0x0094;
                default: goto L_0x0093;
            }
        L_0x0093:
            goto L_0x00d4
        L_0x0094:
            if (r15 != r11) goto L_0x00d4
            if (r5 != 0) goto L_0x00d4
            boolean r15 = r6.contains(r10)
            if (r15 == 0) goto L_0x00d4
            goto L_0x00d0
        L_0x009f:
            if (r15 != r11) goto L_0x00d4
            if (r5 != r9) goto L_0x00d4
            boolean r15 = r6.contains(r10)
            if (r15 == 0) goto L_0x00d4
            goto L_0x00d0
        L_0x00aa:
            if (r15 != r11) goto L_0x00d4
            if (r5 != 0) goto L_0x00d4
            java.lang.String r15 = "due to single-cleaner"
            boolean r15 = r6.contains(r15)
            if (r15 == 0) goto L_0x00d4
            goto L_0x00d0
        L_0x00b7:
            if (r15 != r11) goto L_0x00d4
            r15 = 22
            if (r5 != r15) goto L_0x00d4
            boolean r15 = r6.contains(r7)
            if (r15 == 0) goto L_0x00d4
            goto L_0x00d0
        L_0x00c4:
            if (r15 != r11) goto L_0x00d4
            if (r5 != r9) goto L_0x00d4
            java.lang.String r15 = "due to SwipeUpClean"
            boolean r15 = r6.contains(r15)
            if (r15 == 0) goto L_0x00d4
        L_0x00d0:
            long r3 = tb.t01.a(r14)
        L_0x00d4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.adaemon.a.b(android.content.Context, java.lang.String):long");
    }
}
