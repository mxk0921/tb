package com.alipay.vi.android.phone.mrpc.core;

import com.alipay.vi.android.phone.mrpc.core.gwprotocol.Deserializer;
import com.alipay.vi.android.phone.mrpc.core.gwprotocol.JsonDeserializer;
import com.alipay.vi.android.phone.mrpc.core.gwprotocol.JsonSerializer;
import com.alipay.vi.android.phone.mrpc.core.gwprotocol.Serializer;
import com.alipay.vi.android.phone.mrpc.core.gwprotocol.SignJsonSerializer;
import com.alipay.vi.android.phone.mrpc.core.util.RpcInvokerUtil;
import com.alipay.vi.mobile.framework.service.annotation.OperationType;
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
    public byte f4567a = 0;
    public final AtomicInteger b = new AtomicInteger();
    public final RpcFactory c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface Handle {
        boolean handle(RpcInterceptor rpcInterceptor, Annotation annotation);
    }

    public RpcInvoker(RpcFactory rpcFactory) {
        this.c = rpcFactory;
    }

    public static /* synthetic */ ThreadLocal access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadLocal) ipChange.ipc$dispatch("ac8d907b", new Object[0]);
        }
        return d;
    }

    public static /* synthetic */ ThreadLocal access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadLocal) ipChange.ipc$dispatch("d5dd74fc", new Object[0]);
        }
        return e;
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

    public final boolean a(Annotation[] annotationArr, Handle handle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f321f7f4", new Object[]{this, annotationArr, handle})).booleanValue();
        }
        boolean z = true;
        for (Annotation annotation : annotationArr) {
            RpcInterceptor findRpcInterceptor = this.c.findRpcInterceptor(annotation.annotationType());
            if (findRpcInterceptor == null || !(z = handle.handle(findRpcInterceptor, annotation))) {
                break;
            }
        }
        return z;
    }

    public void batchBegin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cc04a96", new Object[]{this});
        } else {
            this.f4567a = (byte) 1;
        }
    }

    public FutureTask<?> batchCommit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FutureTask) ipChange.ipc$dispatch("a1ad229", new Object[]{this});
        }
        this.f4567a = (byte) 0;
        return null;
    }

    public Deserializer getDeserializer(Type type, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Deserializer) ipChange.ipc$dispatch("8765f5dc", new Object[]{this, type, bArr});
        }
        return new JsonDeserializer(type, bArr);
    }

    public Serializer getSerializer(int i, String str, Method method, Object[] objArr) {
        JsonSerializer jsonSerializer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Serializer) ipChange.ipc$dispatch("d469e9e2", new Object[]{this, new Integer(i), str, method, objArr});
        }
        if (RpcInvokerUtil.isSimpleRpcAnnotation(((OperationType) method.getAnnotation(OperationType.class)).value())) {
            jsonSerializer = new SimpleRpcJsonSerializer(i, str, objArr);
        } else if (!RpcInvokerUtil.isSimpleRpcBytesAnnotation(((OperationType) method.getAnnotation(OperationType.class)).value())) {
            jsonSerializer = new JsonSerializer(i, str, objArr);
        } else {
            throw new IllegalArgumentException("alipay.client.executerpc.bytes can't use in RpcV1");
        }
        return new SignJsonSerializer(jsonSerializer, this.c.getContext(), this.c.getConfig());
    }

    public RpcCaller getTransport(Method method, int i, String str, byte[] bArr, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcCaller) ipChange.ipc$dispatch("7795e63", new Object[]{this, method, new Integer(i), str, bArr, new Boolean(z), map});
        }
        return new HttpCaller(this.c.getConfig(), method, i, str, bArr, z, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(final java.lang.Object r18, final java.lang.Class<?> r19, final java.lang.reflect.Method r20, final java.lang.Object[] r21) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.vi.android.phone.mrpc.core.RpcInvoker.invoke(java.lang.Object, java.lang.Class, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }
}
