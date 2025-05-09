package com.alipay.mobile.common.transport.httpdns;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.MonitorItemConstants;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorLoggerModel;
import com.alipay.mobile.common.netsdkextdependapi.userinfo.UserInfoUtil;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.context.TransportContext;
import com.alipay.mobile.common.transport.ext.ExtTransportOffice;
import com.alipay.mobile.common.transport.http.HttpContextExtend;
import com.alipay.mobile.common.transport.httpdns.downloader.ConfigSelector;
import com.alipay.mobile.common.transport.httpdns.downloader.HttpClient;
import com.alipay.mobile.common.transport.httpdns.downloader.StrategyRequest;
import com.alipay.mobile.common.transport.httpdns.downloader.StrategyResponse;
import com.alipay.mobile.common.transport.monitor.MonitorLoggerUtils;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.MpaasPropertiesUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.NetworkUtils;
import com.alipay.mobile.common.transport.utils.NwSharedSwitchUtil;
import com.alipay.mobile.common.transport.utils.SwitchMonitorLogUtil;
import com.alipay.mobile.common.transport.utils.TransportContextThreadLocalUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import tb.h1p;
import tb.wu2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class HttpDns {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static int IP_TYPE_V4 = 4;
    public static int IP_TYPE_V6 = 6;
    public static final int REQ_STATUS_BUSY = 1;
    public static final int REQ_STATUS_IDLE = 0;
    public static final String TAG = "HDNS";
    public static long localDnsExpire = 300000;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<String> f4101a;
    public String b;
    public ArgType c;
    public DnsLocalManager d;
    public GetAllByNameHelper e;
    public Context f;
    public boolean fail;
    public int g;
    public int h;
    public boolean hashost;
    public String httpServerUrl;
    public String httpdns_domain;
    public int httpdns_port;
    public long i;
    public final long j;
    public boolean k;
    public String path;
    public final String schema;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum ArgType {
        LIST_INIT,
        ADD_NEW,
        HAS_FAIL
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class DnsReqTask implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public DnsReqTask() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                HttpDns.access$200(HttpDns.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class DnsReqTaskStrong implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private ConfigSelector f4103a;

        public DnsReqTaskStrong(ConfigSelector configSelector) {
            this.f4103a = configSelector;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                HttpDns.access$300(HttpDns.this, this.f4103a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class GetAllByNameHelper {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, SimpleLocalDnsModel> f4104a = new HashMap(4);

        public GetAllByNameHelper() {
        }

        public final UnknownHostException a(String str, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (UnknownHostException) ipChange.ipc$dispatch("fceb48f8", new Object[]{this, str, th});
            }
            UnknownHostException unknownHostException = new UnknownHostException("original hostname: " + str);
            try {
                unknownHostException.initCause(th);
                return unknownHostException;
            } catch (Exception unused) {
                if (th instanceof UnknownHostException) {
                    throw ((UnknownHostException) th);
                }
                throw new UnknownHostException(" host:" + str + "  message: " + th.toString());
            }
        }

        public void asyncLocalDns2Cache(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("782ac65b", new Object[]{this, str});
                return;
            }
            final Future submit = NetworkAsyncTaskExecutor.submit(new InetAddrGetAllByNameTask(str));
            if (submit != null && !submit.isDone()) {
                NetworkAsyncTaskExecutor.schedule(new Runnable() { // from class: com.alipay.mobile.common.transport.httpdns.HttpDns.GetAllByNameHelper.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        Future future = submit;
                        if (future != null && !future.isDone()) {
                            try {
                                submit.cancel(true);
                            } catch (Throwable th) {
                                LogCatUtil.warn(HttpDns.TAG, "asyncRequestInetAddresses#run fail.", th);
                            }
                        }
                    }
                }, TransportConfigureManager.getInstance().getIntValue(TransportConfigureItem.GET_ALL_BY_NAME_TIME_OUT), TimeUnit.SECONDS);
            }
        }

        public final InetAddress[] c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InetAddress[]) ipChange.ipc$dispatch("b992fb45", new Object[]{this, str});
            }
            InetAddress[] cache = getCache(str);
            if (cache != null) {
                LogCatUtil.info(HttpDns.TAG, "getAllByName. From memcache get " + str + " IP");
                return cache;
            }
            synchronized (str) {
                try {
                    InetAddress[] cache2 = getCache(str);
                    if (cache2 != null) {
                        LogCatUtil.info(HttpDns.TAG, "getAllByName. From memcache get " + str + " IP");
                        return cache2;
                    }
                    return d(str);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void clearCache() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8aded33c", new Object[]{this});
                return;
            }
            try {
                Map<String, SimpleLocalDnsModel> map = this.f4104a;
                if (map != null && !((HashMap) map).isEmpty()) {
                    synchronized (this) {
                        ((HashMap) this.f4104a).clear();
                    }
                }
            } catch (Throwable th) {
                LogCatUtil.error(HttpDns.TAG, "clearCache error, msg: " + th.toString());
            }
        }

        public final InetAddress[] d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InetAddress[]) ipChange.ipc$dispatch("5433bdc6", new Object[]{this, str});
            }
            Future<InetAddress[]> future = null;
            try {
                TransportContextThreadLocalUtils.addDnsType(RPCDataItems.VALUE_DT_LOCALDNS);
                int intValue = TransportConfigureManager.getInstance().getIntValue(TransportConfigureItem.GET_ALL_BY_NAME_TIME_OUT);
                future = NetworkAsyncTaskExecutor.submit(new InetAddrGetAllByNameTask(str));
                InetAddress[] inetAddressArr = future.get(intValue, TimeUnit.SECONDS);
                b(future);
                return inetAddressArr;
            } catch (Throwable th) {
                try {
                    if (!(th instanceof UnknownHostException)) {
                        Throwable rootCause = MiscUtils.getRootCause(th);
                        if (rootCause == null || !(rootCause instanceof UnknownHostException)) {
                            throw a(str, th);
                        }
                        throw a(str, rootCause);
                    }
                    throw a(str, th);
                } catch (Throwable th2) {
                    b(future);
                    throw th2;
                }
            }
        }

        public InetAddress[] getAllByName(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InetAddress[]) ipChange.ipc$dispatch("a258dab1", new Object[]{this, str});
            }
            if (TextUtils.equals("T", TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.IPRANK_MODEL_SWITCH))) {
                return DnsUtil.getAllByName(str);
            }
            return c(str);
        }

        public InetAddress[] getCache(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InetAddress[]) ipChange.ipc$dispatch("4a971c30", new Object[]{this, str});
            }
            try {
                SimpleLocalDnsModel simpleLocalDnsModel = (SimpleLocalDnsModel) ((HashMap) this.f4104a).get(str);
                if (simpleLocalDnsModel == null) {
                    return null;
                }
                if (simpleLocalDnsModel.isExpiration()) {
                    LogCatUtil.info(HttpDns.TAG, "getCache. cache expire host: " + str);
                    synchronized (this) {
                        ((HashMap) this.f4104a).remove(str);
                    }
                    return null;
                }
                InetAddress[] inetAddressArr = simpleLocalDnsModel.inetAddressesCache;
                if (inetAddressArr != null && inetAddressArr.length > 0) {
                    TransportContextThreadLocalUtils.addDnsType(RPCDataItems.VALUE_DT_LOCAL_CACHE_DNS);
                    LogCatUtil.printInfo(HttpDns.TAG, "getCache. host=" + str + ", address len=" + inetAddressArr.length);
                    return inetAddressArr;
                }
                return null;
            } catch (Throwable th) {
                LogCatUtil.warn(HttpDns.TAG, "getCache fail", th);
                return null;
            }
        }

        public void removeCache(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("53ae396f", new Object[]{this, str});
                return;
            }
            try {
                Map<String, SimpleLocalDnsModel> map = this.f4104a;
                if (map != null && !((HashMap) map).isEmpty()) {
                    synchronized (this) {
                        ((HashMap) this.f4104a).remove(str);
                    }
                }
            } catch (Throwable th) {
                LogCatUtil.error(HttpDns.TAG, "removeCache error, host:" + str + "  msg: " + th.toString());
            }
        }

        public void store2Cache(String str, InetAddress[] inetAddressArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9cb46c1", new Object[]{this, str, inetAddressArr});
            } else if (inetAddressArr != null && inetAddressArr.length > 0) {
                SimpleLocalDnsModel simpleLocalDnsModel = new SimpleLocalDnsModel();
                simpleLocalDnsModel.inetAddressesCache = inetAddressArr;
                simpleLocalDnsModel.expirTime = System.currentTimeMillis() + HttpDns.localDnsExpire;
                synchronized (this) {
                    ((HashMap) this.f4104a).put(str, simpleLocalDnsModel);
                    LogCatUtil.printInfo(HttpDns.TAG, "store2Cache. host=" + str + ", inetAddresses len=" + inetAddressArr.length);
                }
            }
        }

        public final void b(Future<InetAddress[]> future) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f6f9effe", new Object[]{this, future});
            } else if (future != null) {
                try {
                    if (!future.isDone()) {
                        future.cancel(true);
                    }
                } catch (Throwable unused) {
                    LogCatUtil.info(HttpDns.TAG, "requestInetAddresses exception");
                }
            }
        }

        public InetAddress[] getAllByName(String str, TransportContext transportContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InetAddress[]) ipChange.ipc$dispatch("b1904efc", new Object[]{this, str, transportContext});
            }
            String stringValue = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.IPRANK_H5_SWITCH);
            if (transportContext != null && transportContext.bizType == 2 && !TextUtils.equals("T", stringValue)) {
                LogCatUtil.debug(HttpDns.TAG, "H5 don't use ip rank");
                return c(str);
            } else if (TextUtils.equals("T", TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.IPRANK_MODEL_SWITCH))) {
                return DnsUtil.getAllByName(str);
            } else {
                return c(str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class HttpdnsIP {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f4105a;
        public long b;
        public long c;
        public String cname;
        public int d;
        public HttpdnsIPEntry[] ipEntries;
        public int ttd;

        public HttpdnsIP() {
            this.ttd = 3;
        }

        public final HttpdnsIPEntry[] a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HttpdnsIPEntry[]) ipChange.ipc$dispatch("9f05102e", new Object[]{this});
            }
            try {
            } catch (Throwable th) {
                LogCatUtil.error(HttpDns.TAG, "getHttpdnsIpEntrys ex:" + th.toString());
            }
            if (!TextUtils.isEmpty(this.cname)) {
                InetAddress[] allByName = DnsUtil.getAllByName(this.cname);
                int length = allByName.length;
                HttpdnsIPEntry[] httpdnsIPEntryArr = new HttpdnsIPEntry[length];
                for (int i = 0; i < allByName.length; i++) {
                    httpdnsIPEntryArr[i] = new HttpdnsIPEntry(String.valueOf(allByName[i].getHostAddress()), 4, -1);
                }
                LogCatUtil.debug(HttpDns.TAG, "getHttpdnsIpEntrys cname:" + this.cname + ",local dns result:" + Arrays.toString(httpdnsIPEntryArr));
                if (length > 0) {
                    setIpEntries(httpdnsIPEntryArr);
                    setIp(httpdnsIPEntryArr[0].ip);
                }
                return httpdnsIPEntryArr;
            }
            HttpdnsIPEntry[] httpdnsIPEntryArr2 = this.ipEntries;
            if (httpdnsIPEntryArr2 != null && httpdnsIPEntryArr2.length > 0) {
                return httpdnsIPEntryArr2;
            }
            LogCatUtil.info(HttpDns.TAG, "getHttpdnsIpEntrys return null");
            return null;
        }

        public String getCname() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c0bd7a41", new Object[]{this});
            }
            return this.cname;
        }

        public String getIp() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d02517fc", new Object[]{this});
            }
            try {
                if (!TextUtils.isEmpty(this.cname)) {
                    return getIps()[0];
                }
                return this.f4105a;
            } catch (Throwable th) {
                LogCatUtil.error(HttpDns.TAG, "getIp ex:" + th.toString());
                return "";
            }
        }

        public HttpdnsIPEntry[] getIpEntries() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HttpdnsIPEntry[]) ipChange.ipc$dispatch("74dbd79c", new Object[]{this});
            }
            HttpdnsIPEntry[] httpdnsIPEntryArr = this.ipEntries;
            if (httpdnsIPEntryArr != null) {
                return httpdnsIPEntryArr;
            }
            return a();
        }

        public String[] getIps() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String[]) ipChange.ipc$dispatch("48f1710c", new Object[]{this});
            }
            try {
                HttpdnsIPEntry[] ipEntries = getIpEntries();
                if (ipEntries == null) {
                    return null;
                }
                String[] strArr = new String[ipEntries.length];
                for (int i = 0; i < ipEntries.length; i++) {
                    strArr[i] = ipEntries[i].ip;
                }
                LogCatUtil.debug(HttpDns.TAG, "getIps :" + Arrays.toString(strArr));
                return strArr;
            } catch (Throwable th) {
                LogCatUtil.error(HttpDns.TAG, "getIps ex:" + th.toString());
                LogCatUtil.info(HttpDns.TAG, "getIps return null");
                return null;
            }
        }

        public int getNetType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3f8f4e3b", new Object[]{this})).intValue();
            }
            return this.d;
        }

        public long getTime() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fff5e63e", new Object[]{this})).longValue();
            }
            return this.c;
        }

        public int getTtd() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1a8f028", new Object[]{this})).intValue();
            }
            return this.ttd;
        }

        public long getTtl() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("219ac31", new Object[]{this})).longValue();
            }
            return this.b;
        }

        public boolean isDie() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("40321081", new Object[]{this})).booleanValue();
            }
            if (System.currentTimeMillis() > this.c + (this.ttd * wu2.DAY)) {
                return true;
            }
            return false;
        }

        public boolean isHasIPv6() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("47019802", new Object[]{this})).booleanValue();
            }
            HttpdnsIPEntry[] httpdnsIPEntryArr = this.ipEntries;
            if (httpdnsIPEntryArr == null || httpdnsIPEntryArr.length <= 0) {
                return false;
            }
            int i = 0;
            while (true) {
                HttpdnsIPEntry[] httpdnsIPEntryArr2 = this.ipEntries;
                if (i >= httpdnsIPEntryArr2.length) {
                    return false;
                }
                if (httpdnsIPEntryArr2[i].ipType == HttpDns.IP_TYPE_V6) {
                    return true;
                }
                i++;
            }
        }

        public boolean isTimeOut(long j) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e773c0ca", new Object[]{this, new Long(j)})).booleanValue() : System.currentTimeMillis() > this.c + j;
        }

        public void setCname(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3ca63bd", new Object[]{this, str});
            } else {
                this.cname = str;
            }
        }

        public void setIp(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("890b3afa", new Object[]{this, str});
            } else {
                this.f4105a = str;
            }
        }

        public void setIpEntries(HttpdnsIPEntry[] httpdnsIPEntryArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("33f2f02e", new Object[]{this, httpdnsIPEntryArr});
            } else {
                this.ipEntries = httpdnsIPEntryArr;
            }
        }

        public void setNetType(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8a3e8c7", new Object[]{this, new Integer(i)});
            } else {
                this.d = i;
            }
        }

        public void setTime(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b1b1a2e", new Object[]{this, new Long(j)});
            } else {
                this.c = j;
            }
        }

        public void setTtd(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2e2dea7a", new Object[]{this, new Integer(i)});
            } else {
                this.ttd = i;
            }
        }

        public void setTtl(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3bd4b333", new Object[]{this, new Long(j)});
            } else {
                this.b = j;
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "HttpdnsIP{ip='" + this.f4105a + "', ttl=" + this.b + ", time=" + this.c + ", netType=" + this.d + ", ipEntries=" + Arrays.toString(this.ipEntries) + ", cname='" + this.cname + "', ttd=" + this.ttd + ", hasIPv6=" + isHasIPv6() + '}';
        }

        public boolean isTimeOut() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("93da6dc2", new Object[]{this})).booleanValue() : System.currentTimeMillis() > this.b;
        }

        public HttpdnsIP(String str, long j) {
            this.f4105a = str;
            this.b = j;
            this.c = System.currentTimeMillis();
            this.ttd = 3;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class InetAddrGetAllByNameTask implements Callable<InetAddress[]> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f4106a;

        public InetAddrGetAllByNameTask(String str) {
            this.f4106a = str;
        }

        @Override // java.util.concurrent.Callable
        public InetAddress[] call() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InetAddress[]) ipChange.ipc$dispatch("652e36b8", new Object[]{this});
            }
            InetAddress[] allByName = DnsUtil.getAllByName(this.f4106a);
            if (allByName != null) {
                try {
                    if (allByName.length > 0) {
                        LogCatUtil.info(HttpDns.TAG, "InetAddrGetAllByNameTask#call. From local dns get " + this.f4106a + ", ips=[" + Arrays.toString(allByName) + "]");
                        HttpDns.this.getGetAllByNameHelper().store2Cache(this.f4106a, allByName);
                    }
                } catch (Throwable th) {
                    LogCatUtil.warn(HttpDns.TAG, "InetAddrGetAllByNameTask#call fail.", th);
                }
            }
            return allByName;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class SimpleLocalDnsModel {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public long expirTime = -1;
        public InetAddress[] inetAddressesCache;

        public SimpleLocalDnsModel() {
        }

        public boolean isExpiration() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7ec36784", new Object[]{this})).booleanValue();
            }
            if (System.currentTimeMillis() > this.expirTime) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class Singleton {
        public static HttpDns instance = new HttpDns();
    }

    public static /* synthetic */ Context access$100(HttpDns httpDns) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("cd146240", new Object[]{httpDns});
        }
        return httpDns.f;
    }

    public static /* synthetic */ void access$200(HttpDns httpDns) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edc92809", new Object[]{httpDns});
        } else {
            httpDns.m();
        }
    }

    public static /* synthetic */ void access$300(HttpDns httpDns, ConfigSelector configSelector) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6fce740", new Object[]{httpDns, configSelector});
        } else {
            httpDns.j(configSelector);
        }
    }

    public static HttpDns getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpDns) ipChange.ipc$dispatch("fe9831d4", new Object[0]);
        }
        return Singleton.instance;
    }

    public final long a(long j, Map<String, HttpdnsIP> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("445b209d", new Object[]{this, new Long(j), map})).longValue();
        }
        if (this.d == null) {
            return j;
        }
        this.fail = false;
        this.b = "";
        long uptimeMillis = SystemClock.uptimeMillis();
        this.d.storeIp2CacheAndDB(map);
        return SystemClock.uptimeMillis() - uptimeMillis;
    }

    public void addStrongTaskToPool() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e3fa65b", new Object[]{this});
        } else {
            addStrongTaskToPool(ConfigSelector.GET_ALL);
        }
    }

    public void addTaskToPool() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f453ca4", new Object[]{this});
        } else {
            NetworkAsyncTaskExecutor.execute(new DnsReqTask());
        }
    }

    public final StrategyRequest b(ConfigSelector configSelector) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StrategyRequest) ipChange.ipc$dispatch("8b7f5f0b", new Object[]{this, configSelector});
        }
        StrategyRequest strategyRequest = new StrategyRequest();
        if (configSelector != ConfigSelector.GET_ALL) {
            strategyRequest.setS(configSelector.ordinal());
            LogCatUtil.debug(TAG, "Request Opt:" + configSelector);
        }
        if (TextUtils.equals(TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.HTTP_DNS_V2), "T")) {
            strategyRequest.setDg(DnsUtil.getDomainGroup());
        } else {
            List<String> domains = getDomains();
            if (domains == null || domains.size() == 0) {
                LogCatUtil.info(TAG, "domains is null");
            } else {
                strategyRequest.setDomains(domains);
            }
        }
        String lastUserId = UserInfoUtil.getLastUserId();
        if (TextUtils.isEmpty(lastUserId)) {
            lastUserId = DnsEnv.getInstance().getAmdcUid();
        }
        if (!TextUtils.isEmpty(lastUserId)) {
            strategyRequest.setUid(lastUserId);
        }
        String tradeNo = DnsEnv.getInstance().getTradeNo();
        if (!TextUtils.isEmpty(tradeNo)) {
            strategyRequest.setTradeNo(tradeNo);
        }
        strategyRequest.setClientVersion(f(this.f));
        try {
            strategyRequest.setUtdid(HttpContextExtend.getInstance().getDid());
        } catch (Exception e) {
            LogCatUtil.error(TAG, e);
        }
        String wsid = DnsUtil.getWsid();
        if (!TextUtils.isEmpty(wsid)) {
            strategyRequest.setWsid(wsid);
        }
        String configVersion = DnsUtil.getConfigVersion();
        if (!TextUtils.isEmpty(configVersion)) {
            strategyRequest.setConfigVersion(configVersion);
        }
        strategyRequest.setNetType(NetworkUtils.getNetworkType(this.f));
        strategyRequest.setIpType(10);
        return strategyRequest;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        try {
            if (!MiscUtils.isDebugger(this.f)) {
                return "";
            }
            String httpdnsServerUrl = DnsUtil.getHttpdnsServerUrl(this.f);
            if (TextUtils.isEmpty(httpdnsServerUrl)) {
                return null;
            }
            String host = new URL(httpdnsServerUrl).getHost();
            if (!this.f4101a.contains(host)) {
                this.f4101a.add(host);
            }
            LogCatUtil.debug(TAG, "debug mode,url:" + httpdnsServerUrl);
            return httpdnsServerUrl;
        } catch (Throwable th) {
            LogCatUtil.error(TAG, th);
            return null;
        }
    }

    public synchronized void cleanErrorIp(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2472eae1", new Object[]{this, str, str2});
            return;
        }
        AlipayHttpDnsClient.getDnsClient().httpdnsStorage.deleteSingleIpFromDB(str, str2);
        this.c = ArgType.HAS_FAIL;
        httpDnsRequest();
    }

    public final synchronized String d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{this, new Integer(i)});
        }
        String c = c();
        if (TextUtils.isEmpty(c)) {
            c = i(i);
        }
        if (DnsUtil.isUseSign()) {
            c = c.replace("query", "squery");
        }
        if (DnsUtil.amdcUp2Https()) {
            c = l(i);
        }
        if (!this.f4101a.contains(this.httpdns_domain)) {
            this.f4101a.add(this.httpdns_domain);
        }
        return c;
    }

    public void delayRequestStrong(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f89e9ff9", new Object[]{this, new Integer(i)});
        } else {
            delayRequestStrong(i, ConfigSelector.GET_ALL);
        }
    }

    public final String f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{this, context});
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo != null) {
                return packageInfo.versionName;
            }
            return "";
        } catch (Exception e) {
            LogCatUtil.error(TAG, "getApplicationVersion exception", e);
            return "";
        }
    }

    public InetAddress[] getAllByNameFromInetAddr(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InetAddress[]) ipChange.ipc$dispatch("54900540", new Object[]{this, str}) : getGetAllByNameHelper().getAllByName(str);
    }

    public DnsLocalManager getDnsLocalManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DnsLocalManager) ipChange.ipc$dispatch("d5449480", new Object[]{this});
        }
        return this.d;
    }

    public synchronized List<String> getDomains() {
        int size;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("14e2f247", new Object[]{this});
        }
        ArrayList<String> arrayList = new ArrayList<>();
        ArgType argType = this.c;
        if (!(argType == ArgType.LIST_INIT || argType == ArgType.HAS_FAIL)) {
            if (argType == ArgType.ADD_NEW && (size = this.f4101a.size()) > 1) {
                arrayList.add(this.f4101a.get(size - 1));
            }
            return arrayList;
        }
        arrayList = this.f4101a;
        return arrayList;
    }

    public GetAllByNameHelper getGetAllByNameHelper() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GetAllByNameHelper) ipChange.ipc$dispatch("e3411709", new Object[]{this});
        }
        if (this.e == null) {
            this.e = new GetAllByNameHelper();
        }
        return this.e;
    }

    public ArrayList<String> getHosts() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("eeef95f6", new Object[]{this});
        }
        return this.f4101a;
    }

    public final void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        String[] split = str.split(",");
        if (split != null) {
            for (int i = 0; i < split.length; i++) {
                if (DnsUtil.isLogicHost(split[i])) {
                    this.hashost = true;
                    if (!this.f4101a.contains(split[i])) {
                        this.f4101a.add(split[i]);
                    }
                }
            }
        }
    }

    public void httpDnsRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("863b5d55", new Object[]{this});
        } else if (this.hashost) {
            addTaskToPool();
        }
    }

    public void httpDnsRequestStrong() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0093a0c", new Object[]{this});
        } else {
            httpDnsRequestStrong(ConfigSelector.GET_ALL);
        }
    }

    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        this.f = context;
        HttpContextExtend.createInstance(context);
    }

    public final void j(ConfigSelector configSelector) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e923eb1f", new Object[]{this, configSelector});
            return;
        }
        synchronized (this) {
            try {
                if (this.g == 1) {
                    LogCatUtil.info(TAG, "REQ_STATUS_BUSY, return.");
                    return;
                }
                this.g = 1;
                try {
                    sendRequest(configSelector);
                } finally {
                    this.g = 0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24c7dce7", new Object[]{this, new Integer(i)});
        }
        if (i > 2) {
            return DnsUtil.getAmdcBackupHttpsServerUrl();
        }
        return DnsUtil.getAmdcHttpsServerUrl();
    }

    public void notifyUpdateConfig(final String str, ConfigSelector configSelector) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("834e111b", new Object[]{this, str, configSelector});
        } else if (!TextUtils.isEmpty(str) && configSelector != ConfigSelector.GET_IPLIST_ONLY) {
            NetworkAsyncTaskExecutor.executeLowPri(new Runnable() { // from class: com.alipay.mobile.common.transport.httpdns.HttpDns.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    SwitchMonitorLogUtil.monitorCoreSwitchRecvLog(HttpDns.access$100(HttpDns.this), str, SwitchMonitorLogUtil.SRC_AMDC);
                    NwSharedSwitchUtil.putSwitchSrc(SwitchMonitorLogUtil.SRC_AMDC);
                    TransportConfigureManager.getInstance().updateConfig(HttpDns.access$100(HttpDns.this), str, true);
                    SwitchMonitorLogUtil.monitorSwitchUpdatedLog(HttpDns.access$100(HttpDns.this), SwitchMonitorLogUtil.SRC_AMDC);
                    LogCatUtil.debug(HttpDns.TAG, "收到服务器紧急开关：" + str);
                }
            });
        }
    }

    public void requestStrong() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ae9ff8d", new Object[]{this});
            return;
        }
        ArrayList<String> arrayList = this.f4101a;
        if (arrayList != null && arrayList.size() != 0) {
            this.hashost = true;
            this.c = ArgType.LIST_INIT;
            httpDnsRequestStrong();
        }
    }

    public void requestWeak(ThreadType threadType) {
        ArrayList<String> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1586ed", new Object[]{this, threadType});
        } else if (threadType == ThreadType.HTTPDNSREQUEST_TIMEOUT || threadType == ThreadType.HTTPDNSREQUEST_INIT) {
            ArrayList<String> arrayList2 = this.f4101a;
            if (arrayList2 != null && arrayList2.size() != 0) {
                this.hashost = true;
                this.c = ArgType.LIST_INIT;
                httpDnsRequest();
            }
        } else if (threadType == ThreadType.HTTPDNSREQUEST_NEWADD && (arrayList = this.f4101a) != null && arrayList.size() != 0) {
            this.hashost = true;
            this.c = ArgType.ADD_NEW;
            httpDnsRequest();
        }
    }

    public void sendRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fa6eaee", new Object[]{this});
        } else {
            sendRequest(ConfigSelector.GET_ALL);
        }
    }

    public void setDnsLocalManager(DnsLocalManager dnsLocalManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f67fa16", new Object[]{this, dnsLocalManager});
        } else {
            this.d = dnsLocalManager;
        }
    }

    public synchronized void setErrorByHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc59bdd6", new Object[]{this, str});
            return;
        }
        AlipayHttpDnsClient.getDnsClient().httpdnsStorage.deleteIpByHost(str);
        this.c = ArgType.HAS_FAIL;
        httpDnsRequestStrong();
    }

    public HttpDns() {
        this.schema = h1p.HTTP_PREFIX;
        this.g = 0;
        this.httpServerUrl = null;
        this.h = 0;
        this.i = System.currentTimeMillis();
        this.j = 3600000L;
        this.k = false;
        this.httpdns_domain = DnsUtil.getAmdcHost();
        this.httpServerUrl = h1p.HTTP_PREFIX + this.httpdns_domain + "/query";
        this.path = "/query";
        this.httpdns_port = 80;
        this.fail = false;
        this.b = "";
        this.hashost = true;
        this.c = ArgType.LIST_INIT;
        this.f4101a = new ArrayList<>();
        this.h = 0;
        this.i = System.currentTimeMillis();
        this.k = false;
    }

    public void addStrongTaskToPool(ConfigSelector configSelector) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96d6011", new Object[]{this, configSelector});
        } else {
            NetworkAsyncTaskExecutor.execute(new DnsReqTaskStrong(configSelector));
        }
    }

    public void delayRequestStrong(final int i, final ConfigSelector configSelector) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb9e3b2f", new Object[]{this, new Integer(i), configSelector});
            return;
        }
        ArrayList<String> arrayList = this.f4101a;
        if (arrayList != null && arrayList.size() != 0) {
            this.hashost = true;
            this.c = ArgType.LIST_INIT;
            NetworkAsyncTaskExecutor.execute(new Runnable() { // from class: com.alipay.mobile.common.transport.httpdns.HttpDns.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        Thread.sleep(i * 1000);
                    } catch (InterruptedException e) {
                        LogCatUtil.warn(HttpDns.TAG, e.toString());
                    }
                    HttpDns.this.httpDnsRequestStrong(configSelector);
                }
            });
        }
    }

    public final void g(long j, long j2, String str, boolean z, int i, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6054546b", new Object[]{this, new Long(j), new Long(j2), str, new Boolean(z), new Integer(i), str2});
            return;
        }
        try {
            MonitorLoggerModel monitorLoggerModel = new MonitorLoggerModel();
            monitorLoggerModel.setSubType("HTTPDNS");
            monitorLoggerModel.setParam1(MonitorLoggerUtils.getLogBizType("HTTPDNS"));
            monitorLoggerModel.setParam2("INFO");
            monitorLoggerModel.setParam3("http");
            Map<String, String> extPramas = monitorLoggerModel.getExtPramas();
            extPramas.put(RPCDataItems.DNS_STORE_TIME, j2 + "ms");
            Map<String, String> extPramas2 = monitorLoggerModel.getExtPramas();
            extPramas2.put(RPCDataItems.DNS_RTT, j + "ms");
            Map<String, String> extPramas3 = monitorLoggerModel.getExtPramas();
            if (this.fail) {
                str3 = UTConstant.Args.UT_SUCCESS_F;
            } else {
                str3 = "T";
            }
            extPramas3.put("RESULT", str3);
            monitorLoggerModel.getExtPramas().put(RPCDataItems.CLIENT_IP, str);
            monitorLoggerModel.getExtPramas().put("OVERSEA", String.valueOf(z));
            monitorLoggerModel.getExtPramas().put("TTD", String.valueOf(i));
            monitorLoggerModel.getExtPramas().put("REQNUM", String.valueOf(this.h));
            monitorLoggerModel.getExtPramas().put(MonitorItemConstants.KEY_URL, str2);
            monitorLoggerModel.getExtPramas().put("BACKUP", String.valueOf(this.k));
            monitorLoggerModel.getExtPramas().put("DG", DnsUtil.getDomainGroup());
            monitorLoggerModel.getExtPramas().put("UID", DnsEnv.getInstance().getAmdcUid());
            Context context = TransportEnvUtil.getContext();
            if (!MiscUtils.isInAlipayClient(context)) {
                monitorLoggerModel.getExtPramas().put("APP_SYS_ID", context.getPackageName());
                monitorLoggerModel.getExtPramas().put("x-appid", DnsUtil.getAppId());
            }
            if (!TextUtils.isEmpty(DnsUtil.getConfigVersion())) {
                monitorLoggerModel.getExtPramas().put("CONFIGVER", DnsUtil.getConfigVersion());
            }
            if (MiscUtils.isAtFrontDesk(TransportEnvUtil.getContext())) {
                monitorLoggerModel.getExtPramas().put(RPCDataItems.GROUND, "FG");
            } else {
                monitorLoggerModel.getExtPramas().put(RPCDataItems.GROUND, "BG");
            }
            if (!TextUtils.isEmpty(this.b)) {
                monitorLoggerModel.getExtPramas().put("ERROR", this.b);
            }
            String localIPv6Address = NetworkUtils.getLocalIPv6Address();
            if (!TextUtils.isEmpty(localIPv6Address)) {
                monitorLoggerModel.getExtPramas().put("IPv6", localIPv6Address);
            }
            this.fail = false;
            this.b = "";
            this.k = false;
            LogCatUtil.debug(TAG, monitorLoggerModel.toString());
            MonitorLoggerUtils.uploadPerfLog(monitorLoggerModel);
        } catch (Throwable th) {
            LogCatUtil.error(TAG, th);
        }
    }

    public InetAddress[] getAllByNameFromInetAddr(String str, TransportContext transportContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InetAddress[]) ipChange.ipc$dispatch("47e9becd", new Object[]{this, str, transportContext}) : getGetAllByNameHelper().getAllByName(str, transportContext);
    }

    public void httpDnsRequestStrong(ConfigSelector configSelector) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b19ba302", new Object[]{this, configSelector});
        } else if (this.hashost) {
            addStrongTaskToPool(configSelector);
        }
    }

    public final String i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da9643a6", new Object[]{this, new Integer(i)});
        }
        try {
            HttpdnsIP queryLocalIPByHost = AlipayHttpDnsClient.getDnsClient().queryLocalIPByHost(this.httpdns_domain);
            if (queryLocalIPByHost != null) {
                return e(i, queryLocalIPByHost);
            }
            if (!TextUtils.isEmpty(MpaasPropertiesUtil.getWorkspaceId(TransportEnvUtil.getContext()))) {
                return this.httpServerUrl;
            }
            String stringValue = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.HTTP_DNS_AMDC_IP);
            if (TextUtils.isEmpty(stringValue)) {
                return this.httpServerUrl;
            }
            String str = h1p.HTTP_PREFIX + stringValue + ":" + String.valueOf(this.httpdns_port) + this.path;
            try {
                if (!Arrays.asList(InetAddress.getAllByName(this.httpdns_domain)).contains(InetAddress.getByName("0.0.0.0"))) {
                    return this.httpServerUrl;
                }
                LogCatUtil.debug(TAG, "isp break,use embedded ip,url= " + str);
                this.k = true;
                return str;
            } catch (UnknownHostException unused) {
                LogCatUtil.debug(TAG, "UnknownHostException,use embedded ip,url= " + str);
                this.k = true;
                return str;
            }
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "getOnlieUrl ex:" + th.toString());
            return this.httpServerUrl;
        }
    }

    public void sendRequest(ConfigSelector configSelector) {
        int i;
        String str;
        Throwable th;
        HttpDns httpDns;
        long j;
        String str2;
        boolean z;
        StrategyResponse strategyFromServer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7499264", new Object[]{this, configSelector});
        } else if (k()) {
            String str3 = this.httpServerUrl;
            int intValue = TransportConfigureManager.getInstance().getIntValue(TransportConfigureItem.HTTPDNS_RETRY_COUNT);
            long j2 = 0;
            long j3 = 0;
            String str4 = "";
            boolean z2 = false;
            int i2 = 0;
            for (int i3 = 1; i3 <= intValue; i3 = i + 1) {
                if (i3 != 1) {
                    try {
                        Thread.sleep(3000L);
                    } catch (Throwable th2) {
                        th = th2;
                        str = str3;
                        i = i3;
                        j3 = j3;
                        try {
                            this.fail = true;
                            this.b = th.getMessage();
                            LogCatUtil.error(TAG, "Exception: " + this.b, th);
                            httpDns = this;
                            j2 = j2;
                            j = j3;
                            str2 = str4;
                            z = z2;
                            httpDns.g(j2, j, str2, z, i2, str);
                            str3 = str;
                        } finally {
                            g(j2, j3, str4, z2, i2, str);
                        }
                    }
                }
                try {
                    LogCatUtil.info(TAG, "SEND HTTP_DNS REQUEST : " + i3);
                    HttpClient httpClient = new HttpClient(this.f);
                    j2 = System.currentTimeMillis();
                    try {
                        str = d(i3);
                        try {
                            LogCatUtil.debug(TAG, "请求url: " + str);
                            strategyFromServer = httpClient.getStrategyFromServer(str, b(configSelector));
                        } catch (Throwable th3) {
                            th = th3;
                            str = str;
                            i = i3;
                            j3 = j3;
                            this.fail = true;
                            this.b = th.getMessage();
                            LogCatUtil.error(TAG, "Exception: " + this.b, th);
                            httpDns = this;
                            j2 = j2;
                            j = j3;
                            str2 = str4;
                            z = z2;
                            httpDns.g(j2, j, str2, z, i2, str);
                            str3 = str;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        i = i3;
                        j3 = j3;
                        str = str3;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    i = i3;
                    j3 = j3;
                    str = str3;
                    j2 = j2;
                }
                if (strategyFromServer != null) {
                    j2 = System.currentTimeMillis() - j2;
                    try {
                        LogCatUtil.debug(TAG, "RECEIVED DNS INFO");
                        str4 = strategyFromServer.getClientIp();
                        z2 = strategyFromServer.isOversea();
                        i2 = strategyFromServer.getTtd();
                        notifyUpdateConfig(strategyFromServer.getConf(), configSelector);
                        Map<String, HttpdnsIP> dns = strategyFromServer.getDns();
                        if (dns == null) {
                            LogCatUtil.info(TAG, "解析结果为null");
                            return;
                        }
                        str = str;
                        try {
                            j3 = a(j3, dns);
                            try {
                                this.d.saveLastUpdateTime();
                                return;
                            } catch (Throwable th6) {
                                th = th6;
                                j2 = j2;
                                j3 = j3;
                                i = i3;
                                this.fail = true;
                                this.b = th.getMessage();
                                LogCatUtil.error(TAG, "Exception: " + this.b, th);
                                httpDns = this;
                                j2 = j2;
                                j = j3;
                                str2 = str4;
                                z = z2;
                                httpDns.g(j2, j, str2, z, i2, str);
                                str3 = str;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            i = i3;
                            j3 = j3;
                            this.fail = true;
                            this.b = th.getMessage();
                            LogCatUtil.error(TAG, "Exception: " + this.b, th);
                            httpDns = this;
                            j2 = j2;
                            j = j3;
                            str2 = str4;
                            z = z2;
                            httpDns.g(j2, j, str2, z, i2, str);
                            str3 = str;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        str = str;
                    }
                } else {
                    str = str;
                    httpDns = this;
                    j2 = j2;
                    j = j3;
                    str2 = str4;
                    i = i3;
                    z = z2;
                    j3 = j3;
                    httpDns.g(j2, j, str2, z, i2, str);
                    str3 = str;
                }
            }
        }
    }

    public synchronized void setHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2fc43b", new Object[]{this, str});
        } else if (this.f4101a != null) {
            if (DnsUtil.isLogicHost(str) && (str.contains("cdn") || str.contains("mobilegw") || str.contains("alipayobjects"))) {
                this.c = ArgType.ADD_NEW;
                this.hashost = true;
                if (!this.f4101a.contains(str)) {
                    this.f4101a.add(str);
                }
                httpDnsRequest();
            }
        }
    }

    public synchronized void setHosts(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e998bfba", new Object[]{this, str, new Boolean(z)});
            return;
        }
        if (!(str == null || this.f4101a == null)) {
            h(str);
            if (this.hashost && z) {
                this.c = ArgType.LIST_INIT;
                if (AlipayHttpDnsClient.getDnsClient().getFlag() != 1 || !MiscUtils.isMainProcessRuning(TransportEnvUtil.getContext())) {
                    delayRequestStrong(1);
                    LogCatUtil.debug(TAG, "Start polling everything");
                } else {
                    ExtTransportOffice.getInstance().notifyPush2UpdateInfo(this.f, true);
                    LogCatUtil.warn(TAG, "setHosts, workMode: NO_COMPLETE, not allowed httpdns request,notify push to update ...");
                }
            }
        }
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (!TransportStrategy.isOpenAmdcSwitch()) {
            LogCatUtil.debug(TAG, "dnsSwitch is off");
            return false;
        } else if (!NetworkUtils.isNetworkAvailable(this.f)) {
            LogCatUtil.info(TAG, "network is not available...");
            return false;
        } else if ((!MiscUtils.isInAlipayClient(this.f) && !TransportStrategy.isEnabledEnhanceNetworkModule()) || TransportStrategy.isNetworkRunInSingleProcess(this.f)) {
            return true;
        } else {
            if (AlipayHttpDnsClient.getDnsClient().getFlag() == 1) {
                ExtTransportOffice.getInstance().notifyPush2UpdateInfo(this.f, false);
                LogCatUtil.warn(TAG, "sendRequest,workMode: NO_COMPLETE, not allowed httpdns request,notify push to update...");
                return false;
            } else if (!MiscUtils.isRealPushProcess(this.f)) {
                LogCatUtil.debug(TAG, "wallet not push process, ingore httpdns request");
                return false;
            } else {
                if (this.h > 20) {
                    if (this.i + this.j < System.currentTimeMillis()) {
                        this.h = 0;
                        this.i = System.currentTimeMillis();
                    } else {
                        LogCatUtil.debug(TAG, "already request 20 an hour,return");
                        return false;
                    }
                }
                this.h++;
                return true;
            }
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        if (System.currentTimeMillis() - this.d.getLastUpdateTime() < TransportConfigureManager.getInstance().getLongValue(TransportConfigureItem.HTTPDNS_REQUEST_INTERVAL)) {
            LogCatUtil.info(TAG, "weakSyncSendRequest ,(System.currentTimeMillis() - reqLastTime) < 10m, return.");
            return;
        }
        synchronized (this) {
            try {
                if (this.g == 1) {
                    LogCatUtil.info(TAG, "REQ_STATUS_BUSY, return.");
                    return;
                }
                this.g = 1;
                try {
                    LogCatUtil.info(TAG, "开始执行弱请求...");
                    sendRequest();
                } finally {
                    this.g = 0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String e(int i, HttpdnsIP httpdnsIP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("532429d9", new Object[]{this, new Integer(i), httpdnsIP});
        }
        String[] ips = httpdnsIP.getIps();
        int length = ips.length;
        if (length <= 0) {
            LogCatUtil.info(TAG, "length <= 0,use host " + this.httpdns_domain);
            return this.httpServerUrl;
        } else if (i == 1) {
            String str = ips[0];
            return h1p.HTTP_PREFIX + str + ":" + String.valueOf(this.httpdns_port) + this.path;
        } else if (i != 2) {
            return this.httpServerUrl;
        } else {
            if (length < 2) {
                return this.httpServerUrl;
            }
            String str2 = ips[1];
            return h1p.HTTP_PREFIX + str2 + ":" + String.valueOf(this.httpdns_port) + this.path;
        }
    }
}
