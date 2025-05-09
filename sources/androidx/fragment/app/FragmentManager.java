package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.BackEventCompat;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.app.MultiWindowModeChangedInfo;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.app.PictureInPictureModeChangedInfo;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.util.Consumer;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuProvider;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class FragmentManager implements FragmentResultOwner {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static boolean DEBUG = false;
    private static final String EXTRA_CREATED_FILLIN_INTENT = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE";
    private static final String FRAGMENT_KEY_PREFIX = "fragment_";
    private static final String FRAGMENT_MANAGER_STATE_KEY = "state";
    public static final int POP_BACK_STACK_INCLUSIVE = 1;
    private static final String RESULT_KEY_PREFIX = "result_";
    private static final String SAVED_STATE_KEY = "android:support:fragments";
    public static final String TAG = "FragmentManager";
    public static boolean USE_PREDICTIVE_BACK = true;
    private FragmentContainer mContainer;
    private ArrayList<Fragment> mCreatedMenus;
    private boolean mDestroyed;
    private boolean mExecutingActions;
    private boolean mHavePendingDeferredStart;
    private FragmentHostCallback<?> mHost;
    private boolean mNeedMenuInvalidate;
    private FragmentManagerViewModel mNonConfig;
    private OnBackPressedDispatcher mOnBackPressedDispatcher;
    private Fragment mParent;
    public Fragment mPrimaryNav;
    private ActivityResultLauncher<String[]> mRequestPermissions;
    private ActivityResultLauncher<Intent> mStartActivityForResult;
    private ActivityResultLauncher<IntentSenderRequest> mStartIntentSenderForResult;
    private boolean mStateSaved;
    private boolean mStopped;
    private FragmentStrictMode.Policy mStrictModePolicy;
    private ArrayList<Fragment> mTmpAddedFragments;
    private ArrayList<Boolean> mTmpIsPop;
    private ArrayList<BackStackRecord> mTmpRecords;
    private final ArrayList<OpGenerator> mPendingActions = new ArrayList<>();
    private final FragmentStore mFragmentStore = new FragmentStore();
    public ArrayList<BackStackRecord> mBackStack = new ArrayList<>();
    private final FragmentLayoutInflaterFactory mLayoutInflaterFactory = new FragmentLayoutInflaterFactory(this);
    public BackStackRecord mTransitioningOp = null;
    public boolean mHandlingTransitioningOp = false;
    private final OnBackPressedCallback mOnBackPressedCallback = new OnBackPressedCallback(false) { // from class: androidx.fragment.app.FragmentManager.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/fragment/app/FragmentManager$1");
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackCancelled() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c95b1c4a", new Object[]{this});
                return;
            }
            if (FragmentManager.isLoggingEnabled(3)) {
                StringBuilder sb = new StringBuilder("handleOnBackCancelled. PREDICTIVE_BACK = ");
                sb.append(FragmentManager.USE_PREDICTIVE_BACK);
                sb.append(" fragment manager ");
                sb.append(FragmentManager.this);
            }
            if (FragmentManager.USE_PREDICTIVE_BACK) {
                FragmentManager.this.cancelBackStackTransition();
            }
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4681e31b", new Object[]{this});
                return;
            }
            if (FragmentManager.isLoggingEnabled(3)) {
                StringBuilder sb = new StringBuilder("handleOnBackPressed. PREDICTIVE_BACK = ");
                sb.append(FragmentManager.USE_PREDICTIVE_BACK);
                sb.append(" fragment manager ");
                sb.append(FragmentManager.this);
            }
            FragmentManager.this.handleOnBackPressed();
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackProgressed(BackEventCompat backEventCompat) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0dc6b05", new Object[]{this, backEventCompat});
                return;
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                StringBuilder sb = new StringBuilder("handleOnBackProgressed. PREDICTIVE_BACK = ");
                sb.append(FragmentManager.USE_PREDICTIVE_BACK);
                sb.append(" fragment manager ");
                sb.append(FragmentManager.this);
            }
            FragmentManager fragmentManager = FragmentManager.this;
            if (fragmentManager.mTransitioningOp != null) {
                for (SpecialEffectsController specialEffectsController : fragmentManager.collectChangedControllers(new ArrayList<>(Collections.singletonList(FragmentManager.this.mTransitioningOp)), 0, 1)) {
                    specialEffectsController.processProgress(backEventCompat);
                }
                Iterator<OnBackStackChangedListener> it = FragmentManager.this.mBackStackChangeListeners.iterator();
                while (it.hasNext()) {
                    it.next().onBackStackChangeProgressed(backEventCompat);
                }
            }
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackStarted(BackEventCompat backEventCompat) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("22cbe1cc", new Object[]{this, backEventCompat});
                return;
            }
            if (FragmentManager.isLoggingEnabled(3)) {
                StringBuilder sb = new StringBuilder("handleOnBackStarted. PREDICTIVE_BACK = ");
                sb.append(FragmentManager.USE_PREDICTIVE_BACK);
                sb.append(" fragment manager ");
                sb.append(FragmentManager.this);
            }
            if (FragmentManager.USE_PREDICTIVE_BACK) {
                FragmentManager.access$000(FragmentManager.this);
                FragmentManager.this.prepareBackStackTransition();
            }
        }
    };
    private final AtomicInteger mBackStackIndex = new AtomicInteger();
    private final Map<String, BackStackState> mBackStackStates = Collections.synchronizedMap(new HashMap());
    private final Map<String, Bundle> mResults = Collections.synchronizedMap(new HashMap());
    private final Map<String, LifecycleAwareResultListener> mResultListeners = Collections.synchronizedMap(new HashMap());
    public ArrayList<OnBackStackChangedListener> mBackStackChangeListeners = new ArrayList<>();
    private final FragmentLifecycleCallbacksDispatcher mLifecycleCallbacksDispatcher = new FragmentLifecycleCallbacksDispatcher(this);
    private final CopyOnWriteArrayList<FragmentOnAttachListener> mOnAttachListeners = new CopyOnWriteArrayList<>();
    private final Consumer<Configuration> mOnConfigurationChangedListener = new Consumer() { // from class: tb.ax9
        @Override // androidx.core.util.Consumer
        public final void accept(Object obj) {
            FragmentManager.this.lambda$new$0((Configuration) obj);
        }
    };
    private final Consumer<Integer> mOnTrimMemoryListener = new Consumer() { // from class: tb.bx9
        @Override // androidx.core.util.Consumer
        public final void accept(Object obj) {
            FragmentManager.this.lambda$new$1((Integer) obj);
        }
    };
    private final Consumer<MultiWindowModeChangedInfo> mOnMultiWindowModeChangedListener = new Consumer() { // from class: tb.cx9
        @Override // androidx.core.util.Consumer
        public final void accept(Object obj) {
            FragmentManager.this.lambda$new$2((MultiWindowModeChangedInfo) obj);
        }
    };
    private final Consumer<PictureInPictureModeChangedInfo> mOnPictureInPictureModeChangedListener = new Consumer() { // from class: tb.dx9
        @Override // androidx.core.util.Consumer
        public final void accept(Object obj) {
            FragmentManager.this.lambda$new$3((PictureInPictureModeChangedInfo) obj);
        }
    };
    private final MenuProvider mMenuProvider = new MenuProvider() { // from class: androidx.fragment.app.FragmentManager.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // androidx.core.view.MenuProvider
        public void onCreateMenu(Menu menu, MenuInflater menuInflater) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3585f336", new Object[]{this, menu, menuInflater});
            } else {
                FragmentManager.this.dispatchCreateOptionsMenu(menu, menuInflater);
            }
        }

        @Override // androidx.core.view.MenuProvider
        public void onMenuClosed(Menu menu) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a0048dc7", new Object[]{this, menu});
            } else {
                FragmentManager.this.dispatchOptionsMenuClosed(menu);
            }
        }

        @Override // androidx.core.view.MenuProvider
        public boolean onMenuItemSelected(MenuItem menuItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d0910216", new Object[]{this, menuItem})).booleanValue();
            }
            return FragmentManager.this.dispatchOptionsItemSelected(menuItem);
        }

        @Override // androidx.core.view.MenuProvider
        public void onPrepareMenu(Menu menu) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e78c46a", new Object[]{this, menu});
            } else {
                FragmentManager.this.dispatchPrepareOptionsMenu(menu);
            }
        }
    };
    public int mCurState = -1;
    private FragmentFactory mFragmentFactory = null;
    private FragmentFactory mHostFragmentFactory = new FragmentFactory() { // from class: androidx.fragment.app.FragmentManager.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/fragment/app/FragmentManager$3");
        }

        @Override // androidx.fragment.app.FragmentFactory
        public Fragment instantiate(ClassLoader classLoader, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Fragment) ipChange.ipc$dispatch("c787434b", new Object[]{this, classLoader, str});
            }
            return FragmentManager.this.getHost().instantiate(FragmentManager.this.getHost().getContext(), str, null);
        }
    };
    private SpecialEffectsControllerFactory mSpecialEffectsControllerFactory = null;
    private SpecialEffectsControllerFactory mDefaultSpecialEffectsControllerFactory = new SpecialEffectsControllerFactory() { // from class: androidx.fragment.app.FragmentManager.4
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // androidx.fragment.app.SpecialEffectsControllerFactory
        public SpecialEffectsController createController(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SpecialEffectsController) ipChange.ipc$dispatch("1ed44d3b", new Object[]{this, viewGroup});
            }
            return new DefaultSpecialEffectsController(viewGroup);
        }
    };
    public ArrayDeque<LaunchedFragmentInfo> mLaunchedFragments = new ArrayDeque<>();
    private Runnable mExecCommit = new Runnable() { // from class: androidx.fragment.app.FragmentManager.5
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                FragmentManager.this.execPendingActions(true);
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface BackStackEntry {
        @Deprecated
        CharSequence getBreadCrumbShortTitle();

        @Deprecated
        int getBreadCrumbShortTitleRes();

        @Deprecated
        CharSequence getBreadCrumbTitle();

        @Deprecated
        int getBreadCrumbTitleRes();

        int getId();

        String getName();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class ClearBackStackState implements OpGenerator {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String mName;

        public ClearBackStackState(String str) {
            this.mName = str;
        }

        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public boolean generateOps(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d1877848", new Object[]{this, arrayList, arrayList2})).booleanValue();
            }
            return FragmentManager.this.clearBackStackState(arrayList, arrayList2, this.mName);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class FragmentIntentSenderContract extends ActivityResultContract<IntentSenderRequest, ActivityResult> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(FragmentIntentSenderContract fragmentIntentSenderContract, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/fragment/app/FragmentManager$FragmentIntentSenderContract");
        }

        public Intent createIntent(Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Intent) ipChange.ipc$dispatch("55f0ea1", new Object[]{this, context, intentSenderRequest});
            }
            Intent intent = new Intent(ActivityResultContracts.StartIntentSenderForResult.ACTION_INTENT_SENDER_REQUEST);
            Intent fillInIntent = intentSenderRequest.getFillInIntent();
            if (!(fillInIntent == null || (bundleExtra = fillInIntent.getBundleExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE)) == null)) {
                intent.putExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE, bundleExtra);
                fillInIntent.removeExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE);
                if (fillInIntent.getBooleanExtra(FragmentManager.EXTRA_CREATED_FILLIN_INTENT, false)) {
                    intentSenderRequest = new IntentSenderRequest.Builder(intentSenderRequest.getIntentSender()).setFillInIntent(null).setFlags(intentSenderRequest.getFlagsValues(), intentSenderRequest.getFlagsMask()).build();
                }
            }
            intent.putExtra(ActivityResultContracts.StartIntentSenderForResult.EXTRA_INTENT_SENDER_REQUEST, intentSenderRequest);
            if (FragmentManager.isLoggingEnabled(2)) {
                new StringBuilder("CreateIntent created the following intent: ").append(intent);
            }
            return intent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public ActivityResult parseResult(int i, Intent intent) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ActivityResult) ipChange.ipc$dispatch("4d3c89d6", new Object[]{this, new Integer(i), intent}) : new ActivityResult(i, intent);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static abstract class FragmentLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Deprecated
        public void onFragmentActivityCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c0f5ae2", new Object[]{this, fragmentManager, fragment, bundle});
            }
        }

        public void onFragmentAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("69b9df5f", new Object[]{this, fragmentManager, fragment, context});
            }
        }

        public void onFragmentCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("871739b1", new Object[]{this, fragmentManager, fragment, bundle});
            }
        }

        public void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2658eb2", new Object[]{this, fragmentManager, fragment});
            }
        }

        public void onFragmentDetached(FragmentManager fragmentManager, Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d62d7dfb", new Object[]{this, fragmentManager, fragment});
            }
        }

        public void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c8137aff", new Object[]{this, fragmentManager, fragment});
            }
        }

        public void onFragmentPreAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("69cbbd64", new Object[]{this, fragmentManager, fragment, context});
            }
        }

        public void onFragmentPreCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2bcee74c", new Object[]{this, fragmentManager, fragment, bundle});
            }
        }

        public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("953163f4", new Object[]{this, fragmentManager, fragment});
            }
        }

        public void onFragmentSaveInstanceState(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4d383dc8", new Object[]{this, fragmentManager, fragment, bundle});
            }
        }

        public void onFragmentStarted(FragmentManager fragmentManager, Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e970430a", new Object[]{this, fragmentManager, fragment});
            }
        }

        public void onFragmentStopped(FragmentManager fragmentManager, Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a68ca3e", new Object[]{this, fragmentManager, fragment});
            }
        }

        public void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dce5770a", new Object[]{this, fragmentManager, fragment, view, bundle});
            }
        }

        public void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93910177", new Object[]{this, fragmentManager, fragment});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class LifecycleAwareResultListener implements FragmentResultListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Lifecycle mLifecycle;
        private final FragmentResultListener mListener;
        private final LifecycleEventObserver mObserver;

        public LifecycleAwareResultListener(Lifecycle lifecycle, FragmentResultListener fragmentResultListener, LifecycleEventObserver lifecycleEventObserver) {
            this.mLifecycle = lifecycle;
            this.mListener = fragmentResultListener;
            this.mObserver = lifecycleEventObserver;
        }

        public boolean isAtLeast(Lifecycle.State state) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c80b42da", new Object[]{this, state})).booleanValue();
            }
            return this.mLifecycle.getCurrentState().isAtLeast(state);
        }

        @Override // androidx.fragment.app.FragmentResultListener
        public void onFragmentResult(String str, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7ffe19d7", new Object[]{this, str, bundle});
            } else {
                this.mListener.onFragmentResult(str, bundle);
            }
        }

        public void removeObserver() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("859d2301", new Object[]{this});
            } else {
                this.mLifecycle.removeObserver(this.mObserver);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface OnBackStackChangedListener {
        void onBackStackChangeCancelled();

        void onBackStackChangeCommitted(Fragment fragment, boolean z);

        void onBackStackChangeProgressed(BackEventCompat backEventCompat);

        void onBackStackChangeStarted(Fragment fragment, boolean z);

        void onBackStackChanged();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface OpGenerator {
        boolean generateOps(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class PopBackStackState implements OpGenerator {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final int mFlags;
        public final int mId;
        public final String mName;

        public PopBackStackState(String str, int i, int i2) {
            this.mName = str;
            this.mId = i;
            this.mFlags = i2;
        }

        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public boolean generateOps(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d1877848", new Object[]{this, arrayList, arrayList2})).booleanValue();
            }
            Fragment fragment = FragmentManager.this.mPrimaryNav;
            if (fragment == null || this.mId >= 0 || this.mName != null || !fragment.getChildFragmentManager().popBackStackImmediate()) {
                return FragmentManager.this.popBackStackState(arrayList, arrayList2, this.mName, this.mId, this.mFlags);
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class PrepareBackStackTransitionState implements OpGenerator {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public PrepareBackStackTransitionState() {
        }

        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public boolean generateOps(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d1877848", new Object[]{this, arrayList, arrayList2})).booleanValue();
            }
            boolean prepareBackStackState = FragmentManager.this.prepareBackStackState(arrayList, arrayList2);
            if (!FragmentManager.this.mBackStackChangeListeners.isEmpty() && arrayList.size() > 0) {
                boolean booleanValue = arrayList2.get(arrayList.size() - 1).booleanValue();
                LinkedHashSet<Fragment> linkedHashSet = new LinkedHashSet();
                Iterator<BackStackRecord> it = arrayList.iterator();
                while (it.hasNext()) {
                    linkedHashSet.addAll(FragmentManager.this.fragmentsFromRecord(it.next()));
                }
                Iterator<OnBackStackChangedListener> it2 = FragmentManager.this.mBackStackChangeListeners.iterator();
                while (it2.hasNext()) {
                    OnBackStackChangedListener next = it2.next();
                    for (Fragment fragment : linkedHashSet) {
                        next.onBackStackChangeStarted(fragment, booleanValue);
                    }
                }
            }
            return prepareBackStackState;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class RestoreBackStackState implements OpGenerator {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String mName;

        public RestoreBackStackState(String str) {
            this.mName = str;
        }

        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public boolean generateOps(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d1877848", new Object[]{this, arrayList, arrayList2})).booleanValue();
            }
            return FragmentManager.this.restoreBackStackState(arrayList, arrayList2, this.mName);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class SaveBackStackState implements OpGenerator {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String mName;

        public SaveBackStackState(String str) {
            this.mName = str;
        }

        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public boolean generateOps(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d1877848", new Object[]{this, arrayList, arrayList2})).booleanValue();
            }
            return FragmentManager.this.saveBackStackState(arrayList, arrayList2, this.mName);
        }
    }

    public static /* synthetic */ void access$000(FragmentManager fragmentManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e173e494", new Object[]{fragmentManager});
        } else {
            fragmentManager.endAnimatingAwayFragments();
        }
    }

    public static /* synthetic */ Map access$100(FragmentManager fragmentManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b5642f28", new Object[]{fragmentManager});
        }
        return fragmentManager.mResults;
    }

    public static /* synthetic */ Map access$200(FragmentManager fragmentManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bb67fa87", new Object[]{fragmentManager});
        }
        return fragmentManager.mResultListeners;
    }

    public static /* synthetic */ FragmentStore access$300(FragmentManager fragmentManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentStore) ipChange.ipc$dispatch("e98298", new Object[]{fragmentManager});
        }
        return fragmentManager.mFragmentStore;
    }

    private void checkStateLoss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecc3c1b3", new Object[]{this});
        } else if (isStateSaved()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void cleanupExec() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b1635c", new Object[]{this});
            return;
        }
        this.mExecutingActions = false;
        this.mTmpIsPop.clear();
        this.mTmpRecords.clear();
    }

    private void clearBackStackStateViewModels() {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a93006b3", new Object[]{this});
            return;
        }
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        if (fragmentHostCallback instanceof ViewModelStoreOwner) {
            z = this.mFragmentStore.getNonConfig().isCleared();
        } else if (fragmentHostCallback.getContext() instanceof Activity) {
            z = true ^ ((Activity) this.mHost.getContext()).isChangingConfigurations();
        }
        if (z) {
            for (BackStackState backStackState : this.mBackStackStates.values()) {
                for (String str : backStackState.mFragments) {
                    this.mFragmentStore.getNonConfig().clearNonConfigState(str, false);
                }
            }
        }
    }

    private Set<SpecialEffectsController> collectAllSpecialEffectsController() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("472f5ef2", new Object[]{this});
        }
        HashSet hashSet = new HashSet();
        for (FragmentStateManager fragmentStateManager : this.mFragmentStore.getActiveFragmentStateManagers()) {
            ViewGroup viewGroup = fragmentStateManager.getFragment().mContainer;
            if (viewGroup != null) {
                hashSet.add(SpecialEffectsController.getOrCreateController(viewGroup, getSpecialEffectsControllerFactory()));
            }
        }
        return hashSet;
    }

    private void dispatchParentPrimaryNavigationFragmentChanged(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9adb811", new Object[]{this, fragment});
        } else if (fragment != null && fragment.equals(findActiveFragment(fragment.mWho))) {
            fragment.performPrimaryNavigationFragmentChanged();
        }
    }

    /* JADX WARN: Finally extract failed */
    private void dispatchStateChange(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18119cf5", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            this.mExecutingActions = true;
            this.mFragmentStore.dispatchStateChange(i);
            moveToState(i, false);
            for (SpecialEffectsController specialEffectsController : collectAllSpecialEffectsController()) {
                specialEffectsController.forceCompleteAllOperations();
            }
            this.mExecutingActions = false;
            execPendingActions(true);
        } catch (Throwable th) {
            this.mExecutingActions = false;
            throw th;
        }
    }

    private void doPendingDeferredStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cd0019e", new Object[]{this});
        } else if (this.mHavePendingDeferredStart) {
            this.mHavePendingDeferredStart = false;
            startPendingDeferredFragments();
        }
    }

    @Deprecated
    public static void enableDebugLogging(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac2adde", new Object[]{new Boolean(z)});
        } else {
            DEBUG = z;
        }
    }

    public static void enablePredictiveBack(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2e11984", new Object[]{new Boolean(z)});
        } else {
            USE_PREDICTIVE_BACK = z;
        }
    }

    private void endAnimatingAwayFragments() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9442859", new Object[]{this});
            return;
        }
        for (SpecialEffectsController specialEffectsController : collectAllSpecialEffectsController()) {
            specialEffectsController.forceCompleteAllOperations();
        }
    }

    private void ensureExecReady(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5576ab9", new Object[]{this, new Boolean(z)});
        } else if (this.mExecutingActions) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.mHost == null) {
            if (this.mDestroyed) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() == this.mHost.getHandler().getLooper()) {
            if (!z) {
                checkStateLoss();
            }
            if (this.mTmpRecords == null) {
                this.mTmpRecords = new ArrayList<>();
                this.mTmpIsPop = new ArrayList<>();
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    private static void executeOps(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea70b5a4", new Object[]{arrayList, arrayList2, new Integer(i), new Integer(i2)});
            return;
        }
        while (i < i2) {
            BackStackRecord backStackRecord = arrayList.get(i);
            if (arrayList2.get(i).booleanValue()) {
                backStackRecord.bumpBackStackNesting(-1);
                backStackRecord.executePopOps();
            } else {
                backStackRecord.bumpBackStackNesting(1);
                backStackRecord.executeOps();
            }
            i++;
        }
    }

    private void executeOpsTogether(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("734db2fe", new Object[]{this, arrayList, arrayList2, new Integer(i), new Integer(i2)});
            return;
        }
        boolean z = arrayList.get(i).mReorderingAllowed;
        ArrayList<Fragment> arrayList3 = this.mTmpAddedFragments;
        if (arrayList3 == null) {
            this.mTmpAddedFragments = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.mTmpAddedFragments.addAll(this.mFragmentStore.getFragments());
        Fragment primaryNavigationFragment = getPrimaryNavigationFragment();
        boolean z2 = false;
        for (int i3 = i; i3 < i2; i3++) {
            BackStackRecord backStackRecord = arrayList.get(i3);
            if (!arrayList2.get(i3).booleanValue()) {
                primaryNavigationFragment = backStackRecord.expandOps(this.mTmpAddedFragments, primaryNavigationFragment);
            } else {
                primaryNavigationFragment = backStackRecord.trackAddedFragmentsInPop(this.mTmpAddedFragments, primaryNavigationFragment);
            }
            if (z2 || backStackRecord.mAddToBackStack) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        this.mTmpAddedFragments.clear();
        if (!z && this.mCurState >= 1) {
            for (int i4 = i; i4 < i2; i4++) {
                Iterator<FragmentTransaction.Op> it = arrayList.get(i4).mOps.iterator();
                while (it.hasNext()) {
                    Fragment fragment = it.next().mFragment;
                    if (!(fragment == null || fragment.mFragmentManager == null)) {
                        this.mFragmentStore.makeActive(createOrGetFragmentStateManager(fragment));
                    }
                }
            }
        }
        executeOps(arrayList, arrayList2, i, i2);
        boolean booleanValue = arrayList2.get(i2 - 1).booleanValue();
        if (z2 && !this.mBackStackChangeListeners.isEmpty()) {
            LinkedHashSet<Fragment> linkedHashSet = new LinkedHashSet();
            Iterator<BackStackRecord> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(fragmentsFromRecord(it2.next()));
            }
            if (this.mTransitioningOp == null) {
                Iterator<OnBackStackChangedListener> it3 = this.mBackStackChangeListeners.iterator();
                while (it3.hasNext()) {
                    OnBackStackChangedListener next = it3.next();
                    for (Fragment fragment2 : linkedHashSet) {
                        next.onBackStackChangeStarted(fragment2, booleanValue);
                    }
                }
                Iterator<OnBackStackChangedListener> it4 = this.mBackStackChangeListeners.iterator();
                while (it4.hasNext()) {
                    OnBackStackChangedListener next2 = it4.next();
                    for (Fragment fragment3 : linkedHashSet) {
                        next2.onBackStackChangeCommitted(fragment3, booleanValue);
                    }
                }
            }
        }
        for (int i5 = i; i5 < i2; i5++) {
            BackStackRecord backStackRecord2 = arrayList.get(i5);
            if (booleanValue) {
                for (int size = backStackRecord2.mOps.size() - 1; size >= 0; size--) {
                    Fragment fragment4 = backStackRecord2.mOps.get(size).mFragment;
                    if (fragment4 != null) {
                        createOrGetFragmentStateManager(fragment4).moveToExpectedState();
                    }
                }
            } else {
                Iterator<FragmentTransaction.Op> it5 = backStackRecord2.mOps.iterator();
                while (it5.hasNext()) {
                    Fragment fragment5 = it5.next().mFragment;
                    if (fragment5 != null) {
                        createOrGetFragmentStateManager(fragment5).moveToExpectedState();
                    }
                }
            }
        }
        moveToState(this.mCurState, true);
        for (SpecialEffectsController specialEffectsController : collectChangedControllers(arrayList, i, i2)) {
            specialEffectsController.updateOperationDirection(booleanValue);
            specialEffectsController.markPostponedState();
            specialEffectsController.executePendingOperations();
        }
        while (i < i2) {
            BackStackRecord backStackRecord3 = arrayList.get(i);
            if (arrayList2.get(i).booleanValue() && backStackRecord3.mIndex >= 0) {
                backStackRecord3.mIndex = -1;
            }
            backStackRecord3.runOnCommitRunnables();
            i++;
        }
        if (z2) {
            reportBackStackChanged();
        }
    }

    private int findBackStackIndex(String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c163bdff", new Object[]{this, str, new Integer(i), new Boolean(z)})).intValue();
        }
        if (this.mBackStack.isEmpty()) {
            return -1;
        }
        if (str != null || i >= 0) {
            int size = this.mBackStack.size() - 1;
            while (size >= 0) {
                BackStackRecord backStackRecord = this.mBackStack.get(size);
                if ((str != null && str.equals(backStackRecord.getName())) || (i >= 0 && i == backStackRecord.mIndex)) {
                    break;
                }
                size--;
            }
            if (size < 0) {
                return size;
            }
            if (z) {
                while (size > 0) {
                    BackStackRecord backStackRecord2 = this.mBackStack.get(size - 1);
                    if ((str == null || !str.equals(backStackRecord2.getName())) && (i < 0 || i != backStackRecord2.mIndex)) {
                        return size;
                    }
                    size--;
                }
                return size;
            } else if (size == this.mBackStack.size() - 1) {
                return -1;
            } else {
                return size + 1;
            }
        } else if (z) {
            return 0;
        } else {
            return this.mBackStack.size() - 1;
        }
    }

    public static <F extends Fragment> F findFragment(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (F) ((Fragment) ipChange.ipc$dispatch("bfc8de2c", new Object[]{view}));
        }
        F f = (F) findViewFragment(view);
        if (f != null) {
            return f;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }

    public static FragmentManager findFragmentManager(View view) {
        FragmentActivity fragmentActivity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentManager) ipChange.ipc$dispatch("8590e002", new Object[]{view});
        }
        Fragment findViewFragment = findViewFragment(view);
        if (findViewFragment == null) {
            Context context = view.getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    fragmentActivity = null;
                    break;
                } else if (context instanceof FragmentActivity) {
                    fragmentActivity = (FragmentActivity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (fragmentActivity != null) {
                return fragmentActivity.getSupportFragmentManager();
            }
            throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
        } else if (findViewFragment.isAdded()) {
            return findViewFragment.getChildFragmentManager();
        } else {
            throw new IllegalStateException("The Fragment " + findViewFragment + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
    }

    public static Fragment findViewFragment(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("71bf2db1", new Object[]{view});
        }
        while (view != null) {
            Fragment viewFragment = getViewFragment(view);
            if (viewFragment != null) {
                return viewFragment;
            }
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        return null;
    }

    private void forcePostponedTransactions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b8d595f", new Object[]{this});
            return;
        }
        for (SpecialEffectsController specialEffectsController : collectAllSpecialEffectsController()) {
            specialEffectsController.forcePostponedExecutePendingOperations();
        }
    }

    private boolean generateOpsForPendingActions(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf91679d", new Object[]{this, arrayList, arrayList2})).booleanValue();
        }
        synchronized (this.mPendingActions) {
            if (this.mPendingActions.isEmpty()) {
                return false;
            }
            int size = this.mPendingActions.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                z |= this.mPendingActions.get(i).generateOps(arrayList, arrayList2);
            }
            this.mPendingActions.clear();
            this.mHost.getHandler().removeCallbacks(this.mExecCommit);
            return z;
        }
    }

    private FragmentManagerViewModel getChildNonConfig(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentManagerViewModel) ipChange.ipc$dispatch("698fd6cf", new Object[]{this, fragment});
        }
        return this.mNonConfig.getChildNonConfig(fragment);
    }

    private ViewGroup getFragmentContainer(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("c2ba457b", new Object[]{this, fragment});
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.mContainer.onHasView()) {
            View onFindViewById = this.mContainer.onFindViewById(fragment.mContainerId);
            if (onFindViewById instanceof ViewGroup) {
                return (ViewGroup) onFindViewById;
            }
        }
        return null;
    }

    public static Fragment getViewFragment(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("21ef6c0e", new Object[]{view});
        }
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    public static boolean isLoggingEnabled(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5592a434", new Object[]{new Integer(i)})).booleanValue();
        }
        if (DEBUG || Log.isLoggable(TAG, i)) {
            return true;
        }
        return false;
    }

    private boolean isMenuAvailable(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40e84ca3", new Object[]{this, fragment})).booleanValue();
        }
        if ((!fragment.mHasMenu || !fragment.mMenuVisible) && !fragment.mChildFragmentManager.checkForMenus()) {
            return false;
        }
        return true;
    }

    private boolean isParentAdded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93fd8d77", new Object[]{this})).booleanValue();
        }
        Fragment fragment = this.mParent;
        if (fragment == null) {
            return true;
        }
        if (!fragment.isAdded() || !this.mParent.getParentFragmentManager().isParentAdded()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$attachController$5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("70168c5a", new Object[]{this});
        }
        return saveAllStateInternal();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$cancelBackStackTransition$4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95d4476", new Object[]{this});
            return;
        }
        Iterator<OnBackStackChangedListener> it = this.mBackStackChangeListeners.iterator();
        while (it.hasNext()) {
            it.next().onBackStackChangeCancelled();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f50c6e1a", new Object[]{this, configuration});
        } else if (isParentAdded()) {
            dispatchConfigurationChanged(configuration, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35965180", new Object[]{this, num});
        } else if (isParentAdded() && num.intValue() == 80) {
            dispatchLowMemory(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(MultiWindowModeChangedInfo multiWindowModeChangedInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90b8a099", new Object[]{this, multiWindowModeChangedInfo});
        } else if (isParentAdded()) {
            dispatchMultiWindowModeChanged(multiWindowModeChangedInfo.isInMultiWindowMode(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$3(PictureInPictureModeChangedInfo pictureInPictureModeChangedInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f876723c", new Object[]{this, pictureInPictureModeChangedInfo});
        } else if (isParentAdded()) {
            dispatchPictureInPictureModeChanged(pictureInPictureModeChangedInfo.isInPictureInPictureMode(), false);
        }
    }

    private void removeRedundantOperationsAndExecute(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67e9b5da", new Object[]{this, arrayList, arrayList2});
        } else if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i2 = 0;
                while (i < size) {
                    if (!arrayList.get(i).mReorderingAllowed) {
                        if (i2 != i) {
                            executeOpsTogether(arrayList, arrayList2, i2, i);
                        }
                        i2 = i + 1;
                        if (arrayList2.get(i).booleanValue()) {
                            while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).mReorderingAllowed) {
                                i2++;
                            }
                        }
                        executeOpsTogether(arrayList, arrayList2, i, i2);
                        i = i2 - 1;
                    }
                    i++;
                }
                if (i2 != size) {
                    executeOpsTogether(arrayList, arrayList2, i2, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    private void reportBackStackChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47326fee", new Object[]{this});
            return;
        }
        for (int i = 0; i < this.mBackStackChangeListeners.size(); i++) {
            this.mBackStackChangeListeners.get(i).onBackStackChanged();
        }
    }

    public static int reverseTransit(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22cf995e", new Object[]{new Integer(i)})).intValue();
        }
        if (i == 4097) {
            return 8194;
        }
        if (i == 8194) {
            return 4097;
        }
        if (i == 8197) {
            return 4100;
        }
        if (i == 4099) {
            return 4099;
        }
        if (i != 4100) {
            return 0;
        }
        return FragmentTransaction.TRANSIT_FRAGMENT_MATCH_ACTIVITY_CLOSE;
    }

    private void setVisibleRemovingFragment(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd02c080", new Object[]{this, fragment});
            return;
        }
        ViewGroup fragmentContainer = getFragmentContainer(fragment);
        if (fragmentContainer != null && fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() > 0) {
            int i = R.id.visible_removing_fragment_view_tag;
            if (fragmentContainer.getTag(i) == null) {
                fragmentContainer.setTag(i, fragment);
            }
            ((Fragment) fragmentContainer.getTag(i)).setPopDirection(fragment.getPopDirection());
        }
    }

    private void startPendingDeferredFragments() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e8219b6", new Object[]{this});
            return;
        }
        for (FragmentStateManager fragmentStateManager : this.mFragmentStore.getActiveFragmentStateManagers()) {
            performPendingDeferredStart(fragmentStateManager);
        }
    }

    private void throwException(RuntimeException runtimeException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98625114", new Object[]{this, runtimeException});
            return;
        }
        Log.e(TAG, runtimeException.getMessage());
        Log.e(TAG, "Activity state:");
        PrintWriter printWriter = new PrintWriter(new LogWriter(TAG));
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        if (fragmentHostCallback != null) {
            try {
                fragmentHostCallback.onDump("  ", null, printWriter, new String[0]);
            } catch (Exception e) {
                Log.e(TAG, "Failed dumping state", e);
            }
        } else {
            try {
                dump("  ", null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e(TAG, "Failed dumping state", e2);
            }
        }
        throw runtimeException;
    }

    private void updateOnBackPressedCallbackEnabled() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb4d9730", new Object[]{this});
            return;
        }
        synchronized (this.mPendingActions) {
            try {
                if (!this.mPendingActions.isEmpty()) {
                    this.mOnBackPressedCallback.setEnabled(true);
                    if (isLoggingEnabled(3)) {
                        StringBuilder sb = new StringBuilder("FragmentManager ");
                        sb.append(this);
                        sb.append(" enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                if (getBackStackEntryCount() > 0 && isPrimaryNavigation(this.mParent)) {
                    z = true;
                }
                if (isLoggingEnabled(3)) {
                    StringBuilder sb2 = new StringBuilder("OnBackPressedCallback for FragmentManager ");
                    sb2.append(this);
                    sb2.append(" enabled state is ");
                    sb2.append(z);
                }
                this.mOnBackPressedCallback.setEnabled(z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void addBackStackState(BackStackRecord backStackRecord) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dfb143e", new Object[]{this, backStackRecord});
        } else {
            this.mBackStack.add(backStackRecord);
        }
    }

    public FragmentStateManager addFragment(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentStateManager) ipChange.ipc$dispatch("255be202", new Object[]{this, fragment});
        }
        String str = fragment.mPreviousWho;
        if (str != null) {
            FragmentStrictMode.onFragmentReuse(fragment, str);
        }
        if (isLoggingEnabled(2)) {
            new StringBuilder("add: ").append(fragment);
        }
        FragmentStateManager createOrGetFragmentStateManager = createOrGetFragmentStateManager(fragment);
        fragment.mFragmentManager = this;
        this.mFragmentStore.makeActive(createOrGetFragmentStateManager);
        if (!fragment.mDetached) {
            this.mFragmentStore.addFragment(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (isMenuAvailable(fragment)) {
                this.mNeedMenuInvalidate = true;
            }
        }
        return createOrGetFragmentStateManager;
    }

    public void addFragmentOnAttachListener(FragmentOnAttachListener fragmentOnAttachListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a97ae10", new Object[]{this, fragmentOnAttachListener});
        } else {
            this.mOnAttachListeners.add(fragmentOnAttachListener);
        }
    }

    public void addOnBackStackChangedListener(OnBackStackChangedListener onBackStackChangedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29ca749", new Object[]{this, onBackStackChangedListener});
        } else {
            this.mBackStackChangeListeners.add(onBackStackChangedListener);
        }
    }

    public void addRetainedFragment(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51713c94", new Object[]{this, fragment});
        } else {
            this.mNonConfig.addRetainedFragment(fragment);
        }
    }

    public int allocBackStackIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cdd3780", new Object[]{this})).intValue();
        }
        return this.mBackStackIndex.getAndIncrement();
    }

    public void attachController(FragmentHostCallback<?> fragmentHostCallback, FragmentContainer fragmentContainer, final Fragment fragment) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfd957c", new Object[]{this, fragmentHostCallback, fragmentContainer, fragment});
        } else if (this.mHost == null) {
            this.mHost = fragmentHostCallback;
            this.mContainer = fragmentContainer;
            this.mParent = fragment;
            if (fragment != null) {
                addFragmentOnAttachListener(new FragmentOnAttachListener() { // from class: androidx.fragment.app.FragmentManager.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // androidx.fragment.app.FragmentOnAttachListener
                    public void onAttachFragment(FragmentManager fragmentManager, Fragment fragment2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5f055a88", new Object[]{this, fragmentManager, fragment2});
                        } else {
                            fragment.onAttachFragment(fragment2);
                        }
                    }
                });
            } else if (fragmentHostCallback instanceof FragmentOnAttachListener) {
                addFragmentOnAttachListener((FragmentOnAttachListener) fragmentHostCallback);
            }
            if (this.mParent != null) {
                updateOnBackPressedCallbackEnabled();
            }
            if (fragmentHostCallback instanceof OnBackPressedDispatcherOwner) {
                OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = (OnBackPressedDispatcherOwner) fragmentHostCallback;
                OnBackPressedDispatcher onBackPressedDispatcher = onBackPressedDispatcherOwner.getOnBackPressedDispatcher();
                this.mOnBackPressedDispatcher = onBackPressedDispatcher;
                LifecycleOwner lifecycleOwner = onBackPressedDispatcherOwner;
                if (fragment != null) {
                    lifecycleOwner = fragment;
                }
                onBackPressedDispatcher.addCallback(lifecycleOwner, this.mOnBackPressedCallback);
            }
            if (fragment != null) {
                this.mNonConfig = fragment.mFragmentManager.getChildNonConfig(fragment);
            } else if (fragmentHostCallback instanceof ViewModelStoreOwner) {
                this.mNonConfig = FragmentManagerViewModel.getInstance(((ViewModelStoreOwner) fragmentHostCallback).getViewModelStore());
            } else {
                this.mNonConfig = new FragmentManagerViewModel(false);
            }
            this.mNonConfig.setIsStateSaved(isStateSaved());
            this.mFragmentStore.setNonConfig(this.mNonConfig);
            FragmentHostCallback<?> fragmentHostCallback2 = this.mHost;
            if ((fragmentHostCallback2 instanceof SavedStateRegistryOwner) && fragment == null) {
                SavedStateRegistry savedStateRegistry = ((SavedStateRegistryOwner) fragmentHostCallback2).getSavedStateRegistry();
                savedStateRegistry.registerSavedStateProvider(SAVED_STATE_KEY, new SavedStateRegistry.SavedStateProvider() { // from class: tb.ex9
                    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
                    public final Bundle saveState() {
                        Bundle lambda$attachController$5;
                        lambda$attachController$5 = FragmentManager.this.lambda$attachController$5();
                        return lambda$attachController$5;
                    }
                });
                Bundle consumeRestoredStateForKey = savedStateRegistry.consumeRestoredStateForKey(SAVED_STATE_KEY);
                if (consumeRestoredStateForKey != null) {
                    restoreSaveStateInternal(consumeRestoredStateForKey);
                }
            }
            FragmentHostCallback<?> fragmentHostCallback3 = this.mHost;
            if (fragmentHostCallback3 instanceof ActivityResultRegistryOwner) {
                ActivityResultRegistry activityResultRegistry = ((ActivityResultRegistryOwner) fragmentHostCallback3).getActivityResultRegistry();
                if (fragment != null) {
                    str = fragment.mWho + ":";
                } else {
                    str = "";
                }
                String str2 = "FragmentManager:" + str;
                this.mStartActivityForResult = activityResultRegistry.register(str2 + "StartActivityForResult", new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() { // from class: androidx.fragment.app.FragmentManager.8
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public void onActivityResult(ActivityResult activityResult) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("ec85556b", new Object[]{this, activityResult});
                            return;
                        }
                        LaunchedFragmentInfo pollLast = FragmentManager.this.mLaunchedFragments.pollLast();
                        if (pollLast == null) {
                            new StringBuilder("No Activities were started for result for ").append(this);
                            return;
                        }
                        String str3 = pollLast.mWho;
                        int i = pollLast.mRequestCode;
                        Fragment findFragmentByWho = FragmentManager.access$300(FragmentManager.this).findFragmentByWho(str3);
                        if (findFragmentByWho == null) {
                            new StringBuilder("Activity result delivered for unknown Fragment ").append(str3);
                        } else {
                            findFragmentByWho.onActivityResult(i, activityResult.getResultCode(), activityResult.getData());
                        }
                    }
                });
                this.mStartIntentSenderForResult = activityResultRegistry.register(str2 + "StartIntentSenderForResult", new FragmentIntentSenderContract(), new ActivityResultCallback<ActivityResult>() { // from class: androidx.fragment.app.FragmentManager.9
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public void onActivityResult(ActivityResult activityResult) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("ec85556b", new Object[]{this, activityResult});
                            return;
                        }
                        LaunchedFragmentInfo pollFirst = FragmentManager.this.mLaunchedFragments.pollFirst();
                        if (pollFirst == null) {
                            new StringBuilder("No IntentSenders were started for ").append(this);
                            return;
                        }
                        String str3 = pollFirst.mWho;
                        int i = pollFirst.mRequestCode;
                        Fragment findFragmentByWho = FragmentManager.access$300(FragmentManager.this).findFragmentByWho(str3);
                        if (findFragmentByWho == null) {
                            new StringBuilder("Intent Sender result delivered for unknown Fragment ").append(str3);
                        } else {
                            findFragmentByWho.onActivityResult(i, activityResult.getResultCode(), activityResult.getData());
                        }
                    }
                });
                this.mRequestPermissions = activityResultRegistry.register(str2 + "RequestPermissions", new ActivityResultContracts.RequestMultiplePermissions(), new ActivityResultCallback<Map<String, Boolean>>() { // from class: androidx.fragment.app.FragmentManager.10
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public void onActivityResult(Map<String, Boolean> map) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("52a9ee73", new Object[]{this, map});
                            return;
                        }
                        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                        ArrayList arrayList = new ArrayList(map.values());
                        int[] iArr = new int[arrayList.size()];
                        for (int i = 0; i < arrayList.size(); i++) {
                            iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                        }
                        LaunchedFragmentInfo pollFirst = FragmentManager.this.mLaunchedFragments.pollFirst();
                        if (pollFirst == null) {
                            new StringBuilder("No permissions were requested for ").append(this);
                            return;
                        }
                        String str3 = pollFirst.mWho;
                        int i2 = pollFirst.mRequestCode;
                        Fragment findFragmentByWho = FragmentManager.access$300(FragmentManager.this).findFragmentByWho(str3);
                        if (findFragmentByWho == null) {
                            new StringBuilder("Permission request result delivered for unknown Fragment ").append(str3);
                        } else {
                            findFragmentByWho.onRequestPermissionsResult(i2, strArr, iArr);
                        }
                    }
                });
            }
            FragmentHostCallback<?> fragmentHostCallback4 = this.mHost;
            if (fragmentHostCallback4 instanceof OnConfigurationChangedProvider) {
                ((OnConfigurationChangedProvider) fragmentHostCallback4).addOnConfigurationChangedListener(this.mOnConfigurationChangedListener);
            }
            FragmentHostCallback<?> fragmentHostCallback5 = this.mHost;
            if (fragmentHostCallback5 instanceof OnTrimMemoryProvider) {
                ((OnTrimMemoryProvider) fragmentHostCallback5).addOnTrimMemoryListener(this.mOnTrimMemoryListener);
            }
            FragmentHostCallback<?> fragmentHostCallback6 = this.mHost;
            if (fragmentHostCallback6 instanceof OnMultiWindowModeChangedProvider) {
                ((OnMultiWindowModeChangedProvider) fragmentHostCallback6).addOnMultiWindowModeChangedListener(this.mOnMultiWindowModeChangedListener);
            }
            FragmentHostCallback<?> fragmentHostCallback7 = this.mHost;
            if (fragmentHostCallback7 instanceof OnPictureInPictureModeChangedProvider) {
                ((OnPictureInPictureModeChangedProvider) fragmentHostCallback7).addOnPictureInPictureModeChangedListener(this.mOnPictureInPictureModeChangedListener);
            }
            FragmentHostCallback<?> fragmentHostCallback8 = this.mHost;
            if ((fragmentHostCallback8 instanceof MenuHost) && fragment == null) {
                ((MenuHost) fragmentHostCallback8).addMenuProvider(this.mMenuProvider);
            }
        } else {
            throw new IllegalStateException("Already attached");
        }
    }

    public void attachFragment(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7941feb4", new Object[]{this, fragment});
            return;
        }
        if (isLoggingEnabled(2)) {
            new StringBuilder("attach: ").append(fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (!fragment.mAdded) {
                this.mFragmentStore.addFragment(fragment);
                if (isLoggingEnabled(2)) {
                    new StringBuilder("add from attach: ").append(fragment);
                }
                if (isMenuAvailable(fragment)) {
                    this.mNeedMenuInvalidate = true;
                }
            }
        }
    }

    public FragmentTransaction beginTransaction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentTransaction) ipChange.ipc$dispatch("b5b07f06", new Object[]{this});
        }
        return new BackStackRecord(this);
    }

    public void cancelBackStackTransition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("398b73c3", new Object[]{this});
            return;
        }
        if (isLoggingEnabled(3)) {
            Objects.toString(this.mTransitioningOp);
        }
        BackStackRecord backStackRecord = this.mTransitioningOp;
        if (backStackRecord != null) {
            backStackRecord.mCommitted = false;
            backStackRecord.collapseOps();
            this.mTransitioningOp.runOnCommitInternal(true, new Runnable() { // from class: tb.fx9
                @Override // java.lang.Runnable
                public final void run() {
                    FragmentManager.this.lambda$cancelBackStackTransition$4();
                }
            });
            this.mTransitioningOp.commit();
            this.mHandlingTransitioningOp = true;
            executePendingTransactions();
            this.mHandlingTransitioningOp = false;
            this.mTransitioningOp = null;
        }
    }

    public boolean checkForMenus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1e853de", new Object[]{this})).booleanValue();
        }
        boolean z = false;
        for (Fragment fragment : this.mFragmentStore.getActiveFragments()) {
            if (fragment != null) {
                z = isMenuAvailable(fragment);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public void clearBackStack(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e09aa9a5", new Object[]{this, str});
        } else {
            enqueueAction(new ClearBackStackState(str), false);
        }
    }

    public boolean clearBackStackState(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("281df2f2", new Object[]{this, arrayList, arrayList2, str})).booleanValue();
        }
        if (!restoreBackStackState(arrayList, arrayList2, str)) {
            return false;
        }
        return popBackStackState(arrayList, arrayList2, str, -1, 1);
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void clearFragmentResult(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("750a054b", new Object[]{this, str});
            return;
        }
        this.mResults.remove(str);
        if (isLoggingEnabled(2)) {
            new StringBuilder("Clearing fragment result with key ").append(str);
        }
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void clearFragmentResultListener(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a34bd1f", new Object[]{this, str});
            return;
        }
        LifecycleAwareResultListener remove = this.mResultListeners.remove(str);
        if (remove != null) {
            remove.removeObserver();
        }
        if (isLoggingEnabled(2)) {
            new StringBuilder("Clearing FragmentResultListener for key ").append(str);
        }
    }

    public Set<SpecialEffectsController> collectChangedControllers(ArrayList<BackStackRecord> arrayList, int i, int i2) {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("811f54a5", new Object[]{this, arrayList, new Integer(i), new Integer(i2)});
        }
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator<FragmentTransaction.Op> it = arrayList.get(i).mOps.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().mFragment;
                if (!(fragment == null || (viewGroup = fragment.mContainer) == null)) {
                    hashSet.add(SpecialEffectsController.getOrCreateController(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    public FragmentStateManager createOrGetFragmentStateManager(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentStateManager) ipChange.ipc$dispatch("6c363010", new Object[]{this, fragment});
        }
        FragmentStateManager fragmentStateManager = this.mFragmentStore.getFragmentStateManager(fragment.mWho);
        if (fragmentStateManager != null) {
            return fragmentStateManager;
        }
        FragmentStateManager fragmentStateManager2 = new FragmentStateManager(this.mLifecycleCallbacksDispatcher, this.mFragmentStore, fragment);
        fragmentStateManager2.restoreState(this.mHost.getContext().getClassLoader());
        fragmentStateManager2.setFragmentManagerState(this.mCurState);
        return fragmentStateManager2;
    }

    public void dispatchActivityCreated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c870206", new Object[]{this});
            return;
        }
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.setIsStateSaved(false);
        dispatchStateChange(4);
    }

    public void dispatchAttach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3dd1866", new Object[]{this});
            return;
        }
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.setIsStateSaved(false);
        dispatchStateChange(0);
    }

    public void dispatchConfigurationChanged(Configuration configuration, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d43e863", new Object[]{this, configuration, new Boolean(z)});
            return;
        }
        if (z && (this.mHost instanceof OnConfigurationChangedProvider)) {
            throwException(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (Fragment fragment : this.mFragmentStore.getFragments()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z) {
                    fragment.mChildFragmentManager.dispatchConfigurationChanged(configuration, true);
                }
            }
        }
    }

    public boolean dispatchContextItemSelected(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("228f2e3f", new Object[]{this, menuItem})).booleanValue();
        }
        if (this.mCurState < 1) {
            return false;
        }
        for (Fragment fragment : this.mFragmentStore.getFragments()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void dispatchCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a8d979d", new Object[]{this});
            return;
        }
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.setIsStateSaved(false);
        dispatchStateChange(1);
    }

    public boolean dispatchCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("690e5367", new Object[]{this, menu, menuInflater})).booleanValue();
        }
        if (this.mCurState < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.mFragmentStore.getFragments()) {
            if (fragment != null && isParentMenuVisible(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.mCreatedMenus != null) {
            for (int i = 0; i < this.mCreatedMenus.size(); i++) {
                Fragment fragment2 = this.mCreatedMenus.get(i);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.mCreatedMenus = arrayList;
        return z;
    }

    public void dispatchDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("912b4aa7", new Object[]{this});
            return;
        }
        this.mDestroyed = true;
        execPendingActions(true);
        endAnimatingAwayFragments();
        clearBackStackStateViewModels();
        dispatchStateChange(-1);
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        if (fragmentHostCallback instanceof OnTrimMemoryProvider) {
            ((OnTrimMemoryProvider) fragmentHostCallback).removeOnTrimMemoryListener(this.mOnTrimMemoryListener);
        }
        FragmentHostCallback<?> fragmentHostCallback2 = this.mHost;
        if (fragmentHostCallback2 instanceof OnConfigurationChangedProvider) {
            ((OnConfigurationChangedProvider) fragmentHostCallback2).removeOnConfigurationChangedListener(this.mOnConfigurationChangedListener);
        }
        FragmentHostCallback<?> fragmentHostCallback3 = this.mHost;
        if (fragmentHostCallback3 instanceof OnMultiWindowModeChangedProvider) {
            ((OnMultiWindowModeChangedProvider) fragmentHostCallback3).removeOnMultiWindowModeChangedListener(this.mOnMultiWindowModeChangedListener);
        }
        FragmentHostCallback<?> fragmentHostCallback4 = this.mHost;
        if (fragmentHostCallback4 instanceof OnPictureInPictureModeChangedProvider) {
            ((OnPictureInPictureModeChangedProvider) fragmentHostCallback4).removeOnPictureInPictureModeChangedListener(this.mOnPictureInPictureModeChangedListener);
        }
        FragmentHostCallback<?> fragmentHostCallback5 = this.mHost;
        if ((fragmentHostCallback5 instanceof MenuHost) && this.mParent == null) {
            ((MenuHost) fragmentHostCallback5).removeMenuProvider(this.mMenuProvider);
        }
        this.mHost = null;
        this.mContainer = null;
        this.mParent = null;
        if (this.mOnBackPressedDispatcher != null) {
            this.mOnBackPressedCallback.remove();
            this.mOnBackPressedDispatcher = null;
        }
        ActivityResultLauncher<Intent> activityResultLauncher = this.mStartActivityForResult;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
            this.mStartIntentSenderForResult.unregister();
            this.mRequestPermissions.unregister();
        }
    }

    public void dispatchDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3194feec", new Object[]{this});
        } else {
            dispatchStateChange(1);
        }
    }

    public void dispatchLowMemory(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("456415f2", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z && (this.mHost instanceof OnTrimMemoryProvider)) {
            throwException(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (Fragment fragment : this.mFragmentStore.getFragments()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z) {
                    fragment.mChildFragmentManager.dispatchLowMemory(true);
                }
            }
        }
    }

    public void dispatchMultiWindowModeChanged(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f1a8e29", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        if (z2 && (this.mHost instanceof OnMultiWindowModeChangedProvider)) {
            throwException(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (Fragment fragment : this.mFragmentStore.getFragments()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.dispatchMultiWindowModeChanged(z, true);
                }
            }
        }
    }

    public void dispatchOnAttachFragment(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b43828d", new Object[]{this, fragment});
            return;
        }
        Iterator<FragmentOnAttachListener> it = this.mOnAttachListeners.iterator();
        while (it.hasNext()) {
            it.next().onAttachFragment(this, fragment);
        }
    }

    public void dispatchOnHiddenChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2a72238", new Object[]{this});
            return;
        }
        for (Fragment fragment : this.mFragmentStore.getActiveFragments()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.dispatchOnHiddenChanged();
            }
        }
    }

    public boolean dispatchOptionsItemSelected(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b19be70", new Object[]{this, menuItem})).booleanValue();
        }
        if (this.mCurState < 1) {
            return false;
        }
        for (Fragment fragment : this.mFragmentStore.getFragments()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void dispatchOptionsMenuClosed(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41dc0f82", new Object[]{this, menu});
        } else if (this.mCurState >= 1) {
            for (Fragment fragment : this.mFragmentStore.getFragments()) {
                if (fragment != null) {
                    fragment.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    public void dispatchPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d030423", new Object[]{this});
        } else {
            dispatchStateChange(5);
        }
    }

    public void dispatchPictureInPictureModeChanged(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4cd3743", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        if (z2 && (this.mHost instanceof OnPictureInPictureModeChangedProvider)) {
            throwException(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (Fragment fragment : this.mFragmentStore.getFragments()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.dispatchPictureInPictureModeChanged(z, true);
                }
            }
        }
    }

    public boolean dispatchPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1dd6645", new Object[]{this, menu})).booleanValue();
        }
        if (this.mCurState < 1) {
            return false;
        }
        for (Fragment fragment : this.mFragmentStore.getFragments()) {
            if (fragment != null && isParentMenuVisible(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public void dispatchPrimaryNavigationFragmentChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5e15acf", new Object[]{this});
            return;
        }
        updateOnBackPressedCallbackEnabled();
        dispatchParentPrimaryNavigationFragmentChanged(this.mPrimaryNav);
    }

    public void dispatchResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7bcbe4e", new Object[]{this});
            return;
        }
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.setIsStateSaved(false);
        dispatchStateChange(7);
    }

    public void dispatchStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dca88c8f", new Object[]{this});
            return;
        }
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.setIsStateSaved(false);
        dispatchStateChange(5);
    }

    public void dispatchStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48104a23", new Object[]{this});
            return;
        }
        this.mStopped = true;
        this.mNonConfig.setIsStateSaved(true);
        dispatchStateChange(4);
    }

    public void dispatchViewCreated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c370c3b0", new Object[]{this});
        } else {
            dispatchStateChange(2);
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab37b0f", new Object[]{this, str, fileDescriptor, printWriter, strArr});
            return;
        }
        String str2 = str + "    ";
        this.mFragmentStore.dump(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.mCreatedMenus;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i = 0; i < size; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.mCreatedMenus.get(i).toString());
            }
        }
        int size2 = this.mBackStack.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i2 = 0; i2 < size2; i2++) {
                BackStackRecord backStackRecord = this.mBackStack.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(backStackRecord.toString());
                backStackRecord.dump(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.mBackStackIndex.get());
        synchronized (this.mPendingActions) {
            try {
                int size3 = this.mPendingActions.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i3 = 0; i3 < size3; i3++) {
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i3);
                        printWriter.print(": ");
                        printWriter.println(this.mPendingActions.get(i3));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.mHost);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.mContainer);
        if (this.mParent != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.mParent);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.mCurState);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.mStateSaved);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.mDestroyed);
        if (this.mNeedMenuInvalidate) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.mNeedMenuInvalidate);
        }
    }

    public void enqueueAction(OpGenerator opGenerator, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16fb845c", new Object[]{this, opGenerator, new Boolean(z)});
            return;
        }
        if (!z) {
            if (this.mHost != null) {
                checkStateLoss();
            } else if (this.mDestroyed) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.mPendingActions) {
            try {
                if (this.mHost != null) {
                    this.mPendingActions.add(opGenerator);
                    scheduleCommit();
                } else if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    public boolean execPendingActions(boolean z) {
        BackStackRecord backStackRecord;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee453b3a", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        ensureExecReady(z);
        if (!this.mHandlingTransitioningOp && (backStackRecord = this.mTransitioningOp) != null) {
            backStackRecord.mCommitted = false;
            backStackRecord.collapseOps();
            if (isLoggingEnabled(3)) {
                StringBuilder sb = new StringBuilder("Reversing mTransitioningOp ");
                sb.append(this.mTransitioningOp);
                sb.append(" as part of execPendingActions for actions ");
                sb.append(this.mPendingActions);
            }
            this.mTransitioningOp.commitInternal(false, false);
            this.mPendingActions.add(0, this.mTransitioningOp);
            Iterator<FragmentTransaction.Op> it = this.mTransitioningOp.mOps.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().mFragment;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.mTransitioningOp = null;
        }
        while (generateOpsForPendingActions(this.mTmpRecords, this.mTmpIsPop)) {
            this.mExecutingActions = true;
            try {
                removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
                cleanupExec();
                z2 = true;
            } catch (Throwable th) {
                cleanupExec();
                throw th;
            }
        }
        updateOnBackPressedCallbackEnabled();
        doPendingDeferredStart();
        this.mFragmentStore.burpActive();
        return z2;
    }

    public void execSingleAction(OpGenerator opGenerator, boolean z) {
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6df77ecd", new Object[]{this, opGenerator, new Boolean(z)});
        } else if (!z || (this.mHost != null && !this.mDestroyed)) {
            ensureExecReady(z);
            BackStackRecord backStackRecord = this.mTransitioningOp;
            if (backStackRecord != null) {
                backStackRecord.mCommitted = false;
                backStackRecord.collapseOps();
                if (isLoggingEnabled(3)) {
                    StringBuilder sb = new StringBuilder("Reversing mTransitioningOp ");
                    sb.append(this.mTransitioningOp);
                    sb.append(" as part of execSingleAction for action ");
                    sb.append(opGenerator);
                }
                this.mTransitioningOp.commitInternal(false, false);
                boolean generateOps = this.mTransitioningOp.generateOps(this.mTmpRecords, this.mTmpIsPop);
                Iterator<FragmentTransaction.Op> it = this.mTransitioningOp.mOps.iterator();
                while (it.hasNext()) {
                    Fragment fragment = it.next().mFragment;
                    if (fragment != null) {
                        fragment.mTransitioning = false;
                    }
                }
                this.mTransitioningOp = null;
                z2 = generateOps;
            }
            boolean generateOps2 = opGenerator.generateOps(this.mTmpRecords, this.mTmpIsPop);
            if (z2 || generateOps2) {
                this.mExecutingActions = true;
                try {
                    removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
                } finally {
                    cleanupExec();
                }
            }
            updateOnBackPressedCallbackEnabled();
            doPendingDeferredStart();
            this.mFragmentStore.burpActive();
        }
    }

    public boolean executePendingTransactions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("536967e2", new Object[]{this})).booleanValue();
        }
        boolean execPendingActions = execPendingActions(true);
        forcePostponedTransactions();
        return execPendingActions;
    }

    public Fragment findActiveFragment(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("1b3e072e", new Object[]{this, str});
        }
        return this.mFragmentStore.findActiveFragment(str);
    }

    public Fragment findFragmentById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("aac14c4d", new Object[]{this, new Integer(i)});
        }
        return this.mFragmentStore.findFragmentById(i);
    }

    public Fragment findFragmentByTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("c20cfb83", new Object[]{this, str});
        }
        return this.mFragmentStore.findFragmentByTag(str);
    }

    public Fragment findFragmentByWho(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("b7da3ddf", new Object[]{this, str});
        }
        return this.mFragmentStore.findFragmentByWho(str);
    }

    public Set<Fragment> fragmentsFromRecord(BackStackRecord backStackRecord) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("6125c160", new Object[]{this, backStackRecord});
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < backStackRecord.mOps.size(); i++) {
            Fragment fragment = backStackRecord.mOps.get(i).mFragment;
            if (fragment != null && backStackRecord.mAddToBackStack) {
                hashSet.add(fragment);
            }
        }
        return hashSet;
    }

    public int getActiveFragmentCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7b6ee2fd", new Object[]{this})).intValue();
        }
        return this.mFragmentStore.getActiveFragmentCount();
    }

    public List<Fragment> getActiveFragments() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7780d9f9", new Object[]{this});
        }
        return this.mFragmentStore.getActiveFragments();
    }

    public BackStackEntry getBackStackEntryAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BackStackEntry) ipChange.ipc$dispatch("1a9d69e4", new Object[]{this, new Integer(i)});
        }
        if (i != this.mBackStack.size()) {
            return this.mBackStack.get(i);
        }
        BackStackRecord backStackRecord = this.mTransitioningOp;
        if (backStackRecord != null) {
            return backStackRecord;
        }
        throw new IndexOutOfBoundsException();
    }

    public int getBackStackEntryCount() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("605ac9c2", new Object[]{this})).intValue();
        }
        int size = this.mBackStack.size();
        if (this.mTransitioningOp != null) {
            i = 1;
        }
        return size + i;
    }

    public FragmentContainer getContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentContainer) ipChange.ipc$dispatch("bf1a0659", new Object[]{this});
        }
        return this.mContainer;
    }

    public Fragment getFragment(Bundle bundle, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("55dee77d", new Object[]{this, bundle, str});
        }
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment findActiveFragment = findActiveFragment(string);
        if (findActiveFragment == null) {
            throwException(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return findActiveFragment;
    }

    public FragmentFactory getFragmentFactory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentFactory) ipChange.ipc$dispatch("db443809", new Object[]{this});
        }
        FragmentFactory fragmentFactory = this.mFragmentFactory;
        if (fragmentFactory != null) {
            return fragmentFactory;
        }
        Fragment fragment = this.mParent;
        if (fragment != null) {
            return fragment.mFragmentManager.getFragmentFactory();
        }
        return this.mHostFragmentFactory;
    }

    public FragmentStore getFragmentStore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentStore) ipChange.ipc$dispatch("b8c26469", new Object[]{this});
        }
        return this.mFragmentStore;
    }

    public List<Fragment> getFragments() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("68dc9c53", new Object[]{this});
        }
        return this.mFragmentStore.getFragments();
    }

    public FragmentHostCallback<?> getHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentHostCallback) ipChange.ipc$dispatch("c604843c", new Object[]{this});
        }
        return this.mHost;
    }

    public LayoutInflater.Factory2 getLayoutInflaterFactory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LayoutInflater.Factory2) ipChange.ipc$dispatch("28d7cb92", new Object[]{this});
        }
        return this.mLayoutInflaterFactory;
    }

    public FragmentLifecycleCallbacksDispatcher getLifecycleCallbacksDispatcher() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentLifecycleCallbacksDispatcher) ipChange.ipc$dispatch("55f0fcbb", new Object[]{this});
        }
        return this.mLifecycleCallbacksDispatcher;
    }

    public Fragment getParent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("bbbfd07", new Object[]{this});
        }
        return this.mParent;
    }

    public Fragment getPrimaryNavigationFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("5ec6f37", new Object[]{this});
        }
        return this.mPrimaryNav;
    }

    public SpecialEffectsControllerFactory getSpecialEffectsControllerFactory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpecialEffectsControllerFactory) ipChange.ipc$dispatch("1fafbda9", new Object[]{this});
        }
        SpecialEffectsControllerFactory specialEffectsControllerFactory = this.mSpecialEffectsControllerFactory;
        if (specialEffectsControllerFactory != null) {
            return specialEffectsControllerFactory;
        }
        Fragment fragment = this.mParent;
        if (fragment != null) {
            return fragment.mFragmentManager.getSpecialEffectsControllerFactory();
        }
        return this.mDefaultSpecialEffectsControllerFactory;
    }

    public FragmentStrictMode.Policy getStrictModePolicy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentStrictMode.Policy) ipChange.ipc$dispatch("a2588fac", new Object[]{this});
        }
        return this.mStrictModePolicy;
    }

    public ViewModelStore getViewModelStore(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewModelStore) ipChange.ipc$dispatch("eccc735b", new Object[]{this, fragment});
        }
        return this.mNonConfig.getViewModelStore(fragment);
    }

    public void handleOnBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4681e31b", new Object[]{this});
            return;
        }
        this.mHandlingTransitioningOp = true;
        execPendingActions(true);
        this.mHandlingTransitioningOp = false;
        if (USE_PREDICTIVE_BACK && this.mTransitioningOp != null) {
            if (!this.mBackStackChangeListeners.isEmpty()) {
                LinkedHashSet<Fragment> linkedHashSet = new LinkedHashSet(fragmentsFromRecord(this.mTransitioningOp));
                Iterator<OnBackStackChangedListener> it = this.mBackStackChangeListeners.iterator();
                while (it.hasNext()) {
                    OnBackStackChangedListener next = it.next();
                    for (Fragment fragment : linkedHashSet) {
                        next.onBackStackChangeCommitted(fragment, true);
                    }
                }
            }
            Iterator<FragmentTransaction.Op> it2 = this.mTransitioningOp.mOps.iterator();
            while (it2.hasNext()) {
                Fragment fragment2 = it2.next().mFragment;
                if (fragment2 != null) {
                    fragment2.mTransitioning = false;
                }
            }
            for (SpecialEffectsController specialEffectsController : collectChangedControllers(new ArrayList<>(Collections.singletonList(this.mTransitioningOp)), 0, 1)) {
                specialEffectsController.completeBack();
            }
            Iterator<FragmentTransaction.Op> it3 = this.mTransitioningOp.mOps.iterator();
            while (it3.hasNext()) {
                Fragment fragment3 = it3.next().mFragment;
                if (fragment3 != null && fragment3.mContainer == null) {
                    createOrGetFragmentStateManager(fragment3).moveToExpectedState();
                }
            }
            this.mTransitioningOp = null;
            updateOnBackPressedCallbackEnabled();
            if (isLoggingEnabled(3)) {
                StringBuilder sb = new StringBuilder("OnBackPressedCallback enabled=");
                sb.append(this.mOnBackPressedCallback.isEnabled());
                sb.append(" for  FragmentManager ");
                sb.append(this);
            }
        } else if (this.mOnBackPressedCallback.isEnabled()) {
            isLoggingEnabled(3);
            popBackStackImmediate();
        } else {
            isLoggingEnabled(3);
            this.mOnBackPressedDispatcher.onBackPressed();
        }
    }

    public void hideFragment(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd872631", new Object[]{this, fragment});
            return;
        }
        if (isLoggingEnabled(2)) {
            new StringBuilder("hide: ").append(fragment);
        }
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
            setVisibleRemovingFragment(fragment);
        }
    }

    public void invalidateMenuForFragment(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6f9869e", new Object[]{this, fragment});
        } else if (fragment.mAdded && isMenuAvailable(fragment)) {
            this.mNeedMenuInvalidate = true;
        }
    }

    public boolean isDestroyed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d65bd1a", new Object[]{this})).booleanValue();
        }
        return this.mDestroyed;
    }

    public boolean isParentHidden(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9926bc1", new Object[]{this, fragment})).booleanValue();
        }
        if (fragment == null) {
            return false;
        }
        return fragment.isHidden();
    }

    public boolean isParentMenuVisible(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("531b5902", new Object[]{this, fragment})).booleanValue();
        }
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    public boolean isPrimaryNavigation(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b254352f", new Object[]{this, fragment})).booleanValue();
        }
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (!fragment.equals(fragmentManager.getPrimaryNavigationFragment()) || !isPrimaryNavigation(fragmentManager.mParent)) {
            return false;
        }
        return true;
    }

    public boolean isStateAtLeast(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dcc00251", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (this.mCurState >= i) {
            return true;
        }
        return false;
    }

    public boolean isStateSaved() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7627cdcb", new Object[]{this})).booleanValue();
        }
        if (this.mStateSaved || this.mStopped) {
            return true;
        }
        return false;
    }

    public void launchRequestPermissions(Fragment fragment, String[] strArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22b5fd4b", new Object[]{this, fragment, strArr, new Integer(i)});
        } else if (this.mRequestPermissions != null) {
            this.mLaunchedFragments.addLast(new LaunchedFragmentInfo(fragment.mWho, i));
            this.mRequestPermissions.launch(strArr);
        } else {
            this.mHost.onRequestPermissionsFromFragment(fragment, strArr, i);
        }
    }

    public void launchStartActivityForResult(Fragment fragment, Intent intent, int i, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("816c1675", new Object[]{this, fragment, intent, new Integer(i), bundle});
        } else if (this.mStartActivityForResult != null) {
            this.mLaunchedFragments.addLast(new LaunchedFragmentInfo(fragment.mWho, i));
            if (bundle != null) {
                intent.putExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE, bundle);
            }
            this.mStartActivityForResult.launch(intent);
        } else {
            this.mHost.onStartActivityFromFragment(fragment, intent, i, bundle);
        }
    }

    public void launchStartIntentSenderForResult(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ea7de04", new Object[]{this, fragment, intentSender, new Integer(i), intent, new Integer(i2), new Integer(i3), new Integer(i4), bundle});
        } else if (this.mStartIntentSenderForResult != null) {
            if (bundle != null) {
                if (intent == null) {
                    intent2 = new Intent();
                    intent2.putExtra(EXTRA_CREATED_FILLIN_INTENT, true);
                } else {
                    intent2 = intent;
                }
                if (isLoggingEnabled(2)) {
                    StringBuilder sb = new StringBuilder("ActivityOptions ");
                    sb.append(bundle);
                    sb.append(" were added to fillInIntent ");
                    sb.append(intent2);
                    sb.append(" for fragment ");
                    sb.append(fragment);
                }
                intent2.putExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE, bundle);
            } else {
                intent2 = intent;
            }
            IntentSenderRequest build = new IntentSenderRequest.Builder(intentSender).setFillInIntent(intent2).setFlags(i3, i2).build();
            this.mLaunchedFragments.addLast(new LaunchedFragmentInfo(fragment.mWho, i));
            if (isLoggingEnabled(2)) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(fragment);
                sb2.append("is launching an IntentSender for result ");
            }
            this.mStartIntentSenderForResult.launch(build);
        } else {
            this.mHost.onStartIntentSenderFromFragment(fragment, intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public void moveToState(int i, boolean z) {
        FragmentHostCallback<?> fragmentHostCallback;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae4930fd", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (this.mHost == null && i != -1) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.mCurState) {
            this.mCurState = i;
            this.mFragmentStore.moveToExpectedState();
            startPendingDeferredFragments();
            if (this.mNeedMenuInvalidate && (fragmentHostCallback = this.mHost) != null && this.mCurState == 7) {
                fragmentHostCallback.onSupportInvalidateOptionsMenu();
                this.mNeedMenuInvalidate = false;
            }
        }
    }

    public void noteStateNotSaved() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e4a435a", new Object[]{this});
        } else if (this.mHost != null) {
            this.mStateSaved = false;
            this.mStopped = false;
            this.mNonConfig.setIsStateSaved(false);
            for (Fragment fragment : this.mFragmentStore.getFragments()) {
                if (fragment != null) {
                    fragment.noteStateNotSaved();
                }
            }
        }
    }

    public final void onContainerAvailable(FragmentContainerView fragmentContainerView) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25937064", new Object[]{this, fragmentContainerView});
            return;
        }
        for (FragmentStateManager fragmentStateManager : this.mFragmentStore.getActiveFragmentStateManagers()) {
            Fragment fragment = fragmentStateManager.getFragment();
            if (fragment.mContainerId == fragmentContainerView.getId() && (view = fragment.mView) != null && view.getParent() == null) {
                fragment.mContainer = fragmentContainerView;
                fragmentStateManager.addViewToContainer();
                fragmentStateManager.moveToExpectedState();
            }
        }
    }

    @Deprecated
    public FragmentTransaction openTransaction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentTransaction) ipChange.ipc$dispatch("31acfc85", new Object[]{this});
        }
        return beginTransaction();
    }

    public void performPendingDeferredStart(FragmentStateManager fragmentStateManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a258df0", new Object[]{this, fragmentStateManager});
            return;
        }
        Fragment fragment = fragmentStateManager.getFragment();
        if (!fragment.mDeferStart) {
            return;
        }
        if (this.mExecutingActions) {
            this.mHavePendingDeferredStart = true;
            return;
        }
        fragment.mDeferStart = false;
        fragmentStateManager.moveToExpectedState();
    }

    public void popBackStack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c94fb17", new Object[]{this});
        } else {
            enqueueAction(new PopBackStackState(null, -1, 0), false);
        }
    }

    public boolean popBackStackImmediate() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e319170c", new Object[]{this})).booleanValue() : popBackStackImmediate(null, -1, 0);
    }

    public boolean popBackStackState(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1764a3d6", new Object[]{this, arrayList, arrayList2, str, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if ((i2 & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        int findBackStackIndex = findBackStackIndex(str, i, z);
        if (findBackStackIndex < 0) {
            return false;
        }
        for (int size = this.mBackStack.size() - 1; size >= findBackStackIndex; size--) {
            arrayList.add(this.mBackStack.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public boolean prepareBackStackState(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("efb37de2", new Object[]{this, arrayList, arrayList2})).booleanValue();
        }
        if (isLoggingEnabled(2)) {
            new StringBuilder("FragmentManager has the following pending actions inside of prepareBackStackState: ").append(this.mPendingActions);
        }
        if (this.mBackStack.isEmpty()) {
            return false;
        }
        ArrayList<BackStackRecord> arrayList3 = this.mBackStack;
        BackStackRecord backStackRecord = arrayList3.get(arrayList3.size() - 1);
        this.mTransitioningOp = backStackRecord;
        Iterator<FragmentTransaction.Op> it = backStackRecord.mOps.iterator();
        while (it.hasNext()) {
            Fragment fragment = it.next().mFragment;
            if (fragment != null) {
                fragment.mTransitioning = true;
            }
        }
        return popBackStackState(arrayList, arrayList2, null, -1, 0);
    }

    public void prepareBackStackTransition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5618696", new Object[]{this});
        } else {
            enqueueAction(new PrepareBackStackTransitionState(), false);
        }
    }

    public void putFragment(Bundle bundle, String str, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fdc02d0", new Object[]{this, bundle, str, fragment});
            return;
        }
        if (fragment.mFragmentManager != this) {
            throwException(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.mWho);
    }

    public void registerFragmentLifecycleCallbacks(FragmentLifecycleCallbacks fragmentLifecycleCallbacks, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb3b429", new Object[]{this, fragmentLifecycleCallbacks, new Boolean(z)});
        } else {
            this.mLifecycleCallbacksDispatcher.registerFragmentLifecycleCallbacks(fragmentLifecycleCallbacks, z);
        }
    }

    public void removeFragmentOnAttachListener(FragmentOnAttachListener fragmentOnAttachListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d3cd973", new Object[]{this, fragmentOnAttachListener});
        } else {
            this.mOnAttachListeners.remove(fragmentOnAttachListener);
        }
    }

    public void removeOnBackStackChangedListener(OnBackStackChangedListener onBackStackChangedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a125432c", new Object[]{this, onBackStackChangedListener});
        } else {
            this.mBackStackChangeListeners.remove(onBackStackChangedListener);
        }
    }

    public void removeRetainedFragment(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1054a0f7", new Object[]{this, fragment});
        } else {
            this.mNonConfig.removeRetainedFragment(fragment);
        }
    }

    public void restoreAllState(Parcelable parcelable, FragmentManagerNonConfig fragmentManagerNonConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("605f10e4", new Object[]{this, parcelable, fragmentManagerNonConfig});
            return;
        }
        if (this.mHost instanceof ViewModelStoreOwner) {
            throwException(new IllegalStateException("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
        }
        this.mNonConfig.restoreFromSnapshot(fragmentManagerNonConfig);
        restoreSaveStateInternal(parcelable);
    }

    public void restoreBackStack(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47724544", new Object[]{this, str});
        } else {
            enqueueAction(new RestoreBackStackState(str), false);
        }
    }

    public boolean restoreBackStackState(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89438173", new Object[]{this, arrayList, arrayList2, str})).booleanValue();
        }
        BackStackState remove = this.mBackStackStates.remove(str);
        if (remove == null) {
            return false;
        }
        HashMap hashMap = new HashMap();
        Iterator<BackStackRecord> it = arrayList.iterator();
        while (it.hasNext()) {
            BackStackRecord next = it.next();
            if (next.mBeingSaved) {
                Iterator<FragmentTransaction.Op> it2 = next.mOps.iterator();
                while (it2.hasNext()) {
                    Fragment fragment = it2.next().mFragment;
                    if (fragment != null) {
                        hashMap.put(fragment.mWho, fragment);
                    }
                }
            }
        }
        while (true) {
            boolean z = false;
            for (BackStackRecord backStackRecord : remove.instantiate(this, hashMap)) {
                if (backStackRecord.generateOps(arrayList, arrayList2) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    public void restoreSaveState(Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4919386", new Object[]{this, parcelable});
            return;
        }
        if (this.mHost instanceof SavedStateRegistryOwner) {
            throwException(new IllegalStateException("You cannot use restoreSaveState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        }
        restoreSaveStateInternal(parcelable);
    }

    @Deprecated
    public FragmentManagerNonConfig retainNonConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentManagerNonConfig) ipChange.ipc$dispatch("9e23b85b", new Object[]{this});
        }
        if (this.mHost instanceof ViewModelStoreOwner) {
            throwException(new IllegalStateException("You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."));
        }
        return this.mNonConfig.getSnapshot();
    }

    public Parcelable saveAllState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("db9217", new Object[]{this});
        }
        if (this.mHost instanceof SavedStateRegistryOwner) {
            throwException(new IllegalStateException("You cannot use saveAllState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        }
        Bundle saveAllStateInternal = saveAllStateInternal();
        if (saveAllStateInternal.isEmpty()) {
            return null;
        }
        return saveAllStateInternal;
    }

    public void saveBackStack(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fd53875", new Object[]{this, str});
        } else {
            enqueueAction(new SaveBackStackState(str), false);
        }
    }

    public Fragment.SavedState saveFragmentInstanceState(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment.SavedState) ipChange.ipc$dispatch("ef39848", new Object[]{this, fragment});
        }
        FragmentStateManager fragmentStateManager = this.mFragmentStore.getFragmentStateManager(fragment.mWho);
        if (fragmentStateManager == null || !fragmentStateManager.getFragment().equals(fragment)) {
            throwException(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return fragmentStateManager.saveInstanceState();
    }

    public void scheduleCommit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("832e9835", new Object[]{this});
            return;
        }
        synchronized (this.mPendingActions) {
            try {
                if (this.mPendingActions.size() == 1) {
                    this.mHost.getHandler().removeCallbacks(this.mExecCommit);
                    this.mHost.getHandler().post(this.mExecCommit);
                    updateOnBackPressedCallbackEnabled();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setExitAnimationOrder(Fragment fragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("399acc8b", new Object[]{this, fragment, new Boolean(z)});
            return;
        }
        ViewGroup fragmentContainer = getFragmentContainer(fragment);
        if (fragmentContainer != null && (fragmentContainer instanceof FragmentContainerView)) {
            ((FragmentContainerView) fragmentContainer).setDrawDisappearingViewsLast(!z);
        }
    }

    public void setFragmentFactory(FragmentFactory fragmentFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84f4cc2f", new Object[]{this, fragmentFactory});
        } else {
            this.mFragmentFactory = fragmentFactory;
        }
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void setFragmentResult(String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dfd13f4", new Object[]{this, str, bundle});
            return;
        }
        LifecycleAwareResultListener lifecycleAwareResultListener = this.mResultListeners.get(str);
        if (lifecycleAwareResultListener == null || !lifecycleAwareResultListener.isAtLeast(Lifecycle.State.STARTED)) {
            this.mResults.put(str, bundle);
        } else {
            lifecycleAwareResultListener.onFragmentResult(str, bundle);
        }
        if (isLoggingEnabled(2)) {
            StringBuilder sb = new StringBuilder("Setting fragment result with key ");
            sb.append(str);
            sb.append(" and result ");
            sb.append(bundle);
        }
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void setFragmentResultListener(final String str, LifecycleOwner lifecycleOwner, final FragmentResultListener fragmentResultListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a51e0620", new Object[]{this, str, lifecycleOwner, fragmentResultListener});
            return;
        }
        final Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
            LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.fragment.app.FragmentManager.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                    Bundle bundle;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fa8a81fe", new Object[]{this, lifecycleOwner2, event});
                        return;
                    }
                    if (event == Lifecycle.Event.ON_START && (bundle = (Bundle) FragmentManager.access$100(FragmentManager.this).get(str)) != null) {
                        fragmentResultListener.onFragmentResult(str, bundle);
                        FragmentManager.this.clearFragmentResult(str);
                    }
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        lifecycle.removeObserver(this);
                        FragmentManager.access$200(FragmentManager.this).remove(str);
                    }
                }
            };
            LifecycleAwareResultListener put = this.mResultListeners.put(str, new LifecycleAwareResultListener(lifecycle, fragmentResultListener, lifecycleEventObserver));
            if (put != null) {
                put.removeObserver();
            }
            if (isLoggingEnabled(2)) {
                StringBuilder sb = new StringBuilder("Setting FragmentResultListener with key ");
                sb.append(str);
                sb.append(" lifecycleOwner ");
                sb.append(lifecycle);
                sb.append(" and listener ");
                sb.append(fragmentResultListener);
            }
            lifecycle.addObserver(lifecycleEventObserver);
        }
    }

    public void setMaxLifecycle(Fragment fragment, Lifecycle.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71e72a4a", new Object[]{this, fragment, state});
        } else if (!fragment.equals(findActiveFragment(fragment.mWho)) || !(fragment.mHost == null || fragment.mFragmentManager == this)) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        } else {
            fragment.mMaxState = state;
        }
    }

    public void setPrimaryNavigationFragment(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e53b363", new Object[]{this, fragment});
        } else if (fragment == null || (fragment.equals(findActiveFragment(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.mPrimaryNav;
            this.mPrimaryNav = fragment;
            dispatchParentPrimaryNavigationFragmentChanged(fragment2);
            dispatchParentPrimaryNavigationFragmentChanged(this.mPrimaryNav);
        } else {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
    }

    public void setSpecialEffectsControllerFactory(SpecialEffectsControllerFactory specialEffectsControllerFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f8e4f19", new Object[]{this, specialEffectsControllerFactory});
        } else {
            this.mSpecialEffectsControllerFactory = specialEffectsControllerFactory;
        }
    }

    public void setStrictModePolicy(FragmentStrictMode.Policy policy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67add6f8", new Object[]{this, policy});
        } else {
            this.mStrictModePolicy = policy;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.mParent;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.mParent)));
            sb.append("}");
        } else {
            FragmentHostCallback<?> fragmentHostCallback = this.mHost;
            if (fragmentHostCallback != null) {
                sb.append(fragmentHostCallback.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.mHost)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public void unregisterFragmentLifecycleCallbacks(FragmentLifecycleCallbacks fragmentLifecycleCallbacks) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55e779a4", new Object[]{this, fragmentLifecycleCallbacks});
        } else {
            this.mLifecycleCallbacksDispatcher.unregisterFragmentLifecycleCallbacks(fragmentLifecycleCallbacks);
        }
    }

    public void popBackStack(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5585ea02", new Object[]{this, str, new Integer(i)});
        } else {
            enqueueAction(new PopBackStackState(str, -1, i), false);
        }
    }

    public boolean popBackStackImmediate(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c978be75", new Object[]{this, str, new Integer(i)})).booleanValue() : popBackStackImmediate(str, -1, i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new Parcelable.Creator<LaunchedFragmentInfo>() { // from class: androidx.fragment.app.FragmentManager.LaunchedFragmentInfo.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (LaunchedFragmentInfo) ipChange.ipc$dispatch("79b044b0", new Object[]{this, parcel}) : new LaunchedFragmentInfo(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public LaunchedFragmentInfo[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (LaunchedFragmentInfo[]) ipChange.ipc$dispatch("126a4419", new Object[]{this, new Integer(i)}) : new LaunchedFragmentInfo[i];
            }
        };
        int mRequestCode;
        String mWho;

        public LaunchedFragmentInfo(String str, int i) {
            this.mWho = str;
            this.mRequestCode = i;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mWho);
            parcel.writeInt(this.mRequestCode);
        }

        public LaunchedFragmentInfo(Parcel parcel) {
            this.mWho = parcel.readString();
            this.mRequestCode = parcel.readInt();
        }
    }

    public void detachFragment(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("552eeb02", new Object[]{this, fragment});
            return;
        }
        if (isLoggingEnabled(2)) {
            new StringBuilder("detach: ").append(fragment);
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (isLoggingEnabled(2)) {
                    new StringBuilder("remove from detach: ").append(fragment);
                }
                this.mFragmentStore.removeFragment(fragment);
                if (isMenuAvailable(fragment)) {
                    this.mNeedMenuInvalidate = true;
                }
                setVisibleRemovingFragment(fragment);
            }
        }
    }

    public void popBackStack(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b50f1b7", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            popBackStack(i, i2, false);
        }
    }

    public boolean popBackStackImmediate(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("813dd56c", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (i >= 0) {
            return popBackStackImmediate(null, i, i2);
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    public void removeFragment(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5896e673", new Object[]{this, fragment});
            return;
        }
        if (isLoggingEnabled(2)) {
            StringBuilder sb = new StringBuilder("remove: ");
            sb.append(fragment);
            sb.append(" nesting=");
            sb.append(fragment.mBackStackNesting);
        }
        boolean isInBackStack = fragment.isInBackStack();
        if (!fragment.mDetached || !isInBackStack) {
            this.mFragmentStore.removeFragment(fragment);
            if (isMenuAvailable(fragment)) {
                this.mNeedMenuInvalidate = true;
            }
            fragment.mRemoving = true;
            setVisibleRemovingFragment(fragment);
        }
    }

    public Bundle saveAllStateInternal() {
        BackStackRecordState[] backStackRecordStateArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("960e1ff5", new Object[]{this});
        }
        Bundle bundle = new Bundle();
        forcePostponedTransactions();
        endAnimatingAwayFragments();
        execPendingActions(true);
        this.mStateSaved = true;
        this.mNonConfig.setIsStateSaved(true);
        ArrayList<String> saveActiveFragments = this.mFragmentStore.saveActiveFragments();
        HashMap<String, Bundle> allSavedState = this.mFragmentStore.getAllSavedState();
        if (allSavedState.isEmpty()) {
            isLoggingEnabled(2);
        } else {
            ArrayList<String> saveAddedFragments = this.mFragmentStore.saveAddedFragments();
            int size = this.mBackStack.size();
            if (size > 0) {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i = 0; i < size; i++) {
                    backStackRecordStateArr[i] = new BackStackRecordState(this.mBackStack.get(i));
                    if (isLoggingEnabled(2)) {
                        StringBuilder sb = new StringBuilder("saveAllState: adding back stack #");
                        sb.append(i);
                        sb.append(": ");
                        sb.append(this.mBackStack.get(i));
                    }
                }
            } else {
                backStackRecordStateArr = null;
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.mActive = saveActiveFragments;
            fragmentManagerState.mAdded = saveAddedFragments;
            fragmentManagerState.mBackStack = backStackRecordStateArr;
            fragmentManagerState.mBackStackIndex = this.mBackStackIndex.get();
            Fragment fragment = this.mPrimaryNav;
            if (fragment != null) {
                fragmentManagerState.mPrimaryNavActiveWho = fragment.mWho;
            }
            fragmentManagerState.mBackStackStateKeys.addAll(this.mBackStackStates.keySet());
            fragmentManagerState.mBackStackStates.addAll(this.mBackStackStates.values());
            fragmentManagerState.mLaunchedFragments = new ArrayList<>(this.mLaunchedFragments);
            bundle.putParcelable("state", fragmentManagerState);
            for (String str : this.mResults.keySet()) {
                bundle.putBundle(RESULT_KEY_PREFIX + str, this.mResults.get(str));
            }
            for (String str2 : allSavedState.keySet()) {
                bundle.putBundle(FRAGMENT_KEY_PREFIX + str2, allSavedState.get(str2));
            }
        }
        return bundle;
    }

    public void popBackStack(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cecdf7fd", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
        } else if (i >= 0) {
            enqueueAction(new PopBackStackState(null, i, i2), z);
        } else {
            throw new IllegalArgumentException("Bad id: " + i);
        }
    }

    public void showFragment(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db32b76c", new Object[]{this, fragment});
            return;
        }
        if (isLoggingEnabled(2)) {
            new StringBuilder("show: ").append(fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        }
    }

    private boolean popBackStackImmediate(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("659f82b6", new Object[]{this, str, new Integer(i), new Integer(i2)})).booleanValue();
        }
        execPendingActions(false);
        ensureExecReady(true);
        Fragment fragment = this.mPrimaryNav;
        if (fragment != null && i < 0 && str == null && fragment.getChildFragmentManager().popBackStackImmediate()) {
            return true;
        }
        boolean popBackStackState = popBackStackState(this.mTmpRecords, this.mTmpIsPop, str, i, i2);
        if (popBackStackState) {
            this.mExecutingActions = true;
            try {
                removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
            } finally {
                cleanupExec();
            }
        }
        updateOnBackPressedCallbackEnabled();
        doPendingDeferredStart();
        this.mFragmentStore.burpActive();
        return popBackStackState;
    }

    public void restoreSaveStateInternal(Parcelable parcelable) {
        FragmentStateManager fragmentStateManager;
        Bundle bundle;
        Bundle bundle2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b261cc89", new Object[]{this, parcelable});
        } else if (parcelable != null) {
            Bundle bundle3 = (Bundle) parcelable;
            for (String str : bundle3.keySet()) {
                if (str.startsWith(RESULT_KEY_PREFIX) && (bundle2 = bundle3.getBundle(str)) != null) {
                    bundle2.setClassLoader(this.mHost.getContext().getClassLoader());
                    this.mResults.put(str.substring(7), bundle2);
                }
            }
            HashMap<String, Bundle> hashMap = new HashMap<>();
            for (String str2 : bundle3.keySet()) {
                if (str2.startsWith(FRAGMENT_KEY_PREFIX) && (bundle = bundle3.getBundle(str2)) != null) {
                    bundle.setClassLoader(this.mHost.getContext().getClassLoader());
                    hashMap.put(str2.substring(9), bundle);
                }
            }
            this.mFragmentStore.restoreSaveState(hashMap);
            FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable("state");
            if (fragmentManagerState != null) {
                this.mFragmentStore.resetActiveFragments();
                Iterator<String> it = fragmentManagerState.mActive.iterator();
                while (it.hasNext()) {
                    Bundle savedState = this.mFragmentStore.setSavedState(it.next(), null);
                    if (savedState != null) {
                        Fragment findRetainedFragmentByWho = this.mNonConfig.findRetainedFragmentByWho(((FragmentState) savedState.getParcelable("state")).mWho);
                        if (findRetainedFragmentByWho != null) {
                            if (isLoggingEnabled(2)) {
                                new StringBuilder("restoreSaveState: re-attaching retained ").append(findRetainedFragmentByWho);
                            }
                            fragmentStateManager = new FragmentStateManager(this.mLifecycleCallbacksDispatcher, this.mFragmentStore, findRetainedFragmentByWho, savedState);
                        } else {
                            fragmentStateManager = new FragmentStateManager(this.mLifecycleCallbacksDispatcher, this.mFragmentStore, this.mHost.getContext().getClassLoader(), getFragmentFactory(), savedState);
                        }
                        Fragment fragment = fragmentStateManager.getFragment();
                        fragment.mSavedFragmentState = savedState;
                        fragment.mFragmentManager = this;
                        if (isLoggingEnabled(2)) {
                            StringBuilder sb = new StringBuilder("restoreSaveState: active (");
                            sb.append(fragment.mWho);
                            sb.append("): ");
                            sb.append(fragment);
                        }
                        fragmentStateManager.restoreState(this.mHost.getContext().getClassLoader());
                        this.mFragmentStore.makeActive(fragmentStateManager);
                        fragmentStateManager.setFragmentManagerState(this.mCurState);
                    }
                }
                for (Fragment fragment2 : this.mNonConfig.getRetainedFragments()) {
                    if (!this.mFragmentStore.containsActiveFragment(fragment2.mWho)) {
                        if (isLoggingEnabled(2)) {
                            StringBuilder sb2 = new StringBuilder("Discarding retained Fragment ");
                            sb2.append(fragment2);
                            sb2.append(" that was not found in the set of active Fragments ");
                            sb2.append(fragmentManagerState.mActive);
                        }
                        this.mNonConfig.removeRetainedFragment(fragment2);
                        fragment2.mFragmentManager = this;
                        FragmentStateManager fragmentStateManager2 = new FragmentStateManager(this.mLifecycleCallbacksDispatcher, this.mFragmentStore, fragment2);
                        fragmentStateManager2.setFragmentManagerState(1);
                        fragmentStateManager2.moveToExpectedState();
                        fragment2.mRemoving = true;
                        fragmentStateManager2.moveToExpectedState();
                    }
                }
                this.mFragmentStore.restoreAddedFragments(fragmentManagerState.mAdded);
                if (fragmentManagerState.mBackStack != null) {
                    this.mBackStack = new ArrayList<>(fragmentManagerState.mBackStack.length);
                    int i = 0;
                    while (true) {
                        BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.mBackStack;
                        if (i >= backStackRecordStateArr.length) {
                            break;
                        }
                        BackStackRecord instantiate = backStackRecordStateArr[i].instantiate(this);
                        if (isLoggingEnabled(2)) {
                            StringBuilder sb3 = new StringBuilder("restoreAllState: back stack #");
                            sb3.append(i);
                            sb3.append(" (index ");
                            sb3.append(instantiate.mIndex);
                            sb3.append("): ");
                            sb3.append(instantiate);
                            PrintWriter printWriter = new PrintWriter(new LogWriter(TAG));
                            instantiate.dump("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.mBackStack.add(instantiate);
                        i++;
                    }
                } else {
                    this.mBackStack = new ArrayList<>();
                }
                this.mBackStackIndex.set(fragmentManagerState.mBackStackIndex);
                String str3 = fragmentManagerState.mPrimaryNavActiveWho;
                if (str3 != null) {
                    Fragment findActiveFragment = findActiveFragment(str3);
                    this.mPrimaryNav = findActiveFragment;
                    dispatchParentPrimaryNavigationFragmentChanged(findActiveFragment);
                }
                ArrayList<String> arrayList = fragmentManagerState.mBackStackStateKeys;
                if (arrayList != null) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        this.mBackStackStates.put(arrayList.get(i2), fragmentManagerState.mBackStackStates.get(i2));
                    }
                }
                this.mLaunchedFragments = new ArrayDeque<>(fragmentManagerState.mLaunchedFragments);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c0, code lost:
        if (r5 != 2) goto L_0x00c7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean saveBackStackState(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r17, java.util.ArrayList<java.lang.Boolean> r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.saveBackStackState(java.util.ArrayList, java.util.ArrayList, java.lang.String):boolean");
    }
}
