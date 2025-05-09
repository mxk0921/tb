package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class dwl implements x3c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public x3c f18113a;
    public ArrayList<dj8> b = new ArrayList<>();

    static {
        t2o.a(502268340);
        t2o.a(502268337);
    }

    @Override // tb.x3c
    public void a(dj8 dj8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("651c0be", new Object[]{this, dj8Var});
            return;
        }
        ckf.g(dj8Var, "event");
        if (this.f18113a != null) {
            if (this.b.size() > 0) {
                for (dj8 dj8Var2 : i04.B0(this.b)) {
                    x3c x3cVar = this.f18113a;
                    ckf.d(x3cVar);
                    x3cVar.a(dj8Var2);
                }
                this.b = new ArrayList<>();
            }
            x3c x3cVar2 = this.f18113a;
            ckf.d(x3cVar2);
            x3cVar2.a(dj8Var);
        } else if (this.b.size() < 1000) {
            this.b.add(dj8Var);
        }
    }

    public final void b(x3c x3cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cccaed17", new Object[]{this, x3cVar});
            return;
        }
        ckf.g(x3cVar, "eventSender");
        this.f18113a = x3cVar;
    }
}
