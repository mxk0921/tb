package com.ali.user.mobile.login.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.base.ui.BaseFragment;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.register.ProtocolModel;
import com.ali.user.mobile.utils.ProtocolHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.activity.auth.AlipayAuth;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.ui.TaobaoRegProtocolDialogFragment;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class CommonLoginRegFragment extends BaseFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "CommonLoginRegFragment";
    public boolean mHeguiPreviousChecked;
    public boolean mPreviousChecked;
    public CheckBox mProtocolCB;
    public CheckBox mProtocolCBXianyu;
    public View mProtocolContent;
    public View mProtocolContentXianyu;
    public TextView mProtocolTV;
    public TextView mProtocolTVXianyu;
    public String mProtocolTitle;
    public String mProtocolUrl;

    static {
        t2o.a(70254783);
    }

    public static /* synthetic */ void access$000(CommonLoginRegFragment commonLoginRegFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d20ac1", new Object[]{commonLoginRegFragment, str});
        } else {
            commonLoginRegFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$100(CommonLoginRegFragment commonLoginRegFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20d35c60", new Object[]{commonLoginRegFragment, str});
        } else {
            commonLoginRegFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$200(CheckBox checkBox) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2dbda9a", new Object[]{checkBox});
        } else {
            clickCheckBox(checkBox);
        }
    }

    public static /* synthetic */ void access$300(CommonLoginRegFragment commonLoginRegFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d5ff9e", new Object[]{commonLoginRegFragment, str});
        } else {
            commonLoginRegFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$400(CommonLoginRegFragment commonLoginRegFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bd7513d", new Object[]{commonLoginRegFragment, str});
        } else {
            commonLoginRegFragment.addControl(str);
        }
    }

    private static void clickCheckBox(CheckBox checkBox) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("900f5261", new Object[]{checkBox});
        } else if (checkBox != null) {
            checkBox.setChecked(true);
        }
    }

    public static /* synthetic */ Object ipc$super(CommonLoginRegFragment commonLoginRegFragment, String str, Object... objArr) {
        if (str.hashCode() == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/ui/CommonLoginRegFragment");
    }

    private static boolean isUnionReg(CheckBox checkBox) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19d0e3a1", new Object[]{checkBox})).booleanValue();
        }
        if (checkBox == null || !checkBox.isChecked()) {
            return false;
        }
        return true;
    }

    public void commonAddCheck(int i, int i2, CheckBox checkBox, CheckBox checkBox2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d336cb9", new Object[]{this, new Integer(i), new Integer(i2), checkBox, checkBox2});
            return;
        }
        boolean supportXianyu = LoginClickAction.supportXianyu(i);
        if (i2 == 0 || isFromOversea()) {
            commonAddCheckTaobaoOnly(i, checkBox);
        } else if (i2 == 1) {
            if (checkBox == null || checkBox.isChecked()) {
                doRealAction(i, true);
            } else if (isFromOversea() || !LoginClickAction.canShowAutoCheckbox(i)) {
                popProtocol(i, checkBox, needAutoReg(), this.mProtocolTitle, this.mProtocolUrl, supportXianyu, supportXianyu);
            } else {
                clickCheckBox(checkBox);
                addControl("checkAgreement_auto");
                doRealAction(i, true);
            }
        } else if (checkBox != null && checkBox.isChecked()) {
            doRealAction(i, isUnionReg(checkBox2));
        } else if (isUnionReg(checkBox2) || !supportXianyu) {
            popProtocol(i, checkBox, needAutoReg(), this.mProtocolTitle, this.mProtocolUrl, false, supportXianyu);
        } else {
            popProtocolWithXianyu(i, checkBox, checkBox2, needAutoReg(), this.mProtocolTitle, this.mProtocolUrl);
        }
    }

    public void commonAddCheckTaobaoOnly(int i, CheckBox checkBox) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("168ef123", new Object[]{this, new Integer(i), checkBox});
        } else if (checkBox == null || checkBox.isChecked()) {
            doRealAction(i);
        } else if (isActive()) {
            if (isFromOversea() || !LoginClickAction.canShowAutoCheckbox(i)) {
                popProtocol(i, checkBox, needAutoReg(), this.mProtocolTitle, this.mProtocolUrl);
                return;
            }
            clickCheckBox(checkBox);
            addControl("checkAgreement_auto");
            doRealAction(i);
        }
    }

    public void doRealAction(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92f3d65d", new Object[]{this, new Integer(i)});
        } else {
            doRealAction(i, false);
        }
    }

    public void generateProtocol(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("309e9448", new Object[]{this, str, str2});
        } else {
            generateProtocol(str, str2, false);
        }
    }

    public void generateXianyuProtocol() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce32a50e", new Object[]{this});
        } else {
            ProtocolHelper.generateProtocol(ProtocolHelper.getProtocolXianyuModel(getActivity()), getActivity(), this.mProtocolTVXianyu, getPageName(), true ^ isChineseLanguage());
        }
    }

    public void goAlipay(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdb32919", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        LoginParam loginParam = new LoginParam();
        loginParam.sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.ASO_LOGIN, getPageName());
        loginParam.utPageName = getPageName();
        loginParam.loginSourceType = LoginType.LocalLoginType.ASO_LOGIN;
        loginParam.alipayInstalled = true;
        HashMap hashMap = new HashMap();
        hashMap.put("sdkTraceId", loginParam.sdkTraceId + "");
        UserTrackAdapter.control(getPageName(), UTConstant.CustomEvent.UT_LOGIN_ACTION, "", LoginType.LocalLoginType.ASO_LOGIN, hashMap);
        AlipayAuth.onAlipayLoginClick(this, z, z2);
    }

    public void goAlipayHK() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbe9a3dc", new Object[]{this});
        } else {
            goAlipay(true, false);
        }
    }

    public void goFacebook() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f179155", new Object[]{this});
        }
    }

    public void goGoogle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2e20548", new Object[]{this});
        }
    }

    public void goLine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddda2383", new Object[]{this});
        }
    }

    public boolean isFromOversea() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54e6172", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean needAutoReg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24fe9ffa", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            try {
                this.mPreviousChecked = arguments.getBoolean("check");
                this.mHeguiPreviousChecked = arguments.getBoolean("xianyu_check");
            } catch (Throwable unused) {
            }
        }
    }

    public void popProtocol(int i, CheckBox checkBox, boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e3dad08", new Object[]{this, new Integer(i), checkBox, new Boolean(z), str, str2});
        } else {
            popProtocol(i, checkBox, z, str, str2, false, false);
        }
    }

    public void popProtocolWithXianyu(final int i, final CheckBox checkBox, final CheckBox checkBox2, boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("713c57f5", new Object[]{this, new Integer(i), checkBox, checkBox2, new Boolean(z), str, str2});
            return;
        }
        uiShown("checkAgreement_dialog");
        final TaobaoRegProtocolDialogFragment taobaoRegProtocolDialogFragment = new TaobaoRegProtocolDialogFragment();
        if (!isChineseLanguage()) {
            taobaoRegProtocolDialogFragment.setUseOrangeColor(true);
            taobaoRegProtocolDialogFragment.setUseUnderLine(true);
        }
        taobaoRegProtocolDialogFragment.setShowXianyu(true);
        taobaoRegProtocolDialogFragment.setNeedAdaptElder(this.needAdaptElder);
        taobaoRegProtocolDialogFragment.setPageNameSpm(getPageName());
        taobaoRegProtocolDialogFragment.needAutoReg(z);
        taobaoRegProtocolDialogFragment.setNegativeBtnText(getResources().getString(R.string.aliuser_protocol_disagree_with_xianyu));
        taobaoRegProtocolDialogFragment.setPostiveBtnText(getResources().getString(R.string.aliuser_agree_with_xianyu));
        taobaoRegProtocolDialogFragment.setNagetive(new View.OnClickListener() { // from class: com.ali.user.mobile.login.ui.CommonLoginRegFragment.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (CommonLoginRegFragment.this.isActive()) {
                    CommonLoginRegFragment.access$300(CommonLoginRegFragment.this, "Agreement_Button_Disagree_Xianyu");
                    taobaoRegProtocolDialogFragment.dismissAllowingStateLoss();
                    CommonLoginRegFragment.access$200(checkBox);
                    CommonLoginRegFragment.this.doRealAction(i, false);
                }
            }
        });
        taobaoRegProtocolDialogFragment.setPositive(new View.OnClickListener() { // from class: com.ali.user.mobile.login.ui.CommonLoginRegFragment.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (CommonLoginRegFragment.this.isActive()) {
                    CommonLoginRegFragment.access$400(CommonLoginRegFragment.this, "Agreement_Button_Agree_Xianyu");
                    taobaoRegProtocolDialogFragment.dismissAllowingStateLoss();
                    CommonLoginRegFragment.access$200(checkBox);
                    CommonLoginRegFragment.access$200(checkBox2);
                    CommonLoginRegFragment.this.doRealAction(i, true);
                }
            }
        });
        taobaoRegProtocolDialogFragment.setOneKeyProtocol(str);
        taobaoRegProtocolDialogFragment.setOneKeyProtocolUrl(str2);
        taobaoRegProtocolDialogFragment.show(getActivity().getSupportFragmentManager(), getPageName());
    }

    public void registerAction(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1871b814", new Object[]{this, new Boolean(z)});
        }
    }

    public void sendCodeAction(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1de68de2", new Object[]{this, new Boolean(z)});
        }
    }

    public boolean showXianyuSeperate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cab88ba9", new Object[]{this})).booleanValue();
        }
        if (LoginStatus.degradeHegui == 2) {
            return true;
        }
        return false;
    }

    public boolean showXianyuTogether() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35f0ab3c", new Object[]{this})).booleanValue();
        }
        if (LoginStatus.degradeHegui == 1) {
            return true;
        }
        return false;
    }

    public void doRealAction(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb87a817", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (i == LoginClickAction.ACTION_REG) {
            registerAction(z);
        } else if (i == LoginClickAction.ACTION_REG_SEND_SMS) {
            sendCodeAction(z);
        } else if (i == LoginClickAction.ACTION_GOOGLE_LOGIN) {
            goGoogle();
        } else if (i == LoginClickAction.ACTION_FACEBOOK_LOGIN) {
            goFacebook();
        } else if (i == LoginClickAction.ACTION_ALIPAY) {
            goAlipay(z);
        } else if (i == LoginClickAction.ACTION_ALIPAYHK_LOGIN) {
            goAlipayHK();
        } else if (i == LoginClickAction.ACTION_LINE_LOGIN) {
            goLine();
        }
    }

    public void generateProtocol(String str, String str2, boolean z) {
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e334a78c", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        FragmentActivity activity = getActivity();
        boolean needAutoReg = needAutoReg();
        if (z && !isFromOversea()) {
            z2 = true;
        }
        ProtocolModel protocolModel = ProtocolHelper.getProtocolModel(activity, str, str2, needAutoReg, z2);
        if (!isChineseLanguage()) {
            protocolModel.protocolItemColor = R.color.aliuser_edittext_bg_color_activated;
        }
        ProtocolHelper.generateProtocol(protocolModel, this.mAttachedActivity, this.mProtocolTV, getPageName(), true ^ isChineseLanguage());
    }

    public void popProtocol(final int i, final CheckBox checkBox, boolean z, String str, String str2, boolean z2, final boolean z3) {
        boolean z4 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("959ce588", new Object[]{this, new Integer(i), checkBox, new Boolean(z), str, str2, new Boolean(z2), new Boolean(z3)});
            return;
        }
        uiShown("checkAgreement_dialog");
        final TaobaoRegProtocolDialogFragment taobaoRegProtocolDialogFragment = new TaobaoRegProtocolDialogFragment();
        if (!isChineseLanguage()) {
            taobaoRegProtocolDialogFragment.setUseOrangeColor(true);
            taobaoRegProtocolDialogFragment.setUseUnderLine(true);
        }
        if (!z2 || !z) {
            z4 = false;
        }
        taobaoRegProtocolDialogFragment.setShowXianyu(z4);
        taobaoRegProtocolDialogFragment.setNeedAdaptElder(this.needAdaptElder);
        taobaoRegProtocolDialogFragment.setPageNameSpm(getPageName());
        taobaoRegProtocolDialogFragment.needAutoReg(z);
        taobaoRegProtocolDialogFragment.setNagetive(new View.OnClickListener() { // from class: com.ali.user.mobile.login.ui.CommonLoginRegFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (CommonLoginRegFragment.this.isActive()) {
                    CommonLoginRegFragment.access$000(CommonLoginRegFragment.this, "Agreement_Button_Cancel");
                    taobaoRegProtocolDialogFragment.dismissAllowingStateLoss();
                }
            }
        });
        taobaoRegProtocolDialogFragment.setPositive(new View.OnClickListener() { // from class: com.ali.user.mobile.login.ui.CommonLoginRegFragment.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (CommonLoginRegFragment.this.isActive()) {
                    CommonLoginRegFragment.access$100(CommonLoginRegFragment.this, "Agreement_Button_Agree");
                    taobaoRegProtocolDialogFragment.dismissAllowingStateLoss();
                    CommonLoginRegFragment.access$200(checkBox);
                    CommonLoginRegFragment.this.doRealAction(i, z3);
                }
            }
        });
        taobaoRegProtocolDialogFragment.setOneKeyProtocol(str);
        taobaoRegProtocolDialogFragment.setOneKeyProtocolUrl(str2);
        taobaoRegProtocolDialogFragment.show(getActivity().getSupportFragmentManager(), getPageName());
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment
    public void initViews(View view) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
            return;
        }
        try {
            CheckBox checkBox = (CheckBox) view.findViewById(R.id.aliuser_reg_checkbox);
            this.mProtocolCB = checkBox;
            ProtocolHelper.setCheckBox(this, checkBox, getPageName(), true, this.mPreviousChecked);
            this.mProtocolContent = view.findViewById(R.id.aliuser_protocol_content);
            this.mProtocolTV = (TextView) view.findViewById(R.id.aliuser_protocol_tv);
            String str = this.mProtocolTitle;
            String str2 = this.mProtocolUrl;
            if (!isFromOversea() && showXianyuTogether()) {
                z = true;
            }
            generateProtocol(str, str2, z);
        } catch (Throwable unused) {
        }
        if (!isFromOversea() && showXianyuSeperate()) {
            try {
                CheckBox checkBox2 = (CheckBox) view.findViewById(R.id.aliuser_reg_checkbox_xianyu);
                this.mProtocolCBXianyu = checkBox2;
                ProtocolHelper.setCheckBox(this, checkBox2, getPageName(), true, this.mHeguiPreviousChecked);
                this.mProtocolContentXianyu = view.findViewById(R.id.aliuser_protocol_content_xianyu);
                this.mProtocolTVXianyu = (TextView) view.findViewById(R.id.aliuser_protocol_tv_xianyu);
                generateXianyuProtocol();
                setVisibility(this.mProtocolContentXianyu, true);
            } catch (Throwable th) {
                LoginTLogAdapter.e(TAG, "xianyu protocol error ", th);
            }
        }
    }

    public void goAlipay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48b32d1b", new Object[]{this, new Boolean(z)});
        } else {
            goAlipay(false, z);
        }
    }

    public void goAlipay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a781a0d9", new Object[]{this});
        } else {
            goAlipay(false, false);
        }
    }
}
