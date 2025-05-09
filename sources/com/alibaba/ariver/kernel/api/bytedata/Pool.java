package com.alibaba.ariver.kernel.api.bytedata;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayDeque;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class Pool<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ArrayDeque<T> freeObjects;
    public final int max;
    public int peak;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface Poolable {
        void reset();
    }

    public Pool() {
        this(16, Integer.MAX_VALUE);
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            this.freeObjects.clear();
        }
    }

    public void free(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5a23e0f", new Object[]{this, t});
        } else if (t != null) {
            if (this.freeObjects.size() < this.max) {
                this.freeObjects.add(t);
                this.peak = Math.max(this.peak, this.freeObjects.size());
            }
            if (t instanceof Poolable) {
                ((Poolable) t).reset();
            }
        } else {
            throw new IllegalArgumentException("object cannot be null.");
        }
    }

    public int getFree() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2016c25c", new Object[]{this})).intValue();
        }
        return this.freeObjects.size();
    }

    public abstract T newObject();

    public T obtain() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("f2287a06", new Object[]{this});
        }
        if (this.freeObjects.size() == 0) {
            return newObject();
        }
        return this.freeObjects.pop();
    }

    public Pool(int i) {
        this(i, Integer.MAX_VALUE);
    }

    public Pool(int i, int i2) {
        this.freeObjects = new ArrayDeque<>(i);
        this.max = i2;
    }

    public void freeAll(List<T> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2559ca8d", new Object[]{this, list});
        } else if (list != null) {
            ArrayDeque<T> arrayDeque = this.freeObjects;
            int i = this.max;
            for (int i2 = 0; i2 < list.size(); i2++) {
                T t = list.get(i2);
                if (t != null) {
                    if (arrayDeque.size() < i) {
                        arrayDeque.add(t);
                    }
                    if (t instanceof Poolable) {
                        ((Poolable) t).reset();
                    }
                }
            }
            this.peak = Math.max(this.peak, arrayDeque.size());
        } else {
            throw new IllegalArgumentException("object cannot be null.");
        }
    }
}
