package com.alibaba.android.split.core.internal;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class PathElementsMakerAboveV22 implements PathElementsMaker {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(677380152);
        t2o.a(677380151);
    }

    @Override // com.alibaba.android.split.core.internal.PathElementsMaker
    public final Object[] makeElements(Object obj, List<File> list, File file, List<IOException> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("92be57a2", new Object[]{this, obj, list, file, list2});
        }
        return (Object[]) ObjectInvoker.invoke(obj, "makePathElements", Object[].class, List.class, list, File.class, null, List.class, list2);
    }
}
