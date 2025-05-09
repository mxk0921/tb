package com.android.alibaba.ip.server;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.ArrayMap;
import android.util.LongSparseArray;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.alibaba.ip.utils.RefectUtils;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MonkeyPatcher {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Object activityThread = null;

    static {
        t2o.a(493879332);
    }

    private static void closeQuitely(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26215439", new Object[]{closeable});
        } else if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    private static void write(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f364a8a6", new Object[]{inputStream, outputStream, bArr});
            return;
        }
        int read = inputStream.read(bArr);
        while (read != -1) {
            outputStream.write(bArr, 0, read);
            read = inputStream.read(bArr);
        }
        closeQuitely(inputStream);
    }

    public static Object getActivityThread(Context context, Class<?> cls) {
        try {
            Object obj = activityThread;
            if (obj != null) {
                return obj;
            }
            if (cls == null) {
                cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            }
            Method method = cls.getMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
            method.setAccessible(true);
            Object invoke = method.invoke(null, new Object[0]);
            if (invoke != null) {
                activityThread = invoke;
            }
            if (invoke != null || context == null) {
                return invoke;
            }
            Field field = context.getClass().getField("mLoadedApk");
            field.setAccessible(true);
            Object obj2 = field.get(context);
            Field declaredField = obj2.getClass().getDeclaredField("mActivityThread");
            declaredField.setAccessible(true);
            Object obj3 = declaredField.get(obj2);
            activityThread = obj3;
            return obj3;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void pruneResourceCaches(Object obj) {
        Object obj2;
        try {
            Field declaredField = Resources.class.getDeclaredField("mTypedArrayPool");
            declaredField.setAccessible(true);
            Object obj3 = declaredField.get(obj);
            Method declaredMethod = obj3.getClass().getDeclaredMethod("acquire", new Class[0]);
            declaredMethod.setAccessible(true);
            do {
            } while (declaredMethod.invoke(obj3, new Object[0]) != null);
        } catch (Throwable unused) {
        }
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                Field declaredField2 = Resources.class.getDeclaredField("mResourcesImpl");
                declaredField2.setAccessible(true);
                obj = declaredField2.get(obj);
            } catch (Throwable unused2) {
            }
        }
        try {
            Field declaredField3 = obj.getClass().getDeclaredField("mAccessLock");
            declaredField3.setAccessible(true);
            obj2 = declaredField3.get(obj);
        } catch (Throwable unused3) {
            obj2 = null;
        }
        if (obj2 == null) {
            obj2 = MonkeyPatcher.class;
        }
        synchronized (obj2) {
            try {
                pruneResourceCache(obj, "mDrawableCache");
                pruneResourceCache(obj, "mColorDrawableCache");
                pruneResourceCache(obj, "mColorStateListCache");
                if (Build.VERSION.SDK_INT >= 23) {
                    pruneResourceCache(obj, "mAnimatorCache");
                    pruneResourceCache(obj, "mStateListAnimatorCache");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean pruneResourceCache(Object obj, String str) {
        LongSparseArray[] longSparseArrayArr;
        try {
            Field field = RefectUtils.field(obj, str);
            if (field == null) {
                field = Resources.class.getDeclaredField(str);
            }
            field.setAccessible(true);
            Object obj2 = field.get(obj);
            Class<?> type = field.getType();
            if (Build.VERSION.SDK_INT < 23) {
                if ("mColorStateListCache".equals(str)) {
                    if (obj2 instanceof LongSparseArray) {
                        ((LongSparseArray) obj2).clear();
                    }
                } else if (type.isAssignableFrom(ArrayMap.class)) {
                    Method declaredMethod = Resources.class.getDeclaredMethod("clearDrawableCachesLocked", ArrayMap.class, Integer.TYPE);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(obj, obj2, -1);
                    return true;
                } else if (type.isAssignableFrom(LongSparseArray.class)) {
                    try {
                        Method declaredMethod2 = Resources.class.getDeclaredMethod("clearDrawableCachesLocked", LongSparseArray.class, Integer.TYPE);
                        declaredMethod2.setAccessible(true);
                        declaredMethod2.invoke(obj, obj2, -1);
                        return true;
                    } catch (NoSuchMethodException unused) {
                        if (obj2 instanceof LongSparseArray) {
                            ((LongSparseArray) obj2).clear();
                            return true;
                        }
                    }
                } else if (type.isArray() && type.getComponentType().isAssignableFrom(LongSparseArray.class)) {
                    for (LongSparseArray longSparseArray : (LongSparseArray[]) obj2) {
                        if (longSparseArray != null) {
                            longSparseArray.clear();
                        }
                    }
                    return true;
                }
            } else if (type != null) {
                Method declaredMethod3 = type.getDeclaredMethod("onConfigurationChange", Integer.TYPE);
                declaredMethod3.setAccessible(true);
                declaredMethod3.invoke(obj2, -1);
                return true;
            }
        } catch (Throwable unused2) {
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042 A[Catch: all -> 0x001b, TryCatch #5 {all -> 0x001b, blocks: (B:5:0x000e, B:6:0x0014, B:9:0x001f, B:10:0x0025, B:12:0x0042, B:14:0x004b, B:16:0x0051, B:17:0x0059, B:18:0x005d, B:20:0x0061, B:21:0x0077, B:23:0x007d, B:26:0x0090, B:28:0x00a0, B:30:0x00a6, B:31:0x00ab, B:33:0x00dc, B:35:0x00ef, B:36:0x00f2, B:37:0x010c, B:38:0x0121, B:39:0x0132, B:40:0x0136, B:42:0x013c, B:46:0x0170, B:48:0x017e, B:54:0x018e, B:55:0x0195, B:44:0x014a), top: B:62:0x000e, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051 A[Catch: all -> 0x001b, TryCatch #5 {all -> 0x001b, blocks: (B:5:0x000e, B:6:0x0014, B:9:0x001f, B:10:0x0025, B:12:0x0042, B:14:0x004b, B:16:0x0051, B:17:0x0059, B:18:0x005d, B:20:0x0061, B:21:0x0077, B:23:0x007d, B:26:0x0090, B:28:0x00a0, B:30:0x00a6, B:31:0x00ab, B:33:0x00dc, B:35:0x00ef, B:36:0x00f2, B:37:0x010c, B:38:0x0121, B:39:0x0132, B:40:0x0136, B:42:0x013c, B:46:0x0170, B:48:0x017e, B:54:0x018e, B:55:0x0195, B:44:0x014a), top: B:62:0x000e, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059 A[Catch: all -> 0x001b, TryCatch #5 {all -> 0x001b, blocks: (B:5:0x000e, B:6:0x0014, B:9:0x001f, B:10:0x0025, B:12:0x0042, B:14:0x004b, B:16:0x0051, B:17:0x0059, B:18:0x005d, B:20:0x0061, B:21:0x0077, B:23:0x007d, B:26:0x0090, B:28:0x00a0, B:30:0x00a6, B:31:0x00ab, B:33:0x00dc, B:35:0x00ef, B:36:0x00f2, B:37:0x010c, B:38:0x0121, B:39:0x0132, B:40:0x0136, B:42:0x013c, B:46:0x0170, B:48:0x017e, B:54:0x018e, B:55:0x0195, B:44:0x014a), top: B:62:0x000e, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[Catch: all -> 0x001b, TryCatch #5 {all -> 0x001b, blocks: (B:5:0x000e, B:6:0x0014, B:9:0x001f, B:10:0x0025, B:12:0x0042, B:14:0x004b, B:16:0x0051, B:17:0x0059, B:18:0x005d, B:20:0x0061, B:21:0x0077, B:23:0x007d, B:26:0x0090, B:28:0x00a0, B:30:0x00a6, B:31:0x00ab, B:33:0x00dc, B:35:0x00ef, B:36:0x00f2, B:37:0x010c, B:38:0x0121, B:39:0x0132, B:40:0x0136, B:42:0x013c, B:46:0x0170, B:48:0x017e, B:54:0x018e, B:55:0x0195, B:44:0x014a), top: B:62:0x000e, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018e A[Catch: all -> 0x001b, TRY_ENTER, TryCatch #5 {all -> 0x001b, blocks: (B:5:0x000e, B:6:0x0014, B:9:0x001f, B:10:0x0025, B:12:0x0042, B:14:0x004b, B:16:0x0051, B:17:0x0059, B:18:0x005d, B:20:0x0061, B:21:0x0077, B:23:0x007d, B:26:0x0090, B:28:0x00a0, B:30:0x00a6, B:31:0x00ab, B:33:0x00dc, B:35:0x00ef, B:36:0x00f2, B:37:0x010c, B:38:0x0121, B:39:0x0132, B:40:0x0136, B:42:0x013c, B:46:0x0170, B:48:0x017e, B:54:0x018e, B:55:0x0195, B:44:0x014a), top: B:62:0x000e, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void monkeyPatchExistingResources(android.content.Context r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.alibaba.ip.server.MonkeyPatcher.monkeyPatchExistingResources(android.content.Context, java.lang.String):void");
    }

    public static void mergeResFile(File file, String str) throws IOException {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c80ec", new Object[]{file, str});
            return;
        }
        File createTempFile = File.createTempFile(VideoControllerManager.ARRAY_KEY_RESOURCES, null, new File(str).getParentFile());
        byte[] bArr = new byte[1024];
        ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(zipOutputStream);
        ZipFile zipFile = new ZipFile(file);
        ZipFile zipFile2 = new ZipFile(str);
        HashSet hashSet = new HashSet();
        Enumeration<? extends ZipEntry> entries = zipFile2.entries();
        while (true) {
            str2 = "resources.arsc";
            if (!entries.hasMoreElements()) {
                break;
            }
            ZipEntry zipEntry = (ZipEntry) entries.nextElement();
            String name = zipEntry.getName();
            if (!name.contains("../") && !zipEntry.getName().endsWith(FileManager.CLASSES_DEX_SUFFIX) && !zipEntry.isDirectory()) {
                hashSet.add(zipEntry.getName());
                ZipEntry zipEntry2 = new ZipEntry(name);
                if (name.contains("raw/") || name.contains("assets/") || name.equals(str2)) {
                    zipEntry2.setMethod(0);
                    zipEntry2.setCrc(zipEntry.getCrc());
                    zipEntry2.setSize(zipEntry.getSize());
                }
                zipOutputStream.putNextEntry(zipEntry2);
                write(zipFile2.getInputStream(zipEntry), zipOutputStream, bArr);
                bufferedOutputStream.flush();
            }
        }
        Enumeration<? extends ZipEntry> entries2 = zipFile.entries();
        while (entries2.hasMoreElements()) {
            ZipEntry zipEntry3 = (ZipEntry) entries2.nextElement();
            String name2 = zipEntry3.getName();
            if (!name2.contains("../") && !name2.endsWith(FileManager.CLASSES_DEX_SUFFIX)) {
                if (hashSet.contains(zipEntry3.getName())) {
                    entries2 = entries2;
                } else {
                    ZipEntry zipEntry4 = new ZipEntry(name2);
                    if (name2.contains("raw/") || name2.contains("assets/") || name2.equals(str2)) {
                        zipEntry4.setMethod(0);
                        str2 = str2;
                        zipEntry4.setCrc(zipEntry3.getCrc());
                        zipEntry4.setSize(zipEntry3.getSize());
                    } else {
                        str2 = str2;
                    }
                    zipOutputStream.putNextEntry(zipEntry4);
                    write(zipFile.getInputStream(zipEntry3), zipOutputStream, bArr);
                    bufferedOutputStream.flush();
                    entries2 = entries2;
                }
            }
        }
        zipFile.close();
        zipFile2.close();
        closeQuitely(zipOutputStream);
        closeQuitely(bufferedOutputStream);
        if (createTempFile.exists()) {
            new File(str).delete();
            createTempFile.renameTo(new File(str));
        }
        if (!new File(str).exists()) {
            throw new IOException("merge resource patch failed");
        }
    }
}
