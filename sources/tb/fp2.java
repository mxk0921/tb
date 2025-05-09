package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class fp2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static ByteBuffer a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("2ffa2da7", new Object[0]);
        }
        return ByteBuffer.allocate(0);
    }
}
