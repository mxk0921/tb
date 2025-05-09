package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.swn;
import tb.w3o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class kh3<OUT, NEXT_OUT extends swn, CONTEXT extends w3o> implements kk4<NEXT_OUT, CONTEXT> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public kk4<OUT, CONTEXT> f22664a;
    public oh3<OUT, NEXT_OUT, CONTEXT> b;
    public huo c;

    public kh3(kk4<OUT, CONTEXT> kk4Var, oh3<OUT, NEXT_OUT, CONTEXT> oh3Var) {
        this.f22664a = kk4Var;
        this.b = oh3Var;
    }

    @Override // tb.kk4
    public void a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a06ed83", new Object[]{this, th});
        } else if (this.b.h().a(16)) {
            this.b.C(this.f22664a, th);
        } else {
            this.f22664a.a(th);
        }
    }

    @Override // tb.kk4
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2068809", new Object[]{this});
        } else if (this.b.h().a(8)) {
            this.b.z(this.f22664a);
        } else {
            this.f22664a.b();
        }
    }

    public kk4<NEXT_OUT, CONTEXT> d(huo huoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kk4) ipChange.ipc$dispatch("58f7314e", new Object[]{this, huoVar});
        }
        this.c = huoVar;
        return this;
    }

    /* renamed from: e */
    public CONTEXT getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CONTEXT) ((w3o) ipChange.ipc$dispatch("b665e036", new Object[]{this}));
        }
        kk4<OUT, CONTEXT> kk4Var = this.f22664a;
        if (kk4Var == null) {
            return null;
        }
        return kk4Var.getContext();
    }

    /* renamed from: f */
    public void c(NEXT_OUT next_out, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9361a8a1", new Object[]{this, next_out, new Boolean(z)});
            return;
        }
        String k = this.b.k();
        if (getContext().i()) {
            xv8.f("RxSysLog", "[DelegateConsumer] ID=%d cancelled before receiving new result, producer=%s isLast=%b", Integer.valueOf(getContext().d()), k, Boolean.valueOf(z));
            if (next_out != null) {
                next_out.release();
            }
            this.f22664a.b();
        } else if (this.b.h().a(1) || (z && this.b.h().a(2))) {
            this.b.D(this.f22664a, z, next_out);
        } else {
            this.f22664a.c(next_out, z);
        }
    }

    public void finalize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        try {
            na7<OUT, NEXT_OUT, CONTEXT> j = this.b.j();
            if (j != null && !j.b(this)) {
                super.finalize();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public kh3<OUT, NEXT_OUT, CONTEXT> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kh3) ipChange.ipc$dispatch("1f5738a1", new Object[]{this});
        }
        h(null, null);
        return this;
    }

    public kh3<OUT, NEXT_OUT, CONTEXT> h(kk4<OUT, CONTEXT> kk4Var, oh3<OUT, NEXT_OUT, CONTEXT> oh3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kh3) ipChange.ipc$dispatch("4fa8f32a", new Object[]{this, kk4Var, oh3Var});
        }
        this.f22664a = kk4Var;
        this.b = oh3Var;
        return this;
    }

    @Override // tb.kk4
    public void onProgressUpdate(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fae6024", new Object[]{this, new Float(f)});
        } else if (this.b.h().a(4)) {
            this.b.F(this.f22664a, f);
        } else {
            this.f22664a.onProgressUpdate(f);
        }
    }

    public String toString() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(jjo.a(kh3.class));
        sb.append("[cxt-id:");
        if (getContext() != null) {
            i = getContext().d();
        }
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }
}
