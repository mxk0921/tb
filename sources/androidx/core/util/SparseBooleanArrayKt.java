package androidx.core.util;

import android.util.SparseBooleanArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import kotlin.Metadata;
import tb.d1a;
import tb.gh2;
import tb.pg1;
import tb.tdf;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\u0004\u0010\u0005\u001a$\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\r\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\r\u0010\u0005\u001a\u001c\u0010\u000e\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a$\u0010\u0011\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a*\u0010\u0014\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013H\u0086\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0014\u0010\u0016\u001a\u00020\u0003*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0014\u0010\u0018\u001a\u00020\u0003*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0018\u0010\u0017\u001a!\u0010\u0019\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u0012\u001a\u0019\u0010\u001a\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aL\u0010 \u001a\u00020\u0007*\u00020\u000026\u0010\u001f\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u001cH\u0086\b¢\u0006\u0004\b \u0010!\u001a\u0011\u0010#\u001a\u00020\"*\u00020\u0000¢\u0006\u0004\b#\u0010$\u001a\u0011\u0010&\u001a\u00020%*\u00020\u0000¢\u0006\u0004\b&\u0010'\"\u0016\u0010*\u001a\u00020\u0001*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Landroid/util/SparseBooleanArray;", "", "key", "", "contains", "(Landroid/util/SparseBooleanArray;I)Z", "value", "Ltb/xhv;", "set", "(Landroid/util/SparseBooleanArray;IZ)V", "other", "plus", "(Landroid/util/SparseBooleanArray;Landroid/util/SparseBooleanArray;)Landroid/util/SparseBooleanArray;", "containsKey", "containsValue", "(Landroid/util/SparseBooleanArray;Z)Z", AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, "getOrDefault", "(Landroid/util/SparseBooleanArray;IZ)Z", "Lkotlin/Function0;", "getOrElse", "(Landroid/util/SparseBooleanArray;ILtb/d1a;)Z", "isEmpty", "(Landroid/util/SparseBooleanArray;)Z", "isNotEmpty", "remove", "putAll", "(Landroid/util/SparseBooleanArray;Landroid/util/SparseBooleanArray;)V", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "action", pg1.ATOM_EXT_forEach, "(Landroid/util/SparseBooleanArray;Ltb/u1a;)V", "Ltb/tdf;", "keyIterator", "(Landroid/util/SparseBooleanArray;)Ltb/tdf;", "Ltb/gh2;", "valueIterator", "(Landroid/util/SparseBooleanArray;)Ltb/gh2;", "getSize", "(Landroid/util/SparseBooleanArray;)I", "size", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class SparseBooleanArrayKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final boolean contains(SparseBooleanArray sparseBooleanArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f4b4b0a", new Object[]{sparseBooleanArray, new Integer(i)})).booleanValue();
        }
        if (sparseBooleanArray.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean containsKey(SparseBooleanArray sparseBooleanArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("292a9beb", new Object[]{sparseBooleanArray, new Integer(i)})).booleanValue();
        }
        if (sparseBooleanArray.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean containsValue(SparseBooleanArray sparseBooleanArray, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fa54d0e", new Object[]{sparseBooleanArray, new Boolean(z)})).booleanValue();
        }
        if (sparseBooleanArray.indexOfValue(z) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean getOrDefault(SparseBooleanArray sparseBooleanArray, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d802fa69", new Object[]{sparseBooleanArray, new Integer(i), new Boolean(z)})).booleanValue();
        }
        return sparseBooleanArray.get(i, z);
    }

    public static final boolean getOrElse(SparseBooleanArray sparseBooleanArray, int i, d1a<Boolean> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32208cc4", new Object[]{sparseBooleanArray, new Integer(i), d1aVar})).booleanValue();
        }
        int indexOfKey = sparseBooleanArray.indexOfKey(i);
        if (indexOfKey >= 0) {
            return sparseBooleanArray.valueAt(indexOfKey);
        }
        return d1aVar.invoke().booleanValue();
    }

    public static final int getSize(SparseBooleanArray sparseBooleanArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3fb1e038", new Object[]{sparseBooleanArray})).intValue();
        }
        return sparseBooleanArray.size();
    }

    public static final boolean isEmpty(SparseBooleanArray sparseBooleanArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("820e65fd", new Object[]{sparseBooleanArray})).booleanValue();
        }
        if (sparseBooleanArray.size() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean isNotEmpty(SparseBooleanArray sparseBooleanArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95a3df5c", new Object[]{sparseBooleanArray})).booleanValue();
        }
        if (sparseBooleanArray.size() != 0) {
            return true;
        }
        return false;
    }

    public static final tdf keyIterator(final SparseBooleanArray sparseBooleanArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tdf) ipChange.ipc$dispatch("b7b9d2e1", new Object[]{sparseBooleanArray});
        }
        return new tdf() { // from class: androidx.core.util.SparseBooleanArrayKt$keyIterator$1
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private int index;

            public static /* synthetic */ Object ipc$super(SparseBooleanArrayKt$keyIterator$1 sparseBooleanArrayKt$keyIterator$1, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/util/SparseBooleanArrayKt$keyIterator$1");
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
                if (this.index < sparseBooleanArray.size()) {
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
                SparseBooleanArray sparseBooleanArray2 = sparseBooleanArray;
                int i = this.index;
                this.index = 1 + i;
                return sparseBooleanArray2.keyAt(i);
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

    public static final SparseBooleanArray plus(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseBooleanArray) ipChange.ipc$dispatch("2d1ebc34", new Object[]{sparseBooleanArray, sparseBooleanArray2});
        }
        SparseBooleanArray sparseBooleanArray3 = new SparseBooleanArray(sparseBooleanArray.size() + sparseBooleanArray2.size());
        putAll(sparseBooleanArray3, sparseBooleanArray);
        putAll(sparseBooleanArray3, sparseBooleanArray2);
        return sparseBooleanArray3;
    }

    public static final void putAll(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b3a2db9", new Object[]{sparseBooleanArray, sparseBooleanArray2});
            return;
        }
        int size = sparseBooleanArray2.size();
        for (int i = 0; i < size; i++) {
            sparseBooleanArray.put(sparseBooleanArray2.keyAt(i), sparseBooleanArray2.valueAt(i));
        }
    }

    public static final boolean remove(SparseBooleanArray sparseBooleanArray, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c830e8d", new Object[]{sparseBooleanArray, new Integer(i), new Boolean(z)})).booleanValue();
        }
        int indexOfKey = sparseBooleanArray.indexOfKey(i);
        if (indexOfKey < 0 || z != sparseBooleanArray.valueAt(indexOfKey)) {
            return false;
        }
        sparseBooleanArray.delete(i);
        return true;
    }

    public static final void set(SparseBooleanArray sparseBooleanArray, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae7dcceb", new Object[]{sparseBooleanArray, new Integer(i), new Boolean(z)});
        } else {
            sparseBooleanArray.put(i, z);
        }
    }

    public static final gh2 valueIterator(final SparseBooleanArray sparseBooleanArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gh2) ipChange.ipc$dispatch("baefb45a", new Object[]{sparseBooleanArray});
        }
        return new gh2() { // from class: androidx.core.util.SparseBooleanArrayKt$valueIterator$1
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private int index;

            public static /* synthetic */ Object ipc$super(SparseBooleanArrayKt$valueIterator$1 sparseBooleanArrayKt$valueIterator$1, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/util/SparseBooleanArrayKt$valueIterator$1");
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
                if (this.index < sparseBooleanArray.size()) {
                    return true;
                }
                return false;
            }

            public final void setIndex(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("46180fcc", new Object[]{this, new Integer(i)});
                } else {
                    this.index = i;
                }
            }

            @Override // tb.gh2
            public boolean nextBoolean() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("f8aa73c0", new Object[]{this})).booleanValue();
                }
                SparseBooleanArray sparseBooleanArray2 = sparseBooleanArray;
                int i = this.index;
                this.index = 1 + i;
                return sparseBooleanArray2.valueAt(i);
            }
        };
    }

    public static final void forEach(SparseBooleanArray sparseBooleanArray, u1a<? super Integer, ? super Boolean, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6a1857", new Object[]{sparseBooleanArray, u1aVar});
            return;
        }
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            u1aVar.invoke(Integer.valueOf(sparseBooleanArray.keyAt(i)), Boolean.valueOf(sparseBooleanArray.valueAt(i)));
        }
    }
}
