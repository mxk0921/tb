package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class sb1<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<T> f27920a = new ArrayList<>(4);

    static {
        t2o.a(985661613);
    }

    public void a(int i, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dab3277", new Object[]{this, new Integer(i), t});
        } else {
            this.f27920a.add(i, t);
        }
    }

    public T b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("bb5c862c", new Object[]{this, new Integer(i)});
        }
        return this.f27920a.get(i);
    }

    public List<T> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("85f5d54c", new Object[]{this});
        }
        return this.f27920a;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        }
        return this.f27920a.isEmpty();
    }

    public T e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("85bdd710", new Object[]{this});
        }
        ArrayList<T> arrayList = this.f27920a;
        return arrayList.get(arrayList.size() - 1);
    }

    public T f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("b39ebda", new Object[]{this});
        }
        ArrayList<T> arrayList = this.f27920a;
        return arrayList.remove(arrayList.size() - 1);
    }

    public void g(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b5b003d", new Object[]{this, t});
        } else {
            this.f27920a.add(t);
        }
    }

    public T h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("e3aab8da", new Object[]{this, new Integer(i)});
        }
        return this.f27920a.remove(i);
    }

    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
        }
        return this.f27920a.size();
    }
}
