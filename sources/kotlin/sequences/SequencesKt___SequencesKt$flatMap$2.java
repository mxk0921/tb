package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.ckf;
import tb.g1a;
import tb.pg1;
import tb.sbp;

/* compiled from: Taobao */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final /* synthetic */ class SequencesKt___SequencesKt$flatMap$2 extends FunctionReferenceImpl implements g1a<sbp<Object>, Iterator<Object>> {
    public static final SequencesKt___SequencesKt$flatMap$2 INSTANCE = new SequencesKt___SequencesKt$flatMap$2();

    public SequencesKt___SequencesKt$flatMap$2() {
        super(1, sbp.class, pg1.ATOM_EXT_iterator, "iterator()Ljava/util/Iterator;", 0);
    }

    public final Iterator<Object> invoke(sbp<Object> sbpVar) {
        ckf.g(sbpVar, "p0");
        return sbpVar.iterator();
    }
}
