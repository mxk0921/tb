package tb;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.Log;
import anet.channel.util.HttpConstant;
import anetwork.channel.NetworkCallBack;
import anetwork.channel.NetworkEvent;
import anetwork.channel.Request;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import anetwork.channel.util.RequestConstant;
import com.alibaba.aliweex.adapter.module.net.IWXConnection;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.ResultCode;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.android.task.Coordinator;
import com.taobao.application.common.IApmEventListener;
import com.taobao.orange.OrangeConfig;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.adapter.IWXHttpAdapter;
import com.taobao.weex.common.WXErrorCode;
import com.taobao.weex.common.WXResponse;
import com.taobao.weex.utils.WXExceptionUtils;
import com.taobao.weex.utils.WXLogUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import mtopsdk.common.util.HttpHeaderConstant;
import tb.fdb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class e4x {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static e4x m;

    /* renamed from: a  reason: collision with root package name */
    public long f18281a;
    public np b;
    public final ReentrantLock e;
    public final ReentrantLock f;
    public final IApmEventListener l;
    public Long g = 0L;
    public String h = "";
    public String i = "";
    public Boolean j = Boolean.FALSE;
    public final ConcurrentHashMap<String, Long> c = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, SoftReference<String>> d = new ConcurrentHashMap<>();
    public final List<String> k = new CopyOnWriteArrayList();

    static {
        t2o.a(764412012);
    }

    public e4x() {
        this.f18281a = xg4.DEFAULT_SMALL_MAX_AGE;
        this.e = null;
        this.f = null;
        a aVar = new a();
        if (w() > 0) {
            this.f18281a = w();
        }
        this.e = new ReentrantLock();
        this.f = new ReentrantLock();
        c21.c(aVar);
    }

    public static long D(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d05bd5fd", new Object[]{map})).longValue();
        }
        if (map != null && !map.isEmpty()) {
            List<String> s = s(map, HttpConstant.CACHE_CONTROL);
            if (s.isEmpty()) {
                return xg4.DEFAULT_SMALL_MAX_AGE;
            }
            for (String str : s) {
                long A = A(str);
                if (A != -1) {
                    return A * 1000;
                }
            }
        }
        return xg4.DEFAULT_SMALL_MAX_AGE;
    }

    public static /* synthetic */ ReentrantLock a(e4x e4xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ReentrantLock) ipChange.ipc$dispatch("5a63ce0d", new Object[]{e4xVar});
        }
        return e4xVar.e;
    }

    public static /* synthetic */ np b(e4x e4xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (np) ipChange.ipc$dispatch("9f951501", new Object[]{e4xVar});
        }
        return e4xVar.p();
    }

    public static /* synthetic */ Request c(e4x e4xVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Request) ipChange.ipc$dispatch("3615f82a", new Object[]{e4xVar, str});
        }
        return e4xVar.l(str);
    }

    public static /* synthetic */ ReentrantLock d(e4x e4xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ReentrantLock) ipChange.ipc$dispatch("aaf04e8f", new Object[]{e4xVar});
        }
        return e4xVar.f;
    }

    public static /* synthetic */ void e(e4x e4xVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("665e1e26", new Object[]{e4xVar, str});
        } else {
            e4xVar.F(str);
        }
    }

    public static /* synthetic */ void f(e4x e4xVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("453258f", new Object[]{e4xVar, str, str2});
        } else {
            e4xVar.B(str, str2);
        }
    }

    public static /* synthetic */ List g(e4x e4xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9b3fba6d", new Object[]{e4xVar});
        }
        return e4xVar.k;
    }

    public static /* synthetic */ long h(e4x e4xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("498f0f2d", new Object[]{e4xVar})).longValue();
        }
        return e4xVar.w();
    }

    public static /* synthetic */ long i(e4x e4xVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2c1d06e2", new Object[]{e4xVar, new Long(j)})).longValue();
        }
        e4xVar.f18281a = j;
        return j;
    }

    public static /* synthetic */ long j(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("80c8ec1a", new Object[]{map})).longValue();
        }
        return D(map);
    }

    public static /* synthetic */ String k(e4x e4xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("69c9384a", new Object[]{e4xVar});
        }
        return e4xVar.x();
    }

    public static String r(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1086f4ad", new Object[]{str, str2});
        }
        npb b2 = kr0.e().b();
        return b2 != null ? b2.getConfig("wx_network_ctl_android", str, str2) : str2;
    }

    public static List<String> s(Map<String, List<String>> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("677c03f0", new Object[]{map, str});
        }
        if (map == null || map.isEmpty() || TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (str.equalsIgnoreCase(entry.getKey()) && entry.getValue() != null && !entry.getValue().isEmpty()) {
                arrayList.addAll(entry.getValue());
            }
        }
        return arrayList;
    }

    public static e4x t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e4x) ipChange.ipc$dispatch("2a6cec58", new Object[0]);
        }
        if (m == null) {
            synchronized (e4x.class) {
                try {
                    if (m == null) {
                        m = new e4x();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    public final void B(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e742280e", new Object[]{this, str, str2});
            return;
        }
        String G = G(str);
        if (J()) {
            this.d.put(G, new SoftReference<>(str2));
        }
        Coordinator.execute(new c(G, str2, str), 20);
    }

    public final void E(String str, IWXHttpAdapter.OnHttpListener onHttpListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3241dfb3", new Object[]{this, str, onHttpListener});
            return;
        }
        WXResponse wXResponse = new WXResponse();
        if (wXResponse.extendParams == null) {
            wXResponse.extendParams = new HashMap();
        }
        Coordinator.postTask(new e("WeexCacheHelper", str, wXResponse, onHttpListener));
    }

    public final void F(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcb4d6f4", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            Long valueOf = Long.valueOf(System.currentTimeMillis());
            if (J()) {
                this.c.put(str, valueOf);
            }
            Coordinator.execute(new b(str, valueOf), 20);
        }
    }

    public final boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c37e24a1", new Object[]{this})).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("shop_render", "useCacheMaxAge", "true"));
    }

    public final boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c16dfd2d", new Object[]{this})).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("shop_render", "jsBundleCacheEnable", "true"));
    }

    public final boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33c66a85", new Object[]{this})).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("shop_render", "userJSBundleMemoryCache", "true"));
    }

    public final IWXHttpAdapter.OnHttpListener m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWXHttpAdapter.OnHttpListener) ipChange.ipc$dispatch("a935134b", new Object[]{this, str});
        }
        return new d(str);
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        ConcurrentHashMap<String, Long> concurrentHashMap = this.c;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        }
        ConcurrentHashMap<String, SoftReference<String>> concurrentHashMap2 = this.d;
        if (concurrentHashMap2 != null) {
            concurrentHashMap2.clear();
        }
        List<String> list = this.k;
        if (list != null) {
            ((CopyOnWriteArrayList) list).clear();
        }
        p().Z(e4x.class.getClassLoader()).w().v0();
    }

    public final np p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (np) ipChange.ipc$dispatch("552fc3ec", new Object[]{this});
        }
        if (this.b == null) {
            this.b = AVFSCacheManager.getInstance().cacheForModule("taobao_shop");
        }
        return this.b;
    }

    public final String x() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e55a8c7", new Object[]{this});
        }
        IWXConnection a2 = auw.a(WXEnvironment.getApplication());
        if (a2 == null) {
            str = "unknown";
        } else {
            str = a2.getNetworkType();
        }
        return ("wifi".equals(str) || "4g".equals(str) || "3g".equals(str) || "2g".equals(str)) ? str : "other";
    }

    public final boolean y(String str) {
        Long u;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b5471fc", new Object[]{this, str})).booleanValue();
        }
        if (H() && (u = u(str)) != null && System.currentTimeMillis() - u.longValue() < this.f18281a) {
            return true;
        }
        return false;
    }

    public int z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("36e260c2", new Object[]{this, str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return -2;
        }
        if (this.d.containsKey(str) && this.d.get(str) != null && this.d.get(str).get() != null) {
            return -1;
        }
        String str2 = "";
        if (TextUtils.isEmpty(str2)) {
            str2 = (String) p().Z(e4x.class.getClassLoader()).w().O(str, String.class);
        }
        if (TextUtils.isEmpty(str2)) {
            return 0;
        }
        this.d.put(str, new SoftReference<>(str2));
        return str2.length();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements IApmEventListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.application.common.IApmEventListener
        public void onEvent(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
            } else if (1 == i) {
                try {
                    e4x.this.n();
                } catch (Throwable th) {
                    opp.b("-73301", "error in release memory of WeexCacheHelper.", th, "IApmEventListener " + i);
                    yqp.j("-73301", "error in release memory of WeexCacheHelper.", fdv.F_TEMPLATE_DOWNLOAD_TAG, th, "IApmEventListener " + i);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f18284a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public c(String str, String str2, String str3) {
            this.f18284a = str;
            this.b = str2;
            this.c = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (e4x.d(e4x.this) == null) {
                Log.e("WeexCacheHelper", "saveJSBundleLock不存在");
            } else {
                e4x.d(e4x.this).lock();
                try {
                    try {
                        e4x.b(e4x.t()).Z(e4x.class.getClassLoader()).w().m0(this.f18284a, this.b, new a());
                    } catch (Exception e) {
                        opp.b("-73305", "error in WeexCacheHelper.putCachedJSBundleToFile JS写存储异常.", e, this.c);
                        yqp.j("-73305", "error in WeexCacheHelper.putCachedJSBundleToFile JS写存储异常.", fdv.F_TEMPLATE_DOWNLOAD_TAG, e, this.c);
                    }
                } finally {
                    e4x.d(e4x.this).unlock();
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements fdb.i {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // tb.fdb.i
            public void onObjectSetCallback(String str, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1c2b525a", new Object[]{this, str, new Boolean(z)});
                } else if (z) {
                    opp.e("存储完毕。是否成功：", z + ",key == ", str);
                    e4x.e(e4x.t(), str);
                } else {
                    opp.c("-73306", "error in WeexCacheHelper.putCachedJSBundleToFile JS写存储失败.", c.this.c, str);
                    yqp.k("-73306", "error in WeexCacheHelper.putCachedJSBundleToFile JS写存储失败.", fdv.F_TEMPLATE_DOWNLOAD_TAG, c.this.c, str);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e extends Coordinator.TaggedRunnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f18287a;
        public final /* synthetic */ WXResponse b;
        public final /* synthetic */ IWXHttpAdapter.OnHttpListener c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2, WXResponse wXResponse, IWXHttpAdapter.OnHttpListener onHttpListener) {
            super(str);
            this.f18287a = str2;
            this.b = wXResponse;
            this.c = onHttpListener;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/shop/utils/WeexCacheHelper$5");
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            opp.e("into--[sendRequestByHttp] url:", this.f18287a);
            this.b.statusCode = WXErrorCode.WX_DEGRAD_ERR_NETWORK_BUNDLE_DOWNLOAD_FAILED.getErrorCode();
            this.b.extendParams.put("cacheType", "none");
            String k = e4x.k(e4x.this);
            this.b.extendParams.put("wxRequestType", k);
            this.b.extendParams.put("requestType", k);
            new DegradableNetwork(kr0.e().a()).asyncSend(e4x.c(e4x.this, this.f18287a), null, null, new f(e4x.this, this.b, this.c, System.currentTimeMillis()));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class f implements NetworkCallBack.FinishListener, NetworkCallBack.ProgressListener, NetworkCallBack.ResponseCodeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WXResponse f18288a;
        public final IWXHttpAdapter.OnHttpListener b;
        public ByteArrayOutputStream c = new ByteArrayOutputStream();
        public final long d;

        static {
            t2o.a(764412019);
            t2o.a(607125966);
            t2o.a(607125968);
            t2o.a(607125969);
        }

        public f(e4x e4xVar, WXResponse wXResponse, IWXHttpAdapter.OnHttpListener onHttpListener, long j) {
            this.f18288a = wXResponse;
            this.b = onHttpListener;
            this.d = j;
        }

        @Override // anetwork.channel.NetworkCallBack.ProgressListener
        public void onDataReceived(NetworkEvent.ProgressEvent progressEvent, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e27ec0e9", new Object[]{this, progressEvent, obj});
            } else if (progressEvent != null) {
                this.c.write(progressEvent.getBytedata(), 0, progressEvent.getSize());
                this.b.onHttpResponseProgress(this.c.size());
            }
        }

        @Override // anetwork.channel.NetworkCallBack.FinishListener
        public void onFinished(NetworkEvent.FinishEvent finishEvent, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a00910e8", new Object[]{this, finishEvent, obj});
            } else {
                a(finishEvent);
            }
        }

        @Override // anetwork.channel.NetworkCallBack.ResponseCodeListener
        public boolean onResponseCode(int i, Map<String, List<String>> map, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("45b007d6", new Object[]{this, new Integer(i), map, obj})).booleanValue();
            }
            if (map == null) {
                map = new HashMap<>();
            }
            this.b.onHeadersReceived(i, map);
            return true;
        }

        public final void a(NetworkEvent.FinishEvent finishEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5dee5e3", new Object[]{this, finishEvent});
                return;
            }
            if (TextUtils.equals(WXErrorCode.WX_DEGRAD_ERR_BUNDLE_CONTENTTYPE_ERROR.getErrorCode(), this.f18288a.statusCode)) {
                opp.e("-----NetworkListener------onHttpFinish : 网络错误");
            } else {
                this.f18288a.statusCode = String.valueOf(finishEvent.getHttpCode());
                byte[] byteArray = this.c.toByteArray();
                if (finishEvent.getHttpCode() == 200) {
                    this.f18288a.originalData = byteArray;
                    this.f18288a.extendParams.put("actualNetworkTime", Long.valueOf(System.currentTimeMillis() - this.d));
                } else if (finishEvent.getHttpCode() == 404) {
                    this.f18288a.errorCode = String.valueOf(finishEvent.getHttpCode());
                    this.f18288a.errorMsg = "404 NOT FOUND!";
                } else {
                    this.f18288a.errorCode = String.valueOf(finishEvent.getHttpCode());
                    WXResponse wXResponse = this.f18288a;
                    wXResponse.errorMsg = "networkMsg==" + finishEvent.getDesc() + "|networkErrorCode==" + finishEvent.getHttpCode() + "|mWXResponse==" + JSON.toJSONString(this.f18288a);
                }
            }
            this.b.onHttpFinish(this.f18288a);
            ByteArrayOutputStream byteArrayOutputStream = this.c;
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                    this.c = null;
                } catch (IOException e) {
                    WXLogUtils.e("WeexCacheHelper", WXLogUtils.getStackTrace(e));
                }
            }
        }
    }

    public final Request l(String str) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Request) ipChange.ipc$dispatch("ad41bfb6", new Object[]{this, str});
        }
        RequestImpl requestImpl = new RequestImpl(str);
        String a2 = nuw.a(WXEnvironment.getApplication(), WXEnvironment.getConfig());
        try {
            i = Integer.valueOf(r("wx_network_timeout_ms", "10000")).intValue();
        } catch (Throwable unused) {
            i = 10000;
        }
        requestImpl.setBizId(4102);
        requestImpl.addHeader("user-agent", a2);
        requestImpl.addHeader("f-refer", "weex");
        requestImpl.addHeader(HeaderConstant.HEADER_KEY_ACCEPT_LANGUAGE, v());
        requestImpl.setMethod("GET");
        requestImpl.setCharset("UTF-8");
        requestImpl.setRetryTime(2);
        requestImpl.setConnectTimeout(i);
        try {
            if (Boolean.valueOf(r("wx_network_ctl_android", "true")).booleanValue()) {
                requestImpl.setExtProperty(RequestConstant.CHECK_CONTENT_LENGTH, "true");
            }
        } catch (Exception e2) {
            WXLogUtils.e(WXLogUtils.getStackTrace(e2));
            WXExceptionUtils.commitCriticalExceptionRT(null, WXErrorCode.WX_DEGRAD_ERR_NETWORK_CHECK_CONTENT_LENGTH_FAILED, "assembleRequest", WXLogUtils.getStackTrace(e2), null);
        }
        return requestImpl;
    }

    public final String v() {
        Locale locale;
        LocaleList localeList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f55639da", new Object[]{this});
        }
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                localeList = LocaleList.getDefault();
                locale = localeList.get(0);
            } else {
                locale = Locale.getDefault();
            }
            String str = locale.getLanguage() + "-" + locale.getCountry();
            if ("zh".equals(locale.getLanguage())) {
                return str + ",zh;q=0.8,en-US;q=0.5,en;q=0.3";
            }
            return str + "," + locale.getLanguage() + ";q=0.8,en-US;q=0.5,en;q=0.3";
        } catch (Throwable unused) {
            return "zh-CN,zh;q=0.8,en-US;q=0.5,en;q=0.3";
        }
    }

    public final long w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fa373144", new Object[]{this})).longValue();
        }
        return Long.parseLong(OrangeConfig.getInstance().getConfig("shop_render", "cacheMaxAge", String.valueOf(0))) * 1000;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f18283a;
        public final /* synthetic */ Long b;

        public b(String str, Long l) {
            this.f18283a = str;
            this.b = l;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (e4x.a(e4x.this) == null) {
                Log.e("WeexCacheHelper", "updateTimeLock不存在");
            } else {
                try {
                    try {
                        e4x.a(e4x.this).lock();
                        e4x.b(e4x.t()).Z(e4x.class.getClassLoader()).C().N(this.f18283a, String.valueOf(this.b));
                        opp.e("更新js bundle时间成功：,url == ", this.f18283a);
                    } catch (Exception e) {
                        opp.b("-73303", "error in WeexCacheHelper.setJSBundleUpdateTime 更新js bundle时间失败.", e, this.f18283a, this.b);
                        yqp.j("-73303", "error in WeexCacheHelper.setJSBundleUpdateTime 更新js bundle时间失败.", fdv.F_TEMPLATE_DOWNLOAD_TAG, e, this.f18283a, this.b);
                    }
                } finally {
                    e4x.a(e4x.this).unlock();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements IWXHttpAdapter.OnHttpListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f18286a;

        public d(String str) {
            this.f18286a = str;
        }

        @Override // com.taobao.weex.adapter.IWXHttpAdapter.OnHttpListener
        public void onHeadersReceived(int i, Map<String, List<String>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6683fc51", new Object[]{this, new Integer(i), map});
            } else if (e4x.h(e4x.this) <= 0) {
                e4x.i(e4x.this, e4x.j(map));
            } else {
                e4x e4xVar = e4x.this;
                e4x.i(e4xVar, e4x.h(e4xVar));
            }
        }

        @Override // com.taobao.weex.adapter.IWXHttpAdapter.OnHttpListener
        public void onHttpResponseProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c1a5c7", new Object[]{this, new Integer(i)});
            }
        }

        @Override // com.taobao.weex.adapter.IWXHttpAdapter.OnHttpListener
        public void onHttpStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5005ca2", new Object[]{this});
            }
        }

        @Override // com.taobao.weex.adapter.IWXHttpAdapter.OnHttpListener
        public void onHttpUploadProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("39b2fe47", new Object[]{this, new Integer(i)});
            }
        }

        @Override // com.taobao.weex.adapter.IWXHttpAdapter.OnHttpListener
        public void onHttpFinish(WXResponse wXResponse) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9df793b5", new Object[]{this, wXResponse});
            } else if (wXResponse == null) {
                opp.e("----OnHttpListener-----wxResponse == null. 异步更新时发生网络错误");
            } else {
                if ("200".equals(wXResponse.statusCode)) {
                    if (!TextUtils.isEmpty(wXResponse.data)) {
                        str = wXResponse.data;
                    } else {
                        byte[] bArr = wXResponse.originalData;
                        if (bArr != null) {
                            str = new String(bArr);
                        } else {
                            str = "";
                        }
                    }
                    e4x.f(e4x.this, this.f18286a, str);
                } else {
                    opp.e("异步更新时发生网络错误");
                }
                if (e4x.g(e4x.this) != null && e4x.g(e4x.this).contains(this.f18286a)) {
                    e4x.g(e4x.this).remove(this.f18286a);
                    opp.e("完成，", wXResponse.statusCode, "移除正在请求中的url ", this.f18286a);
                }
            }
        }
    }

    public static long A(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f0661856", new Object[]{str})).longValue();
        }
        for (String str2 : str.split(",")) {
            String trim = str2.trim();
            if (HttpHeaderConstant.NO_CACHE.equals(trim) || "no-store".equals(trim)) {
                break;
            }
            if (trim.startsWith("max-age=")) {
                try {
                    return Long.parseLong(trim.substring(8));
                } catch (Exception unused) {
                    continue;
                }
            }
        }
        return -1L;
    }

    public Map<String, Object> C(Context context, String str) {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ea6a571a", new Object[]{this, context, str});
        }
        String G = G(str);
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("lastGetWay", this.i);
            hashMap.put("lastDoUpdate", this.j);
            hashMap.put("lastCost", this.g);
            hashMap.put("lastUrl", this.h);
            if (this.d.get(G) != null) {
                bool = Boolean.valueOf(this.d.get(G).get() != null);
            } else {
                bool = "not exist";
            }
            hashMap.put("memory", bool);
            hashMap.put("file", Boolean.valueOf(p().Z(e4x.class.getClassLoader()).w().V(G)));
            hashMap.put("dirExits", Boolean.valueOf(p().Z(e4x.class.getClassLoader()).g().exists()));
            hashMap.put("fileLength", Long.valueOf(p().Z(e4x.class.getClassLoader()).w().U(G)));
            hashMap.put("memorySoftRef", Boolean.valueOf(this.d.containsKey(G)));
            hashMap.put("isJSBundleValid", Boolean.valueOf(y(G)));
            hashMap.put("mMaxAgeMillis", Long.valueOf(this.f18281a));
            hashMap.put("memoryKeys", this.d.keySet());
            File file = new File(p().Z(e4x.class.getClassLoader()).g().getPath() + "/files");
            if (file.exists() && file.listFiles().length > 0) {
                hashMap.put(v4s.PARAM_UPLOAD_FILE_COUNT, Integer.valueOf(file.listFiles()[0].listFiles().length));
            } else if (file.exists()) {
                hashMap.put(v4s.PARAM_UPLOAD_FILE_COUNT, "-999");
            } else {
                hashMap.put(v4s.PARAM_UPLOAD_FILE_COUNT, "not exist");
            }
        } catch (Throwable th) {
            opp.b("-73307", "error in WeexCacheHelper.reportStatus.", th, str);
            yqp.j("-73307", "error in WeexCacheHelper.reportStatus.", fdv.F_TEMPLATE_DOWNLOAD_TAG, th, str);
        }
        return hashMap;
    }

    public final String G(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fae6aef", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return "emptyUrl";
        }
        try {
            String uri = Uri.parse(str).buildUpon().clearQuery().build().toString();
            int indexOf = uri.indexOf("#");
            return (indexOf <= -1 || indexOf >= str.length()) ? uri : uri.substring(0, indexOf);
        } catch (Exception e2) {
            opp.b("-73308", "error in WeexCacheHelper.transformUrlIntoStandard.", e2, str);
            yqp.j("-73308", "error in WeexCacheHelper.transformUrlIntoStandard.", fdv.F_TEMPLATE_DOWNLOAD_TAG, e2, str);
            return "exceptionUrl";
        }
    }

    public final Long u(String str) {
        ConcurrentHashMap<String, Long> concurrentHashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("9ff4c62d", new Object[]{this, str});
        }
        if (J() && (concurrentHashMap = this.c) != null && concurrentHashMap.containsKey(str) && this.c.get(str) != null) {
            return this.c.get(str);
        }
        fdb C = p().Z(e4x.class.getClassLoader()).C();
        if (C != null && C.V(str)) {
            try {
                Long valueOf = Long.valueOf(Long.parseLong((String) C.O(str, String.class)));
                this.c.put(str, valueOf);
                return valueOf;
            } catch (Throwable th) {
                opp.b("-73304", "error in WeexCacheHelper.getJSBundleUpdateTime 更新时间到内存错误.", th, str);
                yqp.j("-73304", "error in WeexCacheHelper.getJSBundleUpdateTime 更新时间到内存错误.", fdv.F_TEMPLATE_DOWNLOAD_TAG, th, str);
            }
        }
        return null;
    }

    public final void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f540410e", new Object[]{this, str});
        } else if (((CopyOnWriteArrayList) this.k).contains(str)) {
            opp.e("目标url已经在请求中 ", str, " 忽略本次请求");
        } else {
            ((CopyOnWriteArrayList) this.k).add(str);
            E(str, m(str));
        }
    }

    public String q(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        ConcurrentHashMap<String, SoftReference<String>> concurrentHashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35456d66", new Object[]{this, str});
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.g = -1L;
        this.h = "blankUrl";
        this.i = "unkown";
        this.j = null;
        String G = G(str);
        if (!I()) {
            return null;
        }
        boolean y = y(G);
        boolean z = !y;
        if (J() && (concurrentHashMap = this.d) != null && concurrentHashMap.containsKey(G) && this.d.get(G) != null && !TextUtils.isEmpty(this.d.get(G).get())) {
            if (!y) {
                o(str);
            }
            this.g = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
            this.h = G;
            this.i = "内存";
            this.j = Boolean.valueOf(z);
            if (this.d.get(G) != null) {
                return this.d.get(G).get();
            }
        }
        if (!p().Z(e4x.class.getClassLoader()).w().V(G)) {
            str2 = "";
            z = true;
        } else {
            str2 = (String) p().Z(e4x.class.getClassLoader()).w().O(G, String.class);
            if (!TextUtils.isEmpty(str2)) {
                this.d.put(G, new SoftReference<>(str2));
            }
        }
        if (z) {
            o(str);
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        if (!TextUtils.isEmpty(str2)) {
            str3 = ResultCode.MSG_SUCCESS;
        } else {
            str3 = "不存在";
        }
        if (z) {
            str4 = "开启远程更新";
        } else {
            str4 = "不更新";
        }
        long j = currentTimeMillis2 - currentTimeMillis;
        Long valueOf = Long.valueOf(j);
        if (str.length() > 65) {
            str = str.substring(5, 60);
        }
        opp.o("main-cost WeexCacheHelper 从统一存储读取结束. ", str3, str4, "cost ", valueOf, "ms. ", str);
        this.g = Long.valueOf(j);
        this.h = G;
        if (TextUtils.isEmpty(str2)) {
            str5 = "Bundle不存在";
        } else {
            str5 = "统一存储-磁盘";
        }
        this.i = str5;
        this.j = Boolean.valueOf(z);
        return str2;
    }
}
