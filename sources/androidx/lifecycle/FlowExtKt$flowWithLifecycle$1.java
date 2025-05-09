package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.i;
import tb.ar4;
import tb.dkf;
import tb.ozm;
import tb.qp9;
import tb.sp9;
import tb.u1a;
import tb.uu4;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ltb/ozm;", "Ltb/xhv;", "<anonymous>", "(Ltb/ozm;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", i = {0}, l = {91}, m = "invokeSuspend", n = {"$this$callbackFlow"}, s = {"L$0"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class FlowExtKt$flowWithLifecycle$1 extends SuspendLambda implements u1a<ozm<? super T>, ar4<? super xhv>, Object> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Lifecycle $lifecycle;
    public final /* synthetic */ Lifecycle.State $minActiveState;
    public final /* synthetic */ qp9<T> $this_flowWithLifecycle;
    private /* synthetic */ Object L$0;
    public int label;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ltb/uu4;", "Ltb/xhv;", "<anonymous>", "(Ltb/uu4;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements u1a<uu4, ar4<? super xhv>, Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ozm<T> $$this$callbackFlow;
        public final /* synthetic */ qp9<T> $this_flowWithLifecycle;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(qp9<? extends T> qp9Var, ozm<? super T> ozmVar, ar4<? super AnonymousClass1> ar4Var) {
            super(2, ar4Var);
            this.$this_flowWithLifecycle = qp9Var;
            this.$$this$callbackFlow = ozmVar;
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/lifecycle/FlowExtKt$flowWithLifecycle$1$1");
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ar4) ipChange.ipc$dispatch("513284d7", new Object[]{this, obj, ar4Var});
            }
            return new AnonymousClass1(this.$this_flowWithLifecycle, this.$$this$callbackFlow, ar4Var);
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
                qp9<T> qp9Var = this.$this_flowWithLifecycle;
                final ozm<T> ozmVar = this.$$this$callbackFlow;
                sp9 sp9Var = new sp9() { // from class: androidx.lifecycle.FlowExtKt.flowWithLifecycle.1.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.sp9
                    public final Object emit(T t, ar4<? super xhv> ar4Var) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ipChange2.ipc$dispatch("93a862aa", new Object[]{this, t, ar4Var});
                        }
                        Object d2 = ozmVar.d(t, ar4Var);
                        if (d2 == dkf.d()) {
                            return d2;
                        }
                        return xhv.INSTANCE;
                    }
                };
                this.label = 1;
                if (qp9Var.a(sp9Var, this) == d) {
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
    /* JADX WARN: Multi-variable type inference failed */
    public FlowExtKt$flowWithLifecycle$1(Lifecycle lifecycle, Lifecycle.State state, qp9<? extends T> qp9Var, ar4<? super FlowExtKt$flowWithLifecycle$1> ar4Var) {
        super(2, ar4Var);
        this.$lifecycle = lifecycle;
        this.$minActiveState = state;
        this.$this_flowWithLifecycle = qp9Var;
    }

    public static /* synthetic */ Object ipc$super(FlowExtKt$flowWithLifecycle$1 flowExtKt$flowWithLifecycle$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/lifecycle/FlowExtKt$flowWithLifecycle$1");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ar4) ipChange.ipc$dispatch("513284d7", new Object[]{this, obj, ar4Var});
        }
        FlowExtKt$flowWithLifecycle$1 flowExtKt$flowWithLifecycle$1 = new FlowExtKt$flowWithLifecycle$1(this.$lifecycle, this.$minActiveState, this.$this_flowWithLifecycle, ar4Var);
        flowExtKt$flowWithLifecycle$1.L$0 = obj;
        return flowExtKt$flowWithLifecycle$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ozm ozmVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("241f63cb", new Object[]{this, obj});
        }
        Object d = dkf.d();
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            ozm ozmVar2 = (ozm) this.L$0;
            Lifecycle lifecycle = this.$lifecycle;
            Lifecycle.State state = this.$minActiveState;
            AnonymousClass1 r5 = new AnonymousClass1(this.$this_flowWithLifecycle, ozmVar2, null);
            this.L$0 = ozmVar2;
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, r5, this) == d) {
                return d;
            }
            ozmVar = ozmVar2;
        } else if (i == 1) {
            ozmVar = (ozm) this.L$0;
            b.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i.a.a(ozmVar, null, 1, null);
        return xhv.INSTANCE;
    }

    public final Object invoke(ozm<? super T> ozmVar, ar4<? super xhv> ar4Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c2b37dfd", new Object[]{this, ozmVar, ar4Var}) : ((FlowExtKt$flowWithLifecycle$1) create(ozmVar, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }
}
