package com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.CycleInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.safepaybase.alikeyboard.AliKeyboardType;
import com.alipay.android.app.safepaybase.alikeyboard.AlipayKeyboard;
import com.alipay.android.app.safepaybase.alikeyboard.AlipayKeyboardActionListener;
import com.alipay.android.app.safepaybase.util.ResUtils;
import com.alipay.android.app.template.FBFocusable;
import com.alipay.android.app.template.FBPluginCtx;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager;
import com.alipay.birdnest.util.UiUtil;
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
import com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler;
import com.alipay.mobile.verifyidentity.safepaybase.EncryptRandomType;
import com.alipay.mobile.verifyidentity.safepaybase.OnConfirmListener;
import com.alipay.mobile.verifyidentity.safepaybase.SafeInputContext;
import com.alipay.mobile.verifyidentity.safepaybase.TextWatcherListener;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.VIFBPluginManager;
import com.alipay.mobile.verifyidentity.utils.IDecisionHelper;
import com.alipay.mobile.verifyidentity.utils.VIUtils;
import com.alipay.mobileic.core.model.rpc.MICRpcResponse;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.weex.common.Constants;
import java.lang.reflect.Method;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class PasswordUnifiedPluginNew extends BaseFBPlugin implements View.OnClickListener, View.OnFocusChangeListener, FBFocusable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String backToBioViType;
    public TextView content_desc;
    public TextView content_title;
    public BroadcastReceiver findPwdBroadcastReceiver;
    public String findPwdTxt;
    public TextView goBackPwd;
    public String goOtherVerifyProduct;
    public boolean hasOthers;
    public String hind_other;
    public boolean isIntellDecison;
    public AlipayKeyboard mAlipayKeyboard;
    public long mInputChangeCount;
    public String mPubKey;
    public LinearLayout mPwdInputLayout;
    public SafeInputContext mSafeInputContext;
    public long mShowInputTime;
    public String otherProductForDialog;
    public String otherText;
    public BroadcastReceiver pageChangeBroadcastReceiver;
    public String predata;
    public String pwdTopTip;
    public final Context q;
    public final FBPluginCtx r;
    public final int s;
    public String showFindPwd;
    public InitDataModel t;
    public String top_to_product;
    public PwdCommonHandler u;
    public String v;
    public View x;
    public View y;
    public EditText z;
    public String mTimestamp = "";
    public boolean isShowGetBackPwd = false;
    public boolean isSimplePwd = true;
    public boolean w = true;
    public String A = UiUtil.INPUT_TYPE_VALUE_PAYSPWD;
    public boolean B = false;
    public final String C = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class DecorViewInfo {
        public View decorView;
        public boolean isDialog;

        public DecorViewInfo() {
        }
    }

    public PasswordUnifiedPluginNew(Context context, FBPluginCtx fBPluginCtx, int i) {
        super(context, fBPluginCtx);
        this.q = context;
        this.r = fBPluginCtx;
        this.s = i;
        VerifyLogCat.i("PasswordUnifiedPluginNew", "pwd plugin create");
    }

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return "PasswordUnifiedPluginNew";
    }

    public static /* synthetic */ void access$100(PasswordUnifiedPluginNew passwordUnifiedPluginNew, String str, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("804b37aa", new Object[]{passwordUnifiedPluginNew, str, hashMap});
            return;
        }
        try {
            VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, str, Constants.VI_ENGINE_APPID, "hswjmm", passwordUnifiedPluginNew.mModule.getToken(), passwordUnifiedPluginNew.mModule.getVerifyId(), null, hashMap);
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ EditText access$1000(PasswordUnifiedPluginNew passwordUnifiedPluginNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditText) ipChange.ipc$dispatch("6cb0277c", new Object[]{passwordUnifiedPluginNew});
        }
        return passwordUnifiedPluginNew.z;
    }

    public static /* synthetic */ void access$1100(PasswordUnifiedPluginNew passwordUnifiedPluginNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8bbf0e", new Object[]{passwordUnifiedPluginNew});
        } else {
            passwordUnifiedPluginNew.d();
        }
    }

    public static /* synthetic */ MicroModule access$1200(PasswordUnifiedPluginNew passwordUnifiedPluginNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("fe524e11", new Object[]{passwordUnifiedPluginNew});
        }
        return passwordUnifiedPluginNew.mModule;
    }

    public static /* synthetic */ MicroModule access$1300(PasswordUnifiedPluginNew passwordUnifiedPluginNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("8b08a852", new Object[]{passwordUnifiedPluginNew});
        }
        return passwordUnifiedPluginNew.mModule;
    }

    public static /* synthetic */ MicroModule access$1400(PasswordUnifiedPluginNew passwordUnifiedPluginNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("17bf0293", new Object[]{passwordUnifiedPluginNew});
        }
        return passwordUnifiedPluginNew.mModule;
    }

    public static /* synthetic */ MicroModule access$1500(PasswordUnifiedPluginNew passwordUnifiedPluginNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("a4755cd4", new Object[]{passwordUnifiedPluginNew});
        }
        return passwordUnifiedPluginNew.mModule;
    }

    public static /* synthetic */ MicroModule access$1600(PasswordUnifiedPluginNew passwordUnifiedPluginNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("312bb715", new Object[]{passwordUnifiedPluginNew});
        }
        return passwordUnifiedPluginNew.mModule;
    }

    public static /* synthetic */ MicroModule access$1700(PasswordUnifiedPluginNew passwordUnifiedPluginNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("bde21156", new Object[]{passwordUnifiedPluginNew});
        }
        return passwordUnifiedPluginNew.mModule;
    }

    public static /* synthetic */ MicroModule access$1800(PasswordUnifiedPluginNew passwordUnifiedPluginNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("4a986b97", new Object[]{passwordUnifiedPluginNew});
        }
        return passwordUnifiedPluginNew.mModule;
    }

    public static /* synthetic */ MicroModule access$1900(PasswordUnifiedPluginNew passwordUnifiedPluginNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("d74ec5d8", new Object[]{passwordUnifiedPluginNew});
        }
        return passwordUnifiedPluginNew.mModule;
    }

    public static /* synthetic */ void access$200(PasswordUnifiedPluginNew passwordUnifiedPluginNew, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71fb21ea", new Object[]{passwordUnifiedPluginNew, str});
            return;
        }
        if (ModuleConstants.VI_MODULE_NAME_PAYMENT_PASSWORD_PLUS.equalsIgnoreCase(passwordUnifiedPluginNew.t.sourceToPwd)) {
            str2 = "pwd_plus";
        } else {
            str2 = "pwd";
        }
        passwordUnifiedPluginNew.writePwdBehavorLog("UC-MobileIC-20190606-4", "START_VERIFY_PWD_RPC", "wallet_cn", "pay", str2, true);
        passwordUnifiedPluginNew.sendMspRpc(str, null, "");
    }

    public static /* synthetic */ MicroModule access$2000(PasswordUnifiedPluginNew passwordUnifiedPluginNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("eefa876e", new Object[]{passwordUnifiedPluginNew});
        }
        return passwordUnifiedPluginNew.mModule;
    }

    public static /* synthetic */ MicroModule access$2100(PasswordUnifiedPluginNew passwordUnifiedPluginNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("7bb0e1af", new Object[]{passwordUnifiedPluginNew});
        }
        return passwordUnifiedPluginNew.mModule;
    }

    public static /* synthetic */ MicroModule access$2200(PasswordUnifiedPluginNew passwordUnifiedPluginNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("8673bf0", new Object[]{passwordUnifiedPluginNew});
        }
        return passwordUnifiedPluginNew.mModule;
    }

    public static /* synthetic */ boolean access$300(PasswordUnifiedPluginNew passwordUnifiedPluginNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b0448e5", new Object[]{passwordUnifiedPluginNew})).booleanValue();
        }
        return passwordUnifiedPluginNew.w;
    }

    public static /* synthetic */ void access$400(PasswordUnifiedPluginNew passwordUnifiedPluginNew, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66715db6", new Object[]{passwordUnifiedPluginNew, str, str2});
        } else {
            passwordUnifiedPluginNew.viNativeExecuteJs(str, str2);
        }
    }

    public static /* synthetic */ void access$500(PasswordUnifiedPluginNew passwordUnifiedPluginNew, MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5306147b", new Object[]{passwordUnifiedPluginNew, mICRpcResponse});
        } else if (!TextUtils.isEmpty(mICRpcResponse.data) && mICRpcResponse.data.contains("bicAsyncData")) {
            try {
                JSONObject parseObject = JSON.parseObject(mICRpcResponse.data);
                if (parseObject != null) {
                    AuthenticatorManager.getInstance(passwordUnifiedPluginNew.q).processAfterAuth(parseObject.getString("bicAsyncData"));
                }
            } catch (Throwable th) {
                VerifyLogCat.i("PasswordUnifiedPluginNew", "handle km error:" + th.getMessage());
            }
        }
    }

    public static /* synthetic */ PwdCommonHandler access$600(PasswordUnifiedPluginNew passwordUnifiedPluginNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PwdCommonHandler) ipChange.ipc$dispatch("ac95a9db", new Object[]{passwordUnifiedPluginNew});
        }
        return passwordUnifiedPluginNew.u;
    }

    public static /* synthetic */ Context access$700(PasswordUnifiedPluginNew passwordUnifiedPluginNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("191eabdd", new Object[]{passwordUnifiedPluginNew});
        }
        return passwordUnifiedPluginNew.q;
    }

    public static /* synthetic */ void access$800(PasswordUnifiedPluginNew passwordUnifiedPluginNew, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b84480f0", new Object[]{passwordUnifiedPluginNew, str});
            return;
        }
        VerifyLogCat.i("PasswordUnifiedPluginNew", "updatePubKey: " + str);
        if (TextUtils.isEmpty(str)) {
            VerifyLogCat.i("PasswordUnifiedPluginNew", "服务端没有提供新的公钥，不更新");
            return;
        }
        String generatePubKey = PubKeyHelper.generatePubKey(passwordUnifiedPluginNew.q, str);
        passwordUnifiedPluginNew.mPubKey = generatePubKey;
        SafeInputContext safeInputContext = passwordUnifiedPluginNew.mSafeInputContext;
        if (safeInputContext != null) {
            safeInputContext.setRsaPublicKey(generatePubKey);
        }
    }

    public static /* synthetic */ void access$900(PasswordUnifiedPluginNew passwordUnifiedPluginNew, MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12997af7", new Object[]{passwordUnifiedPluginNew, mICRpcResponse});
            return;
        }
        passwordUnifiedPluginNew.content_title.setVisibility(8);
        passwordUnifiedPluginNew.content_desc.setText(mICRpcResponse.verifyMessage);
        passwordUnifiedPluginNew.content_desc.setTextColor(-65536);
        passwordUnifiedPluginNew.content_desc.setVisibility(0);
        passwordUnifiedPluginNew.d();
        passwordUnifiedPluginNew.content_desc.setAnimation(passwordUnifiedPluginNew.shakeAnimation(6));
        if ("Y".equalsIgnoreCase(passwordUnifiedPluginNew.hind_other)) {
            passwordUnifiedPluginNew.goBackPwd.setVisibility(4);
        } else if (passwordUnifiedPluginNew.u.getOtherVerifyPayFlag(mICRpcResponse)) {
            passwordUnifiedPluginNew.goBackPwd.setVisibility(0);
            passwordUnifiedPluginNew.goBackPwd.setText(passwordUnifiedPluginNew.getOtherVerifyPayText(mICRpcResponse));
            passwordUnifiedPluginNew.goBackPwd.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordUnifiedPluginNew.15
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    PasswordUnifiedPluginNew.this.hideKeyboard();
                    PasswordUnifiedPluginNew.this.sendMspRpc(null, "Y", "forgotPwd");
                    if (PasswordUnifiedPluginNew.access$1900(PasswordUnifiedPluginNew.this) != null) {
                        PasswordUnifiedPluginNew.access$2000(PasswordUnifiedPluginNew.this).isFindAndPay = true;
                        VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, "UC-MobileIC-190311-1", Constants.VI_ENGINE_APPID, "aprj", PasswordUnifiedPluginNew.access$2100(PasswordUnifiedPluginNew.this).getToken(), PasswordUnifiedPluginNew.access$2200(PasswordUnifiedPluginNew.this).getVerifyId(), null, null);
                    }
                }
            });
        } else {
            HashMap<String, String> hashMap = new HashMap<>();
            if (passwordUnifiedPluginNew.showFindPwdByResponse(mICRpcResponse, hashMap)) {
                String str = hashMap.get(PayPwdModule.FIND_PWD_TXT);
                passwordUnifiedPluginNew.goBackPwd.setVisibility(0);
                if (!TextUtils.isEmpty(str)) {
                    passwordUnifiedPluginNew.goBackPwd.setText(str);
                } else {
                    passwordUnifiedPluginNew.goBackPwd.setText(R.string.pwd_forget_in_layout);
                }
            } else {
                passwordUnifiedPluginNew.goBackPwd.setVisibility(4);
            }
            passwordUnifiedPluginNew.goBackPwd.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordUnifiedPluginNew.16
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    PasswordUnifiedPluginNew.access$600(PasswordUnifiedPluginNew.this).goGetMspPPW(PasswordUnifiedPluginNew.this.getActConf(BaseFBPlugin.ACT_CONF.login_id));
                    LocalBroadcastManager.getInstance(MicroModuleContext.getInstance().getContext()).sendBroadcast(new Intent("kMQPFindPwdNotification"));
                    PasswordUnifiedPluginNew.this.updateVerifyStatusFotQuit(BaseFBPlugin.VERIFY_STATUS.abort, "forgetPwd");
                    PasswordUnifiedPluginNew.access$600(PasswordUnifiedPluginNew.this).notifyCancel();
                }
            });
        }
    }

    public static /* synthetic */ Object ipc$super(PasswordUnifiedPluginNew passwordUnifiedPluginNew, String str, Object... objArr) {
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alipay/mobile/verifyidentity/module/dynamic/ui/plugin/PasswordUnifiedPluginNew");
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
            this.t = (InitDataModel) JSON.parseObject(str, InitDataModel.class);
        } catch (JSONException e) {
            VerifyLogCat.e("PasswordUnifiedPluginNew", "json fail " + str, e);
        }
        if (this.t == null) {
            VerifyLogCat.d("PasswordUnifiedPluginNew", "module data can't be converted to jsonobject: " + str);
            MicroModuleContext.getInstance().alert("", this.q.getResources().getString(R.string.verifyidentity_wrong_data), this.q.getResources().getString(R.string.verifyidentity_confirm), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordUnifiedPluginNew.14
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    } else {
                        PasswordUnifiedPluginNew.this.updateVerifyStatus(BaseFBPlugin.VERIFY_STATUS.abort);
                    }
                }
            }, null, null);
            return;
        }
        VerifyLogCat.i("PasswordUnifiedPluginNew", "create plugin");
        InitDataModel initDataModel = this.t;
        this.isSimplePwd = initDataModel.isSimplePPW;
        this.mPubKey = PubKeyHelper.generatePubKey(this.q, initDataModel.pubKey);
        this.mTimestamp = this.t.timestamp;
        this.u = new PwdCommonHandler(this.q, this.mModule, this, new PwdCommonHandler.NotifyResultHandler() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordUnifiedPluginNew.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler.NotifyResultHandler
            public void notifyResult(ModuleExecuteResult moduleExecuteResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("75cfa791", new Object[]{this, moduleExecuteResult});
                } else {
                    PasswordUnifiedPluginNew.this.notifyResult(moduleExecuteResult);
                }
            }
        });
        if (TextUtils.isEmpty(this.mTimestamp)) {
            this.mTimestamp = "";
        }
        InitDataModel initDataModel2 = this.t;
        this.predata = initDataModel2.predata;
        this.pwdTopTip = initDataModel2.pwdTopTip;
        this.isShowGetBackPwd = initDataModel2.isFindPPW;
        this.v = initDataModel2.decisionToPwd;
        this.goOtherVerifyProduct = initDataModel2.forgot2Verify;
        this.otherText = initDataModel2.forgot2VerifyText;
        if (TextUtils.isEmpty(getActConf(BaseFBPlugin.ACT_CONF.pwdTip))) {
            TextUtils.isEmpty(getActConf(BaseFBPlugin.ACT_CONF.costTip));
        }
        InitDataModel initDataModel3 = this.t;
        this.top_to_product = initDataModel3.decisionToPwd_action;
        this.backToBioViType = initDataModel3.decisionToPwd_backType;
        this.hind_other = getActConf(BaseFBPlugin.ACT_CONF.kVIDisableForgetPwdKey);
        InitDataModel initDataModel4 = this.t;
        this.showFindPwd = initDataModel4.showFindPwd;
        this.findPwdTxt = initDataModel4.findPwdTxt;
        this.hasOthers = VIUtils.hasOtherVerifyProduct(str);
        VerifyLogCat.i("PasswordUnifiedPluginNew", "initSixPwd: " + this.isSimplePwd);
        String str2 = "pwd";
        if (this.isSimplePwd) {
            this.viType = "spwd";
            this.A = UiUtil.INPUT_TYPE_VALUE_PAYSPWD;
        } else {
            this.viType = str2;
            this.A = UiUtil.INPUT_TYPE_VALUE_PAYPWD;
        }
        initPwdInput();
        String str3 = this.t.keyHeadline;
        this.content_title = (TextView) this.x.findViewById(R.id.pwd_title);
        if (TextUtils.isEmpty(str3)) {
            str3 = this.q.getResources().getString(R.string.pwd_input_alert_please);
        }
        this.content_title.setText(str3);
        this.content_desc = (TextView) this.x.findViewById(R.id.pwd_desc);
        if (!TextUtils.isEmpty(this.pwdTopTip)) {
            this.content_desc.setTextColor(-65536);
            this.content_desc.setText(this.pwdTopTip);
            this.content_desc.setVisibility(0);
            this.content_title.setVisibility(8);
        } else if (TextUtils.isEmpty(this.v) || "Y".equalsIgnoreCase(this.t.hideDecisionTip) || this.t.decisionToPwdFromUsePwd) {
            this.content_desc.setVisibility(8);
            this.content_title.setVisibility(0);
        } else {
            this.content_desc.setText(this.v);
            this.content_desc.setVisibility(0);
            this.content_desc.setTextColor(Color.parseColor("#999999"));
            this.content_title.setVisibility(8);
        }
        this.goBackPwd = (TextView) this.x.findViewById(R.id.getbackpwd);
        if ("Y".equalsIgnoreCase(getOtherPayConfig())) {
            if ("Y".equalsIgnoreCase(this.hind_other)) {
                this.goBackPwd.setVisibility(4);
            } else {
                this.goBackPwd.setVisibility(0);
                this.goBackPwd.setText(getOtherPayContent());
                this.goBackPwd.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordUnifiedPluginNew.10
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        PasswordUnifiedPluginNew.this.hideKeyboard();
                        PasswordUnifiedPluginNew.this.sendMspRpc(null, "Y", "forgotPwd");
                        if (PasswordUnifiedPluginNew.access$1200(PasswordUnifiedPluginNew.this) != null) {
                            PasswordUnifiedPluginNew.access$1300(PasswordUnifiedPluginNew.this).isFindAndPay = true;
                            VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, "UC-MobileIC-190311-1", Constants.VI_ENGINE_APPID, "aprj", PasswordUnifiedPluginNew.access$1400(PasswordUnifiedPluginNew.this).getToken(), PasswordUnifiedPluginNew.access$1500(PasswordUnifiedPluginNew.this).getVerifyId(), null, null);
                        }
                    }
                });
            }
        } else if ("Y".equalsIgnoreCase(this.hind_other)) {
            this.goBackPwd.setVisibility(4);
        } else {
            if (TextUtils.isEmpty(this.showFindPwd) || "Y".equalsIgnoreCase(this.showFindPwd)) {
                this.goBackPwd.setVisibility(0);
                if (!TextUtils.isEmpty(this.findPwdTxt)) {
                    this.goBackPwd.setText(this.findPwdTxt);
                } else {
                    this.goBackPwd.setText(R.string.pwd_forget_in_layout);
                }
            } else {
                this.goBackPwd.setVisibility(4);
            }
            this.goBackPwd.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordUnifiedPluginNew.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    PasswordUnifiedPluginNew.access$600(PasswordUnifiedPluginNew.this).goGetMspPPW(PasswordUnifiedPluginNew.this.getActConf(BaseFBPlugin.ACT_CONF.login_id));
                    LocalBroadcastManager.getInstance(MicroModuleContext.getInstance().getContext()).sendBroadcast(new Intent("kMQPFindPwdNotification"));
                    PasswordUnifiedPluginNew.this.updateVerifyStatusFotQuit(BaseFBPlugin.VERIFY_STATUS.abort, "forgetPwd");
                    PasswordUnifiedPluginNew.access$600(PasswordUnifiedPluginNew.this).notifyCancel();
                }
            });
        }
        if (this.hasOthers) {
            if (!TextUtils.isEmpty(this.top_to_product)) {
                e("");
            } else {
                String str4 = this.t.switchOther;
                if (TextUtils.isEmpty(str4)) {
                    String str5 = this.t.other;
                    if (TextUtils.isEmpty(str5)) {
                        str5 = this.q.getResources().getString(R.string.pwd_other_way);
                    }
                    e(str5);
                } else {
                    e(str4);
                }
            }
            VerifyLogCat.i("PasswordUnifiedPluginNew", "显示选择其它方式入口");
        } else {
            e("");
        }
        try {
            Context context = this.q;
            if ((context instanceof Activity) && ((Activity) context).getWindow() != null) {
                ((Activity) this.q).getWindow().addFlags(8192);
            }
        } catch (Throwable th) {
            VerifyLogCat.e("PasswordUnifiedPluginNew", th);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", "start");
        String str6 = this.t.pwdTopTip;
        String actConf = getActConf(BaseFBPlugin.ACT_CONF.pwdInputTip);
        String actConf2 = getActConf(BaseFBPlugin.ACT_CONF.costTip);
        if (TextUtils.isEmpty(str6)) {
            if (!TextUtils.isEmpty(actConf)) {
                str6 = actConf;
            } else {
                str6 = !TextUtils.isEmpty(actConf2) ? actConf2 : "";
            }
        }
        jSONObject.put("tip", (Object) str6);
        updateVerifyStatus(jSONObject);
        sendModelChangeEvent("", "PWD", this.isSimplePwd ? BaseFBPlugin.VERIFY_TYPE.sp : BaseFBPlugin.VERIFY_TYPE.pp);
        this.u.sourceToPwd = this.t.sourceToPwd;
        VerifyLogCat.i("PasswordUnifiedPluginNew", "mView.getVisibility(): " + this.x.getVisibility());
        this.mainHandler.postDelayed(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordUnifiedPluginNew.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    PasswordUnifiedPluginNew.access$1000(PasswordUnifiedPluginNew.this).requestFocus();
                    PasswordUnifiedPluginNew.access$1100(PasswordUnifiedPluginNew.this);
                } catch (Throwable th2) {
                    VerifyLogCat.w(PasswordUnifiedPluginNew.access$000(), th2);
                }
            }
        }, 500L);
        InitDataModel initDataModel5 = this.t;
        if (initDataModel5 != null && ModuleConstants.VI_MODULE_NAME_PAYMENT_PASSWORD_PLUS.equalsIgnoreCase(initDataModel5.sourceToPwd)) {
            str2 = "pwd_plus";
        }
        writePwdBehavorLog("UC-MobileIC-20191030-1", "START_PWD_VIEW", "wallet_cn", "pay", str2, true);
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
        try {
            Context context = this.q;
            if ((context instanceof Activity) && ((Activity) context).getWindow() != null) {
                ((Activity) this.q).getWindow().clearFlags(8192);
            }
        } catch (Throwable th) {
            VerifyLogCat.e("PasswordUnifiedPluginNew", th);
        }
        View view = this.x;
        if (view != null) {
            view.setVisibility(8);
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
        this.x = ((LayoutInflater) this.q.getSystemService("layout_inflater")).inflate(R.layout.layout_plugin_vi_password_new, (ViewGroup) null);
        initPwdInput();
        this.pageChangeBroadcastReceiver = new BroadcastReceiver() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordUnifiedPluginNew.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass12 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/module/dynamic/ui/plugin/PasswordUnifiedPluginNew$12");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                    return;
                }
                VerifyLogCat.i(PasswordUnifiedPluginNew.access$000(), "收到广播：com.alipay.phonecashier.framechange");
                PasswordUnifiedPluginNew.this.getInnerView().setEnabled(false);
            }
        };
        this.findPwdBroadcastReceiver = new BroadcastReceiver() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordUnifiedPluginNew.13
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass13 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/module/dynamic/ui/plugin/PasswordUnifiedPluginNew$13");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                    return;
                }
                VerifyLogCat.i(PasswordUnifiedPluginNew.access$000(), "收到广播：kMQPFindPwdNotification | 收银台场景用户点找回密码");
                if (PasswordUnifiedPluginNew.access$1600(PasswordUnifiedPluginNew.this) != null && PasswordUnifiedPluginNew.access$1700(PasswordUnifiedPluginNew.this).getTask() != null) {
                    VerifyIdentityTask task = PasswordUnifiedPluginNew.access$1800(PasswordUnifiedPluginNew.this).getTask();
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
            VerifyLogCat.i("PasswordUnifiedPluginNew", "sendPopBroadCast error:" + th.getMessage());
        }
        return this.x;
    }

    public final DecorViewInfo f() {
        View view;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DecorViewInfo) ipChange.ipc$dispatch("c7c6ae80", new Object[]{this});
        }
        DecorViewInfo decorViewInfo = new DecorViewInfo();
        if (this.r.getShowingDialog() != null && this.r.getShowingDialog().isShowing()) {
            z = true;
        }
        if (!z) {
            view = ((Activity) this.q).getWindow().getDecorView();
        } else {
            view = this.r.getShowingDialog().getWindow().getDecorView();
        }
        decorViewInfo.decorView = view;
        decorViewInfo.isDialog = z;
        return decorViewInfo;
    }

    public float getBodyViewOpacity() {
        Object bodyView = this.r.getBodyView();
        if (bodyView == null) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(bodyView.getClass().getMethod("getOpacity", new Class[0]).invoke(bodyView, new Object[0]).toString());
        } catch (Throwable th) {
            VerifyLogCat.w("PasswordUnifiedPluginNew", th);
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

    public View getKeyboardParentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3e8befb5", new Object[]{this});
        }
        return this.y;
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
            VerifyLogCat.e("PasswordUnifiedPluginNew", "json fail " + mICRpcResponse.data, e);
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

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin
    public void handleEngineCancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b64b42b", new Object[]{this});
            return;
        }
        VerifyLogCat.i("PasswordUnifiedPluginNew", "pwd plugin cancel");
        if (openDuplicatePayTaskFix()) {
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
        if (isDefaultKeyboard() || this.r.getDefaultKeyboardService() == null) {
            z2 = false;
        } else {
            z2 = this.r.getTemplateKeyboardService().hideKeyboard(view);
        }
        if (!z || this.r.getDefaultKeyboardService() == null) {
            return z2;
        }
        if (!z2 && !this.r.getDefaultKeyboardService().hideKeyboard(view)) {
            z3 = false;
        }
        return z3;
    }

    public void hideKeyboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c20b50", new Object[]{this});
            return;
        }
        VerifyLogCat.d("PasswordUnifiedPluginNew", "hideKeyboard()");
        AlipayKeyboard alipayKeyboard = this.mAlipayKeyboard;
        if (alipayKeyboard != null) {
            alipayKeyboard.hideKeyboard();
        }
    }

    public void initKeyBoard(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae6de14", new Object[]{this, view});
            return;
        }
        AlipayKeyboard alipayKeyboard = new AlipayKeyboard(this.q);
        this.mAlipayKeyboard = alipayKeyboard;
        alipayKeyboard.initializeKeyboard(null);
        this.mAlipayKeyboard.setSource(AlipayKeyboard.SourceType.vi);
        if (view instanceof LinearLayout) {
            view.setVisibility(0);
            this.mAlipayKeyboard.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            ((LinearLayout) view).addView(this.mAlipayKeyboard);
        } else if (view instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            this.mAlipayKeyboard.setLayoutParams(layoutParams);
            ((FrameLayout) view).addView(this.mAlipayKeyboard);
        }
        this.mAlipayKeyboard.setKeyboardActionListener(new AlipayKeyboardActionListener() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordUnifiedPluginNew.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass7 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/module/dynamic/ui/plugin/PasswordUnifiedPluginNew$7");
            }

            @Override // com.alipay.android.app.safepaybase.alikeyboard.AlipayKeyboardActionListener
            public void onDel() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("abf60c33", new Object[]{this});
                }
            }

            @Override // com.alipay.android.app.safepaybase.alikeyboard.AlipayKeyboardActionListener
            public void onInput(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fe21657c", new Object[]{this, str});
                }
            }

            @Override // com.alipay.android.app.safepaybase.alikeyboard.AlipayKeyboardActionListener
            public void onOk() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("52581b22", new Object[]{this});
                }
            }
        });
    }

    public boolean isDefaultKeyboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87984449", new Object[]{this})).booleanValue();
        }
        if (this.r.getTemplateKeyboardService() == null || this.r.getDefaultKeyboardService().equals(this.r.getTemplateKeyboardService())) {
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
        ModuleExecuteResult addLogicModuleName = this.u.addLogicModuleName(moduleExecuteResult);
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
        PwdCommonHandler pwdCommonHandler = this.u;
        if (pwdCommonHandler != null) {
            pwdCommonHandler.notifyCancel("106");
        }
        clear();
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin, android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        try {
            d();
        } catch (Exception e) {
            VerifyLogCat.printStackTraceAndMore(e);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin, android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1621df92", new Object[]{this, view, new Boolean(z)});
        } else if (this.r != null && this.q != null && getBodyViewOpacity() > 0.1d && this.r.isOnloadFinish()) {
            if (z && view.isEnabled()) {
                if (TextUtils.equals(this.A, UiUtil.INPUT_TYPE_VALUE_PAYSPWD)) {
                    EditText editText = this.z;
                    editText.setSelection(editText.getEditableText().length());
                }
                if (this.r != null && !UiUtil.isUseDefaultKeyboard(this.A, this.C) && !isDefaultKeyboard()) {
                    this.r.getTemplateKeyboardService().hideKeyboard(f().decorView);
                }
                d();
            }
            if (z) {
                this.r.deliverOnFocus(getNode());
            } else {
                this.r.deliverOnBlur(getNode());
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
        if (TextUtils.isEmpty(this.A)) {
            this.z.setSingleLine();
            this.z.setHorizontallyScrolling(true);
            setSafeKeyboardSoftInput(this.z);
            this.z.setOnFocusChangeListener(this);
            this.z.setOnClickListener(this);
        }
        if (this.B) {
            this.r.setAutoFocus(this);
            View view = (View) this.z.getParent();
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
        }
        Editable editableText = this.z.getEditableText();
        if (editableText != null) {
            String obj = editableText.toString();
            if (!TextUtils.isEmpty(obj)) {
                this.z.setSelection(obj.length());
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
        d();
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
            try {
                d();
            } catch (Throwable th) {
                VerifyLogCat.printStackTraceAndMore(th);
            }
        }
    }

    public void sendMspRpc(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f49c508", new Object[]{this, str, str2, str3});
            return;
        }
        writeBehavorWithPlus("UC-MobileIC-20190606-4", "START_VERIFY_PWD_RPC", "wallet_cn", "pluginNew");
        this.u.doRpc(str, str2, str3, this.isSimplePwd, this.predata, this.isIntellDecison, new PwdCommonHandler.NotifyMspResultHandler() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordUnifiedPluginNew.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler.NotifyMspResultHandler
            public void notifyResult(MICRpcResponse mICRpcResponse, String str4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("52319fdb", new Object[]{this, mICRpcResponse, str4});
                    return;
                }
                PasswordUnifiedPluginNew passwordUnifiedPluginNew = PasswordUnifiedPluginNew.this;
                passwordUnifiedPluginNew.predata = null;
                if (mICRpcResponse == null) {
                    VerifyLogCat.d(PasswordUnifiedPluginNew.access$000(), "input pwd null result");
                    PasswordUnifiedPluginNew.this.onNetError();
                } else if (mICRpcResponse.verifySuccess) {
                    PasswordUnifiedPluginNew.access$500(passwordUnifiedPluginNew, mICRpcResponse);
                    PasswordUnifiedPluginNew.access$600(PasswordUnifiedPluginNew.this).doNextStep(mICRpcResponse, str4);
                    PasswordUnifiedPluginNew.this.writeBehavorWithPlus("UC-MobileIC-20191030-2", "SUCCESS", "wallet_cn", "pluginNew");
                } else {
                    passwordUnifiedPluginNew.updateVerifyStatusNew(BaseFBPlugin.VERIFY_STATUS.awaitUser);
                    PasswordUnifiedPluginNew.this.clearInputContent();
                    PasswordUnifiedPluginNew.access$800(PasswordUnifiedPluginNew.this, PubKeyHelper.updateLocalPubKey(PasswordUnifiedPluginNew.access$700(PasswordUnifiedPluginNew.this), mICRpcResponse));
                    if ("RETRY".equalsIgnoreCase(mICRpcResponse.verifyCode)) {
                        VerifyLogCat.d(PasswordUnifiedPluginNew.access$000(), "input pwd retry");
                        PasswordUnifiedPluginNew.access$900(PasswordUnifiedPluginNew.this, mICRpcResponse);
                    } else {
                        PasswordUnifiedPluginNew.this.writePwdBehavorLog("UC-MobileIC-20210326-3", "LOCK", "pay", "pluginNew");
                        PasswordUnifiedPluginNew.access$600(PasswordUnifiedPluginNew.this).processError(mICRpcResponse, true);
                    }
                    PasswordUnifiedPluginNew.this.writeBehavorWithPlus("UC-MobileIC-20191030-3", "FAIL", "wallet_cn", "pluginNew");
                }
            }
        });
    }

    public void setKeyboardParentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38714033", new Object[]{this, view});
        } else {
            this.y = view;
        }
    }

    public Animation shakeAnimation(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("888049d8", new Object[]{this, new Integer(i)});
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 10.0f, 0.0f, 0.0f);
        translateAnimation.setInterpolator(new CycleInterpolator(i));
        translateAnimation.setDuration(500L);
        return translateAnimation;
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin, com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public boolean updateAttr(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a285a79", new Object[]{this, str, str2})).booleanValue();
        }
        if (c(str, str2)) {
            return true;
        }
        BaseFBPlugin baseFBPlugin = VIFBPluginManager.mBackPlugin;
        if (baseFBPlugin != null) {
            baseFBPlugin.updateAttr(str, str2);
            return true;
        } else if (super.updateAttr(str, str2)) {
            return true;
        } else {
            return false;
        }
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public boolean updateFunc(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9446144c", new Object[]{this, str, str2})).booleanValue();
        }
        if (str.equals(Constants.Event.FOCUS)) {
            this.B = true;
            this.r.setAutoFocus(this);
            if (this.r.isOnloadFinish()) {
                this.z.requestFocus();
                d();
            }
            return true;
        } else if (!str.equals(Constants.Event.BLUR)) {
            return false;
        } else {
            this.B = false;
            hiddenKeyboardService(f().decorView, true);
            return true;
        }
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
            if (!TextUtils.isEmpty(this.v)) {
                hashMap.put("plusPwdType", "pwd");
            } else {
                hashMap.put("plusPwdType", "plus_pwd");
            }
            VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, str, com.alipay.mobile.verifyidentity.common.Constants.VI_ENGINE_APPID, "aavca", this.mModule.getToken(), this.mModule.getVerifyId(), null, hashMap);
        } catch (Throwable th) {
            VerifyLogCat.i("PasswordUnifiedPluginNew", "writeBehavorWithPlus error:" + th.getMessage());
        }
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
            InitDataModel initDataModel = this.t;
            if (initDataModel == null || TextUtils.isEmpty(initDataModel.decisionToPwd)) {
                hashMap.put("plusPwdType", "plus_pwd");
            } else {
                hashMap.put("plusPwdType", "pwd");
            }
            VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, str, com.alipay.mobile.verifyidentity.common.Constants.VI_ENGINE_APPID, "aksbhas", this.mModule.getToken(), this.mModule.getVerifyId(), null, hashMap);
        } catch (Throwable th) {
            VerifyLogCat.e("PasswordUnifiedPluginNew", th);
        }
    }

    public void initPwdInput() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c01349c4", new Object[]{this});
            return;
        }
        VerifyLogCat.i("PasswordUnifiedPluginNew", "[initPwdInput] isSimplePwd: " + this.isSimplePwd + ", mType: " + this.A);
        this.mPwdInputLayout = (LinearLayout) this.x.findViewById(R.id.paypwd_layout);
        this.mSafeInputContext = new SafeInputContext((Activity) this.q, this.isSimplePwd);
        this.mShowInputTime = System.currentTimeMillis();
        SafeInputContext safeInputContext = this.mSafeInputContext;
        if (safeInputContext != null) {
            safeInputContext.setOnConfirmListener(new OnConfirmListener() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordUnifiedPluginNew.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.verifyidentity.safepaybase.OnConfirmListener
                public void onUserConfirm(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d51cf727", new Object[]{this, str});
                        return;
                    }
                    VerifyLogCat.i(PasswordUnifiedPluginNew.access$000(), "safeInputContext onUserConfirm");
                    PasswordUnifiedPluginNew.this.hideKeyboard();
                    HashMap hashMap = new HashMap();
                    hashMap.put("inputCost", String.valueOf(System.currentTimeMillis() - PasswordUnifiedPluginNew.this.mShowInputTime));
                    StringBuilder sb = new StringBuilder();
                    sb.append(PasswordUnifiedPluginNew.this.mInputChangeCount);
                    hashMap.put("inputChangeCount", sb.toString());
                    hashMap.put("type", "user_confirm");
                    PasswordUnifiedPluginNew.access$100(PasswordUnifiedPluginNew.this, "UC-MobileIC-20210326-4", hashMap);
                    PasswordUnifiedPluginNew.this.mShowInputTime = System.currentTimeMillis();
                    PasswordUnifiedPluginNew passwordUnifiedPluginNew = PasswordUnifiedPluginNew.this;
                    passwordUnifiedPluginNew.mInputChangeCount = 0L;
                    passwordUnifiedPluginNew.updateVerifyStatus("end");
                    PasswordUnifiedPluginNew.access$200(PasswordUnifiedPluginNew.this, str);
                }
            });
            this.mSafeInputContext.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordUnifiedPluginNew.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnFocusChangeListener
                public void onFocusChange(View view, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1621df92", new Object[]{this, view, new Boolean(z)});
                        return;
                    }
                    String access$000 = PasswordUnifiedPluginNew.access$000();
                    VerifyLogCat.i(access$000, "safeInputContext onFocusChange: " + z);
                    PasswordUnifiedPluginNew.this.onFocusChange(view, z);
                }
            });
            this.mSafeInputContext.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordUnifiedPluginNew.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    VerifyLogCat.i(PasswordUnifiedPluginNew.access$000(), "safeInputContext onClick");
                    PasswordUnifiedPluginNew.this.onClick(view);
                }
            });
            this.mSafeInputContext.setRsaPublicKey(this.mPubKey);
            this.mSafeInputContext.setEncryptRandomStringAndType(this.mTimestamp, EncryptRandomType.randomafter);
            this.mSafeInputContext.setTextWatcherListener(new TextWatcherListener() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordUnifiedPluginNew.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.verifyidentity.safepaybase.TextWatcherListener
                public void onTextChanged() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c9b011ef", new Object[]{this});
                        return;
                    }
                    PasswordUnifiedPluginNew.this.mInputChangeCount++;
                    VerifyLogCat.i(PasswordUnifiedPluginNew.access$000(), "onTextChanged:" + PasswordUnifiedPluginNew.this.mInputChangeCount);
                }
            });
            setSafeKeyboardSoftInput(this.mSafeInputContext.getEditText());
            this.mPwdInputLayout.removeAllViews();
            this.mPwdInputLayout.addView(this.mSafeInputContext.getContentView());
            this.mSafeInputContext.getContentView().setVisibility(0);
            this.mPwdInputLayout.setVisibility(0);
            EditText editText = this.mSafeInputContext.getEditText();
            this.z = editText;
            editText.addTextChangedListener(new TextWatcher() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.PasswordUnifiedPluginNew.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("77fdbb29", new Object[]{this, editable});
                    } else if (PasswordUnifiedPluginNew.access$300(PasswordUnifiedPluginNew.this)) {
                        PasswordUnifiedPluginNew.access$400(PasswordUnifiedPluginNew.this, "onPwdChanged", String.valueOf(editable.length()));
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
                this.z.setHint(actConf2);
            }
        }
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
            VerifyLogCat.w("PasswordUnifiedPluginNew", "failed to invode setSoftInputShownOnFocus");
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin
    public void addPlugin(String str, String str2, ModuleDataModel moduleDataModel, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84995292", new Object[]{this, str, str2, moduleDataModel, bundle});
            return;
        }
        this.w = false;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("needFindExist", true);
        super.addPlugin(str, str2, moduleDataModel, bundle);
    }

    public final boolean c(String str, String str2) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        if (TextUtils.equals(str, "src")) {
            try {
                jSONObject = JSON.parseObject(str2);
            } catch (Throwable th) {
                VerifyLogCat.e("PasswordUnifiedPluginNew", "onPwdBNAction exp: ", th);
                jSONObject = null;
            }
            if (jSONObject != null && "pageEvent".equalsIgnoreCase(jSONObject.getString("action"))) {
                VerifyLogCat.i("PasswordUnifiedPluginNew", "receive pageEvent");
                if (!TextUtils.isEmpty(this.top_to_product)) {
                    updateVerifyStatusNew("end");
                    this.u.changeToBack();
                    clear();
                    IDecisionHelper iDecisionHelper = new IDecisionHelper();
                    iDecisionHelper.recordBehavior("BACK_TO_BIO_PAY", "", this.mModule.getVerifyId(), "");
                    iDecisionHelper.saveFeature(0L, "PWD_TO_BIO", "", "USER_ACTION", this.mModule.getVerifyId(), "", "", "");
                }
                return true;
            }
        }
        return false;
    }

    public final void d() {
        View view;
        int i;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        VerifyLogCat.d("PasswordUnifiedPluginNew", "showKeyboard isSimplePwd: " + this.isSimplePwd);
        try {
            if (this.mAlipayKeyboard == null) {
                DecorViewInfo f = f();
                View view2 = f.decorView;
                if (!f.isDialog && !this.r.isFullscreen()) {
                    z = true;
                }
                if (this.r.isFullscreen()) {
                    view = getKeyboardParentView();
                } else {
                    view = view2.findViewById(16908290);
                }
                if (!z && view == null) {
                    if (this.w) {
                        i = R.id.keyboard_layout;
                    } else {
                        i = ResUtils.getResourceId(this.q, "flybird_main_layout", "id", "com.alipay.android.app");
                    }
                    setKeyboardParentView(view2.findViewById(i));
                    view = getKeyboardParentView();
                }
                initKeyBoard(view);
            }
            if (this.isSimplePwd) {
                this.mSafeInputContext.getEditText().requestFocus();
                this.mAlipayKeyboard.showKeyboard(AliKeyboardType.num, this.mSafeInputContext.getEditText(), 0L);
                return;
            }
            this.mSafeInputContext.getEditText().requestFocus();
            this.mAlipayKeyboard.showKeyboard(AliKeyboardType.abc, this.mSafeInputContext.getEditText(), 0L);
        } catch (Throwable th) {
            VerifyLogCat.e("PasswordUnifiedPluginNew", th);
        }
    }

    public final void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        VerifyLogCat.i("PasswordUnifiedPluginNew", "initOtherProduct product: " + str);
        if (!TextUtils.isEmpty(str)) {
            this.isIntellDecison = false;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("actionText", (Object) str);
            jSONObject.put("callBackType", "1");
            jSONObject.put("hideIfClick", (Object) Boolean.TRUE);
            doCommonAction(BaseFBPlugin.PLUGIN_ACTION.viShowNavRightView, jSONObject);
        } else if (!TextUtils.isEmpty(this.top_to_product)) {
            this.isIntellDecison = true;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("actionText", (Object) this.top_to_product);
            jSONObject2.put("viType", (Object) this.backToBioViType);
            jSONObject2.put("callBackType", "1");
            jSONObject2.put("hideIfClick", (Object) Boolean.TRUE);
            doCommonAction(BaseFBPlugin.PLUGIN_ACTION.viShowNavRightView, jSONObject2);
        }
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
            VerifyLogCat.e("PasswordUnifiedPluginNew", "json fail " + mICRpcResponse.data, e);
            jSONObject = null;
        }
        if (jSONObject == null) {
            return false;
        }
        String string = jSONObject.getString(PayPwdModule.SHOW_FIND_PWD);
        if (hashMap != null) {
            hashMap.put(PayPwdModule.FIND_PWD_TXT, jSONObject.getString(PayPwdModule.FIND_PWD_TXT));
        }
        VerifyLogCat.i("PasswordUnifiedPluginNew", "showFindPwd: " + string);
        return TextUtils.isEmpty(string) || "Y".equalsIgnoreCase(string);
    }

    public void writePwdBehavorLog(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a085ed4", new Object[]{this, str, str2, str3, str4});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("module", this.mModule.getLogicModuleName());
        hashMap.put("code", str2);
        hashMap.put("source", str3);
        hashMap.put("ui_type", str4);
        VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, str, com.alipay.mobile.verifyidentity.common.Constants.VI_ENGINE_APPID, "aavca", this.mModule.getToken(), this.mModule.getVerifyId(), null, hashMap);
    }
}
