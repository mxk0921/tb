package com.alipay.android.msp.utils;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class EventLogUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BIZ_TYPE = "pay";
    private static final String BIZ_TYPE_PAYIMP = "payimp";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class SpecificEvent {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static void wearableUsage(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52e35459", new Object[]{str});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("value", str);
            EventLogUtil.logPayEvent("1010970", hashMap);
        }
    }

    public static Map<String, String> getLocalInvokeInfoForAppInvoke(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d8431f97", new Object[]{bundle});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("ts_scheme_invoked", String.valueOf(SystemClock.elapsedRealtime()));
        try {
            String string = bundle.getString("mqpLoc");
            if (!TextUtils.isEmpty(string)) {
                JSONObject parseObject = JSON.parseObject(string);
                for (String str : parseObject.keySet()) {
                    hashMap.put(str, parseObject.getString(str));
                }
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return hashMap;
    }

    public static void logPayEvent(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6109585e", new Object[]{str, map});
        } else {
            PhoneCashierMspEngine.getMspLog().walletEventLog(str, "pay", map);
        }
    }

    public static void logPayImpEvent(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d98c702", new Object[]{str, map});
        } else {
            PhoneCashierMspEngine.getMspLog().walletEventLog(str, BIZ_TYPE_PAYIMP, map);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
        if (r13.equals("destroy") == false) goto L_0x003f;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void walletSpmTrack(java.lang.Object r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.util.Map<java.lang.String, java.lang.String> r12, java.lang.String r13) {
        /*
            r0 = 3
            r1 = 1
            r2 = 0
            r3 = 2
            com.android.alibaba.ip.runtime.IpChange r4 = com.alipay.android.msp.utils.EventLogUtil.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0024
            java.lang.String r5 = "368a90"
            r6 = 7
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r2] = r7
            r6[r1] = r8
            r6[r3] = r9
            r6[r0] = r10
            r7 = 4
            r6[r7] = r11
            r7 = 5
            r6[r7] = r12
            r7 = 6
            r6[r7] = r13
            r4.ipc$dispatch(r5, r6)
            return
        L_0x0024:
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            if (r10 != 0) goto L_0x0033
            int r9 = java.lang.Integer.parseInt(r9)     // Catch: NumberFormatException -> 0x002f
            goto L_0x0034
        L_0x002f:
            r9 = move-exception
            com.alipay.android.msp.utils.LogUtil.printExceptionStackTrace(r9)
        L_0x0033:
            r9 = 2
        L_0x0034:
            r13.hashCode()
            r10 = -1
            int r4 = r13.hashCode()
            switch(r4) {
                case -1926005497: goto L_0x0060;
                case -1352294148: goto L_0x0055;
                case 94750088: goto L_0x004a;
                case 1557372922: goto L_0x0041;
                default: goto L_0x003f;
            }
        L_0x003f:
            r0 = -1
            goto L_0x006a
        L_0x0041:
            java.lang.String r1 = "destroy"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x006a
            goto L_0x003f
        L_0x004a:
            java.lang.String r0 = "click"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto L_0x0053
            goto L_0x003f
        L_0x0053:
            r0 = 2
            goto L_0x006a
        L_0x0055:
            java.lang.String r0 = "create"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto L_0x005e
            goto L_0x003f
        L_0x005e:
            r0 = 1
            goto L_0x006a
        L_0x0060:
            java.lang.String r0 = "exposure"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto L_0x0069
            goto L_0x003f
        L_0x0069:
            r0 = 0
        L_0x006a:
            switch(r0) {
                case 0: goto L_0x0080;
                case 1: goto L_0x0079;
                case 2: goto L_0x0075;
                case 3: goto L_0x006e;
                default: goto L_0x006d;
            }
        L_0x006d:
            goto L_0x0083
        L_0x006e:
            com.alipay.android.phone.wallet.spmtracker.SpmTracker.onPagePause(r7, r11, r8, r12)
            com.alipay.android.phone.wallet.spmtracker.SpmTracker.onPageDestroy(r7)
            return
        L_0x0075:
            com.alipay.android.phone.wallet.spmtracker.SpmTracker.click(r7, r11, r8, r9, r12)
            return
        L_0x0079:
            com.alipay.android.phone.wallet.spmtracker.SpmTracker.onPageCreate(r7, r11)
            com.alipay.android.phone.wallet.spmtracker.SpmTracker.onPageResume(r7, r11)
            return
        L_0x0080:
            com.alipay.android.phone.wallet.spmtracker.SpmTracker.expose(r7, r11, r8, r9, r12)
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.utils.EventLogUtil.walletSpmTrack(java.lang.Object, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.lang.String):void");
    }

    public static void logPayEvent(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cfaad78", new Object[]{str, strArr});
        } else {
            logPayEvent(str, buildEventParams(strArr));
        }
    }

    public static Map<String, String> buildEventParams(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("21a00f3b", new Object[]{strArr});
        }
        if (strArr == null || strArr.length <= 0) {
            return new HashMap();
        }
        if (strArr.length % 2 == 0) {
            HashMap hashMap = new HashMap();
            for (int i = 0; i < strArr.length; i += 2) {
                hashMap.put(strArr[i], strArr[i + 1]);
            }
            return hashMap;
        }
        throw new RuntimeException("params 必须为双数");
    }

    public static void logPayEvent(String str, Pair<String, String>... pairArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbaa2ec", new Object[]{str, pairArr});
            return;
        }
        HashMap hashMap = new HashMap();
        if (pairArr != null && pairArr.length > 0) {
            for (Pair<String, String> pair : pairArr) {
                hashMap.put((String) pair.first, (String) pair.second);
            }
        }
        logPayEvent(str, hashMap);
    }
}
