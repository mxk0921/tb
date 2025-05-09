package com.alipay.literpc.android.phone.mrpc.core;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class RpcInvocationHandler implements InvocationHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Class<?> mClazz;
    public Config mConfig;
    public RpcInvoker mRpcInvoker;

    public RpcInvocationHandler(Config config, Class<?> cls, RpcInvoker rpcInvoker) {
        this.mConfig = config;
        this.mClazz = cls;
        this.mRpcInvoker = rpcInvoker;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws RpcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8a05e524", new Object[]{this, obj, method, objArr});
        }
        return this.mRpcInvoker.invoke(obj, this.mClazz, method, objArr);
    }
}
