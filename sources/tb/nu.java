package tb;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import tb.fae;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class nu<K extends View, T extends fae> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596425);
    }

    public ViewGroup.LayoutParams a(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup.LayoutParams) ipChange.ipc$dispatch("d55d0150", new Object[]{this, dXWidgetNode});
        }
        return new ViewGroup.LayoutParams(dXWidgetNode.getLayoutWidth(), dXWidgetNode.getLayoutHeight());
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b49052a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public abstract lrb c(tn6 tn6Var);

    public abstract wij d(tn6 tn6Var);

    public abstract T e();

    public K f(tn6 tn6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (K) ((View) ipChange.ipc$dispatch("ad1e3673", new Object[]{this, tn6Var}));
        }
        return null;
    }

    public K g(tn6 tn6Var, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (K) ((View) ipChange.ipc$dispatch("a998b616", new Object[]{this, tn6Var, t}));
        }
        return f(tn6Var);
    }

    public abstract void h(tn6 tn6Var);

    public abstract void i(tn6 tn6Var);

    public boolean j(tn6 tn6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f966a59b", new Object[]{this, tn6Var})).booleanValue();
        }
        return false;
    }

    public boolean k(ViewGroup.LayoutParams layoutParams, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56e832f6", new Object[]{this, layoutParams, dXWidgetNode})).booleanValue();
        }
        return true;
    }

    public abstract void l(tn6 tn6Var, K k, T t, T t2);
}
