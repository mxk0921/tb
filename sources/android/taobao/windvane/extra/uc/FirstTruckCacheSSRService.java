package android.taobao.windvane.extra.uc;

import android.os.Handler;
import android.os.SystemClock;
import android.taobao.windvane.extra.storage.FccStorageType;
import android.taobao.windvane.extra.storage.FirstChunkStorage;
import android.taobao.windvane.extra.storage.ResponseContext;
import android.taobao.windvane.extra.uc.prefetch.UCDefaultUserAgent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.uc.webview.export.WebView;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import tb.bgq;
import tb.egq;
import tb.gl4;
import tb.icn;
import tb.lcn;
import tb.lrg;
import tb.mnf;
import tb.nnf;
import tb.oba;
import tb.t2o;
import tb.v7t;
import tb.vpw;
import tb.wpw;
import tb.y71;
import tb.zeq;
import tb.zht;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class FirstTruckCacheSSRService implements nnf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CACHE_HTML = "fcc-html";
    public static final String CACHE_HTML_CACHE = "fcc-html-cache";
    public static final String CACHE_HTML_LENGTH = "html-byte-size";
    public static final String CACHE_HTML_LENGTH_CACHE = "html-byte-size-cache";
    public static final String CACHE_HTML_LENGTH_SNAPSHOT = "html-byte-size-snapshot";
    public static final String CACHE_HTML_SNAPSHOT = "fcc-html-snapshot";
    public static final String CACHE_LAST_MODIFIED_TIME = "last-mdf-time";
    public static final String CACHE_PRIORITY = "cache-priority";
    public static final int CACHE_PRIORITY_CACHE = 0;
    public static final int CACHE_PRIORITY_SNAPSHOT = 1;
    public static final String CACHE_URL = "fcc-url";
    private static final String FCC_SEPARATOR = "<div><!--fcc--></div>";
    private static final String INVALIDATE_CACHE_SCRIPT = "<script>document.getRootNode().activeElement.innerHTML=null;document.head.innerHTML=null</script>";
    private static final String INVALIDATE_CACHE_SCRIPT_WITH_RELOAD = "<script>window.location.reload();</script>";
    public static final String QUERY_RULE_SPLITTER = ",";
    public static final String RESPONSE_HEADER_ENABLE_FCC = "fcc-enable";
    public static final String RESPONSE_HEADER_FCC_EXPIRED_TIMESTAMP = "fcc-expire-time";
    public static final String RESPONSE_HEADER_FCC_NO_STORE_CACHE = "fcc-no-store-cache";
    public static final String RESPONSE_HEADER_FCC_RULE = "fcc-url-query-rule";
    public static final String RESPONSE_HEADER_FCC_STRATEGY_CACHE = "fcc-strategy-cache";
    public static final String RESPONSE_HEADER_FCC_VERSION = "fcc-version";
    public static final String SNAPSHOT_TAG = "Themis/Performance/Snapshot";
    public static final String TAG = "WindVane/NetworkSSRCache";
    private final nnf mService;

    static {
        t2o.a(989856063);
    }

    public FirstTruckCacheSSRService() {
        if (vpw.commonConfig.U1) {
            this.mService = new SSRPrerenderService();
        } else {
            this.mService = zeq.a();
        }
    }

    public static /* synthetic */ void access$000(FirstTruckCacheSSRService firstTruckCacheSSRService, ResponseContext responseContext, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("886fd0a9", new Object[]{firstTruckCacheSSRService, responseContext, map});
        } else {
            firstTruckCacheSSRService.parseResponseHeadersCompatible(responseContext, map);
        }
    }

    public static /* synthetic */ void access$100(FirstTruckCacheSSRService firstTruckCacheSSRService, ResponseContext responseContext, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a832faa", new Object[]{firstTruckCacheSSRService, responseContext, map});
        } else {
            firstTruckCacheSSRService.parseResponseHeaders(responseContext, map);
        }
    }

    public static /* synthetic */ String access$200(FirstTruckCacheSSRService firstTruckCacheSSRService, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("be780fcd", new Object[]{firstTruckCacheSSRService, new Integer(i)});
        }
        return firstTruckCacheSSRService.translateType(i);
    }

    public static /* synthetic */ void access$300(FirstTruckCacheSSRService firstTruckCacheSSRService, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b1e3748", new Object[]{firstTruckCacheSSRService, str, new Integer(i)});
        } else {
            firstTruckCacheSSRService.reportFirstChunkCache(str, i);
        }
    }

    public static /* synthetic */ boolean access$400(FirstTruckCacheSSRService firstTruckCacheSSRService, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91928ca0", new Object[]{firstTruckCacheSSRService, str})).booleanValue();
        }
        return firstTruckCacheSSRService.shouldDowngradeFailOver(str);
    }

    public static /* synthetic */ void access$500(FirstTruckCacheSSRService firstTruckCacheSSRService, mnf mnfVar, bgq bgqVar, int i, Map map, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2d5934c", new Object[]{firstTruckCacheSSRService, mnfVar, bgqVar, new Integer(i), map, new Integer(i2)});
        } else {
            firstTruckCacheSSRService.downgradeFailOver(mnfVar, bgqVar, i, map, i2);
        }
    }

    private String getResponseValue(Map<String, List<String>> map, String str) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("76665b2", new Object[]{this, map, str});
        }
        if (map != null && map.containsKey(str) && (list = map.get(str)) != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    private String getResponseValueCompatible(Map<String, List<String>> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3aa48d26", new Object[]{this, map, str});
        }
        String responseValue = getResponseValue(map, str);
        if (!TextUtils.isEmpty(responseValue)) {
            return responseValue;
        }
        return getResponseValue(map, "mtop-" + str);
    }

    private static List<String> listOf(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ae8a9512", new Object[]{objArr});
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            arrayList.add(obj.toString());
        }
        return arrayList;
    }

    private void parseResponseHeadersCompatible(ResponseContext responseContext, Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9317be8", new Object[]{this, responseContext, map});
            return;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (!(entry == null || entry.getKey() == null)) {
                treeMap.put(entry.getKey(), entry.getValue());
            }
        }
        String responseValueCompatible = getResponseValueCompatible(treeMap, RESPONSE_HEADER_ENABLE_FCC);
        if (!TextUtils.isEmpty(responseValueCompatible)) {
            responseContext.setEnable("true".equals(responseValueCompatible));
        }
        String responseValueCompatible2 = getResponseValueCompatible(treeMap, RESPONSE_HEADER_FCC_RULE);
        if (!TextUtils.isEmpty(responseValueCompatible2)) {
            responseContext.setRule(responseValueCompatible2);
        }
        String responseValueCompatible3 = getResponseValueCompatible(treeMap, RESPONSE_HEADER_FCC_VERSION);
        if (!TextUtils.isEmpty(responseValueCompatible3)) {
            responseContext.setVersion(responseValueCompatible3);
        }
        String responseValueCompatible4 = getResponseValueCompatible(treeMap, RESPONSE_HEADER_FCC_STRATEGY_CACHE);
        if (!TextUtils.isEmpty(responseValueCompatible4)) {
            responseContext.setStrategyCache(responseValueCompatible4);
        }
        String responseValueCompatible5 = getResponseValueCompatible(treeMap, RESPONSE_HEADER_FCC_NO_STORE_CACHE);
        if (!TextUtils.isEmpty(responseValueCompatible5)) {
            responseContext.setNoStorageCache(TextUtils.equals(responseValueCompatible5.toLowerCase(), "true"));
        }
        String responseValueCompatible6 = getResponseValueCompatible(treeMap, RESPONSE_HEADER_FCC_EXPIRED_TIMESTAMP);
        if (!TextUtils.isEmpty(responseValueCompatible6)) {
            try {
                responseContext.setExpiredTime(Long.parseLong(responseValueCompatible6));
            } catch (Exception unused) {
            }
        }
        if (responseContext.getExpiredTime() == 0) {
            responseContext.setExpiredTime(ResponseContext.getDefaultExpiredTime());
        }
    }

    private void reportFirstChunkCache(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6380761", new Object[]{this, str, new Integer(i)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", (Object) str);
        jSONObject.put("type", (Object) Integer.valueOf(i));
        y71.commitSuccess("firstChunkCache", jSONObject.toJSONString());
    }

    public static void reportType(WebView webView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7e830be", new Object[]{webView, new Integer(i)});
        } else if (webView != null && i >= 0 && (webView instanceof WVUCWebView)) {
            ((WVUCWebView) webView).getWebViewContext().getWebViewPageModel().onProperty("firstChunkCache", Integer.valueOf(i));
        }
    }

    @Override // tb.nnf
    public boolean cancel(bgq bgqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("801a6ac3", new Object[]{this, bgqVar})).booleanValue();
        }
        return this.mService.cancel(bgqVar);
    }

    private void parseResponseHeaders(ResponseContext responseContext, Map<String, List<String>> map) {
        List list;
        List list2;
        List list3;
        List list4;
        List list5;
        List list6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c22ec474", new Object[]{this, responseContext, map});
            return;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (!(entry == null || entry.getKey() == null)) {
                treeMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (treeMap.containsKey(RESPONSE_HEADER_ENABLE_FCC) && (list6 = (List) treeMap.get(RESPONSE_HEADER_ENABLE_FCC)) != null && list6.size() > 0) {
            String str = (String) list6.get(0);
            if (!TextUtils.isEmpty(str)) {
                responseContext.setEnable("true".equals(str));
            }
        }
        if (treeMap.containsKey(RESPONSE_HEADER_FCC_RULE) && (list5 = (List) treeMap.get(RESPONSE_HEADER_FCC_RULE)) != null && list5.size() > 0) {
            String str2 = (String) list5.get(0);
            if (!TextUtils.isEmpty(str2)) {
                responseContext.setRule(str2);
            }
        }
        if (treeMap.containsKey(RESPONSE_HEADER_FCC_VERSION) && (list4 = (List) treeMap.get(RESPONSE_HEADER_FCC_VERSION)) != null && list4.size() > 0) {
            String str3 = (String) list4.get(0);
            if (!TextUtils.isEmpty(str3)) {
                responseContext.setVersion(str3);
            }
        }
        if (treeMap.containsKey(RESPONSE_HEADER_FCC_NO_STORE_CACHE) && (list3 = (List) treeMap.get(RESPONSE_HEADER_FCC_NO_STORE_CACHE)) != null && list3.size() > 0) {
            String str4 = (String) list3.get(0);
            if (!TextUtils.isEmpty(str4)) {
                try {
                    responseContext.setNoStorageCache(TextUtils.equals(str4.toLowerCase(), "true"));
                } catch (Exception unused) {
                }
            }
        }
        if (treeMap.containsKey(RESPONSE_HEADER_FCC_STRATEGY_CACHE) && (list2 = (List) treeMap.get(RESPONSE_HEADER_FCC_STRATEGY_CACHE)) != null && list2.size() > 0) {
            String str5 = (String) list2.get(0);
            if (!TextUtils.isEmpty(str5)) {
                try {
                    responseContext.setStrategyCache(str5);
                } catch (Exception unused2) {
                }
            }
        }
        if (treeMap.containsKey(RESPONSE_HEADER_FCC_EXPIRED_TIMESTAMP) && (list = (List) treeMap.get(RESPONSE_HEADER_FCC_EXPIRED_TIMESTAMP)) != null && list.size() > 0) {
            String str6 = (String) list.get(0);
            if (!TextUtils.isEmpty(str6)) {
                try {
                    responseContext.setExpiredTime(Long.parseLong(str6));
                } catch (Exception unused3) {
                }
            }
        }
        if (responseContext.getExpiredTime() == 0) {
            responseContext.setExpiredTime(ResponseContext.getDefaultExpiredTime());
        }
    }

    private boolean inWhiteOrBlackList(String str, String str2) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a47215", new Object[]{this, str, str2})).booleanValue();
        }
        if (!(str == null || str2 == null)) {
            try {
                for (String str3 : str2.split(",")) {
                    if (TextUtils.equals("*", str3)) {
                        return true;
                    }
                    if (!TextUtils.isEmpty(str3) && str.contains(str3)) {
                        return true;
                    }
                }
            } catch (Exception e) {
                v7t.e(TAG, "url parse fail", e, new Object[0]);
            }
        }
        return false;
    }

    private boolean shouldDowngradeFailOver(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca7f1ac9", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        wpw wpwVar = vpw.commonConfig;
        if (inWhiteOrBlackList(str, wpwVar.r3)) {
            return false;
        }
        if (inWhiteOrBlackList(str, wpwVar.q3)) {
            return true;
        }
        return oba.g("wvEnableFccDowngradeFailOver");
    }

    private String translateType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2636086c", new Object[]{this, new Integer(i)});
        }
        if (i == 0) {
            return "无缓存";
        }
        if (i == 1) {
            return "命中缓存";
        }
        if (i == 2) {
            return "覆盖";
        }
        if (i != 3) {
            return "unexpected type";
        }
        return "过期";
    }

    private void downgradeFailOver(mnf mnfVar, bgq bgqVar, int i, Map<String, List<String>> map, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1918d27", new Object[]{this, mnfVar, bgqVar, new Integer(i), map, new Integer(i2)});
            return;
        }
        lcn.a(RVLLevel.Info, TAG).j("downgradeFailOver").f();
        mnfVar.onReceiveData(bgqVar, INVALIDATE_CACHE_SCRIPT_WITH_RELOAD.getBytes(StandardCharsets.UTF_8));
        if (vpw.commonConfig.s3) {
            mnfVar.onFinish(bgqVar);
            if (mnfVar instanceof ChunkCacheRequestCallback) {
                ((ChunkCacheRequestCallback) mnfVar).onCustomCallback(3, Integer.valueOf(i2));
            }
            mnfVar.onResponse(bgqVar, i, map);
        }
    }

    @Override // tb.nnf
    public boolean asyncSend(bgq bgqVar, final mnf mnfVar, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac8307d5", new Object[]{this, bgqVar, mnfVar, handler})).booleanValue();
        }
        if (bgqVar == null) {
            lcn.f(RVLLevel.Error, TAG, "ssrRequest is null.");
            return false;
        }
        if (vpw.commonConfig.W1) {
            try {
                ((HashMap) bgqVar.c).put("Browser-User-Agent", UCDefaultUserAgent.VALUE);
            } catch (Exception e) {
                RVLLevel rVLLevel = RVLLevel.Error;
                lcn.f(rVLLevel, TAG, "failed to add Browser-User-Agent header: " + e);
            }
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        final FirstChunkStorage firstChunkStorage = new FirstChunkStorage(bgqVar.f16375a);
        final ResponseContext read = firstChunkStorage.read();
        final boolean z = read != null && read.isExpired();
        if (z) {
            firstChunkStorage.remove();
        }
        final boolean z2 = read != null && !TextUtils.isEmpty(read.getHtml()) && !z;
        if (z2) {
            HashMap hashMap = new HashMap();
            hashMap.put("Content-Type", listOf("text/html"));
            mnfVar.onResponse(bgqVar, 200, hashMap);
            mnfVar.onReceiveData(bgqVar, read.getHtml().getBytes(StandardCharsets.UTF_8));
            wpw wpwVar = vpw.commonConfig;
            if (wpwVar.L2) {
                try {
                    ((HashMap) bgqVar.c).put("x-fcc", "hit");
                    if (wpwVar.X2) {
                        ((HashMap) bgqVar.c).put("x-fcc-version", read.getVersion());
                    }
                } catch (Exception e2) {
                    v7t.d(TAG, "failed to add x-fcc header: " + e2.getMessage());
                }
            }
        }
        if (vpw.commonConfig.y2 && (mnfVar instanceof ChunkCacheRequestCallback)) {
            ((ChunkCacheRequestCallback) mnfVar).onCustomCallback(1, Boolean.valueOf(z2));
        }
        final long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
        final ResponseContext responseContext = new ResponseContext();
        responseContext.setUrl(bgqVar.f16375a);
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        final AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        return this.mService.asyncSend(bgqVar, new mnf() { // from class: android.taobao.windvane.extra.uc.FirstTruckCacheSSRService.1
            public static final /* synthetic */ boolean $assertionsDisabled = false;
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.mnf
            public void onError(bgq bgqVar2, egq egqVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7a95834", new Object[]{this, bgqVar2, egqVar});
                    return;
                }
                mnf mnfVar2 = mnfVar;
                if (mnfVar2 != null) {
                    mnfVar2.onError(bgqVar2, egqVar);
                }
            }

            @Override // tb.mnf
            public void onFinish(bgq bgqVar2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4d53f97", new Object[]{this, bgqVar2});
                    return;
                }
                mnf mnfVar2 = mnfVar;
                if (mnfVar2 != null) {
                    mnfVar2.onFinish(bgqVar2);
                }
            }

            @Override // tb.mnf
            public void onReceiveData(bgq bgqVar2, byte[] bArr) {
                String str;
                int indexOf;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("150b5e1a", new Object[]{this, bgqVar2, bArr});
                } else if (bArr != null) {
                    if ((responseContext.isEnable() || atomicBoolean2.get()) && !atomicBoolean.get()) {
                        try {
                            byteArrayOutputStream.write(Arrays.copyOf(bArr, bArr.length));
                        } catch (IOException unused) {
                            lcn.f(RVLLevel.Error, FirstTruckCacheSSRService.TAG, "failed to write bytes.");
                        }
                        String str2 = null;
                        try {
                            str = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        } catch (UnsupportedEncodingException e3) {
                            RVLLevel rVLLevel2 = RVLLevel.Error;
                            lcn.f(rVLLevel2, FirstTruckCacheSSRService.TAG, "toString error: " + e3.getMessage());
                            str = null;
                        }
                        if (!TextUtils.isEmpty(str) && (indexOf = str.indexOf(FirstTruckCacheSSRService.FCC_SEPARATOR)) >= 0) {
                            int i = indexOf + 21;
                            try {
                                str2 = str.substring(0, i);
                            } catch (Exception unused2) {
                                lcn.f(RVLLevel.Error, FirstTruckCacheSSRService.TAG, "failed to substring firstTrunkHtml");
                            }
                            if (str2 != null) {
                                RVLLevel rVLLevel3 = RVLLevel.Info;
                                lcn.a(rVLLevel3, FirstTruckCacheSSRService.TAG).j("fccIndexed").f();
                                wpw wpwVar2 = vpw.commonConfig;
                                if (wpwVar2.y2) {
                                    mnf mnfVar2 = mnfVar;
                                    if (mnfVar2 instanceof ChunkCacheRequestCallback) {
                                        ((ChunkCacheRequestCallback) mnfVar2).onCustomCallback(2, new Object[0]);
                                    }
                                }
                                Charset charset = StandardCharsets.UTF_8;
                                byte[] bytes = str2.getBytes(charset);
                                if (atomicBoolean2.get()) {
                                    lcn.a(rVLLevel3, FirstTruckCacheSSRService.SNAPSHOT_TAG).j("invalidateCache").f();
                                    if (!FirstTruckCacheSSRService.access$400(FirstTruckCacheSSRService.this, bgqVar2.f16375a)) {
                                        mnfVar.onReceiveData(bgqVar2, FirstTruckCacheSSRService.INVALIDATE_CACHE_SCRIPT.getBytes(charset));
                                    }
                                    mnfVar.onReceiveData(bgqVar2, bytes);
                                }
                                int length = bytes.length - atomicInteger.get();
                                if (!z2 || length < 0 || length >= bArr.length) {
                                    RVLLevel rVLLevel4 = RVLLevel.Error;
                                    lcn.f(rVLLevel4, FirstTruckCacheSSRService.TAG, "no remaining bytes fccByteIndex=" + length + ", bytes.length=" + bArr.length);
                                } else {
                                    byte[] copyOfRange = Arrays.copyOfRange(bArr, length, bArr.length);
                                    if (copyOfRange.length > 0) {
                                        mnfVar.onReceiveData(bgqVar2, copyOfRange);
                                    }
                                }
                                responseContext.setHtml(str2);
                                responseContext.setHtmlLength(str2.length());
                                responseContext.setStorageType(FccStorageType.CACHE);
                                atomicBoolean.set(true);
                                long uptimeMillis3 = SystemClock.uptimeMillis();
                                if (wpwVar2.n3) {
                                    firstChunkStorage.write(responseContext);
                                    lcn.a(rVLLevel3, FirstTruckCacheSSRService.TAG).j("writeCache").a("index", Integer.valueOf(i)).a("cost", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis3)).f();
                                } else if (!wpwVar2.p2) {
                                    firstChunkStorage.write(responseContext);
                                    lcn.a(rVLLevel3, FirstTruckCacheSSRService.TAG).j("writeCache").a("index", Integer.valueOf(i)).a("cost", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis3)).f();
                                } else if (!z2 || atomicBoolean2.get()) {
                                    firstChunkStorage.write(responseContext);
                                    lcn.a(rVLLevel3, FirstTruckCacheSSRService.TAG).j("writeCache").a("index", Integer.valueOf(i)).a("cost", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis3)).f();
                                } else if (responseContext.getPriority() >= read.getPriority()) {
                                    firstChunkStorage.write(responseContext);
                                    lcn.a(rVLLevel3, FirstTruckCacheSSRService.TAG).j("updateCache").a("cost", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis3)).f();
                                } else {
                                    lcn.a(rVLLevel3, FirstTruckCacheSSRService.TAG).j("ignoreCacheUpdate").a("cost", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis3)).f();
                                }
                                try {
                                    byteArrayOutputStream.close();
                                } catch (IOException unused3) {
                                    lcn.f(RVLLevel.Info, FirstTruckCacheSSRService.TAG, "failed to close byteArrayOutputStream");
                                }
                            }
                        }
                        if (!z2) {
                            mnfVar.onReceiveData(bgqVar2, bArr);
                        }
                    } else {
                        mnfVar.onReceiveData(bgqVar2, bArr);
                    }
                    atomicInteger.addAndGet(bArr.length);
                }
            }

            @Override // tb.mnf
            public void onResponse(bgq bgqVar2, int i, Map<String, List<String>> map) {
                int i2 = 3;
                boolean z3 = true;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1e09d3a7", new Object[]{this, bgqVar2, new Integer(i), map});
                    return;
                }
                wpw wpwVar2 = vpw.commonConfig;
                if (wpwVar2.V2) {
                    FirstTruckCacheSSRService.access$000(FirstTruckCacheSSRService.this, responseContext, map);
                } else {
                    FirstTruckCacheSSRService.access$100(FirstTruckCacheSSRService.this, responseContext, map);
                }
                if (z2) {
                    i2 = (!responseContext.isEnable() || !TextUtils.equals(responseContext.getVersion(), read.getVersion())) ? 2 : 1;
                } else if (!z) {
                    i2 = 0;
                }
                RVLLevel rVLLevel2 = RVLLevel.Info;
                icn a2 = lcn.a(rVLLevel2, FirstTruckCacheSSRService.SNAPSHOT_TAG).j(zht.TAG_ACCESS).a("message", FirstTruckCacheSSRService.access$200(FirstTruckCacheSSRService.this, i2)).a("enable", Boolean.valueOf(responseContext.isEnable())).a("url", bgqVar2.f16375a).a("cost", Long.valueOf(uptimeMillis2)).a(lrg.EXT_DATA_MTOP_RESPONSE_HEADERS, map).a("serverVersion", responseContext.getVersion()).a("serverRule", responseContext.getRule());
                ResponseContext responseContext2 = read;
                String str = "";
                icn a3 = a2.a("localRule", responseContext2 == null ? str : responseContext2.getRule());
                ResponseContext responseContext3 = read;
                icn a4 = a3.a(gl4.CONFIG_LOCAL_VERSION, responseContext3 == null ? str : responseContext3.getVersion());
                ResponseContext responseContext4 = read;
                icn a5 = a4.a("localPriority", Integer.valueOf(responseContext4 == null ? 0 : responseContext4.getPriority()));
                ResponseContext responseContext5 = read;
                if (responseContext5 != null) {
                    str = responseContext5.getStorageType().name;
                }
                a5.a("localStorageType", str).f();
                mnf mnfVar2 = mnfVar;
                if (mnfVar2 instanceof ChunkCacheRequestCallback) {
                    if (wpwVar2.y2) {
                        ((ChunkCacheRequestCallback) mnfVar2).onCustomCallback(0, Integer.valueOf(i2));
                    }
                    ((ChunkCacheRequestCallback) mnfVar).onNetworkResponse(i, map);
                }
                FirstTruckCacheSSRService.access$300(FirstTruckCacheSSRService.this, bgqVar2.f16375a, i2);
                AtomicBoolean atomicBoolean3 = atomicBoolean2;
                if (!z2 || !responseContext.isEnable() || TextUtils.equals(responseContext.getVersion(), read.getVersion())) {
                    z3 = false;
                }
                atomicBoolean3.set(z3);
                if (z2) {
                    if (!responseContext.isEnable()) {
                        lcn.a(rVLLevel2, FirstTruckCacheSSRService.TAG).j("disableCache").f();
                        firstChunkStorage.remove();
                        String str2 = bgqVar2.f16375a;
                        if (str2 == null || (!str2.contains("fcc-downgrade-failover=true") && !FirstTruckCacheSSRService.access$400(FirstTruckCacheSSRService.this, str2))) {
                            lcn.a(rVLLevel2, FirstTruckCacheSSRService.TAG).j("downgradeDefault").f();
                            mnfVar.onReceiveData(bgqVar2, FirstTruckCacheSSRService.INVALIDATE_CACHE_SCRIPT.getBytes(StandardCharsets.UTF_8));
                        } else {
                            FirstTruckCacheSSRService.access$500(FirstTruckCacheSSRService.this, mnfVar, bgqVar2, i, map, i2);
                        }
                    }
                    if (FirstTruckCacheSSRService.access$400(FirstTruckCacheSSRService.this, bgqVar2.f16375a) && atomicBoolean2.get()) {
                        FirstTruckCacheSSRService.access$500(FirstTruckCacheSSRService.this, mnfVar, bgqVar2, i, map, i2);
                    }
                    if (atomicBoolean2.get()) {
                        firstChunkStorage.remove();
                        return;
                    }
                    return;
                }
                mnfVar.onResponse(bgqVar2, i, map);
            }
        }, handler);
    }
}
