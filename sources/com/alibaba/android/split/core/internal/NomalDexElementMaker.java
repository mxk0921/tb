package com.alibaba.android.split.core.internal;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class NomalDexElementMaker implements DexElementsMaker {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(677380148);
        t2o.a(677380136);
    }

    @Override // com.alibaba.android.split.core.internal.DexElementsMaker
    public Object[] makeElements(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2, ClassLoader classLoader) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("881c5ada", new Object[]{this, obj, arrayList, file, arrayList2, classLoader}) : makeElements(obj, arrayList, file, arrayList2);
    }

    @Override // com.alibaba.android.split.core.internal.DexElementsMaker
    public Object[] makeElements(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("32eabeb2", new Object[]{this, obj, arrayList, file, arrayList2}) : (Object[]) ObjectInvoker.invoke(obj, "makeDexElements", Object[].class, ArrayList.class, arrayList, File.class, file, ArrayList.class, arrayList2);
    }
}
