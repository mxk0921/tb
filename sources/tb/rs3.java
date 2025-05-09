package tb;

import kotlinx.coroutines.internal.ExceptionsConstructorKt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class rs3 extends wy4 {
    public static final rs3 INSTANCE = new rs3();

    /* renamed from: a  reason: collision with root package name */
    public static final a f27576a = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a extends ClassValue<g1a<? super Throwable, ? extends Throwable>> {
        /* renamed from: a */
        public g1a<Throwable, Throwable> computeValue(Class<?> cls) {
            g1a<Throwable, Throwable> b;
            ckf.e(cls, "null cannot be cast to non-null type java.lang.Class<out kotlin.Throwable>");
            b = ExceptionsConstructorKt.b(cls);
            return b;
        }
    }

    @Override // tb.wy4
    public g1a<Throwable, Throwable> a(Class<? extends Throwable> cls) {
        Object obj;
        obj = f27576a.get(cls);
        return (g1a) obj;
    }
}
