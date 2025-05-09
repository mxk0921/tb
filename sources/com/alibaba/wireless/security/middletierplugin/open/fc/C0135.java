package com.alibaba.wireless.security.middletierplugin.open.fc;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.SystemClock;
import android.util.Base64;
import com.alibaba.wireless.security.framework.utils.UserTrackMethodJniBridge;
import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;
import org.webrtc.EglBase;

/* renamed from: com.alibaba.wireless.security.middletierplugin.open.fc.а  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0135 {

    /* renamed from: а  reason: contains not printable characters */
    private static volatile int f166 = 0;

    /* renamed from: б  reason: contains not printable characters */
    private static ISecurityGuardPlugin f167 = null;

    /* renamed from: в  reason: contains not printable characters */
    public static volatile Handler f168 = null;

    /* renamed from: г  reason: contains not printable characters */
    public static final int f169 = 1;

    /* renamed from: д  reason: contains not printable characters */
    public static final int f170 = 2;

    /* renamed from: е  reason: contains not printable characters */
    public static final int f171 = 4;

    /* renamed from: ж  reason: contains not printable characters */
    public static final int f172 = 7;

    /* renamed from: ё  reason: contains not printable characters */
    public static final int f173 = 3;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.alibaba.wireless.security.middletierplugin.open.fc.а$а  reason: contains not printable characters */
    /* loaded from: classes.dex */
    public static class RunnableC0136 implements Runnable {

        /* renamed from: а  reason: contains not printable characters */
        final /* synthetic */ int f174;

        /* renamed from: б  reason: contains not printable characters */
        final /* synthetic */ int f175;

        /* renamed from: в  reason: contains not printable characters */
        final /* synthetic */ long f176;

        /* renamed from: г  reason: contains not printable characters */
        final /* synthetic */ String f177;

        /* renamed from: д  reason: contains not printable characters */
        final /* synthetic */ String f178;

        /* renamed from: е  reason: contains not printable characters */
        final /* synthetic */ String f179;

        /* renamed from: ж  reason: contains not printable characters */
        final /* synthetic */ String f180;

        /* renamed from: з  reason: contains not printable characters */
        final /* synthetic */ boolean f181;

        /* renamed from: ё  reason: contains not printable characters */
        final /* synthetic */ String f182;

        RunnableC0136(int i, int i2, long j, String str, String str2, String str3, String str4, String str5, boolean z) {
            this.f174 = i;
            this.f175 = i2;
            this.f176 = j;
            this.f177 = str;
            this.f178 = str2;
            this.f179 = str3;
            this.f182 = str4;
            this.f180 = str5;
            this.f181 = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0135.m132(this.f174, this.f175, this.f176, this.f177, this.f178, this.f179, this.f182, this.f180, this.f181);
        }
    }

    /* renamed from: а  reason: contains not printable characters */
    public static void m122() {
        try {
            f167.getRouter().doCommand(70503, new Object[0]);
        } catch (Exception e) {
            String str = "deleteSampleLog : " + e.getMessage();
        }
    }

    /* renamed from: б  reason: contains not printable characters */
    private static int m123() {
        if (f166 == 0) {
            synchronized (C0135.class) {
                if (f166 == 0) {
                    try {
                        f166 = Process.myPid();
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return f166;
    }

    /* renamed from: в  reason: contains not printable characters */
    public static void m124(ISecurityGuardPlugin iSecurityGuardPlugin) {
        f167 = iSecurityGuardPlugin;
    }

    /* renamed from: г  reason: contains not printable characters */
    public static int m125() {
        int i = 2;
        try {
            if (f167 != null) {
                i = ((Integer) f167.getRouter().doCommand(EglBase.EGL_RECORDABLE_ANDROID, new Object[0])).intValue();
                String str = "BXLOG isBackground ret1 = : " + i;
            }
        } catch (Exception e) {
            String str2 = "isBackground : " + e.getMessage();
        }
        String str3 = "isBackground ret2 = : " + i;
        return i + 1;
    }

    /* renamed from: д  reason: contains not printable characters */
    public static int m126(Context context) {
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
            if (runningAppProcessInfo.processName.equals(context.getPackageName())) {
                return runningAppProcessInfo.importance == 400 ? 1 : 0;
            }
        }
        return 99;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c A[RETURN] */
    /* renamed from: е  reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m127(int r4, java.util.HashMap r5) {
        /*
            java.lang.String r0 = "bx-action"
            r1 = 1
            r2 = 0
            if (r5 == 0) goto L_0x0021
            boolean r3 = r5.containsKey(r0)     // Catch: Exception -> 0x002c
            if (r3 == 0) goto L_0x0021
            java.lang.Object r5 = r5.get(r0)     // Catch: Exception -> 0x002c
            if (r4 != 0) goto L_0x0015
            java.lang.String r5 = (java.lang.String) r5     // Catch: Exception -> 0x002c
            goto L_0x0023
        L_0x0015:
            if (r4 != r1) goto L_0x0021
            java.util.List r5 = (java.util.List) r5     // Catch: Exception -> 0x002c
            java.lang.Object r4 = r5.get(r2)     // Catch: Exception -> 0x002c
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5     // Catch: Exception -> 0x002c
            goto L_0x0023
        L_0x0021:
            java.lang.String r5 = ""
        L_0x0023:
            java.lang.String r4 = "sample"
            boolean r4 = r4.equals(r5)     // Catch: Exception -> 0x002c
            if (r4 == 0) goto L_0x002c
            return r1
        L_0x002c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.middletierplugin.open.fc.C0135.m127(int, java.util.HashMap):boolean");
    }

    /* renamed from: ж  reason: contains not printable characters */
    public static void m128(int i, int i2, long j, String str, String str2, String str3, String str4, String str5) {
        m129("{mn:" + i + ",ec:" + i2 + ",msg:" + str + ",tc:" + j + ",cp:" + str2 + ",ext:" + str3 + ",sid:" + str4 + ",bxuid:" + str5 + "}");
    }

    /* renamed from: з  reason: contains not printable characters */
    public static void m129(String str) {
        try {
            f167.getRouter().doCommand(70501, new String(Base64.encode(("BXREPORT=1|BackGroud=" + m125() + "|BackGroundNew=" + m126(f167.getContext()) + "|Pid=" + m123() + "|Content=" + str).getBytes(), 0)));
        } catch (Exception e) {
            String str2 = "reportBy9006Impl : " + e.getMessage();
        }
    }

    /* renamed from: и  reason: contains not printable characters */
    public static void m130(int i, int i2, long j, String str, String str2, String str3, String str4, String str5) {
        UserTrackMethodJniBridge.addUtRecord("" + i, i2, 7, FCComponent.getPluginVersion(), j, "BXREPORT=1|BackGroud=" + m125() + "|BackGroundNew=" + m126(f167.getContext()) + "|Pid=" + m123() + "|Errmsg=" + str, str2, str3, str4, str5);
    }

    /* renamed from: й  reason: contains not printable characters */
    public static int m131(String str, boolean z) {
        try {
            String str2 = "";
            String str3 = "saveAndReportLocalLogBy9006---> content = " + str;
            if (str != null && !str.isEmpty()) {
                str2 = new String(Base64.encode(("BXREPORT=2|BackGroud=" + m125() + "|BackGroundNew=" + m126(f167.getContext()) + "|Pid=" + m123() + "|Content=" + str).getBytes(), 0));
            }
            return ((Integer) f167.getRouter().doCommand(70502, str2, Boolean.valueOf(z))).intValue();
        } catch (Exception e) {
            String str4 = "reportBy9006Impl : " + e.getMessage();
            return -1;
        }
    }

    /* renamed from: к  reason: contains not printable characters */
    public static void m132(int i, int i2, long j, String str, String str2, String str3, String str4, String str5, boolean z) {
        m131("{mn:" + i + ",ec:" + i2 + ",msg:" + str + ",tc:" + j + ",cp:" + str2 + ",ext:" + str3 + ",sid:" + str4 + ",bxuid:" + str5 + "}", z);
    }

    /* renamed from: л  reason: contains not printable characters */
    public static int m133() {
        return m131("", true);
    }

    /* renamed from: м  reason: contains not printable characters */
    public static void m134(boolean z, int i, String str) {
        try {
            String str2 = "[UIBridge] start updating sampling status is status=" + i + " isSample=" + z + " bxuuid=" + str;
            if (f167 != null && z) {
                f167.getRouter().doCommand(71501, Integer.valueOf(i), Long.valueOf(SystemClock.elapsedRealtime()), str);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: н  reason: contains not printable characters */
    public static void m135(String str) {
        try {
            if (f167 != null) {
                f167.getRouter().doCommand(70505, str);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: ё  reason: contains not printable characters */
    public static void m136(int i, int i2, long j, String str, String str2, String str3, String str4, String str5, int i3, boolean z) {
        if ((i3 & 1) == 1) {
            try {
                m130(i, i2, j, str, str2, str3, str4, str5);
            } catch (Exception e) {
                String str6 = "makeBXMutiReport : " + e.getMessage();
                return;
            }
        }
        if ((i3 & 2) == 2) {
            m128(i, i2, j, str, str2, str3, str4, str5);
        }
        if ((i3 & 4) == 4) {
            if (f168 == null) {
                synchronized (C0135.class) {
                    if (f168 == null) {
                        HandlerThread handlerThread = new HandlerThread("FC-SampleHandler");
                        handlerThread.start();
                        f168 = new Handler(handlerThread.getLooper());
                    }
                }
            }
            if (f168 != null) {
                f168.post(new RunnableC0136(i, i2, j, str, str2, str3, str4, str5, z));
            }
        }
    }
}
