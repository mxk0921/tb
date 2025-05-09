package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AsyncListDiffer<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Executor sMainThreadExecutor = new MainThreadExecutor();
    public final AsyncDifferConfig<T> mConfig;
    private List<T> mList;
    private final List<ListListener<T>> mListeners;
    public Executor mMainThreadExecutor;
    public int mMaxScheduledGeneration;
    private List<T> mReadOnlyList;
    private final ListUpdateCallback mUpdateCallback;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface ListListener<T> {
        void onCurrentListChanged(List<T> list, List<T> list2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class MainThreadExecutor implements Executor {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final Handler mHandler = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
            } else {
                this.mHandler.post(runnable);
            }
        }
    }

    public AsyncListDiffer(RecyclerView.Adapter adapter, DiffUtil.ItemCallback<T> itemCallback) {
        this(new AdapterListUpdateCallback(adapter), new AsyncDifferConfig.Builder(itemCallback).build());
    }

    private void onCurrentListChanged(List<T> list, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a8f5732", new Object[]{this, list, runnable});
            return;
        }
        for (ListListener<T> listListener : this.mListeners) {
            listListener.onCurrentListChanged(list, this.mReadOnlyList);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void addListListener(ListListener<T> listListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ba55e57", new Object[]{this, listListener});
        } else {
            this.mListeners.add(listListener);
        }
    }

    public List<T> getCurrentList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d02990bf", new Object[]{this});
        }
        return this.mReadOnlyList;
    }

    public void latchList(List<T> list, DiffUtil.DiffResult diffResult, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f92a1f0e", new Object[]{this, list, diffResult, runnable});
            return;
        }
        List<T> list2 = this.mReadOnlyList;
        this.mList = list;
        this.mReadOnlyList = Collections.unmodifiableList(list);
        diffResult.dispatchUpdatesTo(this.mUpdateCallback);
        onCurrentListChanged(list2, runnable);
    }

    public void removeListListener(ListListener<T> listListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddcbba94", new Object[]{this, listListener});
        } else {
            this.mListeners.remove(listListener);
        }
    }

    public void submitList(List<T> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1e3f54e", new Object[]{this, list});
        } else {
            submitList(list, null);
        }
    }

    public void submitList(final List<T> list, final Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82612ccc", new Object[]{this, list, runnable});
            return;
        }
        final int i = this.mMaxScheduledGeneration + 1;
        this.mMaxScheduledGeneration = i;
        final List<T> list2 = this.mList;
        if (list != list2) {
            List<T> list3 = this.mReadOnlyList;
            if (list == null) {
                int size = list2.size();
                this.mList = null;
                this.mReadOnlyList = Collections.emptyList();
                this.mUpdateCallback.onRemoved(0, size);
                onCurrentListChanged(list3, runnable);
            } else if (list2 == null) {
                this.mList = list;
                this.mReadOnlyList = Collections.unmodifiableList(list);
                this.mUpdateCallback.onInserted(0, list.size());
                onCurrentListChanged(list3, runnable);
            } else {
                this.mConfig.getBackgroundThreadExecutor().execute(new Runnable() { // from class: androidx.recyclerview.widget.AsyncListDiffer.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        final DiffUtil.DiffResult calculateDiff = DiffUtil.calculateDiff(new DiffUtil.Callback() { // from class: androidx.recyclerview.widget.AsyncListDiffer.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            public static /* synthetic */ Object ipc$super(C00171 r2, String str, Object... objArr) {
                                str.hashCode();
                                int hashCode = str.hashCode();
                                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/recyclerview/widget/AsyncListDiffer$1$1");
                            }

                            @Override // androidx.recyclerview.widget.DiffUtil.Callback
                            public boolean areContentsTheSame(int i2, int i3) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    return ((Boolean) ipChange3.ipc$dispatch("a1603f74", new Object[]{this, new Integer(i2), new Integer(i3)})).booleanValue();
                                }
                                Object obj = list2.get(i2);
                                Object obj2 = list.get(i3);
                                if (obj != null && obj2 != null) {
                                    return AsyncListDiffer.this.mConfig.getDiffCallback().areContentsTheSame(obj, obj2);
                                }
                                if (obj == null && obj2 == null) {
                                    return true;
                                }
                                throw new AssertionError();
                            }

                            @Override // androidx.recyclerview.widget.DiffUtil.Callback
                            public boolean areItemsTheSame(int i2, int i3) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    return ((Boolean) ipChange3.ipc$dispatch("501767f6", new Object[]{this, new Integer(i2), new Integer(i3)})).booleanValue();
                                }
                                Object obj = list2.get(i2);
                                Object obj2 = list.get(i3);
                                if (obj != null && obj2 != null) {
                                    return AsyncListDiffer.this.mConfig.getDiffCallback().areItemsTheSame(obj, obj2);
                                }
                                if (obj == null && obj2 == null) {
                                    return true;
                                }
                                return false;
                            }

                            @Override // androidx.recyclerview.widget.DiffUtil.Callback
                            public Object getChangePayload(int i2, int i3) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    return ipChange3.ipc$dispatch("2951e5e3", new Object[]{this, new Integer(i2), new Integer(i3)});
                                }
                                Object obj = list2.get(i2);
                                Object obj2 = list.get(i3);
                                if (obj != null && obj2 != null) {
                                    return AsyncListDiffer.this.mConfig.getDiffCallback().getChangePayload(obj, obj2);
                                }
                                throw new AssertionError();
                            }

                            @Override // androidx.recyclerview.widget.DiffUtil.Callback
                            public int getNewListSize() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    return ((Number) ipChange3.ipc$dispatch("f8e07243", new Object[]{this})).intValue();
                                }
                                return list.size();
                            }

                            @Override // androidx.recyclerview.widget.DiffUtil.Callback
                            public int getOldListSize() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    return ((Number) ipChange3.ipc$dispatch("cc12e44a", new Object[]{this})).intValue();
                                }
                                return list2.size();
                            }
                        });
                        AsyncListDiffer.this.mMainThreadExecutor.execute(new Runnable() { // from class: androidx.recyclerview.widget.AsyncListDiffer.1.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                AnonymousClass1 r0 = AnonymousClass1.this;
                                AsyncListDiffer asyncListDiffer = AsyncListDiffer.this;
                                if (asyncListDiffer.mMaxScheduledGeneration == i) {
                                    asyncListDiffer.latchList(list, calculateDiff, runnable);
                                }
                            }
                        });
                    }
                });
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public AsyncListDiffer(ListUpdateCallback listUpdateCallback, AsyncDifferConfig<T> asyncDifferConfig) {
        this.mListeners = new CopyOnWriteArrayList();
        this.mReadOnlyList = Collections.emptyList();
        this.mUpdateCallback = listUpdateCallback;
        this.mConfig = asyncDifferConfig;
        if (asyncDifferConfig.getMainThreadExecutor() != null) {
            this.mMainThreadExecutor = asyncDifferConfig.getMainThreadExecutor();
        } else {
            this.mMainThreadExecutor = sMainThreadExecutor;
        }
    }
}
