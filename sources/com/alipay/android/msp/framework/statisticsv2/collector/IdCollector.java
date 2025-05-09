package com.alipay.android.msp.framework.statisticsv2.collector;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class IdCollector {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
        if (r6.equals("tid") == false) goto L_0x002a;
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
            com.android.alibaba.ip.runtime.IpChange r3 = com.alipay.android.msp.framework.statisticsv2.collector.IdCollector.$ipChange
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
                case -836030906: goto L_0x005a;
                case 114831: goto L_0x0050;
                case 111607168: goto L_0x0044;
                case 607796817: goto L_0x0038;
                case 2063197029: goto L_0x002c;
                default: goto L_0x002a;
            }
        L_0x002a:
            r0 = -1
            goto L_0x0065
        L_0x002c:
            java.lang.String r0 = "imsiAndImei"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0036
            goto L_0x002a
        L_0x0036:
            r0 = 4
            goto L_0x0065
        L_0x0038:
            java.lang.String r0 = "sessionId"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0042
            goto L_0x002a
        L_0x0042:
            r0 = 3
            goto L_0x0065
        L_0x0044:
            java.lang.String r0 = "utdid"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x004e
            goto L_0x002a
        L_0x004e:
            r0 = 2
            goto L_0x0065
        L_0x0050:
            java.lang.String r1 = "tid"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0065
            goto L_0x002a
        L_0x005a:
            java.lang.String r0 = "userId"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0064
            goto L_0x002a
        L_0x0064:
            r0 = 0
        L_0x0065:
            switch(r0) {
                case 0: goto L_0x00ed;
                case 1: goto L_0x00de;
                case 2: goto L_0x00cd;
                case 3: goto L_0x00b4;
                case 4: goto L_0x006a;
                default: goto L_0x0068;
            }
        L_0x0068:
            goto L_0x00f5
        L_0x006a:
            com.alipay.android.msp.framework.helper.GlobalHelper r6 = com.alipay.android.msp.framework.helper.GlobalHelper.getInstance()
            android.content.Context r6 = r6.getContext()
            com.alipay.android.msp.framework.sys.DeviceInfo r7 = com.alipay.android.msp.framework.sys.DeviceInfo.getInstance(r6)
            java.lang.String r7 = r7.getIMSI(r6)
            com.alipay.android.msp.framework.sys.DeviceInfo r0 = com.alipay.android.msp.framework.sys.DeviceInfo.getInstance(r6)
            java.lang.String r6 = r0.getIMEI(r6)
            java.lang.String r0 = "000000000000000"
            boolean r1 = r0.equals(r7)
            java.lang.String r2 = "0"
            if (r1 == 0) goto L_0x008d
            r7 = r2
        L_0x008d:
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0094
            r6 = r2
        L_0x0094:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.String r7 = "|"
            r0.append(r7)
            r0.append(r6)
            r0.append(r7)
            java.lang.String r6 = com.alipay.android.msp.framework.sys.DeviceInfo.getUid()
            r0.append(r6)
            java.lang.String r3 = r0.toString()
            goto L_0x00f5
        L_0x00b4:
            com.alipay.android.msp.core.context.MspContextManager r6 = com.alipay.android.msp.core.context.MspContextManager.getInstance()
            com.alipay.android.msp.core.context.MspContext r6 = r6.getMspContextByBizId(r7)
            if (r6 == 0) goto L_0x00f5
            java.lang.String r7 = r6.getGlobalSession()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x00f5
            java.lang.String r3 = r6.getGlobalSession()
            goto L_0x00f5
        L_0x00cd:
            com.alipay.android.msp.framework.helper.GlobalHelper r6 = com.alipay.android.msp.framework.helper.GlobalHelper.getInstance()
            com.alipay.android.msp.framework.helper.GlobalHelper r7 = com.alipay.android.msp.framework.helper.GlobalHelper.getInstance()
            android.content.Context r7 = r7.getContext()
            java.lang.String r3 = r6.getUtdid(r7)
            goto L_0x00f5
        L_0x00de:
            boolean r6 = com.alipay.android.msp.framework.tid.TidStorage.isInitialized()
            if (r6 == 0) goto L_0x00f5
            com.alipay.android.msp.framework.tid.TidStorage r6 = com.alipay.android.msp.framework.tid.TidStorage.getInstance()
            java.lang.String r3 = r6.getTid()
            goto L_0x00f5
        L_0x00ed:
            com.alipay.android.msp.plugin.engine.IWalletEngine r6 = com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine.getMspWallet()
            java.lang.String r3 = r6.getUserId()
        L_0x00f5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.framework.statisticsv2.collector.IdCollector.collectData(java.lang.String, int):java.lang.String");
    }
}
