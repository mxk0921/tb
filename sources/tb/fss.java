package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.widget.FlowLayout;
import java.util.HashSet;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class fss<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<T> f19513a;
    public a b;
    public final HashSet<Integer> c = new HashSet<>();
    public b d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
        void onChanged();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface b {
        void onViewChanged();
    }

    public fss(List<T> list) {
        this.f19513a = list;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        List<T> list = this.f19513a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public T b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)});
        }
        List<T> list = this.f19513a;
        if (list != null) {
            return list.get(i);
        }
        return null;
    }

    public HashSet<Integer> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashSet) ipChange.ipc$dispatch("143fed1c", new Object[]{this});
        }
        return this.c;
    }

    public abstract View d(FlowLayout flowLayout, int i, T t);

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd821ca8", new Object[]{this});
        } else {
            this.b.onChanged();
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed74b6cd", new Object[]{this});
        } else {
            this.d.onViewChanged();
        }
    }

    public void g(List<T> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ddf4a4", new Object[]{this, list});
        } else {
            this.f19513a = list;
        }
    }

    public void h(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c1596dd", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }

    public void i(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70f313e7", new Object[]{this, bVar});
        } else {
            this.d = bVar;
        }
    }

    public boolean j(int i, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c5a4e7f", new Object[]{this, new Integer(i), t})).booleanValue();
        }
        return false;
    }
}
