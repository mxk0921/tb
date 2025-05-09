package com.taobao.message.notification.util;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SwitchUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(610271345);
    }

    public static boolean isNewLocalPush() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bf3a6ba", new Object[0])).booleanValue();
        }
        return TextUtils.equals("1", OrangeConfig.getInstance().getConfig("mpm_business_switch", "useNewLocalPush", "1"));
    }
}
