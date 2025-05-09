package com.alipay.mobile.common.amnet.service;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.security.realidentity.u2;
import com.alipay.mobile.common.amnet.api.AmnetEnvHelper;
import com.alipay.mobile.common.amnet.api.AmnetUserInfo;
import com.alipay.mobile.common.amnet.ipcapi.mainproc.MainProcGeneralListenService;
import com.alipay.mobile.common.amnet.service.util.PushIpcHelper;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.alipay.mobile.common.netsdkextdependapi.appinfo.AppInfoUtil;
import com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoUtil;
import com.alipay.mobile.common.netsdkextdependapi.security.SecurityUtil;
import com.alipay.mobile.common.netsdkextdependapi.security.SignRequest;
import com.alipay.mobile.common.netsdkextdependapi.security.SignResult;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.strategy.NetworkTunnelStrategy;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.MpaasPropertiesUtil;
import com.alipay.mobile.common.transport.utils.SharedPreUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.tmu;
import tb.x3w;
import tb.z9u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AmnetInitInfosHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f3903a;
    public static String b;
    public static final Map<Byte, Map<String, String>> c = new HashMap();
    public static MainProcGeneralListenService d = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class HashMapTypeReference extends TypeReference<Map<Byte, Map<String, String>>> {
    }

    public static MainProcGeneralListenService a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MainProcGeneralListenService) ipChange.ipc$dispatch("b54b2729", new Object[0]);
        }
        if (d == null) {
            d = (MainProcGeneralListenService) PushIpcHelper.getIpcProxy(MainProcGeneralListenService.class);
        }
        return d;
    }

    public static final String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        String productName = AppInfoUtil.getProductName();
        return productName == null ? "unknow_app_name" : productName;
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                return SecurityUtil.encrypt(str);
            }
            LogCatUtil.debug("amnet_AmnetInitInfosHelper", "encrypt,val is null");
            return "";
        } catch (Throwable th) {
            LogCatUtil.error("amnet_AmnetInitInfosHelper", th);
            return "";
        }
    }

    public static Map<Byte, Map<String, String>> collectFacade(Map<Byte, Map<String, String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6c14c3ef", new Object[]{map});
        }
        try {
            collecteInitInfoFlowV2(map);
        } catch (Exception e) {
            LogCatUtil.error("amnet_AmnetInitInfosHelper", e);
        }
        return map;
    }

    public static void collecteInitInfoFlowV2(Map<Byte, Map<String, String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d726ae1b", new Object[]{map});
            return;
        }
        Map<Byte, Map<String, String>> initInfoFromLocalDeviceInfo = getInitInfoFromLocalDeviceInfo(map);
        if (!mergeAndGetInitInfoFromMainProcDeviceInfo(initInfoFromLocalDeviceInfo)) {
            Map<Byte, Map<String, String>> map2 = c;
            if (!((HashMap) map2).isEmpty()) {
                e(initInfoFromLocalDeviceInfo, map2);
            } else {
                k(initInfoFromLocalDeviceInfo);
            }
        }
    }

    public static void d(Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
            return;
        }
        String workspaceIdForMPaaS = AppInfoUtil.getWorkspaceIdForMPaaS();
        if (!TextUtils.isEmpty(workspaceIdForMPaaS)) {
            map.put(HeaderConstant.HEADER_KEY_WORKSPACE_ID, workspaceIdForMPaaS);
            String valueOf = String.valueOf(System.currentTimeMillis());
            map.put(tmu.CURRENT_TIME, valueOf);
            String b2 = b(AmnetEnvHelper.getAppContext());
            SignRequest signRequest = new SignRequest();
            signRequest.appkey = MpaasPropertiesUtil.getAppKeyFromMetaData(AmnetEnvHelper.getAppContext());
            signRequest.content = workspaceIdForMPaaS + "" + b2 + "" + valueOf;
            signRequest.signType = SignRequest.SIGN_TYPE_MD5;
            SignResult signature = SecurityUtil.signature(signRequest);
            if (!TextUtils.isEmpty(signature.sign)) {
                map.put("sign", signature.sign);
            }
            StringBuilder sb = new StringBuilder("[putDatasForMPaaS] Sign infos. AppName:");
            sb.append(b2);
            sb.append(", raw content:");
            sb.append(signRequest.content);
            sb.append(", sign :");
            if (signature.isSuccess()) {
                str = signature.sign;
            } else {
                str = "NULL";
            }
            sb.append(str);
            LogCatUtil.info("amnet_AmnetInitInfosHelper", sb.toString());
        }
    }

    public static boolean e(Map<Byte, Map<String, String>> map, Map<Byte, Map<String, String>> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0efabcc", new Object[]{map, map2})).booleanValue();
        }
        if (isInitMapEmpty(map2)) {
            return false;
        }
        for (Map.Entry<Byte, Map<String, String>> entry : map2.entrySet()) {
            if (entry.getValue() != null && !entry.getValue().isEmpty()) {
                Map<String, String> map3 = map.get(entry.getKey());
                if (map3 != null) {
                    map3.putAll(entry.getValue());
                } else {
                    map.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return true;
    }

    public static String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                return SecurityUtil.decrypt(str);
            }
            LogCatUtil.debug("amnet_AmnetInitInfosHelper", "decrypt,enVal is null");
            return "";
        } catch (Throwable th) {
            LogCatUtil.error("amnet_AmnetInitInfosHelper", th);
            return "";
        }
    }

    public static void g(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{map});
            return;
        }
        String appIdForMPaaS = AppInfoUtil.getAppIdForMPaaS();
        if (!TextUtils.isEmpty(appIdForMPaaS)) {
            map.put("AppName", appIdForMPaaS);
        } else {
            map.put("AppName", b(AmnetEnvHelper.getAppContext()));
        }
    }

    public static Map<Byte, Map<String, String>> getInitInfoFromMainProcDeviceInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d85f8c2d", new Object[0]);
        }
        try {
            return a().collect(new HashMap(0));
        } catch (Throwable th) {
            LogCatUtil.warn("amnet_AmnetInitInfosHelper", "collect init from main proc. " + th.toString());
            return null;
        }
    }

    public static String getUtdId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f9ac854f", new Object[0]);
        }
        return DeviceInfoUtil.getDeviceId();
    }

    public static boolean h(Map<Byte, Map<String, String>> map, Map<Byte, Map<String, String>> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c86b8d", new Object[]{map, map2})).booleanValue();
        }
        if (isInitMapEmpty(map2)) {
            return false;
        }
        for (Map.Entry<Byte, Map<String, String>> entry : map2.entrySet()) {
            if (entry.getValue() != null && !entry.getValue().isEmpty()) {
                Map<String, String> map3 = map.get(entry.getKey());
                if (map3 != null) {
                    for (Map.Entry<String, String> entry2 : entry.getValue().entrySet()) {
                        map3.put(entry2.getKey(), entry2.getValue());
                    }
                } else {
                    map.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return true;
    }

    public static void i(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2985bedb", new Object[]{map});
        } else if (NetworkTunnelStrategy.getInstance().isCanUseAmnet()) {
            map.put("only_push", "false");
        } else if (TransportStrategy.isEnabledOnlyPush()) {
            map.put("only_push", "true");
        } else {
            LogCatUtil.warn("amnet_AmnetInitInfosHelper", "Can not use amnet, but no enable onlypush.");
            map.put("only_push", "false");
        }
    }

    public static boolean isInitMapEmpty(Map<Byte, Map<String, String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6dcc177", new Object[]{map})).booleanValue();
        }
        if (map == null || map.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean isStringMapEmpty(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c896856", new Object[]{map})).booleanValue();
        }
        if (map == null || map.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean j(Map<Byte, Map<String, String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1127953e", new Object[]{map})).booleanValue();
        }
        if (!isInitMapEmpty(map) && !isStringMapEmpty(map.get((byte) 0))) {
            return true;
        }
        return false;
    }

    public static boolean k(Map<Byte, Map<String, String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8c96b9d", new Object[]{map})).booleanValue();
        }
        String str = "";
        try {
            str = f(SharedPreUtils.getStringData(AmnetEnvHelper.getAppContext(), "amnet_init_info"));
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return e(map, parseJson2MapAndUpdateMemCache(str));
        } catch (Exception e) {
            logJsonEmptyErr(str, e);
            return false;
        }
    }

    public static void logJsonEmptyErr(String str, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f5dbed1", new Object[]{str, exc});
            return;
        }
        StringBuilder sb = new StringBuilder("initJson=[");
        if (TextUtils.isEmpty(str)) {
            str = " is empty ";
        }
        sb.append(str);
        sb.append("]");
        LogCatUtil.error("amnet_AmnetInitInfosHelper", sb.toString(), exc);
    }

    public static void logJsonParseErr(String str, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a21d1b7", new Object[]{str, exc});
            return;
        }
        StringBuilder sb = new StringBuilder("JSON.parseObject exception. initJson=[");
        if (TextUtils.isEmpty(str)) {
            str = " is empty ";
        }
        sb.append(str);
        sb.append("]");
        LogCatUtil.error("amnet_AmnetInitInfosHelper", sb.toString(), exc);
    }

    public static Map<Byte, Map<String, String>> parseJson2Map(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8a75190b", new Object[]{str});
        }
        try {
            Map<Byte, Map<String, String>> map = (Map) JSON.parseObject(str, new HashMapTypeReference(), new Feature[0]);
            if (!isInitMapEmpty(map) && !isStringMapEmpty(map.get((byte) 0))) {
                return map;
            }
            return null;
        } catch (Exception e) {
            SharedPreUtils.removeData(AmnetEnvHelper.getAppContext(), "amnet_init_info");
            logJsonParseErr(str, e);
            return null;
        }
    }

    public static Map<Byte, Map<String, String>> parseJson2MapAndUpdateMemCache(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c140714e", new Object[]{str});
        }
        Map<Byte, Map<String, String>> parseJson2Map = parseJson2Map(str);
        if (parseJson2Map == null) {
            return null;
        }
        Map<Byte, Map<String, String>> map = c;
        ((HashMap) map).clear();
        ((HashMap) map).putAll(parseJson2Map);
        return parseJson2Map;
    }

    public static void updateSyncInitInfo(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73c753dc", new Object[]{map});
            return;
        }
        LogCatUtil.info("amnet_AmnetInitInfosHelper", "updateSyncInitInfo.");
        try {
            Map<Byte, Map<String, String>> map2 = c;
            Map map3 = (Map) ((HashMap) map2).get((byte) 2);
            if (map3 != null && !map3.isEmpty()) {
                map3.clear();
                map3.putAll(map);
                SharedPreUtils.putData(AmnetEnvHelper.getAppContext(), "amnet_init_info", c(JSON.toJSONString(map2)));
            }
        } catch (Exception e) {
            LogCatUtil.error("amnet_AmnetInitInfosHelper", e);
        }
    }

    public static boolean waitBinde() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc83265e", new Object[0])).booleanValue();
        }
        if (!PushIpcHelper.hasRegister() && (AmnetServiceLifeCycleListener.getInstance().isBindedMainProc() || MiscUtils.isAtFrontDesk(AmnetEnvHelper.getAppContext()) || MiscUtils.isMainProcessRuning(AmnetEnvHelper.getAppContext()))) {
            LogCatUtil.warn("amnet_AmnetInitInfosHelper", "Main bunded ,  waiting callback register!");
            PushIpcHelper.waitBinded();
            return true;
        } else if (PushIpcHelper.hasRegister()) {
            return true;
        } else {
            LogCatUtil.warn("amnet_AmnetInitInfosHelper", "No bunded , return false!");
            return false;
        }
    }

    public static final Map<Byte, Map<String, String>> getInitInfoFromLocalDeviceInfo(Map<Byte, Map<String, String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f5f08f02", new Object[]{map});
        }
        LogCatUtil.info("amnet_AmnetInitInfosHelper", "collect AmnetInitInfosHelper ");
        HashMap hashMap = new HashMap();
        hashMap.put("utdid", getUtdId());
        hashMap.put("userId", AmnetUserInfo.getUserId());
        hashMap.put("cacheSessionId", AmnetUserInfo.getSessionId());
        hashMap.put("systemType", "android");
        hashMap.put(RVConstants.EXTRA_APPTYPE, "client");
        hashMap.put(u2.q, "phone");
        hashMap.put("isPushEnable", "T");
        try {
            hashMap.put("vmType", DeviceInfoUtil.getVmType());
            hashMap.put("apiLevel", String.valueOf(Build.VERSION.SDK_INT));
            hashMap.put("releaseVersion", AppInfoUtil.getReleaseCode());
        } catch (Throwable th) {
            LogCatUtil.error("amnet_AmnetInitInfosHelper", th);
        }
        hashMap.put("channels", AppInfoUtil.getChannelId());
        hashMap.put(LoggingSPCache.STORAGE_PRODUCTID, AppInfoUtil.getProductId());
        hashMap.put(LoggingSPCache.STORAGE_PRODUCTVERSION, AppInfoUtil.getProductVersion());
        DeviceInfoUtil.reInitDeviceInfo();
        hashMap.put("systemVersion", DeviceInfoUtil.getSystemVersion());
        hashMap.put("userAgent", DeviceInfoUtil.getUserAgent());
        hashMap.put(x3w.KEY_NEW_DETAIL_VISIBLE_BLOCK_WIDTH, String.valueOf(DeviceInfoUtil.getScreenWidth()));
        hashMap.put("screenHigh", String.valueOf(DeviceInfoUtil.getScreenHeight()));
        hashMap.put("mobileBrand", DeviceInfoUtil.getMobileBrand());
        hashMap.put("mobileModel", DeviceInfoUtil.getMobileModel());
        hashMap.put("romVersion", DeviceInfoUtil.getRomVersion());
        hashMap.put(z9u.KEY_ACCESS_POINT, DeviceInfoUtil.getAccessPoint());
        hashMap.put("imei", DeviceInfoUtil.getImei());
        hashMap.put("imsi", DeviceInfoUtil.getImsi());
        hashMap.put("isPrisonBreak", String.valueOf(DeviceInfoUtil.isRooted()));
        g(hashMap);
        d(hashMap);
        if (!TextUtils.isEmpty(AmnetUserInfo.getUserId())) {
            hashMap.put("clientPostion", DeviceInfoUtil.getCellInfo());
        } else {
            hashMap.put("clientPostion", "-1;-1");
        }
        i(hashMap);
        Map<String, String> map2 = map.get((byte) 0);
        if (map2 == null) {
            map.put((byte) 0, hashMap);
        } else {
            map2.putAll(hashMap);
        }
        if (MiscUtils.isDebugger(AmnetEnvHelper.getAppContext())) {
            try {
                LogCatUtil.debug("amnet_AmnetInitInfosHelper", "collect [ AmnetInitInfosHelper ] " + JSON.toJSONString(map));
            } catch (Throwable th2) {
                LogCatUtil.error("amnet_AmnetInitInfosHelper", th2);
            }
        }
        return map;
    }

    public static void updateUserInfoForInitInfo(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16f2ee80", new Object[]{str, str2});
            return;
        }
        if (MiscUtils.isDebugger(AmnetEnvHelper.getAppContext())) {
            LogCatUtil.printInfo("amnet_AmnetInitInfosHelper", "updateUserInfoForInitInfo userId=[" + str + "] sessionId=[" + str2 + "] ");
        }
        f3903a = str;
        b = str2;
        Map<Byte, Map<String, String>> map = c;
        Map map2 = (Map) ((HashMap) map).get((byte) 0);
        if (map2 == null || map2.isEmpty()) {
            String f = f(SharedPreUtils.getStringData(AmnetEnvHelper.getAppContext(), "amnet_init_info"));
            if (!TextUtils.isEmpty(f)) {
                Map map3 = (Map) JSON.parseObject(f, new HashMapTypeReference(), new Feature[0]);
                if (j(map3)) {
                    Map map4 = (Map) map3.get((byte) 0);
                    map4.put("userId", f3903a);
                    map4.put("cacheSessionId", b);
                    ((HashMap) map).clear();
                    ((HashMap) map).putAll(map3);
                    SharedPreUtils.putData(AmnetEnvHelper.getAppContext(), "amnet_init_info", c(JSON.toJSONString(map4)));
                    return;
                }
                return;
            }
            return;
        }
        map2.put("userId", f3903a);
        map2.put("cacheSessionId", b);
        SharedPreUtils.putData(AmnetEnvHelper.getAppContext(), "amnet_init_info", c(JSON.toJSONString(map)));
    }

    public static boolean mergeAndGetInitInfoFromMainProcDeviceInfo(Map<Byte, Map<String, String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d351b5b0", new Object[]{map})).booleanValue();
        }
        try {
            waitBinde();
            LogCatUtil.info("amnet_AmnetInitInfosHelper", "start get main process !!");
            Map<Byte, Map<String, String>> initInfoFromMainProcDeviceInfo = getInitInfoFromMainProcDeviceInfo();
            if (!j(initInfoFromMainProcDeviceInfo)) {
                return false;
            }
            Map<Byte, Map<String, String>> map2 = c;
            h(map2, initInfoFromMainProcDeviceInfo);
            SharedPreUtils.putData(AmnetEnvHelper.getAppContext(), "amnet_init_info", c(JSON.toJSONString(map2)));
            LogCatUtil.info("amnet_AmnetInitInfosHelper", "get main process init success !!");
            e(map, initInfoFromMainProcDeviceInfo);
            return true;
        } catch (Throwable th) {
            LogCatUtil.warn("amnet_AmnetInitInfosHelper", "collect init from main proc. " + th.toString());
            return false;
        }
    }
}
