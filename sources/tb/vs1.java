package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.w3o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class vs1<OUT, CONTEXT extends w3o> implements kk4<OUT, CONTEXT> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final CONTEXT f30216a;
    public boolean b;
    public huo c;
    public final duo d = new duo();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends buo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(int i, kk4 kk4Var, yto ytoVar) {
            super(i, kk4Var, ytoVar);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/rxm/consume/BaseConsumer$1");
        }

        @Override // tb.buo
        public void t(kk4 kk4Var, yto ytoVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c143d0b4", new Object[]{this, kk4Var, ytoVar});
            } else {
                vs1.d(vs1.this, ytoVar);
            }
        }
    }

    public vs1(CONTEXT context) {
        fpm.c(context);
        this.f30216a = context;
    }

    public static /* synthetic */ void d(vs1 vs1Var, yto ytoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55bcea4a", new Object[]{vs1Var, ytoVar});
        } else {
            vs1Var.f(ytoVar);
        }
    }

    @Override // tb.kk4
    public synchronized void a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a06ed83", new Object[]{this, th});
        } else if (!this.b) {
            if (this.f30216a.j()) {
                b();
                return;
            }
            this.b = true;
            yto<OUT> ytoVar = new yto<>(16, true);
            ytoVar.e = th;
            o(ytoVar);
        }
    }

    @Override // tb.kk4
    public synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2068809", new Object[]{this});
        } else if (!this.b) {
            this.b = true;
            o(new yto<>(8, true));
        }
    }

    @Override // tb.kk4
    public synchronized void c(OUT out, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0fae13", new Object[]{this, out, new Boolean(z)});
        } else if (!this.b) {
            if (this.f30216a.j()) {
                b();
                return;
            }
            this.b = z;
            yto<OUT> ytoVar = new yto<>(1, z);
            ytoVar.c = out;
            o(ytoVar);
        }
    }

    public kk4<OUT, CONTEXT> e(huo huoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kk4) ipChange.ipc$dispatch("58f7314e", new Object[]{this, huoVar});
        }
        this.c = huoVar;
        return this;
    }

    public final void f(yto<OUT> ytoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d4f87b0", new Object[]{this, ytoVar});
            return;
        }
        try {
            if (8 != ytoVar.f32345a && !this.f30216a.j()) {
                int i = ytoVar.f32345a;
                if (i == 1) {
                    l(ytoVar.c, ytoVar.b);
                    return;
                } else if (i == 4) {
                    m(ytoVar.d);
                    return;
                } else if (i == 16) {
                    k(ytoVar.e);
                    return;
                } else {
                    return;
                }
            }
            j();
        } catch (Exception e) {
            n(e);
        }
    }

    /* renamed from: g */
    public CONTEXT getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CONTEXT) ((w3o) ipChange.ipc$dispatch("b665e036", new Object[]{this}));
        }
        return this.f30216a;
    }

    public huo h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (huo) ipChange.ipc$dispatch("7396a3f", new Object[]{this});
        }
        return this.c;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1d8e0ee", new Object[]{this})).booleanValue();
        }
        if (h() == null) {
            return false;
        }
        if (!h().f() || !jjo.b()) {
            return true;
        }
        return false;
    }

    public abstract void j();

    public abstract void k(Throwable th);

    public abstract void l(OUT out, boolean z);

    public void m(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45c7464", new Object[]{this, new Float(f)});
        }
    }

    public void n(Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee6e6574", new Object[]{this, exc});
        } else {
            xv8.c("RxSysLog", "UnhandledException when BaseConsumer dispatch result: %s", Log.getStackTraceString(exc));
        }
    }

    public final void o(yto<OUT> ytoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("654eb2f9", new Object[]{this, ytoVar});
        } else if (i()) {
            buo a2 = this.d.a();
            if (a2 == null) {
                a2 = new a(getContext().h(), this, ytoVar);
                a2.w(this.d);
            } else {
                a2.r(getContext().h(), this, ytoVar);
            }
            this.c.a(a2);
        } else {
            f(ytoVar);
        }
    }

    @Override // tb.kk4
    public synchronized void onProgressUpdate(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fae6024", new Object[]{this, new Float(f)});
        } else if (!this.b) {
            yto<OUT> ytoVar = new yto<>(4, false);
            ytoVar.d = f;
            o(ytoVar);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return jjo.a(getClass()) + "[cxt-id:" + getContext().d() + "]";
    }
}
