package kotlin.io.path;

import com.alibaba.security.realidentity.p1;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.ckf;
import tb.ge9;
import tb.hvl;
import tb.u1a;
import tb.w1a;

/* compiled from: Taobao */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final /* synthetic */ class PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$3 extends FunctionReferenceImpl implements u1a<Path, Exception, FileVisitResult> {
    final /* synthetic */ Path $normalizedTarget;
    final /* synthetic */ w1a<Path, Path, Exception, OnErrorResult> $onError;
    final /* synthetic */ Path $target;
    final /* synthetic */ Path $this_copyToRecursively;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$3(w1a<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> w1aVar, Path path, Path path2, Path path3) {
        super(2, ckf.a.class, "error", "copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/lang/Exception;)Ljava/nio/file/FileVisitResult;", 0);
        this.$onError = w1aVar;
        this.$this_copyToRecursively = path;
        this.$target = path2;
        this.$normalizedTarget = path3;
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ FileVisitResult invoke(Path path, Exception exc) {
        return invoke2(ge9.a(path), exc);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final FileVisitResult invoke2(Path path, Exception exc) {
        FileVisitResult g;
        ckf.g(path, "p0");
        ckf.g(exc, p1.d);
        g = hvl.g(this.$onError, this.$this_copyToRecursively, this.$target, this.$normalizedTarget, path, exc);
        return g;
    }
}
