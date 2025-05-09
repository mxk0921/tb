package tb;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Build;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class uo6 implements ViewTreeObserver.OnPreDrawListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int m = 0;
    public boolean b;
    public ViewGroup c;
    public Activity f;
    public View h;
    public View j;
    public int k;

    /* renamed from: a  reason: collision with root package name */
    public boolean f29526a = false;
    public final Set<zo6> d = new HashSet();
    public boolean e = false;
    public boolean g = false;
    public final Handler i = new Handler();
    public int l = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.uo6$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class PixelCopy$OnPixelCopyFinishedListenerC1073a implements PixelCopy.OnPixelCopyFinishedListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Bitmap f29528a;

            public PixelCopy$OnPixelCopyFinishedListenerC1073a(Bitmap bitmap) {
                this.f29528a = bitmap;
            }

            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public void onPixelCopyFinished(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e30dbf8e", new Object[]{this, new Integer(i)});
                    return;
                }
                if (i == 0) {
                    if (uo6.c(uo6.this)) {
                        this.f29528a.recycle();
                        return;
                    }
                    uo6.d(uo6.this, this.f29528a);
                }
                this.f29528a.recycle();
                uo6.e(uo6.this);
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (Build.VERSION.SDK_INT < 29 || uo6.a(uo6.this).getWidth() <= 0 || uo6.a(uo6.this).getHeight() <= 0) {
                uo6.e(uo6.this);
                uo6.g(-1);
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(uo6.a(uo6.this).getWidth(), uo6.a(uo6.this).getHeight(), Bitmap.Config.RGB_565);
                try {
                    PixelCopy.request(uo6.b(uo6.this).getWindow(), createBitmap, new PixelCopy$OnPixelCopyFinishedListenerC1073a(createBitmap), uo6.f(uo6.this));
                } catch (Exception unused) {
                    createBitmap.recycle();
                    uo6.e(uo6.this);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ zo6 f29529a;

        public b(zo6 zo6Var) {
            this.f29529a = zo6Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                uo6.h(uo6.this).add(this.f29529a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ zo6 f29530a;

        public c(zo6 zo6Var) {
            this.f29530a = zo6Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                uo6.h(uo6.this).remove(this.f29530a);
            }
        }
    }

    static {
        t2o.a(815792133);
    }

    public static /* synthetic */ ViewGroup a(uo6 uo6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("51dffb4a", new Object[]{uo6Var});
        }
        return uo6Var.c;
    }

    public static /* synthetic */ Activity b(uo6 uo6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("7a29f4bc", new Object[]{uo6Var});
        }
        return uo6Var.f;
    }

    public static /* synthetic */ boolean c(uo6 uo6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9636c71", new Object[]{uo6Var})).booleanValue();
        }
        return uo6Var.g;
    }

    public static /* synthetic */ void d(uo6 uo6Var, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10181a80", new Object[]{uo6Var, bitmap});
        } else {
            uo6Var.p(bitmap);
        }
    }

    public static /* synthetic */ void e(uo6 uo6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2a3c26f", new Object[]{uo6Var});
        } else {
            uo6Var.j();
        }
    }

    public static /* synthetic */ Handler f(uo6 uo6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("9af46b56", new Object[]{uo6Var});
        }
        return uo6Var.i;
    }

    public static /* synthetic */ int g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("509c18d7", new Object[]{new Integer(i)})).intValue();
        }
        m = i;
        return i;
    }

    public static /* synthetic */ Set h(uo6 uo6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("17bd2fe1", new Object[]{uo6Var});
        }
        return uo6Var.d;
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dcee0bd3", new Object[0])).booleanValue();
        }
        if ((Globals.getApplication().getResources().getConfiguration().uiMode & 48) == 32) {
            return true;
        }
        return false;
    }

    public void i(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adf155fa", new Object[]{this, view, new Integer(i)});
        } else if (this.j == null) {
            View view2 = new View(this.f);
            this.h = view2;
            view2.setBackgroundResource(R.drawable.tbsearch_darkmode_placeholder);
            this.j = view;
            this.k = i;
            ViewGroup viewGroup = (ViewGroup) this.f.getWindow().getDecorView();
            this.c = viewGroup;
            if (this.f29526a && this.b && m == 0) {
                viewGroup.addView(this.h, new ViewGroup.LayoutParams(10, 10));
                this.c.getViewTreeObserver().addOnPreDrawListener(this);
            }
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3be249d3", new Object[]{this});
            return;
        }
        this.h.setVisibility(8);
        if (this.h.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.h.getParent()).removeView(this.h);
        }
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95e786d8", new Object[]{this})).booleanValue();
        }
        return this.f29526a;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ded1a48e", new Object[]{this})).booleanValue();
        }
        if (!this.f29526a || !this.b || m != 1) {
            return false;
        }
        return true;
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c223cd8c", new Object[]{this});
            return;
        }
        Iterator it = ((HashSet) this.d).iterator();
        while (it.hasNext()) {
            ((zo6) it.next()).onHitDarkMode();
        }
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5acfbc33", new Object[]{this})).booleanValue();
        }
        try {
        } catch (Exception unused) {
            m = -1;
        }
        if (m != 0) {
            this.c.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
        if (n()) {
            j();
        } else {
            this.i.post(new a());
        }
        this.c.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }

    public void q(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("380b04c0", new Object[]{this, activity, new Boolean(z)});
            return;
        }
        this.f29526a = m();
        this.b = true;
        this.e = z;
        this.f = activity;
    }

    public void r(zo6 zo6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d96db457", new Object[]{this, zo6Var});
        } else {
            this.f.runOnUiThread(new b(zo6Var));
        }
    }

    public void s(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1df960a3", new Object[]{this, new Integer(i)});
        } else {
            this.l = i;
        }
    }

    public void t(zo6 zo6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7350961e", new Object[]{this, zo6Var});
        } else {
            this.f.runOnUiThread(new c(zo6Var));
        }
    }

    public final boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63376c", new Object[]{this})).booleanValue();
        }
        Bitmap createBitmap = Bitmap.createBitmap(this.j.getWidth(), 1, Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas();
        canvas.setBitmap(createBitmap);
        canvas.translate(0.0f, -this.k);
        this.j.draw(canvas);
        int i = this.l;
        if (i < 0) {
            i = this.j.getWidth() / 2;
        }
        int red = Color.red(createBitmap.getPixel(i, 0));
        TLogTracker.f("tbsearch_dm", "judgeWithDraw color", "red " + red);
        createBitmap.recycle();
        if (red >= 128) {
            return false;
        }
        m = 1;
        if (this.e) {
            hgw.a(this.c);
        }
        o();
        return true;
    }

    public final void p(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c32e278", new Object[]{this, bitmap});
            return;
        }
        j();
        this.g = true;
        int red = Color.red(bitmap.getPixel(0, 0));
        TLogTracker.f("tbsearch_dm", "copy color", "red " + red);
        if (red < 128) {
            m = 1;
            if (this.e) {
                hgw.a(this.c);
            }
            o();
            return;
        }
        m = -1;
    }
}
