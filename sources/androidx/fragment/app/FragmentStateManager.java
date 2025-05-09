package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SpecialEffectsController;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelStoreOwner;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class FragmentStateManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ARGUMENTS_KEY = "arguments";
    public static final String CHILD_FRAGMENT_MANAGER_KEY = "childFragmentManager";
    public static final String FRAGMENT_STATE_KEY = "state";
    public static final String REGISTRY_STATE_KEY = "registryState";
    public static final String SAVED_INSTANCE_STATE_KEY = "savedInstanceState";
    private static final String TAG = "FragmentManager";
    public static final String VIEW_REGISTRY_STATE_KEY = "viewRegistryState";
    public static final String VIEW_STATE_KEY = "viewState";
    private final FragmentLifecycleCallbacksDispatcher mDispatcher;
    private final Fragment mFragment;
    private final FragmentStore mFragmentStore;
    private boolean mMovingToState = false;
    private int mFragmentManagerState = -1;

    /* compiled from: Taobao */
    /* renamed from: androidx.fragment.app.FragmentStateManager$2  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$lifecycle$Lifecycle$State;

        static {
            int[] iArr = new int[Lifecycle.State.values().length];
            $SwitchMap$androidx$lifecycle$Lifecycle$State = iArr;
            try {
                iArr[Lifecycle.State.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$lifecycle$Lifecycle$State[Lifecycle.State.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$lifecycle$Lifecycle$State[Lifecycle.State.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$lifecycle$Lifecycle$State[Lifecycle.State.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public FragmentStateManager(FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher, FragmentStore fragmentStore, Fragment fragment) {
        this.mDispatcher = fragmentLifecycleCallbacksDispatcher;
        this.mFragmentStore = fragmentStore;
        this.mFragment = fragment;
    }

    private boolean isFragmentViewChild(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8de0752", new Object[]{this, view})).booleanValue();
        }
        if (view == this.mFragment.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.mFragment.mView) {
                return true;
            }
        }
        return false;
    }

    public void addViewToContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d47bca07", new Object[]{this});
            return;
        }
        Fragment findViewFragment = FragmentManager.findViewFragment(this.mFragment.mContainer);
        Fragment parentFragment = this.mFragment.getParentFragment();
        if (findViewFragment != null && !findViewFragment.equals(parentFragment)) {
            Fragment fragment = this.mFragment;
            FragmentStrictMode.onWrongNestedHierarchy(fragment, findViewFragment, fragment.mContainerId);
        }
        int findFragmentIndexInContainer = this.mFragmentStore.findFragmentIndexInContainer(this.mFragment);
        Fragment fragment2 = this.mFragment;
        fragment2.mContainer.addView(fragment2.mView, findFragmentIndexInContainer);
    }

    public int computeExpectedState() {
        SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cb79cd3c", new Object[]{this})).intValue();
        }
        Fragment fragment = this.mFragment;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int i = this.mFragmentManagerState;
        int i2 = AnonymousClass2.$SwitchMap$androidx$lifecycle$Lifecycle$State[fragment.mMaxState.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                i = Math.min(i, 5);
            } else if (i2 == 3) {
                i = Math.min(i, 1);
            } else if (i2 != 4) {
                i = Math.min(i, -1);
            } else {
                i = Math.min(i, 0);
            }
        }
        Fragment fragment2 = this.mFragment;
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                i = Math.max(this.mFragmentManagerState, 2);
                View view = this.mFragment.mView;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.mFragmentManagerState < 4 ? Math.min(i, fragment2.mState) : Math.min(i, 1);
            }
        }
        Fragment fragment3 = this.mFragment;
        if (fragment3.mInDynamicContainer && fragment3.mContainer == null) {
            i = Math.min(i, 4);
        }
        if (!this.mFragment.mAdded) {
            i = Math.min(i, 1);
        }
        Fragment fragment4 = this.mFragment;
        ViewGroup viewGroup = fragment4.mContainer;
        if (viewGroup != null) {
            lifecycleImpact = SpecialEffectsController.getOrCreateController(viewGroup, fragment4.getParentFragmentManager()).getAwaitingCompletionLifecycleImpact(this);
        } else {
            lifecycleImpact = null;
        }
        if (lifecycleImpact == SpecialEffectsController.Operation.LifecycleImpact.ADDING) {
            i = Math.min(i, 6);
        } else if (lifecycleImpact == SpecialEffectsController.Operation.LifecycleImpact.REMOVING) {
            i = Math.max(i, 3);
        } else {
            Fragment fragment5 = this.mFragment;
            if (fragment5.mRemoving) {
                if (fragment5.isInBackStack()) {
                    i = Math.min(i, 1);
                } else {
                    i = Math.min(i, -1);
                }
            }
        }
        Fragment fragment6 = this.mFragment;
        if (fragment6.mDeferStart && fragment6.mState < 5) {
            i = Math.min(i, 4);
        }
        if (this.mFragment.mTransitioning) {
            i = Math.max(i, 3);
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            StringBuilder sb = new StringBuilder("computeExpectedState() of ");
            sb.append(i);
            sb.append(" for ");
            sb.append(this.mFragment);
        }
        return i;
    }

    public Fragment getFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("34dee721", new Object[]{this});
        }
        return this.mFragment;
    }

    public Fragment.SavedState saveInstanceState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment.SavedState) ipChange.ipc$dispatch("5e918c0", new Object[]{this});
        }
        if (this.mFragment.mState > -1) {
            return new Fragment.SavedState(saveState());
        }
        return null;
    }

    public void saveViewState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb8228f6", new Object[]{this});
        } else if (this.mFragment.mView != null) {
            if (FragmentManager.isLoggingEnabled(2)) {
                StringBuilder sb = new StringBuilder("Saving view state for fragment ");
                sb.append(this.mFragment);
                sb.append(" with view ");
                sb.append(this.mFragment.mView);
            }
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.mFragment.mView.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.mFragment.mSavedViewState = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.mFragment.mViewLifecycleOwner.performSave(bundle);
            if (!bundle.isEmpty()) {
                this.mFragment.mSavedViewRegistryState = bundle;
            }
        }
    }

    public void setFragmentManagerState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de52246", new Object[]{this, new Integer(i)});
        } else {
            this.mFragmentManagerState = i;
        }
    }

    public void activityCreated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5ad4e0", new Object[]{this});
            return;
        }
        if (FragmentManager.isLoggingEnabled(3)) {
            new StringBuilder("moveto ACTIVITY_CREATED: ").append(this.mFragment);
        }
        Bundle bundle = this.mFragment.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle(SAVED_INSTANCE_STATE_KEY) : null;
        this.mFragment.performActivityCreated(bundle2);
        this.mDispatcher.dispatchOnFragmentActivityCreated(this.mFragment, bundle2, false);
    }

    public void attach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ad9c84c", new Object[]{this});
            return;
        }
        if (FragmentManager.isLoggingEnabled(3)) {
            new StringBuilder("moveto ATTACHED: ").append(this.mFragment);
        }
        Fragment fragment = this.mFragment;
        Fragment fragment2 = fragment.mTarget;
        FragmentStateManager fragmentStateManager = null;
        if (fragment2 != null) {
            FragmentStateManager fragmentStateManager2 = this.mFragmentStore.getFragmentStateManager(fragment2.mWho);
            if (fragmentStateManager2 != null) {
                Fragment fragment3 = this.mFragment;
                fragment3.mTargetWho = fragment3.mTarget.mWho;
                fragment3.mTarget = null;
                fragmentStateManager = fragmentStateManager2;
            } else {
                throw new IllegalStateException("Fragment " + this.mFragment + " declared target fragment " + this.mFragment.mTarget + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (fragmentStateManager = this.mFragmentStore.getFragmentStateManager(str)) == null) {
                throw new IllegalStateException("Fragment " + this.mFragment + " declared target fragment " + this.mFragment.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (fragmentStateManager != null) {
            fragmentStateManager.moveToExpectedState();
        }
        Fragment fragment4 = this.mFragment;
        fragment4.mHost = fragment4.mFragmentManager.getHost();
        Fragment fragment5 = this.mFragment;
        fragment5.mParentFragment = fragment5.mFragmentManager.getParent();
        this.mDispatcher.dispatchOnFragmentPreAttached(this.mFragment, false);
        this.mFragment.performAttach();
        this.mDispatcher.dispatchOnFragmentAttached(this.mFragment, false);
    }

    public void createView() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e322dc8", new Object[]{this});
        } else if (!this.mFragment.mFromLayout) {
            if (FragmentManager.isLoggingEnabled(3)) {
                new StringBuilder("moveto CREATE_VIEW: ").append(this.mFragment);
            }
            Bundle bundle = this.mFragment.mSavedFragmentState;
            ViewGroup viewGroup = null;
            Bundle bundle2 = bundle != null ? bundle.getBundle(SAVED_INSTANCE_STATE_KEY) : null;
            LayoutInflater performGetLayoutInflater = this.mFragment.performGetLayoutInflater(bundle2);
            Fragment fragment = this.mFragment;
            ViewGroup viewGroup2 = fragment.mContainer;
            if (viewGroup2 != null) {
                viewGroup = viewGroup2;
            } else {
                int i = fragment.mContainerId;
                if (i != 0) {
                    if (i != -1) {
                        viewGroup = (ViewGroup) fragment.mFragmentManager.getContainer().onFindViewById(this.mFragment.mContainerId);
                        if (viewGroup == null) {
                            Fragment fragment2 = this.mFragment;
                            if (!fragment2.mRestored && !fragment2.mInDynamicContainer) {
                                try {
                                    str = fragment2.getResources().getResourceName(this.mFragment.mContainerId);
                                } catch (Resources.NotFoundException unused) {
                                    str = "unknown";
                                }
                                throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.mFragment.mContainerId) + " (" + str + ") for fragment " + this.mFragment);
                            }
                        } else if (!(viewGroup instanceof FragmentContainerView)) {
                            FragmentStrictMode.onWrongFragmentContainer(this.mFragment, viewGroup);
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create fragment " + this.mFragment + " for a container view with no id");
                    }
                }
            }
            Fragment fragment3 = this.mFragment;
            fragment3.mContainer = viewGroup;
            fragment3.performCreateView(performGetLayoutInflater, viewGroup, bundle2);
            if (this.mFragment.mView != null) {
                if (FragmentManager.isLoggingEnabled(3)) {
                    new StringBuilder("moveto VIEW_CREATED: ").append(this.mFragment);
                }
                this.mFragment.mView.setSaveFromParentEnabled(false);
                Fragment fragment4 = this.mFragment;
                fragment4.mView.setTag(R.id.fragment_container_view_tag, fragment4);
                if (viewGroup != null) {
                    addViewToContainer();
                }
                Fragment fragment5 = this.mFragment;
                if (fragment5.mHidden) {
                    fragment5.mView.setVisibility(8);
                }
                if (this.mFragment.mView.isAttachedToWindow()) {
                    ViewCompat.requestApplyInsets(this.mFragment.mView);
                } else {
                    final View view = this.mFragment.mView;
                    view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.fragment.app.FragmentStateManager.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewAttachedToWindow(View view2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("3d337638", new Object[]{this, view2});
                                return;
                            }
                            view.removeOnAttachStateChangeListener(this);
                            ViewCompat.requestApplyInsets(view);
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewDetachedFromWindow(View view2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7f64d55b", new Object[]{this, view2});
                            }
                        }
                    });
                }
                this.mFragment.performViewCreated();
                FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher = this.mDispatcher;
                Fragment fragment6 = this.mFragment;
                fragmentLifecycleCallbacksDispatcher.dispatchOnFragmentViewCreated(fragment6, fragment6.mView, bundle2, false);
                int visibility = this.mFragment.mView.getVisibility();
                this.mFragment.setPostOnViewCreatedAlpha(this.mFragment.mView.getAlpha());
                Fragment fragment7 = this.mFragment;
                if (fragment7.mContainer != null && visibility == 0) {
                    View findFocus = fragment7.mView.findFocus();
                    if (findFocus != null) {
                        this.mFragment.setFocusedView(findFocus);
                        if (FragmentManager.isLoggingEnabled(2)) {
                            StringBuilder sb = new StringBuilder("requestFocus: Saved focused view ");
                            sb.append(findFocus);
                            sb.append(" for Fragment ");
                            sb.append(this.mFragment);
                        }
                    }
                    this.mFragment.mView.setAlpha(0.0f);
                }
            }
            this.mFragment.mState = 2;
        }
    }

    public void destroyFragmentView() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("516f8b36", new Object[]{this});
            return;
        }
        if (FragmentManager.isLoggingEnabled(3)) {
            new StringBuilder("movefrom CREATE_VIEW: ").append(this.mFragment);
        }
        Fragment fragment = this.mFragment;
        ViewGroup viewGroup = fragment.mContainer;
        if (!(viewGroup == null || (view = fragment.mView) == null)) {
            viewGroup.removeView(view);
        }
        this.mFragment.performDestroyView();
        this.mDispatcher.dispatchOnFragmentViewDestroyed(this.mFragment, false);
        Fragment fragment2 = this.mFragment;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.setValue(null);
        this.mFragment.mInLayout = false;
    }

    public void detach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7b39a9a", new Object[]{this});
            return;
        }
        if (FragmentManager.isLoggingEnabled(3)) {
            new StringBuilder("movefrom ATTACHED: ").append(this.mFragment);
        }
        this.mFragment.performDetach();
        this.mDispatcher.dispatchOnFragmentDetached(this.mFragment, false);
        Fragment fragment = this.mFragment;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if ((fragment.mRemoving && !fragment.isInBackStack()) || this.mFragmentStore.getNonConfig().shouldDestroy(this.mFragment)) {
            if (FragmentManager.isLoggingEnabled(3)) {
                new StringBuilder("initState called for fragment: ").append(this.mFragment);
            }
            this.mFragment.initState();
        }
    }

    public void ensureInflatedView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a434f67", new Object[]{this});
            return;
        }
        Fragment fragment = this.mFragment;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.isLoggingEnabled(3)) {
                new StringBuilder("moveto CREATE_VIEW: ").append(this.mFragment);
            }
            Bundle bundle = this.mFragment.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle(SAVED_INSTANCE_STATE_KEY) : null;
            Fragment fragment2 = this.mFragment;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(bundle2), null, bundle2);
            View view = this.mFragment.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.mFragment;
                fragment3.mView.setTag(R.id.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.mFragment;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.mFragment.performViewCreated();
                FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher = this.mDispatcher;
                Fragment fragment5 = this.mFragment;
                fragmentLifecycleCallbacksDispatcher.dispatchOnFragmentViewCreated(fragment5, fragment5.mView, bundle2, false);
                this.mFragment.mState = 2;
            }
        }
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        if (FragmentManager.isLoggingEnabled(3)) {
            new StringBuilder("movefrom RESUMED: ").append(this.mFragment);
        }
        this.mFragment.performPause();
        this.mDispatcher.dispatchOnFragmentPaused(this.mFragment, false);
    }

    public void restoreState(ClassLoader classLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f345980", new Object[]{this, classLoader});
            return;
        }
        Bundle bundle = this.mFragment.mSavedFragmentState;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            if (this.mFragment.mSavedFragmentState.getBundle(SAVED_INSTANCE_STATE_KEY) == null) {
                this.mFragment.mSavedFragmentState.putBundle(SAVED_INSTANCE_STATE_KEY, new Bundle());
            }
            try {
                Fragment fragment = this.mFragment;
                fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray(VIEW_STATE_KEY);
                Fragment fragment2 = this.mFragment;
                fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle(VIEW_REGISTRY_STATE_KEY);
                FragmentState fragmentState = (FragmentState) this.mFragment.mSavedFragmentState.getParcelable("state");
                if (fragmentState != null) {
                    Fragment fragment3 = this.mFragment;
                    fragment3.mTargetWho = fragmentState.mTargetWho;
                    fragment3.mTargetRequestCode = fragmentState.mTargetRequestCode;
                    Boolean bool = fragment3.mSavedUserVisibleHint;
                    if (bool != null) {
                        fragment3.mUserVisibleHint = bool.booleanValue();
                        this.mFragment.mSavedUserVisibleHint = null;
                    } else {
                        fragment3.mUserVisibleHint = fragmentState.mUserVisibleHint;
                    }
                }
                Fragment fragment4 = this.mFragment;
                if (!fragment4.mUserVisibleHint) {
                    fragment4.mDeferStart = true;
                }
            } catch (BadParcelableException e) {
                throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + getFragment(), e);
            }
        }
    }

    public void resume() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        if (FragmentManager.isLoggingEnabled(3)) {
            new StringBuilder("moveto RESUMED: ").append(this.mFragment);
        }
        View focusedView = this.mFragment.getFocusedView();
        if (focusedView != null && isFragmentViewChild(focusedView)) {
            boolean requestFocus = focusedView.requestFocus();
            if (FragmentManager.isLoggingEnabled(2)) {
                StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                sb.append(focusedView);
                sb.append(" ");
                if (requestFocus) {
                    str = "succeeded";
                } else {
                    str = "failed";
                }
                sb.append(str);
                sb.append(" on Fragment ");
                sb.append(this.mFragment);
                sb.append(" resulting in focused view ");
                sb.append(this.mFragment.mView.findFocus());
            }
        }
        this.mFragment.setFocusedView(null);
        this.mFragment.performResume();
        this.mDispatcher.dispatchOnFragmentResumed(this.mFragment, false);
        this.mFragmentStore.setSavedState(this.mFragment.mWho, null);
        Fragment fragment = this.mFragment;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    public Bundle saveState() {
        Bundle bundle;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("60781f9f", new Object[]{this});
        }
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.mFragment;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new FragmentState(this.mFragment));
        if (this.mFragment.mState > -1) {
            Bundle bundle3 = new Bundle();
            this.mFragment.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle(SAVED_INSTANCE_STATE_KEY, bundle3);
            }
            this.mDispatcher.dispatchOnFragmentSaveInstanceState(this.mFragment, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.mFragment.mSavedStateRegistryController.performSave(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle(REGISTRY_STATE_KEY, bundle4);
            }
            Bundle saveAllStateInternal = this.mFragment.mChildFragmentManager.saveAllStateInternal();
            if (!saveAllStateInternal.isEmpty()) {
                bundle2.putBundle(CHILD_FRAGMENT_MANAGER_KEY, saveAllStateInternal);
            }
            if (this.mFragment.mView != null) {
                saveViewState();
            }
            SparseArray<Parcelable> sparseArray = this.mFragment.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray(VIEW_STATE_KEY, sparseArray);
            }
            Bundle bundle5 = this.mFragment.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle(VIEW_REGISTRY_STATE_KEY, bundle5);
            }
        }
        Bundle bundle6 = this.mFragment.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        if (FragmentManager.isLoggingEnabled(3)) {
            new StringBuilder("moveto STARTED: ").append(this.mFragment);
        }
        this.mFragment.performStart();
        this.mDispatcher.dispatchOnFragmentStarted(this.mFragment, false);
    }

    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        if (FragmentManager.isLoggingEnabled(3)) {
            new StringBuilder("movefrom STARTED: ").append(this.mFragment);
        }
        this.mFragment.performStop();
        this.mDispatcher.dispatchOnFragmentStopped(this.mFragment, false);
    }

    public void create() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("518a4783", new Object[]{this});
            return;
        }
        if (FragmentManager.isLoggingEnabled(3)) {
            new StringBuilder("moveto CREATED: ").append(this.mFragment);
        }
        Bundle bundle = this.mFragment.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle(SAVED_INSTANCE_STATE_KEY) : null;
        Fragment fragment = this.mFragment;
        if (!fragment.mIsCreated) {
            this.mDispatcher.dispatchOnFragmentPreCreated(fragment, bundle2, false);
            this.mFragment.performCreate(bundle2);
            this.mDispatcher.dispatchOnFragmentCreated(this.mFragment, bundle2, false);
            return;
        }
        fragment.mState = 1;
        fragment.restoreChildFragmentState();
    }

    public void destroy() {
        Fragment findActiveFragment;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        if (FragmentManager.isLoggingEnabled(3)) {
            new StringBuilder("movefrom CREATED: ").append(this.mFragment);
        }
        Fragment fragment = this.mFragment;
        boolean z2 = fragment.mRemoving && !fragment.isInBackStack();
        if (z2) {
            Fragment fragment2 = this.mFragment;
            if (!fragment2.mBeingSaved) {
                this.mFragmentStore.setSavedState(fragment2.mWho, null);
            }
        }
        if (z2 || this.mFragmentStore.getNonConfig().shouldDestroy(this.mFragment)) {
            FragmentHostCallback<?> fragmentHostCallback = this.mFragment.mHost;
            if (fragmentHostCallback instanceof ViewModelStoreOwner) {
                z = this.mFragmentStore.getNonConfig().isCleared();
            } else if (fragmentHostCallback.getContext() instanceof Activity) {
                z = true ^ ((Activity) fragmentHostCallback.getContext()).isChangingConfigurations();
            }
            if ((z2 && !this.mFragment.mBeingSaved) || z) {
                this.mFragmentStore.getNonConfig().clearNonConfigState(this.mFragment, false);
            }
            this.mFragment.performDestroy();
            this.mDispatcher.dispatchOnFragmentDestroyed(this.mFragment, false);
            for (FragmentStateManager fragmentStateManager : this.mFragmentStore.getActiveFragmentStateManagers()) {
                if (fragmentStateManager != null) {
                    Fragment fragment3 = fragmentStateManager.getFragment();
                    if (this.mFragment.mWho.equals(fragment3.mTargetWho)) {
                        fragment3.mTarget = this.mFragment;
                        fragment3.mTargetWho = null;
                    }
                }
            }
            Fragment fragment4 = this.mFragment;
            String str = fragment4.mTargetWho;
            if (str != null) {
                fragment4.mTarget = this.mFragmentStore.findActiveFragment(str);
            }
            this.mFragmentStore.makeInactive(this);
            return;
        }
        String str2 = this.mFragment.mTargetWho;
        if (!(str2 == null || (findActiveFragment = this.mFragmentStore.findActiveFragment(str2)) == null || !findActiveFragment.mRetainInstance)) {
            this.mFragment.mTarget = findActiveFragment;
        }
        this.mFragment.mState = 0;
    }

    public void moveToExpectedState() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9966c7f4", new Object[]{this});
        } else if (!this.mMovingToState) {
            try {
                this.mMovingToState = true;
                boolean z = false;
                while (true) {
                    int computeExpectedState = computeExpectedState();
                    Fragment fragment = this.mFragment;
                    int i = fragment.mState;
                    if (computeExpectedState != i) {
                        if (computeExpectedState > i) {
                            switch (i + 1) {
                                case 0:
                                    attach();
                                    continue;
                                case 1:
                                    create();
                                    continue;
                                case 2:
                                    ensureInflatedView();
                                    createView();
                                    continue;
                                case 3:
                                    activityCreated();
                                    continue;
                                case 4:
                                    if (!(fragment.mView == null || (viewGroup3 = fragment.mContainer) == null)) {
                                        SpecialEffectsController.getOrCreateController(viewGroup3, fragment.getParentFragmentManager()).enqueueAdd(SpecialEffectsController.Operation.State.from(this.mFragment.mView.getVisibility()), this);
                                    }
                                    this.mFragment.mState = 4;
                                    continue;
                                case 5:
                                    start();
                                    continue;
                                case 6:
                                    fragment.mState = 6;
                                    continue;
                                case 7:
                                    resume();
                                    continue;
                                default:
                                    continue;
                            }
                        } else {
                            switch (i - 1) {
                                case -1:
                                    detach();
                                    continue;
                                case 0:
                                    if (fragment.mBeingSaved && this.mFragmentStore.getSavedState(fragment.mWho) == null) {
                                        this.mFragmentStore.setSavedState(this.mFragment.mWho, saveState());
                                    }
                                    destroy();
                                    continue;
                                case 1:
                                    destroyFragmentView();
                                    this.mFragment.mState = 1;
                                    continue;
                                case 2:
                                    fragment.mInLayout = false;
                                    fragment.mState = 2;
                                    continue;
                                case 3:
                                    if (FragmentManager.isLoggingEnabled(3)) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("movefrom ACTIVITY_CREATED: ");
                                        sb.append(this.mFragment);
                                    }
                                    Fragment fragment2 = this.mFragment;
                                    if (fragment2.mBeingSaved) {
                                        this.mFragmentStore.setSavedState(fragment2.mWho, saveState());
                                    } else if (fragment2.mView != null && fragment2.mSavedViewState == null) {
                                        saveViewState();
                                    }
                                    Fragment fragment3 = this.mFragment;
                                    if (!(fragment3.mView == null || (viewGroup2 = fragment3.mContainer) == null)) {
                                        SpecialEffectsController.getOrCreateController(viewGroup2, fragment3.getParentFragmentManager()).enqueueRemove(this);
                                    }
                                    this.mFragment.mState = 3;
                                    continue;
                                case 4:
                                    stop();
                                    continue;
                                case 5:
                                    fragment.mState = 5;
                                    continue;
                                case 6:
                                    pause();
                                    continue;
                                default:
                                    continue;
                            }
                        }
                        z = true;
                    } else {
                        if (!z && i == -1 && fragment.mRemoving && !fragment.isInBackStack() && !this.mFragment.mBeingSaved) {
                            if (FragmentManager.isLoggingEnabled(3)) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Cleaning up state of never attached fragment: ");
                                sb2.append(this.mFragment);
                            }
                            this.mFragmentStore.getNonConfig().clearNonConfigState(this.mFragment, true);
                            this.mFragmentStore.makeInactive(this);
                            if (FragmentManager.isLoggingEnabled(3)) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("initState called for fragment: ");
                                sb3.append(this.mFragment);
                            }
                            this.mFragment.initState();
                        }
                        Fragment fragment4 = this.mFragment;
                        if (fragment4.mHiddenChanged) {
                            if (!(fragment4.mView == null || (viewGroup = fragment4.mContainer) == null)) {
                                SpecialEffectsController orCreateController = SpecialEffectsController.getOrCreateController(viewGroup, fragment4.getParentFragmentManager());
                                if (this.mFragment.mHidden) {
                                    orCreateController.enqueueHide(this);
                                } else {
                                    orCreateController.enqueueShow(this);
                                }
                            }
                            Fragment fragment5 = this.mFragment;
                            FragmentManager fragmentManager = fragment5.mFragmentManager;
                            if (fragmentManager != null) {
                                fragmentManager.invalidateMenuForFragment(fragment5);
                            }
                            Fragment fragment6 = this.mFragment;
                            fragment6.mHiddenChanged = false;
                            fragment6.onHiddenChanged(fragment6.mHidden);
                            this.mFragment.mChildFragmentManager.dispatchOnHiddenChanged();
                        }
                        this.mMovingToState = false;
                        return;
                    }
                }
            } catch (Throwable th) {
                this.mMovingToState = false;
                throw th;
            }
        } else if (FragmentManager.isLoggingEnabled(2)) {
            new StringBuilder("Ignoring re-entrant call to moveToExpectedState() for ").append(getFragment());
        }
    }

    public FragmentStateManager(FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher, FragmentStore fragmentStore, ClassLoader classLoader, FragmentFactory fragmentFactory, Bundle bundle) {
        this.mDispatcher = fragmentLifecycleCallbacksDispatcher;
        this.mFragmentStore = fragmentStore;
        Fragment instantiate = ((FragmentState) bundle.getParcelable("state")).instantiate(fragmentFactory, classLoader);
        this.mFragment = instantiate;
        instantiate.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        instantiate.setArguments(bundle2);
        if (FragmentManager.isLoggingEnabled(2)) {
            new StringBuilder("Instantiated fragment ").append(instantiate);
        }
    }

    public FragmentStateManager(FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher, FragmentStore fragmentStore, Fragment fragment, Bundle bundle) {
        this.mDispatcher = fragmentLifecycleCallbacksDispatcher;
        this.mFragmentStore = fragmentStore;
        this.mFragment = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        fragment.mArguments = bundle.getBundle("arguments");
    }
}
