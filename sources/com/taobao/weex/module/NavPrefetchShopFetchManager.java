package com.taobao.weex.module;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.triver.triver_shop.extension.ShopPointExtension;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.shop.activity.ShopRenderActivity;
import com.taobao.android.task.Coordinator;
import com.taobao.orange.OrangeConfig;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.utils.WXLogUtils;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.domain.ProtocolEnum;
import mtopsdk.mtop.util.ErrorConstant;
import mtopsdk.mtop.util.ReflectUtil;
import tb.fdv;
import tb.m7r;
import tb.t2o;
import tb.yqp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class NavPrefetchShopFetchManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGE_SHOPRENDER_ERROR = "Page_ShopRender_Error";
    public static final String SHOP_MODULE = "Shop";
    private static final String TAG = "NavPrefetchShop";
    private static NavPrefetchShopFetchManager instance;
    private SoftReference<FetchDataResultListener> mListener;
    private Map<String, JSONObject> fetchCache = new ConcurrentHashMap();
    private Map<String, String> fetchCacheString = new ConcurrentHashMap();
    private Map<String, Long> mtopStartTimeCahce = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface FetchDataResultListener {
        void onReceiveFetchData(String str, JSONObject jSONObject, long j);

        void onReceiveFetchDataString(String str, String str2, long j);
    }

    static {
        t2o.a(773849118);
    }

    private NavPrefetchShopFetchManager() {
    }

    public static /* synthetic */ void access$000(NavPrefetchShopFetchManager navPrefetchShopFetchManager, String str, String str2, String str3, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bca13a8", new Object[]{navPrefetchShopFetchManager, str, str2, str3, objArr});
        } else {
            navPrefetchShopFetchManager.reportFail(str, str2, str3, objArr);
        }
    }

    public static /* synthetic */ void access$100(NavPrefetchShopFetchManager navPrefetchShopFetchManager, String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b295a4", new Object[]{navPrefetchShopFetchManager, str, str2, new Long(j)});
        } else {
            navPrefetchShopFetchManager.putShopFetchDataString(str, str2, j);
        }
    }

    public static /* synthetic */ void access$200(NavPrefetchShopFetchManager navPrefetchShopFetchManager, String str, JSONObject jSONObject, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c955276b", new Object[]{navPrefetchShopFetchManager, str, jSONObject, new Long(j)});
        } else {
            navPrefetchShopFetchManager.putShopFetchData(str, jSONObject, j);
        }
    }

    public static /* synthetic */ void access$300(NavPrefetchShopFetchManager navPrefetchShopFetchManager, String str, String str2, String str3, Throwable th, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("275d008", new Object[]{navPrefetchShopFetchManager, str, str2, str3, th, objArr});
        } else {
            navPrefetchShopFetchManager.reportFail(str, str2, str3, th, objArr);
        }
    }

    public static NavPrefetchShopFetchManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NavPrefetchShopFetchManager) ipChange.ipc$dispatch("20a91d98", new Object[0]);
        }
        if (instance == null) {
            synchronized (NavPrefetchShopFetchManager.class) {
                try {
                    if (instance == null) {
                        instance = new NavPrefetchShopFetchManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    private void putShopFetchData(String str, JSONObject jSONObject, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da912b84", new Object[]{this, str, jSONObject, new Long(j)});
            return;
        }
        if (this.fetchCache.size() > 1) {
            AppMonitor.Alarm.commitFail("Shop", "Page_ShopRender_Error", str, "-61007", "fetchCache more than 1, clear. " + this.fetchCache.keySet());
            reportFail("-61007", "fetchCache more than 1, will clear.", fdv.F_DATA_PROCESS, this.fetchCache.keySet());
            this.fetchCache.clear();
        }
        SoftReference<FetchDataResultListener> softReference = this.mListener;
        if (softReference == null || softReference.get() == null) {
            this.fetchCache.put(str, jSONObject);
            this.mtopStartTimeCahce.put(str, Long.valueOf(j));
            return;
        }
        this.mListener.get().onReceiveFetchData(str, jSONObject, j);
    }

    private void putShopFetchDataString(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e87684b9", new Object[]{this, str, str2, new Long(j)});
            return;
        }
        if (this.fetchCache.size() > 1) {
            AppMonitor.Alarm.commitFail("Shop", "Page_ShopRender_Error", str, "-61007", "fetchCache more than 1, will clear." + this.fetchCache.keySet());
            reportFail("-61007", "fetchCache more than 1, will clear.", fdv.F_DATA_PROCESS, this.fetchCache.keySet());
            this.fetchCache.clear();
        }
        SoftReference<FetchDataResultListener> softReference = this.mListener;
        if (softReference == null || softReference.get() == null) {
            this.fetchCacheString.put(str, str2);
            this.mtopStartTimeCahce.put(str, Long.valueOf(j));
            return;
        }
        this.mListener.get().onReceiveFetchDataString(str, str2, j);
    }

    private void reportFail(String str, String str2, String str3, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d361eba", new Object[]{this, str, str2, str3, objArr});
        } else {
            yqp.k(str, str2, str3, objArr);
        }
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            this.fetchCache.clear();
        }
    }

    public void processDataPrefetchInNavAsync(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43c6f75f", new Object[]{this, str});
        } else {
            Coordinator.execute(new AnonymousClass1("shopRender-data-prefetch-in-nav", str, System.currentTimeMillis()), 20);
        }
    }

    public void removeFetchDataListener(FetchDataResultListener fetchDataResultListener) {
        SoftReference<FetchDataResultListener> softReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da93c1e", new Object[]{this, fetchDataResultListener});
        } else if (fetchDataResultListener != null && (softReference = this.mListener) != null && fetchDataResultListener == softReference.get()) {
            this.mListener.clear();
        }
    }

    public void setFetchDataListener(String str, FetchDataResultListener fetchDataResultListener) {
        long j;
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("825a698a", new Object[]{this, str, fetchDataResultListener});
        } else if (fetchDataResultListener != null) {
            if (!TextUtils.isEmpty(str) && this.fetchCache.get(str) != null) {
                JSONObject remove = this.fetchCache.remove(str);
                if (this.mtopStartTimeCahce.get(str) != null) {
                    j2 = this.mtopStartTimeCahce.get(str).longValue();
                } else {
                    j2 = System.currentTimeMillis();
                }
                fetchDataResultListener.onReceiveFetchData(str, remove, j2);
            } else if (TextUtils.isEmpty(str) || this.fetchCacheString.get(str) == null) {
                this.mListener = new SoftReference<>(fetchDataResultListener);
            } else {
                String remove2 = this.fetchCacheString.remove(str);
                if (this.mtopStartTimeCahce.get(str) != null) {
                    j = this.mtopStartTimeCahce.get(str).longValue();
                } else {
                    j = System.currentTimeMillis();
                }
                fetchDataResultListener.onReceiveFetchDataString(str, remove2, j);
            }
        }
    }

    private void reportFail(String str, String str2, String str3, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e980d33", new Object[]{this, str, str2, str3, th, objArr});
        } else {
            yqp.j(str, str2, str3, th, objArr);
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.weex.module.NavPrefetchShopFetchManager$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class AnonymousClass1 extends Coordinator.TaggedRunnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ long val$mtopStartTime;
        public final /* synthetic */ String val$url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, long j) {
            super(str);
            this.val$url = str2;
            this.val$mtopStartTime = j;
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/module/NavPrefetchShopFetchManager$1");
        }

        @Override // java.lang.Runnable
        public void run() {
            MtopRequest mtopRequest;
            String str;
            int indexOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                final Uri parse = Uri.parse(this.val$url);
                if (parse.isHierarchical()) {
                    if ("h5.m.taobao.com".equals(parse.getHost()) && "/weex/viewpage.htm".equals(parse.getPath()) && !TextUtils.isEmpty(parse.getQueryParameter(m7r.WEEX_REFERER_ORIGIN))) {
                        parse = Uri.parse(parse.getQueryParameter(m7r.WEEX_REFERER_ORIGIN));
                    }
                    final String queryParameter = parse.getQueryParameter("shopId");
                    if (TextUtils.isEmpty(queryParameter) && (str = this.val$url) != null && str.contains("shopId") && (indexOf = this.val$url.indexOf("shopId=")) > 0) {
                        int indexOf2 = this.val$url.indexOf("&", indexOf);
                        if (indexOf2 == -1) {
                            indexOf2 = this.val$url.length();
                        }
                        int i = indexOf + 7;
                        if (i < indexOf2) {
                            queryParameter = this.val$url.substring(i, indexOf2);
                        }
                    }
                    if (TextUtils.isEmpty(queryParameter) || !"true".equals(OrangeConfig.getInstance().getConfig("shop_render", "use_static_default_mtop_prefetch", "true")) || !parse.getHost().contains("market.") || !parse.getHost().contains(".taobao.com") || !"/apps/market/shop/weex.html".equals(parse.getPath())) {
                        mtopRequest = null;
                    } else {
                        mtopRequest = new MtopRequest();
                        mtopRequest.setApiName(ShopPointExtension.SHOP_FETCH_API);
                        mtopRequest.setVersion("2.0");
                        mtopRequest.setNeedEcode(false);
                        HashMap hashMap = new HashMap();
                        hashMap.put("shopId", parse.getQueryParameter("shopId"));
                        hashMap.put("sellerId", parse.getQueryParameter("sellerId"));
                        hashMap.put("shopNavi", parse.getQueryParameter(ShopRenderActivity.SHOP_NAVI));
                        hashMap.put(TBImageFlowMonitor.ERROR_ORIGIN_URL, parse.getQueryParameter("shop_origin"));
                        mtopRequest.dataParams = hashMap;
                        mtopRequest.setData(ReflectUtil.converMapToDataStr(hashMap));
                    }
                    if (mtopRequest == null) {
                        new StringBuilder("main-cost no prefetch string by PrefetchX. ").append(queryParameter);
                        if (parse.isHierarchical() && ("detail.m.tmall.com".equals(parse.getHost()) || "/app/tb-source-app/shopindex/pages/index".equals(parse.getPath()) || "/app/tb-source-app/wz111/pages/error".equals(parse.getPath()) || "ts.tmall.com".equals(parse.getHost()) || "tmyp.tmall.com".equals(parse.getHost()) || "/app/trip/fliggy-shop/pages/index".equals(parse.getPath()) || this.val$url.contains("pages.tmall.com/wow/"))) {
                            StringBuilder sb = new StringBuilder("empty prefetch string. ");
                            sb.append(queryParameter);
                            sb.append(" ");
                            sb.append(this.val$url);
                        } else if (new Random().nextInt(100) > 94) {
                            String str2 = this.val$url;
                            AppMonitor.Alarm.commitFail("Shop", "Page_ShopRender_Error", str2, "-61006", "empty prefetch string." + queryParameter);
                            NavPrefetchShopFetchManager.access$000(NavPrefetchShopFetchManager.this, "-61006", "empty prefetch string.", fdv.F_DATA_PROCESS, new Object[]{queryParameter});
                        }
                    } else {
                        MtopBusiness build = MtopBusiness.build(mtopRequest);
                        build.protocol(ProtocolEnum.HTTPSECURE).useCache().reqMethod(MethodEnum.GET).registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.weex.module.NavPrefetchShopFetchManager.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.tao.remotebusiness.IRemoteListener
                            public void onSuccess(int i2, final MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i2), mtopResponse, baseOutDo, obj});
                                } else {
                                    Coordinator.execute(new Coordinator.TaggedRunnable("shopRender-data-prefetch-in-nav-complete") { // from class: com.taobao.weex.module.NavPrefetchShopFetchManager.1.1.1
                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                        public static /* synthetic */ Object ipc$super(C08031 r2, String str3, Object... objArr) {
                                            str3.hashCode();
                                            int hashCode = str3.hashCode();
                                            throw new InstantReloadException("String switch could not find '" + str3 + "' with hashcode " + hashCode + " in com/taobao/weex/module/NavPrefetchShopFetchManager$1$1$1");
                                        }

                                        @Override // java.lang.Runnable
                                        public void run() {
                                            IpChange ipChange3 = $ipChange;
                                            if (ipChange3 instanceof IpChange) {
                                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                                return;
                                            }
                                            long currentTimeMillis = System.currentTimeMillis();
                                            try {
                                                if (mtopResponse.getBytedata() == null || mtopResponse.getBytedata().length <= 0) {
                                                    AppMonitor.Alarm.commitFail("Shop", "Page_ShopRender_Error", parse.getQuery(), "-61003", "empty response in nav prefetch process." + queryParameter);
                                                    NavPrefetchShopFetchManager.access$000(NavPrefetchShopFetchManager.this, "-61003", "empty response in nav prefetch process.", fdv.F_DATA_PROCESS, new Object[]{queryParameter + "|" + AnonymousClass1.this.val$url});
                                                    return;
                                                }
                                                String str3 = new String(mtopResponse.getBytedata());
                                                if (parse.getBooleanQueryParameter("_use_string_mtop_result", false)) {
                                                    NavPrefetchShopFetchManager instance = NavPrefetchShopFetchManager.getInstance();
                                                    C08021 r8 = C08021.this;
                                                    NavPrefetchShopFetchManager.access$100(instance, queryParameter, str3, AnonymousClass1.this.val$mtopStartTime);
                                                } else {
                                                    JSONObject parseObject = JSON.parseObject(str3);
                                                    Map<String, List<String>> headerFields = mtopResponse.getHeaderFields();
                                                    if (!(headerFields == null || headerFields.get("eagleeye-traceid") == null)) {
                                                        parseObject.put("eagleeye-traceid", (Object) headerFields.get("eagleeye-traceid"));
                                                    }
                                                    NavPrefetchShopFetchManager instance2 = NavPrefetchShopFetchManager.getInstance();
                                                    C08021 r82 = C08021.this;
                                                    NavPrefetchShopFetchManager.access$200(instance2, queryParameter, parseObject, AnonymousClass1.this.val$mtopStartTime);
                                                }
                                                long currentTimeMillis2 = System.currentTimeMillis();
                                                if (WXEnvironment.isApkDebugable()) {
                                                    StringBuilder sb2 = new StringBuilder("main-cost navFetchData get value, shopId=");
                                                    sb2.append(queryParameter);
                                                    sb2.append(" totalCost ");
                                                    sb2.append(currentTimeMillis2 - AnonymousClass1.this.val$mtopStartTime);
                                                    sb2.append(" ms. receiver cost ");
                                                    sb2.append(currentTimeMillis2 - currentTimeMillis);
                                                    sb2.append(" ms.  at ");
                                                    sb2.append(Thread.currentThread().getName());
                                                }
                                            } catch (Throwable th) {
                                                WXLogUtils.e("error in processDataPrefetchInNavAsync navFetchData", th);
                                                AppMonitor.Alarm.commitFail("Shop", "Page_ShopRender_Error", th.getMessage() + "|" + AnonymousClass1.this.val$url, "-61002", "error in nav prefetch process." + queryParameter);
                                                NavPrefetchShopFetchManager.access$300(NavPrefetchShopFetchManager.this, "-61002", "error in nav prefetch process.", fdv.F_DATA_PROCESS, th, new Object[]{queryParameter + "|" + th.getMessage() + "|" + AnonymousClass1.this.val$url});
                                            }
                                        }
                                    }, 20);
                                }
                            }

                            @Override // com.taobao.tao.remotebusiness.IRemoteListener
                            public void onError(int i2, MtopResponse mtopResponse, Object obj) {
                                String str3;
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i2), mtopResponse, obj});
                                    return;
                                }
                                if (mtopResponse.getBytedata() == null) {
                                    str3 = "{}";
                                } else {
                                    str3 = new String(mtopResponse.getBytedata());
                                }
                                WXLogUtils.e("shopRender-data-prefetch-in-nav onError.".concat(str3));
                                if (str3.contains("店铺已被冻结") || str3.contains("店铺已被释放")) {
                                    Log.e(NavPrefetchShopFetchManager.TAG, "Common error. in NavPrefetchShopFetchManager mtop callback onError. ".concat(str3));
                                    return;
                                }
                                AppMonitor.Alarm.commitFail("Shop", "Page_ShopRender_Error", str3 + "|" + AnonymousClass1.this.val$url, "-61004", "error in nav prefetch onError." + parse.getQuery());
                                NavPrefetchShopFetchManager.access$000(NavPrefetchShopFetchManager.this, "-61004", "error in nav prefetch onError.", fdv.F_DATA_PROCESS, new Object[]{str3 + "|" + AnonymousClass1.this.val$url});
                            }

                            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                            public void onSystemError(int i2, MtopResponse mtopResponse, Object obj) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i2), mtopResponse, obj});
                                    return;
                                }
                                WXLogUtils.e("shopRender-data-prefetch-in-nav onSystemError.");
                                if (mtopResponse == null || (!ErrorConstant.ERRCODE_NO_NETWORK.equals(mtopResponse.getRetCode()) && !"ANDROID_SYS_NETWORK_ERROR".equals(mtopResponse.getRetCode()))) {
                                    AppMonitor.Alarm.commitFail("Shop", "Page_ShopRender_Error", JSON.toJSONString(mtopResponse) + "|" + AnonymousClass1.this.val$url, "-61005", "error in nav prefetch onSystemError." + parse.getQuery());
                                    NavPrefetchShopFetchManager.access$000(NavPrefetchShopFetchManager.this, "-61005", "error in nav prefetch onSystemError.", fdv.F_DATA_PROCESS, new Object[]{JSON.toJSONString(mtopResponse) + "|" + AnonymousClass1.this.val$url});
                                    return;
                                }
                                Log.e(NavPrefetchShopFetchManager.TAG, mtopResponse.getRetCode() + " in NavPrefetchShopFetchManager mtop callback onSystemError");
                            }
                        });
                        build.startRequest();
                        if (WXEnvironment.isApkDebugable()) {
                            new StringBuilder("main-cost navFetchData fired in nav. ").append(Thread.currentThread().getName());
                        }
                    }
                }
            } catch (Throwable th) {
                WXLogUtils.e("error in sending processDataPrefetchInNavAsync navFetchData.", th);
                NavPrefetchShopFetchManager.access$300(NavPrefetchShopFetchManager.this, "-61010", "error in sending processDataPrefetchInNavAsync navFetchData.", fdv.F_DATA_PROCESS, th, new Object[]{this.val$url});
            }
        }
    }
}
