package androidx.emoji2.text.flatbuffer;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ByteBufferUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static int getSizePrefix(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a3dba154", new Object[]{byteBuffer})).intValue();
        }
        return byteBuffer.getInt(byteBuffer.position());
    }

    public static ByteBuffer removeSizePrefix(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("f20a6f34", new Object[]{byteBuffer});
        }
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(duplicate.position() + 4);
        return duplicate;
    }
}
