package com.alipay.mobile.common.netsdkextdependapi.userinfo;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class UserInfoManagerAdapter implements UserInfoManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.common.netsdkextdependapi.userinfo.UserInfoManager
    public String getLastUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bfdd2dc7", new Object[]{this});
        }
        return "";
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.userinfo.UserInfoManager
    public boolean login() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99739774", new Object[]{this})).booleanValue();
        }
        return true;
    }
}
