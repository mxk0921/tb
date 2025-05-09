package kotlin.io.path;

import com.alibaba.security.realidentity.p1;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.ckf;
import tb.ge9;
import tb.hvl;
import tb.le9;
import tb.u1a;
import tb.w1a;

/* compiled from: Taobao */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final /* synthetic */ class PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$2 extends FunctionReferenceImpl implements u1a<Path, BasicFileAttributes, FileVisitResult> {
    final /* synthetic */ w1a<Object, Path, Path, CopyActionResult> $copyAction;
    final /* synthetic */ Path $normalizedTarget;
    final /* synthetic */ w1a<Path, Path, Exception, OnErrorResult> $onError;
    final /* synthetic */ ArrayList<Path> $stack;
    final /* synthetic */ Path $target;
    final /* synthetic */ Path $this_copyToRecursively;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$2(ArrayList<Path> arrayList, w1a<Object, ? super Path, ? super Path, ? extends CopyActionResult> w1aVar, Path path, Path path2, Path path3, w1a<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> w1aVar2) {
        super(2, ckf.a.class, "copy", "copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;", 0);
        this.$stack = arrayList;
        this.$copyAction = w1aVar;
        this.$this_copyToRecursively = path;
        this.$target = path2;
        this.$normalizedTarget = path3;
        this.$onError = w1aVar2;
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ FileVisitResult invoke(Path path, BasicFileAttributes basicFileAttributes) {
        return invoke2(ge9.a(path), le9.a(basicFileAttributes));
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final FileVisitResult invoke2(Path path, BasicFileAttributes basicFileAttributes) {
        FileVisitResult e;
        ckf.g(path, "p0");
        ckf.g(basicFileAttributes, p1.d);
        e = hvl.e(this.$stack, this.$copyAction, this.$this_copyToRecursively, this.$target, this.$normalizedTarget, this.$onError, path, basicFileAttributes);
        return e;
    }
}
