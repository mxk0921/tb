package com.taobao.android;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AliLoginImp implements AliLoginInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.AliLoginInterface
    public boolean checkSessionValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("edaaf5b9", new Object[]{this})).booleanValue();
        }
        return Login.checkSessionValid();
    }

    @Override // com.taobao.android.AliLoginInterface
    public String getNick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d48c0c0", new Object[]{this});
        }
        return Login.getNick();
    }

    @Override // com.taobao.android.AliLoginInterface
    public String getUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
        }
        return Login.getUserId();
    }

    @Override // com.taobao.android.AliLoginInterface
    public void login(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95000964", new Object[]{this, new Boolean(z)});
        } else {
            Login.login(z);
        }
    }
}
