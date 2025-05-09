package com.alipay.mobile.common.transport.httpdns;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.android.msp.framework.dns.DnsValue;
import com.alipay.mobile.common.amnet.biz.AmnetOperationManager;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.context.TransportContext;
import com.alipay.mobile.common.transport.httpdns.HttpDns;
import com.alipay.mobile.common.transport.httpdns.downloader.ConfigSelector;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.NetworkUtils;
import com.alipay.mobile.common.transport.utils.SharedPreUtils;
import com.alipay.mobile.common.transport.utils.TransportContextThreadLocalUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.alipay.mobile.common.utils.config.ConfigureChangedListener;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.StringTokenizer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AlipayHttpDnsClient implements DnsLocalManager, DnsService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "HDNS_Ahds";
    public static final byte WORK_MODEL_COMPLETE = 0;
    public static final byte WORK_MODEL_NO_COMPLETE = 1;
    public static AlipayHttpDnsClient alipayHttpDnsClient;
    public static boolean dnsSwitch;

    /* renamed from: a  reason: collision with root package name */
    public final int f4098a;
    public HttpDnsUpdateObservable b;
    public final boolean c;
    public final long d;
    public HttpDns dnsClient;
    public HttpdnsStorage httpdnsStorage;
    public Context mContext;
    public NetworkManager networkManager = NetworkManager.getInstance();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class HttpDnsUpdateObservable extends Observable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public HttpDnsUpdateObservable() {
        }

        public static /* synthetic */ Object ipc$super(HttpDnsUpdateObservable httpDnsUpdateObservable, String str, Object... objArr) {
            if (str.hashCode() == -310743881) {
                super.notifyObservers(objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/transport/httpdns/AlipayHttpDnsClient$HttpDnsUpdateObservable");
        }

        @Override // java.util.Observable
        public void notifyObservers(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed7a6cb7", new Object[]{this, obj});
                return;
            }
            setChanged();
            super.notifyObservers(obj);
        }
    }

    public AlipayHttpDnsClient(Context context, int i) {
        this.c = false;
        this.d = 0L;
        LogCatUtil.info(TAG, "AlipayHttpDnsClient create.");
        this.mContext = context;
        HttpDns instance = HttpDns.getInstance();
        this.dnsClient = instance;
        instance.init(this.mContext);
        this.dnsClient.setDnsLocalManager(this);
        this.f4098a = i;
        this.c = true;
        this.d = System.currentTimeMillis();
        this.httpdnsStorage = HttpdnsStorage.getInstance(this.mContext);
        if (TextUtils.equals(TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.DNS_PRE_LOAD), "T")) {
            LogCatUtil.debug(TAG, "preload dns");
            reloadDns();
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        try {
            if (TransportStrategy.isOpenAmdcSwitch()) {
                dnsSwitch = true;
            }
            LogCatUtil.printInfo(TAG, "AlipayHttpDnsClient init, dnsSwitch=" + dnsSwitch);
        } catch (Exception e) {
            LogCatUtil.error(TAG, "httpdns switch exception", e);
        }
        g();
    }

    public static void dnsClientInit(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b11dc13c", new Object[]{context, str, new Integer(i)});
        } else {
            dnsClientInit(context, str, i, true);
        }
    }

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
        } else {
            TransportConfigureManager.getInstance().addConfigureChangedListener(new ConfigureChangedListener() { // from class: com.alipay.mobile.common.transport.httpdns.AlipayHttpDnsClient.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.util.Observer
                public void update(Observable observable, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9292f698", new Object[]{this, observable, obj});
                        return;
                    }
                    try {
                        if (TransportStrategy.isOpenAmdcSwitch()) {
                            AlipayHttpDnsClient.dnsSwitch = true;
                        } else {
                            AlipayHttpDnsClient.dnsSwitch = false;
                        }
                        LogCatUtil.printInfo(AlipayHttpDnsClient.TAG, "AlipayHttpDnsClient update config, dnsSwitch=" + AlipayHttpDnsClient.dnsSwitch);
                    } catch (Throwable th) {
                        LogCatUtil.error(AlipayHttpDnsClient.TAG, th);
                    }
                }
            });
        }
    }

    public static AlipayHttpDnsClient getDnsClient() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlipayHttpDnsClient) ipChange.ipc$dispatch("dec36b80", new Object[0]);
        }
        return alipayHttpDnsClient;
    }

    public void addHttpDnsUpdateObserver(Observer observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e866cbf", new Object[]{this, observer});
            return;
        }
        LogCatUtil.printInfo(TAG, "addHttpDnsUpdateObserver:".concat(observer.getClass().getName()));
        getHttpDnsUpdateObservable().addObserver(observer);
    }

    public final List<InetAddress> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this});
        }
        String stringValue = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.MOBILEGW_PRE_SET_IPS);
        if (TextUtils.isEmpty(stringValue)) {
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(stringValue, ",");
        ArrayList arrayList = new ArrayList(stringTokenizer.countTokens());
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (DnsUtil.isLogicIP(nextToken)) {
                arrayList.add(InetAddress.getByAddress(DnsUtil.ipToBytesByReg(nextToken)));
            }
        }
        return arrayList;
    }

    public final InetAddress[] d(String str) {
        InetAddress[] allByNameFromHttpDns;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InetAddress[]) ipChange.ipc$dispatch("5433bdc6", new Object[]{this, str});
        }
        if (!dnsSwitch || (allByNameFromHttpDns = getAllByNameFromHttpDns(str)) == null) {
            return null;
        }
        TransportContextThreadLocalUtils.addDnsType("httpdns");
        return allByNameFromHttpDns;
    }

    @Override // com.alipay.mobile.common.transport.httpdns.DnsLocalManager
    public void deleteIpByHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52ebe142", new Object[]{this, str});
        } else {
            this.httpdnsStorage.deleteIpByHost(str);
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (getHttpDnsUpdateObservable().countObservers() > 0) {
            NetworkAsyncTaskExecutor.executeLowPri(new Runnable() { // from class: com.alipay.mobile.common.transport.httpdns.AlipayHttpDnsClient.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        AlipayHttpDnsClient.this.getHttpDnsUpdateObservable().notifyObservers();
                    }
                }
            });
        }
    }

    public final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            throw new UnknownHostException("host is null");
        } else if (TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.BLACK_LIST_DNS_HOST_NAME).contains(str)) {
            throw new UnknownHostException("Blacklist host:" + str);
        }
    }

    @Override // com.alipay.mobile.common.transport.httpdns.DnsService
    public void feedback(String str, String str2, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21d3f74f", new Object[]{this, str, str2, new Boolean(z), new Integer(i)});
            return;
        }
        try {
            if (TextUtils.equals(TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.DNS_FEEDBACK), "T") && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                if (!NetworkUtils.isNetworkAvailable(TransportEnvUtil.getContext())) {
                    LogCatUtil.debug(TAG, "network unavailable,do nothing");
                } else if (!z) {
                    b(str);
                }
            }
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "feedback ex:" + th.toString());
        }
    }

    public InetAddress[] getAllByName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InetAddress[]) ipChange.ipc$dispatch("a258dab1", new Object[]{this, str});
        }
        f(str);
        InetAddress[] d = d(str);
        if (d != null) {
            return d;
        }
        try {
            HttpDns.HttpdnsIP queryLocalIPByHost = queryLocalIPByHost(str);
            if (queryLocalIPByHost == null || TextUtils.isEmpty(queryLocalIPByHost.getCname())) {
                return this.dnsClient.getAllByNameFromInetAddr(str);
            }
            return this.dnsClient.getAllByNameFromInetAddr(queryLocalIPByHost.getCname());
        } catch (UnknownHostException e) {
            InetAddress[] h = h(str);
            if (h != null) {
                LogCatUtil.printInfo(TAG, "getAllByNameFromPreset Success.");
                return h;
            }
            throw e;
        }
    }

    public InetAddress[] getAllByNameFromHttpDns(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InetAddress[]) ipChange.ipc$dispatch("8e5c39ce", new Object[]{this, str});
        }
        try {
            String[] ipsByHttpDns = getIpsByHttpDns(str);
            if (ipsByHttpDns == null || ipsByHttpDns.length <= 0) {
                return null;
            }
            LogCatUtil.printInfo(TAG, "getAllByNameFromHttpDns ,use httpdns," + str + " : " + Arrays.deepToString(ipsByHttpDns));
            InetAddress[] inetAddressArr = new InetAddress[ipsByHttpDns.length];
            for (int i = 0; i < ipsByHttpDns.length; i++) {
                inetAddressArr[i] = InetAddress.getByName(ipsByHttpDns[i]);
            }
            return inetAddressArr;
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "getAllByNameFromHttpDns ex= " + th.toString());
            return null;
        }
    }

    public InetAddress[] getAllByNameFromInetAddr(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InetAddress[]) ipChange.ipc$dispatch("54900540", new Object[]{this, str});
        }
        try {
            return this.dnsClient.getAllByNameFromInetAddr(str);
        } catch (UnknownHostException e) {
            LogCatUtil.warn(TAG, e);
            return null;
        }
    }

    public int getFlag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dbfa2b5c", new Object[]{this})).intValue();
        }
        return this.f4098a;
    }

    public HttpDnsUpdateObservable getHttpDnsUpdateObservable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpDnsUpdateObservable) ipChange.ipc$dispatch("e3b8c57e", new Object[]{this});
        }
        if (this.b == null) {
            this.b = new HttpDnsUpdateObservable();
        }
        return this.b;
    }

    public long getInitTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6c2bf46e", new Object[]{this})).longValue();
        }
        return this.d;
    }

    @Override // com.alipay.mobile.common.transport.httpdns.DnsService
    public HttpDns.HttpdnsIP getIpInfoByHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpDns.HttpdnsIP) ipChange.ipc$dispatch("8d4de507", new Object[]{this, str});
        }
        if (dnsSwitch) {
            return queryLocalIPByHost(str);
        }
        LogCatUtil.info(TAG, "getIpInfoByHost. dnsSwitch is false.");
        return null;
    }

    public String[] getIpsByHttpDns(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("5d6736f4", new Object[]{this, str});
        }
        try {
            HttpDns.HttpdnsIP queryLocalIPByHost = queryLocalIPByHost(str);
            if (queryLocalIPByHost == null) {
                LogCatUtil.debug(TAG, "getIpsByHttpDns host : " + str + " ,HttpdnsIP=[ null ]");
                return null;
            }
            String[] ips = queryLocalIPByHost.getIps();
            LogCatUtil.debug(TAG, "getIpsByHttpDns host : " + str + " ,ips=[" + Arrays.toString(ips) + "]");
            return ips;
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "getIpsByHttpDns ex" + th.toString());
            return null;
        }
    }

    @Override // com.alipay.mobile.common.transport.httpdns.DnsLocalManager
    public long getLastUpdateTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1977eedd", new Object[]{this})).longValue();
        }
        return SharedPreUtils.getLonggData(this.mContext, "http_dns_last_time");
    }

    public int getNetworkType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("700d68cc", new Object[]{this})).intValue();
        }
        Context context = this.mContext;
        if (context != null) {
            return NetworkUtils.getNetworkType(context);
        }
        LogCatUtil.debug(TAG, "getNetworkType mContext is null");
        return -1;
    }

    public final InetAddress[] h(String str) {
        List<InetAddress> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InetAddress[]) ipChange.ipc$dispatch("897542c8", new Object[]{this, str});
        }
        try {
            if ((TextUtils.equals(str, DnsValue.DOMAIN_MOBILE_GW) || TextUtils.equals(str, "mobilegwspdy.alipay.com")) && (c = c()) != null && !c.isEmpty()) {
                return (InetAddress[]) c.toArray(new InetAddress[c.size()]);
            }
            return null;
        } catch (Exception e) {
            LogCatUtil.warn(TAG, "getAllByNameFromPreset exception" + e.toString());
            return null;
        }
    }

    public boolean isInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0a588e5", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public void putSingleHttpdnsIp(String str, HttpDns.HttpdnsIP httpdnsIP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6400a5ce", new Object[]{this, str, httpdnsIP});
            return;
        }
        try {
            this.httpdnsStorage.putSingleIp2CacheAndDB(str, httpdnsIP);
        } catch (Exception unused) {
            LogCatUtil.warn(TAG, "putSingleHttpdnsIp exception");
        }
    }

    @Override // com.alipay.mobile.common.transport.httpdns.DnsLocalManager
    public void reloadDns() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ced1557", new Object[]{this});
            return;
        }
        try {
            Map<String, HttpDns.HttpdnsIP> allIpFromDB = this.httpdnsStorage.getAllIpFromDB(getNetworkType());
            if (allIpFromDB != null && !allIpFromDB.isEmpty()) {
                this.httpdnsStorage.storeIp2Cache(allIpFromDB);
                LogCatUtil.info(TAG, "reloadDns success...");
            }
        } catch (Exception e) {
            LogCatUtil.warn(TAG, "reloadDns exception " + e.toString());
        }
    }

    @Override // com.alipay.mobile.common.transport.httpdns.DnsLocalManager
    public void saveLastUpdateTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90b88550", new Object[]{this});
        } else {
            SharedPreUtils.putData(this.mContext, "http_dns_last_time", System.currentTimeMillis());
        }
    }

    @Override // com.alipay.mobile.common.transport.httpdns.DnsService
    public void setErrorByHost(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc59bdd6", new Object[]{this, str});
            return;
        }
        try {
            if (!b(str)) {
                LogCatUtil.debug(TAG, "setErrorByHost,host:" + str + " isn't in list,ignore");
            } else if (!NetworkUtils.isNetworkAvailable(TransportEnvUtil.getContext())) {
                LogCatUtil.debug(TAG, "network isn't available,do nothing");
            } else {
                LogCatUtil.debug(TAG, "setErrorByHost,host=[" + str + "]");
                NetworkAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.transport.httpdns.AlipayHttpDnsClient.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            AlipayHttpDnsClient.this.dnsClient.setErrorByHost(str);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "setErrorByHost ex:" + th.toString());
        }
    }

    @Override // com.alipay.mobile.common.transport.httpdns.DnsLocalManager
    public void storeIp2CacheAndDB(Map<String, HttpDns.HttpdnsIP> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45a51fe1", new Object[]{this, map});
        } else if (map != null && map.size() != 0) {
            try {
                this.httpdnsStorage.storeIp2Cache(map);
                storeIp2DB(map);
            } catch (Exception unused) {
                LogCatUtil.debug(TAG, "storeIp2CacheAndDB exception");
            }
        }
    }

    @Override // com.alipay.mobile.common.transport.httpdns.DnsLocalManager
    public void storeIp2DB(Map<String, HttpDns.HttpdnsIP> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c02435d6", new Object[]{this, map});
        } else if (map != null && map.size() != 0) {
            try {
                this.httpdnsStorage.storeIp2DB(map, getNetworkType());
                e();
            } catch (Exception e) {
                LogCatUtil.error(TAG, "storeIp2DB exception ", e);
            }
        }
    }

    public void updateDnsTtl(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40d008b0", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.httpdnsStorage.getCache().isEmpty()) {
                reloadDns();
            }
            if (this.httpdnsStorage.getCache().size() > 0) {
                for (Map.Entry<String, HttpDns.HttpdnsIP> entry : this.httpdnsStorage.getCache().entrySet()) {
                    HttpDns.HttpdnsIP value = entry.getValue();
                    value.setTime(currentTimeMillis);
                    value.setTtl((i * 1000) + currentTimeMillis);
                }
                storeIp2DB(this.httpdnsStorage.getCache());
                LogCatUtil.info(TAG, "updateDnsTtl complete...");
                return;
            }
            LogCatUtil.info(TAG, "updateDnsTtl failure...");
        } catch (Exception e) {
            LogCatUtil.error(TAG, "updateDnsTtl exception", e);
        }
    }

    @Override // com.alipay.mobile.common.transport.httpdns.DnsLocalManager
    public void updateIp2CacheAndDB(Map<String, HttpDns.HttpdnsIP> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1be0bfc9", new Object[]{this, map});
        } else if (map != null && !map.isEmpty()) {
            this.httpdnsStorage.updateIp2CacheAndDB(map);
        }
    }

    public static void dnsClientInit(Context context, String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("729b1918", new Object[]{context, str, new Integer(i), new Boolean(z)});
        } else if (alipayHttpDnsClient == null) {
            AlipayHttpDnsClient alipayHttpDnsClient2 = new AlipayHttpDnsClient(context, i);
            alipayHttpDnsClient = alipayHttpDnsClient2;
            alipayHttpDnsClient2.dnsClient.setHosts(str, z);
            alipayHttpDnsClient.networkManager.setNetworkContext(context);
            a();
        }
    }

    @Override // com.alipay.mobile.common.transport.httpdns.DnsService
    public void refreshAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("690e6e4d", new Object[]{this});
            return;
        }
        LogCatUtil.info(TAG, "refreshAll ,refreshIPList and Conf...");
        this.dnsClient.delayRequestStrong(1);
    }

    @Override // com.alipay.mobile.common.transport.httpdns.DnsService
    public void refreshIPListOnly() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2ae5753", new Object[]{this});
            return;
        }
        LogCatUtil.info(TAG, "refreshIPList ONLY...");
        this.dnsClient.delayRequestStrong(1, ConfigSelector.GET_IPLIST_ONLY);
    }

    public final boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            LogCatUtil.warn(TAG, "isInHosts : host is null.");
            return false;
        }
        ArrayList<String> hosts = this.dnsClient.getHosts();
        if (hosts != null) {
            return hosts.contains(str) || TransportStrategy.isAlipayHost(str) || TransportStrategy.isRpcCdnHost(str);
        }
        LogCatUtil.warn(TAG, "localHosts is null.");
        return false;
    }

    public boolean isHttpdnsDie() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aee9f1f4", new Object[]{this})).booleanValue();
        }
        try {
            HttpDns.HttpdnsIP ipInfoByHttpdns = this.httpdnsStorage.getIpInfoByHttpdns(AmnetOperationManager.AMNET_HOST);
            if (ipInfoByHttpdns != null && ipInfoByHttpdns.isDie()) {
                LogCatUtil.info(TAG, "httpdns die, request again");
                alipayHttpDnsClient.dnsClient.requestStrong();
                return true;
            }
        } catch (Throwable th) {
            LogCatUtil.warn(TAG, "isHttpdnsDie ex:" + th.toString());
        }
        return false;
    }

    @Override // com.alipay.mobile.common.transport.httpdns.DnsLocalManager
    public HttpDns.HttpdnsIP queryLocalIPByHost(String str) {
        HttpdnsIPEntry[] ipEntries;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpDns.HttpdnsIP) ipChange.ipc$dispatch("4699af68", new Object[]{this, str});
        }
        if (!dnsSwitch) {
            LogCatUtil.info(TAG, "queryLocalIPByHost. dnsSwitch is false.");
            return null;
        }
        try {
            HttpDns.HttpdnsIP ipInfoByHttpdns = this.httpdnsStorage.getIpInfoByHttpdns(str);
            if (ipInfoByHttpdns == null) {
                LogCatUtil.debug(TAG, "queryLocalIPByHost hostName=" + str + " , ipInfo=[null]");
                return null;
            } else if (ipInfoByHttpdns.isDie()) {
                LogCatUtil.info(TAG, "queryLocalIPByHost ,httpdns die, request again");
                alipayHttpDnsClient.dnsClient.requestStrong();
                return null;
            } else {
                LogCatUtil.debug(TAG, "queryLocalIPByHost hostName=" + str + " , ipInfo=" + ipInfoByHttpdns.toString());
                if (ipInfoByHttpdns.isTimeOut()) {
                    LogCatUtil.info(TAG, "queryLocalIPByHost ,httpdns cache expired, request again...");
                    alipayHttpDnsClient.dnsClient.requestWeak(ThreadType.HTTPDNSREQUEST_TIMEOUT);
                }
                if (ipInfoByHttpdns.isHasIPv6() && !TransportStrategy.isEnableIPv6()) {
                    ArrayList arrayList = new ArrayList();
                    for (HttpdnsIPEntry httpdnsIPEntry : ipInfoByHttpdns.getIpEntries()) {
                        if (httpdnsIPEntry.ipType == HttpDns.IP_TYPE_V4) {
                            arrayList.add(httpdnsIPEntry);
                        }
                    }
                    ipInfoByHttpdns.setIpEntries((HttpdnsIPEntry[]) arrayList.toArray(new HttpdnsIPEntry[arrayList.size()]));
                    LogCatUtil.debug(TAG, "queryLocalIPByHost,switch off,filter-out ipv6,hostName=" + str + " , ipInfo=" + ipInfoByHttpdns.toString());
                }
                return ipInfoByHttpdns;
            }
        } catch (Throwable th) {
            LogCatUtil.warn(TAG, "queryLocalIPByHost ex:" + th.toString());
            return null;
        }
    }

    public InetAddress[] getAllByName(String str, TransportContext transportContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InetAddress[]) ipChange.ipc$dispatch("b1904efc", new Object[]{this, str, transportContext});
        }
        f(str);
        InetAddress[] d = d(str);
        if (d != null) {
            return d;
        }
        try {
            return this.dnsClient.getAllByNameFromInetAddr(str, transportContext);
        } catch (UnknownHostException e) {
            LogCatUtil.error(TAG, "getAllByName,e:" + e.toString());
            InetAddress[] h = h(str);
            if (h != null) {
                LogCatUtil.printInfo(TAG, "getAllByNameFromPreset Success.");
                return h;
            }
            throw e;
        }
    }
}
