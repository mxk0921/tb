package com.alipay.android.msp.drivers.stores.store.metaevents;

import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MetaExitStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public MetaExitStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(MetaExitStore metaExitStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/metaevents/MetaExitStore");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
        if (r11.equals("exitall") == false) goto L_0x004b;
     */
    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String onMspAction(com.alipay.android.msp.drivers.actions.EventAction r10, com.alipay.android.msp.drivers.actions.EventAction.MspEvent r11) {
        /*
            r9 = this;
            java.lang.String r0 = "exit"
            r1 = 2
            r2 = 1
            r3 = 3
            r4 = 0
            com.android.alibaba.ip.runtime.IpChange r5 = com.alipay.android.msp.drivers.stores.store.metaevents.MetaExitStore.$ipChange
            boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r6 == 0) goto L_0x001d
            java.lang.String r0 = "719dcfee"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r4] = r9
            r3[r2] = r10
            r3[r1] = r11
            java.lang.Object r10 = r5.ipc$dispatch(r0, r3)
            java.lang.String r10 = (java.lang.String) r10
            return r10
        L_0x001d:
            android.content.Context r5 = r9.mContext
            r6 = 0
            if (r5 == 0) goto L_0x00cf
            com.alipay.android.msp.core.context.MspContext r5 = r9.mMspContext
            if (r5 != 0) goto L_0x0028
            goto L_0x00cf
        L_0x0028:
            com.alibaba.fastjson.JSONObject r11 = r11.getActionParamsJson()
            java.lang.String r5 = "mode"
            java.lang.String r11 = r11.getString(r5)
            boolean r5 = android.text.TextUtils.isEmpty(r11)
            if (r5 == 0) goto L_0x003a
            r11 = r0
        L_0x003a:
            int r10 = r10.getLogFieldEndCode()
            r11.hashCode()
            java.lang.String r5 = "clientEndCode"
            r7 = -1
            int r8 = r11.hashCode()
            switch(r8) {
                case -2121918006: goto L_0x006a;
                case -1838715472: goto L_0x005f;
                case -1315388477: goto L_0x0056;
                case 3127582: goto L_0x004d;
                default: goto L_0x004b;
            }
        L_0x004b:
            r1 = -1
            goto L_0x0074
        L_0x004d:
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x0054
            goto L_0x004b
        L_0x0054:
            r1 = 3
            goto L_0x0074
        L_0x0056:
            java.lang.String r0 = "exitall"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x0074
            goto L_0x004b
        L_0x005f:
            java.lang.String r0 = "exitallresume"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x0068
            goto L_0x004b
        L_0x0068:
            r1 = 1
            goto L_0x0074
        L_0x006a:
            java.lang.String r0 = "exitonly"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x0073
            goto L_0x004b
        L_0x0073:
            r1 = 0
        L_0x0074:
            switch(r1) {
                case 0: goto L_0x00a7;
                case 1: goto L_0x0093;
                case 2: goto L_0x0078;
                case 3: goto L_0x0078;
                default: goto L_0x0077;
            }
        L_0x0077:
            goto L_0x00cf
        L_0x0078:
            if (r10 == 0) goto L_0x008b
            com.alipay.android.msp.core.context.MspContext r11 = r9.mMspContext
            if (r11 == 0) goto L_0x008b
            com.alipay.android.msp.framework.statisticsv2.StatisticInfo r11 = r11.getStatisticInfo()
            com.alipay.android.msp.framework.statisticsv2.Vector r0 = com.alipay.android.msp.framework.statisticsv2.Vector.Result
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r11.updateAttr(r0, r5, r10)
        L_0x008b:
            com.alipay.android.msp.core.context.MspContext r10 = r9.mMspContext
            if (r10 == 0) goto L_0x00cf
            r10.exit(r4)
            goto L_0x00cf
        L_0x0093:
            com.alipay.android.msp.core.context.MspContext r10 = r9.mMspContext
            if (r10 == 0) goto L_0x00cf
            com.alipay.android.msp.core.clients.MspUIClient r10 = r10.getMspUIClient()
            if (r10 == 0) goto L_0x00cf
            com.alipay.android.msp.core.context.MspContext r10 = r9.mMspContext
            com.alipay.android.msp.core.clients.MspUIClient r10 = r10.getMspUIClient()
            r10.disposeUI()
            goto L_0x00cf
        L_0x00a7:
            if (r10 == 0) goto L_0x00ba
            com.alipay.android.msp.core.context.MspContext r11 = r9.mMspContext
            if (r11 == 0) goto L_0x00ba
            com.alipay.android.msp.framework.statisticsv2.StatisticInfo r11 = r11.getStatisticInfo()
            com.alipay.android.msp.framework.statisticsv2.Vector r0 = com.alipay.android.msp.framework.statisticsv2.Vector.Result
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r11.updateAttr(r0, r5, r10)
        L_0x00ba:
            com.alipay.android.msp.core.context.MspTradeContext r10 = r9.mMspTradeContext
            if (r10 == 0) goto L_0x00cf
            com.alipay.android.msp.pay.results.MspPayResult r10 = r10.getMspPayResult()
            java.lang.String r11 = "exitMode"
            java.lang.String r0 = "noCallback"
            r10.addExtendInfoByKeyAndValue(r11, r0)
            com.alipay.android.msp.core.context.MspContext r10 = r9.mMspContext
            r10.exit(r4)
        L_0x00cf:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.drivers.stores.store.metaevents.MetaExitStore.onMspAction(com.alipay.android.msp.drivers.actions.EventAction, com.alipay.android.msp.drivers.actions.EventAction$MspEvent):java.lang.String");
    }
}
