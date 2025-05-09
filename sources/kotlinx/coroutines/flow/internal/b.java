package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlinx.coroutines.f;
import tb.ar4;
import tb.dkf;
import tb.qp9;
import tb.sp9;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltb/qp9;", "Ltb/sp9;", "collector", "Ltb/xhv;", "a", "(Ltb/sp9;Ltb/ar4;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class b implements qp9<Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ qp9 f15373a;
    final /* synthetic */ qp9 b;
    final /* synthetic */ w1a c;

    public b(qp9 qp9Var, qp9 qp9Var2, w1a w1aVar) {
        this.f15373a = qp9Var;
        this.b = qp9Var2;
        this.c = w1aVar;
    }

    @Override // tb.qp9, tb.t23
    public Object a(sp9<? super Object> sp9Var, ar4<? super xhv> ar4Var) {
        Object b = f.b(new CombineKt$zipImpl$1$1(sp9Var, this.f15373a, this.b, this.c, null), ar4Var);
        if (b == dkf.d()) {
            return b;
        }
        return xhv.INSTANCE;
    }
}
