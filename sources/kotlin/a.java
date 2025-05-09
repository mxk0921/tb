package kotlin;

import tb.ckf;
import tb.d1a;
import tb.njg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class a {

    /* compiled from: Taobao */
    /* renamed from: kotlin.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public /* synthetic */ class C0859a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LazyThreadSafetyMode.values().length];
            try {
                iArr[LazyThreadSafetyMode.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LazyThreadSafetyMode.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LazyThreadSafetyMode.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static <T> njg<T> a(LazyThreadSafetyMode lazyThreadSafetyMode, d1a<? extends T> d1aVar) {
        ckf.g(lazyThreadSafetyMode, "mode");
        ckf.g(d1aVar, "initializer");
        int i = C0859a.$EnumSwitchMapping$0[lazyThreadSafetyMode.ordinal()];
        if (i == 1) {
            return new SynchronizedLazyImpl(d1aVar, null, 2, null);
        }
        if (i == 2) {
            return new SafePublicationLazyImpl(d1aVar);
        }
        if (i == 3) {
            return new UnsafeLazyImpl(d1aVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static <T> njg<T> b(d1a<? extends T> d1aVar) {
        ckf.g(d1aVar, "initializer");
        return new SynchronizedLazyImpl(d1aVar, null, 2, null);
    }
}
