package tb;

import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.triver.kit.api.monitor.IPerformanceAndErrorTracker;
import com.alibaba.triver.prefetch.http.HttpPrefetchManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.adapter.IHttpCacheAdapter;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class luw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MINIAPP_ORI_URL_KEY = "miniapp_ori_url";

    /* renamed from: a  reason: collision with root package name */
    public static final IHttpCacheAdapter f23583a = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements IHttpCacheAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.weex.adapter.IHttpCacheAdapter
        public String getHttpCacheData(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("70359cb7", new Object[]{this, str, str2});
            }
            if (luw.a(str2)) {
                long currentTimeMillis = System.currentTimeMillis();
                String d = HttpPrefetchManager.b.d(str2, true);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                if (d != null) {
                    ((IPerformanceAndErrorTracker) RVProxy.get(IPerformanceAndErrorTracker.class)).sendPerfStageLog("PageDataAdapter", "time cost = " + currentTimeMillis2 + " get page data , url = " + str2);
                }
                return d;
            } else if (!luw.b(str) || !HttpPrefetchManager.f(str2)) {
                return null;
            } else {
                return HttpPrefetchManager.b.d(str2, true);
            }
        }

        @Override // com.taobao.weex.adapter.IHttpCacheAdapter
        public void setHttpCacheData(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("788a3207", new Object[]{this, str, str2, str3});
                return;
            }
            if (luw.a(str2)) {
                long currentTimeMillis = System.currentTimeMillis();
                HttpPrefetchManager.b.f(str2, str3, true);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                ((IPerformanceAndErrorTracker) RVProxy.get(IPerformanceAndErrorTracker.class)).sendPerfStageLog("PageDataAdapter", "time cost = " + currentTimeMillis2 + " save page data , url = " + str2);
            }
            if (luw.b(str) && HttpPrefetchManager.f(str2)) {
                HttpPrefetchManager.b.f(str2, str3, true);
            }
        }
    }

    static {
        t2o.a(766509100);
    }

    public static /* synthetic */ boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38fae185", new Object[]{str})).booleanValue();
        }
        return f(str);
    }

    public static /* synthetic */ boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd2b2e86", new Object[]{str})).booleanValue();
        }
        return e(str);
    }

    public static IHttpCacheAdapter c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHttpCacheAdapter) ipChange.ipc$dispatch("f12b3b58", new Object[0]);
        }
        return f23583a;
    }

    public static WXSDKInstance d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKInstance) ipChange.ipc$dispatch("ce6123ac", new Object[]{str});
        }
        try {
            return WXSDKManager.getInstance().getAllInstanceMap().get(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean e(String str) {
        WXSDKInstance d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("878024ba", new Object[]{str})).booleanValue();
        }
        if (str == null || (d = d(str)) == null) {
            return false;
        }
        Object obj = ((ConcurrentHashMap) d.E().j).get(MINIAPP_ORI_URL_KEY);
        if (obj instanceof String) {
            return ((String) obj).contains("fastMode");
        }
        return false;
    }

    public static boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62d73cd", new Object[]{str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        return str.endsWith("index.weex.js") || str.endsWith("index.weex.cmd.js");
    }
}
