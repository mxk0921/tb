package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.ar4;
import tb.sp9;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public /* synthetic */ class SafeCollectorKt$emitFun$1 extends FunctionReferenceImpl implements w1a<sp9<? super Object>, Object, ar4<? super xhv>, Object> {
    public static final SafeCollectorKt$emitFun$1 INSTANCE = new SafeCollectorKt$emitFun$1();

    public SafeCollectorKt$emitFun$1() {
        super(3, sp9.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // tb.w1a
    public /* bridge */ /* synthetic */ Object invoke(sp9<? super Object> sp9Var, Object obj, ar4<? super xhv> ar4Var) {
        return invoke2((sp9<Object>) sp9Var, obj, ar4Var);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(sp9<Object> sp9Var, Object obj, ar4<? super xhv> ar4Var) {
        return sp9Var.emit(obj, ar4Var);
    }
}
