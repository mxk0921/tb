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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b!\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\t\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\rJ\u001f\u0010\u0010\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0010\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0012J\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0013J\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0017J\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u0005J\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u0005J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\u0015\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\u001f\u0010\u001eJ\u0015\u0010 \u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b \u0010\nJ\u0015\u0010!\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b!\u0010\u0014J\u0015\u0010!\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b!\u0010\u0013J\u0018\u0010\u001f\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086\u0002¢\u0006\u0004\b\u001f\u0010\u0017J\u0018\u0010\u001f\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u001f\u0010\u0016J\u0017\u0010\"\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#J!\u0010&\u001a\u00020\f2\b\b\u0001\u0010$\u001a\u00020\u00022\b\b\u0001\u0010%\u001a\u00020\u0002¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b(\u0010\u0014J\u0015\u0010(\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b(\u0010\u0013J\"\u0010)\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\f¢\u0006\u0004\b+\u0010\u0019J\r\u0010,\u001a\u00020\f¢\u0006\u0004\b,\u0010\u0019R\u0012\u0010\u001c\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Landroidx/collection/MutableFloatList;", "Landroidx/collection/FloatList;", "", "initialCapacity", "<init>", "(I)V", "", "element", "", "add", "(F)Z", "index", "Ltb/xhv;", "(IF)V", "", tep.KEY_UNIFORM_RESULT, "addAll", "(I[F)Z", "(ILandroidx/collection/FloatList;)Z", "(Landroidx/collection/FloatList;)Z", "([F)Z", "plusAssign", "(Landroidx/collection/FloatList;)V", "([F)V", pg1.ATOM_EXT_clear, "()V", "minCapacity", "trim", "capacity", "ensureCapacity", "(F)V", "minusAssign", "remove", "removeAll", "removeAt", "(I)F", "start", "end", "removeRange", "(II)V", "retainAll", "set", "(IF)F", "sort", "sortDescending", "getCapacity", "()I", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class MutableFloatList extends FloatList {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public MutableFloatList() {
        this(0, 1, null);
    }

    public static /* synthetic */ Object ipc$super(MutableFloatList mutableFloatList, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/collection/MutableFloatList");
    }

    public final boolean add(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b381381c", new Object[]{this, new Float(f)})).booleanValue();
        }
        ensureCapacity(this._size + 1);
        float[] fArr = this.content;
        int i = this._size;
        fArr[i] = f;
        this._size = i + 1;
        return true;
    }

    public final boolean addAll(int i, float[] fArr) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bab2faeb", new Object[]{this, new Integer(i), fArr})).booleanValue();
        }
        ckf.g(fArr, tep.KEY_UNIFORM_RESULT);
        if (i < 0 || i > (i2 = this._size)) {
            throw new IndexOutOfBoundsException("Index " + i + " must be in 0.." + this._size);
        } else if (fArr.length == 0) {
            return false;
        } else {
            ensureCapacity(i2 + fArr.length);
            float[] fArr2 = this.content;
            int i3 = this._size;
            if (i != i3) {
                hc1.e(fArr2, fArr2, fArr.length + i, i, i3);
            }
            hc1.i(fArr, fArr2, i, 0, 0, 12, null);
            this._size += fArr.length;
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

    public final void minusAssign(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3230c9fa", new Object[]{this, new Float(f)});
        } else {
            remove(f);
        }
    }

    public final void plusAssign(FloatList floatList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("360fd42", new Object[]{this, floatList});
            return;
        }
        ckf.g(floatList, tep.KEY_UNIFORM_RESULT);
        addAll(this._size, floatList);
    }

    public final boolean removeAll(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20c77b53", new Object[]{this, fArr})).booleanValue();
        }
        ckf.g(fArr, tep.KEY_UNIFORM_RESULT);
        int i = this._size;
        for (float f : fArr) {
            remove(f);
        }
        return i != this._size;
    }

    public final float removeAt(int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1b0bddd5", new Object[]{this, new Integer(i)})).floatValue();
        }
        if (i < 0 || i >= (i2 = this._size)) {
            throw new IndexOutOfBoundsException("Index " + i + " must be in 0.." + (this._size - 1));
        }
        float[] fArr = this.content;
        float f = fArr[i];
        if (i != i2 - 1) {
            hc1.e(fArr, fArr, i, 1 + i, i2);
        }
        this._size--;
        return f;
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
                float[] fArr = this.content;
                hc1.e(fArr, fArr, i, i2, i3);
            }
            this._size -= i2 - i;
        }
    }

    public final boolean retainAll(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("419d83f2", new Object[]{this, fArr})).booleanValue();
        }
        ckf.g(fArr, tep.KEY_UNIFORM_RESULT);
        int i = this._size;
        float[] fArr2 = this.content;
        for (int i2 = i - 1; -1 < i2; i2--) {
            float f = fArr2[i2];
            int length = fArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    i3 = -1;
                    break;
                } else if (fArr[i3] == f) {
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
            hc1.v(this.content, 0, i);
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
            ic1.Z(this.content, 0, i);
        }
    }

    public final void trim(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e052507a", new Object[]{this, new Integer(i)});
            return;
        }
        int max = Math.max(i, this._size);
        float[] fArr = this.content;
        if (fArr.length > max) {
            float[] copyOf = Arrays.copyOf(fArr, max);
            ckf.f(copyOf, "copyOf(this, newSize)");
            this.content = copyOf;
        }
    }

    public /* synthetic */ MutableFloatList(int i, int i2, a07 a07Var) {
        this((i2 & 1) != 0 ? 16 : i);
    }

    public static /* synthetic */ void trim$default(MutableFloatList mutableFloatList, int i, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e23f83b2", new Object[]{mutableFloatList, new Integer(i), new Integer(i2), obj});
            return;
        }
        if ((i2 & 1) != 0) {
            i = mutableFloatList._size;
        }
        mutableFloatList.trim(i);
    }

    public final void ensureCapacity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4ce3744", new Object[]{this, new Integer(i)});
            return;
        }
        float[] fArr = this.content;
        if (fArr.length < i) {
            float[] copyOf = Arrays.copyOf(fArr, Math.max(i, (fArr.length * 3) / 2));
            ckf.f(copyOf, "copyOf(this, newSize)");
            this.content = copyOf;
        }
    }

    public final void minusAssign(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13f268d1", new Object[]{this, fArr});
            return;
        }
        ckf.g(fArr, tep.KEY_UNIFORM_RESULT);
        for (float f : fArr) {
            remove(f);
        }
    }

    public final void plusAssign(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32e51efb", new Object[]{this, fArr});
            return;
        }
        ckf.g(fArr, tep.KEY_UNIFORM_RESULT);
        addAll(this._size, fArr);
    }

    public final float set(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dfbc3eb6", new Object[]{this, new Integer(i), new Float(f)})).floatValue();
        }
        if (i < 0 || i >= this._size) {
            throw new IndexOutOfBoundsException("set index " + i + " must be between 0 .. " + (this._size - 1));
        }
        float[] fArr = this.content;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    public MutableFloatList(int i) {
        super(i, null);
    }

    public final void plusAssign(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d859a690", new Object[]{this, new Float(f)});
        } else {
            add(f);
        }
    }

    public final boolean remove(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebab2e19", new Object[]{this, new Float(f)})).booleanValue();
        }
        int indexOf = indexOf(f);
        if (indexOf < 0) {
            return false;
        }
        removeAt(indexOf);
        return true;
    }

    public final void add(int i, float f) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bca78fc5", new Object[]{this, new Integer(i), new Float(f)});
        } else if (i < 0 || i > (i2 = this._size)) {
            throw new IndexOutOfBoundsException("Index " + i + " must be in 0.." + this._size);
        } else {
            ensureCapacity(i2 + 1);
            float[] fArr = this.content;
            int i3 = this._size;
            if (i != i3) {
                hc1.e(fArr, fArr, i + 1, i, i3);
            }
            fArr[i] = f;
            this._size++;
        }
    }

    public final void minusAssign(FloatList floatList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46bbcb2c", new Object[]{this, floatList});
            return;
        }
        ckf.g(floatList, tep.KEY_UNIFORM_RESULT);
        float[] fArr = floatList.content;
        int i = floatList._size;
        for (int i2 = 0; i2 < i; i2++) {
            remove(fArr[i2]);
        }
    }

    public final boolean removeAll(FloatList floatList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff147172", new Object[]{this, floatList})).booleanValue();
        }
        ckf.g(floatList, tep.KEY_UNIFORM_RESULT);
        int i = this._size;
        int i2 = floatList._size - 1;
        if (i2 >= 0) {
            int i3 = 0;
            while (true) {
                remove(floatList.get(i3));
                if (i3 == i2) {
                    break;
                }
                i3++;
            }
        }
        return i != this._size;
    }

    public final boolean retainAll(FloatList floatList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("269a0133", new Object[]{this, floatList})).booleanValue();
        }
        ckf.g(floatList, tep.KEY_UNIFORM_RESULT);
        int i = this._size;
        float[] fArr = this.content;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!floatList.contains(fArr[i2])) {
                removeAt(i2);
            }
        }
        return i != this._size;
    }

    public final boolean addAll(int i, FloatList floatList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0b338da", new Object[]{this, new Integer(i), floatList})).booleanValue();
        }
        ckf.g(floatList, tep.KEY_UNIFORM_RESULT);
        if (i < 0 || i > this._size) {
            throw new IndexOutOfBoundsException("Index " + i + " must be in 0.." + this._size);
        } else if (floatList.isEmpty()) {
            return false;
        } else {
            ensureCapacity(this._size + floatList._size);
            float[] fArr = this.content;
            int i2 = this._size;
            if (i != i2) {
                hc1.e(fArr, fArr, floatList._size + i, i, i2);
            }
            hc1.e(floatList.content, fArr, i, 0, floatList._size);
            this._size += floatList._size;
            return true;
        }
    }

    public final boolean addAll(FloatList floatList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff06f3cf", new Object[]{this, floatList})).booleanValue();
        }
        ckf.g(floatList, tep.KEY_UNIFORM_RESULT);
        return addAll(this._size, floatList);
    }

    public final boolean addAll(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ab2cbd6", new Object[]{this, fArr})).booleanValue();
        }
        ckf.g(fArr, tep.KEY_UNIFORM_RESULT);
        return addAll(this._size, fArr);
    }
}
