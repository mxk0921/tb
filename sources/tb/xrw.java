package tb;

import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.webview.IWVWebView;
import android.util.Log;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.zcache.ResourceResponse;
import com.taobao.zcache.ResourceResponseCallback;
import com.taobao.zcache.model.ZCacheResourceResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class xrw implements jqw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CORE_TYPE_ANDROID = 2;
    public static final int CORE_TYPE_U3 = 1;
    public static final int CORE_TYPE_U4 = 3;
    public static xrw b;
    public static long c = 20;

    /* renamed from: a  reason: collision with root package name */
    public final String f31561a = xrw.class.getSimpleName();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class a implements ResourceResponseCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ CountDownLatch val$cdl;
        public final /* synthetic */ long val$startGetZCacheResourceTime;
        public final /* synthetic */ lpx val$zCacheResourceWrapper;

        public a(lpx lpxVar, CountDownLatch countDownLatch, long j) {
            this.val$zCacheResourceWrapper = lpxVar;
            this.val$cdl = countDownLatch;
            this.val$startGetZCacheResourceTime = j;
        }

        @Override // com.taobao.zcache.ResourceResponseCallback
        public void finish(ResourceResponse resourceResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9b4c3406", new Object[]{this, resourceResponse});
                return;
            }
            try {
                this.val$zCacheResourceWrapper.wrapZCacheResourceResponse(resourceResponse);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            this.val$cdl.countDown();
            long currentTimeMillis = System.currentTimeMillis() - this.val$startGetZCacheResourceTime;
            if (this.val$zCacheResourceWrapper.zCacheResourceResponse.isSuccess && currentTimeMillis > xrw.access$000()) {
                y71.commitFail(y71.MONITOR_POINT_ZCACHE_RESPONSE_TIME_OUT, 0, "ZCache请求超时, 用时：" + currentTimeMillis, null);
            } else if (this.val$zCacheResourceWrapper.zCacheResourceResponse.isSuccess) {
                y71.commitSuccess(y71.MONITOR_POINT_ZCACHE_RESPONSE_TIME_OUT, "ZCache请求在正常时限内返回");
            }
        }
    }

    static {
        t2o.a(989856354);
        t2o.a(989856388);
    }

    public static /* synthetic */ long access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bcd6076b", new Object[0])).longValue();
        }
        return c;
    }

    public static xrw getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xrw) ipChange.ipc$dispatch("da74e861", new Object[0]);
        }
        if (b == null) {
            synchronized (xrw.class) {
                try {
                    if (b == null) {
                        b = new xrw();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.Map] */
    @Override // tb.jqw
    public kqw onEvent(int i, iqw iqwVar, Object... objArr) {
        ZCacheResourceResponse zCacheResourceResponse;
        String str;
        Map<String, String> map;
        y8o y8oVar;
        Object obj;
        int i2 = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kqw) ipChange.ipc$dispatch("75ee5a2a", new Object[]{this, new Integer(i), iqwVar, objArr});
        }
        if (iqwVar == null) {
            return new kqw(false);
        }
        if (i != 1004 && i != 1008) {
            return new kqw(false);
        }
        try {
            if (i == 1004) {
                obj = objArr[0];
            } else {
                obj = objArr[1];
            }
            i2 = ((Integer) obj).intValue();
        } catch (Throwable th) {
            v7t.d(this.f31561a, "onEvent: 获取内核状态出错");
            th.printStackTrace();
        }
        if (i2 == 1 || i2 == 3) {
            vpw.b();
            c = vpw.commonConfig.V;
        } else {
            vpw.b();
            c = vpw.commonConfig.W;
        }
        fpx.a().b();
        iqwVar.b = gtw.i(iqwVar.b);
        HashMap hashMap = new HashMap();
        if (i == 1008) {
            try {
                hashMap = (Map) objArr[0];
            } catch (Throwable th2) {
                Log.e(this.f31561a, "onEvent: 获取header失败！");
                th2.printStackTrace();
            }
        }
        vpw.b();
        wpw wpwVar = vpw.commonConfig;
        String str2 = null;
        if (!wpwVar.U) {
            try {
                zCacheResourceResponse = gpx.d().c(iqwVar.b, hashMap);
            } catch (Throwable th3) {
                th3.printStackTrace();
                zCacheResourceResponse = null;
            }
        } else {
            lpx lpxVar = new lpx();
            IWVWebView iWVWebView = iqwVar.f21515a;
            if (!wpwVar.M2 || !(iWVWebView instanceof WVUCWebView)) {
                y8oVar = new y8o(iqwVar.b, hashMap);
            } else {
                y8oVar = new y8o(iqwVar.b, ((WVUCWebView) iWVWebView).getCachedUrl());
                y8oVar.f(hashMap);
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            try {
                yox.i(y8oVar, new a(lpxVar, countDownLatch, System.currentTimeMillis()));
                countDownLatch.await(c, TimeUnit.MILLISECONDS);
            } catch (Throwable th4) {
                Log.e(this.f31561a, "onEvent: 异步等待发生错误！");
                th4.printStackTrace();
            }
            zCacheResourceResponse = lpxVar.zCacheResourceResponse;
        }
        if (zCacheResourceResponse == null) {
            v7t.i("ZCache", "H5 use ZCache 3.0, url=[" + iqwVar.b + "], with response:[false]");
            return new kqw(false);
        }
        v7t.i("ZCache", "H5 use ZCache 3.0, url=[" + iqwVar.b + "] with response:[" + zCacheResourceResponse.isSuccess + "]");
        vpw.b();
        if (!vpw.commonConfig.X || (map = zCacheResourceResponse.headers) == null || !map.containsKey("Content-Type")) {
            str = null;
        } else {
            str = zCacheResourceResponse.headers.get("Content-Type");
            if (str.contains("text/html")) {
                str = "text/html";
            }
            v7t.d("ZCache", "mimeType= ".concat(str));
        }
        ltw ltwVar = new ltw(str != null ? str : zCacheResourceResponse.mimeType, zCacheResourceResponse.encoding, zCacheResourceResponse.inputStream, zCacheResourceResponse.headers);
        ltwVar.f = zCacheResourceResponse.status;
        ltwVar.e = zCacheResourceResponse.zcacheInfo;
        if (trw.getWvzCacheMonitorInterface() != null) {
            if (hashMap != null) {
                str2 = (String) hashMap.get(HttpConstant.REFERER);
            }
            zqw wvzCacheMonitorInterface = trw.getWvzCacheMonitorInterface();
            String str3 = iqwVar.b;
            if (str2 == null) {
                str2 = "unknown";
            }
            boolean z = zCacheResourceResponse.isSuccess;
            if (str == null) {
                str = zCacheResourceResponse.mimeType;
            }
            wvzCacheMonitorInterface.onZCacheResponse(str3, str2, z, str);
        }
        return new kqw(true, ltwVar);
    }
}
