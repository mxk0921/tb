package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class tyo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<Runnable> f29034a = new CopyOnWriteArrayList();
    public boolean b = false;
    public final Handler c = new Handler(Looper.getMainLooper());

    static {
        t2o.a(745538210);
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89bf592a", new Object[]{this, runnable});
        } else {
            ((CopyOnWriteArrayList) this.f29034a).add(runnable);
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c54094af", new Object[]{this});
        } else if (!((CopyOnWriteArrayList) this.f29034a).isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f29034a);
            ((CopyOnWriteArrayList) this.f29034a).clear();
            for (int i = 0; i < arrayList.size(); i++) {
                this.c.postDelayed((Runnable) arrayList.get(i), 100L);
            }
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        this.b = false;
        ((CopyOnWriteArrayList) this.f29034a).clear();
        this.c.removeCallbacksAndMessages(null);
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad3ffaf6", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa2c35a", new Object[]{this, new Boolean(z)});
            return;
        }
        this.b = z;
        if (!z) {
            b();
        }
    }
}
