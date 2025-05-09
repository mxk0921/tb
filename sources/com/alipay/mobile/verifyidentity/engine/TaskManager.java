package com.alipay.mobile.verifyidentity.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.intelligentdecision.log.DecisionLogcat;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.alipay.mobile.verifyidentity.common.VerifyType;
import com.alipay.mobile.verifyidentity.data.VISrcCode;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityResult;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityTask;
import com.alipay.mobile.verifyidentity.log.BehaviourIdEnum;
import com.alipay.mobile.verifyidentity.log.TimeCostLog;
import com.alipay.mobile.verifyidentity.log.VerifyBehavorLogger;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.log.behavior.VerifyLogger;
import com.alipay.mobile.verifyidentity.log.crash.VerifyIdentityCrashHandler;
import com.alipay.mobile.verifyidentity.sentry.SentryHelper;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.VIFBPluginManager;
import com.alipay.mobile.verifyidentity.utils.IDecisionHelper;
import com.alipay.mobile.verifyidentity.utils.ReportHelper;
import com.alipay.mobile.verifyidentity.utils.VIUtils;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TaskManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile TaskManager f;
    public VerifyIdentityTask b;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f4294a = new Handler(Looper.getMainLooper());
    public final Stack<VerifyIdentityTask> c = new Stack<>();
    public SlientModule d = null;
    public final Object e = new Object();

    /* compiled from: Taobao */
    /* renamed from: com.alipay.mobile.verifyidentity.engine.TaskManager$4  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] $SwitchMap$com$alipay$mobile$verifyidentity$common$VerifyType;

        static {
            int[] iArr = new int[VerifyType.values().length];
            $SwitchMap$com$alipay$mobile$verifyidentity$common$VerifyType = iArr;
            try {
                iArr[VerifyType.TOKEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$alipay$mobile$verifyidentity$common$VerifyType[VerifyType.VERIFYID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class SlientModule {
        public String nextModuleData;
        public String nextVerifyId;

        public SlientModule() {
        }
    }

    public static HashMap<String, String> a(VerifyIdentityResult verifyIdentityResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("9f81263", new Object[]{verifyIdentityResult});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (verifyIdentityResult == null) {
            return hashMap;
        }
        try {
            HashMap<String, String> hashMap2 = new HashMap<>();
            try {
                hashMap2.put("code", verifyIdentityResult.getCode());
                hashMap2.put("message", verifyIdentityResult.getMessage());
                if (verifyIdentityResult.getExtInfo() != null) {
                    Object obj = verifyIdentityResult.getExtInfo().get("subCode");
                    Object obj2 = verifyIdentityResult.getExtInfo().get(VerifyIdentityResult.SRC_CODE_KEY);
                    Object obj3 = verifyIdentityResult.getExtInfo().get("cancel_scene");
                    if (obj != null) {
                        hashMap2.put("subCode", String.valueOf(obj));
                    }
                    if (obj2 != null) {
                        hashMap2.put(VerifyIdentityResult.SRC_CODE_KEY, String.valueOf(obj2));
                    }
                    if (obj3 != null) {
                        hashMap2.put("cancel_scene", String.valueOf(obj3));
                    }
                }
            } catch (Throwable unused) {
            }
            return hashMap2;
        } catch (Throwable unused2) {
            return hashMap;
        }
    }

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return "TaskManager";
    }

    public static /* synthetic */ void access$100(TaskManager taskManager, String str, String str2, VerifyIdentityTask verifyIdentityTask, VerifyIdentityResult verifyIdentityResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14af3348", new Object[]{taskManager, str, str2, verifyIdentityTask, verifyIdentityResult});
        } else if (verifyIdentityTask == null) {
            VerifyLogCat.w("TaskManager", "notifyListenerResult task is null");
        } else if (verifyIdentityTask.getVidListener() == null && verifyIdentityTask.getListener() == null) {
            VerifyLogCat.i("TaskManager", "no listener to callback");
        } else {
            VerifyLogCat.i("TaskManager", "notifyListenerResult");
            if (VerifyType.FAST_INIT.equals(verifyIdentityTask.getVerifyType()) || VerifyType.FAST_DIRECT.equals(verifyIdentityTask.getVerifyType())) {
                verifyIdentityTask.getVidListener().onVerifyResult(str, str2, verifyIdentityTask.getBizName(), verifyIdentityResult);
            } else if (TextUtils.isEmpty(str) && verifyIdentityTask.getListener() != null) {
                verifyIdentityTask.getListener().onVerifyResult(str2, verifyIdentityTask.getBizName(), verifyIdentityResult);
            } else if (!TextUtils.isEmpty(str) && verifyIdentityTask.getVidListener() != null) {
                verifyIdentityTask.getVidListener().onVerifyResult(str, str2, verifyIdentityTask.getBizName(), verifyIdentityResult);
            }
        }
    }

    public static void b(VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17b62fd8", new Object[]{verifyIdentityTask});
            return;
        }
        VerifyLogCat.i("TaskManager", "handleTask");
        verifyIdentityTask.setTaskStatus(VerifyIdentityTask.TaskStatus.RUN);
        String token = verifyIdentityTask.getToken();
        String verifyId = verifyIdentityTask.getVerifyId();
        VerifyBehavorLogger.logBehavorRightAway(BehaviourIdEnum.EVENT, "UC-MobileIC-150810-1", Constants.VI_ENGINE_APPID, "mdhxhssdk", token, verifyId, null, c(verifyIdentityTask));
        verifyIdentityTask.mTaskStartTime = SystemClock.elapsedRealtime();
        if (verifyIdentityTask.getPluginOrProxyMode()) {
            IDecisionHelper.sendLocalBroadcast(IDecisionHelper.VI_ENTER_ACTION, "mobilecashier_mobile_cashier_mobile_cashier_payment_app", verifyId);
        } else {
            IDecisionHelper.sendLocalBroadcast(IDecisionHelper.VI_ENTER_ACTION, verifyIdentityTask.sceneId, verifyId);
        }
        ModuleFlowController.getInstance().startVerifyTask(verifyIdentityTask);
    }

    public static Map<String, String> c(VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f15a268e", new Object[]{verifyIdentityTask});
        }
        HashMap hashMap = new HashMap();
        if (verifyIdentityTask != null) {
            hashMap.put("sceneId", verifyIdentityTask.sceneId);
            hashMap.put("bizId", verifyIdentityTask.bizId);
            hashMap.put(Constants.VI_ENGINE_VERIFY_TYPE, verifyIdentityTask.getCompatibleVerifyType());
        }
        return hashMap;
    }

    public static TaskManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaskManager) ipChange.ipc$dispatch("63407aa6", new Object[0]);
        }
        if (f == null) {
            synchronized (TaskManager.class) {
                try {
                    if (f == null) {
                        f = new TaskManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f;
    }

    public static boolean isDowngradTaskLock() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33f88335", new Object[0])).booleanValue();
        }
        try {
            String config = OrangeConfig.getInstance().getConfig("VerifyIdentityConfig", "alipay_verifyidentity_add_task_lock_config", "");
            DecisionLogcat.b("TaskManager", "ViTbDecisionReceiver.alipay_verifyidentity_add_task_lock_config = " + config);
            return "Y".equalsIgnoreCase(config);
        } catch (Throwable th) {
            DecisionLogcat.a("TaskManager", "error:" + th.getMessage());
            return false;
        }
    }

    public void addSlientModule(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf2a1501", new Object[]{this, jSONObject});
            return;
        }
        SlientModule slientModule = new SlientModule();
        slientModule.nextVerifyId = jSONObject.getString("nextVerifyId");
        slientModule.nextModuleData = jSONObject.getString("nextModuleData");
        VerifyLogCat.i("TaskManager", "[addSlientModule] nextVerifyId: " + slientModule.nextVerifyId + " , nextModuleData: " + slientModule.nextModuleData);
        this.d = slientModule;
    }

    public void addTaskInstace(VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27904cce", new Object[]{this, verifyIdentityTask});
        } else if (isDowngradTaskLock()) {
            addTaskInstaceV1(verifyIdentityTask);
        } else {
            addTaskInstaceV2(verifyIdentityTask);
        }
    }

    public void clearAllTasks() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0f37361", new Object[]{this});
            return;
        }
        VerifyLogCat.i("TaskManager", "clear all tasks");
        try {
            VerifyIdentityResult verifyIdentityResult = new VerifyIdentityResult("1003");
            if (verifyIdentityResult.getExtInfo() == null) {
                verifyIdentityResult.setExtInfo(new HashMap<>());
            }
            verifyIdentityResult.getExtInfo().put("subCode", "101");
            if (getCurrentTask() != null) {
                verifyIdentityResult.getExtInfo().put("nextProVid", getCurrentTask().nextProVid);
            }
            new VISrcCode().addEngineCode(verifyIdentityResult, "catcc");
            if (VIUtils.isMultiTaskModeEnabled()) {
                Iterator<VerifyIdentityTask> it = this.c.iterator();
                while (it.hasNext()) {
                    VerifyIdentityTask next = it.next();
                    if (!next.keepOnMultiMode()) {
                        notifyVerifyTaskResult(next.getVerifyId(), next.getToken(), verifyIdentityResult, next);
                    }
                }
            } else if (getCurrentTask() != null) {
                notifyVerifyTaskResult(getCurrentTask().getVerifyId(), getCurrentTask().getToken(), verifyIdentityResult, getCurrentTask());
            }
        } catch (Throwable th) {
            VerifyLogCat.e("TaskManager", "clearAllTasks error: ", th);
        }
    }

    public synchronized VerifyIdentityTask getCurrentTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VerifyIdentityTask) ipChange.ipc$dispatch("e3fb0fb7", new Object[]{this});
        } else if (!VIUtils.isMultiTaskModeEnabled()) {
            return this.b;
        } else if (!this.c.empty()) {
            return this.c.peek();
        } else {
            return this.b;
        }
    }

    public synchronized void notifyVerifyTaskResult(final String str, final String str2, final VerifyIdentityResult verifyIdentityResult, final VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c83619a7", new Object[]{this, str, str2, verifyIdentityResult, verifyIdentityTask});
        } else if (verifyIdentityTask == null) {
            VerifyLogCat.w("TaskManager", "notifyVerifyTaskResult task is null");
            onTaskOver(str, str2, verifyIdentityResult, verifyIdentityTask);
        } else if (MicroModuleContext.getInstance().canTaskContinue(verifyIdentityTask)) {
            VerifyLogCat.i("TaskManager", "上下文中task与当前task匹配");
            verifyIdentityTask.setTaskStatus(VerifyIdentityTask.TaskStatus.OVER);
            if (!(verifyIdentityTask.getListener() == null && verifyIdentityTask.getVidListener() == null)) {
                this.f4294a.post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.engine.TaskManager.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        VerifyIdentityResult verifyIdentityResult2 = verifyIdentityResult;
                        if (verifyIdentityResult2 == null) {
                            VerifyLogCat.e(TaskManager.access$000(), "notifyVerifyTaskResult result is null");
                            TaskManager.access$100(TaskManager.this, str, str2, verifyIdentityTask, new VerifyIdentityResult("2002"));
                        } else if (verifyIdentityResult2.getExtInfo() == null || !Boolean.valueOf(String.valueOf(verifyIdentityResult.getExtInfo().get(ModuleConstants.MODULE_NO_NEED_TO_CALLBACK))).booleanValue()) {
                            String access$000 = TaskManager.access$000();
                            VerifyLogCat.i(access$000, "notifyVerifyTaskResult result:" + verifyIdentityResult.getCode() + " verifyId: " + str + " token:" + str2 + " bizName:" + verifyIdentityTask.getBizName());
                            TaskManager.access$100(TaskManager.this, str, str2, verifyIdentityTask, verifyIdentityResult);
                        } else {
                            String access$0002 = TaskManager.access$000();
                            VerifyLogCat.i(access$0002, "NO NEED to notifyVerifyTaskResult result:" + verifyIdentityResult.getCode() + " verifyId: " + str + " token:" + str2 + " bizName:" + verifyIdentityTask.getBizName());
                        }
                    }
                });
            }
            setCurrentTask(null);
            onTaskOver(str, str2, verifyIdentityResult, verifyIdentityTask);
        } else {
            VerifyLogCat.i("TaskManager", "上下文中task与当前task不匹配，本次任务已过期（之前已回调），不再回调");
        }
    }

    public synchronized void setCurrentTask(VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df1b7713", new Object[]{this, verifyIdentityTask});
            return;
        }
        this.b = verifyIdentityTask;
        if (verifyIdentityTask != null) {
            VerifyLogger.getInstance().setVerifyId(this.b.getVerifyId());
        }
    }

    public synchronized void addTaskInstaceV1(VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8b7e069", new Object[]{this, verifyIdentityTask});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (needCleanTasks()) {
            if (getCurrentTask() != null) {
                getCurrentTask().nextProVid = verifyIdentityTask.getVerifyId();
            }
            if (verifyIdentityTask.getPluginOrProxyMode()) {
                MicroModuleContext.getInstance().exit(true);
            }
            MicroModuleContext.getInstance().exit();
        } else {
            VerifyLogCat.i("TaskManager", "no need to clean tasks");
        }
        setCurrentTask(verifyIdentityTask);
        this.c.push(verifyIdentityTask);
        VIFBPluginManager.flushPlugins(verifyIdentityTask.getVerifyId());
        TimeCostLog.log("TaskManager", "addTaskInstace耗时：", elapsedRealtime);
        b(verifyIdentityTask);
        VerifyIdentityCrashHandler.getInstance().start();
    }

    public void addTaskInstaceV2(VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc4764aa", new Object[]{this, verifyIdentityTask});
            return;
        }
        synchronized (this.e) {
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (needCleanTasks()) {
                    if (getCurrentTask() != null) {
                        getCurrentTask().nextProVid = verifyIdentityTask.getVerifyId();
                    }
                    if (verifyIdentityTask.getPluginOrProxyMode()) {
                        MicroModuleContext.getInstance().exit(true);
                    }
                    MicroModuleContext.getInstance().exit();
                } else {
                    VerifyLogCat.i("TaskManager", "no need to clean tasks");
                }
                setCurrentTask(verifyIdentityTask);
                this.c.push(verifyIdentityTask);
                VIFBPluginManager.flushPlugins(verifyIdentityTask.getVerifyId());
                TimeCostLog.log("TaskManager", "addTaskInstace耗时：", elapsedRealtime);
                b(verifyIdentityTask);
                VerifyIdentityCrashHandler.getInstance().start();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void clearMultiTaskFlag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9b29ba4", new Object[]{this});
            return;
        }
        try {
            Iterator<VerifyIdentityTask> it = this.c.iterator();
            while (it.hasNext()) {
                it.next().isMultiTaskEnabled = false;
            }
        } catch (Throwable th) {
            VerifyLogCat.w("TaskManager", "清理task标异常", th);
        }
    }

    public boolean needCleanTasks() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc88b06", new Object[]{this})).booleanValue();
        }
        VerifyIdentityTask currentTask = getCurrentTask();
        if (currentTask != null && VerifyIdentityTask.TaskStatus.OVER != currentTask.getTaskStatus()) {
            return true;
        }
        VerifyLogCat.d("TaskManager", "no task on going");
        return false;
    }

    public synchronized boolean preCheckTaskQueue(String str, VerifyType verifyType) {
        boolean z;
        boolean z2 = true;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d77c06b6", new Object[]{this, str, verifyType})).booleanValue();
            }
            VerifyIdentityTask currentTask = getCurrentTask();
            if (currentTask == null) {
                z = false;
            } else if (AnonymousClass4.$SwitchMap$com$alipay$mobile$verifyidentity$common$VerifyType[verifyType.ordinal()] != 1) {
                z = TextUtils.equals(str, currentTask.getVerifyId());
            } else {
                z = TextUtils.equals(str, currentTask.getToken());
            }
            if (z) {
                VerifyLogCat.d("TaskManager", verifyType.toString() + ": " + str + "is already exist in currentTask");
                z2 = false;
            }
            return z2;
        }
    }

    public void onTaskOver(String str, String str2, VerifyIdentityResult verifyIdentityResult, VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d344c8db", new Object[]{this, str, str2, verifyIdentityResult, verifyIdentityTask});
            return;
        }
        MicroModuleContext.getInstance().updateActivity(null);
        if (verifyIdentityTask.getPluginOrProxyMode()) {
            IDecisionHelper.sendLocalBroadcast(IDecisionHelper.VI_EXIT_ACTION, "mobilecashier_mobile_cashier_mobile_cashier_payment_app", str);
        } else {
            IDecisionHelper.sendLocalBroadcast(IDecisionHelper.VI_EXIT_ACTION, verifyIdentityTask.sceneId, str);
        }
        VerifyLogCat.i("TaskManager", "onTaskOver");
        Map<String, String> c = c(verifyIdentityTask);
        HashMap<String, String> a2 = a(verifyIdentityResult);
        if (verifyIdentityTask.getExtParams() != null) {
            String string = verifyIdentityTask.getExtParams().getString("subCode");
            if (!TextUtils.isEmpty(string)) {
                a2.put("subCode", string);
            }
        }
        a2.putAll(c);
        String str3 = ReportHelper.stopReport;
        a2.put(str3, ReportHelper.getReportFlag(null, str3));
        String str4 = ReportHelper.stopFrontReport;
        a2.put(str4, ReportHelper.getReportFlag(null, str4));
        a2.put("lastReportTime", ReportHelper.getReportFlag(null, ReportHelper.KEY_LAST_REPORT_TIME));
        this.c.remove(verifyIdentityTask);
        VerifyBehavorLogger.logBehavorRightAway(BehaviourIdEnum.EVENT, "UC-MobileIC-150810-4", Constants.VI_ENGINE_APPID, "mdtchssdk", str2, str, String.valueOf(SystemClock.elapsedRealtime() - verifyIdentityTask.mTaskStartTime), a2);
        final SlientModule slientModule = this.d;
        if (slientModule != null) {
            AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.verifyidentity.engine.TaskManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    VerifyIdentityEngine instance = VerifyIdentityEngine.getInstance(MicroModuleContext.getInstance().getContext());
                    SlientModule slientModule2 = slientModule;
                    instance.unifiedStartByVerifyId(slientModule2.nextVerifyId, slientModule2.nextModuleData, null, null, null);
                }
            }, "SlientModule");
        }
        this.d = null;
        ReportHelper.reportInfo(true, "sdkExit");
        AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.verifyidentity.engine.TaskManager.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    ReportHelper.updateConfigByCacheIfNeeded();
                }
            }
        }, "updateConfig");
        try {
            if (SentryHelper.a()) {
                if (!(verifyIdentityResult.getExtInfo() == null || verifyIdentityResult.getExtInfo().get("cancel_scene") == null)) {
                    String str5 = (String) verifyIdentityResult.getExtInfo().get("cancel_scene");
                    if (!TextUtils.isEmpty(str5) && "fp_plugin".equalsIgnoreCase(str5)) {
                    }
                }
                SentryHelper.b(str);
            }
        } catch (Throwable th) {
            VerifyLogCat.e("Sentry", th);
        }
        VerifyIdentityCrashHandler.getInstance().cancel();
    }
}
