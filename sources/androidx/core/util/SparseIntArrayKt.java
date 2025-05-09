package androidx.core.util;

import android.util.SparseIntArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import kotlin.Metadata;
import tb.d1a;
import tb.pg1;
import tb.tdf;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\u0004\u0010\u0005\u001a$\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\r\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\r\u0010\u0005\u001a\u001c\u0010\u000e\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u000e\u0010\u0005\u001a$\u0010\u0010\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a*\u0010\u0013\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0012H\u0086\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0014\u0010\u0015\u001a\u00020\u0003*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0014\u0010\u0017\u001a\u00020\u0003*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0017\u0010\u0016\u001a!\u0010\u0018\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001a\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aL\u0010 \u001a\u00020\u0007*\u00020\u000026\u0010\u001f\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u001cH\u0086\b¢\u0006\u0004\b \u0010!\u001a\u0011\u0010#\u001a\u00020\"*\u00020\u0000¢\u0006\u0004\b#\u0010$\u001a\u0011\u0010%\u001a\u00020\"*\u00020\u0000¢\u0006\u0004\b%\u0010$\"\u0016\u0010(\u001a\u00020\u0001*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Landroid/util/SparseIntArray;", "", "key", "", "contains", "(Landroid/util/SparseIntArray;I)Z", "value", "Ltb/xhv;", "set", "(Landroid/util/SparseIntArray;II)V", "other", "plus", "(Landroid/util/SparseIntArray;Landroid/util/SparseIntArray;)Landroid/util/SparseIntArray;", "containsKey", "containsValue", AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, "getOrDefault", "(Landroid/util/SparseIntArray;II)I", "Lkotlin/Function0;", "getOrElse", "(Landroid/util/SparseIntArray;ILtb/d1a;)I", "isEmpty", "(Landroid/util/SparseIntArray;)Z", "isNotEmpty", "remove", "(Landroid/util/SparseIntArray;II)Z", "putAll", "(Landroid/util/SparseIntArray;Landroid/util/SparseIntArray;)V", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "action", pg1.ATOM_EXT_forEach, "(Landroid/util/SparseIntArray;Ltb/u1a;)V", "Ltb/tdf;", "keyIterator", "(Landroid/util/SparseIntArray;)Ltb/tdf;", "valueIterator", "getSize", "(Landroid/util/SparseIntArray;)I", "size", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class SparseIntArrayKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final boolean contains(SparseIntArray sparseIntArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("31931c23", new Object[]{sparseIntArray, new Integer(i)})).booleanValue();
        }
        if (sparseIntArray.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean containsKey(SparseIntArray sparseIntArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44b80584", new Object[]{sparseIntArray, new Integer(i)})).booleanValue();
        }
        if (sparseIntArray.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean containsValue(SparseIntArray sparseIntArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ab3efd6", new Object[]{sparseIntArray, new Integer(i)})).booleanValue();
        }
        if (sparseIntArray.indexOfValue(i) >= 0) {
            return true;
        }
        return false;
    }

    public static final void forEach(SparseIntArray sparseIntArray, u1a<? super Integer, ? super Integer, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd9ef69e", new Object[]{sparseIntArray, u1aVar});
            return;
        }
        int size = sparseIntArray.size();
        for (int i = 0; i < size; i++) {
            u1aVar.invoke(Integer.valueOf(sparseIntArray.keyAt(i)), Integer.valueOf(sparseIntArray.valueAt(i)));
        }
    }

    public static final int getOrDefault(SparseIntArray sparseIntArray, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14d900e", new Object[]{sparseIntArray, new Integer(i), new Integer(i2)})).intValue();
        }
        return sparseIntArray.get(i, i2);
    }

    public static final int getOrElse(SparseIntArray sparseIntArray, int i, d1a<Integer> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e90db4c", new Object[]{sparseIntArray, new Integer(i), d1aVar})).intValue();
        }
        int indexOfKey = sparseIntArray.indexOfKey(i);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        return d1aVar.invoke().intValue();
    }

    public static final int getSize(SparseIntArray sparseIntArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6e7b9bff", new Object[]{sparseIntArray})).intValue();
        }
        return sparseIntArray.size();
    }

    public static final boolean isEmpty(SparseIntArray sparseIntArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6c71bc4", new Object[]{sparseIntArray})).booleanValue();
        }
        if (sparseIntArray.size() == 0) {
            return true;
        }
        return false;
    }

    public static final tdf keyIterator(final SparseIntArray sparseIntArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tdf) ipChange.ipc$dispatch("7ed5093a", new Object[]{sparseIntArray});
        }
        return new tdf() { // from class: androidx.core.util.SparseIntArrayKt$keyIterator$1
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private int index;

            public static /* synthetic */ Object ipc$super(SparseIntArrayKt$keyIterator$1 sparseIntArrayKt$keyIterator$1, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/util/SparseIntArrayKt$keyIterator$1");
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
                if (this.index < sparseIntArray.size()) {
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
                SparseIntArray sparseIntArray2 = sparseIntArray;
                int i = this.index;
                this.index = 1 + i;
                return sparseIntArray2.keyAt(i);
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

    public static final SparseIntArray plus(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseIntArray) ipChange.ipc$dispatch("7ae47c9b", new Object[]{sparseIntArray, sparseIntArray2});
        }
        SparseIntArray sparseIntArray3 = new SparseIntArray(sparseIntArray.size() + sparseIntArray2.size());
        putAll(sparseIntArray3, sparseIntArray);
        putAll(sparseIntArray3, sparseIntArray2);
        return sparseIntArray3;
    }

    public static final void putAll(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("236cf699", new Object[]{sparseIntArray, sparseIntArray2});
            return;
        }
        int size = sparseIntArray2.size();
        for (int i = 0; i < size; i++) {
            sparseIntArray.put(sparseIntArray2.keyAt(i), sparseIntArray2.valueAt(i));
        }
    }

    public static final boolean remove(SparseIntArray sparseIntArray, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("31255643", new Object[]{sparseIntArray, new Integer(i), new Integer(i2)})).booleanValue();
        }
        int indexOfKey = sparseIntArray.indexOfKey(i);
        if (indexOfKey < 0 || i2 != sparseIntArray.valueAt(indexOfKey)) {
            return false;
        }
        sparseIntArray.removeAt(indexOfKey);
        return true;
    }

    public static final void set(SparseIntArray sparseIntArray, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a47295a1", new Object[]{sparseIntArray, new Integer(i), new Integer(i2)});
        } else {
            sparseIntArray.put(i, i2);
        }
    }

    public static final tdf valueIterator(final SparseIntArray sparseIntArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tdf) ipChange.ipc$dispatch("369b3a4c", new Object[]{sparseIntArray});
        }
        return new tdf() { // from class: androidx.core.util.SparseIntArrayKt$valueIterator$1
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private int index;

            public static /* synthetic */ Object ipc$super(SparseIntArrayKt$valueIterator$1 sparseIntArrayKt$valueIterator$1, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/util/SparseIntArrayKt$valueIterator$1");
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
                if (this.index < sparseIntArray.size()) {
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
                SparseIntArray sparseIntArray2 = sparseIntArray;
                int i = this.index;
                this.index = 1 + i;
                return sparseIntArray2.valueAt(i);
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

    public static final boolean isNotEmpty(SparseIntArray sparseIntArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd961ca3", new Object[]{sparseIntArray})).booleanValue();
        }
        return sparseIntArray.size() != 0;
    }
}
