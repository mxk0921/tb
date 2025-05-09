package kotlinx.coroutines.flow;

import com.alipay.android.msp.framework.dynfun.TplMsg;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.ar4;
import tb.dkf;
import tb.g1a;
import tb.iak;
import tb.qp9;
import tb.sp9;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002Bg\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012:\u0010\r\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017RH\u0010\r\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/flow/DistinctFlowImpl;", "T", "Ltb/qp9;", "upstream", "Lkotlin/Function1;", "", "keySelector", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "old", "new", "", "areEquivalent", "<init>", "(Ltb/qp9;Ltb/g1a;Ltb/u1a;)V", "Ltb/sp9;", "collector", "Ltb/xhv;", "a", "(Ltb/sp9;Ltb/ar4;)Ljava/lang/Object;", "Ltb/qp9;", TplMsg.VALUE_T_NATIVE_RETURN, "Ltb/g1a;", "c", "Ltb/u1a;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class DistinctFlowImpl<T> implements qp9<T> {

    /* renamed from: a  reason: collision with root package name */
    private final qp9<T> f15271a;
    public final g1a<T, Object> b;
    public final u1a<Object, Object, Boolean> c;

    /* JADX WARN: Multi-variable type inference failed */
    public DistinctFlowImpl(qp9<? extends T> qp9Var, g1a<? super T, ? extends Object> g1aVar, u1a<Object, Object, Boolean> u1aVar) {
        this.f15271a = qp9Var;
        this.b = g1aVar;
        this.c = u1aVar;
    }

    @Override // tb.qp9, tb.t23
    public Object a(sp9<? super T> sp9Var, ar4<? super xhv> ar4Var) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = (T) iak.NULL;
        Object a2 = this.f15271a.a(new DistinctFlowImpl$collect$2(this, ref$ObjectRef, sp9Var), ar4Var);
        if (a2 == dkf.d()) {
            return a2;
        }
        return xhv.INSTANCE;
    }
}
