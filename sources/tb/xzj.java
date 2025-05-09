package tb;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xzj extends bx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentLinkedQueue<a> f31739a = new ConcurrentLinkedQueue<>();
    public final AtomicBoolean b = new AtomicBoolean(true);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Runnable f31740a;
        private final boolean b;
        private final String c;
        private final boolean d;
        private final int e;
        private final int f;

        static {
            t2o.a(729809795);
        }

        public a(Runnable runnable, boolean z, String str, boolean z2, int i, int i2) {
            this.b = z;
            this.f31740a = runnable;
            this.c = str;
            this.d = z2;
            this.e = i;
            this.f = i2;
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("37d4b1a8", new Object[]{aVar});
            }
            return aVar.c;
        }

        public static /* synthetic */ boolean b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bc794d1b", new Object[]{aVar})).booleanValue();
            }
            return aVar.b;
        }

        public static /* synthetic */ boolean c(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f46a283a", new Object[]{aVar})).booleanValue();
            }
            return aVar.d;
        }

        public static /* synthetic */ int d(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2c5b0348", new Object[]{aVar})).intValue();
            }
            return aVar.e;
        }

        public static /* synthetic */ int e(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("644bde67", new Object[]{aVar})).intValue();
            }
            return aVar.f;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f31740a.run();
            }
        }
    }

    static {
        t2o.a(729809794);
    }

    public static /* synthetic */ Object ipc$super(xzj xzjVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/recommend3/newface/gateway/action/NewFaceUIRefreshInterceptor");
    }

    @Override // tb.bx
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa37bc9d", new Object[]{this});
        } else {
            bqa.d("NewFaceUIRefreshInterceptor", "editionChanged");
        }
    }

    @Override // tb.bx
    public void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f67ea346", new Object[]{this, context});
        } else {
            bqa.d("NewFaceUIRefreshInterceptor", "onCreate");
        }
    }

    @Override // tb.bx
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acffd587", new Object[]{this});
            return;
        }
        bqa.d("NewFaceUIRefreshInterceptor", "onCreateView");
        this.b.set(true);
    }

    @Override // tb.bx
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        bqa.d("NewFaceUIRefreshInterceptor", "onDestroy");
        this.b.set(false);
        u();
    }

    @Override // tb.bx
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbcebe0", new Object[]{this});
        } else {
            bqa.d("NewFaceUIRefreshInterceptor", "onLoginSuccess");
        }
    }

    @Override // tb.bx
    public void k(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e94c42d4", new Object[]{this, new Integer(i), str});
            return;
        }
        bqa.d("NewFaceUIRefreshInterceptor", "onNavigationTabChanged index: " + i + " , name: " + str);
        if (!TextUtils.equals(str, "homePage")) {
            this.b.set(false);
            p2b.n(true);
        }
    }

    @Override // tb.bx
    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1aadc606", new Object[]{this, str});
            return;
        }
        bqa.d("NewFaceUIRefreshInterceptor", "onPageNav");
        this.b.set(false);
        p2b.n(true);
    }

    @Override // tb.bx
    public void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0c072c6", new Object[]{this, new Boolean(z)});
            return;
        }
        bqa.d("NewFaceUIRefreshInterceptor", "onPageNavFinished success: " + z);
        this.b.set(true ^ z);
        p2b.n(z);
        if (!z) {
            y();
        }
    }

    @Override // tb.bx
    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            bqa.d("NewFaceUIRefreshInterceptor", "onPause");
        }
    }

    @Override // tb.bx
    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        bqa.d("NewFaceUIRefreshInterceptor", "onResume");
        this.b.set(true);
        y();
        p2b.n(false);
    }

    @Override // tb.bx
    public void onPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            return;
        }
        bqa.d("NewFaceUIRefreshInterceptor", "onPageSelected: " + i);
    }

    @Override // tb.bx
    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68bd0af", new Object[]{this});
        } else {
            bqa.d("NewFaceUIRefreshInterceptor", "onSecondRefresh");
        }
    }

    @Override // tb.bx
    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else {
            bqa.d("NewFaceUIRefreshInterceptor", "onStart");
        }
    }

    @Override // tb.bx
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            bqa.d("NewFaceUIRefreshInterceptor", "onStop");
        }
    }

    @Override // tb.bx
    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74f591da", new Object[]{this});
        } else {
            bqa.d("NewFaceUIRefreshInterceptor", "renderFirstFrame");
        }
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7b1b948", new Object[]{this});
        } else {
            this.f31739a.clear();
        }
    }

    public final boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2312d58", new Object[]{this})).booleanValue();
        }
        return vxl.b().j();
    }

    public final boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83ffd3f8", new Object[]{this})).booleanValue();
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return true;
        }
        return false;
    }

    public void x(Runnable runnable, String str, boolean z, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ad4e3e8", new Object[]{this, runnable, str, new Boolean(z), new Integer(i), new Integer(i2)});
        } else if (!v()) {
            runnable.run();
        } else {
            bqa.d("NewFaceUIRefreshInterceptor", "runAfterInteractiveAndPageVisible: " + this.b.get() + " , tag: " + str + " , useQosQueue:" + z);
            if (this.b.get()) {
                e7n.h(runnable, z, i, i2);
            } else {
                this.f31739a.offer(new a(runnable, w(), str, z, i, i2));
            }
        }
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4639aca", new Object[]{this});
            return;
        }
        bqa.d("NewFaceUIRefreshInterceptor", "runTasks, size: " + this.f31739a.size());
        if (this.b.get()) {
            while (!this.f31739a.isEmpty()) {
                a poll = this.f31739a.poll();
                if (poll != null) {
                    bqa.d("NewFaceUIRefreshInterceptor", "runTasks, task: " + a.a(poll) + " , isMainThread: " + a.b(poll));
                    if (!a.b(poll)) {
                        get.a().e(poll);
                    } else if (a.c(poll)) {
                        e7n.h(poll, true, a.d(poll), a.e(poll));
                    } else {
                        get.a().h(poll);
                    }
                }
            }
        }
    }
}
