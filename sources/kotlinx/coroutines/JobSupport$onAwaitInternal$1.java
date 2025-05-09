package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.k9p;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public /* synthetic */ class JobSupport$onAwaitInternal$1 extends FunctionReferenceImpl implements w1a<JobSupport, k9p<?>, Object, xhv> {
    public static final JobSupport$onAwaitInternal$1 INSTANCE = new JobSupport$onAwaitInternal$1();

    public JobSupport$onAwaitInternal$1() {
        super(3, JobSupport.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // tb.w1a
    public /* bridge */ /* synthetic */ xhv invoke(JobSupport jobSupport, k9p<?> k9pVar, Object obj) {
        invoke2(jobSupport, k9pVar, obj);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(JobSupport jobSupport, k9p<?> k9pVar, Object obj) {
        jobSupport.X0(k9pVar, obj);
    }
}
