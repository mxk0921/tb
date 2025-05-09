package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class FragmentTransaction {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int OP_ADD = 1;
    public static final int OP_ATTACH = 7;
    public static final int OP_DETACH = 6;
    public static final int OP_HIDE = 4;
    public static final int OP_NULL = 0;
    public static final int OP_REMOVE = 3;
    public static final int OP_REPLACE = 2;
    public static final int OP_SET_MAX_LIFECYCLE = 10;
    public static final int OP_SET_PRIMARY_NAV = 8;
    public static final int OP_SHOW = 5;
    public static final int OP_UNSET_PRIMARY_NAV = 9;
    public static final int TRANSIT_ENTER_MASK = 4096;
    public static final int TRANSIT_EXIT_MASK = 8192;
    public static final int TRANSIT_FRAGMENT_CLOSE = 8194;
    public static final int TRANSIT_FRAGMENT_FADE = 4099;
    public static final int TRANSIT_FRAGMENT_MATCH_ACTIVITY_CLOSE = 8197;
    public static final int TRANSIT_FRAGMENT_MATCH_ACTIVITY_OPEN = 4100;
    public static final int TRANSIT_FRAGMENT_OPEN = 4097;
    public static final int TRANSIT_NONE = 0;
    public static final int TRANSIT_UNSET = -1;
    public boolean mAddToBackStack;
    public boolean mAllowAddToBackStack;
    public int mBreadCrumbShortTitleRes;
    public CharSequence mBreadCrumbShortTitleText;
    public int mBreadCrumbTitleRes;
    public CharSequence mBreadCrumbTitleText;
    private final ClassLoader mClassLoader;
    public ArrayList<Runnable> mCommitRunnables;
    public int mEnterAnim;
    public int mExitAnim;
    private final FragmentFactory mFragmentFactory;
    public String mName;
    public ArrayList<Op> mOps;
    public int mPopEnterAnim;
    public int mPopExitAnim;
    public boolean mReorderingAllowed;
    public ArrayList<String> mSharedElementSourceNames;
    public ArrayList<String> mSharedElementTargetNames;
    public int mTransition;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class Op {
        public int mCmd;
        public Lifecycle.State mCurrentMaxState;
        public int mEnterAnim;
        public int mExitAnim;
        public Fragment mFragment;
        public boolean mFromExpandedOp;
        public Lifecycle.State mOldMaxState;
        public int mPopEnterAnim;
        public int mPopExitAnim;

        public Op() {
        }

        public Op(int i, Fragment fragment) {
            this.mCmd = i;
            this.mFragment = fragment;
            this.mFromExpandedOp = false;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.mOldMaxState = state;
            this.mCurrentMaxState = state;
        }

        public Op(int i, Fragment fragment, boolean z) {
            this.mCmd = i;
            this.mFragment = fragment;
            this.mFromExpandedOp = z;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.mOldMaxState = state;
            this.mCurrentMaxState = state;
        }

        public Op(int i, Fragment fragment, Lifecycle.State state) {
            this.mCmd = i;
            this.mFragment = fragment;
            this.mFromExpandedOp = false;
            this.mOldMaxState = fragment.mMaxState;
            this.mCurrentMaxState = state;
        }

        public Op(Op op) {
            this.mCmd = op.mCmd;
            this.mFragment = op.mFragment;
            this.mFromExpandedOp = op.mFromExpandedOp;
            this.mEnterAnim = op.mEnterAnim;
            this.mExitAnim = op.mExitAnim;
            this.mPopEnterAnim = op.mPopEnterAnim;
            this.mPopExitAnim = op.mPopExitAnim;
            this.mOldMaxState = op.mOldMaxState;
            this.mCurrentMaxState = op.mCurrentMaxState;
        }
    }

    @Deprecated
    public FragmentTransaction() {
        this.mOps = new ArrayList<>();
        this.mAllowAddToBackStack = true;
        this.mReorderingAllowed = false;
        this.mFragmentFactory = null;
        this.mClassLoader = null;
    }

    private Fragment createFragment(Class<? extends Fragment> cls, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("76eda5e4", new Object[]{this, cls, bundle});
        }
        FragmentFactory fragmentFactory = this.mFragmentFactory;
        if (fragmentFactory != null) {
            ClassLoader classLoader = this.mClassLoader;
            if (classLoader != null) {
                Fragment instantiate = fragmentFactory.instantiate(classLoader, cls.getName());
                if (bundle != null) {
                    instantiate.setArguments(bundle);
                }
                return instantiate;
            }
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
    }

    public final FragmentTransaction add(Class<? extends Fragment> cls, Bundle bundle, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FragmentTransaction) ipChange.ipc$dispatch("3d6ef973", new Object[]{this, cls, bundle, str}) : add(createFragment(cls, bundle), str);
    }

    public void addOp(Op op) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8bba01a", new Object[]{this, op});
            return;
        }
        this.mOps.add(op);
        op.mEnterAnim = this.mEnterAnim;
        op.mExitAnim = this.mExitAnim;
        op.mPopEnterAnim = this.mPopEnterAnim;
        op.mPopExitAnim = this.mPopExitAnim;
    }

    public FragmentTransaction addSharedElement(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentTransaction) ipChange.ipc$dispatch("8bf241c9", new Object[]{this, view, str});
        }
        if (FragmentTransition.supportsTransition()) {
            String transitionName = ViewCompat.getTransitionName(view);
            if (transitionName != null) {
                if (this.mSharedElementSourceNames == null) {
                    this.mSharedElementSourceNames = new ArrayList<>();
                    this.mSharedElementTargetNames = new ArrayList<>();
                } else if (this.mSharedElementTargetNames.contains(str)) {
                    throw new IllegalArgumentException("A shared element with the target name '" + str + "' has already been added to the transaction.");
                } else if (this.mSharedElementSourceNames.contains(transitionName)) {
                    throw new IllegalArgumentException("A shared element with the source name '" + transitionName + "' has already been added to the transaction.");
                }
                this.mSharedElementSourceNames.add(transitionName);
                this.mSharedElementTargetNames.add(str);
            } else {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
        }
        return this;
    }

    public FragmentTransaction addToBackStack(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentTransaction) ipChange.ipc$dispatch("5c355920", new Object[]{this, str});
        }
        if (this.mAllowAddToBackStack) {
            this.mAddToBackStack = true;
            this.mName = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public FragmentTransaction attach(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentTransaction) ipChange.ipc$dispatch("2dde59ce", new Object[]{this, fragment});
        }
        addOp(new Op(7, fragment));
        return this;
    }

    public abstract int commit();

    public abstract int commitAllowingStateLoss();

    public abstract void commitNow();

    public abstract void commitNowAllowingStateLoss();

    public FragmentTransaction detach(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentTransaction) ipChange.ipc$dispatch("359ab29c", new Object[]{this, fragment});
        }
        addOp(new Op(6, fragment));
        return this;
    }

    public FragmentTransaction disallowAddToBackStack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentTransaction) ipChange.ipc$dispatch("6b133ff1", new Object[]{this});
        }
        if (!this.mAddToBackStack) {
            this.mAllowAddToBackStack = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public void doAddOp(int i, Fragment fragment, String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("280c6d3c", new Object[]{this, new Integer(i), fragment, str, new Integer(i2)});
            return;
        }
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            FragmentStrictMode.onFragmentReuse(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 == null || str.equals(str3)) {
                fragment.mTag = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
        }
        if (i != 0) {
            if (i != -1) {
                int i3 = fragment.mFragmentId;
                if (i3 == 0 || i3 == i) {
                    fragment.mFragmentId = i;
                    fragment.mContainerId = i;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        addOp(new Op(i2, fragment));
    }

    public FragmentTransaction hide(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentTransaction) ipChange.ipc$dispatch("9def620b", new Object[]{this, fragment});
        }
        addOp(new Op(4, fragment));
        return this;
    }

    public boolean isAddToBackStackAllowed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee35e0a4", new Object[]{this})).booleanValue();
        }
        return this.mAllowAddToBackStack;
    }

    public boolean isEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        }
        return this.mOps.isEmpty();
    }

    public FragmentTransaction remove(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentTransaction) ipChange.ipc$dispatch("88f091cd", new Object[]{this, fragment});
        }
        addOp(new Op(3, fragment));
        return this;
    }

    public final FragmentTransaction replace(int i, Class<? extends Fragment> cls, Bundle bundle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FragmentTransaction) ipChange.ipc$dispatch("eece1e69", new Object[]{this, new Integer(i), cls, bundle}) : replace(i, cls, bundle, null);
    }

    public FragmentTransaction runOnCommit(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentTransaction) ipChange.ipc$dispatch("60071030", new Object[]{this, runnable});
        }
        return runOnCommitInternal(false, runnable);
    }

    public FragmentTransaction runOnCommitInternal(boolean z, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentTransaction) ipChange.ipc$dispatch("3becceb7", new Object[]{this, new Boolean(z), runnable});
        }
        if (!z) {
            disallowAddToBackStack();
        }
        if (this.mCommitRunnables == null) {
            this.mCommitRunnables = new ArrayList<>();
        }
        this.mCommitRunnables.add(runnable);
        return this;
    }

    @Deprecated
    public FragmentTransaction setAllowOptimization(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentTransaction) ipChange.ipc$dispatch("8a032ee3", new Object[]{this, new Boolean(z)});
        }
        return setReorderingAllowed(z);
    }

    @Deprecated
    public FragmentTransaction setBreadCrumbShortTitle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentTransaction) ipChange.ipc$dispatch("ba2b54c5", new Object[]{this, new Integer(i)});
        }
        this.mBreadCrumbShortTitleRes = i;
        this.mBreadCrumbShortTitleText = null;
        return this;
    }

    @Deprecated
    public FragmentTransaction setBreadCrumbTitle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentTransaction) ipChange.ipc$dispatch("2f4c7a13", new Object[]{this, new Integer(i)});
        }
        this.mBreadCrumbTitleRes = i;
        this.mBreadCrumbTitleText = null;
        return this;
    }

    public FragmentTransaction setCustomAnimations(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FragmentTransaction) ipChange.ipc$dispatch("f080fc33", new Object[]{this, new Integer(i), new Integer(i2)}) : setCustomAnimations(i, i2, 0, 0);
    }

    public FragmentTransaction setMaxLifecycle(Fragment fragment, Lifecycle.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentTransaction) ipChange.ipc$dispatch("72c71754", new Object[]{this, fragment, state});
        }
        addOp(new Op(10, fragment, state));
        return this;
    }

    public FragmentTransaction setPrimaryNavigationFragment(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentTransaction) ipChange.ipc$dispatch("bfdc312d", new Object[]{this, fragment});
        }
        addOp(new Op(8, fragment));
        return this;
    }

    public FragmentTransaction setReorderingAllowed(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentTransaction) ipChange.ipc$dispatch("8ca13c38", new Object[]{this, new Boolean(z)});
        }
        this.mReorderingAllowed = z;
        return this;
    }

    public FragmentTransaction setTransition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentTransaction) ipChange.ipc$dispatch("3bcf25af", new Object[]{this, new Integer(i)});
        }
        this.mTransition = i;
        return this;
    }

    @Deprecated
    public FragmentTransaction setTransitionStyle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentTransaction) ipChange.ipc$dispatch("899c1e0c", new Object[]{this, new Integer(i)});
        }
        return this;
    }

    public FragmentTransaction show(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentTransaction) ipChange.ipc$dispatch("c96ae486", new Object[]{this, fragment});
        }
        addOp(new Op(5, fragment));
        return this;
    }

    public FragmentTransaction add(Fragment fragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentTransaction) ipChange.ipc$dispatch("bca8d874", new Object[]{this, fragment, str});
        }
        doAddOp(0, fragment, str, 1);
        return this;
    }

    public FragmentTransaction replace(int i, Fragment fragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FragmentTransaction) ipChange.ipc$dispatch("a70eabaa", new Object[]{this, new Integer(i), fragment}) : replace(i, fragment, (String) null);
    }

    public FragmentTransaction setCustomAnimations(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentTransaction) ipChange.ipc$dispatch("5dc6de53", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        this.mEnterAnim = i;
        this.mExitAnim = i2;
        this.mPopEnterAnim = i3;
        this.mPopExitAnim = i4;
        return this;
    }

    public final FragmentTransaction add(int i, Class<? extends Fragment> cls, Bundle bundle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FragmentTransaction) ipChange.ipc$dispatch("dc93975c", new Object[]{this, new Integer(i), cls, bundle}) : add(i, createFragment(cls, bundle));
    }

    public final FragmentTransaction replace(int i, Class<? extends Fragment> cls, Bundle bundle, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FragmentTransaction) ipChange.ipc$dispatch("951791f3", new Object[]{this, new Integer(i), cls, bundle, str}) : replace(i, createFragment(cls, bundle), str);
    }

    @Deprecated
    public FragmentTransaction setBreadCrumbShortTitle(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentTransaction) ipChange.ipc$dispatch("768e5e36", new Object[]{this, charSequence});
        }
        this.mBreadCrumbShortTitleRes = 0;
        this.mBreadCrumbShortTitleText = charSequence;
        return this;
    }

    @Deprecated
    public FragmentTransaction setBreadCrumbTitle(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentTransaction) ipChange.ipc$dispatch("ce6d2128", new Object[]{this, charSequence});
        }
        this.mBreadCrumbTitleRes = 0;
        this.mBreadCrumbTitleText = charSequence;
        return this;
    }

    public FragmentTransaction add(int i, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentTransaction) ipChange.ipc$dispatch("ef84961d", new Object[]{this, new Integer(i), fragment});
        }
        doAddOp(i, fragment, null, 1);
        return this;
    }

    public FragmentTransaction replace(int i, Fragment fragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentTransaction) ipChange.ipc$dispatch("cd71b0f4", new Object[]{this, new Integer(i), fragment, str});
        }
        if (i != 0) {
            doAddOp(i, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public final FragmentTransaction add(int i, Class<? extends Fragment> cls, Bundle bundle, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FragmentTransaction) ipChange.ipc$dispatch("9229d426", new Object[]{this, new Integer(i), cls, bundle, str}) : add(i, createFragment(cls, bundle), str);
    }

    public FragmentTransaction add(int i, Fragment fragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentTransaction) ipChange.ipc$dispatch("e38b04a7", new Object[]{this, new Integer(i), fragment, str});
        }
        doAddOp(i, fragment, str, 1);
        return this;
    }

    public FragmentTransaction(FragmentFactory fragmentFactory, ClassLoader classLoader) {
        this.mOps = new ArrayList<>();
        this.mAllowAddToBackStack = true;
        this.mReorderingAllowed = false;
        this.mFragmentFactory = fragmentFactory;
        this.mClassLoader = classLoader;
    }

    public final FragmentTransaction add(ViewGroup viewGroup, Fragment fragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentTransaction) ipChange.ipc$dispatch("7a55d033", new Object[]{this, viewGroup, fragment, str});
        }
        fragment.mContainer = viewGroup;
        fragment.mInDynamicContainer = true;
        return add(viewGroup.getId(), fragment, str);
    }

    public FragmentTransaction(FragmentFactory fragmentFactory, ClassLoader classLoader, FragmentTransaction fragmentTransaction) {
        this(fragmentFactory, classLoader);
        Iterator<Op> it = fragmentTransaction.mOps.iterator();
        while (it.hasNext()) {
            this.mOps.add(new Op(it.next()));
        }
        this.mEnterAnim = fragmentTransaction.mEnterAnim;
        this.mExitAnim = fragmentTransaction.mExitAnim;
        this.mPopEnterAnim = fragmentTransaction.mPopEnterAnim;
        this.mPopExitAnim = fragmentTransaction.mPopExitAnim;
        this.mTransition = fragmentTransaction.mTransition;
        this.mAddToBackStack = fragmentTransaction.mAddToBackStack;
        this.mAllowAddToBackStack = fragmentTransaction.mAllowAddToBackStack;
        this.mName = fragmentTransaction.mName;
        this.mBreadCrumbShortTitleRes = fragmentTransaction.mBreadCrumbShortTitleRes;
        this.mBreadCrumbShortTitleText = fragmentTransaction.mBreadCrumbShortTitleText;
        this.mBreadCrumbTitleRes = fragmentTransaction.mBreadCrumbTitleRes;
        this.mBreadCrumbTitleText = fragmentTransaction.mBreadCrumbTitleText;
        if (fragmentTransaction.mSharedElementSourceNames != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            this.mSharedElementSourceNames = arrayList;
            arrayList.addAll(fragmentTransaction.mSharedElementSourceNames);
        }
        if (fragmentTransaction.mSharedElementTargetNames != null) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            this.mSharedElementTargetNames = arrayList2;
            arrayList2.addAll(fragmentTransaction.mSharedElementTargetNames);
        }
        this.mReorderingAllowed = fragmentTransaction.mReorderingAllowed;
    }
}
