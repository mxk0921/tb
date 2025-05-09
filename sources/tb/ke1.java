package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.util.Pools;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ArrayBlockingQueue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ke1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final LayoutInflater f22604a;
    public final Handler.Callback c = new a();
    public final d b = d.b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Handler.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
            }
            c cVar = (c) message.obj;
            ((ff1) cVar.e).c(cVar.d, cVar.c, cVar.b);
            ke1.this.b.d(cVar);
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b extends LayoutInflater {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final String[] f22606a = {"android.widget.", "android.webkit.", "android.app."};

        static {
            t2o.a(912262101);
        }

        public b(Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -424637217) {
                return super.onCreateView((String) objArr[0], (AttributeSet) objArr[1]);
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/performance/AsyncLayoutInflater$BasicInflater");
        }

        @Override // android.view.LayoutInflater
        public LayoutInflater cloneInContext(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LayoutInflater) ipChange.ipc$dispatch("9e726fa6", new Object[]{this, context});
            }
            return new b(context);
        }

        @Override // android.view.LayoutInflater
        public View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
            View createView;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("e6b08cdf", new Object[]{this, str, attributeSet});
            }
            for (String str2 : f22606a) {
                try {
                    createView = createView(str, str2, attributeSet);
                } catch (ClassNotFoundException e) {
                    tgh.c("AsyncLayoutInflater", "createView() failed", e);
                }
                if (createView != null) {
                    return createView;
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public ke1 f22607a;
        public ViewGroup b;
        public int c;
        public View d;
        public e e;

        static {
            t2o.a(912262102);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class d extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static final d c;

        /* renamed from: a  reason: collision with root package name */
        private ArrayBlockingQueue<c> f22608a = new ArrayBlockingQueue<>(30);
        private Pools.SynchronizedPool<c> b = new Pools.SynchronizedPool<>(30);

        static {
            t2o.a(912262103);
            d dVar = new d();
            c = dVar;
            dVar.setName("TTDetail_AsyncLayoutInflater");
            dVar.start();
        }

        private d() {
        }

        public static d b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("9faf3f87", new Object[0]);
            }
            return c;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/performance/AsyncLayoutInflater$InflateThread");
        }

        public void a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("216fcec5", new Object[]{this, cVar});
                return;
            }
            try {
                this.f22608a.put(cVar);
            } catch (InterruptedException e) {
                throw new RuntimeException("Failed to enqueue async inflate request", e);
            }
        }

        public c c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("17a1f115", new Object[]{this});
            }
            c acquire = this.b.acquire();
            if (acquire == null) {
                return new c();
            }
            return acquire;
        }

        public void d(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("69a37045", new Object[]{this, cVar});
                return;
            }
            cVar.e = null;
            cVar.f22607a = null;
            cVar.b = null;
            cVar.c = 0;
            cVar.d = null;
            this.b.release(cVar);
        }

        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c917c992", new Object[]{this});
                return;
            }
            try {
                c take = this.f22608a.take();
                try {
                    take.d = take.f22607a.f22604a.inflate(take.c, take.b, false);
                } catch (RuntimeException e) {
                    tgh.c("AsyncLayoutInflater", "Failed to inflate resource in the background! Retrying on the UI thread", e);
                }
                Message obtain = Message.obtain();
                obtain.what = 0;
                obtain.obj = take;
                ke1.a(take.f22607a).handleMessage(obtain);
            } catch (InterruptedException e2) {
                tgh.c("AsyncLayoutInflater", "mQueue.take() failed", e2);
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            while (true) {
                e();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface e {
    }

    static {
        t2o.a(912262099);
    }

    public ke1(Context context) {
        this.f22604a = new b(new zdw(context));
    }

    public static /* synthetic */ Handler.Callback a(ke1 ke1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler.Callback) ipChange.ipc$dispatch("b3518dae", new Object[]{ke1Var});
        }
        return ke1Var.c;
    }

    public void b(int i, ViewGroup viewGroup, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3fe927a", new Object[]{this, new Integer(i), viewGroup, eVar});
        } else if (eVar != null) {
            c c2 = this.b.c();
            c2.f22607a = this;
            c2.c = i;
            c2.b = viewGroup;
            c2.e = eVar;
            this.b.a(c2);
        } else {
            throw new NullPointerException("callback argument may not be null!");
        }
    }
}
