package kotlinx.coroutines.future;

import java.util.concurrent.CompletionException;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Lambda;
import tb.br4;
import tb.cr4;
import tb.o94;
import tb.tu4;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u00032\u000e\u0010\u0004\u001a\n \u0002*\u0004\u0018\u0001H\u0003H\u00032\u000e\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "T", "value", "exception", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class FutureKt$asDeferred$2 extends Lambda implements u1a<Object, Throwable, Object> {
    final /* synthetic */ o94<Object> $result;

    public FutureKt$asDeferred$2(o94<Object> o94Var) {
        super(2);
    }

    public final Object invoke(Object obj, Throwable th) {
        try {
            if (th != null) {
                CompletionException a2 = br4.a(th) ? cr4.a(th) : null;
                if (a2 != null) {
                    a2.getCause();
                }
                throw null;
            }
            throw null;
        } catch (Throwable th2) {
            tu4.a(EmptyCoroutineContext.INSTANCE, th2);
            return xhv.INSTANCE;
        }
    }
}
