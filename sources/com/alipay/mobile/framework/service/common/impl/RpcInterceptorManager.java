package com.alipay.mobile.framework.service.common.impl;

import com.alipay.mobile.common.rpc.RpcException;
import com.alipay.mobile.common.rpc.RpcInterceptor;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.framework.service.annotation.OperationType;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class RpcInterceptorManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static RpcInterceptorManager d;
    public RpcInterceptor[] b;

    /* renamed from: a  reason: collision with root package name */
    public final List<RpcInterceptor> f4223a = new ArrayList();
    public final ReentrantReadWriteLock.WriteLock c = new ReentrantReadWriteLock().writeLock();

    public static synchronized RpcInterceptorManager getInstance() {
        synchronized (RpcInterceptorManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RpcInterceptorManager) ipChange.ipc$dispatch("20b679c2", new Object[0]);
            }
            if (d == null) {
                d = new RpcInterceptorManager();
            }
            return d;
        }
    }

    /* JADX WARN: Finally extract failed */
    public void addRpcInterceptor(RpcInterceptor rpcInterceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5f5d9a1", new Object[]{this, rpcInterceptor});
        } else if (rpcInterceptor != null && !((ArrayList) this.f4223a).contains(rpcInterceptor)) {
            this.c.lock();
            try {
                ((ArrayList) this.f4223a).add(rpcInterceptor);
                List<RpcInterceptor> list = this.f4223a;
                this.b = (RpcInterceptor[]) ((ArrayList) list).toArray(new RpcInterceptor[((ArrayList) list).size()]);
                this.c.unlock();
                LogCatUtil.info("RpcInterceptorManager", "addInterceptor finish, interceptor is ".concat(rpcInterceptor.getClass().getName()));
            } catch (Throwable th) {
                this.c.unlock();
                throw th;
            }
        }
    }

    public boolean contains(Class<? extends RpcInterceptor> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c67874db", new Object[]{this, cls})).booleanValue();
        }
        RpcInterceptor[] rpcInterceptorArr = this.b;
        if (rpcInterceptorArr != null && rpcInterceptorArr.length > 0) {
            for (RpcInterceptor rpcInterceptor : rpcInterceptorArr) {
                if (rpcInterceptor != null && cls == rpcInterceptor.getClass()) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean exceptionHandle(Object obj, ThreadLocal<Object> threadLocal, byte[] bArr, Class<?> cls, Method method, Object[] objArr, RpcException rpcException) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b064556", new Object[]{this, obj, threadLocal, bArr, cls, method, objArr, rpcException})).booleanValue();
        }
        RpcInterceptor[] rpcInterceptorArr = this.b;
        if (rpcInterceptorArr == null || rpcInterceptorArr.length <= 0) {
            LogCatUtil.warn("RpcInterceptorManager", "exceptionHandle. No exists interceptor");
            return true;
        }
        try {
            Annotation annotation = method.getAnnotation(OperationType.class);
            int length = rpcInterceptorArr.length;
            int i3 = 0;
            while (i3 < length) {
                RpcInterceptor rpcInterceptor = rpcInterceptorArr[i3];
                if (rpcInterceptor == null) {
                    i2 = i3;
                    i = length;
                } else {
                    i2 = i3;
                    i = length;
                    if (!rpcInterceptor.exceptionHandle(obj, threadLocal, bArr, cls, method, objArr, rpcException, annotation)) {
                        LogCatUtil.error("RpcInterceptorManager", rpcException + " not need throw exception");
                        return false;
                    }
                }
                i3 = i2 + 1;
                length = i;
            }
        } catch (RpcException e) {
            throw e;
        } catch (Throwable th) {
            LogCatUtil.error("RpcInterceptorManager", "exceptionHandle error", th);
        }
        return true;
    }

    public List<RpcInterceptor> getRpcInterceptors() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("876f9483", new Object[]{this});
        }
        RpcInterceptor[] rpcInterceptorArr = this.b;
        if (rpcInterceptorArr == null || rpcInterceptorArr.length <= 0) {
            return Collections.EMPTY_LIST;
        }
        return Arrays.asList(rpcInterceptorArr);
    }

    /* JADX WARN: Finally extract failed */
    public void removeRpcInterceptor(RpcInterceptor rpcInterceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("397ee95e", new Object[]{this, rpcInterceptor});
        } else if (rpcInterceptor != null) {
            this.c.lock();
            try {
                ((ArrayList) this.f4223a).remove(rpcInterceptor);
                List<RpcInterceptor> list = this.f4223a;
                this.b = (RpcInterceptor[]) ((ArrayList) list).toArray(new RpcInterceptor[((ArrayList) list).size()]);
                this.c.unlock();
                LogCatUtil.warn("RpcInterceptorManager", "removeInterceptor finish, interceptor: ".concat(rpcInterceptor.getClass().getName()));
            } catch (Throwable th) {
                this.c.unlock();
                throw th;
            }
        }
    }

    public boolean postHandle(Object obj, ThreadLocal<Object> threadLocal, byte[] bArr, Class<?> cls, Method method, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("980b4660", new Object[]{this, obj, threadLocal, bArr, cls, method, objArr})).booleanValue();
        }
        RpcInterceptor[] rpcInterceptorArr = this.b;
        if (rpcInterceptorArr == null || rpcInterceptorArr.length <= 0) {
            LogCatUtil.warn("RpcInterceptorManager", "postHandle. No exists interceptor");
            return true;
        }
        try {
            Annotation annotation = method.getAnnotation(OperationType.class);
            for (RpcInterceptor rpcInterceptor : rpcInterceptorArr) {
                if (rpcInterceptor != null && !rpcInterceptor.postHandle(obj, threadLocal, bArr, cls, method, objArr, annotation)) {
                    throw new RpcException((Integer) 9, rpcInterceptor + "postHandle stop this call.");
                }
            }
        } catch (RpcException e) {
            throw e;
        } catch (Throwable th) {
            LogCatUtil.error("RpcInterceptorManager", "postHandle error", th);
        }
        return true;
    }

    public boolean preHandle(Object obj, ThreadLocal<Object> threadLocal, byte[] bArr, Class<?> cls, Method method, Object[] objArr, ThreadLocal<Map<String, Object>> threadLocal2) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("976eef3f", new Object[]{this, obj, threadLocal, bArr, cls, method, objArr, threadLocal2})).booleanValue();
        }
        RpcInterceptor[] rpcInterceptorArr = this.b;
        if (rpcInterceptorArr == null || rpcInterceptorArr.length <= 0) {
            LogCatUtil.warn("RpcInterceptorManager", "preHandle. No exists interceptor");
            return true;
        }
        try {
            Annotation annotation = method.getAnnotation(OperationType.class);
            int length = rpcInterceptorArr.length;
            int i2 = 0;
            while (i2 < length) {
                RpcInterceptor rpcInterceptor = rpcInterceptorArr[i2];
                if (rpcInterceptor == null) {
                    i = i2;
                } else {
                    i = i2;
                    if (!rpcInterceptor.preHandle(obj, threadLocal, bArr, cls, method, objArr, annotation, threadLocal2)) {
                        throw new RpcException((Integer) 21, rpcInterceptor + " preHandle stop this call.");
                    }
                }
                i2 = i + 1;
            }
        } catch (RpcException e) {
            throw e;
        } catch (Throwable th) {
            LogCatUtil.error("RpcInterceptorManager", "preHandle error", th);
        }
        return true;
    }
}
