package tb;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.animation.shareelement.AbsContainerTransition;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.hpj;
import tb.qol;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class anl implements hpj.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SHARE_TRANSITION_STATE_COMPLETED = 2;
    public static final int SHARE_TRANSITION_STATE_EXECUTING = 1;
    public static final int SHARE_TRANSITION_STATE_INIT = 0;
    public static final int STATE_CREATE = 0;
    public static final int STATE_DESTROY = 5;
    private static final int STATE_INIT = -1;
    public static final int STATE_PAUSE = 3;
    public static final int STATE_RESUME = 2;
    public static final int STATE_START = 1;
    public static final int STATE_STOP = 4;
    private Transition enterTransition;
    public boolean enterTransitionExecuted;
    private Transition exitTransition;
    private qol pageTransition;
    private List<Runnable> pendingTasks;
    private Transition sharedElementEnterTransition;
    private Transition sharedElementReturnTransition;
    private List<Pair<View, String>> sharedViews;
    public reu transition;
    public String url;
    private int pageState = -1;
    public volatile int shareElementTransitionExecuteState = 0;
    private volatile int pendingTaskCount = 0;
    private Object lock = new Object();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                anl.this.getActivity().startPostponedEnterTransition();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ qol.a f15884a;

        public b(anl anlVar, qol.a aVar) {
            this.f15884a = aVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                return;
            }
            qol.a aVar = this.f15884a;
            if (aVar != null) {
                aVar.a();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            qol.a aVar = this.f15884a;
            if (aVar != null) {
                aVar.a();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static abstract class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private anl f15885a;
        private boolean b;

        static {
            t2o.a(503316950);
        }

        public c(Object obj, boolean z) {
            if (obj instanceof anl) {
                this.f15885a = (anl) obj;
            }
            this.b = z;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b628010", new Object[]{this});
                return;
            }
            anl anlVar = this.f15885a;
            if (anlVar != null) {
                synchronized (anl.access$000(anlVar)) {
                    anl.access$110(this.f15885a);
                }
            }
        }

        public void b() {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1ad7b1c", new Object[]{this});
                return;
            }
            anl anlVar = this.f15885a;
            if (anlVar == null || this.b) {
                run();
                return;
            }
            synchronized (anl.access$000(anlVar)) {
                try {
                    if (anl.access$100(this.f15885a) > 0) {
                        anl.access$108(this.f15885a);
                        this.f15885a.getTNodeEngine().Q().post(this);
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z) {
                run();
            }
        }
    }

    static {
        t2o.a(503316947);
        t2o.a(503317416);
    }

    public static /* synthetic */ Object access$000(anl anlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7d19e19f", new Object[]{anlVar});
        }
        return anlVar.lock;
    }

    public static /* synthetic */ int access$100(anl anlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8f98967", new Object[]{anlVar})).intValue();
        }
        return anlVar.pendingTaskCount;
    }

    public static /* synthetic */ int access$108(anl anlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8705676f", new Object[]{anlVar})).intValue();
        }
        int i = anlVar.pendingTaskCount;
        anlVar.pendingTaskCount = 1 + i;
        return i;
    }

    public static /* synthetic */ int access$110(anl anlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("456785c6", new Object[]{anlVar})).intValue();
        }
        int i = anlVar.pendingTaskCount;
        anlVar.pendingTaskCount = i - 1;
        return i;
    }

    private void executePendingTasks() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcb0aad3", new Object[]{this});
            return;
        }
        List<Runnable> list = this.pendingTasks;
        if (list != null) {
            for (Runnable runnable : list) {
                runnable.run();
            }
            this.pendingTasks.clear();
        }
    }

    public static anl findPageOfView(View view) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (anl) ipChange.ipc$dispatch("57374bab", new Object[]{view});
        }
        if (view != null) {
            View view2 = null;
            while (true) {
                int id = view.getId();
                i = R.id.layout_manager_multi_page_container;
                if (id == i) {
                    break;
                }
                ViewParent parent = view.getParent();
                if (!(parent instanceof ViewGroup)) {
                    view2 = view;
                    break;
                }
                View view3 = (View) parent;
                view2 = view;
                view = view3;
            }
            if (view.getId() == i && view2 != null && (view instanceof ViewGroup)) {
                return ((sll) view.getTag()).z(((ViewGroup) view).indexOfChild(view2));
            }
        }
        return null;
    }

    public final boolean canMoveToState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2df6bcab", new Object[]{this, new Integer(i)})).booleanValue();
        }
        tfs.g("PageInterface", "currentState:" + this.pageState + "  newState:" + i);
        if (i != 0) {
            if (i == 1) {
                int i2 = this.pageState;
                if (i2 == 0 || i2 == 4) {
                    return true;
                }
                return false;
            } else if (i == 2) {
                int i3 = this.pageState;
                if (i3 == 1 || i3 == 3) {
                    return true;
                }
                return false;
            } else if (i != 3) {
                if (i == 4) {
                    int i4 = this.pageState;
                    if (i4 == 3 || i4 == 1) {
                        return true;
                    }
                    return false;
                } else if (i == 5 && this.pageState == 4) {
                    return true;
                } else {
                    return false;
                }
            } else if (this.pageState == 2) {
                return true;
            } else {
                return false;
            }
        } else if (this.pageState == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkAndAddPendingTask(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6791d573", new Object[]{this, runnable})).booleanValue();
        }
        if (!isTransitionCompleted() && akt.B()) {
            if (this.pendingTasks == null) {
                this.pendingTasks = new ArrayList();
            }
            synchronized (this.lock) {
                try {
                    if (isExecutingEnterTransition()) {
                        this.pendingTaskCount++;
                        this.pendingTasks.add(runnable);
                        return true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return false;
    }

    public boolean enablePullScale() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e37df4d", new Object[]{this})).booleanValue();
        }
        reu reuVar = this.transition;
        if (reuVar == null || !reuVar.h(getActivity())) {
            return false;
        }
        return true;
    }

    public abstract void finish(boolean z);

    public abstract Activity getActivity();

    public abstract View getContentView();

    public List<Pair<View, String>> getCurrentSharedViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3696f15a", new Object[]{this});
        }
        return this.sharedViews;
    }

    public abstract View getDecorView();

    public Transition getEnterTransition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Transition) ipChange.ipc$dispatch("75737160", new Object[]{this});
        }
        return this.enterTransition;
    }

    public Transition getExitTransition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Transition) ipChange.ipc$dispatch("fb4a82d2", new Object[]{this});
        }
        return this.exitTransition;
    }

    public abstract sll getPageContainer();

    public qol getPageTransition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qol) ipChange.ipc$dispatch("3e8eb417", new Object[]{this});
        }
        return this.pageTransition;
    }

    public Transition getSharedElementEnterTransition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Transition) ipChange.ipc$dispatch("fcd720f5", new Object[]{this});
        }
        return this.sharedElementEnterTransition;
    }

    public Transition getSharedElementReturnTransition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Transition) ipChange.ipc$dispatch("f00cf16f", new Object[]{this});
        }
        return this.sharedElementReturnTransition;
    }

    public o getTNodeEngine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o) ipChange.ipc$dispatch("d9d8faa9", new Object[]{this});
        }
        return null;
    }

    public reu getTransitionInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (reu) ipChange.ipc$dispatch("8251ec37", new Object[]{this});
        }
        return this.transition;
    }

    public abstract Object getUTObject();

    public String getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.url;
    }

    public void hideActionBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee6efde2", new Object[]{this});
        }
    }

    public boolean isEnterTransitionExecuted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3778f7fd", new Object[]{this})).booleanValue();
        }
        return this.enterTransitionExecuted;
    }

    public boolean isExecutingEnterTransition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("caf57a50", new Object[]{this})).booleanValue();
        }
        if (this.shareElementTransitionExecuteState == 1) {
            return true;
        }
        return false;
    }

    public abstract boolean isFinishing();

    public boolean isFullPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2c98193", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean isRootPage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f75b7236", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (z) {
            return getPageContainer().y().isEmpty();
        }
        if (getPageContainer().y().isEmpty() || getPageContainer().y().get(0) != this) {
            return false;
        }
        return true;
    }

    public boolean isSuitableForFragmentTransition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23a69dc8", new Object[]{this})).booleanValue();
        }
        if (!getPageContainer().u() && getPageContainer().y().indexOf(this) <= 0) {
            return false;
        }
        return true;
    }

    public boolean isTransitionCompleted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d3ccd77", new Object[]{this})).booleanValue();
        }
        if (this.shareElementTransitionExecuteState == 2) {
            return true;
        }
        return false;
    }

    public abstract void onBackButtonClick();

    public abstract boolean onBackPressed(boolean z);

    public void onBeforeStartTransition(qol qolVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42bd77ae", new Object[]{this, qolVar, new Boolean(z)});
        }
    }

    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
        } else {
            this.pageState = 0;
        }
    }

    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.pageState = 5;
        }
    }

    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            this.pageState = 3;
        }
    }

    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            this.pageState = 2;
        }
    }

    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else {
            this.pageState = 1;
        }
    }

    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            this.pageState = 4;
        }
    }

    public abstract void onWindowFocusChanged(boolean z);

    public abstract void postponedEnterTransition();

    public void setCurrentSharedViews(List<Pair<View, String>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e83544a", new Object[]{this, list});
        } else {
            this.sharedViews = list;
        }
    }

    public void setEnterTransition(Transition transition) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfb23200", new Object[]{this, transition});
            return;
        }
        this.enterTransition = transition;
        if (!getPageContainer().u() && getPageContainer().y().isEmpty()) {
            getActivity().getWindow().setEnterTransition(transition);
        }
    }

    public void setExecutingEnterTransition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5624a584", new Object[]{this});
        } else {
            this.shareElementTransitionExecuteState = 1;
        }
    }

    public void setExitTransition(Transition transition) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c243936", new Object[]{this, transition});
            return;
        }
        this.exitTransition = transition;
        if (!getPageContainer().u() && getPageContainer().y().isEmpty()) {
            getActivity().getWindow().setReturnTransition(transition);
        }
    }

    public abstract void setIsFinishing();

    public abstract void setNavigationBarColor(int i);

    public void setPageTransition(qol qolVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad3347b9", new Object[]{this, qolVar});
        } else {
            this.pageTransition = qolVar;
        }
    }

    public void setSharedElementEnterTransition(Transition transition) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("803e8473", new Object[]{this, transition});
            return;
        }
        Transition transition2 = this.sharedElementEnterTransition;
        if (transition2 == null) {
            this.sharedElementEnterTransition = transition;
        } else if (transition2 instanceof TransitionSet) {
            ((TransitionSet) transition2).addTransition(transition);
        } else {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.addTransition(this.sharedElementEnterTransition);
            transitionSet.addTransition(transition);
            this.sharedElementEnterTransition = transitionSet;
        }
        if (transition instanceof AbsContainerTransition) {
            ((AbsContainerTransition) transition).setPageInterface(this);
        }
        if (!getPageContainer().u() && getPageContainer().y().isEmpty()) {
            getActivity().getWindow().setSharedElementEnterTransition(this.sharedElementEnterTransition);
        }
    }

    public void setSharedElementReturnTransition(Transition transition) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("469a2ed1", new Object[]{this, transition});
            return;
        }
        Transition transition2 = this.sharedElementReturnTransition;
        if (transition2 == null) {
            this.sharedElementReturnTransition = transition;
        } else if (transition2 instanceof TransitionSet) {
            ((TransitionSet) transition2).addTransition(transition);
        } else {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.addTransition(this.sharedElementReturnTransition);
            transitionSet.addTransition(transition);
            this.sharedElementReturnTransition = transitionSet;
        }
        if (transition instanceof AbsContainerTransition) {
            ((AbsContainerTransition) transition).setPageInterface(this);
        }
        if (!getPageContainer().u() && getPageContainer().y().isEmpty()) {
            getActivity().getWindow().setSharedElementReturnTransition(this.sharedElementReturnTransition);
        }
    }

    public abstract void setStatusBarColor(int i);

    public abstract void setTitle(String str);

    public void setTransitionCompleted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1d7f3b", new Object[]{this});
            return;
        }
        synchronized (this.lock) {
            executePendingTasks();
            this.shareElementTransitionExecuteState = 2;
        }
    }

    public void showActionBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("422f6807", new Object[]{this});
        }
    }

    public void startNormalTransition(reu reuVar) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b911e22", new Object[]{this, reuVar});
        } else if (!this.enterTransitionExecuted && reuVar != null) {
            this.enterTransitionExecuted = true;
            if (getPageContainer().u() || !isRootPage(true)) {
                z = false;
            } else {
                z = true;
            }
            if (!z || (getActivity() instanceof cfu)) {
                String[] strArr = reuVar.f27323a;
                ArrayList arrayList = new ArrayList();
                for (String str : strArr) {
                    Animator c2 = reu.c(getDecorView(), str, reuVar.d, reuVar.c, reuVar.f, false);
                    if (c2 != null) {
                        arrayList.add(c2);
                    }
                }
                if (arrayList.size() == 1) {
                    ((Animator) arrayList.get(0)).start();
                } else {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(arrayList);
                    animatorSet.setDuration(reuVar.d);
                    animatorSet.setInterpolator(reuVar.c);
                    animatorSet.start();
                }
            } else {
                reu.o(getActivity(), reuVar, false);
            }
            if (z) {
                nwv.y0(new a());
            }
        }
    }

    public abstract void startPostponedEnterTransition(View view);

    public boolean startExitTransition(qol.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fe7593d", new Object[]{this, aVar})).booleanValue();
        }
        reu reuVar = this.transition;
        if (reuVar != null) {
            if (reuVar.l("share")) {
                return false;
            }
            if (getPageContainer().u() || !isRootPage(true) || (getActivity() instanceof cfu)) {
                String[] strArr = this.transition.b;
                ArrayList arrayList = new ArrayList();
                for (String str : strArr) {
                    View decorView = getDecorView();
                    reu reuVar2 = this.transition;
                    Animator c2 = reu.c(decorView, str, reuVar2.d, reuVar2.c, reuVar2.f, true);
                    if (c2 != null) {
                        arrayList.add(c2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    b bVar = new b(this, aVar);
                    if (arrayList.size() == 1) {
                        ((Animator) arrayList.get(0)).addListener(bVar);
                        ((Animator) arrayList.get(0)).start();
                    } else {
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(arrayList);
                        animatorSet.setDuration(this.transition.d);
                        animatorSet.setInterpolator(this.transition.c);
                        animatorSet.addListener(bVar);
                        animatorSet.start();
                    }
                } else if (aVar != null) {
                    aVar.a();
                }
            } else {
                if (aVar != null) {
                    aVar.a();
                }
                reu.o(getActivity(), this.transition, true);
            }
        } else if (aVar != null) {
            aVar.a();
        }
        return true;
    }
}
