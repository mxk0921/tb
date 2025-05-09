package androidx.collection;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.hc1;
import tb.ic1;
import tb.pg1;
import tb.tep;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u001f\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\b\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u000f\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0011J\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0012J\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u0005J\u0015\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u0005J\u0018\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\u0014\u0010\u0005J\u0018\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\u001d\u0010\u0005J\u0015\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\tJ\u0015\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001f\u0010\u0013J\u0015\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u001f\u0010\u0012J\u0018\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0086\u0002¢\u0006\u0004\b\u001d\u0010\u0016J\u0018\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u001d\u0010\u0015J\u0017\u0010 \u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J!\u0010$\u001a\u00020\u000b2\b\b\u0001\u0010\"\u001a\u00020\u00022\b\b\u0001\u0010#\u001a\u00020\u0002¢\u0006\u0004\b$\u0010\fJ\u0015\u0010%\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b%\u0010\u0013J\u0015\u0010%\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b%\u0010\u0012J\"\u0010&\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u000b¢\u0006\u0004\b(\u0010\u0018J\r\u0010)\u001a\u00020\u000b¢\u0006\u0004\b)\u0010\u0018R\u0012\u0010\u001b\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Landroidx/collection/MutableIntList;", "Landroidx/collection/IntList;", "", "initialCapacity", "<init>", "(I)V", "element", "", "add", "(I)Z", "index", "Ltb/xhv;", "(II)V", "", tep.KEY_UNIFORM_RESULT, "addAll", "(I[I)Z", "(ILandroidx/collection/IntList;)Z", "(Landroidx/collection/IntList;)Z", "([I)Z", "plusAssign", "(Landroidx/collection/IntList;)V", "([I)V", pg1.ATOM_EXT_clear, "()V", "minCapacity", "trim", "capacity", "ensureCapacity", "minusAssign", "remove", "removeAll", "removeAt", "(I)I", "start", "end", "removeRange", "retainAll", "set", "(II)I", "sort", "sortDescending", "getCapacity", "()I", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class MutableIntList extends IntList {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public MutableIntList() {
        this(0, 1, null);
    }

    public static /* synthetic */ Object ipc$super(MutableIntList mutableIntList, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/collection/MutableIntList");
    }

    public final boolean add(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b381435f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        ensureCapacity(this._size + 1);
        int[] iArr = this.content;
        int i2 = this._size;
        iArr[i2] = i;
        this._size = i2 + 1;
        return true;
    }

    public final boolean addAll(int i, int[] iArr) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bab3062e", new Object[]{this, new Integer(i), iArr})).booleanValue();
        }
        ckf.g(iArr, tep.KEY_UNIFORM_RESULT);
        if (i < 0 || i > (i2 = this._size)) {
            throw new IndexOutOfBoundsException("Index " + i + " must be in 0.." + this._size);
        } else if (iArr.length == 0) {
            return false;
        } else {
            ensureCapacity(i2 + iArr.length);
            int[] iArr2 = this.content;
            int i3 = this._size;
            if (i != i3) {
                hc1.f(iArr2, iArr2, iArr.length + i, i, i3);
            }
            hc1.j(iArr, iArr2, i, 0, 0, 12, null);
            this._size += iArr.length;
            return true;
        }
    }

    public final void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            this._size = 0;
        }
    }

    public final int getCapacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e903eaa", new Object[]{this})).intValue();
        }
        return this.content.length;
    }

    public final void minusAssign(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3230d53d", new Object[]{this, new Integer(i)});
        } else {
            remove(i);
        }
    }

    public final void plusAssign(IntList intList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b505114f", new Object[]{this, intList});
            return;
        }
        ckf.g(intList, tep.KEY_UNIFORM_RESULT);
        addAll(this._size, intList);
    }

    public final boolean removeAll(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20c78696", new Object[]{this, iArr})).booleanValue();
        }
        ckf.g(iArr, tep.KEY_UNIFORM_RESULT);
        int i = this._size;
        for (int i2 : iArr) {
            remove(i2);
        }
        return i != this._size;
    }

    public final int removeAt(int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1b0bddd8", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i < 0 || i >= (i2 = this._size)) {
            throw new IndexOutOfBoundsException("Index " + i + " must be in 0.." + (this._size - 1));
        }
        int[] iArr = this.content;
        int i3 = iArr[i];
        if (i != i2 - 1) {
            hc1.f(iArr, iArr, i, 1 + i, i2);
        }
        this._size--;
        return i3;
    }

    public final void removeRange(int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7036b80", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i < 0 || i > (i3 = this._size) || i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("Start (" + i + ") and end (" + i2 + ") must be in 0.." + this._size);
        } else if (i2 < i) {
            throw new IllegalArgumentException("Start (" + i + ") is more than end (" + i2 + ')');
        } else if (i2 != i) {
            if (i2 < i3) {
                int[] iArr = this.content;
                hc1.f(iArr, iArr, i, i2, i3);
            }
            this._size -= i2 - i;
        }
    }

    public final boolean retainAll(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("419d8f35", new Object[]{this, iArr})).booleanValue();
        }
        ckf.g(iArr, tep.KEY_UNIFORM_RESULT);
        int i = this._size;
        int[] iArr2 = this.content;
        for (int i2 = i - 1; -1 < i2; i2--) {
            int i3 = iArr2[i2];
            int length = iArr.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    i4 = -1;
                    break;
                } else if (iArr[i4] == i3) {
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 < 0) {
                removeAt(i2);
            }
        }
        return i != this._size;
    }

    public final void sort() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62fb7b25", new Object[]{this});
            return;
        }
        int i = this._size;
        if (i != 0) {
            hc1.x(this.content, 0, i);
        }
    }

    public final void sortDescending() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a588bd", new Object[]{this});
            return;
        }
        int i = this._size;
        if (i != 0) {
            ic1.b0(this.content, 0, i);
        }
    }

    public final void trim(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e052507a", new Object[]{this, new Integer(i)});
            return;
        }
        int max = Math.max(i, this._size);
        int[] iArr = this.content;
        if (iArr.length > max) {
            int[] copyOf = Arrays.copyOf(iArr, max);
            ckf.f(copyOf, "copyOf(this, newSize)");
            this.content = copyOf;
        }
    }

    public /* synthetic */ MutableIntList(int i, int i2, a07 a07Var) {
        this((i2 & 1) != 0 ? 16 : i);
    }

    public static /* synthetic */ void trim$default(MutableIntList mutableIntList, int i, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccd54c3f", new Object[]{mutableIntList, new Integer(i), new Integer(i2), obj});
            return;
        }
        if ((i2 & 1) != 0) {
            i = mutableIntList._size;
        }
        mutableIntList.trim(i);
    }

    public final void ensureCapacity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4ce3744", new Object[]{this, new Integer(i)});
            return;
        }
        int[] iArr = this.content;
        if (iArr.length < i) {
            int[] copyOf = Arrays.copyOf(iArr, Math.max(i, (iArr.length * 3) / 2));
            ckf.f(copyOf, "copyOf(this, newSize)");
            this.content = copyOf;
        }
    }

    public final void minusAssign(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13f27414", new Object[]{this, iArr});
            return;
        }
        ckf.g(iArr, tep.KEY_UNIFORM_RESULT);
        for (int i : iArr) {
            remove(i);
        }
    }

    public final void plusAssign(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32e52a3e", new Object[]{this, iArr});
            return;
        }
        ckf.g(iArr, tep.KEY_UNIFORM_RESULT);
        addAll(this._size, iArr);
    }

    public final int set(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dfbc49fc", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        if (i < 0 || i >= this._size) {
            throw new IndexOutOfBoundsException("set index " + i + " must be between 0 .. " + (this._size - 1));
        }
        int[] iArr = this.content;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    public MutableIntList(int i) {
        super(i, null);
    }

    public final void plusAssign(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d859b1d3", new Object[]{this, new Integer(i)});
        } else {
            add(i);
        }
    }

    public final boolean remove(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebab395c", new Object[]{this, new Integer(i)})).booleanValue();
        }
        int indexOf = indexOf(i);
        if (indexOf < 0) {
            return false;
        }
        removeAt(indexOf);
        return true;
    }

    public final void add(int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bca79b08", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i < 0 || i > (i3 = this._size)) {
            throw new IndexOutOfBoundsException("Index " + i + " must be in 0.." + this._size);
        } else {
            ensureCapacity(i3 + 1);
            int[] iArr = this.content;
            int i4 = this._size;
            if (i != i4) {
                hc1.f(iArr, iArr, i + 1, i, i4);
            }
            iArr[i] = i2;
            this._size++;
        }
    }

    public final void minusAssign(IntList intList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dae51b9", new Object[]{this, intList});
            return;
        }
        ckf.g(intList, tep.KEY_UNIFORM_RESULT);
        int[] iArr = intList.content;
        int i = intList._size;
        for (int i2 = 0; i2 < i; i2++) {
            remove(iArr[i2]);
        }
    }

    public final boolean removeAll(IntList intList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d1fa07f", new Object[]{this, intList})).booleanValue();
        }
        ckf.g(intList, tep.KEY_UNIFORM_RESULT);
        int i = this._size;
        int i2 = intList._size - 1;
        if (i2 >= 0) {
            int i3 = 0;
            while (true) {
                remove(intList.get(i3));
                if (i3 == i2) {
                    break;
                }
                i3++;
            }
        }
        return i != this._size;
    }

    public final boolean retainAll(IntList intList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70982c80", new Object[]{this, intList})).booleanValue();
        }
        ckf.g(intList, tep.KEY_UNIFORM_RESULT);
        int i = this._size;
        int[] iArr = this.content;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!intList.contains(iArr[i2])) {
                removeAt(i2);
            }
        }
        return i != this._size;
    }

    public final boolean addAll(int i, IntList intList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("871921e7", new Object[]{this, new Integer(i), intList})).booleanValue();
        }
        ckf.g(intList, tep.KEY_UNIFORM_RESULT);
        if (i < 0 || i > this._size) {
            throw new IndexOutOfBoundsException("Index " + i + " must be in 0.." + this._size);
        } else if (intList.isEmpty()) {
            return false;
        } else {
            ensureCapacity(this._size + intList._size);
            int[] iArr = this.content;
            int i2 = this._size;
            if (i != i2) {
                hc1.f(iArr, iArr, intList._size + i, i, i2);
            }
            hc1.f(intList.content, iArr, i, 0, intList._size);
            this._size += intList._size;
            return true;
        }
    }

    public final boolean addAll(IntList intList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8599161c", new Object[]{this, intList})).booleanValue();
        }
        ckf.g(intList, tep.KEY_UNIFORM_RESULT);
        return addAll(this._size, intList);
    }

    public final boolean addAll(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ab2d719", new Object[]{this, iArr})).booleanValue();
        }
        ckf.g(iArr, tep.KEY_UNIFORM_RESULT);
        return addAll(this._size, iArr);
    }
}
