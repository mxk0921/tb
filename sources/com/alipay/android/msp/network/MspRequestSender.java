package com.alipay.android.msp.network;

import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.network.model.ReqData;
import com.alipay.android.msp.network.model.RequestConfig;
import com.alipay.android.msp.network.model.ResData;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class MspRequestSender {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final MspTradeContext f3702a;

    /* compiled from: Taobao */
    /* renamed from: com.alipay.android.msp.network.MspRequestSender$2  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$com$alipay$android$msp$network$Protocol;

        static {
            int[] iArr = new int[Protocol.values().length];
            $SwitchMap$com$alipay$android$msp$network$Protocol = iArr;
            try {
                iArr[Protocol.RPC_V1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$network$Protocol[Protocol.RPC_V2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$network$Protocol[Protocol.RPC_V3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$network$Protocol[Protocol.RPC_SDK_V3.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$network$Protocol[Protocol.HTTP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public MspRequestSender(MspTradeContext mspTradeContext) {
        LogUtil.record(2, "MspRequestSender", "MspRequestSender", String.format("constructed with %s", mspTradeContext));
        this.f3702a = mspTradeContext;
    }

    public static ResData<Map<String, String>> a(ReqData<Map<String, String>> reqData, int i, StEvent stEvent) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResData) ipChange.ipc$dispatch("dac0455e", new Object[]{reqData, new Integer(i), stEvent});
        }
        try {
            MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(i);
            if (tradeContextByBizId == null || tradeContextByBizId.getTradeLogicData() == null) {
                return null;
            }
            return PluginManager.getPbChannel().requestByPbv1(reqData, tradeContextByBizId.getTradeLogicData().getRequestConfig());
        } catch (Throwable th) {
            if (stEvent != null) {
                stEvent.onStatistic(StEvent.NET_COST, "");
            }
            throw th;
        }
    }

    public static /* synthetic */ MspTradeContext access$000(MspRequestSender mspRequestSender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspTradeContext) ipChange.ipc$dispatch("6933f2e3", new Object[]{mspRequestSender});
        }
        return mspRequestSender.f3702a;
    }

    public final ResData c(ReqData reqData, Protocol protocol, int i, RequestConfig requestConfig) throws Exception {
        StEvent stEvent;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResData) ipChange.ipc$dispatch("8beef2b4", new Object[]{this, reqData, protocol, new Integer(i), requestConfig});
        }
        if (requestConfig != null) {
            try {
                if (requestConfig.isFirstRequest()) {
                    PhoneCashierMspEngine.getMspWallet().startSpiderSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "FIRST_REQUEST_doSendReqData");
                }
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
        ResData resData = null;
        if (requestConfig != null) {
            stEvent = requestConfig.getStatisticEvent();
            if (stEvent != null) {
                stEvent.onStatistic("actionType", requestConfig.getMiniDispatchType());
            }
        } else {
            stEvent = null;
        }
        if (requestConfig != null && requestConfig.isFirstRequest()) {
            PhoneCashierMspEngine.getMspWallet().endSpiderSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "FIRST_REQUEST_doSendReqData");
        }
        int i2 = AnonymousClass2.$SwitchMap$com$alipay$android$msp$network$Protocol[protocol.ordinal()];
        if (i2 == 1) {
            resData = a(reqData, i, stEvent);
        } else if (i2 == 2 || i2 == 3 || i2 == 4) {
            if (requestConfig == null || !requestConfig.isFirstRequest()) {
                z = false;
            }
            resData = b(reqData, i, z, stEvent);
        } else if (i2 == 5) {
            MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(i);
            if (!(tradeContextByBizId == null || tradeContextByBizId.getTradeLogicData() == null)) {
                resData = PluginManager.getTransChannel().requestData(reqData, tradeContextByBizId.getTradeLogicData().getRequestConfig());
            }
        } else {
            throw new RuntimeException("Unknown protocol: ".concat(String.valueOf(protocol)));
        }
        if (resData != null) {
            resData.mReqData = reqData;
        }
        return resData;
    }

    public final String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        int bizId = this.f3702a.getBizId();
        return "<MspRequestSender of trade " + bizId + ">";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0249 A[Catch: all -> 0x0222, TryCatch #11 {all -> 0x0222, blocks: (B:89:0x0206, B:96:0x022d, B:98:0x0235, B:100:0x0241, B:103:0x0249, B:104:0x024e, B:106:0x025c, B:108:0x0266, B:110:0x027c, B:113:0x0289, B:114:0x028d, B:91:0x0215), top: B:202:0x0206 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x025c A[Catch: all -> 0x0222, TryCatch #11 {all -> 0x0222, blocks: (B:89:0x0206, B:96:0x022d, B:98:0x0235, B:100:0x0241, B:103:0x0249, B:104:0x024e, B:106:0x025c, B:108:0x0266, B:110:0x027c, B:113:0x0289, B:114:0x028d, B:91:0x0215), top: B:202:0x0206 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0289 A[Catch: all -> 0x0222, TryCatch #11 {all -> 0x0222, blocks: (B:89:0x0206, B:96:0x022d, B:98:0x0235, B:100:0x0241, B:103:0x0249, B:104:0x024e, B:106:0x025c, B:108:0x0266, B:110:0x027c, B:113:0x0289, B:114:0x028d, B:91:0x0215), top: B:202:0x0206 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x033b A[Catch: all -> 0x02eb, TRY_LEAVE, TryCatch #7 {all -> 0x02eb, blocks: (B:134:0x02e7, B:139:0x02f3, B:140:0x030c, B:142:0x0317, B:144:0x033b), top: B:197:0x0297 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x034f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x036d A[Catch: all -> 0x0359, TryCatch #5 {all -> 0x0359, blocks: (B:149:0x034b, B:152:0x0351, B:155:0x035c, B:157:0x036d, B:159:0x037a, B:161:0x037e, B:164:0x0385, B:166:0x0389, B:168:0x038d, B:171:0x0392, B:172:0x03ac, B:173:0x03c5, B:175:0x03c9, B:177:0x03d5, B:179:0x03e7), top: B:194:0x034b }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0389 A[Catch: all -> 0x0359, TryCatch #5 {all -> 0x0359, blocks: (B:149:0x034b, B:152:0x0351, B:155:0x035c, B:157:0x036d, B:159:0x037a, B:161:0x037e, B:164:0x0385, B:166:0x0389, B:168:0x038d, B:171:0x0392, B:172:0x03ac, B:173:0x03c5, B:175:0x03c9, B:177:0x03d5, B:179:0x03e7), top: B:194:0x034b }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03c9 A[Catch: all -> 0x0359, TryCatch #5 {all -> 0x0359, blocks: (B:149:0x034b, B:152:0x0351, B:155:0x035c, B:157:0x036d, B:159:0x037a, B:161:0x037e, B:164:0x0385, B:166:0x0389, B:168:0x038d, B:171:0x0392, B:172:0x03ac, B:173:0x03c5, B:175:0x03c9, B:177:0x03d5, B:179:0x03e7), top: B:194:0x034b }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0406 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0185 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0299 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f0 A[Catch: all -> 0x0076, TRY_ENTER, TryCatch #3 {all -> 0x0076, blocks: (B:7:0x003e, B:10:0x006c, B:12:0x0072, B:16:0x007a, B:18:0x0080, B:19:0x0083, B:21:0x0089, B:22:0x008c, B:24:0x0092, B:25:0x0095, B:26:0x0098, B:28:0x00a8, B:31:0x00af, B:33:0x00b5, B:35:0x00bb, B:37:0x00c1, B:38:0x00c6, B:40:0x00cc, B:41:0x00d1, B:43:0x00d7, B:44:0x00dc, B:45:0x00e7, B:48:0x00f0, B:50:0x00f4, B:52:0x00f8, B:55:0x00fd, B:56:0x0117, B:57:0x0130, B:58:0x0137), top: B:190:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b8 A[Catch: all -> 0x0194, TryCatch #1 {all -> 0x0194, blocks: (B:74:0x0185, B:77:0x019d, B:79:0x01b8, B:80:0x01ca, B:82:0x01e8, B:84:0x01ec, B:86:0x01f8, B:87:0x01fb), top: B:186:0x0185 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f8 A[Catch: all -> 0x0194, TryCatch #1 {all -> 0x0194, blocks: (B:74:0x0185, B:77:0x019d, B:79:0x01b8, B:80:0x01ca, B:82:0x01e8, B:84:0x01ec, B:86:0x01f8, B:87:0x01fb), top: B:186:0x0185 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0215 A[Catch: all -> 0x021d, TRY_ENTER, TRY_LEAVE, TryCatch #11 {all -> 0x0222, blocks: (B:89:0x0206, B:96:0x022d, B:98:0x0235, B:100:0x0241, B:103:0x0249, B:104:0x024e, B:106:0x025c, B:108:0x0266, B:110:0x027c, B:113:0x0289, B:114:0x028d, B:91:0x0215), top: B:202:0x0206 }] */
    /* JADX WARN: Type inference failed for: r12v15, types: [long] */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void request(com.alipay.android.msp.network.model.NetRequestData r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 1035
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.network.MspRequestSender.request(com.alipay.android.msp.network.model.NetRequestData, boolean):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:111|18|(3:99|20|(19:22|(1:27)|95|28|29|109|30|31|105|32|39|(2:44|(1:46)(2:47|48))|51|(1:56)|57|58|63|(1:66)|67))|25|(0)|95|28|29|109|30|31|105|32|39|(3:41|44|(0)(0))|51|(2:53|56)|57|58|63|(1:66)|67) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ca, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cc, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cd, code lost:
        r18 = com.alipay.android.msp.constants.MspFlybirdDefine.SYNC_MUTEX;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d0, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d1, code lost:
        r17 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d4, code lost:
        com.alipay.android.msp.utils.LogUtil.printExceptionStackTrace(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0116, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b2, code lost:
        if (r4.getMspNetHandler().isShowSyncPayResult() != false) goto L_0x01b4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c0, code lost:
        if (r0.isExit() != false) goto L_0x01b4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c3, code lost:
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x017e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e A[Catch: all -> 0x0085, TRY_LEAVE, TryCatch #2 {all -> 0x0085, blocks: (B:20:0x0076, B:27:0x008e), top: B:99:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd A[Catch: all -> 0x0116, TryCatch #4 {all -> 0x0116, blocks: (B:38:0x00d4, B:39:0x00d7, B:41:0x00dd, B:44:0x00e9, B:47:0x010a, B:48:0x0115, B:51:0x0119, B:53:0x011f, B:56:0x0126, B:57:0x0131), top: B:104:0x00d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010a A[Catch: all -> 0x0116, TryCatch #4 {all -> 0x0116, blocks: (B:38:0x00d4, B:39:0x00d7, B:41:0x00dd, B:44:0x00e9, B:47:0x010a, B:48:0x0115, B:51:0x0119, B:53:0x011f, B:56:0x0126, B:57:0x0131), top: B:104:0x00d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011f A[Catch: all -> 0x0116, TryCatch #4 {all -> 0x0116, blocks: (B:38:0x00d4, B:39:0x00d7, B:41:0x00dd, B:44:0x00e9, B:47:0x010a, B:48:0x0115, B:51:0x0119, B:53:0x011f, B:56:0x0126, B:57:0x0131), top: B:104:0x00d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0152 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.alipay.android.msp.network.model.ResData<java.util.Map<java.lang.String, java.lang.String>> b(com.alipay.android.msp.network.model.ReqData<java.util.Map<java.lang.String, java.lang.String>> r20, int r21, boolean r22, com.alipay.android.msp.framework.statisticsv2.model.StEvent r23) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.network.MspRequestSender.b(com.alipay.android.msp.network.model.ReqData, int, boolean, com.alipay.android.msp.framework.statisticsv2.model.StEvent):com.alipay.android.msp.network.model.ResData");
    }
}
