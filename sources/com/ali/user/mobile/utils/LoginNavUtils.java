package com.ali.user.mobile.utils;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.orange.OrangeConfig;
import com.taobao.tlog.adapter.AdapterForTLog;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class LoginNavUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEY_LARGESCREENSTYLE = "largescreenstyle";
    private static final String ORANGE_LARGESCREENSTYLE_VAL = "login_largescreenstyle";
    public static final String TAG = "login.AddressNavUtils";
    private static final String VAL_FULLSCREEN = "fullscreen";

    static {
        t2o.a(68157643);
    }

    public static String preHandleUri(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8e709a16", new Object[]{context, str});
        }
        try {
            String str2 = "largescreenstyle=" + OrangeConfig.getInstance().getConfig(LoginSwitch.CONFIG_GROUP_LOGIN, ORANGE_LARGESCREENSTYLE_VAL, "fullscreen");
            if (str.contains("?")) {
                str = str + "&" + str2;
            } else {
                str = str + "?" + str2;
            }
            AdapterForTLog.logd(TAG, "preHandleUri " + str);
        } catch (Throwable th) {
            AdapterForTLog.loge(TAG, "preHandleUri error dump", th);
        }
        return str;
    }
}
