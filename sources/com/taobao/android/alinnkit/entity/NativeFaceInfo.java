package com.taobao.android.alinnkit.entity;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class NativeFaceInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(460324868);
    }

    private static native long nativeCopyBuffer(long j, int i);

    private static native boolean nativeCopyBufferRelease(long j, int i);

    private native boolean nativeRelease(long j, int i);

    public long[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (long[]) ipChange.ipc$dispatch("115830c3", new Object[]{this});
        }
        return null;
    }
}
