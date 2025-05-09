package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class siv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(961544400);
    }

    public static int a(byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1da43214", new Object[]{new Byte(b)})).intValue();
        }
        return b & 255;
    }
}
