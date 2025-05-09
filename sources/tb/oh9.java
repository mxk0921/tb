package tb;

import java.io.File;
import kotlin.io.FileWalkDirection;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class oh9 extends nh9 {
    public static final fe9 d(File file, FileWalkDirection fileWalkDirection) {
        ckf.g(file, "<this>");
        ckf.g(fileWalkDirection, "direction");
        return new fe9(file, fileWalkDirection);
    }

    public static final fe9 e(File file) {
        ckf.g(file, "<this>");
        return d(file, FileWalkDirection.BOTTOM_UP);
    }
}
