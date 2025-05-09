package com.taobao.android.detail.ttdetail.monitor;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.t2o;
import tb.tgh;
import tb.vbl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.detail.ttdetail.monitor.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class RunnableC0378a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f6867a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public RunnableC0378a(Map map, String str, String str2) {
            this.f6867a = map;
            this.b = str;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                String str = "";
                Map map = this.f6867a;
                if (map != null && !map.isEmpty()) {
                    str = JSON.toJSONString(this.f6867a);
                }
                AppMonitor.Alarm.commitSuccess(this.b, this.c, str);
                tgh.b("TTDetailMonitor", "monitor commitSuccess monitorPoint:" + this.c);
                tgh.b("TTDetailMonitor", "monitor commitSuccess msg:" + str);
            } catch (Throwable th) {
                tgh.c("TTDetailMonitor", "monitor commitSuccess 异常", th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f6868a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ int e;

        public b(Map map, String str, String str2, String str3, int i) {
            this.f6868a = map;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                String str = "";
                Map<String, String> a2 = a.a(this.f6868a, this.b);
                if (a2 != null) {
                    str = JSON.toJSONString(a2);
                }
                AppMonitor.Alarm.commitFail(this.c, this.d, str, String.valueOf(this.e), this.b);
                if (vbl.p0()) {
                    TTDetailReportErrorController.Companion.a(a2, Integer.valueOf(this.e));
                }
                tgh.b("TTDetailMonitor", "monitor commitFail errorCode:" + this.e);
                tgh.b("TTDetailMonitor", "monitor commitFail errorMsg:" + str);
            } catch (Throwable th) {
                tgh.c("TTDetailMonitor", "monitor commitFail 异常", th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final c b = new c();

        /* renamed from: a  reason: collision with root package name */
        public ThreadPoolExecutor f6869a;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.detail.ttdetail.monitor.a$c$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public static class ThreadFactoryC0379a implements ThreadFactory {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f6870a;
            public final /* synthetic */ boolean b;

            public ThreadFactoryC0379a(String str, boolean z) {
                this.f6870a = str;
                this.b = z;
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                }
                Thread thread = new Thread(runnable, this.f6870a);
                thread.setDaemon(this.b);
                return thread;
            }
        }

        static {
            t2o.a(912262090);
        }

        public static void a(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1afb0dfa", new Object[]{runnable});
            } else {
                b.b(1, 60, "TTDetailMonitor").execute(runnable);
            }
        }

        public static ThreadFactory c(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ThreadFactory) ipChange.ipc$dispatch("8411487a", new Object[]{str, new Boolean(z)});
            }
            return new ThreadFactoryC0379a(str, z);
        }

        public synchronized ExecutorService b(int i, int i2, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ExecutorService) ipChange.ipc$dispatch("d59dd3de", new Object[]{this, new Integer(i), new Integer(i2), str});
            }
            if (this.f6869a == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, Integer.MAX_VALUE, i2, TimeUnit.SECONDS, new LinkedBlockingDeque(), c(str, false));
                this.f6869a = threadPoolExecutor;
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return this.f6869a;
        }
    }

    static {
        t2o.a(912262087);
    }

    public static /* synthetic */ Map a(Map map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("662031ad", new Object[]{map, str});
        }
        return g(map, str);
    }

    public static void b(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84ccc591", new Object[]{new Integer(i), str});
        } else {
            c("Page_TTDetail", "TTDetailExceptionStat", null, i, str);
        }
    }

    public static void c(String str, String str2, Map<String, String> map, int i, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84e18c78", new Object[]{str, str2, map, new Integer(i), str3});
        } else {
            c.a(new b(map, str3, str, str2, i));
        }
    }

    public static void d(Map<String, String> map, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("578dea64", new Object[]{map, new Integer(i), str});
        } else {
            c("Page_TTDetail", "TTDetailExceptionStat", map, i, str);
        }
    }

    public static void e(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71bb57be", new Object[]{str, str2, map});
        } else {
            c.a(new RunnableC0378a(map, str, str2));
        }
    }

    public static void f(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e30639d2", new Object[]{map});
        } else {
            e("Page_TTDetail", "TTDetailSuccessStat", map);
        }
    }

    public static Map<String, String> g(Map<String, String> map, String str) {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("102f31ff", new Object[]{map, str});
        }
        if (!TextUtils.isEmpty(str) || map != null) {
            hashMap = new HashMap();
        } else {
            hashMap = null;
        }
        if (!(hashMap == null || map == null)) {
            hashMap.putAll(map);
        }
        if (hashMap != null && !TextUtils.isEmpty(str)) {
            hashMap.put("_errorMsg_", str);
        }
        return hashMap;
    }
}
