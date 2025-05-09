package com.alipay.mobile.verifyidentity.engine;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.mobile.verifyidentity.callback.VIListenerByVerifyId;
import com.alipay.mobile.verifyidentity.callback.VerifyIdentityListener;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.alipay.mobile.verifyidentity.common.VerifyType;
import com.alipay.mobile.verifyidentity.data.ModuleDataModel;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityResult;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityTask;
import com.alipay.mobile.verifyidentity.dataprovider.AppDataProvider;
import com.alipay.mobile.verifyidentity.info.AppInfo;
import com.alipay.mobile.verifyidentity.info.EnvInfoUtil;
import com.alipay.mobile.verifyidentity.log.DebugViewer;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.log.utils.LogReportHelper;
import com.alipay.mobile.verifyidentity.module.ModuleDescription;
import com.alipay.mobile.verifyidentity.module.ModuleMetaInfo;
import com.alipay.mobile.verifyidentity.proxy.rpc.VIMessageChannel;
import com.alipay.mobile.verifyidentity.uitl.PlatformUtils;
import com.alipay.mobile.verifyidentity.utils.ReportHelper;
import com.alipay.mobile.verifyidentity.utils.VIUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.mop;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class VerifyIdentityEngine {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static VerifyIdentityEngine f4295a;

    public VerifyIdentityEngine(Context context) {
        Context applicationContext = context.getApplicationContext();
        MicroModuleContext.getInstance().attachContext(applicationContext);
        List<ModuleDescription> modules = new ModuleMetaInfo().getModules();
        if (modules != null && !modules.isEmpty()) {
            Iterator<ModuleDescription> it = modules.iterator();
            while (it.hasNext()) {
                MicroModuleContext.getInstance().addDescription(it.next());
            }
        }
        if (VIUtils.isInExport()) {
            VIUtils.initLogger(context);
            VerifyLogCat.i("VerifyIdentityEngine", "初始化日志");
        } else {
            VerifyLogCat.i("VerifyIdentityEngine", "不初始化日志");
        }
        VerifyLogCat.init(context.getPackageName());
        if (PlatformUtils.isDebug(context)) {
            DebugViewer.getInstance().init(applicationContext);
            DebugViewer.getInstance().start();
        }
    }

    public static VerifyIdentityTask a(VerifyType verifyType, String str, String str2, String str3, Bundle bundle, VerifyIdentityListener verifyIdentityListener, VIListenerByVerifyId vIListenerByVerifyId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VerifyIdentityTask) ipChange.ipc$dispatch("2263c781", new Object[]{verifyType, str, str2, str3, bundle, verifyIdentityListener, vIListenerByVerifyId});
        }
        VerifyIdentityTask verifyIdentityTask = new VerifyIdentityTask();
        verifyIdentityTask.setVerifyType(verifyType);
        verifyIdentityTask.setVerifyId(str);
        verifyIdentityTask.setToken(str2);
        verifyIdentityTask.setBizName(str3);
        verifyIdentityTask.setListener(verifyIdentityListener);
        verifyIdentityTask.setVidListener(vIListenerByVerifyId);
        verifyIdentityTask.setExtParams(bundle);
        if (str.endsWith("_site")) {
            verifyIdentityTask.isIPay = true;
        } else {
            verifyIdentityTask.isIPay = false;
        }
        return verifyIdentityTask;
    }

    public static synchronized VerifyIdentityEngine getInstance(Context context) {
        synchronized (VerifyIdentityEngine.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (VerifyIdentityEngine) ipChange.ipc$dispatch("cf2fd80b", new Object[]{context});
            }
            if (f4295a == null) {
                f4295a = new VerifyIdentityEngine(context);
            }
            return f4295a;
        }
    }

    public final synchronized VerifyIdentityTask b(String str, String str2, String str3, Bundle bundle, VIListenerByVerifyId vIListenerByVerifyId, VIMessageChannel vIMessageChannel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VerifyIdentityTask) ipChange.ipc$dispatch("6972ce84", new Object[]{this, str, str2, str3, bundle, vIListenerByVerifyId, vIMessageChannel});
        }
        VerifyLogCat.d("VerifyIdentityEngine", str3 + " add verifyId: " + str + " token: " + str2);
        if (TextUtils.isEmpty(str)) {
            if (vIListenerByVerifyId != null) {
                vIListenerByVerifyId.onVerifyResult(str, str2, str3, new VerifyIdentityResult("2000"));
            }
            return null;
        }
        TaskManager instance = TaskManager.getInstance();
        VerifyType verifyType = VerifyType.VERIFYID;
        if (!instance.preCheckTaskQueue(str, verifyType)) {
            if (vIListenerByVerifyId != null) {
                vIListenerByVerifyId.onVerifyResult(str, str2, str3, new VerifyIdentityResult("2004"));
            }
            return null;
        }
        VerifyIdentityTask a2 = a(verifyType, str, str2, str3, bundle, null, vIListenerByVerifyId);
        a2.setVIMessageChannel(vIMessageChannel);
        return a2;
    }

    public void exit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81677ea5", new Object[]{this});
            return;
        }
        VerifyLogCat.i("VerifyIdentityEngine", "EXIT VerifyIdentityEngine!");
        MicroModuleContext.getInstance().exit();
    }

    public synchronized void fastVerifyWithInitRequest(String str, String str2, String str3, String str4, Bundle bundle, VIListenerByVerifyId vIListenerByVerifyId, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9165220", new Object[]{this, str, str2, str3, str4, bundle, vIListenerByVerifyId, str5});
            return;
        }
        bundle.putString("logonId", str);
        VerifyLogCat.d("VerifyIdentityEngine", "sceneId: " + str2 + ", bizId: " + str3 + ", bizRequestData: " + str4);
        if (TextUtils.isEmpty(str2)) {
            if (vIListenerByVerifyId != null) {
                vIListenerByVerifyId.onVerifyResult("", "", str5, new VerifyIdentityResult("2000"));
            }
            return;
        }
        VerifyType verifyType = VerifyType.FAST_INIT;
        VerifyIdentityTask verifyIdentityTask = new VerifyIdentityTask();
        verifyIdentityTask.setVerifyType(verifyType);
        verifyIdentityTask.sceneId = str2;
        verifyIdentityTask.bizId = str3;
        verifyIdentityTask.bizRequestData = str4;
        verifyIdentityTask.setExtParams(bundle);
        verifyIdentityTask.setVidListener(vIListenerByVerifyId);
        TaskManager.getInstance().addTaskInstace(verifyIdentityTask);
    }

    public synchronized void fastVerifyWithModuleRequest(String str, String str2, String str3, String str4, String str5, Bundle bundle, VIListenerByVerifyId vIListenerByVerifyId, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b6918f2", new Object[]{this, str, str2, str3, str4, str5, bundle, vIListenerByVerifyId, str6});
            return;
        }
        VerifyIdentityTask c = c(str, str2, str3, str4, str5, bundle, vIListenerByVerifyId, str6, null);
        if (c == null) {
            VerifyLogCat.w("VerifyIdentityEngine", "[fastVerifyWithModuleRequest] Failed to build the task by verifyId: " + str + " token: " + str2);
            return;
        }
        TaskManager.getInstance().addTaskInstace(c);
    }

    public String getBioInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60d62559", new Object[]{this});
        }
        return EnvInfoUtil.getBioInfo();
    }

    public String getCertSN(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ee4a61a", new Object[]{this, str});
        }
        return EnvInfoUtil.getInstalledCert(str);
    }

    public String getEnvData(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bda37454", new Object[]{this, bundle});
        }
        return EnvInfoUtil.getEnvData(bundle);
    }

    public String getEnvInfoForMsp(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1eb6b403", new Object[]{this, str, new Boolean(z)});
        }
        return EnvInfoUtil.getEnvInfoForMsp(str, z);
    }

    public String getSecDataForMsp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("51deccf3", new Object[]{this});
        }
        return EnvInfoUtil.getSecDataForMsp();
    }

    public WeakReference<Activity> getTopActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("c699f323", new Object[]{this});
        }
        return MicroModuleContext.getInstance().getTopActivity();
    }

    public void reportInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1712789", new Object[]{this});
            return;
        }
        ReportHelper.reportInfo(mop.KEY_APP_START);
        LogReportHelper.getInstance().getAndReportData();
    }

    public void setAppDataProvider(AppDataProvider appDataProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9da112b6", new Object[]{this, appDataProvider});
        } else {
            AppInfo.getInstance().setDataProvider(appDataProvider);
        }
    }

    public void setStartActivityContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fb58ec1", new Object[]{this, context});
        } else {
            MicroModuleContext.getInstance().setStartActivityContext(context);
        }
    }

    public synchronized void startVerifyByToken(String str, String str2, Bundle bundle, VerifyIdentityListener verifyIdentityListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23f3c7ce", new Object[]{this, str, str2, bundle, verifyIdentityListener});
            return;
        }
        VerifyLogCat.d("VerifyIdentityEngine", str2 + " add token: " + str);
        if (TextUtils.isEmpty(str)) {
            if (verifyIdentityListener != null) {
                verifyIdentityListener.onVerifyResult(str, str2, new VerifyIdentityResult("2000"));
            }
            return;
        }
        TaskManager instance = TaskManager.getInstance();
        VerifyType verifyType = VerifyType.TOKEN;
        if (!instance.preCheckTaskQueue(str, verifyType)) {
            if (verifyIdentityListener != null) {
                verifyIdentityListener.onVerifyResult(str, str2, new VerifyIdentityResult("2004"));
            }
            return;
        }
        TaskManager.getInstance().addTaskInstace(a(verifyType, "", str, str2, bundle, verifyIdentityListener, null));
    }

    public synchronized void startVerifyByVerifyId(String str, String str2, String str3, Bundle bundle, VIListenerByVerifyId vIListenerByVerifyId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5956121e", new Object[]{this, str, str2, str3, bundle, vIListenerByVerifyId});
            return;
        }
        VerifyIdentityTask b = b(str, str2, str3, bundle, vIListenerByVerifyId, null);
        if (b == null) {
            VerifyLogCat.w("VerifyIdentityEngine", "[startVerifyByVerifyId] Failed to build the task by verifyId: " + str + " token: " + str2);
            return;
        }
        TaskManager.getInstance().addTaskInstace(b);
    }

    public synchronized void unifiedStartByVerifyId(String str, String str2, String str3, Bundle bundle, VIListenerByVerifyId vIListenerByVerifyId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48db9809", new Object[]{this, str, str2, str3, bundle, vIListenerByVerifyId});
        } else {
            unifiedStartByVerifyId(str, str2, str3, bundle, vIListenerByVerifyId, null);
        }
    }

    public Map<String, Object> preInit(Bundle bundle) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cc1361ef", new Object[]{this, bundle});
        }
        HashMap hashMap = new HashMap();
        if (bundle == null) {
            return hashMap;
        }
        boolean booleanValue = bundle.containsKey(Constants.VI_ENGINE_IS_NEED_FP) ? Boolean.valueOf(String.valueOf(bundle.get(Constants.VI_ENGINE_IS_NEED_FP))).booleanValue() : true;
        VerifyLogCat.i("VerifyIdentityEngine", "[isNeedFP]:" + booleanValue);
        Object obj = bundle.get(Constants.VI_ENGINE_IS_NEED_BIO);
        if (obj != null) {
            z = Boolean.valueOf(String.valueOf(obj)).booleanValue();
        }
        VerifyLogCat.i("VerifyIdentityEngine", "[isNeedBio]:" + z);
        if (booleanValue) {
            hashMap.put(ModuleConstants.VI_MODULE_IS_SUPPORT_FP, EnvInfoUtil.getIsSupportFP());
            hashMap.put(ModuleConstants.VI_MODULE_FP_SECDATA, EnvInfoUtil.getFpSecdata());
        }
        if (z) {
            hashMap.put(ModuleConstants.VI_MODULE_BIO_METAINFO, EnvInfoUtil.getBioMetaInfo());
        }
        hashMap.put("envData", EnvInfoUtil.getEnvInfo());
        return hashMap;
    }

    public synchronized void unifiedStartByVerifyId(String str, String str2, String str3, Bundle bundle, VIListenerByVerifyId vIListenerByVerifyId, VIMessageChannel vIMessageChannel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10c4e89c", new Object[]{this, str, str2, str3, bundle, vIListenerByVerifyId, vIMessageChannel});
            return;
        }
        VerifyLogCat.i("VerifyIdentityEngine", "unifiedStartByVerifyId | verifyId: " + str + ", verifyData:" + str2);
        if (TextUtils.isEmpty(str2)) {
            VerifyLogCat.i("VerifyIdentityEngine", "verifyData，切到标准VerifyId模式");
            startVerifyByVerifyId(str, null, "", bundle, vIListenerByVerifyId, vIMessageChannel);
            return;
        }
        VerifyLogCat.i("VerifyIdentityEngine", "开始解析verifyData");
        ModuleDataModel parse = ModuleDataModel.parse(str2);
        if (parse == null) {
            if (vIListenerByVerifyId != null) {
                vIListenerByVerifyId.onVerifyResult(str, "", "", new VerifyIdentityResult("2002"));
            }
            return;
        }
        VerifyLogCat.i("VerifyIdentityEngine", "解析verifyData成功");
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        bundle2.putString("VIE_envType", parse.envType);
        bundle2.putString("VIE_useBird", parse.useBird);
        if (vIMessageChannel != null || !VIUtils.isGoingToFace(parse.nextStep)) {
            VerifyLogCat.i("VerifyIdentityEngine", "开始直接启动模块：" + parse.nextStep);
            fastVerifyWithModuleRequest(str, parse.token, parse.nextStep, parse.data, str3, bundle2, vIListenerByVerifyId, "", vIMessageChannel);
            return;
        }
        VerifyLogCat.i("VerifyIdentityEngine", "欲用unifiedStartByVerifyId直接起人脸，切到标准VerifyId模式");
        startVerifyByVerifyId(str, null, "", bundle2, vIListenerByVerifyId, vIMessageChannel);
    }

    public synchronized void fastVerifyWithModuleRequest(String str, String str2, String str3, String str4, String str5, Bundle bundle, VIListenerByVerifyId vIListenerByVerifyId, String str6, VIMessageChannel vIMessageChannel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdfb0053", new Object[]{this, str, str2, str3, str4, str5, bundle, vIListenerByVerifyId, str6, vIMessageChannel});
            return;
        }
        VerifyIdentityTask c = c(str, str2, str3, str4, str5, bundle, vIListenerByVerifyId, str6, vIMessageChannel);
        if (c == null) {
            VerifyLogCat.w("VerifyIdentityEngine", "[fastVerifyWithModuleRequest] Failed to build the task by verifyId: " + str + " token: " + str2);
            return;
        }
        TaskManager.getInstance().addTaskInstace(c);
    }

    public synchronized void startVerifyByVerifyId(String str, String str2, String str3, Bundle bundle, VIListenerByVerifyId vIListenerByVerifyId, VIMessageChannel vIMessageChannel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cdbd6a7", new Object[]{this, str, str2, str3, bundle, vIListenerByVerifyId, vIMessageChannel});
            return;
        }
        VerifyIdentityTask b = b(str, str2, str3, bundle, vIListenerByVerifyId, vIMessageChannel);
        if (b == null) {
            VerifyLogCat.w("VerifyIdentityEngine", "Failed to build the task by verifyId: " + str + " token: " + str2);
            return;
        }
        TaskManager.getInstance().addTaskInstace(b);
    }

    public final synchronized VerifyIdentityTask c(String str, String str2, String str3, String str4, String str5, Bundle bundle, VIListenerByVerifyId vIListenerByVerifyId, String str6, VIMessageChannel vIMessageChannel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VerifyIdentityTask) ipChange.ipc$dispatch("9722b37a", new Object[]{this, str, str2, str3, str4, str5, bundle, vIListenerByVerifyId, str6, vIMessageChannel});
        }
        VerifyLogCat.d("VerifyIdentityEngine", " add verifyId: " + str + " token: " + str2);
        if (TextUtils.isEmpty(str)) {
            if (vIListenerByVerifyId != null) {
                vIListenerByVerifyId.onVerifyResult(str, str2, str6, new VerifyIdentityResult("2000"));
            }
            return null;
        }
        VerifyIdentityTask a2 = a(VerifyType.FAST_DIRECT, str, str2, "", bundle, null, vIListenerByVerifyId);
        a2.setEntryModuleName(str3);
        a2.setEntryModuleData(str4);
        a2.bizRequestData = str5;
        a2.setVIMessageChannel(vIMessageChannel);
        if (vIMessageChannel != null) {
            VerifyLogCat.i("VerifyIdentityEngine", "直接起模块时若有rpc代理，则不再上报环境参数");
            a2.needReportEnvInfo = false;
        }
        if (str.endsWith("_site")) {
            a2.isIPay = true;
        } else {
            a2.isIPay = false;
        }
        return a2;
    }
}
