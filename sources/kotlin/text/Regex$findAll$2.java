package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.ckf;
import tb.g1a;
import tb.g6i;

/* compiled from: Taobao */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public /* synthetic */ class Regex$findAll$2 extends FunctionReferenceImpl implements g1a<g6i, g6i> {
    public static final Regex$findAll$2 INSTANCE = new Regex$findAll$2();

    public Regex$findAll$2() {
        super(1, g6i.class, "next", "next()Lkotlin/text/MatchResult;", 0);
    }

    public final g6i invoke(g6i g6iVar) {
        ckf.g(g6iVar, "p0");
        return g6iVar.next();
    }
}
