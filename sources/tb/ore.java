package tb;

import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.SoftReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class ore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final long f25596a = 1000;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final LruCache<String, SoftReference<nx7>> c = new LruCache<>(30);

    static {
        t2o.a(815792601);
    }

    public static final void e(nx7 nx7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef18529d", new Object[]{nx7Var});
            return;
        }
        ckf.g(nx7Var, "$proxy");
        nx7Var.a();
    }

    public final nx7 a(String str) {
        nx7 nx7Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nx7) ipChange.ipc$dispatch("93bd3b8c", new Object[]{this, str});
        }
        ckf.g(str, "key");
        SoftReference<nx7> softReference = this.c.get(str);
        if (softReference == null || (nx7Var = softReference.get()) == null) {
            return null;
        }
        if (nx7Var.b()) {
            this.c.remove(str);
            return null;
        }
        nx7Var.c();
        return nx7Var;
    }

    public final void b(String str, nx7 nx7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44582585", new Object[]{this, str, nx7Var});
            return;
        }
        ckf.g(str, "key");
        ckf.g(nx7Var, zk4.CONTACTS_INFO_NOT_EMPTY_STATUS);
        this.c.put(str, new SoftReference<>(nx7Var));
    }

    public final void c(final nx7 nx7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aec8f17", new Object[]{this, nx7Var});
            return;
        }
        ckf.g(nx7Var, pg1.ATOM_proxy);
        this.b.postDelayed(new Runnable() { // from class: tb.z9z
            @Override // java.lang.Runnable
            public final void run() {
                ore.e(nx7.this);
            }
        }, this.f25596a);
    }
}
