package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class cnh<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f17177a;
    public final LinkedList<T> b = new LinkedList<>();

    public cnh(int i) {
        this.f17177a = i;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            this.b.clear();
        }
    }

    public T b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("bb5c862c", new Object[]{this, new Integer(i)});
        }
        if (i < 0 || i >= j()) {
            return null;
        }
        return this.b.get(i);
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e903eaa", new Object[]{this})).intValue();
        }
        return this.f17177a;
    }

    public T d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("99af18d1", new Object[]{this});
        }
        try {
            return this.b.getFirst();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    public T e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("1fe5f5ff", new Object[]{this});
        }
        try {
            return this.b.getLast();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    public Iterator<T> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Iterator) ipChange.ipc$dispatch("8f345362", new Object[]{this});
        }
        return this.b.iterator();
    }

    public void g(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29ab6e72", new Object[]{this, t});
            return;
        }
        this.b.remove(t);
        i();
        this.b.addFirst(t);
    }

    public void h(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a906928", new Object[]{this, t});
            return;
        }
        this.b.remove(t);
        i();
        this.b.addLast(t);
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f066a59d", new Object[]{this});
        } else if (j() > this.f17177a - 1) {
            this.b.removeLast();
        }
    }

    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
        }
        return this.b.size();
    }
}
