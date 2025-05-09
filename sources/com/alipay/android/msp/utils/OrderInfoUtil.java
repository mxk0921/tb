package com.alipay.android.msp.utils;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.sdk.app.statistic.StatisticRecord;
import com.alipay.sdk.sys.BizContext;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class OrderInfoUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String APP_USERID_KEY = "app_userid";
    private static final String BIZ_NO_KEY = "biz_no";
    private static final String BIZ_SCENE = "biz_scene";
    public static final String BIZ_SUB_TYPE_KEY = "biz_sub_type";
    public static final String BIZ_TYPE_KEY = "biz_type";
    private static final String NEW_EXTERNAL_INFO = "new_external_info";
    private static final String ORDER_ID = "order_id";
    private static final String TRADE_NO_KEY = "trade_no";
    private static final String USER_ID_KEY = "user_id";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class OrderModel {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String currency;
        public String subject;
        public String totalAmount;

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "totalAmount=" + this.totalAmount + " , subject=" + this.subject + " , currency=" + this.currency;
        }
    }

    public static String getTradeNo(MspContext mspContext) {
        Map<String, String> orderInfoMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc9ac594", new Object[]{mspContext});
        }
        if (!(mspContext instanceof MspTradeContext) || (orderInfoMap = ((MspTradeContext) mspContext).getOrderInfoMap()) == null || orderInfoMap.get("trade_no") == null) {
            return "";
        }
        return orderInfoMap.get("trade_no");
    }

    public static boolean isCreateOrderRequest(MspContext mspContext) {
        Map<String, String> orderInfoMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45067bc8", new Object[]{mspContext})).booleanValue();
        }
        if ((mspContext instanceof MspTradeContext) && (orderInfoMap = ((MspTradeContext) mspContext).getOrderInfoMap()) != null && orderInfoMap.containsKey("biz_reqdata")) {
            return true;
        }
        return false;
    }

    public static boolean isOpenAuthOrder(MspContext mspContext) {
        String orderInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3937a553", new Object[]{mspContext})).booleanValue();
        }
        if ((mspContext instanceof MspTradeContext) && (orderInfo = ((MspTradeContext) mspContext).getOrderInfo()) != null && orderInfo.contains("com.alipay.account.auth")) {
            return true;
        }
        return false;
    }

    public static String parseForkAction(MspContext mspContext) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fb428478", new Object[]{mspContext});
        }
        return ((mspContext instanceof MspTradeContext) && (str = ((MspTradeContext) mspContext).getOrderInfoMap().get("msp_fork_action")) != null) ? str : "";
    }

    public static OrderModel getOrderModelFromOrderInfo(MspContext mspContext) {
        MspTradeContext mspTradeContext;
        String orderInfo;
        Map<String, String> orderInfoMap;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrderModel) ipChange.ipc$dispatch("cdc7b994", new Object[]{mspContext});
        }
        if (!(mspContext instanceof MspTradeContext) || (orderInfo = (mspTradeContext = (MspTradeContext) mspContext).getOrderInfo()) == null || orderInfo.length() <= 0 || (orderInfoMap = mspTradeContext.getOrderInfoMap()) == null || orderInfoMap.size() <= 0) {
            return null;
        }
        Context context = mspContext.getContext();
        if (context != null && DrmManager.getInstance(context).isGray(DrmKey.GRAY_LOGIN_CURRENCY, false, context)) {
            z = true;
        }
        OrderModel orderModel = new OrderModel();
        String str = "";
        if (orderInfo.contains("alipay.trade.app.pay")) {
            String str2 = orderInfoMap.get(StatisticRecord.KEY_BIZ_CONTENT);
            if (str2 == null || str2.length() <= 0) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(URLDecoder.decode(str2, "utf-8"));
                orderModel.totalAmount = jSONObject.optString("total_amount", str);
                orderModel.subject = jSONObject.optString("subject", str);
                if (z && orderInfo.contains("alipay.trade.app.pay")) {
                    str = jSONObject.optString("trans_currency", "￥");
                }
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
        } else {
            orderModel.totalAmount = orderInfoMap.get("total_fee");
            orderModel.subject = orderInfoMap.get("subject");
            if (z && orderInfo.contains("mobile.securitypay.pay")) {
                str = orderInfoMap.get("currency");
            }
        }
        if (TextUtils.isEmpty(str) || "CNY".equals(str)) {
            orderModel.currency = "￥";
        } else {
            orderModel.currency = str;
        }
        if (TextUtils.isEmpty(str) && orderInfo.toLowerCase().contains("currency")) {
            EventLogUtil.logPayEvent("103618", "orderStr", orderInfo);
        }
        try {
            orderModel.subject = URLDecoder.decode(orderModel.subject, "utf-8");
        } catch (Exception e2) {
            LogUtil.printExceptionStackTrace(e2);
        }
        LogUtil.record(2, "OrderInfoUtil:getOrderModelFromOrderInfo", "model=".concat(String.valueOf(orderModel)));
        return orderModel;
    }

    public static String initLdcData(MspContext mspContext) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9dc4d45e", new Object[]{mspContext});
        }
        if (!(mspContext instanceof MspTradeContext)) {
            return "";
        }
        MspTradeContext mspTradeContext = (MspTradeContext) mspContext;
        Map<String, String> orderInfoMap = mspTradeContext.getOrderInfoMap();
        String orderInfo = mspTradeContext.getOrderInfo();
        if (orderInfoMap != null || orderInfo == null || orderInfo.contains(NEW_EXTERNAL_INFO)) {
            StringBuilder sb = new StringBuilder();
            if (orderInfoMap != null) {
                if (orderInfoMap.containsKey("biz_type")) {
                    if (orderInfoMap.containsKey(BIZ_SUB_TYPE_KEY)) {
                        sb.append("biz_type=");
                        sb.append(orderInfoMap.get(BIZ_SUB_TYPE_KEY));
                        sb.append(";");
                    } else {
                        sb.append("biz_type=");
                        sb.append(orderInfoMap.get("biz_type"));
                        sb.append(";");
                    }
                } else if (orderInfoMap.containsKey(BIZ_SUB_TYPE_KEY)) {
                    sb.append("biz_type=");
                    sb.append(orderInfoMap.get(BIZ_SUB_TYPE_KEY));
                    sb.append(";");
                }
                if (orderInfoMap.containsKey(BIZ_NO_KEY)) {
                    sb.append("biz_no=");
                    sb.append(orderInfoMap.get(BIZ_NO_KEY));
                    sb.append(";");
                }
                if (orderInfoMap.containsKey("trade_no")) {
                    sb.append("trade_no=");
                    sb.append(orderInfoMap.get("trade_no"));
                    sb.append(";");
                }
                if (orderInfoMap.containsKey(APP_USERID_KEY)) {
                    sb.append("app_userid=");
                    sb.append(orderInfoMap.get(APP_USERID_KEY));
                    sb.append(";");
                }
                if (orderInfoMap.containsKey("user_id")) {
                    sb.append("user_id=");
                    sb.append(orderInfoMap.get("user_id"));
                    sb.append(";");
                }
                if (orderInfoMap.containsKey("biz_scene")) {
                    sb.append("biz_scene=");
                    sb.append(orderInfoMap.get("biz_scene"));
                    sb.append(";");
                }
                if (orderInfoMap.containsKey("order_id")) {
                    sb.append("order_id=");
                    sb.append(orderInfoMap.get("order_id"));
                    sb.append(";");
                }
            }
            if (orderInfo != null && orderInfo.contains(NEW_EXTERNAL_INFO)) {
                try {
                    String replaceAll = orderInfo.replaceAll("\"", "");
                    String substring = replaceAll.substring(replaceAll.indexOf("user_id") + 8);
                    if (substring.contains(",")) {
                        str = substring.substring(0, substring.indexOf(","));
                    } else {
                        str = substring.substring(0, substring.indexOf("}"));
                    }
                    LogUtil.record(4, "phonecashiermsp#ldctemp", "OrderInfoUtil.initLdcData", str);
                    sb.append("user_id=");
                    sb.append(str);
                    sb.append(";");
                } catch (Exception e) {
                    LogUtil.printExceptionStackTrace(e);
                }
            }
            if (sb.length() == 0) {
                return "";
            }
            String sb2 = sb.toString();
            return sb2.endsWith(";") ? sb2.substring(0, sb2.length() - 1) : sb2;
        }
        LogUtil.record(4, "phonecashiermsp#ldc", "ExternalinfoUtil.initLdcData", "null");
        return "";
    }

    public static boolean isForkRequest(MspContext mspContext) {
        Map<String, String> orderInfoMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21fc8464", new Object[]{mspContext})).booleanValue();
        }
        return (mspContext instanceof MspTradeContext) && (orderInfoMap = ((MspTradeContext) mspContext).getOrderInfoMap()) != null && orderInfoMap.containsKey("msp_fork_action");
    }

    public static boolean isOutTradeOrder(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4358143", new Object[]{str})).booleanValue();
        }
        return str != null && str.contains("out_trade");
    }

    public static boolean isRewordRequest(String str) {
        Map<String, String> parseExternalInfoToMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aac2e39d", new Object[]{str})).booleanValue();
        }
        try {
            if (!TextUtils.isEmpty(str) && str.contains("biz_reqdata") && (parseExternalInfoToMap = parseExternalInfoToMap(str)) != null && parseExternalInfoToMap.get("biz_scene") != null && parseExternalInfoToMap.get("biz_scene").contains("reward")) {
                LogUtil.record(4, "phonecashiermsp#ldc", "ExternalinfoUtil.isRewordRequest", "true");
                return true;
            }
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
        return false;
    }

    public static boolean isSettingChannelMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3135b7c0", new Object[]{new Integer(i)})).booleanValue();
        }
        try {
            MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(i);
            if (tradeContextByBizId != null) {
                Map<String, String> orderInfoMap = tradeContextByBizId.getOrderInfoMap();
                if (orderInfoMap != null && orderInfoMap.get(MspDBHelper.ActionEntry.COLUMN_NAME_PAGE_ID) != null && orderInfoMap.get(MspDBHelper.ActionEntry.COLUMN_NAME_PAGE_ID).contains("1")) {
                    return true;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(MspDBHelper.ActionEntry.COLUMN_NAME_PAGE_ID);
                com.alibaba.fastjson.JSONObject metaSessionDataByKeys = tradeContextByBizId.getMetaSessionDataByKeys(arrayList);
                if (!(metaSessionDataByKeys == null || metaSessionDataByKeys.getString(MspDBHelper.ActionEntry.COLUMN_NAME_PAGE_ID) == null)) {
                    if (metaSessionDataByKeys.getString(MspDBHelper.ActionEntry.COLUMN_NAME_PAGE_ID).contains("1")) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
        return false;
    }

    public static boolean isSettingDeductMode(int i) {
        Map<String, String> orderInfoMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63a8df74", new Object[]{new Integer(i)})).booleanValue();
        }
        try {
            MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(i);
            if (!(tradeContextByBizId == null || (orderInfoMap = tradeContextByBizId.getOrderInfoMap()) == null || orderInfoMap.get(MspDBHelper.ActionEntry.COLUMN_NAME_PAGE_ID) == null)) {
                if (orderInfoMap.get(MspDBHelper.ActionEntry.COLUMN_NAME_PAGE_ID).contains("2")) {
                    return true;
                }
            }
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
        return false;
    }

    public static boolean isSettingFromAccountManager(int i) {
        Map<String, String> orderInfoMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5e245f0", new Object[]{new Integer(i)})).booleanValue();
        }
        try {
            MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(i);
            if (!(tradeContextByBizId == null || (orderInfoMap = tradeContextByBizId.getOrderInfoMap()) == null || orderInfoMap.get("biz_type") == null || !orderInfoMap.get("biz_type").contains(BizContext.KEY_SETTING_FILTER))) {
                if (!orderInfoMap.containsKey(MspDBHelper.ActionEntry.COLUMN_NAME_PAGE_ID)) {
                    return true;
                }
            }
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
        return false;
    }

    public static boolean isSettingsRequest(MspContext mspContext) {
        Map<String, String> orderInfoMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4160d963", new Object[]{mspContext})).booleanValue();
        }
        return (mspContext instanceof MspTradeContext) && (orderInfoMap = ((MspTradeContext) mspContext).getOrderInfoMap()) != null && orderInfoMap.get("biz_type") != null && orderInfoMap.get("biz_type").contains(BizContext.KEY_SETTING_FILTER);
    }

    public static boolean isSharepayFromBill(int i) {
        Map<String, String> orderInfoMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb7a523c", new Object[]{new Integer(i)})).booleanValue();
        }
        try {
            MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(i);
            if (!(tradeContextByBizId == null || (orderInfoMap = tradeContextByBizId.getOrderInfoMap()) == null || orderInfoMap.get("biz_type") == null)) {
                if (orderInfoMap.get("biz_type").contains("share_pp")) {
                    return true;
                }
            }
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
        return false;
    }

    public static boolean isSharepayRequest(MspTradeContext mspTradeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("905668a1", new Object[]{mspTradeContext})).booleanValue();
        }
        if (mspTradeContext != null) {
            try {
                Map<String, String> extendParamsMap = mspTradeContext.getExtendParamsMap();
                if (!(extendParamsMap.get("biz_type") == null || !extendParamsMap.get("biz_type").contains("share_pp") || extendParamsMap.get(BIZ_SUB_TYPE_KEY) == null)) {
                    if (extendParamsMap.get(BIZ_SUB_TYPE_KEY).contains("peerpay_trade")) {
                        return true;
                    }
                }
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
        }
        return false;
    }

    public static Map<String, String> parseExternalInfoToMap(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bcb5f75b", new Object[]{str});
        }
        LogUtil.record(1, "phonecashiermsp#ldc", "OrderInfoUtil.parseExternalInfoToMap", str);
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            return hashMap;
        }
        String[] split = str.replaceAll("\"", "").split("&");
        if (split.length == 0) {
            return hashMap;
        }
        for (String str2 : split) {
            String[] split2 = str2.split("=");
            if (split2.length > 1) {
                hashMap.put(split2[0], split2[1]);
            }
        }
        return hashMap;
    }
}
