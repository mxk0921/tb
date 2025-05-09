package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class wg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final np f30672a;
    public final ThreadPoolExecutor b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f30673a;
        public final /* synthetic */ Object b;

        public a(String str, Object obj) {
            this.f30673a = str;
            this.b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                wg.a(wg.this).N(this.f30673a, this.b);
            } catch (Exception e) {
                ck.g().b("AURATaobaoCache", "saveCache", e.getMessage());
            }
        }
    }

    static {
        t2o.a(80740417);
    }

    public wg(String str) {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        this.b = dn.d(Math.max(1, availableProcessors / 2), availableProcessors, 1L, TimeUnit.MINUTES, "AURATaobaoCache#saveCache");
        this.f30672a = AVFSCacheManager.getInstance().cacheForModule(str);
    }

    public static /* synthetic */ fdb a(wg wgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fdb) ipChange.ipc$dispatch("cac26c6a", new Object[]{wgVar});
        }
        return wgVar.c();
    }

    public <T> T b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("d3b02d75", new Object[]{this, str});
        }
        try {
            return (T) c().d0(str);
        } catch (Exception e) {
            rbb g = ck.g();
            g.b("AURATaobaoCache", "getCache", "key=" + str + "," + e.getMessage());
            return null;
        }
    }

    public final fdb c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fdb) ipChange.ipc$dispatch("6d39df3", new Object[]{this});
        }
        np npVar = this.f30672a;
        if (npVar != null) {
            return npVar.w();
        }
        ck.g().b("AURATaobaoCache", "getCache", "mAVFSCache创建失败");
        return c4k.w();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        ThreadPoolExecutor threadPoolExecutor = this.b;
        if (threadPoolExecutor != null && !threadPoolExecutor.isShutdown()) {
            try {
                this.b.shutdownNow();
            } catch (Exception e) {
                rbb g = ck.g();
                g.b("AURATaobaoCache", "onDestroy", "停止线程池报错：" + e.getMessage());
            }
        }
    }

    public void e(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be594332", new Object[]{this, str, obj});
        } else {
            this.b.execute(new a(str, obj));
        }
    }
}
