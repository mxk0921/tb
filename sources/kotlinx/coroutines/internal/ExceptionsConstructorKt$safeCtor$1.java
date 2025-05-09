package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "e", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class ExceptionsConstructorKt$safeCtor$1 extends Lambda implements g1a<Throwable, Throwable> {
    final /* synthetic */ g1a<Throwable, Throwable> $block;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ExceptionsConstructorKt$safeCtor$1(g1a<? super Throwable, ? extends Throwable> g1aVar) {
        super(1);
        this.$block = g1aVar;
    }

    public final Throwable invoke(Throwable th) {
        Object obj;
        Throwable th2 = null;
        try {
            Throwable invoke = this.$block.invoke(th);
            if (!ckf.b(th.getMessage(), invoke.getMessage()) && !ckf.b(invoke.getMessage(), th.toString())) {
                invoke = null;
            }
            obj = Result.m1108constructorimpl(invoke);
        } catch (Throwable th3) {
            obj = Result.m1108constructorimpl(b.a(th3));
        }
        if (!Result.m1114isFailureimpl(obj)) {
            th2 = obj;
        }
        return th2;
    }
}
