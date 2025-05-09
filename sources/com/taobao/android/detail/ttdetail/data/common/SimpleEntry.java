package com.taobao.android.detail.ttdetail.data.common;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class SimpleEntry<K, V> implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private K key;
    private V value;

    static {
        t2o.a(912261549);
    }

    public SimpleEntry(K k, V v) {
        this.key = k;
        this.value = v;
    }

    private static boolean eq(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd3b1e6f", new Object[]{obj, obj2})).booleanValue();
        }
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (!(obj instanceof SimpleEntry)) {
            return false;
        }
        SimpleEntry simpleEntry = (SimpleEntry) obj;
        if (!eq(this.key, simpleEntry.getKey()) || !eq(this.value, simpleEntry.getValue())) {
            return false;
        }
        return true;
    }

    public K getKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (K) ipChange.ipc$dispatch("24024602", new Object[]{this});
        }
        return this.key;
    }

    public V getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("6045ccb0", new Object[]{this});
        }
        return this.value;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        K k = this.key;
        if (k == null) {
            i = 0;
        } else {
            i = k.hashCode();
        }
        V v = this.value;
        if (v != null) {
            i2 = v.hashCode();
        }
        return i2 ^ i;
    }

    public K setKey(K k) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (K) ipChange.ipc$dispatch("a76193b2", new Object[]{this, k});
        }
        K k2 = this.key;
        this.key = k;
        return k2;
    }

    public V setValue(V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("b40eb7e0", new Object[]{this, v});
        }
        V v2 = this.value;
        this.value = v;
        return v2;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.key + "=" + this.value;
    }

    public SimpleEntry(SimpleEntry<? extends K, ? extends V> simpleEntry) {
        this.key = (K) simpleEntry.getKey();
        this.value = (V) simpleEntry.getValue();
    }
}
