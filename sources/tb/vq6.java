package tb;

import android.os.Handler;
import android.os.Looper;
import com.alibaba.android.ultron.vfw.instance.UltronError;
import com.alibaba.android.ultron.vfw.instance.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import tb.ms6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class vq6 implements ayb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public com.alibaba.android.ultron.vfw.dataloader.a f30171a;
    public sq6 b;
    public wxb c;
    public com.alibaba.android.ultron.vfw.instance.a d;
    public final Handler e = new Handler(Looper.getMainLooper());
    public boolean f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements sq6 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ms6.a f30172a;

        /* compiled from: Taobao */
        /* renamed from: tb.vq6$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class RunnableC1080a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ wq6 f30173a;

            public RunnableC1080a(wq6 wq6Var) {
                this.f30173a = wq6Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                vq6.this.b.a(this.f30173a);
                ms6.a aVar = a.this.f30172a;
                if (aVar != null) {
                    aVar.onFinish();
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ UltronError f30174a;
            public final /* synthetic */ wq6 b;

            public b(UltronError ultronError, wq6 wq6Var) {
                this.f30174a = ultronError;
                this.b = wq6Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                a.i C = vq6.this.d.C();
                if (C != null) {
                    C.d(this.f30174a);
                }
                sq6 sq6Var = vq6.this.b;
                if (sq6Var != null) {
                    sq6Var.b(this.b, this.f30174a);
                }
                ms6.a aVar = a.this.f30172a;
                if (aVar != null) {
                    aVar.onFinish();
                }
            }
        }

        public a(ms6.a aVar) {
            this.f30172a = aVar;
        }

        @Override // tb.sq6
        public void a(wq6 wq6Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d2b290d", new Object[]{this, wq6Var});
                return;
            }
            vq6 vq6Var = vq6.this;
            if (vq6Var.b != null) {
                UnifyLog.m(vq6Var.d.getBizName(), "DataLoaderRequest", "DataLoader finished step5", new String[0]);
                if (Looper.getMainLooper() == Looper.myLooper() || vq6.b(vq6.this)) {
                    vq6.this.b.a(wq6Var);
                    ms6.a aVar = this.f30172a;
                    if (aVar != null) {
                        aVar.onFinish();
                        return;
                    }
                    return;
                }
                vq6.this.e.post(new RunnableC1080a(wq6Var));
            }
        }

        @Override // tb.sq6
        public void b(wq6 wq6Var, UltronError ultronError) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fc6672d", new Object[]{this, wq6Var, ultronError});
                return;
            }
            b bVar = new b(ultronError, wq6Var);
            if (Looper.getMainLooper() == Looper.myLooper() || vq6.b(vq6.this)) {
                bVar.run();
            } else {
                vq6.this.e.post(bVar);
            }
        }
    }

    static {
        t2o.a(157286602);
        t2o.a(157286618);
    }

    public static /* synthetic */ boolean b(vq6 vq6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("873881cc", new Object[]{vq6Var})).booleanValue();
        }
        return vq6Var.f;
    }

    public static vq6 c(com.alibaba.android.ultron.vfw.dataloader.a aVar, wxb wxbVar, sq6 sq6Var, com.alibaba.android.ultron.vfw.instance.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vq6) ipChange.ipc$dispatch("2b096d69", new Object[]{aVar, wxbVar, sq6Var, aVar2});
        }
        vq6 vq6Var = new vq6();
        vq6Var.f30171a = aVar;
        vq6Var.c = wxbVar;
        vq6Var.b = sq6Var;
        vq6Var.d = aVar2;
        if (aVar != null && wxbVar != null) {
            return vq6Var;
        }
        throw new IllegalArgumentException("DataLoaderRequest params error");
    }

    @Override // tb.ayb
    public void a(ms6.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80462577", new Object[]{this, aVar});
        } else {
            this.c.a(this.f30171a, new a(aVar));
        }
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13b0adeb", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }
}
