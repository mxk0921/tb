package tb;

import android.content.Context;
import android.content.pm.PackageManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.g;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class qgg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static qgg f26736a;

    static {
        t2o.a(349175835);
    }

    public static qgg d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qgg) ipChange.ipc$dispatch("e1bdb947", new Object[0]);
        }
        if (f26736a == null) {
            synchronized (qgg.class) {
                try {
                    if (f26736a == null) {
                        f26736a = new qgg();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f26736a;
    }

    public final boolean c(Context context) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6cbcba58", new Object[]{this, context})).booleanValue();
        }
        long j = g.p(context).getLong("launch_predict_time", 0L);
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (j <= 0 || currentTimeMillis <= 0 || currentTimeMillis >= 120000) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            s55.i("LaunchPredictor", "checkInterval blocked", new Object[0]);
        }
        return !z;
    }

    public void f(final Context context, final ik4<Boolean> ik4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b955d48e", new Object[]{this, context, ik4Var});
        } else if (ik4Var != null) {
            mf.e().execute(new Runnable() { // from class: tb.pgg
                @Override // java.lang.Runnable
                public final void run() {
                    qgg.this.e(context, ik4Var);
                }
            });
        }
    }

    public final /* synthetic */ void e(Context context, ik4 ik4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f37ce7d", new Object[]{this, context, ik4Var});
            return;
        }
        try {
        } catch (Throwable th) {
            s55.h("LaunchPredictor", "predict err", th, new Object[0]);
        }
        if (b(context)) {
            if (!c(context)) {
            }
            ik4Var.accept(Boolean.TRUE);
            g.p(context).edit().putLong("launch_predict_time", System.currentTimeMillis()).apply();
            return;
        }
        ik4Var.accept(Boolean.FALSE);
    }

    public boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1c93692", new Object[]{this, context})).booleanValue();
        }
        if (f.c("adaemon_skip_check_install")) {
            return true;
        }
        try {
            long j = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
            if (j > 0) {
                int i = ((System.currentTimeMillis() - j) > 86400000L ? 1 : ((System.currentTimeMillis() - j) == 86400000L ? 0 : -1));
                s55.i("LaunchPredictor", "checkInstall", "result", Boolean.valueOf(i >= 0));
                return i >= 0;
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return true;
    }
}
