package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import kotlin.Metadata;
import tb.a07;
import tb.eme;
import tb.hc1;
import tb.pg1;
import tb.tep;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0005J\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\u0005J\r\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\bJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0005J\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0005J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\rJ\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0011\u0010\"\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b!\u0010\rR\u0011\u0010$\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b#\u0010\r¨\u0006%"}, d2 = {"Landroidx/collection/CircularIntArray;", "", "", "minCapacity", "<init>", "(I)V", "Ltb/xhv;", "doubleCapacity", "()V", "element", "addFirst", "addLast", "popFirst", "()I", "popLast", pg1.ATOM_EXT_clear, "count", "removeFromStart", "removeFromEnd", "index", "get", "(I)I", "size", "", "isEmpty", "()Z", "", tep.KEY_UNIFORM_RESULT, "[I", eme.IMAGE_TYPE_HEAD, TLogTracker.LEVEL_INFO, "tail", "capacityBitmask", "getFirst", "first", "getLast", "last", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class CircularIntArray {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int capacityBitmask;
    private int[] elements;
    private int head;
    private int tail;

    public CircularIntArray() {
        this(0, 1, null);
    }

    private final void doubleCapacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caf84ab2", new Object[]{this});
            return;
        }
        int[] iArr = this.elements;
        int length = iArr.length;
        int i = this.head;
        int i2 = length - i;
        int i3 = length << 1;
        if (i3 >= 0) {
            int[] iArr2 = new int[i3];
            hc1.f(iArr, iArr2, 0, i, length);
            hc1.f(this.elements, iArr2, i2, 0, this.head);
            this.elements = iArr2;
            this.head = 0;
            this.tail = length;
            this.capacityBitmask = i3 - 1;
            return;
        }
        throw new RuntimeException("Max array capacity exceeded");
    }

    public final void addLast(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cf2e6e5", new Object[]{this, new Integer(i)});
            return;
        }
        int[] iArr = this.elements;
        int i2 = this.tail;
        iArr[i2] = i;
        int i3 = this.capacityBitmask & (i2 + 1);
        this.tail = i3;
        if (i3 == this.head) {
            doubleCapacity();
        }
    }

    public final void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            this.tail = this.head;
        }
    }

    public final int get(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72fc15b9", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i >= 0 && i < size()) {
            return this.elements[this.capacityBitmask & (this.head + i)];
        }
        IpChange ipChange2 = CollectionPlatformUtils.$ipChange;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final int getFirst() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("748f074", new Object[]{this})).intValue();
        }
        int i = this.head;
        if (i != this.tail) {
            return this.elements[i];
        }
        IpChange ipChange2 = CollectionPlatformUtils.$ipChange;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final int getLast() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("24cb1986", new Object[]{this})).intValue();
        }
        int i = this.head;
        int i2 = this.tail;
        if (i != i2) {
            return this.elements[this.capacityBitmask & (i2 - 1)];
        }
        IpChange ipChange2 = CollectionPlatformUtils.$ipChange;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final int popFirst() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4c50f7d9", new Object[]{this})).intValue();
        }
        int i = this.head;
        if (i != this.tail) {
            int i2 = this.elements[i];
            this.head = this.capacityBitmask & (i + 1);
            return i2;
        }
        IpChange ipChange2 = CollectionPlatformUtils.$ipChange;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final int popLast() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9aa21181", new Object[]{this})).intValue();
        }
        int i = this.head;
        int i2 = this.tail;
        if (i != i2) {
            int i3 = this.capacityBitmask & (i2 - 1);
            int i4 = this.elements[i3];
            this.tail = i3;
            return i4;
        }
        IpChange ipChange2 = CollectionPlatformUtils.$ipChange;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final void removeFromEnd(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("706b1fcf", new Object[]{this, new Integer(i)});
        } else if (i > 0) {
            if (i <= size()) {
                this.tail = this.capacityBitmask & (this.tail - i);
            } else {
                IpChange ipChange2 = CollectionPlatformUtils.$ipChange;
                throw new ArrayIndexOutOfBoundsException();
            }
        }
    }

    public final void removeFromStart(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d789d28", new Object[]{this, new Integer(i)});
        } else if (i > 0) {
            if (i <= size()) {
                this.head = this.capacityBitmask & (this.head + i);
            } else {
                IpChange ipChange2 = CollectionPlatformUtils.$ipChange;
                throw new ArrayIndexOutOfBoundsException();
            }
        }
    }

    public final int size() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
        }
        return (this.tail - this.head) & this.capacityBitmask;
    }

    public CircularIntArray(int i) {
        boolean z = false;
        if (!(i >= 1)) {
            RuntimeHelpersKt.throwIllegalArgumentException("capacity must be >= 1");
        }
        if (!(i <= 1073741824 ? true : z)) {
            RuntimeHelpersKt.throwIllegalArgumentException("capacity must be <= 2^30");
        }
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        this.capacityBitmask = i - 1;
        this.elements = new int[i];
    }

    public final void addFirst(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c69a2d", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.capacityBitmask & (this.head - 1);
        this.head = i2;
        this.elements[i2] = i;
        if (i2 == this.tail) {
            doubleCapacity();
        }
    }

    public final boolean isEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        }
        return this.head == this.tail;
    }

    public /* synthetic */ CircularIntArray(int i, int i2, a07 a07Var) {
        this((i2 & 1) != 0 ? 8 : i);
    }
}
