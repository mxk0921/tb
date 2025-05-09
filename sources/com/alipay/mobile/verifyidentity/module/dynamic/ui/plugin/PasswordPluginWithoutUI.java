package com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.template.FBPluginCtx;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager;
import com.alipay.birdnest.util.UiUtil;
import com.alipay.mobile.verifyidentity.bio.BioPreOpenHelper;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.alipay.mobile.verifyidentity.data.ModuleDataModel;
import com.alipay.mobile.verifyidentity.data.ModuleExecuteResult;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityTask;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.BehaviourIdEnum;
import com.alipay.mobile.verifyidentity.log.VerifyBehavorLogger;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.alipay.mobile.verifyidentity.module.password.pay.PayPwdModule;
import com.alipay.mobile.verifyidentity.module.password.pay.PubKeyHelper;
import com.alipay.mobile.verifyidentity.module.password.pay.model.InitDataModel;
import com.alipay.mobile.verifyidentity.module.password.pay.model.VerifyResponseConstants;
import com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler;
import com.alipay.mobile.verifyidentity.safepaybase.EncryptRandomType;
import com.alipay.mobile.verifyidentity.safepaybase.PwdEncryptHandler;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.VIFBPluginManager;
import com.alipay.mobile.verifyidentity.utils.ProductDataHelper;
import com.alipay.mobileic.core.model.rpc.MICRpcResponse;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class PasswordPluginWithoutUI extends BaseFBPlugin {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String backToBioViType;
    public BroadcastReceiver findPwdBroadcastReceiver;
    public String findPwdTxt;
    public String goOtherVerifyProduct;
    public boolean hasOthers;
    public String hind_other;
    public boolean isIntelliDecision;
    public String mPubKey;
    public PwdEncryptHandler mPwdEncryptHandler;
    public String mStateSecret;
    public String mStateSecretPubKey;
    public String otherProductForDialog;
    public String otherText;
    public BroadcastReceiver pageChangeBroadcastReceiver;
    public String predata;
    public String pwdTopTip;
    public final Context q;
    public final FBPluginCtx r;
    public final int s;
    public String showFindPwd;
    public MICRpcResponse t;
    public String top_to_product;
    public InitDataModel u;
    public PwdCommonHandler v;
    public String w;
    public View x;
    public String mTimestamp = "";
    public boolean isShowGetBackPwd = false;
    public boolean isPwdTopTipBlack = false;
    public boolean isSimplePwd = true;
    public String y = UiUtil.INPUT_TYPE_VALUE_PAYSPWD;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class DecorViewInfo {
        public View decorView;
        public boolean isDialog;

        public DecorViewInfo() {
        }
    }

    public PasswordPluginWithoutUI(Context context, FBPluginCtx fBPluginCtx, int i) {
        super(context, fBPluginCtx);
        this.q = context;
        this.r = fBPluginCtx;
        this.s = i;
        VerifyLogCat.i("PasswordPluginWithoutUI", "pwd plugin create");
    }

    public static /* synthetic */ MICRpcResponse access$002(PasswordPluginWithoutUI passwordPluginWithoutUI, MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MICRpcResponse) ipChange.ipc$dispatch("544aa540", new Object[]{passwordPluginWithoutUI, mICRpcResponse});
        }
        passwordPluginWithoutUI.t = mICRpcResponse;
        return mICRpcResponse;
    }

    public static /* synthetic */ void access$100(PasswordPluginWithoutUI passwordPluginWithoutUI, MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58b6ac91", new Object[]{passwordPluginWithoutUI, mICRpcResponse});
        } else if (!TextUtils.isEmpty(mICRpcResponse.data) && mICRpcResponse.data.contains("bicAsyncData")) {
            try {
                JSONObject parseObject = JSON.parseObject(mICRpcResponse.data);
                if (parseObject != null) {
                    AuthenticatorManager.getInstance(passwordPluginWithoutUI.q).processAfterAuth(parseObject.getString("bicAsyncData"));
                }
            } catch (Throwable th) {
                VerifyLogCat.i("PasswordPluginWithoutUI", "handle km error:" + th.getMessage());
            }
        }
    }

    public static /* synthetic */ MicroModule access$1000(PasswordPluginWithoutUI passwordPluginWithoutUI) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("1d7a2fa1", new Object[]{passwordPluginWithoutUI});
        }
        return passwordPluginWithoutUI.mModule;
    }

    public static /* synthetic */ PwdCommonHandler access$200(PasswordPluginWithoutUI passwordPluginWithoutUI) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PwdCommonHandler) ipChange.ipc$dispatch("d80afbe3", new Object[]{passwordPluginWithoutUI});
        }
        return passwordPluginWithoutUI.v;
    }

    public static /* synthetic */ Context access$300(PasswordPluginWithoutUI passwordPluginWithoutUI) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("56a20a43", new Object[]{passwordPluginWithoutUI});
        }
        return passwordPluginWithoutUI.q;
    }

    public static /* synthetic */ void access$400(PasswordPluginWithoutUI passwordPluginWithoutUI, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dd5dab4", new Object[]{passwordPluginWithoutUI, str});
            return;
        }
        VerifyLogCat.i("PasswordPluginWithoutUI", "updatePubKey: " + str);
        if (TextUtils.isEmpty(str)) {
            VerifyLogCat.i("PasswordPluginWithoutUI", "服务端没有提供新的公钥，不更新");
            return;
        }
        String generatePubKey = PubKeyHelper.generatePubKey(passwordPluginWithoutUI.q, str);
        passwordPluginWithoutUI.mPubKey = generatePubKey;
        PwdEncryptHandler pwdEncryptHandler = passwordPluginWithoutUI.mPwdEncryptHandler;
        if (pwdEncryptHandler != null) {
            pwdEncryptHandler.b = generatePubKey;
        }
    }

    public static /* synthetic */ void access$500(PasswordPluginWithoutUI passwordPluginWithoutUI, String str) {
        PwdEncryptHandler pwdEncryptHandler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6307cc13", new Object[]{passwordPluginWithoutUI, str});
            return;
        }
        VerifyLogCat.i("PasswordPluginWithoutUI", "updateStateSecretPubKey: " + str);
        if (TextUtils.isEmpty(str)) {
            VerifyLogCat.i("PasswordPluginWithoutUI", "updateStateSecretPubKey 服务端没有提供新的公钥，不更新");
        }
        passwordPluginWithoutUI.generateStateSecretPubKey(str);
        if (passwordPluginWithoutUI.isStateSecretPassword() && (pwdEncryptHandler = passwordPluginWithoutUI.mPwdEncryptHandler) != null) {
            pwdEncryptHandler.c = passwordPluginWithoutUI.mStateSecretPubKey;
        }
    }

    public static /* synthetic */ void access$600(PasswordPluginWithoutUI passwordPluginWithoutUI, MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41787d16", new Object[]{passwordPluginWithoutUI, mICRpcResponse});
            return;
        }
        passwordPluginWithoutUI.sendPwdVerifyResultEvent(mICRpcResponse.verifyCode, mICRpcResponse.verifyMessage, mICRpcResponse.data);
        passwordPluginWithoutUI.sendUpdatePwdTipsEvent("error", mICRpcResponse.verifyMessage);
        passwordPluginWithoutUI.c(mICRpcResponse);
    }

    public static /* synthetic */ MicroModule access$800(PasswordPluginWithoutUI passwordPluginWithoutUI) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("1e835ca8", new Object[]{passwordPluginWithoutUI});
        }
        return passwordPluginWithoutUI.mModule;
    }

    public static /* synthetic */ MicroModule access$900(PasswordPluginWithoutUI passwordPluginWithoutUI) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("8e683647", new Object[]{passwordPluginWithoutUI});
        }
        return passwordPluginWithoutUI.mModule;
    }

    public static /* synthetic */ Object ipc$super(PasswordPluginWithoutUI passwordPluginWithoutUI, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2070326638) {
            super.addPlugin((String) objArr[0], (String) objArr[1], (ModuleDataModel) objArr[2], (Bundle) objArr[3]);
            return null;
        } else if (hashCode == -111775739) {
            super.onBNPageClose();
            return null;
        } else if (hashCode == 1244158585) {
            return new Boolean(super.updateAttr((String) objArr[0], (String) objArr[1]));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alipay/mobile/verifyidentity/module/dynamic/ui/plugin/PasswordPluginWithoutUI");
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:14|(1:16)|17|(1:19)|20|(1:22)(1:23)|24|(1:26)|27|(3:29|(1:31)|32)(2:33|(1:39))|40|(15:42|(1:44)(2:45|(3:49|(1:51)|52))|54|(3:56|(1:58)(2:59|(3:61|(1:63)|64)(1:65))|66)(1:67)|97|68|(1:72)|75|(2:77|(1:79)(2:80|(1:82)(1:83)))|84|(1:86)(1:87)|88|(1:92)|93|94)|53|54|(0)(0)|97|68|(2:70|72)|75|(0)|84|(0)(0)|88|(2:90|92)|93|94) */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x022d, code lost:
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x022e, code lost:
        com.alipay.mobile.verifyidentity.log.VerifyLogCat.e("PasswordPluginWithoutUI", r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0277  */
    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void bindModule(com.alipay.mobile.verifyidentity.module.MicroModule r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordPluginWithoutUI.bindModule(com.alipay.mobile.verifyidentity.module.MicroModule, java.lang.String):void");
    }

    public final void c(MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a28c656", new Object[]{this, mICRpcResponse});
        } else if ("Y".equalsIgnoreCase(this.hind_other)) {
            sendShowForgetPwdEvent("");
        } else if (this.v.getOtherVerifyPayFlag(mICRpcResponse)) {
            sendShowForgetPwdEvent(getOtherVerifyPayText(mICRpcResponse));
        } else {
            HashMap<String, String> hashMap = new HashMap<>();
            if (showFindPwdByResponse(mICRpcResponse, hashMap)) {
                String str = hashMap.get(PayPwdModule.FIND_PWD_TXT);
                if (TextUtils.isEmpty(str)) {
                    str = this.q.getString(R.string.pwd_forget_in_layout);
                }
                sendShowForgetPwdEvent(str);
                return;
            }
            sendShowForgetPwdEvent("");
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        clearInputContent();
        hideKeyboard();
        h();
        View view = this.x;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public void clearInputContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad0002c3", new Object[]{this});
        }
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public View createView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        View inflate = ((LayoutInflater) this.q.getSystemService("layout_inflater")).inflate(R.layout.layout_plugin_vi_password_new, (ViewGroup) null);
        this.x = inflate;
        inflate.setVisibility(8);
        initPwdInput();
        this.pageChangeBroadcastReceiver = new BroadcastReceiver() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordPluginWithoutUI.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/module/dynamic/ui/plugin/PasswordPluginWithoutUI$3");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                    return;
                }
                VerifyLogCat.i("PasswordPluginWithoutUI", "收到广播：com.alipay.phonecashier.framechange");
                if (PasswordPluginWithoutUI.this.getInnerView() != null) {
                    PasswordPluginWithoutUI.this.getInnerView().setEnabled(false);
                }
            }
        };
        this.findPwdBroadcastReceiver = new BroadcastReceiver() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordPluginWithoutUI.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/module/dynamic/ui/plugin/PasswordPluginWithoutUI$4");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                    return;
                }
                VerifyLogCat.i("PasswordPluginWithoutUI", "收到广播：kMQPFindPwdNotification | 收银台场景用户点找回密码");
                if (PasswordPluginWithoutUI.access$800(PasswordPluginWithoutUI.this) != null && PasswordPluginWithoutUI.access$900(PasswordPluginWithoutUI.this).getTask() != null) {
                    VerifyIdentityTask task = PasswordPluginWithoutUI.access$1000(PasswordPluginWithoutUI.this).getTask();
                    Bundle extParams = task.getExtParams();
                    if (extParams == null) {
                        task.setExtParams(new Bundle());
                        extParams = task.getExtParams();
                    }
                    extParams.putString("subCode", "105");
                }
            }
        };
        LocalBroadcastManager instance = LocalBroadcastManager.getInstance(this.q);
        instance.registerReceiver(this.pageChangeBroadcastReceiver, new IntentFilter(MspGlobalDefine.FRAME_CHANGE_ACTION));
        instance.registerReceiver(this.findPwdBroadcastReceiver, new IntentFilter("kMQPFindPwdNotification"));
        try {
            Intent intent = new Intent("com.alipay.mobile.verifyidentity.startPwd");
            intent.putExtra(Constants.VI_ENGINE_VERIFY_TYPE, "password");
            LocalBroadcastManager.getInstance(this.q).sendBroadcast(intent);
        } catch (Throwable th) {
            VerifyLogCat.i("PasswordPluginWithoutUI", "sendPopBroadCast error:" + th.getMessage());
        }
        return this.x;
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        clearInputContent();
        hideKeyboard();
        h();
        View view = this.x;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public final void generateStateSecretPubKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b91b3f", new Object[]{this, str});
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                this.mStateSecretPubKey = PubKeyHelper.getPubKey(this.q);
            } else {
                this.mStateSecretPubKey = str;
            }
        } catch (Exception e) {
            VerifyLogCat.e("PasswordPluginWithoutUI", e);
        }
    }

    public float getBodyViewOpacity() {
        Object bodyView = this.r.getBodyView();
        if (bodyView == null) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(bodyView.getClass().getMethod("getOpacity", new Class[0]).invoke(bodyView, new Object[0]).toString());
        } catch (Throwable th) {
            VerifyLogCat.w("PasswordPluginWithoutUI", th);
            return 1.0f;
        }
    }

    public int getBusinessId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("544634eb", new Object[]{this})).intValue();
        }
        return this.s;
    }

    public View getInnerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3a4c32ae", new Object[]{this});
        }
        return this.x;
    }

    public String getOtherPayConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28030f29", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.goOtherVerifyProduct)) {
            this.goOtherVerifyProduct = "N";
        }
        return this.goOtherVerifyProduct;
    }

    public String getOtherPayContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a421102e", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.otherText)) {
            return this.x.getResources().getString(R.string.other_way_to_pwd);
        }
        return this.otherText;
    }

    public String getOtherVerifyPayText(MICRpcResponse mICRpcResponse) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97df53ab", new Object[]{this, mICRpcResponse});
        }
        if (mICRpcResponse == null || TextUtils.isEmpty(mICRpcResponse.data)) {
            return getOtherPayContent();
        }
        try {
            jSONObject = JSON.parseObject(mICRpcResponse.data);
        } catch (JSONException e) {
            VerifyLogCat.e("PasswordPluginWithoutUI", "json fail " + mICRpcResponse.data, e);
            jSONObject = null;
        }
        if (jSONObject == null) {
            return getOtherPayContent();
        }
        String string = jSONObject.getString("otherVerifyPayText");
        this.otherProductForDialog = string;
        if (!TextUtils.isEmpty(string)) {
            return this.otherProductForDialog;
        }
        return getOtherPayContent();
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin
    public String getPluginName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd12a725", new Object[]{this});
        }
        return getClass().getSimpleName();
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        try {
            Context context = this.q;
            if ((context instanceof Activity) && ((Activity) context).getWindow() != null) {
                ((Activity) this.q).getWindow().clearFlags(8192);
            }
        } catch (Throwable th) {
            VerifyLogCat.e("PasswordPluginWithoutUI", th);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin
    public void handleEngineCancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b64b42b", new Object[]{this});
            return;
        }
        VerifyLogCat.i("PasswordPluginWithoutUI", "pwd plugin cancel");
        if (openDuplicatePayTaskFix()) {
            updateVerifyStatusFotQuit(BaseFBPlugin.VERIFY_STATUS.abort, BaseFBPlugin.ABORT_SCENE_CANCEL_BY_ENGINE);
        } else {
            updateVerifyStatusNew(BaseFBPlugin.VERIFY_STATUS.abort);
        }
    }

    public void hideKeyboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c20b50", new Object[]{this});
        }
    }

    public void initPwdInput() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c01349c4", new Object[]{this});
            return;
        }
        VerifyLogCat.i("PasswordPluginWithoutUI", "[initPwdInput] isSimplePwd: " + this.isSimplePwd + ", mType: " + this.y);
        PwdEncryptHandler pwdEncryptHandler = new PwdEncryptHandler((Activity) this.q, this.isSimplePwd);
        this.mPwdEncryptHandler = pwdEncryptHandler;
        pwdEncryptHandler.b = this.mPubKey;
        if (isStateSecretPassword()) {
            this.mPwdEncryptHandler.c = this.mStateSecretPubKey;
        }
        PwdEncryptHandler pwdEncryptHandler2 = this.mPwdEncryptHandler;
        String str = this.mTimestamp;
        EncryptRandomType encryptRandomType = EncryptRandomType.randomafter;
        pwdEncryptHandler2.d = str;
        pwdEncryptHandler2.e = encryptRandomType;
    }

    public void notifyResult(ModuleExecuteResult moduleExecuteResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75cfa791", new Object[]{this, moduleExecuteResult});
            return;
        }
        ModuleExecuteResult addLogicModuleName = this.v.addLogicModuleName(moduleExecuteResult);
        onVerifyFinished(addLogicModuleName);
        this.mModule.getMicroModuleContext().notifyAndFinishModule(this.mModule.getVerifyId(), this.mModule.getToken(), this.mModule.getModuleName(), addLogicModuleName);
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin
    public void onBNPageClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9567005", new Object[]{this});
            return;
        }
        super.onBNPageClose();
        if (this.pageChangeBroadcastReceiver != null) {
            LocalBroadcastManager.getInstance(this.q).unregisterReceiver(this.pageChangeBroadcastReceiver);
        }
        if (this.findPwdBroadcastReceiver != null) {
            LocalBroadcastManager.getInstance(this.q).unregisterReceiver(this.findPwdBroadcastReceiver);
        }
        PwdCommonHandler pwdCommonHandler = this.v;
        if (pwdCommonHandler != null) {
            pwdCommonHandler.notifyCancel("106");
        }
        g();
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin, android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin, android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1621df92", new Object[]{this, view, new Boolean(z)});
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin
    public void onHandleOtherPayWay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae78977", new Object[]{this});
            return;
        }
        hideKeyboard();
        sendMspRpc(null, "Y", "forgotPwd");
        MicroModule microModule = this.mModule;
        if (microModule != null) {
            microModule.isFindAndPay = true;
        }
        VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, "UC-MobileIC-190311-1", Constants.VI_ENGINE_APPID, "aprj", microModule.getToken(), this.mModule.getVerifyId(), null, null);
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public boolean onLoadFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b23670e3", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void onMspPwdCancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18e499b3", new Object[]{this});
            return;
        }
        updateVerifyStatusFotQuit(BaseFBPlugin.VERIFY_STATUS.abort, VerifyResponseConstants.PPW_LOCK);
        this.v.notifyCancel();
    }

    public void onMspPwdRetry(MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87f20361", new Object[]{this, mICRpcResponse});
            return;
        }
        String str = this.u.keyHeadline;
        if (TextUtils.isEmpty(str)) {
            str = this.q.getResources().getString(R.string.pwd_input_alert_please);
        }
        sendUpdatePwdTipsEvent("normal", str);
        c(mICRpcResponse);
    }

    public void onNetError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be1d94f1", new Object[]{this});
        } else if (this.isSimplePwd) {
            clearInputContent();
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin, com.alipay.android.app.template.FBFocusable
    public void requestFocus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10da4b90", new Object[]{this});
            return;
        }
        View view = this.x;
        if (view != null) {
            view.requestFocus();
        }
    }

    public void sendMspRpc(final String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f49c508", new Object[]{this, str, str2, str3});
            return;
        }
        writeBehavorWithPlus("UC-MobileIC-20190606-4", "START_VERIFY_PWD_RPC", "wallet_cn", "pluginNew");
        this.v.doRpc(str, str2, str3, this.isSimplePwd, this.predata, this.isIntelliDecision, new PwdCommonHandler.NotifyMspResultHandler() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordPluginWithoutUI.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler.NotifyMspResultHandler
            public void notifyResult(MICRpcResponse mICRpcResponse, String str4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("52319fdb", new Object[]{this, mICRpcResponse, str4});
                    return;
                }
                PasswordPluginWithoutUI passwordPluginWithoutUI = PasswordPluginWithoutUI.this;
                passwordPluginWithoutUI.predata = null;
                PasswordPluginWithoutUI.access$002(passwordPluginWithoutUI, mICRpcResponse);
                if (mICRpcResponse == null) {
                    VerifyLogCat.d("PasswordPluginWithoutUI", "input pwd null result");
                    PasswordPluginWithoutUI.this.onNetError();
                    return;
                }
                VerifyLogCat.d("Verifyidentity", "PasswordPluginWithoutUIdoRpc Result : " + JSON.toJSONString(mICRpcResponse));
                if (mICRpcResponse.finish) {
                    VerifyLogCat.d("Verifyidentity", "PasswordPluginWithoutUIresetPreOpenBio by finish");
                    BioPreOpenHelper.a();
                }
                if (mICRpcResponse.verifySuccess) {
                    PasswordPluginWithoutUI.access$100(PasswordPluginWithoutUI.this, mICRpcResponse);
                    PasswordPluginWithoutUI.access$200(PasswordPluginWithoutUI.this).doNextStep(mICRpcResponse, str4);
                    if (!TextUtils.isEmpty(str)) {
                        ProductDataHelper.getInstance().write("verify", "Y", true);
                    }
                    PasswordPluginWithoutUI.this.writeBehavorWithPlus("UC-MobileIC-20191030-2", "SUCCESS", "wallet_cn", "pluginNew");
                    return;
                }
                if (!TextUtils.isEmpty(str)) {
                    ProductDataHelper.getInstance().write("verify", "N");
                }
                PasswordPluginWithoutUI.this.updateVerifyStatusNew(BaseFBPlugin.VERIFY_STATUS.awaitUser);
                PasswordPluginWithoutUI.this.clearInputContent();
                PasswordPluginWithoutUI.access$400(PasswordPluginWithoutUI.this, PubKeyHelper.updateLocalPubKey(PasswordPluginWithoutUI.access$300(PasswordPluginWithoutUI.this), mICRpcResponse));
                PasswordPluginWithoutUI.access$500(PasswordPluginWithoutUI.this, PubKeyHelper.updateLocalPubKey(PasswordPluginWithoutUI.access$300(PasswordPluginWithoutUI.this), mICRpcResponse));
                if ("RETRY".equalsIgnoreCase(mICRpcResponse.verifyCode)) {
                    VerifyLogCat.d("PasswordPluginWithoutUI", "input pwd retry");
                    ProductDataHelper.getInstance().startRecord("pwd");
                    ProductDataHelper.getInstance().write("init", "Y");
                    PasswordPluginWithoutUI.access$600(PasswordPluginWithoutUI.this, mICRpcResponse);
                } else {
                    if (!TextUtils.isEmpty(str)) {
                        ProductDataHelper.getInstance().write(ProductDataHelper.KEY_LOCKED, "Y", true);
                    }
                    PasswordPluginWithoutUI.this.writePwdBehaviorLog("UC-MobileIC-20210326-3", "LOCK", "pay", "pluginNew");
                    PasswordPluginWithoutUI.access$700(PasswordPluginWithoutUI.this, mICRpcResponse);
                }
                PasswordPluginWithoutUI.this.writeBehavorWithPlus("UC-MobileIC-20191030-3", "FAIL", "wallet_cn", "pluginNew");
            }
        });
    }

    public void sendPwdVerifyResultEvent(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8e1e94", new Object[]{this, str, str2, str3});
        } else {
            sendPwdVerifyResultEvent(str, str2, str3, "", "", "", "", "", false);
        }
    }

    public void sendShowForgetPwdEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("798ee5c0", new Object[]{this, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mainText", (Object) str);
        doCommonAction(BaseFBPlugin.PLUGIN_ACTION.viShowForgetPwd, jSONObject);
    }

    public void sendUpdatePwdTipsEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21e08b1", new Object[]{this, str, str2});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) str);
        jSONObject.put("tips", (Object) str2);
        doCommonAction(BaseFBPlugin.PLUGIN_ACTION.viUpdatePwdTips, jSONObject);
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin, com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public boolean updateAttr(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a285a79", new Object[]{this, str, str2})).booleanValue();
        }
        a(str, str2);
        BaseFBPlugin baseFBPlugin = VIFBPluginManager.mBackPlugin;
        if (baseFBPlugin != null) {
            return baseFBPlugin.updateAttr(str, str2);
        }
        if (super.updateAttr(str, str2)) {
            return true;
        }
        return false;
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public boolean updateFunc(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9446144c", new Object[]{this, str, str2})).booleanValue();
        }
        return false;
    }

    public void writeBehavorWithPlus(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d003c84d", new Object[]{this, str, str2, str3, str4});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("module", this.mModule.getLogicModuleName());
            hashMap.put("code", str2);
            hashMap.put("source", str3);
            hashMap.put("ui_type", str4);
            if (!TextUtils.isEmpty(this.w)) {
                hashMap.put("plusPwdType", "pwd");
            } else {
                hashMap.put("plusPwdType", "plus_pwd");
            }
            VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, str, Constants.VI_ENGINE_APPID, "aavca", this.mModule.getToken(), this.mModule.getVerifyId(), null, hashMap);
        } catch (Throwable th) {
            VerifyLogCat.i("PasswordPluginWithoutUI", "writeBehavorWithPlus error:" + th.getMessage());
        }
    }

    public void writePwdBehaviorLog(String str, String str2, String str3, String str4, String str5, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2941dfe7", new Object[]{this, str, str2, str3, str4, str5, new Boolean(z)});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("code", str2);
            hashMap.put("source", str3);
            if (!TextUtils.isEmpty(str4)) {
                hashMap.put("from", str4);
            }
            if (!TextUtils.isEmpty(str5)) {
                hashMap.put("sourceToPwd", str5);
            }
            if (z) {
                hashMap.put("isNewMUI", "true");
            }
            InitDataModel initDataModel = this.u;
            if (initDataModel == null || TextUtils.isEmpty(initDataModel.decisionToPwd)) {
                hashMap.put("plusPwdType", "plus_pwd");
            } else {
                hashMap.put("plusPwdType", "pwd");
            }
            VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, str, Constants.VI_ENGINE_APPID, "aksbhas", this.mModule.getToken(), this.mModule.getVerifyId(), null, hashMap);
        } catch (Throwable th) {
            VerifyLogCat.e("PasswordPluginWithoutUI", th);
        }
    }

    public final boolean a(String str, String str2) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        if (TextUtils.equals(str, "src")) {
            try {
                jSONObject = JSON.parseObject(str2);
            } catch (Throwable th) {
                VerifyLogCat.e("PasswordPluginWithoutUI", "onPwdBNAction exp: ", th);
                jSONObject = null;
            }
            if (jSONObject != null && "pageEvent".equalsIgnoreCase(jSONObject.getString("action"))) {
                VerifyLogCat.i("PasswordPluginWithoutUI", "receive pageEvent");
                d(jSONObject);
            }
        }
        return false;
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin
    public void addPlugin(String str, String str2, ModuleDataModel moduleDataModel, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84995292", new Object[]{this, str, str2, moduleDataModel, bundle});
            return;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("needFindExist", true);
        super.addPlugin(str, str2, moduleDataModel, bundle);
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if ("Y".equalsIgnoreCase(getOtherPayConfig()) || this.v.getOtherVerifyPayFlag(this.t)) {
            ProductDataHelper.getInstance().write(ProductDataHelper.KEY_CLICK_FORGET, "Y");
            sendMspRpc(null, "Y", "forgotPwd");
            MicroModule microModule = this.mModule;
            if (microModule != null) {
                microModule.isFindAndPay = true;
                VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, "UC-MobileIC-190311-1", Constants.VI_ENGINE_APPID, "aprj", microModule.getToken(), this.mModule.getVerifyId(), null, null);
            }
        } else {
            ProductDataHelper.getInstance().write(ProductDataHelper.KEY_CLICK_FORGET, "Y");
            this.v.goGetMspPPW(getActConf(BaseFBPlugin.ACT_CONF.login_id));
            LocalBroadcastManager.getInstance(MicroModuleContext.getInstance().getContext()).sendBroadcast(new Intent("kMQPFindPwdNotification"));
            updateVerifyStatusFotQuit(BaseFBPlugin.VERIFY_STATUS.abort, "forgetPwd");
            this.v.notifyCancel();
        }
    }

    public void sendPwdVerifyResultEvent(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa11d60e", new Object[]{this, str, str2, str3, str4, str5, str6, str7, str8, new Boolean(z)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ModuleConstants.VI_TASK_VERIFYCODE, (Object) str);
        jSONObject.put("verifyMessage", (Object) str2);
        jSONObject.put("data", (Object) str3);
        jSONObject.put("alertText", (Object) str4);
        jSONObject.put("positiveText", (Object) str5);
        jSONObject.put("positiveAction", (Object) str6);
        jSONObject.put("negativeText", (Object) str7);
        jSONObject.put("negativeAction", (Object) str8);
        jSONObject.put("isNewDialogFlag", (Object) Boolean.valueOf(z));
        VerifyLogCat.i("PasswordPluginWithoutUI", "sendPwdVerifyResultEvent jsonObject = " + jSONObject);
        doCommonAction(BaseFBPlugin.PLUGIN_ACTION.viPwdVerifyResult, jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void access$700(com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordPluginWithoutUI r11, com.alipay.mobileic.core.model.rpc.MICRpcResponse r12) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordPluginWithoutUI.access$700(com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordPluginWithoutUI, com.alipay.mobileic.core.model.rpc.MICRpcResponse):void");
    }

    public final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        VerifyLogCat.i("PasswordPluginWithoutUI", "initOtherProduct product: " + str);
        if (!TextUtils.isEmpty(str)) {
            this.isIntelliDecision = false;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("actionText", (Object) str);
            jSONObject.put("callBackType", "1");
            jSONObject.put("hideIfClick", (Object) Boolean.TRUE);
            doCommonAction(BaseFBPlugin.PLUGIN_ACTION.viShowNavRightView, jSONObject);
        } else if (!TextUtils.isEmpty(this.top_to_product)) {
            this.isIntelliDecision = true;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("actionText", (Object) this.top_to_product);
            jSONObject2.put("viType", (Object) this.backToBioViType);
            jSONObject2.put("callBackType", "1");
            jSONObject2.put("hideIfClick", (Object) Boolean.TRUE);
            doCommonAction(BaseFBPlugin.PLUGIN_ACTION.viShowNavRightView, jSONObject2);
        }
    }

    public boolean isStateSecretPassword() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77870e5d", new Object[]{this})).booleanValue();
        }
        return PayPwdModule.STATE_SECRET_FLAG.equalsIgnoreCase(this.mStateSecret);
    }

    public boolean showFindPwdByResponse(MICRpcResponse mICRpcResponse, HashMap<String, String> hashMap) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cba25bdf", new Object[]{this, mICRpcResponse, hashMap})).booleanValue();
        }
        if (mICRpcResponse == null || TextUtils.isEmpty(mICRpcResponse.data)) {
            return false;
        }
        try {
            jSONObject = JSON.parseObject(mICRpcResponse.data);
        } catch (JSONException e) {
            VerifyLogCat.e("PasswordPluginWithoutUI", "json fail " + mICRpcResponse.data, e);
            jSONObject = null;
        }
        if (jSONObject == null) {
            return false;
        }
        String string = jSONObject.getString(PayPwdModule.SHOW_FIND_PWD);
        if (hashMap != null) {
            hashMap.put(PayPwdModule.FIND_PWD_TXT, jSONObject.getString(PayPwdModule.FIND_PWD_TXT));
        }
        VerifyLogCat.i("PasswordPluginWithoutUI", "showFindPwd: " + string);
        return TextUtils.isEmpty(string) || "Y".equalsIgnoreCase(string);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(com.alibaba.fastjson.JSONObject r22) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordPluginWithoutUI.d(com.alibaba.fastjson.JSONObject):boolean");
    }

    public void writePwdBehaviorLog(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcc97583", new Object[]{this, str, str2, str3, str4});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("module", this.mModule.getLogicModuleName());
        hashMap.put("code", str2);
        hashMap.put("source", str3);
        hashMap.put("ui_type", str4);
        VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, str, Constants.VI_ENGINE_APPID, "aavca", this.mModule.getToken(), this.mModule.getVerifyId(), null, hashMap);
    }
}
