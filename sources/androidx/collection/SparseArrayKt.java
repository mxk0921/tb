package androidx.collection;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import tb.ckf;
import tb.d1a;
import tb.pg1;
import tb.tdf;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0006\u001a(\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\u0005\u0010\u0006\u001a0\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b\t\u0010\n\u001a4\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002¢\u0006\u0004\b\f\u0010\r\u001a0\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a9\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a \u0010\u0014\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a/\u0010\u0016\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a[\u0010\u001c\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000126\u0010\u001b\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0018H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001d\u0010\u001f\u001a\u00020\u001e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u001f\u0010 \u001a#\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\"\u0010#\"\"\u0010&\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b$\u0010%\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006'"}, d2 = {"T", "Landroidx/collection/SparseArrayCompat;", "", "key", "", "contains", "(Landroidx/collection/SparseArrayCompat;I)Z", "value", "Ltb/xhv;", "set", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)V", "other", "plus", "(Landroidx/collection/SparseArrayCompat;Landroidx/collection/SparseArrayCompat;)Landroidx/collection/SparseArrayCompat;", AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, "getOrDefault", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function0;", "getOrElse", "(Landroidx/collection/SparseArrayCompat;ILtb/d1a;)Ljava/lang/Object;", "isNotEmpty", "(Landroidx/collection/SparseArrayCompat;)Z", "remove", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)Z", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "action", pg1.ATOM_EXT_forEach, "(Landroidx/collection/SparseArrayCompat;Ltb/u1a;)V", "Ltb/tdf;", "keyIterator", "(Landroidx/collection/SparseArrayCompat;)Ltb/tdf;", "", "valueIterator", "(Landroidx/collection/SparseArrayCompat;)Ljava/util/Iterator;", "getSize", "(Landroidx/collection/SparseArrayCompat;)I", "size", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class SparseArrayKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final <T> boolean contains(SparseArrayCompat<T> sparseArrayCompat, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f6ef35c", new Object[]{sparseArrayCompat, new Integer(i)})).booleanValue();
        }
        ckf.g(sparseArrayCompat, "<this>");
        return sparseArrayCompat.containsKey(i);
    }

    public static final <T> T getOrDefault(SparseArrayCompat<T> sparseArrayCompat, int i, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("ddc03755", new Object[]{sparseArrayCompat, new Integer(i), t});
        }
        ckf.g(sparseArrayCompat, "<this>");
        return sparseArrayCompat.get(i, t);
    }

    public static final <T> T getOrElse(SparseArrayCompat<T> sparseArrayCompat, int i, d1a<? extends T> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("be5732a0", new Object[]{sparseArrayCompat, new Integer(i), d1aVar});
        }
        ckf.g(sparseArrayCompat, "<this>");
        ckf.g(d1aVar, AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE);
        T t = sparseArrayCompat.get(i);
        return t == null ? (T) d1aVar.invoke() : t;
    }

    public static final <T> int getSize(SparseArrayCompat<T> sparseArrayCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3b42c7a6", new Object[]{sparseArrayCompat})).intValue();
        }
        ckf.g(sparseArrayCompat, "<this>");
        return sparseArrayCompat.size();
    }

    public static final <T> tdf keyIterator(final SparseArrayCompat<T> sparseArrayCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tdf) ipChange.ipc$dispatch("c7d4cd33", new Object[]{sparseArrayCompat});
        }
        ckf.g(sparseArrayCompat, "<this>");
        return new tdf() { // from class: androidx.collection.SparseArrayKt$keyIterator$1
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private int index;

            public static /* synthetic */ Object ipc$super(SparseArrayKt$keyIterator$1 sparseArrayKt$keyIterator$1, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/collection/SparseArrayKt$keyIterator$1");
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
                if (this.index < sparseArrayCompat.size()) {
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
                SparseArrayCompat<T> sparseArrayCompat2 = sparseArrayCompat;
                int i = this.index;
                this.index = 1 + i;
                return sparseArrayCompat2.keyAt(i);
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

    public static final <T> SparseArrayCompat<T> plus(SparseArrayCompat<T> sparseArrayCompat, SparseArrayCompat<T> sparseArrayCompat2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseArrayCompat) ipChange.ipc$dispatch("3e233722", new Object[]{sparseArrayCompat, sparseArrayCompat2});
        }
        ckf.g(sparseArrayCompat, "<this>");
        ckf.g(sparseArrayCompat2, "other");
        SparseArrayCompat<T> sparseArrayCompat3 = new SparseArrayCompat<>(sparseArrayCompat.size() + sparseArrayCompat2.size());
        sparseArrayCompat3.putAll(sparseArrayCompat);
        sparseArrayCompat3.putAll(sparseArrayCompat2);
        return sparseArrayCompat3;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replaced with member function. Remove extension import!")
    public static final /* synthetic */ boolean remove(SparseArrayCompat sparseArrayCompat, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0b2ecdd", new Object[]{sparseArrayCompat, new Integer(i), obj})).booleanValue();
        }
        ckf.g(sparseArrayCompat, "<this>");
        return sparseArrayCompat.remove(i, obj);
    }

    public static final <T> void set(SparseArrayCompat<T> sparseArrayCompat, int i, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("361b2037", new Object[]{sparseArrayCompat, new Integer(i), t});
            return;
        }
        ckf.g(sparseArrayCompat, "<this>");
        sparseArrayCompat.put(i, t);
    }

    public static final <T> Iterator<T> valueIterator(SparseArrayCompat<T> sparseArrayCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Iterator) ipChange.ipc$dispatch("9eb9a36c", new Object[]{sparseArrayCompat});
        }
        ckf.g(sparseArrayCompat, "<this>");
        return new SparseArrayKt$valueIterator$1(sparseArrayCompat);
    }

    public static final <T> boolean isNotEmpty(SparseArrayCompat<T> sparseArrayCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da8fec8a", new Object[]{sparseArrayCompat})).booleanValue();
        }
        ckf.g(sparseArrayCompat, "<this>");
        return !sparseArrayCompat.isEmpty();
    }

    public static final <T> void forEach(SparseArrayCompat<T> sparseArrayCompat, u1a<? super Integer, ? super T, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5be205", new Object[]{sparseArrayCompat, u1aVar});
            return;
        }
        ckf.g(sparseArrayCompat, "<this>");
        ckf.g(u1aVar, "action");
        int size = sparseArrayCompat.size();
        for (int i = 0; i < size; i++) {
            u1aVar.invoke(Integer.valueOf(sparseArrayCompat.keyAt(i)), sparseArrayCompat.valueAt(i));
        }
    }
}
