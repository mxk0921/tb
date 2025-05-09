package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.eme;
import tb.hc1;
import tb.pg1;
import tb.tep;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\tJ\u0015\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0006J\u0015\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0006J\u0018\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010!R\u0016\u0010#\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010!R\u0011\u0010%\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b$\u0010\u000fR\u0011\u0010'\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b&\u0010\u000f¨\u0006("}, d2 = {"Landroidx/collection/CircularArray;", "E", "", "", "minCapacity", "<init>", "(I)V", "Ltb/xhv;", "doubleCapacity", "()V", "element", "addFirst", "(Ljava/lang/Object;)V", "addLast", "popFirst", "()Ljava/lang/Object;", "popLast", pg1.ATOM_EXT_clear, "count", "removeFromStart", "removeFromEnd", "index", "get", "(I)Ljava/lang/Object;", "size", "()I", "", "isEmpty", "()Z", "", tep.KEY_UNIFORM_RESULT, "[Ljava/lang/Object;", eme.IMAGE_TYPE_HEAD, TLogTracker.LEVEL_INFO, "tail", "capacityBitmask", "getFirst", "first", "getLast", "last", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class CircularArray<E> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int capacityBitmask;
    private E[] elements;
    private int head;
    private int tail;

    public CircularArray() {
        this(0, 1, null);
    }

    private final void doubleCapacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caf84ab2", new Object[]{this});
            return;
        }
        E[] eArr = this.elements;
        int length = eArr.length;
        int i = this.head;
        int i2 = length - i;
        int i3 = length << 1;
        if (i3 >= 0) {
            E[] eArr2 = (E[]) new Object[i3];
            hc1.h(eArr, eArr2, 0, i, length);
            hc1.h(this.elements, eArr2, i2, 0, this.head);
            this.elements = eArr2;
            this.head = 0;
            this.tail = length;
            this.capacityBitmask = i3 - 1;
            return;
        }
        throw new RuntimeException("Max array capacity exceeded");
    }

    public final void addFirst(E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e9fc1f2", new Object[]{this, e});
            return;
        }
        int i = this.capacityBitmask & (this.head - 1);
        this.head = i;
        this.elements[i] = e;
        if (i == this.tail) {
            doubleCapacity();
        }
    }

    public final void addLast(E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bef7c3a", new Object[]{this, e});
            return;
        }
        E[] eArr = this.elements;
        int i = this.tail;
        eArr[i] = e;
        int i2 = this.capacityBitmask & (i + 1);
        this.tail = i2;
        if (i2 == this.head) {
            doubleCapacity();
        }
    }

    public final void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            removeFromStart(size());
        }
    }

    public final E get(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("bb5c862c", new Object[]{this, new Integer(i)});
        }
        if (i < 0 || i >= size()) {
            IpChange ipChange2 = CollectionPlatformUtils.$ipChange;
            throw new ArrayIndexOutOfBoundsException();
        }
        E e = this.elements[this.capacityBitmask & (this.head + i)];
        ckf.d(e);
        return e;
    }

    public final E getFirst() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("99af18d1", new Object[]{this});
        }
        int i = this.head;
        if (i != this.tail) {
            E e = this.elements[i];
            ckf.d(e);
            return e;
        }
        IpChange ipChange2 = CollectionPlatformUtils.$ipChange;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final E getLast() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("1fe5f5ff", new Object[]{this});
        }
        int i = this.head;
        int i2 = this.tail;
        if (i != i2) {
            E e = this.elements[this.capacityBitmask & (i2 - 1)];
            ckf.d(e);
            return e;
        }
        IpChange ipChange2 = CollectionPlatformUtils.$ipChange;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final E popFirst() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("9064280c", new Object[]{this});
        }
        int i = this.head;
        if (i != this.tail) {
            E[] eArr = this.elements;
            E e = eArr[i];
            eArr[i] = null;
            this.head = this.capacityBitmask & (i + 1);
            return e;
        }
        IpChange ipChange2 = CollectionPlatformUtils.$ipChange;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final void removeFromEnd(int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("706b1fcf", new Object[]{this, new Integer(i)});
        } else if (i > 0) {
            if (i <= size()) {
                int i3 = this.tail;
                if (i < i3) {
                    i2 = i3 - i;
                }
                for (int i4 = i2; i4 < i3; i4++) {
                    this.elements[i4] = null;
                }
                int i5 = this.tail;
                int i6 = i5 - i2;
                int i7 = i - i6;
                this.tail = i5 - i6;
                if (i7 > 0) {
                    int length = this.elements.length;
                    this.tail = length;
                    int i8 = length - i7;
                    for (int i9 = i8; i9 < length; i9++) {
                        this.elements[i9] = null;
                    }
                    this.tail = i8;
                    return;
                }
                return;
            }
            IpChange ipChange2 = CollectionPlatformUtils.$ipChange;
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public final void removeFromStart(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d789d28", new Object[]{this, new Integer(i)});
        } else if (i > 0) {
            if (i <= size()) {
                int length = this.elements.length;
                int i2 = this.head;
                if (i < length - i2) {
                    length = i2 + i;
                }
                while (i2 < length) {
                    this.elements[i2] = null;
                    i2++;
                }
                int i3 = this.head;
                int i4 = length - i3;
                int i5 = i - i4;
                this.head = this.capacityBitmask & (i3 + i4);
                if (i5 > 0) {
                    for (int i6 = 0; i6 < i5; i6++) {
                        this.elements[i6] = null;
                    }
                    this.head = i5;
                    return;
                }
                return;
            }
            IpChange ipChange2 = CollectionPlatformUtils.$ipChange;
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public final int size() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
        }
        return (this.tail - this.head) & this.capacityBitmask;
    }

    public CircularArray(int i) {
        boolean z = false;
        if (!(i >= 1)) {
            RuntimeHelpersKt.throwIllegalArgumentException("capacity must be >= 1");
        }
        if (!(i <= 1073741824 ? true : z)) {
            RuntimeHelpersKt.throwIllegalArgumentException("capacity must be <= 2^30");
        }
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        this.capacityBitmask = i - 1;
        this.elements = (E[]) new Object[i];
    }

    public final E popLast() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("cd049364", new Object[]{this});
        }
        int i = this.head;
        int i2 = this.tail;
        if (i != i2) {
            int i3 = this.capacityBitmask & (i2 - 1);
            E[] eArr = this.elements;
            E e = eArr[i3];
            eArr[i3] = null;
            this.tail = i3;
            return e;
        }
        IpChange ipChange2 = CollectionPlatformUtils.$ipChange;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final boolean isEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        }
        return this.head == this.tail;
    }

    public /* synthetic */ CircularArray(int i, int i2, a07 a07Var) {
        this((i2 & 1) != 0 ? 8 : i);
    }
}
