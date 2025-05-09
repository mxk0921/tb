package com.alipay.mobile.common.transport.httpdns;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.mobile.common.transport.httpdns.HttpDns;
import com.alipay.mobile.common.transport.httpdns.db.HttpdnsDBService;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class HttpdnsStorage {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "HDNS_Storage";
    public static HttpdnsStorage c;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, HttpDns.HttpdnsIP> f4107a;
    public final HttpdnsDBService b;

    public HttpdnsStorage(Context context) {
        this.f4107a = null;
        this.b = null;
        this.f4107a = new HashMap();
        this.b = new HttpdnsDBService(context);
    }

    public static HttpdnsStorage getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpdnsStorage) ipChange.ipc$dispatch("93ba368b", new Object[]{context});
        }
        HttpdnsStorage httpdnsStorage = c;
        if (httpdnsStorage != null) {
            return httpdnsStorage;
        }
        synchronized (HttpdnsStorage.class) {
            try {
                if (c == null) {
                    c = new HttpdnsStorage(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }

    public final Map<String, HttpDns.HttpdnsIP> a(int i) {
        HttpDns.HttpdnsIP httpdnsIP;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("35efba90", new Object[]{this, new Integer(i)});
        }
        try {
            if (((HashMap) this.f4107a).size() > 0) {
                Iterator it = ((HashMap) this.f4107a).entrySet().iterator();
                if (it.hasNext()) {
                    httpdnsIP = (HttpDns.HttpdnsIP) ((Map.Entry) it.next()).getValue();
                } else {
                    httpdnsIP = null;
                }
                if (httpdnsIP.getNetType() == i) {
                    return this.f4107a;
                }
            }
            return null;
        } catch (Exception e) {
            LogCatUtil.warn(TAG, "getAllIpFromCache exception" + e.toString());
            return null;
        }
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && ((HashMap) this.f4107a).containsKey(str)) {
            ((HashMap) this.f4107a).remove(str);
        }
    }

    public final void c(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
        } else if (!TextUtils.isEmpty(str)) {
            this.b.removeIpInfoFromDB(str, i);
        }
    }

    public final void d(String str, HttpDns.HttpdnsIP httpdnsIP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9b1a7fe", new Object[]{this, str, httpdnsIP});
        } else if (TextUtils.isEmpty(str) || httpdnsIP == null) {
            LogCatUtil.debug(TAG, "putSingleIp2Cache param is null");
        } else {
            ((HashMap) this.f4107a).put(str, httpdnsIP);
        }
    }

    public void deleteIpByHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52ebe142", new Object[]{this, str});
            return;
        }
        int networkType = AlipayHttpDnsClient.getDnsClient().getNetworkType();
        b(str);
        c(str, networkType);
    }

    public void deleteSingleIpFromDB(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78fc40bd", new Object[]{this, str, str2});
            return;
        }
        int networkType = AlipayHttpDnsClient.getDnsClient().getNetworkType();
        b(str);
        f(str, str2, networkType);
    }

    public final void e(String str, HttpDns.HttpdnsIP httpdnsIP, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c83cac5", new Object[]{this, str, httpdnsIP, new Integer(i)});
        } else if (TextUtils.isEmpty(str) || httpdnsIP == null) {
            LogCatUtil.debug(TAG, "putSingleIp2DB param is null");
        } else {
            this.b.insertIpinfo2DB(str, httpdnsIP, i);
        }
    }

    public final void f(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba9507", new Object[]{this, str, str2, new Integer(i)});
        } else if (!TextUtils.isEmpty(str)) {
            this.b.removeSingleIpInfoFromDB(str, str2, i);
        }
    }

    public final void g(Map<String, HttpDns.HttpdnsIP> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map != null && map.size() != 0) {
            try {
                ((HashMap) this.f4107a).putAll(map);
            } catch (Exception e) {
                LogCatUtil.error(TAG, "updateIPInfo2Cache Exception", e);
            }
        }
    }

    public Map<String, HttpDns.HttpdnsIP> getAllIpFromDB(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("818e6117", new Object[]{this, new Integer(i)});
        }
        return this.b.getAllIPFromDB(i);
    }

    public Map<String, HttpDns.HttpdnsIP> getAllIpInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c3c433c", new Object[]{this});
        }
        int networkType = AlipayHttpDnsClient.getDnsClient().getNetworkType();
        Map<String, HttpDns.HttpdnsIP> a2 = a(networkType);
        if (a2 != null) {
            return a2;
        }
        return getAllIpFromDB(networkType);
    }

    public Map<String, HttpDns.HttpdnsIP> getCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("497e9948", new Object[]{this});
        }
        return this.f4107a;
    }

    public HttpDns.HttpdnsIP getIpFromCache(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpDns.HttpdnsIP) ipChange.ipc$dispatch("5a4124ab", new Object[]{this, str, new Integer(i)});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HttpDns.HttpdnsIP httpdnsIP = (HttpDns.HttpdnsIP) ((HashMap) this.f4107a).get(str);
        if (httpdnsIP == null) {
            LogCatUtil.debug(TAG, "getIpFromCache netType: " + i + ",no ipinfo in cache,domain:" + str);
            return null;
        } else if (httpdnsIP.getNetType() == i) {
            LogCatUtil.debug(TAG, "getIpFromCache netType: " + i + ",hit it, domain: " + str);
            return httpdnsIP;
        } else {
            LogCatUtil.debug(TAG, "getIpFromCache ,netType is different,will get from DB, domain : " + str);
            return null;
        }
    }

    public HttpDns.HttpdnsIP getIpFromDB(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpDns.HttpdnsIP) ipChange.ipc$dispatch("a5e24f75", new Object[]{this, str, new Integer(i)});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.b.queryIpInfoFromDB(str, i);
    }

    public HttpDns.HttpdnsIP getIpInfoByHttpdns(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpDns.HttpdnsIP) ipChange.ipc$dispatch("3c81a8b2", new Object[]{this, str});
        }
        int networkType = AlipayHttpDnsClient.getDnsClient().getNetworkType();
        if (networkType == -1 || networkType == 0) {
            LogCatUtil.warn(TAG, "getIpInfoByHttpdns, netType= " + networkType + ",host= " + str);
        }
        HttpDns.HttpdnsIP ipFromCache = getIpFromCache(str, networkType);
        if (ipFromCache != null) {
            return ipFromCache;
        }
        HttpDns.HttpdnsIP ipFromDB = getIpFromDB(str, networkType);
        if (ipFromDB != null) {
            ((HashMap) this.f4107a).put(str, ipFromDB);
        }
        return ipFromDB;
    }

    public final void h(Map<String, HttpDns.HttpdnsIP> map, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee00a486", new Object[]{this, map, new Integer(i)});
        } else if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, HttpDns.HttpdnsIP> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().setNetType(i);
                }
            }
        }
    }

    public final void i(Map<String, HttpDns.HttpdnsIP> map, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa999a07", new Object[]{this, map, new Integer(i)});
        } else if (map != null && map.size() != 0) {
            this.b.updateIp2DB(map, i);
        }
    }

    public void putSingleIp2CacheAndDB(String str, HttpDns.HttpdnsIP httpdnsIP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bf10224", new Object[]{this, str, httpdnsIP});
            return;
        }
        int networkType = AlipayHttpDnsClient.getDnsClient().getNetworkType();
        httpdnsIP.setNetType(networkType);
        d(str, httpdnsIP);
        e(str, httpdnsIP, networkType);
    }

    public void storeIp2Cache(Map<String, HttpDns.HttpdnsIP> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("808a7ac6", new Object[]{this, map});
        } else if (map == null || map.isEmpty()) {
            LogCatUtil.debug(TAG, "putIpInfo2Cache param is null");
        } else {
            ((HashMap) this.f4107a).clear();
            ((HashMap) this.f4107a).putAll(map);
        }
    }

    public void storeIp2CacheAndDB(Map<String, HttpDns.HttpdnsIP> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45a51fe1", new Object[]{this, map});
            return;
        }
        int networkType = AlipayHttpDnsClient.getDnsClient().getNetworkType();
        h(map, networkType);
        storeIp2Cache(map);
        storeIp2DB(map, networkType);
    }

    public void storeIp2DB(Map<String, HttpDns.HttpdnsIP> map, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4462f7ed", new Object[]{this, map, new Integer(i)});
        } else if (map == null || map.isEmpty()) {
            LogCatUtil.debug(TAG, "putIpInfo2DB param is null");
        } else {
            this.b.storeIp2DB(map, i);
        }
    }

    public void updateIp2CacheAndDB(Map<String, HttpDns.HttpdnsIP> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1be0bfc9", new Object[]{this, map});
            return;
        }
        int networkType = AlipayHttpDnsClient.getDnsClient().getNetworkType();
        h(map, networkType);
        g(map);
        i(map, networkType);
    }
}
