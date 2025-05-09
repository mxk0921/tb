package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.collection.ArraySet;
import androidx.collection.LongSparseArray;
import androidx.core.util.Preconditions;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class FragmentStateAdapter extends RecyclerView.Adapter<FragmentViewHolder> implements StatefulAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long GRACE_WINDOW_TIME_MS = 10000;
    private static final String KEY_PREFIX_FRAGMENT = "f#";
    private static final String KEY_PREFIX_STATE = "s#";
    public FragmentEventDispatcher mFragmentEventDispatcher;
    public final FragmentManager mFragmentManager;
    private FragmentMaxLifecycleEnforcer mFragmentMaxLifecycleEnforcer;
    public final LongSparseArray<Fragment> mFragments;
    private boolean mHasStaleFragments;
    public boolean mIsInGracePeriod;
    private final LongSparseArray<Integer> mItemIdToViewHolder;
    public final Lifecycle mLifecycle;
    private final LongSparseArray<Fragment.SavedState> mSavedStates;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static abstract class DataSetChangeObserver extends RecyclerView.AdapterDataObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private DataSetChangeObserver() {
        }

        public static /* synthetic */ Object ipc$super(DataSetChangeObserver dataSetChangeObserver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/viewpager2/adapter/FragmentStateAdapter$DataSetChangeObserver");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70303dd0", new Object[]{this, new Integer(i), new Integer(i2)});
            } else {
                onChanged();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeInserted(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8e983dea", new Object[]{this, new Integer(i), new Integer(i2)});
            } else {
                onChanged();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeMoved(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97535514", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            } else {
                onChanged();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeRemoved(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1cd027c", new Object[]{this, new Integer(i), new Integer(i2)});
            } else {
                onChanged();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i, int i2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad2e59ac", new Object[]{this, new Integer(i), new Integer(i2), obj});
            } else {
                onChanged();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public @interface ExperimentalFragmentStateAdapterApi {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class FragmentEventDispatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private List<FragmentTransactionCallback> mCallbacks = new CopyOnWriteArrayList();

        public List<FragmentTransactionCallback.OnPostEventListener> dispatchMaxLifecyclePreUpdated(Fragment fragment, Lifecycle.State state) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("a04d07ed", new Object[]{this, fragment, state});
            }
            ArrayList arrayList = new ArrayList();
            for (FragmentTransactionCallback fragmentTransactionCallback : this.mCallbacks) {
                arrayList.add(fragmentTransactionCallback.onFragmentMaxLifecyclePreUpdated(fragment, state));
            }
            return arrayList;
        }

        public void dispatchPostEvents(List<FragmentTransactionCallback.OnPostEventListener> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43b869eb", new Object[]{this, list});
                return;
            }
            for (FragmentTransactionCallback.OnPostEventListener onPostEventListener : list) {
                onPostEventListener.onPost();
            }
        }

        public List<FragmentTransactionCallback.OnPostEventListener> dispatchPreAdded(Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("ce868ed1", new Object[]{this, fragment});
            }
            ArrayList arrayList = new ArrayList();
            for (FragmentTransactionCallback fragmentTransactionCallback : this.mCallbacks) {
                arrayList.add(fragmentTransactionCallback.onFragmentPreAdded(fragment));
            }
            return arrayList;
        }

        public List<FragmentTransactionCallback.OnPostEventListener> dispatchPreRemoved(Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("71f84531", new Object[]{this, fragment});
            }
            ArrayList arrayList = new ArrayList();
            for (FragmentTransactionCallback fragmentTransactionCallback : this.mCallbacks) {
                arrayList.add(fragmentTransactionCallback.onFragmentPreRemoved(fragment));
            }
            return arrayList;
        }

        public List<FragmentTransactionCallback.OnPostEventListener> dispatchPreSavedInstanceState(Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("ea0f2cca", new Object[]{this, fragment});
            }
            ArrayList arrayList = new ArrayList();
            for (FragmentTransactionCallback fragmentTransactionCallback : this.mCallbacks) {
                arrayList.add(fragmentTransactionCallback.onFragmentPreSavedInstanceState(fragment));
            }
            return arrayList;
        }

        public void registerCallback(FragmentTransactionCallback fragmentTransactionCallback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("105fd4cc", new Object[]{this, fragmentTransactionCallback});
            } else {
                this.mCallbacks.add(fragmentTransactionCallback);
            }
        }

        public void unregisterCallback(FragmentTransactionCallback fragmentTransactionCallback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9cb7b525", new Object[]{this, fragmentTransactionCallback});
            } else {
                this.mCallbacks.remove(fragmentTransactionCallback);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class FragmentMaxLifecycleEnforcer {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private RecyclerView.AdapterDataObserver mDataObserver;
        private LifecycleEventObserver mLifecycleObserver;
        private ViewPager2.OnPageChangeCallback mPageChangeCallback;
        private long mPrimaryItemId = -1;
        private ViewPager2 mViewPager;

        public FragmentMaxLifecycleEnforcer() {
        }

        private ViewPager2 inferViewPager(RecyclerView recyclerView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewPager2) ipChange.ipc$dispatch("701321a7", new Object[]{this, recyclerView});
            }
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        public void register(RecyclerView recyclerView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("711c748d", new Object[]{this, recyclerView});
                return;
            }
            this.mViewPager = inferViewPager(recyclerView);
            ViewPager2.OnPageChangeCallback onPageChangeCallback = new ViewPager2.OnPageChangeCallback() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer$1");
                }

                @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                public void onPageScrollStateChanged(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
                    } else {
                        FragmentMaxLifecycleEnforcer.this.updateFragmentMaxLifecycle(false);
                    }
                }

                @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                public void onPageSelected(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                    } else {
                        FragmentMaxLifecycleEnforcer.this.updateFragmentMaxLifecycle(false);
                    }
                }
            };
            this.mPageChangeCallback = onPageChangeCallback;
            this.mViewPager.registerOnPageChangeCallback(onPageChangeCallback);
            DataSetChangeObserver dataSetChangeObserver = new DataSetChangeObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/viewpager2/adapter/FragmentStateAdapter$FragmentMaxLifecycleEnforcer$2");
                }

                @Override // androidx.viewpager2.adapter.FragmentStateAdapter.DataSetChangeObserver, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onChanged() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ba16f5dc", new Object[]{this});
                    } else {
                        FragmentMaxLifecycleEnforcer.this.updateFragmentMaxLifecycle(true);
                    }
                }
            };
            this.mDataObserver = dataSetChangeObserver;
            FragmentStateAdapter.this.registerAdapterDataObserver(dataSetChangeObserver);
            LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fa8a81fe", new Object[]{this, lifecycleOwner, event});
                    } else {
                        FragmentMaxLifecycleEnforcer.this.updateFragmentMaxLifecycle(false);
                    }
                }
            };
            this.mLifecycleObserver = lifecycleEventObserver;
            FragmentStateAdapter.this.mLifecycle.addObserver(lifecycleEventObserver);
        }

        public void unregister(RecyclerView recyclerView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("231c2dd4", new Object[]{this, recyclerView});
                return;
            }
            inferViewPager(recyclerView).unregisterOnPageChangeCallback(this.mPageChangeCallback);
            FragmentStateAdapter.this.unregisterAdapterDataObserver(this.mDataObserver);
            FragmentStateAdapter.this.mLifecycle.removeObserver(this.mLifecycleObserver);
            this.mViewPager = null;
        }

        public void updateFragmentMaxLifecycle(boolean z) {
            int currentItem;
            Fragment fragment;
            boolean z2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff53cf4e", new Object[]{this, new Boolean(z)});
            } else if (!FragmentStateAdapter.this.shouldDelayFragmentTransactions() && this.mViewPager.getScrollState() == 0 && !FragmentStateAdapter.this.mFragments.isEmpty() && FragmentStateAdapter.this.getItemCount() != 0 && (currentItem = this.mViewPager.getCurrentItem()) < FragmentStateAdapter.this.getItemCount()) {
                long itemId = FragmentStateAdapter.this.getItemId(currentItem);
                if ((itemId != this.mPrimaryItemId || z) && (fragment = FragmentStateAdapter.this.mFragments.get(itemId)) != null && fragment.isAdded()) {
                    this.mPrimaryItemId = itemId;
                    FragmentTransaction beginTransaction = FragmentStateAdapter.this.mFragmentManager.beginTransaction();
                    ArrayList arrayList = new ArrayList();
                    Fragment fragment2 = null;
                    for (int i = 0; i < FragmentStateAdapter.this.mFragments.size(); i++) {
                        long keyAt = FragmentStateAdapter.this.mFragments.keyAt(i);
                        Fragment valueAt = FragmentStateAdapter.this.mFragments.valueAt(i);
                        if (valueAt.isAdded()) {
                            if (keyAt != this.mPrimaryItemId) {
                                Lifecycle.State state = Lifecycle.State.STARTED;
                                beginTransaction.setMaxLifecycle(valueAt, state);
                                arrayList.add(FragmentStateAdapter.this.mFragmentEventDispatcher.dispatchMaxLifecyclePreUpdated(valueAt, state));
                            } else {
                                fragment2 = valueAt;
                            }
                            if (keyAt == this.mPrimaryItemId) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            valueAt.setMenuVisibility(z2);
                        }
                    }
                    if (fragment2 != null) {
                        Lifecycle.State state2 = Lifecycle.State.RESUMED;
                        beginTransaction.setMaxLifecycle(fragment2, state2);
                        arrayList.add(FragmentStateAdapter.this.mFragmentEventDispatcher.dispatchMaxLifecyclePreUpdated(fragment2, state2));
                    }
                    if (!beginTransaction.isEmpty()) {
                        beginTransaction.commitNow();
                        Collections.reverse(arrayList);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            FragmentStateAdapter.this.mFragmentEventDispatcher.dispatchPostEvents((List) it.next());
                        }
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static abstract class FragmentTransactionCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static final OnPostEventListener NO_OP = new OnPostEventListener() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback.OnPostEventListener
            public void onPost() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d226f026", new Object[]{this});
                }
            }
        };

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public interface OnPostEventListener {
            void onPost();
        }

        public OnPostEventListener onFragmentMaxLifecyclePreUpdated(Fragment fragment, Lifecycle.State state) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (OnPostEventListener) ipChange.ipc$dispatch("f51257d9", new Object[]{this, fragment, state});
            }
            return NO_OP;
        }

        public OnPostEventListener onFragmentPreAdded(Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (OnPostEventListener) ipChange.ipc$dispatch("1868d67d", new Object[]{this, fragment});
            }
            return NO_OP;
        }

        public OnPostEventListener onFragmentPreRemoved(Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (OnPostEventListener) ipChange.ipc$dispatch("facb8e1d", new Object[]{this, fragment});
            }
            return NO_OP;
        }

        public OnPostEventListener onFragmentPreSavedInstanceState(Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (OnPostEventListener) ipChange.ipc$dispatch("b25e0f80", new Object[]{this, fragment});
            }
            return NO_OP;
        }
    }

    public FragmentStateAdapter(FragmentActivity fragmentActivity) {
        this(fragmentActivity.getSupportFragmentManager(), fragmentActivity.getLifecycle());
    }

    private static String createKey(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c7c34b70", new Object[]{str, new Long(j)});
        }
        return str + j;
    }

    private void ensureFragment(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8af776e", new Object[]{this, new Integer(i)});
            return;
        }
        long itemId = getItemId(i);
        if (!this.mFragments.containsKey(itemId)) {
            Fragment createFragment = createFragment(i);
            createFragment.setInitialSavedState(this.mSavedStates.get(itemId));
            this.mFragments.put(itemId, createFragment);
        }
    }

    public static /* synthetic */ Object ipc$super(FragmentStateAdapter fragmentStateAdapter, String str, Object... objArr) {
        if (str.hashCode() == -1614840632) {
            super.setHasStableIds(((Boolean) objArr[0]).booleanValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/viewpager2/adapter/FragmentStateAdapter");
    }

    private boolean isFragmentViewBound(long j) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd0bd522", new Object[]{this, new Long(j)})).booleanValue();
        }
        if (this.mItemIdToViewHolder.containsKey(j)) {
            return true;
        }
        Fragment fragment = this.mFragments.get(j);
        if (fragment == null || (view = fragment.getView()) == null || view.getParent() == null) {
            return false;
        }
        return true;
    }

    private static boolean isValidKey(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2cddd2c", new Object[]{str, str2})).booleanValue();
        }
        if (!str.startsWith(str2) || str.length() <= str2.length()) {
            return false;
        }
        return true;
    }

    private Long itemForViewHolder(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("e945fec0", new Object[]{this, new Integer(i)});
        }
        Long l = null;
        for (int i2 = 0; i2 < this.mItemIdToViewHolder.size(); i2++) {
            if (this.mItemIdToViewHolder.valueAt(i2).intValue() == i) {
                if (l == null) {
                    l = Long.valueOf(this.mItemIdToViewHolder.keyAt(i2));
                } else {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
            }
        }
        return l;
    }

    private static long parseIdFromKey(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("58e02a56", new Object[]{str, str2})).longValue();
        }
        return Long.parseLong(str.substring(str2.length()));
    }

    private void removeFragment(long j) {
        ViewParent parent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb3cc0a9", new Object[]{this, new Long(j)});
            return;
        }
        Fragment fragment = this.mFragments.get(j);
        if (fragment != null) {
            if (!(fragment.getView() == null || (parent = fragment.getView().getParent()) == null)) {
                ((FrameLayout) parent).removeAllViews();
            }
            if (!containsItem(j)) {
                this.mSavedStates.remove(j);
            }
            if (!fragment.isAdded()) {
                this.mFragments.remove(j);
            } else if (shouldDelayFragmentTransactions()) {
                this.mHasStaleFragments = true;
            } else {
                if (fragment.isAdded() && containsItem(j)) {
                    List<FragmentTransactionCallback.OnPostEventListener> dispatchPreSavedInstanceState = this.mFragmentEventDispatcher.dispatchPreSavedInstanceState(fragment);
                    Fragment.SavedState saveFragmentInstanceState = this.mFragmentManager.saveFragmentInstanceState(fragment);
                    this.mFragmentEventDispatcher.dispatchPostEvents(dispatchPreSavedInstanceState);
                    this.mSavedStates.put(j, saveFragmentInstanceState);
                }
                List<FragmentTransactionCallback.OnPostEventListener> dispatchPreRemoved = this.mFragmentEventDispatcher.dispatchPreRemoved(fragment);
                try {
                    this.mFragmentManager.beginTransaction().remove(fragment).commitNow();
                    this.mFragments.remove(j);
                } finally {
                    this.mFragmentEventDispatcher.dispatchPostEvents(dispatchPreRemoved);
                }
            }
        }
    }

    private void scheduleGracePeriodEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bdab100", new Object[]{this});
            return;
        }
        final Handler handler = new Handler(Looper.getMainLooper());
        final Runnable runnable = new Runnable() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
                fragmentStateAdapter.mIsInGracePeriod = false;
                fragmentStateAdapter.gcFragments();
            }
        };
        this.mLifecycle.addObserver(new LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fa8a81fe", new Object[]{this, lifecycleOwner, event});
                } else if (event == Lifecycle.Event.ON_DESTROY) {
                    handler.removeCallbacks(runnable);
                    lifecycleOwner.getLifecycle().removeObserver(this);
                }
            }
        });
        handler.postDelayed(runnable, 10000L);
    }

    private void scheduleViewAttach(final Fragment fragment, final FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("187aefc3", new Object[]{this, fragment, frameLayout});
        } else {
            this.mFragmentManager.registerFragmentLifecycleCallbacks(new FragmentManager.FragmentLifecycleCallbacks() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/viewpager2/adapter/FragmentStateAdapter$2");
                }

                @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment2, View view, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dce5770a", new Object[]{this, fragmentManager, fragment2, view, bundle});
                    } else if (fragment2 == fragment) {
                        fragmentManager.unregisterFragmentLifecycleCallbacks(this);
                        FragmentStateAdapter.this.addViewToContainer(view, frameLayout);
                    }
                }
            }, false);
        }
    }

    public void addViewToContainer(View view, FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c60a306e", new Object[]{this, view, frameLayout});
        } else if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        } else if (view.getParent() != frameLayout) {
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
        }
    }

    public boolean containsItem(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2879188f", new Object[]{this, new Long(j)})).booleanValue();
        }
        if (j < 0 || j >= getItemCount()) {
            return false;
        }
        return true;
    }

    public abstract Fragment createFragment(int i);

    public void gcFragments() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d740bae", new Object[]{this});
        } else if (this.mHasStaleFragments && !shouldDelayFragmentTransactions()) {
            ArraySet<Long> arraySet = new ArraySet();
            for (int i = 0; i < this.mFragments.size(); i++) {
                long keyAt = this.mFragments.keyAt(i);
                if (!containsItem(keyAt)) {
                    arraySet.add(Long.valueOf(keyAt));
                    this.mItemIdToViewHolder.remove(keyAt);
                }
            }
            if (!this.mIsInGracePeriod) {
                this.mHasStaleFragments = false;
                for (int i2 = 0; i2 < this.mFragments.size(); i2++) {
                    long keyAt2 = this.mFragments.keyAt(i2);
                    if (!isFragmentViewBound(keyAt2)) {
                        arraySet.add(Long.valueOf(keyAt2));
                    }
                }
            }
            for (Long l : arraySet) {
                removeFragment(l.longValue());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7efb442e", new Object[]{this, recyclerView});
            return;
        }
        if (this.mFragmentMaxLifecycleEnforcer != null) {
            z = false;
        }
        Preconditions.checkArgument(z);
        FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = new FragmentMaxLifecycleEnforcer();
        this.mFragmentMaxLifecycleEnforcer = fragmentMaxLifecycleEnforcer;
        fragmentMaxLifecycleEnforcer.register(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44f14ed1", new Object[]{this, recyclerView});
            return;
        }
        this.mFragmentMaxLifecycleEnforcer.unregister(recyclerView);
        this.mFragmentMaxLifecycleEnforcer = null;
    }

    public final boolean onFailedToRecycleView(FragmentViewHolder fragmentViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52e8225", new Object[]{this, fragmentViewHolder})).booleanValue();
        }
        return true;
    }

    public void placeFragmentInViewHolder(final FragmentViewHolder fragmentViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("278e8d2d", new Object[]{this, fragmentViewHolder});
            return;
        }
        Fragment fragment = this.mFragments.get(fragmentViewHolder.getItemId());
        if (fragment != null) {
            FrameLayout container = fragmentViewHolder.getContainer();
            View view = fragment.getView();
            if (!fragment.isAdded() && view != null) {
                throw new IllegalStateException("Design assumption violated.");
            } else if (fragment.isAdded() && view == null) {
                scheduleViewAttach(fragment, container);
            } else if (!fragment.isAdded() || view.getParent() == null) {
                if (fragment.isAdded()) {
                    addViewToContainer(view, container);
                } else if (!shouldDelayFragmentTransactions()) {
                    scheduleViewAttach(fragment, container);
                    List<FragmentTransactionCallback.OnPostEventListener> dispatchPreAdded = this.mFragmentEventDispatcher.dispatchPreAdded(fragment);
                    try {
                        fragment.setMenuVisibility(false);
                        FragmentTransaction beginTransaction = this.mFragmentManager.beginTransaction();
                        beginTransaction.add(fragment, "f" + fragmentViewHolder.getItemId()).setMaxLifecycle(fragment, Lifecycle.State.STARTED).commitNow();
                        this.mFragmentMaxLifecycleEnforcer.updateFragmentMaxLifecycle(false);
                    } finally {
                        this.mFragmentEventDispatcher.dispatchPostEvents(dispatchPreAdded);
                    }
                } else if (!this.mFragmentManager.isDestroyed()) {
                    this.mLifecycle.addObserver(new LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // androidx.lifecycle.LifecycleEventObserver
                        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("fa8a81fe", new Object[]{this, lifecycleOwner, event});
                            } else if (!FragmentStateAdapter.this.shouldDelayFragmentTransactions()) {
                                lifecycleOwner.getLifecycle().removeObserver(this);
                                if (fragmentViewHolder.getContainer().isAttachedToWindow()) {
                                    FragmentStateAdapter.this.placeFragmentInViewHolder(fragmentViewHolder);
                                }
                            }
                        }
                    });
                }
            } else if (view.getParent() != container) {
                addViewToContainer(view, container);
            }
        } else {
            throw new IllegalStateException("Design assumption violated.");
        }
    }

    public void registerFragmentTransactionCallback(FragmentTransactionCallback fragmentTransactionCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28df62f4", new Object[]{this, fragmentTransactionCallback});
        } else {
            this.mFragmentEventDispatcher.registerCallback(fragmentTransactionCallback);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setHasStableIds(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fbf7cc8", new Object[]{this, new Boolean(z)});
            return;
        }
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    public boolean shouldDelayFragmentTransactions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f62ca180", new Object[]{this})).booleanValue();
        }
        return this.mFragmentManager.isStateSaved();
    }

    public void unregisterFragmentTransactionCallback(FragmentTransactionCallback fragmentTransactionCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19ff09fb", new Object[]{this, fragmentTransactionCallback});
        } else {
            this.mFragmentEventDispatcher.unregisterCallback(fragmentTransactionCallback);
        }
    }

    public FragmentStateAdapter(Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycle());
    }

    public final void onBindViewHolder(FragmentViewHolder fragmentViewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe9904b6", new Object[]{this, fragmentViewHolder, new Integer(i)});
            return;
        }
        long itemId = fragmentViewHolder.getItemId();
        int id = fragmentViewHolder.getContainer().getId();
        Long itemForViewHolder = itemForViewHolder(id);
        if (!(itemForViewHolder == null || itemForViewHolder.longValue() == itemId)) {
            removeFragment(itemForViewHolder.longValue());
            this.mItemIdToViewHolder.remove(itemForViewHolder.longValue());
        }
        this.mItemIdToViewHolder.put(itemId, Integer.valueOf(id));
        ensureFragment(i);
        if (fragmentViewHolder.getContainer().isAttachedToWindow()) {
            placeFragmentInViewHolder(fragmentViewHolder);
        }
        gcFragments();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final FragmentViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FragmentViewHolder) ipChange.ipc$dispatch("dbd70fde", new Object[]{this, viewGroup, new Integer(i)}) : FragmentViewHolder.create(viewGroup);
    }

    public final void onViewAttachedToWindow(FragmentViewHolder fragmentViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3374db3", new Object[]{this, fragmentViewHolder});
            return;
        }
        placeFragmentInViewHolder(fragmentViewHolder);
        gcFragments();
    }

    public final void onViewRecycled(FragmentViewHolder fragmentViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("375378d5", new Object[]{this, fragmentViewHolder});
            return;
        }
        Long itemForViewHolder = itemForViewHolder(fragmentViewHolder.getContainer().getId());
        if (itemForViewHolder != null) {
            removeFragment(itemForViewHolder.longValue());
            this.mItemIdToViewHolder.remove(itemForViewHolder.longValue());
        }
    }

    @Override // androidx.viewpager2.adapter.StatefulAdapter
    public final void restoreState(Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("217c08e9", new Object[]{this, parcelable});
        } else if (!this.mSavedStates.isEmpty() || !this.mFragments.isEmpty()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        } else {
            Bundle bundle = (Bundle) parcelable;
            if (bundle.getClassLoader() == null) {
                bundle.setClassLoader(getClass().getClassLoader());
            }
            for (String str : bundle.keySet()) {
                if (isValidKey(str, KEY_PREFIX_FRAGMENT)) {
                    this.mFragments.put(parseIdFromKey(str, KEY_PREFIX_FRAGMENT), this.mFragmentManager.getFragment(bundle, str));
                } else if (isValidKey(str, KEY_PREFIX_STATE)) {
                    long parseIdFromKey = parseIdFromKey(str, KEY_PREFIX_STATE);
                    Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(str);
                    if (containsItem(parseIdFromKey)) {
                        this.mSavedStates.put(parseIdFromKey, savedState);
                    }
                } else {
                    throw new IllegalArgumentException("Unexpected key in savedState: " + str);
                }
            }
            if (!this.mFragments.isEmpty()) {
                this.mHasStaleFragments = true;
                this.mIsInGracePeriod = true;
                gcFragments();
                scheduleGracePeriodEnd();
            }
        }
    }

    public FragmentStateAdapter(FragmentManager fragmentManager, Lifecycle lifecycle) {
        this.mFragments = new LongSparseArray<>();
        this.mSavedStates = new LongSparseArray<>();
        this.mItemIdToViewHolder = new LongSparseArray<>();
        this.mFragmentEventDispatcher = new FragmentEventDispatcher();
        this.mIsInGracePeriod = false;
        this.mHasStaleFragments = false;
        this.mFragmentManager = fragmentManager;
        this.mLifecycle = lifecycle;
        super.setHasStableIds(true);
    }

    @Override // androidx.viewpager2.adapter.StatefulAdapter
    public final Parcelable saveState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("b5f2b05e", new Object[]{this});
        }
        Bundle bundle = new Bundle(this.mFragments.size() + this.mSavedStates.size());
        for (int i = 0; i < this.mFragments.size(); i++) {
            long keyAt = this.mFragments.keyAt(i);
            Fragment fragment = this.mFragments.get(keyAt);
            if (fragment != null && fragment.isAdded()) {
                this.mFragmentManager.putFragment(bundle, createKey(KEY_PREFIX_FRAGMENT, keyAt), fragment);
            }
        }
        for (int i2 = 0; i2 < this.mSavedStates.size(); i2++) {
            long keyAt2 = this.mSavedStates.keyAt(i2);
            if (containsItem(keyAt2)) {
                bundle.putParcelable(createKey(KEY_PREFIX_STATE, keyAt2), this.mSavedStates.get(keyAt2));
            }
        }
        return bundle;
    }
}
