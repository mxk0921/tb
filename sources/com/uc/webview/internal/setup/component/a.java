package com.uc.webview.internal.setup.component;

import android.text.TextUtils;
import com.uc.webview.base.EnvInfo;
import com.uc.webview.base.h;
import com.uc.webview.base.io.PathUtils;
import com.uc.webview.internal.setup.component.d;
import com.uc.webview.internal.setup.component.g;
import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f14383a;

    static {
        String str;
        if (EnvInfo.is64Bit()) {
            str = "Arm64";
        } else {
            str = "Arm32";
        }
        f14383a = "U4BaseCache0".concat(str);
    }

    public static String a(f fVar) {
        File h = PathUtils.h(EnvInfo.getContext());
        return new File(h, f14383a + "-" + fVar.i + "-" + fVar.j).getAbsolutePath();
    }

    private static f b(g.a aVar) {
        File[] listFiles;
        File h = PathUtils.h(EnvInfo.getContext());
        if (!h.exists() || !h.isDirectory() || (listFiles = h.listFiles(new FilenameFilter() { // from class: com.uc.webview.internal.setup.component.a.1
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return str.startsWith("U4BaseCache0");
            }
        })) == null || listFiles.length == 0) {
            return null;
        }
        String str = f14383a;
        String a2 = h.a(str, "");
        if (!TextUtils.isEmpty(a2)) {
            File file = new File(h, a2);
            if (!file.exists()) {
                aVar.a(-277, new d.C0841d(a2));
            } else if (file.isDirectory() && !b(file).exists()) {
                aVar.a(-278, new d.C0841d(a2));
            }
            try {
                h.a().a(str, "").a();
            } catch (Throwable unused) {
            }
            a2 = null;
        }
        for (File file2 : listFiles) {
            try {
                if (TextUtils.isEmpty(a2) || !a2.equals(file2.getName())) {
                    file2.getName();
                    if (file2.isDirectory()) {
                        com.uc.webview.base.io.d.a("U4Patch", file2);
                    } else {
                        file2.delete();
                    }
                }
            } catch (Throwable unused2) {
            }
        }
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        File file3 = new File(h, a2);
        f fVar = new f(a2);
        fVar.c = file3;
        return fVar;
    }

    public static n a(g.a aVar) {
        f b = b(aVar);
        if (b == null) {
            return null;
        }
        return new n(new p(f14383a, 99), b, false, false);
    }

    public static void a(File file) {
        try {
            h.a().a(f14383a, file.getName()).a();
            if (file.isDirectory()) {
                b(file).createNewFile();
            }
        } catch (Throwable unused) {
        }
    }

    private static File b(File file) {
        return new File(file, Long.toString(y.a(file)));
    }
}
