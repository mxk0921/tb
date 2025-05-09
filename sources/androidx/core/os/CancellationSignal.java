package androidx.core.os;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class CancellationSignal {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mCancelInProgress;
    private Object mCancellationSignalObj;
    private boolean mIsCanceled;
    private OnCancelListener mOnCancelListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface OnCancelListener {
        void onCancel();
    }

    private void waitForCancelFinishedLocked() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ace93f1", new Object[]{this});
            return;
        }
        while (this.mCancelInProgress) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        synchronized (this) {
            try {
                if (!this.mIsCanceled) {
                    this.mIsCanceled = true;
                    this.mCancelInProgress = true;
                    OnCancelListener onCancelListener = this.mOnCancelListener;
                    Object obj = this.mCancellationSignalObj;
                    if (onCancelListener != null) {
                        try {
                            onCancelListener.onCancel();
                        } catch (Throwable th) {
                            synchronized (this) {
                                this.mCancelInProgress = false;
                                notifyAll();
                                throw th;
                            }
                        }
                    }
                    if (obj != null) {
                        ((android.os.CancellationSignal) obj).cancel();
                    }
                    synchronized (this) {
                        this.mCancelInProgress = false;
                        notifyAll();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Object getCancellationSignalObject() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("441d836b", new Object[]{this});
        }
        synchronized (this) {
            try {
                if (this.mCancellationSignalObj == null) {
                    android.os.CancellationSignal cancellationSignal = new android.os.CancellationSignal();
                    this.mCancellationSignalObj = cancellationSignal;
                    if (this.mIsCanceled) {
                        cancellationSignal.cancel();
                    }
                }
                obj = this.mCancellationSignalObj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public boolean isCanceled() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83e706ee", new Object[]{this})).booleanValue();
        }
        synchronized (this) {
            z = this.mIsCanceled;
        }
        return z;
    }

    public void setOnCancelListener(OnCancelListener onCancelListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("254087c0", new Object[]{this, onCancelListener});
            return;
        }
        synchronized (this) {
            try {
                waitForCancelFinishedLocked();
                if (this.mOnCancelListener != onCancelListener) {
                    this.mOnCancelListener = onCancelListener;
                    if (this.mIsCanceled && onCancelListener != null) {
                        onCancelListener.onCancel();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void throwIfCanceled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6e11ae3", new Object[]{this});
        } else if (isCanceled()) {
            throw new OperationCanceledException();
        }
    }
}
