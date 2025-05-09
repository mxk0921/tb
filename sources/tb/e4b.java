package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Choreographer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.recommend3.tracelog.TraceModel;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.b9u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class e4b extends ov {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean d = false;
    public static boolean e = vxl.p();
    public b9u b;
    public final AtomicBoolean c = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                e4b.this.h();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements b9u.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f49fadf", new Object[]{this, new Boolean(z)});
            } else if (z) {
                e4b.this.f();
            }
        }
    }

    static {
        t2o.a(729809892);
    }

    public e4b(String str) {
        super(str);
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("751f459e", new Object[0])).booleanValue();
        }
        return true;
    }

    public static void g(g9u g9uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8d5874", new Object[]{g9uVar});
        } else if (e()) {
            g9uVar.c("HomeSmoothCheckInterceptor", new e4b(g9uVar.a()));
            TLog.loge("home", "GlobalTrace", "register interceptor success, name=HomeSmoothCheckInterceptor");
        }
    }

    public static /* synthetic */ Object ipc$super(e4b e4bVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/recommend3/tracelog/interceptor/HomeSmoothCheckInterceptor");
    }

    @Override // tb.ov
    public boolean c(TraceModel traceModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6724b2dc", new Object[]{this, traceModel, new Boolean(z)})).booleanValue();
        }
        String name = traceModel.getName();
        if (!z) {
            if (TextUtils.equals(name, "homeVisible")) {
                e = true;
            } else if (TextUtils.equals(name, "homeNetDataRefresh")) {
                d = true;
            }
        } else if (TextUtils.equals(name, "homeFragmentOnPause")) {
            b9u b9uVar = this.b;
            if (b9uVar != null) {
                b9uVar.b();
            }
            f();
            return true;
        }
        if (!d || !e || !this.c.compareAndSet(false, true)) {
            return false;
        }
        m5a.a().i(new a());
        return true;
    }

    @Override // tb.ov
    public boolean d(TraceModel traceModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("561fd916", new Object[]{this, traceModel, new Boolean(z)})).booleanValue();
        }
        b9u b9uVar = this.b;
        if (b9uVar == null || !b9uVar.c()) {
            return true;
        }
        return false;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37f0e66e", new Object[]{this});
            return;
        }
        b9u b9uVar = this.b;
        if (b9uVar == null) {
            f0b.i().e("homeTotal", null, SystemClock.uptimeMillis());
            return;
        }
        long a2 = b9uVar.a();
        f0b.i().c("home_smoothCheck");
        f0b.i().e("homeTotal", null, a2);
        f0b.i().n("homeSmoothInteractive", 1, g0b.f(), a2);
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e6ed381", new Object[]{this});
            return;
        }
        TLog.loge("home", "GlobalTrace", "开始检查可流畅交互");
        f0b.i().p("home_smoothCheck", 3);
        b9u b9uVar = new b9u();
        this.b = b9uVar;
        b9uVar.d(new b());
        Choreographer.getInstance().postFrameCallback(this.b);
    }
}
