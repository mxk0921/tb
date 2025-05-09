package com.alipay.mobile.verifyidentity.module.internal.password.pay.utils;

import android.text.TextUtils;
import com.alipay.mobile.verifyidentity.module.internal.password.pay.model.AMInitDataModel;
import com.alipay.mobile.verifyidentity.module.internal.password.pay.model.InitDataModel;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.BottomSheetComponentInterface;
import tb.abk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AMModelHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public InitDataModel transferInitModel(AMInitDataModel aMInitDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InitDataModel) ipChange.ipc$dispatch("dbc2a7ab", new Object[]{this, aMInitDataModel});
        }
        InitDataModel initDataModel = new InitDataModel();
        String str = aMInitDataModel.inputType;
        initDataModel.isSimplePPW = false;
        if (!TextUtils.isEmpty(str)) {
            if (str.equals("numeric") || str.equals("number")) {
                initDataModel.isSimplePPW = true;
            } else if (str.equals("text")) {
                initDataModel.isSimplePPW = false;
            }
        }
        initDataModel.pageStyle = BottomSheetComponentInterface.State.HALF;
        if (!aMInitDataModel.half_screen) {
            initDataModel.pageStyle = abk.FROM_FULL;
        }
        initDataModel.form_button = aMInitDataModel.form_button;
        initDataModel.pubKey = aMInitDataModel.account_encrypt_pubkey;
        initDataModel.timestamp = aMInitDataModel.account_encrypt_salt;
        initDataModel.keyHeadline = aMInitDataModel.head_title;
        if (initDataModel.pageStyle.equals(BottomSheetComponentInterface.State.HALF)) {
            initDataModel.bodyContent = aMInitDataModel.form_title;
        } else {
            initDataModel.bodyContent = aMInitDataModel.body_title;
        }
        initDataModel.viLanguage = aMInitDataModel.viLanguage;
        initDataModel.forbidJump = aMInitDataModel.forbidJump;
        initDataModel.loadingTip = "";
        initDataModel.keyFootRemark = aMInitDataModel.form_title;
        initDataModel.logonId = "";
        initDataModel.refer = "";
        initDataModel.predata = aMInitDataModel.predata;
        initDataModel.isFindPPW = true ^ TextUtils.isEmpty(aMInitDataModel.foot_tip);
        initDataModel.sourceToPwd = aMInitDataModel.sourceToPwd;
        initDataModel.sceneId = "";
        initDataModel.completePPWFlag = aMInitDataModel.completePPWFlag;
        initDataModel.completePPWUrl = aMInitDataModel.completePPWUrl;
        initDataModel.completePPWGuideText = "";
        String str2 = aMInitDataModel.form_input_tip_low;
        initDataModel.action = str2;
        initDataModel.PASS = "";
        initDataModel.other = aMInitDataModel.foot_tip;
        initDataModel.pwdTopTip = "";
        initDataModel.isPluginMode = aMInitDataModel.isPluginMode;
        initDataModel.sourcePluginName = aMInitDataModel.sourcePluginName;
        initDataModel.uninterrupt = false;
        initDataModel.protocol = "";
        initDataModel.protocolUrl = "";
        initDataModel.resetPwd = aMInitDataModel.resetPwd;
        initDataModel.form_input_placeholder = aMInitDataModel.form_input_placeholder;
        initDataModel.form_input_tip_url = aMInitDataModel.form_input_tip_url;
        initDataModel.form_input_tip_low = str2;
        return initDataModel;
    }
}
