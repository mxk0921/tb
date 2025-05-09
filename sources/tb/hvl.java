package tb;

import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.io.path.CopyActionResult;
import kotlin.io.path.IllegalFileNameException;
import kotlin.io.path.OnErrorResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class hvl extends cvl {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CopyActionResult.values().length];
            try {
                iArr[CopyActionResult.CONTINUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CopyActionResult.TERMINATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CopyActionResult.SKIP_SUBTREE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OnErrorResult.values().length];
            try {
                iArr2[OnErrorResult.TERMINATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OnErrorResult.SKIP_SUBTREE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final void c(Path path) {
        ckf.g(path, "<this>");
        String j = ivl.j(path);
        int hashCode = j.hashCode();
        if (hashCode != 46) {
            if (hashCode != 1518) {
                if (hashCode != 45679) {
                    if (hashCode != 45724) {
                        if (hashCode != 1472) {
                            if (hashCode != 1473 || !j.equals("./")) {
                                return;
                            }
                        } else if (!j.equals("..")) {
                            return;
                        }
                    } else if (!j.equals("..\\")) {
                        return;
                    }
                } else if (!j.equals("../")) {
                    return;
                }
            } else if (!j.equals(".\\")) {
                return;
            }
        } else if (!j.equals(".")) {
            return;
        }
        throw new IllegalFileNameException(path);
    }

    public static final void d(Path path, Path path2) {
        boolean isSymbolicLink;
        boolean isSameFile;
        isSymbolicLink = Files.isSymbolicLink(path);
        if (!isSymbolicLink) {
            isSameFile = Files.isSameFile(path, path2);
            if (isSameFile) {
                qe9.a();
                throw pe9.a(path.toString());
            }
        }
    }

    public static final FileVisitResult e(ArrayList<Path> arrayList, w1a<Object, ? super Path, ? super Path, ? extends CopyActionResult> w1aVar, Path path, Path path2, Path path3, w1a<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> w1aVar2, Path path4, BasicFileAttributes basicFileAttributes) {
        try {
            if (!arrayList.isEmpty()) {
                c(path4);
                Object l0 = i04.l0(arrayList);
                ckf.f(l0, "last(...)");
                d(path4, ge9.a(l0));
            }
            return h((CopyActionResult) w1aVar.invoke(b07.INSTANCE, path4, f(path, path2, path3, path4)));
        } catch (Exception e) {
            return g(w1aVar2, path, path2, path3, path4, e);
        }
    }

    public static final Path f(Path path, Path path2, Path path3, Path path4) {
        Path resolve;
        Path normalize;
        boolean startsWith;
        resolve = path2.resolve(ivl.k(path4, path).toString());
        normalize = resolve.normalize();
        startsWith = normalize.startsWith(path3);
        if (startsWith) {
            return resolve;
        }
        throw new IllegalFileNameException(path4, resolve, "Copying files to outside the specified target directory is prohibited. The directory being recursively copied might contain an entry with an illegal name.");
    }

    public static final FileVisitResult g(w1a<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> w1aVar, Path path, Path path2, Path path3, Path path4, Exception exc) {
        return i((OnErrorResult) w1aVar.invoke(path4, f(path, path2, path3, path4), exc));
    }

    public static final FileVisitResult h(CopyActionResult copyActionResult) {
        FileVisitResult fileVisitResult;
        FileVisitResult fileVisitResult2;
        FileVisitResult fileVisitResult3;
        int i = a.$EnumSwitchMapping$0[copyActionResult.ordinal()];
        if (i == 1) {
            fileVisitResult = FileVisitResult.CONTINUE;
            return fileVisitResult;
        } else if (i == 2) {
            fileVisitResult2 = FileVisitResult.TERMINATE;
            return fileVisitResult2;
        } else if (i == 3) {
            fileVisitResult3 = FileVisitResult.SKIP_SUBTREE;
            return fileVisitResult3;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final FileVisitResult i(OnErrorResult onErrorResult) {
        FileVisitResult fileVisitResult;
        FileVisitResult fileVisitResult2;
        int i = a.$EnumSwitchMapping$1[onErrorResult.ordinal()];
        if (i == 1) {
            fileVisitResult = FileVisitResult.TERMINATE;
            return fileVisitResult;
        } else if (i == 2) {
            fileVisitResult2 = FileVisitResult.SKIP_SUBTREE;
            return fileVisitResult2;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
