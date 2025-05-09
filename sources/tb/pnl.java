package tb;

import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class pnl implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long e = 75;

    /* renamed from: a  reason: collision with root package name */
    private b f26197a;
    private WeakReference<View> b;
    private volatile boolean c = false;
    private final cll d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                pnl.a(pnl.this, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface b {
        void a(View view);

        void b(float f, long j);
    }

    public pnl(View view, cll cllVar) {
        this.b = new WeakReference<>(view);
        this.d = cllVar;
    }

    public static /* synthetic */ b a(pnl pnlVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("c8621ad", new Object[]{pnlVar, bVar});
        }
        pnlVar.f26197a = bVar;
        return bVar;
    }

    private void b(View view, View view2) {
        String str;
        rkb rkbVar;
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819d6751", new Object[]{this, view, view2});
        } else if (this.f26197a != null) {
            long a2 = out.a();
            if (this.d.J() || this.d.M()) {
                str = this.d.o();
            } else {
                str = this.d.getPageName();
            }
            if (TextUtils.isEmpty(str) || !nnl.k(str)) {
                rkbVar = new lgp(this.d);
            } else {
                rkbVar = new y23();
            }
            rkbVar.a(view, view2);
            eu2 b2 = rkbVar.b();
            View a3 = b2.a();
            if (a3 != null) {
                this.b = new WeakReference<>(a3);
                this.f26197a.a(a3);
                run();
                return;
            }
            b bVar = this.f26197a;
            if (b2.c()) {
                f = 1.0f;
            } else {
                f = b2.b();
            }
            bVar.b(f, a2);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
        } else {
            w9a.g().c().postDelayed(this, 50L);
        }
    }

    public void d(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("675fab9a", new Object[]{this, bVar});
        } else {
            this.f26197a = bVar;
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        this.c = true;
        w9a.g().c().removeCallbacks(this);
        w9a.g().f().post(new a());
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (!this.c) {
            View view = this.b.get();
            if (view == null) {
                e();
                return;
            }
            try {
                View findViewById = view.findViewById(nca.t);
                if (findViewById == null) {
                    findViewById = view;
                }
                if (findViewById.getHeight() * findViewById.getWidth() != 0) {
                    b(findViewById, view);
                }
            } catch (NullPointerException e2) {
                e2.printStackTrace();
            }
            w9a.g().c().postDelayed(this, 75L);
        }
    }
}
