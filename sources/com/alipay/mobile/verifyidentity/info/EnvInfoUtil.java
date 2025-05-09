package com.alipay.mobile.verifyidentity.info;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.TimeCostLog;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.fingerprint.SafepayChecker;
import com.alipay.mobile.verifyidentity.utils.FutureHelper;
import com.alipay.mobile.verifyidentity.utils.IDecisionHelper;
import com.alipay.mobile.verifyidentity.utils.ReflectUtils;
import com.alipay.mobile.verifyidentity.utils.ReportHelper;
import com.alipay.mobile.verifyidentity.utils.VIUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Callable;
import tb.k7m;
import tb.upx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class EnvInfoUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_IS_IPAY = "is_ipay";
    public static final String KEY_USER_ID = "USER_ID";

    /* renamed from: a  reason: collision with root package name */
    public static String f4297a = "";
    public static String b = "";

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        if ("Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.removeIdpData))) {
            return null;
        }
        String decisionVersion = IDecisionHelper.getDecisionVersion();
        if (TextUtils.isEmpty(decisionVersion)) {
            return null;
        }
        return "a;" + decisionVersion;
    }

    public static String b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f223e6b4", new Object[]{new Boolean(z)});
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Object invokeMethod = ReflectUtils.invokeMethod(c(), "getFpSecdata", new Class[]{Context.class, Boolean.TYPE}, new Object[]{MicroModuleContext.getInstance().getContext(), Boolean.valueOf(z)});
        VerifyLogCat.i("EnvInfoUtil", "getFpSecdata: " + invokeMethod);
        TimeCostLog.log("EnvInfoUtil", "getFpSecdata耗时：", elapsedRealtime);
        if (invokeMethod != null) {
            return String.valueOf(invokeMethod);
        }
        return "";
    }

    public static Object c() {
        try {
            return SafepayChecker.class.newInstance();
        } catch (Throwable th) {
            VerifyLogCat.w("EnvInfoUtil", "getFingerprintChecker FAILED With Exception!!!", th);
            return null;
        }
    }

    public static Map<String, Object> getBaseEnvData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ece4ab6c", new Object[0]);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("apdid", AppInfo.getInstance().getApdid());
        hashMap.put(upx.APDIDTOKEN, AppInfo.getInstance().getApdidToken());
        hashMap.put("appName", AppInfo.getInstance().getAppName());
        hashMap.put("appVersion", AppInfo.getInstance().getAppVersion());
        hashMap.put(k7m.KEY_DEVICE_TYPE, AppInfo.getInstance().getDeviceType());
        hashMap.put("osVersion", DeviceInfo.getOsVersion());
        hashMap.put("sdkVersion", AppInfo.getInstance().getViSdkVersion());
        hashMap.put("viSdkVersion", AppInfo.getInstance().getViSdkVersion());
        hashMap.put(ChangeAppIconBridge.KEY_DEVICEMODEL, DeviceInfo.getMobileModel());
        hashMap.put("deviceName", DeviceInfo.getMobileManufacturer());
        if (TextUtils.isEmpty(f4297a) || TextUtils.isEmpty(b)) {
            Properties properties = new Properties();
            readConfig("channel.config", properties);
            f4297a = properties.getProperty("bit", "");
            b = properties.getProperty(NotificationCompat.TvExtender.EXTRA_CHANNEL_ID, "");
            hashMap.put("bit", f4297a);
            hashMap.put(NotificationCompat.TvExtender.EXTRA_CHANNEL_ID, b);
        } else {
            hashMap.put("bit", f4297a);
            hashMap.put(NotificationCompat.TvExtender.EXTRA_CHANNEL_ID, b);
        }
        VerifyLogCat.i("EnvInfoUtil", "1bit:" + f4297a + ", 1channel_id:" + b);
        return hashMap;
    }

    public static JSONObject getBaseEnvInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7443479b", new Object[0]);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("apdid", (Object) AppInfo.getInstance().getApdid());
        jSONObject.put(upx.APDIDTOKEN, (Object) AppInfo.getInstance().getApdidToken());
        jSONObject.put("appName", (Object) AppInfo.getInstance().getAppName());
        jSONObject.put("appVersion", (Object) AppInfo.getInstance().getAppVersion());
        jSONObject.put("viSdkVersion", (Object) AppInfo.getInstance().getViSdkVersion());
        jSONObject.put(k7m.KEY_DEVICE_TYPE, (Object) AppInfo.getInstance().getDeviceType());
        jSONObject.put("tid", (Object) AppInfo.getInstance().getMspTid());
        TimeCostLog.log("EnvInfoUtil", "AppInfo拼接耗时：", elapsedRealtime);
        String a2 = a();
        if (!TextUtils.isEmpty(a2)) {
            jSONObject.put("idp", (Object) a2);
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        jSONObject.put(ChangeAppIconBridge.KEY_DEVICEMODEL, (Object) DeviceInfo.getMobileModel());
        jSONObject.put("manufacturer", (Object) DeviceInfo.getMobileManufacturer());
        jSONObject.put("osVersion", (Object) DeviceInfo.getOsVersion());
        TimeCostLog.log("EnvInfoUtil", "DeviceInfo拼接耗时：", elapsedRealtime2);
        if (TextUtils.isEmpty(f4297a) || TextUtils.isEmpty(b)) {
            Properties properties = new Properties();
            readConfig("channel.config", properties);
            f4297a = properties.getProperty("bit", "");
            b = properties.getProperty(NotificationCompat.TvExtender.EXTRA_CHANNEL_ID, "");
            jSONObject.put("bit", (Object) f4297a);
            jSONObject.put(NotificationCompat.TvExtender.EXTRA_CHANNEL_ID, (Object) b);
        } else {
            jSONObject.put("bit", (Object) f4297a);
            jSONObject.put(NotificationCompat.TvExtender.EXTRA_CHANNEL_ID, (Object) b);
        }
        VerifyLogCat.i("EnvInfoUtil", "bit:" + f4297a + ", channel_id:" + b);
        return jSONObject;
    }

    public static String getBioInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60d62559", new Object[0]);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ModuleConstants.VI_MODULE_BIO_METAINFO, (Object) getBioMetaInfo());
        jSONObject.put("appName", (Object) AppInfo.getInstance().getAppName());
        jSONObject.put("appVersion", (Object) AppInfo.getInstance().getAppVersion());
        jSONObject.put("viSdkVersion", (Object) AppInfo.getInstance().getViSdkVersion());
        jSONObject.put(k7m.KEY_DEVICE_TYPE, (Object) AppInfo.getInstance().getDeviceType());
        jSONObject.put(ChangeAppIconBridge.KEY_DEVICEMODEL, (Object) DeviceInfo.getMobileModel());
        jSONObject.put("osVersion", (Object) DeviceInfo.getOsVersion());
        return jSONObject.toJSONString();
    }

    public static String getBioMetaInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3056f7d4", new Object[0]) : getBioMetaInfo(VIUtils.getUserId());
    }

    public static String getBirdNestInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b00c50a4", new Object[0]);
        }
        Object invokeStaticMethod = ReflectUtils.invokeStaticMethod("com.alipay.mobile.verifyidentity.module.dynamic.helper.BirdNestHelper", "getEngineParams");
        VerifyLogCat.i("EnvInfoUtil", "获取到鸟巢信息:" + invokeStaticMethod);
        if (invokeStaticMethod != null) {
            return String.valueOf(invokeStaticMethod);
        }
        return "";
    }

    public static String getEnvInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ecfd514", new Object[0]);
        }
        return getEnvInfoWithExt(false, false);
    }

    public static String getEnvInfoForMsp(String str, boolean z) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1eb6b403", new Object[]{str, new Boolean(z)});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject fpSecdataJO = getFpSecdataJO(z);
        String isSupportFP = getIsSupportFP();
        String bioMetaInfo = getBioMetaInfo(str);
        String mobileModel = DeviceInfo.getMobileModel();
        String installedCert = getInstalledCert(str);
        String viSdkVersion = AppInfo.getInstance().getViSdkVersion();
        if ("Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.stopNewTid))) {
            str2 = AppInfo.getInstance().getTid();
        } else {
            str2 = AppInfo.getInstance().getMspTid();
        }
        if (fpSecdataJO != null) {
            jSONObject.put("secData", (Object) fpSecdataJO);
        }
        if ("Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.collectSecCam))) {
            jSONObject.put("secCamData", (Object) getSecCamData());
        }
        if (!TextUtils.isEmpty(isSupportFP)) {
            jSONObject.put("sfp", (Object) isSupportFP);
        }
        if (!TextUtils.isEmpty(bioMetaInfo)) {
            jSONObject.put("bmi", (Object) bioMetaInfo);
        }
        if (!TextUtils.isEmpty(mobileModel)) {
            jSONObject.put("dm", (Object) mobileModel);
        }
        if (!TextUtils.isEmpty(installedCert)) {
            jSONObject.put(MspGlobalDefine.CERTSN, (Object) installedCert);
        }
        if (!TextUtils.isEmpty(viSdkVersion)) {
            jSONObject.put("viv", (Object) viSdkVersion);
        }
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put("tid", (Object) str2);
        }
        String a2 = a();
        if (!TextUtils.isEmpty(a2)) {
            jSONObject.put("idp", (Object) a2);
        }
        if (TextUtils.isEmpty(f4297a) || TextUtils.isEmpty(b)) {
            Properties properties = new Properties();
            readConfig("channel.config", properties);
            f4297a = properties.getProperty("bit", "");
            b = properties.getProperty(NotificationCompat.TvExtender.EXTRA_CHANNEL_ID, "");
            jSONObject.put("bit", (Object) f4297a);
            jSONObject.put(NotificationCompat.TvExtender.EXTRA_CHANNEL_ID, (Object) b);
        } else {
            jSONObject.put("bit", (Object) f4297a);
            jSONObject.put(NotificationCompat.TvExtender.EXTRA_CHANNEL_ID, (Object) b);
        }
        VerifyLogCat.i("EnvInfoUtil", "2bit:" + f4297a + ", 1channel_id:" + b);
        return jSONObject.toJSONString();
    }

    public static String getEnvInfoWithExt(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a41a68c3", new Object[]{new Boolean(z), new Boolean(z2)});
        }
        JSONObject baseEnvInfo = getBaseEnvInfo();
        JSONObject jSONObject = new JSONObject();
        if (z) {
            jSONObject.put(ModuleConstants.VI_MODULE_IS_SUPPORT_FP, (Object) getIsSupportFP());
            JSONObject fpSecdataJO = getFpSecdataJO();
            if (fpSecdataJO != null) {
                jSONObject.put("secData", (Object) fpSecdataJO);
            }
        }
        if (z2) {
            jSONObject.put(ModuleConstants.VI_MODULE_BIO_METAINFO, (Object) getBioMetaInfo());
        }
        if ("Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.collectSecCam))) {
            jSONObject.put("secCamData", (Object) getSecCamData());
        }
        jSONObject.put("bp", (Object) getBirdNestInfo());
        baseEnvInfo.put("externParams", (Object) jSONObject);
        return baseEnvInfo.toJSONString();
    }

    public static String getFpSecdata() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ee2d2d3e", new Object[0]);
        }
        return b(false);
    }

    public static JSONObject getFpSecdataJO() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("319f92c7", new Object[0]) : getFpSecdataJO(false);
    }

    public static JSONObject getMaCanFpSecData() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("63ceb852", new Object[0]);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Object invokeMethod = ReflectUtils.invokeMethod(c(), "getInterNalFpData", new Class[]{Context.class}, new Object[]{MicroModuleContext.getInstance().getContext()});
        VerifyLogCat.i("EnvInfoUtil", "getInterFpSecdata: " + invokeMethod);
        TimeCostLog.log("EnvInfoUtil", "getInterFpSecdata耗时：", elapsedRealtime);
        if (invokeMethod != null) {
            str = String.valueOf(invokeMethod);
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return JSON.parseObject(str);
        } catch (Exception e) {
            VerifyLogCat.e("EnvInfoUtil", "Macan json fail ".concat(str), e);
            return null;
        }
    }

    public static String getSecCamData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("69109f3b", new Object[0]);
        }
        try {
            final Context context = MicroModuleContext.getInstance().getContext();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Object futureEntrance = new FutureHelper().futureEntrance(new Callable<Object>() { // from class: com.alipay.mobile.verifyidentity.info.EnvInfoUtil.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ipChange2.ipc$dispatch("6d249ded", new Object[]{this});
                    }
                    VerifyLogCat.i("EnvInfoUtil", "getSecCamData Future CALL");
                    try {
                        return ReflectUtils.invokeStaticMethod("com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager", "getSecCamData", new Class[]{Context.class}, new Object[]{context});
                    } catch (Throwable th) {
                        VerifyLogCat.w("EnvInfoUtil", "getSecCamData 遇到异常", th);
                        return "";
                    }
                }
            });
            VerifyLogCat.i("EnvInfoUtil", "getSecCamData result: " + futureEntrance);
            TimeCostLog.log("EnvInfoUtil", "getSecCamData耗时：", elapsedRealtime);
            if (futureEntrance != null) {
                return String.valueOf(futureEntrance);
            }
            return "";
        } catch (Throwable th) {
            VerifyLogCat.e("EnvInfoUtil", "getSecCamData exp: ", th);
            return "";
        }
    }

    public static String getSecDataForMsp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("51deccf3", new Object[0]);
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject fpSecdataJO = getFpSecdataJO();
        if (fpSecdataJO != null) {
            jSONObject.put("secData", (Object) fpSecdataJO);
        }
        return jSONObject.toJSONString();
    }

    public static void readConfig(String str, Properties properties) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74425f45", new Object[]{str, properties});
        }
    }

    public static String viClientData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f26716d1", new Object[0]);
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject maCanFpSecData = getMaCanFpSecData();
        if (maCanFpSecData != null) {
            jSONObject.put("ifaaData", (Object) maCanFpSecData.toJSONString());
        }
        jSONObject.put("zolozData", (Object) getBioMetaInfo());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("clientIdentityInfo", (Object) jSONObject);
        return jSONObject2.toJSONString();
    }

    public static String getBioMetaInfo(String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8106764a", new Object[]{str});
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        final HashMap hashMap = new HashMap();
        hashMap.put("USER_ID", str);
        final Context context = MicroModuleContext.getInstance().getContext();
        if ("Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.noBmiTimeOut))) {
            VerifyLogCat.i("EnvInfoUtil", "下发了不做getBioMetaInfo超时限制的开关");
            obj = ReflectUtils.invokeStaticMethod("com.alipay.mobile.security.bio.api.BioDetectorBuilder", "getMetaInfos", new Class[]{Context.class, Map.class}, new Object[]{context, hashMap});
        } else {
            obj = new FutureHelper().futureEntrance(new Callable<Object>() { // from class: com.alipay.mobile.verifyidentity.info.EnvInfoUtil.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ipChange2.ipc$dispatch("6d249ded", new Object[]{this});
                    }
                    VerifyLogCat.i("EnvInfoUtil", "getMetaInfos Future CALL");
                    try {
                        return ReflectUtils.invokeStaticMethod("com.alipay.mobile.security.bio.api.BioDetectorBuilder", "getMetaInfos", new Class[]{Context.class, Map.class}, new Object[]{context, hashMap});
                    } catch (Throwable th) {
                        VerifyLogCat.w("EnvInfoUtil", "getMetaInfos遇到异常", th);
                        return "";
                    }
                }
            });
        }
        VerifyLogCat.i("EnvInfoUtil", "获取到生物信息（getBioMetaInfo）:" + obj);
        if (obj != null) {
            String valueOf = String.valueOf(obj);
            TimeCostLog.log("EnvInfoUtil", "getBioMetaInfo耗时：", elapsedRealtime);
            return valueOf;
        }
        TimeCostLog.log("EnvInfoUtil", "getBioMetaInfo耗时：", elapsedRealtime);
        return "";
    }

    public static String getEnvData(Bundle bundle) {
        JSONObject jSONObject;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bda37454", new Object[]{bundle});
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        JSONObject baseEnvInfo = getBaseEnvInfo();
        baseEnvInfo.put(ModuleConstants.VI_MODULE_IS_SUPPORT_FP, (Object) getIsSupportFP());
        if (bundle.getBoolean(KEY_IS_IPAY, false)) {
            jSONObject = getMaCanFpSecData();
        } else {
            jSONObject = getFpSecdataJO();
        }
        if (jSONObject != null) {
            baseEnvInfo.put("secData", (Object) jSONObject);
        }
        String string = bundle.getString("USER_ID", "");
        if (!TextUtils.isEmpty(string)) {
            str = getBioMetaInfo(string);
        } else {
            str = getBioMetaInfo();
        }
        baseEnvInfo.put(ModuleConstants.VI_MODULE_BIO_METAINFO, (Object) str);
        if ("Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.collectSecCam))) {
            baseEnvInfo.put("secCamData", (Object) getSecCamData());
        }
        baseEnvInfo.put("bp", (Object) getBirdNestInfo());
        String jSONString = baseEnvInfo.toJSONString();
        VerifyLogCat.i("EnvInfoUtil", "getEnvData：" + jSONString);
        return jSONString;
    }

    public static JSONObject getFpSecdataJO(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("225b1b2d", new Object[]{new Boolean(z)});
        }
        String b2 = b(z);
        if (TextUtils.isEmpty(b2)) {
            return null;
        }
        try {
            return JSON.parseObject(b2);
        } catch (Exception e) {
            VerifyLogCat.e("EnvInfoUtil", "json fail " + b2, e);
            return null;
        }
    }

    public static String getInstalledCert(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("438c5027", new Object[]{str});
        }
        Object invokeStaticMethod = ReflectUtils.invokeStaticMethod("com.alipay.mobile.verifyidentity.module.cert.helper.CertHelper", "getInstalledCert", new Class[]{String.class}, new Object[]{str});
        VerifyLogCat.i("EnvInfoUtil", "获取到本地证书状态:" + invokeStaticMethod);
        if (invokeStaticMethod != null) {
            return String.valueOf(invokeStaticMethod);
        }
        return "";
    }

    public static String getIsSupportFP() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2d53ff00", new Object[0]);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Object invokeMethod = ReflectUtils.invokeMethod(c(), "isFingerprintAvailable", new Class[]{Context.class, Integer.TYPE}, new Object[]{MicroModuleContext.getInstance().getContext(), 1});
        VerifyLogCat.i("EnvInfoUtil", "getIsSupportFP: " + invokeMethod);
        TimeCostLog.log("EnvInfoUtil", "getIsSupportFP耗时：", elapsedRealtime);
        if (invokeMethod == null) {
            return "false";
        }
        return invokeMethod.toString();
    }
}
