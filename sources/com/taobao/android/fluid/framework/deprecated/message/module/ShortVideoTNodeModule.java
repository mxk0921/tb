package com.taobao.android.fluid.framework.deprecated.message.module;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.deprecated.message.module.proxy.ShortVideoTNodeModuleProxy;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ShortVideoTNodeModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468714340);
        t2o.a(503316559);
    }

    public static void sendMessage(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ef8e20d", new Object[]{jVar});
        } else {
            ShortVideoTNodeModuleProxy.sendMessage(jVar);
        }
    }
}
