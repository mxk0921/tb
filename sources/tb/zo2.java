package tb;

import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zo2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final h6c<RecyclerView> f32905a;
    public final ap2 b;
    public final wo2 c;
    public final yo2 d;

    static {
        t2o.a(486539638);
    }

    public zo2(cfc cfcVar, h6c<RecyclerView> h6cVar) {
        this.f32905a = h6cVar;
        ap2 ap2Var = new ap2(cfcVar);
        this.b = ap2Var;
        wo2 wo2Var = new wo2(cfcVar);
        this.c = wo2Var;
        yo2 yo2Var = new yo2(cfcVar);
        this.d = yo2Var;
        h6cVar.h(ap2Var);
        h6cVar.y(wo2Var);
        h6cVar.h(yo2Var);
        h6cVar.M(yo2Var);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.f32905a.v(this.b);
        this.f32905a.q(this.c);
        this.f32905a.v(this.d);
        this.f32905a.k(this.d);
    }
}
