package com.taobao.update.dynamicfeature;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.android.split.manager.a;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import com.taobao.update.framework.UpdateRuntime;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.bcq;
import tb.cad;
import tb.cbi;
import tb.fsw;
import tb.jcq;
import tb.kc0;
import tb.kjv;
import tb.kpw;
import tb.mcq;
import tb.nkv;
import tb.nsw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class FeatureDynamicJSBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CLEAR_FLEXA_DATA = "clearFlexaData";
    private static final String CLOSE_AUTO_DOWNLOAD = "disable_auto_download";
    private static final String CLOSE_FLEXA = "closeFlexa";
    private static final String DEFFERED_DOWNLOAD_FEATURES_ENABLED = "deffered_download_feature_enabled";
    private static final String DYNAMIC_FEATURES_CONFIG = "dynamic_features_config";
    private static final String FLEXA_FORCE_ENABLED = "flexa_force_enabled";
    private static final String GET_CAN_USE_HISTORY_APK_FEATURES = "getCanUseHistoryApkFeatures";
    private static final String GET_INSIDEOF_APK_FEATURES = "getInsideOfApkFeatures";
    private static final String GET_INSTALLED_DYNAMICFEATURES = "getInstallDynamicFeatures";
    private static final String JSDynamicBridge = "JSDynamicBridge";
    private static final String OPEN_FLEXA = "openFlexa";
    private static SharedPreferences mSharedPreferences = UpdateRuntime.getContext().getSharedPreferences("dynamic_flexa_switch", 0);
    private static SharedPreferences sharedPreferences;

    static {
        t2o.a(951058436);
    }

    public static void delete(File file) throws IOException {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258726a9", new Object[]{file});
            return;
        }
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                delete(file2);
            }
        }
        if (file.exists() && !file.delete()) {
            throw new IOException("Failed to delete '" + file.getAbsolutePath() + "'");
        }
    }

    private List<String> getCanUseHistoryFeatures() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("164efdbc", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (String str : BundleInfoManager.instance().getDynamicFeatures()) {
            if (!TextUtils.isEmpty(BundleInfoManager.instance().getDynamicFeatureInfo(str).matchedAppVersion)) {
                arrayList.add(str + "------>" + BundleInfoManager.instance().getDynamicFeatureInfo(str).matchedAppVersion);
            }
        }
        return arrayList;
    }

    private List<String> getInsideApkFeatures() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("121dc759", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (String str : BundleInfoManager.instance().getDynamicFeatures()) {
            String str2 = UpdateRuntime.getContext().getApplicationInfo().nativeLibraryDir;
            String str3 = BundleInfoManager.instance().getDynamicFeatureInfo(str).md5;
            if (cbi.isMd5Same(str3, new File(str2, "lib" + str + jcq.SO_EXTENSION).getPath())) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    private Map<String, String> getInstalledDynamicFeatures() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4d37e8b4", new Object[]{this});
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        a i = ((cad) bcq.a()).i();
        for (String str : mcq.a().a()) {
            concurrentHashMap.put(str, i.i(str).c().getAbsolutePath());
        }
        return concurrentHashMap;
    }

    private static SharedPreferences getSharePreferences(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("71f5d2c6", new Object[]{context});
        }
        if (sharedPreferences == null) {
            sharedPreferences = context.getSharedPreferences("dynamic_features_config", 0);
        }
        return sharedPreferences;
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else {
            fsw.i(JSDynamicBridge, FeatureDynamicJSBridge.class, true);
        }
    }

    public static /* synthetic */ Object ipc$super(FeatureDynamicJSBridge featureDynamicJSBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/update/dynamicfeature/FeatureDynamicJSBridge");
    }

    public static boolean setDefferedDownloadFeaturesEnabled(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62a545a4", new Object[]{context, new Boolean(z)})).booleanValue();
        }
        SharedPreferences.Editor edit = getSharePreferences(context).edit();
        return edit.putBoolean("deffered_download_feature_enabled_" + nkv.getVersionName(), z).commit();
    }

    public static boolean setFlexaEnabled(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3f9c0b2", new Object[]{context, new Boolean(z)})).booleanValue();
        }
        SharedPreferences.Editor edit = getSharePreferences(context).edit();
        return edit.putBoolean("flexa_force_enabled_" + nkv.getVersionName(), z).commit();
    }

    public static void stopApplication(boolean z) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f7493ff", new Object[]{new Boolean(z)});
            return;
        }
        File I = bcq.a().e().I();
        if (z) {
            setFlexaEnabled(UpdateRuntime.getContext(), false);
        }
        delete(I);
        kc0.getInstance().clearActivityStack();
        if (nkv.getProcessName(UpdateRuntime.getContext()).contains(UpdateRuntime.getContext().getPackageName())) {
            try {
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) UpdateRuntime.getContext().getSystemService("activity")).getRunningAppProcesses();
                for (int i = 0; i < runningAppProcesses.size(); i++) {
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = runningAppProcesses.get(i);
                    String str = runningAppProcessInfo.processName;
                    if (str.contains(UpdateRuntime.getContext().getPackageName() + ":")) {
                        Process.killProcess(runningAppProcessInfo.pid);
                    }
                }
            } catch (Exception unused) {
            }
            Process.killProcess(Process.myPid());
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (str.equals(CLOSE_FLEXA)) {
            kjv.getInstance().clearCache();
            nsw nswVar = new nsw();
            nswVar.b("info", "close Flexa");
            wVCallBackContext.success(nswVar);
            UpdateRuntime.toast("即将关闭Flexa动态加载开关,之前数据将被清楚...,所有feature都不会加载");
            try {
                stopApplication(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (str.equals(OPEN_FLEXA)) {
            nsw nswVar2 = new nsw();
            nswVar2.b("info", "open Flexa!");
            wVCallBackContext.success(nswVar2);
            UpdateRuntime.toast("即将打开Flexa动态加载开关,所有feature可以正常下载，安装");
            setFlexaEnabled(UpdateRuntime.getContext(), true);
        } else if (str.equals(CLOSE_AUTO_DOWNLOAD)) {
            nsw nswVar3 = new nsw();
            nswVar3.b("info", "close auto download!");
            wVCallBackContext.success(nswVar3);
            UpdateRuntime.toast("即将关闭静默下载，主动触发的安装不会关闭");
            try {
                setDefferedDownloadFeaturesEnabled(UpdateRuntime.getContext(), false);
                stopApplication(false);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else if (str.equals(CLEAR_FLEXA_DATA)) {
            nsw nswVar4 = new nsw();
            nswVar4.b("info", "clear flexa data");
            wVCallBackContext.success(nswVar4);
            UpdateRuntime.toast("清除安装数据,可以测试首装push场景");
            try {
                stopApplication(false);
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        } else if (str.equals(GET_INSTALLED_DYNAMICFEATURES)) {
            nsw nswVar5 = new nsw();
            nswVar5.a("info", JSON.toJSON(getInstalledDynamicFeatures()));
            wVCallBackContext.success(nswVar5);
            UpdateRuntime.toast("获取已经装的dynamicFeature");
        } else if (str.equals(GET_INSIDEOF_APK_FEATURES)) {
            nsw nswVar6 = new nsw();
            nswVar6.a("info", getInsideApkFeatures());
            wVCallBackContext.success(nswVar6);
            UpdateRuntime.toast("获取已经装的dynamicFeature");
        } else if (str.equals(GET_CAN_USE_HISTORY_APK_FEATURES)) {
            nsw nswVar7 = new nsw();
            nswVar7.a("info", getCanUseHistoryFeatures());
            wVCallBackContext.success(nswVar7);
            UpdateRuntime.toast("获取可复用的历史feature");
        }
        return true;
    }
}
