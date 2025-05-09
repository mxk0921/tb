package tb;

import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class acp extends xbp {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a implements sbp<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Iterator f15662a;

        public a(Iterator it) {
            this.f15662a = it;
        }

        @Override // tb.sbp
        public Iterator<T> iterator() {
            return this.f15662a;
        }
    }

    public static <T> sbp<T> d(Iterator<? extends T> it) {
        ckf.g(it, "<this>");
        return e(new a(it));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> sbp<T> e(sbp<? extends T> sbpVar) {
        ckf.g(sbpVar, "<this>");
        if (sbpVar instanceof bk4) {
            return sbpVar;
        }
        return new bk4(sbpVar);
    }

    public static <T> sbp<T> f(final T t, g1a<? super T, ? extends T> g1aVar) {
        ckf.g(g1aVar, "nextFunction");
        if (t == null) {
            return cd8.INSTANCE;
        }
        return new l6a(new d1a() { // from class: tb.ybp
            @Override // tb.d1a
            public final Object invoke() {
                return t;
            }
        }, g1aVar);
    }

    public static <T> sbp<T> g(final d1a<? extends T> d1aVar) {
        ckf.g(d1aVar, "nextFunction");
        return e(new l6a(d1aVar, new g1a() { // from class: tb.zbp
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                Object i;
                i = acp.i(d1a.this, obj);
                return i;
            }
        }));
    }

    public static <T> sbp<T> h(d1a<? extends T> d1aVar, g1a<? super T, ? extends T> g1aVar) {
        ckf.g(d1aVar, "seedFunction");
        ckf.g(g1aVar, "nextFunction");
        return new l6a(d1aVar, g1aVar);
    }

    public static final Object i(d1a d1aVar, Object obj) {
        ckf.g(obj, AdvanceSetting.NETWORK_TYPE);
        return d1aVar.invoke();
    }
}
