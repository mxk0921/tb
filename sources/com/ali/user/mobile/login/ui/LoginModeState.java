package com.ali.user.mobile.login.ui;

import com.ali.user.mobile.base.ui.BaseFragment;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.ui.widget.LoginMethodItem;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* JADX WARN: Init of enum BIOMETRIC can be incorrect */
/* JADX WARN: Init of enum EMAIL_CODE_LOGIN can be incorrect */
/* JADX WARN: Init of enum EMAIL_PASSWORD can be incorrect */
/* JADX WARN: Init of enum EMAIL_REG_LOGIN can be incorrect */
/* JADX WARN: Init of enum PASSWORD can be incorrect */
/* JADX WARN: Init of enum SCAN_FACE can be incorrect */
/* JADX WARN: Init of enum SIM_LOGIN can be incorrect */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public enum LoginModeState {
    LOCATION(-1, -1, 8, 0, 8, 8, R.string.aliuser_common_next, R.string.aliuser_common_next_auto, 8, "", "chooseother_location"),
    SMS_LOGIN(R.drawable.aliuser_icon_sms, R.string.aliuser_icon_sms_txt, 0, R.string.aliuser_login_sms_login, 8, 8, R.string.aliuser_signup_verification_getCode2, R.string.aliuser_signup_verification_getCode2_auto, 8, LoginType.LocalLoginType.SMS_LOGIN, "chooseother_sms"),
    PASSWORD(r32, r33, 8, r35, 0, 0, r25, R.string.aliuser_sign_in_title_auto, 8, LoginType.LocalLoginType.PWD_LOGIN, "chooseother_pwd"),
    SCAN_FACE(r46, r47, 8, r52, 8, 8, r52, R.string.aliuser_scan_login_text_auto, 8, LoginType.LocalLoginType.SCAN_FACE_LOGIN, "chooseother_face"),
    SIM_LOGIN(r29, r30, 0, r35, 8, 8, r35, R.string.aliuser_onekey_history_button_text_auto, 0, LoginType.LocalLoginType.SIM_LOGIN, "chooseother_onekey"),
    BIOMETRIC(r43, r44, 8, r49, 8, 8, r49, R.string.aliuser_finger_button_text_auto, 8, LoginType.LocalLoginType.BIO_LOGIN, "chooseother_bio"),
    EMAIL_PASSWORD(-1, -1, 8, R.string.aliuser_oversea_email_pwd_login, 0, 0, r25, r25, 8, LoginType.LocalLoginType.PWD_LOGIN, "chooseother_pwd"),
    EMAIL_REG_LOGIN(-1, -1, 8, r35, 8, 0, r39, r39, 8, "emailLogin", "chooseother_email_reg"),
    EMAIL_CODE_LOGIN(-1, -1, 8, r25, 8, 0, r25, r25, 8, "emailLogin", "chooseother_email");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String controllName;
    public final int icon;
    public final String localLoginType;
    public final int loginBtnText;
    public final int loginBtnTextAuto;
    public final int loginModeName;
    public final int passwordVisibility;
    public final int protocolVisibility;
    public final int regionTVVisibility;
    public final int rightFuncTVVisibility;
    public final int textBelowIcon;

    static {
        int i = R.drawable.aliuser_icon_pwd;
        int i2 = R.string.aliuser_icon_pwd_txt;
        int i3 = R.string.aliuser_login_pwd_login;
        int i4 = R.string.aliuser_sign_in_title;
        int i5 = R.drawable.aliuser_icon_faceid;
        int i6 = R.string.aliuser_icon_face_txt;
        int i7 = R.string.aliuser_scan_login_text;
        int i8 = R.drawable.aliuser_icon_sim;
        int i9 = R.string.aliuser_icon_sim_txt;
        int i10 = R.string.aliuser_onekey_history_button_text;
        int i11 = R.drawable.aliuser_icon_finger;
        int i12 = R.string.aliuser_icon_finger_txt;
        int i13 = R.string.aliuser_finger_button_text;
        int i14 = R.string.aliuser_oversea_email_reg;
        int i15 = R.string.aliuser_reg_instant;
        int i16 = R.string.aliuser_email_button_text;
    }

    LoginModeState(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, String str, String str2) {
        this.loginBtnTextAuto = i8;
        this.icon = i;
        this.textBelowIcon = i2;
        this.regionTVVisibility = i3;
        this.loginModeName = i4;
        this.rightFuncTVVisibility = i5;
        this.passwordVisibility = i6;
        this.loginBtnText = i7;
        this.protocolVisibility = i9;
        this.localLoginType = str;
        this.controllName = str2;
    }

    public static LoginMethodItem create(BaseFragment baseFragment, LoginModeState loginModeState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginMethodItem) ipChange.ipc$dispatch("1cda82ef", new Object[]{baseFragment, loginModeState});
        }
        LoginMethodItem loginMethodItem = new LoginMethodItem();
        if (!(loginModeState == null || baseFragment == null)) {
            loginMethodItem.setTextBelowIcon(baseFragment.getString(loginModeState.textBelowIcon));
            loginMethodItem.setText(baseFragment.getString(loginModeState.loginModeName));
            loginMethodItem.setImage(loginModeState.icon);
        }
        return loginMethodItem;
    }

    public static /* synthetic */ Object ipc$super(LoginModeState loginModeState, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/ui/LoginModeState");
    }

    public static LoginModeState parse(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginModeState) ipChange.ipc$dispatch("ff877783", new Object[]{str});
        }
        LoginModeState loginModeState = LOCATION;
        try {
            return valueOf(str);
        } catch (Exception e) {
            e.printStackTrace();
            return loginModeState;
        }
    }

    public static LoginModeState valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginModeState) ipChange.ipc$dispatch("9d50eeb8", new Object[]{str});
        }
        return (LoginModeState) Enum.valueOf(LoginModeState.class, str);
    }
}
