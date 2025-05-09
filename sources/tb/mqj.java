package tb;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.utils.Global;
import tb.r19;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class mqj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_MAIN_WEEX_URL = "https://infinite.m.taobao.com/app/newdetail/newflow/home?wh_weex=true&weex_mode=dom&wx_recycle_images=true&renderType=2&wx_js_min_version=0.0.1";

    /* renamed from: a  reason: collision with root package name */
    public static volatile c f24233a = null;
    public static volatile HandlerThread b;
    public static volatile Handler c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f24234a;
        public final /* synthetic */ Runnable b;

        public a(String str, Runnable runnable) {
            this.f24234a = str;
            this.b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            c a2 = mqj.a();
            synchronized (c.e(a2)) {
                try {
                    c.b(a2, this.f24234a);
                    c.d(a2, c4x.c(this.f24234a));
                    Runnable runnable = this.b;
                    if (runnable != null) {
                        runnable.run();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b extends r19.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f24235a;
        public final /* synthetic */ Runnable b;

        public b(boolean z, Runnable runnable) {
            this.f24235a = z;
            this.b = runnable;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/base/utils/NdFastCacheUtil$2");
        }

        @Override // tb.r19.e
        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d0a42b93", new Object[]{this});
            }
            return "preInitUIInfoTask";
        }

        @Override // tb.r19.e
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9425d337", new Object[]{this});
                return;
            }
            c a2 = mqj.a();
            synchronized (c.h(a2)) {
                try {
                    if (this.f24235a) {
                        c.j(a2, true);
                    }
                    if (c.i(a2)) {
                        if (r19.x0()) {
                            mqj.b(a2);
                        }
                        c.j(a2, false);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Runnable runnable = this.b;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    static {
        t2o.a(352321693);
    }

    public static /* synthetic */ c a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("525831c9", new Object[0]);
        }
        return d();
    }

    public static /* synthetic */ void b(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78f4c56c", new Object[]{cVar});
        } else {
            c(cVar);
        }
    }

    public static void c(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bcfa42e", new Object[]{cVar});
            return;
        }
        txj.e(txj.TAG_TIP, "doPreInitNavBarUIInfo>> 开始执行.");
        c.g(cVar, SystemBarDecorator.getStatusBarHeight(Global.getApplication()));
    }

    public static c d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("8d8fee36", new Object[0]);
        }
        if (f24233a == null) {
            f24233a = new c(null);
        }
        return f24233a;
    }

    public static String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67b44535", new Object[]{str});
        }
        c d = d();
        if (str != null && c.a(d) != null && str.equals(c.a(d)) && !TextUtils.isEmpty(c.c(d))) {
            return c.c(d);
        }
        c.b(d, str);
        c.d(d, c4x.c(str));
        return c.c(d);
    }

    public static String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("89cd280b", new Object[]{str});
        }
        c d = d();
        if (str == null || c.a(d) == null || !str.equals(c.a(d)) || TextUtils.isEmpty(c.c(d))) {
            return null;
        }
        return c.c(d);
    }

    public static int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43f4bca5", new Object[0])).intValue();
        }
        return c.f(d());
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d6c0033", new Object[0])).booleanValue();
        }
        return true;
    }

    public static void i() {
        HandlerThread handlerThread;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[0]);
            return;
        }
        synchronized (mqj.class) {
            c = null;
            handlerThread = b;
            b = null;
        }
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
    }

    public static void j(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea665c32", new Object[]{runnable});
        } else {
            Coordinator.execute(runnable, 23);
        }
    }

    public static void k(Runnable runnable) {
        Handler handler;
        HandlerThread handlerThread;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33458e62", new Object[]{runnable});
            return;
        }
        synchronized (mqj.class) {
            try {
                Handler handler2 = c;
                if (handler2 == null) {
                    handlerThread = b;
                    HandlerThread handlerThread2 = new HandlerThread("nd_async_task", -4);
                    handlerThread2.start();
                    handler = new Handler(handlerThread2.getLooper());
                    b = handlerThread2;
                    c = handler;
                } else {
                    handler = handler2;
                    handlerThread = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        handler.post(runnable);
    }

    public static void l(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bd706b1", new Object[]{runnable});
        } else {
            k(runnable);
        }
    }

    public static void m(Runnable runnable, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c274e695", new Object[]{runnable, new Boolean(z)});
        } else {
            Coordinator.execute(new b(z, runnable), 28);
        }
    }

    public static void n(String str, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99598865", new Object[]{str, runnable});
        } else {
            k(new a(str, runnable));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f24236a;
        public volatile String b;
        public volatile String c;
        public final Object d;
        public volatile int e;
        public final Object f;

        static {
            t2o.a(352321696);
        }

        public c() {
            this.f24236a = true;
            this.b = null;
            this.c = null;
            this.d = new Object();
            this.f = new Object();
        }

        public static /* synthetic */ String a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("657ee69b", new Object[]{cVar});
            }
            return cVar.b;
        }

        public static /* synthetic */ String b(c cVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5fa0970f", new Object[]{cVar, str});
            }
            cVar.b = str;
            return str;
        }

        public static /* synthetic */ String c(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8ee65f7a", new Object[]{cVar});
            }
            return cVar.c;
        }

        public static /* synthetic */ String d(c cVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a285362e", new Object[]{cVar, str});
            }
            cVar.c = str;
            return str;
        }

        public static /* synthetic */ Object e(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("eef273ca", new Object[]{cVar});
            }
            return cVar.d;
        }

        public static /* synthetic */ int f(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2d5f919c", new Object[]{cVar})).intValue();
            }
            return cVar.e;
        }

        public static /* synthetic */ int g(c cVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9d59bab", new Object[]{cVar, new Integer(i)})).intValue();
            }
            cVar.e = i;
            return i;
        }

        public static /* synthetic */ Object h(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("41c16588", new Object[]{cVar});
            }
            return cVar.f;
        }

        public static /* synthetic */ boolean i(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a6db42f", new Object[]{cVar})).booleanValue();
            }
            return cVar.f24236a;
        }

        public static /* synthetic */ boolean j(c cVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ce8c094b", new Object[]{cVar, new Boolean(z)})).booleanValue();
            }
            cVar.f24236a = z;
            return z;
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }
}
