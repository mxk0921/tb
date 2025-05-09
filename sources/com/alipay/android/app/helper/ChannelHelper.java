package com.alipay.android.app.helper;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.framework.exception.PublicKeyException;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.helper.MspConfig;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.tid.TidStorage;
import com.alipay.android.msp.network.PackUtils;
import com.alipay.android.msp.network.model.ReqData;
import com.alipay.android.msp.network.model.RequestConfig;
import com.alipay.android.msp.network.model.ResData;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URLDecoder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ChannelHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean isInitialized;

    public static String requestChannel(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d16c72c9", new Object[]{context, str});
        }
        try {
            synchronized (ChannelHelper.class) {
                GlobalHelper.getInstance().init(context);
                if (!isInitialized) {
                    isInitialized = true;
                    PhoneCashierMspEngine.getMspBase().loadProperties(context);
                }
            }
            if (TidStorage.getInstance(context).isTidAvailable()) {
                return a(context, true, str);
            }
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, "TidAvailablefalse", "isTidAvailable=false time=0002");
            return "";
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            return "";
        }
    }

    private static String a(Context context, boolean z, String str) throws Exception {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c1fc922", new Object[]{context, new Boolean(z), str});
        }
        LogUtil.record(4, "requestChannel", "requestChannel", "start");
        RequestConfig requestConfig = new RequestConfig(RequestConfig.RequestChannel.BYTES_CASHIER);
        requestConfig.setType("cashier");
        requestConfig.setMethod("main");
        ReqData<byte[]> reqData = new ReqData<>(PackUtils.packChannelRequestData(context, requestConfig, str));
        reqData.mBizId = -1;
        ResData<byte[]> requestData = PluginManager.getTransChannel().requestData(reqData, requestConfig);
        requestConfig.setmResponseHeaderGzipFlag(Boolean.valueOf(requestData.getHeader("msp-gzip")).booleanValue());
        try {
            str2 = PackUtils.unpackBytesResponseData(requestData.toBytesData(), requestConfig);
        } catch (PublicKeyException unused) {
            a(context, false, str);
            str2 = null;
        }
        LogUtil.record(2, "", "TidHelper::requestTidByHttp", "Tid realdata:".concat(String.valueOf(str2)));
        LogUtil.record(4, "requestChannel", "data", str2);
        JSONObject parseObject = JSON.parseObject(str2);
        JSONObject jSONObject = parseObject.getJSONObject("data");
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null && jSONObject.containsKey("params")) {
            jSONObject2 = jSONObject.getJSONObject("params");
        }
        if (jSONObject2 != null) {
            String string = jSONObject2.getString("public_key");
            if (!TextUtils.isEmpty(string)) {
                MspConfig.getInstance().setRsaPublicKey(string);
                if (z) {
                    return a(context, false, str);
                }
            }
        }
        if (jSONObject2.containsKey("result")) {
            str3 = URLDecoder.decode(jSONObject2.getString("result"), "UTF-8");
        } else {
            str3 = URLDecoder.decode(parseObject.getString("result"), "UTF-8");
        }
        if (parseObject.containsKey("tid") && parseObject.containsKey(MspFlybirdDefine.FLYBIRD_CLIENT_KEY)) {
            String string2 = parseObject.getString(MspFlybirdDefine.FLYBIRD_CLIENT_KEY);
            String string3 = parseObject.getString("tid");
            if (!TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3)) {
                TidStorage.getInstance().save(string3, string2);
                Object obj = StatisticCollector.GLOBAL_AGENT;
                StatisticCollector.addError(obj, ErrorType.DEFAULT, "saveTidServer", "tidStr=" + string3 + " ck=" + string2 + " time=0002");
            }
        }
        LogUtil.record(4, "URLDecoder", "data", str2);
        return str3;
    }
}
