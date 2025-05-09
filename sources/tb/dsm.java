package tb;

import android.content.Context;
import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class dsm {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static dsm b;

    /* renamed from: a  reason: collision with root package name */
    public final List<ocd> f18040a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f18041a;

        public a(Context context) {
            this.f18041a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (dsm.a(dsm.this).isEmpty()) {
                dsm.b(dsm.this);
            }
            for (ocd ocdVar : dsm.a(dsm.this)) {
                ocdVar.a(this.f18041a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final dsm f18042a = new dsm(null);

        static {
            t2o.a(782237784);
        }
    }

    static {
        t2o.a(782237781);
    }

    public /* synthetic */ dsm(a aVar) {
        this();
    }

    public static /* synthetic */ List a(dsm dsmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("454ed62a", new Object[]{dsmVar});
        }
        return dsmVar.f18040a;
    }

    public static /* synthetic */ void b(dsm dsmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0b7299c", new Object[]{dsmVar});
        } else {
            dsmVar.d();
        }
    }

    public static dsm c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dsm) ipChange.ipc$dispatch("f355f8f7", new Object[0]);
        }
        if (b == null) {
            b = b.f18042a;
        }
        return b;
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            ((ArrayList) this.f18040a).add(new x8o());
        }
    }

    public void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe5cbff", new Object[]{this, context});
        } else {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new a(context));
        }
    }

    public dsm() {
        this.f18040a = new ArrayList();
    }
}
