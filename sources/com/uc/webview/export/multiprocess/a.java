package com.uc.webview.export.multiprocess;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.uc.webview.export.multiprocess.helper.c;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.DexFile;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
class a extends BaseDexClassLoader {

    /* renamed from: a  reason: collision with root package name */
    private DexFile f14331a;

    public static ClassLoader a(String str, String str2, String str3, ClassLoader classLoader, ParcelFileDescriptor parcelFileDescriptor, String str4, DexFile dexFile, boolean z) throws Throwable {
        ClassLoader a2 = a(str, str3, classLoader, parcelFileDescriptor, z);
        return a2 == null ? new a(str, str2, str3, classLoader, parcelFileDescriptor, str4, dexFile) : a2;
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public Class<?> findClass(String str) throws ClassNotFoundException {
        Class<?> loadClass;
        DexFile dexFile = this.f14331a;
        if (dexFile == null || (loadClass = dexFile.loadClass(str, this)) == null) {
            return super.findClass(str);
        }
        return loadClass;
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public String findLibrary(String str) {
        String findLibrary = super.findLibrary(str);
        if (findLibrary != null || !(getParent() instanceof BaseDexClassLoader)) {
            return findLibrary;
        }
        return ((BaseDexClassLoader) getParent()).findLibrary(str);
    }

    @Override // java.lang.ClassLoader
    public Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
        Class cls;
        DexFile dexFile = this.f14331a;
        if (dexFile != null) {
            cls = dexFile.loadClass(str, this);
        } else {
            cls = findLoadedClass(str);
        }
        if (cls != null) {
            return cls;
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

    private static ClassLoader a(String str, String str2, ClassLoader classLoader, ParcelFileDescriptor parcelFileDescriptor, boolean z) {
        if (parcelFileDescriptor != null || Build.VERSION.SDK_INT < 27 || !z) {
            return null;
        }
        try {
            Constructor<?> constructor = Class.forName("dalvik.system.DelegateLastClassLoader", true, a.class.getClassLoader()).getConstructor(String.class, String.class, ClassLoader.class);
            constructor.setAccessible(true);
            a(str);
            return (ClassLoader) constructor.newInstance(str, str2, classLoader);
        } catch (Throwable th) {
            c.a("UCMPLoader", "failed", th);
            return null;
        }
    }

    private a(String str, String str2, String str3, ClassLoader classLoader, ParcelFileDescriptor parcelFileDescriptor, String str4, DexFile dexFile) throws Throwable {
        super(a(parcelFileDescriptor != null ? str4 : str), parcelFileDescriptor == null ? new File(str2) : null, str3, classLoader);
        if (parcelFileDescriptor != null) {
            dexFile = dexFile == null ? new DexFile(str4) : dexFile;
            Object loadDexByFd = DexLoader.loadDexByFd(parcelFileDescriptor.detachFd());
            if (loadDexByFd != null) {
                Field declaredField = dexFile.getClass().getDeclaredField("mCookie");
                declaredField.setAccessible(true);
                declaredField.set(dexFile, loadDexByFd);
                this.f14331a = dexFile;
                return;
            }
            throw new Exception("cannot load DexFile!");
        }
    }

    private static String a(String str) {
        if (Build.VERSION.SDK_INT >= 34 && !TextUtils.isEmpty(str)) {
            try {
                new File(str).setReadOnly();
            } catch (Throwable unused) {
            }
        }
        return str;
    }
}
