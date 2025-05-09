package tb;

import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import tb.h6c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xrn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final h6c<RecyclerView> f31556a;
    public btn b;

    static {
        t2o.a(486539647);
    }

    public xrn(cfc cfcVar, h6c<RecyclerView> h6cVar) {
        this.f31556a = h6cVar;
        btn btnVar = new btn(cfcVar);
        this.b = btnVar;
        b(btnVar, h6cVar);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.f31556a.v(this.b);
        this.b = null;
    }

    public final void b(h6c.c<RecyclerView> cVar, h6c<RecyclerView> h6cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49af5e98", new Object[]{this, cVar, h6cVar});
        } else {
            h6cVar.h(cVar);
        }
    }
}
