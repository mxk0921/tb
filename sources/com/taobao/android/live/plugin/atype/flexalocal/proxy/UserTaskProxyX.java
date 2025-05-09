package com.taobao.android.live.plugin.atype.flexalocal.proxy;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.usertask.TBLiveBaseCommonPlugin;
import com.taobao.android.live.plugin.proxy.usertask.IUserTaskProxy;
import tb.t2o;
import tb.u7e;
import tb.vae;
import tb.ysv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class UserTaskProxyX implements IUserTaskProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699621);
        t2o.a(806355298);
    }

    @Override // com.taobao.android.live.plugin.proxy.usertask.IUserTaskProxy
    public u7e createUserController(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u7e) ipChange.ipc$dispatch("de6429ee", new Object[]{this, str, str2});
        }
        return new ysv(str, str2);
    }

    @Override // com.taobao.android.live.plugin.proxy.usertask.IUserTaskProxy
    public vae createWVPluginClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vae) ipChange.ipc$dispatch("26dcdb3d", new Object[]{this});
        }
        return new TBLiveBaseCommonPlugin();
    }
}
