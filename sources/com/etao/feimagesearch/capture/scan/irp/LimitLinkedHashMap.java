package com.etao.feimagesearch.capture.scan.irp;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class LimitLinkedHashMap<K, V> extends LinkedHashMap<K, V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Object lock = new Object();
    private final int maxSize;

    static {
        t2o.a(481296719);
    }

    public LimitLinkedHashMap(int i) {
        super(i, 0.75f, false);
        this.maxSize = i;
    }

    public static /* synthetic */ Object ipc$super(LimitLinkedHashMap limitLinkedHashMap, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2084926247:
                return super.get(objArr[0]);
            case -1272099756:
                super.clear();
                return null;
            case -605927644:
                return super.put(objArr[0], objArr[1]);
            case 1518226411:
                return super.remove(objArr[0]);
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/scan/irp/LimitLinkedHashMap");
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        synchronized (this.lock) {
            super.clear();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        V v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("83ba8cd9", new Object[]{this, obj});
        }
        synchronized (this.lock) {
            v = (V) super.get(obj);
        }
        return v;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        V v2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("dbe24724", new Object[]{this, k, v});
        }
        synchronized (this.lock) {
            v2 = (V) super.put(k, v);
        }
        return v2;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        V v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("5a7e4beb", new Object[]{this, obj});
        }
        synchronized (this.lock) {
            v = (V) super.remove(obj);
        }
        return v;
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<K, V> entry) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6471a6cf", new Object[]{this, entry})).booleanValue();
        }
        synchronized (this.lock) {
            if (size() <= this.maxSize) {
                z = false;
            }
        }
        return z;
    }
}
