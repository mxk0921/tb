package kotlinx.coroutines.future;

import java.util.function.BiFunction;
import kotlin.Metadata;
import tb.ar4;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002B\u0017\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00018\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/future/a;", "T", "Ljava/util/function/BiFunction;", "", "Ltb/xhv;", "Ltb/ar4;", "cont", "<init>", "(Ltb/ar4;)V", "result", "exception", "a", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "Ltb/ar4;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class a<T> implements BiFunction<T, Throwable, xhv> {

    /* renamed from: a  reason: collision with root package name */
    public volatile ar4<? super T> f15380a;

    public a(ar4<? super T> ar4Var) {
        this.f15380a = ar4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        r2 = r2.getCause();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(T r2, java.lang.Throwable r3) {
        /*
            r1 = this;
            tb.ar4<? super T> r0 = r1.f15380a
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            if (r3 != 0) goto L_0x000f
            java.lang.Object r2 = kotlin.Result.m1108constructorimpl(r2)
            r0.resumeWith(r2)
            goto L_0x0030
        L_0x000f:
            boolean r2 = tb.br4.a(r3)
            if (r2 == 0) goto L_0x001a
            java.util.concurrent.CompletionException r2 = tb.cr4.a(r3)
            goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            if (r2 == 0) goto L_0x0025
            java.lang.Throwable r2 = tb.dr4.a(r2)
            if (r2 != 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r3 = r2
        L_0x0025:
            java.lang.Object r2 = kotlin.b.a(r3)
            java.lang.Object r2 = kotlin.Result.m1108constructorimpl(r2)
            r0.resumeWith(r2)
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.future.a.a(java.lang.Object, java.lang.Throwable):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.BiFunction
    public /* bridge */ /* synthetic */ xhv apply(Object obj, Throwable th) {
        a(obj, th);
        return xhv.INSTANCE;
    }
}
