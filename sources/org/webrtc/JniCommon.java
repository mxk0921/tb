package org.webrtc;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class JniCommon {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(395313778);
    }

    public static native void nativeAddRef(long j);

    public static native ByteBuffer nativeAllocateByteBuffer(int i);

    public static native void nativeFreeByteBuffer(ByteBuffer byteBuffer);

    public static native void nativeReleaseRef(long j);
}
