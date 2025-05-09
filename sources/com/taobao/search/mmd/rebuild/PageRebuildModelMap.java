package com.taobao.search.mmd.rebuild;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import tb.a07;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class PageRebuildModelMap<E, T> extends LinkedHashMap<E, T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int cacheSize;

    static {
        t2o.a(815792558);
    }

    public PageRebuildModelMap() {
        this(0, 1, null);
    }

    public static /* synthetic */ Object ipc$super(PageRebuildModelMap pageRebuildModelMap, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1952759047:
                return super.keySet();
            case -1280511290:
                return super.entrySet();
            case 648458174:
                return super.values();
            case 845773819:
                return new Integer(super.size());
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/mmd/rebuild/PageRebuildModelMap");
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<E, T>> entrySet() {
        return (Set<Map.Entry<E, T>>) getEntries();
    }

    public final int getCacheSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6be5a9e7", new Object[]{this})).intValue();
        }
        return this.cacheSize;
    }

    public /* bridge */ Set<Map.Entry<Object, Object>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set<Object> getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<Object> getValues() {
        return super.values();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<E> keySet() {
        return (Set<E>) getKeys();
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<E, T> entry) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6471a6cf", new Object[]{this, entry})).booleanValue();
        }
        if (size() > this.cacheSize) {
            return true;
        }
        return false;
    }

    public final void setCacheSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8c66f9b", new Object[]{this, new Integer(i)});
        } else {
            this.cacheSize = i;
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<T> values() {
        return (Collection<T>) getValues();
    }

    public /* synthetic */ PageRebuildModelMap(int i, int i2, a07 a07Var) {
        this((i2 & 1) != 0 ? 3 : i);
    }

    public PageRebuildModelMap(int i) {
        this.cacheSize = i;
    }
}
