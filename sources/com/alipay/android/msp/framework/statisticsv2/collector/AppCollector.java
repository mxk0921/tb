package com.alipay.android.msp.framework.statisticsv2.collector;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.framework.statisticsv2.Grammar;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AppCollector {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(int i) {
        Throwable th;
        String str;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35ca8aa", new Object[]{new Integer(i)});
        }
        String str2 = Grammar.ATTR_DEFAULT_VALUE;
        try {
            MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(i);
            if (tradeContextByBizId == null) {
                return str2;
            }
            String orderInfo = tradeContextByBizId.getOrderInfo();
            if (TextUtils.isEmpty(orderInfo)) {
                return str2;
            }
            String[] split = orderInfo.split("&");
            int length = split.length;
            while (true) {
                if (i2 >= length) {
                    str = null;
                    break;
                }
                str = split[i2];
                if (!TextUtils.isEmpty(str) && str.startsWith("bizcontext=")) {
                    break;
                }
                i2++;
            }
            if (str == null) {
                return str2;
            }
            String substring = str.substring(11);
            if (substring.startsWith("\"") && substring.endsWith("\"")) {
                substring = substring.substring(1, substring.length() - 1);
            }
            JSONObject parseObject = JSON.parseObject(substring);
            if (parseObject == null) {
                return str2;
            }
            String string = parseObject.getString("an");
            String string2 = parseObject.getString("av");
            if (TextUtils.isEmpty(string)) {
                return str2;
            }
            try {
                if (TextUtils.isEmpty(string2)) {
                    return string;
                }
                return string + "|" + string2;
            } catch (Throwable th2) {
                th = th2;
                str2 = string;
                LogUtil.printExceptionStackTrace(th);
                return str2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
        if (r6.equals("appName") == false) goto L_0x002a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String collectData(java.lang.String r6, int r7) {
        /*
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.alipay.android.msp.framework.statisticsv2.collector.AppCollector.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001d
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r7)
            java.lang.Object[] r7 = new java.lang.Object[r2]
            r7[r1] = r6
            r7[r0] = r4
            java.lang.String r6 = "ae92bc42"
            java.lang.Object r6 = r3.ipc$dispatch(r6, r7)
            java.lang.String r6 = (java.lang.String) r6
            return r6
        L_0x001d:
            java.lang.String r3 = com.alipay.android.msp.framework.statisticsv2.Grammar.ATTR_DEFAULT_VALUE
            r6.hashCode()
            r4 = -1
            int r5 = r6.hashCode()
            switch(r5) {
                case -1051830678: goto L_0x0057;
                case -794136500: goto L_0x004e;
                case 653717774: goto L_0x0043;
                case 1484112759: goto L_0x0038;
                case 2022955529: goto L_0x002c;
                default: goto L_0x002a;
            }
        L_0x002a:
            r0 = -1
            goto L_0x0062
        L_0x002c:
            java.lang.String r0 = "reserved1"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0036
            goto L_0x002a
        L_0x0036:
            r0 = 4
            goto L_0x0062
        L_0x0038:
            java.lang.String r0 = "appVersion"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0041
            goto L_0x002a
        L_0x0041:
            r0 = 3
            goto L_0x0062
        L_0x0043:
            java.lang.String r0 = "extAppInfo"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x004c
            goto L_0x002a
        L_0x004c:
            r0 = 2
            goto L_0x0062
        L_0x004e:
            java.lang.String r1 = "appName"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0062
            goto L_0x002a
        L_0x0057:
            java.lang.String r0 = "productId"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0061
            goto L_0x002a
        L_0x0061:
            r0 = 0
        L_0x0062:
            switch(r0) {
                case 0: goto L_0x0080;
                case 1: goto L_0x0077;
                case 2: goto L_0x0072;
                case 3: goto L_0x0069;
                case 4: goto L_0x0066;
                default: goto L_0x0065;
            }
        L_0x0065:
            goto L_0x0088
        L_0x0066:
            java.lang.String r3 = com.alipay.android.msp.framework.statisticsv2.Grammar.ATTR_DEFAULT_VALUE
            goto L_0x0088
        L_0x0069:
            com.alipay.android.msp.framework.helper.GlobalHelper r6 = com.alipay.android.msp.framework.helper.GlobalHelper.getInstance()
            java.lang.String r3 = r6.getPackageVersion()
            goto L_0x0088
        L_0x0072:
            java.lang.String r3 = a(r7)
            goto L_0x0088
        L_0x0077:
            com.alipay.android.msp.framework.helper.GlobalHelper r6 = com.alipay.android.msp.framework.helper.GlobalHelper.getInstance()
            java.lang.String r3 = r6.getPackageName()
            goto L_0x0088
        L_0x0080:
            com.alipay.android.msp.plugin.engine.IWalletEngine r6 = com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine.getMspWallet()
            java.lang.String r3 = r6.getProductId()
        L_0x0088:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.framework.statisticsv2.collector.AppCollector.collectData(java.lang.String, int):java.lang.String");
    }
}
