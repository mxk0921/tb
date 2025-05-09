package com.alibaba.android.split.core.internal;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_ability.modules.WeexZipModule;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import tb.ocq;
import tb.qdq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ApkLoaderV23 implements ApkLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ApkLoaderV23";
    private static qdq sLogger = new qdq(TAG);

    static {
        t2o.a(677380112);
        t2o.a(676331574);
    }

    public static boolean injectDexElements(ClassLoader classLoader, File file, ocq ocqVar, boolean z, String str, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3930c6ec", new Object[]{classLoader, file, ocqVar, new Boolean(z), str, new Boolean(z2)})).booleanValue();
        }
        return ApkLoaderV21.injectDexElements(classLoader, file, ocqVar, z, new V23DexElementsMaker(), str, new JudgerFromExits(), z2);
    }

    public static void injectNativelibs(ClassLoader classLoader, Set<File> set, PathElementsMaker pathElementsMaker, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f52d0b5", new Object[]{classLoader, set, pathElementsMaker, new Boolean(z)});
        } else if (!set.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (File file : set) {
                hashSet.add(file.getParentFile());
            }
            Object dexPathList = ApkLoaderV21.dexPathList(classLoader);
            List list = (List) ObjectInvoker.create(dexPathList, "nativeLibraryDirectories", List.class).getObject();
            hashSet.removeAll(list);
            list.addAll(hashSet);
            ArrayList arrayList = new ArrayList();
            Object[] makeElements = pathElementsMaker.makeElements(dexPathList, new ArrayList(hashSet), null, arrayList);
            if (arrayList.size() <= 0) {
                ObjectInvoker.arrayCreate(dexPathList, "nativeLibraryPathElements", Object.class).setObjectsArrayBefore(makeElements);
                return;
            }
            throw new SplitLoadException("Error in makePathElements");
        }
    }

    public static Object[] makeDexElements(Object obj, List<File> list, File file, List<IOException> list2, ClassLoader classLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("fc869d6f", new Object[]{obj, list, file, list2, classLoader});
        }
        return makeDexElementsInternal(obj, list, file, list2, classLoader);
    }

    private static Object[] makeDexElementsInternal(Object obj, List<File> list, File file, List<IOException> list2, ClassLoader classLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("c4e7bdb2", new Object[]{obj, list, file, list2, classLoader});
        }
        return (Object[]) ObjectInvoker.invoke(obj, "makeDexElements", Object[].class, List.class, list, File.class, file, List.class, list2, ClassLoader.class, classLoader);
    }

    public static Object[] makePathElements(Object obj, List<File> list, File file, List<IOException> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("af6f1a27", new Object[]{obj, list, file, list2});
        }
        return makePathElementsInternal(obj, list, file, list2);
    }

    private static Object[] makePathElementsInternal(Object obj, List<File> list, File file, List<IOException> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("c9b23f44", new Object[]{obj, list, file, list2});
        }
        return (Object[]) ObjectInvoker.invoke(obj, "makePathElements", Object[].class, List.class, list, File.class, file, List.class, list2);
    }

    @Override // com.alibaba.android.split.core.internal.ApkLoader
    public final boolean loadDex(ClassLoader classLoader, File file, ocq ocqVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe27e46a", new Object[]{this, classLoader, file, ocqVar, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        return injectDexElements(classLoader, file, ocqVar, z, WeexZipModule.NAME, z2);
    }

    @Override // com.alibaba.android.split.core.internal.ApkLoader
    public final void loadNativeLib(ClassLoader classLoader, Set<File> set, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a833250", new Object[]{this, classLoader, set, new Boolean(z)});
        } else {
            injectNativelibs(classLoader, set, new PathElementsMakerAboveV22(), z);
        }
    }
}
