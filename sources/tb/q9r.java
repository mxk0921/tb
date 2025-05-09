package tb;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class q9r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public volatile Bitmap f26605a;
    public final ExecutorService b = dn.d(1, 1, 1, TimeUnit.MINUTES, "buy-mask-loading");
    public final Activity c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7cb46ce3", new Object[]{this, bitmap});
            } else {
                q9r.a(q9r.this, bitmap);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Bitmap f26607a;

        public b(Bitmap bitmap) {
            this.f26607a = bitmap;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ImageView b = w0q.b(q9r.b(q9r.this), this.f26607a);
            q9r q9rVar = q9r.this;
            ViewGroup j = q9rVar.j(q9r.b(q9rVar));
            if (j == null || j.getVisibility() == 8) {
                ck.g().e("DefaultSkeletonHandler getParentViewGroupOfSkeleton is null!!");
            } else {
                j.addView(b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f26608a;

        public c(d dVar) {
            this.f26608a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            q9r q9rVar = q9r.this;
            q9r.d(q9rVar, q9rVar.i());
            d dVar = this.f26608a;
            if (dVar != null) {
                ((a) dVar).a(q9r.c(q9r.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface d {
    }

    static {
        t2o.a(708837623);
    }

    public q9r(Activity activity) {
        this.c = activity;
    }

    public static /* synthetic */ void a(q9r q9rVar, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a814666", new Object[]{q9rVar, bitmap});
        } else {
            q9rVar.f(bitmap);
        }
    }

    public static /* synthetic */ Activity b(q9r q9rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("169d413f", new Object[]{q9rVar});
        }
        return q9rVar.c;
    }

    public static /* synthetic */ Bitmap c(q9r q9rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("ae98de28", new Object[]{q9rVar});
        }
        return q9rVar.f26605a;
    }

    public static /* synthetic */ Bitmap d(q9r q9rVar, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("abc8c240", new Object[]{q9rVar, bitmap});
        }
        q9rVar.f26605a = bitmap;
        return bitmap;
    }

    public static Bitmap g(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("3724ebcf", new Object[]{view, new Integer(i), new Integer(i2)});
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public final void e(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18e44a5", new Object[]{this, dVar});
        } else if (this.f26605a == null) {
            this.b.execute(new c(dVar));
        } else if (dVar != null) {
            ((a) dVar).a(this.f26605a);
        }
    }

    public final void f(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9385ff7a", new Object[]{this, bitmap});
        } else {
            dn.f(new b(bitmap), 0L);
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (!this.b.isShutdown()) {
            this.b.shutdownNow();
        }
    }

    public ViewGroup j(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("1c098b1e", new Object[]{this, activity});
        }
        return null;
    }

    public final Bitmap l(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("1188c040", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        Intent h = hh.h(this.c);
        if (h == null) {
            ck.g().e("TBBuySkeletonHandler", "intent is null !");
            return null;
        }
        String stringExtra = h.getStringExtra("PRELOAD");
        if (TextUtils.isEmpty(stringExtra)) {
            ck.g().e("TBBuySkeletonHandler", "identifier is empty");
            return null;
        }
        JSONObject b2 = e9r.b(stringExtra);
        if (b2 == null) {
            ck.g().e("TBBuySkeletonHandler", "protocol is empty");
            return null;
        }
        View b3 = i9r.b(this.c, b2);
        if (b3 == null) {
            return null;
        }
        return n(b3, i, i2);
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37b29f1", new Object[]{this});
        } else {
            e(new a());
        }
    }

    public final Bitmap n(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("c3755013", new Object[]{this, view, new Integer(i), new Integer(i2)});
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        view.layout(0, 0, measuredWidth, measuredHeight);
        return g(view, measuredWidth, measuredHeight);
    }

    public synchronized Bitmap k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("29683ae", new Object[]{this});
        }
        if (this.f26605a == null) {
            DisplayMetrics displayMetrics = this.c.getResources().getDisplayMetrics();
            if (new File("/data/local/tmp/.enableSurfacePreview").exists()) {
                this.f26605a = l(displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            if (this.f26605a == null) {
                this.f26605a = sm0.b(this.c, R.drawable.purchase_mask, displayMetrics.widthPixels, displayMetrics.heightPixels, false);
            }
        }
        return this.f26605a;
    }

    public synchronized Bitmap i() {
        boolean z = false;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("63fdfbb4", new Object[]{this});
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.f26605a = k();
            long currentTimeMillis2 = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder("主线程：");
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                z = true;
            }
            sb.append(z);
            sb.append(" 耗时：");
            sb.append(currentTimeMillis2 - currentTimeMillis);
            Log.e("yunbo", sb.toString());
            return this.f26605a;
        }
    }
}
