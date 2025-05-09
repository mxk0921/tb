package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class hkf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(961544396);
    }

    public static int a(byte b, byte b2, byte b3, byte b4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af1cb9db", new Object[]{new Byte(b), new Byte(b2), new Byte(b3), new Byte(b4)})).intValue();
        }
        return (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }
}
