package tb;

import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class iqg {
    public static final iqg INSTANCE = new iqg();

    static {
        FileVisitOption fileVisitOption;
        LinkOption unused;
        LinkOption[] linkOptionArr = new LinkOption[1];
        unused = LinkOption.NOFOLLOW_LINKS;
        LinkOption[] linkOptionArr2 = new LinkOption[0];
        kfp.d();
        fileVisitOption = FileVisitOption.FOLLOW_LINKS;
        jfp.c(fileVisitOption);
    }
}
