package com.alipay.mobile.common.netsdkextdependapi.userinfo;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class UserInfoUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final String getLastUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bfdd2dc7", new Object[0]);
        }
        return UserInfoManagerFactory.getInstance().getDefaultBean().getLastUserId();
    }

    public static boolean login() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99739774", new Object[0])).booleanValue();
        }
        return UserInfoManagerFactory.getInstance().getDefaultBean().login();
    }
}
