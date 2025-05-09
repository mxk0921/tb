package tb;

import java.util.Random;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class zz8 extends y20 {

    /* renamed from: a  reason: collision with root package name */
    public final a f33119a = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a extends ThreadLocal<Random> {
        /* renamed from: a */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // tb.y20
    public Random getImpl() {
        Random random = this.f33119a.get();
        ckf.f(random, "get(...)");
        return random;
    }
}
