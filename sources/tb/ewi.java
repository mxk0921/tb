package tb;

import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import tb.uw7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ewi implements q0c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final lh3<uw7> f18850a = new ww7(new pw7(new ow7(null)));

    static {
        t2o.a(478151175);
        t2o.a(478151170);
    }

    @Override // tb.q0c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afee9bdb", new Object[]{this});
        }
    }

    @Override // tb.q0c
    public boolean b(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58ca92d1", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)})).booleanValue();
        }
        return this.f18850a.b(new uw7.a().e(kw7.k(recyclerView, i)).f(kw7.k(recyclerView, i2)).g(kw7.j(recyclerView)).d());
    }

    @Override // tb.q0c
    public void c(RecyclerView recyclerView, t0c t0cVar, String str, String str2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26344d98", new Object[]{this, recyclerView, t0cVar, str, str2, new Integer(i), new Integer(i2)});
        }
    }

    @Override // tb.q0c
    public boolean d(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d490ae88", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)})).booleanValue();
        }
        return false;
    }
}
