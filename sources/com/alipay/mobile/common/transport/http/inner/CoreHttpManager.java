package com.alipay.mobile.common.transport.http.inner;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.mobile.common.transport.Request;
import com.alipay.mobile.common.transport.Response;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.concurrent.TaskExecutorManager;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.download.DownloadRequest;
import com.alipay.mobile.common.transport.ext.ExtTransportOffice;
import com.alipay.mobile.common.transport.h5.H5HttpUrlRequest;
import com.alipay.mobile.common.transport.http.AndroidHttpClient;
import com.alipay.mobile.common.transport.http.HttpContextExtend;
import com.alipay.mobile.common.transport.http.HttpManager;
import com.alipay.mobile.common.transport.http.HttpTask;
import com.alipay.mobile.common.transport.http.HttpUrlRequest;
import com.alipay.mobile.common.transport.http.HttpWorker;
import com.alipay.mobile.common.transport.httpdns.AlipayHttpDnsInitRunnable;
import com.alipay.mobile.common.transport.httpdns.DnsUtil;
import com.alipay.mobile.common.transport.strategy.NetworkTunnelStrategy;
import com.alipay.mobile.common.transport.utils.APNetworkStartupUtil;
import com.alipay.mobile.common.transport.utils.AppStartNetWorkingHelper;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.NwSharedSwitchUtil;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.Security;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.conn.ssl.SSLSocketFactory;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class CoreHttpManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static CoreHttpManager DEFAULT_HTTP_MANAGER = null;
    public static final String TAG = "HttpManager";

    /* renamed from: a  reason: collision with root package name */
    public AndroidHttpClient f4093a;
    public AndroidHttpClient b;
    public AndroidHttpClient c;
    public AndroidHttpClient d;
    public TaskExecutorManager e;
    public final CountDownLatch f = new CountDownLatch(1);
    public long g;
    public long h;
    public long i;
    public int j;
    public Context mContext;

    public CoreHttpManager(Context context) {
        this.mContext = context;
        b();
    }

    public static /* synthetic */ void access$000(CoreHttpManager coreHttpManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f733c570", new Object[]{coreHttpManager});
        } else {
            coreHttpManager.e();
        }
    }

    public static /* synthetic */ void access$100(CoreHttpManager coreHttpManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3014260f", new Object[]{coreHttpManager});
        } else {
            coreHttpManager.c();
        }
    }

    public static /* synthetic */ void access$200(CoreHttpManager coreHttpManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68f486ae", new Object[]{coreHttpManager});
        } else {
            coreHttpManager.g();
        }
    }

    public static /* synthetic */ CountDownLatch access$300(CoreHttpManager coreHttpManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CountDownLatch) ipChange.ipc$dispatch("84dcd7b3", new Object[]{coreHttpManager});
        }
        return coreHttpManager.f;
    }

    public static final CoreHttpManager getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CoreHttpManager) ipChange.ipc$dispatch("a2ad316d", new Object[]{context});
        }
        CoreHttpManager coreHttpManager = DEFAULT_HTTP_MANAGER;
        if (coreHttpManager != null) {
            return coreHttpManager;
        }
        synchronized (CoreHttpManager.class) {
            try {
                CoreHttpManager coreHttpManager2 = DEFAULT_HTTP_MANAGER;
                if (coreHttpManager2 != null) {
                    return coreHttpManager2;
                }
                CoreHttpManager coreHttpManager3 = new CoreHttpManager(context);
                DEFAULT_HTTP_MANAGER = coreHttpManager3;
                return coreHttpManager3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[0]);
        } else {
            HttpsURLConnection.setDefaultHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
        }
    }

    public void addConnectTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("876a5167", new Object[]{this, new Long(j)});
            return;
        }
        this.h += j;
        this.j++;
    }

    public void addDataSize(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab683011", new Object[]{this, new Long(j)});
        } else {
            this.g += j;
        }
    }

    public void addSocketTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8623635c", new Object[]{this, new Long(j)});
        } else {
            this.i += j;
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        LogCatUtil.info("HttpManager", "Transport start init ..");
        TransportEnvUtil.setContext(this.mContext);
        h();
        i();
        getHttpClient();
        APNetworkStartupUtil.notifyNetworkStartupListener();
        this.e = TaskExecutorManager.getInstance(this.mContext);
        NetworkAsyncTaskExecutor.execute(new Runnable() { // from class: com.alipay.mobile.common.transport.http.inner.CoreHttpManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    HttpContextExtend.createInstance(CoreHttpManager.this.mContext);
                    NwSharedSwitchUtil.init();
                    CoreHttpManager.access$000(CoreHttpManager.this);
                    CoreHttpManager.access$100(CoreHttpManager.this);
                    CoreHttpManager.access$200(CoreHttpManager.this);
                    CoreHttpManager.this.notifyFirstTunnelChanged();
                    LogCatUtil.info("HttpManager", "Transport async init finish.");
                } catch (Throwable th) {
                    LogCatUtil.error("HttpManager", "Network init very serious error. ", th);
                }
                try {
                    CoreHttpManager.access$300(CoreHttpManager.this).countDown();
                } catch (Throwable th2) {
                    LogCatUtil.warn("HttpManager", "countDown exception. " + th2.toString());
                }
            }
        });
        LogCatUtil.info("HttpManager", "Transport init finish.");
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            Context context = this.mContext;
            AppStartNetWorkingHelper.runOnAppStart(new AlipayHttpDnsInitRunnable(context, DnsUtil.getFlag(context)), this.mContext);
        } catch (Exception e) {
            LogCatUtil.warn("HttpManager", "runOnAppStart exception : " + e.toString());
        }
    }

    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        this.e.closeAllSingleThreadPool();
        AndroidHttpClient androidHttpClient = this.f4093a;
        if (androidHttpClient != null) {
            androidHttpClient.close();
            this.f4093a = null;
        }
    }

    public HttpTask createTask(HttpWorker httpWorker, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpTask) ipChange.ipc$dispatch("b631b260", new Object[]{this, httpWorker, new Integer(i)});
        }
        return new HttpTask(httpWorker, i);
    }

    public String dumpPerf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b1785492", new Object[]{this, str});
        }
        try {
            return String.format(str + "#" + hashCode() + ": Avarage Speed = %d KB/S, Connetct Time = %d ms, All data size = %d bytes, All enqueueConnect time = %d ms, All socket time = %d ms, All request times = %d times", Long.valueOf(getAverageSpeed()), Long.valueOf(getAverageConnectTime()), Long.valueOf(this.g), Long.valueOf(this.h), Long.valueOf(this.i), Integer.valueOf(this.j));
        } catch (Exception unused) {
            LogCatUtil.warn("HttpManager", "dumpPerf exception");
            return "";
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.mContext == null) {
            LogCatUtil.error("HttpManager", "initConfigWithStrategy. mContext is null.");
        } else {
            TransportConfigureManager.getInstance().firstUpdateConfig(this.mContext);
            NetworkTunnelStrategy.getInstance().init(this.mContext, HttpContextExtend.getInstance().getDid());
            TransportStrategy.init();
        }
    }

    public Future<Response> execute(HttpManager httpManager, Request request) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("3ce5de1d", new Object[]{this, httpManager, request});
        }
        if (!(request instanceof HttpUrlRequest)) {
            StringBuilder sb = new StringBuilder("request not instanceof HttpUrlRequest. request=[");
            if (request != null) {
                str = request.getClass().getName();
            } else {
                str = " is null. ";
            }
            sb.append(str);
            sb.append("]");
            throw new IllegalArgumentException(sb.toString());
        }
        try {
            if (this.f.getCount() == 1) {
                LogCatUtil.info("HttpManager", "waiting for transport init complete!");
            }
            this.f.await();
        } catch (InterruptedException e) {
            LogCatUtil.warn("HttpManager", "countDownLatch await exception. " + e.toString());
        }
        if (MiscUtils.isDebugger(this.mContext)) {
            LogCatUtil.info("HttpManager", dumpPerf(httpManager.getClass().getSimpleName()));
        }
        HttpUrlRequest httpUrlRequest = (HttpUrlRequest) request;
        return this.e.execute(createTask(httpManager.generateWorker(httpUrlRequest), a(httpUrlRequest)));
    }

    public final boolean f(HttpUrlRequest httpUrlRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9409d8a2", new Object[]{this, httpUrlRequest})).booleanValue();
        }
        boolean urgentFlag = httpUrlRequest.getUrgentFlag();
        if (urgentFlag) {
            LogCatUtil.debug("HttpManager", "Request is Urgent RPC: " + urgentFlag);
        }
        String stringValue = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.USE_URGENT_RPC_POOL);
        if (TextUtils.isEmpty(stringValue) || !stringValue.startsWith("T")) {
            return false;
        }
        return urgentFlag;
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        ExtTransportOffice instance = ExtTransportOffice.getInstance();
        instance.setContext(this.mContext);
        if (instance.isEnableExtTransport(this.mContext) && !MiscUtils.isPushProcess(this.mContext)) {
            instance.init(this.mContext);
        }
    }

    public long getAverageConnectTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43b2aeeb", new Object[]{this})).longValue();
        }
        int i = this.j;
        if (i == 0) {
            return 0L;
        }
        return this.h / i;
    }

    public long getAverageSpeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26e0431b", new Object[]{this})).longValue();
        }
        long j = this.i;
        if (j == 0) {
            return 0L;
        }
        return ((this.g * 1000) / j) >> 10;
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.mContext;
    }

    public AndroidHttpClient getDjgHttpClient() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AndroidHttpClient) ipChange.ipc$dispatch("3be7a487", new Object[]{this});
        }
        AndroidHttpClient androidHttpClient = this.c;
        if (androidHttpClient != null) {
            return androidHttpClient;
        }
        synchronized (this) {
            try {
                AndroidHttpClient androidHttpClient2 = this.c;
                if (androidHttpClient2 != null) {
                    return androidHttpClient2;
                }
                if (androidHttpClient2 == null) {
                    this.c = AndroidHttpClient.newInstanceOfBigConn("Android_MWallet_DJango");
                }
                return this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public AndroidHttpClient getH5HttpClient() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AndroidHttpClient) ipChange.ipc$dispatch("9bf4f1df", new Object[]{this});
        }
        AndroidHttpClient androidHttpClient = this.b;
        if (androidHttpClient != null) {
            return androidHttpClient;
        }
        synchronized (this) {
            try {
                AndroidHttpClient androidHttpClient2 = this.b;
                if (androidHttpClient2 != null) {
                    return androidHttpClient2;
                }
                if (androidHttpClient2 == null) {
                    this.b = AndroidHttpClient.newDefaultInstance();
                }
                return this.b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public AndroidHttpClient getHttpClient() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AndroidHttpClient) ipChange.ipc$dispatch("909d0b72", new Object[]{this});
        }
        AndroidHttpClient androidHttpClient = this.f4093a;
        if (androidHttpClient != null) {
            return androidHttpClient;
        }
        synchronized (this) {
            try {
                AndroidHttpClient androidHttpClient2 = this.f4093a;
                if (androidHttpClient2 != null) {
                    return androidHttpClient2;
                }
                if (androidHttpClient2 == null) {
                    this.f4093a = AndroidHttpClient.newDefaultInstance();
                }
                return this.f4093a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public AndroidHttpClient getLogHttpClient() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AndroidHttpClient) ipChange.ipc$dispatch("5d8dd82a", new Object[]{this});
        }
        AndroidHttpClient androidHttpClient = this.d;
        if (androidHttpClient != null) {
            return androidHttpClient;
        }
        synchronized (this) {
            try {
                AndroidHttpClient androidHttpClient2 = this.d;
                if (androidHttpClient2 != null) {
                    return androidHttpClient2;
                }
                if (androidHttpClient2 == null) {
                    this.d = AndroidHttpClient.newDefaultInstance();
                }
                return this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            Security.setProperty("networkaddress.cache.ttl", String.valueOf(-1));
        }
    }

    public void notifyFirstTunnelChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fde58d8c", new Object[]{this});
        } else if ((!MiscUtils.isInAlipayClient(this.mContext) && !TransportStrategy.isEnabledEnhanceNetworkModule()) || !MiscUtils.isPushProcess(this.mContext)) {
            NetworkTunnelStrategy.getInstance().notifyFirstTunnelChanged();
        }
    }

    public void setDjgHttpClient(AndroidHttpClient androidHttpClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc9c02b9", new Object[]{this, androidHttpClient});
        } else {
            this.c = androidHttpClient;
        }
    }

    public void setH5HttpClient(AndroidHttpClient androidHttpClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("345d98c9", new Object[]{this, androidHttpClient});
            return;
        }
        synchronized (this) {
            this.b = androidHttpClient;
        }
    }

    public void setHttpClient(AndroidHttpClient androidHttpClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1befe96", new Object[]{this, androidHttpClient});
        } else {
            this.f4093a = androidHttpClient;
        }
    }

    public final boolean d(HttpUrlRequest httpUrlRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9943821", new Object[]{this, httpUrlRequest})).booleanValue();
        }
        String tag = httpUrlRequest.getTag("operationType");
        if (TextUtils.isEmpty(tag)) {
            return true;
        }
        if (httpUrlRequest.isBgRpc()) {
            LogCatUtil.debug("BgRpc", "Background RPC： " + tag);
            return true;
        } else if (!MiscUtils.isBgRpc(tag)) {
            return false;
        } else {
            httpUrlRequest.setBgRpc(true);
            LogCatUtil.warn("BgRpc", "Warning: Force bg RPC :" + tag);
            return true;
        }
    }

    public final int a(HttpUrlRequest httpUrlRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1f1e978f", new Object[]{this, httpUrlRequest})).intValue();
        }
        if (f(httpUrlRequest)) {
            return 4;
        }
        String tag = httpUrlRequest.getTag("operationType");
        if (TextUtils.equals(tag, DownloadRequest.OPERATION_TYPE)) {
            try {
                URL url = new URL(httpUrlRequest.getUrl());
                if (!url.getPath().endsWith(".amr") && !url.getPath().endsWith(".jar")) {
                    return 2;
                }
                return ((DownloadRequest) httpUrlRequest).isUrgentResource() ? 8 : 3;
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        } else if (TextUtils.equals(tag, H5HttpUrlRequest.OPERATION_TYPE)) {
            return 6;
        } else {
            return d(httpUrlRequest) ? 1 : 0;
        }
    }
}
