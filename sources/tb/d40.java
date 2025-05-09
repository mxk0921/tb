package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend4.manager.weex2.RecommendWeex2ContainerView;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class d40 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final a f17561a;
    public int b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
    }

    static {
        t2o.a(729810014);
    }

    public d40(Context context, a aVar) {
        this.f17561a = aVar;
    }

    public abstract void a();

    public void b(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23b3b231", new Object[]{this, str, obj});
        } else {
            ((RecommendWeex2ContainerView.a) this.f17561a).a(str, obj);
        }
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6efbcb8e", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public abstract View d();

    public void e(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb58b7e4", new Object[]{this, map});
        }
    }

    public void f(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a82be2f7", new Object[]{this, set});
        }
    }

    public abstract void g();

    public abstract void h();

    public abstract void i(String str);

    public void j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c14273c", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b844117", new Object[]{this, new Integer(i)});
        }
    }

    public void l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd410574", new Object[]{this, new Integer(i)});
        }
    }

    public abstract void m(long j);

    public void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb826938", new Object[]{this, new Boolean(z)});
        }
    }

    public void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("337d76ab", new Object[]{this, str});
        }
    }

    public void p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b32f80ad", new Object[]{this, new Integer(i)});
        }
    }
}
