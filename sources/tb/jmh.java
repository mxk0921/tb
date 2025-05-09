package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.perf.uikit.LiveLottieAnimationView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class jmh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final LiveLottieAnimationView f22076a;
    public final int b;
    public int c;
    public int e;
    public Runnable f;
    public int h;
    public int i = 0;
    public final List<b> j = new ArrayList();
    public final Handler d = new Handler(Looper.getMainLooper());
    public boolean g = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            jmh.c(jmh.this).setFrame(jmh.a(jmh.this));
            jmh jmhVar = jmh.this;
            jmh.b(jmhVar, jmh.a(jmhVar) + jmh.d(jmh.this));
            if (jmh.a(jmh.this) <= jmh.c(jmh.this).getMaxFrame()) {
                jmh.i(jmh.this).postDelayed(this, 1000 / jmh.h(jmh.this));
            } else if (jmh.e(jmh.this) == -1 || jmh.f(jmh.this) < jmh.e(jmh.this)) {
                jmh.g(jmh.this);
                jmh jmhVar2 = jmh.this;
                jmh.b(jmhVar2, Math.round(jmh.c(jmhVar2).getMinFrame()));
                jmh.i(jmh.this).postDelayed(this, 1000 / jmh.h(jmh.this));
            } else {
                jmh.j(jmh.this);
                jmh.this.r();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
        void onComplete();

        void onStart();

        void onStop();
    }

    static {
        t2o.a(806355072);
    }

    public jmh(LiveLottieAnimationView liveLottieAnimationView, int i, int i2) {
        this.f22076a = liveLottieAnimationView;
        this.b = i;
        this.c = i2;
        this.e = Math.round(liveLottieAnimationView.getMinFrame());
        this.h = liveLottieAnimationView.getRepeatCount();
    }

    public static /* synthetic */ int a(jmh jmhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76febfc9", new Object[]{jmhVar})).intValue();
        }
        return jmhVar.e;
    }

    public static /* synthetic */ int b(jmh jmhVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed08089e", new Object[]{jmhVar, new Integer(i)})).intValue();
        }
        jmhVar.e = i;
        return i;
    }

    public static /* synthetic */ LiveLottieAnimationView c(jmh jmhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveLottieAnimationView) ipChange.ipc$dispatch("d30bfbc9", new Object[]{jmhVar});
        }
        return jmhVar.f22076a;
    }

    public static /* synthetic */ int d(jmh jmhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("789bbccb", new Object[]{jmhVar})).intValue();
        }
        return jmhVar.c;
    }

    public static /* synthetic */ int e(jmh jmhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("796a3b4c", new Object[]{jmhVar})).intValue();
        }
        return jmhVar.h;
    }

    public static /* synthetic */ int f(jmh jmhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7a38b9cd", new Object[]{jmhVar})).intValue();
        }
        return jmhVar.i;
    }

    public static /* synthetic */ int g(jmh jmhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("17aa0fd5", new Object[]{jmhVar})).intValue();
        }
        int i = jmhVar.i;
        jmhVar.i = 1 + i;
        return i;
    }

    public static /* synthetic */ int h(jmh jmhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7b07384e", new Object[]{jmhVar})).intValue();
        }
        return jmhVar.b;
    }

    public static /* synthetic */ Handler i(jmh jmhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("245a726a", new Object[]{jmhVar});
        }
        return jmhVar.d;
    }

    public static /* synthetic */ void j(jmh jmhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ca4355d", new Object[]{jmhVar});
        } else {
            jmhVar.l();
        }
    }

    public void k(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dec969", new Object[]{this, bVar});
        } else if (bVar != null && !((ArrayList) this.j).contains(bVar)) {
            ((ArrayList) this.j).add(bVar);
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d02b729", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.j).iterator();
        while (it.hasNext()) {
            ((b) it.next()).onComplete();
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f8f2a0", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.j).iterator();
        while (it.hasNext()) {
            ((b) it.next()).onStart();
        }
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da025df2", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.j).iterator();
        while (it.hasNext()) {
            ((b) it.next()).onStop();
        }
    }

    public void o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60b6ce25", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public void p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b54e802a", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else if (!this.g) {
            this.g = true;
            m();
            a aVar = new a();
            this.f = aVar;
            this.d.post(aVar);
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else if (this.g) {
            this.g = false;
            this.i = 0;
            this.d.removeCallbacks(this.f);
            n();
        }
    }
}
