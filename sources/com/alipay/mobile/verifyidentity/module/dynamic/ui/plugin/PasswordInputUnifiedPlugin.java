package com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.safepaybase.util.ResUtils;
import com.alipay.android.app.template.FBFocusable;
import com.alipay.android.app.template.FBPluginCtx;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.birdnest.util.UiUtil;
import com.alipay.mobile.common.transport.monitor.NetworkServiceTracer;
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
import com.alipay.mobile.verifyidentity.module.password.pay.model.VerifyRequestModel;
import com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity;
import com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler;
import com.alipay.mobile.verifyidentity.rpc.RpcException;
import com.alipay.mobile.verifyidentity.safepaybase.EncryptRandomType;
import com.alipay.mobile.verifyidentity.safepaybase.OnConfirmListener;
import com.alipay.mobile.verifyidentity.safepaybase.SafeInputContext;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.VIFBPluginManager;
import com.alipay.mobile.verifyidentity.utils.VIUtils;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.alipay.mobileic.core.model.rpc.MICRpcRequest;
import com.alipay.mobileic.core.model.rpc.MICRpcResponse;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.weex.common.Constants;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class PasswordInputUnifiedPlugin extends BaseFBPlugin implements View.OnClickListener, View.OnFocusChangeListener, FBFocusable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f4315a = "PasswordInputUnifiedPlugin";
    private Context b;
    private FBPluginCtx c;
    private int d;
    private InitDataModel e;
    private PwdCommonHandler f;
    public BroadcastReceiver findPwdBroadcastReceiver;
    private View i;
    private View j;
    private EditText k;
    public String mPubKey;
    public LinearLayout mPwdInputLayout;
    public SafeInputContext mSafeInputContext;
    public BroadcastReceiver pageChangeBroadcastReceiver;
    public String mTimestamp = "";
    public boolean isShowGetBackPwd = false;
    public boolean isSimplePwd = true;
    private AtomicBoolean g = new AtomicBoolean(true);
    private boolean h = true;
    private String l = UiUtil.INPUT_TYPE_VALUE_PAYSPWD;
    private boolean m = false;
    private String n = "";
    private boolean o = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class DecorViewInfo {
        public View decorView;
        public boolean isDialog;

        public DecorViewInfo() {
        }
    }

    public PasswordInputUnifiedPlugin(Context context, FBPluginCtx fBPluginCtx, int i) {
        super(context, fBPluginCtx);
        this.b = context;
        this.c = fBPluginCtx;
        this.d = i;
        VerifyLogCat.i(f4315a, "pwd plugin create");
    }

    private void a(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        InitDataModel initDataModel = this.e;
        if (initDataModel == null || !ModuleConstants.VI_MODULE_NAME_PAYMENT_PASSWORD_PLUS.equalsIgnoreCase(initDataModel.sourceToPwd)) {
            str = "pwd";
        } else {
            str = "pwd_plus";
        }
        writePwdBehavorLog("UC-MobileIC-20191030-1", "START_PWD_VIEW", "wallet_cn", "pay", str, z);
    }

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return f4315a;
    }

    public static /* synthetic */ boolean access$100(PasswordInputUnifiedPlugin passwordInputUnifiedPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7baee723", new Object[]{passwordInputUnifiedPlugin})).booleanValue();
        }
        return passwordInputUnifiedPlugin.h;
    }

    public static /* synthetic */ Handler access$1000(PasswordInputUnifiedPlugin passwordInputUnifiedPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("84da9f19", new Object[]{passwordInputUnifiedPlugin});
        }
        return passwordInputUnifiedPlugin.mainHandler;
    }

    public static /* synthetic */ PwdCommonHandler access$1100(PasswordInputUnifiedPlugin passwordInputUnifiedPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PwdCommonHandler) ipChange.ipc$dispatch("105126c5", new Object[]{passwordInputUnifiedPlugin});
        }
        return passwordInputUnifiedPlugin.f;
    }

    public static /* synthetic */ MicroModule access$1200(PasswordInputUnifiedPlugin passwordInputUnifiedPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("24e141d1", new Object[]{passwordInputUnifiedPlugin});
        }
        return passwordInputUnifiedPlugin.mModule;
    }

    public static /* synthetic */ MicroModule access$1300(PasswordInputUnifiedPlugin passwordInputUnifiedPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("5d6a0fd2", new Object[]{passwordInputUnifiedPlugin});
        }
        return passwordInputUnifiedPlugin.mModule;
    }

    public static /* synthetic */ View access$1400(PasswordInputUnifiedPlugin passwordInputUnifiedPlugin, View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9073b093", new Object[]{passwordInputUnifiedPlugin, view, view2});
        }
        return passwordInputUnifiedPlugin.a(view, view2);
    }

    public static /* synthetic */ EditText access$1500(PasswordInputUnifiedPlugin passwordInputUnifiedPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditText) ipChange.ipc$dispatch("3361e341", new Object[]{passwordInputUnifiedPlugin});
        }
        return passwordInputUnifiedPlugin.k;
    }

    public static /* synthetic */ String access$1600(PasswordInputUnifiedPlugin passwordInputUnifiedPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bfb95f6d", new Object[]{passwordInputUnifiedPlugin});
        }
        return passwordInputUnifiedPlugin.l;
    }

    public static /* synthetic */ FBPluginCtx access$1700(PasswordInputUnifiedPlugin passwordInputUnifiedPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBPluginCtx) ipChange.ipc$dispatch("fc1fda5d", new Object[]{passwordInputUnifiedPlugin});
        }
        return passwordInputUnifiedPlugin.c;
    }

    public static /* synthetic */ AtomicBoolean access$1800(PasswordInputUnifiedPlugin passwordInputUnifiedPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("5f6d3195", new Object[]{passwordInputUnifiedPlugin});
        }
        return passwordInputUnifiedPlugin.g;
    }

    public static /* synthetic */ MicroModule access$1900(PasswordInputUnifiedPlugin passwordInputUnifiedPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("b09ee3d8", new Object[]{passwordInputUnifiedPlugin});
        }
        return passwordInputUnifiedPlugin.mModule;
    }

    public static /* synthetic */ void access$200(PasswordInputUnifiedPlugin passwordInputUnifiedPlugin, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1fc28b4", new Object[]{passwordInputUnifiedPlugin, str, str2});
        } else {
            passwordInputUnifiedPlugin.viNativeExecuteJs(str, str2);
        }
    }

    public static /* synthetic */ MicroModule access$2000(PasswordInputUnifiedPlugin passwordInputUnifiedPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("8c6097ee", new Object[]{passwordInputUnifiedPlugin});
        }
        return passwordInputUnifiedPlugin.mModule;
    }

    public static /* synthetic */ MicroModule access$2100(PasswordInputUnifiedPlugin passwordInputUnifiedPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("c4e965ef", new Object[]{passwordInputUnifiedPlugin});
        }
        return passwordInputUnifiedPlugin.mModule;
    }

    public static /* synthetic */ void access$300(PasswordInputUnifiedPlugin passwordInputUnifiedPlugin, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5bb18b5", new Object[]{passwordInputUnifiedPlugin, str, str2});
        } else {
            passwordInputUnifiedPlugin.viNativeExecuteJs(str, str2);
        }
    }

    public static /* synthetic */ MicroModule access$400(PasswordInputUnifiedPlugin passwordInputUnifiedPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("5c7b4f64", new Object[]{passwordInputUnifiedPlugin});
        }
        return passwordInputUnifiedPlugin.mModule;
    }

    public static /* synthetic */ MicroModule access$500(PasswordInputUnifiedPlugin passwordInputUnifiedPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("95041d65", new Object[]{passwordInputUnifiedPlugin});
        }
        return passwordInputUnifiedPlugin.mModule;
    }

    public static /* synthetic */ MicroModule access$600(PasswordInputUnifiedPlugin passwordInputUnifiedPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("cd8ceb66", new Object[]{passwordInputUnifiedPlugin});
        }
        return passwordInputUnifiedPlugin.mModule;
    }

    public static /* synthetic */ MicroModule access$700(PasswordInputUnifiedPlugin passwordInputUnifiedPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("615b967", new Object[]{passwordInputUnifiedPlugin});
        }
        return passwordInputUnifiedPlugin.mModule;
    }

    public static /* synthetic */ InitDataModel access$800(PasswordInputUnifiedPlugin passwordInputUnifiedPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InitDataModel) ipChange.ipc$dispatch("e4d7f430", new Object[]{passwordInputUnifiedPlugin});
        }
        return passwordInputUnifiedPlugin.e;
    }

    public static /* synthetic */ void access$900(PasswordInputUnifiedPlugin passwordInputUnifiedPlugin, MICRpcResponse mICRpcResponse, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("832abf41", new Object[]{passwordInputUnifiedPlugin, mICRpcResponse, str});
        } else if (mICRpcResponse == null) {
            VerifyLogCat.d(f4315a, "input pwd null result");
            passwordInputUnifiedPlugin.onNetError();
        } else if (mICRpcResponse.verifySuccess) {
            passwordInputUnifiedPlugin.f.doNextStep(mICRpcResponse, str);
            passwordInputUnifiedPlugin.writePwdBehavorLog("UC-MobileIC-20191030-2", "SUCCESS", "wallet_cn");
        } else {
            passwordInputUnifiedPlugin.updateVerifyStatus(BaseFBPlugin.VERIFY_STATUS.awaitUser);
            passwordInputUnifiedPlugin.clearInputContent();
            passwordInputUnifiedPlugin.a(PubKeyHelper.updateLocalPubKey(passwordInputUnifiedPlugin.b, mICRpcResponse));
            if ("RETRY".equalsIgnoreCase(mICRpcResponse.verifyCode)) {
                VerifyLogCat.d(f4315a, "input pwd retry");
                passwordInputUnifiedPlugin.onPwdError(mICRpcResponse);
            } else {
                passwordInputUnifiedPlugin.f.processError(mICRpcResponse);
            }
            passwordInputUnifiedPlugin.writePwdBehavorLog("UC-MobileIC-20191030-3", "FAIL", "wallet_cn");
        }
    }

    private DecorViewInfo b() {
        View view;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DecorViewInfo) ipChange.ipc$dispatch("547bedc0", new Object[]{this});
        }
        DecorViewInfo decorViewInfo = new DecorViewInfo();
        if (this.c.getShowingDialog() != null && this.c.getShowingDialog().isShowing()) {
            z = true;
        }
        if (!z) {
            view = ((Activity) this.b).getWindow().getDecorView();
        } else {
            view = this.c.getShowingDialog().getWindow().getDecorView();
        }
        decorViewInfo.decorView = view;
        decorViewInfo.isDialog = z;
        return decorViewInfo;
    }

    public static /* synthetic */ Object ipc$super(PasswordInputUnifiedPlugin passwordInputUnifiedPlugin, String str, Object... objArr) {
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alipay/mobile/verifyidentity/module/dynamic/ui/plugin/PasswordInputUnifiedPlugin");
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin
    public void bindModule(MicroModule microModule, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c61b9cc", new Object[]{this, microModule, str});
            return;
        }
        this.mModule = microModule;
        this.moduleData = str;
        try {
            this.e = (InitDataModel) JSON.parseObject(str, InitDataModel.class);
        } catch (JSONException e) {
            String str2 = f4315a;
            VerifyLogCat.e(str2, "json fail " + str, e);
        }
        if (this.e == null) {
            String str3 = f4315a;
            VerifyLogCat.d(str3, "module data can't be converted to jsonobject: " + str);
            MicroModuleContext.getInstance().alert("", this.b.getResources().getString(R.string.verifyidentity_wrong_data), this.b.getResources().getString(R.string.verifyidentity_confirm), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordInputUnifiedPlugin.15
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    } else {
                        PasswordInputUnifiedPlugin.this.updateVerifyStatus(BaseFBPlugin.VERIFY_STATUS.abort);
                    }
                }
            }, null, null);
            return;
        }
        VerifyLogCat.i("DST", "create plugin");
        InitDataModel initDataModel = this.e;
        this.isSimplePwd = initDataModel.isSimplePPW;
        this.mPubKey = PubKeyHelper.generatePubKey(this.b, initDataModel.pubKey);
        this.mTimestamp = this.e.timestamp;
        this.f = new PwdCommonHandler(this.b, this.mModule, this, new PwdCommonHandler.NotifyResultHandler() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordInputUnifiedPlugin.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler.NotifyResultHandler
            public void notifyResult(ModuleExecuteResult moduleExecuteResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("75cfa791", new Object[]{this, moduleExecuteResult});
                    return;
                }
                PasswordInputUnifiedPlugin.access$1800(PasswordInputUnifiedPlugin.this).set(true);
                PasswordInputUnifiedPlugin.this.notifyResult(moduleExecuteResult);
            }
        });
        String actConf = getActConf(BaseFBPlugin.ACT_CONF.supportVersion);
        if (TextUtils.isEmpty(actConf) || !"2.0".equalsIgnoreCase(actConf)) {
            String str4 = "";
            if (TextUtils.isEmpty(this.mTimestamp)) {
                this.mTimestamp = str4;
            }
            this.isShowGetBackPwd = this.e.isFindPPW;
            String str5 = f4315a;
            VerifyLogCat.i(str5, "initSixPwd: " + this.isSimplePwd);
            if (this.isSimplePwd) {
                this.viType = "spwd";
                this.l = UiUtil.INPUT_TYPE_VALUE_PAYSPWD;
            } else {
                this.viType = "pwd";
                this.l = UiUtil.INPUT_TYPE_VALUE_PAYPWD;
            }
            initPwdInput();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", "start");
            String str6 = this.e.pwdTopTip;
            String actConf2 = getActConf(BaseFBPlugin.ACT_CONF.pwdInputTip);
            String actConf3 = getActConf(BaseFBPlugin.ACT_CONF.costTip);
            if (!TextUtils.isEmpty(str6)) {
                str4 = str6;
            } else if (!TextUtils.isEmpty(actConf2)) {
                str4 = actConf2;
            } else if (!TextUtils.isEmpty(actConf3)) {
                str4 = actConf3;
            }
            jSONObject.put("tip", (Object) str4);
            updateVerifyStatus(jSONObject);
            this.f.sourceToPwd = this.e.sourceToPwd;
            VerifyLogCat.i(str5, "mView.getVisibility(): " + this.i.getVisibility());
            this.mainHandler.postDelayed(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordInputUnifiedPlugin.12
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        PasswordInputUnifiedPlugin.access$1500(PasswordInputUnifiedPlugin.this).requestFocus();
                        PasswordInputUnifiedPlugin.this.showKeyboard();
                    } catch (Throwable th) {
                        VerifyLogCat.w(PasswordInputUnifiedPlugin.access$000(), th);
                    }
                }
            }, 500L);
            a(false);
        } else if (this.g.get()) {
            this.o = true;
            boolean contains = str.contains(PayPwdModule.HAS_FORGOT_PWD);
            this.g.set(false);
            Bundle bundle = new Bundle();
            bundle.putBoolean("isSimplePwd", this.e.isSimplePPW);
            bundle.putString("pubKey", this.e.pubKey);
            bundle.putString("timestamp", this.e.timestamp);
            bundle.putString("title", this.e.keyHeadline);
            bundle.putString("subtitle", this.e.bodyContent);
            bundle.putString("footRemark", this.e.keyFootRemark);
            bundle.putString("loadingTip", this.e.loadingTip);
            bundle.putBoolean("hasOthers", VIUtils.hasOtherVerifyProduct(str));
            bundle.putString("username", this.e.logonId);
            bundle.putString("refer", this.e.refer);
            bundle.putString("predata", this.e.predata);
            bundle.putBoolean("isFindPPW", this.e.isFindPPW);
            bundle.putString("sourceToPwd", this.e.sourceToPwd);
            bundle.putBoolean("havePpw", this.e.isExistPPW);
            bundle.putString("addPpwUrl", this.e.completePPWUrl);
            bundle.putString("addPPWText", this.e.completePPWGuideText);
            bundle.putString("pwd_action", this.e.action);
            bundle.putString("pwd_PASS", this.e.PASS);
            bundle.putString("pwd_other", this.e.other);
            bundle.putString("pwdTopTip", this.e.pwdTopTip);
            bundle.putString("sceneId", this.e.sceneId);
            bundle.putBoolean("uninterrupt", this.e.uninterrupt);
            bundle.putBoolean("resetPwd", this.e.resetPwd);
            bundle.putString("switchOther", this.e.switchOther);
            bundle.putBoolean(PayPwdModule.PWD_CONTAINS_GORGET_PWD, contains);
            bundle.putBoolean(PayPwdModule.PWD_FROM_MSP, true);
            bundle.putBoolean(PayPwdModule.HAS_FORGOT_PWD, this.e.has_forgot_pwd);
            bundle.putString(PayPwdModule.PWD_INPUT_TIP, a());
            bundle.putString(PayPwdModule.PWD_HIND_OTHER, getActConf(BaseFBPlugin.ACT_CONF.kVIDisableForgetPwdKey));
            bundle.putBoolean(PayPwdModule.PWD_USE_DIALOG_PWD, this.e.useDialogPwd);
            bundle.putString(PayPwdModule.PWD_MSP_FORGET_TIP, this.e.forgot2Verify);
            bundle.putString(PayPwdModule.PWD_MSP_FORGET_TO_VERIFY, this.e.forgot2VerifyText);
            bundle.putString("decisionToPwd", this.e.decisionToPwd);
            bundle.putString("decisionToPwd_action", this.e.decisionToPwd_action);
            bundle.putString(PayPwdModule.SHOW_FIND_PWD, this.e.showFindPwd);
            bundle.putString(PayPwdModule.FIND_PWD_TXT, this.e.findPwdTxt);
            bundle.putString("htip", this.e.hideDecisionTip);
            if (this.e.decisionToPwdFromUsePwd) {
                bundle.putString("htip", "Y");
            }
            if (this.isSimplePwd) {
                this.viType = "spwd";
            } else {
                this.viType = "pwd";
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("status", "start");
            jSONObject2.put("tip", (Object) a());
            updateVerifyStatusNew(jSONObject2);
            PayPwdDialogActivity.addPwdHandler(this.verifyId, this.f);
            Intent intent = new Intent(this.b, PayPwdDialogActivity.class);
            intent.putExtras(bundle);
            MicroModuleContext.getInstance().setStartActivityMonitor();
            MicroModuleContext.getInstance().startActivityForMsp(this.mModule, intent);
            a(true);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        }
    }

    public void clearInputContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad0002c3", new Object[]{this});
            return;
        }
        SafeInputContext safeInputContext = this.mSafeInputContext;
        if (safeInputContext != null) {
            safeInputContext.clearText();
        }
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public View createView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        View inflate = ((LayoutInflater) this.b.getSystemService("layout_inflater")).inflate(R.layout.bf_plugin_vi_password, (ViewGroup) null);
        this.i = inflate;
        forbidDark(inflate);
        initPwdInput();
        this.pageChangeBroadcastReceiver = new BroadcastReceiver() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordInputUnifiedPlugin.13
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass13 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/module/dynamic/ui/plugin/PasswordInputUnifiedPlugin$13");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                    return;
                }
                VerifyLogCat.i(PasswordInputUnifiedPlugin.access$000(), "收到广播：com.alipay.phonecashier.framechange");
                if (!PasswordInputUnifiedPlugin.access$100(PasswordInputUnifiedPlugin.this)) {
                    PasswordInputUnifiedPlugin.this.getInnerView().setEnabled(false);
                }
            }
        };
        this.findPwdBroadcastReceiver = new BroadcastReceiver() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordInputUnifiedPlugin.14
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass14 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/module/dynamic/ui/plugin/PasswordInputUnifiedPlugin$14");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                    return;
                }
                VerifyLogCat.i(PasswordInputUnifiedPlugin.access$000(), "收到广播：kMQPFindPwdNotification | 收银台场景用户点找回密码");
                if (PasswordInputUnifiedPlugin.access$1900(PasswordInputUnifiedPlugin.this) != null && PasswordInputUnifiedPlugin.access$2000(PasswordInputUnifiedPlugin.this).getTask() != null) {
                    VerifyIdentityTask task = PasswordInputUnifiedPlugin.access$2100(PasswordInputUnifiedPlugin.this).getTask();
                    Bundle extParams = task.getExtParams();
                    if (extParams == null) {
                        task.setExtParams(new Bundle());
                        extParams = task.getExtParams();
                    }
                    extParams.putString("subCode", "105");
                }
            }
        };
        LocalBroadcastManager instance = LocalBroadcastManager.getInstance(this.b);
        instance.registerReceiver(this.pageChangeBroadcastReceiver, new IntentFilter(MspGlobalDefine.FRAME_CHANGE_ACTION));
        instance.registerReceiver(this.findPwdBroadcastReceiver, new IntentFilter("kMQPFindPwdNotification"));
        try {
            Intent intent = new Intent("com.alipay.mobile.verifyidentity.startPwd");
            intent.putExtra(Constants.VI_ENGINE_VERIFY_TYPE, "password");
            LocalBroadcastManager.getInstance(this.b).sendBroadcast(intent);
        } catch (Throwable th) {
            String str = f4315a;
            VerifyLogCat.i(str, "sendPopBroadCast error:" + th.getMessage());
        }
        return this.i;
    }

    public void doRpc(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5116406b", new Object[]{this, str});
            return;
        }
        if (ModuleConstants.VI_MODULE_NAME_PAYMENT_PASSWORD_PLUS.equalsIgnoreCase(this.e.sourceToPwd)) {
            str2 = "pwd_plus";
        } else {
            str2 = "pwd";
        }
        writePwdBehavorLog("UC-MobileIC-20190606-4", "START_VERIFY_PWD_RPC", "wallet_cn", "pay", str2, false);
        doRpc(str, null, "");
    }

    public float getBodyViewOpacity() {
        Object bodyView = this.c.getBodyView();
        if (bodyView == null) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(bodyView.getClass().getMethod("getOpacity", new Class[0]).invoke(bodyView, new Object[0]).toString());
        } catch (Throwable th) {
            VerifyLogCat.w(f4315a, th);
            return 1.0f;
        }
    }

    public int getBusinessId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("544634eb", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public View getInnerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3a4c32ae", new Object[]{this});
        }
        return this.i;
    }

    public View getKeyboardParentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3e8befb5", new Object[]{this});
        }
        return this.j;
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin
    public String getPluginName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd12a725", new Object[]{this});
        }
        return getClass().getSimpleName();
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin
    public void handleEngineCancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b64b42b", new Object[]{this});
            return;
        }
        VerifyLogCat.i(f4315a, "pwd plugin cancel");
        if (!this.o) {
            updateVerifyStatus(BaseFBPlugin.VERIFY_STATUS.abort);
        } else if (openDuplicatePayTaskFix()) {
            updateVerifyStatusFotQuit(BaseFBPlugin.VERIFY_STATUS.abort, BaseFBPlugin.ABORT_SCENE_CANCEL_BY_ENGINE);
        } else {
            updateVerifyStatusNew(BaseFBPlugin.VERIFY_STATUS.abort);
        }
    }

    public boolean hiddenKeyboardService(View view, boolean z) {
        boolean z2;
        boolean z3 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f78fdd11", new Object[]{this, view, new Boolean(z)})).booleanValue();
        }
        if (isDefaultKeyboard() || this.c.getDefaultKeyboardService() == null) {
            z2 = false;
        } else {
            z2 = this.c.getTemplateKeyboardService().hideKeyboard(view);
        }
        if (!z || this.c.getDefaultKeyboardService() == null) {
            return z2;
        }
        if (!z2 && !this.c.getDefaultKeyboardService().hideKeyboard(view)) {
            z3 = false;
        }
        return z3;
    }

    public void hideKeyboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c20b50", new Object[]{this});
        } else {
            hiddenKeyboardService(b().decorView, true);
        }
    }

    public boolean isDefaultKeyboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87984449", new Object[]{this})).booleanValue();
        }
        if (this.c.getTemplateKeyboardService() == null || this.c.getDefaultKeyboardService().equals(this.c.getTemplateKeyboardService())) {
            return true;
        }
        return false;
    }

    public void notifyResult(ModuleExecuteResult moduleExecuteResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75cfa791", new Object[]{this, moduleExecuteResult});
            return;
        }
        ModuleExecuteResult addLogicModuleName = this.f.addLogicModuleName(moduleExecuteResult);
        onVerifyFinished(addLogicModuleName);
        this.mModule.getMicroModuleContext().notifyAndFinishModule(this.mModule.getVerifyId(), this.mModule.getToken(), this.mModule.getModuleName(), addLogicModuleName);
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin, android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        try {
            showKeyboard();
        } catch (Exception e) {
            VerifyLogCat.printStackTraceAndMore(e);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin, android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1621df92", new Object[]{this, view, new Boolean(z)});
        } else if (this.c != null && this.b != null && getBodyViewOpacity() > 0.1d && this.c.isOnloadFinish()) {
            if (z && view.isEnabled()) {
                if (TextUtils.equals(this.l, UiUtil.INPUT_TYPE_VALUE_PAYSPWD)) {
                    EditText editText = this.k;
                    editText.setSelection(editText.getEditableText().length());
                }
                if (this.c != null && !UiUtil.isUseDefaultKeyboard(this.l, this.n) && !isDefaultKeyboard()) {
                    this.c.getTemplateKeyboardService().hideKeyboard(b().decorView);
                }
                showKeyboard();
            }
            if (z) {
                this.c.deliverOnFocus(getNode());
            } else {
                this.c.deliverOnBlur(getNode());
            }
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
        doRpc(null, "Y", "forgotPwd");
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
        if (TextUtils.isEmpty(this.l)) {
            this.k.setSingleLine();
            this.k.setHorizontallyScrolling(true);
            setSafeKeyboardSoftInput(this.k);
            this.k.setOnFocusChangeListener(this);
            this.k.setOnClickListener(this);
        }
        if (this.m) {
            this.c.setAutoFocus(this);
            View view = (View) this.k.getParent();
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
        }
        Editable editableText = this.k.getEditableText();
        if (editableText != null) {
            String obj = editableText.toString();
            if (!TextUtils.isEmpty(obj)) {
                this.k.setSelection(obj.length());
            }
        }
        return false;
    }

    public void onNetError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be1d94f1", new Object[]{this});
            return;
        }
        if (this.isSimplePwd) {
            clearInputContent();
        }
        showKeyboard();
    }

    public void onPwdError(MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b0a14cd", new Object[]{this, mICRpcResponse});
            return;
        }
        DialogInterface.OnClickListener onClickListener = null;
        String string = !this.isShowGetBackPwd ? null : this.b.getResources().getString(R.string.pwd_forget);
        if (this.isShowGetBackPwd) {
            onClickListener = new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordInputUnifiedPlugin.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    PasswordInputUnifiedPlugin.access$1100(PasswordInputUnifiedPlugin.this).goGetBackPPW();
                    PasswordInputUnifiedPlugin.access$1100(PasswordInputUnifiedPlugin.this).notifyCancel();
                    PasswordInputUnifiedPlugin.access$1100(PasswordInputUnifiedPlugin.this).writePWDErrorBehavorLog("RETRY", "0");
                }
            };
        }
        if (this.f.getOtherVerifyPayFlag(mICRpcResponse)) {
            VerifyLogCat.d(f4315a, "show others' way");
            string = this.f.getOtherVerifyPayText();
            onClickListener = new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordInputUnifiedPlugin.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    PasswordInputUnifiedPlugin.this.hideKeyboard();
                    PasswordInputUnifiedPlugin.this.doRpc(null, "Y", "");
                    VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, "UC-MobileIC-180927-01", Constants.VI_ENGINE_APPID, "zthlio", PasswordInputUnifiedPlugin.access$1200(PasswordInputUnifiedPlugin.this).getToken(), PasswordInputUnifiedPlugin.access$1300(PasswordInputUnifiedPlugin.this).getVerifyId(), null, null);
                }
            };
        }
        MicroModuleContext.getInstance().alert(null, mICRpcResponse.verifyMessage, string, onClickListener, this.b.getResources().getString(R.string.pwd_input_again), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordInputUnifiedPlugin.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    return;
                }
                PasswordInputUnifiedPlugin.this.showKeyboard();
                PasswordInputUnifiedPlugin.access$1100(PasswordInputUnifiedPlugin.this).writePWDErrorBehavorLog("RETRY", "1");
            }
        });
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin, com.alipay.android.app.template.FBFocusable
    public void requestFocus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10da4b90", new Object[]{this});
            return;
        }
        View view = this.i;
        if (view != null) {
            view.requestFocus();
            try {
                showKeyboard();
            } catch (Throwable th) {
                VerifyLogCat.printStackTraceAndMore(th);
            }
        }
    }

    public void setKeyboardParentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38714033", new Object[]{this, view});
        } else {
            this.j = view;
        }
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public boolean updateFunc(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9446144c", new Object[]{this, str, str2})).booleanValue();
        }
        if (str.equals(Constants.Event.FOCUS)) {
            this.m = true;
            this.c.setAutoFocus(this);
            if (this.c.isOnloadFinish()) {
                this.k.requestFocus();
                showKeyboard();
            }
            return true;
        } else if (!str.equals(Constants.Event.BLUR)) {
            return false;
        } else {
            this.m = false;
            hiddenKeyboardService(b().decorView, true);
            return true;
        }
    }

    public void writePWDSwitchLog(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ae88ad7", new Object[]{this, str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("pwdType", str2);
        hashMap.put("pwdSwitch", str2);
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("rsaResult", str3);
        }
        VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, str, com.alipay.mobile.verifyidentity.common.Constants.VI_ENGINE_APPID, "aavca", "", "", null, hashMap);
    }

    public void writePwdBehavorLog(String str, String str2, String str3, String str4, String str5, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d952af6", new Object[]{this, str, str2, str3, str4, str5, new Boolean(z)});
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
            InitDataModel initDataModel = this.e;
            if (initDataModel == null || TextUtils.isEmpty(initDataModel.decisionToPwd)) {
                hashMap.put("plusPwdType", "plus_pwd");
            } else {
                hashMap.put("plusPwdType", "pwd");
            }
            VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, str, com.alipay.mobile.verifyidentity.common.Constants.VI_ENGINE_APPID, "aksbhas", this.mModule.getToken(), this.mModule.getVerifyId(), null, hashMap);
        } catch (Throwable th) {
            VerifyLogCat.e(f4315a, th);
        }
    }

    public void initPwdInput() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c01349c4", new Object[]{this});
            return;
        }
        String str = f4315a;
        VerifyLogCat.i(str, "[initPwdInput] isSimplePwd: " + this.isSimplePwd + ", mType: " + this.l);
        this.mPwdInputLayout = (LinearLayout) this.i.findViewById(R.id.paypwd_layout);
        VerifyLogCat.i(str, "VISafeInput useNewSafePayBase always new");
        SafeInputContext safeInputContext = new SafeInputContext((Activity) this.b, this.isSimplePwd);
        this.mSafeInputContext = safeInputContext;
        safeInputContext.setOnConfirmListener(new OnConfirmListener() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordInputUnifiedPlugin.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.safepaybase.OnConfirmListener
            public void onUserConfirm(String str2) {
                int i = 0;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d51cf727", new Object[]{this, str2});
                    return;
                }
                VerifyLogCat.i(PasswordInputUnifiedPlugin.access$000(), "safeInputContext onUserConfirm");
                PasswordInputUnifiedPlugin.this.hideKeyboard();
                if (PasswordInputUnifiedPlugin.access$100(PasswordInputUnifiedPlugin.this)) {
                    PasswordInputUnifiedPlugin.access$200(PasswordInputUnifiedPlugin.this, "onPwdConfirmed", str2);
                } else {
                    PasswordInputUnifiedPlugin.this.updateVerifyStatus("end");
                    PasswordInputUnifiedPlugin.this.doRpc(str2);
                }
                PasswordInputUnifiedPlugin.this.writePWDSwitchLog("UC-MobileIC-220722-01", "1", "");
                PasswordInputUnifiedPlugin passwordInputUnifiedPlugin = PasswordInputUnifiedPlugin.this;
                if (!TextUtils.isEmpty(str2)) {
                    i = str2.length();
                }
                passwordInputUnifiedPlugin.writePWDSwitchLog("UC-MobileIC-220722-02", "1", String.valueOf(i));
            }
        });
        this.mSafeInputContext.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordInputUnifiedPlugin.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1621df92", new Object[]{this, view, new Boolean(z)});
                    return;
                }
                String access$000 = PasswordInputUnifiedPlugin.access$000();
                VerifyLogCat.i(access$000, "safeInputContext onFocusChange: " + z);
                PasswordInputUnifiedPlugin.this.onFocusChange(view, z);
            }
        });
        this.mSafeInputContext.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordInputUnifiedPlugin.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                VerifyLogCat.i(PasswordInputUnifiedPlugin.access$000(), "safeInputContext onClick");
                PasswordInputUnifiedPlugin.this.onClick(view);
            }
        });
        this.mSafeInputContext.setRsaPublicKey(this.mPubKey);
        this.mSafeInputContext.setEncryptRandomStringAndType(this.mTimestamp, EncryptRandomType.randomafter);
        setSafeKeyboardSoftInput(this.mSafeInputContext.getEditText());
        this.mPwdInputLayout.removeAllViews();
        this.mPwdInputLayout.addView(this.mSafeInputContext.getContentView());
        this.mSafeInputContext.getContentView().setVisibility(0);
        this.mPwdInputLayout.setVisibility(0);
        EditText editText = this.mSafeInputContext.getEditText();
        this.k = editText;
        editText.addTextChangedListener(new TextWatcher() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordInputUnifiedPlugin.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("77fdbb29", new Object[]{this, editable});
                } else if (PasswordInputUnifiedPlugin.access$100(PasswordInputUnifiedPlugin.this)) {
                    PasswordInputUnifiedPlugin.access$300(PasswordInputUnifiedPlugin.this, "onPwdChanged", String.valueOf(editable.length()));
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                }
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                }
            }
        });
        String actConf = getActConf(BaseFBPlugin.ACT_CONF.pwdInputBtn);
        String actConf2 = getActConf(BaseFBPlugin.ACT_CONF.pwdPlaceHolder);
        if (!TextUtils.isEmpty(actConf)) {
            this.mSafeInputContext.setOkButtonText(actConf);
        }
        if (!TextUtils.isEmpty(actConf2)) {
            this.k.setHint(actConf2);
        }
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
            LocalBroadcastManager.getInstance(this.b).unregisterReceiver(this.pageChangeBroadcastReceiver);
        }
        if (this.findPwdBroadcastReceiver != null) {
            LocalBroadcastManager.getInstance(this.b).unregisterReceiver(this.findPwdBroadcastReceiver);
        }
        this.g.set(true);
        LocalBroadcastManager.getInstance(this.b).sendBroadcast(new Intent("pwd_plugin_close"));
    }

    public static void setSafeKeyboardSoftInput(EditText editText) {
        try {
            Method method = EditText.class.getMethod("setShowSoftInputOnFocus", Boolean.TYPE);
            method.setAccessible(true);
            method.invoke(editText, Boolean.FALSE);
        } catch (Exception e) {
            VerifyLogCat.printStackTraceAndMore(e);
        }
        try {
            Method method2 = EditText.class.getMethod("setSoftInputShownOnFocus", Boolean.TYPE);
            method2.setAccessible(true);
            method2.invoke(editText, Boolean.FALSE);
        } catch (Exception unused) {
            VerifyLogCat.w(f4315a, "failed to invode setSoftInputShownOnFocus");
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin
    public void addPlugin(String str, String str2, ModuleDataModel moduleDataModel, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84995292", new Object[]{this, str, str2, moduleDataModel, bundle});
            return;
        }
        this.h = false;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("needFindExist", true);
        super.addPlugin(str, str2, moduleDataModel, bundle);
    }

    public void showKeyboard() {
        final View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9e9488b", new Object[]{this});
            return;
        }
        String str = f4315a;
        VerifyLogCat.i(str, "showKeyboard mView.getVisibility(): " + this.i.getVisibility());
        if (this.c != null && getInnerView().isEnabled()) {
            DecorViewInfo b = b();
            final View view = b.decorView;
            final boolean z = b.isDialog;
            boolean hideKeyboard = this.c.getDefaultKeyboardService() != null ? this.c.getDefaultKeyboardService().hideKeyboard(view) : false;
            final boolean z2 = !z && !this.c.isFullscreen();
            if (this.c.isFullscreen()) {
                findViewById = getKeyboardParentView();
            } else {
                findViewById = view.findViewById(16908290);
            }
            if (!this.c.isOnloadFinish()) {
                this.k.postDelayed(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordInputUnifiedPlugin.9
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        View view2 = findViewById;
                        if (!z2) {
                            view2 = PasswordInputUnifiedPlugin.access$1400(PasswordInputUnifiedPlugin.this, view2, view);
                        }
                        try {
                            PasswordInputUnifiedPlugin.access$1700(PasswordInputUnifiedPlugin.this).getTemplateKeyboardService().showKeyboard(PasswordInputUnifiedPlugin.access$1500(PasswordInputUnifiedPlugin.this), UiUtil.getKeyboardType(PasswordInputUnifiedPlugin.access$1600(PasswordInputUnifiedPlugin.this)), view, view2, z, 0);
                        } catch (Exception e) {
                            VerifyLogCat.printStackTraceAndMore(e);
                        }
                    }
                }, 600L);
                return;
            }
            int i = hideKeyboard ? 500 : 0;
            View a2 = !z2 ? a(findViewById, view) : findViewById;
            if (this.k != null) {
                this.c.getTemplateKeyboardService().showKeyboard(this.k, UiUtil.getKeyboardType(this.l), view, a2, z, i);
                if (UiUtil.isGTP8600()) {
                    this.k.postDelayed(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordInputUnifiedPlugin.10
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                PasswordInputUnifiedPlugin.access$1700(PasswordInputUnifiedPlugin.this).getDefaultKeyboardService().hideKeyboard(PasswordInputUnifiedPlugin.access$1500(PasswordInputUnifiedPlugin.this));
                            }
                        }
                    }, 200L);
                }
            }
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin, com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public boolean updateAttr(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a285a79", new Object[]{this, str, str2})).booleanValue();
        }
        BaseFBPlugin baseFBPlugin = VIFBPluginManager.mBackPlugin;
        if (baseFBPlugin != null) {
            baseFBPlugin.updateAttr(str, str2);
            return true;
        } else if (super.updateAttr(str, str2) || a(str, str2)) {
            return true;
        } else {
            if (this.h && str.equals("value") && TextUtils.isEmpty(str2)) {
                clearInputContent();
            }
            return false;
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        String str2 = f4315a;
        VerifyLogCat.i(str2, "updatePubKey: " + str);
        if (TextUtils.isEmpty(str)) {
            VerifyLogCat.i(str2, "服务端没有提供新的公钥，不更新");
            return;
        }
        String generatePubKey = PubKeyHelper.generatePubKey(this.b, str);
        this.mPubKey = generatePubKey;
        SafeInputContext safeInputContext = this.mSafeInputContext;
        if (safeInputContext != null) {
            safeInputContext.setRsaPublicKey(generatePubKey);
        }
    }

    public void doRpc(final String str, final String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a7edbff", new Object[]{this, str, str2, str3});
        } else {
            AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordInputUnifiedPlugin.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    final MICRpcResponse mICRpcResponse;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    MICRpcResponse mICRpcResponse2 = null;
                    try {
                        MICRpcRequest mICRpcRequest = new MICRpcRequest();
                        mICRpcRequest.verifyId = PasswordInputUnifiedPlugin.access$400(PasswordInputUnifiedPlugin.this).getVerifyId();
                        mICRpcRequest.module = PasswordInputUnifiedPlugin.access$500(PasswordInputUnifiedPlugin.this).getModuleName();
                        mICRpcRequest.token = PasswordInputUnifiedPlugin.access$600(PasswordInputUnifiedPlugin.this).getToken();
                        mICRpcRequest.action = "VERIFY_PPW";
                        VerifyRequestModel verifyRequestModel = new VerifyRequestModel();
                        verifyRequestModel.setIsSimplePPW(PasswordInputUnifiedPlugin.access$700(PasswordInputUnifiedPlugin.this).getVerifyId(), PasswordInputUnifiedPlugin.this.isSimplePwd);
                        verifyRequestModel.encryptPwd = str;
                        verifyRequestModel.needOtherVerifyPay = str2;
                        if (!TextUtils.isEmpty(str3)) {
                            verifyRequestModel.from = str3;
                        }
                        if (ModuleConstants.VI_MODULE_NAME_PAYMENT_PASSWORD_PLUS.equalsIgnoreCase(PasswordInputUnifiedPlugin.access$800(PasswordInputUnifiedPlugin.this).sourceToPwd)) {
                            VerifyLogCat.d(PasswordInputUnifiedPlugin.access$000(), "This pwd check request is from fingerprint module.");
                            verifyRequestModel.predata = JSON.parseObject(PasswordInputUnifiedPlugin.access$800(PasswordInputUnifiedPlugin.this).predata);
                            mICRpcRequest.module = ModuleConstants.VI_MODULE_NAME_PAYMENT_PASSWORD_PLUS;
                        }
                        mICRpcRequest.data = JSON.toJSONString(verifyRequestModel);
                        mICRpcResponse = PasswordInputUnifiedPlugin.this.sendRpcRequest(mICRpcRequest);
                        try {
                            PasswordInputUnifiedPlugin.access$800(PasswordInputUnifiedPlugin.this).predata = null;
                        } catch (RpcException unused) {
                            mICRpcResponse2 = mICRpcResponse;
                            mICRpcResponse = mICRpcResponse2;
                            PasswordInputUnifiedPlugin.access$1000(PasswordInputUnifiedPlugin.this).post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordInputUnifiedPlugin.5.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    AnonymousClass5 r0 = AnonymousClass5.this;
                                    PasswordInputUnifiedPlugin.access$900(PasswordInputUnifiedPlugin.this, mICRpcResponse, str3);
                                }
                            });
                        }
                    } catch (RpcException unused2) {
                    }
                    PasswordInputUnifiedPlugin.access$1000(PasswordInputUnifiedPlugin.this).post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordInputUnifiedPlugin.5.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            AnonymousClass5 r0 = AnonymousClass5.this;
                            PasswordInputUnifiedPlugin.access$900(PasswordInputUnifiedPlugin.this, mICRpcResponse, str3);
                        }
                    });
                }
            }, NetworkServiceTracer.REPORT_SUB_NAME_RPC);
        }
    }

    private boolean a(String str, String str2) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        if (!this.h || !str.equals("src")) {
            return false;
        }
        LocalBroadcastManager instance = LocalBroadcastManager.getInstance(this.b);
        Intent intent = new Intent("on_pwd_plugin_action");
        intent.putExtra("data", str2);
        instance.sendBroadcast(intent);
        String str3 = f4315a;
        VerifyLogCat.i(str3, "[onPwdBNAction] key: " + str + ", data: " + str2);
        if (TextUtils.isEmpty(str2) || str2.startsWith(UiUtil.INPUT_TYPE_VALUE_PAYSPWD)) {
            this.isSimplePwd = true;
            this.l = UiUtil.INPUT_TYPE_VALUE_PAYSPWD;
            initPwdInput();
            return true;
        } else if (UiUtil.INPUT_TYPE_VALUE_PAYPWD.equalsIgnoreCase(str2)) {
            this.isSimplePwd = false;
            this.l = UiUtil.INPUT_TYPE_VALUE_PAYPWD;
            initPwdInput();
            return true;
        } else {
            try {
                jSONObject = JSON.parseObject(str2);
            } catch (JSONException e) {
                VerifyLogCat.e(f4315a, "json fail ".concat(str2), e);
                jSONObject = null;
            }
            if (jSONObject == null) {
                return false;
            }
            a(jSONObject.getString("pubKey"));
            return true;
        }
    }

    public void writePwdBehavorLog(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d15438a", new Object[]{this, str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("code", str2);
        hashMap.put("source", str3);
        VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, str, com.alipay.mobile.verifyidentity.common.Constants.VI_ENGINE_APPID, "aavca", this.mModule.getToken(), this.mModule.getVerifyId(), null, hashMap);
    }

    private View a(View view, View view2) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bf78576a", new Object[]{this, view, view2});
        }
        if (view != null) {
            return view;
        }
        if (this.h) {
            i = R.id.keyboard_layout;
        } else {
            i = ResUtils.getResourceId(this.b, "flybird_main_layout", "id", "com.alipay.android.app");
        }
        setKeyboardParentView(view2.findViewById(i));
        return getKeyboardParentView();
    }

    private String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        String actConf = getActConf(BaseFBPlugin.ACT_CONF.pwdTip);
        if (!TextUtils.isEmpty(actConf)) {
            return actConf;
        }
        String actConf2 = getActConf(BaseFBPlugin.ACT_CONF.costTip);
        return !TextUtils.isEmpty(actConf2) ? actConf2 : "";
    }
}
