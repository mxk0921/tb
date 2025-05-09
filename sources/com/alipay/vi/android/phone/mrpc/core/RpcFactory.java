package com.alipay.vi.android.phone.mrpc.core;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Annotation;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class RpcFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f4566a;
    public final Config b;
    public final RpcInvoker c = new RpcInvoker(this);
    public final Map<Class<? extends Annotation>, RpcInterceptor> d = new HashMap();

    public RpcFactory(Config config) {
        this.b = config;
    }

    public void addRpcInterceptor(Class<? extends Annotation> cls, RpcInterceptor rpcInterceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7ce94e5", new Object[]{this, cls, rpcInterceptor});
        } else {
            ((HashMap) this.d).put(cls, rpcInterceptor);
        }
    }

    public RpcInterceptor findRpcInterceptor(Class<? extends Annotation> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcInterceptor) ipChange.ipc$dispatch("d9403d49", new Object[]{this, cls});
        }
        return (RpcInterceptor) ((HashMap) this.d).get(cls);
    }

    public Config getConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Config) ipChange.ipc$dispatch("80da21e5", new Object[]{this});
        }
        return this.b;
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.f4566a;
    }

    public <T> T getRpcProxy(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("eba1321b", new Object[]{this, cls});
        }
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new RpcInvocationHandler(this.b, cls, this.c));
    }

    public void setContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else {
            this.f4566a = context;
        }
    }
}
