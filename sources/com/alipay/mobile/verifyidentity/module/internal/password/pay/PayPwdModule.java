package com.alipay.mobile.verifyidentity.module.internal.password.pay;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.alipay.mobile.verifyidentity.data.DefaultModuleResult;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.alipay.mobile.verifyidentity.module.internal.password.pay.model.AMInitDataModel;
import com.alipay.mobile.verifyidentity.module.internal.password.pay.model.InitDataModel;
import com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.AbsPayPwdActivity;
import com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.PayPwdFullActivity;
import com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.PayPwdHalfActivity;
import com.alipay.mobile.verifyidentity.module.internal.password.pay.utils.AMModelHandler;
import com.alipay.mobile.verifyidentity.utils.VIUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.BottomSheetComponentInterface;
import java.util.HashMap;
import tb.abk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class PayPwdModule extends MicroModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_TIP = "pwd_action";
    public static final String ADD_PPW_TEXT = "addPPWText";
    public static final String ADD_PPW_URL = "addPpwUrl";
    public static final String COMPLETE_PPW = "complete_ppw";
    public static final String CONTENT = "footRemark";
    public static final String FORM_BTN = "from_btn";
    public static final String FORM_TIP_LOW = "form_tip_low";
    public static final String FORM_TIP_PLACEHOLDER = "form_tip_placeholder";
    public static final String FORM_TIP_URL = "form_tip_url";
    public static final String HAVE_PPW = "havePpw";
    public static final String IS_FIND_PPW = "isFindPPW";
    public static final String IS_IPAY = "isIPay";
    public static final String IS_SIMPLE_PWD = "isSimplePwd";
    public static final String KEY = "pubKey";
    public static final String LOADING_TIP = "loadingTip";
    public static final String OTHERS = "hasOthers";
    public static final String OTHER_TIP = "pwd_other";
    public static final String PASS_TIP = "pwd_PASS";
    public static final String PREDATA = "predata";
    public static final String PROTOCOL = "pwd_protocol";
    public static final String PROTOCOL_URL = "pwd_protocolUrl";
    public static final String PWD_TOP_TIP = "pwdTopTip";
    public static final String REF = "refer";
    public static final String RESET_PWD = "resetPwd";
    public static final String SCENE_ID = "sceneId";
    public static final String SUBTITLE = "subtitle";
    public static final String TIMESTAMP = "timestamp";
    public static final String TITLE = "title";
    public static final String UNINTERRUPT = "uninterrupt";
    public static final String USERNAME = "username";
    public static final String VI_FORBID_JUMP = "forbidJump";
    public static final String VI_LANGUAGE = "viLanguage";
    public static final HashMap<String, Class<? extends AbsPayPwdActivity>> n;
    public Class<? extends AbsPayPwdActivity> k;
    public Bundle l;
    public boolean m;

    static {
        HashMap<String, Class<? extends AbsPayPwdActivity>> hashMap = new HashMap<>();
        n = hashMap;
        hashMap.put(BottomSheetComponentInterface.State.HALF, PayPwdHalfActivity.class);
        hashMap.put(abk.FROM_FULL, PayPwdFullActivity.class);
    }

    public static /* synthetic */ Object ipc$super(PayPwdModule payPwdModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/module/internal/password/pay/PayPwdModule");
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
        } else if (this.l == null || this.k == null) {
            VerifyLogCat.d("PayPwdModule", "wrong input params");
            getMicroModuleContext().notifyAndFinishModule(getVerifyId(), getToken(), getModuleName(), new DefaultModuleResult("2002"));
        } else {
            Intent intent = new Intent(MicroModuleContext.getInstance().getContext(), this.k);
            intent.putExtras(this.l);
            getMicroModuleContext().startActivity(this, intent);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.module.MicroModule
    public void onCreate(String str, String str2, String str3, Bundle bundle) {
        InitDataModel initDataModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3304cdb4", new Object[]{this, str, str2, str3, bundle});
            return;
        }
        if (bundle != null) {
            this.m = bundle.getBoolean(IS_IPAY, false);
            VerifyLogCat.i("PayPwdModule", "isPay:" + str3);
        }
        VerifyLogCat.i("PayPwdModule", "密码渲染数据:" + str3);
        try {
            initDataModel = new AMModelHandler().transferInitModel((AMInitDataModel) JSON.parseObject(str3, AMInitDataModel.class));
        } catch (JSONException e) {
            VerifyLogCat.e("PayPwdModule", "json fail " + str3, e);
            initDataModel = null;
        }
        initLogicModuleName(initDataModel.sourceToPwd);
        Class<? extends AbsPayPwdActivity> cls = n.get(initDataModel.pageStyle);
        this.k = cls;
        if (cls == null) {
            VerifyLogCat.d("PayPwdModule", "page style not recognized");
            this.k = PayPwdHalfActivity.class;
        }
        if (TextUtils.isEmpty(initDataModel.pubKey)) {
            VerifyLogCat.d("PayPwdModule", "支付密码初始化，服务端没有下发公钥");
        } else {
            VerifyLogCat.d("PayPwdModule", "支付密码初始化，服务端下发了公钥");
        }
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
        this.l.putBoolean(IS_IPAY, this.m);
        this.l.putString(FORM_TIP_PLACEHOLDER, initDataModel.form_input_placeholder);
        this.l.putString(FORM_TIP_URL, initDataModel.form_input_tip_url);
        this.l.putString(FORM_TIP_LOW, initDataModel.form_input_tip_low);
        this.l.putString(FORM_BTN, initDataModel.form_button);
        this.l.putString(VI_LANGUAGE, initDataModel.viLanguage);
        this.l.putString(VI_FORBID_JUMP, initDataModel.forbidJump);
        this.l.putBoolean(COMPLETE_PPW, initDataModel.completePPWFlag);
    }
}
