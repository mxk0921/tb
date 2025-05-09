package tb;

import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Iterator;
import kotlin.io.path.PathWalkOption;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class xul implements sbp<Path> {
    public static final /* synthetic */ boolean a(xul xulVar) {
        xulVar.c();
        throw null;
    }

    public static final /* synthetic */ LinkOption[] b(xul xulVar) {
        xulVar.d();
        throw null;
    }

    public final boolean c() {
        ic1.B(null, PathWalkOption.FOLLOW_LINKS);
        throw null;
    }

    public final LinkOption[] d() {
        iqg iqgVar = iqg.INSTANCE;
        c();
        throw null;
    }

    public final boolean e() {
        ic1.B(null, PathWalkOption.BREADTH_FIRST);
        throw null;
    }

    @Override // tb.sbp
    public Iterator<Path> iterator() {
        e();
        throw null;
    }
}
