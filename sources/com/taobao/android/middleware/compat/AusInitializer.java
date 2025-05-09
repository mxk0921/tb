package com.taobao.android.middleware.compat;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import java.io.Serializable;
import mtopsdk.common.util.TBSdkLog;
import tb.rmv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AusInitializer implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "aus.AusInitializer";
    private static String currentUserId;
    private static final BroadcastReceiver loginReceiver = new BroadcastReceiver() { // from class: com.taobao.android.middleware.compat.AusInitializer.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/middleware/compat/AusInitializer$1");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action;
            LoginAction valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null && (valueOf = LoginAction.valueOf((action = intent.getAction()))) != null) {
                TBSdkLog.e(AusInitializer.TAG, "loginAction=" + action);
                int i = b.$SwitchMap$com$taobao$login4android$broadcast$LoginAction[valueOf.ordinal()];
                if (i == 1) {
                    AusInitializer.access$002(Login.getUserId());
                } else if (i == 2) {
                    AusInitializer.access$002(null);
                }
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends rmv {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(AusInitializer ausInitializer, Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/middleware/compat/AusInitializer$2");
        }

        @Override // tb.rmv, com.uploader.export.IUploaderEnvironment
        public String getUserId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
            }
            return AusInitializer.access$000();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$login4android$broadcast$LoginAction;

        static {
            int[] iArr = new int[LoginAction.values().length];
            $SwitchMap$com$taobao$login4android$broadcast$LoginAction = iArr;
            try {
                iArr[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return currentUserId;
    }

    public static /* synthetic */ String access$002(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6fc06fd", new Object[]{str});
        }
        currentUserId = str;
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void init(android.app.Application r11, java.util.HashMap<java.lang.String, java.lang.Object> r12) {
        /*
            r10 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            java.lang.String r3 = "aus.AusInitializer"
            java.lang.String r4 = "parse ParamsMap succeed.params="
            com.android.alibaba.ip.runtime.IpChange r5 = com.taobao.android.middleware.compat.AusInitializer.$ipChange
            boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r6 == 0) goto L_0x001e
            java.lang.String r3 = "dddb138b"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r10
            r4[r1] = r11
            r4[r0] = r12
            r5.ipc$dispatch(r3, r4)
            return
        L_0x001e:
            r5 = 0
            java.lang.String r6 = "envIndex"
            java.lang.Object r6 = r12.get(r6)     // Catch: Exception -> 0x0078
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: Exception -> 0x0078
            int r6 = r6.intValue()     // Catch: Exception -> 0x0078
            java.lang.String r7 = "onlineAppKey"
            java.lang.Object r7 = r12.get(r7)     // Catch: Exception -> 0x0076
            java.lang.String r7 = (java.lang.String) r7     // Catch: Exception -> 0x0076
            java.lang.String r8 = "dailyAppkey"
            java.lang.Object r8 = r12.get(r8)     // Catch: Exception -> 0x0074
            java.lang.String r8 = (java.lang.String) r8     // Catch: Exception -> 0x0074
            java.lang.String r5 = "userId"
            java.lang.Object r5 = r12.get(r5)     // Catch: Exception -> 0x0071
            java.lang.String r5 = (java.lang.String) r5     // Catch: Exception -> 0x0071
            com.taobao.android.middleware.compat.AusInitializer.currentUserId = r5     // Catch: Exception -> 0x0071
            java.lang.String r5 = "isDebuggable"
            java.lang.Object r5 = r12.get(r5)     // Catch: Exception -> 0x0071
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: Exception -> 0x0071
            boolean r5 = r5.booleanValue()     // Catch: Exception -> 0x0071
            mtopsdk.common.util.TBSdkLog$LogEnable r9 = mtopsdk.common.util.TBSdkLog.LogEnable.InfoEnable     // Catch: Exception -> 0x006e
            boolean r9 = mtopsdk.common.util.TBSdkLog.isLogEnable(r9)     // Catch: Exception -> 0x006e
            if (r9 == 0) goto L_0x008f
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: Exception -> 0x006e
            r9.<init>(r4)     // Catch: Exception -> 0x006e
            r9.append(r12)     // Catch: Exception -> 0x006e
            java.lang.String r4 = r9.toString()     // Catch: Exception -> 0x006e
            mtopsdk.common.util.TBSdkLog.i(r3, r4)     // Catch: Exception -> 0x006e
            goto L_0x008f
        L_0x006e:
            r4 = r5
            r5 = r7
            goto L_0x007b
        L_0x0071:
            r5 = r7
        L_0x0072:
            r4 = 0
            goto L_0x007b
        L_0x0074:
            r8 = r5
            goto L_0x0071
        L_0x0076:
            r8 = r5
            goto L_0x0072
        L_0x0078:
            r8 = r5
            r4 = 0
            r6 = 0
        L_0x007b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r9 = "parse ParamsMap error.params="
            r7.<init>(r9)
            r7.append(r12)
            java.lang.String r12 = r7.toString()
            mtopsdk.common.util.TBSdkLog.e(r3, r12)
            r7 = r5
            r5 = r4
        L_0x008f:
            com.uploader.export.UploaderGlobal.g(r11)
            if (r6 != 0) goto L_0x0099
            com.uploader.export.UploaderGlobal.e(r2, r7)
            r0 = 0
            goto L_0x00a3
        L_0x0099:
            if (r6 != r1) goto L_0x00a0
            com.uploader.export.UploaderGlobal.e(r1, r7)
            r0 = 1
            goto L_0x00a3
        L_0x00a0:
            com.uploader.export.UploaderGlobal.e(r0, r8)
        L_0x00a3:
            android.content.Context r11 = com.uploader.export.UploaderGlobal.f()
            com.taobao.android.middleware.compat.AusInitializer$a r12 = new com.taobao.android.middleware.compat.AusInitializer$a
            r12.<init>(r10, r11)
            android.content.BroadcastReceiver r1 = com.taobao.android.middleware.compat.AusInitializer.loginReceiver
            com.taobao.login4android.broadcast.LoginBroadcastHelper.registerLoginReceiver(r11, r1)
            r12.b(r0)
            if (r5 == 0) goto L_0x00cc
            tb.umv r0 = new tb.umv
            r0.<init>()
            r0.c(r2)
            tb.pmv r1 = new tb.pmv
            tb.wmv r2 = new tb.wmv
            r2.<init>()
            r1.<init>(r11, r12, r0, r2)
            com.uploader.export.UploaderGlobal.c(r1)
            goto L_0x00d4
        L_0x00cc:
            tb.pmv r0 = new tb.pmv
            r0.<init>(r11, r12)
            com.uploader.export.UploaderGlobal.c(r0)
        L_0x00d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.middleware.compat.AusInitializer.init(android.app.Application, java.util.HashMap):void");
    }
}
