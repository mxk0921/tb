package com.alibaba.android.split.core.internal;

import android.content.pm.PackageManager;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.acq;
import tb.jcq;
import tb.n1r;
import tb.ocq;
import tb.qdq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ApkLoaderV29 implements ApkLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DEX_SUFFIX = ".dex";
    private static final String ODEX_SUFFIX = ".odex";
    private static final String PM_INTERFACE_DESCRIPTOR = "android.content.pm.IPackageManager";
    private static qdq sLogger = new qdq("ApkLoaderV29");

    static {
        t2o.a(677380118);
        t2o.a(676331574);
    }

    public static /* synthetic */ qdq access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qdq) ipChange.ipc$dispatch("ab35ad75", new Object[0]);
        }
        return sLogger;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.nio.ByteBuffer allocate(java.io.File r9) {
        /*
            r8 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = com.alibaba.android.split.core.internal.ApkLoaderV29.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0018
            java.lang.String r2 = "b26ff17c"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r8
            r0 = 1
            r3[r0] = r9
            java.lang.Object r9 = r1.ipc$dispatch(r2, r3)
            java.nio.ByteBuffer r9 = (java.nio.ByteBuffer) r9
            return r9
        L_0x0018:
            r1 = 0
            java.util.zip.ZipFile r2 = new java.util.zip.ZipFile     // Catch: all -> 0x006a, Exception -> 0x006d
            r2.<init>(r9)     // Catch: all -> 0x006a, Exception -> 0x006d
            java.lang.String r9 = "classes.dex"
            java.util.zip.ZipEntry r9 = r2.getEntry(r9)     // Catch: all -> 0x0064, Exception -> 0x0067
            java.io.InputStream r9 = r2.getInputStream(r9)     // Catch: all -> 0x0064, Exception -> 0x0067
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: all -> 0x003c, Exception -> 0x003f
            r3.<init>()     // Catch: all -> 0x003c, Exception -> 0x003f
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r4]     // Catch: all -> 0x003c, Exception -> 0x003f
        L_0x0031:
            int r6 = r9.read(r5, r0, r4)     // Catch: all -> 0x003c, Exception -> 0x003f
            r7 = -1
            if (r6 == r7) goto L_0x0041
            r3.write(r5, r0, r6)     // Catch: all -> 0x003c, Exception -> 0x003f
            goto L_0x0031
        L_0x003c:
            r0 = move-exception
        L_0x003d:
            r1 = r2
            goto L_0x0088
        L_0x003f:
            r0 = move-exception
            goto L_0x0070
        L_0x0041:
            r3.flush()     // Catch: all -> 0x003c, Exception -> 0x003f
            byte[] r3 = r3.toByteArray()     // Catch: all -> 0x003c, Exception -> 0x003f
            int r4 = r3.length     // Catch: all -> 0x003c, Exception -> 0x003f
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)     // Catch: all -> 0x003c, Exception -> 0x003f
            r4.put(r3)     // Catch: all -> 0x003c, Exception -> 0x003f
            r4.position(r0)     // Catch: all -> 0x003c, Exception -> 0x003f
            r2.close()     // Catch: IOException -> 0x0057
            goto L_0x005b
        L_0x0057:
            r0 = move-exception
            r0.printStackTrace()
        L_0x005b:
            r9.close()     // Catch: IOException -> 0x005f
            goto L_0x0063
        L_0x005f:
            r9 = move-exception
            r9.printStackTrace()
        L_0x0063:
            return r4
        L_0x0064:
            r0 = move-exception
            r9 = r1
            goto L_0x003d
        L_0x0067:
            r0 = move-exception
            r9 = r1
            goto L_0x0070
        L_0x006a:
            r0 = move-exception
            r9 = r1
            goto L_0x0088
        L_0x006d:
            r0 = move-exception
            r9 = r1
            r2 = r9
        L_0x0070:
            r0.printStackTrace()     // Catch: all -> 0x003c
            if (r2 == 0) goto L_0x007d
            r2.close()     // Catch: IOException -> 0x0079
            goto L_0x007d
        L_0x0079:
            r0 = move-exception
            r0.printStackTrace()
        L_0x007d:
            if (r9 == 0) goto L_0x0087
            r9.close()     // Catch: IOException -> 0x0083
            goto L_0x0087
        L_0x0083:
            r9 = move-exception
            r9.printStackTrace()
        L_0x0087:
            return r1
        L_0x0088:
            if (r1 == 0) goto L_0x0092
            r1.close()     // Catch: IOException -> 0x008e
            goto L_0x0092
        L_0x008e:
            r1 = move-exception
            r1.printStackTrace()
        L_0x0092:
            if (r9 == 0) goto L_0x009c
            r9.close()     // Catch: IOException -> 0x0098
            goto L_0x009c
        L_0x0098:
            r9 = move-exception
            r9.printStackTrace()
        L_0x009c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.split.core.internal.ApkLoaderV29.allocate(java.io.File):java.nio.ByteBuffer");
    }

    private static String optimizedPathFor(File file, File file2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("186f88ee", new Object[]{file, file2});
        }
        String name = file.getName();
        if (!name.endsWith(".dex")) {
            int lastIndexOf = name.lastIndexOf(".");
            if (lastIndexOf < 0) {
                name = name.concat(".odex");
            } else {
                StringBuilder sb = new StringBuilder(lastIndexOf + 4);
                sb.append((CharSequence) name, 0, lastIndexOf);
                sb.append(".odex");
                name = sb.toString();
            }
        }
        return new File(file2, name).getPath();
    }

    @Override // com.alibaba.android.split.core.internal.ApkLoader
    public boolean loadDex(ClassLoader classLoader, File file, ocq ocqVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe27e46a", new Object[]{this, classLoader, file, ocqVar, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        if (z && z2) {
            return performDexOptSecondary(ocqVar.c());
        }
        boolean injectDexElements = ApkLoaderV21.injectDexElements(classLoader, file, ocqVar, z, new V24DexElementsMaker(), "path", new SkipDexOpter(), z2);
        performDexOptSecondary(ocqVar.c());
        return injectDexElements;
    }

    @Override // com.alibaba.android.split.core.internal.ApkLoader
    public void loadNativeLib(ClassLoader classLoader, Set<File> set, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a833250", new Object[]{this, classLoader, set, new Boolean(z)});
        } else {
            ApkLoaderV26.innerLoad(classLoader, set, z);
        }
    }

    public static boolean performDexOptSecondary(File file) throws IllegalStateException {
        if (file.getName().equals("com_taobao_plugin.apk")) {
            PackageManager packageManager = acq.p().o().getPackageManager();
            try {
                final boolean[] zArr = {false};
                Method declaredMethod = packageManager.getClass().getDeclaredMethod("registerDexModule", String.class, Class.forName("android.content.pm.PackageManager$DexModuleRegisterCallback"));
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                declaredMethod.invoke(packageManager, file.getAbsolutePath(), new PackageManager.DexModuleRegisterCallback() { // from class: com.alibaba.android.split.core.internal.ApkLoaderV29.1
                    public void onDexModuleRegistered(String str, boolean z, String str2) {
                        if (z) {
                            zArr[0] = true;
                            Log.e("ApkLoaderV30", "registerDexModule success");
                            ApkLoaderV29.access$000().c("registerDexModule success", new Object[0]);
                        } else {
                            Log.e("ApkLoaderV30", "registerDexModule failed! dexModulePath:" + str + " message:" + str2);
                            ApkLoaderV29.access$000().c("registerDexModule failed! dexModulePath: %s message:%s", str, str2);
                        }
                        countDownLatch.countDown();
                    }
                });
                if (countDownLatch.await(30L, TimeUnit.SECONDS)) {
                    return zArr[0];
                }
                return false;
            } catch (Exception e) {
                e.printStackTrace();
                return true;
            }
        } else {
            if (n1r.s(acq.p().o(), jcq.G(file.getName()))) {
                PackageManager packageManager2 = acq.p().o().getPackageManager();
                try {
                    packageManager2.getClass().getDeclaredMethod("registerDexModule", String.class, Class.forName("android.content.pm.PackageManager$DexModuleRegisterCallback")).invoke(packageManager2, file.getAbsolutePath(), new PackageManager.DexModuleRegisterCallback() { // from class: com.alibaba.android.split.core.internal.ApkLoaderV29.2
                        public void onDexModuleRegistered(String str, boolean z, String str2) {
                            if (z) {
                                Log.e("ApkLoaderV30", "registerDexModule success");
                                ApkLoaderV29.access$000().c("registerDexModule success", new Object[0]);
                                return;
                            }
                            Log.e("ApkLoaderV30", "registerDexModule failed! dexModulePath:" + str + " message:" + str2);
                            ApkLoaderV29.access$000().c("registerDexModule failed! dexModulePath: %s message:%s", str, str2);
                        }
                    });
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            return true;
        }
    }
}
