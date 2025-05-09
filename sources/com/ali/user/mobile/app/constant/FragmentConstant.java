package com.ali.user.mobile.app.constant;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class FragmentConstant {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALIPAY_FRAGMENT_TAG = "aliuser_alipay";
    public static final String ALIPAY_HISTORY_FRAGMENT_TAG = "aliuser_alipay_history";
    public static final String AUTH_FRAGMENT_TAG = "aliuser_auth_fragment";
    public static final String EMAIL_CODE_FRAGMENT_TAG = "aliuser_emailcode_login";
    public static final String FACE_LOGIN_FRAGMENT_TAG = "aliuser_face_login";
    public static final String FAST_FRAGMENT = "aliuser_fast";
    public static final String FINGER_FRAGMENT = "aliuser_finger";
    public static final String GUIDE_FRAGMENT_TAG = "aliuser_guide_login";
    public static final String LOGIN_SMSCODE_FRAGMENT_TAG = "aliuser_smscode_login";
    public static final String MOBILE_LOGIN_FRAGMENT_TAG = "aliuser_mobile_login";
    public static final String ONE_KEY_LOGIN_FRAGMENT_TAG = "aliuser_onekey_login";
    public static final String ONE_KEY_LOGIN_HISTORY_FRAGMENT_TAG = "aliuser_onekey_login_history";
    public static final String PWD_LOGIN_FRAGMENT_TAG = "aliuser_pwd_login";
    public static final String QRCODE_LOGIN_FRAGMENT_TAG = "aliuser_qrcode_login";
    public static final String RECOMMEND_LOGIN_FRAGMENT_TAG = "aliuser_recommend_login";
    public static final String REG_FRAGMENT_TAG = "aliuser_reg";
    public static final String REG_SMSCODE_FRAGMENT_TAG = "aliuser_smscode_reg";
    public static final String SNS_TO_SMS_LOGIN_FRAGMENT_TAG = "aliuser_sns_to_sms";

    static {
        t2o.a(68157446);
    }

    public static List<String> getFragmentTagList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b2f688ee", new Object[0]);
        }
        return Arrays.asList(GUIDE_FRAGMENT_TAG, AUTH_FRAGMENT_TAG, MOBILE_LOGIN_FRAGMENT_TAG, PWD_LOGIN_FRAGMENT_TAG, FACE_LOGIN_FRAGMENT_TAG, ONE_KEY_LOGIN_FRAGMENT_TAG, LOGIN_SMSCODE_FRAGMENT_TAG, EMAIL_CODE_FRAGMENT_TAG, RECOMMEND_LOGIN_FRAGMENT_TAG, ONE_KEY_LOGIN_HISTORY_FRAGMENT_TAG, ALIPAY_HISTORY_FRAGMENT_TAG, ALIPAY_FRAGMENT_TAG, FINGER_FRAGMENT, FAST_FRAGMENT, SNS_TO_SMS_LOGIN_FRAGMENT_TAG, QRCODE_LOGIN_FRAGMENT_TAG);
    }

    public static List<String> getRegFragmentTagList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("510ce0f6", new Object[0]);
        }
        return Arrays.asList(REG_SMSCODE_FRAGMENT_TAG, REG_FRAGMENT_TAG);
    }
}
