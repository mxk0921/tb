package androidx.recyclerview.widget;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.recyclerview.widget.ThreadUtil;
import androidx.recyclerview.widget.TileList;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class MessageThreadUtil<T> implements ThreadUtil<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* renamed from: androidx.recyclerview.widget.MessageThreadUtil$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class AnonymousClass1 implements ThreadUtil.MainThreadCallback<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int ADD_TILE = 2;
        public static final int REMOVE_TILE = 3;
        public static final int UPDATE_ITEM_COUNT = 1;
        public final /* synthetic */ ThreadUtil.MainThreadCallback val$callback;
        public final MessageQueue mQueue = new MessageQueue();
        private final Handler mMainThreadHandler = new Handler(Looper.getMainLooper());
        private Runnable mMainThreadRunnable = new Runnable() { // from class: androidx.recyclerview.widget.MessageThreadUtil.1.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                SyncQueueItem next = AnonymousClass1.this.mQueue.next();
                while (next != null) {
                    int i = next.what;
                    if (i == 1) {
                        AnonymousClass1.this.val$callback.updateItemCount(next.arg1, next.arg2);
                    } else if (i == 2) {
                        AnonymousClass1.this.val$callback.addTile(next.arg1, (TileList.Tile) next.data);
                    } else if (i != 3) {
                        Log.e("ThreadUtil", "Unsupported message, what=" + next.what);
                    } else {
                        AnonymousClass1.this.val$callback.removeTile(next.arg1, next.arg2);
                    }
                    next = AnonymousClass1.this.mQueue.next();
                }
            }
        };

        public AnonymousClass1(ThreadUtil.MainThreadCallback mainThreadCallback) {
            this.val$callback = mainThreadCallback;
        }

        private void sendMessage(SyncQueueItem syncQueueItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6698b623", new Object[]{this, syncQueueItem});
                return;
            }
            this.mQueue.sendMessage(syncQueueItem);
            this.mMainThreadHandler.post(this.mMainThreadRunnable);
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void addTile(int i, TileList.Tile<T> tile) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("867aa9fc", new Object[]{this, new Integer(i), tile});
            } else {
                sendMessage(SyncQueueItem.obtainMessage(2, i, tile));
            }
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void removeTile(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c1b4f6f9", new Object[]{this, new Integer(i), new Integer(i2)});
            } else {
                sendMessage(SyncQueueItem.obtainMessage(3, i, i2));
            }
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void updateItemCount(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61582fda", new Object[]{this, new Integer(i), new Integer(i2)});
            } else {
                sendMessage(SyncQueueItem.obtainMessage(1, i, i2));
            }
        }
    }

    /* compiled from: Taobao */
    /* renamed from: androidx.recyclerview.widget.MessageThreadUtil$2  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class AnonymousClass2 implements ThreadUtil.BackgroundCallback<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int LOAD_TILE = 3;
        public static final int RECYCLE_TILE = 4;
        public static final int REFRESH = 1;
        public static final int UPDATE_RANGE = 2;
        public final /* synthetic */ ThreadUtil.BackgroundCallback val$callback;
        public final MessageQueue mQueue = new MessageQueue();
        private final Executor mExecutor = AsyncTask.THREAD_POOL_EXECUTOR;
        public AtomicBoolean mBackgroundRunning = new AtomicBoolean(false);
        private Runnable mBackgroundRunnable = new Runnable() { // from class: androidx.recyclerview.widget.MessageThreadUtil.2.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                while (true) {
                    SyncQueueItem next = AnonymousClass2.this.mQueue.next();
                    if (next == null) {
                        AnonymousClass2.this.mBackgroundRunning.set(false);
                        return;
                    }
                    int i = next.what;
                    if (i == 1) {
                        AnonymousClass2.this.mQueue.removeMessages(1);
                        AnonymousClass2.this.val$callback.refresh(next.arg1);
                    } else if (i == 2) {
                        AnonymousClass2.this.mQueue.removeMessages(2);
                        AnonymousClass2.this.mQueue.removeMessages(3);
                        AnonymousClass2.this.val$callback.updateRange(next.arg1, next.arg2, next.arg3, next.arg4, next.arg5);
                    } else if (i == 3) {
                        AnonymousClass2.this.val$callback.loadTile(next.arg1, next.arg2);
                    } else if (i != 4) {
                        Log.e("ThreadUtil", "Unsupported message, what=" + next.what);
                    } else {
                        AnonymousClass2.this.val$callback.recycleTile((TileList.Tile) next.data);
                    }
                }
            }
        };

        public AnonymousClass2(ThreadUtil.BackgroundCallback backgroundCallback) {
            this.val$callback = backgroundCallback;
        }

        private void maybeExecuteBackgroundRunnable() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("358fffbf", new Object[]{this});
            } else if (this.mBackgroundRunning.compareAndSet(false, true)) {
                this.mExecutor.execute(this.mBackgroundRunnable);
            }
        }

        private void sendMessage(SyncQueueItem syncQueueItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6698b623", new Object[]{this, syncQueueItem});
                return;
            }
            this.mQueue.sendMessage(syncQueueItem);
            maybeExecuteBackgroundRunnable();
        }

        private void sendMessageAtFrontOfQueue(SyncQueueItem syncQueueItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc786de7", new Object[]{this, syncQueueItem});
                return;
            }
            this.mQueue.sendMessageAtFrontOfQueue(syncQueueItem);
            maybeExecuteBackgroundRunnable();
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void loadTile(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2da30db", new Object[]{this, new Integer(i), new Integer(i2)});
            } else {
                sendMessage(SyncQueueItem.obtainMessage(3, i, i2));
            }
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void recycleTile(TileList.Tile<T> tile) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("698d1b97", new Object[]{this, tile});
            } else {
                sendMessage(SyncQueueItem.obtainMessage(4, 0, tile));
            }
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void refresh(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fa697d61", new Object[]{this, new Integer(i)});
            } else {
                sendMessageAtFrontOfQueue(SyncQueueItem.obtainMessage(1, i, (Object) null));
            }
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void updateRange(int i, int i2, int i3, int i4, int i5) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a061e6a8", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            } else {
                sendMessageAtFrontOfQueue(SyncQueueItem.obtainMessage(2, i, i2, i3, i4, i5, null));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class MessageQueue {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Object mLock = new Object();
        private SyncQueueItem mRoot;

        public SyncQueueItem next() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SyncQueueItem) ipChange.ipc$dispatch("b22b8f99", new Object[]{this});
            }
            synchronized (this.mLock) {
                try {
                    SyncQueueItem syncQueueItem = this.mRoot;
                    if (syncQueueItem == null) {
                        return null;
                    }
                    this.mRoot = syncQueueItem.next;
                    return syncQueueItem;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void removeMessages(int i) {
            SyncQueueItem syncQueueItem;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d7129b6c", new Object[]{this, new Integer(i)});
                return;
            }
            synchronized (this.mLock) {
                while (true) {
                    try {
                        syncQueueItem = this.mRoot;
                        if (syncQueueItem == null || syncQueueItem.what != i) {
                            break;
                        }
                        this.mRoot = syncQueueItem.next;
                        syncQueueItem.recycle();
                    } finally {
                    }
                }
                if (syncQueueItem != null) {
                    SyncQueueItem syncQueueItem2 = syncQueueItem.next;
                    while (syncQueueItem2 != null) {
                        SyncQueueItem syncQueueItem3 = syncQueueItem2.next;
                        if (syncQueueItem2.what == i) {
                            syncQueueItem.next = syncQueueItem3;
                            syncQueueItem2.recycle();
                        } else {
                            syncQueueItem = syncQueueItem2;
                        }
                        syncQueueItem2 = syncQueueItem3;
                    }
                }
            }
        }

        public void sendMessage(SyncQueueItem syncQueueItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6698b623", new Object[]{this, syncQueueItem});
                return;
            }
            synchronized (this.mLock) {
                try {
                    SyncQueueItem syncQueueItem2 = this.mRoot;
                    if (syncQueueItem2 == null) {
                        this.mRoot = syncQueueItem;
                        return;
                    }
                    while (true) {
                        SyncQueueItem syncQueueItem3 = syncQueueItem2.next;
                        if (syncQueueItem3 != null) {
                            syncQueueItem2 = syncQueueItem3;
                        } else {
                            syncQueueItem2.next = syncQueueItem;
                            return;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void sendMessageAtFrontOfQueue(SyncQueueItem syncQueueItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc786de7", new Object[]{this, syncQueueItem});
                return;
            }
            synchronized (this.mLock) {
                syncQueueItem.next = this.mRoot;
                this.mRoot = syncQueueItem;
            }
        }
    }

    @Override // androidx.recyclerview.widget.ThreadUtil
    public ThreadUtil.BackgroundCallback<T> getBackgroundProxy(ThreadUtil.BackgroundCallback<T> backgroundCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadUtil.BackgroundCallback) ipChange.ipc$dispatch("c5857e85", new Object[]{this, backgroundCallback});
        }
        return new AnonymousClass2(backgroundCallback);
    }

    @Override // androidx.recyclerview.widget.ThreadUtil
    public ThreadUtil.MainThreadCallback<T> getMainThreadProxy(ThreadUtil.MainThreadCallback<T> mainThreadCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadUtil.MainThreadCallback) ipChange.ipc$dispatch("28c8da5a", new Object[]{this, mainThreadCallback});
        }
        return new AnonymousClass1(mainThreadCallback);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class SyncQueueItem {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static SyncQueueItem sPool;
        private static final Object sPoolLock = new Object();
        public int arg1;
        public int arg2;
        public int arg3;
        public int arg4;
        public int arg5;
        public Object data;
        public SyncQueueItem next;
        public int what;

        public static SyncQueueItem obtainMessage(int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
            SyncQueueItem syncQueueItem;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SyncQueueItem) ipChange.ipc$dispatch("7559304e", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), obj});
            }
            synchronized (sPoolLock) {
                try {
                    syncQueueItem = sPool;
                    if (syncQueueItem == null) {
                        syncQueueItem = new SyncQueueItem();
                    } else {
                        sPool = syncQueueItem.next;
                        syncQueueItem.next = null;
                    }
                    syncQueueItem.what = i;
                    syncQueueItem.arg1 = i2;
                    syncQueueItem.arg2 = i3;
                    syncQueueItem.arg3 = i4;
                    syncQueueItem.arg4 = i5;
                    syncQueueItem.arg5 = i6;
                    syncQueueItem.data = obj;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return syncQueueItem;
        }

        public void recycle() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51af759a", new Object[]{this});
                return;
            }
            this.next = null;
            this.arg5 = 0;
            this.arg4 = 0;
            this.arg3 = 0;
            this.arg2 = 0;
            this.arg1 = 0;
            this.what = 0;
            this.data = null;
            synchronized (sPoolLock) {
                try {
                    SyncQueueItem syncQueueItem = sPool;
                    if (syncQueueItem != null) {
                        this.next = syncQueueItem;
                    }
                    sPool = this;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public static SyncQueueItem obtainMessage(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (SyncQueueItem) ipChange.ipc$dispatch("3616feb9", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)}) : obtainMessage(i, i2, i3, 0, 0, 0, null);
        }

        public static SyncQueueItem obtainMessage(int i, int i2, Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (SyncQueueItem) ipChange.ipc$dispatch("ce05948e", new Object[]{new Integer(i), new Integer(i2), obj}) : obtainMessage(i, i2, 0, 0, 0, 0, obj);
        }
    }
}
