package androidx.databinding;

import androidx.databinding.ViewDataBindingKtx;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import tb.ar4;
import tb.ckf;
import tb.dkf;
import tb.qp9;
import tb.sp9;
import tb.u1a;
import tb.uu4;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltb/uu4;", "Ltb/xhv;", "<anonymous>", "(Ltb/uu4;)V"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "androidx.databinding.ViewDataBindingKtx$StateFlowListener$startCollection$1", f = "ViewDataBindingKtx.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ViewDataBindingKtx$StateFlowListener$startCollection$1 extends SuspendLambda implements u1a<uu4, ar4<? super xhv>, Object> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ qp9<Object> $flow;
    public final /* synthetic */ LifecycleOwner $owner;
    public int label;
    public final /* synthetic */ ViewDataBindingKtx.StateFlowListener this$0;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltb/uu4;", "Ltb/xhv;", "<anonymous>", "(Ltb/uu4;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "androidx.databinding.ViewDataBindingKtx$StateFlowListener$startCollection$1$1", f = "ViewDataBindingKtx.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.databinding.ViewDataBindingKtx$StateFlowListener$startCollection$1$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements u1a<uu4, ar4<? super xhv>, Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ qp9<Object> $flow;
        public int label;
        public final /* synthetic */ ViewDataBindingKtx.StateFlowListener this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(qp9<? extends Object> qp9Var, ViewDataBindingKtx.StateFlowListener stateFlowListener, ar4<? super AnonymousClass1> ar4Var) {
            super(2, ar4Var);
            this.$flow = qp9Var;
            this.this$0 = stateFlowListener;
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/databinding/ViewDataBindingKtx$StateFlowListener$startCollection$1$1");
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ar4) ipChange.ipc$dispatch("513284d7", new Object[]{this, obj, ar4Var});
            }
            return new AnonymousClass1(this.$flow, this.this$0, ar4Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("241f63cb", new Object[]{this, obj});
            }
            Object d = dkf.d();
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                qp9<Object> qp9Var = this.$flow;
                final ViewDataBindingKtx.StateFlowListener stateFlowListener = this.this$0;
                sp9<? super Object> viewDataBindingKtx$StateFlowListener$startCollection$1$1$invokeSuspend$$inlined$collect$1 = new sp9<Object>() { // from class: androidx.databinding.ViewDataBindingKtx$StateFlowListener$startCollection$1$1$invokeSuspend$$inlined$collect$1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.sp9
                    public Object emit(Object obj2, ar4<? super xhv> ar4Var) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ipChange2.ipc$dispatch("93a862aa", new Object[]{this, obj2, ar4Var});
                        }
                        ViewDataBinding binder = ViewDataBindingKtx.StateFlowListener.access$getListener$p(ViewDataBindingKtx.StateFlowListener.this).getBinder();
                        if (binder != null) {
                            binder.handleFieldChange(ViewDataBindingKtx.StateFlowListener.access$getListener$p(ViewDataBindingKtx.StateFlowListener.this).mLocalFieldId, ViewDataBindingKtx.StateFlowListener.access$getListener$p(ViewDataBindingKtx.StateFlowListener.this).getTarget(), 0);
                        }
                        return xhv.INSTANCE;
                    }
                };
                this.label = 1;
                if (qp9Var.a(viewDataBindingKtx$StateFlowListener$startCollection$1$1$invokeSuspend$$inlined$collect$1, this) == d) {
                    return d;
                }
            } else if (i == 1) {
                b.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return xhv.INSTANCE;
        }

        public final Object invoke(uu4 uu4Var, ar4<? super xhv> ar4Var) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("de4ace36", new Object[]{this, uu4Var, ar4Var}) : ((AnonymousClass1) create(uu4Var, ar4Var)).invokeSuspend(xhv.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewDataBindingKtx$StateFlowListener$startCollection$1(LifecycleOwner lifecycleOwner, qp9<? extends Object> qp9Var, ViewDataBindingKtx.StateFlowListener stateFlowListener, ar4<? super ViewDataBindingKtx$StateFlowListener$startCollection$1> ar4Var) {
        super(2, ar4Var);
        this.$owner = lifecycleOwner;
        this.$flow = qp9Var;
        this.this$0 = stateFlowListener;
    }

    public static /* synthetic */ Object ipc$super(ViewDataBindingKtx$StateFlowListener$startCollection$1 viewDataBindingKtx$StateFlowListener$startCollection$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/databinding/ViewDataBindingKtx$StateFlowListener$startCollection$1");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ar4) ipChange.ipc$dispatch("513284d7", new Object[]{this, obj, ar4Var});
        }
        return new ViewDataBindingKtx$StateFlowListener$startCollection$1(this.$owner, this.$flow, this.this$0, ar4Var);
    }

    public final Object invoke(uu4 uu4Var, ar4<? super xhv> ar4Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("de4ace36", new Object[]{this, uu4Var, ar4Var}) : ((ViewDataBindingKtx$StateFlowListener$startCollection$1) create(uu4Var, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("241f63cb", new Object[]{this, obj});
        }
        Object d = dkf.d();
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            Lifecycle lifecycle = this.$owner.getLifecycle();
            ckf.f(lifecycle, "owner.lifecycle");
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 r3 = new AnonymousClass1(this.$flow, this.this$0, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, r3, this) == d) {
                return d;
            }
        } else if (i == 1) {
            b.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return xhv.INSTANCE;
    }
}
