package tb;

import java.nio.file.Path;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ivl extends hvl {
    public static final String j(Path path) {
        Path fileName;
        String str;
        ckf.g(path, "<this>");
        fileName = path.getFileName();
        if (fileName != null) {
            str = fileName.toString();
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public static final Path k(Path path, Path path2) {
        ckf.g(path, "<this>");
        ckf.g(path2, "base");
        try {
            return oul.INSTANCE.a(path, path2);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "\nthis path: " + path + "\nbase path: " + path2, e);
        }
    }
}
