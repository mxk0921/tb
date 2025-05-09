package com.alipay.android.msp.framework.helper;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.os.Build;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.statisticsv2.collector.TradeCollector;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.a3j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspExperimentHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_TYPE_CONTROL = "key_type_control";
    public static final String KEY_TYPE_DEFAULT = "key_type_default";
    public static final String KEY_TYPE_EXP = "key_type_exp";

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String> f3624a = new HashMap();

    public static boolean configHit(MspContext mspContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed4180bc", new Object[]{mspContext, str})).booleanValue();
        }
        boolean isGray = isGray(str);
        reportEvent(mspContext, str);
        return isGray;
    }

    public static String getKeyExpResult(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("536dbd9e", new Object[]{str});
        }
        if (str == null) {
            return KEY_TYPE_DEFAULT;
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            if (parseObject == null || !parseObject.containsKey("expValue")) {
                return KEY_TYPE_DEFAULT;
            }
            String string = parseObject.getString("expValue");
            if (TextUtils.equals(string, "1")) {
                return KEY_TYPE_EXP;
            }
            if (TextUtils.equals(string, "0")) {
                return KEY_TYPE_CONTROL;
            }
            return KEY_TYPE_DEFAULT;
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return KEY_TYPE_DEFAULT;
        }
    }

    public static final boolean outPayImmersiveExpHit(MspTradeContext mspTradeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68819766", new Object[]{mspTradeContext})).booleanValue();
        }
        if (mspTradeContext == null) {
            return false;
        }
        mspTradeContext.getContext();
        return false;
    }

    public static void reportEvent(MspContext mspContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1d239cd", new Object[]{mspContext, str});
            return;
        }
        Map<String, String> map = f3624a;
        if (((HashMap) map).containsKey(str)) {
            reportResult(mspContext, str, (String) ((HashMap) map).get(str));
        } else {
            LogUtil.record(4, "没有进入实验", str);
        }
    }

    public static void reportResult(MspContext mspContext, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e91f0602", new Object[]{mspContext, str, str2});
        } else if (mspContext != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("apLinkToken", (Object) mspContext.getApLinkToken());
            if (mspContext instanceof MspTradeContext) {
                MspTradeContext mspTradeContext = (MspTradeContext) mspContext;
                jSONObject.put("clientBizType", (Object) TradeCollector.getBizType(mspTradeContext.getBizId()));
                jSONObject.put("packageName", (Object) mspTradeContext.getOutPackageName());
                Map<String, String> clientLogData = mspTradeContext.getClientLogData();
                if (clientLogData != null && clientLogData.size() > 0) {
                    jSONObject.put("bizType", (Object) clientLogData.get("bizType"));
                    jSONObject.put("bizNo", (Object) clientLogData.get("bizNo"));
                    jSONObject.put("bizIdentity", (Object) clientLogData.get("bizIdentity"));
                    jSONObject.put("salesProductCode", (Object) clientLogData.get("salesProductCode"));
                    jSONObject.put("partnerId", (Object) clientLogData.get("partnerId"));
                }
            }
            HashMap hashMap = new HashMap();
            hashMap.put("experimenKey", str);
            hashMap.put("experimenType", "NativeConfig");
            hashMap.put("experimenConfig", str2);
            hashMap.put("experimenParams", jSONObject.toJSONString());
            if (TextUtils.equals("10000", PhoneCashierMspEngine.getMspWallet().getWalletConfig("MQP_degrade_exp_antevent_bizcode_payimp"))) {
                EventLogUtil.logPayEvent("10101054", hashMap);
            } else {
                EventLogUtil.logPayImpEvent("10101054", hashMap);
            }
        }
    }

    public static final void checkOutPayImmersive(MspTradeContext mspTradeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1caecb60", new Object[]{mspTradeContext});
        } else if (mspTradeContext != null && outPayImmersiveExpHit(mspTradeContext)) {
            Context context = mspTradeContext.getContext();
            if (isLiveShow(context)) {
                JSONObject drmValueFromKey = DrmManager.getInstance(context).getDrmValueFromKey(DrmKey.GRAY_EXP_OUTPAY_LIVESHOW_IMMERSIVE);
                if (drmValueFromKey != null && drmValueFromKey.containsKey("expValue")) {
                    if (TextUtils.equals(drmValueFromKey.getString("expValue"), "1")) {
                        mspTradeContext.setTranslucentBg(true);
                    }
                    reportResult(mspTradeContext, DrmKey.GRAY_EXP_OUTPAY_LIVESHOW_IMMERSIVE, drmValueFromKey.toJSONString());
                    return;
                }
                return;
            }
            LogUtil.record(2, "MyExperimentHelper.checkOutPayImmersive", "isLiveShow: false");
        }
    }

    public static boolean isGray(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ad2b182", new Object[]{str})).booleanValue();
        }
        try {
            jSONObject = JSON.parseObject(PhoneCashierMspEngine.getMspWallet().getWalletConfig(str));
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            jSONObject = null;
        }
        if (jSONObject == null || !jSONObject.containsKey("expValue")) {
            return false;
        }
        String string = jSONObject.getString("expValue");
        ((HashMap) f3624a).put(str, jSONObject.toJSONString());
        LogUtil.i("MspExperimentHelper", "isGray", str + " 命中灰度");
        return TextUtils.equals(string, "1");
    }

    public static boolean isLiveShow(Context context) {
        List<Object> activePlaybackConfigurations;
        AudioAttributes audioAttributes;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("112250b2", new Object[]{context})).booleanValue();
        }
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            LogUtil.record(2, "MspExperimentHelper.isLiveShow", "am null");
            return false;
        } else if (Build.VERSION.SDK_INT < 26) {
            LogUtil.record(2, "MspExperimentHelper.isLiveShow", "sdk version < 26");
            return false;
        } else {
            StringBuilder sb = new StringBuilder();
            activePlaybackConfigurations = audioManager.getActivePlaybackConfigurations();
            if (activePlaybackConfigurations != null && activePlaybackConfigurations.size() > 0) {
                for (Object obj : activePlaybackConfigurations) {
                    audioAttributes = a3j.a(obj).getAudioAttributes();
                    if (audioAttributes != null) {
                        sb.append(audioAttributes + ", ");
                        if (audioAttributes.getUsage() == 1) {
                            z = true;
                        }
                    }
                }
            }
            LogUtil.record(8, "MspWindowFrameDispatcher.isLiveShow", "isLiveShow=" + z + ", " + ((Object) sb));
            return z;
        }
    }
}
