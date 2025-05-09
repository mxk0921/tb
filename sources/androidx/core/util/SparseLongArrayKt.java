package androidx.core.util;

import android.util.SparseLongArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import kotlin.Metadata;
import tb.d1a;
import tb.pg1;
import tb.tdf;
import tb.u1a;
import tb.wjh;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\u0004\u0010\u0005\u001a$\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\t\u0010\n\u001a\u001c\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u001c\u0010\u000e\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u000e\u0010\u0005\u001a\u001c\u0010\u000f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a$\u0010\u0012\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a*\u0010\u0015\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0014\u0010\u0017\u001a\u00020\u0003*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0014\u0010\u0019\u001a\u00020\u0003*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0019\u0010\u0018\u001a!\u0010\u001a\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0019\u0010\u001c\u001a\u00020\b*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001aL\u0010\"\u001a\u00020\b*\u00020\u000026\u0010!\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u001eH\u0086\b¢\u0006\u0004\b\"\u0010#\u001a\u0011\u0010%\u001a\u00020$*\u00020\u0000¢\u0006\u0004\b%\u0010&\u001a\u0011\u0010(\u001a\u00020'*\u00020\u0000¢\u0006\u0004\b(\u0010)\"\u0016\u0010,\u001a\u00020\u0001*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Landroid/util/SparseLongArray;", "", "key", "", "contains", "(Landroid/util/SparseLongArray;I)Z", "", "value", "Ltb/xhv;", "set", "(Landroid/util/SparseLongArray;IJ)V", "other", "plus", "(Landroid/util/SparseLongArray;Landroid/util/SparseLongArray;)Landroid/util/SparseLongArray;", "containsKey", "containsValue", "(Landroid/util/SparseLongArray;J)Z", AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, "getOrDefault", "(Landroid/util/SparseLongArray;IJ)J", "Lkotlin/Function0;", "getOrElse", "(Landroid/util/SparseLongArray;ILtb/d1a;)J", "isEmpty", "(Landroid/util/SparseLongArray;)Z", "isNotEmpty", "remove", "(Landroid/util/SparseLongArray;IJ)Z", "putAll", "(Landroid/util/SparseLongArray;Landroid/util/SparseLongArray;)V", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "action", pg1.ATOM_EXT_forEach, "(Landroid/util/SparseLongArray;Ltb/u1a;)V", "Ltb/tdf;", "keyIterator", "(Landroid/util/SparseLongArray;)Ltb/tdf;", "Ltb/wjh;", "valueIterator", "(Landroid/util/SparseLongArray;)Ltb/wjh;", "getSize", "(Landroid/util/SparseLongArray;)I", "size", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class SparseLongArrayKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final boolean contains(SparseLongArray sparseLongArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9635e302", new Object[]{sparseLongArray, new Integer(i)})).booleanValue();
        }
        if (sparseLongArray.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean containsValue(SparseLongArray sparseLongArray, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b12f8970", new Object[]{sparseLongArray, new Long(j)})).booleanValue();
        }
        if (sparseLongArray.indexOfValue(j) >= 0) {
            return true;
        }
        return false;
    }

    public static final void forEach(SparseLongArray sparseLongArray, u1a<? super Integer, ? super Long, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34683455", new Object[]{sparseLongArray, u1aVar});
            return;
        }
        int size = sparseLongArray.size();
        for (int i = 0; i < size; i++) {
            u1aVar.invoke(Integer.valueOf(sparseLongArray.keyAt(i)), Long.valueOf(sparseLongArray.valueAt(i)));
        }
    }

    public static final long getOrDefault(SparseLongArray sparseLongArray, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3fa0e903", new Object[]{sparseLongArray, new Integer(i), new Long(j)})).longValue();
        }
        return sparseLongArray.get(i, j);
    }

    public static final long getOrElse(SparseLongArray sparseLongArray, int i, d1a<Long> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("790b5ce6", new Object[]{sparseLongArray, new Integer(i), d1aVar})).longValue();
        }
        int indexOfKey = sparseLongArray.indexOfKey(i);
        if (indexOfKey >= 0) {
            return sparseLongArray.valueAt(indexOfKey);
        }
        return d1aVar.invoke().longValue();
    }

    public static final int getSize(SparseLongArray sparseLongArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f1460f0", new Object[]{sparseLongArray})).intValue();
        }
        return sparseLongArray.size();
    }

    public static final boolean isEmpty(SparseLongArray sparseLongArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4038d7cd", new Object[]{sparseLongArray})).booleanValue();
        }
        if (sparseLongArray.size() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean isNotEmpty(SparseLongArray sparseLongArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1349f2ce", new Object[]{sparseLongArray})).booleanValue();
        }
        if (sparseLongArray.size() != 0) {
            return true;
        }
        return false;
    }

    public static final tdf keyIterator(final SparseLongArray sparseLongArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tdf) ipChange.ipc$dispatch("7431cdfd", new Object[]{sparseLongArray});
        }
        return new tdf() { // from class: androidx.core.util.SparseLongArrayKt$keyIterator$1
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private int index;

            public static /* synthetic */ Object ipc$super(SparseLongArrayKt$keyIterator$1 sparseLongArrayKt$keyIterator$1, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/util/SparseLongArrayKt$keyIterator$1");
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
                if (this.index < sparseLongArray.size()) {
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
                SparseLongArray sparseLongArray2 = sparseLongArray;
                int i = this.index;
                this.index = 1 + i;
                return sparseLongArray2.keyAt(i);
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

    public static final SparseLongArray plus(SparseLongArray sparseLongArray, SparseLongArray sparseLongArray2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseLongArray) ipChange.ipc$dispatch("8e297296", new Object[]{sparseLongArray, sparseLongArray2});
        }
        SparseLongArray sparseLongArray3 = new SparseLongArray(sparseLongArray.size() + sparseLongArray2.size());
        putAll(sparseLongArray3, sparseLongArray);
        putAll(sparseLongArray3, sparseLongArray2);
        return sparseLongArray3;
    }

    public static final void putAll(SparseLongArray sparseLongArray, SparseLongArray sparseLongArray2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ff7bfd7", new Object[]{sparseLongArray, sparseLongArray2});
            return;
        }
        int size = sparseLongArray2.size();
        for (int i = 0; i < size; i++) {
            sparseLongArray.put(sparseLongArray2.keyAt(i), sparseLongArray2.valueAt(i));
        }
    }

    public static final boolean remove(SparseLongArray sparseLongArray, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac1e76f", new Object[]{sparseLongArray, new Integer(i), new Long(j)})).booleanValue();
        }
        int indexOfKey = sparseLongArray.indexOfKey(i);
        if (indexOfKey < 0 || j != sparseLongArray.valueAt(indexOfKey)) {
            return false;
        }
        sparseLongArray.removeAt(indexOfKey);
        return true;
    }

    public static final void set(SparseLongArray sparseLongArray, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11c9449", new Object[]{sparseLongArray, new Integer(i), new Long(j)});
        } else {
            sparseLongArray.put(i, j);
        }
    }

    public static final wjh valueIterator(final SparseLongArray sparseLongArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wjh) ipChange.ipc$dispatch("827acf44", new Object[]{sparseLongArray});
        }
        return new wjh() { // from class: androidx.core.util.SparseLongArrayKt$valueIterator$1
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private int index;

            public static /* synthetic */ Object ipc$super(SparseLongArrayKt$valueIterator$1 sparseLongArrayKt$valueIterator$1, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/util/SparseLongArrayKt$valueIterator$1");
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
                if (this.index < sparseLongArray.size()) {
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
                SparseLongArray sparseLongArray2 = sparseLongArray;
                int i = this.index;
                this.index = 1 + i;
                return sparseLongArray2.valueAt(i);
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

    public static final boolean containsKey(SparseLongArray sparseLongArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7ae25c1", new Object[]{sparseLongArray, new Integer(i)})).booleanValue();
        }
        return sparseLongArray.indexOfKey(i) >= 0;
    }
}
