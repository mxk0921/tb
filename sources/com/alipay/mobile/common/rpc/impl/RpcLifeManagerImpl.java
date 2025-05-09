package com.alipay.mobile.common.rpc.impl;

import com.alipay.mobile.common.rpc.RpcLifeManager;
import com.alipay.mobile.common.transport.Response;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class RpcLifeManagerImpl implements RpcLifeManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final List<Future<Response>> f4035a = new ArrayList(4);
    public static RpcLifeManagerImpl b;

    public static final RpcLifeManagerImpl getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcLifeManagerImpl) ipChange.ipc$dispatch("7db29070", new Object[0]);
        }
        RpcLifeManagerImpl rpcLifeManagerImpl = b;
        if (rpcLifeManagerImpl != null) {
            return rpcLifeManagerImpl;
        }
        synchronized (RpcLifeManagerImpl.class) {
            try {
                RpcLifeManagerImpl rpcLifeManagerImpl2 = b;
                if (rpcLifeManagerImpl2 != null) {
                    return rpcLifeManagerImpl2;
                }
                RpcLifeManagerImpl rpcLifeManagerImpl3 = new RpcLifeManagerImpl();
                b = rpcLifeManagerImpl3;
                return rpcLifeManagerImpl3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void addFuture(Future<Response> future) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f59032fb", new Object[]{this, future});
        } else if (future != null) {
            try {
                ((ArrayList) f4035a).add(future);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcLifeManager
    public synchronized void cancelAllRpc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87ffb525", new Object[]{this});
            return;
        }
        List<Future<Response>> list = f4035a;
        if (!((ArrayList) list).isEmpty()) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                Future future = (Future) it.next();
                if (future != null && !future.isDone()) {
                    future.cancel(true);
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Cancel all rpc finish, rpc count: ");
            List<Future<Response>> list2 = f4035a;
            sb.append(((ArrayList) list2).size());
            LogCatUtil.warn("RpcLifeManager", sb.toString());
            ((ArrayList) list2).clear();
        }
    }

    public synchronized void removeFuture(Future<Response> future) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f73269b8", new Object[]{this, future});
        } else if (future != null) {
            List<Future<Response>> list = f4035a;
            if (!((ArrayList) list).isEmpty()) {
                try {
                    ((ArrayList) list).remove(future);
                } catch (Throwable unused) {
                }
            }
        }
    }
}
