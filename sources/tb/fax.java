package tb;

import android.view.View;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.ui.widget.wheel.WheelView;
import java.util.LinkedList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class fax {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<View> f19159a;
    public List<View> b;
    public final WheelView c;

    static {
        t2o.a(724566056);
    }

    public fax(WheelView wheelView) {
        this.c = wheelView;
    }

    public final List<View> a(View view, List<View> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("43188d51", new Object[]{this, view, list});
        }
        if (list == null) {
            list = new LinkedList<>();
        }
        list.add(view);
        return list;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c823e69b", new Object[]{this});
            return;
        }
        List<View> list = this.f19159a;
        if (list != null) {
            list.clear();
        }
        List<View> list2 = this.b;
        if (list2 != null) {
            list2.clear();
        }
    }

    public final View c(List<View> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("22b006d7", new Object[]{this, list});
        }
        if (list == null || list.size() <= 0) {
            return null;
        }
        View view = list.get(0);
        list.remove(0);
        return view;
    }

    public View d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("962d2cd3", new Object[]{this});
        }
        return c(this.b);
    }

    public View e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7844fd2", new Object[]{this});
        }
        return c(this.f19159a);
    }

    public int f(LinearLayout linearLayout, int i, ipf ipfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0c396e5", new Object[]{this, linearLayout, new Integer(i), ipfVar})).intValue();
        }
        int i2 = i;
        int i3 = 0;
        while (i3 < linearLayout.getChildCount()) {
            if (!ipfVar.a(i2)) {
                g(linearLayout.getChildAt(i3), i2);
                linearLayout.removeViewAt(i3);
                if (i3 == 0) {
                    i++;
                }
            } else {
                i3++;
            }
            i2++;
        }
        return i;
    }

    public final void g(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29446750", new Object[]{this, view, new Integer(i)});
            return;
        }
        int b = this.c.getViewAdapter().b();
        if ((i < 0 || i >= b) && !this.c.isCyclic()) {
            this.b = a(view, this.b);
            return;
        }
        while (i < 0) {
            i += b;
        }
        int i2 = i % b;
        this.f19159a = a(view, this.f19159a);
    }
}
