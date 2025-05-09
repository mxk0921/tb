package com.alipay.mobile.verifyidentity.module.password.pay;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.alipay.mobile.verifyidentity.data.DefaultModuleResult;
import com.alipay.mobile.verifyidentity.data.ModuleDataModel;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.alipay.mobile.verifyidentity.module.password.pay.model.InitDataModel;
import com.alipay.mobile.verifyidentity.module.password.pay.ui.AbsPayPwdActivity;
import com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity;
import com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdFullActivity;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.VIFBPluginManager;
import com.alipay.mobile.verifyidentity.utils.IDecisionHelper;
import com.alipay.mobile.verifyidentity.utils.VIUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.abk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class PayPwdModule extends MicroModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_TIP = "pwd_action";
    public static final String ADD_PPW_TEXT = "addPPWText";
    public static final String ADD_PPW_URL = "addPpwUrl";
    public static final String CONTENT = "footRemark";
    public static final String FIND_PWD_TXT = "findPwdTxt";
    public static final String HAS_FORGOT_PWD = "has_forgot_pwd";
    public static final String HAVE_PPW = "havePpw";
    public static final String IS_FIND_PPW = "isFindPPW";
    public static final String IS_SIMPLE_PWD = "isSimplePwd";
    public static final String KEY = "pubKey";
    public static final String LOADING_TIP = "loadingTip";
    public static final String OTHERS = "hasOthers";
    public static final String OTHER_TIP = "pwd_other";
    public static final String PASS_TIP = "pwd_PASS";
    public static final String PREDATA = "predata";
    public static final String PROTOCOL = "pwd_protocol";
    public static final String PROTOCOL_URL = "pwd_protocolUrl";
    public static final String PWD_CONTAINS_GORGET_PWD = "pwd_has_forget";
    public static final String PWD_FROM_MSP = "pwd_from_msp";
    public static final String PWD_HIND_OTHER = "hind_other";
    public static final String PWD_INPUT_TIP = "pwd_input_blew_tip";
    public static final String PWD_MODULE_DATA = "pwd_module_data";
    public static final String PWD_MSP_FORGET_TIP = "pwd_msp_forgot_tip";
    public static final String PWD_MSP_FORGET_TO_VERIFY = "pwd_msp_forgot_to_verify";
    public static final String PWD_TOP_TIP = "pwdTopTip";
    public static final String PWD_USE_DIALOG_PWD = "useDialogPwd";
    public static final String REF = "refer";
    public static final String RESET_PWD = "resetPwd";
    public static final String SCENE_ID = "sceneId";
    public static final String SHOW_FIND_PWD = "showFindPwd";
    public static final String STATE_SECRET_FLAG = "mobileic_payment_password_state_secret";
    public static final String SUBTITLE = "subtitle";
    public static final String SWITCH_OTHER = "switchOther";
    public static final String TIMESTAMP = "timestamp";
    public static final String TITLE = "title";
    public static final String UNINTERRUPT = "uninterrupt";
    public static final String USERNAME = "username";
    public Class<? extends AbsPayPwdActivity> k;
    public Bundle l;
    public boolean m;
    public String n;

    public static /* synthetic */ Object ipc$super(PayPwdModule payPwdModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/module/password/pay/PayPwdModule");
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            getMicroModuleContext().notifyAndFinishModule(getVerifyId(), getToken(), getModuleName(), new DefaultModuleResult("2002"));
        }
    }

    public String getPwdModuleData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c429eb7c", new Object[]{this});
        }
        return this.n;
    }

    public void initLogicModuleName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73784eb6", new Object[]{this, str});
        } else if (ModuleConstants.VI_MODULE_NAME_PAYMENT_PASSWORD_PLUS.equalsIgnoreCase(str)) {
            setLogicModuleName(ModuleConstants.VI_MODULE_NAME_PAYMENT_PASSWORD_PLUS);
            VerifyLogCat.i("PayPwdModule", "initLogicModuleName: " + getLogicModuleName());
        }
    }

    @Override // com.alipay.mobile.verifyidentity.module.MicroModule
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // com.alipay.mobile.verifyidentity.module.MicroModule
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else if (!this.m) {
            Bundle bundle = this.l;
            if (bundle == null || this.k == null) {
                VerifyLogCat.d("PayPwdModule", "wrong input params");
                a();
                return;
            }
            IDecisionHelper.sendLocalBroadcast(IDecisionHelper.PWD_ENTER_ACTION, bundle.getString("sceneId"), getVerifyId());
            Intent intent = new Intent(MicroModuleContext.getInstance().getContext(), this.k);
            intent.putExtras(this.l);
            MicroModuleContext.getInstance().setStartActivityMonitor();
            getMicroModuleContext().startActivity(this, intent);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.module.MicroModule
    public void onCreate(String str, String str2, String str3, Bundle bundle) {
        InitDataModel initDataModel;
        BaseFBPlugin baseFBPlugin;
        BaseFBPlugin plugin;
        boolean z = true;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3304cdb4", new Object[]{this, str, str2, str3, bundle});
            return;
        }
        try {
            initDataModel = (InitDataModel) JSON.parseObject(str3, InitDataModel.class);
        } catch (JSONException e) {
            VerifyLogCat.e("PayPwdModule", "json fail " + str3, e);
            initDataModel = null;
        }
        if (initDataModel == null) {
            VerifyLogCat.d("PayPwdModule", "module data can't be converted to jsonobject: " + str3);
            a();
            return;
        }
        this.n = str3;
        initLogicModuleName(initDataModel.sourceToPwd);
        boolean z3 = !abk.FROM_FULL.equalsIgnoreCase(initDataModel.pageStyle);
        boolean z4 = bundle != null ? bundle.getBoolean(VIFBPluginManager.KEY_IS_PLUGIN_MODE) : false;
        this.m = z4;
        if (!z4 && !initDataModel.isPluginMode) {
            z = false;
        }
        this.m = z;
        String str4 = "";
        String string = bundle != null ? bundle.getString("supportEmbedVi") : str4;
        if (bundle != null) {
            str4 = bundle.getString("supportNoPwdUI");
        }
        if (!TextUtils.isEmpty(initDataModel.sourcePluginName) && (plugin = VIFBPluginManager.getPlugin(getVerifyId(), initDataModel.sourcePluginName)) != null) {
            String actConf = plugin.getActConf(BaseFBPlugin.ACT_CONF.supportVersion);
            string = plugin.getActConf("supportEmbedVi");
            String actConf2 = plugin.getActConf("supportNoPwdUI");
            if (!TextUtils.isEmpty(actConf) && "2.0".equalsIgnoreCase(actConf)) {
                z2 = z3;
            }
            String actConf3 = plugin.getActConf("usePwd");
            ModuleDataModel moduleDataModel = new ModuleDataModel();
            moduleDataModel.token = str2;
            moduleDataModel.data = str3;
            moduleDataModel.nextStep = getModuleName();
            JSONObject jSONObject = (JSONObject) JSON.toJSON(moduleDataModel);
            if (z2) {
                jSONObject.put("version", (Object) "2.0");
            }
            if (!TextUtils.isEmpty(actConf3)) {
                jSONObject.put("usePwd", (Object) actConf3);
            }
            plugin.doCommonAction(BaseFBPlugin.PLUGIN_ACTION.viToPWD, jSONObject);
            if (!this.m) {
                z3 = z2;
                str4 = actConf2;
            } else {
                return;
            }
        }
        if (this.m) {
            if (TextUtils.equals(str4, "Y")) {
                baseFBPlugin = VIFBPluginManager.getPlugin(getVerifyId(), "PasswordPluginWithoutUI");
            } else if (TextUtils.equals(string, "Y")) {
                baseFBPlugin = VIFBPluginManager.getPlugin(getVerifyId(), "PasswordUnifiedPluginNew");
            } else {
                baseFBPlugin = VIFBPluginManager.getPlugin(getVerifyId(), "PasswordInputUnifiedPlugin");
            }
            if (baseFBPlugin != null) {
                VerifyLogCat.i("PayPwdModule", "PasswordInputUnifiedPlugin Mode!");
                baseFBPlugin.bindModule(this, str3);
                return;
            }
            return;
        }
        if (z3 || !abk.FROM_FULL.equalsIgnoreCase(initDataModel.pageStyle)) {
            this.k = PayPwdDialogActivity.class;
        } else {
            this.k = PayPwdFullActivity.class;
        }
        if (TextUtils.isEmpty(initDataModel.pubKey)) {
            VerifyLogCat.d("PayPwdModule", "支付密码初始化，服务端没有下发公钥");
        } else {
            VerifyLogCat.d("PayPwdModule", "支付密码初始化，服务端下发了公钥");
        }
        boolean contains = str3.contains(HAS_FORGOT_PWD);
        Bundle bundle2 = new Bundle();
        this.l = bundle2;
        bundle2.putAll(bundle);
        this.l.putBoolean("isSimplePwd", initDataModel.isSimplePPW);
        this.l.putString("pubKey", initDataModel.pubKey);
        this.l.putString("timestamp", initDataModel.timestamp);
        this.l.putString("title", initDataModel.keyHeadline);
        this.l.putString("subtitle", initDataModel.bodyContent);
        this.l.putString("footRemark", initDataModel.keyFootRemark);
        this.l.putString("loadingTip", initDataModel.loadingTip);
        this.l.putBoolean("hasOthers", VIUtils.hasOtherVerifyProduct(str3));
        this.l.putString("username", initDataModel.logonId);
        this.l.putString("refer", initDataModel.refer);
        this.l.putString("predata", initDataModel.predata);
        this.l.putBoolean("isFindPPW", initDataModel.isFindPPW);
        this.l.putString("sourceToPwd", initDataModel.sourceToPwd);
        this.l.putBoolean("havePpw", initDataModel.isExistPPW);
        this.l.putString("addPpwUrl", initDataModel.completePPWUrl);
        this.l.putString("addPPWText", initDataModel.completePPWGuideText);
        this.l.putString("pwd_action", initDataModel.action);
        this.l.putString("pwd_PASS", initDataModel.PASS);
        this.l.putString("pwd_other", initDataModel.other);
        this.l.putString("pwdTopTip", initDataModel.pwdTopTip);
        this.l.putString("sceneId", initDataModel.sceneId);
        this.l.putBoolean("uninterrupt", initDataModel.uninterrupt);
        this.l.putString("pwd_protocol", initDataModel.protocol);
        this.l.putString("pwd_protocolUrl", initDataModel.protocolUrl);
        this.l.putBoolean("resetPwd", initDataModel.resetPwd);
        this.l.putString("switchOther", initDataModel.switchOther);
        this.l.putBoolean(PWD_CONTAINS_GORGET_PWD, contains);
        this.l.putBoolean(HAS_FORGOT_PWD, initDataModel.has_forgot_pwd);
        this.l.putBoolean(PWD_USE_DIALOG_PWD, initDataModel.useDialogPwd);
        this.l.putString("decisionToPwd", initDataModel.decisionToPwd);
        this.l.putString("decisionToPwd_action", initDataModel.decisionToPwd_action);
        this.l.putString(SHOW_FIND_PWD, initDataModel.showFindPwd);
        this.l.putString(FIND_PWD_TXT, initDataModel.findPwdTxt);
        this.l.putString(PWD_MODULE_DATA, str3);
        this.l.putString("htip", initDataModel.hideDecisionTip);
        if (initDataModel.decisionToPwdFromUsePwd) {
            this.l.putString("htip", "Y");
        }
    }
}
