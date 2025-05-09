package com.alipay.android.msp.network;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.core.model.PreposeCashierReqModel;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.exception.PublicKeyException;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.helper.MspConfig;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.network.decorator.BaseDecorator;
import com.alipay.android.msp.network.decorator.BytesEncryptDecorator;
import com.alipay.android.msp.network.decorator.BytesEnvelopDecorator;
import com.alipay.android.msp.network.decorator.ChannelRequestDecorator;
import com.alipay.android.msp.network.decorator.CommonRequestDecorator;
import com.alipay.android.msp.network.decorator.DynamicHostEnvelopDecorator;
import com.alipay.android.msp.network.decorator.FirstRequestDecorator;
import com.alipay.android.msp.network.decorator.PublicKeyDecorator;
import com.alipay.android.msp.network.decorator.RpcRequestDecorator;
import com.alipay.android.msp.network.decorator.RpcRequestDecoratorV2;
import com.alipay.android.msp.network.decorator.TidRequestDecorator;
import com.alipay.android.msp.network.model.ReqData;
import com.alipay.android.msp.network.model.RequestConfig;
import com.alipay.android.msp.network.model.RpcRequestData;
import com.alipay.android.msp.network.model.RpcRequestDataV2;
import com.alipay.android.msp.pay.TradeLogicData;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.TimingUtil;
import com.alipay.android.msp.utils.net.LdcUtils;
import com.alipay.sdk.api.AlipaySDKJSBridge;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.floatview.globalbarrage.c;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class PackUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static ReqData<byte[]> packageBytesData(String str, int i, RequestConfig requestConfig) {
        TradeLogicData tradeLogicData;
        BaseDecorator baseDecorator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ReqData) ipChange.ipc$dispatch("1bf8d31c", new Object[]{str, new Integer(i), requestConfig});
        }
        MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(i);
        if (tradeContextByBizId != null) {
            tradeLogicData = tradeContextByBizId.getTradeLogicData();
        } else {
            tradeLogicData = null;
        }
        if (tradeLogicData != null) {
            tradeLogicData.setRequestConfig(requestConfig);
        }
        BytesEncryptDecorator bytesEncryptDecorator = new BytesEncryptDecorator(i, new BytesEnvelopDecorator());
        if (requestConfig.isFirstRequest()) {
            baseDecorator = new FirstRequestDecorator(i, bytesEncryptDecorator);
        } else {
            baseDecorator = new CommonRequestDecorator(i, bytesEncryptDecorator);
        }
        baseDecorator.setRequestConfig(requestConfig);
        ReqData<byte[]> reqData = new ReqData<>(baseDecorator.todo(str.getBytes(), ""));
        reqData.mBizId = i;
        reqData.mMspParam = LdcUtils.getMspParams(tradeLogicData, str);
        return reqData;
    }

    public static ReqData<byte[]> packageDynamicHostData(String str, int i, RequestConfig requestConfig) {
        TradeLogicData tradeLogicData;
        BaseDecorator baseDecorator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ReqData) ipChange.ipc$dispatch("4dbc27b8", new Object[]{str, new Integer(i), requestConfig});
        }
        MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(i);
        if (tradeContextByBizId != null) {
            tradeLogicData = tradeContextByBizId.getTradeLogicData();
        } else {
            tradeLogicData = null;
        }
        if (tradeLogicData != null) {
            tradeLogicData.setRequestConfig(requestConfig);
        }
        DynamicHostEnvelopDecorator dynamicHostEnvelopDecorator = new DynamicHostEnvelopDecorator();
        if (requestConfig.isFirstRequest()) {
            baseDecorator = new FirstRequestDecorator(i, dynamicHostEnvelopDecorator);
        } else {
            baseDecorator = new CommonRequestDecorator(i, dynamicHostEnvelopDecorator);
        }
        baseDecorator.setRequestConfig(requestConfig);
        ReqData<byte[]> reqData = new ReqData<>(baseDecorator.todo(str.getBytes(), ""));
        reqData.mBizId = i;
        reqData.mMspParam = LdcUtils.getMspParams(tradeLogicData, str);
        return reqData;
    }

    public static ReqData<Map<String, String>> packagePbv1Data(String str, int i, RequestConfig requestConfig) {
        TradeLogicData tradeLogicData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ReqData) ipChange.ipc$dispatch("eee10faa", new Object[]{str, new Integer(i), requestConfig});
        }
        MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(i);
        if (tradeContextByBizId != null) {
            tradeLogicData = tradeContextByBizId.getTradeLogicData();
        } else {
            tradeLogicData = null;
        }
        if (tradeLogicData != null) {
            tradeLogicData.setRequestConfig(requestConfig);
        }
        RpcRequestData doVar = RpcRequestDecorator.todo(requestConfig, str, i);
        doVar.setMspParam(LdcUtils.getMspParams(tradeLogicData, str));
        ReqData<Map<String, String>> reqData = new ReqData<>(doVar.getKeyValueMap());
        reqData.mBizId = i;
        return reqData;
    }

    public static ReqData<Map<String, String>> packagePbv2Data(String str, int i, RequestConfig requestConfig) {
        TradeLogicData tradeLogicData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ReqData) ipChange.ipc$dispatch("59d2282b", new Object[]{str, new Integer(i), requestConfig});
        }
        MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(i);
        if (tradeContextByBizId != null) {
            tradeLogicData = tradeContextByBizId.getTradeLogicData();
        } else {
            tradeLogicData = null;
        }
        if (tradeLogicData != null) {
            tradeLogicData.setRequestConfig(requestConfig);
        }
        RpcRequestDataV2 doVar = RpcRequestDecoratorV2.todo(requestConfig, str, i, false);
        doVar.mspParam = LdcUtils.getMspParams(tradeLogicData, str);
        doVar.dispatchType = requestConfig.getDispatchType();
        ReqData<Map<String, String>> reqData = new ReqData<>(doVar.getKeyValueMap());
        reqData.mBizId = i;
        return reqData;
    }

    public static ReqData<Map<String, String>> packagePbv3DataForSdk(String str, int i, RequestConfig requestConfig) {
        TradeLogicData tradeLogicData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ReqData) ipChange.ipc$dispatch("ec3f213d", new Object[]{str, new Integer(i), requestConfig});
        }
        MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(i);
        if (tradeContextByBizId != null) {
            tradeLogicData = tradeContextByBizId.getTradeLogicData();
        } else {
            tradeLogicData = null;
        }
        if (tradeLogicData != null) {
            tradeLogicData.setRequestConfig(requestConfig);
        }
        RpcRequestDataV2 doVar = new Pbv2ForSDKDecorator().todo(requestConfig, str, i);
        doVar.mspParam = LdcUtils.getMspParams(tradeLogicData, str);
        doVar.dispatchType = requestConfig.getDispatchType();
        ReqData<Map<String, String>> reqData = new ReqData<>(doVar.getKeyValueMap());
        reqData.mBizId = i;
        return reqData;
    }

    public static String unpackBytesResponseData(byte[] bArr, RequestConfig requestConfig) throws PublicKeyException, Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15ecf12d", new Object[]{bArr, requestConfig});
        }
        BytesEnvelopDecorator bytesEnvelopDecorator = new BytesEnvelopDecorator(-1, new PublicKeyDecorator(-1, new BytesEncryptDecorator()));
        bytesEnvelopDecorator.setRequestConfig(requestConfig);
        return (String) bytesEnvelopDecorator.undo(bArr);
    }

    public static byte[] packBytesFirstRequestData(RequestConfig requestConfig, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("962e05b3", new Object[]{requestConfig, new Integer(i), str});
        }
        LogUtil.record(1, "LogicPackUtils::packBytesFirstRequestData", "startPay > " + System.currentTimeMillis());
        FirstRequestDecorator firstRequestDecorator = new FirstRequestDecorator(i, new BytesEncryptDecorator(i, new BytesEnvelopDecorator()));
        firstRequestDecorator.setRequestConfig(requestConfig);
        byte[] bArr = null;
        try {
            bArr = firstRequestDecorator.todo(str.getBytes(), null);
        } catch (Exception e) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, c.LOCATION_INSIDE, "PackBytesFirstRequestDataEx", e);
        }
        LogUtil.record(1, "LogicPackUtils::packBytesFirstRequestData", "end > " + System.currentTimeMillis());
        return bArr;
    }

    public static byte[] packChannelRequestData(Context context, RequestConfig requestConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("2dde8c00", new Object[]{context, requestConfig, str});
        }
        LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, "LogicPackUtils.packChannelRequestData", "startPay > " + System.currentTimeMillis());
        ChannelRequestDecorator channelRequestDecorator = new ChannelRequestDecorator(context, -1, new BytesEncryptDecorator(-1, new BytesEnvelopDecorator()));
        channelRequestDecorator.setRequestConfig(requestConfig);
        byte[] bArr = null;
        try {
            bArr = channelRequestDecorator.todo(str.getBytes(), null);
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
        LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, "LogicPackUtils.packChannelRequestData", "end > " + System.currentTimeMillis());
        return bArr;
    }

    public static byte[] packTidRequestData(RequestConfig requestConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("78f29c32", new Object[]{requestConfig});
        }
        LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, "LogicPackUtils.packTidRequestData", "startPay > " + System.currentTimeMillis());
        TidRequestDecorator tidRequestDecorator = new TidRequestDecorator(-1, new BytesEncryptDecorator(-1, new BytesEnvelopDecorator()));
        tidRequestDecorator.setRequestConfig(requestConfig);
        byte[] bArr = null;
        try {
            bArr = tidRequestDecorator.todo("".getBytes(), null);
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
        LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, "LogicPackUtils.packTidRequestData", "end > " + System.currentTimeMillis());
        return bArr;
    }

    public static byte[] packTplRequestData(String str, RequestConfig requestConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("de30d549", new Object[]{str, requestConfig});
        }
        LogUtil.record(1, "", "LogicPackUtils::packTplRequestData", "startPay > " + System.currentTimeMillis());
        CommonRequestDecorator commonRequestDecorator = new CommonRequestDecorator(requestConfig.getBizId(), new BytesEncryptDecorator(requestConfig.getBizId(), new BytesEnvelopDecorator()));
        commonRequestDecorator.setRequestConfig(requestConfig);
        byte[] bArr = null;
        try {
            bArr = commonRequestDecorator.todo(str.getBytes(), null);
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
        LogUtil.record(1, "", "LogicPackUtils::packTplRequestData", "end > " + System.currentTimeMillis());
        return bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static JSONObject packPreposeCashierRequestData(Map<String, String> map, Context context) {
        boolean z;
        long j;
        long j2;
        Object obj;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e3d87bdb", new Object[]{map, context});
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = map == null ? new HashMap() : map;
        if (context == null) {
            LogUtil.record(8, "PackUtils:packPreposeRequestData", "context is null");
        }
        GlobalHelper.getInstance().init(context);
        RequestConfig requestConfig = new RequestConfig(RequestConfig.RequestChannel.PB_V3_CASHIER, true);
        try {
            z = DrmManager.getInstance(context).isGray(DrmKey.GRAY_PREPOSE_LOG_TIMECOST, false, context);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            z = false;
        }
        TimingUtil.TimingMsMap timingMsMap = z ? new TimingUtil.TimingMsMap() : null;
        RpcRequestDataV2 doVar = new Pbv2ForSDKDecorator().todo(requestConfig, "", -1, true, true, timingMsMap);
        if (doVar == null) {
            return null;
        }
        PreposeCashierReqModel preposeCashierReqModel = new PreposeCashierReqModel();
        preposeCashierReqModel.setPa(doVar.mqp_pa);
        preposeCashierReqModel.setTid(doVar.mqp_tid);
        String str2 = doVar.mqp_ua;
        String str3 = doVar.subua3;
        String clientKey = MspConfig.getInstance().getClientKey();
        String vimeiAndVimsi = MspConfig.getInstance().getVimeiAndVimsi();
        if (!TextUtils.isEmpty(str2)) {
            str2 = str2.replace("(a)", clientKey).replace("(b)", vimeiAndVimsi).replace("(c)", str3);
        }
        preposeCashierReqModel.setUa(str2);
        try {
            if (!TextUtils.isEmpty(doVar.hasAlipay)) {
                preposeCashierReqModel.setHas_alipay(Integer.parseInt(doVar.hasAlipay));
            }
        } catch (Throwable th2) {
            LogUtil.printExceptionStackTrace(th2);
        }
        preposeCashierReqModel.setExtinfo(JSON.toJSONString(hashMap));
        preposeCashierReqModel.setUtdid(GlobalHelper.getInstance().getUtdid(context));
        Object json = JSON.toJSON(preposeCashierReqModel);
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        int i = !TextUtils.isEmpty(preposeCashierReqModel.getPa()) ? 1 : 0;
        int i2 = preposeCashierReqModel.getHas_alipay() == 1 ? 1 : 0;
        int i3 = !TextUtils.isEmpty(preposeCashierReqModel.getTid()) ? 1 : 0;
        int i4 = !TextUtils.isEmpty(preposeCashierReqModel.getUa()) ? 1 : 0;
        int i5 = !TextUtils.isEmpty(preposeCashierReqModel.getUtdid()) ? 1 : 0;
        if (z) {
            j2 = elapsedRealtime2;
            obj = json;
            j = elapsedRealtime;
            str = String.format(Locale.getDefault(), "%d|%d%d%d%d%d|%d %d %d %d %d", Long.valueOf(elapsedRealtime2 - elapsedRealtime), Integer.valueOf(i), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i2), Long.valueOf(TimingUtil.getLong(timingMsMap.get(TimingUtil.PreposeTimingEnum.PaTiming), -1L)), Long.valueOf(TimingUtil.getLong(timingMsMap.get(TimingUtil.PreposeTimingEnum.TidTiming), -1L)), Long.valueOf(TimingUtil.getLong(timingMsMap.get(TimingUtil.PreposeTimingEnum.UaTiming), -1L)), Long.valueOf(TimingUtil.getLong(timingMsMap.get(TimingUtil.PreposeTimingEnum.UtdidTiming), -1L)), Long.valueOf(TimingUtil.getLong(timingMsMap.get(TimingUtil.PreposeTimingEnum.HasAlipayTiming), -1L)));
        } else {
            j2 = elapsedRealtime2;
            j = elapsedRealtime;
            obj = json;
            str = String.format(Locale.getDefault(), "%d|%d%d%d%d%d", Long.valueOf(j2 - j), Integer.valueOf(i), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i2));
        }
        LogUtil.record(8, "PackUtils:packPreposeRequestData", IconCompat.EXTRA_OBJ + obj + " ,sb=" + str);
        if (j2 - j >= 100) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.WARNING, "prepose_cashier_params_timeout", str);
        }
        if (obj != null) {
            return (JSONObject) obj;
        }
        return null;
    }
}
