package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.component.data.Component;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class yg3<T extends Component> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View f32069a;
    public final Context b;
    public T c;

    static {
        t2o.a(758120466);
    }

    public yg3(Context context) {
        this.b = context;
    }

    public abstract void a();

    public boolean b(Component component) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce618b4f", new Object[]{this, component})).booleanValue();
        }
        this.c = component;
        a();
        f();
        return true;
    }

    public abstract View c();

    public View d(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("db7f6c21", new Object[]{this, t});
        }
        this.c = t;
        View c = c();
        this.f32069a = c;
        return c;
    }

    public void e() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("670ccebf", new Object[]{this});
            return;
        }
        View view = this.f32069a;
        if (view != null) {
            T t = this.c;
            if (!(t == null || t.h() == Component.Status.DISABLE)) {
                z = true;
            }
            view.setEnabled(z);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2327922", new Object[]{this});
            return;
        }
        g();
        e();
    }

    public final void g() {
        T t;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3c73370", new Object[]{this});
        } else if (this.f32069a != null && (t = this.c) != null) {
            Component.Status h = t.h();
            View view = this.f32069a;
            if (h == Component.Status.HIDDEN) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }
}
