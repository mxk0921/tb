package androidx.core.util;

import android.util.SparseArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import java.util.Iterator;
import kotlin.Metadata;
import tb.ckf;
import tb.d1a;
import tb.pg1;
import tb.tdf;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0006\u001a(\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\u0005\u0010\u0006\u001a0\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b\t\u0010\n\u001a4\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002¢\u0006\u0004\b\f\u0010\r\u001a(\u0010\u000e\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\u000e\u0010\u0006\u001a(\u0010\u000f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a0\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a6\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a \u0010\u0017\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a \u0010\u0019\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\b¢\u0006\u0004\b\u0019\u0010\u0018\u001a-\u0010\u001a\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a+\u0010\u001c\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001aX\u0010\"\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000126\u0010!\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u001eH\u0086\b¢\u0006\u0004\b\"\u0010#\u001a\u001d\u0010%\u001a\u00020$\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b%\u0010&\u001a#\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b(\u0010)\"\"\u0010,\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"T", "Landroid/util/SparseArray;", "", "key", "", "contains", "(Landroid/util/SparseArray;I)Z", "value", "Ltb/xhv;", "set", "(Landroid/util/SparseArray;ILjava/lang/Object;)V", "other", "plus", "(Landroid/util/SparseArray;Landroid/util/SparseArray;)Landroid/util/SparseArray;", "containsKey", "containsValue", "(Landroid/util/SparseArray;Ljava/lang/Object;)Z", AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, "getOrDefault", "(Landroid/util/SparseArray;ILjava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function0;", "getOrElse", "(Landroid/util/SparseArray;ILtb/d1a;)Ljava/lang/Object;", "isEmpty", "(Landroid/util/SparseArray;)Z", "isNotEmpty", "remove", "(Landroid/util/SparseArray;ILjava/lang/Object;)Z", "putAll", "(Landroid/util/SparseArray;Landroid/util/SparseArray;)V", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "action", pg1.ATOM_EXT_forEach, "(Landroid/util/SparseArray;Ltb/u1a;)V", "Ltb/tdf;", "keyIterator", "(Landroid/util/SparseArray;)Ltb/tdf;", "", "valueIterator", "(Landroid/util/SparseArray;)Ljava/util/Iterator;", "getSize", "(Landroid/util/SparseArray;)I", "size", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class SparseArrayKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final <T> boolean contains(SparseArray<T> sparseArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c355711e", new Object[]{sparseArray, new Integer(i)})).booleanValue();
        }
        if (sparseArray.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    public static final <T> boolean containsKey(SparseArray<T> sparseArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8a2eb5d", new Object[]{sparseArray, new Integer(i)})).booleanValue();
        }
        if (sparseArray.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    public static final <T> boolean containsValue(SparseArray<T> sparseArray, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa04e11c", new Object[]{sparseArray, t})).booleanValue();
        }
        if (sparseArray.indexOfValue(t) >= 0) {
            return true;
        }
        return false;
    }

    public static final <T> void forEach(SparseArray<T> sparseArray, u1a<? super Integer, ? super T, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b02a6039", new Object[]{sparseArray, u1aVar});
            return;
        }
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            u1aVar.invoke(Integer.valueOf(sparseArray.keyAt(i)), sparseArray.valueAt(i));
        }
    }

    public static final <T> T getOrDefault(SparseArray<T> sparseArray, int i, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("2f786345", new Object[]{sparseArray, new Integer(i), t});
        }
        T t2 = sparseArray.get(i);
        if (t2 == null) {
            return t;
        }
        return t2;
    }

    public static final <T> T getOrElse(SparseArray<T> sparseArray, int i, d1a<? extends T> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("142ddb64", new Object[]{sparseArray, new Integer(i), d1aVar});
        }
        T t = sparseArray.get(i);
        if (t == null) {
            return (T) d1aVar.invoke();
        }
        return t;
    }

    public static final <T> int getSize(SparseArray<T> sparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bef88b54", new Object[]{sparseArray})).intValue();
        }
        return sparseArray.size();
    }

    public static final <T> boolean isEmpty(SparseArray<T> sparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77204831", new Object[]{sparseArray})).booleanValue();
        }
        if (sparseArray.size() == 0) {
            return true;
        }
        return false;
    }

    public static final <T> tdf keyIterator(final SparseArray<T> sparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tdf) ipChange.ipc$dispatch("b93e8c19", new Object[]{sparseArray});
        }
        return new tdf() { // from class: androidx.core.util.SparseArrayKt$keyIterator$1
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private int index;

            public static /* synthetic */ Object ipc$super(SparseArrayKt$keyIterator$1 sparseArrayKt$keyIterator$1, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/util/SparseArrayKt$keyIterator$1");
            }

            public final int getIndex() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("cf396596", new Object[]{this})).intValue();
                }
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("291ab8", new Object[]{this})).booleanValue();
                }
                if (this.index < sparseArray.size()) {
                    return true;
                }
                return false;
            }

            @Override // tb.tdf
            public int nextInt() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("c52ef276", new Object[]{this})).intValue();
                }
                SparseArray<T> sparseArray2 = sparseArray;
                int i = this.index;
                this.index = 1 + i;
                return sparseArray2.keyAt(i);
            }

            public final void setIndex(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("46180fcc", new Object[]{this, new Integer(i)});
                } else {
                    this.index = i;
                }
            }
        };
    }

    public static final <T> SparseArray<T> plus(SparseArray<T> sparseArray, SparseArray<T> sparseArray2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseArray) ipChange.ipc$dispatch("bc963fb2", new Object[]{sparseArray, sparseArray2});
        }
        SparseArray<T> sparseArray3 = new SparseArray<>(sparseArray.size() + sparseArray2.size());
        putAll(sparseArray3, sparseArray);
        putAll(sparseArray3, sparseArray2);
        return sparseArray3;
    }

    public static final <T> void putAll(SparseArray<T> sparseArray, SparseArray<T> sparseArray2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ecc621f", new Object[]{sparseArray, sparseArray2});
            return;
        }
        int size = sparseArray2.size();
        for (int i = 0; i < size; i++) {
            sparseArray.put(sparseArray2.keyAt(i), sparseArray2.valueAt(i));
        }
    }

    public static final <T> boolean remove(SparseArray<T> sparseArray, int i, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b9a56b5", new Object[]{sparseArray, new Integer(i), t})).booleanValue();
        }
        int indexOfKey = sparseArray.indexOfKey(i);
        if (indexOfKey < 0 || !ckf.b(t, sparseArray.valueAt(indexOfKey))) {
            return false;
        }
        sparseArray.removeAt(indexOfKey);
        return true;
    }

    public static final <T> void set(SparseArray<T> sparseArray, int i, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f94c0293", new Object[]{sparseArray, new Integer(i), t});
        } else {
            sparseArray.put(i, t);
        }
    }

    public static final <T> Iterator<T> valueIterator(SparseArray<T> sparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Iterator) ipChange.ipc$dispatch("139ecaee", new Object[]{sparseArray});
        }
        return new SparseArrayKt$valueIterator$1(sparseArray);
    }

    public static final <T> boolean isNotEmpty(SparseArray<T> sparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f310bb2", new Object[]{sparseArray})).booleanValue();
        }
        return sparseArray.size() != 0;
    }
}
