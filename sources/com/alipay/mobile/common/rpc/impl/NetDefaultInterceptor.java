package com.alipay.mobile.common.rpc.impl;

import android.text.TextUtils;
import com.alipay.android.msp.framework.dns.DnsValue;
import com.alipay.android.msp.network.DispatchType;
import com.alipay.mobile.common.rpc.RpcException;
import com.alipay.mobile.common.rpc.RpcInvocationHandler;
import com.alipay.mobile.common.rpc.RpcInvokeContext;
import com.alipay.mobile.common.rpc.transport.InnerRpcInvokeContext;
import com.alipay.mobile.common.rpc.util.RpcInvokerUtil;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.alipay.mobile.common.transport.zfeatures.ServerTimeManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class NetDefaultInterceptor extends RpcInterceptorAdaptor {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Boolean c;
    public static NetDefaultInterceptor d;
    public static final ThreadLocal<Map<String, Object>> e = new ThreadLocal<Map<String, Object>>() { // from class: com.alipay.mobile.common.rpc.impl.NetDefaultInterceptor.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/rpc/impl/NetDefaultInterceptor$1");
        }

        @Override // java.lang.ThreadLocal
        public Map<String, Object> initialValue() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d848a9c9", new Object[]{this}) : new HashMap(2);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final String f4034a = "https://mobilegw.alipay.com/mgw.htm";
    public final String b = "https://mgwapi-tb.alipay.com/mgw.htm";

    public static final Object a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("17307540", new Object[]{str});
        }
        return e.get().get(str);
    }

    public static final void c(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{str, obj});
        } else {
            e.get().put(str, obj);
        }
    }

    public static NetDefaultInterceptor getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetDefaultInterceptor) ipChange.ipc$dispatch("3dda6239", new Object[0]);
        }
        NetDefaultInterceptor netDefaultInterceptor = d;
        if (netDefaultInterceptor != null) {
            return netDefaultInterceptor;
        }
        synchronized (NetDefaultInterceptor.class) {
            try {
                if (d == null) {
                    d = new NetDefaultInterceptor();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d;
    }

    public static /* synthetic */ Object ipc$super(NetDefaultInterceptor netDefaultInterceptor, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/rpc/impl/NetDefaultInterceptor");
    }

    public final void b(RpcInvokeContext rpcInvokeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3d91e8f", new Object[]{this, rpcInvokeContext});
            return;
        }
        Map<String, String> responseHeaders = rpcInvokeContext.getResponseHeaders();
        if (responseHeaders == null) {
            LogCatUtil.warn("NetDefaultInterceptor", "[exceptionHandle] No response header");
            return;
        }
        String str = responseHeaders.get(HeaderConstant.HEADER_KEY_SERVER_TIME);
        if (str == null) {
            LogCatUtil.warn("NetDefaultInterceptor", "[exceptionHandle] No server time in response header");
            return;
        }
        try {
            ServerTimeManager.getInstance().setServerTime(Long.parseLong(str));
            LogCatUtil.info("NetDefaultInterceptor", "[exceptionHandle] correctTimestamp, set server time: ".concat(str));
        } catch (NumberFormatException e2) {
            LogCatUtil.warn("NetDefaultInterceptor", "[exceptionHandle] Cannot parse tmpServerTime: " + str + ", NumberFormatException: " + e2.toString());
        }
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        Boolean bool = c;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (TransportEnvUtil.getContext().getPackageName().startsWith("com.taobao.taobao")) {
            c = Boolean.TRUE;
            return true;
        }
        c = Boolean.FALSE;
        return false;
    }

    @Override // com.alipay.mobile.common.rpc.impl.RpcInterceptorAdaptor, com.alipay.mobile.common.rpc.RpcInterceptor
    public boolean exceptionHandle(Object obj, ThreadLocal<Object> threadLocal, byte[] bArr, Class<?> cls, Method method, Object[] objArr, RpcException rpcException, Annotation annotation) {
        String str;
        String operationTypeValue = RpcInvokerUtil.getOperationTypeValue(method, objArr);
        int code = rpcException.getCode();
        LogCatUtil.info("NetDefaultInterceptor", "exceptionHandle. exception.getCode:" + code + ", operationType:" + operationTypeValue);
        if (!e(obj, method, objArr, rpcException)) {
            return true;
        }
        Integer num = (Integer) a("dispatchHandleTimes");
        if (num == null || num.intValue() < 1) {
            if (num != null) {
                c("dispatchHandleTimes", Integer.valueOf(num.intValue() + 1));
            } else {
                c("dispatchHandleTimes", 1);
            }
            try {
                RpcInvokeContext rpcInvokeContext = ((RpcInvocationHandler) Proxy.getInvocationHandler(obj)).getRpcInvokeContext();
                if (code == 7003) {
                    b(rpcInvokeContext);
                }
                if (TransportStrategy.enableSwitchRpcDomain()) {
                    str = this.f4034a;
                } else {
                    str = this.b;
                }
                rpcInvokeContext.setGwUrl(str);
                LogCatUtil.info("NetDefaultInterceptor", "exceptionHandle. Start resend rpc, url= " + str);
                threadLocal.set(method.invoke(obj, objArr));
                return false;
            } catch (IllegalAccessException e2) {
                LogCatUtil.error("NetDefaultInterceptor", "resend rpc occurs illegal access exception", e2);
                throw new RpcException((Integer) 9, e2 + "");
            } catch (IllegalArgumentException e3) {
                LogCatUtil.error("NetDefaultInterceptor", "resend rpc occurs illegal argument exception", e3);
                throw new RpcException((Integer) 9, e3 + "");
            } catch (InvocationTargetException e4) {
                Throwable targetException = e4.getTargetException();
                LogCatUtil.error("NetDefaultInterceptor", "resend rpc occurs invocation target exception", targetException);
                if (targetException instanceof RpcException) {
                    throw ((RpcException) targetException);
                }
                throw new RpcException((Integer) 9, e4 + "");
            }
        } else {
            LogCatUtil.info("NetDefaultInterceptor", "dispatch handle times >= 1, return.");
            c("dispatchHandleTimes", 0);
            return true;
        }
    }

    @Override // com.alipay.mobile.common.rpc.impl.RpcInterceptorAdaptor, com.alipay.mobile.common.rpc.RpcInterceptor
    public boolean preHandle(Object obj, ThreadLocal<Object> threadLocal, byte[] bArr, Class<?> cls, Method method, Object[] objArr, Annotation annotation, ThreadLocal<Map<String, Object>> threadLocal2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba037f8b", new Object[]{this, obj, threadLocal, bArr, cls, method, objArr, annotation, threadLocal2})).booleanValue();
        }
        try {
        } catch (Throwable th) {
            LogCatUtil.error("NetDefaultInterceptor", "preHandle error", th);
        }
        if (!d()) {
            LogCatUtil.info("NetDefaultInterceptor", "it's not in taobao app");
            return true;
        } else if (!TransportStrategy.enableSwitchRpcDomain()) {
            LogCatUtil.info("NetDefaultInterceptor", "switch off");
            return true;
        } else {
            RpcInvokeContext rpcInvokeContext = ((RpcInvocationHandler) Proxy.getInvocationHandler(obj)).getRpcInvokeContext();
            String gwUrl = rpcInvokeContext.getGwUrl();
            if (gwUrl != null && !gwUrl.equals(this.f4034a)) {
                LogCatUtil.info("NetDefaultInterceptor", "origin url is not mobilegw, don't need to switch, oldGwUrl:".concat(gwUrl));
                return true;
            } else if (RpcInvokerUtil.getOperationTypeValue(method, objArr).equals("alipay.client.switches.all.get.outside")) {
                return true;
            } else {
                LogCatUtil.info("NetDefaultInterceptor", "switch domain");
                rpcInvokeContext.setGwUrl(this.b);
                return true;
            }
        }
    }

    public static boolean e(Object obj, Method method, Object[] objArr, RpcException rpcException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f65f695e", new Object[]{obj, method, objArr, rpcException})).booleanValue();
        }
        try {
            if (!rpcException.isServerError() || rpcException.getCode() == 7003) {
                String operationTypeValue = RpcInvokerUtil.getOperationTypeValue(method, objArr);
                URL url = new URL(((InnerRpcInvokeContext) ((RpcInvocationHandler) Proxy.getInvocationHandler(obj)).getRpcInvokeContext()).getGwUrl());
                if (TextUtils.equals(url.getHost(), DnsValue.DOMAIN_MOBILE_GW) || TextUtils.equals(url.getHost(), "mgwapi-tb.alipay.com")) {
                    return operationTypeValue.contains(DispatchType.PB_V1_CASHIER);
                }
                LogCatUtil.info("NetDefaultInterceptor", "exceptionHandle. operationType= " + operationTypeValue + ",gw= " + url.getHost() + " should not do exceptionHandle");
                return false;
            }
            LogCatUtil.info("NetDefaultInterceptor", "exceptionHand. shouldDoExceptionHandle, isServerError return false");
            return false;
        } catch (Throwable th) {
            LogCatUtil.error("NetDefaultInterceptor", "shouldDoExceptionHandle ex= " + th.toString());
            return false;
        }
    }
}
