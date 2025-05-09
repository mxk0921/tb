package com.alipay.android.msp.framework.wire;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class TagMap<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Comparator<? super Map.Entry<Integer, ?>> f3692a = new Comparator<Map.Entry<Integer, ?>>() { // from class: com.alipay.android.msp.framework.wire.TagMap.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public int compare(Map.Entry<Integer, ?> entry, Map.Entry<Integer, ?> entry2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("51cd4c3f", new Object[]{this, entry, entry2})).intValue() : entry.getKey().compareTo(entry2.getKey());
        }
    };
    public List<T> values;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class Compact<T> extends TagMap<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Object[] elementsByTag;
        public int maxTag;

        public Compact(Map<Integer, T> map, int i) {
            super(map);
            this.maxTag = i;
            this.elementsByTag = new Object[i + 1];
            for (Map.Entry<Integer, T> entry : map.entrySet()) {
                Integer key = entry.getKey();
                if (key.intValue() > 0) {
                    this.elementsByTag[key.intValue()] = entry.getValue();
                } else {
                    throw new IllegalArgumentException("Input map key is negative or zero");
                }
            }
        }

        public static <T> Compact<T> compactTagMapOf(Map<Integer, T> map, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Compact) ipChange.ipc$dispatch("f699ffa6", new Object[]{map, new Integer(i)});
            }
            return new Compact<>(map, i);
        }

        public static /* synthetic */ Object ipc$super(Compact compact, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/wire/TagMap$Compact");
        }

        @Override // com.alipay.android.msp.framework.wire.TagMap
        public final boolean containsKey(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ff844fa0", new Object[]{this, new Integer(i)})).booleanValue();
            }
            if (i <= this.maxTag && this.elementsByTag[i] != null) {
                return true;
            }
            return false;
        }

        @Override // com.alipay.android.msp.framework.wire.TagMap
        public final T get(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("bb5c862c", new Object[]{this, new Integer(i)});
            }
            if (i > this.maxTag) {
                return null;
            }
            return (T) this.elementsByTag[i];
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class Sparse<T> extends TagMap<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Map<Integer, T> map;

        public Sparse(Map<Integer, T> map) {
            super(map);
            this.map = map;
        }

        public static /* synthetic */ Object ipc$super(Sparse sparse, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/wire/TagMap$Sparse");
        }

        public static <T> Sparse<T> sparseTagMapOf(Map<Integer, T> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Sparse) ipChange.ipc$dispatch("c1ef9ed1", new Object[]{map});
            }
            return new Sparse<>(map);
        }

        @Override // com.alipay.android.msp.framework.wire.TagMap
        public final boolean containsKey(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ff844fa0", new Object[]{this, new Integer(i)})).booleanValue();
            }
            return this.map.containsKey(Integer.valueOf(i));
        }

        @Override // com.alipay.android.msp.framework.wire.TagMap
        public final T get(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("bb5c862c", new Object[]{this, new Integer(i)});
            }
            return this.map.get(Integer.valueOf(i));
        }
    }

    public TagMap(Map<Integer, T> map) {
        this.values = a(map);
    }

    public static <T> List<T> a(Map<Integer, T> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ffc624b", new Object[]{map});
        }
        TreeSet treeSet = new TreeSet(f3692a);
        treeSet.addAll(map.entrySet());
        ArrayList arrayList = new ArrayList();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((Map.Entry) it.next()).getValue());
        }
        return arrayList;
    }

    public static <T> TagMap<T> of(Map<Integer, T> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TagMap) ipChange.ipc$dispatch("1a49ebf", new Object[]{map});
        }
        int i = -1;
        for (Integer num : map.keySet()) {
            int intValue = num.intValue();
            if (intValue > i) {
                i = intValue;
            }
        }
        int size = map.size();
        if (i <= 64 || size / i > 0.75f) {
            return Compact.compactTagMapOf(map, i);
        }
        return Sparse.sparseTagMapOf(map);
    }

    public abstract boolean containsKey(int i);

    public abstract T get(int i);

    public Collection<T> values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("26a6afbe", new Object[]{this});
        }
        return this.values;
    }
}
