package com.alipay.literpc.android.phone.mrpc.core;

import com.alipay.literpc.android.phone.mrpc.core.gwprotocol.Deserializer;
import com.alipay.literpc.android.phone.mrpc.core.gwprotocol.JsonDeserializer;
import com.alipay.literpc.android.phone.mrpc.core.gwprotocol.JsonSerializer;
import com.alipay.literpc.android.phone.mrpc.core.gwprotocol.Serializer;
import com.alipay.literpc.mobile.framework.service.annotation.OperationType;
import com.alipay.literpc.mobile.framework.service.annotation.ResetCookie;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class RpcInvoker {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ThreadLocal<Object> d = new ThreadLocal<>();
    public static final ThreadLocal<Map<String, Object>> e = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    public byte f3854a = 0;
    public final AtomicInteger b = new AtomicInteger();
    public final RpcFactory c;

    public RpcInvoker(RpcFactory rpcFactory) {
        this.c = rpcFactory;
    }

    public static void addProtocolArgs(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22c8a503", new Object[]{str, obj});
            return;
        }
        ThreadLocal<Map<String, Object>> threadLocal = e;
        if (threadLocal.get() == null) {
            threadLocal.set(new HashMap());
        }
        threadLocal.get().put(str, obj);
    }

    public final void a(Object obj, byte[] bArr, Class<?> cls, Method method, Object[] objArr, Annotation[] annotationArr, RpcException rpcException) throws RpcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea3ba910", new Object[]{this, obj, bArr, cls, method, objArr, annotationArr, rpcException});
            return;
        }
        throw rpcException;
    }

    public final void b(Object obj, byte[] bArr, Class<?> cls, Method method, Object[] objArr, Annotation[] annotationArr) throws RpcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53e03c8f", new Object[]{this, obj, bArr, cls, method, objArr, annotationArr});
        }
    }

    public void batchBegin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cc04a96", new Object[]{this});
        } else {
            this.f3854a = (byte) 1;
        }
    }

    public FutureTask<?> batchCommit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FutureTask) ipChange.ipc$dispatch("a1ad229", new Object[]{this});
        }
        this.f3854a = (byte) 0;
        return null;
    }

    public final void c(Object obj, Class<?> cls, Method method, Object[] objArr, Annotation[] annotationArr) throws RpcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("366df60b", new Object[]{this, obj, cls, method, objArr, annotationArr});
        }
    }

    public final byte[] d(Method method, Object[] objArr, String str, int i, boolean z) throws RpcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("6a0f8666", new Object[]{this, method, objArr, str, new Integer(i), new Boolean(z)});
        }
        Serializer serializer = getSerializer(i, str, objArr);
        ThreadLocal<Map<String, Object>> threadLocal = e;
        if (threadLocal.get() != null) {
            serializer.setExtParam(threadLocal.get());
        }
        byte[] bArr = (byte[]) getTransport(method, i, str, serializer.packet(), z).call();
        threadLocal.set(null);
        return bArr;
    }

    public Deserializer getDeserializer(Type type, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Deserializer) ipChange.ipc$dispatch("715bbe2e", new Object[]{this, type, bArr});
        }
        return new JsonDeserializer(type, bArr);
    }

    public Serializer getSerializer(int i, String str, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Serializer) ipChange.ipc$dispatch("e6b96c62", new Object[]{this, new Integer(i), str, objArr});
        }
        return new JsonSerializer(i, str, objArr);
    }

    public RpcCaller getTransport(Method method, int i, String str, byte[] bArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcCaller) ipChange.ipc$dispatch("f951cffc", new Object[]{this, method, new Integer(i), str, bArr, new Boolean(z)});
        }
        return new HttpCaller(this.c.getConfig(), method, i, str, bArr, z);
    }

    public Object invoke(Object obj, Class<?> cls, Method method, Object[] objArr) throws RpcException {
        byte[] bArr;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5719f54b", new Object[]{this, obj, cls, method, objArr});
        }
        if (!ThreadUtil.checkMainThread()) {
            OperationType operationType = (OperationType) method.getAnnotation(OperationType.class);
            if (method.getAnnotation(ResetCookie.class) == null) {
                z = false;
            }
            Type genericReturnType = method.getGenericReturnType();
            Annotation[] annotations = method.getAnnotations();
            ThreadLocal<Object> threadLocal = d;
            byte[] bArr2 = null;
            threadLocal.set(null);
            e.set(null);
            if (operationType != null) {
                String value = operationType.value();
                int incrementAndGet = this.b.incrementAndGet();
                c(obj, cls, method, objArr, annotations);
                try {
                    if (this.f3854a == 0) {
                        bArr2 = d(method, objArr, value, incrementAndGet, z);
                        Object parser = getDeserializer(genericReturnType, bArr2).parser();
                        if (genericReturnType != Void.TYPE) {
                            threadLocal.set(parser);
                        }
                    }
                    bArr = bArr2;
                } catch (RpcException e2) {
                    e2.setOperationType(value);
                    bArr = bArr2;
                    a(obj, bArr, cls, method, objArr, annotations, e2);
                }
                b(obj, bArr, cls, method, objArr, annotations);
                return d.get();
            }
            throw new IllegalStateException("OperationType must be set.");
        }
        throw new IllegalThreadStateException("can't in main thread call rpc .");
    }
}
