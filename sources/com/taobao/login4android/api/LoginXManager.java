package com.taobao.login4android.api;

import android.content.Context;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.utils.SharedPreferencesUtil;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LoginXManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(512753709);
    }

    public static boolean isXDevice(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b82d4f41", new Object[]{context})).booleanValue();
        }
        return "true".equals((String) SharedPreferencesUtil.getData(context, LoginConstant.XDEVICE, ""));
    }
}
