package androidx.databinding;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.adaemon.TriggerChannelService;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlinx.coroutines.m;
import tb.ckf;
import tb.nn2;
import tb.qp9;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/databinding/ViewDataBindingKtx;", "", "<init>", "()V", "Landroidx/databinding/ViewDataBinding;", "viewDataBinding", "", "localFieldId", "Ltb/qp9;", "observable", "", "updateStateFlowRegistration", "(Landroidx/databinding/ViewDataBinding;ILtb/qp9;)Z", "Landroidx/databinding/CreateWeakListener;", "CREATE_STATE_FLOW_LISTENER", "Landroidx/databinding/CreateWeakListener;", "StateFlowListener", "databindingKtx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ViewDataBindingKtx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ViewDataBindingKtx INSTANCE = new ViewDataBindingKtx();
    private static final CreateWeakListener CREATE_STATE_FLOW_LISTENER = new CreateWeakListener() { // from class: androidx.databinding.a
        @Override // androidx.databinding.CreateWeakListener
        public final WeakListener create(ViewDataBinding viewDataBinding, int i, ReferenceQueue referenceQueue) {
            WeakListener weakListener;
            weakListener = ViewDataBindingKtx.m25CREATE_STATE_FLOW_LISTENER$lambda0(viewDataBinding, i, referenceQueue);
            return weakListener;
        }
    };

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001B'\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u000f2\u0010\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\u000f2\u0010\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\"\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Landroidx/databinding/ViewDataBindingKtx$StateFlowListener;", "Landroidx/databinding/ObservableReference;", "Ltb/qp9;", "", "Landroidx/databinding/ViewDataBinding;", TriggerChannelService.EXTRA_BINDER, "", "localFieldId", "Ljava/lang/ref/ReferenceQueue;", "referenceQueue", "<init>", "(Landroidx/databinding/ViewDataBinding;ILjava/lang/ref/ReferenceQueue;)V", "Landroidx/lifecycle/LifecycleOwner;", "owner", "flow", "Ltb/xhv;", "startCollection", "(Landroidx/lifecycle/LifecycleOwner;Ltb/qp9;)V", "Landroidx/databinding/WeakListener;", "getListener", "()Landroidx/databinding/WeakListener;", "target", "addListener", "(Ltb/qp9;)V", "removeListener", "lifecycleOwner", "setLifecycleOwner", "(Landroidx/lifecycle/LifecycleOwner;)V", "Ljava/lang/ref/WeakReference;", "_lifecycleOwnerRef", "Ljava/lang/ref/WeakReference;", "Lkotlinx/coroutines/m;", "observerJob", "Lkotlinx/coroutines/m;", DataReceiveMonitor.CB_LISTENER, "Landroidx/databinding/WeakListener;", "databindingKtx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class StateFlowListener implements ObservableReference<qp9<? extends Object>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private WeakReference<LifecycleOwner> _lifecycleOwnerRef;
        private final WeakListener<qp9<Object>> listener;
        private m observerJob;

        public StateFlowListener(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
            ckf.g(referenceQueue, "referenceQueue");
            this.listener = new WeakListener<>(viewDataBinding, i, this, referenceQueue);
        }

        public static final /* synthetic */ WeakListener access$getListener$p(StateFlowListener stateFlowListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WeakListener) ipChange.ipc$dispatch("7cefd82d", new Object[]{stateFlowListener});
            }
            return stateFlowListener.listener;
        }

        @Override // androidx.databinding.ObservableReference
        public WeakListener<qp9<? extends Object>> getListener() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WeakListener) ipChange.ipc$dispatch("15c0bf1c", new Object[]{this});
            }
            return this.listener;
        }

        @Override // androidx.databinding.ObservableReference
        public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
            LifecycleOwner lifecycleOwner2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b9ddc1b", new Object[]{this, lifecycleOwner});
                return;
            }
            WeakReference<LifecycleOwner> weakReference = this._lifecycleOwnerRef;
            if (weakReference != null) {
                lifecycleOwner2 = weakReference.get();
            } else {
                lifecycleOwner2 = null;
            }
            if (lifecycleOwner2 != lifecycleOwner) {
                m mVar = this.observerJob;
                if (mVar != null) {
                    m.a.b(mVar, null, 1, null);
                }
                if (lifecycleOwner == null) {
                    this._lifecycleOwnerRef = null;
                    return;
                }
                this._lifecycleOwnerRef = new WeakReference<>(lifecycleOwner);
                qp9<Object> target = this.listener.getTarget();
                if (target != null) {
                    startCollection(lifecycleOwner, target);
                }
            }
        }

        private final void startCollection(LifecycleOwner lifecycleOwner, qp9<? extends Object> qp9Var) {
            m b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef6fa4c2", new Object[]{this, lifecycleOwner, qp9Var});
                return;
            }
            m mVar = this.observerJob;
            if (mVar != null) {
                m.a.b(mVar, null, 1, null);
            }
            b = nn2.b(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new ViewDataBindingKtx$StateFlowListener$startCollection$1(lifecycleOwner, qp9Var, this, null), 3, null);
            this.observerJob = b;
        }

        public void addListener(qp9<? extends Object> qp9Var) {
            LifecycleOwner lifecycleOwner;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ae52f478", new Object[]{this, qp9Var});
                return;
            }
            WeakReference<LifecycleOwner> weakReference = this._lifecycleOwnerRef;
            if (weakReference != null && (lifecycleOwner = weakReference.get()) != null && qp9Var != null) {
                startCollection(lifecycleOwner, qp9Var);
            }
        }

        public void removeListener(qp9<? extends Object> qp9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca52e89b", new Object[]{this, qp9Var});
                return;
            }
            m mVar = this.observerJob;
            if (mVar != null) {
                m.a.b(mVar, null, 1, null);
            }
            this.observerJob = null;
        }
    }

    private ViewDataBindingKtx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CREATE_STATE_FLOW_LISTENER$lambda-0  reason: not valid java name */
    public static final WeakListener m25CREATE_STATE_FLOW_LISTENER$lambda0(ViewDataBinding viewDataBinding, int i, ReferenceQueue referenceQueue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakListener) ipChange.ipc$dispatch("88b1bf93", new Object[]{viewDataBinding, new Integer(i), referenceQueue});
        }
        ckf.f(referenceQueue, "referenceQueue");
        return new StateFlowListener(viewDataBinding, i, referenceQueue).getListener();
    }

    @JvmStatic
    public static final boolean updateStateFlowRegistration(ViewDataBinding viewDataBinding, int i, qp9<?> qp9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a648a9a", new Object[]{viewDataBinding, new Integer(i), qp9Var})).booleanValue();
        }
        ckf.g(viewDataBinding, "viewDataBinding");
        viewDataBinding.mInStateFlowRegisterObserver = true;
        try {
            return viewDataBinding.updateRegistration(i, qp9Var, CREATE_STATE_FLOW_LISTENER);
        } finally {
            viewDataBinding.mInStateFlowRegisterObserver = false;
        }
    }
}
