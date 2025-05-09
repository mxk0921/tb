package com.taobao.tao.tbmainfragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.TBMainActivity;
import com.taobao.tao.log.TLog;
import com.taobao.tao.tbmainfragment.anim.FragmentAnimator;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.pxq;
import tb.qxq;
import tb.sdu;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SupportFragment extends Fragment implements ISupportFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "SupportFragment";
    private static final CopyOnWriteArrayList<TBFragmentLifecycleCallbacks> sLifecycleCallbacks = new CopyOnWriteArrayList<>();
    private boolean isLoaded;
    public SupportActivity mActivity;
    private boolean mViewChangeWhenVisibleChange;
    public final pxq mDelegate = new pxq(this);
    private boolean hasEnterAnimation = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
            } else {
                SupportFragment.access$000(SupportFragment.this);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            }
        }
    }

    static {
        t2o.a(775946373);
        t2o.a(775946366);
    }

    public static /* synthetic */ void access$000(SupportFragment supportFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("461bfb43", new Object[]{supportFragment});
        } else {
            supportFragment.onEnterAnimationEnd();
        }
    }

    public static /* synthetic */ Object ipc$super(SupportFragment supportFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2147180915:
                super.onSaveInstanceState((Bundle) objArr[0]);
                return null;
            case -1589549411:
                super.onAttach((Context) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1126882532:
                return super.onCreateView((LayoutInflater) objArr[0], (ViewGroup) objArr[1], (Bundle) objArr[2]);
            case -1010986463:
                super.setUserVisibleHint(((Boolean) objArr[0]).booleanValue());
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 434397186:
                super.onHiddenChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            case 462397159:
                super.onDestroyView();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1002290867:
                super.onActivityCreated((Bundle) objArr[0]);
                return null;
            case 2127624665:
                super.onDetach();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/tbmainfragment/SupportFragment");
        }
    }

    private void onEnterAnimationEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("280cf617", new Object[]{this});
            return;
        }
        realResume();
        this.hasEnterAnimation = false;
    }

    private void realResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("becbb672", new Object[]{this});
        } else if (!this.isLoaded && !isHidden()) {
            lazyInit();
            this.isLoaded = true;
        }
    }

    public static void registerTBLifecycleCallbacks(TBFragmentLifecycleCallbacks tBFragmentLifecycleCallbacks) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73b09191", new Object[]{tBFragmentLifecycleCallbacks});
        } else {
            sLifecycleCallbacks.add(tBFragmentLifecycleCallbacks);
        }
    }

    public static void unRegisterTBLifecycleCallbacks(TBFragmentLifecycleCallbacks tBFragmentLifecycleCallbacks) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3157fcca", new Object[]{tBFragmentLifecycleCallbacks});
        } else {
            sLifecycleCallbacks.remove(tBFragmentLifecycleCallbacks);
        }
    }

    @Override // com.taobao.tao.tbmainfragment.ISupportFragment
    public Fragment asFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("685578c5", new Object[]{this});
        }
        return this;
    }

    public FragmentAnimator getFragmentAnimator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentAnimator) ipChange.ipc$dispatch("ce8bca08", new Object[]{this});
        }
        return this.mDelegate.d();
    }

    @Override // com.taobao.tao.tbmainfragment.ISupportFragment
    public pxq getSupportDelegate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pxq) ipChange.ipc$dispatch("c4c63f8a", new Object[]{this});
        }
        return this.mDelegate;
    }

    @Override // com.taobao.tao.tbmainfragment.ISupportFragment
    public final boolean isSupportVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acaff78", new Object[]{this})).booleanValue();
        }
        return this.mDelegate.h();
    }

    public boolean isViewChangeWhenVisiableChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9db6f8f7", new Object[]{this})).booleanValue();
        }
        return this.mViewChangeWhenVisibleChange;
    }

    public void lazyInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cba252b", new Object[]{this});
        } else {
            "lazyInit: ".concat(getClass().getSimpleName());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbdbeb3", new Object[]{this, bundle});
            return;
        }
        super.onActivityCreated(bundle);
        this.mDelegate.i(bundle);
        Iterator<TBFragmentLifecycleCallbacks> it = sLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onFragmentActivityCreated(getFragmentManager(), this, bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a141669d", new Object[]{this, context});
            return;
        }
        super.onAttach(context);
        this.mDelegate.j(context);
        if (context instanceof SupportActivity) {
            this.mActivity = (SupportActivity) context;
        }
        Iterator<TBFragmentLifecycleCallbacks> it = sLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onFragmentAttached(getFragmentManager(), this, context);
        }
    }

    public boolean onBackPressedSupport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6048655e", new Object[]{this})).booleanValue();
        }
        return this.mDelegate.k();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        if ((this.mActivity instanceof TBMainActivity) && bundle != null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        super.onCreate(bundle);
        this.mDelegate.l(bundle);
        Iterator<TBFragmentLifecycleCallbacks> it = sLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onFragmentCreated(getFragmentManager(), this, bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("40dfa474", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2)});
        }
        Animation onSupportCreateAnimation = onSupportCreateAnimation(i, z, i2);
        if (onSupportCreateAnimation == null) {
            onSupportCreateAnimation = this.mDelegate.m(i, z, i2);
        }
        if (z) {
            if (onSupportCreateAnimation == null) {
                z2 = false;
            }
            this.hasEnterAnimation = z2;
        }
        if (z && onSupportCreateAnimation != null) {
            onSupportCreateAnimation.setAnimationListener(new a());
        }
        return onSupportCreateAnimation;
    }

    public FragmentAnimator onCreateFragmentAnimator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentAnimator) ipChange.ipc$dispatch("c5eed56d", new Object[]{this});
        }
        return this.mDelegate.n();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.mDelegate.o(layoutInflater, viewGroup, bundle);
        Iterator<TBFragmentLifecycleCallbacks> it = sLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onFragmentViewCreated(getFragmentManager(), this, onCreateView, bundle);
        }
        return onCreateView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.mDelegate.p();
        super.onDestroy();
        Iterator<TBFragmentLifecycleCallbacks> it = sLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onFragmentDestroyed(getFragmentManager(), this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            return;
        }
        this.mDelegate.q();
        super.onDestroyView();
        Iterator<TBFragmentLifecycleCallbacks> it = sLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onFragmentViewDestroyed(getFragmentManager(), this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
            return;
        }
        this.mDelegate.r();
        super.onDetach();
        Iterator<TBFragmentLifecycleCallbacks> it = sLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onFragmentDetached(getFragmentManager(), this);
        }
    }

    public void onFragmentResult(int i, int i2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51c27981", new Object[]{this, new Integer(i), new Integer(i2), bundle});
        } else {
            this.mDelegate.s(i, i2, bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19e46002", new Object[]{this, new Boolean(z)});
            return;
        }
        super.onHiddenChanged(z);
        this.mDelegate.t(z);
    }

    @Override // com.taobao.tao.tbmainfragment.ISupportFragment
    public void onNewBundle(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1ef4a6a", new Object[]{this, bundle});
        } else {
            this.mDelegate.u(bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        this.mDelegate.v();
        Iterator<TBFragmentLifecycleCallbacks> it = sLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onFragmentPaused(getFragmentManager(), this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        this.mDelegate.w();
        Iterator<TBFragmentLifecycleCallbacks> it = sLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onFragmentResumed(getFragmentManager(), this);
        }
        if (!this.hasEnterAnimation) {
            realResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
            return;
        }
        super.onSaveInstanceState(bundle);
        this.mDelegate.x(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        this.mDelegate.y();
        Iterator<TBFragmentLifecycleCallbacks> it = sLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onFragmentStarted(getFragmentManager(), this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        this.mDelegate.z();
        Iterator<TBFragmentLifecycleCallbacks> it = sLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onFragmentStopped(getFragmentManager(), this);
        }
    }

    public Animation onSupportCreateAnimation(int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("809d5243", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2)});
        }
        return null;
    }

    public void onSupportInvisible() {
        ViewGroup b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a40c5aa4", new Object[]{this});
            return;
        }
        TLog.loge(TAG, getClass().getSimpleName().concat(" onSupportInvisible"));
        if (!(!this.mViewChangeWhenVisibleChange || getArguments() == null || (b = qxq.b(this.mActivity, this, getArguments().getInt(sdu.FRAGMENTATION_ARG_CONTAINER))) == null)) {
            b.removeView(getView());
        }
        this.mDelegate.A();
    }

    public void onSupportPreInVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99f550c1", new Object[]{this});
        } else {
            TLog.loge(TAG, getClass().getSimpleName().concat(" onSupportPreVisible"));
        }
    }

    public void onSupportVisible() {
        View view;
        ViewGroup b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74421ce9", new Object[]{this});
            return;
        }
        TLog.loge(TAG, getClass().getSimpleName().concat(" onSupportVisible"));
        if (!(!this.mViewChangeWhenVisibleChange || (view = getView()) == null || view.getParent() != null || getArguments() == null || (b = qxq.b(this.mActivity, this, getArguments().getInt(sdu.FRAGMENTATION_ARG_CONTAINER))) == null)) {
            b.addView(getView());
        }
        this.mDelegate.B();
    }

    public void putNewBundle(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12902f9a", new Object[]{this, bundle});
        } else {
            this.mDelegate.C(bundle);
        }
    }

    public void setFragmentAnimator(FragmentAnimator fragmentAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88a7c6a4", new Object[]{this, fragmentAnimator});
        } else {
            this.mDelegate.D(fragmentAnimator);
        }
    }

    public void setFragmentResult(int i, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("570d6287", new Object[]{this, new Integer(i), bundle});
        } else {
            this.mDelegate.E(i, bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3bd9221", new Object[]{this, new Boolean(z)});
            return;
        }
        super.setUserVisibleHint(z);
        this.mDelegate.F(z);
    }

    public void setViewChangeWhenVisiableChange(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f34bf009", new Object[]{this, new Boolean(z)});
        } else {
            this.mViewChangeWhenVisibleChange = z;
        }
    }
}
