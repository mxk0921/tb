package androidx.emoji2.text.flatbuffer;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class BaseVector {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ByteBuffer bb;
    private int element_size;
    private int length;
    private int vector;

    public int __element(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2eed99b3", new Object[]{this, new Integer(i)})).intValue();
        }
        return this.vector + (i * this.element_size);
    }

    public void __reset(int i, int i2, ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dd769bb", new Object[]{this, new Integer(i), new Integer(i2), byteBuffer});
            return;
        }
        this.bb = byteBuffer;
        if (byteBuffer != null) {
            this.vector = i;
            this.length = byteBuffer.getInt(i - 4);
            this.element_size = i2;
            return;
        }
        this.vector = 0;
        this.length = 0;
        this.element_size = 0;
    }

    public int __vector() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1cd1c01d", new Object[]{this})).intValue();
        }
        return this.vector;
    }

    public int length() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("451fdc60", new Object[]{this})).intValue();
        }
        return this.length;
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else {
            __reset(0, 0, null);
        }
    }
}
