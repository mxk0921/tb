package kotlinx.coroutines.flow;

import com.loc.at;
import kotlin.Metadata;
import tb.ar4;
import tb.dkf;
import tb.pg1;
import tb.sp9;
import tb.u1a;
import tb.xhv;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012-\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\r\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR>\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\b8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/flow/j;", "T", "Lkotlinx/coroutines/flow/AbstractFlow;", "Lkotlin/Function2;", "Ltb/sp9;", "Ltb/ar4;", "Ltb/xhv;", "", "Lkotlin/ExtensionFunctionType;", pg1.ATOM_EXT_block, "<init>", "(Ltb/u1a;)V", "collector", at.f, "(Ltb/sp9;Ltb/ar4;)Ljava/lang/Object;", "a", "Ltb/u1a;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class j<T> extends AbstractFlow<T> {

    /* renamed from: a  reason: collision with root package name */
    private final u1a<sp9<? super T>, ar4<? super xhv>, Object> f15376a;

    /* JADX WARN: Multi-variable type inference failed */
    public j(u1a<? super sp9<? super T>, ? super ar4<? super xhv>, ? extends Object> u1aVar) {
        this.f15376a = u1aVar;
    }

    @Override // kotlinx.coroutines.flow.AbstractFlow
    public Object g(sp9<? super T> sp9Var, ar4<? super xhv> ar4Var) {
        Object invoke = this.f15376a.invoke(sp9Var, ar4Var);
        if (invoke == dkf.d()) {
            return invoke;
        }
        return xhv.INSTANCE;
    }
}
