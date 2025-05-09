package com.alibaba.wireless.security.open.middletier;

import com.alibaba.security.wukong.pipe.RiskDataPipeManager;
import com.alibaba.wireless.security.framework.IRouterComponent;
import com.alibaba.wireless.security.open.SecException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MidBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static IRouterComponent f3437a;
    private static volatile int b;
    private static volatile int c;

    static {
        t2o.a(659554377);
    }

    private static Object a(int i, String str, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("92142f18", new Object[]{new Integer(i), str, new Integer(i2), obj});
        }
        try {
            return f3437a.doCommand(13204, Integer.valueOf(i), str, Integer.valueOf(i2), obj);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static HashMap<String, Object> adf0mn(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("ca5781a1", new Object[]{hashMap});
        }
        try {
            return (HashMap) f3437a.doCommand(71801, hashMap);
        } catch (Exception e) {
            HashMap<String, Object> hashMap2 = new HashMap<>();
            hashMap2.put("e", 1);
            if (e instanceof SecException) {
                hashMap2.put(RiskDataPipeManager.PIPE_RESULT_ERROR_CODE_KEY, Integer.valueOf(((SecException) e).getErrorCode()));
            }
            return hashMap2;
        }
    }

    public static int getAndroid14Switch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("908838ea", new Object[0])).intValue();
        }
        return c;
    }

    public static int getWvmlfcdmSwitch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("99000a88", new Object[0])).intValue();
        }
        return b;
    }

    public static int kwdaol(String str, long j, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eb5e6164", new Object[]{str, new Long(j), new Boolean(z), str2})).intValue();
        }
        try {
            return ((Integer) f3437a.doCommand(71803, str, Long.valueOf(j), Boolean.valueOf(z), str2)).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void init(com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin r4) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.alibaba.wireless.security.open.middletier.MidBridge.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0012
            java.lang.String r3 = "86399bfe"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r4
            r2.ipc$dispatch(r3, r1)
            return
        L_0x0012:
            com.alibaba.wireless.security.framework.IRouterComponent r4 = r4.getRouter()
            com.alibaba.wireless.security.open.middletier.MidBridge.f3437a = r4
            java.lang.String r4 = "wvmlfcdm"
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch: Exception -> 0x0031
            java.lang.Object r4 = a(r0, r4, r0, r3)     // Catch: Exception -> 0x0031
            java.lang.String r3 = "atsk14"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: Exception -> 0x002f
            java.lang.Object r2 = a(r0, r3, r0, r1)     // Catch: Exception -> 0x002f
            goto L_0x0036
        L_0x002f:
            r0 = move-exception
            goto L_0x0033
        L_0x0031:
            r0 = move-exception
            r4 = r2
        L_0x0033:
            r0.printStackTrace()
        L_0x0036:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x0042
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            com.alibaba.wireless.security.open.middletier.MidBridge.b = r4
        L_0x0042:
            boolean r4 = r2 instanceof java.lang.Integer
            if (r4 == 0) goto L_0x004e
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r4 = r2.intValue()
            com.alibaba.wireless.security.open.middletier.MidBridge.c = r4
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.open.middletier.MidBridge.init(com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin):void");
    }
}
