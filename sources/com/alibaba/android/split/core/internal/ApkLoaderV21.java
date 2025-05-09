package com.alibaba.android.split.core.internal;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_ability.modules.WeexZipModule;
import dalvik.system.DexFile;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import tb.dl9;
import tb.ocq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ApkLoaderV21 implements ApkLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String INSTANT_TAG = "instant";
    private static final String PATCH_TAG = "patch";
    private static Object sCookie = null;
    private static final String TAG = "ApkLoaderV21";
    private static dl9 sLogger = new dl9(TAG);

    static {
        t2o.a(677380110);
        t2o.a(676331574);
    }

    public static Object dexPathList(ClassLoader classLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("fa13fc29", new Object[]{classLoader});
        }
        return ObjectInvoker.create(classLoader, "pathList", Object.class).getObject();
    }

    public static void injectNativeLibs(ClassLoader classLoader, Set<File> set, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b35e4e82", new Object[]{classLoader, set, new Boolean(z)});
        } else if (!set.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (File file : set) {
                String absolutePath = file.getParentFile().getAbsolutePath();
                if (file.length() != 0) {
                    "Adding native library parent directory: ".concat(absolutePath);
                }
                hashSet.add(file.getParentFile());
            }
            FieldObjectHolder arrayCreate = ObjectInvoker.arrayCreate(dexPathList(classLoader), "nativeLibraryDirectories", File[].class);
            List asList = Arrays.asList((File[]) arrayCreate.getObject());
            if (!z) {
                hashSet.removeAll(asList);
                int size = hashSet.size();
                StringBuilder sb = new StringBuilder(30);
                sb.append("Adding directories ");
                sb.append(size);
                Log.e(TAG, sb.toString());
                if (size > 0) {
                    arrayCreate.setObjectsArrayBefore(hashSet);
                }
            } else if (hashSet.size() > 0) {
                arrayCreate.setObjectsArrayBefore(hashSet);
            }
        }
    }

    @Override // com.alibaba.android.split.core.internal.ApkLoader
    public final boolean loadDex(ClassLoader classLoader, File file, ocq ocqVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe27e46a", new Object[]{this, classLoader, file, ocqVar, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        return injectDexElements(classLoader, file, ocqVar, z, new NomalDexElementMaker(), WeexZipModule.NAME, new JudgerFromExits(), z2);
    }

    @Override // com.alibaba.android.split.core.internal.ApkLoader
    public final void loadNativeLib(ClassLoader classLoader, Set<File> set, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a833250", new Object[]{this, classLoader, set, new Boolean(z)});
        } else {
            injectNativeLibs(classLoader, set, z);
        }
    }

    private static boolean hasPatched(Collection<Object> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a6d23a9", new Object[]{collection})).booleanValue();
        }
        for (Object obj : collection) {
            DexFile dexFile = (DexFile) ObjectInvoker.create(obj, "dexFile", DexFile.class).getObject();
            if (dexFile.toString().contains(PATCH_TAG) && dexFile.toString().contains("instant")) {
                return true;
            }
        }
        return false;
    }

    private static void replaceOriginalPatch(List list, Object[] objArr, String str, FieldObjectHolder fieldObjectHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b55ff14", new Object[]{list, objArr, str, fieldObjectHolder});
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            DexFile dexFile = (DexFile) ObjectInvoker.create(obj, str, DexFile.class).getObject();
            if (!dexFile.toString().contains(PATCH_TAG) && !dexFile.toString().contains("instant")) {
                arrayList.add(obj);
            }
        }
        for (Object obj2 : objArr) {
            arrayList.add(obj2);
        }
        fieldObjectHolder.replaceObjectsArray(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0163 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0103 A[EDGE_INSN: B:61:0x0103->B:36:0x0103 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean injectDexElements(java.lang.ClassLoader r16, java.io.File r17, tb.ocq r18, boolean r19, com.alibaba.android.split.core.internal.DexElementsMaker r20, java.lang.String r21, com.alibaba.android.split.core.internal.DexOptJudger r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.split.core.internal.ApkLoaderV21.injectDexElements(java.lang.ClassLoader, java.io.File, tb.ocq, boolean, com.alibaba.android.split.core.internal.DexElementsMaker, java.lang.String, com.alibaba.android.split.core.internal.DexOptJudger, boolean):boolean");
    }
}
