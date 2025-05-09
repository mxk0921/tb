package androidx.asynclayoutinflater.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.util.Pools;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ArrayBlockingQueue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class AsyncLayoutInflater {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "AsyncLayoutInflater";
    public LayoutInflater mInflater;
    private Handler.Callback mHandlerCallback = new Handler.Callback() { // from class: androidx.asynclayoutinflater.view.AsyncLayoutInflater.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
            }
            InflateRequest inflateRequest = (InflateRequest) message.obj;
            if (inflateRequest.view == null) {
                inflateRequest.view = AsyncLayoutInflater.this.mInflater.inflate(inflateRequest.resid, inflateRequest.parent, false);
            }
            inflateRequest.callback.onInflateFinished(inflateRequest.view, inflateRequest.resid, inflateRequest.parent);
            AsyncLayoutInflater.this.mInflateThread.releaseRequest(inflateRequest);
            return true;
        }
    };
    public Handler mHandler = new Handler(this.mHandlerCallback);
    public InflateThread mInflateThread = InflateThread.getInstance();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class InflateRequest {
        public OnInflateFinishedListener callback;
        public AsyncLayoutInflater inflater;
        public ViewGroup parent;
        public int resid;
        public View view;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class InflateThread extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static final InflateThread sInstance;
        private ArrayBlockingQueue<InflateRequest> mQueue = new ArrayBlockingQueue<>(10);
        private Pools.SynchronizedPool<InflateRequest> mRequestPool = new Pools.SynchronizedPool<>(10);

        static {
            InflateThread inflateThread = new InflateThread();
            sInstance = inflateThread;
            inflateThread.start();
        }

        private InflateThread() {
        }

        public static InflateThread getInstance() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InflateThread) ipChange.ipc$dispatch("5ebbcfeb", new Object[0]);
            }
            return sInstance;
        }

        public static /* synthetic */ Object ipc$super(InflateThread inflateThread, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/asynclayoutinflater/view/AsyncLayoutInflater$InflateThread");
        }

        public void enqueue(InflateRequest inflateRequest) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("40b54f1d", new Object[]{this, inflateRequest});
                return;
            }
            try {
                this.mQueue.put(inflateRequest);
            } catch (InterruptedException e) {
                throw new RuntimeException("Failed to enqueue async inflate request", e);
            }
        }

        public InflateRequest obtainRequest() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InflateRequest) ipChange.ipc$dispatch("abcaf913", new Object[]{this});
            }
            InflateRequest acquire = this.mRequestPool.acquire();
            if (acquire == null) {
                return new InflateRequest();
            }
            return acquire;
        }

        public void releaseRequest(InflateRequest inflateRequest) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("95b93d9d", new Object[]{this, inflateRequest});
                return;
            }
            inflateRequest.callback = null;
            inflateRequest.inflater = null;
            inflateRequest.parent = null;
            inflateRequest.resid = 0;
            inflateRequest.view = null;
            this.mRequestPool.release(inflateRequest);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            while (true) {
                runInner();
            }
        }

        public void runInner() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c917c992", new Object[]{this});
                return;
            }
            try {
                InflateRequest take = this.mQueue.take();
                try {
                    take.view = take.inflater.mInflater.inflate(take.resid, take.parent, false);
                } catch (RuntimeException unused) {
                }
                Message.obtain(take.inflater.mHandler, 0, take).sendToTarget();
            } catch (InterruptedException unused2) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface OnInflateFinishedListener {
        void onInflateFinished(View view, int i, ViewGroup viewGroup);
    }

    public AsyncLayoutInflater(Context context) {
        this.mInflater = new BasicInflater(context);
    }

    public void inflate(int i, ViewGroup viewGroup, OnInflateFinishedListener onInflateFinishedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("307b1fb8", new Object[]{this, new Integer(i), viewGroup, onInflateFinishedListener});
        } else if (onInflateFinishedListener != null) {
            InflateRequest obtainRequest = this.mInflateThread.obtainRequest();
            obtainRequest.inflater = this;
            obtainRequest.resid = i;
            obtainRequest.parent = viewGroup;
            obtainRequest.callback = onInflateFinishedListener;
            this.mInflateThread.enqueue(obtainRequest);
        } else {
            throw new NullPointerException("callback argument may not be null!");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class BasicInflater extends LayoutInflater {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static final String[] sClassPrefixList = {"android.widget.", "android.webkit.", "android.app."};

        public BasicInflater(Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(BasicInflater basicInflater, String str, Object... objArr) {
            if (str.hashCode() == -424637217) {
                return super.onCreateView((String) objArr[0], (AttributeSet) objArr[1]);
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/asynclayoutinflater/view/AsyncLayoutInflater$BasicInflater");
        }

        @Override // android.view.LayoutInflater
        public LayoutInflater cloneInContext(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LayoutInflater) ipChange.ipc$dispatch("9e726fa6", new Object[]{this, context});
            }
            return new BasicInflater(context);
        }

        @Override // android.view.LayoutInflater
        public View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
            View createView;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("e6b08cdf", new Object[]{this, str, attributeSet});
            }
            for (String str2 : sClassPrefixList) {
                try {
                    createView = createView(str, str2, attributeSet);
                } catch (ClassNotFoundException unused) {
                }
                if (createView != null) {
                    return createView;
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }
}
