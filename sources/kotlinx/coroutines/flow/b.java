package kotlinx.coroutines.flow;

import kotlin.Metadata;
import tb.ar4;
import tb.dkf;
import tb.ozm;
import tb.qp9;
import tb.sp9;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final /* synthetic */ class b {

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltb/qp9;", "Ltb/sp9;", "collector", "Ltb/xhv;", "a", "(Ltb/sp9;Ltb/ar4;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a implements qp9<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f15357a;

        public a(Object obj) {
            this.f15357a = obj;
        }

        @Override // tb.qp9, tb.t23
        public Object a(sp9<? super T> sp9Var, ar4<? super xhv> ar4Var) {
            Object emit = sp9Var.emit(this.f15357a, ar4Var);
            if (emit == dkf.d()) {
                return emit;
            }
            return xhv.INSTANCE;
        }
    }

    public static final <T> qp9<T> a(u1a<? super ozm<? super T>, ? super ar4<? super xhv>, ? extends Object> u1aVar) {
        return new CallbackFlowBuilder(u1aVar, null, 0, null, 14, null);
    }

    public static final <T> qp9<T> b(u1a<? super sp9<? super T>, ? super ar4<? super xhv>, ? extends Object> u1aVar) {
        return new j(u1aVar);
    }

    public static final <T> qp9<T> c(T t) {
        return new a(t);
    }
}
