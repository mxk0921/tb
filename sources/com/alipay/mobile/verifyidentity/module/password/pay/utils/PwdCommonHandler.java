package com.alipay.mobile.verifyidentity.module.password.pay.utils;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.NetworkServiceTracer;
import com.alipay.mobile.verifyidentity.bio.BioPreOpenHelper;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.alipay.mobile.verifyidentity.data.DefaultModuleResult;
import com.alipay.mobile.verifyidentity.data.ModuleExecuteResult;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityTask;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.BehaviourIdEnum;
import com.alipay.mobile.verifyidentity.log.VerifyBehavorLogger;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordInputUnifiedPlugin;
import com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordUnifiedPluginNew;
import com.alipay.mobile.verifyidentity.module.password.pay.model.VerifyRequestModel;
import com.alipay.mobile.verifyidentity.module.password.pay.model.VerifyResponseConstants;
import com.alipay.mobile.verifyidentity.rpc.RpcException;
import com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin;
import com.alipay.mobile.verifyidentity.utils.CommonConstant;
import com.alipay.mobile.verifyidentity.utils.ReportHelper;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.alipay.mobileic.core.model.rpc.MICRpcRequest;
import com.alipay.mobileic.core.model.rpc.MICRpcResponse;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class PwdCommonHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f4334a;
    public Activity b;
    public boolean isPluginMode;
    public MicroModule mModule;
    public NotifyResultHandler mNotifyResultHandler;
    public BaseFBPlugin mPlugin;
    public String otherVerifyPayText;
    public String sourceToPwd;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface NotifyMspResultHandler {
        void notifyResult(MICRpcResponse mICRpcResponse, String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface NotifyResultHandler {
        void notifyResult(ModuleExecuteResult moduleExecuteResult);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface OnMspDialogConfirm {
        void onConfirm();
    }

    public PwdCommonHandler(Context context) {
        this.f4334a = context;
    }

    public static /* synthetic */ void access$000(PwdCommonHandler pwdCommonHandler, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a5b51fa", new Object[]{pwdCommonHandler, str});
        } else {
            pwdCommonHandler.a(str);
        }
    }

    public static /* synthetic */ String access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]);
        }
        return "PwdCommonHandler";
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        BaseFBPlugin baseFBPlugin = this.mPlugin;
        if (baseFBPlugin != null) {
            baseFBPlugin.updateVerifyStatus(str);
        }
    }

    public ModuleExecuteResult addLogicModuleName(ModuleExecuteResult moduleExecuteResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ModuleExecuteResult) ipChange.ipc$dispatch("7a567211", new Object[]{this, moduleExecuteResult});
        }
        if (ModuleConstants.VI_MODULE_NAME_PAYMENT_PASSWORD_PLUS.equalsIgnoreCase(this.sourceToPwd)) {
            moduleExecuteResult.setLogicModuleName(ModuleConstants.VI_MODULE_NAME_PAYMENT_PASSWORD_PLUS);
        } else {
            VerifyIdentityTask task = this.mModule.getTask();
            if (task != null) {
                if (task.getExtParams() == null) {
                    task.setExtParams(new Bundle());
                }
                task.getExtParams().putString(CommonConstant.PRO_VERIFY_TYPE, "pwd");
            }
        }
        return moduleExecuteResult;
    }

    public void bindAct(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d86836e", new Object[]{this, activity});
        } else {
            this.b = activity;
        }
    }

    public void doNextStep(MICRpcResponse mICRpcResponse) {
        ModuleExecuteResult moduleExecuteResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3432528d", new Object[]{this, mICRpcResponse});
            return;
        }
        VerifyLogCat.d("PwdCommonHandler", "next step");
        if (mICRpcResponse != null) {
            moduleExecuteResult = new ModuleExecuteResult();
            moduleExecuteResult.setMICRpcResponse(mICRpcResponse);
        } else {
            moduleExecuteResult = new DefaultModuleResult("1001");
        }
        notifyResult(moduleExecuteResult);
    }

    public void doRpc(final String str, final String str2, final String str3, final boolean z, final String str4, final boolean z2, final NotifyMspResultHandler notifyMspResultHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77ede5ae", new Object[]{this, str, str2, str3, new Boolean(z), str4, new Boolean(z2), notifyMspResultHandler});
        } else {
            AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    final MICRpcResponse mICRpcResponse;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        MICRpcRequest mICRpcRequest = new MICRpcRequest();
                        mICRpcRequest.verifyId = PwdCommonHandler.this.mModule.getVerifyId();
                        mICRpcRequest.module = PwdCommonHandler.this.mModule.getModuleName();
                        mICRpcRequest.token = PwdCommonHandler.this.mModule.getToken();
                        mICRpcRequest.action = "VERIFY_PPW";
                        VerifyRequestModel verifyRequestModel = new VerifyRequestModel();
                        verifyRequestModel.setIsSimplePPW(PwdCommonHandler.this.mModule.getVerifyId(), z);
                        verifyRequestModel.encryptPwd = str;
                        verifyRequestModel.needOtherVerifyPay = str2;
                        if (!TextUtils.isEmpty(str3)) {
                            verifyRequestModel.from = str3;
                        }
                        if (z2) {
                            verifyRequestModel.bioPayUsableStrategy = "false";
                        }
                        if (ModuleConstants.VI_MODULE_NAME_PAYMENT_PASSWORD_PLUS.equalsIgnoreCase(PwdCommonHandler.this.sourceToPwd)) {
                            VerifyLogCat.d(PwdCommonHandler.access$100(), "This pwd check request is from fingerprint module.");
                            verifyRequestModel.predata = JSON.parseObject(str4);
                            mICRpcRequest.module = ModuleConstants.VI_MODULE_NAME_PAYMENT_PASSWORD_PLUS;
                        }
                        VerifyLogCat.d("Verifyidentity", "预开通生物参数check");
                        if (BioPreOpenHelper.c().booleanValue()) {
                            VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, "UC-MobileIC-240620-9", Constants.VI_ENGINE_APPID, "hsbmts", PwdCommonHandler.this.mModule.getToken(), PwdCommonHandler.this.mModule.getVerifyId(), null, new HashMap());
                            VerifyLogCat.d("Verifyidentity", "需要预开通生物");
                            verifyRequestModel.needOpenBioPay = Boolean.TRUE;
                            verifyRequestModel.mngRequest = BioPreOpenHelper.b();
                        }
                        mICRpcRequest.data = JSON.toJSONString(verifyRequestModel);
                        VerifyLogCat.d("Verifyidentity", "verify request info" + JSON.toJSONString(mICRpcRequest));
                        mICRpcResponse = PwdCommonHandler.this.mPlugin.sendRpcRequest(mICRpcRequest);
                    } catch (RpcException unused) {
                        mICRpcResponse = null;
                    }
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler.11.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            AnonymousClass11 r0 = AnonymousClass11.this;
                            notifyMspResultHandler.notifyResult(mICRpcResponse, str3);
                        }
                    });
                }
            }, NetworkServiceTracer.REPORT_SUB_NAME_RPC);
        }
    }

    public String getLogicModuleName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fcbf817a", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.sourceToPwd)) {
            return this.mModule.getModuleName();
        }
        return this.sourceToPwd;
    }

    public String getOtherVerifyPayText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("857c37", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.otherVerifyPayText)) {
            return this.otherVerifyPayText;
        }
        VerifyLogCat.i("PwdCommonHandler", "getOtherVerifyPayText 用兜底文案");
        return this.f4334a.getResources().getString(R.string.other_way_to_pay);
    }

    public void goGetBackPPW() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc3b1a69", new Object[]{this});
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("alipays://platformapi/startapp?appId=20000013&preAuth=YES"));
            if (this.f4334a == null) {
                this.f4334a = MicroModuleContext.getInstance().getContext();
            }
            if (!(this.f4334a instanceof Activity)) {
                intent.addFlags(268435456);
            }
            this.f4334a.startActivity(intent);
        } catch (Exception unused) {
            if (this.f4334a != null) {
                MicroModuleContext.getInstance().toast(this.f4334a.getResources().getString(R.string.pwd_install), 1);
            }
        }
    }

    public void goGetMspPPW(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("924441cc", new Object[]{this, str});
            return;
        }
        try {
            String str2 = "";
            if (!TextUtils.isEmpty(str)) {
                str2 = "&loginId=" + str;
            }
            Uri parse = Uri.parse("alipays://platformapi/startApp?appId=20000013&pwdType=phonePassword" + str2 + "&bizScene=mobilecashier_sdk_pay");
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(parse);
            intent.addCategory("android.intent.category.BROWSABLE");
            if (this.f4334a == null) {
                this.f4334a = MicroModuleContext.getInstance().getContext();
            }
            if (!(this.f4334a instanceof Activity)) {
                intent.addFlags(268435456);
            }
            this.f4334a.startActivity(intent);
        } catch (Exception unused) {
            if (this.f4334a != null) {
                MicroModuleContext.getInstance().toast(this.f4334a.getResources().getString(R.string.pwd_install), 1);
            }
        }
    }

    public void notifyCancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673f922a", new Object[]{this});
        } else {
            notifyCancel(null);
        }
    }

    public void notifyResult(ModuleExecuteResult moduleExecuteResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75cfa791", new Object[]{this, moduleExecuteResult});
            return;
        }
        NotifyResultHandler notifyResultHandler = this.mNotifyResultHandler;
        if (notifyResultHandler != null) {
            notifyResultHandler.notifyResult(moduleExecuteResult);
        }
        LocalBroadcastManager.getInstance(MicroModuleContext.getInstance().getContext()).sendBroadcast(new Intent("NEW_PWD_EXIT"));
        Activity activity = this.b;
        if (activity != null) {
            activity.finish();
        }
    }

    public void processError(MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1602ede", new Object[]{this, mICRpcResponse});
        } else {
            processError(mICRpcResponse, false);
        }
    }

    public void writeBehavorLog(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("214dc80b", new Object[]{this, str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("module", getLogicModuleName());
        hashMap.put("code", str2);
        hashMap.put("binIndx", str3);
        VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, str, Constants.VI_ENGINE_APPID, "hsbmts", this.mModule.getToken(), this.mModule.getVerifyId(), null, hashMap);
    }

    public void writePWDErrorBehavorLog(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a202b1ac", new Object[]{this, str, str2});
        } else {
            writeBehavorLog("UC-MobileIC-161201-2", str, str2);
        }
    }

    public boolean getOtherVerifyPayFlag(MICRpcResponse mICRpcResponse) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9f4487a", new Object[]{this, mICRpcResponse})).booleanValue();
        }
        if (mICRpcResponse == null || TextUtils.isEmpty(mICRpcResponse.data)) {
            return false;
        }
        try {
            jSONObject = JSON.parseObject(mICRpcResponse.data);
        } catch (JSONException e) {
            VerifyLogCat.e("PwdCommonHandler", "json fail " + mICRpcResponse.data, e);
            jSONObject = null;
        }
        if (jSONObject == null) {
            return false;
        }
        String string = jSONObject.getString("otherVerifyPaySwitch");
        this.otherVerifyPayText = jSONObject.getString("otherVerifyPayText");
        VerifyLogCat.i("PwdCommonHandler", "otherVerifyPaySwitch: " + string);
        return "Y".equalsIgnoreCase(string);
    }

    public void notifyCancel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21f84574", new Object[]{this, str});
            return;
        }
        VerifyLogCat.i("PwdCommonHandler", "cancel [subcode]: " + str);
        DefaultModuleResult defaultModuleResult = new DefaultModuleResult("1003");
        if (!TextUtils.isEmpty(str)) {
            if (defaultModuleResult.getExtInfo() == null) {
                defaultModuleResult.setExtInfo(new HashMap<>());
            }
            defaultModuleResult.getExtInfo().put("subCode", str);
        }
        notifyResult(defaultModuleResult);
    }

    public void processError(final MICRpcResponse mICRpcResponse, final boolean z) {
        BaseFBPlugin baseFBPlugin;
        DialogInterface.OnClickListener onClickListener;
        String str;
        DialogInterface.OnClickListener onClickListener2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa65fb6", new Object[]{this, mICRpcResponse, new Boolean(z)});
        } else if (VerifyResponseConstants.PPW_LOCK_FIND.equalsIgnoreCase(mICRpcResponse.verifyCode)) {
            VerifyLogCat.d("PwdCommonHandler", "lock findable");
            MicroModuleContext.getInstance().alert("", mICRpcResponse.verifyMessage, this.f4334a.getResources().getString(R.string.pwd_find_later), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    BaseFBPlugin baseFBPlugin2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    mICRpcResponse.verifyCode = "PPW_LOCK_USER_CANCEL";
                    PwdCommonHandler.this.writePWDErrorBehavorLog(VerifyResponseConstants.PPW_LOCK_FIND, "1");
                    if (!z || (baseFBPlugin2 = PwdCommonHandler.this.mPlugin) == null) {
                        PwdCommonHandler.access$000(PwdCommonHandler.this, BaseFBPlugin.VERIFY_STATUS.abort);
                    } else {
                        baseFBPlugin2.updateVerifyStatusFotQuit(BaseFBPlugin.VERIFY_STATUS.abort, VerifyResponseConstants.PPW_LOCK);
                    }
                    PwdCommonHandler.this.doNextStep(mICRpcResponse);
                }
            }, this.f4334a.getResources().getString(R.string.pwd_find_now), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    BaseFBPlugin baseFBPlugin2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    PwdCommonHandler.this.writePWDErrorBehavorLog(VerifyResponseConstants.PPW_LOCK_FIND, "0");
                    if (!z || (baseFBPlugin2 = PwdCommonHandler.this.mPlugin) == null) {
                        PwdCommonHandler.access$000(PwdCommonHandler.this, BaseFBPlugin.VERIFY_STATUS.abort);
                    } else {
                        baseFBPlugin2.updateVerifyStatusFotQuit(BaseFBPlugin.VERIFY_STATUS.abort, "forgetPwd");
                    }
                    PwdCommonHandler.this.goGetBackPPW();
                }
            });
        } else if (VerifyResponseConstants.PPW_LOCK.equalsIgnoreCase(mICRpcResponse.verifyCode)) {
            String str2 = this.f4334a.getResources().getString(R.string.i_know);
            DialogInterface.OnClickListener onClickListener3 = new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    BaseFBPlugin baseFBPlugin2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    PwdCommonHandler.this.writePWDErrorBehavorLog(VerifyResponseConstants.PPW_LOCK, "0");
                    if (!z || (baseFBPlugin2 = PwdCommonHandler.this.mPlugin) == null) {
                        PwdCommonHandler.access$000(PwdCommonHandler.this, BaseFBPlugin.VERIFY_STATUS.abort);
                    } else {
                        baseFBPlugin2.updateVerifyStatusFotQuit(BaseFBPlugin.VERIFY_STATUS.abort, VerifyResponseConstants.PPW_LOCK);
                    }
                    PwdCommonHandler.this.doNextStep(mICRpcResponse);
                }
            };
            if (getOtherVerifyPayFlag(mICRpcResponse)) {
                VerifyLogCat.d("PwdCommonHandler", "show others' way");
                String otherVerifyPayText = getOtherVerifyPayText();
                str2 = this.f4334a.getResources().getString(R.string.pwd_find_later);
                str = otherVerifyPayText;
                onClickListener = new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                            return;
                        }
                        BaseFBPlugin baseFBPlugin2 = PwdCommonHandler.this.mPlugin;
                        if (baseFBPlugin2 instanceof PasswordUnifiedPluginNew) {
                            ((PasswordUnifiedPluginNew) baseFBPlugin2).hideKeyboard();
                            ((PasswordUnifiedPluginNew) PwdCommonHandler.this.mPlugin).sendMspRpc(null, "Y", "");
                            return;
                        }
                        ((PasswordInputUnifiedPlugin) baseFBPlugin2).hideKeyboard();
                        ((PasswordInputUnifiedPlugin) PwdCommonHandler.this.mPlugin).doRpc(null, "Y", "");
                    }
                };
                onClickListener2 = new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        BaseFBPlugin baseFBPlugin2;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                            return;
                        }
                        PwdCommonHandler.this.writePWDErrorBehavorLog(VerifyResponseConstants.PPW_LOCK, "0");
                        if (!z || (baseFBPlugin2 = PwdCommonHandler.this.mPlugin) == null) {
                            PwdCommonHandler.access$000(PwdCommonHandler.this, BaseFBPlugin.VERIFY_STATUS.abort);
                        } else {
                            baseFBPlugin2.updateVerifyStatusFotQuit(BaseFBPlugin.VERIFY_STATUS.abort, VerifyResponseConstants.PPW_LOCK);
                        }
                        PwdCommonHandler.this.notifyCancel();
                    }
                };
            } else {
                str = null;
                onClickListener = null;
                onClickListener2 = onClickListener3;
            }
            VerifyLogCat.d("PwdCommonHandler", "lock notify");
            MicroModuleContext.getInstance().alert("", mICRpcResponse.verifyMessage, str2, onClickListener2, str, onClickListener);
        } else {
            VerifyLogCat.d("PwdCommonHandler", "unhandled error " + mICRpcResponse.verifyCode);
            MicroModuleContext.getInstance().toast(TextUtils.isEmpty(mICRpcResponse.verifyMessage) ? this.f4334a.getResources().getString(R.string.verifyidentity_wrong_data) : mICRpcResponse.verifyMessage, 0);
            if (!z || (baseFBPlugin = this.mPlugin) == null) {
                a(BaseFBPlugin.VERIFY_STATUS.abort);
            } else {
                baseFBPlugin.updateVerifyStatusFotQuit(BaseFBPlugin.VERIFY_STATUS.abort, VerifyResponseConstants.PPW_LOCK);
            }
            doNextStep(mICRpcResponse);
        }
    }

    public PwdCommonHandler(Context context, MicroModule microModule, BaseFBPlugin baseFBPlugin, NotifyResultHandler notifyResultHandler) {
        this.f4334a = context;
        this.mModule = microModule;
        this.mPlugin = baseFBPlugin;
        if (baseFBPlugin != null) {
            this.isPluginMode = true;
        } else {
            this.isPluginMode = false;
        }
        this.mNotifyResultHandler = notifyResultHandler;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void changeToBack() {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler.changeToBack():void");
    }

    public void doNextStep(MICRpcResponse mICRpcResponse, String str) {
        ModuleExecuteResult moduleExecuteResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a89ed317", new Object[]{this, mICRpcResponse, str});
            return;
        }
        VerifyLogCat.d("PwdCommonHandler", "next step");
        if (mICRpcResponse != null) {
            moduleExecuteResult = new ModuleExecuteResult();
            moduleExecuteResult.setMICRpcResponse(mICRpcResponse);
        } else {
            moduleExecuteResult = new DefaultModuleResult("1001");
        }
        if ("forgotPwd".equalsIgnoreCase(str)) {
            moduleExecuteResult.setFindAndPay(true);
        }
        notifyResult(moduleExecuteResult);
    }

    public void processErrorForNew(BaseVerifyActivity baseVerifyActivity, final MICRpcResponse mICRpcResponse, final OnMspDialogConfirm onMspDialogConfirm, View view, String str) {
        String str2;
        DialogInterface.OnClickListener onClickListener;
        String str3;
        DialogInterface.OnClickListener onClickListener2;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cc19b7a", new Object[]{this, baseVerifyActivity, mICRpcResponse, onMspDialogConfirm, view, str});
        } else if (VerifyResponseConstants.PPW_LOCK_FIND.equalsIgnoreCase(mICRpcResponse.verifyCode)) {
            VerifyLogCat.d("PwdCommonHandler", "lock findable");
            view.setVisibility(4);
            baseVerifyActivity.alert("", mICRpcResponse.verifyMessage, this.f4334a.getResources().getString(R.string.pwd_find_later), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    mICRpcResponse.verifyCode = "PPW_LOCK_USER_CANCEL";
                    PwdCommonHandler.this.writePWDErrorBehavorLog(VerifyResponseConstants.PPW_LOCK_FIND, "1");
                    BaseFBPlugin baseFBPlugin = PwdCommonHandler.this.mPlugin;
                    if (baseFBPlugin != null) {
                        baseFBPlugin.updateVerifyStatusFotQuit(BaseFBPlugin.VERIFY_STATUS.abort, VerifyResponseConstants.PPW_LOCK);
                    }
                    PwdCommonHandler.this.doNextStep(mICRpcResponse);
                }
            }, this.f4334a.getResources().getString(R.string.pwd_find_now), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    PwdCommonHandler.this.writePWDErrorBehavorLog(VerifyResponseConstants.PPW_LOCK_FIND, "0");
                    BaseFBPlugin baseFBPlugin = PwdCommonHandler.this.mPlugin;
                    if (baseFBPlugin != null) {
                        baseFBPlugin.updateVerifyStatusFotQuit(BaseFBPlugin.VERIFY_STATUS.abort, "forgetPwd");
                    }
                    PwdCommonHandler.this.notifyCancel();
                    if (!"Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.closeGetPwdDelay))) {
                        try {
                            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler.7.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        PwdCommonHandler.this.goGetBackPPW();
                                    }
                                }
                            }, 200L);
                        } catch (Throwable th) {
                            String access$100 = PwdCommonHandler.access$100();
                            VerifyLogCat.i(access$100, "quit error:" + th.getMessage());
                        }
                    } else {
                        PwdCommonHandler.this.goGetBackPPW();
                    }
                }
            });
        } else if (VerifyResponseConstants.PPW_LOCK.equalsIgnoreCase(mICRpcResponse.verifyCode)) {
            String string = this.f4334a.getResources().getString(R.string.i_know);
            DialogInterface.OnClickListener onClickListener3 = new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    PwdCommonHandler.this.writePWDErrorBehavorLog(VerifyResponseConstants.PPW_LOCK, "0");
                    BaseFBPlugin baseFBPlugin = PwdCommonHandler.this.mPlugin;
                    if (baseFBPlugin != null) {
                        baseFBPlugin.updateVerifyStatusFotQuit(BaseFBPlugin.VERIFY_STATUS.abort, VerifyResponseConstants.PPW_LOCK);
                    }
                    PwdCommonHandler.this.doNextStep(mICRpcResponse);
                }
            };
            if (!getOtherVerifyPayFlag(mICRpcResponse) || "Y".equalsIgnoreCase(str)) {
                str3 = null;
                onClickListener = null;
                str4 = string;
                onClickListener2 = onClickListener3;
            } else {
                VerifyLogCat.d("PwdCommonHandler", "show others' way");
                String otherVerifyPayText = getOtherVerifyPayText();
                String string2 = this.f4334a.getResources().getString(R.string.pwd_find_later);
                DialogInterface.OnClickListener onClickListener4 = new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler.9
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        } else {
                            onMspDialogConfirm.onConfirm();
                        }
                    }
                };
                onClickListener2 = new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler.10
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                            return;
                        }
                        PwdCommonHandler.this.writePWDErrorBehavorLog(VerifyResponseConstants.PPW_LOCK, "0");
                        BaseFBPlugin baseFBPlugin = PwdCommonHandler.this.mPlugin;
                        if (baseFBPlugin != null) {
                            baseFBPlugin.updateVerifyStatusFotQuit(BaseFBPlugin.VERIFY_STATUS.abort, VerifyResponseConstants.PPW_LOCK);
                        }
                        PwdCommonHandler.this.notifyCancel();
                    }
                };
                str3 = otherVerifyPayText;
                str4 = string2;
                onClickListener = onClickListener4;
            }
            VerifyLogCat.d("PwdCommonHandler", "lock notify");
            view.setVisibility(4);
            baseVerifyActivity.alert("", mICRpcResponse.verifyMessage, str4, onClickListener2, str3, onClickListener);
        } else {
            VerifyLogCat.d("PwdCommonHandler", "unhandled error " + mICRpcResponse.verifyCode);
            MicroModuleContext instance = MicroModuleContext.getInstance();
            if (TextUtils.isEmpty(mICRpcResponse.verifyMessage)) {
                str2 = this.f4334a.getResources().getString(R.string.verifyidentity_wrong_data);
            } else {
                str2 = mICRpcResponse.verifyMessage;
            }
            instance.toast(str2, 0);
            BaseFBPlugin baseFBPlugin = this.mPlugin;
            if (baseFBPlugin != null) {
                baseFBPlugin.updateVerifyStatusFotQuit(BaseFBPlugin.VERIFY_STATUS.abort, VerifyResponseConstants.PPW_LOCK);
            }
            doNextStep(mICRpcResponse);
        }
    }
}
