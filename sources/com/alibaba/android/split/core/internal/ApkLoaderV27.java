package com.alibaba.android.split.core.internal;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.Set;
import tb.ocq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ApkLoaderV27 implements ApkLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(677380116);
        t2o.a(676331574);
    }

    @Override // com.alibaba.android.split.core.internal.ApkLoader
    public final boolean loadDex(ClassLoader classLoader, File file, ocq ocqVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe27e46a", new Object[]{this, classLoader, file, ocqVar, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        return ApkLoaderV26.injectDexElements(classLoader, file, ocqVar, z, z2);
    }

    @Override // com.alibaba.android.split.core.internal.ApkLoader
    public final void loadNativeLib(ClassLoader classLoader, Set<File> set, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a833250", new Object[]{this, classLoader, set, new Boolean(z)});
        } else {
            ApkLoaderV26.innerLoad(classLoader, set, z);
        }
    }
}
