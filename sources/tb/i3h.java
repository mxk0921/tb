package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class i3h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Set<a> f21069a = new CopyOnWriteArraySet();
    public String b = "PERFORMANCE_INTENSE";
    public final Handler c = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void a(String str);
    }

    static {
        t2o.a(806356387);
    }

    public final void b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c76ec95", new Object[]{this, str, new Boolean(z)});
        } else if (!this.b.equals(str)) {
            this.b = str;
            if (z) {
                e();
            }
        }
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8f256ab", new Object[]{this});
        }
        return this.b;
    }

    public final /* synthetic */ void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6052941", new Object[]{this});
        } else {
            b("PERFORMANCE_RELAXED", true);
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fd3967d", new Object[]{this});
            return;
        }
        Iterator it = ((CopyOnWriteArraySet) this.f21069a).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(this.b);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5232bc7", new Object[]{this});
        }
    }

    public void h(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6b05304", new Object[]{this, aVar});
        } else {
            ((CopyOnWriteArraySet) this.f21069a).add(aVar);
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.b = "PERFORMANCE_INTENSE";
        this.c.removeCallbacksAndMessages(null);
        ((CopyOnWriteArraySet) this.f21069a).clear();
    }

    public void j(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc91811d", new Object[]{this, aVar});
        } else {
            ((CopyOnWriteArraySet) this.f21069a).remove(aVar);
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29c4def6", new Object[]{this});
            return;
        }
        b("PERFORMANCE_INTENSE", false);
        this.c.postDelayed(new Runnable() { // from class: tb.h3h
            @Override // java.lang.Runnable
            public final void run() {
                i3h.this.d();
            }
        }, vvs.g("tblive", "perfStressPeriod", 3000L));
    }
}
