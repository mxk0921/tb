package com.alipay.android.msp.network.pb;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.Toast;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.constants.MspNetConstants;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.exception.NetErrorException;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.helper.MspConfig;
import com.alipay.android.msp.framework.statisticsv2.Vector;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.network.APNetSwitchUtil;
import com.alipay.android.msp.network.model.ReqData;
import com.alipay.android.msp.network.model.RequestConfig;
import com.alipay.android.msp.network.model.ResData;
import com.alipay.android.msp.network.pb.rpcservice.MspDispatcherService;
import com.alipay.android.msp.network.pb.rpcv3.MspPreConfirmEx;
import com.alipay.android.msp.network.pb.rpcv3.MspReqExV3;
import com.alipay.android.msp.network.pb.rpcv3.MspResExV3;
import com.alipay.android.msp.network.pb.rpcv3.MspTplEx;
import com.alipay.android.msp.pay.GlobalConstant;
import com.alipay.android.msp.pay.GlobalSdkConstant;
import com.alipay.android.msp.utils.JsonUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.NetParamLogUtil;
import com.alipay.android.msp.utils.OrderInfoUtil;
import com.alipay.android.msp.utils.Utils;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.rpc.RpcException;
import com.alipay.mobile.common.rpc.RpcInvokeContext;
import com.alipay.mobile.common.transport.AlipayNetStarter;
import com.alipay.mobile.common.transport.httpdns.DnsEnv;
import com.alipay.mobile.framework.service.common.impl.MpaasRpcServiceImpl;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.utils.tools.TimeCalculator;
import java.util.HashMap;
import java.util.Map;
import tb.oeh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class Pbv3SDKRpcRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int PBV3_GZIP_LIMIT = 160;

    public static MspReqExV3 b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspReqExV3) ipChange.ipc$dispatch("62daa7db", new Object[]{map});
        }
        MspReqExV3 mspReqExV3 = new MspReqExV3();
        mspReqExV3.api_nsp = map.get("api_nsp");
        mspReqExV3.api_nm = map.get("api_nm");
        mspReqExV3.action = map.get("action");
        mspReqExV3.synch = map.get("synch");
        mspReqExV3.decay = map.get(MspGlobalDefine.DECAY);
        mspReqExV3.external_info = map.get(MspGlobalDefine.EXTERNAL_INFO);
        mspReqExV3.user_id = map.get("user_id");
        mspReqExV3.session = map.get(MspGlobalDefine.SESSION);
        mspReqExV3.trid = map.get(MspGlobalDefine.TRID);
        try {
            if (!TextUtils.isEmpty(map.get(MspFlybirdDefine.TRDFROM))) {
                mspReqExV3.trdfrom = Integer.valueOf(Integer.parseInt(map.get(MspFlybirdDefine.TRDFROM)));
            }
        } catch (NumberFormatException e) {
            LogUtil.printExceptionStackTrace(e);
        }
        try {
            if (!TextUtils.isEmpty(map.get(MspFlybirdDefine.FLYBIRD_LOGIN))) {
                mspReqExV3.locLoginOnce = Integer.valueOf(Integer.parseInt(map.get(MspFlybirdDefine.FLYBIRD_LOGIN)));
            }
        } catch (NumberFormatException e2) {
            LogUtil.printExceptionStackTrace(e2);
        }
        try {
            if (!TextUtils.isEmpty(map.get("hasAlipay"))) {
                mspReqExV3.hasAlipay = Integer.valueOf(Integer.parseInt(map.get("hasAlipay")));
            }
            if (!TextUtils.isEmpty(map.get(MspGlobalDefine.CERTPAY))) {
                mspReqExV3.certpay = Integer.valueOf(Integer.parseInt(map.get(MspGlobalDefine.CERTPAY)));
            }
        } catch (NumberFormatException e3) {
            LogUtil.printExceptionStackTrace(e3);
        }
        mspReqExV3.subua1 = map.get("subua1");
        mspReqExV3.subua2 = map.get("subua2");
        mspReqExV3.subua3 = map.get("subua3");
        mspReqExV3.app_key = map.get(MspGlobalDefine.APP_KEY);
        mspReqExV3.extinfo = map.get(MspFlybirdDefine.EXTINFO);
        mspReqExV3.secData = map.get("secData");
        return mspReqExV3;
    }

    public static void switchEnvironment(RpcInvokeContext rpcInvokeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c1e03f1", new Object[]{rpcInvokeContext});
            return;
        }
        try {
            final Context context = GlobalHelper.getInstance().getContext();
            Cursor query = context.getContentResolver().query(Uri.parse(RequestConfig.SETTING_PROVIDER), null, null, null, null);
            final String str = null;
            if (query != null && query.getCount() > 0) {
                if (query.moveToFirst()) {
                    String string = query.getString(query.getColumnIndex("url"));
                    if (!TextUtils.isEmpty(string)) {
                        str = string;
                    }
                }
                query.close();
            }
            if (!TextUtils.isEmpty(str)) {
                TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.network.pb.Pbv3SDKRpcRequest.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        Context applicationContext = context.getApplicationContext();
                        Toast.makeText(applicationContext, "网关：" + str, 0).show();
                    }
                });
                rpcInvokeContext.setGwUrl(str);
                return;
            }
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.network.pb.Pbv3SDKRpcRequest.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        Toast.makeText(context.getApplicationContext(), "网关：支付线上环境", 0).show();
                    }
                }
            });
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public static void a(String str, int i) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7926cacf", new Object[]{str, new Integer(i)});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                for (String str2 : str.split(";")) {
                    if (str2.startsWith("user_id=")) {
                        String substring = str2.substring(8);
                        if (!TextUtils.isEmpty(substring)) {
                            MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(i);
                            if (mspContextByBizId != null) {
                                mspContextByBizId.getStatisticInfo().updateAttr(Vector.Id, "userId", substring);
                            }
                            DnsEnv.getInstance().setAmdcUid(substring);
                            LoggerFactory.getLogContext().setUserId(substring);
                        } else {
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
    }

    public ResData<Map<String, String>> requestData(ReqData<Map<String, String>> reqData, RequestConfig requestConfig) throws Exception {
        MspTradeContext tradeContextByBizId;
        String str = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResData) ipChange.ipc$dispatch("124352d3", new Object[]{this, reqData, requestConfig});
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(reqData.mBizId);
        Context context = GlobalHelper.getInstance().getContext();
        if (context == null) {
            context = mspContextByBizId == null ? null : mspContextByBizId.getContext();
        }
        if (context != null) {
            try {
                if (APNetSwitchUtil.shouldIUseAPNetwork(context)) {
                    AlipayNetStarter.getInstance().initNetwork(context);
                }
            } catch (Throwable th) {
                if (mspContextByBizId != null) {
                    mspContextByBizId.getStatisticInfo().addError(ErrorType.WARNING, "AMNET.init Error", str);
                }
                LogUtil.printExceptionStackTrace(th);
            }
            if (reqData.mBizId != -1) {
                try {
                    if (!APNetSwitchUtil.shouldIUseAPNetwork(context) || !APNetSwitchUtil.shouldIUseAPHttpDns(context)) {
                        DnsEnv.getInstance().setDisableHttpDNS(true);
                    } else {
                        DnsEnv.getInstance().setDisableHttpDNS(false);
                    }
                    StEvent statisticEvent = requestConfig.getStatisticEvent();
                    if (statisticEvent != null) {
                        statisticEvent.onStatistic("actionType", "rpc_pbv3");
                    }
                } catch (Throwable th2) {
                    LogUtil.printExceptionStackTrace(th2);
                }
            }
            MpaasRpcServiceImpl mpaasRpcServiceImpl = new MpaasRpcServiceImpl(context);
            MspDispatcherService mspDispatcherService = (MspDispatcherService) mpaasRpcServiceImpl.getRpcProxy(MspDispatcherService.class);
            RpcInvokeContext rpcInvokeContext = mpaasRpcServiceImpl.getRpcInvokeContext(mspDispatcherService);
            if (rpcInvokeContext != null) {
                rpcInvokeContext.setRpcLoggerLevel(1);
                if (requestConfig != null) {
                    try {
                        rpcInvokeContext.setBizLog("MSP_trade_" + requestConfig.isFirstRequest());
                    } catch (Throwable th3) {
                        LogUtil.printExceptionStackTrace(th3);
                    }
                }
                if (APNetSwitchUtil.shouldIUseAPNetwork(context)) {
                    String configSDKAppId = GlobalHelper.getInstance().getConfigSDKAppId();
                    if (!TextUtils.isEmpty(configSDKAppId)) {
                        rpcInvokeContext.setAppId(configSDKAppId);
                        rpcInvokeContext.setAppKey(configSDKAppId);
                    }
                }
                rpcInvokeContext.setGwUrl("https://mobilegw.alipay.com/mgw.htm");
                if (GlobalConstant.DEBUG) {
                    switchEnvironment(rpcInvokeContext);
                }
                if (MspConfig.getInstance().isDebug()) {
                    rpcInvokeContext.addRequestHeader("debug-header", (((((Build.MODEL.replace(";", " ") + ";") + Utils.getScreenResolution(GlobalHelper.getInstance().getContext())) + ";") + GlobalSdkConstant.getMspVersion()) + ";") + "6");
                    rpcInvokeContext.addRequestHeader(oeh.OS, TimeCalculator.PLATFORM_ANDROID);
                }
                rpcInvokeContext.addRequestHeader(MspNetConstants.Request.MSP_PARAM, reqData.toMapData().get("mspParam"));
                rpcInvokeContext.addRequestHeader("mqp-apiver", reqData.toMapData().get("mqp_apiver"));
                rpcInvokeContext.addRequestHeader("mqp-bp", reqData.toMapData().get("mqp_bp"));
                rpcInvokeContext.addRequestHeader("mqp-tid", reqData.toMapData().get("mqp_tid"));
                rpcInvokeContext.addRequestHeader("mqp-uac", reqData.toMapData().get("mqp_uac"));
                rpcInvokeContext.addRequestHeader("mqp-ua", reqData.toMapData().get("mqp_ua"));
                rpcInvokeContext.addRequestHeader("mqp-pa", reqData.toMapData().get("mqp_pa"));
                try {
                    MspResExV3 dispatchTbV3 = mspDispatcherService.dispatchTbV3(b(reqData.toMapData()));
                    Map<String, String> responseHeaders = rpcInvokeContext.getResponseHeaders();
                    if (responseHeaders != null) {
                        str = rpcInvokeContext.getResponseHeaders().get(MspNetConstants.Request.MSP_PARAM);
                    }
                    try {
                        HashMap hashMap = new HashMap();
                        hashMap.put("code", dispatchTbV3.code);
                        hashMap.put("err_msg", dispatchTbV3.err_msg);
                        hashMap.put("memo", dispatchTbV3.memo);
                        hashMap.put("result", dispatchTbV3.result);
                        hashMap.put("end_code", dispatchTbV3.end_code);
                        hashMap.put("synch", dispatchTbV3.synch);
                        hashMap.put("mspParam", str);
                        hashMap.put("trade_no", dispatchTbV3.trade_no);
                        if (dispatchTbV3.wpage != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(dispatchTbV3.wpage);
                            hashMap.put("wpage", sb.toString());
                        }
                        if (dispatchTbV3.noBack != null) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(dispatchTbV3.noBack);
                            hashMap.put(MspFlybirdDefine.FLYBIRD_NOBACK, sb2.toString());
                        }
                        hashMap.put(MspGlobalDefine.UNAME, dispatchTbV3.uname);
                        hashMap.put(MspGlobalDefine.UURL, dispatchTbV3.uurl);
                        hashMap.put("tpl", dispatchTbV3.tpl);
                        hashMap.put("data", dispatchTbV3.data);
                        if (dispatchTbV3.time != null) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(dispatchTbV3.time);
                            hashMap.put("time", sb3.toString());
                        }
                        if (dispatchTbV3.uac != null) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(dispatchTbV3.uac);
                            hashMap.put(MspGlobalDefine.UAC, sb4.toString());
                        }
                        if (dispatchTbV3.dg != null) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(dispatchTbV3.dg);
                            hashMap.put("dg", sb5.toString());
                        }
                        hashMap.put("wnd", dispatchTbV3.wnd);
                        hashMap.put("page", dispatchTbV3.page);
                        hashMap.put(MspGlobalDefine.SESSION, dispatchTbV3.session);
                        hashMap.put("tid", dispatchTbV3.tid);
                        hashMap.put(MspFlybirdDefine.FLYBIRD_CLIENT_KEY, dispatchTbV3.client_key);
                        if (dispatchTbV3.ajax != null) {
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append(dispatchTbV3.ajax);
                            hashMap.put(MspFlybirdDefine.FLYBIRD_AJAX, sb6.toString());
                        }
                        if (dispatchTbV3.iajax != null) {
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append(dispatchTbV3.iajax);
                            hashMap.put("iajax", sb7.toString());
                        }
                        String str2 = dispatchTbV3.uname;
                        if (str2 != null) {
                            hashMap.put(MspGlobalDefine.UNAME, str2);
                        }
                        String str3 = dispatchTbV3.uurl;
                        if (str3 != null) {
                            hashMap.put(MspGlobalDefine.UURL, str3);
                        }
                        hashMap.put(MspFlybirdDefine.FLYBIRD_ONLOAD, dispatchTbV3.onload);
                        hashMap.put("user_id", dispatchTbV3.user_id);
                        hashMap.put(MspFlybirdDefine.FLYBIRD_PKEY, dispatchTbV3.pkey);
                        hashMap.put(MspFlybirdDefine.EXTINFO, dispatchTbV3.extinfo);
                        JsonUtil.addExtInfo(dispatchTbV3.extinfo, hashMap);
                        String str4 = dispatchTbV3.tplid;
                        if (TextUtils.equals(str4, "0")) {
                            str4 = "QUICKPAY@cashier-pre-confirm-flex";
                        } else if (TextUtils.equals(str4, "1")) {
                            str4 = MspFlybirdDefine.CASHIER_CHANNEL_LOGO_TPL;
                        } else if (TextUtils.equals(str4, "2")) {
                            str4 = "QUICKPAY@frontpay-channel-logo-flex";
                        } else if (TextUtils.equals(str4, "3")) {
                            str4 = MspFlybirdDefine.FLYBIRD_RESULT_TPL;
                        }
                        hashMap.put(MspFlybirdDefine.FLYBIRD_TEMPLATE_ID, str4);
                        MspTplEx mspTplEx = dispatchTbV3.tplv2;
                        if (mspTplEx != null) {
                            hashMap.put("tpl", mspTplEx.format(str4));
                        }
                        MspPreConfirmEx mspPreConfirmEx = dispatchTbV3.preConfirm;
                        if (mspPreConfirmEx != null) {
                            hashMap.put("data", mspPreConfirmEx.format());
                        } else if (dispatchTbV3.channelLogo != null) {
                            hashMap.put("data", dispatchTbV3.channelLogo.format(dispatchTbV3.tplid.equals("2")));
                        }
                        ResData<Map<String, String>> resData = new ResData<>(hashMap);
                        int i = reqData.mBizId;
                        try {
                            String str5 = resData.mData.get("trade_no");
                            String tradeNo = OrderInfoUtil.getTradeNo(mspContextByBizId);
                            if (!TextUtils.isEmpty(str5)) {
                                if (mspContextByBizId != null) {
                                    mspContextByBizId.getStatisticInfo().updateAttr(Vector.Trade, "tradeNo", str5);
                                }
                                DnsEnv.getInstance().setTradeNo(str5);
                            } else if (!TextUtils.isEmpty(tradeNo)) {
                                if (mspContextByBizId != null) {
                                    mspContextByBizId.getStatisticInfo().updateAttr(Vector.Trade, "tradeNo", tradeNo);
                                }
                                DnsEnv.getInstance().setTradeNo(tradeNo);
                            }
                            if (!TextUtils.isEmpty(str5) && (tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(i)) != null) {
                                tradeContextByBizId.updateTradeNo(str5);
                            }
                        } catch (Throwable th4) {
                            LogUtil.printExceptionStackTrace(th4);
                        }
                        resData.mReqData = reqData;
                        NetParamLogUtil.pbLogPrint("Pbv3Sdk", elapsedRealtime, reqData, resData.mData, responseHeaders);
                        a(str, i);
                        return resData;
                    } catch (Exception e) {
                        StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DATA, "PbV3DeserializeEx", e);
                        NetErrorException netErrorException = new NetErrorException("人气太旺啦，稍候再试试。");
                        netErrorException.setStatErrorCode(301);
                        throw netErrorException;
                    }
                } catch (RpcException e2) {
                    LogUtil.printExceptionStackTrace(e2);
                    NetErrorException netErrorException2 = new NetErrorException(e2);
                    boolean maybeNetworkUnavailableError = e2.maybeNetworkUnavailableError();
                    netErrorException2.setIsClientError(maybeNetworkUnavailableError).setChannel(NetErrorException.Channel.RPC).setStatErrorCode(e2.getCode());
                    if (!maybeNetworkUnavailableError) {
                        netErrorException2.setStatErrorCode(306);
                        if (e2.getCode() == 1001 || e2.getCode() < 1000) {
                            DrmKey.sRpcExCount++;
                        }
                    } else {
                        netErrorException2.setStatErrorCode(305);
                    }
                    throw netErrorException2;
                }
            } else {
                DrmKey.sRpcExCount++;
                throw new NullPointerException("getRpcInvokeContext null");
            }
        } else {
            DrmKey.sRpcExCount++;
            throw new NullPointerException("context is null");
        }
    }
}
