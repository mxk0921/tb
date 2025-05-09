package com.taobao.android.fluid.framework.adapter;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LoginAdapter implements ILoginAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468713819);
        t2o.a(468713810);
    }

    @Override // com.taobao.android.fluid.framework.adapter.IAdapter
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return ILoginAdapter.ADAPTER_NAME;
    }

    @Override // com.taobao.android.fluid.framework.adapter.ILoginAdapter
    public String getNick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d48c0c0", new Object[]{this});
        }
        return Login.getNick();
    }

    @Override // com.taobao.android.fluid.framework.adapter.ILoginAdapter
    public String getUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
        }
        return Login.getUserId();
    }

    @Override // com.taobao.android.fluid.framework.adapter.ILoginAdapter
    public String getUserNickLink() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("481f1c5b", new Object[]{this});
        }
        return Login.getHeadPicLink();
    }

    @Override // com.taobao.android.fluid.framework.adapter.ILoginAdapter
    public boolean isSessionValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f14699db", new Object[]{this})).booleanValue();
        }
        return Login.checkSessionValid();
    }
}
