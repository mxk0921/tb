package com.alipay.mobile.verifyidentity.engine;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.mobile.verifyidentity.callback.ModuleListener;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.alipay.mobile.verifyidentity.common.UserIdCache;
import com.alipay.mobile.verifyidentity.common.VerifyType;
import com.alipay.mobile.verifyidentity.data.ModuleExecuteResult;
import com.alipay.mobile.verifyidentity.data.VISrcCode;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityResult;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityTask;
import com.alipay.mobile.verifyidentity.info.EnvInfoUtil;
import com.alipay.mobile.verifyidentity.log.BehaviourIdEnum;
import com.alipay.mobile.verifyidentity.log.TimeCostLog;
import com.alipay.mobile.verifyidentity.log.VerifyBehavorLogger;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.internal.password.pay.PayPwdModule;
import com.alipay.mobile.verifyidentity.rpc.RpcException;
import com.alipay.mobile.verifyidentity.rpc.biz.MICRpcServiceBiz;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.VIFBPluginManager;
import com.alipay.mobile.verifyidentity.utils.CommonConstant;
import com.alipay.mobile.verifyidentity.utils.IDecisionHelper;
import com.alipay.mobile.verifyidentity.utils.ReportHelper;
import com.alipay.mobile.verifyidentity.utils.VIUtils;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.alipay.mobileic.core.model.rpc.MICInitRequest;
import com.alipay.mobileic.core.model.rpc.MICRpcRequest;
import com.alipay.mobileic.core.model.rpc.MICRpcResponse;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.weex.common.Constants;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ModuleFlowController {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile ModuleFlowController f4289a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class VerifyDirectThread extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f4290a;
        private String b;
        private String c;
        private String d;
        private VerifyIdentityTask e;

        public VerifyDirectThread(VerifyIdentityTask verifyIdentityTask) {
            this.f4290a = verifyIdentityTask.getVerifyId();
            this.b = verifyIdentityTask.getToken();
            this.c = verifyIdentityTask.entryModuleName;
            this.d = verifyIdentityTask.entryModuleData;
            this.e = verifyIdentityTask;
        }

        public static /* synthetic */ Object ipc$super(VerifyDirectThread verifyDirectThread, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/engine/ModuleFlowController$VerifyDirectThread");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ModuleFlowController.access$500(ModuleFlowController.this, this.f4290a, this.b, this.c, this.d, this.e);
            ModuleFlowController.access$600(ModuleFlowController.this, this.f4290a, this.b, this.c, this.e);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class VerifyInitThread extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f4291a;
        private String b;
        private String c;
        private Map<String, Object> d;
        private VerifyIdentityTask e;

        public VerifyInitThread(VerifyIdentityTask verifyIdentityTask, Map<String, Object> map) {
            this.f4291a = verifyIdentityTask.sceneId;
            this.b = verifyIdentityTask.bizId;
            this.c = verifyIdentityTask.bizRequestData;
            this.d = map;
            this.e = verifyIdentityTask;
        }

        public static /* synthetic */ VerifyIdentityTask access$300(VerifyInitThread verifyInitThread) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (VerifyIdentityTask) ipChange.ipc$dispatch("c5794e55", new Object[]{verifyInitThread});
            }
            return verifyInitThread.e;
        }

        public static /* synthetic */ Object ipc$super(VerifyInitThread verifyInitThread, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/engine/ModuleFlowController$VerifyInitThread");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            MICRpcResponse access$200 = ModuleFlowController.access$200(ModuleFlowController.this, this.f4291a, this.b, this.c, this.d, this.e);
            if (access$200 != null) {
                if (!"Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.noUpSceneVID))) {
                    this.e.setVerifyId(access$200.verifyId);
                    this.e.setToken(access$200.token);
                    VerifyLogCat.i(ModuleFlowController.access$400(), "sceneId模式，更新了verifyId、token");
                }
                ModuleFlowController.access$100(ModuleFlowController.this, access$200.verifyId, access$200.token, access$200, this.e);
            } else if (this.e.showEngineError) {
                MicroModuleContext.getInstance().alert(null, VIUtils.getString(R.string.vi_network_unavailable), VIUtils.getString(R.string.vi_confirm), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.engine.ModuleFlowController.VerifyInitThread.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                            return;
                        }
                        VerifyIdentityResult verifyIdentityResult = new VerifyIdentityResult("2003");
                        new VISrcCode().addEngineCode(verifyIdentityResult, "vitrrn");
                        TaskManager.getInstance().notifyVerifyTaskResult("", "", verifyIdentityResult, VerifyInitThread.access$300(VerifyInitThread.this));
                    }
                }, null, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class VerifyThread extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f4292a;
        private String b;
        private VerifyIdentityTask c;

        public VerifyThread(VerifyIdentityTask verifyIdentityTask) {
            this.f4292a = verifyIdentityTask.getVerifyId();
            this.b = verifyIdentityTask.getToken();
            this.c = verifyIdentityTask;
        }

        public static /* synthetic */ Object ipc$super(VerifyThread verifyThread, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/engine/ModuleFlowController$VerifyThread");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ModuleFlowController.access$100(ModuleFlowController.this, this.f4292a, this.b, ModuleFlowController.access$000(ModuleFlowController.this, this.f4292a, this.b, this.c), this.c);
            }
        }
    }

    public static /* synthetic */ MICRpcResponse access$000(ModuleFlowController moduleFlowController, String str, String str2, VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MICRpcResponse) ipChange.ipc$dispatch("7f983df7", new Object[]{moduleFlowController, str, str2, verifyIdentityTask});
        }
        return a(str, str2, verifyIdentityTask);
    }

    public static /* synthetic */ HashMap access$1000(ModuleFlowController moduleFlowController, ModuleExecuteResult moduleExecuteResult, VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("3fc5b31d", new Object[]{moduleFlowController, moduleExecuteResult, verifyIdentityTask});
        }
        return c(moduleExecuteResult, verifyIdentityTask);
    }

    public static /* synthetic */ MICRpcResponse access$200(ModuleFlowController moduleFlowController, String str, String str2, String str3, Map map, VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MICRpcResponse) ipChange.ipc$dispatch("9bbdb59e", new Object[]{moduleFlowController, str, str2, str3, map, verifyIdentityTask});
        }
        return b(str, str2, str3, map, verifyIdentityTask);
    }

    public static /* synthetic */ String access$400() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60292585", new Object[0]);
        }
        return "ModuleFlowController";
    }

    public static /* synthetic */ void access$500(ModuleFlowController moduleFlowController, String str, String str2, String str3, String str4, VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ff44be2", new Object[]{moduleFlowController, str, str2, str3, str4, verifyIdentityTask});
        } else {
            moduleFlowController.h(str, str2, str3, str4, verifyIdentityTask);
        }
    }

    public static /* synthetic */ void access$600(ModuleFlowController moduleFlowController, String str, String str2, String str3, VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2ee19", new Object[]{moduleFlowController, str, str2, str3, verifyIdentityTask});
        } else {
            f(str, str2, str3, verifyIdentityTask);
        }
    }

    public static /* synthetic */ void access$700(ModuleFlowController moduleFlowController, String str, String str2, String str3, String str4, Bundle bundle, VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88c5fd0", new Object[]{moduleFlowController, str, str2, str3, str4, bundle, verifyIdentityTask});
        } else {
            moduleFlowController.g(str, str2, str3, str4, bundle, verifyIdentityTask);
        }
    }

    public static /* synthetic */ void access$900(ModuleFlowController moduleFlowController, String str, String str2, MICRpcResponse mICRpcResponse, VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("717a880c", new Object[]{moduleFlowController, str, str2, mICRpcResponse, verifyIdentityTask});
        } else {
            e(str, str2, mICRpcResponse, verifyIdentityTask);
        }
    }

    public static MICRpcResponse b(String str, String str2, String str3, Map<String, Object> map, VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MICRpcResponse) ipChange.ipc$dispatch("587f879d", new Object[]{str, str2, str3, map, verifyIdentityTask});
        }
        try {
            MicroModuleContext.getInstance().showProgressDialog("");
            MICInitRequest mICInitRequest = new MICInitRequest();
            mICInitRequest.sceneId = str;
            mICInitRequest.bizId = str2;
            mICInitRequest.bizRequestData = str3;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (j(verifyIdentityTask)) {
                map.put(ModuleConstants.VI_MODULE_IS_SUPPORT_FP, EnvInfoUtil.getIsSupportFP());
                map.put(ModuleConstants.VI_MODULE_FP_SECDATA, EnvInfoUtil.getFpSecdata());
            }
            if (k(verifyIdentityTask)) {
                map.put(ModuleConstants.VI_MODULE_BIO_METAINFO, EnvInfoUtil.getBioMetaInfo());
            }
            map.put("bp", EnvInfoUtil.getBirdNestInfo());
            mICInitRequest.externParams = map;
            mICInitRequest.envData = EnvInfoUtil.getBaseEnvInfo().toJSONString();
            TimeCostLog.log("ModuleFlowController", "获取环境参数耗时：", elapsedRealtime);
            MICRpcServiceBiz mICRpcServiceBiz = new MICRpcServiceBiz();
            verifyIdentityTask.initRpcStartTime = SystemClock.elapsedRealtime();
            MICRpcResponse initVerifyTask = mICRpcServiceBiz.initVerifyTask(mICInitRequest);
            MicroModuleContext.getInstance().dismissProgressDialog();
            return initVerifyTask;
        } catch (RpcException e) {
            MicroModuleContext.getInstance().dismissProgressDialog();
            VerifyLogCat.e("ModuleFlowController", "catch rpcexception");
            if (verifyIdentityTask.showEngineError) {
                return null;
            }
            VerifyIdentityResult verifyIdentityResult = new VerifyIdentityResult("2003");
            verifyIdentityResult.setMessage(e.getMessage());
            new VISrcCode().addEngineCode(verifyIdentityResult, "ivtre");
            TaskManager.getInstance().notifyVerifyTaskResult("", "", verifyIdentityResult, verifyIdentityTask);
            if (VIUtils.isInExport()) {
                return null;
            }
            throw e;
        } catch (Throwable th) {
            MicroModuleContext.getInstance().dismissProgressDialog();
            VerifyLogCat.e("ModuleFlowController", "catch exception when initVerifyTask", th);
            if (!verifyIdentityTask.showEngineError) {
                VerifyIdentityResult verifyIdentityResult2 = new VerifyIdentityResult("2002");
                verifyIdentityResult2.setMessage(th.getMessage());
                new VISrcCode().addEngineCode(verifyIdentityResult2, "ivte");
                TaskManager.getInstance().notifyVerifyTaskResult("", "", verifyIdentityResult2, verifyIdentityTask);
            }
            return null;
        }
    }

    public static HashMap<String, String> c(ModuleExecuteResult moduleExecuteResult, VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("c8997e69", new Object[]{moduleExecuteResult, verifyIdentityTask});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (moduleExecuteResult != null) {
            try {
                if (moduleExecuteResult.getMICRpcResponse() != null) {
                    MICRpcResponse mICRpcResponse = moduleExecuteResult.getMICRpcResponse();
                    hashMap.put("success", String.valueOf(mICRpcResponse.success));
                    hashMap.put("sysErrCode", mICRpcResponse.sysErrCode);
                    hashMap.put("verifySuccess", String.valueOf(mICRpcResponse.verifySuccess));
                    hashMap.put(ModuleConstants.VI_TASK_VERIFYCODE, mICRpcResponse.verifyCode);
                    hashMap.put("finish", String.valueOf(mICRpcResponse.finish));
                    hashMap.put(MspFlybirdDefine.FLYBIRD_VIDATA_FINISH_CODE, mICRpcResponse.finishCode);
                    hashMap.put(Constants.VI_ENGINE_FAST_MODULENAME, mICRpcResponse.nextStep);
                    if (verifyIdentityTask.getExtParams() != null) {
                        if (verifyIdentityTask.getExtParams().containsKey(CommonConstant.PRO_VERIFY_TYPE)) {
                            hashMap.put(CommonConstant.PRO_VERIFY_TYPE, verifyIdentityTask.getExtParams().getString(CommonConstant.PRO_VERIFY_TYPE));
                        }
                        if (verifyIdentityTask.getExtParams().containsKey(CommonConstant.PRO_VERIFY_RESULT)) {
                            hashMap.put(CommonConstant.PRO_VERIFY_RESULT, verifyIdentityTask.getExtParams().getString(CommonConstant.PRO_VERIFY_RESULT));
                        }
                        if (verifyIdentityTask.getExtParams().containsKey(CommonConstant.BIO_CHANGE_TYPE)) {
                            hashMap.put(CommonConstant.BIO_CHANGE_TYPE, verifyIdentityTask.getExtParams().getString(CommonConstant.BIO_CHANGE_TYPE));
                        }
                        if (verifyIdentityTask.getExtParams().containsKey("usePwd")) {
                            hashMap.put("usePwd", verifyIdentityTask.getExtParams().getString("usePwd"));
                        }
                        if (verifyIdentityTask.getExtParams().containsKey(CommonConstant.PPWFIRST)) {
                            hashMap.put(CommonConstant.PPWFIRST, verifyIdentityTask.getExtParams().getString(CommonConstant.PPWFIRST));
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return hashMap;
    }

    public static void e(String str, String str2, MICRpcResponse mICRpcResponse, VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5021d3b2", new Object[]{str, str2, mICRpcResponse, verifyIdentityTask});
            return;
        }
        VerifyIdentityResult verifyIdentityResult = new VerifyIdentityResult(mICRpcResponse.finishCode);
        HashMap<String, Object> hashMap = new HashMap<>();
        try {
            JSONObject parseObject = JSON.parseObject(mICRpcResponse.finishParams);
            if (parseObject != null) {
                hashMap.putAll(parseObject);
            }
        } catch (Exception e) {
            VerifyLogCat.e("ModuleFlowController", e.getMessage());
        }
        if (!TextUtils.isEmpty(mICRpcResponse.verifyCode)) {
            hashMap.put(ModuleConstants.VI_TASK_VERIFYCODE, mICRpcResponse.verifyCode);
        }
        verifyIdentityResult.setExtInfo(hashMap);
        verifyIdentityResult.setMessage(mICRpcResponse.verifyMessage);
        verifyIdentityResult.setBizResponseData(mICRpcResponse.bizResponseData);
        new VISrcCode().addEngineCode(verifyIdentityResult, "orrf");
        TaskManager.getInstance().notifyVerifyTaskResult(str, str2, verifyIdentityResult, verifyIdentityTask);
    }

    public static void f(String str, String str2, String str3, VerifyIdentityTask verifyIdentityTask) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb3a6236", new Object[]{str, str2, str3, verifyIdentityTask});
        } else if (verifyIdentityTask != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("sceneId", verifyIdentityTask.sceneId);
            hashMap.put("bizId", verifyIdentityTask.bizId);
            hashMap.put("module", str3);
            hashMap.put(Constants.VI_ENGINE_VERIFY_TYPE, verifyIdentityTask.getCompatibleVerifyType());
            if (verifyIdentityTask.isDynamicMode) {
                str4 = "Y";
            } else {
                str4 = "N";
            }
            hashMap.put("useBird", str4);
            hashMap.put(Constants.Name.INTERVAL, String.valueOf(verifyIdentityTask.initRpcEndTime - verifyIdentityTask.initRpcStartTime));
            VerifyBehavorLogger.logBehavorRightAway(BehaviourIdEnum.EVENT, "UC-MobileIC-160316-1", com.alipay.mobile.verifyidentity.common.Constants.VI_ENGINE_APPID, "mddychqcp", str2, str, String.valueOf(SystemClock.elapsedRealtime() - verifyIdentityTask.getTaskCreateTime()), hashMap);
            TimeCostLog.log("ModuleFlowController", "首个Module唤起总耗时：", verifyIdentityTask.getTaskCreateTime());
        }
    }

    public static ModuleFlowController getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ModuleFlowController) ipChange.ipc$dispatch("f5cb8792", new Object[0]);
        }
        if (f4289a == null) {
            synchronized (ModuleFlowController.class) {
                try {
                    if (f4289a == null) {
                        f4289a = new ModuleFlowController();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f4289a;
    }

    public final void h(String str, String str2, String str3, String str4, VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffaa7600", new Object[]{this, str, str2, str3, str4, verifyIdentityTask});
        } else {
            i(str, str2, str3, str4, false, verifyIdentityTask, true);
        }
    }

    public void startVerifyTask(VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ffbd6d7", new Object[]{this, verifyIdentityTask});
            return;
        }
        Bundle extParams = verifyIdentityTask.getExtParams();
        if (extParams == null) {
            extParams = Bundle.EMPTY;
        }
        if (VerifyType.FAST_INIT.equals(verifyIdentityTask.getVerifyType())) {
            HashMap hashMap = new HashMap();
            if (extParams != null) {
                for (String str : extParams.keySet()) {
                    hashMap.put(str, extParams.get(str));
                }
            }
            VerifyInitThread verifyInitThread = new VerifyInitThread(verifyIdentityTask, hashMap);
            verifyInitThread.setName("verifyInitThread");
            verifyInitThread.start();
        } else if (VerifyType.FAST_DIRECT.equals(verifyIdentityTask.getVerifyType())) {
            VerifyDirectThread verifyDirectThread = new VerifyDirectThread(verifyIdentityTask);
            verifyDirectThread.setName("verifyDirectThread");
            verifyDirectThread.start();
        } else {
            VerifyThread verifyThread = new VerifyThread(verifyIdentityTask);
            verifyThread.setName("VerifyThread");
            verifyThread.start();
        }
        verifyIdentityTask.taskPrepareStartTime = SystemClock.elapsedRealtime();
    }

    public static MICRpcResponse a(String str, String str2, VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MICRpcResponse) ipChange.ipc$dispatch("44942f1a", new Object[]{str, str2, verifyIdentityTask});
        }
        try {
            MicroModuleContext.getInstance().showProgressDialog("");
            MICRpcRequest mICRpcRequest = new MICRpcRequest();
            mICRpcRequest.verifyId = str;
            mICRpcRequest.token = str2;
            if (!TextUtils.isEmpty(str2)) {
                mICRpcRequest.module = ModuleConstants.VI_MODULE_NAME_INIT;
            } else {
                mICRpcRequest.module = ModuleConstants.VI_MODULE_VERIFY_INIT;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean j = j(verifyIdentityTask);
            boolean k = k(verifyIdentityTask);
            if (str == null || !str.endsWith("_site")) {
                mICRpcRequest.data = EnvInfoUtil.getEnvInfoWithExt(j, k);
            } else {
                Bundle bundle = new Bundle();
                bundle.putBoolean(EnvInfoUtil.KEY_IS_IPAY, true);
                mICRpcRequest.data = EnvInfoUtil.getEnvData(bundle);
            }
            TimeCostLog.log("ModuleFlowController", "获取环境参数耗时：", elapsedRealtime);
            MICRpcServiceBiz mICRpcServiceBiz = new MICRpcServiceBiz();
            verifyIdentityTask.initRpcStartTime = SystemClock.elapsedRealtime();
            MICRpcResponse dispatch = mICRpcServiceBiz.dispatch(mICRpcRequest);
            MicroModuleContext.getInstance().dismissProgressDialog();
            if (dispatch != null) {
                return dispatch;
            }
            throw new Exception();
        } catch (RpcException e) {
            MicroModuleContext.getInstance().dismissProgressDialog();
            VerifyLogCat.e("ModuleFlowController", "catch rpcexception");
            if (verifyIdentityTask.showEngineError) {
                return null;
            }
            VerifyIdentityResult verifyIdentityResult = new VerifyIdentityResult("2003");
            verifyIdentityResult.setMessage(e.getMessage());
            new VISrcCode().addEngineCode(verifyIdentityResult, "gnsre");
            TaskManager.getInstance().notifyVerifyTaskResult(str, str2, verifyIdentityResult, verifyIdentityTask);
            if (VIUtils.isInExport()) {
                return null;
            }
            throw e;
        } catch (Throwable th) {
            MicroModuleContext.getInstance().dismissProgressDialog();
            VerifyLogCat.e("ModuleFlowController", "catch exception when getNextStep");
            if (!verifyIdentityTask.showEngineError) {
                VerifyIdentityResult verifyIdentityResult2 = new VerifyIdentityResult("2002");
                verifyIdentityResult2.setMessage(th.getMessage());
                new VISrcCode().addEngineCode(verifyIdentityResult2, "gnse");
                TaskManager.getInstance().notifyVerifyTaskResult(str, str2, verifyIdentityResult2, verifyIdentityTask);
            }
            return null;
        }
    }

    public static boolean j(VerifyIdentityTask verifyIdentityTask) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17b62fdc", new Object[]{verifyIdentityTask})).booleanValue();
        }
        if (verifyIdentityTask.getExtParams() != null && verifyIdentityTask.getExtParams().containsKey(com.alipay.mobile.verifyidentity.common.Constants.VI_ENGINE_IS_NEED_FP)) {
            z = Boolean.valueOf(String.valueOf(verifyIdentityTask.getExtParams().get(com.alipay.mobile.verifyidentity.common.Constants.VI_ENGINE_IS_NEED_FP))).booleanValue();
        }
        VerifyLogCat.i("ModuleFlowController", "[isNeedFP]:" + z);
        return z;
    }

    public static boolean k(VerifyIdentityTask verifyIdentityTask) {
        Object obj;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b45b41d", new Object[]{verifyIdentityTask})).booleanValue();
        }
        if (!(verifyIdentityTask.getExtParams() == null || (obj = verifyIdentityTask.getExtParams().get(com.alipay.mobile.verifyidentity.common.Constants.VI_ENGINE_IS_NEED_BIO)) == null)) {
            z = Boolean.valueOf(String.valueOf(obj)).booleanValue();
        }
        VerifyLogCat.i("ModuleFlowController", "[isNeedBio]:" + z);
        return z;
    }

    public static void d(MICRpcResponse mICRpcResponse, VerifyIdentityTask verifyIdentityTask) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36a5a446", new Object[]{mICRpcResponse, verifyIdentityTask});
            return;
        }
        if ("Y".equalsIgnoreCase(mICRpcResponse.useBird)) {
            verifyIdentityTask.isDynamicMode = true;
        } else {
            verifyIdentityTask.isDynamicMode = false;
        }
        StringBuilder sb = new StringBuilder("下一个模块[");
        sb.append(mICRpcResponse.nextStep);
        sb.append("]");
        if (verifyIdentityTask.isDynamicMode) {
            str = " 要 ";
        } else {
            str = "不";
        }
        sb.append(str);
        sb.append("走动态版产品");
        VerifyLogCat.i("ModuleFlowController", sb.toString());
        VerifyLogCat.i("ModuleFlowController", "envType: " + mICRpcResponse.envType);
        MicroModuleContext.getInstance().setEnvType(mICRpcResponse.envType);
    }

    public static /* synthetic */ void access$800(ModuleFlowController moduleFlowController, String str, String str2, String str3, ModuleExecuteResult moduleExecuteResult, VerifyIdentityTask verifyIdentityTask) {
        String str4 = str;
        String str5 = str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e43763", new Object[]{moduleFlowController, str4, str5, str3, moduleExecuteResult, verifyIdentityTask});
            return;
        }
        VerifyLogCat.i("ModuleFlowController", "handleModuleExecuteResult verifyId: " + str + ", token: " + str2);
        if (moduleExecuteResult == null || moduleExecuteResult.getMICRpcResponse() == null) {
            VerifyLogCat.w("ModuleFlowController", "ModuleExecuteResult is null or ResultEnum is null");
            VerifyIdentityResult verifyIdentityResult = new VerifyIdentityResult("2002");
            new VISrcCode().addEngineCode(verifyIdentityResult, "hmern");
            TaskManager.getInstance().notifyVerifyTaskResult(str, str2, verifyIdentityResult, verifyIdentityTask);
            return;
        }
        final MICRpcResponse mICRpcResponse = moduleExecuteResult.getMICRpcResponse();
        try {
            AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.verifyidentity.engine.ModuleFlowController.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ReportHelper.updateConfig((Context) null, mICRpcResponse, true);
                    }
                }
            }, "updateConfig");
        } catch (Throwable th) {
            VerifyLogCat.e("ModuleFlowController", "update config error:" + th.getMessage());
        }
        VerifyLogCat.d("ModuleFlowController", str3 + " execute finishCode: " + mICRpcResponse.finishCode);
        if (!TextUtils.isEmpty(str)) {
            str4 = !TextUtils.isEmpty(mICRpcResponse.verifyId) ? mICRpcResponse.verifyId : str4;
            if (!TextUtils.isEmpty(mICRpcResponse.token)) {
                str5 = mICRpcResponse.token;
            }
        } else if (!TextUtils.isEmpty(mICRpcResponse.token)) {
            str5 = mICRpcResponse.token;
        }
        VerifyLogCat.i("ModuleFlowController", "handleModuleExecuteResult updateVidToken verifyId: " + str4 + ", token: " + str5);
        if (mICRpcResponse.finish) {
            VerifyIdentityResult verifyIdentityResult2 = new VerifyIdentityResult(mICRpcResponse.finishCode);
            HashMap<String, Object> hashMap = new HashMap<>();
            try {
                JSONObject parseObject = JSON.parseObject(mICRpcResponse.finishParams);
                if (parseObject != null) {
                    VerifyLogCat.i("ModuleFlowController", "need do more");
                    String string = parseObject.getString("nextVerifyId");
                    String string2 = parseObject.getString("nextModuleData");
                    if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.putAll(parseObject);
                        TaskManager.getInstance().addSlientModule(jSONObject);
                    }
                    parseObject.remove("nextVerifyId");
                    parseObject.remove("nextModuleData");
                    hashMap.putAll(parseObject);
                }
            } catch (Exception e) {
                VerifyLogCat.e("ModuleFlowController", e.getMessage());
            }
            try {
                if (moduleExecuteResult.getExtInfo() != null) {
                    hashMap.putAll(moduleExecuteResult.getExtInfo());
                }
            } catch (Exception e2) {
                VerifyLogCat.e("ModuleFlowController", e2.getMessage());
            }
            if (!TextUtils.isEmpty(mICRpcResponse.verifyCode)) {
                hashMap.put(ModuleConstants.VI_TASK_VERIFYCODE, mICRpcResponse.verifyCode);
            }
            verifyIdentityResult2.setExtInfo(hashMap);
            verifyIdentityResult2.setMessage(mICRpcResponse.verifyMessage);
            verifyIdentityResult2.setBizResponseData(mICRpcResponse.bizResponseData);
            new VISrcCode().addEngineCode(verifyIdentityResult2, "omrf");
            TaskManager.getInstance().notifyVerifyTaskResult(str4, str5, verifyIdentityResult2, verifyIdentityTask);
            VIFBPluginManager.cleanByVerifyId(str4);
            return;
        }
        d(mICRpcResponse, verifyIdentityTask);
        moduleFlowController.i(str4, str5, mICRpcResponse.nextStep, mICRpcResponse.data, moduleExecuteResult.isLocalTrans(), verifyIdentityTask, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void access$100(com.alipay.mobile.verifyidentity.engine.ModuleFlowController r15, final java.lang.String r16, final java.lang.String r17, final com.alipay.mobileic.core.model.rpc.MICRpcResponse r18, final com.alipay.mobile.verifyidentity.data.VerifyIdentityTask r19) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.engine.ModuleFlowController.access$100(com.alipay.mobile.verifyidentity.engine.ModuleFlowController, java.lang.String, java.lang.String, com.alipay.mobileic.core.model.rpc.MICRpcResponse, com.alipay.mobile.verifyidentity.data.VerifyIdentityTask):void");
    }

    public final void g(String str, String str2, String str3, final String str4, Bundle bundle, VerifyIdentityTask verifyIdentityTask) {
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac793eb4", new Object[]{this, str, str2, str3, str4, bundle, verifyIdentityTask});
            return;
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        ModuleListener moduleListener = new ModuleListener() { // from class: com.alipay.mobile.verifyidentity.engine.ModuleFlowController.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.callback.ModuleListener
            public void onModuleExecuteResult(String str6, String str7, String str8, ModuleExecuteResult moduleExecuteResult, VerifyIdentityTask verifyIdentityTask2) {
                String str9;
                String str10;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("60b41082", new Object[]{this, str6, str7, str8, moduleExecuteResult, verifyIdentityTask2});
                    return;
                }
                if (moduleExecuteResult != null && !moduleExecuteResult.isLocalTrans()) {
                    HashMap access$1000 = ModuleFlowController.access$1000(ModuleFlowController.this, moduleExecuteResult, verifyIdentityTask2);
                    if (!TextUtils.isEmpty(moduleExecuteResult.getLogicModuleName())) {
                        access$1000.put("module", moduleExecuteResult.getLogicModuleName());
                    } else {
                        access$1000.put("module", str8);
                    }
                    if (moduleExecuteResult.isFindPay()) {
                        access$1000.put("findAndPay", "Y");
                    }
                    String str11 = moduleExecuteResult.getMICRpcResponse().finishCode;
                    if (moduleExecuteResult.isFindPay()) {
                        str11 = "1003";
                    } else if (TextUtils.isEmpty(moduleExecuteResult.getMICRpcResponse().finishCode)) {
                        str11 = String.valueOf(moduleExecuteResult.getMICRpcResponse().verifySuccess);
                    }
                    if (verifyIdentityTask2.isDynamicMode) {
                        str9 = "Y";
                    } else {
                        str9 = "N";
                    }
                    access$1000.put("useBird", str9);
                    String str12 = (String) access$1000.get(CommonConstant.PRO_VERIFY_RESULT);
                    if ("Y".equalsIgnoreCase((String) access$1000.get("usePwd"))) {
                        str12 = "USE_PWD";
                    }
                    try {
                        str10 = JSON.parseObject(str4).getString("mcSalesProd");
                    } catch (Throwable unused) {
                        VerifyLogCat.i(ModuleFlowController.access$400(), "getmcSalesProd error");
                        str10 = "";
                    }
                    if (verifyIdentityTask2.getPluginOrProxyMode() && TextUtils.isEmpty(verifyIdentityTask2.sceneId)) {
                        verifyIdentityTask2.sceneId = "mobilecashier_mobile_cashier_mobile_cashier_payment_app";
                    }
                    if (TextUtils.isEmpty(str10)) {
                        str10 = verifyIdentityTask2.sceneId;
                    }
                    new IDecisionHelper().saveFeature(SystemClock.elapsedRealtime() - elapsedRealtime, str11, "MODULE_END", str6, (String) access$1000.get(CommonConstant.PRO_VERIFY_TYPE), (String) access$1000.get("module"), str12, str10);
                    VerifyBehavorLogger.logBehavorRightAway(BehaviourIdEnum.EVENT, "UC-MobileIC-150810-3", com.alipay.mobile.verifyidentity.common.Constants.VI_ENGINE_APPID, "mdtchscp", str7, str6, String.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime), access$1000);
                }
                ModuleFlowController.access$800(ModuleFlowController.this, str6, str7, str8, moduleExecuteResult, verifyIdentityTask2);
            }
        };
        if (!bundle.getBoolean("isLocalTrans")) {
            HashMap hashMap = new HashMap();
            hashMap.put("module", str3);
            if (verifyIdentityTask.isDynamicMode) {
                str5 = "Y";
            } else {
                str5 = "N";
            }
            hashMap.put("useBird", str5);
            VerifyBehavorLogger.logBehavorRightAway(BehaviourIdEnum.EVENT, "UC-MobileIC-150810-2", com.alipay.mobile.verifyidentity.common.Constants.VI_ENGINE_APPID, "mdhxhscp", str2, str, null, hashMap);
        }
        bundle.remove("isLocalTrans");
        MicroModuleContext.getInstance().startModule(str, str2, str3, str4, bundle, moduleListener, verifyIdentityTask);
        verifyIdentityTask.taskPrepareEndTime = SystemClock.elapsedRealtime();
    }

    public final void i(final String str, final String str2, final String str3, final String str4, boolean z, final VerifyIdentityTask verifyIdentityTask, boolean z2) {
        JSONObject parseObject;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("221940a0", new Object[]{this, str, str2, str3, str4, new Boolean(z), verifyIdentityTask, new Boolean(z2)});
            return;
        }
        VerifyLogCat.i("ModuleFlowController", "nextStep: " + str3);
        if (!TextUtils.isEmpty(str3)) {
            final Bundle bundle = new Bundle();
            if (verifyIdentityTask.getExtParams() != null) {
                bundle.putAll(verifyIdentityTask.getExtParams());
            }
            bundle.putBoolean("isLocalTrans", z);
            bundle.putBoolean(ModuleConstants.VI_MODULE_IS_FIRST, z2);
            if (verifyIdentityTask.isIPay) {
                bundle.putBoolean(PayPwdModule.IS_IPAY, true);
            }
            if (!TextUtils.isEmpty(str4) && (parseObject = JSON.parseObject(str4)) != null && !z) {
                try {
                    String string = parseObject.getString("userId");
                    if (TextUtils.isEmpty(string)) {
                        string = "";
                    }
                    UserIdCache.uid = string;
                } catch (Throwable th) {
                    VerifyLogCat.e("ModuleFlowController", th);
                }
                new IDecisionHelper().handleIDecision(str, parseObject);
                final boolean hasOtherVerifyProduct = VIUtils.hasOtherVerifyProduct(parseObject);
                String string2 = parseObject.getString("needGuideDialog");
                String string3 = parseObject.getString("dialogMainText");
                String string4 = parseObject.getString("sceneId");
                if (TextUtils.isEmpty(verifyIdentityTask.sceneId)) {
                    verifyIdentityTask.sceneId = string4;
                }
                if ("Y".equalsIgnoreCase(string2)) {
                    VerifyBehavorLogger.logBehavorRightAway(BehaviourIdEnum.EVENT, "UC-MobileIC-190402-1", com.alipay.mobile.verifyidentity.common.Constants.VI_ENGINE_APPID, "ndguidedg", str2, str, "", new HashMap());
                    MicroModuleContext instance = MicroModuleContext.getInstance();
                    String string5 = VIUtils.getString(R.string.vi_ok);
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.engine.ModuleFlowController.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i2)});
                            } else {
                                ModuleFlowController.access$700(ModuleFlowController.this, str, str2, str3, str4, bundle, verifyIdentityTask);
                            }
                        }
                    };
                    if (hasOtherVerifyProduct) {
                        i = R.string.vi_choose_other;
                    } else {
                        i = R.string.vi_cancel;
                    }
                    instance.alert(null, string3, string5, onClickListener, VIUtils.getString(i), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.engine.ModuleFlowController.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i2)});
                            } else if (hasOtherVerifyProduct) {
                                VerifyBehavorLogger.logBehavorRightAway(BehaviourIdEnum.EVENT, "UC-MobileIC-190402-2", com.alipay.mobile.verifyidentity.common.Constants.VI_ENGINE_APPID, "gotherpro", str2, str, "", new HashMap());
                                VIUtils.goOtherVerifyProduct(MicroModuleContext.getInstance(), str, str2, str3, new ModuleListener() { // from class: com.alipay.mobile.verifyidentity.engine.ModuleFlowController.2.1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // com.alipay.mobile.verifyidentity.callback.ModuleListener
                                    public void onModuleExecuteResult(String str5, String str6, String str7, ModuleExecuteResult moduleExecuteResult, VerifyIdentityTask verifyIdentityTask2) {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("60b41082", new Object[]{this, str5, str6, str7, moduleExecuteResult, verifyIdentityTask2});
                                        } else {
                                            ModuleFlowController.access$800(ModuleFlowController.this, str5, str6, str7, moduleExecuteResult, verifyIdentityTask2);
                                        }
                                    }
                                }, verifyIdentityTask);
                            } else {
                                VerifyBehavorLogger.logBehavorRightAway(BehaviourIdEnum.EVENT, "UC-MobileIC-190402-3", com.alipay.mobile.verifyidentity.common.Constants.VI_ENGINE_APPID, "goendcancle", str2, str, "", new HashMap());
                                TaskManager.getInstance().notifyVerifyTaskResult(str, str2, new VerifyIdentityResult("1003"), verifyIdentityTask);
                            }
                        }
                    });
                    return;
                }
            }
            g(str, str2, str3, str4, bundle, verifyIdentityTask);
            return;
        }
        VerifyIdentityResult verifyIdentityResult = new VerifyIdentityResult("2002");
        new VISrcCode().addEngineCode(verifyIdentityResult, "hnsno");
        TaskManager.getInstance().notifyVerifyTaskResult(str, str2, verifyIdentityResult, verifyIdentityTask);
    }
}
