package com.alipay.mobile.common.transport.http;

import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.TransportContextThreadLocalUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.concurrent.TimeUnit;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.conn.tsccm.BasicPoolEntry;
import org.apache.http.impl.conn.tsccm.PoolEntryRequest;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.HttpParams;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ZThreadSafeClientConnManager extends ThreadSafeClientConnManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ZThreadSafeClientConnManager(HttpParams httpParams, SchemeRegistry schemeRegistry) {
        super(httpParams, schemeRegistry);
        HttpClientConnChangedListener.getInstance().addClientConnectionManager(this);
    }

    public static /* synthetic */ void access$000(ZThreadSafeClientConnManager zThreadSafeClientConnManager, BasicPoolEntry basicPoolEntry) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a0606f", new Object[]{zThreadSafeClientConnManager, basicPoolEntry});
        } else {
            zThreadSafeClientConnManager.a(basicPoolEntry);
        }
    }

    public static /* synthetic */ Object ipc$super(ZThreadSafeClientConnManager zThreadSafeClientConnManager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1554832987) {
            ZThreadSafeClientConnManager.super.finalize();
            return null;
        } else if (hashCode == 457600989) {
            ZThreadSafeClientConnManager.super.shutdown();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alipay/mobile/common/transport/http/ZThreadSafeClientConnManager");
        }
    }

    public final void a(BasicPoolEntry basicPoolEntry) {
        try {
            Method declaredMethod = basicPoolEntry.getClass().getDeclaredMethod("getConnection", new Class[0]);
            declaredMethod.setAccessible(true);
            Socket socket = ((OperatedClientConnection) declaredMethod.invoke(basicPoolEntry, new Object[0])).getSocket();
            if (socket == null) {
                LogCatUtil.warn("ZThreadSafeClientConnManager", "[recordSocketInfo] socket is null.");
                return;
            }
            SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
            if (remoteSocketAddress == null) {
                LogCatUtil.warn("ZThreadSafeClientConnManager", "[recordSocketInfo] remoteSocketAddress is null.");
            } else if (!(remoteSocketAddress instanceof InetSocketAddress)) {
                LogCatUtil.warn("ZThreadSafeClientConnManager", "[recordSocketInfo] remoteSocketAddress it's not InetSocketAddress, remoteSocketAddress = ".concat(remoteSocketAddress.getClass().getName()));
            } else {
                InetAddress address = ((InetSocketAddress) remoteSocketAddress).getAddress();
                if (address == null) {
                    LogCatUtil.warn("ZThreadSafeClientConnManager", "[recordSocketInfo] inetAddress is null.");
                    return;
                }
                String str = address.getHostAddress() + ":" + socket.getPort();
                TransportContextThreadLocalUtils.setTargetHost(str);
                LogCatUtil.info("ZThreadSafeClientConnManager", "requestConnection target host=[" + str + "]");
            }
        } catch (Throwable th) {
            LogCatUtil.error("ZThreadSafeClientConnManager", "Problem tagging socket.", th);
        }
    }

    public ClientConnectionOperator createConnectionOperator(SchemeRegistry schemeRegistry) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClientConnectionOperator) ipChange.ipc$dispatch("cea04ecc", new Object[]{this, schemeRegistry});
        }
        return new ZClientConnectionOperator(schemeRegistry);
    }

    public void finalize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        ZThreadSafeClientConnManager.super.finalize();
        HttpClientConnChangedListener.getInstance().removeClientConnectionManager(this);
    }

    public ClientConnectionRequest requestConnection(final HttpRoute httpRoute, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClientConnectionRequest) ipChange.ipc$dispatch("aa6d5798", new Object[]{this, httpRoute, obj});
        }
        final PoolEntryRequest requestPoolEntry = ((ThreadSafeClientConnManager) this).connectionPool.requestPoolEntry(httpRoute, obj);
        return new ClientConnectionRequest() { // from class: com.alipay.mobile.common.transport.http.ZThreadSafeClientConnManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public void abortRequest() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("282a3e46", new Object[]{this});
                } else {
                    requestPoolEntry.abortRequest();
                }
            }

            public ManagedClientConnection getConnection(long j, TimeUnit timeUnit) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (ManagedClientConnection) ipChange2.ipc$dispatch("6f0cbda0", new Object[]{this, new Long(j), timeUnit});
                }
                if (httpRoute != null) {
                    LogCatUtil.info("ZThreadSafeClientConnManager", "ThreadSafeClientConnManager.getConnection: " + httpRoute + ", timeout = " + j);
                    BasicPoolEntry poolEntry = requestPoolEntry.getPoolEntry(j, timeUnit);
                    ZThreadSafeClientConnManager.access$000(ZThreadSafeClientConnManager.this, poolEntry);
                    return new ZBasicPooledConnAdapter(ZThreadSafeClientConnManager.this, poolEntry);
                }
                throw new IllegalArgumentException("Route may not be null.");
            }
        };
    }

    public void shutdown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b466fdd", new Object[]{this});
            return;
        }
        ZThreadSafeClientConnManager.super.shutdown();
        HttpClientConnChangedListener.getInstance().removeClientConnectionManager(this);
    }
}
