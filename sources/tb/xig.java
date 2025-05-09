package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class xig {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f31408a = new Handler(Looper.getMainLooper());
    public final pig b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
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
                xig.a(xig.this).e();
            }
        }
    }

    static {
        t2o.a(912262049);
    }

    public xig(Context context, ze7 ze7Var) {
        this.b = new isn(context, ze7Var);
    }

    public static /* synthetic */ pig a(xig xigVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pig) ipChange.ipc$dispatch("45d72181", new Object[]{xigVar});
        }
        return xigVar.b;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.b.d();
        }
    }

    public <C extends oa4> C c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ((oa4) ipChange.ipc$dispatch("97436efd", new Object[]{this, str}));
        }
        return (C) this.b.a(str);
    }

    public <C extends oa4> C d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ((oa4) ipChange.ipc$dispatch("53782880", new Object[]{this, str}));
        }
        return (C) this.b.b(str);
    }

    public View e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("17b33166", new Object[]{this});
        }
        return this.b.c();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eee9a4ec", new Object[]{this});
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            this.b.e();
        } else {
            this.f31408a.post(new a());
        }
    }

    public void g(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a3198ca", new Object[]{this, runnable});
        } else {
            this.f31408a.post(runnable);
        }
    }

    public void h(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9e42961", new Object[]{this, runnable, new Long(j)});
        } else {
            this.f31408a.postDelayed(runnable, j);
        }
    }

    public void i(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cfe43a4", new Object[]{this, runnable});
        } else {
            this.f31408a.removeCallbacks(runnable);
        }
    }
}
