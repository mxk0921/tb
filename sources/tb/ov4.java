package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ov4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f25675a;
    public long b = -1;
    public final boolean c = mve.a("orange_key_force_direct_run_cover_task", false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f25676a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ Runnable c;

        public a(long j, Context context, Runnable runnable) {
            this.f25676a = j;
            this.b = context;
            this.c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            Activity b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f25676a >= ov4.a(ov4.this) && (b = ov4.b(this.b)) != null && !b.isDestroyed() && !b.isFinishing()) {
                this.c.run();
            }
        }
    }

    static {
        t2o.a(491782171);
    }

    public static /* synthetic */ long a(ov4 ov4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("913e583c", new Object[]{ov4Var})).longValue();
        }
        return ov4Var.f25675a;
    }

    public static /* synthetic */ Activity b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("bb843c98", new Object[]{context});
        }
        return d(context);
    }

    public static Activity d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("1f9a0919", new Object[]{context});
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof bew)) {
            return null;
        }
        Context b = ((bew) context).b();
        if (b instanceof Activity) {
            return (Activity) b;
        }
        return null;
    }

    public final Runnable c(Runnable runnable, Context context, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("280ba73", new Object[]{this, runnable, context, new Long(j)});
        }
        return new a(j, context, runnable);
    }

    public final long e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2c262b6e", new Object[]{this})).longValue();
        }
        if (this.b < 0) {
            this.b = mve.c("orange_key_cover_view_jump_delay_time", 260);
        }
        return this.b;
    }

    public void f(Runnable runnable, Context context) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9564533", new Object[]{this, runnable, context});
        } else if (this.c) {
            runnable.run();
        } else {
            long uptimeMillis = SystemClock.uptimeMillis();
            Activity d = d(context);
            int i = -1;
            if (!(d == null || (intent = d.getIntent()) == null)) {
                i = intent.getIntExtra("dispatch_invisible_event_type", -1);
            }
            if (i == 30010) {
                get.a().f(c(runnable, context, uptimeMillis), e());
            } else {
                runnable.run();
            }
            this.f25675a = uptimeMillis;
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50375337", new Object[]{this});
        } else {
            this.f25675a = SystemClock.uptimeMillis();
        }
    }
}
