package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import com.taobao.android.virtual_thread.VirtualExecutors;
import tb.y49;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ako implements yct {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final j1r f15792a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements y49.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.y49.a
        public void onFeatureStatusChange(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acce9b03", new Object[]{this, new Integer(i)});
            } else if (i == 3) {
                ako.a(ako.this);
            }
        }
    }

    static {
        t2o.a(970981402);
        t2o.a(970981409);
    }

    public ako(j1r j1rVar, yiw yiwVar) {
        this.f15792a = j1rVar;
    }

    public static /* synthetic */ void a(ako akoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2816e371", new Object[]{akoVar});
        } else {
            akoVar.b();
        }
    }

    @Override // tb.yct
    public void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
            return;
        }
        try {
            if (BundleInfoManager.instance().getDynamicFeatureInfo("rxandroid") != null) {
                o49.b().d("rxandroid", new a(), VirtualExecutors.newSingleVirtualThreadExecutor());
            } else {
                b();
            }
        } catch (Throwable th) {
            ghh.c(th);
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a2fe10", new Object[]{this});
            return;
        }
        try {
            if (this.f15792a.c("useRxJavaVirtualThread", true)) {
                qko.i();
                ghh.b("RxJavaTask", "commit");
            } else {
                qko.n();
                ghh.a("RxJavaTask", "rollback");
            }
        } catch (Throwable th) {
            ghh.c(th);
        }
    }
}
