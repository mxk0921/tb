package tb;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.util.concurrent.ExecutorService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class mhi implements d22 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f24043a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public volatile boolean c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f24044a;

        public a(String str) {
            this.f24044a = str;
        }

        @Override // tb.qqt
        public final String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return "plt_" + this.f24044a + "_thumbnail";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ att b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ mhi f24046a;
            public final /* synthetic */ att b;
            public final /* synthetic */ Bitmap c;

            public a(mhi mhiVar, att attVar, Bitmap bitmap) {
                this.f24046a = mhiVar;
                this.b = attVar;
                this.c = bitmap;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!mhi.d(this.f24046a, this.b)) {
                    this.b.b().setImageBitmap(this.c);
                }
            }
        }

        public b(att attVar) {
            this.b = attVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Bitmap e;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!mhi.d(mhi.this, this.b) && (e = gd2.e(this.b.a())) != null && !mhi.d(mhi.this, this.b)) {
                mhi.c(mhi.this).post(new a(mhi.this, this.b, e));
            }
        }
    }

    static {
        t2o.a(481296476);
        t2o.a(481296472);
    }

    public mhi(String str) {
        ckf.g(str, "type");
        ExecutorService newCachedThreadPool = VExecutors.newCachedThreadPool(new a(str));
        ckf.f(newCachedThreadPool, "newCachedThreadPool { \"plt_${type}_thumbnail\" }");
        this.f24043a = newCachedThreadPool;
    }

    public static final /* synthetic */ Handler c(mhi mhiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("3da4ccd2", new Object[]{mhiVar});
        }
        return mhiVar.b;
    }

    public static final /* synthetic */ boolean d(mhi mhiVar, att attVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c324b6ec", new Object[]{mhiVar, attVar})).booleanValue();
        }
        return mhiVar.e(attVar);
    }

    @Override // tb.d22
    public void b(att attVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf707e0b", new Object[]{this, attVar});
            return;
        }
        ckf.g(attVar, "task");
        this.f24043a.execute(new b(attVar));
    }

    public final boolean e(att attVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f258f6a8", new Object[]{this, attVar})).booleanValue();
        }
        if (VExecutors.currentThread().isInterrupted() || this.c || attVar.c()) {
            return true;
        }
        return false;
    }

    @Override // tb.d22
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.c = true;
        this.b.removeCallbacksAndMessages(null);
        this.f24043a.shutdownNow();
    }

    @Override // tb.d22
    public void a(att attVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5caf5fd0", new Object[]{this, attVar});
            return;
        }
        ckf.g(attVar, "task");
        attVar.d(true);
    }
}
