package com.alipay.mobile.common.rpc;

import android.text.TextUtils;
import com.alipay.mobile.common.rpc.transport.InnerRpcInvokeContext;
import com.alipay.mobile.common.rpc.util.RpcInvokerUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class RpcInvocationHandler implements InvocationHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f4032a;
    public final boolean b;
    public InnerRpcInvokeContext c;
    public Class<?> mClazz;
    public Config mConfig;
    public RpcInvoker mRpcInvoker;

    public RpcInvocationHandler(Config config, Class<?> cls, RpcInvoker rpcInvoker) {
        this(config, cls, rpcInvoker, false);
    }

    public final InnerRpcInvokeContext a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InnerRpcInvokeContext) ipChange.ipc$dispatch("d4b21833", new Object[]{this});
        }
        if (this.c == null) {
            this.c = new InnerRpcInvokeContext();
        }
        return this.c;
    }

    public final InnerRpcInvokeContext b(Method method) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InnerRpcInvokeContext) ipChange.ipc$dispatch("ddbd040b", new Object[]{this, method});
        }
        InnerRpcInvokeContext a2 = a();
        if (a2.resetCookie == null) {
            a2.resetCookie = Boolean.valueOf(isResetCoolie());
        }
        if (a2.bgRpc == null) {
            a2.bgRpc = Boolean.valueOf(this.b);
        }
        if (TextUtils.isEmpty(a2.appKey)) {
            a2.appKey = this.mConfig.getAppKey();
        }
        if (TextUtils.isEmpty(a2.gwUrl)) {
            a2.gwUrl = this.mConfig.getUrl();
        }
        if (a2.compress == null) {
            a2.compress = Boolean.valueOf(this.mConfig.isCompress());
        }
        if (a2.allowRetry == null) {
            if (RpcInvokerUtil.isRetryable(method)) {
                a2.setAllowRetry(true);
            } else {
                a2.setAllowRetry(false);
            }
        }
        return a2;
    }

    public Config getConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Config) ipChange.ipc$dispatch("ac319ad6", new Object[]{this});
        }
        return this.mConfig;
    }

    public RpcInvokeContext getRpcInvokeContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcInvokeContext) ipChange.ipc$dispatch("35782116", new Object[]{this});
        }
        return a();
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8a05e524", new Object[]{this, obj, method, objArr});
        }
        return this.mRpcInvoker.invoke(obj, this.mClazz, method, objArr, b(method));
    }

    public boolean isResetCoolie() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42084c55", new Object[]{this})).booleanValue();
        }
        return this.f4032a;
    }

    public void setInnerRpcInvokeContext(InnerRpcInvokeContext innerRpcInvokeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e18976b2", new Object[]{this, innerRpcInvokeContext});
        } else {
            this.c = innerRpcInvokeContext;
        }
    }

    public void setResetCoolie(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0ee2fdb", new Object[]{this, new Boolean(z)});
        } else {
            this.f4032a = z;
        }
    }

    public RpcInvocationHandler(Config config, Class<?> cls, RpcInvoker rpcInvoker, boolean z) {
        this.mConfig = config;
        this.mClazz = cls;
        this.mRpcInvoker = rpcInvoker;
        this.b = z;
    }
}
