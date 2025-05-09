package com.taobao.orange.launch;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.orange.a;
import com.taobao.orange.util.OLog;
import java.io.Serializable;
import java.lang.reflect.Method;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TaobaoLaunchOrange implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ORANGE_LOAD_CONFIG = "orange_load_config_optimize_v2";
    private static final String ORANGE_REGEXP = "orange_regexp_optimize";
    private static final String TAG = "TbLaunchOrange";
    private static final String TAOBAO_MAIN_PROCESS = "com.taobao.taobao";

    static {
        t2o.a(613417076);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void init(android.app.Application r9, java.util.HashMap<java.lang.String, java.lang.Object> r10) {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.orange.launch.TaobaoLaunchOrange.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "dddb138b"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r8
            r4[r0] = r9
            r9 = 2
            r4[r9] = r10
            r2.ipc$dispatch(r3, r4)
            return
        L_0x0019:
            java.lang.String r2 = "init start"
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r4 = "TbLaunchOrange"
            com.taobao.orange.util.OLog.e(r4, r2, r3)
            java.lang.String r2 = "21646297"
            java.lang.String r3 = "*"
            com.taobao.orange.OConstant$ENV r5 = com.taobao.orange.OConstant.ENV.ONLINE
            int r6 = r5.getEnvMode()
            java.lang.String r7 = "appVersion"
            java.lang.Object r7 = r10.get(r7)     // Catch: all -> 0x007c
            java.lang.String r7 = (java.lang.String) r7     // Catch: all -> 0x007c
            java.lang.String r3 = "envIndex"
            java.lang.Object r3 = r10.get(r3)     // Catch: all -> 0x0053
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: all -> 0x0053
            int r6 = r3.intValue()     // Catch: all -> 0x0053
            int r3 = r5.getEnvMode()     // Catch: all -> 0x0053
            if (r6 != r3) goto L_0x0056
            java.lang.String r3 = "onlineAppKey"
            java.lang.Object r3 = r10.get(r3)     // Catch: all -> 0x0053
            java.lang.String r3 = (java.lang.String) r3     // Catch: all -> 0x0053
        L_0x0051:
            r2 = r3
            goto L_0x0072
        L_0x0053:
            r10 = move-exception
            r3 = r7
            goto L_0x007d
        L_0x0056:
            com.taobao.orange.OConstant$ENV r3 = com.taobao.orange.OConstant.ENV.PREPARE     // Catch: all -> 0x0053
            int r3 = r3.getEnvMode()     // Catch: all -> 0x0053
            if (r6 != r3) goto L_0x0068
            java.lang.String r3 = "preAppKey"
            java.lang.Object r3 = r10.get(r3)     // Catch: all -> 0x0053
            java.lang.String r3 = (java.lang.String) r3     // Catch: all -> 0x0053
            goto L_0x0051
        L_0x0068:
            java.lang.String r3 = "dailyAppkey"
            java.lang.Object r3 = r10.get(r3)     // Catch: all -> 0x0053
            java.lang.String r3 = (java.lang.String) r3     // Catch: all -> 0x0053
            goto L_0x0051
        L_0x0072:
            java.lang.String r3 = "process"
            java.lang.Object r10 = r10.get(r3)     // Catch: all -> 0x0053
            java.lang.String r10 = (java.lang.String) r10     // Catch: all -> 0x0053
            goto L_0x0087
        L_0x007c:
            r10 = move-exception
        L_0x007d:
            java.lang.String r5 = "init"
            java.lang.Object[] r7 = new java.lang.Object[r1]
            com.taobao.orange.util.OLog.e(r4, r5, r10, r7)
            r10 = 0
            r7 = r3
        L_0x0087:
            java.lang.String r3 = "com.taobao.taobao"
            boolean r10 = r3.equals(r10)
            if (r10 == 0) goto L_0x0093
            r8.initABGlobal(r9)
        L_0x0093:
            com.taobao.orange.OConfig$Builder r10 = new com.taobao.orange.OConfig$Builder
            r10.<init>()
            com.taobao.orange.OConfig$Builder r10 = r10.setAppKey(r2)
            com.taobao.orange.OConfig$Builder r10 = r10.setAppVersion(r7)
            com.taobao.orange.OConfig$Builder r10 = r10.setEnv(r6)
            com.taobao.orange.OConstant$SERVER r2 = com.taobao.orange.OConstant.SERVER.TAOBAO
            int r2 = r2.ordinal()
            com.taobao.orange.OConfig$Builder r10 = r10.setServerType(r2)
            com.taobao.orange.OConstant$UPDMODE r2 = com.taobao.orange.OConstant.UPDMODE.O_XMD
            int r2 = r2.ordinal()
            com.taobao.orange.OConfig$Builder r10 = r10.setIndexUpdateMode(r2)
            com.taobao.orange.OConfig$Builder r10 = r10.setReportAck(r1)
            com.taobao.orange.OConfig$Builder r10 = r10.setStatUsedConfig(r0)
            r1 = -1
            com.taobao.orange.OConfig$Builder r10 = r10.setTime(r1)
            com.taobao.orange.OConfig$Builder r10 = r10.setEnableDiffIndex(r0)
            com.taobao.orange.OConfig r10 = r10.build()
            com.taobao.orange.OrangeConfig r0 = com.taobao.orange.OrangeConfig.getInstance()
            r0.init(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.orange.launch.TaobaoLaunchOrange.init(android.app.Application, java.util.HashMap):void");
    }

    private void initABGlobal(Context context) {
        try {
            Method method = ABGlobal.class.getMethod("isFeatureOpened", Context.class, String.class);
            a.z = ((Boolean) method.invoke(ABGlobal.class, context, ORANGE_REGEXP)).booleanValue();
            a.A = ((Boolean) method.invoke(ABGlobal.class, context, ORANGE_LOAD_CONFIG)).booleanValue();
            OLog.e(TAG, "initABGlobal", "regexpOptimize", Boolean.valueOf(a.z), "loadConfigOptimize", Boolean.valueOf(a.A));
        } catch (Throwable th) {
            OLog.e(TAG, "initABGlobal error.", "error", th.getMessage());
        }
    }
}
