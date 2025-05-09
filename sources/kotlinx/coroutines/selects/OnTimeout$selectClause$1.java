package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.k9p;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public /* synthetic */ class OnTimeout$selectClause$1 extends FunctionReferenceImpl implements w1a<OnTimeout, k9p<?>, Object, xhv> {
    public static final OnTimeout$selectClause$1 INSTANCE = new OnTimeout$selectClause$1();

    public OnTimeout$selectClause$1() {
        super(3, OnTimeout.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // tb.w1a
    public /* bridge */ /* synthetic */ xhv invoke(OnTimeout onTimeout, k9p<?> k9pVar, Object obj) {
        invoke2(onTimeout, k9pVar, obj);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OnTimeout onTimeout, k9p<?> k9pVar, Object obj) {
        onTimeout.c(k9pVar, obj);
    }
}
