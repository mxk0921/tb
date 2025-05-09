package com.uc.webview.base;

import android.os.Build;
import com.android.alibaba.ip.server.FileManager;
import com.uc.webview.base.io.PathUtils;
import com.uc.webview.base.io.d;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.lang.reflect.Constructor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class i extends DexClassLoader {
    private i(String str, String str2, String str3, ClassLoader classLoader) {
        super(a(str, str2), str2, str3, classLoader);
        a(str, str2, false);
    }

    public static ClassLoader a(File file, File file2, File file3, ClassLoader classLoader) {
        String absolutePath = file.getAbsolutePath();
        String absolutePath2 = file2.getAbsolutePath();
        String absolutePath3 = file3.getAbsolutePath();
        ClassLoader a2 = a(absolutePath, absolutePath2, absolutePath3, classLoader);
        return a2 == null ? new i(absolutePath, absolutePath2, absolutePath3, classLoader) : a2;
    }

    @Override // java.lang.ClassLoader
    public Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
        Class<?> findLoadedClass = findLoadedClass(str);
        if (findLoadedClass != null) {
            return findLoadedClass;
        }
        try {
            try {
                return Object.class.getClassLoader().loadClass(str);
            } catch (ClassNotFoundException e) {
                try {
                    return getParent().loadClass(str);
                } catch (ClassNotFoundException unused) {
                    throw e;
                }
            }
        } catch (ClassNotFoundException unused2) {
            return findClass(str);
        }
    }

    private static ClassLoader a(String str, String str2, String str3, ClassLoader classLoader) {
        if (Build.VERSION.SDK_INT < 27 || !GlobalSettings.getBoolValue(79)) {
            return null;
        }
        try {
            Constructor<?> constructor = Class.forName("dalvik.system.DelegateLastClassLoader", true, i.class.getClassLoader()).getConstructor(String.class, String.class, ClassLoader.class);
            constructor.setAccessible(true);
            return (ClassLoader) constructor.newInstance(a(str, str2), str3, classLoader);
        } catch (Throwable th) {
            Log.w("UCLoader", "failed", th);
            return null;
        }
    }

    private static String a(String str, String str2, boolean z) {
        if (Build.VERSION.SDK_INT == 21) {
            for (String str3 : str.split(":")) {
                String name = new File(str3).getName();
                if (!name.endsWith(FileManager.CLASSES_DEX_SUFFIX)) {
                    int lastIndexOf = name.lastIndexOf(".");
                    if (lastIndexOf < 0) {
                        name = name.concat(FileManager.CLASSES_DEX_SUFFIX);
                    } else {
                        StringBuilder sb = new StringBuilder(lastIndexOf + 4);
                        sb.append((CharSequence) name, 0, lastIndexOf);
                        sb.append(FileManager.CLASSES_DEX_SUFFIX);
                        name = sb.toString();
                    }
                }
                File file = new File(str2, name);
                if (file.exists()) {
                    File file2 = new File(str2, PathUtils.generateName(file));
                    if (!file2.exists()) {
                        if (z) {
                            d.c("UCLoader", file);
                        } else {
                            d.b("UCLoader", file2);
                        }
                    }
                }
            }
        }
        if (z) {
            File file3 = new File(str2);
            if (Build.VERSION.SDK_INT == 29 && "vivo".equalsIgnoreCase(Build.MANUFACTURER)) {
                File file4 = new File(file3, "oat");
                Log.rInfo("UCLoader", "maybeCleanOptimizedFile 2 odexDir:".concat(String.valueOf(file4)));
                if (file4.isDirectory()) {
                    d.a("UCLoader", file4);
                }
            }
        }
        return str;
    }

    private static String a(String str, String str2) {
        a(str, str2, true);
        int i = Build.VERSION.SDK_INT;
        if (i == 30 || i == 31 || i == 32) {
            return j.a(str);
        }
        if (i < 34) {
            return str;
        }
        try {
            new File(str).setReadOnly();
            return str;
        } catch (Throwable unused) {
            return str;
        }
    }
}
