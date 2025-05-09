package com.alipay.mobile.common.transport.http;

import android.text.TextUtils;
import android.util.Pair;
import com.alipay.mobile.common.transport.config.UserNetworkPreferencesManager;
import com.alipay.mobile.common.transport.context.TransportContext;
import com.alipay.mobile.common.transport.httpdns.AlipayHttpDnsClient;
import com.alipay.mobile.common.transport.httpdns.DnsUtil;
import com.alipay.mobile.common.transport.httpdns.HttpDns;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.alipay.mobile.common.transport.monitor.networkqos.AlipayQosService;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkUtils;
import com.alipay.mobile.common.transport.utils.SocketUtil;
import com.alipay.mobile.common.transport.utils.TransportConstants;
import com.alipay.mobile.common.transport.utils.TransportContextThreadLocalUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpHost;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.scheme.LayeredSocketFactory;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.impl.conn.DefaultClientConnection;
import org.apache.http.impl.conn.DefaultClientConnectionOperator;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ZClientConnectionOperator extends DefaultClientConnectionOperator {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MAX_DNS_RETRY_COUNT = 20;

    /* renamed from: a  reason: collision with root package name */
    public byte f4083a = 0;
    public byte b = 1;
    public List<String> c;
    public static final PlainSocketFactory d = new PlainSocketFactory();
    public static byte DEFAULT_MIN_CONNECT_COUNT = 4;

    public ZClientConnectionOperator(SchemeRegistry schemeRegistry) {
        super(schemeRegistry);
    }

    public static /* synthetic */ Object ipc$super(ZClientConnectionOperator zClientConnectionOperator, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2094754246) {
            ZClientConnectionOperator.super.openConnection((OperatedClientConnection) objArr[0], (HttpHost) objArr[1], (InetAddress) objArr[2], (HttpContext) objArr[3], (HttpParams) objArr[4]);
            return null;
        } else if (hashCode == -372744897) {
            ZClientConnectionOperator.super.prepareSocket((Socket) objArr[0], (HttpContext) objArr[1], (HttpParams) objArr[2]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alipay/mobile/common/transport/http/ZClientConnectionOperator");
        }
    }

    public final List<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        if (this.c == null) {
            this.c = new ArrayList(2);
        }
        return this.c;
    }

    public void assertShutdown(OperatedClientConnection operatedClientConnection, IOException iOException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e051c71", new Object[]{this, operatedClientConnection, iOException});
        } else if (g(operatedClientConnection)) {
            throw iOException;
        } else if (iOException != null && !TextUtils.isEmpty(iOException.getMessage()) && iOException.getMessage().contains("shutdown")) {
            LogCatUtil.info("ClientConnectionOperator", "Connection shutdown, don't retry!");
            throw iOException;
        }
    }

    public final void b(HttpHost httpHost, InetAddress inetAddress, boolean z, int i) {
        double d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa981b13", new Object[]{this, httpHost, inetAddress, new Boolean(z), new Integer(i)});
            return;
        }
        if (!DnsUtil.isLogicIP(httpHost.getHostName())) {
            k(httpHost, inetAddress, z, i);
        }
        AlipayQosService instance = AlipayQosService.getInstance();
        if (z) {
            d2 = i;
        } else {
            d2 = 5000.0d;
        }
        instance.estimate(d2, (byte) 2);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:29:0x00d6
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:90)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public void connect(org.apache.http.conn.OperatedClientConnection r40, org.apache.http.HttpHost r41, java.net.InetAddress r42, org.apache.http.protocol.HttpContext r43, org.apache.http.params.HttpParams r44, org.apache.http.conn.scheme.Scheme r45, org.apache.http.conn.scheme.SocketFactory r46, org.apache.http.conn.scheme.SocketFactory r47, org.apache.http.conn.scheme.LayeredSocketFactory r48, java.net.InetAddress[] r49) {
        /*
            Method dump skipped, instructions count: 1626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.transport.http.ZClientConnectionOperator.connect(org.apache.http.conn.OperatedClientConnection, org.apache.http.HttpHost, java.net.InetAddress, org.apache.http.protocol.HttpContext, org.apache.http.params.HttpParams, org.apache.http.conn.scheme.Scheme, org.apache.http.conn.scheme.SocketFactory, org.apache.http.conn.scheme.SocketFactory, org.apache.http.conn.scheme.LayeredSocketFactory, java.net.InetAddress[]):void");
    }

    public OperatedClientConnection createConnection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OperatedClientConnection) ipChange.ipc$dispatch("9b1065f7", new Object[]{this});
        }
        try {
            return new ZDefaultClientConnection();
        } catch (Throwable th) {
            LogCatUtil.warn("ClientConnectionOperator", "[createConnection] Exception", th);
            return new DefaultClientConnection();
        }
    }

    public final void d(HttpContext httpContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49ab69d6", new Object[]{this, httpContext});
            return;
        }
        try {
            TransportContext j = j(httpContext);
            if (j.mRadicalStrategy) {
                j.getCurrentDataContainer().putDataItem(RPCDataItems.RADICAL_STRATEGY, "T");
            }
        } catch (Throwable th) {
            LogCatUtil.warn("ClientConnectionOperator", "[recordLogsForPre] Exception: " + th.toString());
        }
    }

    public final boolean e(long j, int i, Throwable th, OperatedClientConnection operatedClientConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8499335c", new Object[]{this, new Long(j), new Integer(i), th, operatedClientConnection})).booleanValue();
        }
        return f(j, i, th, operatedClientConnection, 20);
    }

    public final boolean f(long j, int i, Throwable th, OperatedClientConnection operatedClientConnection, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8daaaf", new Object[]{this, new Long(j), new Integer(i), th, operatedClientConnection, new Integer(i2)})).booleanValue();
        }
        if (g(operatedClientConnection)) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (currentTimeMillis < 0 || currentTimeMillis > 12000) {
            LogCatUtil.warn("ClientConnectionOperator", "[isCanRetryDns] Can not redns， dnsCost = " + currentTimeMillis + ",  Exception: " + th.toString());
            return false;
        } else if (i >= i2) {
            LogCatUtil.warn("ClientConnectionOperator", "[isCanRetryDns] Can not redns. retryCount = " + i + ", Exception: " + th.toString());
            return false;
        } else {
            LogCatUtil.debug("ClientConnectionOperator", "[isCanRetryDns] Will sleep 1s.");
            try {
                Thread.sleep(1000L);
                LogCatUtil.warn("ClientConnectionOperator", "[isCanRetryDns] Can redns. Exception: " + th.toString());
                return true;
            } catch (Throwable th2) {
                LogCatUtil.warn("ClientConnectionOperator", "[isCanRetryDns] sleep exception = " + th2.toString());
                return false;
            }
        }
    }

    public final boolean g(OperatedClientConnection operatedClientConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1814ee2", new Object[]{this, operatedClientConnection})).booleanValue();
        }
        if (!(operatedClientConnection instanceof ZDefaultClientConnection)) {
            LogCatUtil.warn("ClientConnectionOperator", "[isShutdownZ] Not instanceof ZDefaultClientConnection. conn = ".concat(operatedClientConnection.getClass().getName()));
            return false;
        } else if (!((ZDefaultClientConnection) operatedClientConnection).isShutdownZ()) {
            return false;
        } else {
            LogCatUtil.info("ClientConnectionOperator", "[isShutdownZ] Connection shutdown by isShutdownZ, don't retry!");
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
        if (r8 != null) goto L_0x0084;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.net.InetAddress[] h(org.apache.http.HttpHost r7, org.apache.http.protocol.HttpContext r8) {
        /*
            r6 = this;
            java.lang.String r0 = "ClientConnectionOperator"
            java.lang.String r1 = "ZClientConnectionOperator ex:"
            java.lang.String r2 = "ZClientConnectionOperator addresses len = "
            com.android.alibaba.ip.runtime.IpChange r3 = com.alipay.mobile.common.transport.http.ZClientConnectionOperator.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0021
            java.lang.String r0 = "f2dbcfd7"
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r6
            r2 = 1
            r1[r2] = r7
            r7 = 2
            r1[r7] = r8
            java.lang.Object r7 = r3.ipc$dispatch(r0, r1)
            java.net.InetAddress[] r7 = (java.net.InetAddress[]) r7
            return r7
        L_0x0021:
            com.alipay.mobile.common.transport.context.TransportContext r8 = r6.j(r8)
            java.lang.String r3 = "DNS_TIME"
            if (r8 == 0) goto L_0x0030
            com.alipay.mobile.common.transport.monitor.DataContainer r4 = r8.getCurrentDataContainer()
            r4.timeItemDot(r3)
        L_0x0030:
            com.alipay.mobile.common.transport.httpdns.AlipayHttpDnsClient r4 = com.alipay.mobile.common.transport.httpdns.AlipayHttpDnsClient.getDnsClient()     // Catch: all -> 0x0066, Exception -> 0x0068, UnknownHostException -> 0x006a
            if (r4 == 0) goto L_0x0075
            java.lang.String r5 = r7.getHostName()     // Catch: all -> 0x0066, Exception -> 0x0068, UnknownHostException -> 0x006a
            java.net.InetAddress[] r4 = r4.getAllByName(r5, r8)     // Catch: all -> 0x0066, Exception -> 0x0068, UnknownHostException -> 0x006a
            if (r4 == 0) goto L_0x006c
            int r5 = r4.length     // Catch: all -> 0x0066, Exception -> 0x0068, UnknownHostException -> 0x006a
            if (r5 != 0) goto L_0x0044
            goto L_0x006c
        L_0x0044:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: all -> 0x0066, Exception -> 0x0068, UnknownHostException -> 0x006a
            r5.<init>(r2)     // Catch: all -> 0x0066, Exception -> 0x0068, UnknownHostException -> 0x006a
            int r2 = r4.length     // Catch: all -> 0x0066, Exception -> 0x0068, UnknownHostException -> 0x006a
            r5.append(r2)     // Catch: all -> 0x0066, Exception -> 0x0068, UnknownHostException -> 0x006a
            java.lang.String r2 = ",ips = ["
            r5.append(r2)     // Catch: all -> 0x0066, Exception -> 0x0068, UnknownHostException -> 0x006a
            java.lang.String r2 = java.util.Arrays.toString(r4)     // Catch: all -> 0x0066, Exception -> 0x0068, UnknownHostException -> 0x006a
            r5.append(r2)     // Catch: all -> 0x0066, Exception -> 0x0068, UnknownHostException -> 0x006a
            java.lang.String r2 = "]"
            r5.append(r2)     // Catch: all -> 0x0066, Exception -> 0x0068, UnknownHostException -> 0x006a
            java.lang.String r2 = r5.toString()     // Catch: all -> 0x0066, Exception -> 0x0068, UnknownHostException -> 0x006a
            com.alipay.mobile.common.transport.utils.LogCatUtil.info(r0, r2)     // Catch: all -> 0x0066, Exception -> 0x0068, UnknownHostException -> 0x006a
            goto L_0x0082
        L_0x0066:
            r7 = move-exception
            goto L_0x00b1
        L_0x0068:
            r1 = move-exception
            goto L_0x008c
        L_0x006a:
            r7 = move-exception
            goto L_0x009d
        L_0x006c:
            java.lang.String r2 = r7.getHostName()     // Catch: all -> 0x0066, Exception -> 0x0068, UnknownHostException -> 0x006a
            java.net.InetAddress[] r4 = com.alipay.mobile.common.transport.httpdns.DnsUtil.getAllByName(r2)     // Catch: all -> 0x0066, Exception -> 0x0068, UnknownHostException -> 0x006a
            goto L_0x0082
        L_0x0075:
            java.lang.String r2 = "ZClientConnectionOperator dnsClient is null"
            com.alipay.mobile.common.transport.utils.LogCatUtil.info(r0, r2)     // Catch: all -> 0x0066, Exception -> 0x0068, UnknownHostException -> 0x006a
            java.lang.String r2 = r7.getHostName()     // Catch: all -> 0x0066, Exception -> 0x0068, UnknownHostException -> 0x006a
            java.net.InetAddress[] r4 = com.alipay.mobile.common.transport.httpdns.DnsUtil.getAllByName(r2)     // Catch: all -> 0x0066, Exception -> 0x0068, UnknownHostException -> 0x006a
        L_0x0082:
            if (r8 == 0) goto L_0x009c
        L_0x0084:
            com.alipay.mobile.common.transport.monitor.DataContainer r7 = r8.getCurrentDataContainer()
            r7.timeItemRelease(r3)
            goto L_0x009c
        L_0x008c:
            java.lang.String r2 = "ZClientConnectionOperator Exception"
            com.alipay.mobile.common.transport.utils.LogCatUtil.error(r0, r2, r1)     // Catch: all -> 0x0066
            java.lang.String r7 = r7.getHostName()     // Catch: all -> 0x0066
            java.net.InetAddress[] r4 = com.alipay.mobile.common.transport.httpdns.DnsUtil.getAllByName(r7)     // Catch: all -> 0x0066
            if (r8 == 0) goto L_0x009c
            goto L_0x0084
        L_0x009c:
            return r4
        L_0x009d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: all -> 0x0066
            r2.<init>(r1)     // Catch: all -> 0x0066
            java.lang.String r1 = r7.toString()     // Catch: all -> 0x0066
            r2.append(r1)     // Catch: all -> 0x0066
            java.lang.String r1 = r2.toString()     // Catch: all -> 0x0066
            com.alipay.mobile.common.transport.utils.LogCatUtil.error(r0, r1)     // Catch: all -> 0x0066
            throw r7     // Catch: all -> 0x0066
        L_0x00b1:
            if (r8 == 0) goto L_0x00ba
            com.alipay.mobile.common.transport.monitor.DataContainer r8 = r8.getCurrentDataContainer()
            r8.timeItemRelease(r3)
        L_0x00ba:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.transport.http.ZClientConnectionOperator.h(org.apache.http.HttpHost, org.apache.http.protocol.HttpContext):java.net.InetAddress[]");
    }

    public final InetAddress[] i(HttpHost httpHost, HttpContext httpContext, OperatedClientConnection operatedClientConnection) {
        boolean z;
        UnknownHostException unknownHostException;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InetAddress[]) ipChange.ipc$dispatch("b9a63095", new Object[]{this, httpHost, httpContext, operatedClientConnection});
        }
        TransportContext j = j(httpContext);
        if (j == null || !j.isFastReturnFailure() || j.taskRetryedCount != 0) {
            z = false;
        } else {
            z = true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int i = 0;
        while (true) {
            try {
                return h(httpHost, httpContext);
            } catch (Throwable th) {
                if (e(currentTimeMillis, i, th, operatedClientConnection)) {
                    i++;
                } else {
                    if (th instanceof UnknownHostException) {
                        unknownHostException = th;
                    } else {
                        unknownHostException = new UnknownHostException("Unknown host: " + httpHost.getHostName());
                        unknownHostException.initCause(th);
                    }
                    if (!z) {
                        throw unknownHostException;
                    }
                    LogCatUtil.warn("ClientConnectionOperator", "[getInetAddresses] Hin fast return failure.");
                    HttpException httpException = new HttpException(9, unknownHostException.toString(), unknownHostException);
                    httpException.setCanRetry(false);
                    throw httpException;
                }
            }
        }
    }

    public final TransportContext j(HttpContext httpContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TransportContext) ipChange.ipc$dispatch("68ab238e", new Object[]{this, httpContext});
        }
        return (TransportContext) httpContext.getAttribute(TransportConstants.KEY_NET_CONTEXT);
    }

    public final void k(HttpHost httpHost, InetAddress inetAddress, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3ec7054", new Object[]{this, httpHost, inetAddress, new Boolean(z), new Integer(i)});
            return;
        }
        try {
            AlipayHttpDnsClient.getDnsClient().feedback(httpHost.getHostName(), inetAddress.getHostAddress(), z, i);
            if (!z) {
                HttpDns.getInstance().getGetAllByNameHelper().removeCache(httpHost.getHostName());
            }
        } catch (Throwable th) {
            LogCatUtil.error("ClientConnectionOperator", th);
        }
    }

    public final boolean l(HttpContext httpContext) {
        TransportContext j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("142e475c", new Object[]{this, httpContext})).booleanValue();
        }
        if (httpContext == null || (j = j(httpContext)) == null || j.allowedRetryDuration < 1) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() - j.startExecutionTime;
        LogCatUtil.info("ClientConnectionOperator", "[isAllowedRetryDuration] timeLeft = " + currentTimeMillis + ", startExecutionTime = " + j.startExecutionTime + ", allowedRetryDuration = " + j.allowedRetryDuration);
        if (currentTimeMillis < 1) {
            LogCatUtil.warn("ClientConnectionOperator", "[isAllowedRetryDuration] Illegal time left.");
            return false;
        } else if (currentTimeMillis <= j.allowedRetryDuration) {
            return true;
        } else {
            LogCatUtil.warn("ClientConnectionOperator", "[isAllowedRetryDuration] No time left.");
            return false;
        }
    }

    public void openConnection(OperatedClientConnection operatedClientConnection, HttpHost httpHost, InetAddress inetAddress, HttpContext httpContext, HttpParams httpParams) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8324963a", new Object[]{this, operatedClientConnection, httpHost, inetAddress, httpContext, httpParams});
            return;
        }
        d(httpContext);
        while (true) {
            try {
                c(operatedClientConnection, httpHost, inetAddress, httpContext, httpParams);
                return;
            } catch (IOException e) {
                assertShutdown(operatedClientConnection, e);
                if ((e instanceof HttpException) && !((HttpException) e).isCanRetry()) {
                    throw e;
                } else if (!l(httpContext)) {
                    throw e;
                } else if (i < 120) {
                    try {
                        LogCatUtil.warn("ClientConnectionOperator", "[openConnection] Retry the build task after 1s .");
                        Thread.sleep(1000L);
                        i++;
                    } catch (Throwable th) {
                        LogCatUtil.warn("ClientConnectionOperator", "[openConnection] Maybe thread interrupted. Exception = " + th.toString());
                        throw e;
                    }
                } else {
                    LogCatUtil.warn("ClientConnectionOperator", "[openConnection] Limit connection, i = " + i);
                    throw e;
                }
            }
        }
    }

    public void openConnectionCustome(OperatedClientConnection operatedClientConnection, HttpHost httpHost, InetAddress inetAddress, HttpContext httpContext, HttpParams httpParams) {
        LayeredSocketFactory layeredSocketFactory;
        SocketFactory socketFactory;
        HttpHost httpHost2;
        InetAddress[] inetAddressArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b06009e", new Object[]{this, operatedClientConnection, httpHost, inetAddress, httpContext, httpParams});
        } else if (operatedClientConnection == null) {
            throw new IllegalArgumentException("Connection must not be null.");
        } else if (httpHost == null) {
            throw new IllegalArgumentException("Target host must not be null.");
        } else if (httpParams == null) {
            throw new IllegalArgumentException("Parameters must not be null.");
        } else if (!operatedClientConnection.isOpen()) {
            Scheme scheme = ((DefaultClientConnectionOperator) this).schemeRegistry.getScheme(httpHost.getSchemeName());
            SocketFactory socketFactory2 = scheme.getSocketFactory();
            if (socketFactory2 instanceof LayeredSocketFactory) {
                socketFactory = d;
                layeredSocketFactory = (LayeredSocketFactory) socketFactory2;
            } else {
                socketFactory = socketFactory2;
                layeredSocketFactory = null;
            }
            Pair<String, Integer> bindHostPairByDomain = UserNetworkPreferencesManager.getInstance().getBindHostPairByDomain(httpHost.getHostName());
            if (bindHostPairByDomain != null) {
                inetAddressArr = new InetAddress[]{InetAddress.getByAddress(DnsUtil.ipToBytesByReg((String) bindHostPairByDomain.first))};
                httpHost2 = new HttpHost(httpHost.getHostName(), ((Integer) bindHostPairByDomain.second).intValue(), httpHost.getSchemeName());
            } else {
                httpHost2 = httpHost;
                inetAddressArr = null;
            }
            if (inetAddressArr == null) {
                inetAddressArr = DnsUtil.isLogicIP(httpHost2.getHostName()) ? new InetAddress[]{InetAddress.getByAddress(DnsUtil.ipToBytesByReg(httpHost2.getHostName()))} : i(httpHost2, httpContext, operatedClientConnection);
            }
            int i = 0;
            while (true) {
                try {
                    connect(operatedClientConnection, httpHost2, inetAddress, httpContext, httpParams, scheme, socketFactory2, socketFactory, layeredSocketFactory, inetAddressArr);
                    return;
                } catch (IOException e) {
                    LogCatUtil.debug("ClientConnectionOperator", "openConnectionCustome ex=[" + e.toString() + "]");
                    assertShutdown(operatedClientConnection, e);
                    if (i >= 4) {
                        LogCatUtil.debug("ClientConnectionOperator", "connRetryCount>=4, Don't retry");
                        throw e;
                    } else if (!NetworkUtils.isNetworkAvailable(TransportEnvUtil.getContext())) {
                        LogCatUtil.debug("ClientConnectionOperator", "Network not available, Don't retry");
                        throw e;
                    } else if (DnsUtil.isLogicIP(httpHost2.getHostName())) {
                        LogCatUtil.debug("ClientConnectionOperator", "Logic ip, Don't retry");
                        throw e;
                    } else if (!TransportContextThreadLocalUtils.isFromLocalDns()) {
                        if (TransportContextThreadLocalUtils.isFromHttpDns()) {
                            LogCatUtil.debug("ClientConnectionOperator", "openConnectionCustome ex,remove ips in httpdns,try iprank");
                            AlipayHttpDnsClient dnsClient = AlipayHttpDnsClient.getDnsClient();
                            if (dnsClient != null) {
                                dnsClient.setErrorByHost(httpHost2.getHostName());
                            }
                            try {
                                inetAddressArr = DnsUtil.getAllByName(httpHost2.getHostName());
                            } catch (Throwable th) {
                                LogCatUtil.warn("ClientConnectionOperator", "AlipayDNSHelper#getAllByName error: " + th.toString());
                                inetAddressArr = null;
                            }
                            if (inetAddressArr == null || inetAddressArr.length == 0) {
                                throw e;
                            }
                        } else if (TransportContextThreadLocalUtils.isFromIpRank()) {
                            LogCatUtil.debug("ClientConnectionOperator", "openConnectionCustome ex,remove ips in iprank,try localdns");
                            try {
                                inetAddressArr = DnsUtil.getAllByName(httpHost2.getHostName());
                            } catch (Throwable th2) {
                                LogCatUtil.warn("ClientConnectionOperator", "AlipayDNSHelper#getAllByNameByLocalDNS error: " + th2.toString());
                                inetAddressArr = null;
                            }
                            if (inetAddressArr == null || inetAddressArr.length == 0) {
                                throw e;
                            }
                        } else if (!TransportContextThreadLocalUtils.isFromLocalCacheDns() || a().contains(RPCDataItems.VALUE_DT_LOCAL_CACHE_DNS)) {
                            throw e;
                        } else {
                            LogCatUtil.debug("ClientConnectionOperator", "openConnectionCustome exception,remove ips in local cache,try localdns");
                            HttpDns.getInstance().getGetAllByNameHelper().removeCache(httpHost2.getHostName());
                            try {
                                inetAddressArr = HttpDns.getInstance().getGetAllByNameHelper().getAllByName(httpHost2.getHostName());
                            } catch (Throwable th3) {
                                LogCatUtil.warn("ClientConnectionOperator", "getGetAllByNameHelper#getAllByName error: " + th3.toString());
                                inetAddressArr = null;
                            }
                            if (inetAddressArr == null || inetAddressArr.length <= 0) {
                                throw e;
                            }
                            a().add(RPCDataItems.VALUE_DT_LOCAL_CACHE_DNS);
                        }
                        i++;
                        httpHost2 = httpHost2;
                        socketFactory2 = socketFactory2;
                    } else {
                        LogCatUtil.debug("ClientConnectionOperator", "Local dns, Don't retry");
                        throw e;
                    }
                }
            }
            throw e;
        } else {
            throw new IllegalArgumentException("Connection must not be open.");
        }
    }

    public void prepareSocket(Socket socket, HttpContext httpContext, HttpParams httpParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9c85d3f", new Object[]{this, socket, httpContext, httpParams});
            return;
        }
        ZClientConnectionOperator.super.prepareSocket(socket, httpContext, httpParams);
        int soTimeout = HttpConnectionParams.getSoTimeout(httpParams);
        if (soTimeout > 0) {
            boolean sndTimeOut = SocketUtil.setSndTimeOut(socket, soTimeout);
            LogCatUtil.info("ClientConnectionOperator", "setSndTimeOut result: " + sndTimeOut);
        }
    }

    public final void c(OperatedClientConnection operatedClientConnection, HttpHost httpHost, InetAddress inetAddress, HttpContext httpContext, HttpParams httpParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cdf1853", new Object[]{this, operatedClientConnection, httpHost, inetAddress, httpContext, httpParams});
        } else if (this.b == 2) {
            try {
                ZClientConnectionOperator.super.openConnection(operatedClientConnection, httpHost, inetAddress, httpContext, httpParams);
                this.b = (byte) 2;
                try {
                    j(httpContext).getCurrentDataContainer().putDataItem(RPCDataItems.ORIGHC, "T");
                } catch (Exception e) {
                    LogCatUtil.warn("ClientConnectionOperator", "putDataItem1 exception : " + e.toString());
                }
            } catch (IOException e2) {
                assertShutdown(operatedClientConnection, e2);
                if (NetworkUtils.isNetworkAvailable(TransportEnvUtil.getContext())) {
                    byte b = (byte) (this.f4083a + 1);
                    this.f4083a = b;
                    if (b >= 5) {
                        this.f4083a = (byte) 0;
                        LogCatUtil.info("ClientConnectionOperator", "ZClientConnectionOperator. use cust retry!");
                        openConnectionCustome(operatedClientConnection, httpHost, inetAddress, httpContext, httpParams);
                        this.b = (byte) 1;
                        return;
                    }
                    LogCatUtil.warn("ClientConnectionOperator", "ZClientConnectionOperator. orig err count : " + ((int) this.f4083a));
                    throw e2;
                }
                LogCatUtil.warn("ClientConnectionOperator", "ZClientConnectionOperator. isNetworkAvailable == false ");
                throw e2;
            }
        } else {
            try {
                openConnectionCustome(operatedClientConnection, httpHost, inetAddress, httpContext, httpParams);
                this.b = (byte) 1;
            } catch (IOException e3) {
                assertShutdown(operatedClientConnection, e3);
                if ((e3 instanceof HttpException) && !((HttpException) e3).isCanRetry()) {
                    throw e3;
                } else if (NetworkUtils.isNetworkAvailable(TransportEnvUtil.getContext())) {
                    byte b2 = (byte) (this.f4083a + 1);
                    this.f4083a = b2;
                    if (b2 >= 5) {
                        this.f4083a = (byte) 0;
                        LogCatUtil.info("ClientConnectionOperator", "ZClientConnectionOperator. use origin retry!");
                        ZClientConnectionOperator.super.openConnection(operatedClientConnection, httpHost, inetAddress, httpContext, httpParams);
                        this.b = (byte) 2;
                        try {
                            j(httpContext).getCurrentDataContainer().putDataItem(RPCDataItems.ORIGHC, "T");
                        } catch (Exception e4) {
                            LogCatUtil.warn("ClientConnectionOperator", "putDataItem exception : " + e4.toString());
                        }
                    } else {
                        LogCatUtil.warn("ClientConnectionOperator", "ZClientConnectionOperator. cust err count : " + ((int) this.f4083a));
                        throw e3;
                    }
                } else {
                    LogCatUtil.warn("ClientConnectionOperator", "ZClientConnectionOperator. isNetworkAvailable == false ");
                    throw e3;
                }
            }
        }
    }
}
