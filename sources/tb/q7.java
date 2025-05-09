package tb;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Future;
import tb.kec;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class q7<T, S extends kec> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public q7<T, S>.b f26555a;
    public Future<?> b;
    public final Handler c = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ kec f26556a;
        public final /* synthetic */ BitmapDrawable b;

        public a(kec kecVar, BitmapDrawable bitmapDrawable) {
            this.f26556a = kecVar;
            this.b = bitmapDrawable;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f26556a.getImageView().setImageDrawable(this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private T f26557a;
        private S b;

        static {
            t2o.a(511705582);
        }

        public b(T t, S s) {
            this.f26557a = t;
            this.b = s;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!Thread.interrupted()) {
                q7.this.h(this.f26557a, this.b);
            }
        }
    }

    static {
        t2o.a(511705580);
    }

    public abstract String a(T t);

    public abstract BitmapDrawable b(T t, Context context);

    public BitmapDrawable c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapDrawable) ipChange.ipc$dispatch("807880ce", new Object[]{this, str});
        }
        return sb2.sDrawableCache.get(str);
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("891f9240", new Object[]{this})).booleanValue();
        }
        return sb2.b();
    }

    public void e(T t, S s) {
        Future<?> future;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e6bd396", new Object[]{this, t, s});
            return;
        }
        if (!(this.f26555a == null || (future = this.b) == null)) {
            future.cancel(true);
            this.c.removeCallbacksAndMessages(null);
            this.f26555a = null;
            this.b = null;
        }
        if (!g(t, s)) {
            f(t, s);
        }
    }

    public final void f(T t, S s) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2a3b3e6", new Object[]{this, t, s});
            return;
        }
        q7<T, S>.b bVar = new b(t, s);
        this.f26555a = bVar;
        try {
            this.b = sb2.sThreadPool.submit(bVar);
        } catch (Throwable unused) {
        }
    }

    public boolean g(T t, S s) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74403dcd", new Object[]{this, t, s})).booleanValue();
        }
        ImageView imageView = s.getImageView();
        j(imageView);
        BitmapDrawable c = c(a(t));
        if (c == null || c.getBitmap() == null || c.getBitmap().isRecycled()) {
            z = false;
        } else {
            z = true;
        }
        if (!(c instanceof cy0) && !z) {
            return false;
        }
        imageView.setImageDrawable(c);
        return true;
    }

    public void h(T t, S s) {
        BitmapDrawable b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55cea095", new Object[]{this, t, s});
            return;
        }
        BitmapDrawable c = c(a(t));
        if ((c == null || c.getBitmap() == null || c.getBitmap().isRecycled()) && (b2 = b(t, s.getImageView().getContext())) != null) {
            if (d()) {
                i(a(t), b2);
            }
            this.c.post(new a(s, b2));
        }
    }

    public void i(String str, BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2995ddf9", new Object[]{this, str, bitmapDrawable});
        } else {
            sb2.sDrawableCache.put(str, bitmapDrawable);
        }
    }

    public void j(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7afb4d92", new Object[]{this, imageView});
        } else {
            imageView.setImageDrawable(new ColorDrawable(-16777216));
        }
    }
}
