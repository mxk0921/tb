package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.runtime.func_vm.expr.StackOverflowException;
import com.taobao.android.nanocompose.runtime.func_vm.expr.StackUnderflowException;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class chz<E> implements Iterable<E>, rzf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final int f17065a;
    public final Object[] b;
    public int c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(598737330);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b implements Iterator<E>, rzf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f17066a;
        public final /* synthetic */ chz<E> b;

        public b(chz<E> chzVar) {
            this.b = chzVar;
            this.f17066a = chzVar.b() - 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("291ab8", new Object[]{this})).booleanValue();
            }
            if (this.f17066a >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public E next() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (E) ipChange.ipc$dispatch("b9bf2c78", new Object[]{this});
            }
            if (hasNext()) {
                Object[] a2 = chz.a(this.b);
                int i = this.f17066a;
                this.f17066a = i - 1;
                return (E) a2[i];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("41689b0b", new Object[]{this});
                return;
            }
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    static {
        t2o.a(598737329);
    }

    public chz(int i) {
        this.f17065a = i;
        this.b = new Object[i];
    }

    public static final /* synthetic */ Object[] a(chz chzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("7dfb3183", new Object[]{chzVar});
        }
        return chzVar.b;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae43b971", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ffb6ee4", new Object[]{this})).booleanValue();
        }
        if (this.c >= this.f17065a) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8421800f", new Object[]{this})).booleanValue();
        }
        return true ^ isEmpty();
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1431f003", new Object[]{this})).booleanValue();
        }
        return true ^ c();
    }

    public final boolean isEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        }
        if (this.c == 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Iterator) ipChange.ipc$dispatch("8f345362", new Object[]{this});
        }
        return new b(this);
    }

    public final E peek() throws EmptyStackException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("85bdd710", new Object[]{this});
        }
        int i = this.c;
        if (i != 0) {
            return (E) this.b[i - 1];
        }
        throw new EmptyStackException();
    }

    public final E pop() throws StackUnderflowException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("b39ebda", new Object[]{this});
        }
        int i = this.c;
        if (i != 0) {
            int i2 = i - 1;
            this.c = i2;
            Object[] objArr = this.b;
            E e = (E) objArr[i2];
            objArr[i2] = null;
            return e;
        }
        throw new StackUnderflowException("Cannot pop from an empty stack.");
    }

    public final void push(E e) throws StackOverflowException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b5b003d", new Object[]{this, e});
            return;
        }
        int i = this.c;
        if (i < this.f17065a) {
            this.b[i] = e;
            this.c = i + 1;
            return;
        }
        throw new StackOverflowException("NCExprStack stack overflow.");
    }

    public final int size() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public /* synthetic */ chz(int i, int i2, a07 a07Var) {
        this((i2 & 1) != 0 ? 512 : i);
    }
}
