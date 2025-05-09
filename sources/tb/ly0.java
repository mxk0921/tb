package tb;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class ly0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
        void o();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b extends ly0 implements Choreographer.FrameCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Choreographer f23632a;
        public a b;
        public boolean c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ CountDownLatch f23633a;

            public a(CountDownLatch countDownLatch) {
                this.f23633a = countDownLatch;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                b.e(b.this, Choreographer.getInstance());
                this.f23633a.countDown();
            }
        }

        static {
            t2o.a(87031843);
        }

        public b() {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                new Handler(Looper.getMainLooper()).post(new a(countDownLatch));
                try {
                    if (!countDownLatch.await(500L, TimeUnit.MILLISECONDS)) {
                        this.f23632a = Choreographer.getInstance();
                    }
                } catch (InterruptedException unused) {
                }
            } else {
                this.f23632a = Choreographer.getInstance();
            }
        }

        public static /* synthetic */ Choreographer e(b bVar, Choreographer choreographer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Choreographer) ipChange.ipc$dispatch("6103e642", new Object[]{bVar, choreographer});
            }
            bVar.f23632a = choreographer;
            return choreographer;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/bindingx/core/internal/AnimationFrame$ChoreographerAnimationFrameImpl");
        }

        @Override // tb.ly0
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
                return;
            }
            Choreographer choreographer = this.f23632a;
            if (choreographer != null) {
                choreographer.removeFrameCallback(this);
            }
            this.c = false;
        }

        @Override // tb.ly0
        public void c(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3bac652b", new Object[]{this, aVar});
                return;
            }
            this.b = aVar;
            this.c = true;
            Choreographer choreographer = this.f23632a;
            if (choreographer != null) {
                choreographer.postFrameCallback(this);
            }
        }

        @Override // tb.ly0
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7382a68", new Object[]{this});
                return;
            }
            a();
            this.f23632a = null;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
                return;
            }
            a aVar = this.b;
            if (aVar != null) {
                aVar.o();
            }
            Choreographer choreographer = this.f23632a;
            if (choreographer != null && this.c) {
                choreographer.postFrameCallback(this);
            }
        }
    }

    static {
        t2o.a(87031841);
    }

    public static ly0 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ly0) ipChange.ipc$dispatch("3c157467", new Object[0]);
        }
        return new b();
    }

    public abstract void a();

    public abstract void c(a aVar);

    public abstract void d();
}
