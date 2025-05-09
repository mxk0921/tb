package kotlinx.coroutines.flow.internal;

import tb.ar4;
import tb.ckf;
import tb.kqu;
import tb.sp9;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class SafeCollectorKt {

    /* renamed from: a  reason: collision with root package name */
    public static final w1a<sp9<Object>, Object, ar4<? super xhv>, Object> f15370a;

    static {
        SafeCollectorKt$emitFun$1 safeCollectorKt$emitFun$1 = SafeCollectorKt$emitFun$1.INSTANCE;
        ckf.e(safeCollectorKt$emitFun$1, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        kqu.e(safeCollectorKt$emitFun$1, 3);
        f15370a = safeCollectorKt$emitFun$1;
    }

    public static final /* synthetic */ w1a a() {
        return f15370a;
    }
}
