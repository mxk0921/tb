package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.k9p;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public /* synthetic */ class JobSupport$onJoin$1 extends FunctionReferenceImpl implements w1a<JobSupport, k9p<?>, Object, xhv> {
    public static final JobSupport$onJoin$1 INSTANCE = new JobSupport$onJoin$1();

    public JobSupport$onJoin$1() {
        super(3, JobSupport.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // tb.w1a
    public /* bridge */ /* synthetic */ xhv invoke(JobSupport jobSupport, k9p<?> k9pVar, Object obj) {
        invoke2(jobSupport, k9pVar, obj);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(JobSupport jobSupport, k9p<?> k9pVar, Object obj) {
        jobSupport.e1(k9pVar, obj);
    }
}
