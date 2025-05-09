package com.alibaba.android.split.core.internal;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class JudgerFromExits implements DexOptJudger {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(677380146);
        t2o.a(677380137);
    }

    @Override // com.alibaba.android.split.core.internal.DexOptJudger
    public final boolean hasDexOpted(Object obj, File file, File file2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8cca70a", new Object[]{this, obj, file, file2})).booleanValue();
        }
        return new File((String) ObjectInvoker.invoke(obj.getClass(), "optimizedPathFor", String.class, File.class, file, File.class, file2)).exists();
    }
}
