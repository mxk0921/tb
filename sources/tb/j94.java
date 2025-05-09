package tb;

import android.content.Context;
import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class j94 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f21843a = new Handler(Coordinator.getWorkerLooper());
    public i94 b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f21844a;
        public final /* synthetic */ k94 b;

        public a(Context context, k94 k94Var) {
            this.f21844a = context;
            this.b = k94Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                j94.a(j94.this, this.f21844a, this.b);
            }
        }
    }

    static {
        t2o.a(768606218);
    }

    public static /* synthetic */ void a(j94 j94Var, Context context, k94 k94Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8005267", new Object[]{j94Var, context, k94Var});
        } else {
            j94Var.b(context, k94Var);
        }
    }

    public final void b(Context context, k94 k94Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa8d7f5", new Object[]{this, context, k94Var});
        } else if (this.b == null) {
            i94 i94Var = new i94(context, k94Var);
            this.b = i94Var;
            i94Var.f();
        }
    }

    public void c(Context context, k94 k94Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8f0749b", new Object[]{this, context, k94Var});
        } else {
            this.f21843a.post(new a(context, k94Var));
        }
    }
}
