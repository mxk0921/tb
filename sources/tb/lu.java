package tb;

import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class lu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(478150845);
    }

    public abstract boolean a();

    public abstract void b();

    public abstract void c(ly<RecyclerView> lyVar);

    public abstract void d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract void h();

    public abstract void i();

    public abstract void j(String str);

    public abstract void k();

    public void l(khd khdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d24e4a6", new Object[]{this, khdVar});
        }
    }

    public void m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45ec7d9d", new Object[]{this, new Integer(i)});
        }
    }
}
