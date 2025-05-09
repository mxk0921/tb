package com.ali.user.mobile.base;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UIBaseConstants {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UT_FROM_REGIST_KEY = "ut_from_register";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface IntentExtrasNamesConstants {
        public static final String NUM_PROTOCOL_NAME = "protocolName";
        public static final String NUM_PROTOCOL_URL = "protocolURL";
        public static final String NUM_SCENE = "scene";
        public static final String PARAM_LOGIN_PARAM = "PARAM_LOGIN_PARAM";
        public static final String PARAM_METHODS = "loginMethods";
        public static final String PARAM_MOBILE_NUMBER = "number";
        public static final String SOURCE = "source";
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface LoginPage {
        public static final String HALF_PAGE_GUIDE_LOGIN = "halfPageGuideLogin";
        public static final String HALF_PAGE_ONEKEY_LOGIN = "halfPageOnekeyLogin";
        public static final String PAGE_LOGIN_TYPE = "pageLoginType";
        public static final String PAGE_ONEKEY_LOGIN = "pageOnekeyLogin";
        public static final String PAGE_PWD_LOGIN = "pagePwdLogin";
        public static final String PAGE_RECOMMEND_LOGIN = "pageRecommendLogin";
        public static final String PAGE_SMS_CODE = "pageSmsCodeLogin";
        public static final String PAGE_SMS_LOGIN = "pageSmsLogin";
    }

    static {
        t2o.a(69206060);
    }

    public static boolean isHalfPage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1f21e41", new Object[]{str})).booleanValue();
        }
        if (TextUtils.equals(LoginPage.HALF_PAGE_GUIDE_LOGIN, str) || TextUtils.equals(LoginPage.HALF_PAGE_ONEKEY_LOGIN, str)) {
            return true;
        }
        return false;
    }
}
