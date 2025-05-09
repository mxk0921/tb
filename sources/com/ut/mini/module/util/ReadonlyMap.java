package com.ut.mini.module.util;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import tb.njn;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ReadonlyMap<K, V> extends HashMap<K, V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(962593326);
    }

    public ReadonlyMap(int i, float f) {
        super(i, f);
    }

    public static /* synthetic */ Object ipc$super(ReadonlyMap readonlyMap, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2084926247:
                return super.get(objArr[0]);
            case -1959305173:
                return super.getOrDefault(objArr[0], objArr[1]);
            case -1952759047:
                return super.keySet();
            case -1515997081:
                return new Boolean(super.containsKey(objArr[0]));
            case -1280511290:
                return super.entrySet();
            case -453046855:
                return new Boolean(super.containsValue(objArr[0]));
            case -242754226:
                return new Boolean(super.isEmpty());
            case -180243556:
                super.forEach(njn.a(objArr[0]));
                return null;
            case 648458174:
                return super.values();
            case 845773819:
                return new Integer(super.size());
            case 2025021518:
                return super.clone();
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ut/mini/module/util/ReadonlyMap");
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap
    public Object clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("78b3604e", new Object[]{this});
        }
        return super.clone();
    }

    @Override // java.util.HashMap, java.util.Map
    public V compute(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("4a6cc3a1", new Object[]{this, k, biFunction});
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.Map
    public V computeIfAbsent(K k, Function<? super K, ? extends V> function) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("a44a0690", new Object[]{this, k, function});
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.Map
    public V computeIfPresent(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("bf62b5d1", new Object[]{this, k, biFunction});
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5a3b867", new Object[]{this, obj})).booleanValue();
        }
        return super.containsKey(obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4ff0db9", new Object[]{this, obj})).booleanValue();
        }
        return super.containsValue(obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("b3acf2c6", new Object[]{this});
        }
        return super.entrySet();
    }

    @Override // java.util.HashMap, java.util.Map
    public void forEach(BiConsumer<? super K, ? super V> biConsumer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f541b39c", new Object[]{this, biConsumer});
        } else {
            super.forEach(biConsumer);
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("83ba8cd9", new Object[]{this, obj});
        }
        return (V) super.get(obj);
    }

    @Override // java.util.HashMap, java.util.Map
    public V getOrDefault(Object obj, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("8b37602b", new Object[]{this, obj, v});
        }
        return (V) super.getOrDefault(obj, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        }
        return super.isEmpty();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("8b9b42f9", new Object[]{this});
        }
        return super.keySet();
    }

    @Override // java.util.HashMap, java.util.Map
    public V merge(K k, V v, BiFunction<? super V, ? super V, ? extends V> biFunction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("2bdd79fe", new Object[]{this, k, v, biFunction});
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("dbe24724", new Object[]{this, k, v});
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6703aacc", new Object[]{this, map});
        }
    }

    @Override // java.util.HashMap, java.util.Map
    public V putIfAbsent(K k, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("244c40e", new Object[]{this, k, v});
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("5a7e4beb", new Object[]{this, obj});
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.Map
    public V replace(K k, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("f6c00f1f", new Object[]{this, k, v});
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.Map
    public void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c6e31b7", new Object[]{this, biFunction});
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public int size() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
        }
        return super.size();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("26a6afbe", new Object[]{this});
        }
        return super.values();
    }

    public ReadonlyMap(int i) {
        super(i);
    }

    @Override // java.util.HashMap, java.util.Map
    public boolean remove(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2235247", new Object[]{this, obj, obj2})).booleanValue();
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.Map
    public boolean replace(K k, V v, V v2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e19f593", new Object[]{this, k, v, v2})).booleanValue();
        }
        return false;
    }

    public ReadonlyMap() {
    }

    public ReadonlyMap(Map<? extends K, ? extends V> map) {
        super(map);
    }
}
