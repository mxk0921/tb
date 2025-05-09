package com.ali.user.mobile.login.ui;

import com.ali.user.mobile.utils.CommonUtil;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class LoginClickAction {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int ACTION_LOGIN = 0;
    public static int ACTION_ALIPAY = 1;
    public static int ACTION_FACE = 2;
    public static int ACTION_SEND_SMS = 3;
    public static int ACTION_PWD = 4;
    public static int ACTION_FIND_PWD = 5;
    public static int ACTION_REG_SEND_SMS = 6;
    public static int ACTION_REG = 7;
    public static int ACTION_FINGER = 8;
    public static int ACTION_EMAIL_SEND = 9;
    public static int ACTION_GOOGLE_LOGIN = 11;
    public static int ACTION_FACEBOOK_LOGIN = 12;
    public static int ACTION_ALIPAYHK_LOGIN = 13;
    public static int ACTION_ONEKEY_HISTORY = 14;
    public static int ACTION_SIM_VERIFY = 15;
    public static int ACTION_LINE_LOGIN = 16;
    public static int ACTION_AUTO_LOGIN = 17;

    static {
        t2o.a(70254797);
    }

    public static boolean canShowAutoCheckbox(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("935e7ca1", new Object[]{new Integer(i)})).booleanValue();
        }
        if (!CommonUtil.autoCheckbox() || isSNS(i)) {
            return false;
        }
        return true;
    }

    public static boolean isSNS(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29429832", new Object[]{new Integer(i)})).booleanValue();
        }
        if (i == ACTION_ALIPAYHK_LOGIN || i == ACTION_ALIPAY || i == ACTION_FACEBOOK_LOGIN || i == ACTION_GOOGLE_LOGIN || i == ACTION_LINE_LOGIN) {
            return true;
        }
        return false;
    }

    public static boolean supportXianyu(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c97d89d7", new Object[]{new Integer(i)})).booleanValue();
        }
        if (i == ACTION_LOGIN || i == ACTION_ALIPAY || i == ACTION_SEND_SMS || i == ACTION_REG_SEND_SMS || i == ACTION_REG) {
            return true;
        }
        return false;
    }
}
