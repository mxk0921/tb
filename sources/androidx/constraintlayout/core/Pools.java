package androidx.constraintlayout.core;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class Pools {
    private static final boolean DEBUG = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface Pool<T> {
        T acquire();

        boolean release(T t);

        void releaseAll(T[] tArr, int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class SimplePool<T> implements Pool<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Object[] mPool;
        private int mPoolSize;

        public SimplePool(int i) {
            if (i > 0) {
                this.mPool = new Object[i];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }

        private boolean isInPool(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("21f54f12", new Object[]{this, t})).booleanValue();
            }
            for (int i = 0; i < this.mPoolSize; i++) {
                if (this.mPool[i] == t) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.constraintlayout.core.Pools.Pool
        public boolean release(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6ae8596e", new Object[]{this, t})).booleanValue();
            }
            int i = this.mPoolSize;
            Object[] objArr = this.mPool;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.mPoolSize = i + 1;
            return true;
        }

        @Override // androidx.constraintlayout.core.Pools.Pool
        public void releaseAll(T[] tArr, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("788aa313", new Object[]{this, tArr, new Integer(i)});
                return;
            }
            if (i > tArr.length) {
                i = tArr.length;
            }
            for (int i2 = 0; i2 < i; i2++) {
                T t = tArr[i2];
                int i3 = this.mPoolSize;
                Object[] objArr = this.mPool;
                if (i3 < objArr.length) {
                    objArr[i3] = t;
                    this.mPoolSize = i3 + 1;
                }
            }
        }

        @Override // androidx.constraintlayout.core.Pools.Pool
        public T acquire() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("e292f275", new Object[]{this});
            }
            int i = this.mPoolSize;
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            Object[] objArr = this.mPool;
            T t = (T) objArr[i2];
            objArr[i2] = null;
            this.mPoolSize = i - 1;
            return t;
        }
    }

    private Pools() {
    }
}
