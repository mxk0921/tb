package kotlinx.coroutines.flow;

import tb.ajq;
import tb.qp9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public interface k {
    public static final a Companion = a.f15377a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f15377a = new a();
        public static final k b = new l();
        public static final k c = new StartedLazily();

        public final k a() {
            return b;
        }

        public final k b() {
            return c;
        }
    }

    qp9<SharingCommand> a(ajq<Integer> ajqVar);
}
