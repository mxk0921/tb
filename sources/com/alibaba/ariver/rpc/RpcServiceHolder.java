package com.alibaba.ariver.rpc;

import android.app.Application;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.remoterpc.MpaasRemoteRpcServiceImpl;
import com.alipay.mobile.framework.service.common.MpaasRpcService;
import com.alipay.mobile.framework.service.common.impl.MpaasRpcServiceImpl;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RpcServiceHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static MpaasRpcService f2446a;

    public static MpaasRpcService get() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MpaasRpcService) ipChange.ipc$dispatch("5c8624b", new Object[0]);
        }
        if (f2446a == null) {
            synchronized (RpcServiceHolder.class) {
                try {
                    if (f2446a == null) {
                        Application applicationContext = ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext();
                        if (ProcessUtils.isMainProcess()) {
                            f2446a = new MpaasRpcServiceImpl(applicationContext);
                        } else {
                            f2446a = new MpaasRemoteRpcServiceImpl(applicationContext);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f2446a;
    }
}
