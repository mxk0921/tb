package tb;

import java.util.Iterator;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class wbp {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a implements sbp<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u1a f30591a;

        public a(u1a u1aVar) {
            this.f30591a = u1aVar;
        }

        @Override // tb.sbp
        public Iterator<T> iterator() {
            return wbp.a(this.f30591a);
        }
    }

    public static <T> Iterator<T> a(u1a<? super vbp<? super T>, ? super ar4<? super xhv>, ? extends Object> u1aVar) {
        ckf.g(u1aVar, pg1.ATOM_EXT_block);
        ubp ubpVar = new ubp();
        ubpVar.g(IntrinsicsKt__IntrinsicsJvmKt.b(u1aVar, ubpVar, ubpVar));
        return ubpVar;
    }

    public static <T> sbp<T> b(u1a<? super vbp<? super T>, ? super ar4<? super xhv>, ? extends Object> u1aVar) {
        ckf.g(u1aVar, pg1.ATOM_EXT_block);
        return new a(u1aVar);
    }
}
