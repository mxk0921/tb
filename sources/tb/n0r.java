package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.common.util.RemoteConfig;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.global.SDKUtils;
import mtopsdk.mtop.global.SwitchConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class n0r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static n0r f24430a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a extends TypeReference<Map<String, String>> {
        public a(n0r n0rVar) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class b extends TypeReference<Map<String, String>> {
        public b(n0r n0rVar) {
        }
    }

    public static n0r a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n0r) ipChange.ipc$dispatch("63302a06", new Object[0]);
        }
        if (f24430a == null) {
            synchronized (n0r.class) {
                try {
                    if (f24430a == null) {
                        f24430a = new n0r();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f24430a;
    }

    public final Map<String, Set<String>> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7121d088", new Object[]{this, str});
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        JSONArray parseArray = JSON.parseArray(str);
        for (int i = 0; i < parseArray.size(); i++) {
            JSONObject jSONObject = parseArray.getJSONObject(i);
            JSONArray jSONArray = jSONObject.getJSONArray("api");
            JSONArray jSONArray2 = jSONObject.getJSONArray("header");
            HashSet hashSet = new HashSet();
            for (int i2 = 0; i2 < jSONArray2.size(); i2++) {
                hashSet.add(jSONArray2.getString(i2));
            }
            for (int i3 = 0; i3 < jSONArray.size(); i3++) {
                concurrentHashMap.put(jSONArray.getString(i3), hashSet);
            }
        }
        return concurrentHashMap;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d926f5c1", new Object[]{this});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            TBSdkLog.d("mtopsdk.SwitchConfigManager", "[updateAllowPageUrlCutApiConfig] called");
        }
        if (StringUtils.isNotBlank(RemoteConfig.getInstance().allowPageUrlCutApiList)) {
            try {
                List parseArray = JSON.parseArray(RemoteConfig.getInstance().allowPageUrlCutApiList, String.class);
                if (parseArray != null) {
                    SwitchConfig.getInstance().allowPageUrlCutApiSet = new HashSet(parseArray);
                }
            } catch (Throwable th) {
                TBSdkLog.e("mtopsdk.SwitchConfigManager", "[updateAllowPageUrlCutApiConfig]parse and update allowPageUrlCutApiList error.", th);
            }
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i("mtopsdk.SwitchConfigManager", "[updateAllowPageUrlCutApiConfig]parse and update allowPageUrlCutApiList succeed");
            }
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afe7e88e", new Object[]{this});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            TBSdkLog.d("mtopsdk.SwitchConfigManager", "[updateAllowRefererCutApiConfig] called");
        }
        if (StringUtils.isNotBlank(RemoteConfig.getInstance().allowRefererCutApiList)) {
            try {
                List parseArray = JSON.parseArray(RemoteConfig.getInstance().allowRefererCutApiList, String.class);
                if (parseArray != null) {
                    SwitchConfig.getInstance().allowRefererCutApiSet = new HashSet(parseArray);
                }
            } catch (Throwable th) {
                TBSdkLog.e("mtopsdk.SwitchConfigManager", "[updateAllowRefererCutApiConfig]parse and update allowRefererCutApiList error.", th);
            }
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i("mtopsdk.SwitchConfigManager", "[updateAllowRefererCutApiConfig]parse and update allowRefererCutApiList succeed");
            }
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a32f631a", new Object[]{this});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            TBSdkLog.d("mtopsdk.SwitchConfigManager", "[updateDegradeApiCacheList]updateDegradeApiCacheList called");
        }
        if (StringUtils.isNotBlank(RemoteConfig.getInstance().degradeApiCacheList)) {
            try {
                List parseArray = JSON.parseArray(RemoteConfig.getInstance().degradeApiCacheList, String.class);
                if (parseArray != null) {
                    SwitchConfig.getInstance().degradeApiCacheSet = new HashSet(parseArray);
                }
            } catch (Throwable th) {
                TBSdkLog.e("mtopsdk.SwitchConfigManager", "[updateDegradeApiCacheList]parse and update degradeApiCacheList error.", th);
            }
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i("mtopsdk.SwitchConfigManager", "[updateDegradeApiCacheList]parse and update degradeApiCacheList succeed");
            }
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            TBSdkLog.d("mtopsdk.SwitchConfigManager", "[updateRemoveCacheBlockList]updateRemoveCacheBlockList called");
        }
        if (StringUtils.isNotBlank(RemoteConfig.getInstance().removeCacheBlockList)) {
            try {
                List parseArray2 = JSON.parseArray(RemoteConfig.getInstance().removeCacheBlockList, String.class);
                if (parseArray2 != null) {
                    for (int i = 0; i < parseArray2.size(); i++) {
                        String str = (String) parseArray2.get(i);
                        boolean removeCacheBlock = SDKUtils.removeCacheBlock(str);
                        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                            TBSdkLog.i("mtopsdk.SwitchConfigManager", "[updateRemoveCacheBlockList]removeCacheBlock result=" + removeCacheBlock + ",blockName=" + str);
                        }
                    }
                }
            } catch (Throwable th2) {
                TBSdkLog.e("mtopsdk.SwitchConfigManager", "[updateRemoveCacheBlockList]parse and update removeCacheBlockList error.", th2);
            }
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("983baa8", new Object[]{this});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            TBSdkLog.d("mtopsdk.SwitchConfigManager", "[updateCookieDisableApiConfig] called");
        }
        if (StringUtils.isNotBlank(RemoteConfig.getInstance().cookieDisableApiList)) {
            try {
                List parseArray = JSON.parseArray(RemoteConfig.getInstance().cookieDisableApiList, String.class);
                if (parseArray != null) {
                    SwitchConfig.getInstance().cookieDisableApiSet = new HashSet(parseArray);
                }
            } catch (Throwable th) {
                TBSdkLog.e("mtopsdk.SwitchConfigManager", "[updateCookieDisableApiConfig]parse and update cookieDisableApiList error.", th);
            }
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i("mtopsdk.SwitchConfigManager", "[updateCookieDisableApiConfig]parse and update cookieDisableApiList succeed");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1525938", new Object[]{this});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            TBSdkLog.d("mtopsdk.SwitchConfigManager", "[updateDegradeBizErrorMappingApiList]updateDegradeBizErrorMappingApiList called");
        }
        if (StringUtils.isNotBlank(RemoteConfig.getInstance().degradeBizErrorMappingApiList)) {
            try {
                List parseArray = JSON.parseArray(RemoteConfig.getInstance().degradeBizErrorMappingApiList, String.class);
                if (parseArray != null) {
                    SwitchConfig.getInstance().degradeBizErrorMappingApiSet = new HashSet(parseArray);
                }
            } catch (Throwable th) {
                TBSdkLog.e("mtopsdk.SwitchConfigManager", "[updateDegradeBizErrorMappingApiList]parse and update degradeBizErrorMappingApiList error.", th);
            }
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i("mtopsdk.SwitchConfigManager", "[updateDegradeBizErrorMappingApiList]parse and update degradeBizErrorMappingApiList succeed");
            }
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            TBSdkLog.d("mtopsdk.SwitchConfigManager", "[updateErrorMappingMsgMap]updateErrorMappingMsgMap called");
        }
        if (StringUtils.isNotBlank(RemoteConfig.getInstance().errorMappingMsg)) {
            try {
                Map map = (Map) JSON.parseObject(RemoteConfig.getInstance().errorMappingMsg, new b(this), new Feature[0]);
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (StringUtils.isNotBlank((String) entry.getKey()) && StringUtils.isNotBlank((String) entry.getValue())) {
                            SwitchConfig.errorMappingMsgMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
            } catch (Throwable th2) {
                TBSdkLog.e("mtopsdk.SwitchConfigManager", "[updateErrorMappingMsgMap]update ErrorMappingMsgMap error.", th2);
            }
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i("mtopsdk.SwitchConfigManager", "[updateErrorMappingMsgMap]parse and update ErrorMappingMsgMap succeed.remoteErrorMappingMsgMap=");
            }
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59782322", new Object[]{this});
            return;
        }
        if (StringUtils.isNotBlank(RemoteConfig.getInstance().mtopGlobalHeadersList)) {
            try {
                Map<String, Set<String>> b2 = b(RemoteConfig.getInstance().mtopGlobalHeadersList);
                if (!b2.isEmpty()) {
                    SwitchConfig.getInstance().globalHeadersMap = b2;
                }
            } catch (Throwable th) {
                TBSdkLog.e("mtopsdk.SwitchConfigManager", "[updateGlobalHeaderConfig]parse and update globalHeaderConfig error.", th);
            }
        }
        if (StringUtils.isNotBlank(RemoteConfig.getInstance().ssrGlobalHeadersList)) {
            try {
                Map<String, Set<String>> b3 = b(RemoteConfig.getInstance().ssrGlobalHeadersList);
                if (!b3.isEmpty()) {
                    SwitchConfig.getInstance().ssrGlobalHeadersMap = b3;
                }
            } catch (Throwable th2) {
                TBSdkLog.e("mtopsdk.SwitchConfigManager", "[updateGlobalHeaderConfig]parse and update globalHeaderConfig error.", th2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object] */
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa4e811b", new Object[]{this});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            TBSdkLog.d("mtopsdk.SwitchConfigManager", "updateIndividualApiLockIntervalMap called");
        }
        Map<String, String> individualApiLockIntervalMap = SwitchConfig.getInstance().getIndividualApiLockIntervalMap();
        if (!individualApiLockIntervalMap.isEmpty()) {
            individualApiLockIntervalMap.clear();
        }
        if (!StringUtils.isBlank(RemoteConfig.getInstance().individualApiLockInterval)) {
            try {
                Map map = (Map) JSON.parseObject(RemoteConfig.getInstance().individualApiLockInterval, new a(this), new Feature[0]);
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (StringUtils.isNotBlank((String) entry.getKey())) {
                            individualApiLockIntervalMap.put(((String) entry.getKey()).toLowerCase(Locale.US), entry.getValue());
                        }
                    }
                }
            } catch (Throwable th) {
                TBSdkLog.e("mtopsdk.SwitchConfigManager", "[updateIndividualApiLockIntervalMap] deSerialize intervalStr error.---" + th.toString());
            }
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i("mtopsdk.SwitchConfigManager", "[updateIndividualApiLockIntervalMap]parse and update individual ApiLock Interval Map succeed");
            }
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b7f9b5d", new Object[]{this});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            TBSdkLog.d("mtopsdk.SwitchConfigManager", "[updateJsBridgeTimeoutApiConfig] called");
        }
        if (StringUtils.isNotBlank(RemoteConfig.getInstance().jsBridgeTimeoutApiList)) {
            try {
                List parseArray = JSON.parseArray(RemoteConfig.getInstance().jsBridgeTimeoutApiList, String.class);
                if (parseArray != null) {
                    SwitchConfig.getInstance().jsBridgeTimeoutApiSet = new HashSet(parseArray);
                }
            } catch (Throwable th) {
                TBSdkLog.e("mtopsdk.SwitchConfigManager", "[updateJsBridgeTimeoutApiConfig]parse and update jsBridgeTimeoutApiList error.", th);
            }
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i("mtopsdk.SwitchConfigManager", "[updateJsBridgeTimeoutApiConfig]parse and update signDegradedApiList succeed");
            }
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ada1811", new Object[]{this});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            TBSdkLog.d("mtopsdk.SwitchConfigManager", "[updatePrefetchExpiredTimeApiConfig] called");
        }
        if (StringUtils.isNotBlank(RemoteConfig.getInstance().allowCustomPrefetchExpiredTimeApiList)) {
            try {
                List parseArray = JSON.parseArray(RemoteConfig.getInstance().allowCustomPrefetchExpiredTimeApiList, String.class);
                if (parseArray != null) {
                    SwitchConfig.getInstance().allowCustomPrefetchExpireTimeApiSet = new HashSet(parseArray);
                }
            } catch (Throwable th) {
                TBSdkLog.e("mtopsdk.SwitchConfigManager", "[updatePrefetchExpiredTimeApiConfig]parse and update allowCustomPrefetchExpiredTimeApiList error.", th);
            }
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i("mtopsdk.SwitchConfigManager", "[updatePrefetchExpiredTimeApiConfig]parse and update allowCustomPrefetchExpiredTimeApiList succeed");
            }
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d62c816f", new Object[]{this});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            TBSdkLog.d("mtopsdk.SwitchConfigManager", "[updateSignDegradedApiConfig] called");
        }
        owp.d();
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef9ebbd1", new Object[]{this});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            TBSdkLog.d("mtopsdk.SwitchConfigManager", "[updateSignDegradedApiConfig2] called");
        }
        owp.e();
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83eb6d74", new Object[]{this});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            TBSdkLog.d("mtopsdk.SwitchConfigManager", "[updateSupportZstdApiConfig] called");
        }
        if (StringUtils.isNotBlank(RemoteConfig.getInstance().supportZstdApiList)) {
            try {
                List parseArray = JSON.parseArray(RemoteConfig.getInstance().supportZstdApiList, String.class);
                if (parseArray != null) {
                    SwitchConfig.getInstance().supportZstdApiSet = new HashSet(parseArray);
                }
            } catch (Throwable th) {
                TBSdkLog.e("mtopsdk.SwitchConfigManager", "[updateSupportZstdApiConfig]parse and update supportZstdtApiList error.", th);
            }
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i("mtopsdk.SwitchConfigManager", "[updateSupportZstdApiConfig]parse and update supportZstdtApiList succeed");
            }
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b16deb", new Object[]{this});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            TBSdkLog.d("mtopsdk.SwitchConfigManager", "[updateSwitchToPostApiConfig] called");
        }
        if (StringUtils.isNotBlank(RemoteConfig.getInstance().allowSwitchToPostApiList)) {
            try {
                List parseArray = JSON.parseArray(RemoteConfig.getInstance().allowSwitchToPostApiList, String.class);
                if (parseArray != null) {
                    SwitchConfig.getInstance().allowSwitchToPostApiSet = new HashSet(parseArray);
                }
            } catch (Throwable th) {
                TBSdkLog.e("mtopsdk.SwitchConfigManager", "[updateSwitchToPostApiConfig]parse and update allowSwitchPostApiList error.", th);
            }
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i("mtopsdk.SwitchConfigManager", "[updateSwitchToPostApiConfig]parse and update allowSwitchPostApiList succeed");
            }
        }
    }
}
