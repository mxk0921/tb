package kotlin.random;

import java.io.Serializable;
import java.util.Random;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.y20;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000 \u000b2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\fB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lkotlin/random/PlatformRandom;", "Ltb/y20;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Ljava/util/Random;", "impl", "<init>", "(Ljava/util/Random;)V", "Ljava/util/Random;", "getImpl", "()Ljava/util/Random;", "Companion", "a", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class PlatformRandom extends y20 implements Serializable {
    private static final a Companion = new a(null);
    private static final long serialVersionUID = 0;
    private final Random impl;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a {
        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    public PlatformRandom(Random random) {
        ckf.g(random, "impl");
        this.impl = random;
    }

    @Override // tb.y20
    public Random getImpl() {
        return this.impl;
    }
}
