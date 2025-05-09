package com.ali.user.mobile.model;

import android.text.TextUtils;
import com.alipay.android.msp.ui.views.MspWebActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.tn1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class LoginType {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class LocalLoginType {
        public static final String ALIPAY_TRUST_LOGIN = "alipayTrustLogin";
        public static final String ASO_LOGIN = "asoLogin";
        public static final String AUTO_LOGIN = "autologin";
        public static final String BIO_LOGIN = "bioLogin";
        public static final String EMAIL_CODE_LOGIN = "emailLogin";
        public static final String EMAIL_CODE_REG = "emailReg";
        public static final String LOGIN2REGISTER_LOGIN = "login2Register";
        public static final String LOGIN_TYPE_ALIPAY = "alipayLogin";
        public static final String LOGIN_TYPE_ALIPAY_HK = "alipayHKLogin";
        public static final String LOGIN_TYPE_NETEASE = "neteaseLogin";
        public static final String LOGIN_TYPE_QQ = "tencentLogin";
        public static final String LOGIN_TYPE_UMID = "umidLastAccountSimVerify";
        public static final String LOGIN_TYPE_WEIXIN = "wechatLogin";
        public static final String MOBILE_VERIFY_LOGIN = "mobileVerifyLogin";
        public static final String NICK_SMS_LOGIN = "nickSmsLogin";
        public static final String ONE_KEY_REGISTER_LOGIN = "oneKeyRegister";
        public static final String OVERSEA_SIM_LOGIN = "overseaSimLogin";
        public static final String PWD_LOGIN = "pwdLogin";
        public static final String RETRIVE_PWD_LOGIN = "retrivePwd";
        public static final String SCAN_FACE_LOGIN = "scanfaceLogin";
        public static final String SIM_LOGIN = "simLogin";
        public static final String SMS_LOGIN = "smsLogin";
        public static final String SSO_LOGIN = "tbssoLogin";
        public static final String TOKEN_LOGIN = "tokenLogin";
        public static final String UMID_LOGIN = "umidLogin";

        static {
            t2o.a(68157538);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum ServerLoginType {
        BIOLOGIN(LocalLoginType.BIO_LOGIN),
        SMSLogin(LocalLoginType.SMS_LOGIN),
        SimLogin(LocalLoginType.SIM_LOGIN),
        OverseaSimLogin(LocalLoginType.OVERSEA_SIM_LOGIN),
        MobileVerifyLogin(LocalLoginType.MOBILE_VERIFY_LOGIN),
        AutoLogin(MspWebActivity.V2_FUNCTION_AUTOLOGIN),
        TokenLogin("tokenlogin"),
        UnifySsoLogin("unifysso"),
        QrLogin("qrLogin"),
        TaobaoSSOLogin("taobao"),
        AlipaySSOLogin("alipayAso"),
        FaceLogin(TokenType.FACE_LOGIN),
        LoginTypeQQ("qq"),
        LoginTypeWeixin(tn1.KEY_SHARE_CONFIG_WEIXIN),
        LoginTypeWeibo("weibo"),
        LoginTypeRegister("register"),
        CheckSession("checksession"),
        MergeAccount(TokenType.MERGE_ACCOUNT),
        TouristLogin("touristLogin"),
        PasswordLogin("password"),
        EmailLogin("emailLogin"),
        EmailReg(LocalLoginType.EMAIL_CODE_REG);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String type;

        ServerLoginType(String str) {
            this.type = str;
        }

        public static /* synthetic */ Object ipc$super(ServerLoginType serverLoginType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/model/LoginType$ServerLoginType");
        }

        public static ServerLoginType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ServerLoginType) ipChange.ipc$dispatch("f03e1079", new Object[]{str});
            }
            return (ServerLoginType) Enum.valueOf(ServerLoginType.class, str);
        }

        public String getType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
            }
            return this.type;
        }
    }

    static {
        t2o.a(68157537);
    }

    public static String convert(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3e1bbd1c", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (LocalLoginType.PWD_LOGIN.equals(str)) {
            return ServerLoginType.PasswordLogin.getType();
        }
        if (LocalLoginType.AUTO_LOGIN.equals(str)) {
            return ServerLoginType.AutoLogin.getType();
        }
        if (LocalLoginType.ASO_LOGIN.equals(str) || LocalLoginType.ALIPAY_TRUST_LOGIN.equals(str) || LocalLoginType.LOGIN_TYPE_ALIPAY.equals(str)) {
            return ServerLoginType.AlipaySSOLogin.getType();
        }
        if (LocalLoginType.SSO_LOGIN.equals(str)) {
            return ServerLoginType.TaobaoSSOLogin.getType();
        }
        if (LocalLoginType.SCAN_FACE_LOGIN.equals(str)) {
            return ServerLoginType.FaceLogin.getType();
        }
        if (LocalLoginType.LOGIN2REGISTER_LOGIN.equals(str) || "oneKeyRegister".equals(str)) {
            return ServerLoginType.LoginTypeRegister.getType();
        }
        if (LocalLoginType.LOGIN_TYPE_WEIXIN.equals(str)) {
            return ServerLoginType.LoginTypeWeixin.getType();
        }
        return LocalLoginType.LOGIN_TYPE_QQ.equals(str) ? ServerLoginType.LoginTypeQQ.getType() : str;
    }
}
