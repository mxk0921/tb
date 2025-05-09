package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.alibaba.wireless.aliprivacyext.track.model.TrackLog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class gwx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f20279a;
    public final List<TrackLog> b;
    public final ThreadPoolExecutor c;
    public tsx d;
    public final e e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(gwx gwxVar) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, "aliprivacy-track-manager");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TrackLog f20280a;

        public b(TrackLog trackLog) {
            this.f20280a = trackLog;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            gwx.a(gwx.this).add(this.f20280a);
            if (!gwx.h(gwx.this).hasMessages(1)) {
                gwx.h(gwx.this).sendEmptyMessageDelayed(1, gwx.this.s());
            }
            if (gwx.a(gwx.this).size() >= gwx.this.r() || gwx.n(gwx.this)) {
                gwx.m(gwx.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f20281a;

        public c(boolean z) {
            this.f20281a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            gwx.m(gwx.this);
            gwx.f(gwx.this, this.f20281a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final gwx f20282a = new gwx(null);

        public static /* synthetic */ gwx a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (gwx) ipChange.ipc$dispatch("dc7d577b", new Object[0]);
            }
            return f20282a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class e extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final gwx f20283a;

        public e(gwx gwxVar) {
            super(Looper.getMainLooper());
            this.f20283a = gwxVar;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/wireless/aliprivacyext/track/core/b$e");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                this.f20283a.u();
            } else if (i == 2) {
                gwx.p(this.f20283a);
            }
        }
    }

    public /* synthetic */ gwx(a aVar) {
        this();
    }

    public static /* synthetic */ List a(gwx gwxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5adb802c", new Object[]{gwxVar});
        }
        return gwxVar.b;
    }

    public static /* synthetic */ void f(gwx gwxVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73ca6579", new Object[]{gwxVar, new Boolean(z)});
        } else {
            gwxVar.g(z);
        }
    }

    public static /* synthetic */ e h(gwx gwxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("7b9fb14c", new Object[]{gwxVar});
        }
        return gwxVar.e;
    }

    public static /* synthetic */ void m(gwx gwxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ace56098", new Object[]{gwxVar});
        } else {
            gwxVar.i();
        }
    }

    public static /* synthetic */ boolean n(gwx gwxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("92c9e1fd", new Object[]{gwxVar})).booleanValue();
        }
        return gwxVar.t();
    }

    public static gwx o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gwx) ipChange.ipc$dispatch("842d6bfe", new Object[0]);
        }
        return d.a();
    }

    public static /* synthetic */ void p(gwx gwxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c700df37", new Object[]{gwxVar});
        } else {
            gwxVar.b();
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.e.removeCallbacksAndMessages(null);
        }
    }

    public void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        this.f20279a = context;
        this.e.removeMessages(1);
        this.e.sendEmptyMessageDelayed(1, s() + (new Random(System.currentTimeMillis()).nextInt(10) * 1000));
    }

    public void d(TrackLog trackLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d966404e", new Object[]{this, trackLog});
        } else if (!q()) {
            g01.a("TrackManager", "add log fail: switch is " + q());
        } else {
            g01.a("TrackManager", "track log: " + trackLog.getMethod());
            this.c.execute(new b(trackLog));
        }
    }

    public void e(tsx tsxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e92705c", new Object[]{this, tsxVar});
        } else {
            this.d = tsxVar;
        }
    }

    public final void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.e.removeMessages(1);
        if (!z) {
            this.e.sendEmptyMessageDelayed(1, s());
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!((ArrayList) this.b).isEmpty()) {
            ArrayList arrayList = new ArrayList(Arrays.asList(new TrackLog[((ArrayList) this.b).size()]));
            Collections.copy(arrayList, this.b);
            tsx tsxVar = this.d;
            if (tsxVar != null) {
                ((myx) tsxVar).b(arrayList);
                ((ArrayList) this.b).clear();
            }
        }
    }

    public final void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (((ArrayList) this.b).isEmpty()) {
            g(z);
        } else {
            this.c.execute(new c(z));
        }
    }

    public final boolean k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{this, context})).booleanValue();
        }
        if (context != null && u9l.p(context)) {
            return mwx.n(context, u9l.o(context));
        }
        return false;
    }

    public int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        return mwx.b(u9l.m(this.f20279a), 2);
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        if ("0".equals(u9l.f(this.f20279a))) {
            return false;
        }
        Context context = this.f20279a;
        if (mwx.n(context, u9l.n(context))) {
            return true;
        }
        return false;
    }

    public int r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue();
        }
        return mwx.b(u9l.d(this.f20279a), 20);
    }

    public long s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f962", new Object[]{this})).longValue();
        }
        return mwx.b(u9l.e(this.f20279a), 20) * 1000;
    }

    public final boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        if (!k(this.f20279a) || ((ArrayList) this.b).size() < l()) {
            return false;
        }
        return true;
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else {
            j(false);
        }
    }

    public gwx() {
        this.e = new e(this);
        this.b = new ArrayList();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a(this));
        this.c = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }
}
