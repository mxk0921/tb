package androidx.emoji2.text.flatbuffer;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Struct {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ByteBuffer bb;
    public int bb_pos;

    public void __reset(int i, ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d015824", new Object[]{this, new Integer(i), byteBuffer});
            return;
        }
        this.bb = byteBuffer;
        if (byteBuffer != null) {
            this.bb_pos = i;
        } else {
            this.bb_pos = 0;
        }
    }

    public void __reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60adb276", new Object[]{this});
        } else {
            __reset(0, null);
        }
    }
}
