package kotlinx.coroutines.flow;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import tb.ajq;
import tb.ar4;
import tb.dkf;
import tb.mct;
import tb.sp9;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltb/sp9;", "Lkotlinx/coroutines/flow/SharingCommand;", "Ltb/xhv;", "<anonymous>", "(Ltb/sp9;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", i = {}, l = {mct.USTAR_FILENAME_PREFIX}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class StartedLazily$command$1 extends SuspendLambda implements u1a<sp9<? super SharingCommand>, ar4<? super xhv>, Object> {
    final /* synthetic */ ajq<Integer> $subscriptionCount;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "count", "Ltb/xhv;", "a", "(ILtb/ar4;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: kotlinx.coroutines.flow.StartedLazily$command$1$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class AnonymousClass1<T> implements sp9 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Ref$BooleanRef f15353a;
        final /* synthetic */ sp9<SharingCommand> b;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Ref$BooleanRef ref$BooleanRef, sp9<? super SharingCommand> sp9Var) {
            this.f15353a = ref$BooleanRef;
            this.b = sp9Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(int r5, tb.ar4<? super tb.xhv> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1
                if (r0 == 0) goto L_0x0013
                r0 = r6
                kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1 r0 = (kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1 r0 = new kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1
                r0.<init>(r4, r6)
            L_0x0018:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = tb.dkf.d()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L_0x0031
                if (r2 != r3) goto L_0x0029
                kotlin.b.b(r6)
                goto L_0x004b
            L_0x0029:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x0031:
                kotlin.b.b(r6)
                if (r5 <= 0) goto L_0x004e
                kotlin.jvm.internal.Ref$BooleanRef r5 = r4.f15353a
                boolean r6 = r5.element
                if (r6 != 0) goto L_0x004e
                r5.element = r3
                tb.sp9<kotlinx.coroutines.flow.SharingCommand> r5 = r4.b
                kotlinx.coroutines.flow.SharingCommand r6 = kotlinx.coroutines.flow.SharingCommand.START
                r0.label = r3
                java.lang.Object r5 = r5.emit(r6, r0)
                if (r5 != r1) goto L_0x004b
                return r1
            L_0x004b:
                tb.xhv r5 = tb.xhv.INSTANCE
                return r5
            L_0x004e:
                tb.xhv r5 = tb.xhv.INSTANCE
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StartedLazily$command$1.AnonymousClass1.a(int, tb.ar4):java.lang.Object");
        }

        @Override // tb.sp9
        public /* bridge */ /* synthetic */ Object emit(Object obj, ar4 ar4Var) {
            return a(((Number) obj).intValue(), ar4Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedLazily$command$1(ajq<Integer> ajqVar, ar4<? super StartedLazily$command$1> ar4Var) {
        super(2, ar4Var);
        this.$subscriptionCount = ajqVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        StartedLazily$command$1 startedLazily$command$1 = new StartedLazily$command$1(this.$subscriptionCount, ar4Var);
        startedLazily$command$1.L$0 = obj;
        return startedLazily$command$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object d = dkf.d();
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            ajq<Integer> ajqVar = this.$subscriptionCount;
            AnonymousClass1 r4 = new AnonymousClass1(ref$BooleanRef, (sp9) this.L$0);
            this.label = 1;
            if (ajqVar.a(r4, this) == d) {
                return d;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            b.b(obj);
        }
        throw new KotlinNothingValueException();
    }

    public final Object invoke(sp9<? super SharingCommand> sp9Var, ar4<? super xhv> ar4Var) {
        return ((StartedLazily$command$1) create(sp9Var, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }
}
