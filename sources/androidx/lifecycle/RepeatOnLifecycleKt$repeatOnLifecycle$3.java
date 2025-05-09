package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import tb.ar4;
import tb.dkf;
import tb.fzh;
import tb.mn2;
import tb.u1a;
import tb.uu4;
import tb.xhv;
import tb.zq7;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltb/uu4;", "Ltb/xhv;", "<anonymous>", "(Ltb/uu4;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends SuspendLambda implements u1a<uu4, ar4<? super xhv>, Object> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ u1a<uu4, ar4<? super xhv>, Object> $block;
    public final /* synthetic */ Lifecycle.State $state;
    public final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
    private /* synthetic */ Object L$0;
    public int label;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltb/uu4;", "Ltb/xhv;", "<anonymous>", "(Ltb/uu4;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", i = {0, 0}, l = {166}, m = "invokeSuspend", n = {"launchedJob", "observer"}, s = {"L$0", "L$1"})
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements u1a<uu4, ar4<? super xhv>, Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ uu4 $$this$coroutineScope;
        public final /* synthetic */ u1a<uu4, ar4<? super xhv>, Object> $block;
        public final /* synthetic */ Lifecycle.State $state;
        public final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Lifecycle lifecycle, Lifecycle.State state, uu4 uu4Var, u1a<? super uu4, ? super ar4<? super xhv>, ? extends Object> u1aVar, ar4<? super AnonymousClass1> ar4Var) {
            super(2, ar4Var);
            this.$this_repeatOnLifecycle = lifecycle;
            this.$state = state;
            this.$$this$coroutineScope = uu4Var;
            this.$block = u1aVar;
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1");
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ar4) ipChange.ipc$dispatch("513284d7", new Object[]{this, obj, ar4Var});
            }
            return new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, this.$$this$coroutineScope, this.$block, ar4Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00e6  */
        /* JADX WARN: Type inference failed for: r11v0, types: [androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1, T, androidx.lifecycle.LifecycleObserver] */
        /* JADX WARN: Unknown variable types count: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 236
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invoke(uu4 uu4Var, ar4<? super xhv> ar4Var) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("de4ace36", new Object[]{this, uu4Var, ar4Var}) : ((AnonymousClass1) create(uu4Var, ar4Var)).invokeSuspend(xhv.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3(Lifecycle lifecycle, Lifecycle.State state, u1a<? super uu4, ? super ar4<? super xhv>, ? extends Object> u1aVar, ar4<? super RepeatOnLifecycleKt$repeatOnLifecycle$3> ar4Var) {
        super(2, ar4Var);
        this.$this_repeatOnLifecycle = lifecycle;
        this.$state = state;
        this.$block = u1aVar;
    }

    public static /* synthetic */ Object ipc$super(RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ar4) ipChange.ipc$dispatch("513284d7", new Object[]{this, obj, ar4Var});
        }
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.$this_repeatOnLifecycle, this.$state, this.$block, ar4Var);
        repeatOnLifecycleKt$repeatOnLifecycle$3.L$0 = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
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
            uu4 uu4Var = (uu4) this.L$0;
            fzh N0 = zq7.c().N0();
            AnonymousClass1 r8 = new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, uu4Var, this.$block, null);
            this.label = 1;
            if (mn2.c(N0, r8, this) == d) {
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
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("de4ace36", new Object[]{this, uu4Var, ar4Var}) : ((RepeatOnLifecycleKt$repeatOnLifecycle$3) create(uu4Var, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }
}
