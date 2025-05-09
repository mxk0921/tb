package tb;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.util.concurrent.ExecutorService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class vpt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Handler d = new Handler(Looper.getMainLooper());
    public final ExecutorService b;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f30161a = new Handler(Looper.getMainLooper());
    public volatile boolean c = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f30162a;

        public a(vpt vptVar, String str) {
            this.f30162a = str;
        }

        @Override // tb.qqt
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return this.f30162a + "_" + hashCode();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -816534907) {
                super.b((Throwable) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/util/ThreadDispatcher$2");
        }

        @Override // tb.zio
        public void b(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
                return;
            }
            super.b(th);
            agh.r("PltCameraPai", "ThreadDispatcher", agh.f("shutdown error ", th));
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                vpt.a(vpt.this).shutdown();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f30163a;
        public final /* synthetic */ Runnable b;

        public c(View view, Runnable runnable) {
            this.f30163a = view;
            this.b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f30163a.post(this.b);
            }
        }
    }

    static {
        t2o.a(481297653);
    }

    public vpt(String str) {
        this.b = VExecutors.newSingleThreadExecutor(new a(this, str));
    }

    public static /* synthetic */ ExecutorService a(vpt vptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("3902a6c4", new Object[]{vptVar});
        }
        return vptVar.b;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83ffd3f8", new Object[0])).booleanValue();
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    public static void e(View view, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("136bfb08", new Object[]{view, runnable});
        } else if (d()) {
            view.post(runnable);
        } else if (Build.VERSION.SDK_INT <= 25) {
            d.post(new c(view, runnable));
        } else {
            view.post(runnable);
        }
    }

    public static void g(String str, zio zioVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db707980", new Object[]{str, zioVar});
            return;
        }
        zioVar.d(str);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            zioVar.run();
        } else {
            d.post(zioVar);
        }
    }

    public static void h(String str, zio zioVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afb1a81d", new Object[]{str, zioVar, new Long(j)});
            return;
        }
        zioVar.d(str);
        d.postDelayed(zioVar, j);
    }

    public void b(zio zioVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7592fa7c", new Object[]{this, zioVar, new Boolean(z)});
            return;
        }
        c();
        j(zioVar, z);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36c832d", new Object[]{this});
        } else {
            this.f30161a.removeCallbacksAndMessages(null);
        }
    }

    public void f(String str, zio zioVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7bd383b", new Object[]{this, str, zioVar});
            return;
        }
        zioVar.d(str);
        this.f30161a.post(zioVar);
    }

    public void i(String str, zio zioVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4cbaf93", new Object[]{this, str, zioVar});
        } else if (!this.c) {
            zioVar.d(str);
            try {
                this.b.submit(zioVar);
            } catch (Exception unused) {
            }
        }
    }

    public final void j(zio zioVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("644caa4d", new Object[]{this, zioVar, new Boolean(z)});
        } else if (!this.c) {
            this.c = true;
            if (zioVar != null) {
                zioVar.d("clearAndDestroy");
                if (z) {
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        zioVar.c();
                    } else {
                        this.f30161a.post(zioVar);
                    }
                    this.b.shutdown();
                } else if (lg4.f0()) {
                    this.b.submit(zioVar);
                    this.b.submit(new b());
                } else {
                    try {
                        this.b.submit(zioVar);
                    } catch (Exception unused) {
                    }
                    this.b.shutdown();
                }
            }
        }
    }
}
