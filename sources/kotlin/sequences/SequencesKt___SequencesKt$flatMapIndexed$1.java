package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.ckf;
import tb.g1a;
import tb.pg1;

/* compiled from: Taobao */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final /* synthetic */ class SequencesKt___SequencesKt$flatMapIndexed$1 extends FunctionReferenceImpl implements g1a<Iterable<Object>, Iterator<Object>> {
    public static final SequencesKt___SequencesKt$flatMapIndexed$1 INSTANCE = new SequencesKt___SequencesKt$flatMapIndexed$1();

    public SequencesKt___SequencesKt$flatMapIndexed$1() {
        super(1, Iterable.class, pg1.ATOM_EXT_iterator, "iterator()Ljava/util/Iterator;", 0);
    }

    public final Iterator<Object> invoke(Iterable<Object> iterable) {
        ckf.g(iterable, "p0");
        return iterable.iterator();
    }
}
