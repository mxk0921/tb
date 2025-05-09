package tb;

import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.Paths;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class oul {
    public static final oul INSTANCE = new oul();

    /* renamed from: a  reason: collision with root package name */
    public static final Path f25664a;
    public static final Path b;

    static {
        Path path;
        Path path2;
        path = Paths.get("", new String[0]);
        f25664a = path;
        path2 = Paths.get("..", new String[0]);
        b = path2;
    }

    public final Path a(Path path, Path path2) {
        Path normalize;
        Path normalize2;
        Path relativize;
        int nameCount;
        int nameCount2;
        FileSystem fileSystem;
        String separator;
        FileSystem fileSystem2;
        FileSystem fileSystem3;
        String separator2;
        Path name;
        Path name2;
        ckf.g(path, "path");
        ckf.g(path2, "base");
        normalize = path2.normalize();
        normalize2 = path.normalize();
        relativize = normalize.relativize(normalize2);
        nameCount = normalize.getNameCount();
        nameCount2 = normalize2.getNameCount();
        int min = Math.min(nameCount, nameCount2);
        for (int i = 0; i < min; i++) {
            name = normalize.getName(i);
            Path path3 = b;
            if (!ckf.b(name, path3)) {
                break;
            }
            name2 = normalize2.getName(i);
            if (!ckf.b(name2, path3)) {
                throw new IllegalArgumentException("Unable to compute relative path");
            }
        }
        if (ckf.b(normalize2, normalize) || !ckf.b(normalize, f25664a)) {
            String obj = relativize.toString();
            fileSystem = relativize.getFileSystem();
            separator = fileSystem.getSeparator();
            ckf.f(separator, "getSeparator(...)");
            if (tsq.w(obj, separator, false, 2, null)) {
                fileSystem2 = relativize.getFileSystem();
                fileSystem3 = relativize.getFileSystem();
                separator2 = fileSystem3.getSeparator();
                normalize2 = fileSystem2.getPath(ysq.U0(obj, separator2.length()), new String[0]);
            } else {
                normalize2 = relativize;
            }
        }
        ckf.d(normalize2);
        return normalize2;
    }
}
