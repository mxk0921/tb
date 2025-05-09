package com.taobao.phenix.cache.memory;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayDeque;
import java.util.concurrent.ConcurrentHashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class LimitedConcurrentHashMap<K, V> extends ConcurrentHashMap<K, V> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 1;
    private final int maxSize;
    private final ArrayDeque<K> orderQueue = new ArrayDeque<>();

    static {
        t2o.a(620757055);
    }

    public LimitedConcurrentHashMap(int i) {
        super(i);
        this.maxSize = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(LimitedConcurrentHashMap limitedConcurrentHashMap, String str, Object... objArr) {
        if (str.hashCode() == 38061070) {
            return super.putIfAbsent(objArr[0], objArr[1]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/phenix/cache/memory/LimitedConcurrentHashMap");
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        V v2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("dbe24724", new Object[]{this, k, v});
        }
        synchronized (this) {
            try {
                v2 = (V) super.putIfAbsent(k, v);
                if (v2 == null) {
                    this.orderQueue.offer(k);
                    while (this.orderQueue.size() > this.maxSize) {
                        K poll = this.orderQueue.poll();
                        if (poll != null) {
                            remove(poll);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return v2;
    }
}
