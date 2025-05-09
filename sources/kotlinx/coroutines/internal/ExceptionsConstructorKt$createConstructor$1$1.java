package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "E", "e", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class ExceptionsConstructorKt$createConstructor$1$1 extends Lambda implements g1a<Throwable, Throwable> {
    final /* synthetic */ Constructor<?> $constructor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExceptionsConstructorKt$createConstructor$1$1(Constructor<?> constructor) {
        super(1);
        this.$constructor = constructor;
    }

    public final Throwable invoke(Throwable th) {
        Object newInstance = this.$constructor.newInstance(th.getMessage(), th);
        ckf.e(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
        return (Throwable) newInstance;
    }
}
