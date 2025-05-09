package com.alipay.mobile.verifyidentity.rpc;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class IRpcServiceInjector {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile IRpcServiceInjector b;

    /* renamed from: a  reason: collision with root package name */
    public IRpcService f4433a = null;

    public static IRpcServiceInjector getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRpcServiceInjector) ipChange.ipc$dispatch("f5e8f5f2", new Object[0]);
        }
        if (b == null) {
            synchronized (IRpcServiceInjector.class) {
                try {
                    if (b == null) {
                        b = new IRpcServiceInjector();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public IRpcService getRpcService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRpcService) ipChange.ipc$dispatch("1ac199ab", new Object[]{this});
        }
        return this.f4433a;
    }

    public void inject(IRpcService iRpcService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2306975a", new Object[]{this, iRpcService});
        } else {
            this.f4433a = iRpcService;
        }
    }
}
