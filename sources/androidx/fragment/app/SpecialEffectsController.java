package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.BackEventCompat;
import androidx.fragment.app.SpecialEffectsController;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import tb.a07;
import tb.ckf;
import tb.d04;
import tb.i04;
import tb.kwt;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0013\b \u0018\u0000 J2\u00020\u0001:\u0004JKLMB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\"\u0010 \u001a\u00020\u00122\u0011\u0010\u001f\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u001e0\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\"\u0010#J\u001d\u0010$\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b(\u0010'J\u0015\u0010)\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b)\u0010'J\u0015\u0010+\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u0017¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u0012¢\u0006\u0004\b-\u0010\u001cJ\r\u0010.\u001a\u00020\u0017¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u0012¢\u0006\u0004\b0\u0010\u001cJ\r\u00101\u001a\u00020\u0012¢\u0006\u0004\b1\u0010\u001cJ\u0017\u00105\u001a\u00020\u00122\u0006\u00102\u001a\u00020\bH\u0000¢\u0006\u0004\b3\u00104J\r\u00106\u001a\u00020\u0012¢\u0006\u0004\b6\u0010\u001cJ*\u00107\u001a\u00020\u00122\u0011\u0010\u001f\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u001e0\u001d2\u0006\u0010*\u001a\u00020\u0017H&¢\u0006\u0004\b7\u00108J\"\u0010:\u001a\u00020\u00122\u0011\u0010\u001f\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u001e0\u001dH\u0010¢\u0006\u0004\b9\u0010!J\u0015\u0010=\u001a\u00020\u00122\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\u0012¢\u0006\u0004\b?\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\b0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\b0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010DR\u0016\u0010F\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010GR\u0016\u0010I\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010G¨\u0006N"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController;", "", "Landroid/view/ViewGroup;", "container", "<init>", "(Landroid/view/ViewGroup;)V", "Landroidx/fragment/app/Fragment;", "fragment", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "findPendingOperation", "(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/SpecialEffectsController$Operation;", "findRunningOperation", "Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "finalState", "Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "lifecycleImpact", "Landroidx/fragment/app/FragmentStateManager;", "fragmentStateManager", "Ltb/xhv;", "enqueue", "(Landroidx/fragment/app/SpecialEffectsController$Operation$State;Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;Landroidx/fragment/app/FragmentStateManager;)V", "", "newPendingOperations", "", "isOperationTransitioning", "(Ljava/util/List;)Z", "isOperationSeekable", "updateFinalState", "()V", "", "Lkotlin/jvm/JvmSuppressWildcards;", "operations", "processStart", "(Ljava/util/List;)V", "getAwaitingCompletionLifecycleImpact", "(Landroidx/fragment/app/FragmentStateManager;)Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "enqueueAdd", "(Landroidx/fragment/app/SpecialEffectsController$Operation$State;Landroidx/fragment/app/FragmentStateManager;)V", "enqueueShow", "(Landroidx/fragment/app/FragmentStateManager;)V", "enqueueHide", "enqueueRemove", "isPop", "updateOperationDirection", "(Z)V", "markPostponedState", "isPendingExecute", "()Z", "forcePostponedExecutePendingOperations", "executePendingOperations", "operation", "applyContainerChangesToOperation$fragment_release", "(Landroidx/fragment/app/SpecialEffectsController$Operation;)V", "applyContainerChangesToOperation", "forceCompleteAllOperations", "collectEffects", "(Ljava/util/List;Z)V", "commitEffects$fragment_release", "commitEffects", "Landroidx/activity/BackEventCompat;", "backEvent", "processProgress", "(Landroidx/activity/BackEventCompat;)V", "completeBack", "Landroid/view/ViewGroup;", "getContainer", "()Landroid/view/ViewGroup;", "pendingOperations", "Ljava/util/List;", "runningOperations", "runningNonSeekableTransition", "Z", "operationDirectionIsPop", "isContainerPostponed", "Companion", "Effect", "FragmentStateManagerOperation", "Operation", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class SpecialEffectsController {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Companion Companion = new Companion(null);
    private final ViewGroup container;
    private boolean isContainerPostponed;
    private boolean operationDirectionIsPop;
    private boolean runningNonSeekableTransition;
    private final List<Operation> pendingOperations = new ArrayList();
    private final List<Operation> runningOperations = new ArrayList();

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Companion;", "", "()V", "getOrCreateController", "Landroidx/fragment/app/SpecialEffectsController;", "container", "Landroid/view/ViewGroup;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "factory", "Landroidx/fragment/app/SpecialEffectsControllerFactory;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class Companion {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public /* synthetic */ Companion(a07 a07Var) {
            this();
        }

        @JvmStatic
        public final SpecialEffectsController getOrCreateController(ViewGroup viewGroup, FragmentManager fragmentManager) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SpecialEffectsController) ipChange.ipc$dispatch("f29413e5", new Object[]{this, viewGroup, fragmentManager});
            }
            ckf.g(viewGroup, "container");
            ckf.g(fragmentManager, "fragmentManager");
            SpecialEffectsControllerFactory specialEffectsControllerFactory = fragmentManager.getSpecialEffectsControllerFactory();
            ckf.f(specialEffectsControllerFactory, "fragmentManager.specialEffectsControllerFactory");
            return getOrCreateController(viewGroup, specialEffectsControllerFactory);
        }

        private Companion() {
        }

        @JvmStatic
        public final SpecialEffectsController getOrCreateController(ViewGroup viewGroup, SpecialEffectsControllerFactory specialEffectsControllerFactory) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SpecialEffectsController) ipChange.ipc$dispatch("25815b6d", new Object[]{this, viewGroup, specialEffectsControllerFactory});
            }
            ckf.g(viewGroup, "container");
            ckf.g(specialEffectsControllerFactory, "factory");
            int i = R.id.special_effects_controller_view_tag;
            Object tag = viewGroup.getTag(i);
            if (tag instanceof SpecialEffectsController) {
                return (SpecialEffectsController) tag;
            }
            SpecialEffectsController createController = specialEffectsControllerFactory.createController(viewGroup);
            ckf.f(createController, "factory.createController(container)");
            viewGroup.setTag(i, createController);
            return createController;
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\bR\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Effect;", "", "<init>", "()V", "Landroid/view/ViewGroup;", "container", "Ltb/xhv;", "performStart", "(Landroid/view/ViewGroup;)V", "onStart", "Landroidx/activity/BackEventCompat;", "backEvent", "onProgress", "(Landroidx/activity/BackEventCompat;Landroid/view/ViewGroup;)V", "onCommit", "cancel", "onCancel", "", "isSeekingSupported", "Z", "()Z", "isStarted", "isCancelled", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class Effect {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean isCancelled;
        private final boolean isSeekingSupported;
        private boolean isStarted;

        public final void cancel(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("916edf40", new Object[]{this, viewGroup});
                return;
            }
            ckf.g(viewGroup, "container");
            if (!this.isCancelled) {
                onCancel(viewGroup);
            }
            this.isCancelled = true;
        }

        public boolean isSeekingSupported() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c373039", new Object[]{this})).booleanValue();
            }
            return this.isSeekingSupported;
        }

        public void onCancel(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8602317f", new Object[]{this, viewGroup});
            } else {
                ckf.g(viewGroup, "container");
            }
        }

        public void onCommit(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fde7debc", new Object[]{this, viewGroup});
            } else {
                ckf.g(viewGroup, "container");
            }
        }

        public void onProgress(BackEventCompat backEventCompat, ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("538f3eb2", new Object[]{this, backEventCompat, viewGroup});
                return;
            }
            ckf.g(backEventCompat, "backEvent");
            ckf.g(viewGroup, "container");
        }

        public void onStart(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("428ef309", new Object[]{this, viewGroup});
            } else {
                ckf.g(viewGroup, "container");
            }
        }

        public final void performStart(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3785d1c7", new Object[]{this, viewGroup});
                return;
            }
            ckf.g(viewGroup, "container");
            if (!this.isStarted) {
                onStart(viewGroup);
            }
            this.isStarted = true;
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0010¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$FragmentStateManagerOperation;", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "finalState", "Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "lifecycleImpact", "Landroidx/fragment/app/FragmentStateManager;", "fragmentStateManager", "<init>", "(Landroidx/fragment/app/SpecialEffectsController$Operation$State;Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;Landroidx/fragment/app/FragmentStateManager;)V", "Ltb/xhv;", "onStart", "()V", "complete$fragment_release", "complete", "Landroidx/fragment/app/FragmentStateManager;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class FragmentStateManagerOperation extends Operation {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final FragmentStateManager fragmentStateManager;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public FragmentStateManagerOperation(androidx.fragment.app.SpecialEffectsController.Operation.State r3, androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact r4, androidx.fragment.app.FragmentStateManager r5) {
            /*
                r2 = this;
                java.lang.String r0 = "finalState"
                tb.ckf.g(r3, r0)
                java.lang.String r0 = "lifecycleImpact"
                tb.ckf.g(r4, r0)
                java.lang.String r0 = "fragmentStateManager"
                tb.ckf.g(r5, r0)
                androidx.fragment.app.Fragment r0 = r5.getFragment()
                java.lang.String r1 = "fragmentStateManager.fragment"
                tb.ckf.f(r0, r1)
                r2.<init>(r3, r4, r0)
                r2.fragmentStateManager = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.SpecialEffectsController.FragmentStateManagerOperation.<init>(androidx.fragment.app.SpecialEffectsController$Operation$State, androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact, androidx.fragment.app.FragmentStateManager):void");
        }

        public static /* synthetic */ Object ipc$super(FragmentStateManagerOperation fragmentStateManagerOperation, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1715463126) {
                super.complete$fragment_release();
                return null;
            } else if (hashCode == 2133689546) {
                super.onStart();
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in androidx/fragment/app/SpecialEffectsController$FragmentStateManagerOperation");
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public void complete$fragment_release() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99c01c2a", new Object[]{this});
                return;
            }
            super.complete$fragment_release();
            getFragment().mTransitioning = false;
            this.fragmentStateManager.moveToExpectedState();
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public void onStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            } else if (!isStarted()) {
                super.onStart();
                if (getLifecycleImpact() == Operation.LifecycleImpact.ADDING) {
                    Fragment fragment = this.fragmentStateManager.getFragment();
                    ckf.f(fragment, "fragmentStateManager.fragment");
                    View findFocus = fragment.mView.findFocus();
                    if (findFocus != null) {
                        fragment.setFocusedView(findFocus);
                        if (FragmentManager.isLoggingEnabled(2)) {
                            StringBuilder sb = new StringBuilder("requestFocus: Saved focused view ");
                            sb.append(findFocus);
                            sb.append(" for Fragment ");
                            sb.append(fragment);
                        }
                    }
                    View requireView = getFragment().requireView();
                    ckf.f(requireView, "this.fragment.requireView()");
                    if (requireView.getParent() == null) {
                        this.fragmentStateManager.addViewToContainer();
                        requireView.setAlpha(0.0f);
                    }
                    if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                        requireView.setVisibility(4);
                    }
                    requireView.setAlpha(fragment.getPostOnViewCreatedAlpha());
                } else if (getLifecycleImpact() == Operation.LifecycleImpact.REMOVING) {
                    Fragment fragment2 = this.fragmentStateManager.getFragment();
                    ckf.f(fragment2, "fragmentStateManager.fragment");
                    View requireView2 = fragment2.requireView();
                    ckf.f(requireView2, "fragment.requireView()");
                    if (FragmentManager.isLoggingEnabled(2)) {
                        StringBuilder sb2 = new StringBuilder("Clearing focus ");
                        sb2.append(requireView2.findFocus());
                        sb2.append(" on view ");
                        sb2.append(requireView2);
                        sb2.append(" for Fragment ");
                        sb2.append(fragment2);
                    }
                    requireView2.clearFocus();
                }
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Operation.LifecycleImpact.values().length];
            try {
                iArr[Operation.LifecycleImpact.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SpecialEffectsController(ViewGroup viewGroup) {
        ckf.g(viewGroup, "container");
        this.container = viewGroup;
    }

    private final void enqueue(Operation.State state, Operation.LifecycleImpact lifecycleImpact, FragmentStateManager fragmentStateManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7f4552", new Object[]{this, state, lifecycleImpact, fragmentStateManager});
            return;
        }
        synchronized (this.pendingOperations) {
            try {
                Fragment fragment = fragmentStateManager.getFragment();
                ckf.f(fragment, "fragmentStateManager.fragment");
                Operation findPendingOperation = findPendingOperation(fragment);
                if (findPendingOperation == null) {
                    if (fragmentStateManager.getFragment().mTransitioning) {
                        Fragment fragment2 = fragmentStateManager.getFragment();
                        ckf.f(fragment2, "fragmentStateManager.fragment");
                        findPendingOperation = findRunningOperation(fragment2);
                    } else {
                        findPendingOperation = null;
                    }
                }
                if (findPendingOperation != null) {
                    findPendingOperation.mergeWith(state, lifecycleImpact);
                    return;
                }
                final FragmentStateManagerOperation fragmentStateManagerOperation = new FragmentStateManagerOperation(state, lifecycleImpact, fragmentStateManager);
                this.pendingOperations.add(fragmentStateManagerOperation);
                fragmentStateManagerOperation.addCompletionListener(new Runnable() { // from class: tb.cbq
                    @Override // java.lang.Runnable
                    public final void run() {
                        SpecialEffectsController.enqueue$lambda$4$lambda$2(SpecialEffectsController.this, fragmentStateManagerOperation);
                    }
                });
                fragmentStateManagerOperation.addCompletionListener(new Runnable() { // from class: tb.dbq
                    @Override // java.lang.Runnable
                    public final void run() {
                        SpecialEffectsController.enqueue$lambda$4$lambda$3(SpecialEffectsController.this, fragmentStateManagerOperation);
                    }
                });
                xhv xhvVar = xhv.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueue$lambda$4$lambda$2(SpecialEffectsController specialEffectsController, FragmentStateManagerOperation fragmentStateManagerOperation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81aca5dc", new Object[]{specialEffectsController, fragmentStateManagerOperation});
            return;
        }
        ckf.g(specialEffectsController, "this$0");
        ckf.g(fragmentStateManagerOperation, "$operation");
        if (specialEffectsController.pendingOperations.contains(fragmentStateManagerOperation)) {
            Operation.State finalState = fragmentStateManagerOperation.getFinalState();
            View view = fragmentStateManagerOperation.getFragment().mView;
            ckf.f(view, "operation.fragment.mView");
            finalState.applyState(view, specialEffectsController.container);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueue$lambda$4$lambda$3(SpecialEffectsController specialEffectsController, FragmentStateManagerOperation fragmentStateManagerOperation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("716f999d", new Object[]{specialEffectsController, fragmentStateManagerOperation});
            return;
        }
        ckf.g(specialEffectsController, "this$0");
        ckf.g(fragmentStateManagerOperation, "$operation");
        specialEffectsController.pendingOperations.remove(fragmentStateManagerOperation);
        specialEffectsController.runningOperations.remove(fragmentStateManagerOperation);
    }

    private final Operation findPendingOperation(Fragment fragment) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Operation) ipChange.ipc$dispatch("38e1e24e", new Object[]{this, fragment});
        }
        Iterator<T> it = this.pendingOperations.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Operation operation = (Operation) obj;
            if (ckf.b(operation.getFragment(), fragment) && !operation.isCanceled()) {
                break;
            }
        }
        return (Operation) obj;
    }

    private final Operation findRunningOperation(Fragment fragment) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Operation) ipChange.ipc$dispatch("9458d076", new Object[]{this, fragment});
        }
        Iterator<T> it = this.runningOperations.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Operation operation = (Operation) obj;
            if (ckf.b(operation.getFragment(), fragment) && !operation.isCanceled()) {
                break;
            }
        }
        return (Operation) obj;
    }

    @JvmStatic
    public static final SpecialEffectsController getOrCreateController(ViewGroup viewGroup, FragmentManager fragmentManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SpecialEffectsController) ipChange.ipc$dispatch("f29413e5", new Object[]{viewGroup, fragmentManager}) : Companion.getOrCreateController(viewGroup, fragmentManager);
    }

    private final boolean isOperationSeekable(List<Operation> list) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2dfc1c4b", new Object[]{this, list})).booleanValue();
        }
        List<Operation> list2 = list;
        loop0: while (true) {
            z = true;
            for (Operation operation : list2) {
                if (!operation.getEffects$fragment_release().isEmpty()) {
                    List<Effect> effects$fragment_release = operation.getEffects$fragment_release();
                    if (!(effects$fragment_release instanceof Collection) || !effects$fragment_release.isEmpty()) {
                        for (Effect effect : effects$fragment_release) {
                            if (!effect.isSeekingSupported()) {
                                break;
                            }
                        }
                    }
                }
                z = false;
            }
            break loop0;
        }
        if (z) {
            ArrayList arrayList = new ArrayList();
            for (Operation operation2 : list2) {
                d04.v(arrayList, operation2.getEffects$fragment_release());
            }
            if (!arrayList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private final boolean isOperationTransitioning(List<Operation> list) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f00e18c", new Object[]{this, list})).booleanValue();
        }
        for (Operation operation : list) {
            if (!operation.getFragment().mTransitioning) {
                z = false;
            }
        }
        return z;
    }

    private final void processStart(List<Operation> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8720ef2b", new Object[]{this, list});
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).onStart();
        }
        ArrayList arrayList = new ArrayList();
        for (Operation operation : list) {
            d04.v(arrayList, operation.getEffects$fragment_release());
        }
        List B0 = i04.B0(i04.G0(arrayList));
        int size2 = B0.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((Effect) B0.get(i2)).performStart(this.container);
        }
    }

    private final void updateFinalState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33ebaceb", new Object[]{this});
            return;
        }
        for (Operation operation : this.pendingOperations) {
            if (operation.getLifecycleImpact() == Operation.LifecycleImpact.ADDING) {
                View requireView = operation.getFragment().requireView();
                ckf.f(requireView, "fragment.requireView()");
                operation.mergeWith(Operation.State.Companion.from(requireView.getVisibility()), Operation.LifecycleImpact.NONE);
            }
        }
    }

    public abstract void collectEffects(List<Operation> list, boolean z);

    public final void completeBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65f40a47", new Object[]{this});
            return;
        }
        FragmentManager.isLoggingEnabled(3);
        processStart(this.runningOperations);
        commitEffects$fragment_release(this.runningOperations);
    }

    public final void enqueueAdd(Operation.State state, FragmentStateManager fragmentStateManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d2380ef", new Object[]{this, state, fragmentStateManager});
            return;
        }
        ckf.g(state, "finalState");
        ckf.g(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            new StringBuilder("SpecialEffectsController: Enqueuing add operation for fragment ").append(fragmentStateManager.getFragment());
        }
        enqueue(state, Operation.LifecycleImpact.ADDING, fragmentStateManager);
    }

    public final void enqueueHide(FragmentStateManager fragmentStateManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6e3a6ed", new Object[]{this, fragmentStateManager});
            return;
        }
        ckf.g(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            new StringBuilder("SpecialEffectsController: Enqueuing hide operation for fragment ").append(fragmentStateManager.getFragment());
        }
        enqueue(Operation.State.GONE, Operation.LifecycleImpact.NONE, fragmentStateManager);
    }

    public final void enqueueRemove(FragmentStateManager fragmentStateManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eba8c2f", new Object[]{this, fragmentStateManager});
            return;
        }
        ckf.g(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            new StringBuilder("SpecialEffectsController: Enqueuing remove operation for fragment ").append(fragmentStateManager.getFragment());
        }
        enqueue(Operation.State.REMOVED, Operation.LifecycleImpact.REMOVING, fragmentStateManager);
    }

    public final void enqueueShow(FragmentStateManager fragmentStateManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d59e22a8", new Object[]{this, fragmentStateManager});
            return;
        }
        ckf.g(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            new StringBuilder("SpecialEffectsController: Enqueuing show operation for fragment ").append(fragmentStateManager.getFragment());
        }
        enqueue(Operation.State.VISIBLE, Operation.LifecycleImpact.NONE, fragmentStateManager);
    }

    public final void executePendingOperations() {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac25cb75", new Object[]{this});
        } else if (!this.isContainerPostponed) {
            if (!this.container.isAttachedToWindow()) {
                forceCompleteAllOperations();
                this.operationDirectionIsPop = false;
                return;
            }
            synchronized (this.pendingOperations) {
                try {
                    List E0 = i04.E0(this.runningOperations);
                    this.runningOperations.clear();
                    ArrayList arrayList = (ArrayList) E0;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Operation operation = (Operation) it.next();
                        if (this.pendingOperations.isEmpty() || !operation.getFragment().mTransitioning) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        operation.setSeeking$fragment_release(z2);
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Operation operation2 = (Operation) it2.next();
                        if (this.runningNonSeekableTransition) {
                            if (FragmentManager.isLoggingEnabled(2)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("SpecialEffectsController: Completing non-seekable operation ");
                                sb.append(operation2);
                            }
                            operation2.complete$fragment_release();
                        } else {
                            if (FragmentManager.isLoggingEnabled(2)) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("SpecialEffectsController: Cancelling operation ");
                                sb2.append(operation2);
                            }
                            operation2.cancel(this.container);
                        }
                        this.runningNonSeekableTransition = false;
                        if (!operation2.isComplete()) {
                            this.runningOperations.add(operation2);
                        }
                    }
                    if (!this.pendingOperations.isEmpty()) {
                        updateFinalState();
                        List<Operation> E02 = i04.E0(this.pendingOperations);
                        ArrayList arrayList2 = (ArrayList) E02;
                        if (!arrayList2.isEmpty()) {
                            this.pendingOperations.clear();
                            this.runningOperations.addAll(E02);
                            FragmentManager.isLoggingEnabled(2);
                            collectEffects(E02, this.operationDirectionIsPop);
                            boolean isOperationSeekable = isOperationSeekable(E02);
                            boolean isOperationTransitioning = isOperationTransitioning(E02);
                            if (!isOperationTransitioning || isOperationSeekable) {
                                z = false;
                            } else {
                                z = true;
                            }
                            this.runningNonSeekableTransition = z;
                            if (FragmentManager.isLoggingEnabled(2)) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("SpecialEffectsController: Operation seekable = ");
                                sb3.append(isOperationSeekable);
                                sb3.append(" \ntransition = ");
                                sb3.append(isOperationTransitioning);
                            }
                            if (!isOperationTransitioning) {
                                processStart(E02);
                                commitEffects$fragment_release(E02);
                            } else if (isOperationSeekable) {
                                processStart(E02);
                                int size = arrayList2.size();
                                for (int i = 0; i < size; i++) {
                                    applyContainerChangesToOperation$fragment_release((Operation) arrayList2.get(i));
                                }
                            }
                            this.operationDirectionIsPop = false;
                            FragmentManager.isLoggingEnabled(2);
                        } else {
                            return;
                        }
                    }
                    xhv xhvVar = xhv.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void forceCompleteAllOperations() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec3c990", new Object[]{this});
            return;
        }
        FragmentManager.isLoggingEnabled(2);
        boolean isAttachedToWindow = this.container.isAttachedToWindow();
        synchronized (this.pendingOperations) {
            try {
                updateFinalState();
                processStart(this.pendingOperations);
                ArrayList arrayList = (ArrayList) i04.E0(this.runningOperations);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Operation) it.next()).setSeeking$fragment_release(false);
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Operation operation = (Operation) it2.next();
                    if (FragmentManager.isLoggingEnabled(2)) {
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.container + " is not attached to window. ";
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(operation);
                    }
                    operation.cancel(this.container);
                }
                ArrayList arrayList2 = (ArrayList) i04.E0(this.pendingOperations);
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    ((Operation) it3.next()).setSeeking$fragment_release(false);
                }
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    Operation operation2 = (Operation) it4.next();
                    if (FragmentManager.isLoggingEnabled(2)) {
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.container + " is not attached to window. ";
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(operation2);
                    }
                    operation2.cancel(this.container);
                }
                xhv xhvVar = xhv.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void forcePostponedExecutePendingOperations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a5edcf8", new Object[]{this});
        } else if (this.isContainerPostponed) {
            FragmentManager.isLoggingEnabled(2);
            this.isContainerPostponed = false;
            executePendingOperations();
        }
    }

    public final Operation.LifecycleImpact getAwaitingCompletionLifecycleImpact(FragmentStateManager fragmentStateManager) {
        Operation.LifecycleImpact lifecycleImpact;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Operation.LifecycleImpact) ipChange.ipc$dispatch("47475b15", new Object[]{this, fragmentStateManager});
        }
        ckf.g(fragmentStateManager, "fragmentStateManager");
        Fragment fragment = fragmentStateManager.getFragment();
        ckf.f(fragment, "fragmentStateManager.fragment");
        Operation findPendingOperation = findPendingOperation(fragment);
        Operation.LifecycleImpact lifecycleImpact2 = null;
        if (findPendingOperation != null) {
            lifecycleImpact = findPendingOperation.getLifecycleImpact();
        } else {
            lifecycleImpact = null;
        }
        Operation findRunningOperation = findRunningOperation(fragment);
        if (findRunningOperation != null) {
            lifecycleImpact2 = findRunningOperation.getLifecycleImpact();
        }
        if (lifecycleImpact == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$0[lifecycleImpact.ordinal()];
        }
        if (i == -1 || i == 1) {
            return lifecycleImpact2;
        }
        return lifecycleImpact;
    }

    public final ViewGroup getContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("c9c16903", new Object[]{this});
        }
        return this.container;
    }

    public final boolean isPendingExecute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c9c5633", new Object[]{this})).booleanValue();
        }
        return true ^ this.pendingOperations.isEmpty();
    }

    public final void processProgress(BackEventCompat backEventCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcb8f8e3", new Object[]{this, backEventCompat});
            return;
        }
        ckf.g(backEventCompat, "backEvent");
        if (FragmentManager.isLoggingEnabled(2)) {
            new StringBuilder("SpecialEffectsController: Processing Progress ").append(backEventCompat.getProgress());
        }
        ArrayList arrayList = new ArrayList();
        for (Operation operation : this.runningOperations) {
            d04.v(arrayList, operation.getEffects$fragment_release());
        }
        List B0 = i04.B0(i04.G0(arrayList));
        int size = B0.size();
        for (int i = 0; i < size; i++) {
            ((Effect) B0.get(i)).onProgress(backEventCompat, this.container);
        }
    }

    public final void updateOperationDirection(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f376fd4c", new Object[]{this, new Boolean(z)});
        } else {
            this.operationDirectionIsPop = z;
        }
    }

    @JvmStatic
    public static final SpecialEffectsController getOrCreateController(ViewGroup viewGroup, SpecialEffectsControllerFactory specialEffectsControllerFactory) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SpecialEffectsController) ipChange.ipc$dispatch("25815b6d", new Object[]{viewGroup, specialEffectsControllerFactory}) : Companion.getOrCreateController(viewGroup, specialEffectsControllerFactory);
    }

    public final void applyContainerChangesToOperation$fragment_release(Operation operation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("807cdc67", new Object[]{this, operation});
            return;
        }
        ckf.g(operation, "operation");
        if (operation.isAwaitingContainerChanges()) {
            Operation.State finalState = operation.getFinalState();
            View requireView = operation.getFragment().requireView();
            ckf.f(requireView, "operation.fragment.requireView()");
            finalState.applyState(requireView, this.container);
            operation.setAwaitingContainerChanges(false);
        }
    }

    public final void markPostponedState() {
        Fragment fragment;
        Operation operation;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c820f57", new Object[]{this});
            return;
        }
        synchronized (this.pendingOperations) {
            try {
                updateFinalState();
                List<Operation> list = this.pendingOperations;
                ListIterator<Operation> listIterator = list.listIterator(list.size());
                while (true) {
                    fragment = null;
                    if (!listIterator.hasPrevious()) {
                        operation = null;
                        break;
                    }
                    operation = listIterator.previous();
                    Operation operation2 = operation;
                    Operation.State.Companion companion = Operation.State.Companion;
                    View view = operation2.getFragment().mView;
                    ckf.f(view, "operation.fragment.mView");
                    Operation.State asOperationState = companion.asOperationState(view);
                    Operation.State finalState = operation2.getFinalState();
                    Operation.State state = Operation.State.VISIBLE;
                    if (finalState == state && asOperationState != state) {
                        break;
                    }
                }
                Operation operation3 = operation;
                if (operation3 != null) {
                    fragment = operation3.getFragment();
                }
                if (fragment != null) {
                    z = fragment.isPostponed();
                }
                this.isContainerPostponed = z;
                xhv xhvVar = xhv.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001:\u0002BCB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u000fH\u0011¢\u0006\u0004\b\u001f\u0010\u001eR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00140.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R$\u00103\u001a\u0002012\u0006\u00102\u001a\u0002018\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b3\u00105R$\u00106\u001a\u0002012\u0006\u00102\u001a\u0002018\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b6\u00104\u001a\u0004\b6\u00105R*\u00107\u001a\u0002012\u0006\u00102\u001a\u0002018\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00104\u001a\u0004\b7\u00105\"\u0004\b8\u00109R$\u0010:\u001a\u0002012\u0006\u00102\u001a\u0002018\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b:\u00104\u001a\u0004\b:\u00105R\"\u0010;\u001a\u0002018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u00104\u001a\u0004\b;\u00105\"\u0004\b<\u00109R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00180.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00100R \u0010?\u001a\b\u0012\u0004\u0012\u00020\u00180>8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b?\u00100\u001a\u0004\b@\u0010A¨\u0006D"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation;", "", "Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "finalState", "Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "lifecycleImpact", "Landroidx/fragment/app/Fragment;", "fragment", "<init>", "(Landroidx/fragment/app/SpecialEffectsController$Operation$State;Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;Landroidx/fragment/app/Fragment;)V", "", "toString", "()Ljava/lang/String;", "Landroid/view/ViewGroup;", "container", "Ltb/xhv;", "cancel", "(Landroid/view/ViewGroup;)V", "mergeWith", "(Landroidx/fragment/app/SpecialEffectsController$Operation$State;Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;)V", "Ljava/lang/Runnable;", DataReceiveMonitor.CB_LISTENER, "addCompletionListener", "(Ljava/lang/Runnable;)V", "Landroidx/fragment/app/SpecialEffectsController$Effect;", kwt.UPLOAD_TYPE_EFFECT, "addEffect", "(Landroidx/fragment/app/SpecialEffectsController$Effect;)V", "completeEffect", "onStart", "()V", "complete$fragment_release", "complete", "Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "getFinalState", "()Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "setFinalState", "(Landroidx/fragment/app/SpecialEffectsController$Operation$State;)V", "Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "getLifecycleImpact", "()Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "setLifecycleImpact", "(Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;)V", "Landroidx/fragment/app/Fragment;", "getFragment", "()Landroidx/fragment/app/Fragment;", "", "completionListeners", "Ljava/util/List;", "", "<set-?>", "isCanceled", "Z", "()Z", "isComplete", "isSeeking", "setSeeking$fragment_release", "(Z)V", "isStarted", "isAwaitingContainerChanges", "setAwaitingContainerChanges", "_effects", "", "effects", "getEffects$fragment_release", "()Ljava/util/List;", "LifecycleImpact", "State", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class Operation {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final List<Effect> _effects;
        private final List<Effect> effects;
        private State finalState;
        private final Fragment fragment;
        private boolean isCanceled;
        private boolean isComplete;
        private boolean isSeeking;
        private boolean isStarted;
        private LifecycleImpact lifecycleImpact;
        private final List<Runnable> completionListeners = new ArrayList();
        private boolean isAwaitingContainerChanges = true;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "", "(Ljava/lang/String;I)V", "NONE", "ADDING", "REMOVING", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class LifecycleImpact extends Enum<LifecycleImpact> {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public static final LifecycleImpact NONE = new LifecycleImpact("NONE", 0);
            public static final LifecycleImpact ADDING = new LifecycleImpact("ADDING", 1);
            public static final LifecycleImpact REMOVING = new LifecycleImpact("REMOVING", 2);
            private static final /* synthetic */ LifecycleImpact[] $VALUES = $values();

            private static final /* synthetic */ LifecycleImpact[] $values() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (LifecycleImpact[]) ipChange.ipc$dispatch("92141c66", new Object[0]) : new LifecycleImpact[]{NONE, ADDING, REMOVING};
            }

            private LifecycleImpact(String str, int i) {
            }

            public static /* synthetic */ Object ipc$super(LifecycleImpact lifecycleImpact, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact");
            }

            public static LifecycleImpact valueOf(String str) {
                Object valueOf;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    valueOf = ipChange.ipc$dispatch("e3702f11", new Object[]{str});
                } else {
                    valueOf = Enum.valueOf(LifecycleImpact.class, str);
                }
                return (LifecycleImpact) valueOf;
            }

            public static LifecycleImpact[] values() {
                Object clone;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    clone = ipChange.ipc$dispatch("b4d4b642", new Object[0]);
                } else {
                    clone = $VALUES.clone();
                }
                return (LifecycleImpact[]) clone;
            }
        }

        /* compiled from: Taobao */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LifecycleImpact.values().length];
                try {
                    iArr[LifecycleImpact.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LifecycleImpact.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LifecycleImpact.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Operation(State state, LifecycleImpact lifecycleImpact, Fragment fragment) {
            ckf.g(state, "finalState");
            ckf.g(lifecycleImpact, "lifecycleImpact");
            ckf.g(fragment, "fragment");
            this.finalState = state;
            this.lifecycleImpact = lifecycleImpact;
            this.fragment = fragment;
            ArrayList arrayList = new ArrayList();
            this._effects = arrayList;
            this.effects = arrayList;
        }

        public final void addCompletionListener(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a965c1b6", new Object[]{this, runnable});
                return;
            }
            ckf.g(runnable, DataReceiveMonitor.CB_LISTENER);
            this.completionListeners.add(runnable);
        }

        public final void addEffect(Effect effect) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d6ad6c5f", new Object[]{this, effect});
                return;
            }
            ckf.g(effect, kwt.UPLOAD_TYPE_EFFECT);
            this._effects.add(effect);
        }

        public final void cancel(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("916edf40", new Object[]{this, viewGroup});
                return;
            }
            ckf.g(viewGroup, "container");
            this.isStarted = false;
            if (!this.isCanceled) {
                this.isCanceled = true;
                if (this._effects.isEmpty()) {
                    complete$fragment_release();
                    return;
                }
                for (Effect effect : i04.B0(this.effects)) {
                    effect.cancel(viewGroup);
                }
            }
        }

        public void complete$fragment_release() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99c01c2a", new Object[]{this});
                return;
            }
            this.isStarted = false;
            if (!this.isComplete) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    StringBuilder sb = new StringBuilder("SpecialEffectsController: ");
                    sb.append(this);
                    sb.append(" has called complete.");
                }
                this.isComplete = true;
                for (Runnable runnable : this.completionListeners) {
                    runnable.run();
                }
            }
        }

        public final void completeEffect(Effect effect) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("50d986c7", new Object[]{this, effect});
                return;
            }
            ckf.g(effect, kwt.UPLOAD_TYPE_EFFECT);
            if (this._effects.remove(effect) && this._effects.isEmpty()) {
                complete$fragment_release();
            }
        }

        public final List<Effect> getEffects$fragment_release() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("47ca12f0", new Object[]{this});
            }
            return this.effects;
        }

        public final State getFinalState() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (State) ipChange.ipc$dispatch("cf6e4691", new Object[]{this});
            }
            return this.finalState;
        }

        public final Fragment getFragment() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Fragment) ipChange.ipc$dispatch("34dee721", new Object[]{this});
            }
            return this.fragment;
        }

        public final LifecycleImpact getLifecycleImpact() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LifecycleImpact) ipChange.ipc$dispatch("e6289129", new Object[]{this});
            }
            return this.lifecycleImpact;
        }

        public final boolean isAwaitingContainerChanges() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c1b389c3", new Object[]{this})).booleanValue();
            }
            return this.isAwaitingContainerChanges;
        }

        public final boolean isCanceled() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("83e706ee", new Object[]{this})).booleanValue();
            }
            return this.isCanceled;
        }

        public final boolean isComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ba1c638e", new Object[]{this})).booleanValue();
            }
            return this.isComplete;
        }

        public final boolean isSeeking() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4dac726b", new Object[]{this})).booleanValue();
            }
            return this.isSeeking;
        }

        public final boolean isStarted() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5a6f3902", new Object[]{this})).booleanValue();
            }
            return this.isStarted;
        }

        public final void mergeWith(State state, LifecycleImpact lifecycleImpact) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26a25d6c", new Object[]{this, state, lifecycleImpact});
                return;
            }
            ckf.g(state, "finalState");
            ckf.g(lifecycleImpact, "lifecycleImpact");
            int i = WhenMappings.$EnumSwitchMapping$0[lifecycleImpact.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        StringBuilder sb = new StringBuilder("SpecialEffectsController: For fragment ");
                        sb.append(this.fragment);
                        sb.append(" mFinalState = ");
                        sb.append(this.finalState);
                        sb.append(" -> REMOVED. mLifecycleImpact  = ");
                        sb.append(this.lifecycleImpact);
                        sb.append(" to REMOVING.");
                    }
                    this.finalState = State.REMOVED;
                    this.lifecycleImpact = LifecycleImpact.REMOVING;
                    this.isAwaitingContainerChanges = true;
                } else if (i == 3 && this.finalState != State.REMOVED) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        StringBuilder sb2 = new StringBuilder("SpecialEffectsController: For fragment ");
                        sb2.append(this.fragment);
                        sb2.append(" mFinalState = ");
                        sb2.append(this.finalState);
                        sb2.append(" -> ");
                        sb2.append(state);
                        sb2.append('.');
                    }
                    this.finalState = state;
                }
            } else if (this.finalState == State.REMOVED) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    StringBuilder sb3 = new StringBuilder("SpecialEffectsController: For fragment ");
                    sb3.append(this.fragment);
                    sb3.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                    sb3.append(this.lifecycleImpact);
                    sb3.append(" to ADDING.");
                }
                this.finalState = State.VISIBLE;
                this.lifecycleImpact = LifecycleImpact.ADDING;
                this.isAwaitingContainerChanges = true;
            }
        }

        public void onStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            } else {
                this.isStarted = true;
            }
        }

        public final void setAwaitingContainerChanges(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f749cbd", new Object[]{this, new Boolean(z)});
            } else {
                this.isAwaitingContainerChanges = z;
            }
        }

        public final void setFinalState(State state) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("de130b37", new Object[]{this, state});
                return;
            }
            ckf.g(state, "<set-?>");
            this.finalState = state;
        }

        public final void setLifecycleImpact(LifecycleImpact lifecycleImpact) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9dae2a29", new Object[]{this, lifecycleImpact});
                return;
            }
            ckf.g(lifecycleImpact, "<set-?>");
            this.lifecycleImpact = lifecycleImpact;
        }

        public final void setSeeking$fragment_release(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("50bffd19", new Object[]{this, new Boolean(z)});
            } else {
                this.isSeeking = z;
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            String hexString = Integer.toHexString(System.identityHashCode(this));
            return "Operation {" + hexString + "} {finalState = " + this.finalState + " lifecycleImpact = " + this.lifecycleImpact + " fragment = " + this.fragment + '}';
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "", "<init>", "(Ljava/lang/String;I)V", "Landroid/view/View;", "view", "Landroid/view/ViewGroup;", "container", "Ltb/xhv;", "applyState", "(Landroid/view/View;Landroid/view/ViewGroup;)V", "Companion", "REMOVED", "VISIBLE", "GONE", "INVISIBLE", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class State extends Enum<State> {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public static final State REMOVED = new State("REMOVED", 0);
            public static final State VISIBLE = new State("VISIBLE", 1);
            public static final State GONE = new State("GONE", 2);
            public static final State INVISIBLE = new State("INVISIBLE", 3);
            private static final /* synthetic */ State[] $VALUES = $values();
            public static final Companion Companion = new Companion(null);

            /* compiled from: Taobao */
            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\n\u0010\u0007\u001a\u00020\u0004*\u00020\b¨\u0006\t"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation$State$Companion;", "", "()V", "from", "Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "visibility", "", "asOperationState", "Landroid/view/View;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
            public static final class Companion {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public /* synthetic */ Companion(a07 a07Var) {
                    this();
                }

                public final State asOperationState(View view) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (State) ipChange.ipc$dispatch("4aa23f3a", new Object[]{this, view});
                    }
                    ckf.g(view, "<this>");
                    if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                        return State.INVISIBLE;
                    }
                    return from(view.getVisibility());
                }

                @JvmStatic
                public final State from(int i) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (State) ipChange.ipc$dispatch("2a586e17", new Object[]{this, new Integer(i)});
                    }
                    if (i == 0) {
                        return State.VISIBLE;
                    }
                    if (i == 4) {
                        return State.INVISIBLE;
                    }
                    if (i == 8) {
                        return State.GONE;
                    }
                    throw new IllegalArgumentException("Unknown visibility " + i);
                }

                private Companion() {
                }
            }

            /* compiled from: Taobao */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[State.values().length];
                    try {
                        iArr[State.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[State.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[State.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[State.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            private static final /* synthetic */ State[] $values() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (State[]) ipChange.ipc$dispatch("1a492705", new Object[0]) : new State[]{REMOVED, VISIBLE, GONE, INVISIBLE};
            }

            private State(String str, int i) {
            }

            @JvmStatic
            public static final State from(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (State) ipChange.ipc$dispatch("2a586e17", new Object[]{new Integer(i)});
                }
                return Companion.from(i);
            }

            public static /* synthetic */ Object ipc$super(State state, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/fragment/app/SpecialEffectsController$Operation$State");
            }

            public static State valueOf(String str) {
                Object valueOf;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    valueOf = ipChange.ipc$dispatch("c9d18370", new Object[]{str});
                } else {
                    valueOf = Enum.valueOf(State.class, str);
                }
                return (State) valueOf;
            }

            public static State[] values() {
                Object clone;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    clone = ipChange.ipc$dispatch("d5cb23e1", new Object[0]);
                } else {
                    clone = $VALUES.clone();
                }
                return (State[]) clone;
            }

            public final void applyState(View view, ViewGroup viewGroup) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d0018407", new Object[]{this, view, viewGroup});
                    return;
                }
                ckf.g(view, "view");
                ckf.g(viewGroup, "container");
                int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
                ViewGroup viewGroup2 = null;
                if (i == 1) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof ViewGroup) {
                        viewGroup2 = (ViewGroup) parent;
                    }
                    if (viewGroup2 != null) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            StringBuilder sb = new StringBuilder("SpecialEffectsController: Removing view ");
                            sb.append(view);
                            sb.append(" from container ");
                            sb.append(viewGroup2);
                        }
                        viewGroup2.removeView(view);
                    }
                } else if (i == 2) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        StringBuilder sb2 = new StringBuilder("SpecialEffectsController: Setting view ");
                        sb2.append(view);
                        sb2.append(" to VISIBLE");
                    }
                    ViewParent parent2 = view.getParent();
                    if (parent2 instanceof ViewGroup) {
                        viewGroup2 = (ViewGroup) parent2;
                    }
                    if (viewGroup2 == null) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            StringBuilder sb3 = new StringBuilder("SpecialEffectsController: Adding view ");
                            sb3.append(view);
                            sb3.append(" to Container ");
                            sb3.append(viewGroup);
                        }
                        viewGroup.addView(view);
                    }
                    view.setVisibility(0);
                } else if (i == 3) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        StringBuilder sb4 = new StringBuilder("SpecialEffectsController: Setting view ");
                        sb4.append(view);
                        sb4.append(" to GONE");
                    }
                    view.setVisibility(8);
                } else if (i == 4) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        StringBuilder sb5 = new StringBuilder("SpecialEffectsController: Setting view ");
                        sb5.append(view);
                        sb5.append(" to INVISIBLE");
                    }
                    view.setVisibility(4);
                }
            }
        }
    }

    public void commitEffects$fragment_release(List<Operation> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f796dc9", new Object[]{this, list});
            return;
        }
        ckf.g(list, "operations");
        List<Operation> list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Operation operation : list2) {
            d04.v(arrayList, operation.getEffects$fragment_release());
        }
        List B0 = i04.B0(i04.G0(arrayList));
        int size = B0.size();
        for (int i = 0; i < size; i++) {
            ((Effect) B0.get(i)).onCommit(this.container);
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            applyContainerChangesToOperation$fragment_release(list.get(i2));
        }
        List B02 = i04.B0(list2);
        int size3 = B02.size();
        for (int i3 = 0; i3 < size3; i3++) {
            Operation operation2 = (Operation) B02.get(i3);
            if (operation2.getEffects$fragment_release().isEmpty()) {
                operation2.complete$fragment_release();
            }
        }
    }
}
