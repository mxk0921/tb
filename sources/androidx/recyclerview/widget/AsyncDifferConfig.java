package androidx.recyclerview.widget;

import androidx.recyclerview.widget.DiffUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class AsyncDifferConfig<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Executor mBackgroundThreadExecutor;
    private final DiffUtil.ItemCallback<T> mDiffCallback;
    private final Executor mMainThreadExecutor;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class Builder<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static Executor sDiffExecutor;
        private static final Object sExecutorLock = new Object();
        private Executor mBackgroundThreadExecutor;
        private final DiffUtil.ItemCallback<T> mDiffCallback;
        private Executor mMainThreadExecutor;

        public Builder(DiffUtil.ItemCallback<T> itemCallback) {
            this.mDiffCallback = itemCallback;
        }

        public AsyncDifferConfig<T> build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AsyncDifferConfig) ipChange.ipc$dispatch("942ef8c6", new Object[]{this});
            }
            if (this.mBackgroundThreadExecutor == null) {
                synchronized (sExecutorLock) {
                    try {
                        if (sDiffExecutor == null) {
                            sDiffExecutor = Executors.newFixedThreadPool(2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.mBackgroundThreadExecutor = sDiffExecutor;
            }
            return new AsyncDifferConfig<>(this.mMainThreadExecutor, this.mBackgroundThreadExecutor, this.mDiffCallback);
        }

        public Builder<T> setBackgroundThreadExecutor(Executor executor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("8ed115e2", new Object[]{this, executor});
            }
            this.mBackgroundThreadExecutor = executor;
            return this;
        }

        public Builder<T> setMainThreadExecutor(Executor executor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("2cc2f0ed", new Object[]{this, executor});
            }
            this.mMainThreadExecutor = executor;
            return this;
        }
    }

    public AsyncDifferConfig(Executor executor, Executor executor2, DiffUtil.ItemCallback<T> itemCallback) {
        this.mMainThreadExecutor = executor;
        this.mBackgroundThreadExecutor = executor2;
        this.mDiffCallback = itemCallback;
    }

    public Executor getBackgroundThreadExecutor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Executor) ipChange.ipc$dispatch("2b59b84e", new Object[]{this});
        }
        return this.mBackgroundThreadExecutor;
    }

    public DiffUtil.ItemCallback<T> getDiffCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DiffUtil.ItemCallback) ipChange.ipc$dispatch("e3f411af", new Object[]{this});
        }
        return this.mDiffCallback;
    }

    public Executor getMainThreadExecutor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Executor) ipChange.ipc$dispatch("5046b759", new Object[]{this});
        }
        return this.mMainThreadExecutor;
    }
}
