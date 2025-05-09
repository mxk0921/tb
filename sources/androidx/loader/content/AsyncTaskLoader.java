package androidx.loader.content;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.os.OperationCanceledException;
import androidx.core.util.TimeUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class AsyncTaskLoader<D> extends Loader<D> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final boolean DEBUG = false;
    public static final String TAG = "AsyncTaskLoader";
    public volatile AsyncTaskLoader<D>.LoadTask mCancellingTask;
    private final Executor mExecutor;
    public Handler mHandler;
    public long mLastLoadCompleteTime;
    public volatile AsyncTaskLoader<D>.LoadTask mTask;
    public long mUpdateThrottle;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public final class LoadTask extends ModernAsyncTask<Void, Void, D> implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final CountDownLatch mDone = new CountDownLatch(1);
        public boolean waiting;

        public LoadTask() {
        }

        public static /* synthetic */ Object ipc$super(LoadTask loadTask, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/loader/content/AsyncTaskLoader$LoadTask");
        }

        @Override // androidx.loader.content.ModernAsyncTask
        public void onCancelled(D d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb2bd555", new Object[]{this, d});
                return;
            }
            try {
                AsyncTaskLoader.this.dispatchOnCancelled(this, d);
            } finally {
                this.mDone.countDown();
            }
        }

        @Override // androidx.loader.content.ModernAsyncTask
        public void onPostExecute(D d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, d});
                return;
            }
            try {
                AsyncTaskLoader.this.dispatchOnLoadComplete(this, d);
            } finally {
                this.mDone.countDown();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.waiting = false;
            AsyncTaskLoader.this.executePendingTask();
        }

        public void waitForLoader() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8edb994e", new Object[]{this});
                return;
            }
            try {
                this.mDone.await();
            } catch (InterruptedException unused) {
            }
        }

        public D doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (D) ipChange.ipc$dispatch("c7a0ec9b", new Object[]{this, voidArr});
            }
            try {
                return (D) AsyncTaskLoader.this.onLoadInBackground();
            } catch (OperationCanceledException e) {
                if (isCancelled()) {
                    return null;
                }
                throw e;
            }
        }
    }

    public AsyncTaskLoader(Context context) {
        this(context, ModernAsyncTask.THREAD_POOL_EXECUTOR);
    }

    public static /* synthetic */ Object ipc$super(AsyncTaskLoader asyncTaskLoader, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 179534607) {
            super.dump((String) objArr[0], (FileDescriptor) objArr[1], (PrintWriter) objArr[2], (String[]) objArr[3]);
            return null;
        } else if (hashCode == 1213341401) {
            super.onForceLoad();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in androidx/loader/content/AsyncTaskLoader");
        }
    }

    public void cancelLoadInBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2133e5da", new Object[]{this});
        }
    }

    public void dispatchOnCancelled(AsyncTaskLoader<D>.LoadTask loadTask, D d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b14785c3", new Object[]{this, loadTask, d});
            return;
        }
        onCanceled(d);
        if (this.mCancellingTask == loadTask) {
            rollbackContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mCancellingTask = null;
            deliverCancellation();
            executePendingTask();
        }
    }

    public void dispatchOnLoadComplete(AsyncTaskLoader<D>.LoadTask loadTask, D d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d073f43", new Object[]{this, loadTask, d});
        } else if (this.mTask != loadTask) {
            dispatchOnCancelled(loadTask, d);
        } else if (isAbandoned()) {
            onCanceled(d);
        } else {
            commitContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mTask = null;
            deliverResult(d);
        }
    }

    @Override // androidx.loader.content.Loader
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab37b0f", new Object[]{this, str, fileDescriptor, printWriter, strArr});
            return;
        }
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (this.mTask != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.mTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mTask.waiting);
        }
        if (this.mCancellingTask != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.mCancellingTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mCancellingTask.waiting);
        }
        if (this.mUpdateThrottle != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            TimeUtils.formatDuration(this.mUpdateThrottle, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            TimeUtils.formatDuration(this.mLastLoadCompleteTime, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    public void executePendingTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93621e0e", new Object[]{this});
        } else if (this.mCancellingTask == null && this.mTask != null) {
            if (this.mTask.waiting) {
                this.mTask.waiting = false;
                this.mHandler.removeCallbacks(this.mTask);
            }
            if (this.mUpdateThrottle <= 0 || SystemClock.uptimeMillis() >= this.mLastLoadCompleteTime + this.mUpdateThrottle) {
                this.mTask.executeOnExecutor(this.mExecutor, null);
                return;
            }
            this.mTask.waiting = true;
            this.mHandler.postAtTime(this.mTask, this.mLastLoadCompleteTime + this.mUpdateThrottle);
        }
    }

    public boolean isLoadInBackgroundCanceled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("158abdc7", new Object[]{this})).booleanValue();
        }
        if (this.mCancellingTask != null) {
            return true;
        }
        return false;
    }

    public abstract D loadInBackground();

    @Override // androidx.loader.content.Loader
    public boolean onCancelLoad() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29a086ca", new Object[]{this})).booleanValue();
        }
        if (this.mTask != null) {
            if (!this.mStarted) {
                this.mContentChanged = true;
            }
            if (this.mCancellingTask != null) {
                if (this.mTask.waiting) {
                    this.mTask.waiting = false;
                    this.mHandler.removeCallbacks(this.mTask);
                }
                this.mTask = null;
                return false;
            } else if (this.mTask.waiting) {
                this.mTask.waiting = false;
                this.mHandler.removeCallbacks(this.mTask);
                this.mTask = null;
                return false;
            } else {
                z = this.mTask.cancel(false);
                if (z) {
                    this.mCancellingTask = this.mTask;
                    cancelLoadInBackground();
                }
                this.mTask = null;
            }
        }
        return z;
    }

    public void onCanceled(D d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f208663b", new Object[]{this, d});
        }
    }

    @Override // androidx.loader.content.Loader
    public void onForceLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48521ed9", new Object[]{this});
            return;
        }
        super.onForceLoad();
        cancelLoad();
        this.mTask = new LoadTask();
        executePendingTask();
    }

    public D onLoadInBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (D) ipChange.ipc$dispatch("4ec5ac53", new Object[]{this});
        }
        return loadInBackground();
    }

    public void setUpdateThrottle(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51ac4428", new Object[]{this, new Long(j)});
            return;
        }
        this.mUpdateThrottle = j;
        if (j != 0) {
            this.mHandler = new Handler();
        }
    }

    public void waitForLoader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8edb994e", new Object[]{this});
            return;
        }
        AsyncTaskLoader<D>.LoadTask loadTask = this.mTask;
        if (loadTask != null) {
            loadTask.waitForLoader();
        }
    }

    private AsyncTaskLoader(Context context, Executor executor) {
        super(context);
        this.mLastLoadCompleteTime = -10000L;
        this.mExecutor = executor;
    }
}
