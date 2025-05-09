package tb;

import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class um8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static long f = 0;

    /* renamed from: a  reason: collision with root package name */
    public final bdq f29490a;
    public final Intent b;
    public final Context c;
    public final scq d;
    public final jvc e = (jvc) d62.a(jvc.class, new Object[0]);

    static {
        t2o.a(677380240);
    }

    public um8(scq scqVar, bdq bdqVar, Intent intent, Context context) {
        this.d = scqVar;
        this.f29490a = bdqVar;
        this.b = intent;
        this.c = context;
    }

    public bdq a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bdq) ipChange.ipc$dispatch("8bbd355c", new Object[]{this});
        }
        return this.f29490a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69943117", new Object[]{this});
        } else {
            scq.l(this.d, this.f29490a, 4, 0, 0);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("852c8007", new Object[]{this});
            return;
        }
        f = System.currentTimeMillis();
        scq.l(this.d, this.f29490a, 10, 0, 0);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9734459", new Object[]{this});
            return;
        }
        scq.l(this.d, this.f29490a, 5, 0, 0);
        f = 0L;
    }

    public void e(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6436d003", new Object[]{this, new Integer(i), new Integer(i2), str});
            return;
        }
        if (i == 10) {
            for (String str2 : this.f29490a.f()) {
                this.e.c(str2, false, i, 0L, i2, str, acq.p().t());
            }
        }
        scq.l(this.d, this.f29490a, 6, -201, i2);
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9392db25", new Object[]{this});
            return;
        }
        b();
        for (String str : this.f29490a.f()) {
            if (o49.b().a(str) == 1) {
                o49.b().c().b(str, 2);
                if (f != 0) {
                    this.e.b(str, true, "verify", System.currentTimeMillis() - f, 0, "", acq.p().t());
                }
            }
        }
        System.currentTimeMillis();
        if (!this.b.getBooleanExtra("triggered_from_app_after_verification", false)) {
            this.b.putExtra("triggered_from_app_after_verification", true);
            LocalBroadcastManager.getInstance(this.c).sendBroadcast(this.b);
            return;
        }
        this.d.k().c("Splits copied and verified more than once.", new Object[0]);
    }
}
