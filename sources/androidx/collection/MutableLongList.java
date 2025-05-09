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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\b!\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\t\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\rJ\u001f\u0010\u0010\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0010\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0012J\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0013J\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0017J\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u0005J\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u0005J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\u0015\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\u001f\u0010\u001eJ\u0015\u0010 \u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b \u0010\nJ\u0015\u0010!\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b!\u0010\u0014J\u0015\u0010!\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b!\u0010\u0013J\u0018\u0010\u001f\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086\u0002¢\u0006\u0004\b\u001f\u0010\u0017J\u0018\u0010\u001f\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u001f\u0010\u0016J\u0017\u0010\"\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#J!\u0010&\u001a\u00020\f2\b\b\u0001\u0010$\u001a\u00020\u00022\b\b\u0001\u0010%\u001a\u00020\u0002¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b(\u0010\u0014J\u0015\u0010(\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b(\u0010\u0013J\"\u0010)\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\f¢\u0006\u0004\b+\u0010\u0019J\r\u0010,\u001a\u00020\f¢\u0006\u0004\b,\u0010\u0019R\u0012\u0010\u001c\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Landroidx/collection/MutableLongList;", "Landroidx/collection/LongList;", "", "initialCapacity", "<init>", "(I)V", "", "element", "", "add", "(J)Z", "index", "Ltb/xhv;", "(IJ)V", "", tep.KEY_UNIFORM_RESULT, "addAll", "(I[J)Z", "(ILandroidx/collection/LongList;)Z", "(Landroidx/collection/LongList;)Z", "([J)Z", "plusAssign", "(Landroidx/collection/LongList;)V", "([J)V", pg1.ATOM_EXT_clear, "()V", "minCapacity", "trim", "capacity", "ensureCapacity", "(J)V", "minusAssign", "remove", "removeAll", "removeAt", "(I)J", "start", "end", "removeRange", "(II)V", "retainAll", "set", "(IJ)J", "sort", "sortDescending", "getCapacity", "()I", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class MutableLongList extends LongList {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public MutableLongList() {
        this(0, 1, null);
    }

    public static /* synthetic */ Object ipc$super(MutableLongList mutableLongList, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/collection/MutableLongList");
    }

    public static /* synthetic */ void trim$default(MutableLongList mutableLongList, int i, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29206482", new Object[]{mutableLongList, new Integer(i), new Integer(i2), obj});
            return;
        }
        if ((i2 & 1) != 0) {
            i = mutableLongList._size;
        }
        mutableLongList.trim(i);
    }

    public final boolean add(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3814720", new Object[]{this, new Long(j)})).booleanValue();
        }
        ensureCapacity(this._size + 1);
        long[] jArr = this.content;
        int i = this._size;
        jArr[i] = j;
        this._size = i + 1;
        return true;
    }

    public final boolean addAll(int i, long[] jArr) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bab309ef", new Object[]{this, new Integer(i), jArr})).booleanValue();
        }
        ckf.g(jArr, tep.KEY_UNIFORM_RESULT);
        if (i < 0 || i > (i2 = this._size)) {
            throw new IndexOutOfBoundsException("Index " + i + " must be in 0.." + this._size);
        } else if (jArr.length == 0) {
            return false;
        } else {
            ensureCapacity(i2 + jArr.length);
            long[] jArr2 = this.content;
            int i3 = this._size;
            if (i != i3) {
                hc1.g(jArr2, jArr2, jArr.length + i, i, i3);
            }
            hc1.k(jArr, jArr2, i, 0, 0, 12, null);
            this._size += jArr.length;
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

    public final void minusAssign(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3230d8fe", new Object[]{this, new Long(j)});
        } else {
            remove(j);
        }
    }

    public final void plusAssign(LongList longList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0a6fa", new Object[]{this, longList});
            return;
        }
        ckf.g(longList, tep.KEY_UNIFORM_RESULT);
        addAll(this._size, longList);
    }

    public final boolean removeAll(long[] jArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20c78a57", new Object[]{this, jArr})).booleanValue();
        }
        ckf.g(jArr, tep.KEY_UNIFORM_RESULT);
        int i = this._size;
        for (long j : jArr) {
            remove(j);
        }
        return i != this._size;
    }

    public final long removeAt(int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1b0bddd9", new Object[]{this, new Integer(i)})).longValue();
        }
        if (i < 0 || i >= (i2 = this._size)) {
            throw new IndexOutOfBoundsException("Index " + i + " must be in 0.." + (this._size - 1));
        }
        long[] jArr = this.content;
        long j = jArr[i];
        if (i != i2 - 1) {
            hc1.g(jArr, jArr, i, 1 + i, i2);
        }
        this._size--;
        return j;
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
                long[] jArr = this.content;
                hc1.g(jArr, jArr, i, i2, i3);
            }
            this._size -= i2 - i;
        }
    }

    public final boolean retainAll(long[] jArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("419d92f6", new Object[]{this, jArr})).booleanValue();
        }
        ckf.g(jArr, tep.KEY_UNIFORM_RESULT);
        int i = this._size;
        long[] jArr2 = this.content;
        for (int i2 = i - 1; -1 < i2; i2--) {
            long j = jArr2[i2];
            int length = jArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    i3 = -1;
                    break;
                } else if (jArr[i3] == j) {
                    break;
                } else {
                    i3++;
                }
            }
            if (i3 < 0) {
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
            hc1.y(this.content, 0, i);
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
            ic1.c0(this.content, 0, i);
        }
    }

    public final void trim(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e052507a", new Object[]{this, new Integer(i)});
            return;
        }
        int max = Math.max(i, this._size);
        long[] jArr = this.content;
        if (jArr.length > max) {
            long[] copyOf = Arrays.copyOf(jArr, max);
            ckf.f(copyOf, "copyOf(this, newSize)");
            this.content = copyOf;
        }
    }

    public /* synthetic */ MutableLongList(int i, int i2, a07 a07Var) {
        this((i2 & 1) != 0 ? 16 : i);
    }

    public final void ensureCapacity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4ce3744", new Object[]{this, new Integer(i)});
            return;
        }
        long[] jArr = this.content;
        if (jArr.length < i) {
            long[] copyOf = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
            ckf.f(copyOf, "copyOf(this, newSize)");
            this.content = copyOf;
        }
    }

    public final void minusAssign(long[] jArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13f277d5", new Object[]{this, jArr});
            return;
        }
        ckf.g(jArr, tep.KEY_UNIFORM_RESULT);
        for (long j : jArr) {
            remove(j);
        }
    }

    public final void plusAssign(long[] jArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32e52dff", new Object[]{this, jArr});
            return;
        }
        ckf.g(jArr, tep.KEY_UNIFORM_RESULT);
        addAll(this._size, jArr);
    }

    public final long set(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dfbc4dbe", new Object[]{this, new Integer(i), new Long(j)})).longValue();
        }
        if (i < 0 || i >= this._size) {
            throw new IndexOutOfBoundsException("set index " + i + " must be between 0 .. " + (this._size - 1));
        }
        long[] jArr = this.content;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    public MutableLongList(int i) {
        super(i, null);
    }

    public final void plusAssign(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d859b594", new Object[]{this, new Long(j)});
        } else {
            add(j);
        }
    }

    public final boolean remove(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebab3d1d", new Object[]{this, new Long(j)})).booleanValue();
        }
        int indexOf = indexOf(j);
        if (indexOf < 0) {
            return false;
        }
        removeAt(indexOf);
        return true;
    }

    public final void add(int i, long j) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bca79ec9", new Object[]{this, new Integer(i), new Long(j)});
        } else if (i < 0 || i > (i2 = this._size)) {
            throw new IndexOutOfBoundsException("Index " + i + " must be in 0.." + this._size);
        } else {
            ensureCapacity(i2 + 1);
            long[] jArr = this.content;
            int i3 = this._size;
            if (i != i3) {
                hc1.g(jArr, jArr, i + 1, i, i3);
            }
            jArr[i] = j;
            this._size++;
        }
    }

    public final void minusAssign(LongList longList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("571f73d0", new Object[]{this, longList});
            return;
        }
        ckf.g(longList, tep.KEY_UNIFORM_RESULT);
        long[] jArr = longList.content;
        int i = longList._size;
        for (int i2 = 0; i2 < i; i2++) {
            remove(jArr[i2]);
        }
    }

    public final boolean removeAll(LongList longList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75d7fd52", new Object[]{this, longList})).booleanValue();
        }
        ckf.g(longList, tep.KEY_UNIFORM_RESULT);
        int i = this._size;
        int i2 = longList._size - 1;
        if (i2 >= 0) {
            int i3 = 0;
            while (true) {
                remove(longList.get(i3));
                if (i3 == i2) {
                    break;
                }
                i3++;
            }
        }
        return i != this._size;
    }

    public final boolean retainAll(LongList longList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c170f171", new Object[]{this, longList})).booleanValue();
        }
        ckf.g(longList, tep.KEY_UNIFORM_RESULT);
        int i = this._size;
        long[] jArr = this.content;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!longList.contains(jArr[i2])) {
                removeAt(i2);
            }
        }
        return i != this._size;
    }

    public final boolean addAll(int i, LongList longList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b0ea8ea", new Object[]{this, new Integer(i), longList})).booleanValue();
        }
        ckf.g(longList, tep.KEY_UNIFORM_RESULT);
        if (i < 0 || i > this._size) {
            throw new IndexOutOfBoundsException("Index " + i + " must be in 0.." + this._size);
        } else if (longList.isEmpty()) {
            return false;
        } else {
            ensureCapacity(this._size + longList._size);
            long[] jArr = this.content;
            int i2 = this._size;
            if (i != i2) {
                hc1.g(jArr, jArr, longList._size + i, i, i2);
            }
            hc1.g(longList.content, jArr, i, 0, longList._size);
            this._size += longList._size;
            return true;
        }
    }

    public final boolean addAll(LongList longList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c8d3b55", new Object[]{this, longList})).booleanValue();
        }
        ckf.g(longList, tep.KEY_UNIFORM_RESULT);
        return addAll(this._size, longList);
    }

    public final boolean addAll(long[] jArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ab2dada", new Object[]{this, jArr})).booleanValue();
        }
        ckf.g(jArr, tep.KEY_UNIFORM_RESULT);
        return addAll(this._size, jArr);
    }
}
