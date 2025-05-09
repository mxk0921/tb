package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class z1i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f32460a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final z1i f32461a = new z1i();

        static {
            t2o.a(806356479);
        }

        public static /* synthetic */ z1i a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (z1i) ipChange.ipc$dispatch("746e776e", new Object[0]);
            }
            return f32461a;
        }
    }

    static {
        t2o.a(806356477);
    }

    public static z1i a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z1i) ipChange.ipc$dispatch("79040873", new Object[0]);
        }
        return b.a();
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83ffd3f8", new Object[]{this})).booleanValue();
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    public void c(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd609e25", new Object[]{this, runnable});
        } else if (runnable != null) {
            this.f32460a.post(runnable);
        }
    }

    public void d(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceb39d3f", new Object[]{this, runnable, new Long(j)});
        } else if (runnable != null) {
            this.f32460a.postDelayed(runnable, j);
        }
    }

    public z1i() {
        this.f32460a = new Handler(Looper.getMainLooper());
    }
}
