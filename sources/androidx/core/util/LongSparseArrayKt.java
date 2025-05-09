package androidx.core.util;

import android.util.LongSparseArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import java.util.Iterator;
import kotlin.Metadata;
import tb.ckf;
import tb.d1a;
import tb.pg1;
import tb.u1a;
import tb.wjh;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a(\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\u0005\u0010\u0006\u001a0\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b\t\u0010\n\u001a4\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002¢\u0006\u0004\b\f\u0010\r\u001a(\u0010\u000e\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\u000e\u0010\u0006\u001a(\u0010\u000f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a0\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a6\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a \u0010\u0017\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a \u0010\u0019\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\b¢\u0006\u0004\b\u0019\u0010\u0018\u001a-\u0010\u001a\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a+\u0010\u001c\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001aX\u0010\"\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000126\u0010!\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u001eH\u0086\b¢\u0006\u0004\b\"\u0010#\u001a\u001d\u0010%\u001a\u00020$\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b%\u0010&\u001a#\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b(\u0010)\"\"\u0010-\u001a\u00020*\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"T", "Landroid/util/LongSparseArray;", "", "key", "", "contains", "(Landroid/util/LongSparseArray;J)Z", "value", "Ltb/xhv;", "set", "(Landroid/util/LongSparseArray;JLjava/lang/Object;)V", "other", "plus", "(Landroid/util/LongSparseArray;Landroid/util/LongSparseArray;)Landroid/util/LongSparseArray;", "containsKey", "containsValue", "(Landroid/util/LongSparseArray;Ljava/lang/Object;)Z", AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, "getOrDefault", "(Landroid/util/LongSparseArray;JLjava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function0;", "getOrElse", "(Landroid/util/LongSparseArray;JLtb/d1a;)Ljava/lang/Object;", "isEmpty", "(Landroid/util/LongSparseArray;)Z", "isNotEmpty", "remove", "(Landroid/util/LongSparseArray;JLjava/lang/Object;)Z", "putAll", "(Landroid/util/LongSparseArray;Landroid/util/LongSparseArray;)V", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "action", pg1.ATOM_EXT_forEach, "(Landroid/util/LongSparseArray;Ltb/u1a;)V", "Ltb/wjh;", "keyIterator", "(Landroid/util/LongSparseArray;)Ltb/wjh;", "", "valueIterator", "(Landroid/util/LongSparseArray;)Ljava/util/Iterator;", "", "getSize", "(Landroid/util/LongSparseArray;)I", "size", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class LongSparseArrayKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final <T> boolean contains(LongSparseArray<T> longSparseArray, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba2a8bc3", new Object[]{longSparseArray, new Long(j)})).booleanValue();
        }
        if (longSparseArray.indexOfKey(j) >= 0) {
            return true;
        }
        return false;
    }

    public static final <T> boolean containsKey(LongSparseArray<T> longSparseArray, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba2ce82", new Object[]{longSparseArray, new Long(j)})).booleanValue();
        }
        if (longSparseArray.indexOfKey(j) >= 0) {
            return true;
        }
        return false;
    }

    public static final <T> boolean containsValue(LongSparseArray<T> longSparseArray, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32e17d38", new Object[]{longSparseArray, t})).booleanValue();
        }
        if (longSparseArray.indexOfValue(t) >= 0) {
            return true;
        }
        return false;
    }

    public static final <T> void forEach(LongSparseArray<T> longSparseArray, u1a<? super Long, ? super T, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab1eef55", new Object[]{longSparseArray, u1aVar});
            return;
        }
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            u1aVar.invoke(Long.valueOf(longSparseArray.keyAt(i)), longSparseArray.valueAt(i));
        }
    }

    public static final <T> T getOrDefault(LongSparseArray<T> longSparseArray, long j, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("e5c55200", new Object[]{longSparseArray, new Long(j), t});
        }
        T t2 = longSparseArray.get(j);
        return t2 == null ? t : t2;
    }

    public static final <T> T getOrElse(LongSparseArray<T> longSparseArray, long j, d1a<? extends T> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("c6d91df", new Object[]{longSparseArray, new Long(j), d1aVar});
        }
        T t = longSparseArray.get(j);
        if (t == null) {
            return (T) d1aVar.invoke();
        }
        return t;
    }

    public static final <T> int getSize(LongSparseArray<T> longSparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("77771bf0", new Object[]{longSparseArray})).intValue();
        }
        return longSparseArray.size();
    }

    public static final <T> boolean isEmpty(LongSparseArray<T> longSparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("289b92cd", new Object[]{longSparseArray})).booleanValue();
        }
        if (longSparseArray.size() == 0) {
            return true;
        }
        return false;
    }

    public static final <T> wjh keyIterator(final LongSparseArray<T> longSparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wjh) ipChange.ipc$dispatch("1a3355b2", new Object[]{longSparseArray});
        }
        return new wjh() { // from class: androidx.core.util.LongSparseArrayKt$keyIterator$1
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private int index;

            public static /* synthetic */ Object ipc$super(LongSparseArrayKt$keyIterator$1 longSparseArrayKt$keyIterator$1, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/util/LongSparseArrayKt$keyIterator$1");
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
                if (this.index < longSparseArray.size()) {
                    return true;
                }
                return false;
            }

            @Override // tb.wjh
            public long nextLong() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("4621f90a", new Object[]{this})).longValue();
                }
                LongSparseArray<T> longSparseArray2 = longSparseArray;
                int i = this.index;
                this.index = 1 + i;
                return longSparseArray2.keyAt(i);
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

    public static final <T> LongSparseArray<T> plus(LongSparseArray<T> longSparseArray, LongSparseArray<T> longSparseArray2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LongSparseArray) ipChange.ipc$dispatch("ba267796", new Object[]{longSparseArray, longSparseArray2});
        }
        LongSparseArray<T> longSparseArray3 = new LongSparseArray<>(longSparseArray.size() + longSparseArray2.size());
        putAll(longSparseArray3, longSparseArray);
        putAll(longSparseArray3, longSparseArray2);
        return longSparseArray3;
    }

    public static final <T> void putAll(LongSparseArray<T> longSparseArray, LongSparseArray<T> longSparseArray2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("383f5d7", new Object[]{longSparseArray, longSparseArray2});
            return;
        }
        int size = longSparseArray2.size();
        for (int i = 0; i < size; i++) {
            longSparseArray.put(longSparseArray2.keyAt(i), longSparseArray2.valueAt(i));
        }
    }

    public static final <T> boolean remove(LongSparseArray<T> longSparseArray, long j, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f495c9a", new Object[]{longSparseArray, new Long(j), t})).booleanValue();
        }
        int indexOfKey = longSparseArray.indexOfKey(j);
        if (indexOfKey < 0 || !ckf.b(t, longSparseArray.valueAt(indexOfKey))) {
            return false;
        }
        longSparseArray.removeAt(indexOfKey);
        return true;
    }

    public static final <T> void set(LongSparseArray<T> longSparseArray, long j, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("229e4778", new Object[]{longSparseArray, new Long(j), t});
        } else {
            longSparseArray.put(j, t);
        }
    }

    public static final <T> Iterator<T> valueIterator(LongSparseArray<T> longSparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Iterator) ipChange.ipc$dispatch("36c9e0d2", new Object[]{longSparseArray});
        }
        return new LongSparseArrayKt$valueIterator$1(longSparseArray);
    }

    public static final <T> boolean isNotEmpty(LongSparseArray<T> longSparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbacadce", new Object[]{longSparseArray})).booleanValue();
        }
        return longSparseArray.size() != 0;
    }
}
