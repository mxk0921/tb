package tb;

import android.content.Context;
import android.os.Looper;
import com.alibaba.wireless.aliprivacyext.http.MTopHelper;
import com.alibaba.wireless.aliprivacyext.track.model.TrackLog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class myx implements tsx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f24398a;
    public final ThreadPoolExecutor b;
    public final com.alibaba.wireless.aliprivacyext.track.model.a c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(myx myxVar) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, "aliprivacy-easy-track");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f24399a;

        public b(List list) {
            this.f24399a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                myx.c(myx.this, this.f24399a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c implements g7b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(myx myxVar) {
        }

        @Override // tb.g7b
        public void a(com.alibaba.wireless.aliprivacyext.http.model.response.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("17e6aa22", new Object[]{this, aVar});
            }
        }

        @Override // tb.g7b
        public void b(com.alibaba.wireless.aliprivacyext.http.model.response.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c33635a7", new Object[]{this, aVar});
            }
        }
    }

    public myx(Context context) {
        this.f24398a = context;
        this.c = a(context);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a(this));
        this.b = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static /* synthetic */ void c(myx myxVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2f0720b", new Object[]{myxVar, list});
        } else {
            myxVar.d(list);
        }
    }

    public final com.alibaba.wireless.aliprivacyext.track.model.a a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.wireless.aliprivacyext.track.model.a) ipChange.ipc$dispatch("132156f6", new Object[]{this, context});
        }
        return new com.alibaba.wireless.aliprivacyext.track.model.a(context);
    }

    public void b(List<TrackLog> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            this.b.execute(new b(list));
        } else {
            d(list);
        }
    }

    public final void d(List<TrackLog> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
            return;
        }
        com.alibaba.wireless.aliprivacyext.track.model.b bVar = new com.alibaba.wireless.aliprivacyext.track.model.b();
        bVar.clientInfo = this.c;
        bVar.wirelessLogs = list;
        MTopHelper.b(this.f24398a, bVar, new c(this));
    }
}
