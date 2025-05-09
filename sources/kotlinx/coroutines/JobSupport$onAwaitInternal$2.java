package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.w1a;

/* compiled from: Taobao */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public /* synthetic */ class JobSupport$onAwaitInternal$2 extends FunctionReferenceImpl implements w1a<JobSupport, Object, Object, Object> {
    public static final JobSupport$onAwaitInternal$2 INSTANCE = new JobSupport$onAwaitInternal$2();

    public JobSupport$onAwaitInternal$2() {
        super(3, JobSupport.class, "onAwaitInternalProcessResFunc", "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    public final Object invoke(JobSupport jobSupport, Object obj, Object obj2) {
        jobSupport.W0(obj, obj2);
        return obj2;
    }
}
