package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.m;
import tb.ar4;
import tb.dkf;
import tb.mn2;
import tb.u1a;
import tb.uu4;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Ltb/uu4;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.jvm.kt", i = {0}, l = {205}, m = "invokeSuspend", n = {"controller"}, s = {"L$0"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class PausingDispatcherKt$whenStateAtLeast$2 extends SuspendLambda implements u1a<uu4, ar4<? super T>, Object> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ u1a<uu4, ar4<? super T>, Object> $block;
    public final /* synthetic */ Lifecycle.State $minState;
    public final /* synthetic */ Lifecycle $this_whenStateAtLeast;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PausingDispatcherKt$whenStateAtLeast$2(Lifecycle lifecycle, Lifecycle.State state, u1a<? super uu4, ? super ar4<? super T>, ? extends Object> u1aVar, ar4<? super PausingDispatcherKt$whenStateAtLeast$2> ar4Var) {
        super(2, ar4Var);
        this.$this_whenStateAtLeast = lifecycle;
        this.$minState = state;
        this.$block = u1aVar;
    }

    public static /* synthetic */ Object ipc$super(PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/lifecycle/PausingDispatcherKt$whenStateAtLeast$2");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ar4) ipChange.ipc$dispatch("513284d7", new Object[]{this, obj, ar4Var});
        }
        PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2 = new PausingDispatcherKt$whenStateAtLeast$2(this.$this_whenStateAtLeast, this.$minState, this.$block, ar4Var);
        pausingDispatcherKt$whenStateAtLeast$2.L$0 = obj;
        return pausingDispatcherKt$whenStateAtLeast$2;
    }

    public final Object invoke(uu4 uu4Var, ar4<? super T> ar4Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("de4ace36", new Object[]{this, uu4Var, ar4Var}) : ((PausingDispatcherKt$whenStateAtLeast$2) create(uu4Var, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        LifecycleController lifecycleController;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("241f63cb", new Object[]{this, obj});
        }
        Object d = dkf.d();
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            m mVar = (m) ((uu4) this.L$0).getCoroutineContext().get(m.Key);
            if (mVar != null) {
                PausingDispatcher pausingDispatcher = new PausingDispatcher();
                LifecycleController lifecycleController2 = new LifecycleController(this.$this_whenStateAtLeast, this.$minState, pausingDispatcher.dispatchQueue, mVar);
                try {
                    u1a<uu4, ar4<? super T>, Object> u1aVar = this.$block;
                    this.L$0 = lifecycleController2;
                    this.label = 1;
                    obj = mn2.c(pausingDispatcher, u1aVar, this);
                    if (obj == d) {
                        return d;
                    }
                    lifecycleController = lifecycleController2;
                } catch (Throwable th2) {
                    th = th2;
                    lifecycleController = lifecycleController2;
                    lifecycleController.finish();
                    throw th;
                }
            } else {
                throw new IllegalStateException("when[State] methods should have a parent job");
            }
        } else if (i == 1) {
            lifecycleController = (LifecycleController) this.L$0;
            try {
                b.b(obj);
            } catch (Throwable th3) {
                th = th3;
                lifecycleController.finish();
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        lifecycleController.finish();
        return obj;
    }
}
