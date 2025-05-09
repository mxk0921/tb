package com.taobao.accs.init;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.ALog;
import java.io.Serializable;
import java.util.HashMap;
import tb.brt;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class Launcher_Login implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(343933125);
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        ALog.i("Launcher_Login", "login", new Object[0]);
        brt.b(new a(hashMap, application));
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HashMap f6064a;
        public final /* synthetic */ Application b;

        public a(HashMap hashMap, Application application) {
            this.f6064a = hashMap;
            this.b = application;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0069 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:26:0x005c, B:27:0x0063, B:29:0x0069, B:32:0x0075), top: B:35:0x005c }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r7 = this;
                r0 = 0
                r1 = 1
                java.lang.String r2 = "Launcher_Login"
                com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.accs.init.Launcher_Login.a.$ipChange
                boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r4 == 0) goto L_0x0014
                java.lang.String r2 = "5c510192"
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r0] = r7
                r3.ipc$dispatch(r2, r1)
                return
            L_0x0014:
                r3 = 0
                java.util.HashMap r4 = r7.f6064a     // Catch: all -> 0x0059
                java.lang.String r5 = "envIndex"
                java.lang.Object r4 = r4.get(r5)     // Catch: all -> 0x0059
                java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: all -> 0x0059
                int r4 = r4.intValue()     // Catch: all -> 0x0059
                java.util.HashMap r5 = r7.f6064a     // Catch: all -> 0x0059
                java.lang.String r6 = "onlineAppKey"
                java.lang.Object r5 = r5.get(r6)     // Catch: all -> 0x0059
                java.lang.String r5 = (java.lang.String) r5     // Catch: all -> 0x0059
                if (r4 != r1) goto L_0x003f
                java.util.HashMap r3 = r7.f6064a     // Catch: all -> 0x003d
                java.lang.String r4 = "preAppKey"
                java.lang.Object r3 = r3.get(r4)     // Catch: all -> 0x003d
                java.lang.String r3 = (java.lang.String) r3     // Catch: all -> 0x003d
            L_0x003b:
                r5 = r3
                goto L_0x0063
            L_0x003d:
                r3 = move-exception
                goto L_0x005c
            L_0x003f:
                r3 = 2
                if (r4 != r3) goto L_0x0044
                r3 = 1
                goto L_0x0045
            L_0x0044:
                r3 = 0
            L_0x0045:
                r6 = 3
                if (r4 != r6) goto L_0x004a
                r4 = 1
                goto L_0x004b
            L_0x004a:
                r4 = 0
            L_0x004b:
                r3 = r3 | r4
                if (r3 == 0) goto L_0x0063
                java.util.HashMap r3 = r7.f6064a     // Catch: all -> 0x003d
                java.lang.String r4 = "dailyAppkey"
                java.lang.Object r3 = r3.get(r4)     // Catch: all -> 0x003d
                java.lang.String r3 = (java.lang.String) r3     // Catch: all -> 0x003d
                goto L_0x003b
            L_0x0059:
                r4 = move-exception
                r5 = r3
                r3 = r4
            L_0x005c:
                java.lang.String r4 = "login get param error"
                java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch: all -> 0x0073
                com.taobao.accs.utl.ALog.e(r2, r4, r3, r6)     // Catch: all -> 0x0073
            L_0x0063:
                boolean r3 = android.text.TextUtils.isEmpty(r5)     // Catch: all -> 0x0073
                if (r3 == 0) goto L_0x0075
                java.lang.String r3 = "login get appkey null"
                java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch: all -> 0x0073
                com.taobao.accs.utl.ALog.e(r2, r3, r4)     // Catch: all -> 0x0073
                java.lang.String r5 = "21646297"
                goto L_0x0075
            L_0x0073:
                r1 = move-exception
                goto L_0x00ac
            L_0x0075:
                android.app.Application r3 = r7.b     // Catch: all -> 0x0073
                com.taobao.accs.init.Launcher_InitAccs.mContext = r3     // Catch: all -> 0x0073
                com.taobao.accs.init.Launcher_InitAccs.mAppkey = r5     // Catch: all -> 0x0073
                com.taobao.accs.init.Launcher_InitAccs.mForceBindUser = r1     // Catch: all -> 0x0073
                java.util.HashMap r1 = r7.f6064a     // Catch: all -> 0x0073
                java.lang.String r3 = "userId"
                java.lang.Object r1 = r1.get(r3)     // Catch: all -> 0x0073
                java.lang.String r1 = (java.lang.String) r1     // Catch: all -> 0x0073
                com.taobao.accs.init.Launcher_InitAccs.mUserId = r1     // Catch: all -> 0x0073
                java.util.HashMap r1 = r7.f6064a     // Catch: all -> 0x0073
                java.lang.String r3 = "sid"
                java.lang.Object r1 = r1.get(r3)     // Catch: all -> 0x0073
                java.lang.String r1 = (java.lang.String) r1     // Catch: all -> 0x0073
                com.taobao.accs.init.Launcher_InitAccs.mSid = r1     // Catch: all -> 0x0073
                com.taobao.accs.ACCSClient r1 = com.taobao.accs.ACCSClient.getAccsClient()     // Catch: all -> 0x0073
                java.util.HashMap r3 = r7.f6064a     // Catch: all -> 0x0073
                java.lang.String r4 = "ttid"
                java.lang.Object r3 = r3.get(r4)     // Catch: all -> 0x0073
                java.lang.String r3 = (java.lang.String) r3     // Catch: all -> 0x0073
                com.taobao.accs.IAppReceiver r4 = com.taobao.accs.init.Launcher_InitAccs.mAppReceiver     // Catch: all -> 0x0073
                r1.bindApp(r3, r4)     // Catch: all -> 0x0073
                goto L_0x00b3
            L_0x00ac:
                java.lang.String r3 = "login"
                java.lang.Object[] r0 = new java.lang.Object[r0]
                com.taobao.accs.utl.ALog.e(r2, r3, r1, r0)
            L_0x00b3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.init.Launcher_Login.a.run():void");
        }
    }
}
