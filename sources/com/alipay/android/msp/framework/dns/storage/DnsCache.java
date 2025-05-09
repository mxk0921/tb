package com.alipay.android.msp.framework.dns.storage;

import android.text.TextUtils;
import com.alipay.android.msp.framework.dns.model.CashierDns;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.wu2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DnsCache {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, CashierDns> f3597a = new HashMap();

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eff1cd", new Object[0]);
            return;
        }
        Map<String, CashierDns> map = f3597a;
        if (map == null || ((HashMap) map).isEmpty()) {
            try {
                b();
            } catch (Throwable unused) {
            }
        }
    }

    public static void b() throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe094e", new Object[0]);
            return;
        }
        f3597a = new HashMap();
        String string = DnsPreference.getString(DnsPreference.KEY_IPS, null);
        LogUtil.record(2, "", "DnsCache::initializeIps", "dnsList:".concat(String.valueOf(string)));
        if (!TextUtils.isEmpty(string)) {
            JSONArray jSONArray = new JSONArray(string);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                String optString = jSONObject.optString("domain", null);
                CashierDns cashierDns = new CashierDns(optString, jSONObject.optInt(RemoteMessageConst.TTL, 300));
                if (jSONObject.has("ttd")) {
                    cashierDns.setTtd(jSONObject.getInt("ttd"));
                }
                JSONArray optJSONArray = jSONObject.optJSONArray(DnsPreference.KEY_IPS);
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    String optString2 = optJSONArray.optString(i2, null);
                    if (!TextUtils.isEmpty(optString2)) {
                        cashierDns.addIp(optString2);
                    }
                }
                if (!TextUtils.isEmpty(optString)) {
                    f3597a.put(optString, cashierDns);
                }
            }
        }
    }

    public static void clearCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aded33c", new Object[0]);
            return;
        }
        Map<String, CashierDns> map = f3597a;
        if (map != null) {
            map.clear();
        }
        DnsPreference.remove(DnsPreference.KEY_LAST_SYNC_TIME);
        DnsPreference.remove(DnsPreference.KEY_IPS);
    }

    public static Collection<CashierDns> getCashierDns() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("829da2c4", new Object[0]);
        }
        a();
        Map<String, CashierDns> map = f3597a;
        if (map != null) {
            return ((HashMap) map).values();
        }
        return null;
    }

    public static List<String> getIps(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a9153c60", new Object[]{str});
        }
        CashierDns cashierDns = getCashierDns(str);
        if (cashierDns != null) {
            return cashierDns.getIps();
        }
        return null;
    }

    public static String getTradeNo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("59e3704a", new Object[0]);
        }
        String string = DnsPreference.getString(DnsPreference.KEY_TRADE, null);
        LogUtil.record(2, "", "DnsManager::getTradeNo", "tradeNo:".concat(String.valueOf(string)));
        return string;
    }

    public static void saveTradeNo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("376a5699", new Object[]{str});
            return;
        }
        LogUtil.record(2, "", "DnsManager::saveTradeNo", "tradeNo:".concat(String.valueOf(str)));
        DnsPreference.putString(DnsPreference.KEY_TRADE, str);
    }

    public static boolean isTtdTimeout(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fe4eafc", new Object[]{str})).booleanValue();
        }
        CashierDns cashierDns = getCashierDns(str);
        if (cashierDns == null || cashierDns.mTtd < 0) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() - DnsPreference.getLong(DnsPreference.KEY_LAST_SYNC_TIME, -1L).longValue();
        int i = cashierDns.mTtd;
        return i == 0 ? currentTimeMillis >= 604800000 : currentTimeMillis >= ((long) (i * wu2.DAY));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005c A[Catch: all -> 0x00c5, TRY_ENTER, TryCatch #0 {all -> 0x00c5, blocks: (B:8:0x0017, B:11:0x001e, B:12:0x0027, B:14:0x002d, B:15:0x003b, B:18:0x0046, B:21:0x004d, B:22:0x0053, B:25:0x005c, B:28:0x0080, B:30:0x0088, B:31:0x0093, B:32:0x00b8, B:34:0x00c0), top: B:37:0x0017 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void putCashierDns(java.util.List<com.alipay.android.msp.framework.dns.model.CashierDns> r13) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.alipay.android.msp.framework.dns.storage.DnsCache.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0012
            java.lang.String r3 = "5f8236cd"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r13
            r2.ipc$dispatch(r3, r1)
            return
        L_0x0012:
            java.lang.String r2 = ""
            r3 = 2
            if (r13 == 0) goto L_0x003b
            int r4 = r13.size()     // Catch: all -> 0x00c5
            if (r4 > 0) goto L_0x001e
            goto L_0x003b
        L_0x001e:
            java.util.Map<java.lang.String, com.alipay.android.msp.framework.dns.model.CashierDns> r4 = com.alipay.android.msp.framework.dns.storage.DnsCache.f3597a     // Catch: all -> 0x00c5
            r4.clear()     // Catch: all -> 0x00c5
            java.util.Iterator r4 = r13.iterator()     // Catch: all -> 0x00c5
        L_0x0027:
            boolean r5 = r4.hasNext()     // Catch: all -> 0x00c5
            if (r5 == 0) goto L_0x0042
            java.lang.Object r5 = r4.next()     // Catch: all -> 0x00c5
            com.alipay.android.msp.framework.dns.model.CashierDns r5 = (com.alipay.android.msp.framework.dns.model.CashierDns) r5     // Catch: all -> 0x00c5
            java.util.Map<java.lang.String, com.alipay.android.msp.framework.dns.model.CashierDns> r6 = com.alipay.android.msp.framework.dns.storage.DnsCache.f3597a     // Catch: all -> 0x00c5
            java.lang.String r7 = r5.mDomain     // Catch: all -> 0x00c5
            r6.put(r7, r5)     // Catch: all -> 0x00c5
            goto L_0x0027
        L_0x003b:
            java.lang.String r4 = "DnsManager::saveDnsListCache"
            java.lang.String r5 = "dnsList is empty"
            com.alipay.android.msp.utils.LogUtil.record(r3, r2, r4, r5)     // Catch: all -> 0x00c5
        L_0x0042:
            java.lang.String r4 = "DnsManager::saveDnsListImpl"
            if (r13 == 0) goto L_0x00c0
            int r5 = r13.size()     // Catch: all -> 0x00c5
            if (r5 > 0) goto L_0x004d
            goto L_0x00c0
        L_0x004d:
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch: all -> 0x00c5
            r5.<init>()     // Catch: all -> 0x00c5
            r6 = 0
        L_0x0053:
            int r7 = r13.size()     // Catch: all -> 0x00c5
            java.lang.String r8 = "ips"
            if (r6 >= r7) goto L_0x00b8
            java.lang.Object r7 = r13.get(r6)     // Catch: all -> 0x00c5
            com.alipay.android.msp.framework.dns.model.CashierDns r7 = (com.alipay.android.msp.framework.dns.model.CashierDns) r7     // Catch: all -> 0x00c5
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: all -> 0x00c5
            r9.<init>()     // Catch: all -> 0x00c5
            java.lang.String r10 = "domain"
            java.lang.String r11 = r7.mDomain     // Catch: all -> 0x00c5
            r9.put(r10, r11)     // Catch: all -> 0x00c5
            java.lang.String r10 = "ttl"
            int r11 = r7.mTtl     // Catch: all -> 0x00c5
            r9.put(r10, r11)     // Catch: all -> 0x00c5
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch: all -> 0x00c5
            r10.<init>()     // Catch: all -> 0x00c5
            java.util.List<java.lang.String> r11 = r7.mIps     // Catch: all -> 0x00c5
            if (r11 == 0) goto L_0x0093
            r11 = 0
        L_0x0080:
            java.util.List<java.lang.String> r12 = r7.mIps     // Catch: all -> 0x00c5
            int r12 = r12.size()     // Catch: all -> 0x00c5
            if (r11 >= r12) goto L_0x0093
            java.util.List<java.lang.String> r12 = r7.mIps     // Catch: all -> 0x00c5
            java.lang.Object r12 = r12.get(r11)     // Catch: all -> 0x00c5
            r10.put(r12)     // Catch: all -> 0x00c5
            int r11 = r11 + r1
            goto L_0x0080
        L_0x0093:
            r9.put(r8, r10)     // Catch: all -> 0x00c5
            r5.put(r9)     // Catch: all -> 0x00c5
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: all -> 0x00c5
            java.lang.String r8 = "dns index:"
            r7.<init>(r8)     // Catch: all -> 0x00c5
            r7.append(r6)     // Catch: all -> 0x00c5
            java.lang.String r8 = ", value:"
            r7.append(r8)     // Catch: all -> 0x00c5
            java.lang.String r8 = r9.toString()     // Catch: all -> 0x00c5
            r7.append(r8)     // Catch: all -> 0x00c5
            java.lang.String r7 = r7.toString()     // Catch: all -> 0x00c5
            com.alipay.android.msp.utils.LogUtil.record(r3, r2, r4, r7)     // Catch: all -> 0x00c5
            int r6 = r6 + r1
            goto L_0x0053
        L_0x00b8:
            java.lang.String r13 = r5.toString()     // Catch: all -> 0x00c5
            com.alipay.android.msp.framework.dns.storage.DnsPreference.putString(r8, r13)     // Catch: all -> 0x00c5
            return
        L_0x00c0:
            java.lang.String r13 = "dnses is empty"
            com.alipay.android.msp.utils.LogUtil.record(r3, r2, r4, r13)     // Catch: all -> 0x00c5
        L_0x00c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.framework.dns.storage.DnsCache.putCashierDns(java.util.List):void");
    }

    public static CashierDns getCashierDns(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CashierDns) ipChange.ipc$dispatch("4ec3e05f", new Object[]{str});
        }
        a();
        Map<String, CashierDns> map = f3597a;
        if (map == null || !((HashMap) map).containsKey(str)) {
            return null;
        }
        return (CashierDns) ((HashMap) f3597a).get(str);
    }
}
