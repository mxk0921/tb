package com.alipay.android.msp.framework.statisticsv2.collector;

import android.text.TextUtils;
import android.widget.Toast;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.context.MspContainerContext;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.alipay.android.msp.framework.dns.storage.DnsPreference;
import com.alipay.android.msp.framework.dynfun.DynConstants;
import com.alipay.android.msp.framework.dynfun.NativeDynFunManager;
import com.alipay.android.msp.framework.statisticsv2.Grammar;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.sdk.app.statistic.StatisticRecord;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URLDecoder;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TradeCollector {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_PAY_AND_SIGN_FROM_OUT_SDK = "payandsign_sdk";
    public static final String KEY_BIZ_TYPE = "biz_type";
    public static final String KEY_TRADE_NO = "trade_no";
    public static final String KEY_TRADE_OUT_TRADE_NO = "out_trade_no";
    public static final String KEY_TRADE_PARTNER = "partner";

    /* compiled from: Taobao */
    /* renamed from: com.alipay.android.msp.framework.statisticsv2.collector.TradeCollector$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class AnonymousClass1 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String val$finalDebugInfo;
        public final /* synthetic */ MspTradeContext val$mspTradeContext;

        public AnonymousClass1(MspTradeContext mspTradeContext, String str) {
            this.val$mspTradeContext = mspTradeContext;
            this.val$finalDebugInfo = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                Toast.makeText(this.val$mspTradeContext.getContext(), this.val$finalDebugInfo, 1).show();
            }
        }
    }

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97bfdb2c", new Object[]{new Integer(i)});
        }
        String str = Grammar.ATTR_DEFAULT_VALUE;
        try {
            MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(i);
            if (mspContextByBizId == null || TextUtils.isEmpty(mspContextByBizId.getTradeNo())) {
                return str;
            }
            return mspContextByBizId.getTradeNo();
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return str;
        }
    }

    public static String b(int i) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1f1746d", new Object[]{new Integer(i)});
        }
        String str = Grammar.ATTR_DEFAULT_VALUE;
        try {
            MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(i);
            if (tradeContextByBizId == null) {
                return str;
            }
            String str2 = tradeContextByBizId.getOrderInfoMap().get("out_trade_no");
            try {
                String str3 = !TextUtils.isEmpty(tradeContextByBizId.getOrderInfoMap().get("ord_id_ext")) ? tradeContextByBizId.getOrderInfoMap().get("ord_id_ext") : str2;
                return (!TextUtils.isEmpty(str3) || tradeContextByBizId.getOrderInfoMap().get(StatisticRecord.KEY_BIZ_CONTENT) == null) ? str3 : new JSONObject(URLDecoder.decode(tradeContextByBizId.getOrderInfoMap().get(StatisticRecord.KEY_BIZ_CONTENT), "utf-8")).optString("out_trade_no", Grammar.ATTR_DEFAULT_VALUE);
            } catch (Throwable th2) {
                th = th2;
                str = str2;
                LogUtil.printExceptionStackTrace(th);
                return str;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static String c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2c230dae", new Object[]{new Integer(i)});
        }
        String str = Grammar.ATTR_DEFAULT_VALUE;
        try {
            MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(i);
            return tradeContextByBizId != null ? tradeContextByBizId.getOrderInfoMap().get("user_id") : str;
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return str;
        }
    }

    public static String d(int i) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7654a6ef", new Object[]{new Integer(i)});
        }
        String str = Grammar.ATTR_DEFAULT_VALUE;
        try {
            MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(i);
            if (tradeContextByBizId == null) {
                return str;
            }
            String str2 = tradeContextByBizId.getOrderInfoMap().get("partner");
            try {
                return (!TextUtils.isEmpty(str2) || tradeContextByBizId.getOrderInfoMap().get(StatisticRecord.KEY_BIZ_CONTENT) == null) ? str2 : new JSONObject(URLDecoder.decode(tradeContextByBizId.getOrderInfoMap().get(StatisticRecord.KEY_BIZ_CONTENT), "utf-8")).optString("seller_id", Grammar.ATTR_DEFAULT_VALUE);
            } catch (Throwable th2) {
                th = th2;
                str = str2;
                LogUtil.printExceptionStackTrace(th);
                return str;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static String e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c0864030", new Object[]{new Integer(i)});
        }
        String str = Grammar.ATTR_DEFAULT_VALUE;
        try {
            MspContextManager.getInstance().getTradeContextByBizId(i);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return str;
    }

    public static String f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ab7d971", new Object[]{new Integer(i)});
        }
        String str = Grammar.ATTR_DEFAULT_VALUE;
        try {
            MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(i);
            if (tradeContextByBizId == null) {
                return str;
            }
            String orderInfo = tradeContextByBizId.getOrderInfo();
            if (orderInfo.contains("h5_route_token")) {
                return "3";
            }
            if (!orderInfo.contains("and_lite")) {
                return str;
            }
            if (orderInfo.contains(MspGlobalDefine.H5_TO_NATIVE)) {
                return "2";
            }
            return "1";
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return str;
        }
    }

    public static String getBizType(int i) {
        Throwable th;
        final String str = "render";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2672a03b", new Object[]{new Integer(i)});
        }
        str = Grammar.ATTR_DEFAULT_VALUE;
        try {
            MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(i);
            if (tradeContextByBizId == null) {
                LogUtil.record(2, "TradeCollector:getBizType", "mspTradeContext=null");
                MspContainerContext renderContextByBizId = MspContextManager.getInstance().getRenderContextByBizId(i);
                if (renderContextByBizId != null && !TextUtils.isEmpty(renderContextByBizId.getStatsBizType())) {
                    return renderContextByBizId.getStatsBizType();
                }
                LogUtil.record(2, "TradeCollector:getBizType", "mspContext=null");
                return "default";
            }
            String orderInfo = tradeContextByBizId.getOrderInfo();
            if (TextUtils.isEmpty(orderInfo)) {
                LogUtil.record(2, "TradeCollector:getBizType", "orderInfo=".concat(String.valueOf(orderInfo)));
                return "default";
            }
            if (tradeContextByBizId.getOrderInfoMap() != null) {
                str = tradeContextByBizId.getOrderInfoMap().get("biz_type");
            }
            if (TextUtils.isEmpty(str)) {
                str = Grammar.ATTR_DEFAULT_VALUE;
            }
            Map<String, String> orderInfoMap = tradeContextByBizId.getOrderInfoMap();
            if (orderInfoMap != null) {
                if (!TextUtils.isEmpty(orderInfoMap.get("ord_id_ext"))) {
                    str = "out_trade_12306";
                }
                String str2 = orderInfoMap.get("apiname");
                if (TextUtils.equals(str2, "com.alipay.paypwd.validate")) {
                    str = "openservice_pwd";
                } else if (TextUtils.equals(str2, "com.alipay.account.auth")) {
                    str = "openservice_auth";
                }
                if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(orderInfoMap.get("master_order_no"))) {
                    try {
                        String str3 = orderInfoMap.get("product_code");
                        if (!TextUtils.isEmpty(str3)) {
                            str = "out_trade_".concat(String.valueOf(str3));
                        } else {
                            str = "out_trade";
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        str = "out_trade";
                        LogUtil.printExceptionStackTrace(th);
                        return str;
                    }
                }
                String str4 = orderInfoMap.get("biz_scene");
                if (!TextUtils.isEmpty(str4)) {
                    str = str + "#" + str4;
                }
            }
            if (orderInfo.contains(MspGlobalDefine.H5_TO_NATIVE)) {
                str = "out_trade_h5tonative";
            }
            if (orderInfo.startsWith("render:")) {
                str = orderInfo.substring(7);
            }
            if (!orderInfo.equals(str)) {
            }
            try {
                if (orderInfo.contains("msp_fork_action")) {
                    str = MspEventTypes.ACTION_STRING_FORK;
                }
                if (orderInfo.contains("new_external_info") && (orderInfo.contains("alipay.acquire.page.createandpay") || orderInfo.contains("alipay.trade.page.pay"))) {
                    str = "pay_and_deduct";
                }
                if (orderInfo.contains("alipay.trade.app.pay") && orderInfo.contains("agreement_sign_params")) {
                    str = BIZ_PAY_AND_SIGN_FROM_OUT_SDK;
                }
                if (orderInfo.contains("payService=\"litePay\"")) {
                    str = "lite_pay";
                }
                if (TextUtils.equals(str, Grammar.ATTR_DEFAULT_VALUE) && (orderInfo.contains("h5_route_token") || orderInfo.contains("and_lite"))) {
                    str = "out_trade";
                }
                if (TextUtils.equals(str, Grammar.ATTR_DEFAULT_VALUE) && orderInfo.contains("out_trade_no")) {
                    str = "out_trade";
                }
                if (TextUtils.equals(str, Grammar.ATTR_DEFAULT_VALUE) && (orderInfo.contains("trade_no") || orderInfo.startsWith("new_external_info=="))) {
                    str = DnsPreference.KEY_TRADE;
                }
                String str5 = (String) NativeDynFunManager.processWithFallbackSync(i, DynConstants.DynFunNames.F_BIZ_TYPE_FOR_LOG, new Object[]{str}, new NativeDynFunManager.FallbackFunction<String>() { // from class: com.alipay.android.msp.framework.statisticsv2.collector.TradeCollector.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.android.msp.framework.dynfun.NativeDynFunManager.FallbackFunction
                    public String call() {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("5fe77b5b", new Object[]{this}) : str;
                    }
                });
                try {
                    LogUtil.i("TradeCollector", "getBizType", str5);
                    return str5;
                } catch (Throwable th3) {
                    th = th3;
                    str = str5;
                    LogUtil.printExceptionStackTrace(th);
                    return str;
                }
            } catch (Throwable th4) {
                th = th4;
                str = str;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
        if (r6.equals("outTradeType") == false) goto L_0x002a;
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
            com.android.alibaba.ip.runtime.IpChange r3 = com.alipay.android.msp.framework.statisticsv2.collector.TradeCollector.$ipChange
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
                case -1795632125: goto L_0x0071;
                case -1205441776: goto L_0x0067;
                case -1067371963: goto L_0x005b;
                case -786908336: goto L_0x004f;
                case -457119977: goto L_0x0043;
                case -97599763: goto L_0x0038;
                case 202511836: goto L_0x002c;
                default: goto L_0x002a;
            }
        L_0x002a:
            r0 = -1
            goto L_0x007c
        L_0x002c:
            java.lang.String r0 = "processTime"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0036
            goto L_0x002a
        L_0x0036:
            r0 = 6
            goto L_0x007c
        L_0x0038:
            java.lang.String r0 = "bizType"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0041
            goto L_0x002a
        L_0x0041:
            r0 = 5
            goto L_0x007c
        L_0x0043:
            java.lang.String r0 = "outTradeNo"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x004d
            goto L_0x002a
        L_0x004d:
            r0 = 4
            goto L_0x007c
        L_0x004f:
            java.lang.String r0 = "payerId"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0059
            goto L_0x002a
        L_0x0059:
            r0 = 3
            goto L_0x007c
        L_0x005b:
            java.lang.String r0 = "tradeNo"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0065
            goto L_0x002a
        L_0x0065:
            r0 = 2
            goto L_0x007c
        L_0x0067:
            java.lang.String r1 = "outTradeType"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x007c
            goto L_0x002a
        L_0x0071:
            java.lang.String r0 = "partnerId"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x007b
            goto L_0x002a
        L_0x007b:
            r0 = 0
        L_0x007c:
            switch(r0) {
                case 0: goto L_0x009e;
                case 1: goto L_0x0099;
                case 2: goto L_0x0094;
                case 3: goto L_0x008f;
                case 4: goto L_0x008a;
                case 5: goto L_0x0085;
                case 6: goto L_0x0080;
                default: goto L_0x007f;
            }
        L_0x007f:
            goto L_0x00a2
        L_0x0080:
            java.lang.String r3 = e(r7)
            goto L_0x00a2
        L_0x0085:
            java.lang.String r3 = getBizType(r7)
            goto L_0x00a2
        L_0x008a:
            java.lang.String r3 = b(r7)
            goto L_0x00a2
        L_0x008f:
            java.lang.String r3 = c(r7)
            goto L_0x00a2
        L_0x0094:
            java.lang.String r3 = a(r7)
            goto L_0x00a2
        L_0x0099:
            java.lang.String r3 = f(r7)
            goto L_0x00a2
        L_0x009e:
            java.lang.String r3 = d(r7)
        L_0x00a2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.framework.statisticsv2.collector.TradeCollector.collectData(java.lang.String, int):java.lang.String");
    }
}
