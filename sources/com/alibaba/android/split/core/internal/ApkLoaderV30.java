package com.alibaba.android.split.core.internal;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.Set;
import tb.ocq;
import tb.qdq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ApkLoaderV30 implements ApkLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static qdq sLogger = new qdq("ApkLoaderV30");

    static {
        t2o.a(677380121);
        t2o.a(676331574);
    }

    @Override // com.alibaba.android.split.core.internal.ApkLoader
    public boolean loadDex(ClassLoader classLoader, File file, ocq ocqVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe27e46a", new Object[]{this, classLoader, file, ocqVar, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        if (z && z2) {
            return ApkLoaderV29.performDexOptSecondary(ocqVar.c());
        }
        V24DexElementsMaker v24DexElementsMaker = new V24DexElementsMaker();
        SkipDexOpter skipDexOpter = new SkipDexOpter();
        ApkLoaderV29.performDexOptSecondary(ocqVar.c());
        return ApkLoaderV21.injectDexElements(classLoader, file, ocqVar, z, v24DexElementsMaker, "path", skipDexOpter, z2);
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
}
