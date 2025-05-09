package tb;

import java.io.File;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ph9 extends oh9 {
    public static boolean f(File file) {
        ckf.g(file, "<this>");
        Iterator<File> it = oh9.e(file).iterator();
        while (true) {
            boolean z = true;
            while (true) {
                y10 y10Var = (y10) it;
                if (!y10Var.hasNext()) {
                    return z;
                }
                File file2 = (File) y10Var.next();
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                        break;
                    }
                }
                z = false;
            }
        }
    }

    public static String g(File file) {
        ckf.g(file, "<this>");
        String name = file.getName();
        ckf.f(name, "getName(...)");
        return wsq.J0(name, '.', "");
    }
}
