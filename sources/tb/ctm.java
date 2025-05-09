package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ExecutorService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ctm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ kzd f17317a;
        public final /* synthetic */ ysm b;

        public a(kzd kzdVar, ysm ysmVar) {
            this.f17317a = kzdVar;
            this.b = ysmVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                this.f17317a.d(this.b);
                String a2 = csm.a("PreloadTaskCaller");
                wsm.c(a2, "executor.finished:" + Thread.currentThread().getName());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void a(kzd kzdVar, ysm ysmVar, on8 on8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e65557d4", new Object[]{this, kzdVar, ysmVar, on8Var});
        } else {
            b(on8Var).execute(new a(kzdVar, ysmVar));
        }
    }

    public final ExecutorService b(on8 on8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("ccb698e4", new Object[]{this, on8Var});
        }
        return on8Var.a(1, 60, "Detail Preload Loader");
    }
}
