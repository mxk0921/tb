package kotlin.io.path;

import java.nio.file.Path;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import tb.ar4;
import tb.ckf;
import tb.dkf;
import tb.ep7;
import tb.ge9;
import tb.gul;
import tb.hvl;
import tb.ob1;
import tb.pg1;
import tb.u1a;
import tb.vbp;
import tb.xhv;
import tb.xul;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltb/vbp;", "Ljava/nio/file/Path;", "Ltb/xhv;", "<anonymous>", "(Ltb/vbp;)V"}, k = 3, mv = {2, 1, 0})
@DebugMetadata(c = "kotlin.io.path.PathTreeWalk$dfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3}, l = {191, 197, 210, 216}, m = "invokeSuspend", n = {"$this$iterator", pg1.ATOM_stack, "entriesReader", "startNode", "this_$iv", "path$iv", "$this$iterator", pg1.ATOM_stack, "entriesReader", "$this$iterator", pg1.ATOM_stack, "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", pg1.ATOM_stack, "entriesReader"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class PathTreeWalk$dfsIterator$1 extends RestrictedSuspendLambda implements u1a<vbp<? super Path>, ar4<? super xhv>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ xul this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathTreeWalk$dfsIterator$1(xul xulVar, ar4<? super PathTreeWalk$dfsIterator$1> ar4Var) {
        super(2, ar4Var);
        this.this$0 = xulVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        PathTreeWalk$dfsIterator$1 pathTreeWalk$dfsIterator$1 = new PathTreeWalk$dfsIterator$1(this.this$0, ar4Var);
        pathTreeWalk$dfsIterator$1.L$0 = obj;
        return pathTreeWalk$dfsIterator$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        dkf.d();
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            vbp vbpVar = (vbp) this.L$0;
            new ob1();
            xul.a(this.this$0);
            throw null;
        } else if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ge9.a(this.L$5);
                    gul gulVar = (gul) this.L$3;
                    ep7 ep7Var = (ep7) this.L$2;
                    ob1 ob1Var = (ob1) this.L$1;
                    vbp vbpVar2 = (vbp) this.L$0;
                    b.b(obj);
                    xul.b((xul) this.L$4);
                    throw null;
                } else if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            ep7 ep7Var2 = (ep7) this.L$2;
            ob1 ob1Var2 = (ob1) this.L$1;
            vbp vbpVar3 = (vbp) this.L$0;
            b.b(obj);
            while (!ob1Var2.isEmpty()) {
                Iterator<gul> a2 = ((gul) ob1Var2.g()).a();
                ckf.d(a2);
                if (a2.hasNext()) {
                    gul next = a2.next();
                    xul xulVar = this.this$0;
                    Path c = next.c();
                    if (next.b() != null) {
                        hvl.c(c);
                    }
                    xul.b(xulVar);
                    throw null;
                }
                ob1Var2.removeLast();
            }
            return xhv.INSTANCE;
        } else {
            ge9.a(this.L$5);
            gul gulVar2 = (gul) this.L$3;
            ep7 ep7Var3 = (ep7) this.L$2;
            ob1 ob1Var3 = (ob1) this.L$1;
            vbp vbpVar4 = (vbp) this.L$0;
            b.b(obj);
            xul.b((xul) this.L$4);
            throw null;
        }
    }

    public final Object invoke(vbp<? super Path> vbpVar, ar4<? super xhv> ar4Var) {
        return ((PathTreeWalk$dfsIterator$1) create(vbpVar, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }
}
