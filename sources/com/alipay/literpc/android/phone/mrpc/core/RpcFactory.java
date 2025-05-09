package com.alipay.literpc.android.phone.mrpc.core;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Proxy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class RpcFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Config f3853a;
    public final RpcInvoker b = new RpcInvoker(this);

    public RpcFactory(Config config) {
        this.f3853a = config;
    }

    public Config getConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Config) ipChange.ipc$dispatch("e9d3ca65", new Object[]{this});
        }
        return this.f3853a;
    }

    public <T> T getRpcProxy(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("eba1321b", new Object[]{this, cls});
        }
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new RpcInvocationHandler(this.f3853a, cls, this.b));
    }
}
