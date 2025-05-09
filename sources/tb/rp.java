package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class rp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ExecutorService d;

    /* renamed from: a  reason: collision with root package name */
    public fdb f27521a;
    public final Map<String, Object> c = new ConcurrentHashMap();
    public final boolean b = "true".equals(OrangeConfig.getInstance().getConfig("mytaobao_setting_sdk", "fixSettingsAVFSAnr", "true"));

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(mba.BIZ_NAME);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f27522a;

        public b(String str) {
            this.f27522a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            rp.a(rp.this).remove(this.f27522a);
            rp.this.f27521a.A0(this.f27522a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f27523a;
        public final /* synthetic */ Object b;

        public c(String str, Object obj) {
            this.f27523a = str;
            this.b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            rp.a(rp.this).put(this.f27523a, this.b);
            rp.this.f27521a.N(this.f27523a, this.b);
        }
    }

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new a());
        d = newScheduledThreadPool;
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) newScheduledThreadPool;
        threadPoolExecutor.setKeepAliveTime(3000L, TimeUnit.MILLISECONDS);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static /* synthetic */ Map a(rp rpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("712bffbf", new Object[]{rpVar});
        }
        return rpVar.c;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a76f5ab5", new Object[]{this, str});
        } else {
            this.f27521a.A0(str);
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f22d3649", new Object[]{this, str});
            return;
        }
        if (!this.b) {
            b(str);
        }
        d.submit(new b(str));
    }

    public void d(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a97b403c", new Object[]{this, str, obj});
        } else {
            this.f27521a.N(str, obj);
        }
    }

    public void e(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50c07da", new Object[]{this, str, obj});
        } else if (!this.b) {
            d(str, obj);
        } else {
            d.submit(new c(str, obj));
        }
    }
}
