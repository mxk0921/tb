package com.alipay.android.msp.network.http.http;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.net.InetAddress;
import org.apache.http.HttpHost;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.scheme.LayeredSocketFactory;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.impl.conn.DefaultClientConnectionOperator;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ZClientConnectionOperator extends DefaultClientConnectionOperator {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final PlainSocketFactory b = new PlainSocketFactory();

    /* renamed from: a  reason: collision with root package name */
    public boolean f3706a = true;

    public ZClientConnectionOperator(SchemeRegistry schemeRegistry) {
        super(schemeRegistry);
    }

    public static void a(IOException iOException) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cf264cc", new Object[]{iOException});
        } else if (iOException != null && !TextUtils.isEmpty(iOException.getMessage()) && iOException.getMessage().contains("shutdown")) {
            throw iOException;
        }
    }

    public static /* synthetic */ Object ipc$super(ZClientConnectionOperator zClientConnectionOperator, String str, Object... objArr) {
        if (str.hashCode() == -2094754246) {
            ZClientConnectionOperator.super.openConnection((OperatedClientConnection) objArr[0], (HttpHost) objArr[1], (InetAddress) objArr[2], (HttpContext) objArr[3], (HttpParams) objArr[4]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/network/http/http/ZClientConnectionOperator");
    }

    public final InetAddress[] c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InetAddress[]) ipChange.ipc$dispatch("549a6e1c", new Object[]{this, str});
        }
        this.f3706a = true;
        InetAddress[] inetAddresses = PluginManager.getDnsEngine().getInetAddresses(str);
        if (inetAddresses != null && inetAddresses.length != 0) {
            return inetAddresses;
        }
        this.f3706a = false;
        LogUtil.record(4, "", "ZClientConnectionOperator::getInetAddresses", "get empty InetAddress from DnsManager, try InetAddress.getAllByName");
        try {
            return InetAddress.getAllByName(str);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return inetAddresses;
        }
    }

    public void openConnection(OperatedClientConnection operatedClientConnection, HttpHost httpHost, InetAddress inetAddress, HttpContext httpContext, HttpParams httpParams) throws IOException {
        LayeredSocketFactory layeredSocketFactory;
        SocketFactory socketFactory;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8324963a", new Object[]{this, operatedClientConnection, httpHost, inetAddress, httpContext, httpParams});
            return;
        }
        LogUtil.record(4, "", "ZClientConnectionOperator::openConnection", "startPay");
        if (PluginManager.getDnsEngine().isClientConnDegrade()) {
            ZClientConnectionOperator.super.openConnection(operatedClientConnection, httpHost, inetAddress, httpContext, httpParams);
            return;
        }
        try {
            LogUtil.record(4, "", "ZClientConnectionOperator::openConnection", "try custom open conn");
            if (operatedClientConnection == null) {
                throw new IllegalArgumentException("Connection must not be null.");
            } else if (httpHost == null) {
                throw new IllegalArgumentException("Target host must not be null.");
            } else if (httpParams == null) {
                throw new IllegalArgumentException("Parameters must not be null.");
            } else if (!operatedClientConnection.isOpen()) {
                Scheme scheme = ((DefaultClientConnectionOperator) this).schemeRegistry.getScheme(httpHost.getSchemeName());
                SocketFactory socketFactory2 = scheme.getSocketFactory();
                if (socketFactory2 instanceof LayeredSocketFactory) {
                    socketFactory = b;
                    layeredSocketFactory = (LayeredSocketFactory) socketFactory2;
                } else {
                    layeredSocketFactory = null;
                    socketFactory = socketFactory2;
                }
                String hostName = httpHost.getHostName();
                InetAddress[] c = DnsUtil.isLogicIP(hostName) ? new InetAddress[]{InetAddress.getByAddress(DnsUtil.ipToBytesByReg(hostName))} : c(hostName);
                if (c == null) {
                    LogUtil.record(4, "", "ZClientConnectionOperator::openCustomConnection", "query addresses failed, call default impl.");
                    ZClientConnectionOperator.super.openConnection(operatedClientConnection, httpHost, inetAddress, httpContext, httpParams);
                    return;
                }
                LogUtil.record(4, "", "ZClientConnectionOperator::openCustomConnection", "addresses len:" + c.length);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                b(operatedClientConnection, httpHost, inetAddress, httpContext, httpParams, scheme, socketFactory2, socketFactory, layeredSocketFactory, c);
                LogUtil.record(4, "", "ZClientConnectionOperator::openCustomConnection", "CustomConnectTime: " + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
            } else {
                throw new IllegalArgumentException("Connection must not be open.");
            }
        } catch (IOException e) {
            a(e);
            ZClientConnectionOperator.super.openConnection(operatedClientConnection, httpHost, inetAddress, httpContext, httpParams);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b3 A[LOOP:0: B:7:0x005f->B:65:0x01b3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0194 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v7, types: [org.apache.http.params.HttpParams] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.net.InetAddress] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Unknown variable types count: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(org.apache.http.conn.OperatedClientConnection r25, org.apache.http.HttpHost r26, java.net.InetAddress r27, org.apache.http.protocol.HttpContext r28, org.apache.http.params.HttpParams r29, org.apache.http.conn.scheme.Scheme r30, org.apache.http.conn.scheme.SocketFactory r31, org.apache.http.conn.scheme.SocketFactory r32, org.apache.http.conn.scheme.LayeredSocketFactory r33, java.net.InetAddress[] r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.network.http.http.ZClientConnectionOperator.b(org.apache.http.conn.OperatedClientConnection, org.apache.http.HttpHost, java.net.InetAddress, org.apache.http.protocol.HttpContext, org.apache.http.params.HttpParams, org.apache.http.conn.scheme.Scheme, org.apache.http.conn.scheme.SocketFactory, org.apache.http.conn.scheme.SocketFactory, org.apache.http.conn.scheme.LayeredSocketFactory, java.net.InetAddress[]):void");
    }
}
