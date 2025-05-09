package anet.channel.strategy.dispatch;

import android.os.Build;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.security.SecurityHelper;
import anet.channel.statist.AmdcStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.utils.Utils;
import anet.channel.util.ALog;
import anet.channel.util.Inet64Util;
import com.alipay.android.phone.mobilecommon.verifyidentity.BuildConfig;
import com.alipay.mobile.common.transport.utils.SwitchMonitorLogUtil;
import com.alipay.sdk.sys.BizContext;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import tb.kt4;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DispatchParamBuilder {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "amdc.DispatchParamBuilder";

    static {
        t2o.a(607125905);
    }

    private static int getStackType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("15dbc1a6", new Object[0])).intValue();
        }
        int stackType = Inet64Util.getStackType();
        if (stackType == 2) {
            return 2;
        }
        if (stackType != 3) {
            return 4;
        }
        return 1;
    }

    private static String formatDomains(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b529b07a", new Object[]{map});
        }
        StringBuilder sb = new StringBuilder();
        for (String str : (Set) map.remove("hosts")) {
            sb.append(str);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public static String getSign(IAmdcSign iAmdcSign, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("670bf8b", new Object[]{iAmdcSign, map});
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append(Utils.stringNull2Empty(map.get("appkey")));
        sb.append("&");
        sb.append(Utils.stringNull2Empty(map.get("domain")));
        sb.append("&");
        sb.append(Utils.stringNull2Empty(map.get("appName")));
        sb.append("&");
        sb.append(Utils.stringNull2Empty(map.get("appVersion")));
        sb.append("&");
        sb.append(Utils.stringNull2Empty(map.get(DispatchConstants.BSSID)));
        sb.append("&");
        sb.append(Utils.stringNull2Empty(map.get("channel")));
        sb.append("&");
        sb.append(Utils.stringNull2Empty(map.get("deviceId")));
        sb.append("&");
        sb.append(Utils.stringNull2Empty(map.get(DispatchConstants.LATITUDE)));
        sb.append("&");
        sb.append(Utils.stringNull2Empty(map.get(DispatchConstants.LONGTITUDE)));
        sb.append("&");
        sb.append(Utils.stringNull2Empty(map.get(DispatchConstants.MACHINE)));
        sb.append("&");
        sb.append(Utils.stringNull2Empty(map.get("netType")));
        sb.append("&");
        sb.append(Utils.stringNull2Empty(map.get("other")));
        sb.append("&");
        sb.append(Utils.stringNull2Empty(map.get("platform")));
        sb.append("&");
        sb.append(Utils.stringNull2Empty(map.get(DispatchConstants.PLATFORM_VERSION)));
        sb.append("&");
        sb.append(Utils.stringNull2Empty(map.get(DispatchConstants.PRE_IP)));
        sb.append("&");
        sb.append(Utils.stringNull2Empty(map.get("sid")));
        sb.append("&");
        sb.append(Utils.stringNull2Empty(map.get("t")));
        sb.append("&");
        sb.append(Utils.stringNull2Empty(map.get("v")));
        sb.append("&");
        sb.append(Utils.stringNull2Empty(map.get("signType")));
        sb.append("&");
        sb.append(Utils.stringNull2Empty(map.get(DispatchConstants.CONFIG_VERSION)));
        sb.append("&");
        sb.append(Utils.stringNull2Empty(map.get(DispatchConstants.CARRIER)));
        sb.append("&");
        sb.append(Utils.stringNull2Empty(map.get(DispatchConstants.MNC)));
        sb.append("&");
        sb.append(Utils.stringNull2Empty(map.get(DispatchConstants.STACK_TYPE)));
        sb.append("&");
        sb.append(Utils.stringNull2Empty(map.get(DispatchConstants.AB_STRATEGY)));
        try {
            return iAmdcSign.sign(sb.toString());
        } catch (Exception e) {
            ALog.e(TAG, "get sign failed", null, e, new Object[0]);
            return null;
        }
    }

    public static Map buildParamMap(Map<String, Object> map, AmdcStatistic amdcStatistic) {
        Map map2;
        String str;
        NetworkStatusHelper.NetworkStatus networkStatus;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("467c2578", new Object[]{map, amdcStatistic});
        }
        if (amdcStatistic == null) {
            ALog.e(TAG, "amdc as is empty", null, new Object[0]);
            return null;
        }
        IAmdcSign sign = AmdcRuntimeInfo.getSign();
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = currentTimeMillis - GlobalAppRuntimeInfo.getInitTime() <= AwcnConfig.getAmdcLightTime();
        boolean isAmdcPriorityUpdateEnable = AwcnConfig.isAmdcPriorityUpdateEnable();
        boolean isAmdcLimitEnable = AwcnConfig.isAmdcLimitEnable();
        if (isAmdcLimitEnable) {
            isAmdcPriorityUpdateEnable = true;
        }
        ALog.e(TAG, "amdc buildParamMap", amdcStatistic.seqNo, "isAllowLightAmdcRequest", Boolean.valueOf(z), "time", Long.valueOf(currentTimeMillis - GlobalAppRuntimeInfo.getInitTime()), "isAmdcPriorityUpdateEnable", Boolean.valueOf(isAmdcPriorityUpdateEnable), "isAmdcLimitEnable", Boolean.valueOf(isAmdcLimitEnable));
        if (z) {
            String appkey = GlobalAppRuntimeInfo.getAppkey();
            if (appkey == null || appkey.isEmpty()) {
                ALog.e(TAG, "amdc appkey is empty", amdcStatistic.seqNo, "isAllowLightAmdcRequest", Boolean.valueOf(z));
                return null;
            }
            str = appkey;
            map2 = null;
        } else {
            map2 = null;
            if (sign == null) {
                ALog.e(TAG, "amdc sign is null", amdcStatistic.seqNo, "isAllowLightAmdcRequest", Boolean.valueOf(z));
                return null;
            } else if (TextUtils.isEmpty(sign.getAppkey())) {
                ALog.e(TAG, "amdc appkey is empty", amdcStatistic.seqNo, "isAllowLightAmdcRequest", Boolean.valueOf(z));
                return null;
            } else {
                str = sign.getAppkey();
            }
        }
        NetworkStatusHelper.NetworkStatus status = NetworkStatusHelper.getStatus();
        if (!NetworkStatusHelper.isConnected()) {
            ALog.e(TAG, "no network, don't send amdc request", amdcStatistic.seqNo, new Object[0]);
            return map2;
        }
        map.put("appkey", str);
        map.put("platform", "android");
        map.put("netType", status.toString());
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, String> entry : AmdcRuntimeInfo.getParams().entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            if (jSONObject.length() > 0) {
                map.put("other", jSONObject.toString());
            }
        } catch (Exception unused) {
            ALog.e(TAG, "other set error.", amdcStatistic.seqNo, new Object[0]);
        }
        map.put("channel", AmdcRuntimeInfo.appChannel);
        map.put("appName", AmdcRuntimeInfo.appName);
        map.put("appVersion", AmdcRuntimeInfo.appVersion);
        map.put(DispatchConstants.STACK_TYPE, Integer.toString(getStackType()));
        map.put("domain", formatDomains(map));
        String abStrategy = anet.channel.util.Utils.getAbStrategy();
        if (!TextUtils.isEmpty(abStrategy)) {
            map.put(DispatchConstants.AB_STRATEGY, abStrategy);
        }
        map.put("t", String.valueOf(System.currentTimeMillis()));
        HashMap hashMap = new HashMap();
        hashMap.put(DispatchConstants.PLATFORM_VERSION, Build.VERSION.RELEASE);
        if (!TextUtils.isEmpty(GlobalAppRuntimeInfo.getUtdid())) {
            hashMap.put("deviceId", GlobalAppRuntimeInfo.getUtdid());
        }
        hashMap.put(DispatchConstants.CARRIER, NetworkStatusHelper.getCarrier());
        hashMap.put(DispatchConstants.MNC, NetworkStatusHelper.getSimOp());
        String str3 = "noSec";
        if (z) {
            map.put("rm", "l");
            map.put("signType", str3);
            map.put(DispatchConstants.CONFIG_VERSION, "1");
        } else {
            if (sign.useSecurityGuard()) {
                str3 = kt4.KEY_SEC;
            }
            map.put("signType", str3);
        }
        map.put(BizContext.KEY_SDK_VERSION, "1");
        String userId = GlobalAppRuntimeInfo.getUserId();
        if (isAmdcPriorityUpdateEnable) {
            if (isAmdcLimitEnable) {
                if (amdcStatistic.launchCacheFlag == 0) {
                    map.put("cf", "n");
                }
                map.put("v", DispatchConstants.LIMIT_VER_CODE_PROTOCOL);
            } else {
                map.put("v", DispatchConstants.PRIORITY_VER_CODE_PROTOCOL);
            }
            String priority = AmdcPriorityHelper.getPriority(0, SwitchMonitorLogUtil.SRC_AMDC, userId);
            if (priority != null && !priority.isEmpty()) {
                hashMap.put(DispatchConstants.U_PRIORITY, priority);
            }
            amdcStatistic.priority = priority;
            networkStatus = status;
            ALog.e(TAG, "[amdc priority] [amdc] set priority =" + priority, amdcStatistic.seqNo, "isAmdcLimitEnable", Boolean.valueOf(isAmdcLimitEnable), "cacheFlag", Integer.valueOf(amdcStatistic.launchCacheFlag));
        } else {
            networkStatus = status;
            map.put("v", DispatchConstants.LATEST_VER_CODE_PROTOCOL);
        }
        if (!TextUtils.isEmpty(userId)) {
            hashMap.put("sid", userId);
        }
        if (z) {
            String valueOf = String.valueOf(System.currentTimeMillis());
            String encryptNoDeps = SecurityHelper.encryptNoDeps(SecurityHelper.getSecretKey(valueOf), new JSONObject(hashMap).toString(), amdcStatistic.seqNo, "[amdc]");
            ALog.e(TAG, "amdc rm is l, encryptNoDeps!", amdcStatistic.seqNo, "isAllowLightAmdcRequest", Boolean.valueOf(z));
            String replaceAll = (encryptNoDeps == null || encryptNoDeps.isEmpty()) ? null : encryptNoDeps.replaceAll("\n", "");
            map.put("st", valueOf);
            map.put("secData", replaceAll);
            str2 = BuildConfig.RPC_TYPE_DEF;
        } else {
            map.put("secData", sign.aesEncryptStr(new JSONObject(hashMap).toString()));
            ALog.e(TAG, "amdc rm not is l, aesEncryptStr!", amdcStatistic.seqNo, "isAllowLightAmdcRequest", Boolean.valueOf(z));
            HashMap hashMap2 = new HashMap();
            hashMap2.putAll(map);
            hashMap2.putAll(hashMap);
            str2 = getSign(sign, hashMap2);
            if (TextUtils.isEmpty(str2)) {
                return null;
            }
        }
        map.put("sign", str2);
        amdcStatistic.version = DispatchCore.parseObjectString(map, "v");
        map.put(DispatchConstants.NETWORK_ID, NetworkStatusHelper.getUniqueId(networkStatus));
        return map;
    }
}
