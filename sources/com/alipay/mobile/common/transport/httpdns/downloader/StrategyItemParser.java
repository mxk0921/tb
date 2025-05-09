package com.alipay.mobile.common.transport.httpdns.downloader;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.dns.storage.DnsPreference;
import com.alipay.mobile.common.transport.httpdns.AlipayHttpDnsClient;
import com.alipay.mobile.common.transport.httpdns.DnsUtil;
import com.alipay.mobile.common.transport.httpdns.HttpDns;
import com.alipay.mobile.common.transport.httpdns.HttpdnsIPEntry;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.NwSharedSwitchUtil;
import com.alipay.mobile.common.transport.utils.SharedPreUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.pod;
import tb.xti;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class StrategyItemParser {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "HDNS_StrategyItemParser";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f4114a;

    public static String a(boolean z, JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4862981c", new Object[]{new Boolean(z), jSONObject});
        }
        String str2 = null;
        if (!z) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("conf");
            if (jSONObject2 != null) {
                str2 = jSONObject2.getString(NwSharedSwitchUtil.KEY_NET_SWITCH_TWO);
                str = jSONObject2.getString("configVersion");
                if (!TextUtils.isEmpty(str)) {
                    DnsUtil.putConfigVersion(str);
                }
            } else {
                str = null;
            }
            LogCatUtil.info(TAG, "ANC Config Str: " + str2 + " ,configVersion: " + str);
        }
        return str2;
    }

    public static /* synthetic */ boolean access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd6077b", new Object[0])).booleanValue();
        }
        return f4114a;
    }

    public static void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
            return;
        }
        try {
            final Boolean bool = jSONObject.getBoolean("amdc_https");
            if (bool != null) {
                LogCatUtil.info(TAG, "amdcHttpsValue=[" + bool.booleanValue() + "]");
                NetworkAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.transport.httpdns.downloader.StrategyItemParser.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            SharedPreUtils.putData(TransportEnvUtil.getContext(), "amdc_https", bool.booleanValue());
                        }
                    }
                });
            } else {
                NetworkAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.transport.httpdns.downloader.StrategyItemParser.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        LogCatUtil.info(StrategyItemParser.TAG, "no amdc_https parameter, try remove");
                        SharedPreUtils.removeData(TransportEnvUtil.getContext(), "amdc_https");
                    }
                });
            }
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "resolveAmdcHttps ex= " + th.toString());
        }
    }

    public static HttpdnsIPEntry[] f(HttpdnsIPEntry[] httpdnsIPEntryArr, HttpdnsIPEntry[] httpdnsIPEntryArr2) {
        int i;
        int i2;
        HttpdnsIPEntry[] httpdnsIPEntryArr3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpdnsIPEntry[]) ipChange.ipc$dispatch("3c45d62e", new Object[]{httpdnsIPEntryArr, httpdnsIPEntryArr2});
        }
        HttpdnsIPEntry[] httpdnsIPEntryArr4 = new HttpdnsIPEntry[httpdnsIPEntryArr.length + httpdnsIPEntryArr2.length];
        if (httpdnsIPEntryArr.length <= httpdnsIPEntryArr2.length) {
            i = httpdnsIPEntryArr.length;
        } else {
            i = httpdnsIPEntryArr2.length;
        }
        if (httpdnsIPEntryArr.length >= httpdnsIPEntryArr2.length) {
            i2 = httpdnsIPEntryArr.length;
        } else {
            i2 = httpdnsIPEntryArr2.length;
        }
        if (httpdnsIPEntryArr.length >= httpdnsIPEntryArr2.length) {
            httpdnsIPEntryArr3 = httpdnsIPEntryArr;
        } else {
            httpdnsIPEntryArr3 = httpdnsIPEntryArr2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = i3 + 1;
            httpdnsIPEntryArr4[i3] = httpdnsIPEntryArr[i4];
            i3 += 2;
            httpdnsIPEntryArr4[i5] = httpdnsIPEntryArr2[i4];
        }
        while (i < i2) {
            httpdnsIPEntryArr4[i3] = httpdnsIPEntryArr3[i];
            i++;
            i3++;
        }
        return httpdnsIPEntryArr4;
    }

    public static String generateStrategyReq(StrategyRequest strategyRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4a40c0", new Object[]{strategyRequest});
        }
        if (strategyRequest == null) {
            LogCatUtil.info(TAG, "request 为null");
            return null;
        }
        try {
            String jSONString = JSON.toJSONString(strategyRequest);
            LogCatUtil.info(TAG, "请求体: " + jSONString);
            return jSONString;
        } catch (JSONException e) {
            LogCatUtil.error(TAG, "JSONException", e);
            return null;
        }
    }

    public static boolean isOversea() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b708a7c", new Object[0])).booleanValue();
        }
        return f4114a;
    }

    public static StrategyResponse parseStrategyContent(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StrategyResponse) ipChange.ipc$dispatch("a77d3d75", new Object[]{str}) : parseStrategyContent(str, false);
    }

    public static void g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{jSONObject});
            return;
        }
        try {
            Boolean bool = jSONObject.getBoolean(xti.AREA_OVERSEA);
            if (bool != null) {
                f4114a = bool.booleanValue();
                LogCatUtil.debug(TAG, "mOversea=[" + f4114a + "]");
                MiscUtils.setOversea(f4114a);
                NetworkAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.transport.httpdns.downloader.StrategyItemParser.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            SharedPreUtils.putData(TransportEnvUtil.getContext(), xti.AREA_OVERSEA, StrategyItemParser.access$000());
                        }
                    }
                });
            } else {
                f4114a = false;
                MiscUtils.setOversea(false);
                NetworkAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.transport.httpdns.downloader.StrategyItemParser.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            SharedPreUtils.removeData(TransportEnvUtil.getContext(), xti.AREA_OVERSEA);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            LogCatUtil.error(TAG, th);
        }
    }

    public static StrategyResponse parseStrategyContent(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StrategyResponse) ipChange.ipc$dispatch("fce969e9", new Object[]{str, new Boolean(z)});
        }
        LogCatUtil.info(TAG, "result: " + str);
        HashMap hashMap = new HashMap();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            JSONObject parseObject = JSON.parseObject(str);
            if (parseObject == null) {
                LogCatUtil.info(TAG, "jsonResult is null");
                return null;
            }
            long longValue = parseObject.getLong("code").longValue();
            String string = parseObject.getString("clientIp");
            g(parseObject);
            b(parseObject);
            int intValue = parseObject.getIntValue("ttd");
            int i = intValue <= 0 ? 3 : intValue;
            JSONArray jSONArray = parseObject.getJSONArray("dns");
            if (jSONArray != null && !jSONArray.isEmpty()) {
                c(hashMap, currentTimeMillis, jSONArray, i);
                return new StrategyResponse(longValue, hashMap, a(z, parseObject), string, f4114a, i);
            }
            return null;
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "parseStrategyContent", th);
            return null;
        }
    }

    public static void c(Map<String, HttpDns.HttpdnsIP> map, long j, JSONArray jSONArray, int i) {
        HttpdnsIPEntry[] e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11017b74", new Object[]{map, new Long(j), jSONArray, new Integer(i)});
            return;
        }
        for (int i2 = 0; i2 < jSONArray.size(); i2++) {
            HttpDns.HttpdnsIP httpdnsIP = new HttpDns.HttpdnsIP();
            httpdnsIP.setNetType(AlipayHttpDnsClient.getDnsClient().getNetworkType());
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            String string = jSONObject.getString("domain");
            httpdnsIP.setTtl((jSONObject.getLong(RemoteMessageConst.TTL).longValue() * 1000) + j);
            httpdnsIP.setTime(j);
            httpdnsIP.setTtd(i);
            String string2 = jSONObject.getString("cname");
            if (!TextUtils.isEmpty(string2)) {
                httpdnsIP.setCname(string2);
                map.put(string, httpdnsIP);
            } else {
                JSONArray jSONArray2 = jSONObject.getJSONArray(DnsPreference.KEY_IPS);
                if (jSONArray2 != null && !jSONArray2.isEmpty() && d(httpdnsIP, jSONArray2)) {
                    map.put(string, httpdnsIP);
                    JSONArray jSONArray3 = jSONObject.getJSONArray("ipsv6");
                    if (!(jSONArray3 == null || jSONArray3.isEmpty() || (e = e(jSONArray3)) == null || e.length == 0)) {
                        httpdnsIP.setIpEntries(f(e, httpdnsIP.getIpEntries()));
                        map.put(string, httpdnsIP);
                    }
                }
            }
        }
    }

    public static boolean d(HttpDns.HttpdnsIP httpdnsIP, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fcbfb6e0", new Object[]{httpdnsIP, jSONArray})).booleanValue();
        }
        ArrayList arrayList = new ArrayList(jSONArray.size());
        String str = "";
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            HttpdnsIPEntry httpdnsIPEntry = new HttpdnsIPEntry(jSONObject.getString(pod.IP), HttpDns.IP_TYPE_V4, jSONObject.getIntValue("port"));
            if (DnsUtil.isLogicIP(httpdnsIPEntry.ip)) {
                arrayList.add(httpdnsIPEntry);
                if (TextUtils.isEmpty(str)) {
                    str = httpdnsIPEntry.ip;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        httpdnsIP.setIp(str);
        httpdnsIP.setIpEntries((HttpdnsIPEntry[]) arrayList.toArray(new HttpdnsIPEntry[arrayList.size()]));
        return true;
    }

    public static HttpdnsIPEntry[] e(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpdnsIPEntry[]) ipChange.ipc$dispatch("7872fe06", new Object[]{jSONArray});
        }
        try {
            ArrayList arrayList = new ArrayList(jSONArray.size());
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                arrayList.add(new HttpdnsIPEntry(jSONObject.getString(pod.IP), HttpDns.IP_TYPE_V6, jSONObject.getIntValue("port")));
            }
            return (HttpdnsIPEntry[]) arrayList.toArray(new HttpdnsIPEntry[arrayList.size()]);
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "getHttpdnsIPEntryV6 ex:" + th.toString());
            return null;
        }
    }
}
