package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlinx.coroutines.DelayKt;
import tb.ckf;
import tb.d9p;
import tb.e9p;
import tb.k9p;
import tb.kqu;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class OnTimeout {

    /* renamed from: a  reason: collision with root package name */
    public final long f15389a;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ltb/xhv;", "run", "()V", "tb/ajo", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k9p f15390a;
        final /* synthetic */ OnTimeout b;

        public a(k9p k9pVar, OnTimeout onTimeout) {
            this.f15390a = k9pVar;
            this.b = onTimeout;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f15390a.e(this.b, xhv.INSTANCE);
        }
    }

    public OnTimeout(long j) {
        this.f15389a = j;
    }

    public final d9p b() {
        OnTimeout$selectClause$1 onTimeout$selectClause$1 = OnTimeout$selectClause$1.INSTANCE;
        ckf.e(onTimeout$selectClause$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        kqu.e(onTimeout$selectClause$1, 3);
        return new e9p(this, onTimeout$selectClause$1, null, 4, null);
    }

    public final void c(k9p<?> k9pVar, Object obj) {
        long j = this.f15389a;
        if (j <= 0) {
            k9pVar.b(xhv.INSTANCE);
            return;
        }
        a aVar = new a(k9pVar, this);
        ckf.e(k9pVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        SelectImplementation selectImplementation = (SelectImplementation) k9pVar;
        d context = k9pVar.getContext();
        k9pVar.d(DelayKt.c(context).b(j, aVar, context));
    }
}
