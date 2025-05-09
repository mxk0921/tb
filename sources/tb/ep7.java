package tb;

import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class ep7 extends SimpleFileVisitor<Path> {
    public FileVisitResult a(Path path, BasicFileAttributes basicFileAttributes) {
        Object fileKey;
        ckf.g(path, "dir");
        ckf.g(basicFileAttributes, "attrs");
        fileKey = basicFileAttributes.fileKey();
        new gul(path, fileKey, null);
        throw null;
    }

    public FileVisitResult b(Path path, BasicFileAttributes basicFileAttributes) {
        ckf.g(path, "file");
        ckf.g(basicFileAttributes, "attrs");
        new gul(path, null, null);
        throw null;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
        return a(ge9.a(obj), basicFileAttributes);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        return b(ge9.a(obj), basicFileAttributes);
    }
}
